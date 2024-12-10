package X;

import java.io.IOException;

/* renamed from: X.ATx  reason: case insensitive filesystem */
public final class C20665ATx implements C1606989o {
    public final String A00;
    public final /* synthetic */ AnonymousClass9C2 A01;

    public C20665ATx(AnonymousClass9C2 r2, String str) {
        C18070vi.A0d(str, 2);
        this.A01 = r2;
        this.A00 = str;
    }

    public void BE5(C138506xC r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error (");
        A10.append(this.A00);
        C17890vO.A1A(A10, ") has been sent to business.");
    }

    public void BrB(IOException iOException) {
        StringBuilder A0K = C18070vi.A0K(iOException);
        A0K.append("Failed to send ");
        A0K.append(this.A00);
        C108985cd.A1M(" error to business.", A0K, iOException);
    }

    public void Bsw(Exception exc) {
        StringBuilder A0K = C18070vi.A0K(exc);
        A0K.append("Failed to send ");
        A0K.append(this.A00);
        C108985cd.A1M(" error to business.", A0K, exc);
    }
}
