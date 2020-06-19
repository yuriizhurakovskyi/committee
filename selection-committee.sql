-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: selection_committee
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Dumping data for table `application_info`
--

LOCK TABLES `application_info` WRITE;
/*!40000 ALTER TABLE `application_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `application_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `application_info_subjects`
--

LOCK TABLES `application_info_subjects` WRITE;
/*!40000 ALTER TABLE `application_info_subjects` DISABLE KEYS */;
/*!40000 ALTER TABLE `application_info_subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `certificate`
--

LOCK TABLES `certificate` WRITE;
/*!40000 ALTER TABLE `certificate` DISABLE KEYS */;
/*!40000 ALTER TABLE `certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `direction`
--

LOCK TABLES `direction` WRITE;
/*!40000 ALTER TABLE `direction` DISABLE KEYS */;
/*!40000 ALTER TABLE `direction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `faculty`
--

LOCK TABLES `faculty` WRITE;
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` VALUES (1,NULL,NULL),(2,'IKTA',200),(3,'IKNI',150),(4,'IGDH',100),(5,'BGND',100),(6,'YHDG',100),(7,'HGFD',100),(8,'YTDV',200),(9,'THYY',100),(10,'HNFM',70),(11,'4',40),(12,'MGFD',123),(13,'name',200),(14,'name',200),(15,'1',112),(16,'IGRC',200),(17,'FTGH',200),(18,'YGFV',200),(19,'TDNMA',200),(20,'WERT',200),(21,'TFDN',200);
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `statement`
--

LOCK TABLES `statement` WRITE;
/*!40000 ALTER TABLE `statement` DISABLE KEYS */;
/*!40000 ALTER TABLE `statement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$hDUp/0PpWEB1EfXnTVLMm.AgGcADvo2xWD4Fa44AtdXoyUzFMMu1O','ROLE_USER','yuriizhurakovskyi7@gmail.com','user'),(2,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$5EG7jUj1EL59uVnL9hk42em4ikXKx8cn4F/3oUaUYlriefitejgRW','ROLE_USER','test','user'),(3,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$smV6TagUHHXCVX1XQZEVCu2P2KR9blbZnziL4rDWeKQOpW4NQ3Pti','ROLE_USER','test','user'),(4,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$2Zb2CTjPCoRBq2UYOuBde.SNtt7OKhZyVw03RfRpFrUWvP7gMJ1Vi','ROLE_USER','yuriizhurakovskyi7@gmail.com','user'),(5,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$ynxgwvL9ypVYf1qfromFrOfh2eKSrUN5ukHb3uBeAlRYchMxyQaby','ROLE_USER','123','user'),(6,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$6c2IwL4gVUcDm/gXY0rZlOq1wLLIryxrteqHNncELiQXc6up2TifS','ROLE_USER','1','user'),(7,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$6BO8lucSU4B/P6/e4ABSVe4/2ITmCWGZCAasC4oLvhjIZMdNS/J.O','ROLE_USER','yuriizhurakovskyi7@gmail.com','user'),(8,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$K.H/joDkcX4Cc6PzYrYgsuCBSm2YJ1W1uwDBFnO3cMZN6/Hlb6JOu','ROLE_USER','yuriizhurakovskyi78@gmail.com','user'),(9,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$z6Kr8IJnmOR1ICRwUpsbMeVDoaNUqxBaSGASmkmP4ZoBZykC2iZHK','ROLE_USER','test','user'),(10,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$n11ixwrFWF/Tko0aBV5z6u.a2WnBq9jWcKEcs7uJaIqXD6SXuUABS','ROLE_USER','test1','user'),(11,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$7pmFnoRnxFc9F3Ovslm1qOxPNMFqxuFGaGyxw4Bt6ytBAUBWwMjDu','ROLE_USER','678','user'),(12,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$Ui.iFOQX2qhFNgokHscn5epRmIxCmQELbT8tjVgijYM8Tphs.xvc6','ROLE_USER','5678','user'),(13,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$madb/PBZCmNtNmVeZPb/peSAmSW9r6eHBza5r9zLDjBlMEMSb4G7e','ROLE_USER','4444','user'),(14,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$IIvkCtHO.pRUZum05NtjcurG2vrED8ZNoTjXTgwZv5S9q8r2q3P/q','ROLE_USER','baby','user'),(15,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$jRI4jgdJTCWt5k.xM23YzeahDfYfQCjxLqrOzpG2LAPtZon6W8nVy','ROLE_USER','vvvv','user'),(16,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$Jxy/gM0NyNl32zAMU0E6XOvgywEjJZLYnaa5cx268AQBS84n1rOPq','ROLE_USER','za','user'),(17,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$Zng2SxA52KaJYXwsSSorwuF2RDqWfPIggtXUkkaB8JSRBvni1BXOu','ROLE_USER','vf','user'),(18,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$BUaYNogLcyaWnkIGFG1AfutCtNKMvQnfoPKeo2TJsuDsnMcbUfuFO','ROLE_USER','re','user'),(19,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$NauEN50Z0yOjLZcCPWCCseVYuzXe7rt/1zMELF8nGdua1flGCfZHu','ROLE_USER','cd','user'),(20,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$0/ErLgCOqjuLXhirGG/m0.gQVD/fYyCmFI5vFpwVO3BpRtEOzwROO','ROLE_USER','sz','user'),(21,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$eExkE5RiuN0w4UDge.XwJOlFfI8VozFqHZMpRi/wCT8GPXANGf3Tm','ROLE_USER','bg','user'),(22,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$mOrHJmHA4VXCXhv4W8RM2Oq5x747lBMQ2ozqLdNK.b2nvTLw.S7W.','ROLE_USER','vff','user'),(23,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$4lXYBEbs8Ndoi4dwEMP6T.bu3MOYvUIMlHjhkdBCX8RLYVuoKn6XW','ROLE_USER','lala','user'),(24,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$DYhvYo99NtTWvxmSy74UFerZg4DHOE7hDDdACYikPrOyZDIvi9Nza','ROLE_USER','sas','user'),(25,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$FxaLlIhP0QrpSUFUL4NWxu9GwNDOCSYaBXRREeEF/dkSY9ixGtRlq','ROLE_USER','hj','user'),(26,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$MfdOdnN362LH54Jz87FBP.2gz6lZaUxAk8wUaAiaU5En54XclB61W','ROLE_USER','kj','user'),(27,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$5j8HMfXJRa8uwL0YGFwmI.Zaa3q5gD0S2zTw5t4shyemiSn8JwK1.','ROLE_USER','mk','user'),(28,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$gDCtolMk91xe0tm3BPWvkedY/TyWPmjO51SUdxJlu5kJw0idajCmS','ROLE_USER','lkj','user'),(29,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$4b/v8Z/tF13R8i1eAKnM5.8jD.5UY/D69.YNuu0dJDkWIzYhpY6VG','ROLE_USER','678','user'),(30,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$5wLjlKsS2KE2rEzKLyJTzOF.6HcAxG.CggUerLQE.KUPmHuCtRKjS','ROLE_USER','ghnb','user'),(31,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$UyN/7h6z1fmkBcTuAzoEPOOSMNy0QMdZ135eMgTu7JFso17PiDY3u','ROLE_USER','jhgfd','user'),(32,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$K2bRri1wkWA/gYwLOtalCudeXMcLzI.eHE0LMB3KQ.LCJigWWkYiG','ROLE_USER','huygtfrd','user'),(33,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$87vpcg.BI3RWX/uH5nn4O.JE/BOV1oX2svGHh7CuTuaehutQszR7u','ROLE_USER','cdfg','user'),(34,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$LKwSLXnz9hD66uvKWX9ZhuckmcWT73196NiZ94pgntoCytkkuEQhO','ROLE_USER','jhgfd','user'),(35,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$20mdkkluPazIipvc7PVJYeeTZ.zaWfW.2A.gkE0UaiPuddo2YPrVy','ROLE_USER','65ty','user'),(36,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$ga4SFrOO8WoU0z.kqhXwNeEWfJAswnUdkPNf3Flis5ctpwjhzFPTK','ROLE_USER','kjhgfds543','user'),(37,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$xcB89YeE18lOc2V8yj5t.OsoorG1R/maUGHbQbDlSV9HT0/TWtzgy','ROLE_USER','k8jhuy67gt5fr4d','user'),(38,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$1cHhC4sEVTczUzC7WMeJXuklk2WdcDVYJbMyBeWv.0B1JiZI/mHdy','ROLE_USER','8ijhu76ygt5f4r','user'),(39,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$23NaIF4fSab2nhuNzGIeAueqB0tJaj3lSLLoAyzpUGA5KY0oDnTde','ROLE_USER','i8u7nh6bzgt5fr4c','user'),(40,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$bIukrVidi5F28PEGakXji.qdiP3NohId6mW6b4RveUPU96DF67TE6','ROLE_USER','s4ed5gt67uji','user'),(41,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$FBt0damiqSxJAHlNf2iofOksTNNN/XQ5UVOK0QejQBT3MdY1WYHE6','ROLE_USER','j8h76gt5rf4','user'),(42,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$y1Mk5VvuUFNOn.XmUsv5wOpm6qI8jnUJKxpgP8pEhtki2Z/Cfywui','ROLE_USER','h76gt5fr4d3','user'),(43,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$4f/tXg9UOF7iR9VMKk2D..14Jpi33M4HWfaVEsPCaSWN2vAKdnihy','ROLE_USER','9okihuy6gr4e','user'),(44,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$dNr25p/p9zBje1rdgasf4.3u5hwF21RyOoWPXZknucsfBKtzm6rUu','ROLE_USER','i8jhuy6gtrf4d','user'),(45,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$d3ZAUAW1pFsTMr5k4H8dzOwgolQy7ZeuJH45nFtIPd6wWO.1kZ37G','ROLE_USER','9oki8jhuy6gt5fr4','user'),(46,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$jiw3tlCKqJfK/zTq1y62J.Lml/klVIngwQEsJ0R5SkGsne5WfjYEu','ROLE_USER','k98h6ygtrf4d','user'),(47,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$xbgBM4ihZfrISuaeKHTli.eUNlaxeOV5G.hspofuqX74bMXiUDDdS','ROLE_USER','45bged2','user'),(48,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$kDAWCOxC/8SbmGUqwy4w6ulKt2273AsGHFVSq3wZh0uEfvgwCb95S','ROLE_USER','45bged2','user'),(49,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$Ptl1VPk0juOHQ6XQdam47u3DNVFucN/1L/HGWRfg.Kphv1oGRKuO.','ROLE_USER',',ki8u7y6t54rfedc','user'),(50,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$mSli5i1q5H1LjebtI8u6qen7ypHE95Pl3wtZkxRQSG.oXpzPM8A52','ROLE_USER','8imuh6ygrde','user'),(51,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$cP5ccTo7Auzkcf.ZtPQFiO/gR0bXsK0wjm6RXrFmOz9APPJbySF/y','ROLE_USER','m7u6nyhbtrfe','user'),(52,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$aOGcM6ybqoemWGDl7E4T5u/3AWWgJ.a9xFEWY.0ksEIHMUPiQuzU6','ROLE_USER','ло8р67п5ка4в','user'),(53,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$fMIbKQpjVKB3DR8tqv6jau1KQ5Zt4TNMtiFlV5gm/Rs8MO7e02b4u','ROLE_USER','jj7h6ygtr5f43','user'),(54,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$20qy0GMSLaIQ1UT7sEqGguf.UcIF5UpkyPo3AmIdPHXvzfSeXyslW','ROLE_USER','8ijhu76ygt5fr4d3','user'),(55,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$/ILxTLpt.H9nvK0Sudq.KOoIzCCJn5wLoFcFBguocaM/EzgdBGRxC','ROLE_USER','o9i8hu6ygtrfced','user'),(56,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$y9.NC.8sWqSMwr.YlpOj4Obs4xYz55eYh3MNRA9p3gmnoiXr1D3p6','ROLE_USER','8jh76ygt5frde','user'),(57,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$jlgnROkDhu8GrxJ5uelG2eakn0r9yHo7qYOGAT4C.7.DdS7BXgG9C','ROLE_USER','9ki8jhu76zgt5fr4','user'),(58,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$mc.MXBjhUGL46asR235jCuTwQC7l3o7HwVfpYD4djhrmoAWH4ydlK','ROLE_USER',',o9mi8u7n6yt5fr4d','user'),(59,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$NJ/.q35a4wWBJeVAQgj5DeVkK6/8OxHMzROkaZ6YetQIvA86BZQi6','ROLE_USER','asw4rfthuji','user'),(60,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$8YPmgXA5xUOsQDWyTf/.bu0sV/N5tAEgKt1yMMYyMI8al5cypfrly','ROLE_USER','k98jh6ygt5rfe','user'),(61,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$h/1PPT5fc0PABGOX0lxU8OSRu51rcY0.TlErqi3Hg3i2gGTo56hPW','ROLE_USER','h5tr4edws','user'),(62,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$wJkSDBT7symz8n71pQDPtupzCztdJAc1WMx1YSsn9H73tV8MCVa3G','ROLE_USER','xrctfvgbhjm','user'),(63,_binary '',_binary '',_binary '',NULL,NULL,_binary '','$2a$10$BvobRWpHbPYZZZMploZAEut9uwKg5zVok5kYJNgj5sxoJcidOclkq','ROLE_USER','jy5hyt4eds','user');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'selection_committee'
--

--
-- Dumping routines for database 'selection_committee'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-14 18:23:43
