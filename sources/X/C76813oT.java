package X;

import android.content.Intent;

/* renamed from: X.3oT  reason: invalid class name and case insensitive filesystem */
public final class C76813oT extends AnonymousClass3Ua {
    public AnonymousClass49H A00;
    public C45892Cb A01;
    public AnonymousClass1E7 A02;
    public final Intent A03;
    public final AnonymousClass1DS A04;
    public final AnonymousClass1DS A05;
    public final AnonymousClass1DS A06;
    public final AnonymousClass1DS A07;
    public final AnonymousClass1DS A08;
    public final AnonymousClass1DS A09;
    public final AnonymousClass1DS A0A;
    public final AnonymousClass1DS A0B;
    public final AnonymousClass1DS A0C;
    public final AnonymousClass1DS A0D;
    public final AnonymousClass1DS A0E;
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1DT A0H;
    public final AnonymousClass1DT A0I;
    public final AnonymousClass1DT A0J;
    public final AnonymousClass1DT A0K;
    public final C84214Ip A0L;
    public final C84224Iq A0M;
    public final C56342hJ A0N;
    public final AnonymousClass11S A0O;
    public final C25491Ok A0P;
    public final C58522kp A0Q;
    public final C18030ve A0R;
    public final AnonymousClass1MB A0S;
    public final C85144Mg A0T;
    public final AnonymousClass4SJ A0U;
    public final C37701pz A0V;
    public final C36421nr A0W;
    public final C41731wy A0X;
    public final C41731wy A0Y;
    public final C41731wy A0Z;
    public final C41731wy A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final C18600wl A0e;
    public final C18600wl A0f;
    public final AnonymousClass1DT A0g;
    public final AnonymousClass72R A0h;
    public final C24921Me A0i;
    public final C25181Nf A0j;
    public final C42221xp A0k;
    public final AnonymousClass12L A0l;
    public final boolean A0m;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (X.C43381zi.A01(r15.A0R, r5) != false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V() {
        /*
            r33 = this;
            java.lang.String r0 = "contactinfo/update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r15 = r33
            X.1E7 r0 = r15.A02
            boolean r5 = r0.A0C()
            X.1Nf r3 = r15.A0j
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            android.content.Intent r1 = r15.A03
            java.lang.String r0 = "jid"
            java.lang.String r0 = r1.getStringExtra(r0)
            com.whatsapp.jid.UserJid r0 = r2.A04(r0)
            X.C17960vV.A07(r0)
            X.1E7 r0 = r3.A01(r0)
            X.C17960vV.A07(r0)
            r15.A02 = r0
            boolean r0 = r0.A0C()
            r4 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            if (r0 == r5) goto L_0x003f
            java.lang.String r0 = "contactinfo/isBusinessAccount changed, recreating activity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wy r0 = r15.A0Z
            r0.A0F(r2)
        L_0x003e:
            return
        L_0x003f:
            X.1E7 r1 = r15.A02
            X.2lf r0 = r1.A0H
            r3 = 0
            if (r0 == 0) goto L_0x004e
            X.1Me r0 = r15.A0i
            boolean r0 = r0.A0i(r1)
            if (r0 == 0) goto L_0x01c6
        L_0x004e:
            X.1E7 r0 = r15.A02
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x01c6
        L_0x0056:
            r14 = 0
            if (r4 == 0) goto L_0x01b1
            X.1Me r1 = r15.A0i
            X.1E7 r0 = r15.A02
            java.lang.String r13 = r1.A0W(r0, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
        L_0x0065:
            X.1Me r1 = r15.A0i
            X.1E7 r3 = r15.A02
            r0 = -1
            boolean r0 = r1.A0j(r3, r0)
            if (r0 == 0) goto L_0x009a
            X.1E7 r0 = r15.A02
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x0084
            X.1E7 r0 = r15.A02
            java.lang.String r0 = r0.A0c
            if (r0 == 0) goto L_0x0084
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0094
        L_0x0084:
            X.1E7 r0 = r15.A02
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x009a
            X.1E7 r0 = r15.A02
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x009a
        L_0x0094:
            X.1E7 r0 = r15.A02
            java.lang.String r14 = X.AnonymousClass3MX.A17(r1, r0)
        L_0x009a:
            X.12L r0 = r15.A0l
            X.1BI r5 = r15.A0F
            boolean r19 = X.C42761yh.A01(r0, r5)
            X.1wy r1 = r15.A0a
            X.1E7 r0 = r15.A02
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r19)
            boolean r4 = r0.A0C()
            r3 = 1
            if (r4 != 0) goto L_0x00b6
            r3 = 0
        L_0x00b6:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            X.1MB r3 = r15.A0S
            boolean r3 = r3.A03(r5)
            if (r3 != 0) goto L_0x00cc
            X.0ve r3 = r15.A0R
            boolean r3 = X.C43381zi.A01(r3, r5)
            r18 = 0
            if (r3 == 0) goto L_0x00ce
        L_0x00cc:
            r18 = 1
        L_0x00ce:
            X.1E7 r7 = r15.A02
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A01(r5)
            X.1Ok r4 = r15.A0P
            X.2tn r3 = new X.2tn
            r3.<init>((X.C25491Ok) r4, (X.AnonymousClass1E7) r7, (com.whatsapp.jid.UserJid) r6)
            X.11S r4 = r15.A0O
            boolean r21 = r4.A0O(r5)
            boolean r20 = r3.A05()
            X.4Uo r7 = new X.4Uo
            r16 = r7
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            X.4VC r6 = new X.4VC
            r10 = r2
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A0F(r6)
            X.2Cb r0 = r15.A01
            X.C17890vO.A0t(r0)
            r15.A0U()
            X.4Ip r0 = r15.A0L
            X.1E7 r11 = r15.A02
            X.1K2 r0 = r0.A00
            X.10E r6 = r0.A01
            X.00S r0 = r6.A04
            r0.get()
            X.118 r20 = X.AnonymousClass3MZ.A0l(r6)
            X.1KB r13 = X.AnonymousClass10E.A12(r6)
            X.00S r0 = r6.A3n
            java.lang.Object r10 = r0.get()
            X.4Yk r10 = (X.C88124Yk) r10
            X.11S r14 = X.AnonymousClass10E.A17(r6)
            X.1M9 r16 = X.AnonymousClass10E.A4z(r6)
            X.11C r19 = X.AnonymousClass3Ma.A0a(r6)
            X.0vb r21 = X.AnonymousClass10E.A6Q(r6)
            X.00S r0 = r6.A5H
            java.lang.Object r9 = r0.get()
            X.1Va r9 = (X.C27171Va) r9
            X.1QS r32 = X.AnonymousClass3MZ.A0z(r6)
            X.10G r0 = r6.A00
            X.00S r1 = r0.A2u
            java.lang.Object r8 = r1.get()
            X.4MY r8 = (X.AnonymousClass4MY) r8
            X.00S r1 = r6.A5i
            java.lang.Object r7 = r1.get()
            X.6n9 r7 = (X.AnonymousClass6n9) r7
            X.00S r1 = r6.A6C
            java.lang.Object r4 = r1.get()
            X.1ST r4 = (X.AnonymousClass1ST) r4
            X.00S r1 = r6.A4x
            java.lang.Object r3 = r1.get()
            X.1UL r3 = (X.AnonymousClass1UL) r3
            X.00S r1 = r6.A3m
            java.lang.Object r2 = r1.get()
            X.4Yr r2 = (X.C88194Yr) r2
            X.00S r1 = r6.AA6
            java.lang.Object r1 = r1.get()
            X.1aN r1 = (X.C28521aN) r1
            X.00S r0 = r0.A1Y
            java.lang.Object r0 = r0.get()
            X.2ie r0 = (X.C57172ie) r0
            X.1QO r31 = X.AnonymousClass3Ma.A0q(r6)
            X.1Vc r17 = X.AnonymousClass3MZ.A0j(r6)
            X.2Cb r12 = new X.2Cb
            r25 = r4
            r26 = r1
            r27 = r11
            r28 = r2
            r29 = r10
            r30 = r3
            r22 = r0
            r23 = r8
            r24 = r7
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.10I r0 = r15.A0H
            X.C17890vO.A0u(r12, r0)
            r15.A01 = r12
            boolean r0 = X.C22971Dz.A0S(r5)
            if (r0 == 0) goto L_0x003e
            X.1OX r3 = X.C41561wd.A00(r15)
            X.0wl r2 = r15.A0e
            r1 = 0
            com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1 r0 = new com.whatsapp.chatinfo.viewModel.ContactInfoViewModel$getContactProfileBadge$1
            r0.<init>(r15, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x01b1:
            boolean r0 = r15.A0m
            if (r0 == 0) goto L_0x01b8
            r13 = r14
            goto L_0x0065
        L_0x01b8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            X.1Me r1 = r15.A0i
            X.1E7 r0 = r15.A02
            java.lang.String r13 = r1.A0I(r0)
            goto L_0x0065
        L_0x01c6:
            r4 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76813oT.A0V():void");
    }

    public final void A0W(C1417376t r2, int i) {
        if (this.A02.A0C()) {
            this.A0h.A03(r2, i);
        }
    }

    public final void A0X(Integer num, int i, boolean z, boolean z2) {
        if (this.A02.A0C()) {
            if (C18020vd.A05(C18040vf.A02, this.A0R, 543)) {
                this.A0h.A07((Integer) null, num, C22971Dz.A06(this.A0F), i, z, z2);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76813oT(android.content.Intent r29, X.C84204Io r30, X.C84214Ip r31, X.C84224Iq r32, X.C56342hJ r33, X.AnonymousClass11S r34, X.AnonymousClass72R r35, X.C24921Me r36, X.C25491Ok r37, X.C25181Nf r38, X.AnonymousClass1E7 r39, X.C58522kp r40, X.C42221xp r41, X.C18030ve r42, X.AnonymousClass12L r43, X.AnonymousClass1MB r44, X.C85144Mg r45, X.AnonymousClass4SJ r46, X.AnonymousClass1BI r47, X.AnonymousClass4RU r48, X.C37701pz r49, X.C36421nr r50, X.AnonymousClass10I r51, X.AnonymousClass00H r52, X.AnonymousClass00H r53, X.AnonymousClass00H r54, X.C18600wl r55, X.C18600wl r56) {
        /*
            r28 = this;
            r13 = r51
            r17 = r42
            r14 = r48
            r27 = r30
            r26 = r31
            r2 = r27
            r1 = r17
            r0 = r26
            X.C18070vi.A0w(r2, r13, r14, r1, r0)
            r12 = r49
            r25 = r32
            r8 = r34
            r22 = r36
            r20 = r38
            r2 = r25
            r1 = r20
            r0 = r22
            X.C18070vi.A0x(r2, r12, r1, r8, r0)
            r16 = r43
            r18 = r41
            r11 = r44
            r10 = r50
            r21 = r37
            r2 = r21
            r1 = r18
            r0 = r16
            X.C18070vi.A0y(r0, r2, r11, r1, r10)
            r7 = r46
            r24 = r33
            r23 = r35
            r19 = r40
            r2 = r19
            r1 = r24
            r0 = r23
            X.C18070vi.A0t(r2, r1, r0, r7)
            r5 = r53
            r6 = r52
            r4 = r54
            r9 = r45
            X.C18070vi.A0u(r9, r6, r5, r4)
            r0 = 24
            r3 = r55
            X.C18070vi.A0d(r3, r0)
            r0 = 25
            r2 = r56
            X.C18070vi.A0d(r2, r0)
            r1 = r28
            r0 = r47
            r15 = r0
            r0 = r27
            r1.<init>(r0, r15, r14, r13)
            r0 = r17
            r1.A0R = r0
            r0 = r26
            r1.A0L = r0
            r0 = r25
            r1.A0M = r0
            r1.A0V = r12
            r0 = r20
            r1.A0j = r0
            r1.A0O = r8
            r0 = r22
            r1.A0i = r0
            r0 = r16
            r1.A0l = r0
            r0 = r21
            r1.A0P = r0
            r1.A0S = r11
            r0 = r18
            r1.A0k = r0
            r1.A0W = r10
            r0 = r19
            r1.A0Q = r0
            r0 = r24
            r1.A0N = r0
            r0 = r23
            r1.A0h = r0
            r1.A0U = r7
            r1.A0T = r9
            r1.A0b = r6
            r1.A0c = r5
            r1.A0d = r4
            r1.A0e = r3
            r1.A0f = r2
            r0 = r39
            r1.A02 = r0
            r2 = r29
            r1.A03 = r2
            boolean r0 = X.AnonymousClass3Ma.A1V(r8, r0)
            r1.A0m = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0X = r0
            r1.A05 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0H = r0
            r1.A09 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0J = r0
            r1.A0B = r0
            X.45h r0 = X.C823145h.A00
            X.1DT r0 = X.AnonymousClass3MW.A0M(r0)
            r1.A0F = r0
            r1.A04 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0I = r0
            r1.A0A = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r1.A0G = r0
            r1.A06 = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0Z = r0
            r1.A0C = r0
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r1.A0a = r0
            r1.A0E = r0
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()
            X.1wy r0 = new X.1wy
            r0.<init>(r2)
            r1.A0Y = r0
            r1.A08 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0M(r2)
            r1.A0g = r0
            r1.A07 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0M(r2)
            r1.A0K = r0
            r1.A0D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76813oT.<init>(android.content.Intent, X.4Io, X.4Ip, X.4Iq, X.2hJ, X.11S, X.72R, X.1Me, X.1Ok, X.1Nf, X.1E7, X.2kp, X.1xp, X.0ve, X.12L, X.1MB, X.4Mg, X.4SJ, X.1BI, X.4RU, X.1pz, X.1nr, X.10I, X.00H, X.00H, X.00H, X.0wl, X.0wl):void");
    }
}
