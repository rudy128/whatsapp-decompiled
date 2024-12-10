package X;

/* renamed from: X.4XB  reason: invalid class name */
public final class AnonymousClass4XB {
    public final AnonymousClass00H A00;

    public AnonymousClass4XB(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(int i) {
        int i2;
        C47192Hl r1 = new C47192Hl();
        AnonymousClass3MZ.A1T(r1, Integer.valueOf(i));
        switch (i) {
            case 18:
                i2 = 86;
                break;
            case 19:
                i2 = 87;
                break;
            default:
                i2 = 88;
                break;
        }
        Integer valueOf = Integer.valueOf(i2);
        r1.A02 = valueOf;
        if (valueOf != null) {
            ((AnonymousClass18K) this.A00.get()).CC7(r1);
        }
    }

    public static void A00(C47192Hl r1, AnonymousClass4XB r2, int i) {
        r1.A02 = Integer.valueOf(i);
        ((AnonymousClass18K) r2.A00.get()).CC7(r1);
    }
}
