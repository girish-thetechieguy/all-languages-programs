
public class _01_BasicService {
    public String getGrade(int percentage ){
        if(percentage > 80)
            return "Distinction";
        else if(percentage > 60 && percentage < 80 )
            return "First Class";
        else if(percentage > 50 && percentage < 60)
            return "Second Class";
        else if(percentage > 35 && percentage < 50)
            return "Passed";
        else
            return "Failed";
    }
}
