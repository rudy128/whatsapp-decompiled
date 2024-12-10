package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Map;

public final class Cy0 implements ServiceConnection, C28448E1o {
    public int A00 = 2;
    public ComponentName A01;
    public IBinder A02;
    public boolean A03;
    public final C26021Cqe A04;
    public final Map A05 = C17880vN.A11();
    public final /* synthetic */ C26122Csk A06;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        if (r11 != null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r17) {
        /*
            r16 = this;
            r0 = 3
            r12 = r16
            r12.A00 = r0
            android.os.StrictMode$VmPolicy r4 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x001f
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r4)
            android.os.StrictMode$VmPolicy$Builder r0 = r0.permitUnsafeIntentLaunch()
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L_0x001f:
            X.Csk r2 = r12.A06     // Catch:{ all -> 0x00a8 }
            X.CsX r13 = r2.A01     // Catch:{ all -> 0x00a8 }
            android.content.Context r10 = r2.A00     // Catch:{ all -> 0x00a8 }
            X.Cqe r3 = r12.A04     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "ConnectionStatusConfig"
            java.lang.String r5 = r3.A01     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x0059
            boolean r0 = r3.A03     // Catch:{ all -> 0x00a8 }
            r9 = 0
            if (r0 == 0) goto L_0x0078
            android.os.Bundle r8 = X.C17880vN.A0D()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "serviceActionBundleKey"
            r8.putString(r0, r5)     // Catch:{ all -> 0x00a8 }
            android.content.ContentResolver r7 = r10.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x004a }
            android.net.Uri r1 = X.C26021Cqe.A04     // Catch:{ IllegalArgumentException -> 0x004a }
            java.lang.String r0 = "serviceIntentCall"
            android.os.Bundle r1 = r7.call(r1, r0, r9, r8)     // Catch:{ IllegalArgumentException -> 0x004a }
            if (r1 == 0) goto L_0x006f
            goto L_0x0065
        L_0x004a:
            r0 = move-exception
            java.lang.String r1 = "Dynamic intent resolution failed: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x00a8 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x006f
        L_0x0059:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00a8 }
            r1.<init>()     // Catch:{ all -> 0x00a8 }
            android.content.ComponentName r0 = r3.A00     // Catch:{ all -> 0x00a8 }
            android.content.Intent r11 = r1.setComponent(r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x0082
        L_0x0065:
            java.lang.String r0 = "serviceResponseIntentKey"
            android.os.Parcelable r11 = r1.getParcelable(r0)     // Catch:{ all -> 0x00a8 }
            android.content.Intent r11 = (android.content.Intent) r11     // Catch:{ all -> 0x00a8 }
            if (r11 != 0) goto L_0x0082
        L_0x006f:
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            java.lang.String r0 = X.BE7.A0m(r0, r5)     // Catch:{ all -> 0x00a8 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x00a8 }
        L_0x0078:
            android.content.Intent r1 = X.C108945cZ.A0G(r5)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x00a8 }
            android.content.Intent r11 = r1.setPackage(r0)     // Catch:{ all -> 0x00a8 }
        L_0x0082:
            r15 = 4225(0x1081, float:5.92E-42)
            r1 = 1
            r14 = r17
            boolean r0 = X.C26111CsX.A01(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00a8 }
            r12.A03 = r0     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x009e
            android.os.Handler r0 = r2.A04     // Catch:{ all -> 0x00a8 }
            android.os.Message r3 = r0.obtainMessage(r1, r3)     // Catch:{ all -> 0x00a8 }
            android.os.Handler r2 = r2.A04     // Catch:{ all -> 0x00a8 }
            r0 = 300000(0x493e0, double:1.482197E-318)
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x00a8 }
            goto L_0x00a4
        L_0x009e:
            r0 = 2
            r12.A00 = r0     // Catch:{ all -> 0x00a8 }
            r13.A02(r10, r12)     // Catch:{ IllegalArgumentException -> 0x00a4 }
        L_0x00a4:
            android.os.StrictMode.setVmPolicy(r4)
            return
        L_0x00a8:
            r0 = move-exception
            android.os.StrictMode.setVmPolicy(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cy0.A00(java.lang.String):void");
    }

    public Cy0(C26021Cqe cqe, C26122Csk csk) {
        this.A06 = csk;
        this.A04 = cqe;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C26122Csk csk = this.A06;
        synchronized (csk.A02) {
            csk.A04.removeMessages(1, this.A04);
            this.A02 = iBinder;
            this.A01 = componentName;
            Iterator A0l = C17890vO.A0l(this.A05);
            while (A0l.hasNext()) {
                ((ServiceConnection) A0l.next()).onServiceConnected(componentName, iBinder);
            }
            this.A00 = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C26122Csk csk = this.A06;
        synchronized (csk.A02) {
            csk.A04.removeMessages(1, this.A04);
            this.A02 = null;
            this.A01 = componentName;
            Iterator A0l = C17890vO.A0l(this.A05);
            while (A0l.hasNext()) {
                ((ServiceConnection) A0l.next()).onServiceDisconnected(componentName);
            }
            this.A00 = 2;
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }
}
