package X;

import android.content.DialogInterface;

/* renamed from: X.A9e  reason: case insensitive filesystem */
public class C20142A9e implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C20142A9e(DOZ doz, C23736Boh boh, DFL dfl, ALS als, int i) {
        this.A00 = i;
        this.A01 = als;
        this.A02 = dfl;
        this.A03 = doz;
        this.A04 = boh;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DFL dfl = (DFL) this.A02;
        Object obj = this.A03;
        C23736Boh boh = (C23736Boh) this.A04;
        E8A A0A = dfl.A0A(35);
        if (A0A != null) {
            C25974Cph.A00(boh, C20046A4p.A00(C108985cd.A0J(dfl), obj, 1), A0A);
        }
    }
}
