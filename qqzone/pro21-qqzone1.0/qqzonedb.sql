/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 5.7.37-log : Database - qqzonedb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`qqzonedb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `qqzonedb`;

/*Table structure for table `t_friend` */

DROP TABLE IF EXISTS `t_friend`;

CREATE TABLE `t_friend` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_friend_basic_uid` (`uid`),
  KEY `FK_friend_basic_fid` (`fid`),
  CONSTRAINT `FK_friend_basic_fid` FOREIGN KEY (`fid`) REFERENCES `t_user_basic` (`id`),
  CONSTRAINT `FK_friend_basic_uid` FOREIGN KEY (`uid`) REFERENCES `t_user_basic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `t_friend` */

insert  into `t_friend`(`id`,`uid`,`fid`) values 
(1,1,2),
(2,1,3),
(3,1,4),
(4,1,5),
(5,2,3),
(6,2,1),
(7,2,4),
(8,3,1),
(9,3,2),
(10,5,1);

/*Table structure for table `t_host_reply` */

DROP TABLE IF EXISTS `t_host_reply`;

CREATE TABLE `t_host_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) NOT NULL,
  `hostReplyDate` datetime NOT NULL,
  `author` int(11) NOT NULL,
  `reply` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_host_basic` (`author`),
  KEY `FK_host_reply` (`reply`),
  CONSTRAINT `FK_host_basic` FOREIGN KEY (`author`) REFERENCES `t_user_basic` (`id`),
  CONSTRAINT `FK_host_reply` FOREIGN KEY (`reply`) REFERENCES `t_reply` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_host_reply` */

/*Table structure for table `t_reply` */

DROP TABLE IF EXISTS `t_reply`;

CREATE TABLE `t_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) NOT NULL,
  `replyDate` datetime NOT NULL,
  `author` int(11) NOT NULL,
  `topic` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_reply_basic` (`author`),
  KEY `FK_reply_topic` (`topic`),
  CONSTRAINT `FK_reply_basic` FOREIGN KEY (`author`) REFERENCES `t_user_basic` (`id`),
  CONSTRAINT `FK_reply_topic` FOREIGN KEY (`topic`) REFERENCES `t_topic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_reply` */

insert  into `t_reply`(`id`,`content`,`replyDate`,`author`,`topic`) values 
(3,'回复','2021-07-14 16:16:54',2,8),
(4,'回复2222','2021-07-14 16:17:11',3,8),
(5,'这里是第三个回复','2021-07-14 16:30:49',1,8);

/*Table structure for table `t_topic` */

DROP TABLE IF EXISTS `t_topic`;

CREATE TABLE `t_topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(500) NOT NULL,
  `topicDate` datetime NOT NULL,
  `author` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_topic_basic` (`author`),
  CONSTRAINT `FK_topic_basic` FOREIGN KEY (`author`) REFERENCES `t_user_basic` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `t_topic` */

insert  into `t_topic`(`id`,`title`,`content`,`topicDate`,`author`) values 
(3,'我的空间开通了，先做自我介绍！','大家好，我是铁锤妹妹！','2021-06-18 11:25:30',1),
(8,'大家好，欢迎来到我的空间！','java好难。','2022-05-22 20:36:40',1),
(9,'吃了早饭','吃了个馅饼','2022-05-22 20:36:40',1),
(10,'这是tom的空间','吃了个麻辣烫，真香','2022-05-23 08:49:22',2);

/*Table structure for table `t_user_basic` */

DROP TABLE IF EXISTS `t_user_basic`;

CREATE TABLE `t_user_basic` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `loginId` varchar(20) NOT NULL,
  `nickName` varchar(50) NOT NULL,
  `pwd` varchar(20) NOT NULL,
  `headImg` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginId` (`loginId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_user_basic` */

insert  into `t_user_basic`(`id`,`loginId`,`nickName`,`pwd`,`headImg`) values 
(1,'u001','乔峰','ok','qf.png'),
(2,'u002','tom','ok','mrf.png'),
(3,'u003','kate','ok','dy.png'),
(4,'u004','lucy','ok','wyy.png'),
(5,'u005','张三丰','ok','zl.png');

/*Table structure for table `t_user_detail` */

DROP TABLE IF EXISTS `t_user_detail`;

CREATE TABLE `t_user_detail` (
  `id` int(11) NOT NULL,
  `realName` varchar(20) DEFAULT NULL,
  `tel` varchar(11) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `star` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_detail_basic` FOREIGN KEY (`id`) REFERENCES `t_user_basic` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_user_detail` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
