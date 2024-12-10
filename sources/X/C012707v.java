package X;

/* renamed from: X.07v  reason: invalid class name and case insensitive filesystem */
public final class C012707v extends AnonymousClass0PV {
    public static final C012707v A00 = new AnonymousClass0PV(1, 1);

    public C012707v() {
        super(1, 1);
    }

    public String A04(int i) {
        if (i == 0) {
            return "groupSlotIndex";
        }
        return super.A04(i);
    }

    public String A05(int i) {
        if (i == 0) {
            return "value";
        }
        return super.A05(i);
    }

    public void A06(C16270rz r5, C15750r8 r6, AnonymousClass0Qu r7, AnonymousClass0r9 r8) {
        C05840Vx r82 = (C05840Vx) r8;
        C04910Pm r2 = r82.A03;
        Object obj = r2.A07[r82.A01];
        int i = r2.A05[r82.A00];
        if (obj instanceof C02030Cj) {
            ((C05670Vg) r6).A02.add(((C02030Cj) obj).A00);
        }
        Object A0P = r7.A0P(obj, r7.A00, i);
        if (A0P instanceof C02030Cj) {
            ((C05670Vg) r6).A01.add(((C02030Cj) A0P).A00);
        } else if (A0P instanceof C05660Vf) {
            ((C05660Vf) A0P).A01();
        }
    }
}
