-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: evaluenet
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `tblscores`
--

DROP TABLE IF EXISTS `tblscores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblscores` (
  `score_id` int NOT NULL AUTO_INCREMENT,
  `assessmentID` int NOT NULL,
  `studLRN` varchar(20) NOT NULL,
  `score` int DEFAULT NULL,
  `studNAME` varchar(300) NOT NULL,
  PRIMARY KEY (`assessmentID`,`studLRN`),
  UNIQUE KEY `score_id` (`score_id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblscores`
--

LOCK TABLES `tblscores` WRITE;
/*!40000 ALTER TABLE `tblscores` DISABLE KEYS */;
INSERT INTO `tblscores` VALUES (3,1,'136780240078',9,'Albert Einstein'),(2,1,'136834130117',8,'rebert frias'),(1,1,'136840130092',10,'Lord Zierwin Balajadia'),(5,2,'136780240078',15,'Albert Einstein'),(4,2,'136834130117',15,'rebert frias'),(6,2,'136840130092',15,'Lord Zierwin Balajadia'),(11,3,'136780240078',13,'Albert Einstein'),(10,3,'136834130117',15,'rebert frias'),(9,3,'136840130092',20,'Lord Zierwin Balajadia'),(14,4,'136780240078',14,'Albert Einstein'),(13,4,'136834130117',20,'rebert frias'),(12,4,'136840130092',25,'Lord Zierwin Balajadia'),(17,6,'136780240078',10,'Albert Einstein'),(16,6,'136834130117',12,'rebert frias'),(15,6,'136840130092',15,'Lord Zierwin Balajadia'),(19,7,'136780240078',50,'Albert Einstein'),(18,7,'136834130117',50,'rebert frias'),(22,7,'136840130092',50,'Lord Zierwin Balajadia'),(27,8,'136780240078',23,'Albert Einstein'),(26,8,'136834130117',45,'rebert frias'),(25,8,'136840130092',45,'Lord Zierwin Balajadia'),(30,9,'136780240078',77,'Albert Einstein'),(29,9,'136834130117',78,'rebert frias'),(28,9,'136840130092',89,'Lord Zierwin Balajadia'),(33,10,'136780240078',9,'Albert Einstein'),(32,10,'136834130117',10,'rebert frias'),(31,10,'136840130092',10,'Lord Zierwin Balajadia'),(36,11,'136780240078',21,'Albert Einstein'),(35,11,'136834130117',43,'rebert frias'),(34,11,'136840130092',40,'Lord Zierwin Balajadia'),(39,12,'136780240078',23,'Albert Einstein'),(38,12,'136834130117',45,'rebert frias'),(37,12,'136840130092',35,'Lord Zierwin Balajadia'),(42,13,'136780240078',80,'Albert Einstein'),(41,13,'136834130117',78,'rebert frias'),(40,13,'136840130092',76,'Lord Zierwin Balajadia'),(43,17,'136780240078',20,'Albert Einstein'),(45,17,'136834130117',20,'rebert frias'),(44,17,'136840130092',20,'Lord Zierwin Balajadia'),(50,18,'136780240078',38,'Albert Einstein'),(49,18,'136834130117',46,'rebert frias'),(47,18,'136840130092',50,'Lord Zierwin Balajadia'),(57,19,'136780240078',15,'Albert Einstein'),(54,19,'136834130117',10,'rebert frias'),(55,19,'136840130092',15,'Lord Zierwin Balajadia'),(62,25,'136780240078',16,'Albert Einstein'),(61,25,'136840130092',20,'Lord Zierwin Balajadia');
/*!40000 ALTER TABLE `tblscores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-04 10:47:33
