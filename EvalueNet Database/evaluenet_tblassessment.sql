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
-- Table structure for table `tblassessment`
--

DROP TABLE IF EXISTS `tblassessment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblassessment` (
  `assessment_id` int NOT NULL AUTO_INCREMENT,
  `className` varchar(100) DEFAULT NULL,
  `subjectName` varchar(100) DEFAULT NULL,
  `assessmentType` varchar(50) DEFAULT NULL,
  `assessmentNum` varchar(100) DEFAULT NULL,
  `totalItems` varchar(50) DEFAULT NULL,
  `assessmentDate` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`assessment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblassessment`
--

LOCK TABLES `tblassessment` WRITE;
/*!40000 ALTER TABLE `tblassessment` DISABLE KEYS */;
INSERT INTO `tblassessment` VALUES (1,'Diversity','JAVA','Quiz','1','10','1999-January-1'),(2,'Diversity','JAVA','Quiz','2','15','1999-January-1'),(3,'Diversity','JAVA','Quiz','3','20','1999-January-1'),(4,'Diversity','JAVA','Quiz','4','25','1999-January-1'),(5,'giba','aicelle ','Quiz','5','12','1999-January-1'),(6,'Diversity','JAVA','Quiz','5','15','1999-January-1'),(7,'Diversity','JAVA','Peta','1','50','1999-January-1'),(8,'Diversity','JAVA','Summative Exam','1','45','1999-January-1'),(9,'Diversity','JAVA','Quarterly Exam','1','89','1999-January-1'),(10,'Diversity','EmpTech','Quiz','1','10','1999-January-1'),(11,'Diversity','EmpTech','Peta','1','50','1999-January-1'),(12,'Diversity','EmpTech','Summative Exam','1','45','1999-January-1'),(13,'Diversity','EmpTech','Quarterly Exam','1','80','1999-January-1'),(14,'Diversity','JAVA','Quiz','6','20','1999-January-1'),(15,'Diversity','JAVA','Quiz','7','10','1999-January-1'),(16,'Diversity','JAVA','Quiz','8','30','1999-January-1'),(17,'Diversity','JAVA','Quiz','9','20','1999-January-1'),(18,'Diversity','JAVA','Peta','2','50','1999-January-1'),(19,'Diversity','JAVA','Summative Exam','2','35','1999-January-1'),(20,'Diversity','JAVA','Quiz','10','23','1999-January-1'),(21,'Diversity','JAVA','Quiz','10','20','1999-January-1'),(22,'Diversity','JAVA','Summative Exam','3','30','1999-January-1'),(25,'Diversity','JAVA','Quiz','10','20','1999-January-1');
/*!40000 ALTER TABLE `tblassessment` ENABLE KEYS */;
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
