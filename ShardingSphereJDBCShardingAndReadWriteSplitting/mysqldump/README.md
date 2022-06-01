# `mysqldump` 导出文件

使用时直接使用`mysqldump`导入即可。

在主库执行：
```bash
mysqldump -u root -p < master.db
```
在从库执行：
```bash
mysqldump -u root -p < slave.db
```
