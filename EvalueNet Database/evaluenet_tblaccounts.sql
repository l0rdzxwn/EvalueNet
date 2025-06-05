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
-- Table structure for table `tblaccounts`
--

DROP TABLE IF EXISTS `tblaccounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblaccounts` (
  `UID` int NOT NULL AUTO_INCREMENT,
  `FullName` varchar(300) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `logAttempt` int NOT NULL DEFAULT '4',
  `SEC_QUES` varchar(50) DEFAULT 'none',
  `ANS_SQ` varchar(80) DEFAULT NULL,
  `SQ_Attempts` int DEFAULT '3',
  `userType` varchar(50) NOT NULL,
  PRIMARY KEY (`UID`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblaccounts`
--

LOCK TABLES `tblaccounts` WRITE;
/*!40000 ALTER TABLE `tblaccounts` DISABLE KEYS */;
INSERT INTO `tblaccounts` VALUES (1,'Maria Aurea Reyes Jabon','TCH_MJABON','mjabon001',4,'What\'s the name of your first pet?','Cat',1,'Teacher'),(2,'Alvin Dela Cruz','TCH_ADELACRUZ','adelacruz002',3,'none',NULL,3,'Teacher'),(3,'Rebert Frias','STUD_RFRIAS','rfrias003',4,'none',NULL,3,''),(4,'Dario Serrano','ADMIN_DSERRANO','dserrano004',3,'What is your favorite food?','Burger',3,'Admin'),(5,'James Serrano','HR_JSERRANO','jserrano005',4,'none',NULL,3,'HR'),(6,'ROMMEL\nBARAS','IT_RBARAS','Rb@ras006',4,'none',NULL,3,'IT');
/*!40000 ALTER TABLE `tblaccounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-04 10:47:34
