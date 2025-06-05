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
-- Table structure for table `ictsubjects`
--

DROP TABLE IF EXISTS `ictsubjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ictsubjects` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `SubjectName` varchar(150) DEFAULT NULL,
  `SecAssigned` varchar(100) NOT NULL,
  `TeacherAssigned` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `unique_subject` (`SubjectName`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ictsubjects`
--

LOCK TABLES `ictsubjects` WRITE;
/*!40000 ALTER TABLE `ictsubjects` DISABLE KEYS */;
INSERT INTO `ictsubjects` VALUES (1,'EmpTech','Diversity','Maria Aurea Reyes Jabon'),(2,'JAVA','Diversity','Maria Aurea Reyes Jabon'),(3,'Practical Research 2','Diversity','Alvin Dela Cruz'),(4,'.NET Programming','Diversity','Maria Aurea Reyes Jabon'),(5,'Website','Civility','Maria Aurea Reyes Jabon'),(6,'21st  Century Literature','Diversity','Alvin Dela Cruz'),(7,'aicelle ','giba','Maria Aurea Reyes Jabon');
/*!40000 ALTER TABLE `ictsubjects` ENABLE KEYS */;
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
