/*
 Navicat Premium Data Transfer

 Source Server         : 宝塔MySQL
 Source Server Type    : MySQL
 Source Server Version : 50740
 Source Host           : 127.0.0.1:3306
 Source Schema         : pilot_school

 Target Server Type    : MySQL
 Target Server Version : 50740
 File Encoding         : 65001

 Date: 08/01/2024 10:22:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统用户名\r\n',
  `true_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表是管理员，1代表是教练，2代表是学生',
  `login_date` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登录时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for admissions_info
-- ----------------------------
DROP TABLE IF EXISTS `admissions_info`;
CREATE TABLE `admissions_info`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `admissions_time` datetime NULL DEFAULT NULL COMMENT '信息时间',
  `admissions_obj` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招生信息对象',
  `admissions_rule` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招生规则',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '招生信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of admissions_info
-- ----------------------------
INSERT INTO `admissions_info` VALUES ('817348775382224896', '2023-05-13 00:00:00', '所有学生', '视力正常，体能正常');

-- ----------------------------
-- Table structure for admissions_publicity
-- ----------------------------
DROP TABLE IF EXISTS `admissions_publicity`;
CREATE TABLE `admissions_publicity`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `publicity_time` datetime NULL DEFAULT NULL COMMENT '宣传日期',
  `publicity_context` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宣传内容',
  `admissions_rule` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '招生规则',
  `publicity_way` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '宣传渠道',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '招生宣传' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of admissions_publicity
-- ----------------------------
INSERT INTO `admissions_publicity` VALUES ('817370976953176064', '2023-05-11 16:00:00', '飞行培训开始咯', '无', 'https://new.qq.com/rain/a/20230301A086RY00');

-- ----------------------------
-- Table structure for agreement
-- ----------------------------
DROP TABLE IF EXISTS `agreement`;
CREATE TABLE `agreement`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `agreement_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `agreement_date` datetime NULL DEFAULT NULL,
  `agreement_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `student_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '协议表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of agreement
-- ----------------------------
INSERT INTO `agreement` VALUES ('818101299018076160', '学习协议', '2023-05-15 16:00:00', '/upload/230602165823_824535964062978048_页-20.png', '001');

-- ----------------------------
-- Table structure for cost_log
-- ----------------------------
DROP TABLE IF EXISTS `cost_log`;
CREATE TABLE `cost_log`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `cost_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用名称',
  `cost_time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '花费时间',
  `cost` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '费用表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of cost_log
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `c_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `t_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师id',
  `amenities_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配套设施id',
  `course_starttime` datetime NULL DEFAULT NULL COMMENT '课程开始时间',
  `course_endtime` datetime NULL DEFAULT NULL COMMENT '课程开始时间',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程状态',
  `train_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训id',
  PRIMARY KEY (`c_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('817361519481327616', '理论课程', '824898824307871744', '817580457876131840', '2023-05-12 16:00:00', '2023-05-19 16:00:00', '未开始', '817358025173110784');
INSERT INTO `course` VALUES ('824915782562615296', '理论课程2', '824898824307871744', '817580457876131840', '2023-06-03 10:07:30', '2023-06-03 10:07:31', '已开始', '817358025173110784');

-- ----------------------------
-- Table structure for course_tables
-- ----------------------------
DROP TABLE IF EXISTS `course_tables`;
CREATE TABLE `course_tables`  (
  `c_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程id',
  `course_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程名称',
  `t_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师id',
  `s_id` int(11) NULL DEFAULT NULL COMMENT '学生id',
  `amenities_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配套设施id'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '课程表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of course_tables
-- ----------------------------

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `target_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '被评价对象id',
  `evaluate_context` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '评价内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '评价表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of evaluate
-- ----------------------------
INSERT INTO `evaluate` VALUES ('818092737088851968', '001', '111', '很棒的老师，爱来自xxx');
INSERT INTO `evaluate` VALUES ('824877781526646784', 'Sreisen', '1', '我爱你');
INSERT INTO `evaluate` VALUES ('824900256733990912', 'TTeacher', 'Sreisen', '该同学比较认真');
INSERT INTO `evaluate` VALUES ('825275889880272896', 'Sreisen', 'TTeacher', '1111');
INSERT INTO `evaluate` VALUES ('826582346999402496', 'Sreisen', 'TTeacher', 'test');

-- ----------------------------
-- Table structure for examination
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `e_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试名称',
  `e_starttime` datetime NULL DEFAULT NULL COMMENT '考试时间',
  `e_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试地点',
  `e_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试内容',
  `subject_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考试科目id',
  `e_endtime` datetime NULL DEFAULT NULL COMMENT '考试结束时间',
  `couese_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '课程id',
  `training_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '考试管理表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of examination
-- ----------------------------
INSERT INTO `examination` VALUES ('818096210555572224', '理论考试', '2023-05-14 16:00:00', '教师103', '飞行理论考试第一章节', '817361519481327616', '2023-05-15 16:00:00', '01', '01');

-- ----------------------------
-- Table structure for examination_subjects
-- ----------------------------
DROP TABLE IF EXISTS `examination_subjects`;
CREATE TABLE `examination_subjects`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `subject_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目id',
  `subject_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生考试科目表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of examination_subjects
-- ----------------------------

-- ----------------------------
-- Table structure for facility
-- ----------------------------
DROP TABLE IF EXISTS `facility`;
CREATE TABLE `facility`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `facility_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设施名称',
  `facility_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设施位置',
  `facility_master` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设施维护人',
  `master_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员电话',
  `facility_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设施使用情况',
  `cost` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设施' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of facility
-- ----------------------------
INSERT INTO `facility` VALUES ('817580457876131840', '教室301', '学校西北部', '824899063056044032', '13998448461', '完好', '1000');

-- ----------------------------
-- Table structure for fly_experience
-- ----------------------------
DROP TABLE IF EXISTS `fly_experience`;
CREATE TABLE `fly_experience`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `plan_time` datetime NULL DEFAULT NULL COMMENT '活动时间',
  `plan_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动地点',
  `plan_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动内容',
  `plan` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动计划',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '飞行体验活动管理' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of fly_experience
-- ----------------------------
INSERT INTO `fly_experience` VALUES ('818079966200729600', '2023-05-15 16:00:00', '活动地点', '三角翼飞行活动体验', '三角翼活动');
INSERT INTO `fly_experience` VALUES ('826424712635748352', '2023-06-06 16:00:00', '11', '22', '23123');

-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `subject_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '科目id',
  `g` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '科目分数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '成绩详细表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of grades
-- ----------------------------
INSERT INTO `grades` VALUES ('818099987928977408', '001', '001', '100');
INSERT INTO `grades` VALUES ('824912132054323200', '824161317068869632', '817361519481327616', '111');

-- ----------------------------
-- Table structure for license
-- ----------------------------
DROP TABLE IF EXISTS `license`;
CREATE TABLE `license`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `license_context` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '执照',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '执照表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of license
-- ----------------------------
INSERT INTO `license` VALUES ('818090699634380800', '001', '/upload/230602165213_824534414053740544_页-26.png');

-- ----------------------------
-- Table structure for log_train
-- ----------------------------
DROP TABLE IF EXISTS `log_train`;
CREATE TABLE `log_train`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `train_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `log_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '训练日志关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of log_train
-- ----------------------------

-- ----------------------------
-- Table structure for machine
-- ----------------------------
DROP TABLE IF EXISTS `machine`;
CREATE TABLE `machine`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `machine_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备名称',
  `machine_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备位置',
  `machine_master` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备维护人',
  `master_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员电话',
  `machine_status` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备使用情况',
  `cost` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '设备表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of machine
-- ----------------------------
INSERT INTO `machine` VALUES ('817375515026526208', '飞行器1', '西仓库', '824899063056044032', '13555687944', '完好', '2000', '正在使用');

-- ----------------------------
-- Table structure for p_experience
-- ----------------------------
DROP TABLE IF EXISTS `p_experience`;
CREATE TABLE `p_experience`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `p_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '人员电话',
  `p_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '人员姓名',
  `experience_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '飞行体验活动管理人员表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of p_experience
-- ----------------------------
INSERT INTO `p_experience` VALUES ('824836349164130304', '毛', '122345352345', '818079966200729600');
INSERT INTO `p_experience` VALUES ('824836400816984064', '铃仙', '1333254234523', '818079966200729600');
INSERT INTO `p_experience` VALUES ('825275178945744896', 'xiaowang', '12312', '818079966200729600');

-- ----------------------------
-- Table structure for place
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `place_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '场地名称',
  `place_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '场地地址',
  `place_master` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '场地管理员',
  `master_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员电话',
  `place_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '场地使用情况',
  `cost` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '场地' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of place
-- ----------------------------
INSERT INTO `place` VALUES ('817578161264005120', '模拟训练训练场', '训练场西部', '824899063056044032', '13667879554', '完好', '1003');
INSERT INTO `place` VALUES ('824540405168214016', '场地西', '哈尔滨西', '824899063056044032', '13533333334', '11', '10');
INSERT INTO `place` VALUES ('824902593577881600', '东场地', '哈尔滨市香坊区', '824899063056044032', '12131231232', '完好', '222');

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统用户名\r\n',
  `true_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表是管理员，1代表是教练，2代表是学生，3代表工作人员',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表女，1代表男',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `staff_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作证',
  `wages` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工资',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '工作人员' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('824899063056044032', 'F002', '李师傅', '222', '123124123', '202cb962ac59075b964b07152d234b70', '3', '1', '22', '33', '124');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统用户名\r\n',
  `true_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表是管理员，1代表是教练，2代表是学生，3代表工作人员',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表女，1代表男',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `enroll_date` datetime NULL DEFAULT NULL COMMENT '报名时间',
  `login_date` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登录时间',
  `merf` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '体检报告单',
  `isgradu` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否毕业',
  `ispay` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否缴费',
  `train_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训信息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', 'Nomura Tsubasa', 'fkcOzYfdA5', '11-544-3503', '1234', '2', '0', '2-1-6 Kaminopporo 1 Jo, Atsubetsu Ward', '2011-04-22 08:28:41', '2023-06-02 06:34:33', 'vG9zOBTFah', 'g', '1', NULL);
INSERT INTO `student` VALUES ('824153427029397504', 'S1', '1', '1', '1', '3', NULL, '1', '', NULL, NULL, '', NULL, NULL, '817358025173110784');
INSERT INTO `student` VALUES ('824161317068869632', 'Sreisen', '铃仙', '420203198911042119', '13534564365787', 'c4ca4238a0b923820dcc509a6f75849b', NULL, '0', '北京市朝阳区幻想小区53号', '2023-06-01 08:09:34', '2023-06-08 00:27:32', '/upload/230602151156_824509178109366272_2023-中期报告-陆通.doc', '1', '1', '815905350371905536');
INSERT INTO `student` VALUES ('824505596584792064', 'S2', '2', '2', '3', 'c81e728d9d4c2f636f067f89cc14862c', NULL, '0', '', NULL, NULL, '', NULL, NULL, '815905350371905536');

-- ----------------------------
-- Table structure for student_examination
-- ----------------------------
DROP TABLE IF EXISTS `student_examination`;
CREATE TABLE `student_examination`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `e_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '考试id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生考试表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_examination
-- ----------------------------

-- ----------------------------
-- Table structure for student_fees
-- ----------------------------
DROP TABLE IF EXISTS `student_fees`;
CREATE TABLE `student_fees`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `is_pay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否支付学费',
  `cost` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '费用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学费' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_fees
-- ----------------------------
INSERT INTO `student_fees` VALUES ('818108380467040256', '001', '1', '100003');

-- ----------------------------
-- Table structure for student_job
-- ----------------------------
DROP TABLE IF EXISTS `student_job`;
CREATE TABLE `student_job`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `job_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工作内容',
  `employers_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '雇主名字',
  `employers_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '雇主电话',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '工作信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of student_job
-- ----------------------------
INSERT INTO `student_job` VALUES ('817372459794829312', '景区飞行员招收', '王女士', '137779555643');

-- ----------------------------
-- Table structure for t_mybatis_test
-- ----------------------------
DROP TABLE IF EXISTS `t_mybatis_test`;
CREATE TABLE `t_mybatis_test`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `titlex` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标题',
  `ifabc` int(11) NULL DEFAULT NULL COMMENT '是与否',
  `reatetime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `asdtime` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `fsv` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '副标题',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '自动生成测试' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_mybatis_test
-- ----------------------------
INSERT INTO `t_mybatis_test` VALUES ('574595720682803200', '444444444', -1, NULL, NULL, '');

-- ----------------------------
-- Table structure for t_sys_area
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_area`;
CREATE TABLE `t_sys_area`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `area_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '区代码',
  `city_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级市代码',
  `area_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市名称',
  `short_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `lng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `data_state` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Index_1`(`area_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2013 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '地区设置' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_area
-- ----------------------------
INSERT INTO `t_sys_area` VALUES (1975, '500101', '500100', '万州区', '万州', '108.380249', '30.807808', 28, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1976, '500102', '500100', '涪陵区', '涪陵', '107.394905', '29.703651', 11, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1977, '500103', '500100', '渝中区', '渝中', '106.562881', '29.556742', 37, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1978, '500104', '500100', '大渡口区', '大渡口', '106.48613', '29.481003', 6, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1979, '500105', '500100', '江北区', '江北', '106.532845', '29.575352', 13, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1980, '500106', '500100', '沙坪坝区', '沙坪坝', '106.454201', '29.541224', 24, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1981, '500107', '500100', '九龙坡区', '九龙坡', '106.480988', '29.523493', 15, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1982, '500108', '500100', '南岸区', '南岸', '106.560814', '29.523993', 18, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1983, '500109', '500100', '北碚区', '北碚', '106.437866', '29.82543', 2, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1984, '500112', '500100', '渝北区', '渝北', '106.512848', '29.601452', 35, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1985, '500113', '500100', '巴南区', '巴南', '106.519424', '29.38192', 1, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1986, '500114', '500100', '黔江区', '黔江', '108.782578', '29.527548', 21, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1987, '500115', '500100', '长寿区', '长寿', '107.074852', '29.833672', 4, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1988, '500222', '500100', '綦江区', '綦江', '106.651421', '29.028091', 22, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1989, '500223', '500100', '潼南县', '潼南', '105.84182', '30.189554', 27, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1990, '500224', '500100', '铜梁县', '铜梁', '106.054947', '29.839945', 26, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1991, '500225', '500100', '大足区', '大足', '105.715317', '29.700499', 7, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1992, '500226', '500100', '荣昌县', '荣昌', '105.594063', '29.403627', 23, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1993, '500227', '500100', '璧山县', '璧山', '106.231125', '29.59358', 3, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1994, '500228', '500100', '梁平县', '梁平', '107.800034', '30.672169', 17, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1995, '500229', '500100', '城口县', '城口', '108.664902', '31.946293', 5, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1996, '500230', '500100', '丰都县', '丰都', '107.732483', '29.866425', 9, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1997, '500231', '500100', '垫江县', '垫江', '107.348694', '30.330011', 8, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1998, '500232', '500100', '武隆县', '武隆', '107.756554', '29.323759', 29, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (1999, '500233', '500100', '忠县', '忠县', '108.037521', '30.291536', 38, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2000, '500234', '500100', '开县', '开县', '108.413315', '31.167734', 16, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2001, '500235', '500100', '云阳县', '云阳', '108.697701', '30.930529', 36, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2002, '500236', '500100', '奉节县', '奉节', '109.465775', '31.019966', 10, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2003, '500237', '500100', '巫山县', '巫山', '109.878929', '31.074842', 30, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2004, '500238', '500100', '巫溪县', '巫溪', '109.628914', '31.396601', 31, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2005, '500240', '500100', '石柱土家族自治县', '石柱', '108.11245', '29.998529', 25, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2006, '500241', '500100', '秀山土家族苗族自治县', '秀山', '108.99604', '28.444773', 32, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2007, '500242', '500100', '酉阳土家族苗族自治县', '酉阳', '108.767204', '28.839828', 34, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2008, '500243', '500100', '彭水苗族土家族自治县', '彭水', '108.16655', '29.293856', 20, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2009, '500381', '500100', '江津区', '江津', '106.253159', '29.283386', 14, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2010, '500382', '500100', '合川区', '合川', '106.265556', '29.990993', 12, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2011, '500383', '500100', '永川区', '永川', '105.894714', '29.348747', 33, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);
INSERT INTO `t_sys_area` VALUES (2012, '500384', '500100', '南川区', '南川', '107.098152', '29.156647', 19, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);

-- ----------------------------
-- Table structure for t_sys_city
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_city`;
CREATE TABLE `t_sys_city`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `city_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市代码',
  `city_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市名称',
  `short_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `province_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省代码',
  `lng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `data_state` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Index_1`(`city_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 256 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '城市设置' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_city
-- ----------------------------
INSERT INTO `t_sys_city` VALUES (255, '500100', '重庆市', '重庆', '500000', '106.504959', '29.533155', 1, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);

-- ----------------------------
-- Table structure for t_sys_department
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_department`;
CREATE TABLE `t_sys_department`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `parent_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父id',
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `leader` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '部门负责人',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  `order_num` int(11) NULL DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '部门表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_department
-- ----------------------------
INSERT INTO `t_sys_department` VALUES (1, '0', 'v2', 'v2', '13012345678', 'v2@qq.com', 1, 1);
INSERT INTO `t_sys_department` VALUES (2, '1', '技术部门', 'x某某', '13012345678', 'v2@qq.com', 1, 2);
INSERT INTO `t_sys_department` VALUES (3, '1', '人事部门', 'a某某阿松大', '13012345678', 'v2@qq.com', 1, 3);
INSERT INTO `t_sys_department` VALUES (4, '2', '开发一小组', 'b某某', '13012345678', 'v2@qq.com', 1, 4);
INSERT INTO `t_sys_department` VALUES (5, '3', '销售部门', 'd某某啊啊啊', '13012345678', 'v2@qq.com', 1, 5);
INSERT INTO `t_sys_department` VALUES (6, '5', '销售一组', 'e某某', '13012345678', 'v2@qq.com', 1, 6);

-- ----------------------------
-- Table structure for t_sys_dict_data
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dict_data`;
CREATE TABLE `t_sys_dict_data`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `dict_sort` int(11) NULL DEFAULT 0 COMMENT '字典排序',
  `dict_label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典标签',
  `dict_value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典键值',
  `dict_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典类型',
  `css_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '样式属性（其他样式扩展）',
  `list_class` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '表格回显样式',
  `is_default` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'N' COMMENT '是否默认（Y是 N否）',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典数据表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_dict_data
-- ----------------------------
INSERT INTO `t_sys_dict_data` VALUES ('331043380933038080', 1, '一般', '1', 'sys_notice_type', '', 'info', 'Y', '0', 'admin', '2019-09-09 22:15:03', 'admin', '2019-09-09 22:15:43', '');
INSERT INTO `t_sys_dict_data` VALUES ('331043525137403904', 2, '重要', '2', 'sys_notice_type', '', 'important', 'N', '0', 'admin', '2019-09-09 22:15:37', 'admin', '2020-12-27 13:57:22', '');
INSERT INTO `t_sys_dict_data` VALUES ('340080322395901952', 1, '开启', '0', 'sys_province_state', '', 'info', 'Y', '0', 'admin', '2019-10-04 20:44:37', 'admin', '2019-10-04 20:46:41', '');
INSERT INTO `t_sys_dict_data` VALUES ('340080779201744896', 2, '关闭', '-1', 'sys_province_state', '', 'important', 'N', '0', 'admin', '2019-10-04 20:46:26', 'admin', '2020-12-27 13:57:46', '');
INSERT INTO `t_sys_dict_data` VALUES ('373494384659927040', 0, 'GET请求', '1', 'sys_inter_url_type', '', 'primary', 'Y', '0', 'admin', '2020-01-05 01:40:11', 'admin', '2020-12-27 14:27:28', '');
INSERT INTO `t_sys_dict_data` VALUES ('373494483465146368', 1, 'POST请求', '2', 'sys_inter_url_type', '', 'info', 'N', '0', 'admin', '2020-01-05 01:40:34', 'admin', '2020-12-27 14:26:59', '');
INSERT INTO `t_sys_dict_data` VALUES ('506431838588375040', 0, 'DELETE请求', '3', 'sys_inter_url_type', '', 'default', 'N', '0', 'admin', '2021-01-05 13:46:10', 'admin', '2021-01-05 13:48:43', '');
INSERT INTO `t_sys_dict_data` VALUES ('506432620712824832', 0, 'PUT请求', '4', 'sys_inter_url_type', '', 'default', 'N', '0', 'admin', '2021-01-05 13:49:16', 'admin', '2021-01-05 13:49:20', '');
INSERT INTO `t_sys_dict_data` VALUES ('563746747239763968', 0, '微信', '1', 'payment_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:35:09', 'admin', '2021-06-12 17:37:14', '');
INSERT INTO `t_sys_dict_data` VALUES ('563746783184949248', 0, '支付宝', '2', 'payment_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:35:17', 'admin', '2021-06-12 17:37:18', '');
INSERT INTO `t_sys_dict_data` VALUES ('563746818496794624', 0, '水滴筹', '3', 'payment_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:35:26', 'admin', '2021-06-12 17:37:21', '');
INSERT INTO `t_sys_dict_data` VALUES ('563747125104611328', 0, '火锅底料', '1', 'gift_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:36:39', 'admin', '2021-06-12 17:36:50', '');
INSERT INTO `t_sys_dict_data` VALUES ('563747405598691328', 0, '冒菜底料', '2', 'gift_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:37:46', '', '2021-06-12 17:37:46', '');
INSERT INTO `t_sys_dict_data` VALUES ('563747459235450880', 0, '重庆小面佐料', '3', 'gift_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:37:58', '', '2021-06-12 17:37:58', '');
INSERT INTO `t_sys_dict_data` VALUES ('563747480336994304', 0, '其他', '4', 'gift_type', '', 'default', 'Y', '0', 'admin', '2021-06-12 17:38:03', '', '2021-06-12 17:38:03', '');
INSERT INTO `t_sys_dict_data` VALUES ('571366029360500736', 0, '是', '1', 'yes_or_no', '', 'default', 'Y', '0', 'admin', '2021-07-03 18:11:27', '', '2021-07-03 18:11:27', '');
INSERT INTO `t_sys_dict_data` VALUES ('571366105029939200', 0, '否', '-1', 'yes_or_no', '', 'info', 'Y', '0', 'admin', '2021-07-03 18:11:45', '', '2021-07-03 18:11:45', '');

-- ----------------------------
-- Table structure for t_sys_dict_type
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dict_type`;
CREATE TABLE `t_sys_dict_type`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `dict_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典名称',
  `dict_type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '字典类型',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '状态（0正常 1停用）',
  `create_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '创建者',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_by` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '更新者',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `dict_type`(`dict_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典类型表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_dict_type
-- ----------------------------
INSERT INTO `t_sys_dict_type` VALUES ('340079827459641344', '省份状态', 'sys_province_state', '0', 'admin', '2019-10-04 20:42:39', '', '2019-10-04 20:42:39', '省份状态');
INSERT INTO `t_sys_dict_type` VALUES ('373493952487231488', '拦截器类型', 'sys_inter_url_type', '0', 'admin', '2020-01-05 01:38:28', 'admin', '2020-03-29 23:23:43', '拦截器类型');
INSERT INTO `t_sys_dict_type` VALUES ('563746635880992768', '捐款类型', 'payment_type', '0', 'admin', '2021-06-12 17:34:42', '', '2021-06-12 17:34:42', '');
INSERT INTO `t_sys_dict_type` VALUES ('563747016396640256', '礼物类型', 'gift_type', '0', 'admin', '2021-06-12 17:36:13', '', '2021-06-12 17:36:13', '');
INSERT INTO `t_sys_dict_type` VALUES ('571365854613213184', '是与否', 'yes_or_no', '0', 'admin', '2021-07-03 18:10:45', 'admin', '2023-05-08 03:14:56', '用于select');
INSERT INTO `t_sys_dict_type` VALUES ('6', '通知类型', 'sys_notice_type', '0', 'admin', '2018-03-16 11:33:00', 'admin', '2020-12-27 14:26:42', '通知类型列表');
INSERT INTO `t_sys_dict_type` VALUES ('815845830534762496', '时间', 'date', '0', 'admin', '2023-05-09 09:26:54', '', '2023-05-09 09:26:54', '');

-- ----------------------------
-- Table structure for t_sys_email
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_email`;
CREATE TABLE `t_sys_email`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `receivers_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '接收人电子邮件',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '邮件标题',
  `content` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '内容',
  `send_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发送人id',
  `send_user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发送人账号',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '电子邮件' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_email
-- ----------------------------
INSERT INTO `t_sys_email` VALUES ('503928650819833856', '87766867@qq.com', '87766867@qq.com', 'fffffff<img src=\"http://localhost:8080/demo/static/component/layui/images/face/22.gif\" alt=\"[委屈]\">', '1', 'admin', '2020-12-29 15:59:23');
INSERT INTO `t_sys_email` VALUES ('503928914918379520', '87766867@qq.com', '87766867@qq.com', 'ssssssfsdfsdfsdf<img src=\"http://localhost:8080/demo/static/component/layui/images/face/42.gif\" alt=\"[抓狂]\"><img src=\"http://localhost:8080/demo/static/component/layui/images/face/71.gif\" alt=\"[蛋糕]\">', '1', 'admin', '2020-12-29 16:00:26');
INSERT INTO `t_sys_email` VALUES ('595001021625794560', '87766867@qq.com', 'springbootv2测试邮件', '<p>测试测测测</p>', '1', 'admin', '2019-06-30 21:21:38');

-- ----------------------------
-- Table structure for t_sys_file
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_file`;
CREATE TABLE `t_sys_file`  (
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '文件名字',
  `bucket_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '桶名',
  `file_size` bigint(20) NULL DEFAULT NULL COMMENT '文件大小',
  `file_suffix` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '后缀',
  `create_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建人id',
  `create_user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建人名字',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '修改人',
  `update_user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '修改人名字',
  `update_time` datetime NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '文件信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_file
-- ----------------------------
INSERT INTO `t_sys_file` VALUES ('503885495013609472', '503895116063313920.png', '1', 48831, 'image/png', '1', 'admin', '2020-12-29 13:07:54', '1', 'admin', '2020-12-29 13:46:08');
INSERT INTO `t_sys_file` VALUES ('503885528857448448', '503895039806672896.png', '2', 71460, 'image/png', '1', 'admin', '2020-12-29 13:08:02', '1', 'admin', '2020-12-29 13:45:50');
INSERT INTO `t_sys_file` VALUES ('581154436022407168', '581154436022407168.png', '3', 111022, 'image/png', '1', 'admin', '2021-07-30 18:27:05', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_sys_inter_url
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_inter_url`;
CREATE TABLE `t_sys_inter_url`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `inter_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拦截名称',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拦截url',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '拦截url表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_inter_url
-- ----------------------------
INSERT INTO `t_sys_inter_url` VALUES ('411495038321823744', '字典表新增', '/DictDataController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506433268967673856', '字典表修改', '/DictDataController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506434978159136768', '字典表删除', '/DictDataController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506435565655298048', '字典表状态修改', '/DictDataController/updateDefault', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506435921147727872', '字典表状态修改2', '/DictDataController/updateEnable', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506436031403397120', '字典表类型新增', '/DictTypeController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506436148680331264', '字典表类型修改', '/DictTypeController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506436165776314368', '字典表类型删除', '/DictTypeController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506436180578013184', '字典表类型状态修改', '/DictTypeController/updateEnable', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506436662134444032', '邮件新增', '/EmailController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506436757722632192', '邮件删除', '/EmailController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506437010966319104', '日志删除', '/LogController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506437420099702784', 'oss新增', '/oss/bucket/', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506437439112482816', 'oss删除', '/oss/bucket/', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506437964436475904', '权限新增', '/PermissionController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506438040823140352', '权限保存', '/PermissionController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506438121399914496', '权限删除', '/PermissionController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506438208599494656', '权限授权', '/PermissionController/saveRolePower', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506438306276446208', '权限状态修改', '/PermissionController/updateVisible', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506438447226032128', '定时器新增', '/SysQuartzJobController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506438589874311168', ' 任务调度状态修改', '/SysQuartzJobController/changeStatus', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506438725388079104', '定时器保存', '/SysQuartzJobController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506438870959788032', '定时器修改', '/SysQuartzJobController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506439003516571648', '定时任务日志删除', '/SysQuartzJobLogController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506439171481669632', '角色新增', '/RoleController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506439186778296320', '角色修改', '/RoleController/edit', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506439297122045952', '角色删除', '/RoleController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506439669773373440', '地区新增', '/SysAreaController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506439687859212288', '地区修改', '/SysAreaController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506439835490324480', '地区删除', '/SysAreaController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506440103976112128', 'City新增', '/SysCityController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506440145147400192', 'City修改', ' /SysCityController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506440217188765696', 'City删除', '/SysCityController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506440386873528320', '部门新增', '/SysDepartmentController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506440448223612928', '部门修改', '/SysDepartmentController/edit', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506440515110178816', '部门删除', '/SysDepartmentController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506440574635741184', '部门状态', '/SysDepartmentController/updateVisible', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506440668508459008', '拦截器url新增', '/SysInterUrlController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506440708056551424', '拦截器url修改', '/SysInterUrlController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506440802856210432', '拦截器url删除', '/SysInterUrlController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506441001783660544', '公告新增', '/SysNoticeController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441051263864832', '公告修改', '/SysNoticeController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441105743679488', '公告删除', '/SysNoticeController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506441242591236096', '职位新增', '/SysPositionController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441287038275584', '职位修改', '/SysPositionController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441350200299520', '职位删除', '/SysPositionController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506441420677189632', '职位状态修改', '/SysPositionController/updateVisible', 4);
INSERT INTO `t_sys_inter_url` VALUES ('506441780003213312', '省份新增', '/SysProvinceController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441807383629824', '省份修改', '/SysProvinceController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506441871850082304', '省份删除', '/SysProvinceController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506441980012793856', '街道新增', '/SysStreetController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506442015706320896', '街道修改', '/SysStreetController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506442092445306880', '街道删除', '/SysStreetController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506442186552905728', '用户新增', '/UserController/add', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506442212696002560', '用户修改', '/UserController/edit', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506442271252680704', '用户修改密码', '/UserController/editPwd', 2);
INSERT INTO `t_sys_inter_url` VALUES ('506442344443285504', '用户删除', '/UserController/remove', 3);
INSERT INTO `t_sys_inter_url` VALUES ('506444610625736704', '拦截器url复制', '/SysInterUrlController/copy/', 3);

-- ----------------------------
-- Table structure for t_sys_notice
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_notice`;
CREATE TABLE `t_sys_notice`  (
  `id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '内容',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型',
  `create_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人id',
  `create_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建人name',
  `create_time` datetime NULL DEFAULT NULL COMMENT '发信时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公告' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_notice
-- ----------------------------
INSERT INTO `t_sys_notice` VALUES ('330381411007729664', '测试公告', '', 1, '1', 'admin', '2019-09-08 02:24:37');
INSERT INTO `t_sys_notice` VALUES ('330381806358630400', '欢迎登录飞行培训管理平台', '欢迎使用', 2, '1', 'admin', '2019-09-08 02:26:11');

-- ----------------------------
-- Table structure for t_sys_notice_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_notice_user`;
CREATE TABLE `t_sys_notice_user`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `notice_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '公告id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `state` int(11) NULL DEFAULT NULL COMMENT '0未阅读 1 阅读',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '公告_用户外键' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_notice_user
-- ----------------------------
INSERT INTO `t_sys_notice_user` VALUES ('330381411037089792', '330381411007729664', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330381411045478400', '330381411007729664', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('330381806375407616', '330381806358630400', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330381806379601920', '330381806358630400', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('330622143622680576', '330622143597514752', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('330622143626874880', '330622143597514752', '488294747442511872', 0);
INSERT INTO `t_sys_notice_user` VALUES ('354984345649418240', '354984345632641024', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('373478037158760448', '373478036928073728', '1', 1);
INSERT INTO `t_sys_notice_user` VALUES ('373478037162954752', '373478036928073728', '368026921239449600', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037171343360', '373478036928073728', '368026937181999104', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037175537664', '373478036928073728', '368027013392502784', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037183926272', '373478036928073728', '368027030899527680', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037192314880', '373478036928073728', '368027048402358272', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037204897792', '373478036928073728', '368027066563694592', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037213286400', '373478036928073728', '368027087866564608', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037217480704', '373478036928073728', '368027104895438848', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037225869312', '373478036928073728', '368027130728157184', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037230063616', '373478036928073728', '368027151624179712', 0);
INSERT INTO `t_sys_notice_user` VALUES ('373478037238452224', '373478036928073728', '368382463233363968', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502750147499921408', '502750147395063808', '1', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502750147508310016', '502750147395063808', '433236479427350528', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502758207983325184', '502758207907827712', '1', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502758207991713792', '502758207907827712', '433236479427350528', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502820822130495488', '502820822042415104', '1', 0);
INSERT INTO `t_sys_notice_user` VALUES ('502820822138884096', '502820822042415104', '433236479427350528', 0);

-- ----------------------------
-- Table structure for t_sys_oper_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_oper_log`;
CREATE TABLE `t_sys_oper_log`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标题',
  `method` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '方法',
  `oper_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '操作人',
  `oper_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT 'url',
  `oper_param` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '参数',
  `error_msg` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '错误信息',
  `oper_time` date NULL DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '日志记录表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_oper_log
-- ----------------------------
INSERT INTO `t_sys_oper_log` VALUES ('354984005894017024', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin22\"],\"password\":[\"admin22\"],\"nickname\":[\"222\"],\"roles\":[\"488243256161730560\"]}', NULL, '2019-11-14');
INSERT INTO `t_sys_oper_log` VALUES ('354988722611163136', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin222\"],\"password\":[\"admin22\"],\"nickname\":[\"22222\"],\"roles\":[\"488243256161730560\"]}', NULL, '2019-11-15');
INSERT INTO `t_sys_oper_log` VALUES ('354989789822455808', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin33\"],\"password\":[\"admin33\"],\"nickname\":[\"333\"],\"roles\":[\"488305788310257664\"]}', NULL, '2019-11-15');
INSERT INTO `t_sys_oper_log` VALUES ('368026921411416064', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin1\"],\"password\":[\"admin1\"],\"nickname\":[\"\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368026937215553536', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin2\"],\"password\":[\"admin2\"],\"nickname\":[\"\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368026972204437504', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"33333\"],\"password\":[\"3333333\"],\"nickname\":[\"333\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027013421862912', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"44\"],\"password\":[\"444444\"],\"nickname\":[\"444\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027030928887808', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"5555555\"],\"password\":[\"555555555555\"],\"nickname\":[\"5555555555555\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027048427524096', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"66\"],\"password\":[\"666666666\"],\"nickname\":[\"6666666666\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027066593054720', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"2222\"],\"password\":[\"222222222\"],\"nickname\":[\"2222222222222222\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027087887536128', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"4444\"],\"password\":[\"44444444444444\"],\"nickname\":[\"44444444444\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027104924798976', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"5555\"],\"password\":[\"55555555555555\"],\"nickname\":[\"555555555555\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027130757517312', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"666\"],\"password\":[\"66666666666\"],\"nickname\":[\"666666666\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368027151649345536', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"33333333333333\"],\"password\":[\"333333333333\"],\"nickname\":[\"33333333333333\"]}', NULL, '2019-12-20');
INSERT INTO `t_sys_oper_log` VALUES ('368382463388553216', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"adminpppoooo\"],\"password\":[\"adminppp\"],\"nickname\":[\"pppppppppp\"]}', NULL, '2019-12-21');
INSERT INTO `t_sys_oper_log` VALUES ('433236479515430912', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"fuce\"],\"password\":[\"111111\"],\"nickname\":[\"fuce\"]}', NULL, '2020-06-17');
INSERT INTO `t_sys_oper_log` VALUES ('495560243967823872', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"手动阀手动阀\"],\"password\":[\"123456\"],\"nickname\":[\"手动阀手动阀\"],\"depId\":[\"3\"],\"positionId\":[\"411477874382606336\"]}', NULL, '2020-12-06');
INSERT INTO `t_sys_oper_log` VALUES ('495570972590608384', '用户新增', 'com.fc.test.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"何平\"],\"password\":[\"111111\"],\"nickname\":[\"手动阀手动阀\"],\"depId\":[\"4\"],\"posId\":[\"410792443127140352\"]}', NULL, '2020-12-06');
INSERT INTO `t_sys_oper_log` VALUES ('501769007083425792', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501772647076597760', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501775645991374848', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501776479886118912', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501779375067369472', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501779625379237888', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501780125961031680', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{}', '', '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501782630312841216', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"eeee\"],\"password\":[\"eeeeee\"],\"nickname\":[\"eeeeeeee\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488243256161730560,488289006124007424\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501783503843758080', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"55555\"],\"password\":[\"5555\"],\"nickname\":[\"555555\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488243256161730560,488289006124007424\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501783738078859264', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"3\"],\"password\":[\"33333333\"],\"nickname\":[\"3333333333333333333\"],\"depId\":[\"3\"],\"selectParent_select_input\":[\"人事部门\"],\"posId\":[\"410792443127140352\"],\"roleIds\":[\"488289006124007424\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501786177666420736', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"eeee\"],\"password\":[\"eee\"],\"nickname\":[\"eeeee\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792478929719296\"],\"roleIds\":[\"488243256161730560,488289006124007424,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501786241449201664', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"r\"],\"password\":[\"rrrrrrrrrrr\"],\"nickname\":[\"rrrrrrrrr\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488243256161730560,488289006124007424,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501786725912285184', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"rrrrr\"],\"password\":[\"rrrrrrrrrrrrrr\"],\"nickname\":[\"rrrrrrrrrrrrrr\"],\"depId\":[\"3\"],\"selectParent_select_input\":[\"人事部门\"],\"posId\":[\"410792478929719296\"],\"roleIds\":[\"488243256161730560,488289006124007424\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501787814850072576', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"rrrrrwwww\"],\"password\":[\"rrrrrrrrrrrrr\"],\"nickname\":[\"rrrrrrrrrrrrrrrrrr\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501787928188555264', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"yyyy\"],\"password\":[\"yyyyyyyyyyyyy\"],\"nickname\":[\"yyyyyyyyyyyyyy\"],\"depId\":[\"5\"],\"selectParent_select_input\":[\"销售部门\"],\"posId\":[\"410792478929719296\"],\"roleIds\":[\"488243256161730560,488289006124007424,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501796773694672896', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"tttt\"],\"password\":[\"ttt\"],\"nickname\":[\"tttttt\"],\"depId\":[\"4\"],\"selectParent_select_input\":[\"开发一小组\"],\"posId\":[\"410792443127140352\"],\"roleIds\":[\"488243256161730560,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501985140440961024', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin\"],\"password\":[\"admin\"],\"nickname\":[\"11111111111\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488289006124007424,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('501986656363089920', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin\"],\"password\":[\"admin\"],\"nickname\":[\"admin\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488289006124007424,488305788310257664\"]}', NULL, '2020-12-24');
INSERT INTO `t_sys_oper_log` VALUES ('665776668383776768', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"999\"],\"password\":[\"9999\"],\"nickname\":[\"9999\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"488289006124007424\"]}', NULL, '2022-03-21');
INSERT INTO `t_sys_oper_log` VALUES ('665822604703174656', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"admin1\"],\"password\":[\"admin\"],\"nickname\":[\"1\"],\"depId\":[\"1\"],\"selectParent_select_input\":[\"v2\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"\"]}', NULL, '2022-03-21');
INSERT INTO `t_sys_oper_log` VALUES ('816996869795352576', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"S001\"],\"password\":[\"1234\"],\"nickname\":[\"学生\"],\"depId\":[\"2\"],\"selectParent_select_input\":[\"技术部门\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"816996635321176064\"]}', NULL, '2023-05-12');
INSERT INTO `t_sys_oper_log` VALUES ('817195838437724160', '用户新增', 'com.fc.v2.controller.admin.UserController.add()', 'admin', '/UserController/add', '{\"username\":[\"test\"],\"password\":[\"test\"],\"nickname\":[\"测试\"],\"depId\":[\"2\"],\"selectParent_select_input\":[\"技术部门\"],\"posId\":[\"410792368778907648\"],\"roleIds\":[\"817193761791676416\"]}', NULL, '2023-05-13');

-- ----------------------------
-- Table structure for t_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission`;
CREATE TABLE `t_sys_permission`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名称',
  `descripion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限描述',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '授权链接',
  `is_blank` int(11) NULL DEFAULT 0 COMMENT '是否跳转 0 不跳转 1跳转',
  `pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父节点id',
  `perms` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `type` int(11) NULL DEFAULT NULL COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '菜单图标',
  `order_num` int(11) NULL DEFAULT NULL COMMENT '排序',
  `visible` int(11) NULL DEFAULT NULL COMMENT '是否可见',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '权限表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_permission
-- ----------------------------
INSERT INTO `t_sys_permission` VALUES ('10', '角色集合', '角色集合', '/RoleController/list', 0, '9', 'system:role:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('11', '角色添加', '角色添加', '/RoleController/add', 0, '9', 'system:role:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('12', '角色删除', '角色删除', '/RoleController/remove', 0, '9', 'system:role:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('13', '角色修改', '角色修改', '/RoleController/edit', 0, '9', 'system:role:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('14', '权限展示', '权限展示', '/PermissionController/view', 0, '411522822607867904', 'system:permission:view', 1, 'fa fa-key', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('15', '权限集合', '权限集合', '/PermissionController/list', 0, '14', 'system:permission:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('16', '权限添加', '权限添加', '/permissionController/add', 0, '14', 'system:permission:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('17', '权限删除', '权限删除', '/PermissionController/remove', 0, '14', 'system:permission:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('18', '权限修改', '权限修改', '/PermissionController/edit', 0, '14', 'system:permission:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('19', '文件管理', '文件管理', '/FileController/view', 0, '592059865673760768', 'system:file:view', 1, 'fa fa-file-image-o', 4, 0);
INSERT INTO `t_sys_permission` VALUES ('20', '文件添加', '文件添加', '/FileController/add', 0, '19', 'system:file:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('21', '文件删除', '文件删除', '/FileController/remove', 0, '19', 'system:file:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('22', '文件修改', '文件修改', '/FileController/edit', 0, '19', 'system:file:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('23', '文件集合', '文件集合', '/FileController/list', 0, '19', 'system:file:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('330365026642825216', '公告管理', '公告展示', '/SysNoticeController/view', 0, '592059865673760768', 'gen:sysNotice:view', 1, 'fa fa-telegram', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252171', '公告集合', '公告集合', '/SysNoticeController/list', 0, '330365026642825216', 'gen:sysNotice:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252182', '公告添加', '公告添加', '/SysNoticeController/add', 0, '330365026642825216', 'gen:sysNotice:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252193', '公告删除', '公告删除', '/SysNoticeController/remove', 0, '330365026642825216', 'gen:sysNotice:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3303650266428252204', '公告修改', '公告修改', '/SysNoticeController/edit', 0, '330365026642825216', 'gen:sysNotice:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('331778807298134016', '定时器表达式', NULL, 'https://www.bejson.com/othertools/cron/', 1, '617766548966211584', '#', 1, 'layui-icon fa fa-flash', 12, 0);
INSERT INTO `t_sys_permission` VALUES ('332157860920299520', '定时任务', '定时任务调度表展示', '/SysQuartzJobController/view', 0, '592059865673760768', 'gen:sysQuartzJob:view', 1, 'fa fa-hourglass-1', 13, 0);
INSERT INTO `t_sys_permission` VALUES ('3321578609202995211', '定时任务调度表集合', '定时任务调度表集合', '/SysQuartzJobController/list', 0, '332157860920299520', 'gen:sysQuartzJob:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3321578609202995222', '定时任务调度表添加', '定时任务调度表添加', '/SysQuartzJobController/add', 0, '332157860920299520', 'gen:sysQuartzJob:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3321578609202995233', '定时任务调度表删除', '定时任务调度表删除', '/SysQuartzJobController/remove', 0, '332157860920299520', 'gen:sysQuartzJob:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3321578609202995244', '定时任务调度表修改', '定时任务调度表修改', '/SysQuartzJobController/edit', 0, '332157860920299520', 'gen:sysQuartzJob:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('332857281479839744', '定时任务日志', '定时任务日志', '/SysQuartzJobLogController/view', 0, '592059865673760768', 'gen:sysQuartzJobLog:view', 1, 'fa fa-database', 14, 0);
INSERT INTO `t_sys_permission` VALUES ('3328572814798397451', '定时任务调度日志表集合', '定时任务调度日志表集合', '/SysQuartzJobLogController/list', 0, '332857281479839744', 'gen:sysQuartzJobLog:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3328572814798397473', '定时任务调度日志表删除', '定时任务调度日志表删除', '/SysQuartzJobLogController/remove', 0, '332857281479839744', 'gen:sysQuartzJobLog:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('335330315113467904', 'Json工具', NULL, 'https://www.bejson.com/jsonviewernew/', 1, '617766548966211584', '#', 1, 'layui-icon fa fa-retweet', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('340067579836108800', '省份管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon-website', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('340068151804956672', '省份表管理', '省份表展示', '/SysProvinceController/view', 0, '340067579836108800', 'gen:sysProvince:view', 1, 'fa fa-quora', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('3400681518049566731', '省份表集合', '省份表集合', '/SysProvinceController/list', 0, '340068151804956672', 'gen:sysProvince:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400681518049566742', '省份表添加', '省份表添加', '/SysProvinceController/add', 0, '340068151804956672', 'gen:sysProvince:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400681518049566753', '省份表删除', '省份表删除', '/SysProvinceController/remove', 0, '340068151804956672', 'gen:sysProvince:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400681518049566764', '省份表修改', '省份表修改', '/SysProvinceController/edit', 0, '340068151804956672', 'gen:sysProvince:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('340088022018166784', '城市表管理', '城市设置展示', '/SysCityController/view', 0, '340067579836108800', 'gen:sysCity:view', 1, 'fa fa-quora', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('3400880220181667851', '城市设置集合', '城市设置集合', '/SysCityController/list', 0, '340088022018166784', 'gen:sysCity:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400880220181667862', '城市设置添加', '城市设置添加', '/SysCityController/add', 0, '340088022018166784', 'gen:sysCity:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400880220181667873', '城市设置删除', '城市设置删除', '/SysCityController/remove', 0, '340088022018166784', 'gen:sysCity:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400880220181667884', '城市设置修改', '城市设置修改', '/SysCityController/edit', 0, '340088022018166784', 'gen:sysCity:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('340096183135506432', '地区设置管理', '地区设置展示', '/SysAreaController/view', 0, '340067579836108800', 'gen:sysArea:view', 1, 'fa fa-quora', 4, 0);
INSERT INTO `t_sys_permission` VALUES ('3400961831355064331', '地区设置集合', '地区设置集合', '/SysAreaController/list', 0, '340096183135506432', 'gen:sysArea:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400961831355064342', '地区设置添加', '地区设置添加', '/SysAreaController/add', 0, '340096183135506432', 'gen:sysArea:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400961831355064353', '地区设置删除', '地区设置删除', '/SysAreaController/remove', 0, '340096183135506432', 'gen:sysArea:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3400961831355064364', '地区设置修改', '地区设置修改', '/SysAreaController/edit', 0, '340096183135506432', 'gen:sysArea:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('340127412270534656', '街道设置管理', '街道设置展示', '/SysStreetController/view', 0, '340067579836108800', 'gen:sysStreet:view', 1, 'fa fa-quora', 5, 0);
INSERT INTO `t_sys_permission` VALUES ('3401274122705346571', '街道设置集合', '街道设置集合', '/SysStreetController/list', 0, '340127412270534656', 'gen:sysStreet:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3401274122705346582', '街道设置添加', '街道设置添加', '/SysStreetController/add', 0, '340127412270534656', 'gen:sysStreet:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3401274122705346593', '街道设置删除', '街道设置删除', '/SysStreetController/remove', 0, '340127412270534656', 'gen:sysStreet:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3401274122705346604', '街道设置修改', '街道设置修改', '/SysStreetController/edit', 0, '340127412270534656', 'gen:sysStreet:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('340301160042860544', '省份联动', '省份联动', '/ProvinceLinkageController/view', 0, '340067579836108800', '#', 1, 'fa fa-etsy', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('340381240911859712', 'JavaScript格式化', NULL, '/static/tool/htmlformat/javascriptFormat.html', 0, '617766548966211584', '#', 1, 'layui-icon layui-icon fa fa-magic', 11, 0);
INSERT INTO `t_sys_permission` VALUES ('373489907429150720', 'URL拦截管理', '拦截url表展示', '/SysInterUrlController/view', 0, '617766548966211584', 'gen:sysInterUrl:view', 1, 'fa fa-hand-stop-o', 16, 0);
INSERT INTO `t_sys_permission` VALUES ('3734899074291507211', '拦截url表集合', '拦截url表集合', '/SysInterUrlController/list', 0, '373489907429150720', 'gen:sysInterUrl:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3734899074291507222', '拦截url表添加', '拦截url表添加', '/SysInterUrlController/add', 0, '373489907429150720', 'gen:sysInterUrl:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3734899074291507233', '拦截url表删除', '拦截url表删除', '/SysInterUrlController/remove', 0, '373489907429150720', 'gen:sysInterUrl:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('3734899074291507244', '拦截url表修改', '拦截url表修改', '/SysInterUrlController/edit', 0, '373489907429150720', 'gen:sysInterUrl:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4', '用户管理', '用户展示', '/UserController/view', 0, '411522822607867904', 'system:user:view', 1, 'icon icon-user', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('410791701859405824', '岗位管理', '岗位展示', '/SysPositionController/view', 0, '411522822607867904', 'gen:sysPosition:view', 1, 'fa fa-vcard', 17, 0);
INSERT INTO `t_sys_permission` VALUES ('4107917018594058251', '岗位表集合', '岗位集合', '/SysPositionController/list', 0, '410791701859405824', 'gen:sysPosition:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4107917018594058262', '岗位表添加', '岗位添加', '/SysPositionController/add', 0, '410791701859405824', 'gen:sysPosition:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4107917018594058273', '岗位表删除', '岗位删除', '/SysPositionController/remove', 0, '410791701859405824', 'gen:sysPosition:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4107917018594058284', '岗位表修改', '岗位修改', '/SysPositionController/edit', 0, '410791701859405824', 'gen:sysPosition:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('410989805699207168', '部门管理', '部门展示', '/SysDepartmentController/view', 0, '411522822607867904', 'gen:sysDepartment:view', 1, 'fa fa-odnoklassniki', 18, 0);
INSERT INTO `t_sys_permission` VALUES ('4109898056992071691', '部门集合', '部门集合', '/SysDepartmentController/list', 0, '410989805699207168', 'gen:sysDepartment:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4109898056992071702', '部门添加', '部门添加', '/SysDepartmentController/add', 0, '410989805699207168', 'gen:sysDepartment:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4109898056992071713', '部门删除', '部门删除', '/SysDepartmentController/remove', 0, '410989805699207168', 'gen:sysDepartment:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('4109898056992071724', '部门修改', '部门修改', '/SysDepartmentController/edit', 0, '410989805699207168', 'gen:sysDepartment:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('411522822607867904', '用户管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon-user', 11, 0);
INSERT INTO `t_sys_permission` VALUES ('486690002869157888', '用户密码修改', '用户密码修改', '/UserController/editPwd', 0, '4', 'system:user:editPwd', 2, 'entypo-tools', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('496126970468237312', '日志展示', '日志管理', '/LogController/view', 0, '592059865673760768', 'system:log:view', 1, 'fa fa-info', 9, 0);
INSERT INTO `t_sys_permission` VALUES ('496127240363311104', '日志删除', '日志删除', '/LogController/remove', 0, '496126970468237312', 'system:log:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('496127794879660032', '日志集合', '日志集合', '/LogController/list', 0, '496126970468237312', 'system:log:list', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5', '用户集合', '用户集合', '/UserController/list', 0, '4', 'system:user:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('574578311263555584', '自动生成测试管理', '自动生成测试展示', '/TestaxController/view', 0, '589559748521623552', 'gen:testax:view', 1, 'layui-icon layui-icon-face-smile', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('574578311267749888', '自动生成测试集合', '自动生成测试集合', '/TestaxController/list', 0, '574578311263555584', 'gen:testax:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('574578311267749889', '自动生成测试添加', '自动生成测试添加', '/TestaxController/add', 0, '574578311263555584', 'gen:testax:add', 2, 'layui-icon layui-icon-add-1', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('574578311267749890', '自动生成测试删除', '自动生成测试删除', '/TestaxController/remove', 0, '574578311263555584', 'gen:testax:remove', 2, 'layui-icon layui-icon-delete', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('574578311267749891', '自动生成测试修改', '自动生成测试修改', '/TestaxController/edit', 0, '574578311263555584', 'gen:testax:edit', 2, 'layui-icon layui-icon-edit', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('581541547099553792', 'druid监控', 'druid监控', '/druid/', 0, '617766548966211584', 'user:list', 1, 'fa fa-line-chart', 6, 0);
INSERT INTO `t_sys_permission` VALUES ('583063272123531264', 'API文档', NULL, '/doc.html', 1, '617766548966211584', '--', 1, 'layui-icon fa fa-font', 8, 0);
INSERT INTO `t_sys_permission` VALUES ('586003694080753664', '表单构建', NULL, '/static/component/code/index.html', 0, '617766548966211584', 'system:tool:view', 1, 'layui-icon layui-icon fa fa-list-alt', 5, 0);
INSERT INTO `t_sys_permission` VALUES ('587453033487532032', '后台模板', NULL, 'https://www.layui.com/doc/', 1, '617766548966211584', '', 1, 'layui-icon layui-icon fa fa-telegram', 9, 0);
INSERT INTO `t_sys_permission` VALUES ('589559748521623552', '一级菜单', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon layui-icon-face-smile', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('592059865673760768', '系统管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon-home', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('592067570522128384', '测试跳转', '测试跳转', 'http://www.baidu.com', 1, '589559748521623552', '#', 1, 'fa fa-address-book', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('592167738407911424', '系统监控', '系统监控', '/ServiceController/view', 0, '617766548966211584', 'system:service:view', 1, 'fa fa-video-camera', 7, 0);
INSERT INTO `t_sys_permission` VALUES ('594691026430459904', '电子邮件管理', '电子邮件展示', '/EmailController/view', 0, '592059865673760768', 'system:email:view', 1, 'fa fa-envelope', 8, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599041', '电子邮件集合', '电子邮件集合', '/EmailController/list', 0, '594691026430459904', 'system:email:list', 2, '', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599042', '电子邮件添加', '电子邮件添加', '/EmailController/add', 0, '594691026430459904', 'system:email:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599043', '电子邮件删除', '电子邮件删除', '/EmailController/remove', 0, '594691026430459904', 'system:email:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('5946910264304599044', '电子邮件修改', '电子邮件修改', '/EmailController/edit', 0, '594691026430459904', 'system:email:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6', '用户添加', '用户添加', '/UserController/add', 0, '4', 'system:user:add', 2, 'entypo-plus-squared', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('610635485890478080', '代码生成', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon layui-icon-praise', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('610635950447394816', '全局配置', '', '/autoCodeController/global', 0, '610635485890478080', 'system:autocode:global', 1, 'fa fa-university', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('617766548966211584', '系统工具', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon layui-icon layui-icon layui-icon layui-icon-util', 10, 0);
INSERT INTO `t_sys_permission` VALUES ('618918631769636864', '字典管理', '字典类型表展示', '/DictTypeController/view', 0, '592059865673760768', 'system:dictType:view', 1, 'fa fa-puzzle-piece', 11, 0);
INSERT INTO `t_sys_permission` VALUES ('6189186317738311681', '字典类型表集合', '字典类型表集合', '/DictTypeController/list', 0, '618918631769636864', 'system:dictType:list', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6189186317948026882', '字典类型表添加', '字典类型表添加', '/DictTypeController/add', 0, '618918631769636864', 'system:dictType:add', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6189186317948026883', '字典类型表删除', '字典类型表删除', '/DictTypeController/remove', 0, '618918631769636864', 'system:dictType:remove', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6189186317989969924', '字典类型表修改', '字典类型表修改', '/DictTypeController/edit', 0, '618918631769636864', 'system:dictType:edit', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6192095214866268161', '字典数据表集合', '字典数据表集合', '/DictDataController/list', 0, '618918631769636864', 'system:dictData:list', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6192095214866268162', '字典数据表添加', '字典数据表添加', '/DictDataController/add', 0, '618918631769636864', 'system:dictData:add', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6192095215075983363', '字典数据表删除', '字典数据表删除', '/DictDataController/remove', 0, '618918631769636864', 'system:dictData:remove', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('6192095215075983364', '字典数据表修改', '字典数据表修改', '/DictDataController/edit', 0, '618918631769636864', 'system:dictData:edit', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('619836559427895296', '字典数据视图', '字典数据视图', '/DictDataController/view', 0, '618918631769636864', 'system:dictData:view', 2, NULL, NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('7', '用户删除', '用户删除', '/UserController/remove', 0, '4', 'system:user:remove', 2, 'entypo-trash', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('8', '用户修改', '用户修改', '/UserController/edit', 0, '4', 'system:user:edit', 2, 'fa fa-wrench', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815390180746858496', '人员管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon-username', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('815481113651843072', '学员管理', NULL, '/StudentController/view', 0, '815390180746858496', 'gen:student:view', 1, 'layui-icon layui-icon layui-icon', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('815481627315671040', '学员添加', NULL, '', 0, '815481113651843072', 'gen:student:add', 2, 'layui-icon layui-icon layui-icon-username', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('815488644751167488', '学员修改', NULL, '', 0, '815481113651843072', 'gen:student:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815489107479367680', '学员集合', NULL, '', 0, '815481113651843072', 'gen:student:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815489333413941248', '学员删除', NULL, '', 0, '815481113651843072', 'gen:student:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815494406101667840', '教练管理', NULL, '/TeacherController/view', 0, '815390180746858496', 'gen:teacher:view', 1, 'layui-icon layui-icon', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('815494576553988096', '添加教练', NULL, '', 0, '815494406101667840', 'gen:teacher:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815494726655545344', '修改教练', NULL, '', 0, '815494406101667840', 'gen:teacher:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815495628233773056', '删除教练', NULL, '', 0, '815494406101667840', 'gen:teacher:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815497319737856000', '教练集合', NULL, '', 0, '815494406101667840', 'gen:teacher:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815502654288564224', '工作人员管理', NULL, '/StaffController/view', 0, '815390180746858496', 'gen:staff:view', 1, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815503039682187264', '添加工作人员', NULL, '', 0, '815502654288564224', 'gen:staff:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815503168170496000', '修改工作人员', NULL, '', 0, '815502654288564224', 'gen:staff:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815503312752349184', '删除工作人员', NULL, '', 0, '815502654288564224', 'gen:staff:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815503623202148352', '工作人员列表', NULL, '', 0, '815502654288564224', 'gen:staff:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815549043534073856', '培训管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon layui-icon-component', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('815836036423880704', '培训类别管理', NULL, '/TrainCategoryController/view', 0, '815549043534073856', 'gen:trainCategory:view', 1, 'layui-icon layui-icon', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('815839799847030784', '培训信息管理', NULL, '/TrainInfoController/view', 0, '815549043534073856', 'gen:trainInfo:view', 1, 'layui-icon layui-icon', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('815840130760839168', '资料管理', NULL, '/TrainFileController/view', 0, '815549043534073856', 'gen:trainFile:view', 1, 'layui-icon layui-icon layui-icon layui-icon', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('815840276072501248', '添加培训类别', NULL, '', 0, '815836036423880704', 'gen:trainCategory:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815840425607827456', '修改培训类别', NULL, '', 0, '815836036423880704', 'gen:trainCategory:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815840505173774336', '删除培训类别', NULL, '', 0, '815836036423880704', 'gen:trainCategory:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815840588338434048', '培训类别列表', NULL, '', 0, '815836036423880704', 'gen:trainCategory:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815840885056081920', '添加培训信息', NULL, '', 0, '815839799847030784', 'gen:trainInfo:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815840971051896832', '删除培训信息', NULL, '', 0, '815839799847030784', 'gen:trainInfo:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841036726308864', '修改培训信息', NULL, '', 0, '815839799847030784', 'gen:trainInfo:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841118792060928', '培训信息列表', NULL, '', 0, '815839799847030784', 'gen:trainInfo:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841252410003456', '资料添加', NULL, '', 0, '815840130760839168', 'gen:trainFile:add', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841311293837312', '资料删除', NULL, '', 0, '815840130760839168', 'gen:trainFile:remove', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841429782925312', '资料修改', NULL, '', 0, '815840130760839168', 'gen:trainFile:edit', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815841495969042432', '资料列表', NULL, '', 0, '815840130760839168', 'gen:trainFile:list', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815842273492340736', '课程管理', NULL, '/CourseController/view', 0, '815549043534073856', 'gen:course:view', 1, 'layui-icon layui-icon layui-icon', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('815842384419098624', '添加课程', NULL, '', 0, '815842273492340736', 'gen:course:add', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815842511758168064', '课程删除', NULL, '', 0, '815842273492340736', 'gen:course:remove', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815842574962135040', '课程修改', NULL, '', 0, '815842273492340736', 'gen:course:edit', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815842649213898752', '课程列表', NULL, '', 0, '815842273492340736', 'gen:course:list', 2, 'layui-icon layui-icon layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815915559446253568', '招生就业管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon-website', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('815915880369229824', '招生信息管理', NULL, '/AdmissionsInfoController/view', 0, '815915559446253568', 'gen:admissionsInfo:view', 1, 'layui-icon layui-icon layui-icon layui-icon', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('815924727876030464', '添加招生信息', NULL, '', 0, '815915880369229824', 'gen:admissionsInfo:add', 2, 'layui-icon layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815924837875847168', '删除信息', NULL, '', 0, '815915880369229824', 'gen:admissionsInfo:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815925206995570688', '修改', NULL, '', 0, '815915880369229824', 'gen:admissionsInfo:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815925397718962176', '列表', NULL, '', 0, '815915880369229824', 'gen:admissionsInfo:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815925725239578624', '招生宣传管理', NULL, '/AdmissionsPublicityController/view', 0, '815915559446253568', 'gen:admissionsPublicity:view', 1, 'layui-icon layui-icon', 2, 0);
INSERT INTO `t_sys_permission` VALUES ('815926672141455360', '添加', NULL, '', 0, '815925725239578624', 'gen:admissionsPublicity:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815926734250708992', '删除', NULL, '', 0, '815925725239578624', 'gen:admissionsPublicity:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815926787379957760', '修改', NULL, '', 0, '815925725239578624', 'gen:admissionsPublicity:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('815926838709850112', '列表', NULL, '', 0, '815925725239578624', 'gen:admissionsPublicity:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816095890510057472', '就业管理', NULL, '/StudenjobController/view', 0, '815915559446253568', 'gen:studenjob:view', 1, 'layui-icon layui-icon layui-icon', 3, 0);
INSERT INTO `t_sys_permission` VALUES ('816096033389023232', '添加', NULL, '', 0, '816095890510057472', 'gen:studenjob:add', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816096089735303168', '删除', NULL, '', 0, '816095890510057472', 'gen:studenjob:remove', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816096144269643776', '修改', NULL, '', 0, '816095890510057472', 'gen:studenjob:edit', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816096206227902464', '列表', NULL, '', 0, '816095890510057472', 'gen:studenjob:list', 2, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816120264873086976', '设施管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon-cellphone-fine', 4, 0);
INSERT INTO `t_sys_permission` VALUES ('816126254532136960', '场地管理', NULL, '/PlaceController/view', 0, '816120264873086976', 'gen:place:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816158211894808576', '设备管理', NULL, '/MachineController/view', 0, '816120264873086976', 'gen:machine:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816160970572435456', '配套设施', NULL, '/FacilityController/view', 0, '816120264873086976', 'gen:facility:view', 1, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163296032985088', '添加', NULL, '', 0, '816126254532136960', 'gen:place:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163356477100032', '删除', NULL, '', 0, '816126254532136960', 'gen:place:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163412747882496', '修改', NULL, '', 0, '816126254532136960', 'gen:place:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163485003157504', '列表', NULL, '', 0, '816126254532136960', 'gen:place:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163603764875264', '添加', NULL, '', 0, '816158211894808576', 'gen:machine:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163661193285632', '删除', NULL, '', 0, '816158211894808576', 'gen:machine:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163716390326272', '修改', NULL, '', 0, '816158211894808576', 'gen:machine:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163782828101632', '列表', NULL, '', 0, '816158211894808576', 'gen:machine:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163883176824832', '添加', NULL, '', 0, '816160970572435456', 'gen:facility:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816163953989259264', '删除', NULL, '', 0, '816160970572435456', 'gen:facility:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816164034394066944', '修改', NULL, '', 0, '816160970572435456', 'gen:facility:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816164087447818240', '列表', NULL, '', 0, '816160970572435456', 'gen:facility:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816166167587721216', '训练管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon-location', 5, 0);
INSERT INTO `t_sys_permission` VALUES ('816166450871013376', '训练信息管理', NULL, '/TrainingInfoController/view', 0, '816166167587721216', 'gen:trainingInfo:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816169230755041280', '训练日志管理', NULL, '/TrainingLogController/view', 0, '816166167587721216', 'gen:trainingLog:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816243037389852672', '飞行体验活动管理', NULL, '/FlyExperienceController/view', 0, '816166167587721216', 'gen:flyExperience:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252385335840768', '增加', NULL, '', 0, '816166450871013376', 'gen:trainingInfo:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252439824044032', '删除', NULL, '', 0, '816166450871013376', 'gen:trainingInfo:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252492978458624', '修改', NULL, '', 0, '816166450871013376', 'gen:trainingInfo:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252575753048064', '列表', NULL, '', 0, '816166450871013376', 'gen:trainingInfo:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252833962790912', '添加', NULL, '', 0, '816169230755041280', 'gen:trainingLog:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816252983250653184', '删除', NULL, '', 0, '816169230755041280', 'gen:trainingLog:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816253046144241664', '修改', NULL, '', 0, '816169230755041280', 'gen:trainingLog:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816253265544089600', '列表', NULL, '', 0, '816169230755041280', 'gen:trainingLog:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816254086344216576', '添加', NULL, '', 0, '816243037389852672', 'gen:flyExperience:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816254138642993152', '删除', NULL, '', 0, '816243037389852672', 'gen:flyExperience:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816254188802674688', '修改', NULL, '', 0, '816243037389852672', 'gen:flyExperience:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816254236697432064', '列表', NULL, '', 0, '816243037389852672', 'gen:flyExperience:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816255374993788928', '考核管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon layui-icon-fonts-u', 6, 0);
INSERT INTO `t_sys_permission` VALUES ('816255535061012480', '考试管理', NULL, '/ExaminationController/view', 0, '816255374993788928', 'gen:examination:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816255638895202304', '成绩管理', NULL, '/GradesController/view', 0, '816255374993788928', 'gen:grades:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816255780595568640', '评价管理', NULL, '/EvaluateController/view', 0, '816255374993788928', 'gen:evaluate:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816255844206383104', '执照管理', NULL, '/LicenseController/view', 0, '816255374993788928', 'gen:license:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258333416755200', '添加', NULL, '', 0, '816255535061012480', 'gen:examination:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258388836093952', '删除', NULL, '', 0, '816255535061012480', 'gen:examination:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258448713977856', '修改', NULL, '', 0, '816255535061012480', 'gen:examination:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258499947401216', '列表', NULL, '', 0, '816255535061012480', 'gen:examination:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258878831464448', '添加', NULL, '', 0, '816255638895202304', 'gen:grades:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258936121462784', '删除', NULL, '', 0, '816255638895202304', 'gen:grades:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816258987820453888', '修改', NULL, '', 0, '816255638895202304', 'gen:grades:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259053163515904', '列表', NULL, '', 0, '816255638895202304', 'gen:grades:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259267404369920', '添加', NULL, '', 0, '816255780595568640', 'gen:evaluate:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259326384672768', '删除', NULL, '', 0, '816255780595568640', 'gen:evaluate:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259376015872000', '修改', NULL, '', 0, '816255780595568640', 'gen:evaluate:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259424694964224', '列表', NULL, '', 0, '816255780595568640', 'gen:evaluate:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259612939522048', '添加', NULL, '', 0, '816255844206383104', 'gen:license:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259684997664768', '列表', NULL, '', 0, '816255844206383104', 'gen:license:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259765066928128', '删除', NULL, '', 0, '816255844206383104', 'gen:license:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816259833199202304', '修改', NULL, '', 0, '816255844206383104', 'gen:license:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816260170303803392', '财务管理', NULL, '', 0, '0', '', 0, 'layui-icon layui-icon-rmb', 7, 0);
INSERT INTO `t_sys_permission` VALUES ('816260275719245824', '学费管理', NULL, '/StudenfeesController/view', 0, '816260170303803392', 'gen:studenfees:view', 1, 'layui-icon layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816260359466913792', '协议管理', NULL, '/AgreementController/view', 0, '816260170303803392', 'gen:agreement:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816260407663661056', '支出管理', NULL, '/CostController/view', 0, '816260170303803392', 'gen:cost:view', 1, 'layui-icon layui-icon layui-icon layui-icon layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816262948849848320', '添加', NULL, '', 0, '816260275719245824', 'gen:studenfees:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263014775918592', '删除', NULL, '', 0, '816260275719245824', 'gen:studenfees:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263077514317824', '修改', NULL, '', 0, '816260275719245824', 'gen:studenfees:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263132002521088', '列表', NULL, '', 0, '816260275719245824', 'gen:studenfees:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263309618712576', '添加', NULL, '', 0, '816260359466913792', 'gen:agreement:add', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263358813704192', '删除', NULL, '', 0, '816260359466913792', 'gen:agreement:remove', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263407287275520', '修改', NULL, '', 0, '816260359466913792', 'gen:agreement:edit', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('816263462450761728', '列表', NULL, '', 0, '816260359466913792', 'gen:agreement:list', 2, 'layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('818106036731908096', '首页', NULL, '/ServiceController/view', 0, '411522822607867904', 'system:service:view', 1, 'layui-icon layui-icon', NULL, 0);
INSERT INTO `t_sys_permission` VALUES ('824883376514273280', '列表', NULL, '', 0, '816260407663661056', 'gen:cost:list', 2, 'layui-icon layui-icon', 1, 0);
INSERT INTO `t_sys_permission` VALUES ('9', '角色管理', '角色展示', '/RoleController/view', 0, '411522822607867904', 'system:role:view', 1, 'fa fa-group', 2, 0);

-- ----------------------------
-- Table structure for t_sys_permission_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission_role`;
CREATE TABLE `t_sys_permission_role`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色id',
  `permission_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色权限中间表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_permission_role
-- ----------------------------
INSERT INTO `t_sys_permission_role` VALUES ('004f75aa-ab16-4845-88e3-0502fce8b16a', '488243256161730560', '815841252410003456');
INSERT INTO `t_sys_permission_role` VALUES ('00c15641-5cc8-4562-9e5e-7b6390b5568a', '488243256161730560', '332157860920299520');
INSERT INTO `t_sys_permission_role` VALUES ('01c6286a-d772-4f0b-bdcb-dbc362beef71', '824156312089792512', '816158211894808576');
INSERT INTO `t_sys_permission_role` VALUES ('01fe7e65-7e88-4b8f-bd1a-d29fa7aaca47', '817193761791676416', '816259612939522048');
INSERT INTO `t_sys_permission_role` VALUES ('0256888f-fc99-4067-85d6-9db8a8b4f724', '817193761791676416', '815842574962135040');
INSERT INTO `t_sys_permission_role` VALUES ('03d7c4ed-7e7c-4794-a85a-a1c1aafe6fda', '488243256161730560', '815841118792060928');
INSERT INTO `t_sys_permission_role` VALUES ('03e840de-b159-4b35-844f-b70e4a191c55', '817193761791676416', '816260170303803392');
INSERT INTO `t_sys_permission_role` VALUES ('0407398a-00cc-4ce8-9673-5fa1d680c880', '817193761791676416', '816263132002521088');
INSERT INTO `t_sys_permission_role` VALUES ('04540c83-e4d1-4ecb-b05a-def81fe76d31', '488243256161730560', '3734899074291507233');
INSERT INTO `t_sys_permission_role` VALUES ('04c8e637-2f78-42cb-b556-ddc1a6c43c23', '488243256161730560', '816254236697432064');
INSERT INTO `t_sys_permission_role` VALUES ('05063490-1600-4e47-931a-660be7242ece', '488243256161730560', '815836036423880704');
INSERT INTO `t_sys_permission_role` VALUES ('057dfdeb-d4c5-4ba2-ad9b-0ffdaa3fe13e', '488243256161730560', '816258499947401216');
INSERT INTO `t_sys_permission_role` VALUES ('05a59397-813f-4436-93d9-a5605f68acf7', '488243256161730560', '3400681518049566753');
INSERT INTO `t_sys_permission_role` VALUES ('05d822cf-ea68-48f8-834b-a60168e785e8', '824156448417255424', '816120264873086976');
INSERT INTO `t_sys_permission_role` VALUES ('0650e70a-2321-4fcd-a0ad-53a347550041', '824155946208071680', '816259376015872000');
INSERT INTO `t_sys_permission_role` VALUES ('066433e8-752b-4a1a-942a-b18dc0b9936e', '488243256161730560', '815503312752349184');
INSERT INTO `t_sys_permission_role` VALUES ('06a14cd6-2741-490f-a51d-00502c81062c', '488243256161730560', '4109898056992071702');
INSERT INTO `t_sys_permission_role` VALUES ('06d8ddf4-6059-4d33-b859-fa92337fa9e3', '488243256161730560', '617766548966211584');
INSERT INTO `t_sys_permission_role` VALUES ('0730e6fa-c2e9-4472-870e-b0f2330b2d6a', '488243256161730560', '816254086344216576');
INSERT INTO `t_sys_permission_role` VALUES ('07373247-6f26-4bcf-8a94-2ca3b55abe85', '816996635321176064', '815925725239578624');
INSERT INTO `t_sys_permission_role` VALUES ('0807faf1-0bc3-48af-9d03-d90ab8578c9c', '488243256161730560', '815494726655545344');
INSERT INTO `t_sys_permission_role` VALUES ('08687001-8260-4c9a-90d1-e287577d9318', '824156448417255424', '815481113651843072');
INSERT INTO `t_sys_permission_role` VALUES ('089a81ff-a46a-4951-8a4a-241be09e8b58', '488243256161730560', '8');
INSERT INTO `t_sys_permission_role` VALUES ('09861e74-6a52-423a-8967-47196f1a7b91', '824156448417255424', '816260407663661056');
INSERT INTO `t_sys_permission_role` VALUES ('0aef3816-91d9-4859-9901-4590c6150dfc', '488243256161730560', '815925397718962176');
INSERT INTO `t_sys_permission_role` VALUES ('0ba5407c-dc50-4858-bee9-544c69447d92', '488243256161730560', '18');
INSERT INTO `t_sys_permission_role` VALUES ('0bb784a7-92b8-40c6-bcb5-89e30721f9ab', '817193761791676416', '815840130760839168');
INSERT INTO `t_sys_permission_role` VALUES ('0c988e4b-41b8-4ddd-828b-2f497d5a1b04', '824155946208071680', '815840425607827456');
INSERT INTO `t_sys_permission_role` VALUES ('0d77696c-06ef-4b52-ac4f-e2f9b7750115', '824156448417255424', '815497319737856000');
INSERT INTO `t_sys_permission_role` VALUES ('0d81e327-cc1c-4af3-a84e-da86b605e8a5', '824156448417255424', '816126254532136960');
INSERT INTO `t_sys_permission_role` VALUES ('0dfde247-e133-4804-a24e-9b2968806bd6', '488243256161730560', '815481113651843072');
INSERT INTO `t_sys_permission_role` VALUES ('0e11a612-a8de-4cab-8200-62fa5cacd406', '488243256161730560', '6');
INSERT INTO `t_sys_permission_role` VALUES ('0e9cb52f-8571-4416-8a64-dcdae0103aee', '488243256161730560', '340127412270534656');
INSERT INTO `t_sys_permission_role` VALUES ('1063ee47-cb3a-46f9-9b7d-59893a468d3b', '824156448417255424', '816164034394066944');
INSERT INTO `t_sys_permission_role` VALUES ('10789b70-4a69-419d-bfae-ad5bcb26a0d4', '824155946208071680', '815842511758168064');
INSERT INTO `t_sys_permission_role` VALUES ('10eee8f1-ad2f-4ffc-91cb-e518750a9a62', '817193761791676416', '816164087447818240');
INSERT INTO `t_sys_permission_role` VALUES ('11a475bf-9de4-415e-b8cb-aaa078ea757a', '824155946208071680', '815836036423880704');
INSERT INTO `t_sys_permission_role` VALUES ('11c055af-b09f-44f0-b221-b85f1b5d0023', '488243256161730560', '592067570522128384');
INSERT INTO `t_sys_permission_role` VALUES ('1235ec44-7cda-4c57-8b22-c894867e0cc0', '817193761791676416', '815840505173774336');
INSERT INTO `t_sys_permission_role` VALUES ('12571f17-a2be-417b-a068-e4eba56b5617', '824156448417255424', '816160970572435456');
INSERT INTO `t_sys_permission_role` VALUES ('12fd0203-2d8f-4ddf-a6be-57372cbf5795', '488243256161730560', '815925206995570688');
INSERT INTO `t_sys_permission_role` VALUES ('13281c2a-9f9d-4009-be40-5efee3764c8c', '817193761791676416', '816258448713977856');
INSERT INTO `t_sys_permission_role` VALUES ('14231ced-adf3-48e0-b827-f8d562b63e04', '824155946208071680', '815549043534073856');
INSERT INTO `t_sys_permission_role` VALUES ('145df017-4d57-4508-9777-a782cd84eeb8', '824156312089792512', '816163356477100032');
INSERT INTO `t_sys_permission_role` VALUES ('14f2677c-4a9c-49b2-9af6-4e06e512ba6f', '488243256161730560', '586003694080753664');
INSERT INTO `t_sys_permission_role` VALUES ('15782191-2554-40d6-9a6a-9e8fd7d30c9d', '824156312089792512', '816164087447818240');
INSERT INTO `t_sys_permission_role` VALUES ('16b90d5c-90b0-49dd-ae39-146fe98f4351', '488243256161730560', '7');
INSERT INTO `t_sys_permission_role` VALUES ('1751d045-6969-4a73-8ddf-13d847e8e569', '488243256161730560', '816260170303803392');
INSERT INTO `t_sys_permission_role` VALUES ('17c06c09-31a3-4c68-a618-44317cb45a10', '824155946208071680', '816252833962790912');
INSERT INTO `t_sys_permission_role` VALUES ('18159221-d2f6-4be5-88f9-1de802d0a2c6', '817193761791676416', '816263309618712576');
INSERT INTO `t_sys_permission_role` VALUES ('19bf5d68-4269-48e3-8c6b-7e3ea3399f9b', '488243256161730560', '815924837875847168');
INSERT INTO `t_sys_permission_role` VALUES ('1b6da621-6876-4cb5-8993-bc668b3aa807', '488243256161730560', '3400681518049566731');
INSERT INTO `t_sys_permission_role` VALUES ('1bb54789-e9f8-4e7b-974d-5c7e69c2ab07', '816996635321176064', '815925397718962176');
INSERT INTO `t_sys_permission_role` VALUES ('1bd07f10-a998-4d5f-a566-f51d5a181343', '817193761791676416', '815841311293837312');
INSERT INTO `t_sys_permission_role` VALUES ('1bf67bf2-7326-4bb0-b997-d3ee3979926a', '488243256161730560', '3321578609202995211');
INSERT INTO `t_sys_permission_role` VALUES ('1c2d5494-bfbf-46b4-912a-6e00d0ca7949', '824155946208071680', '815840885056081920');
INSERT INTO `t_sys_permission_role` VALUES ('1d7b033b-8442-4e08-a2d3-8318975188d5', '824156448417255424', '815489107479367680');
INSERT INTO `t_sys_permission_role` VALUES ('1da58a04-b9db-4d4a-9db6-68fe37ec0de3', '824155946208071680', '815497319737856000');
INSERT INTO `t_sys_permission_role` VALUES ('1daf750b-a2a9-471f-8a98-d40d65e79c02', '817193761791676416', '816259833199202304');
INSERT INTO `t_sys_permission_role` VALUES ('1dcc007a-1af5-4fae-b85f-86dd7fbfcd36', '816996635321176064', '816253265544089600');
INSERT INTO `t_sys_permission_role` VALUES ('1f23fbd9-0bc5-4ae3-8475-6417089f3501', '488243256161730560', '815841311293837312');
INSERT INTO `t_sys_permission_role` VALUES ('21bd65ac-b85d-4b37-a20b-d731dcec1069', '488243256161730560', '816259267404369920');
INSERT INTO `t_sys_permission_role` VALUES ('2255ade3-e960-490c-9e11-32596ac92038', '488243256161730560', '340068151804956672');
INSERT INTO `t_sys_permission_role` VALUES ('2294122e-dc01-4059-93b3-f5dc4e4503d8', '817193761791676416', '816160970572435456');
INSERT INTO `t_sys_permission_role` VALUES ('23077f98-8f65-4b73-8382-7116ed05bb75', '816996635321176064', '815842649213898752');
INSERT INTO `t_sys_permission_role` VALUES ('23e5a094-d14c-446d-bac2-f9eeaa6ab06e', '488243256161730560', '816252983250653184');
INSERT INTO `t_sys_permission_role` VALUES ('24194193-953a-4a01-bb29-b6cb307a5fb1', '488243256161730560', '816260275719245824');
INSERT INTO `t_sys_permission_role` VALUES ('2464e5ef-7e22-4915-b022-f8f39457df9d', '824155946208071680', '815839799847030784');
INSERT INTO `t_sys_permission_role` VALUES ('251cee91-6d4a-4aac-aeff-a31413113d50', '824155946208071680', '815840505173774336');
INSERT INTO `t_sys_permission_role` VALUES ('25f60557-3bdf-49e0-975f-9da51f2895da', '488243256161730560', '816164034394066944');
INSERT INTO `t_sys_permission_role` VALUES ('27a5c043-ca4c-4bf2-8bbf-6136a4d0f954', '817193761791676416', '816163296032985088');
INSERT INTO `t_sys_permission_role` VALUES ('283c2921-287f-4c1f-bf2d-b8c8deeb9459', '816996635321176064', '815841118792060928');
INSERT INTO `t_sys_permission_role` VALUES ('28d7792a-379b-4fc4-895a-a8bf152348d3', '816996635321176064', '815489107479367680');
INSERT INTO `t_sys_permission_role` VALUES ('28e3f067-8841-4de3-96e3-a561a779dd19', '816996635321176064', '815481627315671040');
INSERT INTO `t_sys_permission_role` VALUES ('2909387e-36d5-4ed2-8463-4de57e2f117e', '824155946208071680', '815842273492340736');
INSERT INTO `t_sys_permission_role` VALUES ('290d70d7-f321-4370-be75-bf3b695589be', '824155946208071680', '816253265544089600');
INSERT INTO `t_sys_permission_role` VALUES ('29737ee3-2e38-4e36-96d2-0fb07050f822', '817193761791676416', '815925206995570688');
INSERT INTO `t_sys_permission_role` VALUES ('2a983fcf-43f2-49f4-b585-6e3a118fdd56', '488243256161730560', '4109898056992071713');
INSERT INTO `t_sys_permission_role` VALUES ('2ae879e3-c6bf-428c-904d-c499e9c42a5d', '824156448417255424', '815915559446253568');
INSERT INTO `t_sys_permission_role` VALUES ('2c6d2c1a-6ffa-4f5b-ac9d-a1180733f775', '824155946208071680', '816259424694964224');
INSERT INTO `t_sys_permission_role` VALUES ('2ca5319c-bf9b-4d97-942e-c121666f46e5', '488243256161730560', '574578311263555584');
INSERT INTO `t_sys_permission_role` VALUES ('2cf356a2-c6e0-4641-bf68-c7fbaf165c1f', '488243256161730560', '815503039682187264');
INSERT INTO `t_sys_permission_role` VALUES ('2d3f2e44-e324-49ee-9e79-960498602d5d', '816996635321176064', '816255780595568640');
INSERT INTO `t_sys_permission_role` VALUES ('2d54676b-c300-46ef-a6a6-0ed7ff021960', '824156448417255424', '815494576553988096');
INSERT INTO `t_sys_permission_role` VALUES ('2d99b263-736e-43f3-b403-ada1d6151c59', '817193761791676416', '816259765066928128');
INSERT INTO `t_sys_permission_role` VALUES ('2ddd90e9-f47b-45bf-a762-6be5b97b87d1', '488243256161730560', '816263014775918592');
INSERT INTO `t_sys_permission_role` VALUES ('2e08040c-49f5-4959-9854-fdf7f506a969', '488243256161730560', '12');
INSERT INTO `t_sys_permission_role` VALUES ('2e0da8e3-f9cd-41dd-acb8-5a8974f26e4e', '816996635321176064', '816255374993788928');
INSERT INTO `t_sys_permission_role` VALUES ('2f5c6bda-5d61-4f19-9765-6bf0ae2236bd', '817193761791676416', '816158211894808576');
INSERT INTO `t_sys_permission_role` VALUES ('2f798903-f40a-4e0c-b6e5-3010bd28ed19', '488243256161730560', '21');
INSERT INTO `t_sys_permission_role` VALUES ('2feb37d9-02fe-4a52-9cb9-18ee5457daad', '488243256161730560', '594691026430459904');
INSERT INTO `t_sys_permission_role` VALUES ('30174031-f11c-4ddc-a904-9f3484b96d9b', '816996635321176064', '815836036423880704');
INSERT INTO `t_sys_permission_role` VALUES ('314f98a6-7d63-4456-aacd-907c6087530d', '488243256161730560', '4107917018594058262');
INSERT INTO `t_sys_permission_role` VALUES ('316cd736-703c-4033-bf19-ee60fb1bf4eb', '824156448417255424', '816243037389852672');
INSERT INTO `t_sys_permission_role` VALUES ('3189781e-ab49-4f3a-8cc1-49045c64a0ed', '817193761791676416', '816255638895202304');
INSERT INTO `t_sys_permission_role` VALUES ('318e1fbd-12a5-4c61-b527-2981179a5dd4', '824155946208071680', '815925397718962176');
INSERT INTO `t_sys_permission_role` VALUES ('31a2f707-aa3d-4d12-b4b9-c69a89d8dd54', '817193761791676416', '815494576553988096');
INSERT INTO `t_sys_permission_role` VALUES ('31f2fe66-e163-4e58-9ed1-a94fe7b1e2ca', '817193761791676416', '816263358813704192');
INSERT INTO `t_sys_permission_role` VALUES ('31f4354c-ca19-4315-b2df-709d7f8866da', '816996635321176064', '816259684997664768');
INSERT INTO `t_sys_permission_role` VALUES ('3244c5be-fdc3-405f-a4aa-d2b89180492e', '488243256161730560', '6192095214866268161');
INSERT INTO `t_sys_permission_role` VALUES ('32a6d95a-34b8-4350-a5a1-10b8c1fff1f6', '824156448417255424', '816254188802674688');
INSERT INTO `t_sys_permission_role` VALUES ('32b433fb-c11f-41e9-a829-aaf493c490d8', '824155946208071680', '815925725239578624');
INSERT INTO `t_sys_permission_role` VALUES ('3317f9ae-34b2-490c-92e6-a6fd8a35e790', '488243256161730560', '824883376514273280');
INSERT INTO `t_sys_permission_role` VALUES ('33aca3eb-8d32-4c3b-9a78-3cdfc3083447', '488243256161730560', '3400880220181667862');
INSERT INTO `t_sys_permission_role` VALUES ('33b6391e-2f2c-446f-83d4-c142f5f5b5e7', '824155946208071680', '815926734250708992');
INSERT INTO `t_sys_permission_role` VALUES ('342045c0-9c06-494e-b3e8-6d8b2ed09080', '816996635321176064', '815390180746858496');
INSERT INTO `t_sys_permission_role` VALUES ('34435009-c2dd-45be-9a96-cbc3975aa23e', '816996635321176064', '816259267404369920');
INSERT INTO `t_sys_permission_role` VALUES ('351e05ea-52f7-4e96-8ece-95f20a64d23c', '488243256161730560', '816258388836093952');
INSERT INTO `t_sys_permission_role` VALUES ('35b4f622-9c42-4dcc-a932-d2e82c5fd0c8', '488243256161730560', '619836559427895296');
INSERT INTO `t_sys_permission_role` VALUES ('35fa021e-104d-4187-a352-eb6370cfe26a', '824155946208071680', '815924837875847168');
INSERT INTO `t_sys_permission_role` VALUES ('3643d189-13a3-423a-a755-196da2e4e345', '817193761791676416', '815489333413941248');
INSERT INTO `t_sys_permission_role` VALUES ('36b22c44-69bb-44e4-b915-0f4f9f8b92bf', '817193761791676416', '816163356477100032');
INSERT INTO `t_sys_permission_role` VALUES ('3712a83e-c387-4fd4-b4b6-2159a8a3fb6f', '824156448417255424', '815502654288564224');
INSERT INTO `t_sys_permission_role` VALUES ('3769a308-a8bc-47da-9fe8-3bb787a23608', '488243256161730560', '816258936121462784');
INSERT INTO `t_sys_permission_role` VALUES ('37a05d2a-dc79-430d-a4bf-3911e452873f', '817193761791676416', '816169230755041280');
INSERT INTO `t_sys_permission_role` VALUES ('37ba55c2-87e8-4ad9-96ef-715786e258e3', '824155946208071680', '815915559446253568');
INSERT INTO `t_sys_permission_role` VALUES ('37e72e14-546f-4f1e-8b16-2c7eb6f5ce92', '488243256161730560', '815925725239578624');
INSERT INTO `t_sys_permission_role` VALUES ('3933782e-63f0-4bb6-82bf-e12da61b39cd', '824156448417255424', '816163716390326272');
INSERT INTO `t_sys_permission_role` VALUES ('397b0bdd-7deb-4d1c-8934-18a815601ca9', '488243256161730560', '6189186317948026883');
INSERT INTO `t_sys_permission_role` VALUES ('3980f6e1-1def-4a66-8aaa-71e257402275', '488243256161730560', '815924727876030464');
INSERT INTO `t_sys_permission_role` VALUES ('39c9d2d6-dfbf-4f84-bdfc-16fab47468a8', '817193761791676416', '816254138642993152');
INSERT INTO `t_sys_permission_role` VALUES ('3a359732-503e-44f3-b186-1d2242a35760', '817193761791676416', '816255535061012480');
INSERT INTO `t_sys_permission_role` VALUES ('3a6445d0-6724-4ae1-bf02-45a7b5d3f0c4', '488243256161730560', '816262948849848320');
INSERT INTO `t_sys_permission_role` VALUES ('3b26412e-b7e4-4d80-ad81-ed3d3aa29a7e', '488243256161730560', '5946910264304599041');
INSERT INTO `t_sys_permission_role` VALUES ('3bc239eb-90db-4e75-ae74-c416ce483433', '817193761791676416', '816252575753048064');
INSERT INTO `t_sys_permission_role` VALUES ('3c0c11fc-4b72-4f02-8c20-49f69464d015', '817193761791676416', '815841036726308864');
INSERT INTO `t_sys_permission_role` VALUES ('3c75b7b1-2997-43f0-9e35-39bb4c4265fd', '816996635321176064', '816260359466913792');
INSERT INTO `t_sys_permission_role` VALUES ('3c9f691d-3b37-41c4-8619-b608cc12ad74', '824156448417255424', '816096206227902464');
INSERT INTO `t_sys_permission_role` VALUES ('3d1c5a0b-4e4f-41e7-b66e-bb6da6dc74fd', '817193761791676416', '815840971051896832');
INSERT INTO `t_sys_permission_role` VALUES ('3d762e14-42bd-4f00-ae4b-1b86d365cc2e', '488243256161730560', '592059865673760768');
INSERT INTO `t_sys_permission_role` VALUES ('3dcc73c6-b41a-4697-8f57-1f475d60ce1e', '488243256161730560', '816163782828101632');
INSERT INTO `t_sys_permission_role` VALUES ('3f11455e-ecb7-48a9-a753-0b6ac25188ba', '817193761791676416', '816163661193285632');
INSERT INTO `t_sys_permission_role` VALUES ('3f132df4-22a4-43f5-bed7-94b8ff197ec0', '816996635321176064', '815489333413941248');
INSERT INTO `t_sys_permission_role` VALUES ('3f97f411-3183-4590-a54b-6fce3e6102de', '817193761791676416', '816263014775918592');
INSERT INTO `t_sys_permission_role` VALUES ('3fe78e4f-5c09-4b3d-b1ac-5076539231d9', '488243256161730560', '610635485890478080');
INSERT INTO `t_sys_permission_role` VALUES ('40326807-6098-421c-8fb8-b914f64439de', '824155946208071680', '815488644751167488');
INSERT INTO `t_sys_permission_role` VALUES ('41c0cf9e-c739-401f-af1d-9b8d1630b8c0', '824156448417255424', '816096144269643776');
INSERT INTO `t_sys_permission_role` VALUES ('432e3f83-6e2a-47da-817f-08636a6c73c8', '817193761791676416', '816259424694964224');
INSERT INTO `t_sys_permission_role` VALUES ('4358e19f-6778-4340-b62b-813079e4617a', '817193761791676416', '816252983250653184');
INSERT INTO `t_sys_permission_role` VALUES ('4503ec42-8e60-4537-82d8-8e0681473582', '488243256161730560', '816166167587721216');
INSERT INTO `t_sys_permission_role` VALUES ('453d189e-7735-4c51-83c5-ce93deaa7fd3', '488243256161730560', '815503168170496000');
INSERT INTO `t_sys_permission_role` VALUES ('45d73cc6-988e-400d-ab4e-89a363e19d6c', '817193761791676416', '815924837875847168');
INSERT INTO `t_sys_permission_role` VALUES ('46717e1e-bc88-4057-b8aa-40d075330acc', '488243256161730560', '816259684997664768');
INSERT INTO `t_sys_permission_role` VALUES ('46a81d3f-7ac9-477c-9f8f-b36a1ba6610e', '817193761791676416', '815842273492340736');
INSERT INTO `t_sys_permission_role` VALUES ('48978d2a-5339-41d1-93d7-3a1cab019f8b', '488243256161730560', '4109898056992071724');
INSERT INTO `t_sys_permission_role` VALUES ('48b11135-2541-45c2-be59-5fc915c9c4d6', '488243256161730560', '5946910264304599042');
INSERT INTO `t_sys_permission_role` VALUES ('48e5066c-a390-425f-85d7-ab9970729a59', '488243256161730560', '574578311267749891');
INSERT INTO `t_sys_permission_role` VALUES ('49625ae9-145b-4881-8002-47154ab1cdbf', '817193761791676416', '816254188802674688');
INSERT INTO `t_sys_permission_role` VALUES ('4985824d-2ef8-477a-9921-9ad957fb83f5', '488243256161730560', '3400681518049566742');
INSERT INTO `t_sys_permission_role` VALUES ('49f7da11-294a-4e45-bbd3-af506c51ee6c', '488243256161730560', '496127794879660032');
INSERT INTO `t_sys_permission_role` VALUES ('4a767228-1ae9-429c-8f52-4f462c7a5f8c', '824155946208071680', '815840130760839168');
INSERT INTO `t_sys_permission_role` VALUES ('4ac5db31-c9a7-4ea5-b984-71ae118dbf4d', '817193761791676416', '816255844206383104');
INSERT INTO `t_sys_permission_role` VALUES ('4b49b36e-2520-44a7-a686-7f601403d02d', '488243256161730560', '3401274122705346604');
INSERT INTO `t_sys_permission_role` VALUES ('4b6493c9-c78f-45ac-9268-de9d3e097fd1', '488243256161730560', '496126970468237312');
INSERT INTO `t_sys_permission_role` VALUES ('4b723e29-fcd6-45b1-890e-ca6da3ead509', '488243256161730560', '815926672141455360');
INSERT INTO `t_sys_permission_role` VALUES ('4bcb5f5c-7e4c-452f-9643-0cdf6839da60', '488243256161730560', '815840130760839168');
INSERT INTO `t_sys_permission_role` VALUES ('4c112e01-3d22-4af6-8bd4-032f2f0cdac1', '816996635321176064', '816260170303803392');
INSERT INTO `t_sys_permission_role` VALUES ('4c7a608b-fa8c-49af-ba2f-5ce0d8c00a3d', '824155946208071680', '816255638895202304');
INSERT INTO `t_sys_permission_role` VALUES ('4c87c4b0-38a9-415d-aaaf-bce2aaa4d7a1', '816996635321176064', '816166450871013376');
INSERT INTO `t_sys_permission_role` VALUES ('4c87c628-070e-430a-bc0d-1dac95affd99', '488243256161730560', '816163296032985088');
INSERT INTO `t_sys_permission_role` VALUES ('4d1857e2-cd41-43fb-9f2d-8718457a951b', '488243256161730560', '816255535061012480');
INSERT INTO `t_sys_permission_role` VALUES ('4da1e90b-e1be-4fce-879f-cf749bcb3ef2', '488243256161730560', '11');
INSERT INTO `t_sys_permission_role` VALUES ('4dc0bef4-8d0b-4ae6-8070-0e4c9c1c4dc6', '816996635321176064', '815926838709850112');
INSERT INTO `t_sys_permission_role` VALUES ('4de5179d-b7bf-48fd-888d-23fb3bbb3f8c', '824155946208071680', '815926787379957760');
INSERT INTO `t_sys_permission_role` VALUES ('4e244c5c-9891-476e-b701-bd3adfead2bc', '824156312089792512', '816120264873086976');
INSERT INTO `t_sys_permission_role` VALUES ('4f3ca11a-fb87-47c4-b4df-2265f26f7273', '488243256161730560', '816120264873086976');
INSERT INTO `t_sys_permission_role` VALUES ('4f98a59f-aecb-4777-9789-0e6f05570f18', '488243256161730560', '410791701859405824');
INSERT INTO `t_sys_permission_role` VALUES ('4fe33bf8-1b5f-40aa-adcd-a1c574617c4a', '824155946208071680', '815481627315671040');
INSERT INTO `t_sys_permission_role` VALUES ('506536e0-427a-41af-9f50-b7fc87412102', '824155946208071680', '816258987820453888');
INSERT INTO `t_sys_permission_role` VALUES ('508b6899-6232-40df-b1e5-f3237bdf2356', '488243256161730560', '15');
INSERT INTO `t_sys_permission_role` VALUES ('5090fc69-2575-4b78-9830-e7d48f8a9133', '488243256161730560', '815840505173774336');
INSERT INTO `t_sys_permission_role` VALUES ('50f37b0f-0fec-45c4-9bc7-ddd1f4d21062', '488243256161730560', '340088022018166784');
INSERT INTO `t_sys_permission_role` VALUES ('520c676a-00de-4a95-a520-3e46d8184f63', '816996635321176064', '816252575753048064');
INSERT INTO `t_sys_permission_role` VALUES ('524e2622-dee3-4ada-8bc8-49ab1ec21dd4', '488243256161730560', '816255844206383104');
INSERT INTO `t_sys_permission_role` VALUES ('5250b808-6c6c-4b59-9669-73608567c4f5', '488243256161730560', '816096144269643776');
INSERT INTO `t_sys_permission_role` VALUES ('529d406c-c76a-480e-8114-2272ef2b67cb', '488243256161730560', '5');
INSERT INTO `t_sys_permission_role` VALUES ('52b9f619-3fbe-4558-9e18-c7f42cb76894', '824155946208071680', '816259053163515904');
INSERT INTO `t_sys_permission_role` VALUES ('52d3765c-b986-44d5-87da-0f5821fe13c2', '817193761791676416', '816096206227902464');
INSERT INTO `t_sys_permission_role` VALUES ('540b7bdc-1f5c-496e-93fc-aa8af730eb61', '817193761791676416', '816096033389023232');
INSERT INTO `t_sys_permission_role` VALUES ('5552a781-60f5-4ac5-b463-668c66eb71ff', '824155946208071680', '816255780595568640');
INSERT INTO `t_sys_permission_role` VALUES ('56732e63-a530-4967-899f-814e15a3510b', '488243256161730560', '815489107479367680');
INSERT INTO `t_sys_permission_role` VALUES ('5770d963-2256-4364-80f1-da3be15c1be6', '488243256161730560', '815841429782925312');
INSERT INTO `t_sys_permission_role` VALUES ('57da83f1-5e1d-48fc-819c-b944086ea9fe', '488243256161730560', '816263132002521088');
INSERT INTO `t_sys_permission_role` VALUES ('590e8825-db97-4021-a277-033f562b48d4', '817193761791676416', '816163485003157504');
INSERT INTO `t_sys_permission_role` VALUES ('59745d7b-f178-453a-a7d1-c5a2b60f20e4', '817193761791676416', '815839799847030784');
INSERT INTO `t_sys_permission_role` VALUES ('5a3389d6-fa17-4d79-8f23-d6faa29339ef', '817193761791676416', '816163883176824832');
INSERT INTO `t_sys_permission_role` VALUES ('5a50aa3a-bd83-4c60-bba0-e8937f31d9ba', '488243256161730560', '22');
INSERT INTO `t_sys_permission_role` VALUES ('5ac22569-45f9-4192-be81-558d8d775be2', '817193761791676416', '816259684997664768');
INSERT INTO `t_sys_permission_role` VALUES ('5ac3a7b9-81c9-4101-a19b-d1d0f0312e8c', '488243256161730560', '816263077514317824');
INSERT INTO `t_sys_permission_role` VALUES ('5c3a5153-b5ef-4319-8594-d7c04406b9b4', '488243256161730560', '3321578609202995222');
INSERT INTO `t_sys_permission_role` VALUES ('5d4422db-73a1-4de0-b3d8-56b0eafe3a3e', '816996635321176064', '815841495969042432');
INSERT INTO `t_sys_permission_role` VALUES ('5d62bf9c-fe9b-4571-b99d-1a6b9860d1c9', '488243256161730560', '581541547099553792');
INSERT INTO `t_sys_permission_role` VALUES ('5dc60ff0-10f7-4575-a78b-e0b4485708bd', '817193761791676416', '816259376015872000');
INSERT INTO `t_sys_permission_role` VALUES ('5e2c36e2-0842-4557-a718-49299ba62fd9', '824156448417255424', '816163782828101632');
INSERT INTO `t_sys_permission_role` VALUES ('5ea5f811-78e3-4615-807a-d1a5c02d5a59', '488243256161730560', '3303650266428252171');
INSERT INTO `t_sys_permission_role` VALUES ('5ed26da9-b644-4f43-9fe5-348cd0e0d6a2', '817193761791676416', '816096089735303168');
INSERT INTO `t_sys_permission_role` VALUES ('5ed41c93-38e8-4684-b86e-93d53449fb15', '488243256161730560', '3303650266428252193');
INSERT INTO `t_sys_permission_role` VALUES ('5f5d37b5-9520-4371-9200-c2b6e45c7ac1', '817193761791676416', '816095890510057472');
INSERT INTO `t_sys_permission_role` VALUES ('5fa2d834-df47-4594-a86d-657473168d4e', '488243256161730560', '816263462450761728');
INSERT INTO `t_sys_permission_role` VALUES ('5fc8a8d8-bc81-4e4c-b290-6a5165b58125', '488243256161730560', '816163485003157504');
INSERT INTO `t_sys_permission_role` VALUES ('60851e6b-67df-4616-9e7d-748ee834b7ee', '817193761791676416', '816263407287275520');
INSERT INTO `t_sys_permission_role` VALUES ('60e1d4d4-dbff-454c-8da8-c616f327d558', '488243256161730560', '816258987820453888');
INSERT INTO `t_sys_permission_role` VALUES ('60e509fc-7628-49c9-975e-c66dc3237553', '816996635321176064', '815840130760839168');
INSERT INTO `t_sys_permission_role` VALUES ('6113877c-8b37-40c5-9e22-aeed06aea2dc', '488243256161730560', '816169230755041280');
INSERT INTO `t_sys_permission_role` VALUES ('611f3f7a-7605-42bb-97cd-d81d6a20a605', '824155946208071680', '816258388836093952');
INSERT INTO `t_sys_permission_role` VALUES ('6163062d-91d0-4abc-8de2-c2d26951e7a8', '817193761791676416', '816163953989259264');
INSERT INTO `t_sys_permission_role` VALUES ('616e66dd-01f9-49c7-8a2d-a6a5196024e1', '488243256161730560', '815926734250708992');
INSERT INTO `t_sys_permission_role` VALUES ('61af79ea-4e43-428e-82cc-f2a9c520d892', '817193761791676416', '816255374993788928');
INSERT INTO `t_sys_permission_role` VALUES ('628dee69-c560-4fc1-83c2-713839b3cc7c', '488243256161730560', '816096033389023232');
INSERT INTO `t_sys_permission_role` VALUES ('6331c6cb-25a7-4abb-9421-aef37d5c737a', '817193761791676416', '816253265544089600');
INSERT INTO `t_sys_permission_role` VALUES ('635f78af-7c34-429d-adb3-9de989f39666', '824156448417255424', '815390180746858496');
INSERT INTO `t_sys_permission_role` VALUES ('63e70d38-f67b-48f9-9851-5739a2dc6aa2', '817193761791676416', '815489107479367680');
INSERT INTO `t_sys_permission_role` VALUES ('65431c97-0d49-42ab-a8b8-0bf968e710fe', '824156448417255424', '816166167587721216');
INSERT INTO `t_sys_permission_role` VALUES ('655cfa9d-2cda-43bd-857f-41cd625c990f', '816996635321176064', '816096206227902464');
INSERT INTO `t_sys_permission_role` VALUES ('65817ab9-9ec9-49c2-bdee-6937bb48d627', '824156312089792512', '816163661193285632');
INSERT INTO `t_sys_permission_role` VALUES ('65a6a35f-6ee8-42ef-822a-f42ae847bceb', '488243256161730560', '816160970572435456');
INSERT INTO `t_sys_permission_role` VALUES ('65c758d0-5e9c-46c0-bdd2-e68ea6c7f5a8', '824155946208071680', '816252439824044032');
INSERT INTO `t_sys_permission_role` VALUES ('65e2d114-8e76-4364-ac3d-01005cb8db20', '817193761791676416', '816258388836093952');
INSERT INTO `t_sys_permission_role` VALUES ('675b72ce-bc2a-4baa-8747-8bb0cc866c8a', '824156312089792512', '816163485003157504');
INSERT INTO `t_sys_permission_role` VALUES ('680748ef-88ab-447e-a259-afb86cf044a2', '488243256161730560', '3401274122705346571');
INSERT INTO `t_sys_permission_role` VALUES ('68e6ca3b-52db-497e-a860-c0ed5706d6bf', '488243256161730560', '6192095215075983363');
INSERT INTO `t_sys_permission_role` VALUES ('6a5510ae-99ac-417b-8d65-ea4c0dd6fbf3', '488243256161730560', '3734899074291507244');
INSERT INTO `t_sys_permission_role` VALUES ('6a872e6f-3468-4c3d-97d2-777d08387b66', '488243256161730560', '3400961831355064364');
INSERT INTO `t_sys_permission_role` VALUES ('6a87e444-4984-4d8a-9933-6f2f581c44ad', '824155946208071680', '815842384419098624');
INSERT INTO `t_sys_permission_role` VALUES ('6b650346-62a8-4718-a1c1-2d2787f455ec', '488243256161730560', '3328572814798397473');
INSERT INTO `t_sys_permission_role` VALUES ('6b79b9dc-66f8-4aa8-ba25-09c33c403a61', '817193761791676416', '816252439824044032');
INSERT INTO `t_sys_permission_role` VALUES ('6bf5f6d8-bbae-4785-9710-33237adfea5e', '824156448417255424', '815481627315671040');
INSERT INTO `t_sys_permission_role` VALUES ('6c4d1421-1438-4f9d-bc63-96ca1d0bb101', '488243256161730560', '816163883176824832');
INSERT INTO `t_sys_permission_role` VALUES ('6c4efff8-2e2e-4c6d-8fdb-a6aa7d48ee59', '824155946208071680', '816258448713977856');
INSERT INTO `t_sys_permission_role` VALUES ('6c68ea71-ee7c-4d11-9125-92cb00e64790', '488243256161730560', '411522822607867904');
INSERT INTO `t_sys_permission_role` VALUES ('6ce2dc62-a9fb-4408-acd2-fc519d266b8b', '824156448417255424', '816263132002521088');
INSERT INTO `t_sys_permission_role` VALUES ('6ce8900a-7f55-4795-9eb2-c2af996734b6', '816996635321176064', '815481113651843072');
INSERT INTO `t_sys_permission_role` VALUES ('6d4413d0-2ab2-4910-b0be-ada048a97b99', '824155946208071680', '816252983250653184');
INSERT INTO `t_sys_permission_role` VALUES ('6d5fbcd1-448f-406f-ac59-e1d9eb6c3c61', '488243256161730560', '3401274122705346593');
INSERT INTO `t_sys_permission_role` VALUES ('6f24071d-15b7-4d2f-9220-95939a9d8ca2', '817193761791676416', '815840425607827456');
INSERT INTO `t_sys_permission_role` VALUES ('6f476cd3-debd-4fc0-b00e-7caedb097e31', '488243256161730560', '816263358813704192');
INSERT INTO `t_sys_permission_role` VALUES ('70d0f06e-d400-4b35-8c26-c5586418f769', '488243256161730560', '815497319737856000');
INSERT INTO `t_sys_permission_role` VALUES ('70f865de-3357-4e26-b4d3-cdc347167d53', '488243256161730560', '340067579836108800');
INSERT INTO `t_sys_permission_role` VALUES ('711489e9-145b-4bb3-9506-30e2dc374c47', '816996635321176064', '815915559446253568');
INSERT INTO `t_sys_permission_role` VALUES ('71415d4a-dd3a-4c43-ba4b-a84b38bc29b3', '488243256161730560', '331778807298134016');
INSERT INTO `t_sys_permission_role` VALUES ('71c383f9-be8a-46f5-91b4-d790f0ac7d40', '488243256161730560', '330365026642825216');
INSERT INTO `t_sys_permission_role` VALUES ('72278ca1-5ab8-48cd-bf4b-e56fe42948dc', '488243256161730560', '16');
INSERT INTO `t_sys_permission_role` VALUES ('72eee697-4540-4a88-99aa-d5bdc1d0decb', '488243256161730560', '815842649213898752');
INSERT INTO `t_sys_permission_role` VALUES ('72f53434-37dc-40f4-b362-9510c0b37541', '488243256161730560', '4107917018594058284');
INSERT INTO `t_sys_permission_role` VALUES ('736f8831-9c6d-45a6-ac5e-6d6aea1643ec', '824155946208071680', '815489333413941248');
INSERT INTO `t_sys_permission_role` VALUES ('73851166-211a-46ef-8949-b890866f230d', '817193761791676416', '816259053163515904');
INSERT INTO `t_sys_permission_role` VALUES ('73abc377-1320-4f49-9f84-6a2e32ef3406', '817193761791676416', '816163716390326272');
INSERT INTO `t_sys_permission_role` VALUES ('744171e1-5a1e-4c01-91e3-25cae9b154df', '488243256161730560', '4107917018594058273');
INSERT INTO `t_sys_permission_role` VALUES ('746b84cf-fe3c-41f1-be7e-28721bdce74c', '488243256161730560', '815503623202148352');
INSERT INTO `t_sys_permission_role` VALUES ('74899ac8-7508-40cb-86e9-9f85840e6552', '817193761791676416', '815494406101667840');
INSERT INTO `t_sys_permission_role` VALUES ('74ad10eb-a986-4102-883b-2c28b0783e06', '488243256161730560', '816253046144241664');
INSERT INTO `t_sys_permission_role` VALUES ('770b23a9-7265-4acd-84a8-c5dc765d2564', '488243256161730560', '816096089735303168');
INSERT INTO `t_sys_permission_role` VALUES ('772cbc11-bf82-4893-be73-cadc6b178736', '488243256161730560', '574578311267749889');
INSERT INTO `t_sys_permission_role` VALUES ('78148207-2697-4e70-8dc9-5b7d38b2419b', '824155946208071680', '816259326384672768');
INSERT INTO `t_sys_permission_role` VALUES ('7963100d-be9d-43de-b40b-f2cb861a4a78', '488243256161730560', '815489333413941248');
INSERT INTO `t_sys_permission_role` VALUES ('79cfb7bd-6e54-4c88-ad4d-4af4cdc024a7', '817193761791676416', '816126254532136960');
INSERT INTO `t_sys_permission_role` VALUES ('7a2c9539-2e39-42de-80f6-5be470fb9192', '817193761791676416', '816263077514317824');
INSERT INTO `t_sys_permission_role` VALUES ('7a403d35-43f5-491d-86a6-c2c398575f71', '488243256161730560', '816163356477100032');
INSERT INTO `t_sys_permission_role` VALUES ('7c246cc2-728d-4479-b228-c7b2fa90189b', '817193761791676416', '816263462450761728');
INSERT INTO `t_sys_permission_role` VALUES ('7c735e5a-8e09-4854-bf73-b73ecaa99a32', '488243256161730560', '340096183135506432');
INSERT INTO `t_sys_permission_role` VALUES ('7c83f09d-a687-4492-99e1-9f4057dac346', '824155946208071680', '815840276072501248');
INSERT INTO `t_sys_permission_role` VALUES ('7c92258f-a132-4ca6-ba70-6e36ca3d0849', '488243256161730560', '574578311267749888');
INSERT INTO `t_sys_permission_role` VALUES ('7d9ca209-6073-4304-b3da-c3c649962196', '816996635321176064', '815549043534073856');
INSERT INTO `t_sys_permission_role` VALUES ('7e720971-7a53-4a29-87c7-5d7914d2e026', '488243256161730560', '815502654288564224');
INSERT INTO `t_sys_permission_role` VALUES ('7e77bcfb-c7a4-40db-9e06-b016243fbc22', '824155946208071680', '815840971051896832');
INSERT INTO `t_sys_permission_role` VALUES ('7f25e2b1-cdcd-4865-a55f-97c954c078be', '824155946208071680', '815925206995570688');
INSERT INTO `t_sys_permission_role` VALUES ('7f7f3736-a3e1-43ef-a321-f98a25de4401', '817193761791676416', '815841118792060928');
INSERT INTO `t_sys_permission_role` VALUES ('7f959ecd-cd65-4053-a4cc-eff351b37847', '488243256161730560', '816259326384672768');
INSERT INTO `t_sys_permission_role` VALUES ('7fab38f2-13c5-4a4a-8983-341d1cf941cc', '817193761791676416', '816260407663661056');
INSERT INTO `t_sys_permission_role` VALUES ('7fc5db0a-2ac3-4215-98b3-b06a4e088b7f', '488243256161730560', '3400961831355064353');
INSERT INTO `t_sys_permission_role` VALUES ('80592ed4-1ae3-4f78-a490-43ca53870d91', '488243256161730560', '19');
INSERT INTO `t_sys_permission_role` VALUES ('80ae4421-4a39-498d-8df1-6590ebfb5e49', '488243256161730560', '4');
INSERT INTO `t_sys_permission_role` VALUES ('810ecaba-2d94-457b-9d29-e09558aa7bff', '488243256161730560', '815841495969042432');
INSERT INTO `t_sys_permission_role` VALUES ('820134f9-2ef4-4c2c-b72b-0cf5bf387e01', '817193761791676416', '816262948849848320');
INSERT INTO `t_sys_permission_role` VALUES ('82119e47-1974-4687-bdcf-6559cf278355', '824156448417255424', '815494406101667840');
INSERT INTO `t_sys_permission_role` VALUES ('824f98db-eb66-4dab-9309-6642606fbbc4', '488243256161730560', '589559748521623552');
INSERT INTO `t_sys_permission_role` VALUES ('828dc645-d22c-4222-a0b2-6451a701c73b', '488243256161730560', '816243037389852672');
INSERT INTO `t_sys_permission_role` VALUES ('83193bd5-1fc1-45e1-97da-8ef35d1864ce', '824156448417255424', '815503312752349184');
INSERT INTO `t_sys_permission_role` VALUES ('842a813b-c057-43a3-8b3e-926005f5b4b9', '817193761791676416', '815840588338434048');
INSERT INTO `t_sys_permission_role` VALUES ('849f9a7b-8d29-4b97-b5f7-082fae45f55c', '488243256161730560', '3734899074291507222');
INSERT INTO `t_sys_permission_role` VALUES ('84c0ce47-adc1-48b7-a65d-67c2d700eb59', '488243256161730560', '815915559446253568');
INSERT INTO `t_sys_permission_role` VALUES ('850cdae5-af39-4c50-80b3-c080226e82c7', '824155946208071680', '816252385335840768');
INSERT INTO `t_sys_permission_role` VALUES ('8521007c-a9f3-4c83-a648-80c611134114', '824155946208071680', '815481113651843072');
INSERT INTO `t_sys_permission_role` VALUES ('861f99f5-b686-4380-989b-98e8f91d58ce', '488243256161730560', '9');
INSERT INTO `t_sys_permission_role` VALUES ('869aa456-fa1f-4770-b2b2-917478fc6060', '488243256161730560', '816252492978458624');
INSERT INTO `t_sys_permission_role` VALUES ('8791c5c3-c09b-4f1f-9369-f407a971943f', '816996635321176064', '816259376015872000');
INSERT INTO `t_sys_permission_role` VALUES ('8803937a-d375-4663-b251-1618e277cf44', '817193761791676416', '816163603764875264');
INSERT INTO `t_sys_permission_role` VALUES ('8827978f-aefc-4e72-9de6-31c864d23f66', '817193761791676416', '815494726655545344');
INSERT INTO `t_sys_permission_role` VALUES ('890413bd-2301-4d76-b4aa-2aba944b5adc', '824155946208071680', '816258936121462784');
INSERT INTO `t_sys_permission_role` VALUES ('8916e246-ccbe-4565-b834-97df94df8847', '488243256161730560', '6189186317989969924');
INSERT INTO `t_sys_permission_role` VALUES ('891756b4-cb17-406f-8fa8-cda1a7dc82a1', '824155946208071680', '815924727876030464');
INSERT INTO `t_sys_permission_role` VALUES ('89b5c981-b9a5-41c7-9ebb-35830ec08e45', '824156448417255424', '816254086344216576');
INSERT INTO `t_sys_permission_role` VALUES ('8a03b144-ea02-4da3-8a1d-04713d4c6e72', '816996635321176064', '815488644751167488');
INSERT INTO `t_sys_permission_role` VALUES ('8a0aa314-e763-4506-9852-dfb9d530e011', '488243256161730560', '3303650266428252182');
INSERT INTO `t_sys_permission_role` VALUES ('8b7d2793-b127-4b5c-852c-430a68dc1ba8', '824155946208071680', '816253046144241664');
INSERT INTO `t_sys_permission_role` VALUES ('8c0cfae3-6dd7-4ee0-a7da-1a34768d6c95', '824155946208071680', '815841429782925312');
INSERT INTO `t_sys_permission_role` VALUES ('8c6ca690-514c-4a60-9fe8-792a0eb26bde', '488243256161730560', '816260359466913792');
INSERT INTO `t_sys_permission_role` VALUES ('8c8fc544-f1c2-47d9-8a6e-f47604b695ca', '488243256161730560', '587453033487532032');
INSERT INTO `t_sys_permission_role` VALUES ('8cc0b0c8-d36c-4193-bfb0-bd9c537cb88f', '488243256161730560', '816263309618712576');
INSERT INTO `t_sys_permission_role` VALUES ('8cfe2860-c690-41c0-8d79-bcf6b94fe50b', '824155946208071680', '815915880369229824');
INSERT INTO `t_sys_permission_role` VALUES ('8d6d5924-27c1-46ca-939b-a5afb7f2933c', '816996635321176064', '816096033389023232');
INSERT INTO `t_sys_permission_role` VALUES ('8e368736-8d4f-4532-b811-08335d1874c1', '488243256161730560', '610635950447394816');
INSERT INTO `t_sys_permission_role` VALUES ('8ea14587-7dfa-4696-93da-aff2b3f02933', '488243256161730560', '815488644751167488');
INSERT INTO `t_sys_permission_role` VALUES ('8f15a8ee-eadd-4658-ae6d-a27465235874', '817193761791676416', '816253046144241664');
INSERT INTO `t_sys_permission_role` VALUES ('8f7ada2b-4966-4e9c-a893-7ea5f948b2cf', '824156312089792512', '816163953989259264');
INSERT INTO `t_sys_permission_role` VALUES ('8fa3965b-972a-45b6-bb4f-524648fd407e', '488243256161730560', '816259765066928128');
INSERT INTO `t_sys_permission_role` VALUES ('8fd2a2fa-6532-4cb9-8d6d-c0f41299e4d0', '817193761791676416', '816120264873086976');
INSERT INTO `t_sys_permission_role` VALUES ('8fdd0260-e086-4367-8296-27db615630d8', '824156448417255424', '815503039682187264');
INSERT INTO `t_sys_permission_role` VALUES ('8fe56410-ff97-4a4e-a565-3ebf7bb2e6b3', '488243256161730560', '816163716390326272');
INSERT INTO `t_sys_permission_role` VALUES ('90b2b913-6e99-4b66-881c-5ba5e2dd4ec3', '488243256161730560', '816255638895202304');
INSERT INTO `t_sys_permission_role` VALUES ('91ac3de2-01e0-45d6-aac7-a758a899217e', '816996635321176064', '816255638895202304');
INSERT INTO `t_sys_permission_role` VALUES ('91f30de7-5f83-4d0e-8045-8f2fa9526860', '824156448417255424', '815503168170496000');
INSERT INTO `t_sys_permission_role` VALUES ('92df7d12-0cc5-48a0-b829-73164f9a5070', '488243256161730560', '20');
INSERT INTO `t_sys_permission_role` VALUES ('943d1f6c-e09f-4f6d-ab7b-7adb26bda5a1', '817193761791676416', '816166167587721216');
INSERT INTO `t_sys_permission_role` VALUES ('943d25e5-8216-403b-9b41-b4013a660d6f', '488243256161730560', '3321578609202995244');
INSERT INTO `t_sys_permission_role` VALUES ('94ab432f-e943-407e-a3b2-08d11dec22e1', '824156448417255424', '815488644751167488');
INSERT INTO `t_sys_permission_role` VALUES ('94d91f77-e349-42fa-840b-b9d067312420', '817193761791676416', '815842511758168064');
INSERT INTO `t_sys_permission_role` VALUES ('951f4586-8a08-488c-a086-e7998c8b56a3', '817193761791676416', '818106036731908096');
INSERT INTO `t_sys_permission_role` VALUES ('95502b5f-6b01-441f-94a1-4d9ce7bd3190', '817193761791676416', '815915880369229824');
INSERT INTO `t_sys_permission_role` VALUES ('9560a718-288e-4322-856a-ea13d234aa9b', '488243256161730560', '816259376015872000');
INSERT INTO `t_sys_permission_role` VALUES ('963f6cfc-297a-443f-8165-bb6ad0a28220', '824155946208071680', '815841311293837312');
INSERT INTO `t_sys_permission_role` VALUES ('96fdd64b-7f01-41f7-890f-07cab37eb830', '488243256161730560', '816260407663661056');
INSERT INTO `t_sys_permission_role` VALUES ('975971ec-5fcf-45ec-8f5e-33e72fe76bbe', '488243256161730560', '3328572814798397451');
INSERT INTO `t_sys_permission_role` VALUES ('987337c8-f284-4d8c-8ede-e3df4afa4340', '488243256161730560', '815494576553988096');
INSERT INTO `t_sys_permission_role` VALUES ('99f386cf-b11f-45f2-82aa-86e45d2e62ff', '488243256161730560', '815841036726308864');
INSERT INTO `t_sys_permission_role` VALUES ('99fa961b-a141-48aa-9cee-493b556939f0', '824155946208071680', '816258499947401216');
INSERT INTO `t_sys_permission_role` VALUES ('9a27a0ad-c699-4345-a556-bb585a560cda', '817193761791676416', '815925397718962176');
INSERT INTO `t_sys_permission_role` VALUES ('9abf9c81-cc89-4431-bd67-b7c8e07dc61d', '824156448417255424', '816254138642993152');
INSERT INTO `t_sys_permission_role` VALUES ('9b33e376-30c1-41f2-9f38-197cd1212963', '817193761791676416', '816163412747882496');
INSERT INTO `t_sys_permission_role` VALUES ('9b7880db-8528-4614-ac71-fc388d71d438', '488243256161730560', '816095890510057472');
INSERT INTO `t_sys_permission_role` VALUES ('9be8f28a-94f7-4672-be07-91986b4713f0', '488243256161730560', '816096206227902464');
INSERT INTO `t_sys_permission_role` VALUES ('9c5c285f-19e8-4055-baa9-a8327d9dce13', '816996635321176064', '816096144269643776');
INSERT INTO `t_sys_permission_role` VALUES ('9d3fa6d0-227a-43d4-80c6-205f015ee3d8', '817193761791676416', '816243037389852672');
INSERT INTO `t_sys_permission_role` VALUES ('9da26bcc-2b34-4b93-85f7-9a1c09caf27f', '488243256161730560', '13');
INSERT INTO `t_sys_permission_role` VALUES ('9e10aaed-e7c9-40cd-ba61-2f589cd5a664', '817193761791676416', '815841429782925312');
INSERT INTO `t_sys_permission_role` VALUES ('9e796f80-b3a4-4dcc-85bd-cb9965f913d2', '824155946208071680', '815841495969042432');
INSERT INTO `t_sys_permission_role` VALUES ('9e9856c3-963c-4f49-a8ae-e04bfe5ad9c5', '817193761791676416', '815488644751167488');
INSERT INTO `t_sys_permission_role` VALUES ('9ea1e592-a5bb-4fdc-87ad-91d92177a9aa', '824156448417255424', '816163603764875264');
INSERT INTO `t_sys_permission_role` VALUES ('9f094bf7-2f9c-4c6e-90d5-5e0286217866', '488243256161730560', '5946910264304599043');
INSERT INTO `t_sys_permission_role` VALUES ('9fc1bd31-bf88-4dab-80bb-3ed2d7a17984', '816996635321176064', '816259424694964224');
INSERT INTO `t_sys_permission_role` VALUES ('a0d6613d-dcec-476c-9a8c-d0610d2d2516', '488243256161730560', '3400681518049566764');
INSERT INTO `t_sys_permission_role` VALUES ('a1da632a-f00c-46eb-9765-6eefe1f4cd80', '488243256161730560', '583063272123531264');
INSERT INTO `t_sys_permission_role` VALUES ('a20ddfc3-c082-4e66-9c64-03a016046107', '816996635321176064', '815842273492340736');
INSERT INTO `t_sys_permission_role` VALUES ('a28fa17e-605e-4193-9894-6d78d2e0b519', '488243256161730560', '815390180746858496');
INSERT INTO `t_sys_permission_role` VALUES ('a3006adf-1c8f-4ff0-8750-14b6a10177b4', '817193761791676416', '815926672141455360');
INSERT INTO `t_sys_permission_role` VALUES ('a3599afb-01f7-4a68-82e7-2874b43d25d1', '824156448417255424', '816158211894808576');
INSERT INTO `t_sys_permission_role` VALUES ('a39d5507-0d09-45a5-8f13-94532ab69782', '488243256161730560', '816252833962790912');
INSERT INTO `t_sys_permission_role` VALUES ('a40234e1-2932-407b-b645-b6d43ba197d0', '817193761791676416', '815481113651843072');
INSERT INTO `t_sys_permission_role` VALUES ('a4bea6a9-8ff2-48bb-b5e3-52e745f0f7bc', '817193761791676416', '816258878831464448');
INSERT INTO `t_sys_permission_role` VALUES ('a51bc425-57cf-42dc-aa20-f85a0aff1f5b', '488243256161730560', '3734899074291507211');
INSERT INTO `t_sys_permission_role` VALUES ('a51d8643-38c4-4ecd-b822-f13a74590ede', '488243256161730560', '815481627315671040');
INSERT INTO `t_sys_permission_role` VALUES ('a5ecce74-93c0-4a39-9df0-ebfec24deb5e', '824156448417255424', '816254236697432064');
INSERT INTO `t_sys_permission_role` VALUES ('a63f48d7-68be-4ed7-8160-bd7e7a4f4b1a', '488243256161730560', '6192095214866268162');
INSERT INTO `t_sys_permission_role` VALUES ('a6b1d460-6b30-4355-a65c-e50dbd50ed55', '816996635321176064', '816255844206383104');
INSERT INTO `t_sys_permission_role` VALUES ('a6e32f79-80e3-4946-9414-8c8dec1cfbc5', '488243256161730560', '6189186317738311681');
INSERT INTO `t_sys_permission_role` VALUES ('a6f93ad8-4344-4561-8cce-19750f9034c1', '824155946208071680', '816258333416755200');
INSERT INTO `t_sys_permission_role` VALUES ('a70c154e-efcb-49e1-b00e-6865eb060236', '488243256161730560', '815926838709850112');
INSERT INTO `t_sys_permission_role` VALUES ('a727dff3-0c3c-485a-8985-aa39639c1e7b', '817193761791676416', '816164034394066944');
INSERT INTO `t_sys_permission_role` VALUES ('a77d93d3-7d0d-48a2-a0ab-88e18b07db65', '488243256161730560', '815842574962135040');
INSERT INTO `t_sys_permission_role` VALUES ('a815dd62-7b92-4b3f-b78e-3b0c51519282', '488243256161730560', '815840276072501248');
INSERT INTO `t_sys_permission_role` VALUES ('a915a795-669b-4578-8428-cc96a9d8602f', '824155946208071680', '815840588338434048');
INSERT INTO `t_sys_permission_role` VALUES ('a974462a-ea5d-49b1-a9a2-a67dcfbbaeea', '488243256161730560', '340301160042860544');
INSERT INTO `t_sys_permission_role` VALUES ('aa194ba0-a9bf-4895-8a9d-83275ead0d9b', '824155946208071680', '815494726655545344');
INSERT INTO `t_sys_permission_role` VALUES ('aa2e9053-ecc5-4a3f-8f65-da3fd279b9df', '824155946208071680', '815390180746858496');
INSERT INTO `t_sys_permission_role` VALUES ('aa6dec3b-fe5d-46c3-96f3-cc18160a65b0', '488243256161730560', '4107917018594058251');
INSERT INTO `t_sys_permission_role` VALUES ('abf0c298-ad55-4b66-a207-5a4e6a8bc8bf', '488243256161730560', '815840588338434048');
INSERT INTO `t_sys_permission_role` VALUES ('ac6834ed-b7db-4225-bfc6-1e34a315615e', '824155946208071680', '815926838709850112');
INSERT INTO `t_sys_permission_role` VALUES ('add1e521-bf51-4979-85b8-649d3fcb6ff1', '817193761791676416', '816258987820453888');
INSERT INTO `t_sys_permission_role` VALUES ('af96ea57-117d-43a4-ac79-066db82f1e6c', '824155946208071680', '816252575753048064');
INSERT INTO `t_sys_permission_role` VALUES ('afedf2cd-5524-448d-8365-65ace7eb4536', '488243256161730560', '816259053163515904');
INSERT INTO `t_sys_permission_role` VALUES ('b088c299-08e3-4bb8-9fb0-373bfeb7a6c8', '817193761791676416', '815926838709850112');
INSERT INTO `t_sys_permission_role` VALUES ('b08b4e7d-3991-4ac9-9ea2-695038f5b9b8', '824156448417255424', '816260170303803392');
INSERT INTO `t_sys_permission_role` VALUES ('b0b975bc-888f-4ce1-a4cc-c97dc6a648e4', '817193761791676416', '815390180746858496');
INSERT INTO `t_sys_permission_role` VALUES ('b1803776-6ffb-4730-9c92-99ae79bae555', '488243256161730560', '816126254532136960');
INSERT INTO `t_sys_permission_role` VALUES ('b1aff52e-f082-4bce-8332-e21bebcba45d', '488243256161730560', '816252385335840768');
INSERT INTO `t_sys_permission_role` VALUES ('b21031ee-9eb3-4f86-9a76-98f4a1bf465b', '816996635321176064', '816095890510057472');
INSERT INTO `t_sys_permission_role` VALUES ('b24dadc3-c25c-4cf6-ac61-89d8b4e909a3', '488243256161730560', '3303650266428252204');
INSERT INTO `t_sys_permission_role` VALUES ('b2a8b473-7f07-4ce5-a368-3ec32e97c2e7', '488243256161730560', '815840885056081920');
INSERT INTO `t_sys_permission_role` VALUES ('b2b6d97c-c880-4b6e-9034-ad6210dcdb5a', '817193761791676416', '815502654288564224');
INSERT INTO `t_sys_permission_role` VALUES ('b2c6a229-85b5-447e-a0da-1d619f9f4a1e', '824156448417255424', '816163661193285632');
INSERT INTO `t_sys_permission_role` VALUES ('b304f578-85a6-4962-841c-f298d565ca5b', '488243256161730560', '816163953989259264');
INSERT INTO `t_sys_permission_role` VALUES ('b3aa9800-8141-458c-9387-d101dbf3b678', '488243256161730560', '815840971051896832');
INSERT INTO `t_sys_permission_role` VALUES ('b3ddb476-cd46-42b7-adce-cbb07048525d', '824156448417255424', '816163485003157504');
INSERT INTO `t_sys_permission_role` VALUES ('b48e502d-0fab-4fd7-9403-3d17ee72ad72', '488243256161730560', '816252575753048064');
INSERT INTO `t_sys_permission_role` VALUES ('b4f360c8-8c24-445e-9346-449d6d5009b8', '488243256161730560', '10');
INSERT INTO `t_sys_permission_role` VALUES ('b51e19fc-70e6-45e2-ab35-610d99437591', '488243256161730560', '486690002869157888');
INSERT INTO `t_sys_permission_role` VALUES ('b53d8297-2fe3-44e3-a955-6db14a16c834', '817193761791676416', '816255780595568640');
INSERT INTO `t_sys_permission_role` VALUES ('b56d8ade-3636-407c-af0b-f4e78b123f22', '816996635321176064', '816255535061012480');
INSERT INTO `t_sys_permission_role` VALUES ('b73809f0-fb86-42d6-85ab-73271202158d', '824156312089792512', '816163412747882496');
INSERT INTO `t_sys_permission_role` VALUES ('b7c382cd-ceaa-4f4c-895e-33d3a4236bb9', '824155946208071680', '816259267404369920');
INSERT INTO `t_sys_permission_role` VALUES ('b813dcd8-d231-4ff1-997b-30b6b9058be4', '824156312089792512', '816163716390326272');
INSERT INTO `t_sys_permission_role` VALUES ('b8195542-301e-46d4-aec4-f54ef6b1d126', '488243256161730560', '3400880220181667851');
INSERT INTO `t_sys_permission_role` VALUES ('b8566d49-d603-4166-a571-900699171a75', '824155946208071680', '815489107479367680');
INSERT INTO `t_sys_permission_role` VALUES ('b908fb6b-a144-4f69-90e6-54db4a916436', '817193761791676416', '815840885056081920');
INSERT INTO `t_sys_permission_role` VALUES ('b9a3f025-e3db-4c81-8546-7e2c2257b612', '824155946208071680', '816169230755041280');
INSERT INTO `t_sys_permission_role` VALUES ('b9eb96b4-c066-4605-86f3-c4e02d83b6ea', '817193761791676416', '816252833962790912');
INSERT INTO `t_sys_permission_role` VALUES ('ba57bce4-6dc3-4b96-90a0-fbd10e1986c8', '488243256161730560', '815840425607827456');
INSERT INTO `t_sys_permission_role` VALUES ('ba751f5f-0c8d-4db1-ac6a-4a0e3832b8bd', '824156448417255424', '816260275719245824');
INSERT INTO `t_sys_permission_role` VALUES ('ba9e15cb-889c-462e-91b8-013559599781', '824155946208071680', '815842649213898752');
INSERT INTO `t_sys_permission_role` VALUES ('bac8960e-9556-468c-9c0d-59825d69d735', '488243256161730560', '816254188802674688');
INSERT INTO `t_sys_permission_role` VALUES ('bad44c46-e0ab-48b3-a54b-c8cb92dd9a02', '488243256161730560', '816163603764875264');
INSERT INTO `t_sys_permission_role` VALUES ('bba4ea52-babc-4f8e-9312-2bf30b347230', '488243256161730560', '815926787379957760');
INSERT INTO `t_sys_permission_role` VALUES ('bc6cce9a-a3c7-4683-8424-e1a5e15b0532', '488243256161730560', '815839799847030784');
INSERT INTO `t_sys_permission_role` VALUES ('bcd221e8-3e23-4bd6-81ad-28e90baa11d9', '824156448417255424', '816164087447818240');
INSERT INTO `t_sys_permission_role` VALUES ('bd5690a2-59b3-46be-b6af-bfaa76225b95', '824156448417255424', '815503623202148352');
INSERT INTO `t_sys_permission_role` VALUES ('bf0a80d9-4514-4a8d-9f93-3205ed427c6b', '817193761791676416', '815503039682187264');
INSERT INTO `t_sys_permission_role` VALUES ('c05d8d20-990c-4444-9b19-a84e10dc257f', '824155946208071680', '815494406101667840');
INSERT INTO `t_sys_permission_role` VALUES ('c06d5575-4ced-4fec-a454-be63b4fe949f', '488243256161730560', '816254138642993152');
INSERT INTO `t_sys_permission_role` VALUES ('c0bf651c-74cf-42cc-a197-69870cfe275a', '817193761791676416', '815915559446253568');
INSERT INTO `t_sys_permission_role` VALUES ('c0c61059-36ce-41a1-bca8-0efc7c362360', '824156448417255424', '816263014775918592');
INSERT INTO `t_sys_permission_role` VALUES ('c0e55d59-8822-4939-806e-8ea59a1d114f', '824156448417255424', '816163883176824832');
INSERT INTO `t_sys_permission_role` VALUES ('c17ee68c-1a82-4101-85ef-12972e97e72c', '488243256161730560', '816255374993788928');
INSERT INTO `t_sys_permission_role` VALUES ('c19d89c3-d34c-4bcf-bcec-34dfe7e1c5ad', '816996635321176064', '815915880369229824');
INSERT INTO `t_sys_permission_role` VALUES ('c1b86c5d-82b6-4689-988f-6101a4a7cb3c', '488243256161730560', '816158211894808576');
INSERT INTO `t_sys_permission_role` VALUES ('c43bb393-f3eb-4b9d-a7be-323cfa916829', '488243256161730560', '3400880220181667873');
INSERT INTO `t_sys_permission_role` VALUES ('c47bbee8-b3a9-4826-a85c-1331362560ee', '488243256161730560', '3400961831355064342');
INSERT INTO `t_sys_permission_role` VALUES ('c4fb68e8-1079-406a-9bde-7d2b7f31392f', '817193761791676416', '816259326384672768');
INSERT INTO `t_sys_permission_role` VALUES ('c53a04c3-e1b2-478a-b183-5e04c299ea8a', '817193761791676416', '815495628233773056');
INSERT INTO `t_sys_permission_role` VALUES ('c5c5544c-f03c-4d17-9ee7-f894c73d6cec', '488243256161730560', '592167738407911424');
INSERT INTO `t_sys_permission_role` VALUES ('c642a135-f914-42b8-97cc-1fa210bd598c', '817193761791676416', '815840276072501248');
INSERT INTO `t_sys_permission_role` VALUES ('c7334fd6-71b7-4b1e-a3cc-9fc70fe03f30', '824155946208071680', '816252492978458624');
INSERT INTO `t_sys_permission_role` VALUES ('c867bed0-39e7-4943-bc6b-f17b2ffe3c83', '824156312089792512', '816126254532136960');
INSERT INTO `t_sys_permission_role` VALUES ('c8a4acd7-3dec-4692-9d2b-f158870c5c4a', '824156448417255424', '816095890510057472');
INSERT INTO `t_sys_permission_role` VALUES ('c9198233-f351-43e9-a847-0b01bdca0138', '488243256161730560', '410989805699207168');
INSERT INTO `t_sys_permission_role` VALUES ('caaed35a-6152-4338-a388-93b38fd407db', '488243256161730560', '815842273492340736');
INSERT INTO `t_sys_permission_role` VALUES ('ccab7786-c5a1-407f-baed-6c611d751314', '817193761791676416', '815925725239578624');
INSERT INTO `t_sys_permission_role` VALUES ('cd4ca16e-6c1e-41c4-a545-9a4a3b02240c', '817193761791676416', '816260359466913792');
INSERT INTO `t_sys_permission_role` VALUES ('cec464f1-07c5-4473-a168-428dfb00c463', '817193761791676416', '815503623202148352');
INSERT INTO `t_sys_permission_role` VALUES ('cfc1213b-4d03-48a5-ae57-7bcd5de65cca', '488243256161730560', '816255780595568640');
INSERT INTO `t_sys_permission_role` VALUES ('d0d40d28-108d-4daf-8e27-fc0271bac610', '488243256161730560', '816163412747882496');
INSERT INTO `t_sys_permission_role` VALUES ('d0db8e64-d338-4f50-b56d-88a8b2be6b05', '488243256161730560', '816258878831464448');
INSERT INTO `t_sys_permission_role` VALUES ('d0f7c30a-f5a2-443c-8c3b-c39428bc1486', '488243256161730560', '3321578609202995233');
INSERT INTO `t_sys_permission_role` VALUES ('d1bd67e7-3642-430f-9b81-29981cd91b47', '817193761791676416', '815503312752349184');
INSERT INTO `t_sys_permission_role` VALUES ('d2172fc9-cc76-4c00-9dc8-2cec5ab790ad', '824156448417255424', '815495628233773056');
INSERT INTO `t_sys_permission_role` VALUES ('d275f817-cafd-4412-990f-44204fdcd773', '824156448417255424', '815489333413941248');
INSERT INTO `t_sys_permission_role` VALUES ('d2bd85df-2493-4407-8510-ec68ce13362f', '817193761791676416', '815503168170496000');
INSERT INTO `t_sys_permission_role` VALUES ('d324ddf8-dfdd-4a24-a564-0882ab905149', '817193761791676416', '816260275719245824');
INSERT INTO `t_sys_permission_role` VALUES ('d36157f1-754e-496a-bcff-0ec484cf366d', '488243256161730560', '332857281479839744');
INSERT INTO `t_sys_permission_role` VALUES ('d368aee0-5810-41eb-b22f-205ad1661211', '816996635321176064', '816259053163515904');
INSERT INTO `t_sys_permission_role` VALUES ('d49bef3f-15df-42d1-bd72-e27f471ad70f', '824156448417255424', '815494726655545344');
INSERT INTO `t_sys_permission_role` VALUES ('d4e18948-15fc-4210-b043-0740a704a171', '824155946208071680', '815841118792060928');
INSERT INTO `t_sys_permission_role` VALUES ('d50d4484-03d1-4490-8735-eb0613821855', '816996635321176064', '816166167587721216');
INSERT INTO `t_sys_permission_role` VALUES ('d5dd4401-7fa2-4af4-b428-0d37833d04e2', '824155946208071680', '816166167587721216');
INSERT INTO `t_sys_permission_role` VALUES ('d670dda2-0afc-4585-8c41-456940a4a3a4', '488243256161730560', '816166450871013376');
INSERT INTO `t_sys_permission_role` VALUES ('d6884ddf-8b36-44a8-8caf-2ea4f9fe7345', '824155946208071680', '815494576553988096');
INSERT INTO `t_sys_permission_role` VALUES ('d7a9d340-c6d8-49c1-ba39-d73ec364ef88', '816996635321176064', '815839799847030784');
INSERT INTO `t_sys_permission_role` VALUES ('d8954596-942d-4fe8-ba0a-6109c7f74c26', '824155946208071680', '815926672141455360');
INSERT INTO `t_sys_permission_role` VALUES ('d8d72ad7-128b-4939-abdb-6d6cdf5c25cc', '488243256161730560', '816263407287275520');
INSERT INTO `t_sys_permission_role` VALUES ('db105c64-a8ea-40b7-a89d-40b46dc9a177', '817193761791676416', '815841252410003456');
INSERT INTO `t_sys_permission_role` VALUES ('db8b8f75-0887-4fb7-a398-2383f5d65c86', '817193761791676416', '815842649213898752');
INSERT INTO `t_sys_permission_role` VALUES ('dbbe2ef2-ddeb-4f19-8881-43db39f25f9c', '488243256161730560', '3400961831355064331');
INSERT INTO `t_sys_permission_role` VALUES ('dd9a9a8f-b06a-4308-98ed-ddac84fc466f', '817193761791676416', '816259267404369920');
INSERT INTO `t_sys_permission_role` VALUES ('dda0299b-9d4e-459e-bfaa-9494abeb27f7', '817193761791676416', '816258499947401216');
INSERT INTO `t_sys_permission_role` VALUES ('de8d747a-6e83-491e-ada3-5862d13ad84a', '817193761791676416', '816166450871013376');
INSERT INTO `t_sys_permission_role` VALUES ('def1314d-33d0-417d-b8c0-6e58aa5ce9d6', '824156448417255424', '816163412747882496');
INSERT INTO `t_sys_permission_role` VALUES ('df7336d6-f7eb-494a-a9b9-620818e8c93a', '816996635321176064', '815840588338434048');
INSERT INTO `t_sys_permission_role` VALUES ('df7786fc-92a0-4798-b286-6c3fa9412a23', '488243256161730560', '815915880369229824');
INSERT INTO `t_sys_permission_role` VALUES ('e01a744b-e406-4b4a-97dc-02b59df34257', '488243256161730560', '496127240363311104');
INSERT INTO `t_sys_permission_role` VALUES ('e0adb51e-e02e-41d4-95b0-c56214910858', '488243256161730560', '816259612939522048');
INSERT INTO `t_sys_permission_role` VALUES ('e14a4435-1d9a-4621-b380-901f9ac9a225', '488243256161730560', '815842511758168064');
INSERT INTO `t_sys_permission_role` VALUES ('e2473852-0117-4988-9b7f-083935e5e892', '817193761791676416', '815497319737856000');
INSERT INTO `t_sys_permission_role` VALUES ('e2eb31ce-fb19-4d70-8474-0581be696823', '817193761791676416', '815481627315671040');
INSERT INTO `t_sys_permission_role` VALUES ('e305a515-d709-426a-9ad7-5f804fd916cc', '488243256161730560', '816253265544089600');
INSERT INTO `t_sys_permission_role` VALUES ('e3338b75-450a-4419-b393-1e93b75d62fd', '488243256161730560', '3400880220181667884');
INSERT INTO `t_sys_permission_role` VALUES ('e38c943e-caa0-48a0-80fe-f2b4e1a69012', '488243256161730560', '816164087447818240');
INSERT INTO `t_sys_permission_role` VALUES ('e390fbd1-3c5b-485a-8e94-8a4cf5e5241b', '817193761791676416', '815841495969042432');
INSERT INTO `t_sys_permission_role` VALUES ('e399d3ff-d12f-4cb4-94a4-926a529e13eb', '817193761791676416', '816163782828101632');
INSERT INTO `t_sys_permission_role` VALUES ('e3cc4cde-2e94-4892-814b-2992ac73af8e', '817193761791676416', '815836036423880704');
INSERT INTO `t_sys_permission_role` VALUES ('e5010761-d8a4-4d2b-ad6d-45add6bdee8c', '817193761791676416', '816254236697432064');
INSERT INTO `t_sys_permission_role` VALUES ('e566e790-e379-4815-9663-ccfa6058b5dc', '817193761791676416', '816096144269643776');
INSERT INTO `t_sys_permission_role` VALUES ('e58774a8-965a-4a27-a814-9dd8ffcd6a30', '488243256161730560', '335330315113467904');
INSERT INTO `t_sys_permission_role` VALUES ('e61f90ea-193b-4fed-a271-edd9f1243c03', '488243256161730560', '816252439824044032');
INSERT INTO `t_sys_permission_role` VALUES ('e6502194-8c7c-4024-9168-47027791bfaa', '488243256161730560', '5946910264304599044');
INSERT INTO `t_sys_permission_role` VALUES ('e7a6b726-c537-4693-a788-29175fd2eab5', '488243256161730560', '815549043534073856');
INSERT INTO `t_sys_permission_role` VALUES ('e7c73ace-baef-42b2-b57f-a5a244fa5e38', '817193761791676416', '815926787379957760');
INSERT INTO `t_sys_permission_role` VALUES ('e7cebafb-c538-4807-a679-429855595bef', '824155946208071680', '816255374993788928');
INSERT INTO `t_sys_permission_role` VALUES ('e7d08c00-7d53-43df-8ea1-64edb4f0470a', '824156448417255424', '816096089735303168');
INSERT INTO `t_sys_permission_role` VALUES ('e9050372-6847-43a1-972f-624ecaedcc8d', '488243256161730560', '6192095215075983364');
INSERT INTO `t_sys_permission_role` VALUES ('e9813bba-8025-4390-b59a-432d2a6e502e', '816996635321176064', '816263462450761728');
INSERT INTO `t_sys_permission_role` VALUES ('ea44b788-ce04-4426-bd92-e0980b17a886', '488243256161730560', '815494406101667840');
INSERT INTO `t_sys_permission_role` VALUES ('ea48f12d-44ed-444a-950b-238fcca54818', '488243256161730560', '340381240911859712');
INSERT INTO `t_sys_permission_role` VALUES ('ea786c8b-4483-42a8-89cc-1e505f94638a', '488243256161730560', '815842384419098624');
INSERT INTO `t_sys_permission_role` VALUES ('ea962d06-77a1-4d18-b67c-b5138eb07087', '824156312089792512', '816164034394066944');
INSERT INTO `t_sys_permission_role` VALUES ('eac2f069-f2d2-4779-906e-d2608b1a6ce1', '824155946208071680', '815841252410003456');
INSERT INTO `t_sys_permission_role` VALUES ('ead4758c-4dc0-4ccc-9c1b-cd4b1c7fc7ef', '817193761791676416', '816252385335840768');
INSERT INTO `t_sys_permission_role` VALUES ('eb30813e-1ad4-4328-b080-8d308afb36be', '488243256161730560', '14');
INSERT INTO `t_sys_permission_role` VALUES ('ebc7c7e7-741e-48e2-bb7b-e5dbdee50123', '824156448417255424', '816163296032985088');
INSERT INTO `t_sys_permission_role` VALUES ('ebd76148-3b90-482e-8507-35132a76d4d5', '817193761791676416', '815842384419098624');
INSERT INTO `t_sys_permission_role` VALUES ('ec1b3379-b7db-4828-a86a-8003fd3be8ec', '488243256161730560', '6189186317948026882');
INSERT INTO `t_sys_permission_role` VALUES ('ec3084ed-318d-4a3c-8114-bd5349e39ae7', '824156448417255424', '816096033389023232');
INSERT INTO `t_sys_permission_role` VALUES ('edad6376-218b-4cbd-9775-45b100a3d9c6', '817193761791676416', '815549043534073856');
INSERT INTO `t_sys_permission_role` VALUES ('edb2cc3e-7dae-47a0-aee4-46688f697f44', '824155946208071680', '815495628233773056');
INSERT INTO `t_sys_permission_role` VALUES ('ee5d32b1-306e-40e8-b472-e1151a0c17a7', '824156448417255424', '816262948849848320');
INSERT INTO `t_sys_permission_role` VALUES ('eed7c350-84c5-47be-8ad5-d778bf66e9d0', '488243256161730560', '574578311267749890');
INSERT INTO `t_sys_permission_role` VALUES ('efa86833-81f4-4bbe-aba0-b947494dbe02', '824155946208071680', '815842574962135040');
INSERT INTO `t_sys_permission_role` VALUES ('efcbea1f-3817-4585-847d-092db2d3b4be', '488243256161730560', '816163661193285632');
INSERT INTO `t_sys_permission_role` VALUES ('f056f242-234f-4709-ac8d-d0937def5bc6', '817193761791676416', '816258333416755200');
INSERT INTO `t_sys_permission_role` VALUES ('f0d47d4d-bb6e-438b-82a4-dfba09c59666', '816996635321176064', '816169230755041280');
INSERT INTO `t_sys_permission_role` VALUES ('f15c8ed4-12ea-45b0-ae77-06131d02294f', '488243256161730560', '816259833199202304');
INSERT INTO `t_sys_permission_role` VALUES ('f1861c0a-0494-40ed-a894-65ea375693fa', '824156312089792512', '816163782828101632');
INSERT INTO `t_sys_permission_role` VALUES ('f1e9587f-cda1-4c68-8c65-897edeb5ece1', '824155946208071680', '816258878831464448');
INSERT INTO `t_sys_permission_role` VALUES ('f26ac427-9c7b-4e3b-9925-96f33137aa82', '817193761791676416', '816254086344216576');
INSERT INTO `t_sys_permission_role` VALUES ('f4128ae0-d6e1-419b-8d1a-f997a7609251', '488243256161730560', '4109898056992071691');
INSERT INTO `t_sys_permission_role` VALUES ('f42a5ef1-d924-4274-99c9-c6b4f92d1a63', '488243256161730560', '815495628233773056');
INSERT INTO `t_sys_permission_role` VALUES ('f4383914-c963-434d-a6da-76df3f2f9534', '817193761791676416', '816252492978458624');
INSERT INTO `t_sys_permission_role` VALUES ('f485d1cb-0812-4436-a811-7ddf872b7bc1', '824156312089792512', '816160970572435456');
INSERT INTO `t_sys_permission_role` VALUES ('f4958be8-3144-4cb2-95f4-47b8700a3c9f', '824156448417255424', '816263077514317824');
INSERT INTO `t_sys_permission_role` VALUES ('f534ec4f-20fd-4e1d-9a83-25cffb037e7c', '488243256161730560', '373489907429150720');
INSERT INTO `t_sys_permission_role` VALUES ('f5529fb0-7e65-4e02-b498-c1bf3eec7b8f', '824155946208071680', '816255535061012480');
INSERT INTO `t_sys_permission_role` VALUES ('f68a8f24-71b8-48b9-a617-7eb194a02dbc', '488243256161730560', '816259424694964224');
INSERT INTO `t_sys_permission_role` VALUES ('f71b5c87-d152-46aa-8496-a0e083bde154', '824156448417255424', '816163356477100032');
INSERT INTO `t_sys_permission_role` VALUES ('f7b612d6-b21b-4567-a27a-f1d16aeb7064', '488243256161730560', '816258448713977856');
INSERT INTO `t_sys_permission_role` VALUES ('f8607b3e-edd7-4adf-bbb8-c3dae1406bbd', '817193761791676416', '816258936121462784');
INSERT INTO `t_sys_permission_role` VALUES ('f860f0e1-7608-4db3-b37c-6fb94f1aac07', '824156448417255424', '816163953989259264');
INSERT INTO `t_sys_permission_role` VALUES ('f978b680-3eb8-49ed-ae82-f30c126957fe', '817193761791676416', '815924727876030464');
INSERT INTO `t_sys_permission_role` VALUES ('f98c03aa-c821-42f6-b3e2-321a8c7b9c01', '488243256161730560', '3401274122705346582');
INSERT INTO `t_sys_permission_role` VALUES ('fa2a0ccd-090b-40c8-b16e-e7b777d4397d', '817193761791676416', '815926734250708992');
INSERT INTO `t_sys_permission_role` VALUES ('fab6d8d3-8ed5-42be-9f21-f8cbe7e1d444', '488243256161730560', '17');
INSERT INTO `t_sys_permission_role` VALUES ('fb572b88-4e86-4e27-8872-4fe3aceb001e', '488243256161730560', '816258333416755200');
INSERT INTO `t_sys_permission_role` VALUES ('fd4f77dd-e0a0-447b-aaae-2c54df09bb6e', '824155946208071680', '816166450871013376');
INSERT INTO `t_sys_permission_role` VALUES ('fd7e281b-f186-4236-a543-fe7bf4cdf84d', '816996635321176064', '816258499947401216');
INSERT INTO `t_sys_permission_role` VALUES ('fe690841-e3d1-41fc-8005-9bf4ca643774', '488243256161730560', '23');
INSERT INTO `t_sys_permission_role` VALUES ('fedec063-136c-4bfb-a7e9-294a0fb5acb2', '824155946208071680', '815841036726308864');
INSERT INTO `t_sys_permission_role` VALUES ('fef7d75b-0188-4a57-91ed-72b24b38e8e1', '488243256161730560', '618918631769636864');

-- ----------------------------
-- Table structure for t_sys_position
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_position`;
CREATE TABLE `t_sys_position`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `post_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '岗位名称',
  `order_num` int(11) NULL DEFAULT NULL COMMENT '排序',
  `status` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '岗位表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_position
-- ----------------------------
INSERT INTO `t_sys_position` VALUES ('410792368778907648', '总经理', 1, 1);
INSERT INTO `t_sys_position` VALUES ('410792443127140352', '技术经理', 2, 1);
INSERT INTO `t_sys_position` VALUES ('410792478929719296', '人事经理', 3, 1);
INSERT INTO `t_sys_position` VALUES ('411477874382606336', '员工', 4, 1);

-- ----------------------------
-- Table structure for t_sys_province
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_province`;
CREATE TABLE `t_sys_province`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `province_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份代码',
  `province_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省份名称',
  `short_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `lng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `data_state` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Index_1`(`province_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '省份表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_province
-- ----------------------------
INSERT INTO `t_sys_province` VALUES (22, '500000', '重庆', '重庆', '106.504959', '29.533155', 22, '2019-02-28 17:16:58', '2019-02-28 17:17:05', '', 0);

-- ----------------------------
-- Table structure for t_sys_quartz_job
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_quartz_job`;
CREATE TABLE `t_sys_quartz_job`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '日志id',
  `job_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务组名',
  `invoke_target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用目标字符串',
  `cron_expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'cron执行表达式',
  `misfire_policy` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'cron计划策略',
  `concurrent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否并发执行（0允许 1禁止）',
  `status` int(11) NULL DEFAULT NULL COMMENT '任务状态（0正常 1暂停）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定时任务调度表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_quartz_job
-- ----------------------------
INSERT INTO `t_sys_quartz_job` VALUES ('332182389491109888', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', '*/5 * * * * ?', '2', '0', 1);

