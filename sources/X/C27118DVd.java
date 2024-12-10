package X;

import java.util.concurrent.Callable;

/* renamed from: X.DVd  reason: case insensitive filesystem */
public final /* synthetic */ class C27118DVd implements Callable {
    public final /* synthetic */ DRB A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r4.A07 != false) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r5 = this;
            X.DRB r4 = r5.A00
            boolean r0 = r5.A02
            java.lang.Object r2 = r5.A01
            if (r0 == 0) goto L_0x000b
            X.DRB.A06(r4)
        L_0x000b:
            boolean r0 = X.DRB.A08(r4)
            r3 = 0
            if (r0 != 0) goto L_0x008e
            android.os.HandlerThread r1 = r4.A0B
            X.C17960vV.A04(r1)
            X.DRB.A06(r4)     // Catch:{ RuntimeException -> 0x003b }
            boolean r0 = r2 instanceof android.view.Surface     // Catch:{ RuntimeException -> 0x003b }
            if (r0 == 0) goto L_0x002d
            X.Cbg r0 = r4.A06     // Catch:{ RuntimeException -> 0x003b }
            android.view.Surface r2 = (android.view.Surface) r2     // Catch:{ RuntimeException -> 0x003b }
            X.E04 r0 = (X.E04) r0     // Catch:{ RuntimeException -> 0x003b }
            X.E04.A00(r2, r0)     // Catch:{ RuntimeException -> 0x003b }
        L_0x0027:
            X.Cbg r0 = r4.A06     // Catch:{ RuntimeException -> 0x003b }
            r0.A04()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0044
        L_0x002d:
            boolean r0 = r2 instanceof android.graphics.SurfaceTexture     // Catch:{ RuntimeException -> 0x003b }
            if (r0 == 0) goto L_0x0027
            X.Cbg r0 = r4.A06     // Catch:{ RuntimeException -> 0x003b }
            android.graphics.SurfaceTexture r2 = (android.graphics.SurfaceTexture) r2     // Catch:{ RuntimeException -> 0x003b }
            X.E04 r0 = (X.E04) r0     // Catch:{ RuntimeException -> 0x003b }
            X.E04.A00(r2, r0)     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0027
        L_0x003b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.DRB.A05(r4)
            r0 = 0
            goto L_0x008b
        L_0x0044:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0059
            X.C17960vV.A04(r1)
            X.CZE r0 = r4.A04
            if (r0 == 0) goto L_0x0059
            android.graphics.SurfaceTexture r0 = r0.A01
            r0.updateTexImage()
            X.C17960vV.A04(r1)
            r4.A08 = r3
        L_0x0059:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0F
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x006b
            boolean r0 = r4.A07
            r2 = 0
            if (r0 == 0) goto L_0x006c
        L_0x006b:
            r2 = 1
        L_0x006c:
            com.whatsapp.voipcalling.GlVideoRenderer r1 = r4.A0E
            r0 = 61
            boolean r0 = r1.init(r0, r2)
            if (r0 != 0) goto L_0x0093
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/VideoRenderer.init() failed for "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            r1.append(r0)
            X.C17890vO.A0w(r1)
            X.DRB.A05(r4)
            r0 = 0
        L_0x008b:
            if (r0 != 0) goto L_0x008e
            r3 = -6
        L_0x008e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x0093:
            X.1DC r0 = r4.A03
            boolean r0 = r0.BgK()
            if (r0 == 0) goto L_0x00d0
            float[] r2 = X.DRB.A0Q
        L_0x009d:
            boolean r0 = X.BE8.A1W(r4)
            if (r0 == 0) goto L_0x00b5
            android.os.Handler r1 = r4.A0A
            r0 = 8
            r1.removeMessages(r0)
            android.os.Message r1 = r1.obtainMessage(r0, r2)
            java.lang.String r0 = "setBackgroundColor"
            X.DRB.A00(r1, r4, r0)
        L_0x00b3:
            r0 = 1
            goto L_0x008b
        L_0x00b5:
            r1 = 19
            X.DVY r0 = new X.DVY
            r0.<init>(r4, r2, r1)
            int r2 = X.DRB.A02(r4, r0)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/CoreVideoPort/setBackgroundColor failed: "
            com.whatsapp.jid.UserJid r0 = X.BEA.A0W(r4, r0, r1, r2)
            X.C17900vP.A0b(r0, r1)
            goto L_0x00b3
        L_0x00d0:
            float[] r2 = X.DRB.A0O
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27118DVd.call():java.lang.Object");
    }

    public /* synthetic */ C27118DVd(DRB drb, Object obj, boolean z) {
        this.A00 = drb;
        this.A02 = z;
        this.A01 = obj;
    }
}
