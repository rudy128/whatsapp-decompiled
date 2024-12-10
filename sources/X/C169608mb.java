package X;

/* renamed from: X.8mb  reason: invalid class name and case insensitive filesystem */
public final class C169608mb extends AT5 {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.234, X.245, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        if (AT5.A00(a6d) != 7) {
            return null;
        }
        AnonymousClass205 r2 = a6d.A0A;
        long j = a6d.A03;
        String A01 = AT5.A01(a6d);
        ? r3 = new AnonymousClass206(r2, 107, j);
        r3.A00 = A01;
        C164878aD r0 = C20077A6d.A00(a6d).peerDataOperationRequestResponseMessage_;
        if (r0 == null) {
            r0 = C164878aD.DEFAULT_INSTANCE;
        }
        EE9 ee9 = r0.peerDataOperationResult_;
        if (!ee9.isEmpty()) {
            C165818bo r1 = (C165818bo) ee9.get(0);
            if ((r1.bitField0_ & 64) != 0) {
                C164078Xl r02 = r1.companionMetaNonceFetchRequestResponse_;
                C164078Xl r12 = r02;
                if (r02 == null) {
                    r02 = C164078Xl.DEFAULT_INSTANCE;
                }
                String str = r02.nonce_;
                if (str == null || str.length() == 0) {
                    throw AnonymousClass8BR.A0p("empty companion meta nonce", 26);
                }
                if (r12 == null) {
                    r12 = C164078Xl.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r12);
                r3.A00 = r12.nonce_;
                return r3;
            }
            throw AnonymousClass8BR.A0p("missing companion meta response", 26);
        }
        throw AnonymousClass8BR.A0p("empty companion meta nonce response", 26);
    }
}
