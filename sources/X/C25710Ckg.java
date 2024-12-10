package X;

import android.opengl.GLES20;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Ckg  reason: case insensitive filesystem */
public class C25710Ckg {
    public final /* synthetic */ C25739Cl9 A00;

    public C25710Ckg(C25739Cl9 cl9) {
        this.A00 = cl9;
    }

    public static int A00(C25710Ckg ckg, String str) {
        C25739Cl9 cl9 = ckg.A00;
        Map map = cl9.A04;
        if (map.containsKey(str)) {
            return BE9.A0F(str, map);
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(cl9.A00, str);
        if (glGetUniformLocation != -1) {
            C17880vN.A1P(str, map, glGetUniformLocation);
            return glGetUniformLocation;
        }
        throw AnonymousClass000.A0n(String.format((Locale) null, "Uniform location not found: %s", AnonymousClass8BV.A1b(str)));
    }

    public void A01(CZB czb, String str) {
        int size;
        Map map = this.A00.A03;
        if (map.containsKey(str)) {
            size = BE9.A0F(str, map);
        } else {
            size = map.size();
            C17880vN.A1P(str, map, size);
        }
        int i = czb.A01;
        int i2 = czb.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gl.Program::setTexture::before: textureUnit: ");
        A10.append(size);
        A10.append(" textureTarget: ");
        A10.append(i);
        C26058CrU.A01(AnonymousClass001.A1I(" textureHandle: ", A10, i2));
        int A002 = A00(this, str);
        GLES20.glActiveTexture(33984 + size);
        GLES20.glBindTexture(i, i2);
        GLES20.glUniform1i(A002, size);
        StringBuilder A102 = AnonymousClass000.A10();
        BEA.A1P("gl.Program::setTexture::after: textureUnit: ", " textureTarget: ", A102, size, i);
        C26058CrU.A01(AnonymousClass001.A1I(" textureHandle: ", A102, i2));
    }

    public void A02(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(A00(this, str), 1, false, fArr, 0);
    }
}
