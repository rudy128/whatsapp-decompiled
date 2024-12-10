package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public final class AT9 implements B83, B85, C436820m {
    public final AnonymousClass1TB A00;

    public AT9(AnonymousClass1TB r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        UserJid userJid;
        C179739Js r0;
        C20077A6d a6d2 = a6d;
        C166418cr A01 = C20077A6d.A01(a6d2);
        if (AnonymousClass000.A1O(A01.bitField1_ & 8388608)) {
            C165528bI r7 = A01.callLogMesssage_;
            if (r7 == null) {
                r7 = C165528bI.DEFAULT_INSTANCE;
            }
            int i = r7.bitField0_;
            if (!AnonymousClass8BW.A1Q(i)) {
                throw AnonymousClass8BR.A0p("call log message missing is_video", 11);
            } else if ((i & 2) == 0) {
                throw AnonymousClass8BR.A0p("call log message missing call_outcome", 11);
            } else if (AnonymousClass000.A1O(i & 8)) {
                AnonymousClass205 r3 = a6d2.A0A;
                boolean z = r7.isVideo_;
                AnonymousClass9KW A002 = AnonymousClass9KW.A00(r7.callOutcome_);
                if (A002 == null) {
                    A002 = AnonymousClass9KW.CONNECTED;
                }
                EE9<C22569BDk> ee9 = r7.participants_;
                ArrayList A0t = C108965cb.A0t(ee9);
                for (C22569BDk bDk : ee9) {
                    if (!bDk.Bcd()) {
                        throw AnonymousClass8BR.A0p("call log message participant missing jid", 11);
                    } else if (bDk.BcW()) {
                        C22941Dw r02 = UserJid.Companion;
                        A0t.add(new C178109Bv(C22941Dw.A03(bDk.BTd()), A00(bDk.BO4()), -1));
                    } else {
                        throw AnonymousClass8BR.A0p("call log message participant missing call_outcome", 11);
                    }
                }
                AnonymousClass1BI r4 = r3.A00;
                if (C22971Dz.A0d(r4)) {
                    userJid = r4;
                } else {
                    AnonymousClass1BI r10 = a6d2.A05;
                    if (C22971Dz.A0d(r10)) {
                        C18070vi.A0z(r10, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                        userJid = (UserJid) r10;
                    }
                    throw AnonymousClass8BR.A0p("call log message missing call_type", 11);
                }
                if (userJid != null) {
                    boolean z2 = r3.A02;
                    String str = r3.A01;
                    C18070vi.A0X(str);
                    C89444cT r2 = new C89444cT(-1, userJid, str, z2);
                    C89444cT r16 = r2;
                    C178119Bw r14 = new C178119Bw((DeviceJid) null, r16, A0t, a6d2.A03, z);
                    C178119Bw A05 = this.A00.A05(r2);
                    r14.A0E(A00(A002));
                    int i2 = r7.callType_;
                    if (i2 == 0) {
                        r0 = C179739Js.REGULAR;
                    } else if (i2 == 1) {
                        r0 = C179739Js.SCHEDULED_CALL;
                    } else if (i2 != 2) {
                        r0 = C179739Js.REGULAR;
                    } else {
                        r0 = C179739Js.VOICE_CHAT;
                    }
                    int ordinal = r0.ordinal();
                    int i3 = 1;
                    int i4 = 0;
                    if (ordinal == 0) {
                        i3 = 0;
                    } else if (ordinal != 1) {
                        i3 = 2;
                    }
                    r14.A0F(i3);
                    if (A05 != null) {
                        C178119Bw.A00(A05);
                        i4 = A05.A09;
                    }
                    r14.A0G(i4);
                    if (r4 instanceof GroupJid) {
                        r14.A0I((GroupJid) r4);
                    }
                    if (a6d2.A0L) {
                        return new AnonymousClass22M(r3, r14);
                    }
                    if (A05 != null) {
                        return new AnonymousClass22M(r3, A05);
                    }
                }
                throw AnonymousClass8BR.A0p("call log message missing call_type", 11);
            } else {
                throw AnonymousClass8BR.A0p("call log message missing call_type", 11);
            }
        }
        return null;
    }

    public static final int A00(AnonymousClass9KW r0) {
        switch (r0.ordinal()) {
            case 0:
                return 5;
            case 1:
            case 6:
            case 7:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 6;
            default:
                return 0;
        }
    }

    public static final AnonymousClass9KW A01(int i) {
        switch (i) {
            case 1:
            case 2:
                return AnonymousClass9KW.MISSED;
            case 3:
                return AnonymousClass9KW.FAILED;
            case 4:
                return AnonymousClass9KW.REJECTED;
            case 5:
                return AnonymousClass9KW.CONNECTED;
            case 6:
                return AnonymousClass9KW.ACCEPTED_ELSEWHERE;
            default:
                return AnonymousClass9KW.ONGOING;
        }
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        AnonymousClass9KW A01;
        C179739Js r0;
        C18070vi.A0h(r11, a2m);
        Class<AnonymousClass22M> cls = AnonymousClass22M.class;
        if (!(r11 instanceof AnonymousClass22M)) {
            String A0U = C17890vO.A0U(r11);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r11, name, A0U, C17890vO.A0W(str), str);
        }
        C178119Bw r2 = (C178119Bw) ((AnonymousClass22M) r11).A00.A02;
        if (r2 != null) {
            AnonymousClass8X8 r3 = a2m.A00;
            C165528bI r02 = ((C166418cr) r3.A00).callLogMesssage_;
            if (r02 == null) {
                r02 = C165528bI.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r02.A0O();
            boolean z = r2.A0J;
            C165528bI r1 = (C165528bI) C17880vN.A0G(A0O);
            int i = C165528bI.CALL_OUTCOME_FIELD_NUMBER;
            r1.bitField0_ |= 1;
            r1.isVideo_ = z;
            if (r2.A0S()) {
                A01 = AnonymousClass9KW.SILENCED_BY_DND;
            } else if (r2.A0R()) {
                A01 = AnonymousClass9KW.SILENCED_UNKNOWN_CALLER;
            } else {
                A01 = A01(r2.A06);
            }
            C165528bI r12 = (C165528bI) C17880vN.A0G(A0O);
            r12.callOutcome_ = A01.value;
            r12.bitField0_ |= 2;
            long j = (long) r2.A08;
            C165528bI r13 = (C165528bI) C17880vN.A0G(A0O);
            r13.bitField0_ |= 4;
            r13.durationSecs_ = j;
            int i2 = r2.A07;
            if (i2 == 1) {
                r0 = C179739Js.SCHEDULED_CALL;
            } else if (i2 == 2 || i2 == 3) {
                r0 = C179739Js.VOICE_CHAT;
            } else {
                r0 = C179739Js.REGULAR;
            }
            C165528bI r14 = (C165528bI) C17880vN.A0G(A0O);
            r14.callType_ = r0.value;
            r14.bitField0_ |= 8;
            ArrayList A0B = r2.A0B();
            ArrayList A0D = C29351c6.A0D(A0B);
            Iterator it = A0B.iterator();
            while (it.hasNext()) {
                C178109Bv r6 = (C178109Bv) it.next();
                C23624Bmt A0N = C166428cs.DEFAULT_INSTANCE.A0N();
                String A0d = AnonymousClass8BS.A0d(A0N, r6.A00);
                C166428cs r15 = (C166428cs) A0N.A00;
                A0d.getClass();
                r15.bitField0_ |= 1;
                r15.jid_ = A0d;
                AnonymousClass9KW A012 = A01(r6.A01);
                C166428cs r16 = (C166428cs) C17880vN.A0G(A0N);
                r16.callOutcome_ = A012.value;
                r16.bitField0_ |= 2;
                A0D.add(A0N.A0C());
            }
            C165528bI r22 = (C165528bI) C17880vN.A0G(A0O);
            EE9 ee9 = r22.participants_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r22.participants_ = ee9;
            }
            DND.A09(A0D, ee9);
            C166418cr A0M = AnonymousClass8BS.A0M(r3);
            C165528bI r03 = (C165528bI) A0O.A0C();
            r03.getClass();
            A0M.callLogMesssage_ = r03;
            A0M.bitField1_ |= 8388608;
        }
    }
}
