



import Pipe.Main;

import javax.swing.*;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class SoftwareArchitectureApp {
    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        String s;
        JFrame frame = new JFrame();
        System.out.println("经典软件体系结构教学软件");
        System.out.println("===========================");
        System.out.println("请选择你要处理的方式");
        System.out.println("A.主程序-子程序\tB.面向对象\tC.事件系统\tD.管道-过滤器");
        System.out.print("选择:");
        String str=scanner.nextLine();
        switch (str){
            case "A":
                System.out.println("主程序-子程序");
                MaintoSon.demo1.main();
                displayImage("image/1.png");
                break;
            case "B":
                System.out.println("面向对象");
                OOP.Main.main();
                displayImage("image/2.png");
                break;
            case "C":
                System.out.println("事件系统");
                Event.Main.main();
                displayImage("image/3.png");
                break;
            case "D":
                System.out.println("管道-过滤器");
                Main.main();
                displayImage("image/4.png");
                break;
            default:
                System.out.println("出错！！");
        }
        FileReader f1=new FileReader("Text/output.txt");
        BufferedReader f2=new BufferedReader(f1);
        System.out.println("你的处理结果为:");
        while ((s=f2.readLine())!=null){
            System.out.println(s);
        }
        f2.close();
        f1.close();
        scanner.close();
    }
    // 显示图像的方法
    private static void displayImage(String imagePath) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(SoftwareArchitectureApp.class.getResource(imagePath)));
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}