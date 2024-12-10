package X;

import android.app.Activity;
import java.io.IOException;

/* renamed from: X.7I2  reason: invalid class name */
public final class AnonymousClass7I2 implements C1606989o {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ A45 A01;
    public final /* synthetic */ AnonymousClass7OQ A02;
    public final /* synthetic */ boolean A03;

    public void BE5(C138506xC r5) {
        C18070vi.A0d(r5, 0);
        AnonymousClass7OQ.A00(this.A00, this.A01, r5, this.A02, this.A03);
    }

    public AnonymousClass7I2(Activity activity, A45 a45, AnonymousClass7OQ r3, boolean z) {
        this.A02 = r3;
        this.A00 = activity;
        this.A01 = a45;
        this.A03 = z;
    }

    public void BrB(IOException iOException) {
        AnonymousClass7OQ r3 = this.A02;
        AnonymousClass7OQ.A01(this.A00, this.A01, r3, this.A03);
    }

    public void Bsw(Exception exc) {
        AnonymousClass7OQ r3 = this.A02;
        AnonymousClass7OQ.A01(this.A00, this.A01, r3, this.A03);
    }
}
