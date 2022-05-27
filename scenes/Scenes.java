
package scenes;

public class Scenes {
  
    private String sceneName;
    private String enemyName;

// constructor
 
    public void Scenes() {
    }//constructor

//getters

   public String GetSceneName() {
        return this.sceneName;
    } // GetSceneName()

    public String GetEnemyName() {
        return this.enemyName;
    } // GetSceneName()

//setters

    public void SetSceneName(String sceneName){
      this.sceneName = sceneName;
    }//SetSceneName

    public void SetEnemyName(String enemyName){
        this.enemyName = enemyName;
      }//SetSceneName

  
} // class