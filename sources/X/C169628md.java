package X;

import java.util.HashMap;

/* renamed from: X.8md  reason: invalid class name and case insensitive filesystem */
public class C169628md extends AT5 {
    /* JADX WARNING: type inference failed for: r7v1, types: [X.234, X.235, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        if (AT5.A00(a6d) != 2) {
            return null;
        }
        String A01 = AT5.A01(a6d);
        C164878aD r4 = C20077A6d.A00(a6d).peerDataOperationRequestResponseMessage_;
        if (r4 == null) {
            r4 = C164878aD.DEFAULT_INSTANCE;
        }
        HashMap A11 = C17880vN.A11();
        ? r7 = new AnonymousClass206(a6d.A0A, 75, a6d.A03);
        r7.A00 = A01;
        r7.A00 = C17880vN.A11();
        EE9<C165818bo> ee9 = r4.peerDataOperationResult_;
        if (!ee9.isEmpty()) {
            for (C165818bo r2 : ee9) {
                int i = r2.bitField0_;
                if ((i & 1) == 0) {
                    throw AnonymousClass8BR.A0p("missing url result", 26);
                } else if ((i & 4) != 0) {
                    C165898bw r0 = r2.linkPreviewResponse_;
                    C165898bw r42 = r0;
                    if (r0 == null) {
                        r0 = C165898bw.DEFAULT_INSTANCE;
                    }
                    String str = r0.url_;
                    AnonymousClass9KN A00 = AnonymousClass9KN.A00(r2.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass9KN.GENERAL_ERROR;
                    }
                    C165898bw r02 = null;
                    if (A00 == AnonymousClass9KN.SUCCESS) {
                        r02 = r42;
                        if (r42 == null) {
                            r02 = C165898bw.DEFAULT_INSTANCE;
                        }
                    }
                    A11.put(str, C108945cZ.A0N(A00, r02));
                } else {
                    throw AnonymousClass8BR.A0p("missing url response msg", 26);
                }
            }
            r7.A00 = A11;
            return r7;
        }
        throw AnonymousClass8BR.A0p("empty url result list", 26);
    }
}
