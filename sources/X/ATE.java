package X;

import com.whatsapp.jid.UserJid;

@Deprecated
public class ATE implements B83, B85, AnonymousClass3LE, C436820m {
    public final AnonymousClass11S A00;
    public final C18030ve A01;

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C61402pc.A00(r4, "scheduled_call_type", "edit");
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r7) {
        AnonymousClass9Jh r0;
        if (r7 instanceof C444723o) {
            C444723o r72 = (C444723o) r7;
            AnonymousClass8X8 r3 = a2m.A00;
            AnonymousClass8ZG r02 = ((C166418cr) r3.A00).scheduledCallEditMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8ZG.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            C166408cq r03 = ((AnonymousClass8ZG) A0O.A00).key_;
            if (r03 == null) {
                r03 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r03);
            AnonymousClass205 r1 = r72.A0v;
            AnonymousClass8X7.A02(r1.A00, A0f, r1);
            String str = r72.A02;
            if (str != null) {
                A0f.A0H(str);
            }
            AnonymousClass1BI r04 = r72.A01;
            if (r04 != null) {
                AnonymousClass8X7.A01(r04, A0f);
            }
            AnonymousClass8ZG r12 = (AnonymousClass8ZG) C17880vN.A0G(A0O);
            r12.key_ = AnonymousClass8BU.A0Y(A0f);
            r12.bitField0_ |= 1;
            int i = r72.A00;
            if (i == 0) {
                r0 = AnonymousClass9Jh.UNKNOWN;
            } else if (i == 1) {
                r0 = AnonymousClass9Jh.CANCEL;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unexpected type (");
                A10.append(i);
                throw AnonymousClass001.A12(")", A10);
            }
            AnonymousClass8ZG r13 = (AnonymousClass8ZG) C17880vN.A0G(A0O);
            r13.editType_ = r0.value;
            r13.bitField0_ |= 2;
            AnonymousClass8ZG r05 = (AnonymousClass8ZG) A0O.A0C();
            C166418cr A0J = AnonymousClass8BV.A0J(r3, r05);
            A0J.scheduledCallEditMessage_ = r05;
            A0J.bitField1_ |= 1048576;
            return;
        }
        throw AnonymousClass000.A0k("FMessageScheduledCallEditLegacyProtobuf/not supported message");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        AnonymousClass9Jh r0;
        C166418cr r4 = a6d.A08;
        C444723o r2 = null;
        if (AnonymousClass000.A1O(r4.bitField1_ & 1048576)) {
            if (!C18020vd.A05(C18040vf.A02, this.A01, 4164)) {
                AnonymousClass205 r7 = a6d.A0A;
                AnonymousClass8ZG r42 = r4.scheduledCallEditMessage_;
                if (r42 == null) {
                    r42 = AnonymousClass8ZG.DEFAULT_INSTANCE;
                }
                C17960vV.A07(r42);
                if (AnonymousClass8BW.A1Q(r42.bitField0_)) {
                    C166408cq r6 = r42.key_;
                    if (r6 == null) {
                        r6 = C166408cq.DEFAULT_INSTANCE;
                    }
                    UserJid A02 = C22941Dw.A02(r6.participant_);
                    if (a6d.A00 == 8) {
                        C17960vV.A0F(AnonymousClass000.A1W(A02), "originalMessageKey.getParticipant() can't be null in admin revoke");
                        r7 = AnonymousClass205.A01(r7.A00, r7.A01, this.A00.A0O(A02));
                    }
                    r2 = new C444723o(r7, a6d.A03);
                    r2.A02 = r6.id_;
                    r2.A01 = A02;
                    if ((r42.bitField0_ & 2) != 0) {
                        int i = r42.editType_;
                        if (i == 0 || i != 1) {
                            r0 = AnonymousClass9Jh.UNKNOWN;
                        } else {
                            r0 = AnonymousClass9Jh.CANCEL;
                        }
                        int ordinal = r0.ordinal();
                        int i2 = 0;
                        if (ordinal != 0) {
                            i2 = 1;
                        }
                        r2.A00 = i2;
                    } else {
                        throw AnonymousClass8BR.A0p("scheduled_call_edit_missing_edit_type", 11);
                    }
                } else {
                    throw AnonymousClass8BR.A0p("scheduled_call_edit_missing_creation_message_key", 11);
                }
            }
        }
        return r2;
    }

    public ATE(AnonymousClass11S r1, C18030ve r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
