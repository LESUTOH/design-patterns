# design-patterns
# 设计原则

## 单一职责原则

对类来说，即一个类应该只负责一项职责。

## 接口隔离原则

客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上

## 依赖倒转（倒置）原则

1. 高层模块不应该依赖底层模块，二者都应该依赖其抽象
2. 抽象不应该依赖细节，细节应该依赖抽象
3. 依赖倒转（倒置）的中心思想是面向接口编程
4. 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在Java中，抽象指的是接口或抽象类，细节就是具体的实现类
5. 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成

注意事项和细节

1. 低层模块尽量都要有抽象类和接口，或者两者都有，程序稳定性更好
2. 变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
3. 继承时遵循里氏替换原则

## 里氏替换原则

1. 如果对每个类型为T1的对象o1，都有类型为T2的对象o2，使得以T1定义的所有程序P在所有的对象o1都代换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类型。换句话说，所有引用基类的地方必须能透明地使用其子类的对象
2. 在使用继承时，遵循里氏替换原则，在子类中尽量不要重写父类的方法
3. 里氏替换原则告诉我们，继承实际上让两个类耦合性增强了，在适当的情况下，可以通过聚合，组合，依赖来解决问题

## 开闭原则

1. 开闭原则是编程中最基础、最重要的设计原则
2. 一个软件实体如类，模块和函数应该对外扩展开放，对修改关闭。用抽象构建框架，用实现扩展细节
3. 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过已有的代码来实现变化
4. 编程中遵循其他原则，以及使用设计模式的目的就是遵循开闭原则

## 迪米特法则

1. 一个对象应该对其他类保持最少了解
2. 类与类关系越密切，耦合度越大
3. 迪米特法则又叫最少知道原则，即一类对自己依赖的类知道的越少越好，也就是说，对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部，对外除了提供的public方法，不对外泄露任何信息
4. 迪米特法则还有个更简单的定义：只与直接的朋友通信
5. 直接的朋友：每个对象都会与其他对象有耦合关系，只要两个对象之间有耦合关系，我们就说这两个对象之间是朋友关系，耦合的方式很多，依赖、关联、组合、聚合等，其中，我们称出现在成员变量、方法参数、方法返回值中的类为直接的朋友，而出现在局部变量中的类不是直接朋友，也就是说，陌生的类最好不要以局部变量的形式出现在类的内部。

注意事项和细节：

1. 迪米特法则的核心是降低了类之间的耦合。
2. 但是注意：由于每个类都减少了不必要的依赖，因此迪米特法则只是要求降低类间（对象间）耦合关系，并不是要求完全没有依赖关系

## 合用复用法则

1. 尽量使用合成/聚合的方式，而不是使用继承

## 设计原则核心思想

1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混合在一起
2. 针对接口编程，而不是针对实现编程
3. 为了交互对象之间的松耦合设计而努力





### 1.识别应用中变化的方面，把它们和不变的方面分开  ---> 把会变化的部分取出并封装，这样，以后就可以修改或扩展这个部分，而不会影响其他不需要变化的部分

### 2.针对接口编程，而不是针对实现编程       ---->     “针对接口编程”真正的意思是“针对超类编程”

### 3.优先使用组合而不是继承

### 4.尽量做到交互的对象之间的松耦合设计

### 5.开放 - 关闭 原则 类应该对扩展开放，但对修改关闭











# 单例模式

## 简介

所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法（静态方法）

## 单例模式的八种方式

1. ==**饿汉式（静态常量）**==
2. ==**饿汉式（静态代码块）**==
3. 懒汉式（线程不安全）
4. 懒汉式（线程安全，同步方法）
5. 懒汉式（线程安全，同步代码块）
6. ==**双重检查**==
7. ==**静态内部类**==
8. ==**枚举**==

### 饿汉式（静态常量）

步骤：

1. 构造器私有化
2. 类的内部创建对象
3. 向外暴露一个静态的公有方法

#### 代码

