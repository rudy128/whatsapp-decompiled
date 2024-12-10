package androidx.appcompat.app;

import X.AnonymousClass02S;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.IBinder;

public final class AppLocalesMetadataHolderService extends Service {
    public static ServiceInfo A00(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            i = AnonymousClass02S.A00() | 128;
        } else {
            i = 640;
        }
        return context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), i);
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
