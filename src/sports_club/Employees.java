
package sports_club;


public class Employees {
    
    private final  int id;
    private final   String name;
    private final String experience;
    private final  String category;
    
    
    public Employees (int eid,String ename,String eexperience,String ecategory)
    {
        this.id=eid;
        this.name=ename;
        this.experience=eexperience;
        this.category=ecategory;
        
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    public String getExperience()
    {
        return experience;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    
    
}
