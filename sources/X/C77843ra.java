package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaImageButton;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3ra  reason: invalid class name and case insensitive filesystem */
public class C77843ra extends C75423hT {
    public C59822mw A00;
    public C178119Bw A01;
    public AnonymousClass2Q4 A02;
    public C825848y A03;
    public C825948z A04;
    public final C19880zA A05;
    public final AnonymousClass11S A06;
    public final AnonymousClass1HQ A07;
    public final C58662l3 A08;
    public final C34511kb A09;
    public final AnonymousClass1M9 A0A;
    public final C24921Me A0B;
    public final C32951i1 A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass1MW A0E;
    public final AnonymousClass1E7 A0F;
    public final C18030ve A0G;
    public final C25841Pv A0H;
    public final C42211xo A0I;
    public final AnonymousClass1EC A0J;
    public final C35311m1 A0K;
    public final C25831Pu A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final C19880zA A0O;
    public final C107165Yq A0P = new C93404iv(this, 0);
    public final C107175Yr A0Q = new C93414iw(this, 0);
    public final AnonymousClass4Zx A0R;
    public final C85464Nm A0S;
    public final C203411t A0T;
    public final AnonymousClass1VW A0U;
    public final C23581Gv A0V = new C94164k9(this, 13);
    public final C27191Vc A0W;
    public final AnonymousClass11P A0X;
    public final AnonymousClass1TD A0Y;
    public final AnonymousClass1TA A0Z;
    public final C34591kk A0a;
    public final C42221xp A0b;
    public final AnonymousClass1VU A0c;
    public final C84964Ln A0d;
    public final AnonymousClass4HF A0e;
    public final C26241Rj A0f;
    public final C40981vc A0g = new C97744py(this, 0);
    public final C40951vZ A0h;
    public final C87684Wn A0i;
    public final AnonymousClass1PU A0j;
    public final AnonymousClass1DC A0k;
    public final C34191k5 A0l = new C98384r3(this, 0);
    public final C39491tA A0m;
    public final AnonymousClass00H A0n;

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ad, code lost:
        if (r5.A0I.A02(r5.A00) != false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02dc, code lost:
        if (r5.A0E.A0N(r3) == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0300, code lost:
        if (r5.A0M == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0380, code lost:
        if (r5.A0N == false) goto L_0x0382;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BqX(android.view.Menu r19) {
        /*
            r18 = this;
            r6 = 1
            r7 = r19
            X.C137526vb.A00(r7)
            java.lang.String r0 = "groupconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r18
            X.1CJ r4 = r5.A0D
            X.1EC r3 = r5.A0J
            int r2 = r4.A06(r3)
            X.00H r0 = r5.A0K
            r17 = r0
            r17.get()
            X.1kb r8 = r5.A09
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            boolean r0 = r8.A0W(r3, r2)
            if (r0 == 0) goto L_0x0090
            r0 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r15 = 0
            r13 = 32
            android.view.MenuItem r0 = r7.add(r1, r13, r1, r0)
            android.view.MenuItem r1 = r0.setIcon(r1)
            r0 = 2131627147(0x7f0e0c8b, float:1.888155E38)
            android.view.MenuItem r11 = r1.setActionView(r0)
            android.view.View r12 = r11.getActionView()
            if (r12 == 0) goto L_0x0077
            r0 = 2131430711(0x7f0b0d37, float:1.848313E38)
            android.widget.ImageView r9 = X.AnonymousClass3MW.A0H(r12, r0)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r9)
            r0 = 2131169540(0x7f071104, float:1.7953413E38)
            X.AnonymousClass3MY.A14(r1, r9, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r9.setScaleType(r0)
            boolean r0 = X.C22891Dp.A02
            if (r0 == 0) goto L_0x0077
            android.content.Context r0 = r9.getContext()
            X.C18070vi.A0d(r0, r15)
            int r1 = X.AnonymousClass4Z9.A01(r0, r15)
            r0 = 2131230988(0x7f08010c, float:1.8078044E38)
            r9.setBackgroundResource(r0)
            int r1 = X.AnonymousClass3MY.A02(r9, r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r9.setColorFilter(r1, r0)
        L_0x0077:
            r10 = 2
            r11.setShowAsAction(r10)
            android.view.View r9 = r11.getActionView()
            if (r9 == 0) goto L_0x008b
            r1 = 2131435472(0x7f0b1fd0, float:1.8492787E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r9.setTag(r1, r0)
        L_0x008b:
            if (r12 != 0) goto L_0x03b8
            r7.removeItem(r13)
        L_0x0090:
            X.1E7 r0 = r5.A00
            X.0zA r11 = r5.A05
            boolean r0 = X.C63982u1.A08(r11, r4, r0, r3)
            if (r0 == 0) goto L_0x012d
            X.1TA r1 = r5.A0Z
            boolean r0 = r1.A07(r3)
            if (r0 == 0) goto L_0x03a5
            X.2Q4 r0 = r1.A02(r3)
            r5.A02 = r0
            if (r0 == 0) goto L_0x00b1
            long r0 = r0.A01()
            A07(r5, r0)
        L_0x00b1:
            X.2mw r0 = r5.A00
            if (r0 != 0) goto L_0x00ca
            X.0ve r0 = r5.A0G
            boolean r0 = X.C40811vJ.A0W(r0)
            if (r0 == 0) goto L_0x00ca
            X.1m1 r10 = r5.A0K
            X.1BI r9 = r5.A0G
            r1 = 0
            X.4px r0 = new X.4px
            r0.<init>(r5, r1)
            r10.A03(r9, r0)
        L_0x00ca:
            X.0ve r1 = r5.A0G
            X.11S r10 = r5.A06
            boolean r0 = X.C40811vJ.A0F(r10, r1)
            if (r0 == 0) goto L_0x00db
            X.5cS r9 = r5.A09
            X.2mw r0 = r5.A00
            r9.CNJ(r0)
        L_0x00db:
            X.2Q4 r0 = r5.A02
            if (r0 != 0) goto L_0x03a1
            X.2mw r0 = r5.A00
            if (r0 == 0) goto L_0x02b1
            X.C17960vV.A07(r0)
            int r2 = r0.A00
            r0 = 2
            boolean r11 = X.AnonymousClass000.A1T(r2, r0)
        L_0x00ed:
            boolean r0 = X.C40811vJ.A0F(r10, r1)
            if (r0 != 0) goto L_0x012d
            X.1HQ r0 = r5.A07
            com.whatsapp.voipcalling.CallInfo r13 = r0.BO3()
            X.5cS r0 = r5.A09
            boolean r0 = r0.BgA()
            r9 = 0
            if (r0 != 0) goto L_0x0110
            X.1HS r0 = r5.A08
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02a4
            boolean r0 = X.C40811vJ.A0d(r3, r13)
            if (r0 != 0) goto L_0x02a4
        L_0x0110:
            r4 = 0
        L_0x0111:
            boolean r12 = X.C40811vJ.A0d(r3, r13)
            boolean r0 = X.C40811vJ.A0C(r10, r1)
            if (r0 == 0) goto L_0x020d
            if (r13 == 0) goto L_0x0123
            boolean r0 = r13.isAudioChat()
            if (r0 != 0) goto L_0x012d
        L_0x0123:
            X.9Bw r0 = r5.A01
            if (r0 == 0) goto L_0x020d
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x020d
        L_0x012d:
            r17.get()
            boolean r0 = r8.A0R(r3)
            r2 = 2131891001(0x7f121339, float:1.941671E38)
            if (r0 == 0) goto L_0x013c
            r2 = 2131886667(0x7f12024b, float:1.940792E38)
        L_0x013c:
            r1 = 2131232010(0x7f08050a, float:1.8080117E38)
            r0 = 21
            r5.A02(r7, r0, r2, r1)
            X.1xo r4 = r5.A0I
            X.1BI r0 = r5.A0G
            boolean r0 = r4.A03(r0)
            if (r0 != 0) goto L_0x0161
            boolean r0 = r8.A0R(r3)
            r2 = 2131897887(0x7f122e1f, float:1.9430676E38)
            if (r0 == 0) goto L_0x015a
            r2 = 2131897864(0x7f122e08, float:1.943063E38)
        L_0x015a:
            r1 = 2131232170(0x7f0805aa, float:1.8080442E38)
            r0 = 6
            r5.A02(r7, r0, r2, r1)
        L_0x0161:
            X.C75443hV.A01(r7, r5)
            int r2 = r5.A01()
            r1 = 2131232146(0x7f080592, float:1.8080393E38)
            r0 = 4
            r5.A02(r7, r0, r2, r1)
            X.1E7 r2 = r5.A0F
            boolean r1 = r4.A02(r2)
            X.1Pv r0 = r5.A0H
            boolean r0 = r0.A01(r2, r3)
            if (r0 != 0) goto L_0x0185
            X.1Pu r0 = r5.A0L
            boolean r0 = r0.A00(r2, r3)
            if (r0 == 0) goto L_0x0192
        L_0x0185:
            if (r1 != 0) goto L_0x0192
            r2 = 2131889914(0x7f120efa, float:1.9414505E38)
            r1 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r0 = 12
            r5.A02(r7, r0, r2, r1)
        L_0x0192:
            X.4Nm r0 = r5.A0S
            X.5by r0 = r0.A01
            boolean r4 = r0.Bgg()
            r2 = 2131898398(0x7f12301e, float:1.9431713E38)
            r1 = 2131232435(0x7f0806b3, float:1.808098E38)
            r0 = 5
            if (r4 == 0) goto L_0x01ab
            r2 = 2131888196(0x7f120844, float:1.941102E38)
            r1 = 2131232155(0x7f08059b, float:1.8080411E38)
            r0 = 36
        L_0x01ab:
            r5.A02(r7, r0, r2, r1)
            boolean r0 = X.C72453Mb.A1W(r17)
            if (r0 == 0) goto L_0x01c8
            r17.get()
            r17.get()
            r2 = 2131891989(0x7f121715, float:1.9418714E38)
            r17.get()
            r1 = 2131233505(0x7f080ae1, float:1.808315E38)
            r0 = 22
            r5.A02(r7, r0, r2, r1)
        L_0x01c8:
            r1 = 2131899186(0x7f123332, float:1.943331E38)
            r0 = 0
            android.view.SubMenu r4 = r7.addSubMenu(r0, r6, r0, r1)
            r4.clearHeader()
            r2 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r1 = 2131232349(0x7f08065d, float:1.8080805E38)
            r0 = 9
            r5.A02(r4, r0, r2, r1)
            X.1MZ r0 = r5.A0D
            boolean r0 = r0.A0J(r3)
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r8.A0R(r3)
            r2 = 2131890191(0x7f12100f, float:1.9415067E38)
            if (r0 == 0) goto L_0x01f2
            r2 = 2131890178(0x7f121002, float:1.941504E38)
        L_0x01f2:
            r1 = 2131232077(0x7f08054d, float:1.8080253E38)
            r0 = 23
            r5.A02(r4, r0, r2, r1)
        L_0x01fa:
            r5.A0F(r4)
            r5.A0G(r4)
            r5.A0E(r4)
            X.4Zx r1 = r5.A0R
            r0 = 0
            r1.A02 = r0
            r1.A03 = r0
            r1.A01 = r0
            return
        L_0x020d:
            boolean r0 = X.C40811vJ.A0F(r10, r1)
            if (r0 == 0) goto L_0x021f
            X.9Bw r0 = r5.A01
            if (r0 != 0) goto L_0x021b
            X.2mw r0 = r5.A00
            if (r0 == 0) goto L_0x021f
        L_0x021b:
            if (r12 != 0) goto L_0x021f
            goto L_0x012d
        L_0x021f:
            r1 = 27
            r0 = 2131899582(0x7f1234be, float:1.9434114E38)
            android.view.MenuItem r1 = r7.add(r9, r1, r9, r0)
            r0 = 2131231761(0x7f080411, float:1.8079612E38)
            android.view.MenuItem r1 = r1.setIcon(r0)
            r0 = 2131625767(0x7f0e0727, float:1.8878751E38)
            android.view.MenuItem r10 = r1.setActionView(r0)
            r0 = 2
            r10.setShowAsAction(r0)
            android.view.View r2 = r10.getActionView()
            if (r2 == 0) goto L_0x024a
            r1 = 2131435472(0x7f0b1fd0, float:1.8492787E38)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.setTag(r1, r0)
        L_0x024a:
            android.view.View r9 = r10.getActionView()
            r0 = 2131431897(0x7f0b11d9, float:1.8485536E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r9, r0)
            com.whatsapp.text.AutoSizeTextView r1 = (com.whatsapp.text.AutoSizeTextView) r1
            r0 = 2131899582(0x7f1234be, float:1.9434114E38)
            if (r12 == 0) goto L_0x025f
            r0 = 2131898286(0x7f122fae, float:1.9431485E38)
        L_0x025f:
            r1.setText(r0)
            r0 = 56
            r1.A0M(r0)
            r0 = 2131428746(0x7f0b058a, float:1.8479145E38)
            android.widget.ImageView r1 = X.AnonymousClass3MW.A0G(r9, r0)
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r11 == 0) goto L_0x0276
            r0 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x0276:
            r1.setImageResource(r0)
            X.01E r1 = r5.A01
            r0 = 2131893151(0x7f121b9f, float:1.942107E38)
            if (r11 == 0) goto L_0x0283
            r0 = 2131897854(0x7f122dfe, float:1.943061E38)
        L_0x0283:
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131898198(0x7f122f56, float:1.9431307E38)
            if (r12 == 0) goto L_0x028f
            r0 = 2131898286(0x7f122fae, float:1.9431485E38)
        L_0x028f:
            java.lang.String r1 = r1.getString(r0)
            r0 = 0
            X.AnonymousClass1Y5.A08(r9, r2, r1, r0)
            r0 = 2131899582(0x7f1234be, float:1.9434114E38)
            if (r12 == 0) goto L_0x029f
            r0 = 2131898286(0x7f122fae, float:1.9431485E38)
        L_0x029f:
            r5.A0I(r10, r0, r4)
            goto L_0x012d
        L_0x02a4:
            X.1xo r2 = r5.A0I
            X.1E7 r0 = r5.A00
            boolean r0 = r2.A02(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0111
            goto L_0x0110
        L_0x02b1:
            r17.get()
            boolean r0 = r8.A0W(r3, r2)
            if (r0 != 0) goto L_0x036d
            X.1MZ r9 = r5.A0D
            X.1E7 r0 = r5.A00
            r12 = r4
            r13 = r9
            r14 = r0
            r15 = r1
            r16 = r3
            boolean r0 = X.C63982u1.A07(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x038e
            boolean r0 = r8.A0W(r3, r2)
            if (r0 != 0) goto L_0x038e
            boolean r0 = r5.A0N
            r2 = 0
            if (r0 == 0) goto L_0x02de
            X.1MW r0 = r5.A0E
            boolean r0 = r0.A0N(r3)
            r9 = 1
            if (r0 != 0) goto L_0x02df
        L_0x02de:
            r9 = 0
        L_0x02df:
            boolean r11 = r5.A09(r9)
            r10 = 2
            if (r9 != 0) goto L_0x02fb
            r12 = 11615(0x2d5f, float:1.6276E-41)
            X.0vf r4 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r4, r1, r12)
            if (r0 == r10) goto L_0x02f6
            int r0 = X.C18020vd.A00(r4, r1, r12)
            if (r0 != r6) goto L_0x0302
        L_0x02f6:
            r5.A03(r7, r11)
            goto L_0x012d
        L_0x02fb:
            boolean r0 = r5.A0M
            r12 = 2131233479(0x7f080ac7, float:1.8083097E38)
            if (r0 != 0) goto L_0x0305
        L_0x0302:
            r12 = 2131233480(0x7f080ac8, float:1.8083099E38)
        L_0x0305:
            r1 = 26
            r0 = 2131899576(0x7f1234b8, float:1.9434102E38)
            r4 = 2131899576(0x7f1234b8, float:1.9434102E38)
            android.view.MenuItem r0 = r7.add(r2, r1, r2, r0)
            android.view.MenuItem r1 = r0.setIcon(r12)
            r0 = 2131627343(0x7f0e0d4f, float:1.8881948E38)
            android.view.MenuItem r0 = r1.setActionView(r0)
            r5.A0I(r0, r4, r11)
            r0.setShowAsAction(r10)
            android.view.View r0 = r0.getActionView()
            X.C17960vV.A05(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageResource(r12)
            X.5cS r0 = r5.A09
            r0.BjO()
            if (r9 == 0) goto L_0x033a
            r5.A04(r7, r11)
            goto L_0x012d
        L_0x033a:
            r9 = 2131898713(0x7f123159, float:1.9432352E38)
            r0 = 25
            android.view.MenuItem r1 = r7.add(r2, r0, r2, r9)
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            r4 = 2131231762(0x7f080412, float:1.8079614E38)
            android.view.MenuItem r1 = r1.setIcon(r0)
            r0 = 2131624220(0x7f0e011c, float:1.8875614E38)
            android.view.MenuItem r2 = r1.setActionView(r0)
            android.view.View r1 = r2.getActionView()
            X.C17960vV.A05(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageResource(r4)
            X.01E r0 = r5.A01
            X.AnonymousClass3MY.A0w(r0, r1, r9)
            r5.A0I(r2, r9, r11)
            r2.setShowAsAction(r10)
            goto L_0x012d
        L_0x036d:
            X.1MZ r2 = r5.A0D
            X.1E7 r0 = r5.A00
            r12 = r4
            r13 = r2
            r14 = r0
            r15 = r1
            r16 = r3
            boolean r0 = X.C63982u1.A07(r11, r12, r13, r14, r15, r16)
            if (r0 != 0) goto L_0x0382
            boolean r0 = r5.A0N
            r1 = 1
            if (r0 != 0) goto L_0x0383
        L_0x0382:
            r1 = 0
        L_0x0383:
            boolean r0 = r5.A09(r1)
            if (r1 != 0) goto L_0x039c
            r5.A03(r7, r0)
            goto L_0x012d
        L_0x038e:
            boolean r0 = r9.A0J(r3)
            if (r0 == 0) goto L_0x012d
            boolean r0 = r5.A0N
            if (r0 == 0) goto L_0x036d
            boolean r0 = r5.A09(r6)
        L_0x039c:
            r5.A04(r7, r0)
            goto L_0x012d
        L_0x03a1:
            boolean r11 = r0.A01
            goto L_0x00ed
        L_0x03a5:
            X.5Yr r0 = r5.A0Q
            X.48z r9 = new X.48z
            r9.<init>(r0, r1, r3)
            r5.A04 = r9
            X.10I r1 = r5.A0J
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.CGM(r9, r0)
            goto L_0x00b1
        L_0x03b8:
            r0 = 2131433420(0x7f0b17cc, float:1.8488625E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r12, r0)
            com.whatsapp.WaImageButton r9 = (com.whatsapp.WaImageButton) r9
            android.content.Context r16 = r9.getContext()
            r14 = 2131886291(0x7f1200d3, float:1.9407157E38)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            X.1Me r1 = r5.A0B
            X.1E7 r0 = r5.A00
            X.AnonymousClass3MX.A1N(r1, r0, r13, r15)
            r0 = r16
            java.lang.String r0 = r0.getString(r14, r13)
            r12.setContentDescription(r0)
            X.AnonymousClass3MW.A1Q(r12)
            r0 = 2131886300(0x7f1200dc, float:1.9407175E38)
            X.AnonymousClass1Y5.A02(r12, r0)
            r9.setImportantForAccessibility(r10)
            X.4fS r0 = new X.4fS
            r0.<init>(r7, r11, r9, r5)
            r8.A0F(r0, r3)
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77843ra.BqX(android.view.Menu):void");
    }

    private void A03(Menu menu, boolean z) {
        MenuItem icon;
        int i;
        MenuItem A072 = AnonymousClass3MX.A07(menu, 24, 2131890894);
        if (C18020vd.A00(C18040vf.A02, this.A0G, 11615) == 2) {
            icon = A072.setIcon(2131233479);
            i = 2131625484;
        } else {
            icon = A072.setIcon(2131231648);
            i = 2131625477;
        }
        icon.setActionView(i);
        A0I(A072, 2131890894, z);
        A072.setShowAsAction(2);
    }

    private void A05(MenuItem menuItem, boolean z, boolean z2) {
        View actionView;
        if (!this.A0M || !this.A0E.A0N(this.A0J) || (actionView = menuItem.getActionView()) == null) {
            A08(this, this.A00, z, false, z2);
        } else {
            this.A0R.A03(actionView, z ? 1 : 0);
        }
    }

    public static void A06(WaImageButton waImageButton, C77843ra r13, AnonymousClass1E7 r14) {
        C34511kb r3 = r13.A09;
        AnonymousClass1EC r2 = r13.A0J;
        int A062 = r13.A0D.A06(r2);
        C18070vi.A0d(r2, 0);
        if (!r3.A0W(r2, A062)) {
            Log.i("GroupConversationMenu/displayParentGroupPhoto: new subgroup switcher entry point is disabled");
            return;
        }
        WaImageButton waImageButton2 = waImageButton;
        Context context = waImageButton.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166016);
        Bitmap A042 = r13.A0W.A04(context, r14, "GroupConversationMenu.displayParentGroupPhoto", 0.0f, dimensionPixelSize, true);
        if (A042 != null) {
            waImageButton.setImageDrawable(r13.A0c.A01(context.getResources(), A042, AnonymousClass3Ma.A0J()));
            return;
        }
        AnonymousClass1VW r9 = r13.A0U;
        r9.A0A(waImageButton2, (AnonymousClass1VX) null, -2.14748365E9f, r9.A02(r14), dimensionPixelSize);
    }

    public static void A07(C77843ra r6, long j) {
        DeviceJid deviceJid;
        AnonymousClass1TD r1 = r6.A0Y;
        C178119Bw A042 = r1.A04(j);
        if (A042 != null) {
            r6.A01 = A042;
            if (A042.A0E != null && A042.A0W()) {
                if (C18020vd.A05(C18040vf.A02, r6.A0G, 5249)) {
                    HashSet A12 = C17880vN.A12();
                    Iterator it = A042.A0B().iterator();
                    while (it.hasNext()) {
                        C178109Bv r2 = (C178109Bv) it.next();
                        if (r2.A01 == 5) {
                            UserJid userJid = r2.A00;
                            AnonymousClass1E0 r0 = DeviceJid.Companion;
                            if (userJid != null) {
                                deviceJid = userJid.getPrimaryDevice();
                            } else {
                                deviceJid = null;
                            }
                            A12.add(deviceJid);
                        }
                    }
                    if (A12.size() > 0) {
                        r6.A0J.CGF(new C146497Pi(r6, A12, 33));
                    }
                }
            }
            r6.A09.CQq(A042);
        } else if (r6.A03 == null) {
            C825848y r22 = new C825848y(r6.A0P, r1, j);
            r6.A03 = r22;
            r6.A0J.CGM(r22, new Void[0]);
        }
    }

    public static void A08(C77843ra r10, AnonymousClass1E7 r11, boolean z, boolean z2, boolean z3) {
        int A052;
        Boolean bool;
        if (z3) {
            A052 = 42;
        } else {
            A052 = C72453Mb.A05(z ? 1 : 0);
        }
        C194859sP r3 = (C194859sP) r10.A0n.get();
        r3.A00();
        boolean z4 = true;
        AnonymousClass1MZ r0 = r10.A0D;
        AnonymousClass1EC r1 = r10.A0J;
        Integer valueOf = Integer.valueOf(AnonymousClass3MW.A03(r0, r1));
        if (z3) {
            if (r10.A0D.A06(r1) == 0) {
                z4 = false;
            }
            bool = Boolean.valueOf(z4);
        } else {
            bool = null;
        }
        r3.A01(bool, (Boolean) null, 1, valueOf, (Integer) null, A052);
        r10.A09.CCR(r11, z, z2, z3);
    }

    private boolean A09(boolean z) {
        if (this.A09.Bct()) {
            return false;
        }
        C18030ve r5 = this.A0G;
        AnonymousClass1EC r6 = this.A0J;
        AnonymousClass1E7 r4 = this.A00;
        AnonymousClass1HS r1 = this.A08;
        AnonymousClass1PU r7 = this.A0j;
        return C63982u1.A09(this.A06, r1, this.A0A, this.A0D, r4, r5, r6, r7, z);
    }

    private void A04(Menu menu, boolean z) {
        MenuItem actionView = menu.add(0, 31, 0, 2131893163).setIcon(2131233309).setActionView(2131624220);
        View actionView2 = actionView.getActionView();
        C17960vV.A05(actionView2);
        ImageView imageView = (ImageView) actionView2;
        imageView.setImageResource(2131233309);
        AnonymousClass3MY.A0w(this.A01, imageView, 2131893163);
        A0I(actionView, 2131893163, z);
        if (C40811vJ.A0H(this.A06, this.A0G, AnonymousClass3MW.A03(this.A0D, this.A0J))) {
            actionView.getActionView().setAlpha(0.4f);
        }
        actionView.setShowAsAction(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
        r1 = r11.getActionView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        if (r1 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fd, code lost:
        r10.A0R.A03(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ce, code lost:
        r2.A2F(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d1, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bze(android.view.MenuItem r11) {
        /*
            r10 = this;
            int r1 = r11.getItemId()
            r0 = 12
            r9 = 1
            if (r1 == r0) goto L_0x01fa
            r0 = 13
            if (r1 == r0) goto L_0x01f9
            r3 = 2
            r5 = 3
            r7 = 0
            r2 = 0
            switch(r1) {
                case 19: goto L_0x01bb;
                case 20: goto L_0x01a5;
                case 21: goto L_0x015a;
                case 22: goto L_0x0134;
                case 23: goto L_0x0107;
                case 24: goto L_0x00b9;
                case 25: goto L_0x00af;
                case 26: goto L_0x00a5;
                case 27: goto L_0x0091;
                case 28: goto L_0x007f;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r1) {
                case 31: goto L_0x01d2;
                case 32: goto L_0x003e;
                case 33: goto L_0x00f7;
                case 34: goto L_0x0032;
                case 35: goto L_0x01f9;
                case 36: goto L_0x001c;
                default: goto L_0x0017;
            }
        L_0x0017:
            boolean r0 = super.Bze(r11)
            return r0
        L_0x001c:
            X.4Nm r2 = r10.A0S
            X.5by r0 = r2.A01
            boolean r0 = r0.Bgg()
            if (r0 == 0) goto L_0x01f9
            android.app.Activity r1 = r2.A00
            X.1BI r0 = r2.A02
            android.content.Intent r0 = X.AnonymousClass1LU.A0a(r1, r0)
            r1.startActivity(r0)
            return r9
        L_0x0032:
            android.view.View r1 = r11.getActionView()
            if (r1 == 0) goto L_0x01f9
            X.4Zx r0 = r10.A0R
            r0.A03(r1, r5)
            return r9
        L_0x003e:
            X.1kb r3 = r10.A09
            X.1EC r2 = r10.A0J
            X.1CJ r0 = r10.A0D
            int r1 = r0.A06(r2)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r3.A0W(r2, r1)
            if (r0 == 0) goto L_0x01f9
            X.1EC r5 = r3.A05(r2)
            if (r5 == 0) goto L_0x0079
            X.11t r4 = r10.A0T
            X.01E r0 = r10.A01
            X.1GP r3 = r0.getSupportFragmentManager()
            com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet r2 = new com.whatsapp.community.CommunityNewSubgroupSwitcherBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "community_jid"
            X.C72463Mc.A11(r1, r2, r5, r0)
            r1 = 30
            X.DVt r0 = new X.DVt
            r0.<init>((java.lang.Object) r2, (int) r1)
            r4.CNK(r3, r5, r0)
            return r9
        L_0x0079:
            java.lang.String r0 = "GroupConversationsMenu/subgroupBottomSheet/parentGroupJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x007f:
            X.0zA r1 = r10.A0O
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x01f9
            r1.A03()
            java.lang.String r0 = "showChatAssignmentPicker"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0091:
            X.9Bw r1 = r10.A01
            if (r1 == 0) goto L_0x009b
            X.5cS r0 = r10.A09
            r0.BhD(r1)
            return r9
        L_0x009b:
            X.2mw r1 = r10.A00
            if (r1 == 0) goto L_0x01f9
            X.5cS r0 = r10.A09
            r0.CO4(r1)
            return r9
        L_0x00a5:
            X.4Wn r1 = r10.A0i
            r0 = 7
            X.C87684Wn.A00(r1, r0)
            r10.A05(r11, r9, r2)
            return r9
        L_0x00af:
            X.4Wn r1 = r10.A0i
            r0 = 6
            X.C87684Wn.A00(r1, r0)
            r10.A05(r11, r2, r2)
            return r9
        L_0x00b9:
            X.0ve r4 = r10.A0G
            r2 = 11615(0x2d5f, float:1.6276E-41)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r4, r2)
            if (r0 == r9) goto L_0x0103
            int r0 = X.C18020vd.A00(r1, r4, r2)
            if (r0 == r3) goto L_0x0103
            X.1MW r0 = r10.A0E
            X.1EC r5 = r10.A0J
            X.2tp r0 = r0.A0B(r5)
            int r2 = r0.A06()
            r0 = 4189(0x105d, float:5.87E-42)
            int r1 = X.C18020vd.A00(r1, r4, r0)
            r0 = 64
            int r0 = java.lang.Math.min(r0, r1)
            if (r2 <= r0) goto L_0x00f7
            X.1M9 r4 = r10.A0A
            X.1MZ r1 = r10.A0D
            X.11S r0 = r10.A06
            java.util.ArrayList r6 = X.C63982u1.A03(r0, r1, r5)
            X.01E r3 = r10.A01
            r8 = 24
            X.AnonymousClass74H.A09(r3, r4, r5, r6, r7, r8, r9)
            return r9
        L_0x00f7:
            android.view.View r1 = r11.getActionView()
            if (r1 == 0) goto L_0x01f9
            X.4Zx r0 = r10.A0R
            r0.A03(r1, r3)
            return r9
        L_0x0103:
            r10.A05(r11, r9, r9)
            return r9
        L_0x0107:
            X.1Rj r1 = r10.A0f
            X.1BI r0 = r10.A0G
            r1.A0A(r0)
            X.1FR r1 = r10.A03
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r1.CNB(r2, r0)
            X.10I r1 = r10.A0J
            X.01E r5 = r10.A01
            X.1kk r7 = r10.A0a
            X.1kb r6 = r10.A09
            X.1EC r0 = r10.A0J
            java.util.Set r8 = java.util.Collections.singleton(r0)
            X.4fJ r4 = new X.4fJ
            r4.<init>(r10, r9)
            X.2PS r3 = new X.2PS
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.CGD(r3, r0)
            return r9
        L_0x0134:
            X.00H r1 = r10.A0K
            boolean r0 = X.C72453Mb.A1W(r1)
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r4 = r1.get()
            X.1rO r4 = (X.C38501rO) r4
            X.01E r0 = r10.A01
            X.1GP r3 = r0.getSupportFragmentManager()
            X.1EC r2 = r10.A0J
            r1.get()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.4sX r0 = new X.4sX
            r0.<init>(r11, r10, r9)
            r4.A05(r3, r2, r1, r0)
            return r9
        L_0x015a:
            X.1kb r1 = r10.A09
            X.1EC r0 = r10.A0J
            X.1EC r3 = r1.A05(r0)
            if (r3 == 0) goto L_0x017c
            boolean r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x017c
            X.11t r2 = r10.A0T
            X.01E r1 = r10.A01
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            boolean r0 = r2.CAq(r1, r0, r3)
            if (r0 == 0) goto L_0x017c
            return r9
        L_0x017c:
            X.01E r4 = r10.A01
            X.1E7 r0 = r10.A00
            X.1BI r1 = r0.A0J
            r0 = 0
            android.content.Intent r3 = X.AnonymousClass1LU.A13(r4, r1, r9, r0, r0)
            r0 = 2131436426(0x7f0b238a, float:1.8494722E38)
            android.view.View r1 = X.C110885hR.A0A(r4, r0)
            X.4ZR r0 = r10.A07
            android.os.Bundle r2 = X.AnonymousClass4ZR.A00(r4, r1, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.11P r0 = r10.A0X
            X.C60442o2.A00(r3, r0, r1)
            r4.startActivity(r3, r2)
            return r9
        L_0x01a5:
            X.1EC r1 = r10.A0J
            r0 = 90
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment r2 = new com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment
            r2.<init>()
            r2.A07 = r1
            r2.A00 = r0
            X.01E r0 = r10.A01
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "Group Member Suggestions Existing Group Debug Dialog"
            goto L_0x01ce
        L_0x01bb:
            r0 = 89
            com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment r2 = new com.whatsapp.group.membersuggestions.GroupMemberSuggestionsDebugDialogFragment
            r2.<init>()
            r2.A07 = r7
            r2.A00 = r0
            X.01E r0 = r10.A01
            X.1GP r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "Group Member Suggestions New Group Debug Dialog"
        L_0x01ce:
            r2.A2F(r1, r0)
            return r9
        L_0x01d2:
            X.00H r0 = r10.A0n
            java.lang.Object r3 = r0.get()
            X.9sP r3 = (X.C194859sP) r3
            r3.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            X.1MZ r1 = r10.A0D
            X.1EC r0 = r10.A0J
            int r0 = X.AnonymousClass3MW.A03(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 32
            r3.A02(r2, r1, r0)
            X.5cS r1 = r10.A09
            X.1E7 r0 = r10.A00
            r1.CNj(r0)
        L_0x01f9:
            return r9
        L_0x01fa:
            X.10I r1 = r10.A0J
            r0 = 16
            X.C98774rh.A01(r1, r10, r0)
            X.01E r3 = r10.A01
            X.1EC r2 = r10.A0J
            X.1M9 r0 = r10.A0A
            X.1E7 r0 = r0.A0H(r2)
            int r1 = r0.A04
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass1LU.A0c(r3, r2, r1, r0)
            r3.startActivity(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77843ra.Bze(android.view.MenuItem):boolean");
    }

    public boolean C1Y(Menu menu) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("groupconversationmenu/onprepareoptionsmenu ");
        C17900vP.A0o(A10, menu.size());
        if (menu.size() == 0) {
            return false;
        }
        A0H(menu.findItem(4));
        return super.C1Y(menu);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A0m.registerObserver(this.A0l);
        this.A0h.registerObserver(this.A0g);
        this.A0a.registerObserver(this.A0V);
    }

    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        this.A0m.unregisterObserver(this.A0l);
        this.A0h.unregisterObserver(this.A0g);
        this.A0a.unregisterObserver(this.A0V);
        C825948z r0 = this.A04;
        if (r0 != null) {
            r0.A0B(true);
            this.A04 = null;
        }
        C825848y r02 = this.A03;
        if (r02 != null) {
            r02.A0B(true);
            this.A03 = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77843ra(X.AnonymousClass01E r46, X.C19880zA r47, X.C19880zA r48, X.C19880zA r49, X.C19880zA r50, X.C84164Ii r51, X.C56322hH r52, X.C84174Ij r53, X.AnonymousClass4PY r54, X.AnonymousClass1FR r55, X.AnonymousClass1KB r56, X.AnonymousClass11S r57, X.AnonymousClass18O r58, X.C33251iW r59, X.AnonymousClass4ZR r60, X.AnonymousClass1HQ r61, X.C107205Yu r62, X.C58662l3 r63, X.AnonymousClass1HS r64, X.AnonymousClass1MC r65, X.C34511kb r66, X.C32111gf r67, X.AnonymousClass1VW r68, X.AnonymousClass1M9 r69, X.C24671Lf r70, X.C24921Me r71, X.C27191Vc r72, X.C108885cS r73, X.C32951i1 r74, X.AnonymousClass11C r75, X.AnonymousClass11P r76, X.C19830z4 r77, X.C18000vb r78, X.AnonymousClass1TD r79, X.AnonymousClass1Q1 r80, X.AnonymousClass1CJ r81, X.C25181Nf r82, X.AnonymousClass1MZ r83, X.AnonymousClass1TA r84, X.AnonymousClass1MW r85, X.C34591kk r86, X.AnonymousClass1E7 r87, X.AnonymousClass1RK r88, X.C42221xp r89, X.AnonymousClass1VU r90, X.C18030ve r91, X.AnonymousClass12L r92, X.C25841Pv r93, X.C25191Ng r94, X.C84964Ln r95, X.C42211xo r96, X.AnonymousClass1EC r97, X.C37701pz r98, X.AnonymousClass4HF r99, X.C26241Rj r100, X.C35311m1 r101, X.C40951vZ r102, X.AnonymousClass1Nb r103, X.C87684Wn r104, X.C25831Pu r105, X.AnonymousClass1PU r106, X.AnonymousClass1DC r107, X.AnonymousClass10I r108, X.C39491tA r109, X.AnonymousClass00H r110, X.AnonymousClass00H r111) {
        /*
            r45 = this;
            r10 = r45
            r41 = r103
            r40 = r98
            r11 = r46
            r7 = r105
            r21 = r59
            r22 = r60
            r23 = r64
            r24 = r65
            r15 = r52
            r44 = r110
            r14 = r51
            r25 = r70
            r43 = r108
            r13 = r49
            r12 = r47
            r8 = r74
            r3 = r73
            r16 = r53
            r17 = r55
            r18 = r56
            r5 = r57
            r20 = r58
            r28 = r75
            r29 = r77
            r30 = r78
            r31 = r80
            r32 = r81
            r33 = r82
            r34 = r87
            r35 = r88
            r4 = r91
            r37 = r92
            r38 = r94
            r6 = r97
            r26 = r3
            r27 = r8
            r36 = r4
            r39 = r6
            r42 = r7
            r19 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r2 = 0
            X.4iv r0 = new X.4iv
            r0.<init>(r10, r2)
            r10.A0P = r0
            X.4iw r0 = new X.4iw
            r0.<init>(r10, r2)
            r10.A0Q = r0
            X.4r3 r0 = new X.4r3
            r0.<init>(r10, r2)
            r10.A0l = r0
            X.4py r0 = new X.4py
            r0.<init>(r10, r2)
            r10.A0g = r0
            r1 = 13
            X.4k9 r0 = new X.4k9
            r0.<init>(r10, r1)
            r10.A0V = r0
            r0 = r76
            r10.A0X = r0
            r10.A0G = r4
            r10.A06 = r5
            r0 = r61
            r10.A07 = r0
            r0 = r68
            r10.A0U = r0
            r1 = r69
            r10.A0A = r1
            r0 = r107
            r10.A0k = r0
            r0 = r71
            r10.A0B = r0
            r0 = r106
            r10.A0j = r0
            r0 = r93
            r10.A0H = r0
            r0 = r100
            r10.A0f = r0
            r0 = r109
            r10.A0m = r0
            r0 = r79
            r10.A0Y = r0
            r0 = r63
            r10.A08 = r0
            r0 = r67
            r10.A0T = r0
            r0 = r90
            r10.A0c = r0
            r0 = r86
            r10.A0a = r0
            r0 = r101
            r10.A0K = r0
            r0 = r89
            r10.A0b = r0
            r0 = r66
            r10.A09 = r0
            r0 = r84
            r10.A0Z = r0
            r0 = r85
            r10.A0E = r0
            r0 = r102
            r10.A0h = r0
            r9 = r83
            r10.A0D = r9
            r0 = r104
            r10.A0i = r0
            r0 = r72
            r10.A0W = r0
            r10.A0L = r7
            r0 = r48
            r10.A0O = r0
            r10.A0J = r6
            r10.A0C = r8
            X.1E7 r0 = r1.A0H(r6)
            r10.A0F = r0
            r0 = r96
            r10.A0I = r0
            r0 = r99
            r10.A0e = r0
            r0 = r95
            r10.A0d = r0
            r0 = r111
            r10.A0n = r0
            r1 = 1
            boolean r0 = X.C40811vJ.A0c(r4, r1)
            if (r0 != 0) goto L_0x0134
            int r0 = X.AnonymousClass3MW.A03(r9, r6)
            boolean r0 = X.C40811vJ.A0I(r5, r4, r0)
            if (r0 == 0) goto L_0x0134
        L_0x0110:
            r10.A0N = r1
            boolean r0 = X.C40811vJ.A0V(r4)
            r10.A0M = r0
            X.1BI r1 = r10.A0G
            X.4jF r0 = new X.4jF
            r0.<init>(r3, r10)
            r3 = r62
            X.4Zx r0 = r3.BGu(r11, r0, r1, r2)
            r10.A0R = r0
            r0 = r50
            r10.A05 = r0
            r0 = r54
            X.4Nm r0 = r0.A00(r11, r1)
            r10.A0S = r0
            return
        L_0x0134:
            r1 = 0
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77843ra.<init>(X.01E, X.0zA, X.0zA, X.0zA, X.0zA, X.4Ii, X.2hH, X.4Ij, X.4PY, X.1FR, X.1KB, X.11S, X.18O, X.1iW, X.4ZR, X.1HQ, X.5Yu, X.2l3, X.1HS, X.1MC, X.1kb, X.1gf, X.1VW, X.1M9, X.1Lf, X.1Me, X.1Vc, X.5cS, X.1i1, X.11C, X.11P, X.0z4, X.0vb, X.1TD, X.1Q1, X.1CJ, X.1Nf, X.1MZ, X.1TA, X.1MW, X.1kk, X.1E7, X.1RK, X.1xp, X.1VU, X.0ve, X.12L, X.1Pv, X.1Ng, X.4Ln, X.1xo, X.1EC, X.1pz, X.4HF, X.1Rj, X.1m1, X.1vZ, X.1Nb, X.4Wn, X.1Pu, X.1PU, X.1DC, X.10I, X.1tA, X.00H, X.00H):void");
    }
}
