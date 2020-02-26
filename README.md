---
typora-copy-images-to: java-01
typora-root-url: image
---

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

| 类型  | 存储需求 | 取值范围                                 |
| ----- | -------- | ---------------------------------------- |
| int   | 4字节    | -2147483648~2147483647(正好超过20亿)     |
| short | 2字节    | -32768~32767                             |
| long  | 8字节    | -9223372036854775808~9223372036854775807 |
| byte  | 1字节    | -128~127                                 |

注意:

-   Long类型的值必须有一个后缀L或l
-   非十进制需要使用相关符号表示：十六进制的数值有一个前缀0x或者0X；八进制有一个前缀是0；二进制的数值有一个前缀是0b或者0B（java7开始的特性）

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/c39de23f6910c16923562e77b743049542e7b30e/java-01/src/main/java/com/baidu/ThirdSample.java)

#### 1.6.2 浮点类型

浮点类型就是用于表示小数部分的数值。在java中有两种浮点类型，具体如下表所示:

|  类型  | 存储需求 |    取值范围     |
| :----: | :------: | :-------------: |
| float  |  4字节   | 有效位数为6~7位 |
| double |  8字节   | 有效位数为15位  |

注意：

- double表示这种类型的数值精度是float类型的两倍(有人称之为双精度数值)。
- float类型的数值有一个后缀是F或者f。没有带有F或者f的后缀的数值默认是Double类型，当然，也可以在double类型的数值添加后缀是D或者d;
- 所有浮点类型的计算都要遵循IEEE 754规范。具体来说，通常使用三个特殊的浮点数值（正无穷大，负无穷大，NaN）。

~~~~ java
// 正无穷大
double temp3 = Double.POSITIVE_INFINITY;
// 负无穷大
double temp4 = Double.NEGATIVE_INFINITY;
// NaN
double temp5 = Double.NaN;
// 判断某个数是否是NaN
if(Double.isNaN(temp5)){
    System.out.println(temp5+"是NaN");
}
~~~~

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/747a0f0087e500b1454d60540aabcdbaa5f26f02/java-01/src/main/java/com/baidu/FlourSample.java)

#### 1.6.3 char类型

char类型原本用于表示单个字符。不过，现在情况有些变化了。如今，有些Unicode字符可以用一个char值描述，有些必须使用两个char值。char类型的字面量需要用单引号表示，除此之外，char类型可以使用特殊字符的转义序列。所有这些转义序列都可以出现在加引号的字符字面量或者字符串中。如下表所示：

| 转义序列 |  名称  | Unicode值 |
| :------: | :----: | :-------: |
|    \b    |  退格  |  \u0008   |
|    \t    |  制表  |  \u0009   |
|    \n    |  换行  |  \u000a   |
|    \r    |  回车  |  \u000d   |
|   \\"    | 双引号 |  \u0022   |
|   \\'    | 单引号 |  \u0027   |
|   \\\    | 反斜杠 |  \u005c   |

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/4aab08d53037b649983da42ce9c7aac344d37dca/java-01/src/main/java/com/baidu/FiveSample.java)

#### 1.6.4 boolean类型

boolean类型有两个值: false 和 true，用来判定逻辑条件。整型和布尔型之间不能进行相互转换。

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/3a3b1c5320b66129f78ea6f740be8307591a6588/java-01/src/main/java/com/baidu/SixSample.java)

### 1.7 变量

在java中，每个变量都有一个类型(type)。在声明变量时，变量的类型位于变量名之前。

~~~~ java
int temp;
double temp2;
~~~~

可以看到，每个声明以分号结束，由于声明是一条完整的java语句，所以必须以分号结束。变量名必须按照如下规则：

- 必须以字母开头
- 必须使用A-Z，a-z，0-9，_，$ 或者在某个语言中表示字母的任何一个Unicode字符。
- 对大小写比较敏感
- 不能使用java保留字作为变量名
- 可以在一行中定义多个变量

##### 1.7.1 变量初始化

声明一个变量后，必须用赋值语句对变量进行显式初始化，千万不能使用未初始化的变量，例如以下语句会报一下错误：

~~~ java
String str;
System.out.println(str);//ERROR --- variable not initalized
~~~

初始化变量可以有以下两种方式进行

~~~ java
// 第一种方式
String str;
str = "technology_liu";
// 第二种方式
String str = "technology_liu";
~~~

### 1.8 常量

在java中，可以利用关键字final来表示常量。例如：

~~~~ java
final String STR = "我就是常量";
System.out.println(STR);
~~~~

注意:关键字final表示这个变量只能赋值一次，一旦被赋值以后，就不能修改了。习惯上，常用名称必须是大写的。

