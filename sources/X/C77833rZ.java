package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.3rZ  reason: invalid class name and case insensitive filesystem */
public class C77833rZ extends C75423hT {
    public AEW A00;
    public boolean A01;
    public final C19880zA A02;
    public final C19880zA A03;
    public final C19880zA A04;
    public final AnonymousClass11S A05;
    public final C196149uX A06;
    public final C26911Ty A07;
    public final C37551pj A08;
    public final C53052bu A09;
    public final AnonymousClass4ZW A0A;
    public final AnonymousClass1HR A0B;
    public final C85464Nm A0C;
    public final AnonymousClass1M2 A0D;
    public final C170018ny A0E;
    public final C18030ve A0F;
    public final AnonymousClass12L A0G;
    public final AnonymousClass1MB A0H;
    public final AnonymousClass1QO A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final boolean A0L;
    public final C19880zA A0M;
    public final C19880zA A0N;
    public final C36361nl A0O;
    public final C36931oh A0P;
    public final AnonymousClass1PM A0Q;
    public final C24921Me A0R;
    public final C37311pJ A0S;
    public final C54202dl A0T;
    public final C88654aI A0U;
    public final C42221xp A0V;
    public final AnonymousClass18K A0W;
    public final C84934Lk A0X;
    public final C36511o1 A0Y;
    public final C85754Op A0Z;
    public final AnonymousClass1DC A0a;
    public final AnonymousClass10I A0b;
    public final C190369kp A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final String A0f;
    public final C18140vp A0g;
    public final boolean A0h;

    private void A03(Menu menu) {
        AnonymousClass00H r1 = this.A0K;
        if (C72453Mb.A1W(r1)) {
            r1.get();
            r1.get();
            A02(menu, 27, 2131891989, 2131233505);
        }
    }

    private void A05(Menu menu, boolean z) {
        AnonymousClass1E7 A0K2;
        boolean z2 = this.A0h;
        if (!z2) {
            A02(menu, 21, 2131897875, 2131231833);
        }
        if ((!z || (A0K2 = this.A0D.A0K(AnonymousClass3MW.A0g(this.A00))) == null || !A0K2.A0B()) && !z2) {
            A02(menu, 22, 2131898687, 2131231833);
        }
    }

