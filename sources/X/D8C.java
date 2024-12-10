package X;

import android.view.View;

public class D8C implements C28484E3o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D8C(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Brv() {
        switch (this.A00) {
            case 0:
                CUA cua = (CUA) this.A01;
                C26071Crl.A00(cua.A07.A00, (View) this.A02);
                cua.A05.Brv();
                return;
            case 1:
                E8A e8a = (E8A) this.A01;
                C23736Boh boh = (C23736Boh) this.A02;
                if (e8a != null) {
                    C25974Cph.A00(boh, C199029zJ.A01, e8a);
                    return;
                }
                return;
            default:
                C26071Crl.A00(((DOZ) this.A01).A00, (View) this.A02);
                return;
        }
    }
}
