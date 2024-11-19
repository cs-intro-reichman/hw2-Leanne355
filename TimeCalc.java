public class TimeCalc {
    public static void main(String[] args) {
        // seperate the hours from the minutes from the time and another int for the new minutes
        int HoursInput= Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int MinutesInput= Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int TimeAdd= Integer.parseInt(args[1]);
        int TotalMinutes= (HoursInput * 60) + MinutesInput + TimeAdd;
        int TotalHours= TotalMinutes/60;
        int NewHours= TotalHours%24;
        int NewMinutes= TotalMinutes-(TotalHours*60);
        String NewTime=String.format("%02d",NewHours)+ ":" +String.format("%02d",NewMinutes);
        System.out.println(NewTime);

        
    }
}
