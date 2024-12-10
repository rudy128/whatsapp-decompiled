package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class A6R {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1Q2 A02;
    public final ALX A03;
    public final C31061ex A04;
    public final AnonymousClass1QS A05;
    public final AnonymousClass1PP A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final C25181Nf A09;
    public final AnonymousClass1MZ A0A;
    public final AnonymousClass1QL A0B;
    public final C191339mR A0C;
    public final AnonymousClass1PU A0D;

    public static void A01(TextView textView, AW0 aw0, A6R a6r, boolean z) {
        int i;
        int i2;
        AW0 aw02 = aw0;
        if (z) {
            textView.setText(2131893973);
            textView.setEnabled(false);
            i = aw0.A02;
            i2 = 19;
        } else {
            textView.setEnabled(true);
            textView.setText(2131893822);
            i = aw0.A02;
            i2 = 12;
        }
        if (i != i2) {
            aw0.A02 = i2;
            AnonymousClass8BR.A0O(a6r.A05).A0f(aw02, AnonymousClass205.A01(aw0.A0C, aw0.A0L, aw0.A0Q), i, 0, -1);
        }
    }

    public static synchronized boolean A02(AW0 aw0, A6R a6r) {
        boolean z;
        synchronized (a6r) {
            AnonymousClass1BI r1 = aw0.A0C;
            z = false;
            if (r1 != null) {
                AnonymousClass1E7 A012 = a6r.A09.A01(r1);
                if (A012.A0F()) {
                    AnonymousClass1MZ r12 = a6r.A0A;
                    Class<AnonymousClass1EC> cls = AnonymousClass1EC.class;
                    AnonymousClass1EC r0 = (AnonymousClass1EC) A012.A06(cls);
                    C17960vV.A07(r0);
                    if (r12.A0J(r0)) {
                        AnonymousClass1PU r13 = a6r.A0D;
                        AnonymousClass1EC r02 = (AnonymousClass1EC) A012.A06(cls);
                        C17960vV.A07(r02);
                        if (r13.A01(A012, r02)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public void A03(Context context, AW0 aw0) {
        BD1 bd1;
        int BWg;
        C57312is A042 = this.A05.A04(aw0.A0G);
        if (A042 != null) {
            bd1 = A042.A00(aw0.A0I);
        } else {
            bd1 = null;
        }
        if (bd1 == null || (BWg = bd1.BWg()) == 0) {
            ((AnonymousClass1FR) context).BhU(new Object[0], 0, 2131893765);
            return;
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = context.getString(BWg);
        ((AnonymousClass1FR) context).BhU(A1a, 0, 2131897291);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r1.A06().BPW().A04(X.AnonymousClass8BT.A0L(X.AnonymousClass8BR.A0Z(), r2)) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.AnonymousClass3MW.A0V(r4.A02).A0P(X.C22941Dw.A00(r13.A0D)) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r12, X.AW0 r13, X.BB6 r14, boolean r15) {
        /*
            r11 = this;
            X.9mR r4 = r11.A0C
            com.whatsapp.jid.UserJid r0 = r13.A0D
            if (r0 == 0) goto L_0x0019
            X.00H r0 = r4.A02
            X.1pj r1 = X.AnonymousClass3MW.A0V(r0)
            com.whatsapp.jid.UserJid r0 = r13.A0D
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            boolean r0 = r1.A0P(r0)
            r3 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            X.8pG r0 = r13.A0A
            if (r0 == 0) goto L_0x0054
            java.lang.String r2 = r0.A0G()
        L_0x0022:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004b
            X.1QS r1 = r4.A01
            X.BD1 r0 = r1.A06()
            X.9uc r0 = r0.BPW()
            if (r0 == 0) goto L_0x004b
            X.BD1 r0 = r1.A06()
            X.9uc r1 = r0.BPW()
            X.7Ik r0 = X.AnonymousClass8BR.A0Z()
            X.77e r0 = X.AnonymousClass8BT.A0L(r0, r2)
            boolean r1 = r1.A04(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r3 != 0) goto L_0x0056
            if (r0 != 0) goto L_0x0056
            r14.onSuccess()
            return
        L_0x0054:
            r2 = 0
            goto L_0x0022
        L_0x0056:
            android.app.Activity r5 = X.AnonymousClass1L9.A00(r12)
            com.whatsapp.jid.UserJid r7 = r13.A0D
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.8pG r0 = r13.A0A
            java.lang.String r1 = r0.A0G()
            java.lang.String r0 = "paymentHandle"
            X.77e r8 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)
            r9 = 0
            X.AOG r6 = new X.AOG
            r6.<init>(r14, r9)
            r10 = r15
            r4.A00(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6R.A04(android.content.Context, X.AW0, X.BB6, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (android.text.TextUtils.isEmpty(r0.A0N) != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.View r25, android.widget.Button r26, X.AW0 r27, X.C192079nl r28, X.B8b r29, X.AnonymousClass206 r30, java.lang.String r31, boolean r32) {
        /*
            r24 = this;
            r7 = r28
            r0 = 2131434581(0x7f0b1c55, float:1.849098E38)
            r5 = r25
            android.view.View r3 = X.AnonymousClass1HF.A06(r5, r0)
            r0 = 2131434597(0x7f0b1c65, float:1.8491012E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r5, r0)
            android.content.Context r12 = r5.getContext()
            r14 = r24
            r4 = r30
            if (r30 != 0) goto L_0x01ff
            r1 = 0
        L_0x001d:
            r13 = r27
            boolean r0 = A02(r13, r14)
            r6 = 8
            if (r0 != 0) goto L_0x002f
            if (r1 == 0) goto L_0x003c
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x003c
        L_0x002f:
            if (r32 != 0) goto L_0x00b6
            r1 = 0
            r2.setEnabled(r1)
            r3.setEnabled(r1)
        L_0x0038:
            r5.setVisibility(r1)
        L_0x003b:
            return
        L_0x003c:
            int r9 = r13.A03
            r8 = 20
            r17 = r31
            if (r9 != r8) goto L_0x0082
            int r1 = r13.A02
            r0 = 12
            if (r1 != r0) goto L_0x0082
            r6 = 1
            r2.setEnabled(r6)
            r1 = 0
            X.AFK r11 = new X.AFK
            r15 = r29
            r16 = r4
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r2.setOnClickListener(r11)
            r3.setEnabled(r6)
            X.AFK r0 = new X.AFK
            r11 = r0
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3.setOnClickListener(r0)
            r5.setVisibility(r1)
            if (r28 == 0) goto L_0x003b
            X.8pG r0 = r13.A0A
            X.8pf r0 = (X.C170318pf) r0
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r0.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 8
            if (r0 == 0) goto L_0x0038
        L_0x0080:
            r1 = 0
            goto L_0x0038
        L_0x0082:
            if (r28 == 0) goto L_0x00b6
            r0 = 40
            if (r9 != r0) goto L_0x00b6
            int r1 = r13.A02
            if (r1 == r8) goto L_0x0098
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0098
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0098
            r0 = 115(0x73, float:1.61E-43)
            if (r1 != r0) goto L_0x00b6
        L_0x0098:
            X.8yb r7 = (X.C175368yb) r7
            X.8pG r9 = r13.A0A
            X.8pf r9 = (X.C170318pf) r9
            if (r9 == 0) goto L_0x003b
            X.9ue r0 = r9.A0H
            if (r0 == 0) goto L_0x003b
            r10 = 0
            r4 = r26
            if (r1 == r8) goto L_0x0186
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L_0x01c9
            r0 = 417(0x1a1, float:5.84E-43)
            r8 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x00ba
            if (r1 == r8) goto L_0x00ba
        L_0x00b6:
            r5.setVisibility(r6)
            return
        L_0x00ba:
            r2.setVisibility(r6)
            r3.setVisibility(r6)
            if (r26 == 0) goto L_0x00b6
            X.9ue r1 = r9.A0H
            if (r1 == 0) goto L_0x00b6
            int r0 = r13.A02
            if (r0 == r8) goto L_0x00b6
            X.9O4 r2 = r1.A0C
            if (r2 == 0) goto L_0x00e3
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "ACCEPT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = r2.A09
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00e3
            goto L_0x00b6
        L_0x00e3:
            r8 = 0
            r5.setVisibility(r8)
            X.9ue r1 = r9.A0H
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r1.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x00fc
            int r1 = r1.A00()
            r0 = 2
            if (r0 == r1) goto L_0x0181
        L_0x00fc:
            r4.setVisibility(r8)
            r1 = 1
            r4.setEnabled(r1)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r4.setText(r0)
            r15 = 7
            X.AFH r10 = new X.AFH
            r11 = r7
            r14 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            r4.setOnClickListener(r10)
        L_0x0115:
            X.0ve r2 = r7.A02
            X.AXS r0 = r7.A03
            java.lang.String r0 = r0.A0G()
            boolean r0 = X.A8C.A04(r2, r0)
            if (r0 == 0) goto L_0x015d
            X.8pG r3 = r13.A0A
            r2 = r3
            X.8pf r2 = (X.C170318pf) r2
            if (r2 == 0) goto L_0x015d
            X.9ue r0 = r2.A0H
            if (r0 == 0) goto L_0x015d
            java.lang.String r0 = r0.A0E
            boolean r0 = X.A8C.A05(r0)
            if (r0 == 0) goto L_0x015d
            X.C17960vV.A07(r3)
            r0 = 2131433468(0x7f0b17fc, float:1.8488723E38)
            android.widget.TextView r3 = X.C17880vN.A0E(r5, r0)
            r3.setVisibility(r8)
            X.9ue r0 = r2.A0H
            X.C17960vV.A07(r0)
            int r2 = r0.A00()
            if (r2 == 0) goto L_0x0163
            r0 = 2
            if (r2 == r0) goto L_0x016b
            r0 = 3
            if (r2 == r0) goto L_0x0163
            r0 = 5
            if (r2 == r0) goto L_0x0163
            r0 = 6
            if (r2 == r0) goto L_0x016b
            r3.setVisibility(r6)
        L_0x015d:
            if (r1 != 0) goto L_0x003b
            if (r8 != 0) goto L_0x003b
            goto L_0x00b6
        L_0x0163:
            r0 = 2131893938(0x7f121eb2, float:1.9422667E38)
            r3.setText(r0)
            r14 = 2
            goto L_0x0172
        L_0x016b:
            r0 = 2131894006(0x7f121ef6, float:1.9422805E38)
            r3.setText(r0)
            r14 = 3
        L_0x0172:
            X.AFH r9 = new X.AFH
            r10 = r7
            r11 = r12
            r12 = r13
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r3.setOnClickListener(r9)
            r8 = 1
            goto L_0x015d
        L_0x0181:
            r4.setVisibility(r6)
            r1 = 0
            goto L_0x0115
        L_0x0186:
            X.1R2 r8 = r7.A07
            long r0 = r9.A04
            X.11P r8 = r8.A03
            long r8 = X.AnonymousClass11P.A01(r8)
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r2 = (android.widget.TextView) r2
            r15 = 5
            X.AFH r10 = new X.AFH
            r11 = r7
            r14 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            r23 = 6
            X.AFH r8 = new X.AFH
            r18 = r8
            r19 = r7
            r20 = r12
            r21 = r13
            r22 = r14
            r18.<init>(r19, r20, r21, r22, r23)
            r1 = 1
            r2.setEnabled(r1)
            r2.setOnClickListener(r10)
            r0 = 2131897528(0x7f122cb8, float:1.9429948E38)
            r2.setText(r0)
            r3.setEnabled(r1)
            r3.setOnClickListener(r8)
            r0 = 0
            r5.setVisibility(r0)
            goto L_0x01f9
        L_0x01c9:
            X.1R2 r8 = r7.A07
            long r0 = r9.A04
            X.11P r8 = r8.A03
            long r8 = X.AnonymousClass11P.A01(r8)
            long r0 = r0 - r8
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x003b
            android.widget.TextView r2 = (android.widget.TextView) r2
            r14 = 4
            X.AFH r9 = new X.AFH
            r10 = r7
            r11 = r12
            r12 = r13
            r13 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r0 = 1
            r2.setEnabled(r0)
            r0 = 2131887451(0x7f12055b, float:1.940951E38)
            r2.setText(r0)
            r2.setOnClickListener(r9)
            r0 = 0
            r5.setVisibility(r0)
            r3.setVisibility(r6)
        L_0x01f9:
            if (r26 == 0) goto L_0x003b
            r4.setVisibility(r6)
            return
        L_0x01ff:
            X.1QS r0 = r14.A05
            X.1QR r1 = X.AnonymousClass8BR.A0O(r0)
            X.205 r0 = r4.A0v
            java.lang.String r0 = r0.A01
            X.AW0 r1 = r1.A0L(r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6R.A05(android.view.View, android.widget.Button, X.AW0, X.9nl, X.B8b, X.206, java.lang.String, boolean):void");
    }

    public A6R(AnonymousClass1KB r1, AnonymousClass11P r2, C25181Nf r3, AnonymousClass1MZ r4, AnonymousClass1Q2 r5, AnonymousClass1QL r6, ALX alx, C191339mR r8, C31061ex r9, AnonymousClass1QS r10, AnonymousClass1PP r11, AnonymousClass1PU r12, AnonymousClass10I r13, AnonymousClass00H r14) {
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = r13;
        this.A02 = r5;
        this.A0D = r12;
        this.A05 = r10;
        this.A06 = r11;
        this.A0B = r6;
        this.A08 = r14;
        this.A0C = r8;
        this.A04 = r9;
        this.A03 = alx;
        this.A0A = r4;
        this.A09 = r3;
    }

    public static void A00(View view, Button button, AW0 aw0, A6R a6r) {
        BD1 A002;
        AnonymousClass3M8 BPV;
        View A062 = AnonymousClass1HF.A06(view, 2131434581);
        View A063 = AnonymousClass1HF.A06(view, 2131434597);
        A062.setVisibility(8);
        A063.setVisibility(8);
        C57312is A042 = a6r.A05.A04(aw0.A0G);
        if (A042 == null || (A002 = A042.A00(aw0.A0I)) == null || ((BPV = A002.BPV()) == null ? a6r.A0B.A0F() : !BPV.CLf())) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        button.setVisibility(0);
        button.setOnClickListener(new AnonymousClass78A(button, A002, aw0, 22));
    }
}
