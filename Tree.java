class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leavesFall = false;
    leafColor = "";
  }

  Tree(String aTreeName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
    treeName = aTreeName;
    treeType = aTreeType;
    leavesFall = aLeavesFall;
    leafColor = aLeafColor;
  }

  void setTreeName(String theTreeName) {
    treeName = theTreeName;
  }

  void setTreeType(String theTreeType) {
    treeType = theTreeType;
  }

  void setLeavesFall(boolean theLeavesFall) {
    leavesFall = theLeavesFall;
  }

  void setLeafColor(String theLeafColor) {
    leafColor = theLeafColor;
  }

  String GetTreeName() {
    return treeName;
  }

  String GetTreeType() {
    return treeType;
  }

  boolean GetLeavesFall() {
    return leavesFall;
  }

  String GetLeafColor() {
    return leafColor;
  }

  public void print(){
   if  (leavesFall = true){
    System.out.println("This is a " +treeName + "tree." + "It is a " +treeType + " and its leaves are currently " +leafColor + "." + "It does not lose its leaves for the winter.");
   }
if (leavesFall = false){
   System.out.println("This is a " +treeName + "tree." + "It is a " +treeType + " and its leaves are currently " +leafColor + "." + "It does lose its leaves for the winter.");
   }
   }
    
  }
