package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public final class ASO implements B83, B85, C436820m {
    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C165648bX r5;
        int i;
        C18070vi.A0h(r8, a2m);
        Class<AnonymousClass24B> cls = AnonymousClass24B.class;
        if (!(r8 instanceof AnonymousClass24B)) {
            String A0U = C17890vO.A0U(r8);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r8, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass8X8 r3 = a2m.A00;
        C163898Wt A01 = AnonymousClass8X8.A01(r3);
        A01.A0G(C179839Kc.BOT_FEEDBACK_MESSAGE);
        C166368cm r0 = ((C166418cr) r3.A00).protocolMessage_;
        if (r0 == null) {
            r0 = C166368cm.DEFAULT_INSTANCE;
        }
        C165648bX r02 = r0.botFeedbackMessage_;
        if (r02 == null) {
            r02 = C165648bX.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r02.A0O();
        AnonymousClass24B r82 = (AnonymousClass24B) r8;
        AnonymousClass9JU r1 = r82.A02;
        if (r1 != null) {
            r5 = (C165648bX) C17880vN.A0G(A0O);
            int i2 = C165648bX.KIND_FIELD_NUMBER;
            r5.kindReport_ = r1.value;
            i = r5.bitField0_ | 32;
        } else {
            C179819Ka r12 = r82.A01;
            r5 = (C165648bX) C17880vN.A0G(A0O);
            int i3 = C165648bX.KIND_FIELD_NUMBER;
            r5.kind_ = r12.value;
            i = r5.bitField0_ | 2;
        }
        r5.bitField0_ = i;
        String str2 = r82.A04;
        if (!(str2 == null || str2.length() == 0)) {
            C165648bX r13 = (C165648bX) C17880vN.A0G(A0O);
            r13.bitField0_ |= 4;
            r13.text_ = str2;
        }
        C166368cm r03 = ((C166418cr) r3.A00).protocolMessage_;
        if (r03 == null) {
            r03 = C166368cm.DEFAULT_INSTANCE;
        }
        C165648bX r04 = r03.botFeedbackMessage_;
        if (r04 == null) {
            r04 = C165648bX.DEFAULT_INSTANCE;
        }
        C166408cq r05 = r04.messageKey_;
        if (r05 == null) {
            r05 = C166408cq.DEFAULT_INSTANCE;
        }
        AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r05);
        AnonymousClass205 r14 = r82.A03;
        if (r14 != null) {
            A0f.A0H(r14.A01);
            A0f.A0K(r14.A02);
            A0f.A0J(C72463Mc.A0n(r14.A00));
        }
        if (r82.A02 == null) {
            C166408cq A0Z = AnonymousClass8BU.A0Z(A0f, A0O);
            C165648bX r15 = (C165648bX) A0O.A00;
            A0Z.getClass();
            r15.messageKey_ = A0Z;
            r15.bitField0_ |= 1;
        }
        C166368cm A0H = AnonymousClass8BS.A0H(A01);
        C165648bX r06 = (C165648bX) A0O.A0C();
        r06.getClass();
        A0H.botFeedbackMessage_ = r06;
        A0H.bitField0_ |= 16384;
        r3.A0N(A01);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.24B, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A01 = C20077A6d.A01(a6d);
        AnonymousClass206 r3 = null;
        if (AnonymousClass000.A1O(A01.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C166368cm A0I = AnonymousClass8BS.A0I(A01);
            int i = A0I.bitField0_;
            if (!AnonymousClass000.A1O(i & 2)) {
                throw AnonymousClass8BR.A0p("no protocol msg type", 11);
            } else if (A0I.A0R() == C179839Kc.BOT_FEEDBACK_MESSAGE) {
                if ((i & 16384) != 0) {
                    C165648bX r0 = A0I.botFeedbackMessage_;
                    C165648bX r1 = r0;
                    if (r0 == null) {
                        r0 = C165648bX.DEFAULT_INSTANCE;
                    }
                    if ((r0.bitField0_ & 2) == 0) {
                        C165648bX r02 = r1;
                        if (r1 == null) {
                            r02 = C165648bX.DEFAULT_INSTANCE;
                        }
                        if ((r02.bitField0_ & 32) == 0) {
                            throw AnonymousClass8BR.A0p("no bot feedback msg and report kind", 11);
                        }
                    }
                    C165648bX r03 = r1;
                    if (r1 == null) {
                        r03 = C165648bX.DEFAULT_INSTANCE;
                    }
                    if ((r03.bitField0_ & 2) != 0) {
                        if (r1 == null) {
                            r1 = C165648bX.DEFAULT_INSTANCE;
                        }
                        if ((r1.bitField0_ & 1) == 0) {
                            throw AnonymousClass8BR.A0p("no bot feedback msg messageKey", 11);
                        }
                    }
                    ? r32 = new AnonymousClass206(a6d.A0A, 88, a6d.A03);
                    r32.A01 = C179819Ka.BOT_FEEDBACK_NEGATIVE_OTHER;
                    C165648bX r04 = A0I.botFeedbackMessage_;
                    C165648bX r5 = r04;
                    C165648bX r12 = r04;
                    if (r04 == null) {
                        r04 = C165648bX.DEFAULT_INSTANCE;
                    }
                    boolean A1O = AnonymousClass000.A1O(r04.bitField0_ & 32);
                    if (r5 == null) {
                        r12 = C165648bX.DEFAULT_INSTANCE;
                    }
                    if (A1O) {
                        r32.A02 = AnonymousClass9JU.A01;
                    } else {
                        C179819Ka A00 = C179819Ka.A00(r12.kind_);
                        if (A00 == null) {
                            A00 = C179819Ka.BOT_FEEDBACK_POSITIVE;
                        }
                        r32.A01 = A00;
                    }
                    C165648bX r05 = r5;
                    if (r5 == null) {
                        r05 = C165648bX.DEFAULT_INSTANCE;
                    }
                    r3 = r32;
                    if ((r05.bitField0_ & 2) != 0) {
                        if (r5 == null) {
                            r5 = C165648bX.DEFAULT_INSTANCE;
                        }
                        C166408cq r52 = r5.messageKey_;
                        if (r52 == null) {
                            r52 = C166408cq.DEFAULT_INSTANCE;
                        }
                        String str = r52.remoteJid_;
                        if (str == null || str.length() == 0) {
                            throw AnonymousClass8BR.A0p("remote jid is empty", 11);
                        }
                        C22931Dv r06 = AnonymousClass1BI.A00;
                        r32.A03 = AnonymousClass205.A01(C22931Dv.A01(str), r52.id_, r52.fromMe_);
                        C165648bX r07 = A0I.botFeedbackMessage_;
                        C165648bX r13 = r07;
                        if (r07 == null) {
                            r07 = C165648bX.DEFAULT_INSTANCE;
                        }
                        r3 = r32;
                        if ((r07.bitField0_ & 4) != 0) {
                            if (r13 == null) {
                                r13 = C165648bX.DEFAULT_INSTANCE;
                            }
                            r32.A04 = r13.text_;
                            return r32;
                        }
                    }
                } else {
                    throw AnonymousClass8BR.A0p("no bot feedback msg", 11);
                }
            }
        }
        return r3;
    }
}
