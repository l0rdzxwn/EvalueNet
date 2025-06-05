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
-- Table structure for table `finalgrades`
--

DROP TABLE IF EXISTS `finalgrades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `finalgrades` (
  `fg_id` int NOT NULL AUTO_INCREMENT,
  `LRN` varchar(50) DEFAULT NULL,
  `Name` varchar(300) DEFAULT NULL,
  `Section` varchar(50) DEFAULT NULL,
  `Subject` varchar(100) DEFAULT NULL,
  `rating` double NOT NULL,
  `percentage` double NOT NULL,
  `assessmentType` varchar(30) NOT NULL,
  `currentDate` date DEFAULT NULL,
  PRIMARY KEY (`fg_id`),
  UNIQUE KEY `unique_grade` (`LRN`,`Section`,`Subject`,`assessmentType`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finalgrades`
--

LOCK TABLES `finalgrades` WRITE;
/*!40000 ALTER TABLE `finalgrades` DISABLE KEYS */;
INSERT INTO `finalgrades` VALUES (1,'136780240078','Albert Einstein','Diversity','JAVA',38.94230769230769,7.788461538461538,'Quiz',NULL),(2,'136834130117','rebert frias','Diversity','JAVA',43.269230769230774,8.653846153846155,'Quiz',NULL),(3,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',50.480769230769226,10.096153846153845,'Quiz',NULL),(4,'136780240078','Albert Einstein','Diversity','JAVA',88,35.2,'Peta',NULL),(5,'136834130117','rebert frias','Diversity','JAVA',96,38.4,'Peta',NULL),(6,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,40,'Peta',NULL),(7,'136780240078','Albert Einstein','Diversity','JAVA',51.11111111111111,10.222222222222221,'Summative Exam',NULL),(8,'136834130117','rebert frias','Diversity','JAVA',100,20,'Summative Exam',NULL),(9,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,20,'Summative Exam',NULL),(10,'136780240078','Albert Einstein','Diversity','JAVA',86.51685393258427,17.30337078651685,'Quarterly Exam',NULL),(11,'136834130117','rebert frias','Diversity','JAVA',87.64044943820225,17.52808988764045,'Quarterly Exam',NULL),(12,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,20,'Quarterly Exam',NULL),(58,'136780240078','Albert Einstein','Diversity','EmpTech',90,18,'Quiz',NULL),(59,'136834130117','rebert frias','Diversity','EmpTech',100,20,'Quiz',NULL),(60,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',100,20,'Quiz',NULL),(61,'136780240078','Albert Einstein','Diversity','EmpTech',42,16.8,'Peta',NULL),(62,'136834130117','rebert frias','Diversity','EmpTech',86,34.4,'Peta',NULL),(63,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',80,32,'Peta',NULL),(64,'136780240078','Albert Einstein','Diversity','EmpTech',51.11111111111111,10.222222222222221,'Summative Exam',NULL),(65,'136834130117','rebert frias','Diversity','EmpTech',100,20,'Summative Exam',NULL),(66,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',77.77777777777779,15.555555555555557,'Summative Exam',NULL),(67,'136780240078','Albert Einstein','Diversity','EmpTech',100,20,'Quarterly Exam',NULL),(68,'136834130117','rebert frias','Diversity','EmpTech',97.5,19.5,'Quarterly Exam',NULL),(69,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',95,19,'Quarterly Exam',NULL);
/*!40000 ALTER TABLE `finalgrades` ENABLE KEYS */;
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
