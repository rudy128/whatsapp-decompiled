package X;

/* renamed from: X.2Iu  reason: invalid class name and case insensitive filesystem */
public final class C47542Iu extends C172668tp {
    public final AnonymousClass00H A00;

    public void CBB(C193069pU r6, C166388co r7, AnonymousClass206 r8) {
        AnonymousClass215 r2;
        int intValue;
        int i;
        C18070vi.A0d(r8, 0);
        C18070vi.A0e(r7, 1, r6);
        super.CBB(r6, r7, r8);
        if (!(r8 instanceof AnonymousClass215) || (r2 = (AnonymousClass215) r8) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass206.A07(r8, "Unsupported message type ", A10);
            throw new C32711hd(0, A10.toString());
        }
        boolean z = r8.A0v.A02;
        this.A00.get();
        Integer A002 = AUY.A00(r7);
        if (z) {
            if (A002 != null) {
                intValue = A002.intValue();
                i = 8;
            } else {
                return;
            }
        } else if (A002 != null) {
            intValue = A002.intValue();
            i = 9;
        } else {
            return;
        }
        if (intValue == i) {
            r2.CLQ(1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47542Iu(AnonymousClass190 r1, AnonymousClass1L7 r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r1, r2, r3);
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r4;
    }
}
