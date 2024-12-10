package X;

/* renamed from: X.07k  reason: invalid class name and case insensitive filesystem */
public final class C011707k extends AnonymousClass0PV {
    public static final C011707k A00 = new C011707k();

    public C011707k() {
        super(0, 3);
    }

    public String A05(int i) {
        if (i == 0) {
            return "anchor";
        }
        if (i == 1) {
            return "from";
        }
        if (i == 2) {
            return "fixups";
        }
        return super.A05(i);
    }

    /* JADX INFO: finally extract failed */
    public void A06(C16270rz r6, C15750r8 r7, AnonymousClass0Qu r8, AnonymousClass0r9 r9) {
        C05840Vx r92 = (C05840Vx) r9;
        Object[] objArr = r92.A03.A07;
        int i = r92.A01;
        C06390Yd r4 = (C06390Yd) objArr[i + 1];
        C02090Cr r3 = (C02090Cr) objArr[i];
        C03450If r2 = (C03450If) objArr[i + 2];
        AnonymousClass0Qu A05 = r4.A05();
        try {
            if (r2.A01.A02 == 0) {
                r2.A00.A05(r6, r7, A05);
                A05.A0R();
                r8.A0Q();
                r8.A0W(r4, r3.A00(r4));
                r8.A0T();
                return;
            }
            C05020Qb.A06("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw null;
        } catch (Throwable th) {
            A05.A0R();
            throw th;
        }
    }
}
