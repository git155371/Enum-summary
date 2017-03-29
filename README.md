# Enum-summary
关于java枚举的知识点总结（Summarize the knowledge of java enum）

## 使用说明：

### 1，结合代码 、学习总结 、java api同时学习，	
### 2，Enum代码 编辑器为  eclipse


***
## Enum 个人总结：

```
public enum EnumWeek {

    MON(3,"abc"),
	TUE(6,"def"){
		@override
		public void ifCan(){...}
	};
	
	EnumWeek(int ,String){...}
	
	
	private int n;
	private String info;
	public int getN(){...};
	public String getInfo(){...};
	
	public void ifCan(){...}
	
	public String toString(){...}//Enum的toString方法主要返回对象的name，但可以覆盖重写。
}

```



### 原理是在编译时：
```

public class EnumWeek extends java.lang.Enum{
	public static final EnumWeek MON = new EnumWeek(3,"abc");//给MON对象的  n 和 info 成员赋值。
	public static final EnumWeek TUE = new EnumWeek(6,"def"){...};//覆盖重写原来的ifCan方法。
}

```


#### 因为继承自java.lang.Enum  ,  
#### EnumWeek.MON 提前 实现了  Enum(name,ordinal) 构造方法，
#### name是字符串MON, ordinal为从0到n的int数字。



### EnumSet与EnumMap 的用法与hashSet和hashMap 的用法一致。
#### 但效率要高。只能存放一种枚举类型的对象。




### 2,利用枚举实现单例

#### 1)、 自由序列化；

#### 2)、 保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）；

#### 3)、 线程安全；



### 3,枚举类值的value属性,只能声明在枚举值的后面 (一般枚举值放在最前面)




