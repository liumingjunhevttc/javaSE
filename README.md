# java 初级总结---针对于实战

## 1 JavaSE 基本知识

### 1.1 java特性
**1.简单性**

**2.面向对象(OOP)**

**3.分布式**

**4.健壮性**

**5.安全性**

**6.体系结构中立**

**7.可移植性**

**8.解释型**

**9.高性能**

**10.多线程**

**11.动态性**

### 1.2 JDK和JRE的区别

JDK(Java Development kit) java开发工具包

JRE(Java Runntime Envirment) java运行环境

### 1.3  java安装

[windows平台](https://www.cnblogs.com/maoning/p/10701349.html)

[mac平台](https://www.cnblogs.com/ostrich-sunshine/p/8414677.html)

[linux平台](https://www.cnblogs.com/lamp01/p/8932740.html)

### 1.4  java 程序基本结构

~~~~ java
public class FirstSample {
    public static void main(String[] args){
        System.out.println("hello world");
    }
}
~~~~

1.public  访问权限修饰符 这个控制符主要是用来其他程序对这段代码的访问级别

2.class 表明java程序中的全部内容都包含在这个类中 ，这里可以理解成只是将类作为一个加载程序逻辑的容器。

3.class 后面需要跟一个类名  需要使用一定的规则定义类名

- 必须以字母开头
- 后面可以跟字母和数字任意组合，长度上没有限制
- 不能使用java保留字
- 如果类名有多个单词组成，每个单词的首字母必须大写 也可以称为骆驼(峰)命名法

*注意:源代码的文件名必须与公共类的名字相同，并且用java作为扩展名*

4.{} 用大括号划分程序的各个部分(通常称之为块)，java中的任何方法都用"{"开始，用"}"结束。

5.java针对方法的通常使用方法就是

~~~ java
object.method(parameters)
~~~

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/master/java-01/src/main/java/com/baidu/FirstSample.java)

### 1.5 注释

java中的注释不会出现在可执行的程序中，因此开发人员可以“随意”添加多个注释信息 注释有三种写法

（1）单行注释

~~~~ java
public class SecondSample {
    public static void main(String[] args) {
        // 输出一个hello world
        System.out.println("hello world");
    }
}
~~~~

（2）多行注释

~~~~ java
/*
   输出一个hello world
*/
System.out.println("hello world");
~~~~

（3）文档注释

~~~~ java
/**
* 输出一个hello world
*/
System.out.println("hello world");
~~~~

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/master/java-01/src/main/java/com/baidu/SecondSample.java)

### 1.6 数据类型

java是一种强类型语言，这就意味着必须为每一个变量声明一种数据类型，在java中，一共有8种基本数据类型，其中有4种整形，2种浮点类型，1种用于表示Unicode编码的字符单元的字符类型char和一种用于表示真值的Boolean类型。

#### 1.6.1 整型

整型用来表示没有小数部分的数值，它允许是负数。java提供了4种基本数据类型，具体内容如下表所示: