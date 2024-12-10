package X;

import java.io.FileInputStream;

/* renamed from: X.8Qp  reason: invalid class name */
public final class AnonymousClass8Qp extends AnonymousClass3BP {
    public int A00;
    public final /* synthetic */ AnonymousClass8Qr A01;

    public AnonymousClass8Qp(AnonymousClass8Qr r1) {
        this.A01 = r1;
    }

    public AnonymousClass3BS A00() {
        AnonymousClass8Qn[] r2 = this.A01.A00;
        int i = this.A00;
        this.A00 = i + 1;
        AnonymousClass8Qn r22 = r2[i];
        FileInputStream A18 = C108945cZ.A18(r22.A00);
        try {
            return new AnonymousClass3BS(r22, A18);
        } catch (Throwable th) {
            A18.close();
            throw th;
        }
    }

    public boolean A01() {
        return AnonymousClass000.A1U(this.A00, this.A01.A00.length);
    }
}
