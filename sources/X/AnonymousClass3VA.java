package X;

import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$1;
import com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$executeIfInputIsValid$1;
import com.whatsapp.jid.GroupJid;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3VA  reason: invalid class name */
public final class AnonymousClass3VA extends AnonymousClass1J2 {
    public AnonymousClass4ZK A00;
    public AnonymousClass1WR A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public final C96314ne A03 = new C96314ne(this, 17);
    public final AnonymousClass4K7 A04;
    public final AnonymousClass11S A05;
    public final C33251iW A06;
    public final AnonymousClass1M9 A07;
    public final AnonymousClass11C A08;
    public final C24681Lg A09;
    public final C25191Ng A0A;
    public final AnonymousClass1BI A0B;
    public final C32511hJ A0C;
    public final C18010vc A0D;
    public final AnonymousClass205 A0E;
    public final AnonymousClass1W6 A0F;
    public final C18600wl A0G;
    public final C18600wl A0H;
    public final C108485bm A0I;
    public final C108485bm A0J;
    public final C108485bm A0K;
    public final C108485bm A0L;
    public final C23421Fz A0M;
    public final C23421Fz A0N;
    public final C23421Fz A0O;
    public final C23421Fz A0P;
    public final AnonymousClass1G4 A0Q;
    public final AnonymousClass1G1 A0R;
    public final MessageCommentsManager A0S;
    public final AnonymousClass1MZ A0T;
    public final C18030ve A0U;
    public final AnonymousClass126 A0V;
    public final C42211xo A0W;

    public static final int A00(AnonymousClass3VA r5, AnonymousClass1E7 r6) {
        GroupJid groupJid = (GroupJid) r6.A06(GroupJid.class);
        if (groupJid == null || !r5.A0T.A0J(groupJid)) {
            return 2;
        }
        AnonymousClass126 r1 = r5.A0V;
        if (!AnonymousClass3MX.A0i(r1.A1D).A00(r6) && r1.A0I(r6) != 1) {
            if (r1.A0J(r6.A0J) < C18020vd.A00(C18040vf.A02, r5.A0U, 4728)) {
                return 1;
            }
            return 6;
        } else if (r5.A0W.A00(r6)) {
            return 5;
        } else {
            return 4;
        }
    }

    public static final AnonymousClass4LF A03(AnonymousClass3VA r4, AnonymousClass206 r5) {
        MessageCommentsManager messageCommentsManager = r4.A0S;
        messageCommentsManager.A02.execute(new AnonymousClass7RL(messageCommentsManager, r5, (AnonymousClass1OS) null, 40));
        int i = r5.A0u;
        if (i == 11) {
            return new C78103sA(r5);
        }
        if (i == 15 || i == 64) {
            return new C78113sB(r5);
        }
        return new C78093s9(r5);
    }

