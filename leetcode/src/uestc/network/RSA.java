package uestc.network;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class RSA {//仅对英文，数字，标点加密
    public final BigInteger n,p,q,e,d;
    public BigInteger getRandomPrime() {//获得随机大素数
        BigInteger p = BigInteger.probablePrime(664, new Random());
        while (!p.isProbablePrime(100)) {
            p = BigInteger.probablePrime(664, new Random());
        }
        return p;
    }
    public BigInteger get_gcd(BigInteger b) {//得到一个与b的互素的数
        BigInteger i;
        do {//每次取一个比b小的随机数，判断与b是否互素，不是则重复
            i=BigInteger.valueOf(new Random().nextInt(b.bitLength()-1));
        }while(i.gcd(b).compareTo(BigInteger.ONE)!=0) ;
        return i;
    }
    public BigInteger text_to_big(String text) {//将字符串转换为大整数
        BigInteger b=new BigInteger("0");
        for(int i=0;i<text.length();i++) {
            int j=(int)text.charAt(i)-32;
            b=b.multiply(new BigInteger("100")).add(BigInteger.valueOf(j));
        }
        return b;
    }
    public BigInteger file_to_big(String filename) {//将文件内容转换为大整数
        File f=new File(filename);
        BigInteger b=new BigInteger("0");
        FileReader fr;
        try {
            fr = new FileReader(f);
            for(long i=0;i<f.length();i++) {
                int j=fr.read()-32;
                b=b.multiply(new BigInteger("100")).add(BigInteger.valueOf(j));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;


    }
    public String big_to_text(BigInteger b) {//将大整数转换为字符串
        String text="";
        while(b.compareTo(BigInteger.ZERO)!=0){
            int i=b.mod(BigInteger.valueOf(100)).intValue();
            b=b.divide(BigInteger.valueOf(100));
            text=(char)(i+32)+text;
        }
        return text;
    }
    public String sign(BigInteger m) {//签名
        BigInteger s=m.modPow(d,n);
        return big_to_text(s);
    }
    public boolean verify(BigInteger m,BigInteger s) {//验证
        if(m.compareTo(s.modPow(e, n))!=0) return false;
        else return true;
    }
    public RSA() {
        p=getRandomPrime();q=getRandomPrime();
        n=p.multiply(q);
        BigInteger fn=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));//欧拉函数值
        e=get_gcd(fn);
        d=e.modInverse(fn);
        System.out.println("私钥(d,p,q):"+"("+d.toString()+","+p.toString()+","+q.toString()+")");
        System.out.println("公钥(e,n):"+"("+e.toString()+","+n.toString()+")");
    }
    public static void main(String[] args) {
        RSA rsa=new RSA();
        BigInteger m=null;
        Scanner in=new Scanner(System.in);
        int choice=2;
        while(true) {
            System.out.println("文件签名输入0，字符串签名输入1，退出输入2");
            choice=in.nextInt();
            switch(choice) {
                case 0:{System.out.println("请输入文件名及路径:");
                    in.nextLine();
                    String file=in.nextLine();
                    m=rsa.file_to_big(file);

//					System.out.println(rsa.big_to_text(m));
                    break;}
                case 1:{System.out.println("请输入字符串:");
                    in.nextLine();
                    String text=in.nextLine();
                    m=rsa.text_to_big(text);
//				    System.out.println(rsa.big_to_text(m));
                    break;}
                case 2:{System.exit(0); break;}
            }
            String s=rsa.sign(m);
            System.out.println("签名为"+s);
            System.out.println(rsa.verify(m,rsa.text_to_big(s)));
        }
    }
}