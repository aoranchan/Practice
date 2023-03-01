# Java Iterator（迭代器）

Java迭代器（Iterator）是 Java 集合框架中的一种机制，它提供了一种在不暴露集合内部实现的情况下遍历集合元素的方法。

Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代   [ArrayList](https://www.runoob.com/java/java-arraylist.html) 和 [HashSet](https://www.runoob.com/java/java-hashset.html) 等集合。

Iterator 是 Java 迭代器最简单的实现，ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。

![img](Java Iterator（迭代器）.assets/ListIterator-Class-Diagram.jpg)

迭代器 it 的三个基本操作是 next 、hasNext 和 remove。

调用 it.next() 会返回迭代器的下一个元素，并且更新迭代器的状态。

调用 it.hasNext() 用于检测集合中是否还有元素。

调用 it.remove() 将迭代器返回的元素删除。

Iterator 类位于 java.util 包中，使用前需要引入它，语法格式如下：

```
import java.util.Iterator; // 引入 Iterator 类
```

### 获取一个迭代器

集合想获取一个迭代器可以使用 iterator() 方法:

### 循环集合元素

让迭代器 it 逐个返回集合中所有元素最简单的方法是使用 while 循环：

```java
while(it.hasNext()) {
    System.out.println(it.next());
}
```

### 删除元素

要删除集合中的元素可以使用 remove() 方法。

**注意：**Java 迭代器是一种单向遍历机制，即只能从前往后遍历集合中的元素，不能往回遍历。同时，在使用迭代器遍历集合时，不能直接修改集合中的元素，而是需要使用迭代器的 remove() 方法来删除当前元素。