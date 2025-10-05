-- Active: 1759214423336@@127.0.0.1@3306@dkd
CREATE TABLE `tb_region` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `region_name` VARCHAR(255) NOT NULL COMMENT '区域名称',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_by` VARCHAR(64) COMMENT '创建者',
    `update_by` VARCHAR(64) COMMENT '更新者',
    `remark` TEXT COMMENT'备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入数据
INSERT INTO `tb_region` (`region_name`) VALUES('北京市朝阳区'),('北京市海淀区'),('北京市东城区');

CREATE TABLE `tb_partner` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `partner_name` VARCHAR(255) NOT NULL COMMENT '合作商名称',
    `contact_person` VARCHAR(64) COMMENT '联系人',
    `contact_phone` VARCHAR(15) COMMENT '联系电话',
    `profit_ratio` INT COMMENT '分成比例',
    `account` VARCHAR(64) COMMENT '账号',
    `password` VARCHAR(64) COMMENT '密码',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_by` VARCHAR(64) COMMENT '创建者',
    `update_by` VARCHAR(64) COMMENT '更新者',
    `remark` TEXT COMMENT'备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入数据
INSERT INTO `tb_partner` ( `partner_name`, `contact_person`, `contact_phone`, `profit_ratio`, `account`, `password`) VALUES
('合作商A','张三','13800138000',30,'a001','pwdA'),
('合作商B','李四','13912345678',25,'b002','pwdB');

CREATE TABLE `tb_node` (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `node_name` VARCHAR(255) NOT NULL COMMENT '点位名称',
    `address` VARCHAR(255) COMMENT '详细地址',
    `business_type` VARCHAR(64) COMMENT '业务类型',
    `region_id` INT COMMENT '区域ID',
    `partner_id` INT COMMENT '合作商ID',
    `create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_by` VARCHAR(64) COMMENT '创建者',
    `update_by` VARCHAR(64) COMMENT '更新者',
    `remark` TEXT COMMENT'备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 插入数据
INSERT INTO `tb_node` (`node_name`, `address`, `business_type`, `region_id`, `partner_id`) VALUES
('点位A','北京市朝阳区',1,1,1),
('点位B','北京市海淀区',2,2,2);