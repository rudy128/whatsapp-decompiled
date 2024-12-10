package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;

/* renamed from: X.Crk  reason: case insensitive filesystem */
public abstract class C26070Crk {
    public static final float[] A00;

    static {
        float[] fArr = new float[16];
        A00 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A01(int i, String str) {
        if (i < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unable to locate '");
            A10.append(str);
            throw BE9.A0n("' in program", A10);
        }
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        A02(AnonymousClass001.A1I("glCreateShader type=", AnonymousClass000.A10(), i));
        if (BEB.A04(glCreateShader, str) != 0) {
            return glCreateShader;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Could not compile shader ");
        A10.append(i);
        Log.e("Grafika", AnonymousClass000.A0y(":", A10));
        StringBuilder A102 = AnonymousClass000.A10();
        BE6.A1J(A102);
        Log.e("Grafika", AnonymousClass000.A0y(GLES20.glGetShaderInfoLog(glCreateShader), A102));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            BE9.A1J(": glError 0x", A11, glGetError);
            String obj = A11.toString();
            Log.e("Grafika", obj);
            throw AnonymousClass8BR.A0w(obj);
        }
    }
}
