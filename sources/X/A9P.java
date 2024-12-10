package X;

import android.content.DialogInterface;

public class A9P implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public A9P(DOZ doz, C23736Boh boh, E8A e8a, int i) {
        this.A00 = i;
        this.A01 = e8a;
        this.A02 = doz;
        this.A03 = boh;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Object obj = this.A02;
        C25974Cph.A00((C23736Boh) this.A03, new C199029zJ(C108985cd.A0J(obj).A00), (E8A) this.A01);
    }
}
