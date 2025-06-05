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
-- Table structure for table `classlist`
--

DROP TABLE IF EXISTS `classlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classlist` (
  `class_ID` int NOT NULL AUTO_INCREMENT,
  `Class_Name` varchar(70) NOT NULL,
  `Class_Size` varchar(70) NOT NULL,
  `Adviser_Name` varchar(70) NOT NULL,
  `STRAND` varchar(50) NOT NULL,
  PRIMARY KEY (`class_ID`),
  UNIQUE KEY `Class_Name` (`Class_Name`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classlist`
--

LOCK TABLES `classlist` WRITE;
/*!40000 ALTER TABLE `classlist` DISABLE KEYS */;
INSERT INTO `classlist` VALUES (1,'Diversity','1','Maria Aurea Reyes Jabon','ICT'),(2,'Civility','1','Arvic John Cabudoc','ICT'),(4,'Ingenuity','1','Alvin Dela Cruz','ICT'),(9,'Hospitality','15','Ms. Jabon','ABM'),(10,'Versatility','30','Ms. Jabon','HE'),(13,'Prosperity','50','Ms. Jabon','ABM'),(18,'Humility','50','Ms. Jabon','ABM'),(21,'Responsibility','23','Ms. Jabon','ICT'),(25,'Legality','43','Ms. Jabon','ICT'),(28,'aicelle ','21','Ms. Jabon','GAS'),(30,'giba','21','Mr. Cabudoc','ICT');
/*!40000 ALTER TABLE `classlist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-26 22:41:59
