package X;

import android.opengl.GLES20;

/* renamed from: X.CDn  reason: case insensitive filesystem */
public abstract class C24648CDn {
    public static void A00(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw BEA.A0h(": GLES20 error: ", AnonymousClass000.A11(str), glGetError);
        }
    }
}
