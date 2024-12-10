package X;

/* renamed from: X.39o  reason: invalid class name and case insensitive filesystem */
public final class C700539o implements AnonymousClass3LK {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void CCb(AnonymousClass206 r5, C49702Rn r6, int i) {
        C18070vi.A0d(r5, 0);
        byte[] bArr = r5.A1D;
        if (r5.A0t() && bArr != null) {
            ((AnonymousClass1W7) this.A01.get()).A00(r5.A0x, bArr);
            if (r6 != null) {
                throw C17900vP.A07(C700539o.class);
            }
        } else if (C60612oK.A00(r5)) {
            AnonymousClass1W9.A01((AnonymousClass18K) this.A02.get(), "msgstore/updateMessageOnCurrentThread", C62242r5.A00(r5, this.A00));
        }
    }

    public C700539o(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }
}
