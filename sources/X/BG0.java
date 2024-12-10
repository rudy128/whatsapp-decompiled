package X;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

public class BG0 extends Handler {
    public final Handler A00 = C17890vO.A0D();
    public final WeakReference A01;

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        r5.post(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0123, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.ref.WeakReference r0 = r7.A01
            java.lang.Object r2 = r0.get()
            X.DRB r2 = (X.DRB) r2
            if (r2 == 0) goto L_0x0010
            int r0 = r8.what
            r6 = 0
            switch(r0) {
                case 1: goto L_0x00e6;
                case 2: goto L_0x0092;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00a1;
                case 5: goto L_0x0010;
                case 6: goto L_0x0051;
                case 7: goto L_0x002f;
                case 8: goto L_0x0011;
                case 9: goto L_0x008f;
                case 10: goto L_0x0115;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r1 = r8.obj
            X.C17960vV.A07(r1)
            float[] r1 = (float[]) r1
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            boolean r0 = r0.setBackgroundColor(r1)
            if (r0 != 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0D
            X.C17900vP.A0b(r0, r1)
            return
        L_0x002f:
            java.lang.Object r0 = r8.obj
            if (r0 == 0) goto L_0x0010
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/ releasing surface texture holder for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0D
            X.C17900vP.A0b(r0, r1)
            java.lang.Object r0 = r8.obj
            X.CZE r0 = (X.CZE) r0
            r0.A00()
            android.os.HandlerThread r0 = r2.A0B
            X.C17960vV.A04(r0)
            r0 = 0
            r2.A04 = r0
            return
        L_0x0051:
            int r5 = r8.arg1
            int r4 = r8.arg2
            java.lang.Object r3 = r8.obj
            X.C17960vV.A07(r3)
            X.CZE r3 = (X.CZE) r3
            r0 = 1
            android.os.HandlerThread r1 = r2.A0B
            X.C17960vV.A04(r1)
            r2.A08 = r0
            boolean r0 = X.DRB.A08(r2)
            if (r0 != 0) goto L_0x0072
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/renderTexture failed: -6 for "
            goto L_0x00f6
        L_0x0072:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            boolean r0 = r3.A01(r0, r5, r4)
            if (r0 == 0) goto L_0x0010
            X.C17960vV.A04(r1)
            r2.A08 = r6
            int r0 = X.DRB.A01(r2)
            if (r0 != 0) goto L_0x0010
            android.os.Handler r5 = r7.A00
            r0 = 4
            X.7R9 r4 = new X.7R9
            r4.<init>((java.lang.Object) r2, (int) r0)
            goto L_0x0120
        L_0x008f:
            r2.A0N = r6
            return
        L_0x0092:
            java.lang.Object r0 = r8.obj
            X.C17960vV.A07(r0)
            int r1 = X.AnonymousClass000.A0M(r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            r0.setScaleType(r1)
            return
        L_0x00a1:
            android.os.HandlerThread r0 = r2.A0B
            X.C17960vV.A04(r0)
            r3 = 0
            int[] r1 = X.C25244Cbg.A00     // Catch:{ Exception -> 0x00b1 }
            X.E04 r0 = new X.E04     // Catch:{ Exception -> 0x00b1 }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x00b1 }
            r2.A06 = r0     // Catch:{ Exception -> 0x00b1 }
            return
        L_0x00b1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.DRB.A05(r2)
            r3 = -5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/create failed to init EGL ("
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ") for "
            goto L_0x00f6
        L_0x00c8:
            java.lang.Object r0 = r8.obj
            X.C17960vV.A07(r0)
            float r1 = X.AnonymousClass000.A04(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0F
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00e0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/setCornerRadius failed: -6 for "
            goto L_0x00f6
        L_0x00e0:
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            r0.setCornerRadius(r1)
            return
        L_0x00e6:
            int r3 = r8.arg1
            int r1 = r8.arg2
            boolean r0 = X.DRB.A08(r2)
            if (r0 != 0) goto L_0x0102
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/setWindowSize failed: -6 for "
        L_0x00f6:
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r2.A0D
            r1.append(r0)
            X.C17890vO.A0w(r1)
            return
        L_0x0102:
            float[] r0 = X.DRB.A0P
            X.DRB.A03(r2, r0)
            com.whatsapp.voipcalling.GlVideoRenderer r0 = r2.A0E
            r0.setWindow(r6, r6, r3, r1)
            android.os.Handler r5 = r7.A00
            r0 = 2
            X.7RE r4 = new X.7RE
            r4.<init>(r2, r1, r3, r0)
            goto L_0x0120
        L_0x0115:
            java.lang.Object r1 = r8.obj
            android.os.Handler r5 = r7.A00
            r0 = 11
            X.7RL r4 = new X.7RL
            r4.<init>(r2, r1, r0)
        L_0x0120:
            r5.post(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG0.handleMessage(android.os.Message):void");
    }

    public BG0(Looper looper, DRB drb) {
        super(looper);
        this.A01 = AnonymousClass3MW.A0z(drb);
    }
}
