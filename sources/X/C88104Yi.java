package X;

import android.view.View;
import com.whatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.4Yi  reason: invalid class name and case insensitive filesystem */
public final class C88104Yi {
    public final AnonymousClass11S A00;
    public final AnonymousClass11E A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1MZ A03;
    public final C24751Ln A04;
    public final C32491hH A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass1KB A08;
    public final AnonymousClass1M9 A09;
    public final C19830z4 A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass4QD A0C;
    public final AnonymousClass126 A0D;
    public final AnonymousClass1PU A0E;
    public final AnonymousClass10I A0F;
    public final AnonymousClass00H A0G;

    public void A01(View view, AnonymousClass1FU r16, C33251iW r17, AnonymousClass5ZY r18, AnonymousClass206 r19, int i, boolean z) {
        C33251iW r8 = r17;
        C18070vi.A0d(r8, 4);
        AnonymousClass1FU r7 = r16;
        View view2 = view;
        AnonymousClass5ZY r9 = r18;
        AnonymousClass206 r11 = r19;
        int i2 = i;
        boolean z2 = z;
        if (C87474Vs.A00(AnonymousClass3MX.A0O(r7), this.A0A)) {
            AnonymousClass4QD r4 = this.A0C;
            AnonymousClass1GP A0O = AnonymousClass3MX.A0O(r7);
            AnonymousClass1BI r2 = r11.A0v.A00;
            C95944n3 r5 = new C95944n3(view2, r7, r8, r9, this, r11, i2, z2);
            int i3 = 7;
            if (z) {
                i3 = 6;
            }
            C18070vi.A0d(A0O, 0);
            if (C87474Vs.A00(A0O, r4.A00)) {
                C72483Me.A0l(r2, A0O, i3);
                EphemeralDmKicBottomSheetDialog.A0N = r5;
                return;
            }
            return;
        }
        A00(r7, view, r8, r9, this, r11, i2, z2);
    }

