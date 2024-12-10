package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4VH  reason: invalid class name */
public final class AnonymousClass4VH {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass1FU A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass4QS A03;
    public final AnonymousClass1EC A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass11E A06;
    public final AnonymousClass1M9 A07;
    public final C24921Me A08;
    public final AnonymousClass1NN A09;
    public final AnonymousClass1MZ A0A;
    public final AnonymousClass126 A0B;
    public final AnonymousClass12M A0C;
    public final AnonymousClass1LU A0D;
    public final AnonymousClass1PU A0E;

    public final void A00(UserJid userJid, Integer num) {
        int A022;
        C97554pf r5;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        if (!A02()) {
            AnonymousClass1MZ r3 = this.A0A;
            AnonymousClass1EC r6 = this.A04;
            if (r3.A05.A06(r6) == 1) {
                A022 = C18020vd.A00(C18040vf.A02, r3.A0D, 1655);
            } else {
                A022 = r3.A02(r6) - 1;
            }
            if (A022 > r3.A08.A0C(r6).A0K().size()) {
                this.A01.CNB(2131893530, 2131895077);
                C818940k r2 = new C818940k(this.A09, this, this.A0B, r6, userJid2, num, C18070vi.A0M(userJid));
                AnonymousClass12M r32 = this.A0C;
                AnonymousClass1EC r4 = r2.A03;
                boolean A032 = ((AnonymousClass1PU) r32.A07.get()).A03(r4);
                List list = r2.A05;
                C17960vV.A07(list);
                if (r2.A00) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("GroupIqResponseUtil/add-admin/timeout; groupId=");
                    A10.append(r4);
                    C17900vP.A0X(list, "; participants=", A10);
                    r5 = null;
                } else {
                    r5 = new C97554pf(r2, r32, 3);
                }
                AnonymousClass12M.A04(r32, r4, r5, "promote", list, 91, A032);
                return;
            }
            HashMap A11 = C17880vN.A11();
            C17890vO.A0z(userJid, A11, 419);
            boolean A033 = this.A0E.A03(r6);
            AnonymousClass126 r1 = this.A0B;
            int i = 3003;
            if (A033) {
                i = 3019;
            }
            r1.A0O(i, A11);
        }
    }

    public final void A01(UserJid userJid, Integer num) {
        C97564pg r7;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        AnonymousClass1MZ r0 = this.A0A;
        AnonymousClass1EC r8 = this.A04;
        C63312sr A052 = r0.A05(r8, userJid);
        if (A052 != null && A052.A01 == 2) {
            boolean A032 = this.A0E.A03(r8);
            if (!this.A05.A0O(userJid) || !A032) {
                AnonymousClass1FU r4 = this.A01;
                int i = 2131890009;
                if (A032) {
                    i = 2131889963;
                }
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass3MX.A1N(this.A08, this.A07.A0H(userJid), A1a, 0);
                r4.BhU(A1a, 0, i);
                return;
            }
            AnonymousClass1FU r42 = this.A01;
            if (!r42.Bed()) {
                C73203Rj A002 = AnonymousClass4a6.A00(r42);
                A002.A0S(r42.getString(2131889353));
                A002.A0e(r42, (C22851Dl) null, 2131898766);
                A002.A0g(r42, new C91604fx(this, 34), 2131886752);
                A002.A0C();
            }
            AnonymousClass4QS r02 = this.A03;
            if (r02 != null) {
                AnonymousClass4XS r1 = r02.A02;
                if (r1.A00.A0O(userJid)) {
                    AnonymousClass4ZZ r3 = (AnonymousClass4ZZ) r1.A05.getValue();
                    C81313z2 A003 = AnonymousClass4ZZ.A00(r3);
                    A003.A02 = C17880vN.A0i();
                    A003.A00 = true;
                    r3.A01.CC7(A003);
                }
            }
        } else if (!this.A06.A09()) {
            this.A02.A08(C72473Md.A03(this.A01), 0);
        } else {
            this.A01.CNB(2131893532, 2131895077);
            C819040l r43 = new C819040l(this.A09, this, this.A0B, r8, userJid2, num, C18070vi.A0M(userJid));
            AnonymousClass12M r5 = this.A0C;
            AnonymousClass00H r12 = r5.A07;
            AnonymousClass1EC r6 = r43.A03;
            boolean A033 = ((AnonymousClass1PU) r12.get()).A03(r6);
            List list = r43.A05;
            C17960vV.A07(list);
            if (r43.A00) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("GroupIqResponseUtil/remove-admin/timeout; groupId=");
                A10.append(r6);
                C17900vP.A0X(list, "; participants=", A10);
                r7 = null;
            } else {
                r7 = new C97564pg(r43, r5, 1, ((AnonymousClass1PU) r12.get()).A03(r6));
            }
            AnonymousClass12M.A04(r5, r6, r7, "demote", list, 92, A033);
        }
    }

    public AnonymousClass4VH(AnonymousClass1L9 r12, AnonymousClass1FU r13, AnonymousClass1KB r14, AnonymousClass11S r15, AnonymousClass4QS r16, AnonymousClass11E r17, AnonymousClass1M9 r18, C24921Me r19, AnonymousClass1NN r20, AnonymousClass1MZ r21, AnonymousClass126 r22, AnonymousClass12M r23, AnonymousClass1LU r24, AnonymousClass1EC r25, AnonymousClass1PU r26) {
        AnonymousClass1PU r1 = r26;
        AnonymousClass1LU r3 = r24;
        C18070vi.A0w(r15, r14, r3, r12, r1);
        AnonymousClass12M r4 = r23;
        AnonymousClass126 r5 = r22;
        AnonymousClass1MZ r6 = r21;
        AnonymousClass1NN r7 = r20;
        AnonymousClass1M9 r9 = r18;
        C18070vi.A0x(r5, r4, r7, r6, r9);
        C24921Me r8 = r19;
        AnonymousClass11E r10 = r17;
        C72473Md.A1L(r8, r10);
        AnonymousClass1EC r2 = r25;
        C18070vi.A0d(r2, 14);
        this.A05 = r15;
        this.A02 = r14;
        this.A0D = r3;
        this.A00 = r12;
        this.A0E = r1;
        this.A0B = r5;
        this.A0C = r4;
        this.A09 = r7;
        this.A0A = r6;
        this.A07 = r9;
        this.A08 = r8;
        this.A06 = r10;
        this.A01 = r13;
        this.A04 = r2;
        this.A03 = r16;
    }

    public final boolean A02() {
        if (this.A06.A09()) {
            return false;
        }
        this.A02.A08(C72473Md.A03(this.A01.getApplicationContext()), 0);
        return true;
    }
}