```java
package com.hollyland.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2);
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
 *  饿汉式：静态变量
 */
class Singleton {

	/**
	 * 1. 构造器私有化防止new
	 */
	private Singleton() {
		
	}

	/**
	 * 2.内部创建对象实例
	 */
	private final static Singleton instance = new Singleton();

	/**
	 * 3.对外提供公有的静态方法，返回实例对象
	 * @return 实例
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}
```

#### 优缺点

1. 优点：写法比较简单，就是在类装载的时候完成实例化。避免了线程同步的问题
2. 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存浪费
3. 这种方式基于classloader机制避免了多线程的同步问题，不过，instance在装载时就实例化，在单例模式中大多数都是调用getInstance方法，但是导致类装载的原因有很多种（或者其他的静态方法）导致类装载，这时候初始化instance就没有达到lazy loading 的效果
4. 结论：可用，但会造成资源浪费

### 饿汉式（静态代码块）

#### 代码

```java
package com.hollyland.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}


/**
 *  饿汉式（静态代码块）
 */
class Singleton {

	/**
	 * 构造器私有化，防止new
	 */
	private Singleton() {
		
	}


	/**
	 * 2.本类内部创建对象实例
	 */
	private static  Singleton instance;
	
	static {
		instance = new Singleton();
	}

	/**
	 * 3.提供一个共有的静态方法获取实例
	 * @return 实例
	 */
	public static Singleton getInstance() {
		return instance;
	}
	
}
```

#### 优缺点

1. 这种方式和上面的方式类似，只不过把类实例化的过程放在了静态代码块中，也是在类装载的时候，就执行静态代码块中的代码，初始化类的实例
2. 结论：可用，但是会造成内存浪费

### 懒汉式（线程不安全）

#### 代码

```java
package com.hollyland.singleton.type3;


public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("懒汉式（线程不安全）");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

/**
 * 懒汉式（线程不安全）
 */
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}

	/**
	 * 当使用对象的时候才创建实例
	 * @return 实例
	 */
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
```

#### 优缺点

1. 起到了Lazy Loading的效果，但是只能在单线程下使用
2. 如果在多线程下，一个线程进入了if（singleton == null）判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这事便会产生多个实例。所以在多线程环境下不可使用这种方式
3. 结论：实际开发中，不要使用这种方式

### 懒汉式（线程安全，同步方法）

#### 代码

```java
package com.hollyland.singleton.type4;


public class SingletonTest04 {

   public static void main(String[] args) {
      System.out.println("懒汉式（线程安全，同步方法）");
      Singleton instance = Singleton.getInstance();
      Singleton instance2 = Singleton.getInstance();
      System.out.println(instance == instance2); // true
      System.out.println("instance.hashCode=" + instance.hashCode());
      System.out.println("instance2.hashCode=" + instance2.hashCode());
   }

}

/**
 * 懒汉式（线程安全，同步方法）
 */
class Singleton {
   private static Singleton instance;
   
   private Singleton() {}

   /**
    * 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    * @return 实例
    */
   public static synchronized Singleton getInstance() {
      if(instance == null) {
         instance = new Singleton();
      }
      return instance;
   }
}
```

#### 优缺点

1. 解决了线程安全问题
2. 效率太低了，每个线程在想活得累的实力时候，执行getInstance（）方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低
3. 结论：不推荐使用

### 懒汉式（线程安全，同步代码块）

#### 代码

```java
package com.hollyland.singleton.type6;


public class SingletonTest06 {

   public static void main(String[] args) {
      System.out.println("懒汉式（同步代码块）");
      Singleton instance = Singleton.getInstance();
      Singleton instance2 = Singleton.getInstance();
      System.out.println(instance == instance2); // true
      System.out.println("instance.hashCode=" + instance.hashCode());
      System.out.println("instance2.hashCode=" + instance2.hashCode());
      
   }

}

/**
 * 懒汉式（同步代码块）
 */
class Singleton {
   private static Singleton instance;
   
   private Singleton() {}

   /**
    * 同步放在代码块
    * @return 实例
    */
   public static Singleton getInstance() {
      if(instance == null) {
         synchronized (Singleton.class) {
               instance = new Singleton();
         } 
      }
      return instance;
   }
}
```