    public void A0S() {
        AnonymousClass4ZK r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("commentListManager");
            throw null;
        }
        r0.A01.unregisterObserver(r0.A00);
        this.A0A.unregisterObserver(this.A03);
        AnonymousClass1WR r1 = this.A01;
        if (r1 != null) {
            this.A09.unregisterObserver(r1);
        }
    }

    public final void A0T(String str) {
        AnonymousClass4UD r4;
        AnonymousClass1G1 r7 = this.A0R;
        AnonymousClass206 r0 = ((C88044Yc) r7.getValue()).A03;
        if (r0 != null) {
            C106165Uu r6 = new C106165Uu(this, r0);
            String A0G2 = C26302CxJ.A0G(AnonymousClass1YF.A0I(str), false);
            C18070vi.A0X(A0G2);
            int length = A0G2.length();
            if (length == 0) {
                r4 = new AnonymousClass4UD((Integer) null, (Integer) null, false);
            } else {
                if (C26302CxJ.A0V(this.A08, this.A0D, A0G2)) {
                    if (A0G2.codePointCount(0, length) > 65536) {
                        r4 = new AnonymousClass4UD((Integer) null, 17, false);
                    } else {
                        AnonymousClass206 r02 = ((C88044Yc) r7.getValue()).A03;
                        if (r02 == null || r02.A0v.A00 != null) {
                            r6.invoke(A0G2);
                            return;
                        }
                    }
                }
                r4 = new AnonymousClass4UD(2131887925, (Integer) null, false);
            }
            AnonymousClass3MW.A1X(this.A0H, new CommentsBottomSheetViewModel$executeIfInputIsValid$1(r4, this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public AnonymousClass3VA(AnonymousClass4K7 r20, AnonymousClass11S r21, C33251iW r22, MessageCommentsManager messageCommentsManager, AnonymousClass1M9 r24, AnonymousClass11C r25, AnonymousClass1MZ r26, C24681Lg r27, C18030ve r28, AnonymousClass126 r29, C25191Ng r30, C42211xo r31, AnonymousClass1BI r32, C32511hJ r33, C18010vc r34, AnonymousClass205 r35, AnonymousClass1W6 r36, C18600wl r37, C18600wl r38) {
        C18030ve r10 = r28;
        C18070vi.A0d(r10, 1);
        C32511hJ r6 = r33;
        AnonymousClass11S r17 = r21;
        AnonymousClass1M9 r15 = r24;
        C18070vi.A0p(r17, r6, r15);
        AnonymousClass11C r14 = r25;
        C18070vi.A0d(r14, 5);
        C24681Lg r11 = r27;
        AnonymousClass126 r9 = r29;
        C42211xo r7 = r31;
        AnonymousClass1W6 r0 = r36;
        C33251iW r16 = r22;
        C18070vi.A0x(r0, r9, r11, r7, r16);
        AnonymousClass1MZ r12 = r26;
        C18010vc r5 = r34;
        C18600wl r4 = r37;
        C18600wl r3 = r38;
        AnonymousClass4K7 r18 = r20;
        C18070vi.A0y(r4, r3, r12, r5, r18);
        C25191Ng r8 = r30;
        MessageCommentsManager messageCommentsManager2 = messageCommentsManager;
        C18070vi.A0m(messageCommentsManager2, r8);
        this.A0U = r10;
        this.A05 = r17;
        this.A0C = r6;
        this.A07 = r15;
        this.A08 = r14;
        this.A0F = r0;
        this.A0V = r9;
        this.A09 = r11;
        this.A0W = r7;
        this.A06 = r16;
        this.A0G = r4;
        this.A0H = r3;
        this.A0T = r12;
        this.A0D = r5;
        this.A04 = r18;
        this.A0S = messageCommentsManager2;
        this.A0A = r8;
        this.A0B = r32;
        this.A0E = r35;
        List emptyList = Collections.emptyList();
        C18070vi.A0X(emptyList);
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new C88044Yc((AnonymousClass4UD) null, (AnonymousClass1E7) null, (AnonymousClass206) null, emptyList, 1, false));
        this.A0Q = A18;
        this.A0R = A18;
        C25691Pg r39 = C25691Pg.DROP_OLDEST;
        C27178DXn A012 = AnonymousClass4W8.A01(r39, 1);
        this.A0I = A012;
        this.A0M = AnonymousClass4WB.A01(A012);
        C27178DXn A013 = AnonymousClass4W8.A01(r39, 1);
        this.A0J = A013;
        this.A0N = AnonymousClass4WB.A01(A013);
        C27178DXn A014 = AnonymousClass4W8.A01(r39, 1);
        this.A0L = A014;
        this.A0P = AnonymousClass4WB.A01(A014);
        C27178DXn A015 = AnonymousClass4W8.A01(r39, 1);
        this.A0K = A015;
        this.A0O = AnonymousClass4WB.A01(A015);
        AnonymousClass3MW.A1X(r4, new CommentsBottomSheetViewModel$1(this, (C30391dr) null), C41561wd.A00(this));
    }
}
