package X;

import android.opengl.GLES20;

/* renamed from: X.DDe  reason: case insensitive filesystem */
public class C26775DDe implements E9R {
    public final CZA A00;

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    public CZB getTexture() {
        return this.A00.A03;
    }

    public boolean is10Bit() {
        return this.A00.A04;
    }

    public void release() {
        this.A00.A01();
    }

    public C26775DDe(int i, int i2, boolean z) {
        this.A00 = new CZA(i, i2, z);
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
