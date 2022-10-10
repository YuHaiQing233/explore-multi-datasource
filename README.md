# explore-multi-datasource

SpringBoot + Mybatis-plus + Druid 多数据源

## 主数据库脚本

```SQL
CREATE TABLE `user`
(
    `id`          bigint NOT NULL AUTO_INCREMENT,
    `name`        varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
    `sex`         varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '性别',
    `age`         int                                                           DEFAULT NULL COMMENT '年龄',
    `create_time` datetime                                                      DEFAULT NULL COMMENT '创建时间',
    `update_time` datetime                                                      DEFAULT NULL COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;


INSERT INTO `explore-security-01`.`user` (`id`, `name`, `sex`, `age`, `create_time`, `update_time`) VALUES (1, '张三', '男', 12, '2022-10-09 14:34:26', '2022-10-09 14:34:28');

```

## 从数据库脚本

```sql
CREATE TABLE `order`
(
    `id`       bigint NOT NULL AUTO_INCREMENT,
    `order_no` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '订单编号',
    `user_id`  int                                     DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_general_ci;

INSERT INTO `explore-security-02`.`order` (`id`, `order_no`, `user_id`) VALUES (1, 'IBT00010001', 1);
```
