package X;

/* renamed from: X.8zj  reason: invalid class name and case insensitive filesystem */
public class C176068zj extends ASM implements B83 {
    public void BDb(C19998A2m a2m, AnonymousClass206 r6) {
        if (r6 instanceof AnonymousClass21I) {
            AnonymousClass21F r62 = (AnonymousClass21F) r6;
            AnonymousClass8X8 r2 = a2m.A00;
            AnonymousClass8XZ r0 = ((C166418cr) r2.A00).cancelPaymentRequestMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8XZ.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            C166408cq r02 = ((AnonymousClass8XZ) A0O.A00).key_;
            if (r02 == null) {
                r02 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r02);
            A00(A0f, r62);
            AnonymousClass8XZ r1 = (AnonymousClass8XZ) C17880vN.A0G(A0O);
            r1.key_ = AnonymousClass8BU.A0Y(A0f);
            r1.bitField0_ |= 1;
            C166418cr A0M = AnonymousClass8BS.A0M(r2);
            AnonymousClass8XZ r03 = (AnonymousClass8XZ) A0O.A0C();
            r03.getClass();
            A0M.cancelPaymentRequestMessage_ = r03;
            A0M.bitField0_ |= 524288;
            return;
        }
        throw AnonymousClass000.A0k("FMessagePaymentRequestCancelledProtobuf/not supported message");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.21F, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r2 = a6d.A08;
        if ((r2.bitField0_ & 524288) == 0) {
            return null;
        }
        AnonymousClass8XZ r0 = r2.cancelPaymentRequestMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8XZ.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r0);
        AnonymousClass205 r5 = a6d.A0A;
        long j = a6d.A03;
        C166408cq r02 = r0.key_;
        if (r02 == null) {
            r02 = C166408cq.DEFAULT_INSTANCE;
        }
        String str = r02.id_;
        ? r1 = new AnonymousClass206(r5, 22, j);
        r1.A02 = 0;
        C18070vi.A0d(str, 0);
        r1.A00 = str;
        return r1;
    }
}
