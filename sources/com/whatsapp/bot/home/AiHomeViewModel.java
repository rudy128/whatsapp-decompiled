package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass18K;
import X.AnonymousClass1DT;
import X.AnonymousClass1G3;
import X.AnonymousClass1J2;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass71I;
import X.AnonymousClass7AT;
import X.AnonymousClass8B7;
import X.C108945cZ;
import X.C108985cd;
import X.C128286fk;
import X.C137196v4;
import X.C1401970i;
import X.C143307Cw;
import X.C157707xw;
import X.C157717xx;
import X.C18070vi;
import X.C18600wl;
import X.C22801Dg;
import X.C24771Lp;
import X.C25691Pg;
import X.C30391dr;
import X.C30451dy;
import X.C41111vp;
import X.C41561wd;
import X.C47192Hl;
import X.C50542Uv;
import X.C62922sD;
import java.util.List;

public final class AiHomeViewModel extends AnonymousClass1J2 {
    public final C22801Dg A00;
    public final AnonymousClass1DT A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M(new Object());
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final AnonymousClass1DT A06;
    public final AnonymousClass1DT A07;
    public final AiHomeFetchService A08;
    public final AnonymousClass71I A09;
    public final C128286fk A0A;
    public final C41111vp A0B = AnonymousClass3MW.A0n(false);
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final List A0E;
    public final AnonymousClass1G3 A0F;
    public final AnonymousClass00H A0G;
    public final C18600wl A0H;

    public AiHomeViewModel(AiHomeFetchService aiHomeFetchService, AnonymousClass71I r8, C128286fk r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, C18600wl r13) {
        C18070vi.A0d(r10, 1);
        C108985cd.A1D(aiHomeFetchService, r11);
        C18070vi.A0l(r12, r13);
        this.A0D = r10;
        this.A0A = r9;
        this.A08 = aiHomeFetchService;
        this.A0G = r11;
        this.A09 = r8;
        this.A0C = r12;
        this.A0H = r13;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        this.A01 = A0S;
        this.A07 = AnonymousClass3MW.A0M((Object) null);
        AnonymousClass1DT A0S2 = C108945cZ.A0S();
        this.A06 = A0S2;
        this.A02 = C108945cZ.A0S();
        this.A03 = C108945cZ.A0S();
        this.A0F = C62922sD.A01(C25691Pg.DROP_LATEST, 0, 1);
        C22801Dg A0R = C108945cZ.A0R();
        A0R.A0F(false);
        AnonymousClass7AT.A02(A0S, A0R, new C157707xw(this), 9);
        AnonymousClass7AT.A02(A0S2, A0R, new C157717xx(this), 9);
        this.A00 = A0R;
        this.A0E = AnonymousClass000.A13();
        AnonymousClass1OX A002 = C41561wd.A00(this);
        AiHomeViewModel$monitorFlowEvents$1 aiHomeViewModel$monitorFlowEvents$1 = new AiHomeViewModel$monitorFlowEvents$1(this, (C30391dr) null);
        AnonymousClass1OR r3 = AnonymousClass1OR.A00;
        Integer num = AnonymousClass00R.A00;
        C30451dy.A02(num, r3, aiHomeViewModel$monitorFlowEvents$1, A002);
        C30451dy.A02(num, r3, new AiHomeViewModel$monitorFlowEvents$2(this, (C30391dr) null), C41561wd.A00(this));
    }

    public void A0S() {
        ((C24771Lp) this.A0G.get()).A01().A02.A07(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r1 == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T(int r9) {
        /*
            r8 = this;
            X.6fk r2 = r8.A0A
            X.1DT r0 = r8.A02
            java.lang.Object r6 = r0.A06()
            X.7Cw r6 = (X.C143307Cw) r6
            X.1DT r0 = r8.A05
            java.lang.Object r0 = r0.A06()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7 = 0
            if (r0 == 0) goto L_0x001c
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r1 = r0 ^ 1
            X.1DT r0 = r8.A06
            java.lang.Object r0 = r0.A06()
            if (r0 == 0) goto L_0x0028
            r7 = 1
        L_0x0028:
            X.18K r5 = r2.A02
            X.2Hl r4 = new X.2Hl
            r4.<init>()
            X.C108945cZ.A1M(r4, r9)
            java.lang.Integer r0 = r2.A00
            r4.A05 = r0
            r3 = 0
            r2 = 1
            java.lang.String r0 = X.C50542Uv.A00()
            r4.A0E = r0
            if (r1 == 0) goto L_0x0073
            r0 = 2
        L_0x0041:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A04 = r0
            if (r6 == 0) goto L_0x0071
            com.whatsapp.infra.graphql.generated.aihome.AiHomeBot r1 = r6.A00
            if (r1 == 0) goto L_0x0057
            X.A8k r1 = (X.C20125A8k) r1
            java.lang.String r0 = "is_meta_created"
            boolean r0 = r1.A0G(r0)
            if (r0 != 0) goto L_0x0071
        L_0x0057:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A01 = r0
            if (r6 == 0) goto L_0x006f
            java.lang.String r0 = r6.A02
        L_0x0061:
            r4.A0A = r0
            if (r6 == 0) goto L_0x0069
            java.lang.Boolean r3 = X.AnonymousClass000.A0h()
        L_0x0069:
            r4.A00 = r3
            r5.CC7(r4)
            return
        L_0x006f:
            r0 = r3
            goto L_0x0061
        L_0x0071:
            r2 = 0
            goto L_0x0057
        L_0x0073:
            r0 = 1
            if (r7 == 0) goto L_0x0041
            r0 = 3
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.AiHomeViewModel.A0T(int):void");
    }

    public final void A0U(AnonymousClass8B7 r5) {
        if (r5 instanceof C143307Cw) {
            C128286fk r1 = this.A0A;
            String A012 = C1401970i.A01((C143307Cw) r5);
            AnonymousClass18K r2 = r1.A02;
            C47192Hl r12 = new C47192Hl();
            C108945cZ.A1M(r12, 31);
            r12.A0C = A012;
            r12.A06 = 36;
            r12.A0E = C50542Uv.A00();
            r2.CC7(r12);
            C137196v4.A01(this.A07, r5);
            AnonymousClass3MW.A1X(this.A0H, new AiHomeViewModel$onContactSelected$1(r5, this, (C30391dr) null), C41561wd.A00(this));
        }
    }
}
