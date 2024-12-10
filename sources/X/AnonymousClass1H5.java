package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.File;

/* renamed from: X.1H5  reason: invalid class name */
public final class AnonymousClass1H5 extends ContextWrapper {
    public LayoutInflater A00;
    public final C18030ve A01;
    public final AnonymousClass1H3 A02;
    public final C17990va A03;
    public final AnonymousClass1H7 A04;
    public final C18000vb A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1H5(android.content.Context r4, X.AnonymousClass1H3 r5, X.C18000vb r6, X.C18030ve r7, X.AnonymousClass00H r8) {
        /*
            r3 = this;
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            r0 = 2
            X.C18070vi.A0d(r7, r0)
            r0 = 3
            X.C18070vi.A0d(r6, r0)
            r0 = 4
            X.C18070vi.A0d(r5, r0)
            r0 = 5
            X.C18070vi.A0d(r8, r0)
            boolean r0 = X.C18000vb.A0C
            if (r0 != 0) goto L_0x003b
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r2 = r0.getConfiguration()
            java.util.Locale r1 = r2.locale
            java.util.Locale r0 = r6.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            java.util.Locale r0 = r6.A04
            r1.setLocale(r0)
            r2.updateFrom(r1)
            android.content.Context r4 = r4.createConfigurationContext(r2)
        L_0x003b:
            r3.<init>(r4)
            r3.A01 = r7
            r3.A05 = r6
            r3.A02 = r5
            r3.A08 = r8
            android.content.Context r0 = r3.getBaseContext()
            android.content.res.Resources r0 = r0.getResources()
            boolean r1 = r0 instanceof X.C17990va
            android.content.Context r0 = r3.getBaseContext()
            if (r1 == 0) goto L_0x008c
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.WaResourcesWrapper"
            X.C18070vi.A0z(r1, r0)
            X.0va r1 = (X.C17990va) r1
        L_0x0061:
            r3.A03 = r1
            X.1H6 r2 = new X.1H6
            r2.<init>(r3)
            r1 = 5
            X.2DN r0 = new X.2DN
            r0.<init>(r2, r1)
            r3.A04 = r0
            r0 = 1
            X.3Dc r1 = new X.3Dc
            r1.<init>(r3, r0)
            r2 = 0
            X.0vq r0 = new X.0vq
            r0.<init>(r2, r1)
            r3.A06 = r0
            r0 = 2
            X.3Dc r1 = new X.3Dc
            r1.<init>(r3, r0)
            X.0vq r0 = new X.0vq
            r0.<init>(r2, r1)
            r3.A07 = r0
            return
        L_0x008c:
            X.0va r1 = X.C17990va.A00(r0, r6)
            X.C18070vi.A0X(r1)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H5.<init>(android.content.Context, X.1H3, X.0vb, X.0ve, X.00H):void");
    }

    public Context createConfigurationContext(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        Context createConfigurationContext = super.createConfigurationContext(configuration);
        C18070vi.A0X(createConfigurationContext);
        C18030ve r4 = this.A01;
        return new AnonymousClass1H5(createConfigurationContext, this.A02, this.A05, r4, this.A08);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        C18070vi.A0d(str, 0);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(str, i);
        C18070vi.A0X(sharedPreferences);
        return sharedPreferences;
    }

    public Object getSystemService(String str) {
        C18070vi.A0d(str, 0);
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A00;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        AnonymousClass1H8 r2 = new AnonymousClass1H8(this, LayoutInflater.from(getBaseContext()), ((AnonymousClass1H4) this.A02).A00);
        this.A00 = r2;
        return r2;
    }

    public void sendBroadcast(Intent intent) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendBroadcast(intent);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle2) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle, broadcastReceiver, handler, i, str2, bundle2);
    }

    public void startActivity(Intent intent) {
        C18070vi.A0d(intent, 0);
        C18050vg.A04(intent);
        super.startActivity(intent);
    }

    public File getCacheDir() {
        File cacheDir;
        Object obj = this.A07.get();
        C18070vi.A0X(obj);
        if (((Boolean) obj).booleanValue()) {
            cacheDir = getApplicationContext().getCacheDir();
        } else {
            cacheDir = super.getCacheDir();
        }
        C18070vi.A0b(cacheDir);
        return cacheDir;
    }

    public File getExternalCacheDir() {
        Object obj = this.A07.get();
        C18070vi.A0X(obj);
        if (((Boolean) obj).booleanValue()) {
            return getApplicationContext().getExternalCacheDir();
        }
        return super.getExternalCacheDir();
    }

    public File getFilesDir() {
        File filesDir;
        Object obj = this.A07.get();
        C18070vi.A0X(obj);
        if (((Boolean) obj).booleanValue()) {
            filesDir = getApplicationContext().getFilesDir();
        } else {
            filesDir = super.getFilesDir();
        }
        C18070vi.A0b(filesDir);
        return filesDir;
    }

    public Resources.Theme getTheme() {
        Object obj = this.A06.get();
        C18070vi.A0X(obj);
        if (((Boolean) obj).booleanValue()) {
            Object A012 = this.A04.A01();
            C18070vi.A0b(A012);
            return (Resources.Theme) A012;
        }
        Resources.Theme theme = super.getTheme();
        C18070vi.A0X(theme);
        return theme;
    }

    public void setTheme(int i) {
        Object obj = this.A06.get();
        C18070vi.A0X(obj);
        if (((Boolean) obj).booleanValue()) {
            this.A04.A02();
        }
        super.setTheme(i);
    }

    public Resources getResources() {
        return this.A03;
    }

    public void sendBroadcast(Intent intent, String str, Bundle bundle) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendBroadcast(intent, str, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, Bundle bundle) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, bundle);
    }

    public void sendBroadcast(Intent intent, String str) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, int i, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, String str3, Bundle bundle, Bundle bundle2) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, i, str, str2, broadcastReceiver, handler, str3, bundle, bundle2);
    }

    public void sendOrderedBroadcast(Intent intent, String str, String str2, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str3, Bundle bundle) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, str2, broadcastReceiver, handler, i, str3, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        C18070vi.A0d(intent, 0);
        C18050vg.A02(intent);
        super.sendOrderedBroadcast(intent, str);
    }
}
