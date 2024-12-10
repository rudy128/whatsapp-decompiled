package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AQa  reason: case insensitive filesystem */
public final class C20566AQa implements AnonymousClass1L0 {
    public final A08 A00;

    public C20566AQa(A08 a08) {
        C18070vi.A0d(a08, 1);
        this.A00 = a08;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        A08 a08 = this.A00;
        ArrayList A01 = a08.A01();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            C22424B7g b7g = (C22424B7g) it.next();
            if (((double) (((int) (System.currentTimeMillis() - b7g.BaP())) / 86400000)) > 90.0d) {
                A13.add(b7g);
            }
        }
        A01.removeAll(A13);
        C21451AkI.A01(a08.A03, a08, A01, 42);
    }
}
