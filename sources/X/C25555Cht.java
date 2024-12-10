package X;

import android.opengl.Matrix;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cht  reason: case insensitive filesystem */
public class C25555Cht {
    public int A00 = 4;
    public final List A01 = AnonymousClass000.A13();
    public final Map A02 = C17880vN.A11();

    public static C25555Cht A00(C25523ChL chL, float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
        C25555Cht cht = new C25555Cht();
        cht.A00 = 5;
        cht.A02.put("aPosition", chL);
        cht.A01.add("aPosition");
        return cht;
    }
}
