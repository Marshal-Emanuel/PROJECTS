-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: student_management_system
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
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'ultimate','123');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `Name` varchar(45) NOT NULL,
  `YearPublished` varchar(45) NOT NULL,
  `Author` varchar(45) NOT NULL,
  `ISSN` int NOT NULL,
  PRIMARY KEY (`ISSN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES ('Operating systems','2023','Cuka Lecturer',1001),('OS','1978','Webley',1234);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam` (
  `ProgramName` varchar(45) NOT NULL,
  `ProgramId` varchar(45) NOT NULL,
  `Unit1Name` varchar(45) NOT NULL,
  `Unit1Id` varchar(45) NOT NULL,
  `Cat1` int NOT NULL,
  `Exam1` int NOT NULL,
  `Unit2Name` varchar(45) NOT NULL,
  `Unit2Id` varchar(45) NOT NULL,
  `Cat2` int NOT NULL,
  `Exam2` int NOT NULL,
  `Unit3Name` varchar(45) NOT NULL,
  `Unit3Id` varchar(45) NOT NULL,
  `Cat3` int NOT NULL,
  `Exam3` int NOT NULL,
  `Unit4Name` varchar(45) NOT NULL,
  `Unit4Id` varchar(45) NOT NULL,
  `Cat4` int NOT NULL,
  `Exam4` int NOT NULL,
  `Unit5Name` varchar(45) NOT NULL,
  `Unit5Id` varchar(45) NOT NULL,
  `Cat5` int NOT NULL,
  `Exam5` int NOT NULL,
  `StudentName` varchar(45) NOT NULL,
  `StudentRegNo` varchar(45) NOT NULL,
  PRIMARY KEY (`ProgramId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES ('101','Applied Computer Science','Introdution to Operaring systems','ACSC101',70,30,'IT','ACSC102',60,30,'AI','ACSC103',50,30,'Optic Systems','ACSC104',40,30,'Big Data','ACSC105',30,30,'Emanuel','100'),('ACSC','Applied CS','OS','ACSC101',70,30,'AI','ASC102',60,30,'Big Data','ACSC103',50,30,'Sysytems','ACSC104',40,30,'Physics','ACSC105',30,30,'Emanuel','101');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lecturer`
--

DROP TABLE IF EXISTS `lecturer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturer` (
  `StaffId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Sex` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `ProgramName` varchar(45) NOT NULL,
  `ProgramId` varchar(45) NOT NULL,
  `Unit1Name` varchar(45) NOT NULL,
  `Unit1Id` varchar(45) NOT NULL,
  `Unit2Name` varchar(45) NOT NULL,
  `Unit2Id` varchar(45) NOT NULL,
  `Unit3Name` varchar(45) NOT NULL,
  `Unit3Id` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`StaffId`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturer`
--

LOCK TABLES `lecturer` WRITE;
/*!40000 ALTER TABLE `lecturer` DISABLE KEYS */;
INSERT INTO `lecturer` VALUES (1,'Muthengi','Male','Christian','Computer Science','CS','Introduction to Cs','CS100','Operating System','CS101','Data Structures','CS103','123'),(100,'Gogo','Male','Christian','Aplied Computer Science','ACSC','CNAKBDV','JKSBV','JKBJB','KJJNK','JKJBK','JKBKJB','100'),(101,'lecturer','female','muslim','bbit','12','s bvk','12','wbjv','12','ive','12','lecturer');
/*!40000 ALTER TABLE `lecturer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `librarian` (
  `StaffId` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Sex` varchar(45) NOT NULL,
  `Religion` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`StaffId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES (1,'Librarian','Male','Muslim','123');
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `program`
--

DROP TABLE IF EXISTS `program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `program` (
  `ProgramName` varchar(45) NOT NULL,
  `ProgramId` varchar(45) NOT NULL,
  `Unit1Name` varchar(45) NOT NULL,
  `Unit1Id` varchar(45) NOT NULL,
  `Unit2Name` varchar(45) NOT NULL,
  `Unit2Id` varchar(45) NOT NULL,
  `Unit3Name` varchar(45) NOT NULL,
  `Unit3Id` varchar(45) NOT NULL,
  `Unit4Name` varchar(45) NOT NULL,
  `Unit4Id` varchar(45) NOT NULL,
  `Unit5Name` varchar(45) NOT NULL,
  `Unit5Id` varchar(45) NOT NULL,
  PRIMARY KEY (`ProgramId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `program`
--

LOCK TABLES `program` WRITE;
/*!40000 ALTER TABLE `program` DISABLE KEYS */;
INSERT INTO `program` VALUES ('Applied Computer Science','3','Introduction to Computers','ACSC 101','Basics of Programming','ACSC 102','Data Structures','ACSC 105','Operating Systems','ACSC 104','IT','ACSC 105');
/*!40000 ALTER TABLE `program` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `regno` int NOT NULL,
  `tfName` varchar(45) NOT NULL,
  `parentname` varchar(45) NOT NULL,
  `parentcontact` varchar(45) NOT NULL,
  `DOB` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `countryOfOrigin` varchar(45) NOT NULL,
  `hometown` varchar(45) NOT NULL,
  `religion` varchar(45) NOT NULL,
  `programName` varchar(45) DEFAULT NULL,
  `programId` varchar(45) DEFAULT NULL,
  `Unit1Name` varchar(45) DEFAULT NULL,
  `Unit1Id` varchar(45) DEFAULT NULL,
  `Unit2Name` varchar(45) DEFAULT NULL,
  `Unit2Id` varchar(45) DEFAULT NULL,
  `Unit3Name` varchar(45) DEFAULT NULL,
  `Unit3Id` varchar(45) DEFAULT NULL,
  `Unit4Name` varchar(45) DEFAULT NULL,
  `Unit4Id` varchar(45) DEFAULT NULL,
  `Unit5Name` varchar(45) DEFAULT NULL,
  `Unit5Id` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`regno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (101,'emanuel','parent','01111111','12/12/1212','male','Kenya','Machakos','Christian','Applied Computer Scsience',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'123'),(1101,'vincent','Parent','011111','101010','Male','Kenya','Nairobi','cHRISTIAN','cOMPUTER sCEINCE','acsc',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'1234');
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

-- Dump completed on 2023-03-15  1:28:26
