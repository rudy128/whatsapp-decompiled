package X;

/* renamed from: X.2wA  reason: invalid class name and case insensitive filesystem */
public final class C65292wA implements C31381fT {
    public final C19830z4 A00;

    public C65292wA(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public synchronized C57082iV BX3() {
        C57082iV r2;
        C19830z4 r22 = this.A00;
        String string = C17890vO.A0B(r22).getString("phoneyid_id", (String) null);
        long A0W = r22.A0W("phoneyid_timestamp");
        if (string == null || A0W == -1) {
            r2 = new C57082iV((String) null, 0);
        } else {
            r2 = new C57082iV(string, A0W);
        }
        return r2;
    }

    public synchronized void CJu(C57082iV r7) {
        C19830z4 r5 = this.A00;
        String str = r7.A01;
        long j = r7.A00;
        C17880vN.A1E(C19830z4.A00(r5), "phoneyid_id", str);
        r5.A1q("phoneyid_timestamp", j);
    }
}