-- ----------------------------
-- Table structure for t_sys_quartz_job_log
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_quartz_job_log`;
CREATE TABLE `t_sys_quartz_job_log`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `job_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `job_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务组名',
  `invoke_target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '调用目标字符串',
  `job_message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '日志信息',
  `status` int(11) NULL DEFAULT NULL COMMENT '执行状态（0正常 1失败）',
  `exception_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '异常信息',
  `start_time` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime NULL DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '定时任务调度日志表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_quartz_job_log
-- ----------------------------
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610566486724608', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:07', '2019-09-17 00:16:07');
INSERT INTO `t_sys_quartz_job_log` VALUES ('333610572270669824', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2019-09-17 00:16:09', '2019-09-17 00:16:09');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354984595927732224', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2019-11-14 23:48:53', '2019-11-14 23:48:53');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354990312722141184', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2019-11-15 00:11:36', '2019-11-15 00:11:36');
INSERT INTO `t_sys_quartz_job_log` VALUES ('354996339316232192', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2019-11-15 00:35:33', '2019-11-15 00:35:33');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421274211356672', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：5毫秒', 0, NULL, '2020-04-29 18:22:40', '2020-04-29 18:22:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421274303631360', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:22:40', '2020-04-29 18:22:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421274324602880', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:22:40', '2020-04-29 18:22:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421274366545920', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:22:40', '2020-04-29 18:22:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421315554611200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:22:50', '2020-04-29 18:22:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421357501845504', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:23:00', '2020-04-29 18:23:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421399453274112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:23:10', '2020-04-29 18:23:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421441375342592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:23:20', '2020-04-29 18:23:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421483351937024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-04-29 18:23:30', '2020-04-29 18:23:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421525257228288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:23:40', '2020-04-29 18:23:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421567233822720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:23:50', '2020-04-29 18:23:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421609130725376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:24:00', '2020-04-29 18:24:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421648662040576', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:24:09', '2020-04-29 18:24:09');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421651073765376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:24:10', '2020-04-29 18:24:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421693041971200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:24:20', '2020-04-29 18:24:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421734959845376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:24:30', '2020-04-29 18:24:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421776974188544', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:24:40', '2020-04-29 18:24:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421818862702592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:24:50', '2020-04-29 18:24:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421860805742592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:25:00', '2020-04-29 18:25:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415421902736199680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:25:10', '2020-04-29 18:25:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552540512256', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：4毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552636981248', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552670535680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552687312896', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552716673024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423552741838848', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:43', '2020-04-29 18:31:43');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423559536611328', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:45', '2020-04-29 18:31:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423580482965504', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:31:50', '2020-04-29 18:31:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423601454485504', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:31:55', '2020-04-29 18:31:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423622405033984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:32:00', '2020-04-29 18:32:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423643372359680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:32:05', '2020-04-29 18:32:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423664343879680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:10', '2020-04-29 18:32:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423685311205376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:15', '2020-04-29 18:32:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423706328862720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:20', '2020-04-29 18:32:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423727325548544', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:25', '2020-04-29 18:32:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423748250931200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:30', '2020-04-29 18:32:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423769188896768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:35', '2020-04-29 18:32:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423790227525632', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:40', '2020-04-29 18:32:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423811190657024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:32:45', '2020-04-29 18:32:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423832178954240', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:32:50', '2020-04-29 18:32:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423853100142592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:32:55', '2020-04-29 18:32:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423874054885376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:00', '2020-04-29 18:33:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423895026405376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:05', '2020-04-29 18:33:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423916002119680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:10', '2020-04-29 18:33:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423937015582720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:15', '2020-04-29 18:33:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423957970325504', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:20', '2020-04-29 18:33:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423978925068288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:25', '2020-04-29 18:33:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415423999942725632', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:30', '2020-04-29 18:33:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424020889079808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:35', '2020-04-29 18:33:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424041894154240', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:40', '2020-04-29 18:33:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424062844702720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:33:45', '2020-04-29 18:33:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424083803639808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:50', '2020-04-29 18:33:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424104754188288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:33:55', '2020-04-29 18:33:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424125746679808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:34:00', '2020-04-29 18:34:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424146726588416', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:05', '2020-04-29 18:34:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424167727468544', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:10', '2020-04-29 18:34:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424188678017024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:15', '2020-04-29 18:34:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424209636954112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:20', '2020-04-29 18:34:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424230595891200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:34:25', '2020-04-29 18:34:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424251567411200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:30', '2020-04-29 18:34:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424272559902720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:35', '2020-04-29 18:34:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424293518839808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:40', '2020-04-29 18:34:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424314507137024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:34:45', '2020-04-29 18:34:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424335436713984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:34:50', '2020-04-29 18:34:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424356404039680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:34:55', '2020-04-29 18:34:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424377396531200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:35:00', '2020-04-29 18:35:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424398414188544', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:05', '2020-04-29 18:35:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424419326988288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:35:10', '2020-04-29 18:35:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424440332062720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:35:15', '2020-04-29 18:35:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424461282611200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:20', '2020-04-29 18:35:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424482254131200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:25', '2020-04-29 18:35:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424503200485376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:30', '2020-04-29 18:35:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424524163616768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:35', '2020-04-29 18:35:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424545135136768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:40', '2020-04-29 18:35:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424566148599808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:35:45', '2020-04-29 18:35:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424587103342592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:35:50', '2020-04-29 18:35:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424608150360064', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:35:55', '2020-04-29 18:35:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424629029605376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:36:00', '2020-04-29 18:36:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424650072428544', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:05', '2020-04-29 18:36:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424671035559936', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:10', '2020-04-29 18:36:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424691981914112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:15', '2020-04-29 18:36:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424712961822720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:20', '2020-04-29 18:36:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424733899788288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:25', '2020-04-29 18:36:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424754862919680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:30', '2020-04-29 18:36:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424775888965632', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:36:35', '2020-04-29 18:36:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424796797571072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:36:40', '2020-04-29 18:36:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424817836199936', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:36:45', '2020-04-29 18:36:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424838769971200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:36:50', '2020-04-29 18:36:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424859741491200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:36:55', '2020-04-29 18:36:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424880696233984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:37:00', '2020-04-29 18:37:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424901705502720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:05', '2020-04-29 18:37:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424922681217024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:10', '2020-04-29 18:37:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424943690485760', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:15', '2020-04-29 18:37:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424964632645632', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:20', '2020-04-29 18:37:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415424985562222592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:37:25', '2020-04-29 18:37:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425006516965376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:30', '2020-04-29 18:37:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425027484291072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:37:35', '2020-04-29 18:37:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425048476782592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-04-29 18:37:40', '2020-04-29 18:37:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425069427331072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:37:45', '2020-04-29 18:37:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425090436599808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:37:50', '2020-04-29 18:37:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425111412314112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:37:55', '2020-04-29 18:37:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425132354473984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:38:00', '2020-04-29 18:38:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425153334382592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:38:05', '2020-04-29 18:38:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425174335262720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:10', '2020-04-29 18:38:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425195290005504', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:38:15', '2020-04-29 18:38:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425216248942592', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:20', '2020-04-29 18:38:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425237224656896', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-04-29 18:38:25', '2020-04-29 18:38:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425258200371200', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:30', '2020-04-29 18:38:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425279192862720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:35', '2020-04-29 18:38:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425300126633984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:38:40', '2020-04-29 18:38:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425321089765376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:45', '2020-04-29 18:38:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425342082256896', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:38:50', '2020-04-29 18:38:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425363041193984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:38:55', '2020-04-29 18:38:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425384000131072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:00', '2020-04-29 18:39:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425404967456768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:05', '2020-04-29 18:39:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425425997697024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:39:10', '2020-04-29 18:39:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425446956634112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:15', '2020-04-29 18:39:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425467902988288', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:20', '2020-04-29 18:39:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425488866119680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:25', '2020-04-29 18:39:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425509825056768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:39:30', '2020-04-29 18:39:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425530800771072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:39:35', '2020-04-29 18:39:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425551768096768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:40', '2020-04-29 18:39:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425572743811072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:39:45', '2020-04-29 18:39:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425593706942464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:50', '2020-04-29 18:39:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425614678462464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:39:55', '2020-04-29 18:39:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425635654176768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:00', '2020-04-29 18:40:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425656629891072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:05', '2020-04-29 18:40:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425677597216768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:10', '2020-04-29 18:40:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425698568736768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:15', '2020-04-29 18:40:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425719540256768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:20', '2020-04-29 18:40:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425740515971072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:25', '2020-04-29 18:40:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425761487491072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:30', '2020-04-29 18:40:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425782454816768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:35', '2020-04-29 18:40:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425803430531072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:40', '2020-04-29 18:40:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425824397856768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:45', '2020-04-29 18:40:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425845373571072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:40:50', '2020-04-29 18:40:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425866340896768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:40:55', '2020-04-29 18:40:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425887312416768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:00', '2020-04-29 18:41:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425908283936768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:05', '2020-04-29 18:41:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425929255456768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:41:10', '2020-04-29 18:41:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425950226976768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:15', '2020-04-29 18:41:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425971198496768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:20', '2020-04-29 18:41:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415425992165822464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:25', '2020-04-29 18:41:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426013141536768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:30', '2020-04-29 18:41:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426034117251072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:41:35', '2020-04-29 18:41:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426055088771072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:40', '2020-04-29 18:41:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426076056096768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:41:45', '2020-04-29 18:41:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426117479043072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：4毫秒', 0, NULL, '2020-04-29 18:41:51', '2020-04-29 18:41:51');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426138983239680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:42:00', '2020-04-29 18:42:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426180909502464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:42:10', '2020-04-29 18:42:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426222856736768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:42:20', '2020-04-29 18:42:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426264799776768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:42:30', '2020-04-29 18:42:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426306742816768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:42:40', '2020-04-29 18:42:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426348685856768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:42:50', '2020-04-29 18:42:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426390633091072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:43:00', '2020-04-29 18:43:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426432580325376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:43:10', '2020-04-29 18:43:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426453539262464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:43:15', '2020-04-29 18:43:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426474519171072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-04-29 18:43:20', '2020-04-29 18:43:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426495486496768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:43:25', '2020-04-29 18:43:25');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426516462211072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:43:30', '2020-04-29 18:43:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426537437925376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:43:35', '2020-04-29 18:43:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426558417833984', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:43:40', '2020-04-29 18:43:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426579372576768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:43:45', '2020-04-29 18:43:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426600344096768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:43:50', '2020-04-29 18:43:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426789146497024', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2020-04-29 18:44:35', '2020-04-29 18:44:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426810071879680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:44:40', '2020-04-29 18:44:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426831039205376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:44:45', '2020-04-29 18:44:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426851998142464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:44:50', '2020-04-29 18:44:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426872982245376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:44:55', '2020-04-29 18:44:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426894041845760', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:45:00', '2020-04-29 18:45:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426914921091072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:45:05', '2020-04-29 18:45:05');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426935888416768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:45:10', '2020-04-29 18:45:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426956864131072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:45:15', '2020-04-29 18:45:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415426977835651072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-04-29 18:45:20', '2020-04-29 18:45:20');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415427019774496768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:45:30', '2020-04-29 18:45:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415427061713342464', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:45:40', '2020-04-29 18:45:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('415427103660576768', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：0毫秒', 0, NULL, '2020-04-29 18:45:50', '2020-04-29 18:45:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503199187412848640', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：45毫秒', 0, NULL, '2020-12-27 15:40:45', '2020-12-27 15:40:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503200830422388736', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：37毫秒', 0, NULL, '2020-12-27 15:47:17', '2020-12-27 15:47:17');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503205708326637568', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：148毫秒', 0, NULL, '2020-12-27 16:06:40', '2020-12-27 16:06:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503205749506314240', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：10毫秒', 0, NULL, '2020-12-27 16:06:50', '2020-12-27 16:06:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503205791440965632', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：5毫秒', 0, NULL, '2020-12-27 16:07:00', '2020-12-27 16:07:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503205917249114112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：7毫秒', 0, NULL, '2020-12-27 16:07:30', '2020-12-27 16:07:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503205959217319936', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：8毫秒', 0, NULL, '2020-12-27 16:07:40', '2020-12-27 16:07:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503218856400130048', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：39毫秒', 0, NULL, '2020-12-27 16:58:55', '2020-12-27 16:58:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222358929182720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-12-27 17:12:50', '2020-12-27 17:12:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222379850371072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2020-12-27 17:12:55', '2020-12-27 17:12:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222442806874112', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2020-12-27 17:13:10', '2020-12-27 17:13:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222463786782720', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2020-12-27 17:13:15', '2020-12-27 17:13:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222842696011776', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：5毫秒', 0, NULL, '2020-12-27 17:14:45', '2020-12-27 17:14:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222862266634240', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：4毫秒', 0, NULL, '2020-12-27 17:14:50', '2020-12-27 17:14:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222883204599808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2020-12-27 17:14:55', '2020-12-27 17:14:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503222904176119808', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 1, 'ewrwerwer', '2020-12-27 17:15:00', '2020-12-30 17:15:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('503236547471085568', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：37毫秒', 0, NULL, '2020-12-27 18:09:13', '2020-12-27 18:09:13');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868140942299136', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：58毫秒', 0, NULL, '2022-07-23 17:03:02', '2022-07-23 17:03:02');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868173179719680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：1毫秒', 0, NULL, '2022-07-23 17:03:10', '2022-07-23 17:03:10');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868194264485888', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：30毫秒', 0, NULL, '2022-07-23 17:03:15', '2022-07-23 17:03:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868267455090688', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2022-07-23 17:03:32', '2022-07-23 17:03:32');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868278028931072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2022-07-23 17:03:35', '2022-07-23 17:03:35');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868299134668800', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：33毫秒', 0, NULL, '2022-07-23 17:03:40', '2022-07-23 17:03:40');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868319976165376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2022-07-23 17:03:45', '2022-07-23 17:03:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868340951879680', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：3毫秒', 0, NULL, '2022-07-23 17:03:50', '2022-07-23 17:03:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868361919205376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2022-07-23 17:03:55', '2022-07-23 17:03:55');
INSERT INTO `t_sys_quartz_job_log` VALUES ('710868382890725376', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：2毫秒', 0, NULL, '2022-07-23 17:04:00', '2022-07-23 17:04:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('815491773999747072', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：56毫秒', 0, NULL, '2023-05-08 10:00:00', '2023-05-08 10:00:00');
INSERT INTO `t_sys_quartz_job_log` VALUES ('815498444998316032', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：49毫秒', 0, NULL, '2023-05-08 10:26:31', '2023-05-08 10:26:31');
INSERT INTO `t_sys_quartz_job_log` VALUES ('815853199096418304', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：60毫秒', 0, NULL, '2023-05-09 09:56:11', '2023-05-09 09:56:11');
INSERT INTO `t_sys_quartz_job_log` VALUES ('817355681677053952', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：67毫秒', 0, NULL, '2023-05-13 13:26:30', '2023-05-13 13:26:30');
INSERT INTO `t_sys_quartz_job_log` VALUES ('823771037366882304', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：106毫秒', 0, NULL, '2023-05-31 06:18:50', '2023-05-31 06:18:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('823811553139757056', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：70毫秒', 0, NULL, '2023-05-31 08:59:50', '2023-05-31 08:59:50');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824136298179727360', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：80毫秒', 0, NULL, '2023-06-01 06:30:15', '2023-06-01 06:30:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824162596201566208', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：61毫秒', 0, NULL, '2023-06-01 08:14:45', '2023-06-01 08:14:45');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824522322953244672', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：77毫秒', 0, NULL, '2023-06-02 08:04:11', '2023-06-02 08:04:11');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824529202253533184', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：49毫秒', 0, NULL, '2023-06-02 08:31:31', '2023-06-02 08:31:31');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824547048643760128', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：151毫秒', 0, NULL, '2023-06-02 09:42:26', '2023-06-02 09:42:26');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824847003119915008', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：75毫秒', 0, NULL, '2023-06-03 05:34:21', '2023-06-03 05:34:21');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824887980903763968', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：46毫秒', 0, NULL, '2023-06-03 08:17:11', '2023-06-03 08:17:11');
INSERT INTO `t_sys_quartz_job_log` VALUES ('824914677015384064', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：60毫秒', 0, NULL, '2023-06-03 10:03:15', '2023-06-03 10:03:15');
INSERT INTO `t_sys_quartz_job_log` VALUES ('846623178737455104', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：441毫秒', 0, NULL, '2023-08-02 07:45:05', '2023-08-02 07:45:06');
INSERT INTO `t_sys_quartz_job_log` VALUES ('901317428296945664', 'v2Task2', 'SYSTEM', 'v2Task.runTask2(1,2l,\'asa\',true,2D)', 'v2Task2 总共耗时：297毫秒', 0, NULL, '2023-12-31 06:00:30', '2023-12-31 06:00:31');

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '角色表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('488243256161730560', '超级管理员');
INSERT INTO `t_sys_role` VALUES ('488289006124007424', '用户');
INSERT INTO `t_sys_role` VALUES ('488305788310257664', '能修改用户密码角色');
INSERT INTO `t_sys_role` VALUES ('816996635321176064', '学生');
INSERT INTO `t_sys_role` VALUES ('817193761791676416', '测试');
INSERT INTO `t_sys_role` VALUES ('824155946208071680', '教练');
INSERT INTO `t_sys_role` VALUES ('824156312089792512', '工作人员');
INSERT INTO `t_sys_role` VALUES ('824156448417255424', '管理员');

-- ----------------------------
-- Table structure for t_sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_user`;
CREATE TABLE `t_sys_role_user`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sys_user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户id',
  `sys_role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色中间表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_role_user
-- ----------------------------
INSERT INTO `t_sys_role_user` VALUES ('3', '824161317001760769', '824156448417255424');
INSERT INTO `t_sys_role_user` VALUES ('353711021275353089', '353711021275353088', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('353714370687143936', '488294747442511872', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('354984037766533120', '354984005751410688', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('354988722443390977', '354988722443390976', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('354989789679849472', '354989789675655168', '488305788310257664');
INSERT INTO `t_sys_role_user` VALUES ('612107905532952576', '612107905532952576', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('612107905537146880', '612107905532952576', '488305788310257664');
INSERT INTO `t_sys_role_user` VALUES ('665776667649773568', '665776667645579264', '488289006124007424');
INSERT INTO `t_sys_role_user` VALUES ('815390586302500864', '1', '488243256161730560');
INSERT INTO `t_sys_role_user` VALUES ('815390586331860992', '1', '488305788310257664');
INSERT INTO `t_sys_role_user` VALUES ('816996869724049409', '816996869724049408', '816996635321176064');
INSERT INTO `t_sys_role_user` VALUES ('817195838366420993', '817195838366420992', '817193761791676416');
INSERT INTO `t_sys_role_user` VALUES ('824159321012178944', '824159321007984640', '816996635321176064');
INSERT INTO `t_sys_role_user` VALUES ('824161317001760769', '824161317001760768', '816996635321176064');
INSERT INTO `t_sys_role_user` VALUES ('824505596433797120', '824505596429602816', '816996635321176064');
INSERT INTO `t_sys_role_user` VALUES ('824898824165265409', '824898824165265408', '824155946208071680');
INSERT INTO `t_sys_role_user` VALUES ('824899063030878209', '824899063030878208', '824156312089792512');

-- ----------------------------
-- Table structure for t_sys_street
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_street`;
CREATE TABLE `t_sys_street`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增列',
  `street_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道代码',
  `area_code` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父级区代码',
  `street_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '街道名称',
  `short_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简称',
  `lng` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '经度',
  `lat` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '纬度',
  `sort` int(11) NULL DEFAULT NULL COMMENT '排序',
  `gmt_create` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `memo` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `data_state` int(11) NULL DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `Index_1`(`street_code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '街道设置' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_street
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '主键',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '昵称',
  `dep_id` int(11) NULL DEFAULT NULL COMMENT '部门id',
  `pos_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '岗位id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '用户表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', 'superadmin', '21232f297a57a5a743894a0e4a801fc3', '管理员', 2, '410792368778907648');
INSERT INTO `t_sys_user` VALUES ('433236479427350528', 'fuce', '21232f297a57a5a743894a0e4a801fc3', '付册', 2, '410792443127140352');
INSERT INTO `t_sys_user` VALUES ('665776667645579264', '999', 'fa246d0262c3925617b0c72bb20eeb1d', '9999', 1, '410792368778907648');
INSERT INTO `t_sys_user` VALUES ('816996869724049408', 'S001', '81dc9bdb52d04dc20036dbd8313ed055', '学生', 2, '410792368778907648');
INSERT INTO `t_sys_user` VALUES ('817195838366420992', 'test', '098f6bcd4621d373cade4e832627b4f6', '测试', 2, '410792368778907648');
INSERT INTO `t_sys_user` VALUES ('824161317001760768', 'Sreisen', 'c4ca4238a0b923820dcc509a6f75849b', '铃仙', NULL, NULL);
INSERT INTO `t_sys_user` VALUES ('824161317001760769', 'admin', '21232f297a57a5a743894a0e4a801fc3', '管理员', NULL, NULL);
INSERT INTO `t_sys_user` VALUES ('824505596429602816', 'S2', 'c81e728d9d4c2f636f067f89cc14862c', '2', NULL, NULL);
INSERT INTO `t_sys_user` VALUES ('824898824165265408', 'TTeacher', '202cb962ac59075b964b07152d234b70', '龙之介', NULL, NULL);
INSERT INTO `t_sys_user` VALUES ('824899063030878208', 'F002', '202cb962ac59075b964b07152d234b70', '李师傅', NULL, NULL);

-- ----------------------------
-- Table structure for t_test
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `b_c_update` datetime NULL DEFAULT NULL COMMENT '修改时间',
  `t_cb_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '写个字符串',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '测试表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_test
-- ----------------------------
INSERT INTO `t_test` VALUES ('457067146405613568', '管理员', 2, '1', '2021-01-14 16:00:00', '2021-01-15 16:00:00', '7');
INSERT INTO `t_test` VALUES ('457067174939463680', '法院用户', 2, '1', '2021-01-12 16:00:00', '2021-01-18 16:00:00', '');
INSERT INTO `t_test` VALUES ('457067196175224832', 'guest', 1, '3', '2021-01-02 16:00:00', '2021-01-16 16:00:00', '');
INSERT INTO `t_test` VALUES ('457067220279889920', 'helloword', 1, '3', '2021-01-03 16:00:00', '2021-01-25 16:00:00', '');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统用户名\r\n',
  `true_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '身份证',
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表是管理员，1代表是教练，2代表是学生，3代表工作人员',
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '0代表女，1代表男',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `login_date` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '登录时间',
  `t_card` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教练证',
  `wages` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '工资',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教练表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('824898824307871744', 'TTeacher', '李老师', '11123', '1223', '202cb962ac59075b964b07152d234b70', NULL, '0', '111', '2023-06-08 00:31:19', '222', '222');

-- ----------------------------
-- Table structure for train_category
-- ----------------------------
DROP TABLE IF EXISTS `train_category`;
CREATE TABLE `train_category`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `training_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训名称名称',
  `pay` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训费用',
  `training_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训内容',
  `start_date` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '开始时间',
  `end_date` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '培训类别' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of train_category
-- ----------------------------
INSERT INTO `train_category` VALUES ('815862629284319232', '直升机培训', '1', '1', '2023-05-31 14:55:43', '2023-05-31 14:55:43');
INSERT INTO `train_category` VALUES ('815862958210027520', '三角翼飞行培训', '30000', '全套三角翼飞行培训', '2023-05-08 16:00:00', '2023-07-08 16:00:00');

-- ----------------------------
-- Table structure for train_file
-- ----------------------------
DROP TABLE IF EXISTS `train_file`;
CREATE TABLE `train_file`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资料详情',
  `upload_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上传人姓名',
  `upload_date` datetime NULL DEFAULT NULL COMMENT '上传时间',
  `file_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件名',
  `file_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '文件地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '资料管理' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of train_file
-- ----------------------------
INSERT INTO `train_file` VALUES ('824514924414898176', '培训大纲', 'superadmin', '2023-06-02 07:38:53', '图片', '/upload/230602153852_824515952694661120_ss.png');
INSERT INTO `train_file` VALUES ('824519348516425728', '22', 'superadmin', '2023-06-02 08:33:09', '11', '/upload/230602163307_824529608740311040_数据库设计表.xlsx');
INSERT INTO `train_file` VALUES ('825268225012011008', '', 'superadmin', '2023-06-04 09:28:08', '', '/upload/230604172806_825268220704460800_页-3.png');
INSERT INTO `train_file` VALUES ('825269214330884096', '`11', 'test', '2023-06-04 09:32:04', '23', '/upload/230604173158_825269190578540544_陆通-飞行训练管理系统-概要设计.docx');
INSERT INTO `train_file` VALUES ('825274304001347584', '11', 'test', '2023-06-04 09:52:17', '22', '/upload/230604175206_825274260233785344_页-26.png');

-- ----------------------------
-- Table structure for train_info
-- ----------------------------
DROP TABLE IF EXISTS `train_info`;
CREATE TABLE `train_info`  (
  `training_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'id辨识',
  `place_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训场地号',
  `machine_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训设备号',
  `training_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训地点',
  `training_details` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '培训内容',
  `start_date` datetime NULL DEFAULT NULL COMMENT '开始时间',
  `end_date` datetime NULL DEFAULT NULL COMMENT '结束时间',
  `train_category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训类别',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训状态',
  PRIMARY KEY (`training_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '培训信息' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of train_info
-- ----------------------------
INSERT INTO `train_info` VALUES ('815905350371905536', '1', '817375515026526208', '817578161264005120', '1', '2023-05-09 16:00:00', '2023-05-09 16:00:00', '815862629284319232', '已开始');
INSERT INTO `train_info` VALUES ('817358025173110784', '1', '817375515026526208', '817578161264005120', '模拟飞行', '2023-05-13 13:35:29', '2023-05-13 16:00:00', '815862958210027520', '未开始');

-- ----------------------------
-- Table structure for train_trance
-- ----------------------------
DROP TABLE IF EXISTS `train_trance`;
CREATE TABLE `train_trance`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `train_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `train_task` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `train_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `train_evaluate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of train_trance
-- ----------------------------

-- ----------------------------
-- Table structure for training_info
-- ----------------------------
DROP TABLE IF EXISTS `training_info`;
CREATE TABLE `training_info`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `training_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练地点',
  `training_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练内容',
  `t_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '教练id',
  `machine_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备id',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '状态',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学员id',
  `train_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练编号',
  `train_starttime` datetime NULL DEFAULT NULL COMMENT '训练开始时间',
  `train_endtime` datetime NULL DEFAULT NULL COMMENT '训练结束时间',
  `train_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '培训id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '训练信息管理' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of training_info
-- ----------------------------
INSERT INTO `training_info` VALUES ('817630115310735360', '模拟训练训练场', '模拟训练1', '1', '817375515026526208', '未开始', '824161317068869632', 'T001', '2023-05-14 07:36:52', '2023-05-14 07:36:55', '01');

-- ----------------------------
-- Table structure for training_log
-- ----------------------------
DROP TABLE IF EXISTS `training_log`;
CREATE TABLE `training_log`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `training_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练地点',
  `training_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练内容',
  `t_id` int(11) NULL DEFAULT NULL COMMENT '教练id',
  `training_record` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '训练记录',
  `train_id` int(11) NULL DEFAULT NULL COMMENT '训练id',
  `train_starttime` datetime NULL DEFAULT NULL COMMENT '训练开始时间',
  `train_endtime` datetime NULL DEFAULT NULL COMMENT '训练结束时间',
  `training_task` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '训练日志管理' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of training_log
-- ----------------------------
INSERT INTO `training_log` VALUES ('818089536415469568', '王小明', '西训练场', '模拟训练', 1, '训练进行非常顺利', 1, '2023-05-14 16:00:00', '2023-05-14 16:00:00', '');

-- ----------------------------
-- Table structure for training_s
-- ----------------------------
DROP TABLE IF EXISTS `training_s`;
CREATE TABLE `training_s`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '标识id',
  `training_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '训练id',
  `s_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生id',
  `log_id` int(11) NULL DEFAULT NULL COMMENT '训练日志id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '训练信息与学生信息记录' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of training_s
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
