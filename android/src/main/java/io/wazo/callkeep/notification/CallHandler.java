package io.wazo.callkeep.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CallHandler extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        CallNotificationService.handleNotificationAction(intent,context);

    }
}
