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
  PRIMARY KEY (`fg_id`),
  UNIQUE KEY `unique_grade` (`LRN`,`Section`,`Subject`,`assessmentType`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finalgrades`
--

LOCK TABLES `finalgrades` WRITE;
/*!40000 ALTER TABLE `finalgrades` DISABLE KEYS */;
INSERT INTO `finalgrades` VALUES (1,'136780240078','Albert Einstein','Diversity','JAVA',71.76470588235294,14.352941176470587,'Quiz'),(2,'136834130117','rebert frias','Diversity','JAVA',82.35294117647058,16.470588235294116,'Quiz'),(3,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,20,'Quiz'),(4,'136780240078','Albert Einstein','Diversity','JAVA',100,40,'Peta'),(5,'136834130117','rebert frias','Diversity','JAVA',100,40,'Peta'),(6,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,40,'Peta'),(7,'136780240078','Albert Einstein','Diversity','JAVA',51.11111111111111,10.222222222222221,'Summative Exam'),(8,'136834130117','rebert frias','Diversity','JAVA',100,20,'Summative Exam'),(9,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,20,'Summative Exam'),(10,'136780240078','Albert Einstein','Diversity','JAVA',86.51685393258427,17.30337078651685,'Quarterly Exam'),(11,'136834130117','rebert frias','Diversity','JAVA',87.64044943820225,17.52808988764045,'Quarterly Exam'),(12,'136840130092','Lord Zierwin Balajadia','Diversity','JAVA',100,20,'Quarterly Exam'),(58,'136780240078','Albert Einstein','Diversity','EmpTech',90,18,'Quiz'),(59,'136834130117','rebert frias','Diversity','EmpTech',100,20,'Quiz'),(60,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',100,20,'Quiz'),(61,'136780240078','Albert Einstein','Diversity','EmpTech',42,16.8,'Peta'),(62,'136834130117','rebert frias','Diversity','EmpTech',86,34.4,'Peta'),(63,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',80,32,'Peta'),(64,'136780240078','Albert Einstein','Diversity','EmpTech',51.11111111111111,10.222222222222221,'Summative Exam'),(65,'136834130117','rebert frias','Diversity','EmpTech',100,20,'Summative Exam'),(66,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',77.77777777777779,15.555555555555557,'Summative Exam'),(67,'136780240078','Albert Einstein','Diversity','EmpTech',100,20,'Quarterly Exam'),(68,'136834130117','rebert frias','Diversity','EmpTech',97.5,19.5,'Quarterly Exam'),(69,'136840130092','Lord Zierwin Balajadia','Diversity','EmpTech',95,19,'Quarterly Exam');
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

-- Dump completed on 2024-12-26 22:41:58
