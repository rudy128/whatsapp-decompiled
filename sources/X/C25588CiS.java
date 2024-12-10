package X;

import android.opengl.Matrix;
import java.util.Map;

/* renamed from: X.CiS  reason: case insensitive filesystem */
public class C25588CiS {
    public static final float[] A05;
    public boolean A00;
    public boolean A01 = false;
    public C25517ChF A02;
    public final CPT A03;
    public final Map A04 = C17880vN.A11();

    static {
        float[] fArr = new float[16];
        A05 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public C25588CiS(C25517ChF chF) {
        C25555Cht cht = new C25555Cht();
        cht.A00 = 5;
        cht.A02.put("aPosition", new C25523ChL(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        cht.A01.add("aPosition");
        this.A03 = C25523ChL.A00(cht, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = chF;
        this.A00 = AnonymousClass000.A1Y(BE8.A0e(C25517ChF.A06, false, chF.A00));
    }
}
