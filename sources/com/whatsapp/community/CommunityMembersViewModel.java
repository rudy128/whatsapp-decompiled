package com.whatsapp.community;

import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass11S;
import X.AnonymousClass1D7;
import X.AnonymousClass1DS;
import X.AnonymousClass1EC;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1G7;
import X.AnonymousClass1J2;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OZ;
import X.AnonymousClass3L6;
import X.AnonymousClass3MW;
import X.AnonymousClass4IV;
import X.AnonymousClass4L2;
import X.AnonymousClass4TF;
import X.AnonymousClass4Z7;
import X.AnonymousClass4ZC;
import X.AnonymousClass9F6;
import X.AnonymousClass9HH;
import X.C100995An;
import X.C106055Uj;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C24671Lf;
import X.C24921Me;
import X.C25191Ng;
import X.C27141Uw;
import X.C29621ca;
import X.C32101gd;
import X.C34071js;
import X.C34081jt;
import X.C41561wd;
import X.C59932n7;
import X.C72473Md;
import X.C77113pO;
import X.C77123pP;
import X.C87324Vd;
import X.C91914gS;
import X.C94174kA;
import X.C96294nc;
import X.C96314ne;
import X.C98464rC;
import X.C98804rk;
import X.C98894rt;
import X.C99464sr;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class CommunityMembersViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DS A02;
    public final AnonymousClass1DS A03;
    public final C94174kA A04 = new C94174kA(this, 2);
    public final C96314ne A05 = new C96314ne(this, 7);
    public final C59932n7 A06;
    public final AnonymousClass11S A07;
    public final C32101gd A08;
    public final C91914gS A09 = new C91914gS(this);
    public final AnonymousClass11E A0A;
    public final AnonymousClass1M9 A0B;
    public final C24671Lf A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass3L6 A0E = new C96294nc(this, 2);
    public final C27141Uw A0F;
    public final C98894rt A0G;
    public final C25191Ng A0H;
    public final AnonymousClass1EC A0I;
    public final C18600wl A0J;
    public final AnonymousClass1G4 A0K;
    public final AnonymousClass1G4 A0L;
    public final AnonymousClass1G4 A0M;
    public final AnonymousClass1G4 A0N;
    public final AnonymousClass1G1 A0O;
    public final AnonymousClass1G1 A0P;
    public final AnonymousClass1G1 A0Q;
    public final AnonymousClass4L2 A0R;
    public final C24921Me A0S;
    public final AnonymousClass1G1 A0T;

    public final void A0T(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        C32101gd r3 = this.A08;
        AnonymousClass1EC r2 = this.A0I;
        CommunityMembersDirectory communityMembersDirectory = (CommunityMembersDirectory) r3;
        communityMembersDirectory.A07.A02(r2, arrayList, true);
        C98804rk.A00(communityMembersDirectory.A00, communityMembersDirectory, r2, 7);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047 A[LOOP:0: B:10:0x0041->B:12:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.community.CommunityMembersViewModel r8, X.C30391dr r9, X.AnonymousClass1JQ r10, boolean r11) {
        /*
            boolean r0 = r9 instanceof X.C100784v4
            if (r0 == 0) goto L_0x0083
            r5 = r9
            X.4v4 r5 = (X.C100784v4) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r6 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r3) goto L_0x0089
            boolean r11 = r5.Z$0
            java.lang.Object r2 = r5.L$1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r8 = r5.L$0
            com.whatsapp.community.CommunityMembersViewModel r8 = (com.whatsapp.community.CommunityMembersViewModel) r8
            X.C30691eM.A01(r6)
        L_0x002a:
            java.util.Map r6 = (java.util.Map) r6
            X.4so r1 = X.C29431cG.A0V(r2)
            X.5VJ r0 = new X.5VJ
            r0.<init>(r8, r6, r11)
            X.7Sa r0 = X.AnonymousClass1b2.A0A(r0, r1)
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.4SF r0 = (X.AnonymousClass4SF) r0
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            r7.put(r0, r1)
            goto L_0x0041
        L_0x0054:
            X.C30691eM.A01(r6)
            X.5Vo r0 = X.C106365Vo.A00
            X.7Sa r1 = X.AnonymousClass1b2.A0A(r0, r10)
            X.5RE r0 = new X.5RE
            r0.<init>(r8)
            X.7Sa r0 = X.AnonymousClass1b2.A0A(r0, r1)
            java.util.List r2 = X.AnonymousClass1b2.A06(r0)
            boolean r0 = X.AnonymousClass000.A1a(r2)
            if (r0 == 0) goto L_0x00b2
            X.1gd r1 = r8.A08
            X.1EC r0 = r8.A0I
            r5.L$0 = r8
            r5.L$1 = r2
            r5.Z$0 = r11
            r5.label = r3
            java.lang.Object r6 = r1.BOz(r0, r5)
            if (r6 != r4) goto L_0x002a
            return r4
        L_0x0083:
            X.4v4 r5 = new X.4v4
            r5.<init>(r8, r9)
            goto L_0x0012
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x008e:
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A09(r4, r7)
            boolean r0 = r6.BFK(r5, r0)
            if (r0 == 0) goto L_0x00b7
            X.11S r0 = r8.A07
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r2 = r7.get(r0)
            if (r2 == 0) goto L_0x00b2
            X.1G4 r1 = r8.A0M
        L_0x00a8:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.BFK(r0, r2)
            if (r0 == 0) goto L_0x00a8
        L_0x00b2:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00b5:
            X.1G4 r6 = r8.A0K
        L_0x00b7:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            java.util.Iterator r3 = X.AnonymousClass000.A15(r0)
        L_0x00c6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008e
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r0 = r7.get(r0)
            if (r0 != 0) goto L_0x00c6
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersViewModel.A00(com.whatsapp.community.CommunityMembersViewModel, X.1dr, X.1JQ, boolean):java.lang.Object");
    }

    public static final void A03(CommunityMembersViewModel communityMembersViewModel, UserJid userJid) {
        AnonymousClass1G4 r2 = communityMembersViewModel.A0N;
        do {
        } while (!r2.BFK(r2.getValue(), C77123pP.A00));
        AnonymousClass4L2 r3 = communityMembersViewModel.A0R;
        AnonymousClass1EC r22 = communityMembersViewModel.A0I;
        C106055Uj r5 = new C106055Uj(communityMembersViewModel, userJid);
        AnonymousClass00H r1 = r3.A00;
        String A0T2 = C17890vO.A0T(r1);
        C98464rC r4 = new C98464rC(r22, A0T2, C18070vi.A0M(userJid));
        AnonymousClass1OZ r9 = (AnonymousClass1OZ) C18070vi.A0E(r1);
        C100995An r6 = new C100995An(r3, 3);
        C100995An r7 = new C100995An(r3, 4);
        C18070vi.A0d(r9, 0);
        r9.A0I(new AnonymousClass9HH(r4, r5, r6, r7, 1), (C29621ca) ((AnonymousClass9F6) r4.A03.getValue()).A00, A0T2, 347, 32000);
    }

    public void A0S() {
        C59932n7 r2 = this.A06;
        C91914gS r1 = this.A09;
        C18070vi.A0d(r1, 0);
        C17880vN.A0V(r2.A06).unregisterObserver(r1);
        this.A0C.unregisterObserver(this.A04);
        this.A0H.unregisterObserver(this.A05);
        this.A0F.A01(this.A0E);
    }

    public CommunityMembersViewModel(C59932n7 r7, AnonymousClass11S r8, C32101gd r9, AnonymousClass4L2 r10, AnonymousClass11E r11, AnonymousClass1M9 r12, C24671Lf r13, C24921Me r14, AnonymousClass1MZ r15, C27141Uw r16, C25191Ng r17, AnonymousClass1EC r18, C18600wl r19) {
        C18070vi.A0w(r7, r8, r14, r12, r13);
        C27141Uw r2 = r16;
        C18600wl r0 = r19;
        C18070vi.A0x(r9, r2, r15, r0, r11);
        C25191Ng r1 = r17;
        C72473Md.A1L(r1, r10);
        this.A06 = r7;
        this.A07 = r8;
        this.A0S = r14;
        this.A0B = r12;
        this.A0C = r13;
        this.A08 = r9;
        this.A0F = r2;
        this.A0D = r15;
        this.A0J = r0;
        this.A0A = r11;
        this.A0H = r1;
        this.A0R = r10;
        AnonymousClass1EC r110 = r18;
        this.A0I = r110;
        this.A0G = new C98894rt(r8, r14);
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4TF(r15.A0K(r110) ^ true ? 1 : 0, (Integer) null));
        this.A0L = A18;
        C34081jt r02 = new C34081jt((AnonymousClass1OB) null, A18);
        this.A0P = r02;
        AnonymousClass1OR r4 = AnonymousClass1OR.A00;
        this.A01 = C87324Vd.A00(r4, r02);
        AnonymousClass1G7 A002 = C34071js.A00(AnonymousClass1D7.A0I());
        this.A0K = A002;
        C99464sr r3 = new C99464sr(this, A002, 6);
        C34081jt A012 = AnonymousClass4Z7.A01(C18460wS.A00, C41561wd.A00(this), r3, AnonymousClass4ZC.A00);
        this.A0O = A012;
        this.A00 = C87324Vd.A00(r4, A012);
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(AnonymousClass4IV.A01);
        this.A0M = A182;
        C34081jt r03 = new C34081jt((AnonymousClass1OB) null, A182);
        this.A0Q = r03;
        this.A02 = C87324Vd.A00(r4, r03);
        AnonymousClass1G7 A003 = C34071js.A00(C77113pO.A00);
        this.A0N = A003;
        C34081jt r04 = new C34081jt((AnonymousClass1OB) null, A003);
        this.A0T = r04;
        this.A03 = C87324Vd.A00(r4, r04);
    }
}