    public boolean A02(AnonymousClass206 r7) {
        GroupJid A0f;
        C18070vi.A0d(r7, 0);
        if (((C88174Yp) this.A0G.get()).A01(r7) && 1 != r7.A0C()) {
            AnonymousClass1BI r1 = r7.A0v.A00;
            if (C22971Dz.A0e(r1) && (A0f = AnonymousClass3MW.A0f(r1)) != null) {
                AnonymousClass1E7 A0E2 = this.A09.A0E(A0f);
                AnonymousClass1EC A0i = AnonymousClass3MW.A0i(A0f);
                if (!(A0E2 == null || A0i == null)) {
                    if (!this.A0E.A01(A0E2, A0f) || this.A03.A0K(A0f)) {
                        if (this.A0B.A0R(A0i)) {
                            if (C18020vd.A05(C18040vf.A02, this.A06, 2844)) {
                                Log.i("KeepInChatManager/shouldEnableKeepOption CAG supports keep in chat");
                            }
                        }
                        return this.A0D.A0X.A00(A0E2, A0i);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r9.A06, 2844) == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r5 = 0
            X.C18070vi.A0d(r10, r5)
            X.00H r0 = r9.A0G
            java.lang.Object r0 = r0.get()
            X.4Yp r0 = (X.C88174Yp) r0
            boolean r2 = r0.A01(r10)
            int r1 = r10.A0C()
            r0 = 1
            if (r2 != 0) goto L_0x001b
            if (r0 == r1) goto L_0x001a
            r0 = 0
        L_0x001a:
            return r0
        L_0x001b:
            if (r0 != r1) goto L_0x0050
            X.205 r8 = r10.A0v
            X.1BI r1 = r8.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            r7 = 1
            if (r0 == 0) goto L_0x007c
            com.whatsapp.jid.GroupJid r6 = X.AnonymousClass3MW.A0f(r1)
            if (r6 == 0) goto L_0x007c
            X.1M9 r0 = r9.A09
            X.1E7 r3 = r0.A0E(r6)
            X.1EC r2 = X.AnonymousClass3MW.A0i(r6)
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            X.1CJ r0 = r9.A0B
            boolean r0 = r0.A0R(r2)
            if (r0 == 0) goto L_0x0051
            X.0ve r4 = r9.A06
            r1 = 2844(0xb1c, float:3.985E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            return r5
        L_0x0051:
            X.1MZ r1 = r9.A03
            boolean r0 = r1.A0K(r6)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r1.A0J(r6)
            if (r0 == 0) goto L_0x006a
            int r0 = r10.A0C()
            if (r7 != r0) goto L_0x006a
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x006a
            return r7
        L_0x006a:
            X.1PU r0 = r9.A0E
            boolean r0 = r0.A01(r3, r6)
            if (r0 == 0) goto L_0x0073
            return r5
        L_0x0073:
            X.126 r0 = r9.A0D
            X.1Pv r0 = r0.A0X
            boolean r0 = r0.A00(r3, r2)
            return r0
        L_0x007c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88104Yi.A03(X.206):boolean");
    }

    public C88104Yi(AnonymousClass1KB r18, AnonymousClass11S r19, AnonymousClass11E r20, AnonymousClass1M9 r21, AnonymousClass11P r22, C19830z4 r23, AnonymousClass1CJ r24, AnonymousClass1MZ r25, C24751Ln r26, C32491hH r27, AnonymousClass4QD r28, C18030ve r29, AnonymousClass126 r30, AnonymousClass1PU r31, AnonymousClass10I r32, AnonymousClass00H r33, AnonymousClass00H r34) {
        AnonymousClass10I r4 = r32;
        C18030ve r0 = r29;
        AnonymousClass11P r15 = r22;
        AnonymousClass1KB r16 = r18;
        AnonymousClass11S r14 = r19;
        C18070vi.A0w(r15, r0, r16, r14, r4);
        AnonymousClass00H r3 = r33;
        AnonymousClass1PU r5 = r31;
        C24751Ln r8 = r26;
        AnonymousClass1CJ r10 = r24;
        AnonymousClass1M9 r12 = r21;
        C18070vi.A0x(r10, r12, r5, r8, r3);
        AnonymousClass126 r6 = r30;
        AnonymousClass4QD r7 = r28;
        AnonymousClass1MZ r9 = r25;
        C19830z4 r11 = r23;
        C72483Me.A17(r6, r11, r7, r9, 11);
        AnonymousClass00H r2 = r34;
        AnonymousClass11E r13 = r20;
        C18070vi.A0m(r13, r2);
        this.A02 = r15;
        this.A06 = r0;
        this.A08 = r16;
        this.A00 = r14;
        this.A0F = r4;
        this.A0B = r10;
        this.A09 = r12;
        this.A0E = r5;
        this.A04 = r8;
        this.A07 = r3;
        this.A0D = r6;
        this.A05 = r27;
        this.A0A = r11;
        this.A0C = r7;
        this.A03 = r9;
        this.A01 = r13;
        this.A0G = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r0 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c6, code lost:
        if (r0 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.app.Activity r18, android.view.View r19, X.C33251iW r20, X.AnonymousClass5ZY r21, X.C88104Yi r22, X.AnonymousClass206 r23, int r24, boolean r25) {
        /*
            r12 = 8
            r8 = 5
            r10 = 4
            r9 = 3
            r7 = 1
            r4 = r18
            r18 = r20
            r2 = r21
            r11 = r22
            r3 = r23
            r5 = r24
            if (r25 == 0) goto L_0x00cb
            java.lang.Long r1 = r3.A0U
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = X.C36321nh.A00(r16)
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r16)
            X.11S r13 = r11.A00
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass25A.A08(r13, r3)
            X.11E r0 = r11.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x006e
            r1 = 1
        L_0x0035:
            X.10I r6 = r11.A0F
            X.7RR r0 = new X.7RR
            r0.<init>((X.C88104Yi) r11, (X.AnonymousClass206) r3, (int) r1)
            r6.CGF(r0)
            if (r1 == 0) goto L_0x0065
            if (r1 == r7) goto L_0x02b2
            if (r1 == r9) goto L_0x0173
            if (r1 == r10) goto L_0x005c
            if (r1 == r8) goto L_0x0170
            if (r1 != r12) goto L_0x005b
            r1 = 607(0x25f, float:8.5E-43)
        L_0x004d:
            java.lang.Class<X.1FU> r0 = X.AnonymousClass1FU.class
            android.app.Activity r0 = X.C18050vg.A01(r4, r0)
            if (r0 == 0) goto L_0x0058
            X.AnonymousClass4Yv.A01(r0, r1)
        L_0x0058:
            r2.BEw()
        L_0x005b:
            return
        L_0x005c:
            r1 = 2131891543(0x7f121557, float:1.941781E38)
            r0 = r19
            X.AnonymousClass4W2.A01(r4, r0, r1)
            goto L_0x0058
        L_0x0065:
            X.7RR r1 = new X.7RR
            r0 = r18
            r1.<init>((X.C33251iW) r0, (X.AnonymousClass206) r3, (int) r5)
            goto L_0x016b
        L_0x006e:
            if (r15 == 0) goto L_0x0080
            boolean r0 = X.C22971Dz.A0e(r16)
            if (r0 == 0) goto L_0x0080
            X.1MZ r0 = r11.A03
            boolean r0 = r0.A0L(r15, r14)
            if (r0 != 0) goto L_0x0080
            r1 = 3
            goto L_0x0035
        L_0x0080:
            X.00H r0 = r11.A07
            boolean r0 = X.C72463Mc.A1U(r6, r0)
            if (r0 == 0) goto L_0x008b
            r1 = 8
            goto L_0x0035
        L_0x008b:
            if (r1 == 0) goto L_0x009b
            long r16 = r1.longValue()
            long r14 = java.lang.System.currentTimeMillis()
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x009b
            r1 = 4
            goto L_0x0035
        L_0x009b:
            X.1Ln r1 = r11.A04
            r14 = 0
            X.22A r0 = X.C63892tr.A02(r3)
            if (r0 == 0) goto L_0x00c8
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass25A.A08(r13, r0)
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass25A.A08(r13, r3)
            if (r6 == 0) goto L_0x00b5
            boolean r0 = r1.A0Q(r0, r6)
            r1 = 1
            if (r0 != 0) goto L_0x00b6
        L_0x00b5:
            r1 = 0
        L_0x00b6:
            int r0 = r3.A0C()
            if (r0 != 0) goto L_0x00bd
            r14 = 1
        L_0x00bd:
            boolean r0 = r13.A0O(r6)
            if (r1 == 0) goto L_0x00c8
            if (r14 == 0) goto L_0x00c8
            r1 = 5
            if (r0 == 0) goto L_0x0035
        L_0x00c8:
            r1 = 0
            goto L_0x0035
        L_0x00cb:
            java.lang.Long r14 = r3.A0U
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            X.205 r6 = r3.A0v
            X.1BI r0 = r6.A00
            r16 = r0
            com.whatsapp.jid.GroupJid r15 = X.C36321nh.A00(r16)
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A00(r16)
            X.11S r0 = r11.A00
            com.whatsapp.jid.UserJid r13 = X.AnonymousClass25A.A08(r0, r3)
            X.11E r0 = r11.A01
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0109
            r1 = 1
        L_0x00ec:
            X.10I r6 = r11.A0F
            X.3Cu r0 = new X.3Cu
            r0.<init>((X.C88104Yi) r11, (X.AnonymousClass206) r3, (int) r1)
            r6.CGF(r0)
            if (r1 == 0) goto L_0x0164
            if (r1 == r7) goto L_0x02b2
            if (r1 == r9) goto L_0x02a9
            if (r1 == r10) goto L_0x017c
            if (r1 == r8) goto L_0x0178
            r0 = 6
            if (r1 == r0) goto L_0x01d9
            if (r1 != r12) goto L_0x005b
            r1 = 608(0x260, float:8.52E-43)
            goto L_0x004d
        L_0x0109:
            if (r15 == 0) goto L_0x011b
            boolean r0 = X.C22971Dz.A0e(r16)
            if (r0 == 0) goto L_0x011b
            X.1MZ r0 = r11.A03
            boolean r0 = r0.A0L(r15, r13)
            if (r0 != 0) goto L_0x011b
            r1 = 3
            goto L_0x00ec
        L_0x011b:
            X.00H r0 = r11.A07
            boolean r0 = X.C72463Mc.A1U(r1, r0)
            if (r0 == 0) goto L_0x0126
            r1 = 8
            goto L_0x00ec
        L_0x0126:
            X.0ve r13 = r11.A06
            X.11P r0 = r11.A02
            X.C18070vi.A0h(r13, r0)
            java.lang.Long r0 = r3.A0U
            if (r0 == 0) goto L_0x014d
            long r15 = r0.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r15
            long r15 = X.C17880vN.A04(r0)
            r1 = 1698(0x6a2, float:2.38E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r13, r1)
            long r0 = (long) r0
            int r13 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x014d
            r1 = 6
            goto L_0x00ec
        L_0x014d:
            if (r14 == 0) goto L_0x015d
            long r15 = r14.longValue()
            long r13 = java.lang.System.currentTimeMillis()
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x015d
            r1 = 4
            goto L_0x00ec
        L_0x015d:
            boolean r0 = r6.A02
            r1 = 0
            if (r0 == 0) goto L_0x00ec
            r1 = 5
            goto L_0x00ec
        L_0x0164:
            X.3Cu r1 = new X.3Cu
            r0 = r18
            r1.<init>((X.C33251iW) r0, (X.AnonymousClass206) r3, (int) r5)
        L_0x016b:
            r6.CGF(r1)
            goto L_0x0058
        L_0x0170:
            X.1KB r8 = r11.A08
            goto L_0x01dc
        L_0x0173:
            r1 = 2131891566(0x7f12156e, float:1.9417856E38)
            goto L_0x02ac
        L_0x0178:
            X.1KB r8 = r11.A08
            r10 = 3
            goto L_0x01dc
        L_0x017c:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131626075(0x7f0e085b, float:1.8879376E38)
            android.view.View r5 = X.AnonymousClass3MY.A0D(r1, r0)
            X.3Rj r1 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131898472(0x7f123068, float:1.9431863E38)
            r1.A0E(r0)
            r0 = 2131898470(0x7f123066, float:1.9431859E38)
            r1.A0D(r0)
            r1.A0c(r5)
            X.05w r7 = X.AnonymousClass3MY.A0L(r1)
            r0 = 2131428579(0x7f0b04e3, float:1.8478806E38)
            android.widget.TextView r8 = X.AnonymousClass3Ma.A0E(r5, r0)
            r0 = 2131428580(0x7f0b04e4, float:1.8478808E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r5, r0)
            r0 = 2131898471(0x7f123067, float:1.943186E38)
            r8.setText(r0)
            r1 = 2130971379(0x7f040af3, float:1.7551495E38)
            r0 = 2131102602(0x7f060b8a, float:1.7817647E38)
            X.C72463Mc.A0y(r4, r8, r1, r0)
            r16 = 1
            X.4d2 r9 = new X.4d2
            r14 = r18
            r15 = r3
            r10 = r6
            r11 = r4
            r12 = r19
            r13 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.setOnClickListener(r9)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r5.setText(r0)
            r0 = 20
            X.C90014dO.A00(r5, r2, r7, r0)
            goto L_0x0252
        L_0x01d9:
            X.1KB r8 = r11.A08
            r10 = 2
        L_0x01dc:
            X.4QD r5 = r11.A0C
            r0 = 2
            if (r10 == r0) goto L_0x0256
            if (r10 == r9) goto L_0x027c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131625772(0x7f0e072c, float:1.8878761E38)
            android.view.View r8 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131435201(0x7f0b1ec1, float:1.8492237E38)
            android.widget.TextView r6 = X.AnonymousClass3Ma.A0E(r8, r0)
            r0 = 2131435200(0x7f0b1ec0, float:1.8492235E38)
            android.widget.TextView r3 = X.AnonymousClass3Ma.A0E(r8, r0)
            r0 = 2131431902(0x7f0b11de, float:1.8485546E38)
            android.widget.ImageView r1 = X.AnonymousClass3Ma.A0C(r8, r0)
            r0 = 2131891569(0x7f121571, float:1.9417862E38)
            r6.setText(r0)
            r0 = 2131891568(0x7f121570, float:1.941786E38)
            r3.setText(r0)
            r0 = 2131232521(0x7f080709, float:1.8081154E38)
            r1.setImageResource(r0)
            r0 = 2131433259(0x7f0b172b, float:1.8488299E38)
            android.view.View r6 = X.C18070vi.A05(r8, r0)
            r0 = 2131431961(0x7f0b1219, float:1.8485666E38)
            android.view.View r3 = X.C18070vi.A05(r8, r0)
            X.3Rj r0 = X.AnonymousClass4a6.A00(r4)
            r0.A0c(r8)
            r0.A0T(r7)
            X.05w r7 = X.AnonymousClass3MY.A0L(r0)
            X.759 r0 = new X.759
            r0.<init>(r2, r9)
            r7.setOnDismissListener(r0)
            android.view.Window r1 = r7.getWindow()
            if (r1 == 0) goto L_0x0249
            r0 = 2131102739(0x7f060c13, float:1.7817924E38)
            int r0 = X.C19740yt.A00(r4, r0)
            X.AnonymousClass3Ma.A1H(r1, r0)
        L_0x0249:
            r0 = 25
            X.C89934dG.A00(r6, r7, r0)
            r0 = 4
            X.AnonymousClass3Ma.A1F(r3, r4, r5, r7, r0)
        L_0x0252:
            r7.show()
            return
        L_0x0256:
            X.4b2 r1 = new X.4b2
            r9 = r1
            r10 = r4
            r11 = r8
            r12 = r18
            r13 = r3
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14)
            X.3Rj r4 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131889467(0x7f120d3b, float:1.9413598E38)
            r4.A0D(r0)
            r0 = 2131895345(0x7f122431, float:1.942552E38)
            r4.A0Z(r1, r0)
            r3 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 0
            X.4bB r1 = new X.4bB
            r1.<init>(r2, r0)
            goto L_0x02a2
        L_0x027c:
            X.3Rj r4 = X.AnonymousClass4a6.A00(r4)
            r0 = 2131891571(0x7f121573, float:1.9417866E38)
            r4.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r12 = 4
            X.4b0 r0 = new X.4b0
            r7 = r0
            r8 = r2
            r9 = r18
            r10 = r6
            r11 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            r4.A0Z(r0, r1)
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 49
            X.4bA r1 = new X.4bA
            r1.<init>(r2, r0)
        L_0x02a2:
            r4.A0X(r1, r3)
            X.AnonymousClass3MY.A1G(r4)
            return
        L_0x02a9:
            r1 = 2131891567(0x7f12156f, float:1.9417858E38)
        L_0x02ac:
            r0 = r19
            X.AnonymousClass4W2.A01(r4, r0, r1)
            return
        L_0x02b2:
            X.1KB r1 = r11.A08
            r0 = 2131891544(0x7f121558, float:1.9417811E38)
            r1.A08(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88104Yi.A00(android.app.Activity, android.view.View, X.1iW, X.5ZY, X.4Yi, X.206, int, boolean):void");
    }
}
