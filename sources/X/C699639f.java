package X;

/* renamed from: X.39f  reason: invalid class name and case insensitive filesystem */
public final class C699639f implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void CCZ(AnonymousClass206 r5, C49702Rn r6) {
        C18070vi.A0d(r5, 0);
        byte[] bArr = r5.A1D;
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass206.A06(r5, "MessageSecretInserterPostProcessor/processing/row_id=", A10);
        A10.append(",hasSecret=");
        C17900vP.A0r(A10, r5.A0t());
        if (r5.A0t() && bArr != null) {
            ((AnonymousClass1W7) this.A01.get()).A00(r5.A0x, bArr);
            if (r6 != null) {
                throw C17900vP.A07(C699639f.class);
            }
        } else if (C60612oK.A00(r5)) {
            AnonymousClass1W9.A01((AnonymousClass18K) this.A02.get(), "msgstore/insertExtraTablesMessage", C62242r5.A00(r5, this.A00));
        }
    }

    public C699639f(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
