package X;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.ExecutorService;

/* renamed from: X.BZw  reason: case insensitive filesystem */
public final class C23020BZw extends C23023BZz {
    public final C25976Cpm A00;
    public final CVK A01;
    public final CVK A02;
    public final CVK A03;
    public final CVK A04;
    public final CVK A05;
    public final CVK A06;
    public final CVK A07;
    public final CVK A08;
    public final CVK A09;
    public final ExecutorService A0A;

    public final void A08(Bundle bundle, IBinder iBinder, int i, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", AnonymousClass001.A1I("onPostInitHandler: statusCode ", BE6.A0t(41), i));
        }
        if (i == 0) {
            this.A01.A00(iBinder);
            this.A02.A00(iBinder);
            this.A03.A00(iBinder);
            this.A04.A00(iBinder);
            this.A05.A00(iBinder);
            this.A06.A00(iBinder);
            this.A07.A00(iBinder);
            this.A08.A00(iBinder);
            this.A09.A00(iBinder);
            i = 0;
        }
        super.A08(bundle, iBinder, i, i2);
    }

    public final int BUx() {
        return 8600000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r1 < 8600000) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BFd(X.E5F r7) {
        /*
            r6 = this;
            java.lang.String r5 = "com.google.android.wearable.app.cn"
            boolean r0 = r6.CFd()
            if (r0 != 0) goto L_0x00a9
            android.content.Context r4 = r6.A0F     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r5, r0)     // Catch:{ NameNotFoundException -> 0x008e }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x008e }
            r3 = 0
            if (r1 == 0) goto L_0x008b
            java.lang.String r0 = "com.google.android.wearable.api.version"
            int r1 = r1.getInt(r0, r3)     // Catch:{ NameNotFoundException -> 0x008e }
            r0 = 8600000(0x8339c0, float:1.2051167E-38)
            if (r1 >= r0) goto L_0x00a9
        L_0x0024:
            r0 = 82
            java.lang.StringBuilder r2 = X.BE6.A0t(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r0 = "The Wear OS app is out of date. Requires API version 8600000 but found "
            r2.append(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            r2.append(r1)     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r1 = "WearableClient"
            java.lang.String r0 = r2.toString()     // Catch:{ NameNotFoundException -> 0x008e }
            android.util.Log.w(r1, r0)     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r0 = "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.Intent r2 = r0.setPackage(r5)     // Catch:{ NameNotFoundException -> 0x008e }
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x008e }
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)     // Catch:{ NameNotFoundException -> 0x008e }
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "market://details"
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            android.net.Uri$Builder r1 = r0.buildUpon()     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r0 = "id"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)     // Catch:{ NameNotFoundException -> 0x008e }
            android.net.Uri r1 = r0.build()     // Catch:{ NameNotFoundException -> 0x008e }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x008e }
            r2.<init>(r0, r1)     // Catch:{ NameNotFoundException -> 0x008e }
        L_0x006c:
            int r0 = X.CFE.A00     // Catch:{ NameNotFoundException -> 0x008e }
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r4, r3, r2, r0)     // Catch:{ NameNotFoundException -> 0x008e }
            r3 = 6
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C18210vx.A02(r7, r0)     // Catch:{ NameNotFoundException -> 0x008e }
            r6.A08 = r7     // Catch:{ NameNotFoundException -> 0x008e }
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0B     // Catch:{ NameNotFoundException -> 0x008e }
            int r2 = r0.get()     // Catch:{ NameNotFoundException -> 0x008e }
            android.os.Handler r1 = r6.A0G     // Catch:{ NameNotFoundException -> 0x008e }
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0, r2, r3, r4)     // Catch:{ NameNotFoundException -> 0x008e }
            r1.sendMessage(r0)     // Catch:{ NameNotFoundException -> 0x008e }
            goto L_0x008d
        L_0x008b:
            r1 = 0
            goto L_0x0024
        L_0x008d:
            return
        L_0x008e:
            r4 = 0
            r3 = 16
            java.lang.String r0 = "Connection progress callbacks cannot be null."
            X.C18210vx.A02(r7, r0)
            r6.A08 = r7
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0B
            int r2 = r0.get()
            android.os.Handler r1 = r6.A0G
            r0 = 3
            android.os.Message r0 = r1.obtainMessage(r0, r2, r3, r4)
            r1.sendMessage(r0)
            return
        L_0x00a9:
            super.BFd(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23020BZw.BFd(X.E5F):void");
    }

    public final boolean CFd() {
        return AnonymousClass000.A1P(this.A00.A01() ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23020BZw(android.content.Context r11, android.os.Looper r12, X.EDW r13, X.EDX r14, X.CTL r15) {
        /*
            r10 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r4 = r11
            X.C18210vx.A00(r11)
            java.lang.Class<X.Cpm> r1 = X.C25976Cpm.class
            monitor-enter(r1)
            X.Cpm r0 = X.C25976Cpm.A01     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x001a
            X.Cpm r0 = new X.Cpm     // Catch:{ all -> 0x006e }
            r0.<init>(r11)     // Catch:{ all -> 0x006e }
            X.C25976Cpm.A01 = r0     // Catch:{ all -> 0x006e }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            X.Cpm r1 = X.C25976Cpm.A01
            r9 = 14
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A01 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A02 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A03 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A04 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A05 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A06 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A07 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A08 = r0
            X.CVK r0 = new X.CVK
            r0.<init>()
            r10.A09 = r0
            X.C18210vx.A00(r2)
            r10.A0A = r2
            r10.A00 = r1
            return
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23020BZw.<init>(android.content.Context, android.os.Looper, X.EDW, X.EDX, X.CTL):void");
    }
}
