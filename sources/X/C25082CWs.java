package X;

import android.graphics.Bitmap;

/* renamed from: X.CWs  reason: case insensitive filesystem */
public final class C25082CWs {
    public C26116Cse A00;
    public C26113Csb A01;
    public final C28603E9u A02;
    public final E15 A03;
    public final boolean A04;

    public boolean A00(Bitmap bitmap, int i) {
        C18070vi.A0d(bitmap, 1);
        try {
            this.A01.A03(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            Class<C25082CWs> cls = C25082CWs.class;
            Object[] objArr = {Integer.valueOf(i)};
            EAY eay = C26265CwA.A00;
            if (eay.BfN(6)) {
                eay.BJo(cls.getSimpleName(), BE7.A0o("Rendering of frame unsuccessful. Frame number: %d", objArr), e);
            }
            return false;
        }
    }

    public C25082CWs(C28603E9u e9u, C26116Cse cse, boolean z) {
        this.A02 = e9u;
        this.A00 = cse;
        this.A04 = z;
        C26753DCi dCi = new C26753DCi(this, 0);
        this.A03 = dCi;
        this.A01 = new C26113Csb(cse, dCi, z);
    }
}
