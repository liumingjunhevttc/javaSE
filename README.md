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

![1](/../java-01/1.jpg)

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

### 2.0 字符串

​	从概念上讲，java字符串就是Unicode字符序列，例如，串“java\u2122”由5个Unicode字符组成。java没有内置的字符串类型，而是在标准java类库中提供了一个预定义类，该类是String。每个用双引号括起来的字符串就是String类的一个实例:

~~~~ java
String s= ""; // 是一个空字符串
String greeting = "hello";
~~~~

**扩展**

字符串的底层就是char类型的数组

#### 2.0.1 子串

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

#### 2.0.2 拼接

​	java语言可以使用“+”进行拼接，如下所示:

~~~ java
String welcome = "欢迎";
String student = "小王";
String showData = welcome+" "+student;
System.out.println(showData);
~~~

​	值得注意的就是，字符串使用”+“与非字符串进行拼接的时候，结果还是字符串。

#### 2.0.3 不可变字符串

​	String类没有提供用于修改字符串的方法。如果希望将某个字符串修改成对应的字符串，只能使用截取，不可改变字符串本身，在java官方文档中将String类定义的字符串重新定义为不可变字符串。

​    这样做是否降低运行效率，这类问题也对也不对，创建新的字符串的确由于开辟内存空间会影响效率的问题，但是不可变字符串有一个优点:编译器可以让字符串共享。可以想象各种字符串存放在公共的存储池中。字符串变量指向存储池中相应的位置。如果复制一个字符串变量，原始的字符串与复制的字符串共享相同的字符。

​     字符串由于拼接产生的低效率问题会有专门的用来存储字符串的类库，那就是StringBuffer，StringBuilder。

#### 2.0.4 检测字符串是否相等

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

#### 2.0.5 空串与null串

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

#### 2.0.6 码点与码元

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

**2.0.1 --- 2.0.6 [源码](https://github.com/liumingjunhevttc/javaSE/blob/ec4bf175b353bc2fe90070eba62b49aabd045583/java-01/src/main/java/com/baidu/stringdemo/Demo1.java)**

#### 2.0.7 API

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

#### 2.0.8 构建字符串

有些时候，需要由较短的字符串构建字符串， 但是采用字符串连接的方式效率比较低，即每次连接字符串，都会构建一个新的String对象，既耗时，又耗费时间。所以需要使用一个替代方案，即使用StringBuffer或者StringBuilder

有一点需要注意的就是StringBuffer与StringBuilder里面所有的方法几乎是一模一样的，但是StringBuilder比StringBuffer效率比较高，因为StringBuffer加了锁机制，如果添加某个字符串时候，使用append()方法即可。

~~~~ java
StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("hello");
stringBuilder.append("world");
System.out.println(stringBuilder.toString());
~~~~