在java中，如果希望某个常量可以在一个类中的多方法中下使用，通常将这些常量称之为类常量。可以使用关键字static final 设置一个类常量，如果要想在其它类中的方法也使用同一个类常用，则需要在static final中加上public，如下所示:

~~~~ java
package com.baidu;
/**
 *   常量
 * @author technology_liu
 * 2020-02-11
 */
public class SevenSample {
    public static final String DATANAME = "localhost:3306";
    public static void main(String[] args) {
        System.out.println("main:"+DATANAME);
        test1();
    }
    public static void test1(){
        System.out.println("test1:"+DATANAME);
    }
}
~~~~

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/90cdf8a5dbfed52a3ecc73d3e27c33a3f8255572/java-01/src/main/java/com/baidu/SevenSample.java)

### 1.9 运算符

在java中，使用算术运算符+、-、*、/表示加、减、乘、除运算。注意一点就是当参与除法运算时候，除号左右两边的操作数都是整数，表示整数除法，否则表示浮点除法。整数的求余操作（有时称值称为取模）用%表示。

注意：如果使用严格意义上的浮点计算，需要在方法中加上strictfp关键字。

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/015927af4b216ca5ea5efa7b0e5d43e6b0db60e3/java-01/src/main/java/com/baidu/EightSample.java)

#### 1.9.1 数学函数与常量

在Math类中，包含各种格样的数学函数。在编写不同类别的程序时，可能需要的函数也不同。

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/cac6444447b6e13b3899dc3a2eadb433b7acb924/java-01/src/main/java/com/baidu/NineSample.java)

#### 1.9.2 数值类型之间的转换

经常需要将一种数值类型转换为另外一种数值类型。如下图所示表示数值之间转换的关系，需要指出的就是，数值之间的转换一般就是隐式转换:

![1](../java-01/1.jpg)

#### 1.9.3 强制类型转换

在java程序中，允许进行强制类型转换，但是有一点的就是可能存在精度上的损失，强制类型转换的与发给是时在圆括号中给出想要转换的目标类型，后面紧跟待转换的变量名。例如:

~~~~ java
double x = 9.997;
int y = (int) x;
System.out.println(y);
~~~~

需要注意的就是不要再boolean类型与任何数值类型之间进行强制类型转换，这样可以防止发生错误。

#### 1.9.4 结合赋值和运算符

可以在赋值中使用二元运算符，这是一种很简便的简写形式。例如:

~~~ java
x+=4;
~~~

等价于:

~~~~ java
x = x+4;
~~~~

注意:

- 一般情况下，要把运算符放在=左边，例如*=或者%=

- 如果运算符得到一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换

  ~~~~ java
  int i = 1;
  i +=3.5;
  System.out.println(i);
  ~~~~

  结果是 4

#### 1.9.5 自增与自减运算符

java类似于其他语言一样，提供了自增自减运算符，但是有一点就是符号的位置可能影响运算结果,具体如下:

~~~~
++n; 先n自增加1，再赋值给变量中
n++; 先赋值给变量中，再n自增加1
~~~~

例如以下代码:

~~~ java
int n = 12;
n++;
~~~

以上代码的结果是13

注意:建议不要在表达式中使用自增自减运算符，因为这样的代码很容易产生困惑，而且会带来bug风险。

#### 1.9.6 关系和boolean运算符

java中包含丰富的关系运算符。要检测相等性，可以使用两个等号==。例如:

~~~~ java
int x= 3;
System.out.println(x=7);
~~~~

结果是false。

另外可以使用!=表示不相等。例如：

~~~ java
int x= 3;
System.out.println(x !=7);
~~~

结果是true

除了判断相等性的==以外，还有经常使用的<（小于）、>（大于）、<=（小于等于）和>=（大于等于）运算符。

java除了使用关系运算符外，还可以使用逻辑运算符，使用 && 表示逻辑“与”运算符，使用||表示逻辑“或”运算符，！表示逻辑“非运算符”，&&和||两种运算符也可以被看作是“短路运算符”，即第一个操作数已经能够确定表达式的值，那么第二个操作数就可以不必运算了，这样做的目的可以避免一些错误，类似于这样:

~~~~ java
String str = "liu";
//        String str = null; 出现这种情况，&& 不报错；|| 报错
System.out.println("短路与:"+(str != null && str.equals("liu")));
System.out.println("短路或:"+(str != null || str.equals("liu")));
~~~~

最后一个运算符是三元运算符，也有叫三目运算符(?:)，这个操作符有时候很有用，第一个表达式用条件判断，如果是true则执行第二个表达式，如果是false则执行第三个表达式，例如以下语句:

~~~ java
boolean flag = true;
System.out.println(flag?"我是真的":"我是假的");
~~~

