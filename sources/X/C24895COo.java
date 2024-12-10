package X;

import android.opengl.GLES20;

/* renamed from: X.COo  reason: case insensitive filesystem */
public class C24895COo {
    public final int A00;
    public final CY8 A01;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.CY8, java.lang.Object] */
    public C24895COo() {
        ? obj = new Object();
        int A002 = CY8.A00(35633, "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n");
        int A003 = CY8.A00(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        int glCreateProgram = GLES20.glCreateProgram();
        obj.A00 = glCreateProgram;
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, A002);
            GLES20.glAttachShader(obj.A00, A003);
            GLES20.glLinkProgram(obj.A00);
            int[] iArr = {0};
            GLES20.glGetProgramiv(obj.A00, 35714, iArr, 0);
            if (iArr[0] == 1) {
                GLES20.glDeleteShader(A002);
                GLES20.glDeleteShader(A003);
                C24648CDn.A00("Creating GlShader");
                this.A01 = obj;
                this.A00 = obj.A01("texMatrix");
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GlShader Could not link program: ");
            C17890vO.A19(A10, GLES20.glGetProgramInfoLog(obj.A00));
            throw AnonymousClass8BR.A0w(GLES20.glGetProgramInfoLog(obj.A00));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("glCreateProgram() failed. GLES20 error: ");
        A102.append(GLES20.glGetError());
        throw BE8.A0f(A102);
    }
}
