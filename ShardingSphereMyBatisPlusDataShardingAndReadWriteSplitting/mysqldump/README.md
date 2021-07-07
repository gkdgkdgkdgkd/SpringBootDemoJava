# mysqldump 导出文件

使用时直接使用`mysqldump`导入即可。

首先创建好两个库：
```mysql
create database test0;
create database test1;
```
接着导入：
```bash
mysqldump -u root -p < master.db
```
