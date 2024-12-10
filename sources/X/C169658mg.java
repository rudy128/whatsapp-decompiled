package X;

import java.util.Map;

/* renamed from: X.8mg  reason: invalid class name and case insensitive filesystem */
public class C169658mg extends AT5 {
    /* JADX WARNING: type inference failed for: r5v1, types: [X.234, X.206, X.239] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166218cX r0;
        if (AT5.A00(a6d) != 0) {
            return null;
        }
        String A01 = AT5.A01(a6d);
        ? r5 = new AnonymousClass206(a6d.A0A, 76, a6d.A03);
        r5.A00 = A01;
        r5.A00 = C17880vN.A11();
        C164878aD r02 = C20077A6d.A00(a6d).peerDataOperationRequestResponseMessage_;
        if (r02 == null) {
            r02 = C164878aD.DEFAULT_INSTANCE;
        }
        EE9<C165818bo> ee9 = r02.peerDataOperationResult_;
        if (!ee9.isEmpty()) {
            for (C165818bo r6 : ee9) {
                int i = r6.bitField0_;
                if ((i & 1) == 0) {
                    throw AnonymousClass8BR.A0p("missing sticker result", 26);
                } else if ((i & 2) != 0) {
                    C166218cX r03 = r6.stickerMessage_;
                    if (r03 == null) {
                        r03 = C166218cX.DEFAULT_INSTANCE;
                    }
                    String A14 = C108955ca.A14(r03.fileSha256_.A06());
                    AnonymousClass9KN A00 = AnonymousClass9KN.A00(r6.mediaUploadResult_);
                    if (A00 == null) {
                        A00 = AnonymousClass9KN.GENERAL_ERROR;
                    }
                    boolean A1Z = AnonymousClass000.A1Z(A00, AnonymousClass9KN.SUCCESS);
                    Map map = r5.A00;
                    if (A1Z) {
                        r0 = r6.stickerMessage_;
                        if (r0 == null) {
                            r0 = C166218cX.DEFAULT_INSTANCE;
                        }
                    } else {
                        r0 = null;
                    }
                    map.put(A14, C108945cZ.A0N(A00, r0));
                } else {
                    throw AnonymousClass8BR.A0p("missing sticker response msg", 26);
                }
            }
            return r5;
        }
        throw AnonymousClass8BR.A0p("empty sticker result list", 26);
    }
}
