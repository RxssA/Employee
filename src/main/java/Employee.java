//package ie.atu.OOPEmployee;

public class Employee {
    private String name;
    private String pps;
    private String EmploymentType;

    public Employee() {

    }

    public Employee(String name, String pps, String employmentType) {
        this.name = name;
        this.pps = pps;
        EmploymentType = employmentType;
    }

    public String getName() {
            int name1 = name.length();
                   if(name1 >2 && name1<25){
                       return name;
                   }
                   else{
                       System.out.println("invalid Name length");
                   }
        return null;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPPS() {
        int pps1 = pps.length();
        if (pps1 == 11) {
            return pps;
        } else {
            System.out.println("invalid PPS length");
        }

        return null;
    }

    public void setPPS(String pps) {
        this.pps = pps;
    }

    public String getEmploymentType() {
        if (EmploymentType == "full time" || EmploymentType == "part time" || EmploymentType == "contract") {
            return EmploymentType;
        } else {
            System.out.println("invalid employment type");
        }
        return null;
    }
        public void setEmploymentType(String employmentType){
            EmploymentType = employmentType;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", EmploymentType='" + EmploymentType + '\'' +
                '}';
    }
}

