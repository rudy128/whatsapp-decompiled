package X;

/* renamed from: X.5jr  reason: invalid class name and case insensitive filesystem */
public final class C111525jr extends C40411uf {
    public /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2) {
        C138756xd r6 = (C138756xd) obj;
        C138756xd r7 = (C138756xd) obj2;
        C18070vi.A0h(r6, r7);
        if ((r6 instanceof C1177360t) && (r7 instanceof C1177360t)) {
            return C18070vi.A18(((C1177360t) r6).A03, ((C1177360t) r7).A03);
        }
        if (!(r6 instanceof C1177260s) || !(r7 instanceof C1177260s)) {
            return false;
        }
        C1418377d r3 = ((C1177260s) r6).A01;
        String str = r3.A0F;
        C1418377d r2 = ((C1177260s) r7).A01;
        if (!C18070vi.A18(str, r2.A0F) || !C18070vi.A18(r3.A0B, r2.A0B) || !C18070vi.A18(r3.A09, r2.A09)) {
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A02(Object obj, Object obj2) {
        C138756xd r3 = (C138756xd) obj;
        C138756xd r4 = (C138756xd) obj2;
        C18070vi.A0h(r3, r4);
        if (!(r3 instanceof C1177260s) || !(r4 instanceof C1177260s)) {
            return r3.equals(r4);
        }
        if (!C18070vi.A18(((C1177260s) r3).A01.A0F, ((C1177260s) r4).A01.A0F) || !C18070vi.A18(r3.A03(), r4.A03())) {
            return false;
        }
        return true;
    }
}
