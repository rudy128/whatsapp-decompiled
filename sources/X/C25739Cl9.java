package X;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Cl9  reason: case insensitive filesystem */
public class C25739Cl9 {
    public int A00 = GLES20.glCreateProgram();
    public String A01;
    public String A02;
    public final Map A03 = C17880vN.A11();
    public final Map A04 = C17880vN.A11();
    public final Map A05 = C17880vN.A11();
    public final C25710Ckg A06;

    public static void A00(CPT cpt, C25739Cl9 cl9) {
        int glGetAttribLocation;
        Map map = cpt.A02;
        List list = cpt.A01;
        for (int i = 0; i < list.size(); i++) {
            String A0w = C17880vN.A0w(list, i);
            Map map2 = cl9.A05;
            if (map2.containsKey(A0w)) {
                glGetAttribLocation = BE9.A0F(A0w, map2);
            } else {
                glGetAttribLocation = GLES20.glGetAttribLocation(cl9.A00, A0w);
                if (glGetAttribLocation != -1) {
                    C17880vN.A1P(A0w, map2, glGetAttribLocation);
                } else {
                    throw AnonymousClass000.A0n(String.format((Locale) null, "Vertex attribute location not found: %s", BE7.A1b(A0w)));
                }
            }
            if (glGetAttribLocation != -1) {
                C25523ChL chL = (C25523ChL) map.get(A0w);
                FloatBuffer floatBuffer = chL.A01;
                int position = floatBuffer.position();
                GLES20.glBindBuffer(34962, 0);
                GLES20.glVertexAttribPointer(glGetAttribLocation, chL.A00, 5126, false, 0, floatBuffer.position(position));
                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                floatBuffer.position(position);
            }
        }
        GLES20.glDrawArrays(cpt.A00, 0, 4);
    }

    public C25710Ckg A01() {
        int i = this.A00;
        if (i != 0) {
            GLES20.glUseProgram(i);
            Object[] A1a = AnonymousClass8BR.A1a();
            AnonymousClass000.A1L(A1a, this.A00);
            A1a[1] = this.A02;
            A1a[2] = this.A01;
            C26058CrU.A03("gl.Program::use, programHandle=%d, vertexShaderSource=%s , fragmentShaderSource=%s", A1a);
            return this.A06;
        }
        throw AnonymousClass000.A0n("Program not initialized");
    }

    public void A02() {
        if (this.A00 != 0) {
            int[] A1X = BE6.A1X();
            GLES20.glGetIntegerv(35725, A1X, 0);
            if (this.A00 == A1X[0]) {
                GLES20.glUseProgram(0);
            }
            GLES20.glDeleteProgram(this.A00);
            this.A00 = 0;
        }
    }

    public C25739Cl9(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        int glCreateShader = GLES20.glCreateShader(35633);
        int glCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glAttachShader(this.A00, glCreateShader);
        GLES20.glAttachShader(this.A00, glCreateShader2);
        if (BEB.A04(glCreateShader, str) == 0) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Failed to compile shader:\n");
            A10.append(glGetShaderInfoLog);
            throw BEA.A0g("\n\n", str, A10);
        } else if (BEB.A04(glCreateShader2, str2) != 0) {
            GLES20.glLinkProgram(this.A00);
            int[] A1X = BE6.A1X();
            GLES20.glGetProgramiv(this.A00, 35714, A1X, 0);
            if (A1X[0] != 0) {
                if (glCreateShader != 0) {
                    GLES20.glDetachShader(this.A00, glCreateShader);
                    GLES20.glDeleteShader(glCreateShader);
                }
                if (glCreateShader2 != 0) {
                    GLES20.glDetachShader(this.A00, glCreateShader2);
                    GLES20.glDeleteShader(glCreateShader2);
                }
                this.A06 = new C25710Ckg(this);
                return;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.A00);
            A02();
            throw BEA.A0g("Failed to link program: ", glGetProgramInfoLog, AnonymousClass000.A10());
        } else {
            String glGetShaderInfoLog2 = GLES20.glGetShaderInfoLog(glCreateShader2);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Failed to compile shader:\n");
            A102.append(glGetShaderInfoLog2);
            throw BEA.A0g("\n\n", str2, A102);
        }
    }
}
