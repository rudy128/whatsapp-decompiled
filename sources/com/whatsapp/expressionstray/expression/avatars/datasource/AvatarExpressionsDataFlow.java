package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass1G0;
import X.AnonymousClass1G1;
import X.AnonymousClass1OX;
import X.AnonymousClass1ZT;
import X.AnonymousClass2ZO;
import X.AnonymousClass3MZ;
import X.AnonymousClass4Z6;
import X.AnonymousClass4Z7;
import X.AnonymousClass57J;
import X.AnonymousClass5WQ;
import X.AnonymousClass612;
import X.AnonymousClass6UU;
import X.AnonymousClass6UV;
import X.AnonymousClass732;
import X.AnonymousClass84G;
import X.C108995ce;
import X.C117365zf;
import X.C1177160r;
import X.C1177360t;
import X.C120356Dj;
import X.C120366Dk;
import X.C120376Dl;
import X.C120386Dm;
import X.C120396Dn;
import X.C120416Dp;
import X.C130336jG;
import X.C130746jw;
import X.C131016kN;
import X.C136936ue;
import X.C138666xU;
import X.C138986y1;
import X.C1406972p;
import X.C147197Se;
import X.C147207Sf;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C23421Fz;
import X.C25291Nq;
import X.C26092CsA;
import X.C27011Uj;
import X.C27354DcQ;
import X.C28243Du4;
import X.C29351c6;
import X.C30391dr;
import X.C34081jt;
import X.C37391pS;
import X.C72473Md;
import X.C99464sr;
import X.C99654tF;
import com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1;
import com.whatsapp.expressionstray.expression.avatars.social.SocialStickersDataFlow$observeSocialStickers$1;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickerCategory;
import com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class AvatarExpressionsDataFlow {
    public List A00;
    public final C18030ve A01;
    public final C130746jw A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final List A05;
    public final List A06;
    public final C18600wl A07;
    public final C18600wl A08;
    public final C23421Fz A09;
    public final C23421Fz A0A;
    public final C23421Fz A0B;
    public final AnonymousClass2ZO A0C;
    public final AvatarSquidConfiguration A0D;
    public final C131016kN A0E;
    public final C138666xU A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);
    public final AnonymousClass1OX A0J;
    public final AnonymousClass1G1 A0K;

    public AvatarExpressionsDataFlow(AnonymousClass2ZO r13, C18030ve r14, AvatarSquidConfiguration avatarSquidConfiguration, C130746jw r16, C131016kN r17, C138666xU r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21, AnonymousClass00H r22, C18600wl r23, C18600wl r24) {
        C18070vi.A0d(r14, 1);
        C131016kN r8 = r17;
        C138666xU r7 = r18;
        AnonymousClass00H r6 = r19;
        C18070vi.A0p(r6, r8, r7);
        C130746jw r9 = r16;
        C18070vi.A0d(r9, 5);
        AnonymousClass00H r10 = r20;
        AnonymousClass00H r5 = r21;
        C18070vi.A0q(r10, avatarSquidConfiguration, r5);
        AnonymousClass00H r3 = r22;
        C18070vi.A0d(r3, 9);
        C18070vi.A0d(r13, 10);
        C18600wl r1 = r23;
        C18600wl r0 = r24;
        C72473Md.A1L(r1, r0);
        this.A01 = r14;
        this.A04 = r6;
        this.A0E = r8;
        this.A0F = r7;
        this.A02 = r9;
        this.A0H = r10;
        this.A0D = avatarSquidConfiguration;
        this.A03 = r5;
        this.A0G = r3;
        this.A0C = r13;
        this.A08 = r1;
        this.A07 = r0;
        this.A0J = C108995ce.A0g(r0);
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        A012.add(C120376Dl.A00);
        A012.add(C120386Dm.A00);
        A012.add(C120416Dp.A00);
        A012.add(C120366Dk.A00);
        A012.add(C120396Dn.A00);
        A012.add(C120356Dj.A00);
        C27354DcQ A022 = AnonymousClass1ZT.A02(A012);
        this.A00 = A022;
        ArrayList A0E2 = C29351c6.A0E(A022);
        Iterator it = A022.iterator();
        while (it.hasNext()) {
            AnonymousClass6UV r92 = (AnonymousClass6UV) it.next();
            AnonymousClass612 r82 = new AnonymousClass612(r92, r92.toString());
            C27354DcQ A013 = AnonymousClass1ZT.A01();
            A013.add(new C1177360t((AnonymousClass6UU) r82, (Integer) null, ((C1406972p) this.A04.get()).A03(r92), 10));
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("loading-");
            A10.append(r92);
            C1177160r.A00(r82, AnonymousClass000.A0y("-1", A10), A013);
            StringBuilder A11 = AnonymousClass000.A11("loading-");
            A11.append(r92);
            C1177160r.A00(r82, AnonymousClass000.A0y("-2", A11), A013);
            StringBuilder A112 = AnonymousClass000.A11("loading-");
            A112.append(r92);
            C1177160r.A00(r82, AnonymousClass000.A0y("-3", A112), A013);
            StringBuilder A113 = AnonymousClass000.A11("loading-");
            A113.append(r92);
            C1177160r.A00(r82, AnonymousClass000.A0y("-4", A113), A013);
            if (C25291Nq.A04(this.A01, 9860)) {
                StringBuilder A114 = AnonymousClass000.A11("loading-");
                A114.append(r92);
                C1177160r.A00(r82, AnonymousClass000.A0y("-5", A114), A013);
            }
            A0E2.add(AnonymousClass1ZT.A02(A013));
        }
        this.A06 = C29351c6.A0F(A0E2);
        List<AnonymousClass6UV> list = this.A00;
        ArrayList A0E3 = C29351c6.A0E(list);
        for (AnonymousClass6UV avatarOnDemandStickerCategory : list) {
            C37391pS r12 = this.A0C.A00;
            A0E3.add(new AvatarOnDemandStickerCategory(avatarOnDemandStickerCategory, (AvatarOnDemandStickers) r12.A01.A02.get(), (C136936ue) r12.A00.A0V.get(), C27011Uj.A00()));
        }
        this.A05 = A0E3;
        C28243Du4 du4 = new C28243Du4(new AvatarExpressionsDataFlow$all$1(this, (C30391dr) null));
        AvatarExpressionsDataFlow$all$2 avatarExpressionsDataFlow$all$2 = new AvatarExpressionsDataFlow$all$2(this, (C30391dr) null);
        AnonymousClass4Z6 r02 = AnonymousClass4Z6.$redex_init_class;
        this.A09 = AnonymousClass3MZ.A0L(new AvatarExpressionsDataFlow$all$3(this, (C30391dr) null), new C147197Se(new C147207Sf(avatarExpressionsDataFlow$all$2, du4, 15), 6));
        this.A0A = A00(false);
        this.A0B = A00(true);
        C147207Sf r32 = new C147207Sf(this, this.A02.A07, 9);
        this.A0K = AnonymousClass4Z7.A01(C18460wS.A00, this.A0J, r32, C99654tF.A00());
    }

    private final C34081jt A00(boolean z) {
        Object r7;
        C23421Fz r5;
        String str;
        Object obj;
        if (C138986y1.A00(this.A0G)) {
            C130336jG r6 = (C130336jG) this.A0H.get();
            AnonymousClass732 A002 = r6.A05.A00();
            if (A002 == null || (obj = A002.A04.A00) == null) {
                str = null;
            } else {
                str = obj.toString();
            }
            AnonymousClass5WQ A003 = AnonymousClass4Z6.A00(new SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(r6, str, (C30391dr) null), C26092CsA.A02(r6.A00.A00));
            C23421Fz A012 = C26092CsA.A01(AnonymousClass84G.A00, r6.A06.A07);
            SocialStickersDataFlow$observeSocialStickers$1 socialStickersDataFlow$observeSocialStickers$1 = new SocialStickersDataFlow$observeSocialStickers$1(r6, (C30391dr) null);
            C23421Fz[] r1 = new C23421Fz[2];
            AnonymousClass001.A1Q(A003, A012, r1);
            r7 = new C28243Du4(new AnonymousClass57J((C30391dr) null, socialStickersDataFlow$observeSocialStickers$1, r1));
        } else {
            r7 = new C147197Se(C117365zf.A00, 5);
        }
        AnonymousClass1G0 r62 = this.A02.A07;
        C131016kN r0 = this.A0E;
        if (z) {
            r5 = r0.A05;
        } else {
            r5 = r0.A06;
        }
        C23421Fz r4 = this.A0F.A05;
        C23421Fz r3 = this.A09;
        AvatarExpressionsDataFlow$createStickersFlow$1 avatarExpressionsDataFlow$createStickersFlow$1 = new AvatarExpressionsDataFlow$createStickersFlow$1(this, (C30391dr) null);
        C23421Fz[] r12 = new C23421Fz[5];
        C17900vP.A0O(r7, r62, r5, r4, r12);
        r12[4] = r3;
        return AnonymousClass4Z7.A01(C18460wS.A00, this.A0J, new C99464sr(avatarExpressionsDataFlow$createStickersFlow$1, r12, 10), new C99654tF(10000));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C147577Tr
            if (r0 == 0) goto L_0x004f
            r5 = r7
            X.7Tr r5 = (X.C147577Tr) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004f
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002e
            if (r0 != r2) goto L_0x0055
            java.lang.Object r0 = r5.L$0
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = (com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow) r0
            X.C30691eM.A01(r4)
        L_0x0024:
            boolean r1 = X.AnonymousClass000.A1Y(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0I
            r0.set(r1)
            return r4
        L_0x002e:
            X.C30691eM.A01(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0I
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x003e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L_0x003e:
            com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration r1 = r6.A0D
            X.6RS r0 = X.AnonymousClass6RS.STICKER_TRAY
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r4 = r1.A01(r0, r5)
            if (r4 != r3) goto L_0x004d
            return r3
        L_0x004d:
            r0 = r6
            goto L_0x0024
        L_0x004f:
            X.7Tr r5 = new X.7Tr
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0055:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow.A01(X.1dr):java.lang.Object");
    }
}
