package com.whatsapp.calling;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1IV;
import X.AnonymousClass1M9;
import X.AnonymousClass1VB;
import X.AnonymousClass1VD;
import X.AnonymousClass1VT;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4OE;
import X.C110885hR;
import X.C24921Me;
import X.C26031Qo;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import X.C98404r5;
import android.content.res.Configuration;
import android.widget.LinearLayout;

public class VoipNotAllowedActivity extends AnonymousClass1FY {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C26031Qo A02;
    public AnonymousClass1VB A03;
    public AnonymousClass1VD A04;
    public AnonymousClass4OE A05;
    public AnonymousClass129 A06;
    public AnonymousClass1VT A07;
    public boolean A08;
    public final AnonymousClass1IV A09;

    public VoipNotAllowedActivity() {
        this(0);
        this.A09 = new C98404r5(this, 0);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A07 = (AnonymousClass1VT) A0L.A1X.get();
            this.A00 = AnonymousClass10E.A4z(A0L);
            this.A01 = AnonymousClass3MZ.A0g(A0L);
            this.A06 = AnonymousClass3Ma.A0t(A0L);
            this.A02 = (C26031Qo) A0L.A32.get();
            this.A04 = (AnonymousClass1VD) A0L.A9J.get();
            this.A03 = (AnonymousClass1VB) A0L.Afr.get();
            this.A05 = (AnonymousClass4OE) r1.AG0.get();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = (LinearLayout) C110885hR.A0A(this, 2131429510);
        int i = 1;
        if (configuration.orientation != 1) {
            i = 0;
        }
        linearLayout.setOrientation(i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r0 = 2131627504(0x7f0e0df0, float:1.8882274E38)
            r11.setContentView((int) r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r8 = X.AnonymousClass3MW.A0I(r11, r0)
            X.C43421zm.A04(r8)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            android.content.Intent r0 = r11.getIntent()
            java.util.ArrayList r7 = X.C72463Mc.A0r(r0, r1)
            boolean r0 = r7.isEmpty()
            r6 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Missing jids"
            X.C17960vV.A0F(r1, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "reason"
            r5 = 0
            int r2 = r1.getIntExtra(r0, r5)
            int r0 = r7.size()
            java.util.ArrayList r4 = X.C17880vN.A0z(r0)
            if (r2 == 0) goto L_0x01bb
            r0 = 12
            if (r2 == r0) goto L_0x01bb
            r0 = 14
            if (r2 == r0) goto L_0x01bb
            int r0 = r7.size()
            boolean r1 = X.AnonymousClass000.A1T(r0, r6)
            java.lang.String r0 = "Incorrect number of arguments"
            X.C17960vV.A0F(r1, r0)
            X.1M9 r1 = r11.A00
            java.lang.Object r0 = r7.get(r5)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r1 = r1.A0H(r0)
            X.1Me r0 = r11.A01
            java.lang.String r10 = X.AnonymousClass3MY.A0q(r0, r1)
        L_0x006e:
            r0 = 2131432664(0x7f0b14d8, float:1.8487092E38)
            android.widget.TextView r4 = X.AnonymousClass3MW.A0I(r11, r0)
            java.lang.String r9 = "28030008"
            r3 = 0
            switch(r2) {
                case 1: goto L_0x01af;
                case 2: goto L_0x01ab;
                case 3: goto L_0x019d;
                case 4: goto L_0x018b;
                case 5: goto L_0x0176;
                case 6: goto L_0x016c;
                case 7: goto L_0x0164;
                case 8: goto L_0x0160;
                case 9: goto L_0x015c;
                case 10: goto L_0x0158;
                case 11: goto L_0x0158;
                case 12: goto L_0x0141;
                case 13: goto L_0x013d;
                case 14: goto L_0x0126;
                case 15: goto L_0x0121;
                case 16: goto L_0x011c;
                case 17: goto L_0x00d9;
                default: goto L_0x007b;
            }
        L_0x007b:
            X.0vb r9 = r11.A00
            r8 = 2131755510(0x7f1001f6, float:1.9141901E38)
            int r0 = r7.size()
            long r1 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r10
            java.lang.String r0 = r9.A0K(r0, r8, r1)
            r4.setText(r0)
        L_0x0090:
            r0 = 2131433257(0x7f0b1729, float:1.8488295E38)
            android.widget.TextView r2 = X.AnonymousClass3MW.A0I(r11, r0)
            r0 = 2131432784(0x7f0b1550, float:1.8487335E38)
            android.view.View r1 = X.C110885hR.A0A(r11, r0)
            if (r3 != 0) goto L_0x00cd
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
        L_0x00a8:
            r2.setText(r0)
            r0 = 7
            X.C89874dA.A00(r2, r11, r0)
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r1 = X.C110885hR.A0A(r11, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            int r0 = X.C72453Mb.A08(r11)
            if (r0 != r6) goto L_0x00c9
            r1.setOrientation(r6)
        L_0x00c1:
            X.1VT r1 = r11.A07
            X.1IV r0 = r11.A09
            r1.registerObserver(r0)
            return
        L_0x00c9:
            r1.setOrientation(r5)
            goto L_0x00c1
        L_0x00cd:
            r1.setVisibility(r5)
            r0 = 8
            X.AnonymousClass3Ma.A1G(r1, r11, r3, r0)
            r0 = 2131893144(0x7f121b98, float:1.9421056E38)
            goto L_0x00a8
        L_0x00d9:
            X.1VD r0 = r11.A04
            X.1VC r0 = r0.A00
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00fb
            r0 = 2131894899(0x7f122273, float:1.9424616E38)
            X.AnonymousClass3MY.A0x(r11, r4, r0)
            X.129 r1 = r11.A06
            java.lang.String r0 = "717472490411581"
            android.net.Uri r0 = r1.A03(r0)
            java.lang.String r3 = r0.toString()
            X.1VB r0 = r11.A03
            r0.A00()
            goto L_0x0090
        L_0x00fb:
            X.0ve r2 = r11.A0E
            r1 = 8008(0x1f48, float:1.1222E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x007b
            X.1Qo r1 = r11.A02
            X.3xL r0 = X.C80543xL.A05
            r1.A00(r0, r3)
            X.4OE r2 = r11.A05
            X.10I r1 = r2.A03
            X.AkG r0 = new X.AkG
            r0.<init>((java.lang.Object) r2, (int) r5)
            r1.CGF(r0)
            goto L_0x007b
        L_0x011c:
            r1 = 2131898271(0x7f122f9f, float:1.9431455E38)
            goto L_0x01b2
        L_0x0121:
            r1 = 2131897251(0x7f122ba3, float:1.9429386E38)
            goto L_0x01b2
        L_0x0126:
            X.0vb r8 = r11.A00
            r7 = 2131755503(0x7f1001ef, float:1.9141887E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r0 = 64
            X.C17880vN.A1T(r2, r0, r5)
            r0 = 64
            java.lang.String r0 = r8.A0K(r2, r7, r0)
            r4.setText(r0)
            goto L_0x0090
        L_0x013d:
            r1 = 2131898158(0x7f122f2e, float:1.9431226E38)
            goto L_0x01b2
        L_0x0141:
            X.0vb r9 = r11.A00
            r8 = 2131755502(0x7f1001ee, float:1.9141885E38)
            int r0 = r7.size()
            long r1 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r10
            java.lang.String r0 = r9.A0K(r0, r8, r1)
            r4.setText(r0)
            goto L_0x0090
        L_0x0158:
            r1 = 2131898293(0x7f122fb5, float:1.94315E38)
            goto L_0x01b2
        L_0x015c:
            r1 = 2131898292(0x7f122fb4, float:1.9431498E38)
            goto L_0x01b2
        L_0x0160:
            r1 = 2131898294(0x7f122fb6, float:1.9431502E38)
            goto L_0x01b2
        L_0x0164:
            r0 = 2131898295(0x7f122fb7, float:1.9431504E38)
            r4.setText(r0)
            goto L_0x0090
        L_0x016c:
            r0 = 2131898256(0x7f122f90, float:1.9431425E38)
            r8.setText(r0)
            r1 = 2131898255(0x7f122f8f, float:1.9431423E38)
            goto L_0x01b2
        L_0x0176:
            r0 = 2131898256(0x7f122f90, float:1.9431425E38)
            r8.setText(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.getStringExtra(r0)
            r4.setText(r0)
            goto L_0x0090
        L_0x018b:
            r1 = 2131898247(0x7f122f87, float:1.9431406E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r10
            X.AnonymousClass3MY.A0y(r11, r4, r0, r1)
            X.129 r0 = r11.A06
            java.lang.String r3 = r0.A06(r9)
            goto L_0x0090
        L_0x019d:
            r0 = 2131898248(0x7f122f88, float:1.9431408E38)
            r4.setText(r0)
            X.129 r0 = r11.A06
            java.lang.String r3 = r0.A06(r9)
            goto L_0x0090
        L_0x01ab:
            r1 = 2131898250(0x7f122f8a, float:1.9431412E38)
            goto L_0x01b2
        L_0x01af:
            r1 = 2131898249(0x7f122f89, float:1.943141E38)
        L_0x01b2:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r5] = r10
            X.AnonymousClass3MY.A0y(r11, r4, r0, r1)
            goto L_0x0090
        L_0x01bb:
            java.util.Iterator r3 = r7.iterator()
        L_0x01bf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01d9
            X.1BI r1 = X.C17880vN.A0Q(r3)
            X.1M9 r0 = r11.A00
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r11.A01
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r0, r1)
            r4.add(r0)
            goto L_0x01bf
        L_0x01d9:
            X.1Me r0 = r11.A01
            X.0vb r0 = r0.A02
            java.lang.String r10 = X.C60592oI.A00(r0, r4, r6)
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.VoipNotAllowedActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.unregisterObserver(this.A09);
    }

    public VoipNotAllowedActivity(int i) {
        this.A08 = false;
        C90994ey.A00(this, 23);
    }
}
