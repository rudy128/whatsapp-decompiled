package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* renamed from: X.2rv  reason: invalid class name and case insensitive filesystem */
public abstract class C62752rv {
    public static void A00(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context context2 = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context2 = applicationContext;
        }
        if (!context2.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
            C27134DVv dVv = new C27134DVv(0);
            try {
                Context applicationContext2 = context.getApplicationContext();
                PackageManager packageManager = applicationContext2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    A02(context, dVv, z);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = true;
            A02(context, dVv, z);
        }
    }

    public static /* synthetic */ void A01(Context context, TaskCompletionSource taskCompletionSource, boolean z) {
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context context2 = context;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context2 = applicationContext;
                }
                SharedPreferences.Editor edit = context2.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("error configuring notification delegate for package ");
            Log.e("FirebaseMessaging", AnonymousClass000.A0y(context.getPackageName(), A10));
            taskCompletionSource.trySetResult((Object) null);
        } finally {
            taskCompletionSource.trySetResult((Object) null);
        }
    }

    public static void A02(Context context, Executor executor, boolean z) {
        if (!C25333Cde.A01()) {
            Tasks.forResult((Object) null);
        } else {
            executor.execute(new AnonymousClass7RF(context, new TaskCompletionSource(), 5, z));
        }
    }
}