[源代码](https://github.com/liumingjunhevttc/javaSE/blob/4ef523cd9a0ef07d0739239f9d5d6aa2eeaff0d8/java-01/src/main/java/com/baidu/TenExample.java)

#### 1.9.6 位运算符

处理整型数据类型时候，可以直接对组成整型数值的各个位完成操作，意味者可以使用掩码技术得到整数中的各个位。位运算符包括: &、|、 ~、 ^、 >>、 <<、 >>>。

& 操作就是两个操作数转换为二进制数据之后，只要两个操作数的二进制每个位等于1，那么结果是1,否则是1，然后再将结果转为十进制，例如:

~~~ java
/*
  3:11
  2:10
  10  == 2
*/
System.out.println("&:"+(3&2));
~~~

| 操作就是两个操作数转换为二进制之后，如果操作数的二进制其中一个位置是1，那么结果是1，除非两个操作数的二进制都为0，结果为0，例如:

~~~~ java
 /*
  4: 100
  2:  10
     110  == 6
*/
System.out.println("|:"+(4|2));
~~~~

^ 操作就是将两个操作数转换为二进制之后，如果两个操作数的二进制相同位都等于1,结果是0，如果两个操作数的二进制其中一个等于1，那么结果是1，例如:

~~~~ java
/**
*  5 101
*  2  10
*    111 == 7
*/
System.out.println("^"+(5^2));
~~~~

~ （正在思考中）

注意: |、&可以进行逻辑判断，与&& 、|| 等效，唯一的区别就是 前者没有短路功能，即第一个逻辑表达式是否成立，都能直接判断第二个逻辑表达式，而后者只要是第一个逻辑表达式不成立，就不能执行第二个表达式，即有短路功能。

另外还有>> 、>>>、<<运算位移。

（1）> >  操作就是将第一个操作数转换为二进制后，然后左移第二个操作数位，补符号位:

（2） >>> 操作就是一个操作数转换为二进制后，然后左移第二个操作数位，补0

（3）  << 操作就是一个操作数转换为二进制后，然后右移第二个操作数位，补0

[源码](https://github.com/liumingjunhevttc/javaSE/blob/d391ee41bbefc7aefe8a4409b797c57d58cb7d16/java-01/src/main/java/com/baidu/one/FirstSample.java)

### 1.10 字符串

​	从概念上讲，java字符串就是Unicode字符序列，例如，串“java\u2122”由5个Unicode字符组成。java没有内置的字符串类型，而是在标准java类库中提供了一个预定义类，该类是String。每个用双引号括起来的字符串就是String类的一个实例:

~~~~ java
String s= ""; // 是一个空字符串
String greeting = "hello";
~~~~

**扩展**

字符串的底层就是char类型的数组

#### 1.10.1 子串

​    String类中的substring方法可以从一个较大的字符串提取出一个子串。例如:

~~~ java
String greeting = "hello";
// 只定义开始
String childGreeting = greeting.substring(2);
System.out.println(childGreeting);
//给开始和结束定义了区间
childGreeting = greeting.substring(1, 3);
System.out.println(childGreeting);
~~~

​	substring的第二个参数即使表达的是末尾的位置，但是字符串截取的时候不包含末尾，即左闭右开区间。

#### 1.10.2 拼接

​	java语言可以使用“+”进行拼接，如下所示:

~~~ java
String welcome = "欢迎";
String student = "小王";
String showData = welcome+" "+student;
System.out.println(showData);
~~~

​	值得注意的就是，字符串使用”+“与非字符串进行拼接的时候，结果还是字符串。

#### 1.10.3 不可变字符串

​	String类没有提供用于修改字符串的方法。如果希望将某个字符串修改成对应的字符串，只能使用截取，不可改变字符串本身，在java官方文档中将String类定义的字符串重新定义为不可变字符串。

​    这样做是否降低运行效率，这类问题也对也不对，创建新的字符串的确由于开辟内存空间会影响效率的问题，但是不可变字符串有一个优点:编译器可以让字符串共享。可以想象各种字符串存放在公共的存储池中。字符串变量指向存储池中相应的位置。如果复制一个字符串变量，原始的字符串与复制的字符串共享相同的字符。

​     字符串由于拼接产生的低效率问题会有专门的用来存储字符串的类库，那就是StringBuffer，StringBuilder。

#### 1.10.4 检测字符串是否相等

​	可以使用equals方法来检测字符串是否相等。如下:

~~~~ java
System.out.println("hello".equals("student"));
System.out.println("student".equals("student"));
~~~~

​	如果比较字符串相等时候不想区分大小写，可以使用equalsIgnoreCase()方法， 如下所示:

~~~~ java
System.out.println("ABC".equalsIgnoreCase("abC"));
~~~~

注意:一定不要使用==运算符来比较字符串是否相等！这个运算符只能确定两个字符串是否放到同一个位置上。当然，如果字符串放在同一个位置上，它必然相等。但是，完全有可能将内容相同的字符串拷贝到不同的位置上。

实际上只有字符串字面量共享的，而+或者substring产生的操作的结果并不是共享的。因此，千万不要使用==来判断字符串是否相等。

#### 1.10.5 空串与null串

空串”“是长度为0的字符串，可以使用”“来表示

~~~ java
 System.out.println("".equals("liumingjun"));
~~~

空串是一个java对象，有自己的串长度(0)和内容(空)，不过，String变量还可以存放一个特殊的值，名为null，这表示目前没有任何对象与该变量相关联，要检查一个字符串是否是null，可以看如下图所示:

~~~~ java
String str = null;
System.out.println(str == null);
~~~~

注意:如果在本来是null的字符串调用本身的方法时，会报NullException异常。

#### 1.10.6 码点与码元

java字符串由char值序列组成，char值本身采用UTF-16编码表示Unicode码点的代码单元。大多数采用常用的Unicode字符使用一个代码单元就可以表示，而辅助字符需要一对代码单元表示。

length方法将返回采用UTF-16编码返回指定字符串所需要的代码单元数量，例如:

~~~~ java
String str = "hello";
System.out.println(str.length()); // 5
~~~~

如果想要实际长度，即码点数量，可以使用以下方式调用：

~~~~ java
System.out.println(str.codePointCount(0,str.length()));
~~~~

调用charAt(n)返回位置n的代码单元，n是介于0-length()-1之间。例如:

~~~ java
System.out.println(str.charAt(2));
~~~

如果想要得到第i个码点，可以使用如下方式进行获取:

~~~ java
System.out.println(str.codePointAt(str.offsetByCodePoints(0,2)));
~~~

**1.10.1 --- 1.10.6 [源码](https://github.com/liumingjunhevttc/javaSE/blob/ec4bf175b353bc2fe90070eba62b49aabd045583/java-01/src/main/java/com/baidu/stringdemo/Demo1.java)**

#### 1.10.7 API

public char charAt(int index) ;

返回指定位置的代码单元。

public int codePointAt(int index) ;

返回指定位置的码点

public int offsetByCodePoints(int index, int codePointOffset) ;

返回从index开始，位移codePointOffset后的码点索引

public int compareTo(String anotherString) ;

按照字典顺序，如果字符串位于anotherString之前，返回一个负数，如果字符串位于anotherString之后，返回一个正数，如果两个字符串相等，返回0。值的注意就是，返回非0的结果是两个字符串其中一个字符不相等时的码元差值。

public default IntStream codePoints()

将这个字符串的码点作为一个流返回。调用toArray方法将它们放在一个数组中。

public boolean equals(Object anObject) ;

判断两个字符串是否相等，如果相等返回true，否则返回false。

public boolean equalsIgnoreCase(String anotherString);

忽略大小写判断两个字符串是否相等。

public boolean startsWith(String prefix);

判断是否以某个字符串开头

public boolean endsWith(String suffix);

判断是否以某个字符串结尾

public int indexOf(String str) ;

查找子串在主串的位置

public int indexOf(String str, int fromIndex);

查找从fromIndex+1开始查找str字符串

public int length() ;

获取字符串的长度

public String replace(char oldChar, char newChar);

替换某个字符

public String substring(int beginIndex) ;

public String substring(int beginIndex, int endIndex);

从某个位置开始截取，第二个substring代表截取到相应位置减一

public String toUpperCase();

小写转大写

public String toLowerCase();

大写转小写

public String trim();

返回一个去掉头部和尾部空格的新字符串

public static String join(CharSequence delimiter, CharSequence... elements);

用某个分割符连接字符串元素，形成新的字符串

[源码](https://github.com/liumingjunhevttc/javaSE/blob/957d1792a67826ad3e7ad2d0ca67d009e44e2c8b/java-01/src/main/java/com/baidu/stringdemo/Demo2.java)

#### 1.10.8 构建字符串

有些时候，需要由较短的字符串构建字符串， 但是采用字符串连接的方式效率比较低，即每次连接字符串，都会构建一个新的String对象，既耗时，又耗费时间。所以需要使用一个替代方案，即使用StringBuffer或者StringBuilder

有一点需要注意的就是StringBuffer与StringBuilder里面所有的方法几乎是一模一样的，但是StringBuilder比StringBuffer效率比较高，因为StringBuffer加了锁机制，如果添加某个字符串时候，使用append()方法即可。

~~~~ java
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("hello");
stringBuilder.append("world");
System.out.println(stringBuilder.toString());
~~~~

[源码](https://github.com/liumingjunhevttc/javaSE/blob/84f084981cb07018a636596ce2c8ad0266541bee/java-01/src/main/java/com/baidu/stringdemo/Demo3.java)

### 1.11 控制流程

 与其他语言一样，Java使用条件语句和循环语句来确定控制流程

#### 1.11 .1 块作用域

在深入学习之前，需要了解块作用域的概念。

块(即复合语句)是指由一对大括号括起来的若干条简单的java语句，块确定了变量的作用域，一个块可以嵌套在另一个块中。比如如下代码所示:

~~~~ java
public static void main(String[] args) {
    int n;
    {
        int k;
    }
}
~~~~

但是，不能在嵌套的两个块中声明相同的变量，例如如下的代码是错误的示范：

~~~~ java
int i;
{
    int i;
}
~~~~

[源码](https://github.com/liumingjunhevttc/javaSE/blob/8ef3c66b4717984a1780661393d8346c688e66ee/java-01/src/main/java/com/baidu/BlockScope.java)

#### 1.11 .2 条件语句

在java中，条件语句的格式为：

if(condition) statement

在条件语句中，是否使用大括号取决你的实际业务逻辑，一般情况下，如果if为真的下面是一条语句，不需要使用括号，如果if下面语句需要执行多条语句时候，这种情况下需要使用大括号，也就是使用块元素来表示:

~~~~ java
int num = 0;
if(num == 1)
    System.out.println("我就是李小龙");
System.out.println("单行语句能否执行");

if(num == 0){
    System.out.println("我就是周润发");
    System.out.println("多行语句能否执行");
}
~~~~

在java中，可以使用else来表示if不成立的条件，条件语句格式以下方式:

if(condition) statement else statement 

例如:

~~~~ java
int flag1 = 1;
if(flag1 == 1){
    System.out.println("我是1");
} else {
    System.out.println("我不是1");
}
~~~~

当然如果有多条语句，可以使用else if来执行，例如:

~~~~ java
int score = 90;
if(score>90)
{
    System.out.println("优秀");
} else  if (score >80){
    System.out.println("一般");
} else {
    System.out.println("很差");
}
~~~~

[源码](https://github.com/liumingjunhevttc/javaSE/blob/41c242fab775c6cdf3e087fbe24de1b2728d0b09/java-01/src/main/java/com/baidu/ConditionStatement.java)

#### 1.11 .3 循环

使用循环语句通常有三种 while do while for

while循环表示的就是当while里面的条件是真时，就执行while内部的语句体，直到while内部条件语句不成立的时候，就跳出循环体，执行下一步的语句或者结束，例如:

~~~~ java
int temp = 0;
while(temp<=10){
    System.out.println(temp);
    temp++;
}
~~~~

while循环语句首先检测循环条件，只要循环条件满足就执行循环体，因此while里面的循环体有可能不被执行。

如果需要有一种循环是即使while不满足条件也能执行循环体，需要使用do  while循环，例如以下代码:

~~~ java
int flag1 = 0;
do{
    System.out.println(flag1);
    flag1++;
}while (flag1<0);
~~~

[源码](https://github.com/liumingjunhevttc/javaSE/blob/a069f0c1991d6793de376750ee91734391ef8430/java-01/src/main/java/com/baidu/CyCleDemo.java)

#### 1.11 .4 确定循环

​	for循环是支持迭代的一种通用性结构，利用每次迭代之后更新的计数器或者类似的变量来控制迭代函数。例如以下语句:

~~~~ java
// for循环
for(int i = 0;i<100;i++){
    System.out.println("for"+i);
}
~~~~

for循环语句第一部分就是计数器初始化，并且第一部分可以初始化为空；第二部分给出每次新一轮循环执行前检测的循环条件，第三部分表示如何更新计数器。

注意:

- for循环语句再给浮点型进行比较大小判断时候有可能出现误差，因此非情况下尽可能少用浮点类型。
- 第一部分初始化计数器只能作用于for循环语句的内部，如果需要获取计数器循环之后的结果，需要移植到外部
- 可以在各自独立的for循环语句声明同一个变量
- for循环语句只不过是while语句的简化写法

[源码](https://github.com/liumingjunhevttc/javaSE/blob/a069f0c1991d6793de376750ee91734391ef8430/java-01/src/main/java/com/baidu/CyCleDemo.java)

#### 1.11 .5 多重选择switch语句

在处理多个选项中，使用if/else结构显着有些笨，因此java提供一种能够解决这样笨重语句的简化方式，该方式就是switch语句。如下所示:

~~~~ java
int flag = 52;
switch (flag){
    case 1:{
        System.out.println("我是一号嘉宾");
        break;
    }
    case 2:{
        System.out.println("我是二号嘉宾");
        break;
    }
    default:{
        System.out.println("我是场外人员");
        break;
    }
}
~~~~

switch语句将从选项值相匹配的case标签处开始执行直到碰到break语句，或者执行到switch语句的结束处为止。如果没有匹配的case标签，而有default语句，就执行default语句之下的子句。

注意:

- 有可能触发多个case分支，如果在case分支语句末尾指出没有break语句，那么就会接着执行下一个case语句，这种情况下那是相当危险的，常常会引发错误，所以不建议使用case语句，可以使用-xlint:fallthrough选项
- case标签可以是：
  - 类型为char、byte、short或int的常量表达式
  - 枚举常量
  - 从java SE7开始，case标签还可以是字符串字面量

[源码](https://github.com/liumingjunhevttc/javaSE/blob/58a87aadd1b04e9a006cdac0521c756c1d9bb87d/java-01/src/main/java/com/baidu/SwitchDemo.java)

#### 1.11 .6 中断控制流程语句

​	尽管java的设计者将goto作为保留字，但实际上并没有打算在语言中使用它。通常使用goto语句被看作是一种拙劣的程序设计风格。当然goto语句需要一种代替体，所以java设计者java语言中增加了一条带标签的break语句，如下所示：

~~~~ java
int i = 0;
while(true){
    System.out.println(i);
    i++;
    if(i>10) break;
}
System.out.println("结束了");
~~~~

 	java也提供了带有标签的break跳出语句，可以跳出多重嵌套的循环语句。如下图所示：

~~~ java
read_data:
for(int k = 1;k<=9;k++){
    for(int j = 1;j<=k;j++){
        System.out.print(j+"*"+k+"="+(j*k)+"\t");
    }
    if(k==6) break read_data;
    System.out.println();
}
~~~

​	最后还有一个continue语句。与break语句一样，它将中断正常的控制流程。continue语句将控制转移到内层循环首部。例如：

```java
for(i = 0;i<100;i++){
    if(i%2==0) continue;
    System.out.println(i);
}                                                           
```

[源码](https://github.com/liumingjunhevttc/javaSE/blob/f324e0fb6ee93b55b3e5cf1cc79e83f3844d94aa/java-01/src/main/java/com/baidu/BreakAndContinueDemo.java)

### 1.12 大数值

​	如果基本数据类型的整数部分以及浮点数精确度不能够满足要求，那么可以使用java.math包中的两个很有用的类：BIgInteger和Decimal。这两个类可以处理包含任意长度数字序列的数值。BigInteger作用于精度计算，BIgDecimal作用于任意精度浮点类型计算，如果需要把基本数据类型转换为大数类型，需要进行如下转换:

~~~~ java
int a = 1000;
BigDecimal decimal = BigDecimal.valueOf(a);
System.out.println(decimal);
~~~~

​	大数值类不像基本数据类型，基本运算方式不能使用，只能使用大数类自定义的运算，如下所示：

~~~~ java
BigDecimal bigDecimal = new BigDecimal(100);
BigDecimal bigDecimal1 = new BigDecimal(3);
System.out.println(bigDecimal.multiply(bigDecimal1));
~~~~

大数API

```
public BigDecimal add(BigDecimal subtrahend);  //加法
public BigDecimal subtract(BigDecimal subtrahend);//减法
public BigDecimal multiply(BigDecimal multiplicand); 乘法
public BigDecimal divide(BigDecimal divisor); // 除法
public int compareTo(BigDecimal val);// 比较 相等是0，被调用比调用小是负数，否则返回正数
public static BigDecimal valueOf(long val);//基本数据类型转换为大数类型
```

[源码](https://github.com/liumingjunhevttc/javaSE/blob/fd6ae811b9fc689c32219bde846a4984bba1f5cc/java-01/src/main/java/com/baidu/BIgNumDemo.java)

### 1.13 数组

​	数组是一种数据结构，用来存储同一类型值的集合，通过整型下标可以访问数组中的每一个值。在声明数组时候，需要指出数组的数据类型和数组变量的名字，声明方式如下所示:

~~~~ java
int[] a;
int b[];
~~~~

​	不过，以上这两条语句没有声明真正的数组，应该使用new运算符创建数组。

~~~~ java
int[] a = new int[10];
int b[] = new int[10];
~~~~

​	一旦创建数组，就可以给数组赋值了，例如如下方式:

~~~~ java
for(int i = 0;i<10;i++){
    a[i] = i;
}
System.out.println(Arrays.toString(a));
~~~~

注意：创建数组时候都会有默认初始化值，例如:

- 数字数组初始化为0
- boolean类型的数组初始化为false
- 对象数组的元素初始化为null

还有一点需要注意的就是一旦数组角标超过数组长度，就会报ArrayIndexOutOfBoundsException异常，所以需要使用数组.length来防止数组角标越界，例如:

~~~~ java
for(int i = 0;i<a.length;i++){
    a[i] = i;
}
System.out.println(Arrays.toString(a));
~~~~

最后，数组一旦创建，就不能改变数组的大小。如果经常需要扩展数组的大小，就需要使用另外一种数据结构-数组列表。

#### 1.13.1 for each循环

​	java有一种很强悍的循环结构，可以用来依次处理数组中的每个元素（其它类型元素集合亦可）而不必为指定下标值而分心。

​	这种增强的for循环的语句格式为：

​	for(variable：collection) statement

定义一个变量用于暂存集合中的每一个元素，并执行相应的语句（当然也可以是语句块），collection这一集合表达式必须是一个数组或者是一个实现了Iterable接口的类对象，如下所示:

~~~ java
// foreach
for (int temp:a) {
    System.out.println(temp);
}
~~~

#### 1.13.2 数组初始化以及匿名数组

​	在java中，提供了一种创建数组对象并同时赋予初始化值得简化书写形式。下面是一个例子。

~~~~ java
int[] flag1 = {1,2,3};
~~~~

​	注意，这种初始化是不需要new对象的，还可以使用匿名数组:

~~~~ java
int[] flag2 = new int[]{1,2,3};
~~~~

#### 1.13.3 数组拷贝

​	在java中，允许将一个数组变量拷贝给另一个数组变量。这时候两个变量将引用同一个数组。例如：

~~~ java
int[] flag3 = {1,2,3};
int[] flag4 = flag3;
~~~

注意:数组拷贝的原理就是将一个数组的引用地址指向另外一个数组中，如果希望将一个数组的所有值拷贝到一个新的数组中，就要使用Arrays类的copyOf方法，如下所示：

~~~~ java
int[] flag5 = Arrays.copyOf(flag3, flag3.length);
~~~~

注意：第二个参数是控制新数组的长度。可以适当延长数组的长度，多余的变量初始值已经讲述，这里不再重复。

​			如果长度小于数组的长度，就只能拷贝最前面的数组长度。

[源码](https://github.com/liumingjunhevttc/javaSE/blob/49f563150d82308776aa4bab191334c548bdbf1b/java-01/src/main/java/com/baidu/ArrayDemo.java)

#### 1.13.4 命令行参数

​	目前我们练习的java应用程序都带有String arg[]参数的main方法，这个参数表明main方法将接收一个字符串数组，也就是命令行参数，例如如下图所示：

~~~ java
public static void main(String[] args) {
    for (String str:args){
        System.out.println(str);
    }
}
~~~

​	在命令行输入任意一个字符串都会有输出结果。

[源码](https://github.com/liumingjunhevttc/javaSE/blob/88d913b6c8cbb53a2d02d9471b24641759465069/java-01/src/main/java/com/baidu/CommandDemo.java)

#### 1.13.5 数组排序

​	如果要对数值类型进行排序，可以使用Arrays类中的sort方法：

~~~~ java
public static void main(String[] args) {
    int[] a = {2,6,5,4,7,8,12,23};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
}
~~~~

​	这个方法使用了优化的快速排序算法。快速排序算法对于大多数数据集合来说都是效率比较高的。Arrays类还提供了几个使用便捷的方法。稍后会讲到它们。

[源码](https://github.com/liumingjunhevttc/javaSE/blob/0fa2d32a99c0d8a2002f3bd2da050beb19b16c24/java-01/src/main/java/com/baidu/SortDemo.java)

#### 1.13.6 Arrays API

```
public static String toString(int[] a); //输出数组元素
public static int[] copyOf(int[] original, int newLength); //输出拷贝之后数组的元素
public static int[] copyOfRange(int[] original, int from, int to); //输出拷贝之后数组的元素
public static void sort(int[] a);//数组排序
public static int binarySearch(int[] a, int key);//使用二分查找方法查找元素所在的位置
public static void fill(int[] a, int val);//将数组的元素全部置位同一个元素、
public static boolean equals(int[] a, int[] a2); 比较两个元素大小是否相等，长度相等，对应元素也相等
```

[源码](https://github.com/liumingjunhevttc/javaSE/blob/9300be8f2f25034510a627eb02a1a2bc3b6394b4/java-01/src/main/java/com/baidu/ArraysDemo.java)

#### 1.13.7  多维数组

​	多维数组将使用多个下标访问元素，它适用于表示表格或更加复杂的排列形式。声明一个二维数组是相当简单的，例如:

~~~ java
double[][] salary;
~~~

​	与一维数组一样，在调用new作为多维数组初始化之前不能使用它。在这里可以这样初始化：

~~~~ java
salary = new double[2][2];
~~~~

​	此外，如果知道数组中的元素，就可以不需要调用new，而是直接使用简化的书写形式对多维数组进行初始化，例如：

~~~~ java
int[][] salary1 = {{16,3,2,13},
                   {16,3,2,13}};
~~~~

​	一旦数组初始化之后，就可以利用两个方括号访问每个元素，例如salary1[[2]][][2]

#### 1.13.8 不规则数组

​	实际上，java是没有多维数组的，只有一维数组，多维数组可以被解释成“数组中的数组”。

[源码](https://github.com/liumingjunhevttc/javaSE/blob/83ca0950bb25fa2b658130a64b6ba74ad81a223e/java-01/src/main/java/com/baidu/SecondArrayDemo.java)
## 2 对象和类

### 2.1 面向对象程序设计概述

​	面向对象程序设计(简称OOP)是当代主流的程序设计范型，它已经取代了20世纪70年代的“结构化”过程化程序设计开发技术。java是完全面向对象的，必须熟悉OOP才能够编写java程序。

​	面向对象的程序是由对象组成的，每个对象包含对用户公开的特定功能部分和隐藏的实现部分。程序中的很多对象来自标准库，还有一些是自定义的。究竟是自己构造对象，还是从开源库中获取对象完全取决于开发项目的预算和时间。但是，从根本上说，只要对象能够满足要求，就不必关心其功能的具体实现过程，在OOP中，不必关心对象的具体实现，只要能够满足用户的需求即可。

​	传统的“结构化”程序设计语言通过解决一系列过程（即算法）来求解问题。一旦确定了这些过程，就要开始考虑存储数据的方式。以前有个公式是“算法+数据结构=程序”,在该程序设计语言中，算法是第一位的，数据结构是第二位的；而面向对象程序设计语言（OOP）正好相反，将数据放在第一位，然后再考虑操作数据的算法。

#### 2.1.1 类

​	类(class)是构造对象的模板或者蓝图。我们将类想象成制作小甜饼的切割机，将对象想象成小甜饼。由类构造的对象的过程称为创建类的实例。

​	用java编写的所有代码都位于某个类的内部。标准的java库提供了几千个类，可以用于用户界面设计、日期、日历和网络程序设计。尽管如此，还是需要java程序中创建一些自己的类，以便描述应用程序所对应的问题域中的对象。

​	封装是与对象有关的一个重要概念。从形式上看，封装不过是将数据和行为组合在一个包中，并对对象的使用者隐藏了数据的实现方式。对象中的数据称为实例域。操纵数据的过程称为方法。对于每个特定的类实例（对象）都有一组特定的实例域值。这些值的集合就是这个对象的当前状态。无论何时，只要向对象发送一个信息，他的状态有可能会改变。

​	实现封装的关键在于绝对不能让类中的方法直接访问其它类的实例域。程序仅通过对对象的方法与对象数据进行交互。封装给对象赋予了“黑盒”特征，这是提高重用性和可靠性的关键。这意味着一个类可以全面地改变存储数据的方式，只要仍旧使用同样得方法操作数据，其它对象就不会知道或者介意所发生的变化。

​	OOP得另外一个原则会让用户自定义java类变着轻而易举，这就是，可以通过扩展一个类来建立另外一个新类。事实上，在java中，所有得类都源自于一个“神通广大的超类”，他就是Object。

​	在扩展一个已有的类时，这个扩展后的新类具有所扩展的类的全部属性和方法。在新类中，只需提供适用于这个新类的新方法和数据域就可以了。通过扩展一个类来建立另外一个类的过程叫做继承。

#### 2.1.2 对象

​	要想使用OOP，一定要清楚对象的三大特性:

- 对象的行为--可以对对象施加哪些操作，或者可以对对象施加哪些方法
- 对象的状态--当增加哪些方法时，对象如何响应
- 对象标识--如何辨别具有相同行为与状态不同的对象

   同一个类的所有对象实例，由于支持相同的行为而具有家族式的相似性。对象的行为是用可调用方法定义的。

​	此外，每个对象都保存着描述当前特征的信息。这就是对象的状态。对象的状态可能会随着时间而改变。但这种改变不会是自发的。对象状态的改变必须通过调用方法实现（如果不经过方法调用就可以改变对象状态，只能说说明封装性遭到破坏）。

​	但是，对象的状态并不能完全描述一个对象，每个对象都有一个唯一的身份。即每个对象的标识永远是不同的，状态常常也存在的差异。

​	对象的这些关键特性在彼此之间相互影响着。