#### 优缺点

1. 这种方式，本意是对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块
2. 但是这种同步并不能起到线程同步的作用。跟第三种实现方式遇到的情形一致，加入一个线程进入了if(singleton == null) 判断语句，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
3. 结论：实际开发中，不能使用这种方式

### 双重检查

#### 代码

```java
package com.hollyland.singleton.type6;


public class SingletonTest06 {

   public static void main(String[] args) {
      System.out.println("双重检查");
      Singleton instance = Singleton.getInstance();
      Singleton instance2 = Singleton.getInstance();
      System.out.println(instance == instance2); // true
      System.out.println("instance.hashCode=" + instance.hashCode());
      System.out.println("instance2.hashCode=" + instance2.hashCode());
      
   }

}

/**
 * 双重检查
 */
class Singleton {
   private static volatile Singleton instance;
   
   private Singleton() {}

   /**
    * 提供一个静态的公有方法，加入双重检查的方法，解决了线程安全和性能问题
    * @return 实例
    */
   public static Singleton getInstance() {
      if(instance == null) {
         synchronized (Singleton.class) {
            if(instance == null) {
               instance = new Singleton();
            }
         }
         
      }
      return instance;
   }
}
```

#### 优缺点

1. Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if(singleton == null)检查，这样就可以保证线程安全了
2. 这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton == null)，直接return实例化对象，也避免的反复进行方法同步
3. 线程安全，延迟加载，效率较高
4. 结论：推荐使用

### 静态内部类

#### 代码

```java
package com.hollyland.singleton.type7;


public class SingletonTest07 {

   public static void main(String[] args) {
      System.out.println("使用静态内部类完成单例模式");
      Singleton instance = Singleton.getInstance();
      Singleton instance2 = Singleton.getInstance();
      System.out.println(instance == instance2); // true
      System.out.println("instance.hashCode=" + instance.hashCode());
      System.out.println("instance2.hashCode=" + instance2.hashCode());
      
   }

}

/**
 * 静态内部类
 */
class Singleton {
   private static volatile Singleton instance;

   /**
    * 1.私有化构造方法
    */
   private Singleton() {}

   /**
    * 2.写一个静态内部类SingletonInstance，该类中有一个静态属性Singleton
    */
   private static class SingletonInstance {
      private static final Singleton INSTANCE = new Singleton(); 
   }

   /**
    * 提供一个静态公有方法，直接返回
    * @return 实例
    */
   public static synchronized Singleton getInstance() {
      return SingletonInstance.INSTANCE;
   }
}
```

#### 优缺点

1. 这种方式采用了类装载的机制来保证初始化实例时只有一个线程
2. 敬爱内部类在Singleton类被装在时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化
3. 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
4. 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
5. 结论：推荐使用

### 枚举

#### 代码

```java
package com.hollyland.singleton.type8;

public class SingletonTest08 {
   public static void main(String[] args) {
      Singleton instance = Singleton.INSTANCE;
      Singleton instance2 = Singleton.INSTANCE;
      System.out.println(instance == instance2);
      
      System.out.println(instance.hashCode());
      System.out.println(instance2.hashCode());
      
      instance.sayOK();
   }
}

/**
 * 枚举
 */
enum Singleton {
   INSTANCE; 
   public void sayOK() {
      System.out.println("ok~");
   }
}
```

#### 优缺点：

1. 这借助JDK1.5中添加的枚举来实现单例模式。不仅可以避免多线程同步问题，而且还能防止反序列化重现创建新的对象
2. 这种方式是Effective Java 作者 Josh Bloch 提倡的方式
3. 结论：推荐使用

## 单例模式的注意事项和细节问题

1. 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能
2. 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new
3. 单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或耗费资源过多（即：重量级对象），但又经常用得到的对象、工具类对象、频繁访问数据库或文件的对象（比如数据源、session工厂等）



# 工厂模式

