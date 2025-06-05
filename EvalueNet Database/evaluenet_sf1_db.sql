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
-- Table structure for table `sf1_db`
--

DROP TABLE IF EXISTS `sf1_db`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sf1_db` (
  `LRN` varchar(12) DEFAULT NULL,
  `NAME` varchar(1000) NOT NULL,
  `SEX` varchar(20) DEFAULT NULL,
  `BIRTHDAY` varchar(50) DEFAULT NULL,
  `AGE` varchar(3) DEFAULT NULL,
  `MOTHER_TONGUE` varchar(100) NOT NULL,
  `ETHNIC_GROUP` varchar(250) NOT NULL,
  `RELIGION` varchar(500) NOT NULL,
  `ADDRESS` varchar(5000) NOT NULL,
  `FATHER_NAME` varchar(1000) NOT NULL,
  `MOTHER_NAME` varchar(1000) NOT NULL,
  `CONTACT_NUMBER` varchar(15) DEFAULT NULL,
  `LEARNING_MODALITY` varchar(100) NOT NULL,
  `STRAND` varchar(100) NOT NULL,
  `Section_Assigned` varchar(50) DEFAULT NULL,
  UNIQUE KEY `LRN` (`LRN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sf1_db`
--

LOCK TABLES `sf1_db` WRITE;
/*!40000 ALTER TABLE `sf1_db` DISABLE KEYS */;
INSERT INTO `sf1_db` VALUES ('136840130092','Lord Zierwin Balajadia','Male','10-17-2006','17','Tagalog','Filipino','Aglipayan','Malabon','Lordwin','Luziel','09938197411','Face to Face','ICT','Diversity'),('136834130117','rebert frias','Male','10-29-2007','16','Tagalog','Filipino','roman catholic','#123 dampalit malabon city','ricky frias','vernadeth frias','09632293668','blended learning','ICT','Diversity'),('136829120047','aicelle giba','Female','11-21-2007','17','filipino','tagalog','INC','#1234 malabon city','ceasar','lesly ','096724','face to face','HE','Versatility'),('136840134092','Lord Zierwin Balajadia','Male','1-1-2000','17','adsadsadas','dsadsaddas','adsdasdsad','dsadsa','dsadsad','dadsad','123123123123','fafa','GAS','Ingenuity'),('407215150261','LordDADSA','Male','1-1-2000','19','SDDSADSADSADSAD','DASDSA','ADASD','FSDAFSADFFASFDSAF','FDSAFADSF','FASFSASD','099381974111','FSDFDS','HE',NULL),('123456789123','kitkit','Male','5-11-2006','18','Filipino','Filipino','Catholic','Bulacan','Alvin','Joan','09687947517','Online','HE',NULL),('123456789112','IWDIWDJAD','Male','4-8-2007','1','OJHIGDHGJHDJEHWH','EOHOUEHFOUOHWOFHEOU','EPKJFOWEHFOIEHEF','LKLEHJEHDJ','LJEIEHBEHJBEIH','WEWGDHEWDKJKHWJK','12345678912','FTF','ABM',NULL),('211987654321','ggdgufusgdugsgha','Male','12-12-2007','16','gfdggfjhjddjhsh','ehfhfhhfhefjhbsdjhj','hhjefhbjhbsebjhbf','jefbkbfkhbskhbb','hbfifssfkhkjkjewkkjw','fijehhefhhjjfhjkshk','11987654321','ftf','HE',NULL),('123456789121','aicelle','Female','11-21-2007','16','Filipino','Tagalog','Roman Catholic','#143, 6423, Malabon city','ore','med','12345678911','Face To Face','ICT','Civility'),('987654334567','143 6423','Male','1-1-2007','16','Filipino','Tagalog','Roman Catholic','143 6423','ore','med','09876543212','Face To Face','ICT',NULL),('091123456789','hdedhuwc','Male','1-1-2000','1','filipino','shdhsbjkshhsha','roman catholic','hsvxhddchdhjbcj','aicelle','giba','12345678901','gdugduguiw','ICT',NULL),('136780240078','Albert Einstein','Male','5-8-2006','8','Tagalog','Filipino','Christian','Malabon City','Mt. Einstein','Mrs. Einstein','09555897221','Face-to-Face','ICT','Diversity');
/*!40000 ALTER TABLE `sf1_db` ENABLE KEYS */;
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
