package X;

import java.util.List;

/* renamed from: X.A4p  reason: case insensitive filesystem */
public final class C20046A4p {
    public final List A00 = AnonymousClass000.A13();

    public static void A01(DOZ doz, DFL dfl, C20046A4p a4p, E8A e8a) {
        C26209Cul.A01(doz, dfl, new C199029zJ(a4p.A00), e8a);
    }

    public C199029zJ A02() {
        return new C199029zJ(this.A00);
    }

    public void A03(Object obj, int i) {
        List list = this.A00;
        if (list.size() <= i) {
            list.add(i, obj);
            return;
        }
        throw AnonymousClass000.A0k("Arguments must be continuous");
    }

    public static C199029zJ A00(C20046A4p a4p, Object obj, int i) {
        a4p.A03(obj, i);
        return new C199029zJ(a4p.A00);
    }
}
