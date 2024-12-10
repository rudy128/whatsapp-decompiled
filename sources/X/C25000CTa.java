package X;

import android.opengl.Matrix;

/* renamed from: X.CTa  reason: case insensitive filesystem */
public class C25000CTa {
    public CPT A00;
    public C25739Cl9 A01;
    public final C25752ClM A02;
    public final float[] A03;
    public final float[] A04;
    public final float[] A05;
    public final C25998CqE A06;
    public final C25523ChL A07;

    public C25000CTa(C25998CqE cqE, C25752ClM clM) {
        C25523ChL chL = new C25523ChL(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = chL;
        float[] fArr = new float[16];
        this.A05 = fArr;
        float[] fArr2 = new float[16];
        this.A03 = fArr2;
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A06 = cqE;
        this.A02 = clM;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        this.A00 = C25523ChL.A00(C25555Cht.A00(chL, fArr3), new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        C25326CdX.A01(clM, fArr2, fArr3);
        this.A01 = cqE.A03("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nuniform mat4 uSTMatrix;\nuniform mat4 uConstMatrix;\nuniform mat4 uContentTransform;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uContentTransform * aPosition;\n  vTextureCoord = (uSTMatrix * uConstMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float; // highp here doesn't seem to matter\n\nuniform sampler2D sTexture;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord).rgba;\n}", false);
    }
}
