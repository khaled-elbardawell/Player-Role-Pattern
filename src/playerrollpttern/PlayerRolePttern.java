
package playerrollpttern;

class player{
    String name;
    role r;
    public player(String name , String r){
        this.name=name;
        this.setrole(r);
    }
    public void setrole(String r){
        if(r.equals("role1")){
            this.r=new role1();
        }else{
             this.r=new role2();
            
        }
       
        this.r.setPlayer(this);
        
        
    }
    
}

abstract class role{
    player p;
    public void setPlayer(player p){
        this.p=p;
    }
    
}
class role1 extends role{
    public role1(){
         System.out.println("this is role 1 ");
    }
}

class role2 extends role{
   
       public role2(){
            System.out.println("this is role 2 ");
        }
}

public class PlayerRolePttern {
    public static void main(String[] args) {
        player p=new player("khaled","role");
        
    }
    
}
