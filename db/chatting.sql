CREATE DATABASE  IF NOT EXISTS `chatting` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `chatting`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: chatting
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `role_dtl`
--

DROP TABLE IF EXISTS `role_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_dtl` (
  `role_dtl_id` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`role_dtl_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_dtl`
--

LOCK TABLES `role_dtl` WRITE;
/*!40000 ALTER TABLE `role_dtl` DISABLE KEYS */;
INSERT INTO `role_dtl` VALUES (1,1,1),(2,2,1),(3,3,1),(4,2,0),(5,2,14),(6,2,15),(7,3,15),(8,2,28),(9,3,28),(10,2,29),(11,2,29),(12,2,30),(13,3,30),(14,2,31),(15,3,31),(16,3,36),(17,3,37),(18,3,38),(19,3,39),(20,3,40);
/*!40000 ALTER TABLE `role_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_mst`
--

DROP TABLE IF EXISTS `role_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role_mst` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_mst`
--

LOCK TABLES `role_mst` WRITE;
/*!40000 ALTER TABLE `role_mst` DISABLE KEYS */;
INSERT INTO `role_mst` VALUES (1,'ROLE_ADMIN'),(2,'ROLE_MANAGER'),(3,'ROLE_USER'),(4,'ROLE_TESTER');
/*!40000 ALTER TABLE `role_mst` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_dtl`
--

DROP TABLE IF EXISTS `user_dtl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_dtl` (
  `user_id` int NOT NULL,
  `gender` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `adress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_dtl`
--

LOCK TABLES `user_dtl` WRITE;
/*!40000 ALTER TABLE `user_dtl` DISABLE KEYS */;
INSERT INTO `user_dtl` VALUES (41,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user_dtl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_mst`
--

DROP TABLE IF EXISTS `user_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_mst` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_mst`
--

LOCK TABLES `user_mst` WRITE;
/*!40000 ALTER TABLE `user_mst` DISABLE KEYS */;
INSERT INTO `user_mst` VALUES (1,'aaa','1234','김준일','aaa@gmail.com'),(3,'aaab','1234','김준일','aaab@gmail.com'),(5,'bbb','1234','bbb','bbb@gmail.com'),(7,'ccc','1234','ccc','ccc@gmail.com'),(10,'ddd','1234','ddd','ddd@gmail.com'),(12,'eee','1234','eee','eee@gmail.com'),(14,'uu','1234','uu','uu@gmail.com'),(15,'zz','1234','zz','zz@gmail.com'),(16,'ii','1234','ii','ii@gmail.com'),(17,'kk','1234','kk','kk@gmail.com'),(18,'qq','1234','qq','qq@gmail.com'),(19,'hh','1234','hh','hh@gmail.com'),(20,'tt','1234','tt','tt@gmail.com'),(21,'a','1234','a','a@gmail.com'),(22,'b','1234','b','b@gmail.com'),(23,'c','1234','c','c@gmail.com'),(24,'d','1234','d','d@gmail.com'),(25,'w','1234','w','w@gmail.com'),(26,'r','1234','r','r@gmail.com'),(27,'rr','1234','rr','rr@gmail.com'),(28,'rrr','1234','rrr','rrr@gmail.com'),(29,'rrrr','1234','rrrr','rrrr@gmail.com'),(30,'rrrrr','1234','rrrrr','rrrrr@gmail.com'),(31,'q','1234','q','q@gmail.com'),(32,'aaabb','$2a$10$QKPbgR573GCBFP4h/H4sOuDATSO9CXnEF0Zq1f1C0k03mqIeT9g1m','aaa','aaa'),(33,'aaaa','$2a$10$yodLox2/o0llR1a7cC4VwelCvQrBH1xRlJmnrUg776BTGPD8g.U0W','aaaa','aaaa'),(34,'aaaaa','$2a$10$FG1.AQmnOUXOmtVq7JtameMKK0qrORFykO4Stt.854pxQUYD74sCC','aaaaa','aaaaa'),(35,'qqq','$2a$10$dsKAtnpIRaLgzxuXJWOJgencTNevGAqFxm6d/RW8SaTJgi.wCDnRa','qqq','qqq'),(36,'sss','$2a$10$ZOg55qtomNfWrCkYIz81fepvius71jYKQT.cNEEvdnzquhJfe.74C','sss','sss'),(37,'vvvv','$2a$10$cAjw4Ls/rPlgCsd2VwY2uOYLkjZ2dYYw9wvoT4zosHFOqM9Ayf6Se','vvv','vvv'),(38,'xxx','$2a$10$jxVUgCGWzW1fdTvWbErQKOjg/sRdX90tB5VB5NoX46TUMlKe6iBGO','xxx','xxx'),(39,'hhhh','$2a$10$CzVJrDBpgCktWfJe8DTNK.9zlXtEApO3Jk3SLS6ktawFbz9A5JNvC','hhh','hhhhhh'),(40,'gggggg','$2a$10$WK9ZIhPyDLJwf3/7Js/gxuOTb8k8wRX/0tbHski3GS9Mb6gsaj4Ta','gggggg','gggggg');
/*!40000 ALTER TABLE `user_mst` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `user_mst_AFTER_INSERT` AFTER INSERT ON `user_mst` FOR EACH ROW BEGIN
	insert into user_dtl(user_id)
	values (new.user_id);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `user_mst_BEFORE_DELETE` BEFORE DELETE ON `user_mst` FOR EACH ROW BEGIN
	delete
    from
		role_dtl
	where
		user_id = old.user_id;
        
	delete
    from
		user_dtl
	where
		user_id = old.user_id;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Dumping events for database 'chatting'
--

--
-- Dumping routines for database 'chatting'
--
/*!50003 DROP PROCEDURE IF EXISTS `show_all_user_mst` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `show_all_user_mst`(_MSG varchar(30))
BEGIN
	select
		_MSG as MESSAGE,
		user_id,
        username,
        password,
        name,
        email
	from
		user_mst;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-01 14:06:50
