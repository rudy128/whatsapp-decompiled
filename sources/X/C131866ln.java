package X;

import java.util.ArrayList;

/* renamed from: X.6ln  reason: invalid class name and case insensitive filesystem */
public final class C131866ln {
    public final C23736Boh A00;
    public final E8A A01;

    public final void A00(ArrayList arrayList) {
        E8A e8a = this.A01;
        C20046A4p a4p = new C20046A4p();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a4p.A03(arrayList.get(i), i);
        }
        C25974Cph.A00(this.A00, new C199029zJ(a4p.A00), e8a);
    }

    public C131866ln(C23736Boh boh, E8A e8a) {
        this.A00 = boh;
        this.A01 = e8a;
    }
}