## 简介

1. 定义了一个创建对象地抽象方法，由子类决定要实例化地类。工厂方法模式将对象地实例化推迟到子类

简单工厂模式

工厂模式

抽象工厂模式

### 抽象工厂模式

1. 定义了一个interface用于创建相关或有依赖关系地对象簇，而无需指明具体的类
2. 抽象工厂模式可以将简单工厂模式和工厂方法模式进行结合
3. 从设计层面看，抽象工厂模式就是对简单工厂模式地改进（或者说进一步地抽象）
4. 将工厂抽象成两层，AbsFactory（抽象工厂）和具体实现地工厂子类。程序员可以根据创建对象类型使用对应地工厂子类。这样将单个地简单工厂类变成了工厂簇，更利于代码地维护和扩展

## 工厂模式小姐

1. 工厂模式的意义

   将实例化对象的代码提取出来，放到一个类统一管理和维护，达到和主项目的依赖关系的解耦。从而提高项目的扩展和维护性

2. 三种工厂模式（简单工厂模式、工厂方法模式、抽象工厂模式）

3. 设计模式的依赖抽象原则

   创建对象实例时，不要直接new类，而是把这个new类的动作放在一个工厂的方法中，并返回。（变量不要直接持有具体类的引用）

   不要让类继承具体类，而是继承抽象类或者实现interface

   不要覆盖基类中已经实现的方法

# 原型模式

## 简介

1. 原型模式（Prototype模式）是指：用**原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象**
2. 原型模式是一种创建型设计模式，允许一个对象再创建另一个可定制的对象，无需知道如何创建的细节
3. 工作原理是：通过将一个圆形对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来试试创建，即对象.clone()

![image-20221129141813731](E:\IdeaProject\design-patterns\projectImg\image-20221129141813731.png)

## 深拷贝和浅拷贝

### 浅拷贝

1. 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象
2. 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组，某个类的对象等，那么浅拷贝会进行引用传递，也就是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值
3. 浅拷贝是使用默认的clone()方法来实现

### 深拷贝

1. 复制对象的所有基本数据类型的成员变量值
2. 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，知道该对象可达的所有对象。也就是说，**对象进行深拷贝要对整个对象（包括对象的引用类型）进行拷贝**
3. 深拷贝实现方式1：重写clone方法来实现深拷贝
4. 深拷贝实现方式2：通过对象序列化实现深拷贝（推荐）

## 原型模式的注意事项和细节

1. 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提高效率
2. 不用重复初始化对象，而是动态地获得对象运行时的状态
3. 如果原始对象发生变化（增加或者减少属性），其他克隆对象的也会发生相应的变化，无需修改代码
4. 在实现深克隆的时候可能需要比较复杂的代码
5. 缺点：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有的类进行改造时，需要修改其源码，违背了ocp原则

# 建造者模式



## 简介

1. 建造者模式（Builder Pattern）又叫生成器模式，是一种对象构建模式。它可以将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象
2. 建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节

## 建造者模式的四个角色

1. product（产品角色）：一个具体的产品对象
2. Builder（抽象建造者）：创建一个Product对象的各个部件指定的接口/抽象类
3. ConcreteBuilder（具体建造者）：实现接口，构建和装配各个部件
4. Director（指挥者）：构建一个使用Builder接口的对象。它主要是用于创建一个复杂的对象。它主要有两个作用：
   1. 隔离了客户与对象的生产过程
   2. 负责控制产品对象的生产过程



## 源码分析

![image-20221129175458011](E:\IdeaProject\design-patterns\projectImg\image-20221129175458011.png)

1. Appendable接口定义了多个append方法（抽象方法），即Appendable为抽象建造者，定义了抽象方法
2. AbstractStringBuilder实现了Appendable接口方法，这里的AbstractStringBuilder已经是建造者，只是不能实例化
3. StringBuilder即充当了指挥者角色，同时充当了具体的建造者，建造方法的实现是由AbstractStringBuilder完成，而StringBuilder继承了AbstractStringBuilder

