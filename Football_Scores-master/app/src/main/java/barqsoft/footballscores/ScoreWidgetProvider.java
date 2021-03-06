package barqsoft.footballscores;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import barqsoft.footballscores.service.myFetchService;


public class ScoreWidgetProvider extends AppWidgetProvider {


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        context.startService(new Intent(context, ScoreWidgetIntentService.class));
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager,
                                          int appWidgetId, Bundle newOptions) {
        context.startService(new Intent(context, ScoreWidgetIntentService.class));
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        updateDatabase(context);
        super.onReceive(context, intent);
        context.startService(new Intent(context, ScoreWidgetIntentService.class));
    }

    private void updateDatabase(Context context) {
        Intent service_start = new Intent(context, myFetchService.class);
        context.startService(service_start);
    }
}