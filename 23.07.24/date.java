

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
    String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,  Locale.US).toUpperCase();
        return dayOfWeek;
    }

    // public static String findDay(int month, int day, int year) {
    //         int k=year%100;
    //         int j=year/100;
    //         int name=(day+(13*(month+1))/5+k+(k/4)+(j/4)-(2*j))%7;
    //         String[] names={"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
    //         return names[name];
    // }

}

