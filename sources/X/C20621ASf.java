package X;

/* renamed from: X.ASf  reason: case insensitive filesystem */
public final class C20621ASf implements B83, B85, C436820m {
    public final A79 A00;

    /* JADX WARNING: type inference failed for: r0v8, types: [X.21T, X.210, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        AnonymousClass9Jc r1;
        String str;
        C18070vi.A0d(a6d, 0);
        C166418cr r12 = a6d.A08;
        if ((r12.bitField1_ & 2) == 0) {
            return null;
        }
        C165408b6 r0 = r12.buttonsResponseMessage_;
        C165408b6 r7 = r0;
        if (r0 == null) {
            r0 = C165408b6.DEFAULT_INSTANCE;
        }
        int i = r0.type_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass9Jc.UNKNOWN;
        } else {
            r1 = AnonymousClass9Jc.DISPLAY_TEXT;
        }
        if (r1 == AnonymousClass9Jc.UNKNOWN) {
            return a6d.A04(0);
        }
        AnonymousClass205 r6 = a6d.A0A;
        long j = a6d.A03;
        C165408b6 r2 = r7;
        if (r7 == null) {
            r2 = C165408b6.DEFAULT_INSTANCE;
        }
        if (r2.responseCase_ == 2) {
            str = (String) r2.response_;
        } else {
            str = "";
        }
        if (r7 == null) {
            r7 = C165408b6.DEFAULT_INSTANCE;
        }
        String str2 = r7.selectedButtonId_;
        ? r02 = new AnonymousClass210(r6, 49, j);
        r02.A0i(str);
        r02.A00 = str2;
        return r02;
    }

    public C20621ASf(A79 a79) {
        this.A00 = a79;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        C18070vi.A0h(r7, a2m);
        AnonymousClass8BY.A1G(r7, "Unexpected message type ", AnonymousClass000.A10(), r7 instanceof AnonymousClass21T);
        AnonymousClass21T r72 = (AnonymousClass21T) r7;
        AnonymousClass8X8 r3 = a2m.A00;
        C165408b6 r0 = ((C166418cr) r3.A00).buttonsResponseMessage_;
        if (r0 == null) {
            r0 = C165408b6.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        String A0P = r72.A0P();
        C165408b6 r1 = (C165408b6) C17880vN.A0G(A0O);
        int i = C165408b6.CONTEXT_INFO_FIELD_NUMBER;
        A0P.getClass();
        r1.responseCase_ = 2;
        r1.response_ = A0P;
        AnonymousClass9Jc r02 = AnonymousClass9Jc.DISPLAY_TEXT;
        C165408b6 r12 = (C165408b6) C17880vN.A0G(A0O);
        r12.type_ = r02.value;
        r12.bitField0_ |= 8;
        if (AnonymousClass8BS.A00(r72.A00) > 0) {
            String str = r72.A00;
            C165408b6 r13 = (C165408b6) C17880vN.A0G(A0O);
            str.getClass();
            r13.bitField0_ |= 1;
            r13.selectedButtonId_ = str;
        }
        C166278cd A04 = this.A00.A04(a2m, r72);
        C18070vi.A0X(A04);
        C165408b6 r14 = (C165408b6) C17880vN.A0G(A0O);
        r14.contextInfo_ = A04;
        r14.bitField0_ |= 4;
        C166418cr A0M = AnonymousClass8BS.A0M(r3);
        C165408b6 r03 = (C165408b6) A0O.A0C();
        r03.getClass();
        A0M.buttonsResponseMessage_ = r03;
        A0M.bitField1_ |= 2;
    }
}
