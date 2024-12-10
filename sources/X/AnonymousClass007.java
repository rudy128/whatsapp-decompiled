package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import com.whatsapp.AbstractAppShellDelegate;
import com.whatsapp.ApplicationLike;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.007  reason: invalid class name */
public abstract class AnonymousClass007 extends AnonymousClass005 implements AnonymousClass006 {
    public static final C17910vQ appStartStat = C17910vQ.A00();
    public ApplicationLike appShellDelegate;
    public volatile File cacheDir;
    public volatile boolean enableAppDirCaching;
    public volatile File externalCacheDir;
    public C17950vU fileSystemInterceptingContextWrapper;
    public volatile File filesDir;
    public volatile boolean isHiltReady;
    public Context originalAppContext;
    public volatile C17990va waResourcesWrapper;

    public void onCreateWithHiltReady() {
        this.isHiltReady = true;
        this.fileSystemInterceptingContextWrapper.A01();
        this.enableAppDirCaching = getEntryPoint().BAL().A0O(C18040vf.A01);
        ApplicationLike createAppShellDelegate = createAppShellDelegate();
        this.appShellDelegate = createAppShellDelegate;
        createAppShellDelegate.onCreate();
    }

    private void configureCrashLogging(Context context, C17930vS r3) {
        Thread.setDefaultUncaughtExceptionHandler(new AnonymousClass00C(context, this, r3));
    }

    private AnonymousClass00D getEntryPoint() {
        return (AnonymousClass00D) AnonymousClass00E.A00(this, AnonymousClass00D.class);
    }

    public File getCacheDir() {
        if (!this.enableAppDirCaching) {
            return super.getCacheDir();
        }
        if (this.cacheDir == null) {
            this.cacheDir = super.getCacheDir();
        }
        return this.cacheDir;
    }

    public File getExternalCacheDir() {
        if (!this.enableAppDirCaching) {
            return super.getExternalCacheDir();
        }
        if (this.externalCacheDir == null) {
            this.externalCacheDir = super.getExternalCacheDir();
        }
        return this.externalCacheDir;
    }

    public File getFilesDir() {
        if (!this.enableAppDirCaching) {
            return super.getFilesDir();
        }
        if (this.filesDir == null) {
            this.filesDir = super.getFilesDir();
        }
        return this.filesDir;
    }

    public Resources getResources() {
        if (Boolean.TRUE.equals(C17960vV.A01)) {
            return super.getResources();
        }
        if (this.waResourcesWrapper == null) {
            synchronized (this) {
                if (this.waResourcesWrapper == null) {
                    this.waResourcesWrapper = C17990va.A00(super.getBaseContext(), getEntryPoint().CS9());
                }
            }
        }
        C17990va r0 = this.waResourcesWrapper;
        C17960vV.A07(r0);
        return r0;
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        SharedPreferences A04;
        if (!this.isHiltReady) {
            C18010vc.A02(str);
        } else if (!C18010vc.A03(str) && (A04 = ((C18010vc) getEntryPoint().CLe().get()).A04(str)) != null) {
            return A04;
        }
        return super.getSharedPreferences(str, i);
    }

    public void attachBaseContext(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        this.originalAppContext = context;
        C17950vU r0 = new C17950vU(context);
        this.fileSystemInterceptingContextWrapper = r0;
        C17950vU.A00(r0);
        super.attachBaseContext(this.fileSystemInterceptingContextWrapper);
        C17960vV.A0E(true);
        C17930vS r1 = new C17930vS(this.fileSystemInterceptingContextWrapper);
        Boolean bool = C17970vW.A03;
        Log.initialize(r1, false);
        Log.setLogLevel();
        configureCrashLogging(this, r1);
        appStartStat.A01();
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractAppShell/attachBaseContext/complete/");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(sb.toString());
    }

    public ApplicationLike createAppShellDelegate() {
        if (C17980vY.A02(this)) {
            return new SecondaryProcessAbstractAppShellDelegate(this);
        }
        return new AbstractAppShellDelegate(this, appStartStat);
    }

    public Context getBaseContext() {
        return this.originalAppContext;
    }

    public AnonymousClass00I getWorkManagerConfiguration() {
        return (AnonymousClass00I) getEntryPoint().CSH().get();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.appShellDelegate.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        super.onCreate();
        Boolean bool = C17970vW.A03;
        onCreateWithHiltReady();
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C18050vg.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void startActivity(Intent intent) {
        if (!C18050vg.A04(intent)) {
            C18050vg.A03(intent);
        }
        super.startActivity(intent);
    }

    public void sendBroadcast(Intent intent) {
        C18050vg.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendBroadcast(Intent intent, String str) {
        C18050vg.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }
}
