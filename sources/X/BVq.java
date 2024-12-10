package X;

import java.util.Iterator;
import java.util.Map;

public class BVq extends DGQ implements EDP {
    public C25998CqE A00;
    public CPT A01;
    public final C27072DRy A02;
    public final Map A03;
    public final C25523ChL A04;
    public final boolean A05;
    public final float[] A06;

    public void C83(int i, int i2) {
    }

    public void C85() {
        this.A00 = null;
        Map map = this.A03;
        Iterator A0l = C17890vO.A0l(map);
        while (A0l.hasNext()) {
            ((C25739Cl9) A0l.next()).A02();
        }
        map.clear();
    }

    public void CHu(CVG cvg) {
    }

    public boolean isEnabled() {
        return true;
    }

    public String BY8() {
        return "CopyRenderer";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r2 != 36197) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r2 != 36197) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BsM(X.C25599Cie r7, long r8) {
        /*
            r6 = this;
            X.DRy r5 = r6.A02
            boolean r3 = r5.A01
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x0010
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r3 == r0) goto L_0x003f
            boolean r0 = r6.A05
            if (r0 != 0) goto L_0x0030
            java.util.Map r2 = r6.A03
            java.util.Iterator r1 = X.C17890vO.A0l(r2)
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.next()
            X.Cl9 r0 = (X.C25739Cl9) r0
            r0.A02()
            goto L_0x001d
        L_0x002d:
            r2.clear()
        L_0x0030:
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x003c
            int r2 = r0.A01
            r1 = 36197(0x8d65, float:5.0723E-41)
            r0 = 1
            if (r2 == r1) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r5.A01 = r0
        L_0x003f:
            r0 = 3042(0xbe2, float:4.263E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2929(0xb71, float:4.104E-42)
            android.opengl.GLES20.glDisable(r0)
            r0 = 2884(0xb44, float:4.041E-42)
            android.opengl.GLES20.glDisable(r0)
            X.CqE r1 = r6.A00
            java.lang.String r0 = "Called without a program factory"
            X.C26159CtX.A02(r1, r0)
            java.util.Map r4 = r6.A03
            java.lang.Object r1 = r4.get(r5)
            X.Cl9 r1 = (X.C25739Cl9) r1
            if (r1 != 0) goto L_0x0074
            r3 = 2132017166(0x7f14000e, float:1.9672603E38)
            r2 = 2132017164(0x7f14000c, float:1.9672599E38)
            X.CqE r1 = r6.A00
            boolean r0 = r5.A01
            X.Cl9 r1 = r1.A02(r3, r2, r0)
            X.DRy r0 = r5.A00()
            r4.put(r0, r1)
        L_0x0074:
            X.Ckg r2 = r1.A01()
            java.lang.String r1 = "uSurfaceTransformMatrix"
            float[] r0 = r7.A04
            r2.A02(r1, r0)
            java.lang.String r1 = "uVideoTransformMatrix"
            float[] r0 = r7.A05
            r2.A02(r1, r0)
            java.lang.String r1 = "uSceneTransformMatrix"
            float[] r0 = r7.A03
            r2.A02(r1, r0)
            java.lang.String r1 = "sTexture"
            X.CZB r0 = r7.A01
            if (r0 == 0) goto L_0x00a8
            r2.A01(r0, r1)
            X.CPT r1 = r6.A01
            X.Cl9 r0 = r2.A00
            X.C25739Cl9.A00(r1, r0)
            java.lang.Object[] r1 = X.BE6.A1Z()
            java.lang.String r0 = "copyRenderer::onDrawFrame"
            X.C26058CrU.A03(r0, r1)
            r0 = 1
            return r0
        L_0x00a8:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVq.BsM(X.Cie, long):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.DRy] */
    public BVq(boolean z) {
        C25523ChL chL = new C25523ChL(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A04 = chL;
        this.A05 = z;
        this.A03 = C17880vN.A11();
        Integer num = AnonymousClass00R.A00;
        ? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A02 = obj;
        float[] fArr = new float[16];
        this.A06 = fArr;
        this.A01 = C25523ChL.A00(C25555Cht.A00(chL, fArr), new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public void C84(C25998CqE cqE) {
        this.A00 = cqE;
    }

    public BVq() {
        this(false);
    }
}
