package X;

import java.util.ArrayList;

/* renamed from: X.ASs  reason: case insensitive filesystem */
public final class C20634ASs implements B83, B85, C436820m {
    public final C18030ve A00;
    public final A79 A01;

    public C20634ASs(C18030ve r2, A79 a79) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a79;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        int length;
        String str;
        int length2;
        long j;
        Object obj;
        C18070vi.A0d(a6d, 0);
        C166418cr r1 = a6d.A08;
        if ((r1.bitField2_ & 64) == 0) {
            return null;
        }
        C18030ve r5 = this.A00;
        C18040vf r4 = C18040vf.A02;
        if (!C18020vd.A05(r4, r5, 10414)) {
            obj = a6d.A04(0);
        } else {
            C164898aF r6 = r1.pollResultSnapshotMessage_;
            if (r6 == null) {
                r6 = C164898aF.DEFAULT_INSTANCE;
            }
            AnonymousClass24P r7 = new AnonymousClass24P(a6d.A0A, a6d.A03);
            if (AnonymousClass8BW.A1Q(r6.bitField0_)) {
                boolean z = a6d.A0L;
                String str2 = r6.name_;
                if (z) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    r7.A00 = str2;
                    obj = r7;
                } else if (str2 == null || (length = str2.length()) == 0 || length > 5000) {
                    throw AnonymousClass8BR.A0p("poll_result_snapshot_invalid_name", 11);
                } else {
                    r7.A00 = str2;
                    if (r6.pollVotes_.size() > 0) {
                        EE9<AnonymousClass8ZF> ee9 = r6.pollVotes_;
                        int A002 = C18020vd.A00(r4, r5, 1408);
                        if (A002 > 12) {
                            A002 = 12;
                        }
                        if (ee9 == null || ee9.isEmpty() || ee9.size() < 2) {
                            throw AnonymousClass8BR.A0p("poll_result_snapshot_invalid_options_count", 11);
                        }
                        ArrayList A13 = AnonymousClass000.A13();
                        for (AnonymousClass8ZF r10 : ee9) {
                            int i = r10.bitField0_;
                            if ((i & 1) == 0 || (str = r10.optionName_) == null || (length2 = str.length()) == 0 || length2 > 2500) {
                                throw AnonymousClass8BR.A0p("poll_result_snapshot_invalid_option", 11);
                            }
                            if ((i & 2) != 0) {
                                j = r10.optionVoteCount_;
                            } else {
                                j = 0;
                            }
                            A13.add(new C59152lq(str, j));
                        }
                        if (A13.size() < 2 || A13.size() > A002) {
                            throw AnonymousClass8BR.A0p("poll_result_snapshot_invalid_options_count", 11);
                        }
                        r7.A01 = A13;
                        obj = r7;
                    } else {
                        throw AnonymousClass8BR.A0p("poll_creation_missing_options", 11);
                    }
                }
            } else {
                throw AnonymousClass8BR.A0p("poll_result_snapshot_missing_name", 11);
            }
        }
        return (AnonymousClass206) obj;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        boolean A15 = C18070vi.A15(r11, a2m);
        C181359Qe.A00(C22084AxO.A00, r11 instanceof AnonymousClass24P);
        AnonymousClass8X8 r4 = a2m.A00;
        C164898aF r0 = ((C166418cr) r4.A00).pollResultSnapshotMessage_;
        if (r0 == null) {
            r0 = C164898aF.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        AnonymousClass24P r3 = (AnonymousClass24P) r11;
        String str = r3.A00;
        if (str.length() != 0) {
            C164898aF r1 = (C164898aF) C17880vN.A0G(A0O);
            int i = C164898aF.CONTEXT_INFO_FIELD_NUMBER;
            r1.bitField0_ |= 1;
            r1.name_ = str;
            for (C59152lq r32 : r3.A01) {
                C18070vi.A0d(r32, A15);
                C23624Bmt A0N = AnonymousClass8ZF.DEFAULT_INSTANCE.A0N();
                String str2 = r32.A01;
                AnonymousClass8ZF r12 = (AnonymousClass8ZF) C17880vN.A0G(A0N);
                r12.bitField0_ |= 1;
                r12.optionName_ = str2;
                long j = r32.A00;
                AnonymousClass8ZF r33 = (AnonymousClass8ZF) C17880vN.A0G(A0N);
                r33.bitField0_ |= 2;
                r33.optionVoteCount_ = j;
                C23577Bm6 A09 = AnonymousClass8BS.A09(A0N, A0O);
                C164898aF r2 = (C164898aF) A0O.A00;
                A09.getClass();
                EE9 ee9 = r2.pollVotes_;
                if (!((C27296DbR) ee9).A00) {
                    ee9 = C23577Bm6.A09(ee9);
                    r2.pollVotes_ = ee9;
                }
                ee9.add(A09);
            }
            if (C19998A2m.A00(a2m, r11)) {
                C166278cd A012 = A79.A01(A0O, this.A01, a2m, r11);
                C164898aF r13 = (C164898aF) A0O.A00;
                A012.getClass();
                r13.contextInfo_ = A012;
                r13.bitField0_ |= 2;
            }
            C164898aF r02 = (C164898aF) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r4, r02);
            A0J.pollResultSnapshotMessage_ = r02;
            A0J.bitField2_ |= 64;
            return;
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}
