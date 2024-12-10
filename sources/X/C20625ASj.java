package X;

/* renamed from: X.ASj  reason: case insensitive filesystem */
public class C20625ASj implements B83, B85, C436820m {
    public final C18030ve A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        if (r9 instanceof AnonymousClass21D) {
            AnonymousClass21D r92 = (AnonymousClass21D) r9;
            AnonymousClass8X8 r5 = a2m.A00;
            AnonymousClass8Z8 r0 = ((C166418cr) r5.A00).paymentInviteMessage_;
            if (r0 == null) {
                r0 = AnonymousClass8Z8.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            AnonymousClass9KL A002 = AnonymousClass9KL.A00(r92.A00);
            AnonymousClass8Z8 r1 = (AnonymousClass8Z8) C17880vN.A0G(A0O);
            int i = AnonymousClass8Z8.EXPIRY_TIMESTAMP_FIELD_NUMBER;
            r1.serviceType_ = A002.value;
            r1.bitField0_ |= 1;
            long j = r92.A01;
            if (j > 0) {
                long A04 = C17880vN.A04(j);
                AnonymousClass8Z8 r12 = (AnonymousClass8Z8) C17880vN.A0G(A0O);
                r12.bitField0_ |= 2;
                r12.expiryTimestamp_ = A04;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r5);
            AnonymousClass8Z8 r02 = (AnonymousClass8Z8) A0O.A0C();
            r02.getClass();
            A0M.paymentInviteMessage_ = r02;
            A0M.bitField1_ |= 4;
            return;
        }
        throw AnonymousClass000.A0k("FMessagePaymentInviteProtobuf/not supported message");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.21D, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r3 = a6d.A08;
        if ((r3.bitField1_ & 4) == 0) {
            return null;
        }
        AnonymousClass8Z8 r0 = r3.paymentInviteMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8Z8.DEFAULT_INSTANCE;
        }
        AnonymousClass9KL A002 = AnonymousClass9KL.A00(r0.serviceType_);
        if (A002 == null) {
            A002 = AnonymousClass9KL.UNKNOWN;
        }
        AnonymousClass9KL r6 = AnonymousClass9KL.UNKNOWN;
        if (A002 != r6) {
            C18030ve r2 = this.A00;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 423) || C18020vd.A05(r1, r2, 544)) {
                AnonymousClass8Z8 r5 = r3.paymentInviteMessage_;
                if (r5 == null) {
                    r5 = AnonymousClass8Z8.DEFAULT_INSTANCE;
                }
                C17960vV.A07(r5);
                ? r4 = new AnonymousClass206(a6d.A0A, 51, a6d.A03);
                AnonymousClass9KL A003 = AnonymousClass9KL.A00(r5.serviceType_);
                if (A003 == null) {
                    A003 = r6;
                }
                r4.A00 = A003.value;
                if ((r5.bitField0_ & 2) != 0) {
                    r4.A01 = r5.expiryTimestamp_ * 1000;
                }
                return r4;
            }
        }
        return a6d.A04(0);
    }

    public C20625ASj(C18030ve r1) {
        this.A00 = r1;
    }
}
