package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

public class CY8 {
    public int A00;

    public void A02(String str, FloatBuffer floatBuffer) {
        int i = this.A00;
        if (i != -1) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
            if (glGetAttribLocation >= 0) {
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, floatBuffer);
                C24648CDn.A00("setVertexAttribArray");
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Could not locate '");
            A10.append(str);
            throw BE9.A0n("' in program", A10);
        }
        throw AnonymousClass8BR.A0w("The program has been released");
    }

    public int A01(String str) {
        int i = this.A00;
        if (i != -1) {
            int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            if (glGetUniformLocation >= 0) {
                return glGetUniformLocation;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Could not locate uniform '");
            A10.append(str);
            throw BE9.A0n("' in program", A10);
        }
        throw AnonymousClass8BR.A0w("The program has been released");
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 1) {
                C24648CDn.A00("compileShader");
                return glCreateShader;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GlShader Could not compile shader ");
            A10.append(i);
            A10.append(":");
            C17890vO.A19(A10, GLES20.glGetShaderInfoLog(glCreateShader));
            throw AnonymousClass8BR.A0w(GLES20.glGetShaderInfoLog(glCreateShader));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("glCreateShader() failed. GLES20 error: ");
        A102.append(GLES20.glGetError());
        throw BE8.A0f(A102);
    }
}
