package X;

import android.os.Build;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.8EI  reason: invalid class name */
public class AnonymousClass8EI extends C195869u2 {
    public final /* synthetic */ BCP A00;
    public final /* synthetic */ A5H A01;
    public final /* synthetic */ byte[] A02;

    public AnonymousClass8EI(BCP bcp, A5H a5h, byte[] bArr) {
        this.A01 = a5h;
        this.A00 = bcp;
        this.A02 = bArr;
    }

    public void A01() {
        this.A01.A02.A06("sign: authentication failed");
        this.A00.Bls();
    }

    public void A02(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sign: authentication error=");
        A10.append(i);
        r2.A05(AnonymousClass001.A1I(" errString=", A10, i));
        this.A00.Blr(i, charSequence);
    }

    public void A03(int i, CharSequence charSequence) {
        AnonymousClass1QE r2 = this.A01.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("sign: authentication help=");
        A10.append(i);
        AnonymousClass8BX.A1D(r2, charSequence, " errString=", A10);
        this.A00.Blu(i, charSequence);
    }

    public void A04(C189159ic r5) {
        try {
            Signature signature = r5.A00.A00;
            C17960vV.A07(signature);
            BCP bcp = this.A00;
            signature.update(this.A02);
            bcp.Blv(signature.sign());
        } catch (SignatureException e) {
            AnonymousClass1QE r2 = this.A01.A02;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sign: api=");
            A10.append(Build.VERSION.SDK_INT);
            AnonymousClass8BX.A1B(r2, e, " error: ", A10);
            this.A00.Blv((byte[]) null);
        }
    }
}
