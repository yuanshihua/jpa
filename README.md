# jpa

# 学习笔记

## 需要注意的有：
- 使用jpa项目表生成实体类，要确保该表已经设置了主键
- 别忘了加上这个注解：@Table(name="employee")
- 在spring boot项目中，使用的是如下代码：


```@PersistenceContext
	EntityManager manager;
```


- 进行增删改操作的时候要记得开启事务，使用@Transactional这个注解
- 对表进行插入操作时，需要进行持久化，使用这段代码eintitymanager.persist(实体类对象);
- 需要增加表字段或者修改表字段时，在配置文件中添加这句话：spring.jpa.hibernate.ddl-auto=update
- 表的数据中，主键不能为0，否则对表进行操作(删除操作)时会抛出异常
- 在jpa项目中，使用这种方式获取entitymanageer：


- ```
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_link");
	EntityManager em = emf.createEntityManager();
- ```


- 对事务的操作代码示例如下：


 ``` 
		manager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setEid(110);
		employee.setEname("yuanshihua");
		employee.setSalary(20000);
		employee.setDeg("Manager");

		manager.persist(employee);
		manager.getTransaction().commit();
		manager.close();
		emfactory.close(); 
    
```
