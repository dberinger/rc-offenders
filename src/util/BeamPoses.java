/*******************************************************************************
*  RoboNewbie
* NaoTeam Humboldt
* @author hdb
* @version 1.1
*******************************************************************************/

package util;

// import java.util.HashMap;

/**
 * This class contains the poses for beam messages. The values below are only 
 * examples. You can specify according to your needs. The first coordinate (X-value) 
 * has to be negative because the players must start in their own half.<br>
 *
 * These poses are used in ServerCommunication when the player numbers are
 * assigned by the server.
 */
public class BeamPoses {
    
  private static final double [][] Poses = 
{
        {-4.5, 0.0, 0.0}, //player 1 - goalie
        {-3.5, 1.0, 0.0}, //player 2 - defender/attacker
    };
 
  public static double getX(int i) {
    return Poses[i-1][0];
  }
  
   public static double getY(int i) {
    return Poses[i-1][1];
  }
   
 public static double getRot(int i) {
    return Poses[i-1][2];
  }
 

}
