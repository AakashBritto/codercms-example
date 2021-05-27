What is x86 Architecture and its difference between x64?

Text File and Binary file: Files that consist exclusively of ASCII characters are known as text files. All other files are known as binary files.

Stack and Heap Memory?



https://blog.csdn.net/red_stone1/article/details/81122926

## 回归分析?

Regression analysis is a set of statistical methods used for the estimation of relationships between a dependent variable and one or more independent variables. 

回归分析是一种预测建模技术的方法，研究因变量（目标）和自变量（预测器）之前的关系。
这一技术被用在预测、时间序列模型和寻找变量之间因果关系。
例如研究驾驶员鲁莽驾驶与交通事故发生频率之间的关系，就可以通过回归分析来解决。

回归分析是进行数据建模、分析的重要工具。

## 回归模型？

有许多回归技术可以用来做预测。这些回归技术主要由三个度量驱动
 - 独立变量的数量 NO of Independent Variables
 - 度量变量的类型 Type of dependent variable
 - 回归线的形状 Shape of the Regression Line

#### 线性回归 Linear Regression
   - 线性回归通过使用最佳的拟合直线（又被称为回归线），建立因变量（Y）和一个或多个自变量（X）之间的关系。
   - 一元线性回归和多元线性回归的区别在于，多元线性回归有大于 1 个自变量，而一元线性回归只有 1 个自变量
   - 它的表达式为：Y=a+b*X+e，其中 a 为直线截距，b 为直线斜率，e 为误差项。如果给出了自变量 X，就能通过这个线性回归表达式计算出预测值，即因变量 Y。
   - 最小二乘法（Least Square Method）是一种拟合回归线的常用算法。它通过最小化每个数据点与预测直线的垂直误差的平方和来计算得到最佳拟合直线

#### 逻辑回归 Logistic Regression

逻辑回归广泛用于分类问题。

 - 最大似然估计
 - 逻辑回归用来计算事件成功（Success）或者失败（Failure）的概率。当因变量是二进制（0/1，True/False，Yes/No）时，应该使用逻辑回归。

#### 多项式回归 Polynomial Regression
 - 对应一个回归方程，如果自变量的指数大于 1，则它就是多项式回归方程
 - 在多项式回归中，最佳的拟合线不是直线，而是拟合数据点的曲线。

#### 逐步回归 Stepwise Regression

#### 岭回归 Ridge Regression

#### 套索回归 Lasso Regression

#### 弹性回归 ElasticNet Regression

## 分类模型

机器学习中的分类模型有逻辑回归、朴素贝叶斯、决策树、支持向量机、随机森林、梯度提升树等分类算法，不仅可以进行二分类，还可以进行多分类。


#### 贝叶斯公式 & 朴素贝叶斯分类

- 朴素贝叶斯算法是假设各个特征之间相互独立


[带你理解朴素贝叶斯分类算法](https://zhuanlan.zhihu.com/p/26262151)

## 遗传算法
遗传算法(Genetic Algorithm)遵循『适者生存』、『优胜劣汰』的原则，是一类借鉴生物界自然选择和自然遗传机制的随机化搜索算法。

遗传算法模拟一个人工种群的进化过程，通过选择(Selection)、交叉(Crossover)以及变异(Mutation)等机制，在每次迭代中都保留一组候选个体，重复此过程，种群经过若干代进化后，理想情况下其适应度达到***近似最优***的状态。

自从遗传算法被提出以来，其得到了广泛的应用，特别是在函数优化、生产调度、模式识别、神经网络、自适应控制等领域，遗传算法发挥了很大的作用，提高了一些问题求解的效率。

#### 遗传算法组成

 - 编码 -> 创造染色体
 - 个体 -> 种群
 - 适应度函数
 - 遗传算子
 - 选择
 - 交叉
 - 变异

#### 运行参数
 - 是否选择精英操作
 - 种群大小
 - 染色体长度
 - 最大迭代次数
 - 交叉概率

[如何通俗易懂地解释遗传算法？有什么例子？](https://www.zhihu.com/question/23293449/answer/120102627)

## 知识图谱

#### 语义网络

[知识图谱之语义网络篇](https://zhuanlan.zhihu.com/p/28276520)
[人工智能·知识图谱知多少](https://zhuanlan.zhihu.com/p/84670813)

知识图谱本质上是一种叫做语义网络（semantic network）的知识库，即具有有向图结构的一个知识库，其中图的结点代表实体（entity）或者概念（concept），而图的边代表实体/概念之间的各种语义关系，比如说两个实体之间的相似关系。

语义网络可以看成是一种用于存储知识的数据结构，即基于图的数据结构，这里的图可以是有向图，也可以是无向图。

使用语义网络，可以很方便地将自然语言的句子用图来表达和存储，用于机器翻译、问答系统和自然语言理解。

#### 概念图（concept map）

是一种用节点代表概念，连线表示概念间关系的图示法。概念图的理论基础是Ausubel的学习理论。知识的构建是通过已有的概念对事物的观察和认识开始的。学习就是建立一个概念网络，不断地向网络增添新内容。为了使学习有意义，学习者个体必须把新知识和学过的概念联系起来。


## 本体论 和 认知论 Ontology vs. Epistemology

知识的两个分支：
 - 本体论：研究这个世界上有哪些我们应该知道的；
 - 认识论：研究我们如何知道这个世界上的事物。

## 激活函数

[激活函数总结（持续更新）](https://zhuanlan.zhihu.com/p/73214810)

