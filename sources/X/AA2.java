package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;

public class AA2 implements ServiceConnection {
    public IInterface A00;
    public Integer A01;
    public AnonymousClass9Z1 A02;
    public final Context A03;
    public final AnonymousClass190 A04;
    public final Object A05 = C17880vN.A0p();
    public final AnonymousClass9Z0 A06;

    public void onBindingDied(ComponentName componentName) {
        A00("binder-died");
    }

    public void onNullBinding(ComponentName componentName) {
        A00("binder-null");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.AJ1] */
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        IAppDataReaderService iAppDataReaderService;
        if (iBinder != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("svc-connection/attach-binder; service=");
            String A0y = AnonymousClass000.A0y("GoogleMigrateClient", A10);
            Log.i(A0y);
            Object obj = this.A05;
            synchronized (obj) {
                Integer num = this.A01;
                z = false;
                if (num == AnonymousClass00R.A01) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof IAppDataReaderService)) {
                        ? obj2 = new Object();
                        obj2.A00 = iBinder;
                        iAppDataReaderService = obj2;
                    } else {
                        iAppDataReaderService = (IAppDataReaderService) queryLocalInterface;
                    }
                    this.A00 = iAppDataReaderService;
                    this.A01 = AnonymousClass00R.A0C;
                    obj.notifyAll();
                    StringBuilder A11 = AnonymousClass000.A11(A0y);
                    A11.append(" -> state=");
                    C17890vO.A1A(A11, C181739Rq.A00(this.A01));
                } else {
                    StringBuilder A112 = AnonymousClass000.A11(A0y);
                    A112.append(", attached while in a wrong state=");
                    C17890vO.A19(A112, C181739Rq.A00(num));
                    AnonymousClass190 r3 = this.A04;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("unexpected state=");
                    r3.A0G("svc-connection-attach-binder-failure", AnonymousClass000.A0y(C181739Rq.A00(this.A01), A102), false);
                    z = true;
                }
            }
            if (z) {
                A01(true);
                return;
            }
            return;
        }
        A00("binder-null-on-connect");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        A00("disconnected");
    }

    public AA2(Context context, AnonymousClass190 r3, AnonymousClass9Z0 r4, AnonymousClass9Z1 r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A01 = AnonymousClass00R.A00;
    }

    public void A00(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("svc-connection/detach-binder; service=");
        String A0y = AnonymousClass000.A0y("GoogleMigrateClient", A10);
        C17900vP.A0f(", reason=", str, AnonymousClass000.A11(A0y));
        synchronized (this.A05) {
            Integer num = this.A01;
            if (!(num == AnonymousClass00R.A01 || num == AnonymousClass00R.A0C)) {
                StringBuilder A0H = C17900vP.A0H(A0y, ", reason=", str);
                A0H.append(", detached while in wrong state=");
                C17890vO.A19(A0H, C181739Rq.A00(num));
                AnonymousClass190 r3 = this.A04;
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("reason=");
                A102.append(str);
                A102.append(", unexpected state=");
                r3.A0G("svc-connection-detach-binder-failure", AnonymousClass000.A0y(C181739Rq.A00(this.A01), A102), false);
            }
        }
        A01(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r4 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r4.A01 == r6) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r4.A04.A0G("svc-client-close-unexpected-connection", X.AnonymousClass001.A1H("name=", "GoogleMigrateClient", X.AnonymousClass000.A10()), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r4.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r6.A03.unbindService(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "svc-connection/close; service="
            r1.append(r0)
            java.lang.String r5 = "GoogleMigrateClient"
            java.lang.String r4 = X.AnonymousClass000.A0y(r5, r1)
            com.whatsapp.util.Log.i((java.lang.String) r4)
            java.lang.Object r3 = r6.A05
            monitor-enter(r3)
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x0067 }
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0067 }
            if (r0 != r1) goto L_0x001d
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            return
        L_0x001d:
            X.9Z1 r2 = r6.A02     // Catch:{ all -> 0x0067 }
            r0 = 0
            r6.A02 = r0     // Catch:{ all -> 0x0067 }
            r6.A01 = r1     // Catch:{ all -> 0x0067 }
            r3.notifyAll()     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = " -> state="
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = X.C181739Rq.A00(r0)     // Catch:{ all -> 0x0067 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0067 }
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            android.content.Context r0 = r6.A03
            r0.unbindService(r6)
            if (r7 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            X.9ua r4 = r2.A00
            monitor-enter(r4)
            X.AA2 r0 = r4.A01     // Catch:{ all -> 0x0063 }
            if (r0 == r6) goto L_0x005e
            X.190 r3 = r4.A04     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "svc-client-close-unexpected-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "name="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ all -> 0x0063 }
            r0 = 0
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x0063 }
        L_0x005c:
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x0062
        L_0x005e:
            r0 = 0
            r4.A01 = r0     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0066:
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AA2.A01(boolean):void");
    }
}
