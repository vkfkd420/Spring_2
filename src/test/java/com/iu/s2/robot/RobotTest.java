package com.iu.s2.robot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.iu.s2.robot.Arm_Left;
import com.iu.s2.robot.Robot;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class RobotTest {
   
   @Autowired
   private Robot robot;
   //private Arm_Left arm_Left;
   
   @Test
   public void test( ) {
      Arm_Left arm_Left = new Arm_Left();
      robot.setArm_Left(arm_Left);
      
      assertNotNull(robot.getArm_Right());
      
      
   }
      
   
   
}