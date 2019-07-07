class qaframeworkUtil implements Serializable {

def scriptEnv

qaframeworkUtil() {}
qaframeworkUtil{
  this.scriptEnv = p_scriptEnv
}

def qaframeworkexec(String appType, String testgitPath, String testBranch, String environment, String notificationGroup){
//def scmUtilObj = new scmUtil(scriptEnv)
//def notificationUtilObj = new notificationUtil(scriptEnv)

try {
  scriptEnv.println("QA Testing execution Starting....")
  scriptEnv.println("Environment is ${environment}....")
  scriptEnv.println("AppType is ${appType}....")
  scriptEnv.println("QA Test branch ${testBranch}....")


  
} catch (err){
    scriptEnv.println("QA Test error....")
    throw err
}

}
