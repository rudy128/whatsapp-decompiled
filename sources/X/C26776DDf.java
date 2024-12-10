package X;

import android.opengl.GLES20;

/* renamed from: X.DDf  reason: case insensitive filesystem */
public final class C26776DDf implements E9R {
    public final CZA A00;
    public final CZB A01;
    public final boolean A02;

    public void bind() {
        GLES20.glBindFramebuffer(36160, this.A00.A00);
    }

    public CZB getTexture() {
        return this.A01;
    }

    public boolean is10Bit() {
        return this.A02;
    }

    public void release() {
        this.A00.A01();
    }

    public C26776DDf(int i, int i2, boolean z) {
        CZA cza = new CZA(i, i2, z);
        this.A00 = cza;
        this.A02 = cza.A04;
        CZB czb = cza.A03;
        C18070vi.A0W(czb);
        this.A01 = czb;
    }

    public void unbind() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
