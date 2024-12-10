package X;

import android.net.Uri;
import android.opengl.Matrix;
import java.nio.FloatBuffer;

public class DGR implements C28607E9y {
    public CRS A00;
    public boolean A01 = false;
    public final DGU A02;

    public void CHu(CVG cvg) {
    }

    public String BY8() {
        return "LiteRelativeImageOverlayRenderer";
    }

    public boolean BsM(C25599Cie cie, long j) {
        float f;
        Uri A012;
        C25599Cie cie2 = cie;
        if (!this.A01) {
            CRS crs = this.A00;
            C26159CtX.A01(crs);
            float f2 = 0.0f;
            if (crs.A03) {
                float[] fArr = new float[4];
                Matrix.multiplyMV(fArr, 0, cie2.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f3 = fArr[1];
                float[] fArr2 = new float[4];
                Matrix.multiplyMV(fArr2, 0, cie2.A02, 0, new float[]{-1.0f, 1.0f, 0.0f, 0.0f}, 0);
                float f4 = fArr2[1];
                f2 = ((1.0f - f3) / C108945cZ.A00(1.0f, -1.0f)) + (0.0f * f4);
                f = (crs.A00 * f4) + f2;
            } else {
                f = 0.0f + crs.A00;
            }
            float f5 = 0.0f + crs.A01;
            float A002 = C108945cZ.A00(1.0f, -1.0f);
            float f6 = ((0.0f * A002) - 4.0f) + 0.0f;
            float f7 = ((1.0f - f2) * A002) - 4.0f;
            float f8 = ((f5 * A002) - 4.0f) + 0.0f;
            float f9 = ((1.0f - f) * A002) - 4.0f;
            DGU dgu = this.A02;
            String str = crs.A02;
            if (str == null) {
                A012 = null;
            } else {
                A012 = C26215Cuu.A01(str);
            }
            Uri uri = dgu.A03;
            if (uri == null || !uri.equals(A012)) {
                DGU.A00(dgu, AnonymousClass000.A1X(A012));
                dgu.A09.A00 = A012;
                dgu.A03 = A012;
            }
            float[] fArr3 = C24681CEv.A00;
            fArr3[0] = f6;
            fArr3[1] = f9;
            fArr3[2] = f8;
            BE9.A1N(fArr3, f9, f6);
            fArr3[5] = f7;
            fArr3[6] = f8;
            fArr3[7] = f7;
            dgu.A09.A01 = fArr3;
            FloatBuffer floatBuffer = dgu.A0G.A01;
            floatBuffer.put(fArr3);
            floatBuffer.position(0);
            this.A01 = true;
        }
        return this.A02.BsM(cie2, j);
    }

    public void C84(C25998CqE cqE) {
        this.A02.C84(cqE);
    }

    public void C85() {
        this.A02.C85();
    }

    public boolean isEnabled() {
        return this.A02.isEnabled();
    }

    public DGR(C28559E7l e7l, CRS crs) {
        Uri A012;
        String str = crs.A02;
        if (str == null) {
            A012 = null;
        } else {
            A012 = C26215Cuu.A01(str);
        }
        this.A02 = new DGU(A012, e7l);
        this.A00 = crs;
    }

    public void C83(int i, int i2) {
    }
}
