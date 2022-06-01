# `MySQL` 配置文件

- `master.cnf`是主节点的配置文件
- `slave.cnf`是从节点的配置文件

注意`binlog-do-db`需要分两行来写，不能直接使用`,`分隔，官方文档有说明，`,`是可以作为数据库名字包含在其中的，也就是说：
```bash
binlog-do-db=test0,test1
```
会被看作是一个叫`test0,test1`的库，而不是一个叫`test0`，一个叫`test1`的库。
