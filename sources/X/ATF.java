package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ATF implements B83, B85, AnonymousClass3LE, C436820m {
    public final C18030ve A00;
    public final AnonymousClass1CJ A01;
    public final A79 A02;

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C61402pc.A00(r4, "polltype", "creation");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDb(X.C19998A2m r13, X.AnonymousClass206 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x016a
            X.22H r14 = (X.AnonymousClass22H) r14
            X.205 r2 = r14.A0v
            int r5 = r14.A02
            java.lang.String r3 = r14.A05
            java.util.List r6 = r14.A07
            int r1 = r14.A01
            r11 = 0
            r0 = 1
            boolean r10 = X.AnonymousClass000.A1T(r1, r0)
            X.1CJ r1 = r12.A01
            X.1BI r0 = r2.A00
            boolean r9 = r1.A0R(r0)
            X.8X8 r4 = r13.A00
            X.Bm6 r0 = r4.A00
            X.8cr r0 = (X.C166418cr) r0
            if (r10 == 0) goto L_0x00e8
            X.8Xc r0 = r0.pollCreationMessageV5_
            if (r0 != 0) goto L_0x002c
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
        L_0x002c:
            X.8cr r0 = r0.message_
            if (r0 != 0) goto L_0x0032
            X.8cr r0 = X.C166418cr.DEFAULT_INSTANCE
        L_0x0032:
            X.8bx r0 = r0.pollCreationMessageV3_
        L_0x0034:
            if (r0 != 0) goto L_0x0038
            X.8bx r0 = X.C165908bx.DEFAULT_INSTANCE
        L_0x0038:
            X.Bmt r2 = r0.A0O()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0055
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8bx r1 = (X.C165908bx) r1
            int r0 = X.C165908bx.CONTEXT_INFO_FIELD_NUMBER
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.name_ = r3
        L_0x0055:
            boolean r0 = X.C19998A2m.A00(r13, r14)
            if (r0 == 0) goto L_0x0072
            X.A79 r0 = r12.A02
            X.8cd r3 = X.A79.A01(r2, r0, r13, r14)
            X.Bm6 r1 = r2.A00
            X.8bx r1 = (X.C165908bx) r1
            int r0 = X.C165908bx.CONTEXT_INFO_FIELD_NUMBER
            r3.getClass()
            r1.contextInfo_ = r3
            int r0 = r1.bitField0_
            r0 = r0 | 8
            r1.bitField0_ = r0
        L_0x0072:
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8bx r1 = (X.C165908bx) r1
            int r0 = X.C165908bx.CONTEXT_INFO_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            r1.selectableOptionsCount_ = r5
            r7 = 0
            r8 = 0
        L_0x0084:
            int r0 = r6.size()
            if (r7 >= r0) goto L_0x00ee
            X.8ZD r0 = X.AnonymousClass8ZD.DEFAULT_INSTANCE
            X.Bmt r5 = r0.A0N()
            java.lang.Object r0 = r6.get(r7)
            X.A18 r0 = (X.A18) r0
            java.lang.String r3 = r0.A04
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8ZD r1 = (X.AnonymousClass8ZD) r1
            r3.getClass()
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.optionName_ = r3
            X.Bm6 r5 = r5.A0C()
            X.8ZD r5 = (X.AnonymousClass8ZD) r5
            X.Bm6 r3 = X.C17880vN.A0G(r2)
            X.8bx r3 = (X.C165908bx) r3
            r5.getClass()
            X.EE9 r1 = r3.options_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00c7
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r3.options_ = r1
        L_0x00c7:
            r1.add(r5)
            if (r10 == 0) goto L_0x00e5
            java.lang.Object r0 = r6.get(r7)
            X.A18 r0 = (X.A18) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00e5
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8bx r1 = (X.C165908bx) r1
            r1.correctAnswer_ = r5
            int r0 = r1.bitField0_
            r0 = r0 | 64
            r1.bitField0_ = r0
            r8 = 1
        L_0x00e5:
            int r7 = r7 + 1
            goto L_0x0084
        L_0x00e8:
            if (r9 == 0) goto L_0x0032
            X.8bx r0 = r0.pollCreationMessageV2_
            goto L_0x0034
        L_0x00ee:
            if (r10 == 0) goto L_0x014c
            if (r8 == 0) goto L_0x0140
            X.8X8 r5 = X.C166418cr.A00()
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
            X.Bmt r3 = r0.A0N()
            X.8X6 r3 = (X.AnonymousClass8X6) r3
            X.9Jg r0 = X.AnonymousClass9Jg.QUIZ
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8bx r1 = (X.C165908bx) r1
            int r0 = r0.value
            r1.pollType_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 32
            r1.bitField0_ = r0
            X.Bm6 r0 = r2.A0C()
            X.8bx r0 = (X.C165908bx) r0
            X.8cr r2 = X.AnonymousClass8BV.A0J(r5, r0)
            r2.pollCreationMessageV3_ = r0
            int r1 = r2.bitField1_
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.bitField1_ = r1
            X.8cr r0 = X.AnonymousClass8BR.A0e(r5)
            r3.A0I(r0)
            X.8cr r1 = X.AnonymousClass8BS.A0M(r4)
            X.Bm6 r0 = r3.A0C()
            X.8Xc r0 = (X.C163988Xc) r0
            r0.getClass()
            r1.pollCreationMessageV5_ = r0
            int r0 = r1.bitField2_
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.bitField2_ = r0
            return
        L_0x0140:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r1 = "Poll V5 missing correct answer"
            X.1T8 r0 = new X.1T8
            r0.<init>(r2, r1)
            throw r0
        L_0x014c:
            X.Bm6 r0 = r2.A0C()
            X.8bx r0 = (X.C165908bx) r0
            X.8cr r2 = X.AnonymousClass8BV.A0J(r4, r0)
            if (r9 == 0) goto L_0x0163
            r2.pollCreationMessageV2_ = r0
            int r1 = r2.bitField1_
            r0 = 32768(0x8000, float:4.5918E-41)
        L_0x015f:
            r1 = r1 | r0
            r2.bitField1_ = r1
            return
        L_0x0163:
            r2.pollCreationMessageV3_ = r0
            int r1 = r2.bitField1_
            r0 = 524288(0x80000, float:7.34684E-40)
            goto L_0x015f
        L_0x016a:
            java.lang.String r0 = "FMessagePollProtobuf/not supported message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATF.BDb(X.A2m, X.206):void");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C165908bx r5;
        AnonymousClass9Jg r2;
        AnonymousClass8ZD r8;
        String str;
        AnonymousClass9Jg r1;
        C20077A6d a6d2 = a6d;
        C166418cr r4 = a6d2.A08;
        int i = r4.bitField1_;
        if ((i & 64) != 0) {
            r5 = r4.pollCreationMessage_;
        } else if ((32768 & i) != 0) {
            if (AnonymousClass9RT.A00(this.A00)) {
                r5 = r4.pollCreationMessageV2_;
            } else {
                return new AnonymousClass23U(a6d2.A0A, a6d2.A09.A0M(), 2, a6d2.A00, a6d2.A03);
            }
        } else if ((i & 524288) == 0) {
            return null;
        } else {
            r5 = r4.pollCreationMessageV3_;
        }
        if (r5 == null) {
            r5 = C165908bx.DEFAULT_INSTANCE;
        }
        AnonymousClass22H r14 = new AnonymousClass22H(a6d2.A0A, a6d2.A03);
        if (AnonymousClass000.A1O(r5.bitField0_ & 2)) {
            boolean z = a6d2.A0L;
            String str2 = r5.name_;
            if (z) {
                if (str2 == null) {
                    str2 = "";
                }
                r14.A05 = str2;
            } else if (TextUtils.isEmpty(str2) || str2.length() > 5000) {
                throw AnonymousClass8BR.A0p("poll_creation_invalid_name", 11);
            } else {
                r14.A05 = str2;
                int i2 = r5.bitField0_;
                if ((i2 & 32) != 0) {
                    int i3 = r5.pollType_;
                    if (i3 == 0 || i3 != 1) {
                        r1 = AnonymousClass9Jg.POLL;
                    } else {
                        r1 = AnonymousClass9Jg.QUIZ;
                    }
                    if (r1 == AnonymousClass9Jg.QUIZ) {
                        if ((i2 & 64) != 0) {
                            r14.A01 = 1;
                        } else {
                            throw AnonymousClass8BR.A0p("poll_creation_missing_correct_answer", 11);
                        }
                    }
                }
                if (r5.options_.size() > 0) {
                    EE9<AnonymousClass8ZD> ee9 = r5.options_;
                    int min = Math.min(C18020vd.A00(C18040vf.A02, this.A00, 1408), 12);
                    int i4 = r5.pollType_;
                    if (i4 == 0 || i4 != 1) {
                        r2 = AnonymousClass9Jg.POLL;
                    } else {
                        r2 = AnonymousClass9Jg.QUIZ;
                    }
                    if (r2 != AnonymousClass9Jg.QUIZ || (r5.bitField0_ & 64) == 0) {
                        r8 = null;
                    } else {
                        r8 = r5.correctAnswer_;
                        if (!(r8 == null && (r8 = AnonymousClass8ZD.DEFAULT_INSTANCE) == null) && (r8.bitField0_ & 1) == 0) {
                            throw AnonymousClass8BR.A0p("poll_creation_missing_correct_answer_name", 11);
                        }
                    }
                    if (ee9 == null || ee9.size() < 2) {
                        throw AnonymousClass8BR.A0p("poll_creation_invalid_options_count", 11);
                    }
                    LinkedHashSet A14 = C17880vN.A14();
                    boolean A1X = AnonymousClass000.A1X(r8);
                    for (AnonymousClass8ZD r12 : ee9) {
                        if ((r12.bitField0_ & 1) != 0) {
                            str = r12.optionName_;
                        } else {
                            str = null;
                        }
                        if (TextUtils.isEmpty(str) || str.length() > 2500) {
                            throw AnonymousClass8BR.A0p("poll_creation_invalid_option", 11);
                        }
                        A18 a18 = new A18(str);
                        if (r8 != null && !A1X && r8.optionName_.equals(a18.A04)) {
                            a18.A03 = true;
                            A1X = true;
                        }
                        if (!A14.contains(a18)) {
                            A14.add(a18);
                        }
                    }
                    if (A14.size() < 2 || A14.size() > min) {
                        throw AnonymousClass8BR.A0p("poll_creation_invalid_options_count", 11);
                    } else if (r8 == null || A1X) {
                        ArrayList A10 = C17880vN.A10(A14);
                        List list = r14.A07;
                        list.clear();
                        list.addAll(A10);
                        if ((r5.bitField0_ & 4) != 0) {
                            int i5 = r5.selectableOptionsCount_;
                            if (i5 < 0 || i5 > list.size()) {
                                throw AnonymousClass8BR.A0p("poll_creation_invalid_selectable_options_count", 11);
                            }
                            r14.A02 = i5;
                        } else {
                            throw AnonymousClass8BR.A0p("poll_creation_missing_selectable_options_count", 11);
                        }
                    } else {
                        throw AnonymousClass8BR.A0p("poll_creation_unmatched_correct_answer", 11);
                    }
                } else {
                    throw AnonymousClass8BR.A0p("poll_creation_missing_options", 11);
                }
            }
            C166048cG r0 = r4.messageContextInfo_;
            if (r0 == null) {
                r0 = C166048cG.DEFAULT_INSTANCE;
            }
            r14.A1D = r0.messageSecret_.A06();
            return r14;
        }
        throw AnonymousClass8BR.A0p("poll_creation_missing_name", 11);
    }

    public ATF(AnonymousClass1CJ r1, C18030ve r2, A79 a79) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = a79;
    }
}
