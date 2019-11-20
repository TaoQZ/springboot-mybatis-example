use mybatis_learning_example;
CREATE TABLE `category` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `name` varchar(50) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

INSERT INTO `category` VALUES ('1', '服装');
INSERT INTO `category` VALUES ('2', '电器');
