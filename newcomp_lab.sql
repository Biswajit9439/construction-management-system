-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: construction_management_system
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin_database`
--

DROP TABLE IF EXISTS `admin_database`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_database` (
  `name` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_database`
--

LOCK TABLES `admin_database` WRITE;
/*!40000 ALTER TABLE `admin_database` DISABLE KEYS */;
INSERT INTO `admin_database` VALUES ('Sukesh panda','34','4534343423','sukesh@gmail.com','12345');
/*!40000 ALTER TABLE `admin_database` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_store`
--

DROP TABLE IF EXISTS `data_store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `data_store` (
  `name` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_store`
--

LOCK TABLES `data_store` WRITE;
/*!40000 ALTER TABLE `data_store` DISABLE KEYS */;
INSERT INTO `data_store` VALUES ('Biswajit Sahoo','21','7894561230','biswajit@gmail.com','12345'),('Sambit Sahoo','45','145263785','sambit@gmail.com','13579'),('abc','34','552241851','biswajitkbrc45@gmail.com','45677r'),('Asutosh Sahoo','28','7896541230','asutosh@gmail.com','98765'),('Swayam Sahoo','56','7412365892','swayam@gmail.com','12345'),('Sukesh panda','45','753951485','sukesh@gmail.com','123345'),('Sukesh panda','45','753951485','sukesh@gmail.com','123345'),('Sukesh panda','45','753951485','sukesh@gmail.com','123345'),('Sukesh panda','45','753951485','sukesh@gmail.com','123345');
/*!40000 ALTER TABLE `data_store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_add_property`
--

DROP TABLE IF EXISTS `user_add_property`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_add_property` (
  `email` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_add_property`
--

LOCK TABLES `user_add_property` WRITE;
/*!40000 ALTER TABLE `user_add_property` DISABLE KEYS */;
INSERT INTO `user_add_property` VALUES ('sambit@gmail.com','babu','angul','12345','dfgvbhnm'),('sambit@gmail.com','babu','angul','12345','dfgvbhnm'),('biswajit@gmail.com','Biswajit','bhubaneswar','140000','\r\nqwsd'),('asutosh@gmail.com','land','bhubaneswar','34500','\r\nhello hiii'),('swayam@gmail.com','Land2','cuttack','32000','\r\nAnything'),('biswajit@gmail.com','qamar','talcher','45600','\r\ngutfhhnnn');
/*!40000 ALTER TABLE `user_add_property` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-22 12:34:40