    private boolean A06() {
        Class<UserJid> cls = UserJid.class;
        if (this.A00.A06(cls) != null) {
            C25831Pu r1 = this.A0I;
            Jid A062 = this.A00.A06(cls);
            C17960vV.A07(A062);
            if (!r1.A01((UserJid) A062) || this.A0h) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean A07() {
        if (!this.A09.BgA()) {
            AnonymousClass1BI r2 = (AnonymousClass1BI) AnonymousClass1E7.A01(this.A00);
            AnonymousClass1HS r0 = this.A08;
            AnonymousClass11S r1 = this.A05;
            if (r2 == null || r0.A01() || r1.A0O(r2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02dc, code lost:
        if (r1 != false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x026a, code lost:
        if (r0.A0m == false) goto L_0x026c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BqX(android.view.Menu r20) {
        /*
            r19 = this;
            r8 = r20
            r7 = 1
            X.C137526vb.A00(r8)
            java.lang.String r0 = "contactconversationmenu/oncreateoptionsmenu"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r19
            X.11S r12 = r6.A05
            X.1BI r5 = r6.A0G
            r12.A0O(r5)
            X.12L r0 = r6.A0G
            boolean r17 = X.C42761yh.A01(r0, r5)
            X.1MB r0 = r6.A0H
            boolean r16 = r0.A03(r5)
            boolean r4 = r12.A0O(r5)
            X.1E7 r0 = r6.A00
            boolean r0 = r0.A0E()
            if (r17 != 0) goto L_0x0082
            if (r4 != 0) goto L_0x0082
            if (r16 != 0) goto L_0x0082
            if (r0 != 0) goto L_0x0082
            boolean r0 = r6.A0h
            if (r0 != 0) goto L_0x0082
            X.1E7 r0 = r6.A00
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0237
            X.0ve r2 = r6.A0F
            r0 = 1464(0x5b8, float:2.052E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r10 = X.C18020vd.A05(r1, r2, r0)
            r0 = 4067(0xfe3, float:5.699E-42)
            int r9 = X.C18020vd.A00(r1, r2, r0)
            X.00H r0 = r6.A0K
            r0.get()
            r2 = 0
            r3 = r5
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1Ty r1 = r6.A07
            X.4hz r0 = new X.4hz
            r0.<init>(r8, r6, r2)
            r1.A0D(r0, r3)
            X.1PM r1 = r6.A0Q
            X.1E7 r0 = r6.A00
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3MZ.A0x(r0)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0209
            if (r9 < r7) goto L_0x007d
            X.10I r2 = r6.A0b
            r1 = 26
            X.7Pi r0 = new X.7Pi
            r0.<init>(r6, r8, r1)
            r2.CGF(r0)
        L_0x007d:
            if (r10 == 0) goto L_0x0082
            A04(r8, r6)
        L_0x0082:
            boolean r3 = r6.A0h
            X.1QO r1 = r6.A0I
            boolean r0 = r1.A0A()
            if (r0 == 0) goto L_0x00a2
            int r0 = r1.A05(r5)
            if (r0 != r7) goto L_0x00a2
            X.1Ty r2 = r6.A07
            X.1E7 r0 = r6.A00
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass3MZ.A0x(r0)
            X.4hy r0 = new X.4hy
            r0.<init>(r6, r7)
            r2.A0D(r0, r1)
        L_0x00a2:
            X.00H r0 = r6.A0K
            r18 = r0
            boolean r0 = X.C72453Mb.A1W(r18)
            if (r0 == 0) goto L_0x01fe
            r6.A05(r8, r4)
            if (r3 != 0) goto L_0x00b4
            X.C75443hV.A01(r8, r6)
        L_0x00b4:
            r18.get()
            r6.A03(r8)
        L_0x00ba:
            X.1E7 r0 = r6.A00
            boolean r0 = r0.A0C()
            r12 = 36
            r2 = 5
            r10 = 23
            r13 = 12
            r11 = 9
            r9 = 24
            r14 = 4
            r15 = 6
            if (r0 == 0) goto L_0x0165
            if (r17 != 0) goto L_0x00dc
            if (r16 != 0) goto L_0x00dc
            r1 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r0 = 2131232349(0x7f08065d, float:1.8080805E38)
            r6.A02(r8, r11, r1, r0)
        L_0x00dc:
            if (r4 != 0) goto L_0x00e9
            if (r16 != 0) goto L_0x00e9
            r1 = 2131887168(0x7f120440, float:1.9408935E38)
            r0 = 2131231719(0x7f0803e7, float:1.8079527E38)
            r6.A02(r8, r10, r1, r0)
        L_0x00e9:
            r1 = 2131897273(0x7f122bb9, float:1.942943E38)
            r0 = 2131231719(0x7f0803e7, float:1.8079527E38)
            r6.A02(r8, r9, r1, r0)
            boolean r0 = X.C72453Mb.A1W(r18)
            if (r0 != 0) goto L_0x00fb
            X.C75443hV.A01(r8, r6)
        L_0x00fb:
            if (r4 != 0) goto L_0x0107
            int r1 = r6.A01()
            r0 = 2131232146(0x7f080592, float:1.8080393E38)
            r6.A02(r8, r14, r1, r0)
        L_0x0107:
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0116
            r1 = 2131889914(0x7f120efa, float:1.9414505E38)
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r6.A02(r8, r13, r1, r0)
        L_0x0116:
            X.4Nm r0 = r6.A0C
            X.5by r0 = r0.A01
            boolean r0 = r0.Bgg()
            if (r0 == 0) goto L_0x015b
            r1 = 2131888196(0x7f120844, float:1.941102E38)
            r0 = 2131232155(0x7f08059b, float:1.8080411E38)
            r6.A02(r8, r12, r1, r0)
        L_0x0129:
            r1 = 2131899186(0x7f123332, float:1.943331E38)
            r0 = 0
            android.view.SubMenu r2 = r8.addSubMenu(r0, r7, r0, r1)
            r2.clearHeader()
            r2.clearHeader()
            r1 = 2131897882(0x7f122e1a, float:1.9430666E38)
            r0 = 2131232170(0x7f0805aa, float:1.8080442E38)
            r6.A02(r2, r15, r1, r0)
            r6.A0F(r2)
            r6.A0G(r2)
            r6.A0E(r2)
        L_0x0149:
            X.C22971Dz.A0Y(r5)
            X.4ZW r1 = r6.A0A
            X.0Iy r0 = r1.A01
            if (r0 == 0) goto L_0x0157
            X.0Od r0 = r0.A04
            r0.A02()
        L_0x0157:
            r0 = 0
            r1.A01 = r0
            return
        L_0x015b:
            r1 = 2131898398(0x7f12301e, float:1.9431713E38)
            r0 = 2131232435(0x7f0806b3, float:1.808098E38)
            r6.A02(r8, r2, r1, r0)
            goto L_0x0129
        L_0x0165:
            r1 = 2131897882(0x7f122e1a, float:1.9430666E38)
            r0 = 2131232170(0x7f0805aa, float:1.8080442E38)
            r6.A02(r8, r15, r1, r0)
            boolean r0 = X.C72453Mb.A1W(r18)
            if (r0 != 0) goto L_0x0179
            if (r3 != 0) goto L_0x0179
            X.C75443hV.A01(r8, r6)
        L_0x0179:
            if (r4 != 0) goto L_0x0185
            int r1 = r6.A01()
            r0 = 2131232146(0x7f080592, float:1.8080393E38)
            r6.A02(r8, r14, r1, r0)
        L_0x0185:
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0194
            r1 = 2131889914(0x7f120efa, float:1.9414505E38)
            r0 = 2131231954(0x7f0804d2, float:1.8080004E38)
            r6.A02(r8, r13, r1, r0)
        L_0x0194:
            if (r3 != 0) goto L_0x01fc
            X.4Nm r0 = r6.A0C
            X.5by r0 = r0.A01
            boolean r0 = r0.Bgg()
            if (r0 == 0) goto L_0x01f2
            r1 = 2131888196(0x7f120844, float:1.941102E38)
            r0 = 2131232155(0x7f08059b, float:1.8080411E38)
            r6.A02(r8, r12, r1, r0)
        L_0x01a9:
            r1 = 2131899186(0x7f123332, float:1.943331E38)
            r0 = 0
            android.view.SubMenu r7 = r8.addSubMenu(r0, r7, r0, r1)
            r7.clearHeader()
            r7.clearHeader()
        L_0x01b7:
            if (r4 != 0) goto L_0x01d5
            if (r16 != 0) goto L_0x01d5
            r2 = r7
            if (r3 == 0) goto L_0x01bf
            r2 = r8
        L_0x01bf:
            r1 = 2131895214(0x7f1223ae, float:1.9425255E38)
            r0 = 2131232349(0x7f08065d, float:1.8080805E38)
            r6.A02(r2, r11, r1, r0)
            r2 = r7
            if (r3 == 0) goto L_0x01cc
            r2 = r8
        L_0x01cc:
            r1 = 2131887168(0x7f120440, float:1.9408935E38)
            r0 = 2131231719(0x7f0803e7, float:1.8079527E38)
            r6.A02(r2, r10, r1, r0)
        L_0x01d5:
            r2 = r7
            if (r3 == 0) goto L_0x01d9
            r2 = r8
        L_0x01d9:
            r1 = 2131897273(0x7f122bb9, float:1.942943E38)
            r0 = 2131231719(0x7f0803e7, float:1.8079527E38)
            r6.A02(r2, r9, r1, r0)
            if (r3 != 0) goto L_0x01e5
            r8 = r7
        L_0x01e5:
            r6.A0F(r8)
            if (r3 != 0) goto L_0x0149
            r6.A0G(r7)
            r6.A0E(r7)
            goto L_0x0149
        L_0x01f2:
            r1 = 2131898398(0x7f12301e, float:1.9431713E38)
            r0 = 2131232435(0x7f0806b3, float:1.808098E38)
            r6.A02(r8, r2, r1, r0)
            goto L_0x01a9
        L_0x01fc:
            r7 = 0
            goto L_0x01b7
        L_0x01fe:
            r18.get()
            r6.A03(r8)
            r6.A05(r8, r4)
            goto L_0x00ba
        L_0x0209:
            boolean r0 = r6.A07()
            boolean r9 = X.AnonymousClass000.A1O(r0)
            r3 = 2131887611(0x7f1205fb, float:1.9409834E38)
            r1 = 28
            r0 = 5
            android.view.MenuItem r1 = r8.add(r2, r1, r0, r3)
            r0 = 2131231648(0x7f0803a0, float:1.8079383E38)
            android.view.MenuItem r1 = r1.setIcon(r0)
            r0 = 2131624236(0x7f0e012c, float:1.8875646E38)
            android.view.MenuItem r2 = r1.setActionView(r0)
            android.view.View r1 = r2.getActionView()
            X.01E r0 = r6.A01
            X.AnonymousClass3MY.A0w(r0, r1, r3)
            X.C75443hV.A02(r2, r6, r3, r9)
            goto L_0x0082
        L_0x0237:
            X.00H r0 = r6.A0K
            r0.get()
            boolean r15 = r6.A07()
            X.1E7 r0 = r6.A00
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r0)
            X.1HS r1 = r6.A08
            X.1HR r9 = r6.A0B
            X.0ve r10 = r6.A0F
            r11 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            if (r3 == 0) goto L_0x0313
            boolean r0 = r12.A0O(r3)
            if (r0 != 0) goto L_0x0313
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0313
            X.1CJ r0 = r6.A0D
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r3)
            if (r0 == 0) goto L_0x026c
            boolean r0 = r0.A0m
            r1 = 0
            if (r0 != 0) goto L_0x026d
        L_0x026c:
            r1 = 1
        L_0x026d:
            X.1pj r0 = r6.A08
            boolean r0 = r0.A0P(r3)
            r0 = r0 ^ 1
            if (r1 == 0) goto L_0x0313
            if (r0 == 0) goto L_0x0313
            r1 = 11700(0x2db4, float:1.6395E-41)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r10, r1)
            if (r0 <= 0) goto L_0x0313
            com.whatsapp.voipcalling.CallInfo r1 = r9.BO3()
            if (r1 == 0) goto L_0x0313
            com.whatsapp.jid.GroupJid r0 = r1.groupJid
            if (r0 != 0) goto L_0x028e
            r11 = 1
        L_0x028e:
            java.util.List r0 = r1.getPeerJids()
            boolean r0 = r0.contains(r3)
            r0 = r0 ^ 1
            if (r11 == 0) goto L_0x0313
            if (r0 == 0) goto L_0x0313
            boolean r2 = r1.videoEnabled
            r0 = r2 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            android.util.Pair r11 = new android.util.Pair
            r11.<init>(r1, r0)
        L_0x02ad:
            r9 = 2131898713(0x7f123159, float:1.9432352E38)
            r14 = 2131899576(0x7f1234b8, float:1.9434102E38)
            r3 = 2
            r2 = 1
            r13 = 0
            r0 = 26
            android.view.MenuItem r1 = r8.add(r13, r0, r13, r14)
            r0 = 2131233480(0x7f080ac8, float:1.8083099E38)
            android.view.MenuItem r1 = r1.setIcon(r0)
            r0 = 2131627343(0x7f0e0d4f, float:1.8881948E38)
            android.view.MenuItem r12 = r1.setActionView(r0)
            android.view.View r0 = r12.getActionView()
            X.01E r10 = r6.A01
            X.AnonymousClass3MY.A0w(r10, r0, r14)
            java.lang.Object r0 = r11.second
            boolean r1 = X.AnonymousClass000.A1Y(r0)
            if (r15 != 0) goto L_0x02de
            r0 = 0
            if (r1 == 0) goto L_0x02df
        L_0x02de:
            r0 = 1
        L_0x02df:
            r6.A0I(r12, r14, r0)
            r12.setShowAsAction(r3)
            r0 = 25
            android.view.MenuItem r1 = r8.add(r13, r0, r13, r9)
            r0 = 2131231762(0x7f080412, float:1.8079614E38)
            android.view.MenuItem r1 = r1.setIcon(r0)
            r0 = 2131624220(0x7f0e011c, float:1.8875614E38)
            android.view.MenuItem r1 = r1.setActionView(r0)
            android.view.View r0 = r1.getActionView()
            X.AnonymousClass3MY.A0w(r10, r0, r9)
            java.lang.Object r0 = r11.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r15 != 0) goto L_0x030b
            if (r0 != 0) goto L_0x030b
            r2 = 0
        L_0x030b:
            r6.A0I(r1, r9, r2)
            r1.setShowAsAction(r3)
            goto L_0x0082
        L_0x0313:
            android.util.Pair r11 = new android.util.Pair
            r11.<init>(r2, r2)
            goto L_0x02ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77833rZ.BqX(android.view.Menu):void");
    }

    public static void A04(Menu menu, C77833rZ r6) {
        boolean A072 = r6.A07();
        MenuItem actionView = AnonymousClass3MX.A07(menu, 25, 2131887611).setIcon(2131231762).setActionView(2131624220);
        AnonymousClass3MY.A0w(r6.A01, actionView.getActionView(), 2131887611);
        C75443hV.A02(actionView, r6, 2131887611, A072);
    }

    public boolean Bze(MenuItem menuItem) {
        boolean z;
        int itemId = menuItem.getItemId();
        if (itemId == 11) {
            this.A0Y.A00(5);
            AnonymousClass01E r3 = this.A01;
            Context applicationContext = r3.getApplicationContext();
            Jid A012 = AnonymousClass1E7.A01(this.A00);
            A012.getClass();
            r3.startActivity(AnonymousClass1LU.A1i(applicationContext, Collections.singletonList(A012.getRawString()), 5));
            return true;
        } else if (itemId != 15) {
            String str = "overflow_menu_block";
            switch (itemId) {
                case 21:
                    AnonymousClass01E r6 = this.A01;
                    Bundle A002 = AnonymousClass4ZR.A00(r6, r6.findViewById(2131436426), this.A07);
                    Intent A1D = AnonymousClass1LU.A1D(r6, (UserJid) C72453Mb.A0m(this.A00), 3, true, false);
                    if (AnonymousClass3MX.A1W(this.A0F)) {
                        this.A0S.A01(r6, new C94294kO(this, A1D, A002, 0), 2);
                        return true;
                    }
                    r6.startActivity(A1D, A002);
                    return true;
                case 22:
                    C88654aI r5 = this.A0U;
                    UserJid A003 = C22941Dw.A00(this.A0G);
                    if (C18020vd.A05(C18040vf.A02, r5.A03, 2805)) {
                        C88654aI.A03(r5, A003, (String) null, 20, true);
                    }
                    this.A09.BBl();
                    return true;
                case 23:
                    UserJid A004 = C22941Dw.A00(this.A0G);
                    C17960vV.A07(A004);
                    if (this.A00.A0C()) {
                        AnonymousClass01E r52 = this.A01;
                        C18030ve r32 = this.A0F;
                        C18070vi.A0d(r32, 0);
                        r52.startActivity(AnonymousClass1LU.A1E(r52, A004, "biz_overflow_menu_block", false, C18020vd.A05(C18040vf.A02, r32, 6185), false, false));
                        return true;
                    }
                    AnonymousClass4SO BGI = this.A0P.BGI(A004, str);
                    BGI.A04 = true;
                    BGI.A05 = false;
                    BGI.A01(0, 1);
                    this.A03.CMl(C123736Vq.A00(BGI.A00()));
                    return true;
                case 24:
                    if (this.A00.A0C()) {
                        str = "biz_overflow_menu_block";
                    }
                    this.A08.A0H(this.A01, this.A00, str, false);
                    A74.A01((A74) this.A0d.get(), AnonymousClass1E7.A00(this.A00), C17880vN.A0k(), (Integer) null, 2);
                    return true;
                case 25:
                    if (this.A08.A01()) {
                        C18030ve r7 = this.A0F;
                        C18040vf r53 = C18040vf.A02;
                        if (C18020vd.A00(r53, r7, 11700) > 0) {
                            ((AnonymousClass1V9) this.A0J.get()).A01(1, 76, 4);
                            View actionView = menuItem.getActionView();
                            if (actionView != null) {
                                int i = 2;
                                if (C18020vd.A00(r53, r7, 11700) == 1) {
                                    i = 0;
                                }
                                this.A0A.A02(actionView, i);
                                return true;
                            }
                        }
                    }
                    this.A09.Bje(this.A01, C72463Mc.A1Z(this.A0g));
                    return true;
                case 26:
                    if (this.A08.A01()) {
                        C18030ve r8 = this.A0F;
                        C18040vf r62 = C18040vf.A02;
                        if (C18020vd.A00(r62, r8, 11700) > 0) {
                            int i2 = 1;
                            ((AnonymousClass1V9) this.A0J.get()).A01(1, 77, 4);
                            View actionView2 = menuItem.getActionView();
                            if (actionView2 != null) {
                                if (C18020vd.A00(r62, r8, 11700) != 1) {
                                    i2 = 2;
                                }
                                this.A0A.A02(actionView2, i2);
                                return true;
                            }
                        }
                    }
                    this.A09.Bjh();
                    return true;
                case 27:
                    AnonymousClass00H r2 = this.A0K;
                    if (C72453Mb.A1W(r2)) {
                        AnonymousClass1GP supportFragmentManager = this.A01.getSupportFragmentManager();
                        AnonymousClass1BI r33 = this.A0G;
                        r2.get();
                        ((C38501rO) r2.get()).A05(supportFragmentManager, r33, 3, new C99264sX(menuItem, this, 0));
                        return true;
                    }
                    break;
                case 28:
                    this.A09.Bjf();
                    return true;
                case 29:
                    this.A09.Bji(this.A0f);
                    return true;
                case 30:
                    String str2 = (String) menuItem.getActionView().getTag(2131436014);
                    if (!TextUtils.isEmpty(str2)) {
                        C72453Mb.A18(this.A01, this.A0O, str2);
                        if (this.A0c.A00()) {
                            C170938qu r22 = new C170938qu();
                            r22.A01 = 2;
                            r22.A00 = 1;
                            this.A0W.CC7(r22);
                            return true;
                        }
                    }
                    break;
                case 31:
                    C29691ci A0A2 = this.A0D.A0A(this.A0G);
                    C19880zA r23 = this.A04;
                    if (r23.A07() && (this.A01 instanceof AnonymousClass1FU) && A0A2 != null) {
                        synchronized (A0A2) {
                            z = A0A2.A0o;
                        }
                        if (z) {
                            C72453Mb.A1Q(this.A0K, new AnonymousClass4LB(this));
                            r23.A03();
                            throw AnonymousClass000.A0s("showTurnOffAiForChatAssignmentDialog");
                        }
                    }
                    C19880zA r24 = this.A02;
                    if (r24.A07()) {
                        r24.A03();
                        throw AnonymousClass000.A0s("showChatAssignmentPicker");
                    }
                    break;
                default:
                    switch (itemId) {
                        case 34:
                            this.A0E.A0H(this.A01, (AnonymousClass5XY) null, this.A0G, new C20271AEe("", (String) null), "", C17890vO.A0Q(), -1);
                            return true;
                        case 35:
                            if (this.A04.A07()) {
                                C19880zA r25 = this.A03;
                                if (r25.A07()) {
                                    r25.A03();
                                    throw AnonymousClass000.A0s("createMaibaChatThreadViewModel");
                                }
                            }
                            break;
                        case 36:
                            C85464Nm r34 = this.A0C;
                            if (r34.A01.Bgg()) {
                                Activity activity = r34.A00;
                                activity.startActivity(AnonymousClass1LU.A0a(activity, r34.A02));
                                break;
                            }
                            break;
                        default:
                            return super.Bze(menuItem);
                    }
            }
            return true;
        } else {
            this.A09.Bjg();
            return true;
        }
    }

    public boolean C1Y(Menu menu) {
        boolean z;
        AnonymousClass1E7 A0K2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("contactconversationmenu/onprepareoptionsmenu ");
        C17900vP.A0o(A10, menu.size());
        boolean z2 = false;
        if (menu.size() == 0) {
            return false;
        }
        AnonymousClass11S r4 = this.A05;
        AnonymousClass1BI r3 = this.A0G;
        boolean A0O2 = r4.A0O(r3);
        if (!A0O2) {
            A0H(menu.findItem(4));
        }
        if (this.A00.A0H != null) {
            z2 = true;
        }
        C72453Mb.A19(menu, 21, z2);
        if (!A0O2 || (A0K2 = this.A0D.A0K(AnonymousClass3MW.A0g(this.A00))) == null || !A0K2.A0B()) {
            AnonymousClass1E7 r2 = this.A00;
            if (r2.A0H == null && !C22971Dz.A0T(r2.A0J) && (!r4.A0N()) && !C42761yh.A00(r2, this.A0G) && !this.A0H.A03(r2.A0J) && !this.A0L) {
                C53052bu r1 = this.A09;
                if (!r2.A0E() || !C84104Hw.A00(r1.A01)) {
                    z = true;
                    C72453Mb.A19(menu, 22, z);
                }
            }
            z = false;
            C72453Mb.A19(menu, 22, z);
        }
        boolean A0P2 = this.A08.A0P(C22941Dw.A00(r3));
        if (!A0O2 && !this.A0H.A03(r3)) {
            C72453Mb.A19(menu, 23, !A0P2);
        }
        C72453Mb.A19(menu, 24, A0P2);
        return super.C1Y(menu);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77833rZ(X.AnonymousClass01E r42, X.C19880zA r43, X.C19880zA r44, X.C19880zA r45, X.C19880zA r46, X.C19880zA r47, X.C19880zA r48, X.C19880zA r49, X.C84164Ii r50, X.C56322hH r51, X.C84174Ij r52, X.AnonymousClass4PY r53, X.AnonymousClass4JI r54, X.AnonymousClass1FR r55, X.AnonymousClass1KB r56, X.C36361nl r57, X.AnonymousClass11S r58, X.AnonymousClass18O r59, X.C33251iW r60, X.AnonymousClass4ZR r61, X.C196149uX r62, X.C26911Ty r63, X.C37551pj r64, X.C36931oh r65, X.C53052bu r66, X.AnonymousClass1HS r67, X.AnonymousClass1HR r68, X.AnonymousClass1MC r69, X.AnonymousClass1M2 r70, X.C24671Lf r71, X.AnonymousClass1PM r72, X.C24921Me r73, X.C57472j8 r74, X.C37311pJ r75, X.C108885cS r76, X.C54202dl r77, X.C32951i1 r78, X.C170018ny r79, X.AnonymousClass11C r80, X.C19830z4 r81, X.C18000vb r82, X.C88654aI r83, X.AnonymousClass1Q1 r84, X.AnonymousClass1CJ r85, X.C25181Nf r86, X.AnonymousClass1E7 r87, X.AnonymousClass1RK r88, X.C42221xp r89, X.C18030ve r90, X.AnonymousClass12L r91, X.AnonymousClass18K r92, X.C84934Lk r93, X.C25191Ng r94, X.C36511o1 r95, X.AnonymousClass1MB r96, X.AnonymousClass1BI r97, X.C37701pz r98, X.AnonymousClass1QO r99, X.C85754Op r100, X.AnonymousClass1Nb r101, X.C25831Pu r102, X.AnonymousClass1DC r103, X.AnonymousClass10I r104, X.C190369kp r105, X.AnonymousClass00H r106, X.AnonymousClass00H r107, X.AnonymousClass00H r108, X.AnonymousClass00H r109, X.AnonymousClass00H r110, java.lang.String r111, X.C18140vp r112) {
        /*
            r41 = this;
            r6 = r41
            r36 = r98
            r2 = r97
            r34 = r94
            r4 = r91
            r5 = r90
            r7 = r42
            r37 = r101
            r13 = r55
            r14 = r56
            r15 = r58
            r16 = r59
            r17 = r60
            r18 = r61
            r19 = r67
            r20 = r69
            r12 = r52
            r11 = r51
            r10 = r50
            r40 = r106
            r9 = r47
            r0 = r104
            r38 = r102
            r8 = r43
            r21 = r71
            r1 = r76
            r23 = r78
            r24 = r80
            r25 = r81
            r26 = r82
            r27 = r84
            r28 = r85
            r29 = r86
            r3 = r87
            r31 = r88
            r22 = r1
            r30 = r3
            r32 = r5
            r33 = r4
            r35 = r2
            r39 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r6.A0F = r5
            r6.A05 = r15
            r6.A0b = r0
            r0 = r92
            r6.A0W = r0
            r6.A0G = r4
            r0 = r57
            r6.A0O = r0
            r0 = r107
            r6.A0d = r0
            r0 = r103
            r6.A0a = r0
            r0 = r73
            r6.A0R = r0
            r0 = r105
            r6.A0c = r0
            r0 = r64
            r6.A08 = r0
            r0 = r100
            r6.A0Z = r0
            r0 = r111
            r6.A0f = r0
            r0 = r95
            r6.A0Y = r0
            r0 = r72
            r6.A0Q = r0
            r0 = r89
            r6.A0V = r0
            r0 = r62
            r6.A06 = r0
            r0 = r99
            r6.A0I = r0
            r0 = r63
            r6.A07 = r0
            r0 = r70
            r6.A0D = r0
            r0 = r66
            r6.A09 = r0
            r0 = r108
            r6.A0e = r0
            r0 = r109
            r6.A0J = r0
            r0 = r77
            r6.A0T = r0
            r0 = r44
            r6.A0M = r0
            r0 = r83
            r6.A0U = r0
            r0 = r45
            r6.A0N = r0
            r0 = r46
            r6.A02 = r0
            r0 = r96
            r6.A0H = r0
            r0 = r74
            boolean r0 = r0.A00(r3)
            r6.A0L = r0
            r0 = r93
            r6.A0X = r0
            r0 = r48
            r6.A03 = r0
            r0 = r79
            r6.A0E = r0
            r0 = r65
            r6.A0P = r0
            boolean r0 = X.C22971Dz.A0S(r2)
            r6.A0h = r0
            r0 = r112
            r6.A0g = r0
            r0 = r53
            X.4Nm r0 = r0.A00(r7, r2)
            r6.A0C = r0
            r0 = r75
            r6.A0S = r0
            r0 = r49
            r6.A04 = r0
            r0 = r110
            r6.A0K = r0
            r0 = r68
            r6.A0B = r0
            X.4MJ r2 = new X.4MJ
            r2.<init>(r6, r1)
            r0 = r54
            X.1K2 r0 = r0.A00
            X.10E r0 = r0.A01
            X.00S r0 = r0.ABV
            java.lang.Object r1 = r0.get()
            X.9sx r1 = (X.C195199sx) r1
            X.4ZW r0 = new X.4ZW
            r0.<init>(r7, r1, r2, r3)
            r6.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77833rZ.<init>(X.01E, X.0zA, X.0zA, X.0zA, X.0zA, X.0zA, X.0zA, X.0zA, X.4Ii, X.2hH, X.4Ij, X.4PY, X.4JI, X.1FR, X.1KB, X.1nl, X.11S, X.18O, X.1iW, X.4ZR, X.9uX, X.1Ty, X.1pj, X.1oh, X.2bu, X.1HS, X.1HR, X.1MC, X.1M2, X.1Lf, X.1PM, X.1Me, X.2j8, X.1pJ, X.5cS, X.2dl, X.1i1, X.8ny, X.11C, X.0z4, X.0vb, X.4aI, X.1Q1, X.1CJ, X.1Nf, X.1E7, X.1RK, X.1xp, X.0ve, X.12L, X.18K, X.4Lk, X.1Ng, X.1o1, X.1MB, X.1BI, X.1pz, X.1QO, X.4Op, X.1Nb, X.1Pu, X.1DC, X.10I, X.9kp, X.00H, X.00H, X.00H, X.00H, X.00H, java.lang.String, X.0vp):void");
    }
}
