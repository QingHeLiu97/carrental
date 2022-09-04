/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.1.21-MariaDB : Database - carrental
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`carrental` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `carrental`;

/*Table structure for table `appraise` */

DROP TABLE IF EXISTS `appraise`;

CREATE TABLE `appraise` (
  `appr_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `create_by` varchar(30) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `level` varchar(2) DEFAULT NULL,
  `status` int(1) DEFAULT '0',
  `phone` varchar(12) DEFAULT NULL,
  `order_id` varbinary(20) DEFAULT NULL,
  PRIMARY KEY (`appr_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `appraise` */

insert  into `appraise`(`appr_id`,`content`,`create_by`,`create_time`,`update_time`,`level`,`status`,`phone`,`order_id`) values 
(1,'真的很不错，下次还要来','李四','2022-08-13 00:00:00','2022-08-13 00:00:00','5',1,NULL,NULL),
(2,'服务很周到，态度不错','李老板','2022-08-13 00:00:00','2022-08-13 00:00:00','4',0,NULL,NULL);

/*Table structure for table `car` */

DROP TABLE IF EXISTS `car`;

CREATE TABLE `car` (
  `car_id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(3) DEFAULT NULL,
  `color` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  `deposit` varchar(20) DEFAULT NULL,
  `carname` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(1) DEFAULT '0',
  `user_phone` varchar(12) DEFAULT NULL,
  `car_circle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`car_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1022 DEFAULT CHARSET=utf8;

/*Data for the table `car` */

insert  into `car`(`car_id`,`type`,`color`,`price`,`deposit`,`carname`,`create_time`,`update_time`,`status`,`user_phone`,`car_circle`) values 
(1001,'轿车','黑huang色','1888','30000','红旗H9','2022-06-25 00:00:00','2022-08-24 23:49:19',0,'15279364510',NULL),
(1002,'轿车','黑色','18888','30000','红旗H7','2022-06-25 00:00:00','2022-08-25 00:03:31',0,'15279364510',NULL),
(1003,'SUV','银灰色','5000','50000','红旗E-HS9','2022-06-25 00:00:00','2022-08-25 00:11:22',0,'15279364510',NULL),
(1004,'轿车','蓝色','2000','30000','红旗H5','2022-06-25 00:00:00','2022-08-24 23:49:11',1,'15279364586',NULL),
(1005,'轿车','绿色','2000','30000','大众','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364586',NULL),
(1006,'SUV','黑色','2700','30000','红旗HS7','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364586',NULL),
(1007,'轿车','红色','2000','30000','大众','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364014',NULL),
(1008,'SUV','白色','2000','30000','红旗E-HS3','2022-06-25 00:00:00','2022-07-25 00:00:00',1,'15279364014',NULL),
(1009,'轿车','银灰色','2000','30000','大众','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364014',NULL),
(1010,'轿车','红色','1500','20000','宝骏RS-5','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364582',NULL),
(1011,'SUV','白色','1200','20000','宝骏510','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364582',NULL),
(1012,'SUV','黑色','1000','20000','宝骏RS-7','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364588',NULL),
(1013,'SUV','绿色','1000','20000','宝骏RS-3','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364588',NULL),
(1014,'SUV','白色','1200','20000','一汽','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364588',NULL),
(1015,'SUV','黄色','1500','20000','一汽','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364588',NULL),
(1016,'SUV','蓝色','1200','20000','一汽','2022-06-25 00:00:00','2022-07-25 00:00:00',0,'15279364588',NULL),
(1017,'SUV','红色','1000','20000','一汽','2022-06-25 00:00:00','2022-07-25 00:00:00',0,NULL,NULL),
(1018,'SUV','白色','1800','20000','一汽','2022-06-25 00:00:00','2022-07-25 00:00:00',0,NULL,NULL),
(1019,'SUV','蓝色','1200','30000','雪佛兰','2022-06-25 00:00:00','2022-07-25 00:00:00',0,NULL,NULL),
(1020,'轿车','白色','1500','30000','雪佛兰','2022-06-25 00:00:00','2022-07-25 00:00:00',0,NULL,NULL),
(1021,'SUV','红色','2000','30000','雪佛兰','2022-06-25 00:00:00','2022-07-25 00:00:00',1,NULL,NULL);

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `notice_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `autor` varchar(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`notice_id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

/*Data for the table `notice` */

insert  into `notice`(`notice_id`,`title`,`content`,`autor`,`create_time`,`update_time`,`status`) values 
(1,'10.4事件','10月4日凌晨1时许，行车二车间三名职工下中班后和另外一名职工子女共2男2女，利用休班时间，由行车二职工孟猛驾驶从莱芜租赁公司租来的红旗牌轿车，从莱钢出发沿济青南线前往胶南。早5时左右，行至距黄岛53KM+359米处时，四人所乘车辆因发动机温度过高发生故障，遂将车停靠在紧急停车带内，并打开四角警示闪光灯，四人坐在车内。约5分钟后，四人所乘小轿车被一辆河北牌照大货车追尾后又碾压在车底，坐在副驾驶位置的一名女职工从破损的车窗爬出车外生还随后小轿车起火，困在车内的其余3人死亡。肇事大货车车头也被烧毁。','小吴','2022-06-20 00:00:00','2022-08-25 00:00:00',1),
(2,'交通安全的相关法律依据','《中华人民共和国道路交通安全法》\r\n　　第三十六条　根据道路条件和通行需要，道路划分为机动车道、非机动车道和人行道的，机动车、非机动车、行人实行分道通行。没有划分机动车道、非机动车道和人行道的，机动车在道路中间通行，非机动车和行人在道路两侧通行。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(3,'交通安全的相关法律依据','《中华人民共和国道路交通安全法》\r\n第三十七条　道路划设专用车道的，在专用车道内，只准许规定的车辆通行，其他车辆不得进入专用车道内行驶。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(4,'交通安全的相关法律依据','《中华人民共和国道路交通安全法》\r\n　　第三十八条　车辆、行人应当按照交通信号通行；遇有交通警察现场指挥时，应当按照交通警察的指挥通行；在没有交通信号的道路上，应当在确保安全、畅通的原则下通行。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(5,'交通安全的相关法律依据','《中华人民共和国道路交通安全法》\r\n　　　　第三十九条　公安机关交通管理部门根据道路和交通流量的具体情况，可以对机动车、非机动车、行人采取疏导、限制通行、禁止通行等措施。遇有大型群众性活动、大范围施工等情况，需要采取限制交通的措施，或者作出与公众的道路交通活动直接有关的决定，应当提前向社会公告。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(6,'2022新交通法规','第八条 机动车驾驶人有下列交通违法行为之一，一次记12分：\r\n\r\n(一)饮酒后驾驶机动车的;\r\n\r\n(二)造成致人轻伤以上或者死亡的交通事故后逃逸，尚不构成犯罪的;\r\n\r\n(三)使用伪造、变造的机动车号牌、行驶证、驾驶证、校车标牌或者使用其他机动车号牌、行驶证的;\r\n\r\n(四)驾驶校车、公路客运汽车、旅游客运汽车载人超过核定人数百分之二十以上，或者驾驶其他载客汽车载人超过核定人数百分之百以上的;\r\n\r\n(五)驾驶校车、中型以上载客载货汽车、危险物品运输车辆在高速公路、城市快速路上行驶超过规定时速百分之二十以上，或者驾驶其他机动车在高速公路、城市快速路上行驶超过规定时速百分之五十以上的;\r\n\r\n(六)驾驶机动车在高速公路、城市快速路上倒车、逆行、穿越中央分隔带掉头的;\r\n\r\n(七)代替实际机动车驾驶人接受交通违法行为处罚和记分牟取经济利益的。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(7,'2022新交通法规','第九条 机动车驾驶人有下列交通违法行为之一，一次记9分：\r\n\r\n(一)驾驶7座以上载客汽车载人超过核定人数百分之五十以上未达到百分之百的;\r\n\r\n(二)驾驶校车、中型以上载客载货汽车、危险物品运输车辆在高速公路、城市快速路以外的道路上行驶超过规定时速百分之五十以上的;\r\n\r\n(三)驾驶机动车在高速公路或者城市快速路上违法停车的;\r\n\r\n(四)驾驶未悬挂机动车号牌或者故意遮挡、污损机动车号牌的机动车上道路行驶的;\r\n\r\n(五)驾驶与准驾车型不符的机动车的;\r\n\r\n(六)未取得校车驾驶资格驾驶校车的;\r\n\r\n(七)连续驾驶中型以上载客汽车、危险物品运输车辆超过4小时未停车休息或者停车休息时间少于20分钟的。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0),
(8,'2022新交通法规','第十条 机动车驾驶人有下列交通违法行为之一，一次记6分：\r\n\r\n(一)驾驶校车、公路客运汽车、旅游客运汽车载人超过核定人数未达到百分之二十，或者驾驶7座以上载客汽车载人超过核定人数百分之二十以上未达到百分之五十，或者驾驶其他载客汽车载人超过核定人数百分之五十以上未达到百分之百的;\r\n\r\n(二)驾驶校车、中型以上载客载货汽车、危险物品运输车辆在高速公路、城市快速路上行驶超过规定时速未达到百分之二十，或者在高速公路、城市快速路以外的道路上行驶超过规定时速百分之二十以上未达到百分之五十的;\r\n\r\n(三)驾驶校车、中型以上载客载货汽车、危险物品运输车辆以外的机动车在高速公路、城市快速路上行驶超过规定时速百分之二十以上未达到百分之五十，或者在高速公路、城市快速路以外的道路上行驶超过规定时速百分之五十以上的;\r\n\r\n(四)驾驶载货汽车载物超过最大允许总质量百分之五十以上的;\r\n\r\n(五)驾驶机动车载运爆炸物品、易燃易爆化学物品以及剧毒、放射性等危险物品，未按指定的时间、路线、速度行驶或者未悬挂警示标志并采取必要的安全措施的;\r\n\r\n(六)驾驶机动车运载超限的不可解体的物品，未按指定的时间、路线、速度行驶或者未悬挂警示标志的;\r\n\r\n(七)驾驶机动车运输危险化学品，未经批准进入危险化学品运输车辆限制通行的区域的;\r\n\r\n(八)驾驶机动车不按交通信号灯指示通行的;\r\n\r\n(九)机动车驾驶证被暂扣或者扣留期间驾驶机动车的;\r\n\r\n(十)造成致人轻微伤或者财产损失的交通事故后逃逸，尚不构成犯罪的;\r\n\r\n(十一)驾驶机动车在高速公路或者城市快速路上违法占用应急车道行驶的。','小吴','2022-06-20 00:00:00','2022-06-25 00:00:00',0);

/*Table structure for table `orderes` */

DROP TABLE IF EXISTS `orderes`;

CREATE TABLE `orderes` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `car_id` int(11) DEFAULT NULL,
  `car_price` varchar(10) DEFAULT NULL,
  `car_type` varchar(3) DEFAULT '',
  `car_color` varchar(20) DEFAULT NULL,
  `deposit` varchar(10) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `user_phone` varchar(11) DEFAULT NULL,
  `user_address` varchar(50) DEFAULT NULL,
  `handlers_name` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `orderes` */

insert  into `orderes`(`order_id`,`car_id`,`car_price`,`car_type`,`car_color`,`deposit`,`user_id`,`username`,`user_phone`,`user_address`,`handlers_name`,`status`,`create_time`,`update_time`) values 
(1,1001,'3000','轿车','黑色','30000',3,'zhagnsan','15279364510','深圳','小吴',1,'2022-07-31 00:00:00',NULL),
(2,1004,'2000','轿车','蓝色','30000',5,'钱总','18776666650','贺州','张三',0,'2022-07-31 00:00:00',NULL),
(3,1008,'2000','SUV','白色','30000',9,'潘总','19124508754','深圳','李四',0,'2022-07-31 00:00:00',NULL),
(4,1021,'2000','SUV','红色','30000',4,'周总','13456788987','梧州','小吴',0,'2022-07-31 00:00:00','2022-08-26 00:54:45'),
(11,1001,'3000','轿车','黑色','30000',3,'zhagnsan','15279364510','深圳',NULL,0,'2022-07-31 00:00:00',NULL),
(12,1001,'3000','轿车','黑色','30000',3,'zhagnsan','15279364510','深圳',NULL,0,'2022-07-31 00:00:00',NULL),
(13,1001,'3000','轿车','黑色','30000',3,'zhagnsan','15279364510','深圳',NULL,0,'2022-07-31 00:00:00',NULL);

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL,
  `create_time` date DEFAULT NULL,
  `update_time` date DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  PRIMARY KEY (`role_id`)
) ENGINE=MyISAM AUTO_INCREMENT=1033 DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`role_id`,`user_id`,`user_name`,`role`,`create_time`,`update_time`,`status`) values 
(1011,'1','admin','admin','2022-06-25','2022-06-25',NULL),
(1012,'2','李四','admin','2022-06-25','2022-06-25',NULL),
(1014,'4','zhangsan','user','2022-06-25','2022-06-25',NULL),
(1013,'3','刘老板','user','2022-06-25','2022-06-25',NULL),
(1015,'5','钱总','user','2022-06-25','2022-06-25',NULL),
(1016,'6','老王','user','2022-06-25','2022-06-25',NULL),
(1017,'7','小吴','admin','2022-06-25','2022-06-25',NULL),
(1018,'8','赵四','user','2022-06-25','2022-06-25',NULL),
(1019,'9','潘总','user','2022-06-25','2022-06-25',NULL),
(1020,'10','super','user','2022-06-25','2022-06-25',NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `id_card` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(1) DEFAULT '0',
  `token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`username`,`password`,`sex`,`phone`,`email`,`id_card`,`address`,`create_time`,`update_time`,`status`,`token`) values 
(1,'admin','123456','1','15279364587','4750562602@qq.com','450422200110012584','深圳市南山区软件产业基地4D','2022-06-15 00:00:00','2022-08-31 00:51:40',0,NULL),
(2,'李四','lisi','1','15279364586','4750562602@qq.com','450422200110012584','深圳市宝安区','2022-06-15 00:00:00','2022-08-20 00:00:00',0,NULL),
(3,'zhangsan','123456','1','15279364510','4750562602@qq.com','450422200110012584','西乡地铁站Achukou','2022-06-15 00:00:00','2022-08-31 00:55:19',1,NULL),
(4,'liu老板','zhou123','1','15279364784','4750562602@qq.com','450422200110012584','沙井地铁站','2022-06-15 00:00:00','2022-08-20 00:00:00',0,NULL),
(5,'小周','qin123','1','15279365740','4750562602@qq.com','450422200110012584','罗湖区','2022-06-15 00:00:00','2022-08-22 00:00:00',0,NULL),
(6,'小陈','123456','1','15279364584','4750562602@qq.com','450422200110012584','井冈山','2022-06-15 00:00:00','2022-08-22 00:00:00',0,NULL),
(7,'胡歌','123456','1','15279364588','4750562602@qq.com','450422200110012584','福永地铁站','2022-06-15 00:00:00','2022-08-22 00:00:00',1,NULL),
(8,'王五','zhaosi','1','15279364583','4750562602@qq.com','450422200110012584','广州白云机场','2022-06-15 00:00:00','2022-08-20 00:00:00',0,NULL),
(9,'太难了','pan123','1','15279364014','4750562602@qq.com','450422200110012584','桥头','2022-06-15 00:00:00','2022-08-22 00:00:00',1,NULL),
(10,'真的','123456','1','15279364582','4750562602@qq.com','450422200110012584','后海地铁站','2022-06-15 00:00:00','2022-08-20 00:00:00',0,NULL),
(11,'错了吧','123456','1','15279364575','4750562602@qq.com','450422200110012584','碧海湾地铁站','2022-07-24 00:00:00','2022-08-20 00:00:00',0,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
