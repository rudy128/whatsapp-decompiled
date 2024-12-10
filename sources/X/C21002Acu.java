package X;

/* renamed from: X.Acu  reason: case insensitive filesystem */
public final class C21002Acu implements AnonymousClass3M5 {
    public final A79 A00;

    public void BDa(C19998A2m a2m, C438721g r8) {
        C18070vi.A0d(r8, 1);
        C20268AEb aEb = r8.A00;
        if (aEb != null && aEb.A03 == 1) {
            AnonymousClass8X8 r2 = a2m.A00;
            C165538bJ r0 = ((C166418cr) r2.A00).listResponseMessage_;
            if (r0 == null) {
                r0 = C165538bJ.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            String str = aEb.A05;
            C165538bJ r1 = (C165538bJ) C17880vN.A0G(A0O);
            int i = C165538bJ.CONTEXT_INFO_FIELD_NUMBER;
            str.getClass();
            r1.bitField0_ |= 1;
            r1.title_ = str;
            String str2 = aEb.A04;
            if (!(str2 == null || str2.length() == 0)) {
                C165538bJ r12 = (C165538bJ) C17880vN.A0G(A0O);
                r12.bitField0_ |= 16;
                r12.description_ = str2;
            }
            AnonymousClass9Jf r02 = AnonymousClass9Jf.SINGLE_SELECT;
            C165538bJ r13 = (C165538bJ) C17880vN.A0G(A0O);
            r13.listType_ = r02.value;
            r13.bitField0_ |= 2;
            C164048Xi r03 = r13.singleSelectReply_;
            if (r03 == null) {
                r03 = C164048Xi.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O2 = r03.A0O();
            String str3 = aEb.A02;
            if (str3 != null) {
                C164048Xi r14 = (C164048Xi) C17880vN.A0G(A0O2);
                int i2 = C164048Xi.SELECTED_ROW_ID_FIELD_NUMBER;
                r14.bitField0_ |= 1;
                r14.selectedRowId_ = str3;
            }
            C164048Xi r04 = (C164048Xi) A0O2.A0C();
            C165538bJ r15 = (C165538bJ) C17880vN.A0G(A0O);
            r04.getClass();
            r15.singleSelectReply_ = r04;
            r15.bitField0_ |= 4;
            if (C19998A2m.A00(a2m, r8)) {
                C166278cd A01 = A79.A01(A0O, this.A00, a2m, r8);
                C165538bJ r16 = (C165538bJ) A0O.A00;
                A01.getClass();
                r16.contextInfo_ = A01;
                r16.bitField0_ |= 8;
            }
            C165538bJ r05 = (C165538bJ) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r2, r05);
            A0J.listResponseMessage_ = r05;
            A0J.bitField0_ |= 1073741824;
        }
    }

    public String BRB() {
        return null;
    }

    public String BS3() {
        return null;
    }

    public int BUD() {
        return 26;
    }

    public String BVT() {
        return null;
    }

    public C21002Acu(A79 a79) {
        this.A00 = a79;
    }
}
