package barqsoft.footballscores;

/**
 * Created by yehya khaled on 3/3/2015.
 */
public class Utilies
{
    /*public static final int SERIE_A = 357;
    public static final int PREMIER_LEGAUE = 354;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 358;
    public static final int BUNDESLIGA = 351;*/

    public static final int BUNDESLIGA2 = 395;
    public static final int LIGUE1 = 396;
    public static final int LIGUE2 = 397;
    public static final int SEGUNDA_DIVISION = 400;
    public static final int PRIMEIRA_LIGA = 402;
    public static final int BUNDESLIGA3 = 403;
    public static final int EREDIVISIE = 404;

    public static final int SERIE_A = 401;
    public static final int PREMIER_LEAGUE = 398;
    public static final int CHAMPIONS_LEAGUE = 362;
    public static final int PRIMERA_DIVISION = 399;
    public static final int BUNDESLIGA = 394;

    public static String getLeague(int league_num)
    {
        switch (league_num)
        {
            case SERIE_A : return "Seria A\nItaly";
            case PREMIER_LEAGUE : return "Premier League\nEngland";
            case CHAMPIONS_LEAGUE : return "UEFA Champions League\n Europe";
            case PRIMERA_DIVISION : return "Primera Division \n Spain";
            case BUNDESLIGA : return "Bundesliga\n Germany";

            case BUNDESLIGA2 : return "Bundesliga2\n Germany";
            case BUNDESLIGA3 : return "Bundesliga3\n Germany";
            case LIGUE1 : return "LIGUE1 \n France";
            case LIGUE2 : return "LIGUE2 \n France";
            case SEGUNDA_DIVISION : return "SEGUNDA_DIVISION \n Spain";
            case PRIMEIRA_LIGA : return "PRIMEIRA_LIGA \n Portugal";
            case EREDIVISIE : return "EREDIVISIE \n Netherlands";

            default: return "Not known League Please report";
        }
    }
    public static String getMatchDay(int match_day,int league_num)
    {
        if(league_num == CHAMPIONS_LEAGUE)
        {
            if (match_day <= 6)
            {
                return "Group Stages, Matchday : 6";
            }
            else if(match_day == 7 || match_day == 8)
            {
                return "First Knockout round";
            }
            else if(match_day == 9 || match_day == 10)
            {
                return "QuarterFinal";
            }
            else if(match_day == 11 || match_day == 12)
            {
                return "SemiFinal";
            }
            else
            {
                return "Final";
            }
        }
        else
        {
            return "Matchday : " + String.valueOf(match_day);
        }
    }

    public static String getScores(int home_goals,int awaygoals)
    {
        if(home_goals < 0 || awaygoals < 0)
        {
            return " - ";
        }
        else
        {
            return String.valueOf(home_goals) + " - " + String.valueOf(awaygoals);
        }
    }

    public static int getTeamCrestByTeamName (String teamname)
    {
        if (teamname==null){return R.drawable.no_image;}
        switch (teamname)
        {
            case "Arsenal FC" : return R.drawable.arsenal;
            case "Manchester United FC" : return R.drawable.manchester_united;
            case "Manchester City FC" : return R.drawable.manchester_city;
            case "Swansea City" : return R.drawable.swansea_city_afc;
            case "Leicester City" : return R.drawable.leicester_city_fc_hd_logo;
            case "Everton FC" : return R.drawable.everton_fc_logo1;
            case "West Ham United FC" : return R.drawable.west_ham;
            case "Tottenham Hotspur FC" : return R.drawable.tottenham_hotspur;
            case "West Bromwich Albion" : return R.drawable.west_bromwich_albion_hd_logo;
            case "Sunderland AFC" : return R.drawable.sunderland;
            case "Stoke City FC" : return R.drawable.stoke_city;
            case "Liverpool FC" : return R.drawable.liverpool;
            default: return R.drawable.no_image;
        }
    }
}
