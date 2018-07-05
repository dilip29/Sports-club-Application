
package sports_club;


public class Members {
    
    private final  int id;
    private final   String name;
    private final String gender;
    private final  String dob;
    
    
    public Members (int pid,String pname,String pgender,String pdob)
    {
        this.id=pid;
        this.name=pname;
        this.gender=pgender;
        this.dob=pdob;
        
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    
    public String getDob()
    {
        return dob;
    }
    
    
    
}
