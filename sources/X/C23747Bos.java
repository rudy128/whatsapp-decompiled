package X;

/* renamed from: X.Bos  reason: case insensitive filesystem */
public class C23747Bos extends C26973DNv {
    public final C09 A00;
    public final C25836Cmq A01;
    public final C25836Cmq A02;

    public boolean BCK(C24957CRh cRh) {
        C25836Cmq cmq = this.A01;
        C25836Cmq cmq2 = this.A02;
        if (cmq instanceof C23753Boy) {
            cmq = ((C23753Boy) cmq).A08(cRh);
        }
        if (cmq2 instanceof C23753Boy) {
            cmq2 = ((C23753Boy) cmq2).A08(cRh);
        }
        E6K e6k = (E6K) CFy.A00.get(this.A00);
        if (e6k != null) {
            return e6k.BKd(cmq, cmq2, cRh);
        }
        return false;
    }

    public String toString() {
        Object obj;
        C09 c09 = this.A00;
        if (c09 == C09.EXISTS) {
            obj = this.A01;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BS.A1D(this.A01, A10);
            A10.append(" ");
            AnonymousClass8BS.A1D(c09, A10);
            A10.append(" ");
            AnonymousClass8BS.A1D(this.A02, A10);
            obj = A10;
        }
        return obj.toString();
    }

    public C23747Bos(C09 c09, C25836Cmq cmq, C25836Cmq cmq2) {
        this.A01 = cmq;
        this.A00 = c09;
        this.A02 = cmq2;
        toString();
    }
}
