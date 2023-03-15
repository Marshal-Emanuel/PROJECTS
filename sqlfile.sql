-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: stmgmtsys
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `AdminId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`AdminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `BookId` int NOT NULL AUTO_INCREMENT,
  `BookName` varchar(50) DEFAULT NULL,
  `YearPublished` int DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `ISSN` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BookId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturer` (
  `LecturerId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `ProgramName` varchar(50) DEFAULT NULL,
  `ProgramId` int DEFAULT NULL,
  `Unit1Name` varchar(50) DEFAULT NULL,
  `Unit1Id` int DEFAULT NULL,
  `Unit2Name` varchar(50) DEFAULT NULL,
  `Unit2Id` int DEFAULT NULL,
  `Unit3Name` varchar(50) DEFAULT NULL,
  `Unit3Id` int DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LecturerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturer`
--

LOCK TABLES `lecturer` WRITE;
/*!40000 ALTER TABLE `lecturer` DISABLE KEYS */;
/*!40000 ALTER TABLE `lecturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `librarian` (
  `LibrarianId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LibrarianId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `RegNo` int NOT NULL,
  `ProgramName` varchar(50) DEFAULT NULL,
  `ProgramId` int NOT NULL,
  `Unit1Name` varchar(50) DEFAULT NULL,
  `Unit1Id` int NOT NULL,
  `Unit2Name` varchar(50) DEFAULT NULL,
  `Unit2Id` int NOT NULL,
  `Unit3Name` varchar(50) DEFAULT NULL,
  `Unit3Id` int NOT NULL,
  `Unit4Name` varchar(50) DEFAULT NULL,
  `Unit4Id` int NOT NULL,
  `Unit5Name` varchar(50) DEFAULT NULL,
  `Unit5Id` int NOT NULL,
  `Cat1` float DEFAULT NULL,
  `Cat2` float DEFAULT NULL,
  `Cat3` float DEFAULT NULL,
  `Cat4` float DEFAULT NULL,
  `Cat5` float DEFAULT NULL,
  `Exam1` float DEFAULT NULL,
  `Exam2` float DEFAULT NULL,
  `Exam3` float DEFAULT NULL,
  `Exam4` float DEFAULT NULL,
  `Exam5` float DEFAULT NULL,
  PRIMARY KEY (`RegNo`,`ProgramId`,`Unit1Id`,`Unit2Id`,`Unit3Id`,`Unit4Id`,`Unit5Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `program`
--

DROP TABLE IF EXISTS `program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `program` (
  `ProgramId` int NOT NULL AUTO_INCREMENT,
  `ProgramName` varchar(50) DEFAULT NULL,
  `Unit1Name` varchar(50) DEFAULT NULL,
  `Unit1Id` varchar(50) DEFAULT NULL,
  `Unit2Name` varchar(50) DEFAULT NULL,
  `Unit2Id` varchar(50) DEFAULT NULL,
  `Unit3Name` varchar(50) DEFAULT NULL,
  `Unit3Id` varchar(50) DEFAULT NULL,
  `Unit4Name` varchar(50) DEFAULT NULL,
  `Unit4Id` varchar(50) DEFAULT NULL,
  `Unit5Name` varchar(50) DEFAULT NULL,
  `Unit5Id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ProgramId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `program`
--

LOCK TABLES `program` WRITE;
/*!40000 ALTER TABLE `program` DISABLE KEYS */;
/*!40000 ALTER TABLE `program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `RegNo` int NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `ParentName` varchar(50) DEFAULT NULL,
  `ParentContact` varchar(50) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` enum('Male','Female') DEFAULT NULL,
  `Religion` varchar(50) DEFAULT NULL,
  `Hometown` varchar(50) DEFAULT NULL,
  `ProgramName` varchar(50) DEFAULT NULL,
  `ProgramId` int DEFAULT NULL,
  `Unit1Name` varchar(50) DEFAULT NULL,
  `Unit1Id` int DEFAULT NULL,
  `Unit2Name` varchar(50) DEFAULT NULL,
  `Unit2Id` int DEFAULT NULL,
  `Unit3Name` varchar(50) DEFAULT NULL,
  `Unit3Id` int DEFAULT NULL,
  `Unit4Name` varchar(50) DEFAULT NULL,
  `Unit4Id` int DEFAULT NULL,
  `Unit5Name` varchar(50) DEFAULT NULL,
  `Unit5Id` int DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`RegNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-15 22:11:04
