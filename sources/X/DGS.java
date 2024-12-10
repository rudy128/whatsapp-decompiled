package X;

import java.util.Map;

public class DGS implements C28607E9y {
    public int A00;
    public C25998CqE A01;
    public boolean A02;
    public CPT A03;
    public final C25523ChL A04;
    public final C27071DRx A05;
    public final Map A06;
    public final float[] A07;

    public void C83(int i, int i2) {
    }

    public void C85() {
        this.A01 = null;
        this.A06.clear();
    }

    public void CHu(CVG cvg) {
    }

    public boolean isEnabled() {
        return false;
    }

    public String BY8() {
        return "CopyRenderer";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2 != 36197) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r2 != 36197) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BsM(X.C25599Cie r7, long r8) {
        /*
            r6 = this;
            r0 = 16640(0x4100, float:2.3318E-41)
            android.opengl.GLES20.glClear(r0)
            X.DRx r5 = r6.A05
            boolean r3 = r5.A01
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x0015
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r3 == r0) goto L_0x002c
            java.util.Map r0 = r6.A06
            r0.clear()
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x0029
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r5.A01 = r0
        L_0x002c:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.CqE r0 = r6.A01
            if (r0 == 0) goto L_0x00d5
            java.util.Map r4 = r6.A06
            java.lang.Object r1 = r4.get(r5)
            X.Cl9 r1 = (X.C25739Cl9) r1
            if (r1 != 0) goto L_0x0066
            int r1 = r6.A00
            r0 = 6
            if (r1 == r0) goto L_0x00b0
            r0 = 7
            if (r1 == r0) goto L_0x00a1
            X.CqE r3 = r6.A01
            r2 = 2132017189(0x7f140025, float:1.967265E38)
            r1 = 2132017188(0x7f140024, float:1.9672647E38)
            boolean r0 = r6.A02
            X.Cl9 r1 = r3.A02(r2, r1, r0)
        L_0x005f:
            X.DRx r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0066:
            X.Ckg r2 = r1.A01()
            java.lang.String r1 = "uSTMatrix"
            float[] r0 = r7.A04
            r2.A02(r1, r0)
            java.lang.String r1 = "uConstMatrix"
            float[] r0 = r7.A05
            r2.A02(r1, r0)
            java.lang.String r1 = "uSceneMatrix"
            float[] r0 = r7.A03
            r2.A02(r1, r0)
            java.lang.String r1 = "uContentTransform"
            float[] r0 = r7.A02
            r2.A02(r1, r0)
            java.lang.String r1 = "sTexture"
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x00ce
            r2.A01(r0, r1)
            X.CPT r1 = r6.A03
            X.Cl9 r0 = r2.A00
            X.C25739Cl9.A00(r1, r0)
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C26058CrU.A03(r0, r1)
            r0 = 1
            return r0
        L_0x00a1:
            X.CqE r3 = r6.A01     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017239(0x7f140057, float:1.967275E38)
            r1 = 2132017234(0x7f140052, float:1.967274E38)
            boolean r0 = r6.A02     // Catch:{ Exception -> 0x00bf }
            X.Cl9 r1 = r3.A02(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00b0:
            X.CqE r3 = r6.A01     // Catch:{ Exception -> 0x00bf }
            r2 = 2132017239(0x7f140057, float:1.967275E38)
            r1 = 2132017236(0x7f140054, float:1.9672745E38)
            boolean r0 = r6.A02     // Catch:{ Exception -> 0x00bf }
            X.Cl9 r1 = r3.A02(r2, r1, r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x005f
        L_0x00bf:
            X.CqE r3 = r6.A01
            r2 = 2132017189(0x7f140025, float:1.967265E38)
            r1 = 2132017188(0x7f140024, float:1.9672647E38)
            boolean r0 = r6.A02
            X.Cl9 r1 = r3.A02(r2, r1, r0)
            goto L_0x005f
        L_0x00ce:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00d5:
            java.lang.String r0 = "cannot be null"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGS.BsM(X.Cie, long):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.DRx] */
    public DGS(boolean z) {
        this.A02 = false;
        C25523ChL chL = new C25523ChL(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A04 = chL;
        this.A00 = 0;
        this.A06 = C17880vN.A11();
        Integer num = AnonymousClass00R.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A05 = obj;
        float[] fArr = new float[16];
        this.A07 = fArr;
        this.A03 = C25523ChL.A00(C25555Cht.A00(chL, fArr), new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = z;
    }

    public void C84(C25998CqE cqE) {
        this.A01 = cqE;
    }

    public DGS() {
        this(true);
    }
}
