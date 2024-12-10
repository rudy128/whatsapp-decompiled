package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OX;
import X.AnonymousClass1OY;
import X.AnonymousClass4I4;
import X.AnonymousClass4PR;
import X.AnonymousClass4Z7;
import X.AnonymousClass5WK;
import X.AnonymousClass6HC;
import X.AnonymousClass6HD;
import X.C108475bl;
import X.C108945cZ;
import X.C108955ca;
import X.C108985cd;
import X.C108995ce;
import X.C133436ok;
import X.C136936ue;
import X.C147027Rn;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C217517g;
import X.C23421Fz;
import X.C30391dr;
import X.C99654tF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class StickerPackFlow {
    public AnonymousClass6HC A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final C18600wl A0B;
    public final AnonymousClass1OX A0C;
    public final AnonymousClass1OX A0D;
    public final C23421Fz A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G = C217517g.A00(32801);
    public final AnonymousClass00H A0H;
    public final C18600wl A0I;

    public static final void A00(AnonymousClass6HC r5, StickerPackFlow stickerPackFlow, C108475bl r7) {
        String str;
        AnonymousClass5WK r1;
        Throwable th;
        List list = r5.A00;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (!((C133436ok) next).A00().A0S) {
                A13.add(next);
            }
        }
        HashSet A12 = C17880vN.A12();
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next2 : A13) {
            C108985cd.A1E(((C133436ok) next2).A01(), next2, A12, A132);
        }
        List A002 = C147027Rn.A00(A132, 43);
        C18070vi.A0d(A002, 0);
        AnonymousClass6HC r0 = new AnonymousClass6HC(A002);
        stickerPackFlow.A00 = r0;
        Object CQ0 = r7.CQ0(r0);
        if (CQ0 instanceof AnonymousClass4PR) {
            C136936ue A0p = C108945cZ.A0p(stickerPackFlow.A02);
            if (!(CQ0 instanceof AnonymousClass5WK) || (r1 = (AnonymousClass5WK) CQ0) == null || (th = r1.A00) == null || (str = th.getMessage()) == null) {
                str = "no exception message";
            }
            A0p.A02(2, "sticker_flow_send_fail", str);
        }
    }

    public static final void A01(AnonymousClass6HC r1, StickerPackFlow stickerPackFlow, C108475bl r3) {
        String str;
        AnonymousClass5WK r12;
        Throwable th;
        List list = r1.A00;
        C18070vi.A0d(list, 0);
        AnonymousClass6HC r0 = new AnonymousClass6HC(list);
        stickerPackFlow.A00 = r0;
        Object CQ0 = r3.CQ0(r0);
        if (CQ0 instanceof AnonymousClass4PR) {
            C136936ue A0p = C108945cZ.A0p(stickerPackFlow.A02);
            if (!(CQ0 instanceof AnonymousClass5WK) || (r12 = (AnonymousClass5WK) CQ0) == null || (th = r12.A00) == null || (str = th.getMessage()) == null) {
                str = "no exception message";
            }
            A0p.A02(2, "sticker_flow_send_fail", str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass725 r15, X.C30391dr r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C147857Ut
            if (r0 == 0) goto L_0x00a6
            r5 = r3
            X.7Ut r5 = (X.C147857Ut) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a6
            int r2 = r2 - r1
            r5.label = r2
        L_0x0014:
            java.lang.Object r9 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x007c
            if (r0 != r3) goto L_0x0126
            java.lang.Object r6 = r5.L$2
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r15 = r5.L$1
            X.725 r15 = (X.AnonymousClass725) r15
            java.lang.Object r8 = r5.L$0
            com.whatsapp.stickers.flow.StickerPackFlow r8 = (com.whatsapp.stickers.flow.StickerPackFlow) r8
            X.C30691eM.A01(r9)
        L_0x002f:
            java.util.List r9 = (java.util.List) r9
            java.util.HashSet r10 = X.C17880vN.A12()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r9.iterator()
        L_0x003d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r5 = r13.next()
            r12 = r5
            X.77d r12 = (X.C1418377d) r12
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = r12.A0H
            r11.append(r0)
            r4 = 45
            r11.append(r4)
            X.73B r1 = r12.A04
            if (r1 == 0) goto L_0x007a
            java.lang.String r0 = r1.A00
        L_0x005e:
            r11.append(r0)
            r11.append(r4)
            if (r1 == 0) goto L_0x0078
            java.lang.String r0 = r1.A02
        L_0x0068:
            r11.append(r0)
            r11.append(r4)
            java.lang.String r0 = r12.A0F
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r11)
            X.C108985cd.A1E(r0, r5, r10, r7)
            goto L_0x003d
        L_0x0078:
            r0 = r2
            goto L_0x0068
        L_0x007a:
            r0 = r2
            goto L_0x005e
        L_0x007c:
            X.C30691eM.A01(r9)
            X.00H r0 = r14.A0G
            java.lang.Object r0 = r0.get()
            X.167 r0 = (X.AnonymousClass167) r0
            java.util.Map r0 = r0.A01
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r0)
            X.0wl r1 = r14.A0B
            com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$fetchStickerPack$stickers$1
            r0.<init>(r15, r14, r2)
            r5.L$0 = r14
            r5.L$1 = r15
            r5.L$2 = r6
            r5.label = r3
            java.lang.Object r9 = X.C30451dy.A00(r5, r1, r0)
            if (r9 != r4) goto L_0x00a4
            return r4
        L_0x00a4:
            r8 = r14
            goto L_0x002f
        L_0x00a6:
            X.7Ut r5 = new X.7Ut
            r5.<init>(r14, r3)
            goto L_0x0014
        L_0x00ad:
            r15.A07 = r7
            X.00H r0 = r8.A0H
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.6xv r2 = (X.C138926xv) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r5 = r15.A0H
            r1.append(r5)
            java.lang.String r0 = ".png"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4 = 0
            X.C18070vi.A0d(r0, r4)
            java.io.File r7 = X.C138926xv.A00(r2, r0)
            if (r7 == 0) goto L_0x0104
            boolean r0 = r9.isEmpty()
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0104
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x0104
            java.lang.Object r3 = r9.get(r4)
            X.77d r3 = (X.C1418377d) r3
            java.lang.String r1 = r3.A0B
            if (r1 == 0) goto L_0x0104
            X.00H r0 = r8.A0F
            java.lang.Object r2 = r0.get()
            X.6xt r2 = (X.C138906xt) r2
            java.io.File r1 = X.C108945cZ.A17(r1)
            java.lang.String r0 = r3.A0E
            X.6uF r0 = r2.A01(r1, r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.Bitmap r0 = r0.A00()
            if (r0 == 0) goto L_0x0104
            X.C64062u9.A0B(r0, r7)
        L_0x0104:
            boolean r0 = r6.containsKey(r5)
            if (r0 == 0) goto L_0x011d
            X.C18070vi.A0X(r5)
            java.lang.Number r0 = X.C108945cZ.A1E(r5, r6)
            if (r0 == 0) goto L_0x0117
            int r4 = r0.intValue()
        L_0x0117:
            X.6HH r0 = new X.6HH
            r0.<init>(r15, r5, r4)
            return r0
        L_0x011d:
            X.C18070vi.A0X(r5)
            X.6HF r0 = new X.6HF
            r0.<init>(r15, r5)
            return r0
        L_0x0126:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow.A02(X.725, X.1dr):java.lang.Object");
    }

    public StickerPackFlow(C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, C18600wl r18, C18600wl r19, AnonymousClass1OX r20) {
        C18070vi.A0w(r6, r7, r8, r9, r10);
        C18070vi.A0x(r11, r12, r13, r14, r15);
        AnonymousClass00H r4 = r16;
        AnonymousClass00H r3 = r17;
        C18600wl r1 = r18;
        C18600wl r2 = r19;
        AnonymousClass1OX r0 = r20;
        C18070vi.A0y(r0, r1, r4, r3, r2);
        this.A01 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A06 = r11;
        this.A03 = r12;
        this.A0F = r13;
        this.A0H = r14;
        this.A0A = r15;
        this.A0C = r0;
        this.A0I = r1;
        this.A08 = r4;
        this.A09 = r3;
        this.A0B = r2;
        AnonymousClass1OY A0g = C108995ce.A0g(r1);
        this.A0D = A0g;
        this.A00 = new AnonymousClass6HC(C18460wS.A00);
        this.A0E = C108955ca.A0I(new StickerPackFlow$packFlow$2(this, (C30391dr) null), AnonymousClass4Z7.A01(AnonymousClass6HD.A00, A0g, AnonymousClass4I4.A00(new StickerPackFlow$packFlow$1(this, (C30391dr) null)), C99654tF.A00()));
    }
}
