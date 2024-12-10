package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AOn  reason: case insensitive filesystem */
public final class C20528AOn implements C16760sy {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass0I4 A02;
    public final C183109Wy A03;
    public final C18030ve A04;
    public final A17 A05;
    public final String A06;

    public void BuJ(int i) {
        this.A00.A0E(new C198449yM(i));
    }

    public void BuQ(AnonymousClass0Ju r19) {
        AnonymousClass0Ju r5 = r19;
        ArrayList A0s = C72463Mc.A0s(r5);
        Iterator it = r5.A00.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                AnonymousClass0CD r6 = (AnonymousClass0CD) next;
                List list = r5.A02;
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next2 : list) {
                    C108975cc.A13(((AnonymousClass0K7) next2).A00, r6.A00, next2, A13);
                }
                if (A13.isEmpty()) {
                    String str = r6.A01;
                    String str2 = r6.A01;
                    A0s.add(new C174288wX(r6.A00, str, str2, new B1F(r6, this, i), new B3U(this)));
                }
                i = i2;
            } else {
                this.A00.A0E(new C198449yM(r5.A01, A0s, r5.A02));
                return;
            }
        }
    }

    public C20528AOn(AnonymousClass0I4 r2, C183109Wy r3, C18030ve r4, A17 a17, String str) {
        C18070vi.A0s(r4, r3, a17, r2);
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = a17;
        this.A02 = r2;
        this.A06 = str;
    }
}
