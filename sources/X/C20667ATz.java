package X;

import java.io.IOException;

/* renamed from: X.ATz  reason: case insensitive filesystem */
public final class C20667ATz implements C1606989o {
    public final /* synthetic */ C22525BBi A00;
    public final /* synthetic */ ANI A01;
    public final /* synthetic */ String A02;

    public void BE5(C138506xC r8) {
        C18070vi.A0d(r8, 0);
        ANI ani = this.A01;
        ani.A03.A0J(new C21456AkN(r8, ani, this.A00, this.A02, 46));
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        Bsw(iOException);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        ANI ani = this.A01;
        ani.A03.A0J(new C21456AkN(exc, ani, this.A00, this.A02, 45));
    }

    public C20667ATz(C22525BBi bBi, ANI ani, String str) {
        this.A01 = ani;
        this.A02 = str;
        this.A00 = bBi;
    }
}