## 建造者模式的注意事项和细节

1. 客户端（使用程序）不必知道产品内部组成的细节，将产品本身与产品创建过程解耦，使得相同的创建过程可以创建不同的产品对象

2. 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，用户使用不同地具体建造者即可得到不同地产品对象

3. 可以更加精细地控制产品的创建过程。将复杂产品地创建步骤分解在不同地方法中，是的创建过程更加清晰，也更方便使用程序来控制创建过程

4. 增加新的具体创造者无须修改原有类库地代码，指挥者类针对抽象建造者类编程，系统扩展方便，符合“开闭原则”

5. 建造者模式所创建地产品一般具有较多的共同点，其组成部分相似,如果产品之间的差异性很大，则不适合使用建造者模式，因此其适用范围收到一定限制

6. 如果产品的内部变化复杂，可能会导致需要定义很多具体建造类来实现这种变化，导致系统变得很庞大，因此在这种情况下，要考虑是否选择建造者模式

7. 抽象工厂模式VS建造者模式

   抽象工厂模式实现对产品家族的创建，一个产品家族是这样的一系列产品：具有不同分类维度的产品组合，采用抽象工厂模式不需要关心构建过程，只关心什么产品由什么工厂生产即可，而建造者模式则是按要求按照指定的蓝图建造产品，它的主要目的是通过组装零配件而产生一个新产品

   # 适配器模式

   ## 基本介绍

   1. 适配器模式（Adapter Pattern）将某个类的接口转换成客户端期望的另一个接口，主要目的是兼容性，让原本因接口不匹配不能一起工作的两个类可以协同。其别名为包装其（Wrapper）
   2. 适配器模式属于结构型模式
   3. 主要分为三类：类适配器模式、对象适配器模式、接口适配器模式

   ## 工作原理

   1. 适配器模式：将一个类的接口转换成另一个接口，让原本接口不兼容的类可以兼容
   2. 从用户的角度看不到适配器，是解耦的
   3. 用户调用适配器转化出来的目标接口方法，适配器再调用被适配者的相关接口方法、
   4. 用户收到反馈接口，感觉只是和目标接口交互

   ## 类适配器模式

   ### 注意事项和细节

   1. Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点，因为这要求dst必须是接口，有一定局限性
   2. src类的方法再Adapter中都会暴露出来，也增加了使用的成本
   3. 由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强

   ## 对象适配器模式

   ### 介绍

   1. 基本思路和类的适配器模式相同，只是将Adapter类作修改，不是继承src类，而是持有src类的实例，已解决兼容性的问题。即：持有src类，实现dst类接口，完成src->dst的适配
   2. 根据"合用复用原则",在系统中尽量使用关联关系（聚合）来替代继承关系
   3. 对象适配器模式是适配器模式常用的一种

   ### 注意事项和细节

   1. 对象适配器和类适配器其实算是同一种思想，只不过实现方式不同。

      根据合用复用原则，使用组合替代继承，所以它解决了类适配器必须继承src的局限性问题，也不再要求dst必须是接口

   2. 使用成本更低，更灵活

   ## 接口适配器模式

   ### 介绍

   1. 核心思想：当不需要全部实现接口提供的方法时，可以先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求
   2. 适用于一个接口不想使用其所有的方法的情况

   ## 适配器模式的注意事项和细节

   1. 三种命名方式，是根据src是以怎么样的形式给到Adapter（在Adapter里的形式）来命名

   2. 类适配器：以类给到，在Adapter里，就是将src当作类，继承

      对象适配器：以对象给到，在Adapter里，将src作为一个对象，持有

      接口适配器：以接口给到，在Adapter里，将src作为一个接口，实现

   3. Adapter模式最大的作用还是将原本不兼容的接口融合在一起工作

   4. 实际开发中，实现起来不拘泥于我们讲解的三种经典形式







# 策略模式

**定义了一个算法族，分别封装起来，使得它们之间可以互相变换。策略让算法的变化独立于使用它的客户**

# 观察者模式

**定义对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新**





