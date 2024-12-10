package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.favorite.FavoriteManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public class C34091ju implements AnonymousClass02H {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public MenuItem A0F;
    public MenuItem A0G;
    public MenuItem A0H;
    public MenuItem A0I;
    public MenuItem A0J;
    public MenuItem A0K;
    public MenuItem A0L;
    public MenuItem A0M;
    public MenuItem A0N;
    public MenuItem A0O;
    public final C34111jw A0P = new C34111jw();
    public final /* synthetic */ ConversationsFragment A0Q;

    public C34091ju(ConversationsFragment conversationsFragment) {
        this.A0Q = conversationsFragment;
    }

    public static void A00(C34091ju r1, List list, boolean z) {
        r1.A0Q.A1u.A0A(0, list, z);
    }

    private void A01(boolean z) {
        String str;
        Intent A1E;
        ConversationsFragment conversationsFragment = this.A0Q;
        AnonymousClass1BI A052 = ConversationsFragment.A05(conversationsFragment);
        conversationsFragment.A2C = A052;
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(A052);
        ConversationsFragment.A0h(conversationsFragment, 2);
        if (A012 != null) {
            if (z) {
                str = "chat_list_block";
            } else {
                str = "chat_list_noinsub_block";
            }
            boolean A0P2 = ((C37551pj) conversationsFragment.A2m.get()).A0P(A012);
            AnonymousClass1M9 r02 = conversationsFragment.A18;
            if (A0P2) {
                AnonymousClass1E7 A0H2 = r02.A0H(A012);
                ((C37551pj) conversationsFragment.A2m.get()).A0H(conversationsFragment.A1D(), A0H2, str, false);
                return;
            }
            AnonymousClass1E7 A0H3 = r02.A0H(A012);
            AnonymousClass1FL A1D = conversationsFragment.A1D();
            if (A0H3.A0E()) {
                conversationsFragment.A3c.get();
                A1E = C83864Gy.A00(A1D, A012, str, false, true, false, false, true, false);
            } else if (A0H3.A0C()) {
                conversationsFragment.A3c.get();
                A1E = AnonymousClass1LU.A1E(A1D, A012, str, false, true, false, false);
            } else {
                AnonymousClass4SO BGI = conversationsFragment.A14.BGI(A012, str);
                BGI.A04 = true;
                BGI.A05 = false;
                C123736Vq.A00(BGI.A00()).A2C(conversationsFragment.A1E(), (String) null);
                return;
            }
            A1D.startActivity(A1E);
        }
    }

    public boolean BqR(Menu menu, AnonymousClass02B r19) {
        MenuItem menuItem;
        RecyclerView recyclerView;
        Menu menu2 = menu;
        C137526vb.A00(menu2);
        ConversationsFragment conversationsFragment = this.A0Q;
        if (((C28391a8) conversationsFragment.A3D.get()).A02() && (recyclerView = conversationsFragment.A0O) != null) {
            recyclerView.setAlpha(0.5f);
        }
        C34111jw r8 = this.A0P;
        r8.A00.clear();
        this.A09 = menu2.add(0, 2131432566, 0, (CharSequence) null).setIcon(2131232229);
        this.A0E = menu2.add(0, 2131432574, 0, (CharSequence) null).setIcon(2131231643);
        this.A03 = menu2.add(0, 2131432551, 0, (CharSequence) null).setIcon(AnonymousClass4aX.A02(conversationsFragment.A14(), 2131231719, AnonymousClass1YL.A00(conversationsFragment.A1n(), 2130971957, 2131103410)));
        this.A0L = menu2.add(0, 2131432571, 0, (CharSequence) null).setIcon(AnonymousClass4aX.A02(conversationsFragment.A14(), 2131231719, AnonymousClass1YL.A00(conversationsFragment.A1n(), 2130971957, 2131103410)));
        this.A06 = menu2.add(0, 2131432554, 0, (CharSequence) null).setIcon(2131231847);
        this.A08 = menu2.add(0, 2131432563, 0, (CharSequence) null).setIcon(2131232146);
        this.A0D = menu2.add(0, 2131432573, 0, (CharSequence) null).setIcon(2131232147);
        MenuItem add = menu2.add(0, 2131432549, 0, (CharSequence) null);
        this.A05 = add;
        boolean isVisible = add.isVisible();
        MenuItem menuItem2 = this.A05;
        if (isVisible) {
            menuItem2.setIcon(AnonymousClass4aX.A02(conversationsFragment.A14(), 2131231671, AnonymousClass1YL.A00(conversationsFragment.A1n(), 2130971957, 2131103410)));
        } else {
            menuItem2.setIcon(2131231671);
        }
        MenuItem add2 = menu2.add(0, 2131432569, 0, (CharSequence) null);
        this.A0C = add2;
        boolean isVisible2 = add2.isVisible();
        MenuItem menuItem3 = this.A0C;
        if (isVisible2) {
            menuItem3.setIcon(AnonymousClass4aX.A02(conversationsFragment.A14(), 2131232368, AnonymousClass1YL.A00(conversationsFragment.A1n(), 2130971957, 2131103410)));
        } else {
            menuItem3.setIcon(2131232368);
        }
        conversationsFragment.A3W.get();
        this.A0A = menu2.add(0, 2131432564, 0, (CharSequence) null).setIcon(2131232229);
        this.A0F = menu2.add(0, 2131432565, 0, (CharSequence) null).setIcon(2131231643);
        this.A07 = menu2.add(0, 2131432557, 0, (CharSequence) null).setIcon(2131232077);
        this.A01 = menu2.add(0, 2131432553, 0, 2131886507).setIcon(2131232173);
        this.A0O = menu2.add(0, 2131432552, 0, 2131888770).setIcon(2131231833);
        this.A00 = menu2.add(0, 2131432546, 0, 2131898687).setIcon(2131231833);
        this.A0B = menu2.add(0, 2131432560, 0, 2131891882).setIcon(2131232236);
        this.A0G = menu2.add(0, 2131432561, 0, 2131891883).setIcon(2131232371);
        this.A0K = menu2.add(0, 2131432568, 0, 2131895596).setIcon(2131232223);
        this.A0N = menu2.add(0, 2131432572, 0, 2131888162).setIcon(2131231790);
        this.A0I = menu2.add(0, 2131432558, 0, 2131888159).setIcon(2131231787);
        if (((C28391a8) conversationsFragment.A3D.get()).A03()) {
            this.A02 = menu2.add(0, 2131432548, 0, 2131886518).setIcon(2131233299);
            this.A0J = menu2.add(0, 2131432567, 0, 2131895126).setIcon(2131233298);
        }
        if (((C38501rO) conversationsFragment.A3I.get()).A07()) {
            conversationsFragment.A3I.get();
            conversationsFragment.A3I.get();
            MenuItem add3 = menu2.add(0, 2131432591, 0, 2131891989);
            C18000vb r2 = conversationsFragment.A1t;
            Resources resources = conversationsFragment.A14().getResources();
            conversationsFragment.A3I.get();
            this.A0H = add3.setIcon(new C74743cP(resources.getDrawable(2131233505), r2));
        }
        this.A04 = menu2.add(0, 2131432550, 0, 2131887184).setIcon(2131231719);
        this.A0M = menu2.add(0, 2131432570, 0, 2131897290).setIcon(2131231719);
        this.A09.setShowAsAction(2);
        this.A0E.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A0C.setShowAsAction(2);
        this.A06.setShowAsAction(2);
        this.A08.setShowAsAction(2);
        this.A0D.setShowAsAction(2);
        this.A03.setShowAsAction(2);
        this.A0L.setShowAsAction(2);
        this.A0A.setShowAsAction(8);
        this.A0F.setShowAsAction(8);
        this.A07.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0O.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A0B.setShowAsAction(8);
        this.A0G.setShowAsAction(8);
        if (!(!((C28391a8) conversationsFragment.A3D.get()).A03() || (menuItem = this.A02) == null || this.A0J == null)) {
            menuItem.setShowAsAction(8);
            this.A0J.setShowAsAction(8);
        }
        this.A0K.setShowAsAction(8);
        this.A0N.setShowAsAction(8);
        this.A0I.setShowAsAction(8);
        this.A04.setShowAsAction(8);
        this.A0M.setShowAsAction(8);
        conversationsFragment.A3W.get();
        r8.BBp(2131432564);
        r8.BBp(2131432565);
        r8.BBp(2131432557);
        r8.BBp(2131432553);
        r8.BBp(2131432552);
        r8.BBp(2131432546);
        r8.BBp(2131432560);
        r8.BBp(2131432561);
        r8.BBp(2131432568);
        r8.BBp(2131432572);
        r8.BBp(2131432558);
        r8.BBp(2131432548);
        r8.BBp(2131432567);
        r8.BBp(2131432550);
        r8.BBp(2131432570);
        if (C18020vd.A05(C18040vf.A02, conversationsFragment.A25, 8841)) {
            r8.BBp(2131432559);
        }
        if (((C38501rO) conversationsFragment.A3I.get()).A07()) {
            conversationsFragment.A3I.get();
            r8.BBp(2131432591);
        }
        return true;
    }

    public void BrJ(AnonymousClass02B r3) {
        RecyclerView recyclerView;
        ConversationsFragment conversationsFragment = this.A0Q;
        ConversationsFragment.A0g(conversationsFragment, 2);
        conversationsFragment.A0M = null;
        ConversationsFragment.A0p(conversationsFragment, true);
        if (((C28391a8) conversationsFragment.A3D.get()).A02() && (recyclerView = conversationsFragment.A0O) != null) {
            recyclerView.setAlpha(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0327, code lost:
        if (r1 == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x038b, code lost:
        if (r21 == false) goto L_0x038d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0391, code lost:
        if (r21 == false) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x042b, code lost:
        if (((X.C25811Ps) r3.A2o.get()).A0D(r8) != false) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0431, code lost:
        if (r11 == false) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0447, code lost:
        if (r0 != false) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x044d, code lost:
        if (r11 != false) goto L_0x044f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x046d, code lost:
        if (r3.A2K(r3.A3g) == false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0479, code lost:
        if (r3.A2K(r3.A3g) == false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x055d, code lost:
        if (r1.A2R() != false) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x010c, code lost:
        if (r0 != null) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0573, code lost:
        if (r19 != false) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0586, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A25, 10455) == false) goto L_0x0588;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x058e, code lost:
        if (r6 == false) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0599, code lost:
        if (r6 == false) goto L_0x059b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0137, code lost:
        if (r5 != 1) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x047e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0526  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x05d9  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0311  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C1U(android.view.Menu r28, X.AnonymousClass02B r29) {
        /*
            r27 = this;
            r4 = r27
            com.whatsapp.conversationslist.ConversationsFragment r3 = r4.A0Q
            boolean r0 = r3.A1b()
            r2 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "conversations/actionmode/fragment is not attached to activity."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0011:
            java.util.LinkedHashSet r0 = r3.A3g
            r6 = 1
            r8 = r29
            if (r0 == 0) goto L_0x06c2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x06c2
            com.whatsapp.conversationslist.ConversationsFragment.A0p(r3, r2)
            java.util.LinkedHashSet r0 = r3.A3g
            int r5 = r0.size()
            X.00H r0 = r3.A32
            java.lang.Object r1 = r0.get()
            X.1kb r1 = (X.C34511kb) r1
            java.util.LinkedHashSet r0 = r3.A3g
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "conversations/prepareActionModeForParentGroup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.MenuItem r1 = r4.A05
            r0 = 2131887490(0x7f120582, float:1.9409589E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0C
            r0 = 2131887499(0x7f12058b, float:1.9409607E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A07
            r0 = 2131890178(0x7f121002, float:1.941504E38)
            r1.setTitle(r0)
            java.util.LinkedHashSet r0 = r3.A3g
            int r0 = r0.size()
            r1 = 0
            if (r0 != r6) goto L_0x0068
            r1 = 1
        L_0x0068:
            android.view.MenuItem r5 = r4.A0O
            r0 = 2131888255(0x7f12087f, float:1.941114E38)
            r5.setTitle(r0)
            android.view.MenuItem r7 = r4.A0O
            android.content.Context r5 = r3.A14()
            r0 = 2131232010(0x7f08050a, float:1.8080117E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A01(r5, r0)
            r7.setIcon(r0)
            android.view.MenuItem r0 = r4.A06
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A07
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0K
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A05
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0C
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0N
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0I
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A04
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0M
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A03
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0L
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A09
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0E
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0A
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0F
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A08
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0D
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0B
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0G
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0J
            if (r0 == 0) goto L_0x00e6
            r0.setVisible(r2)
        L_0x00e6:
            android.view.MenuItem r0 = r4.A02
            if (r0 == 0) goto L_0x00ed
            r0.setVisible(r2)
        L_0x00ed:
            android.view.MenuItem r0 = r4.A01
            r0.setVisible(r2)
            android.view.MenuItem r0 = r4.A0O
            r0.setVisible(r1)
            android.view.MenuItem r0 = r4.A00
            r0.setVisible(r2)
            X.00H r0 = r3.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0111
            android.view.MenuItem r0 = r4.A0H
            if (r0 == 0) goto L_0x0111
        L_0x010e:
            r0.setVisible(r2)
        L_0x0111:
            X.1jw r1 = r4.A0P
            X.1FL r0 = r3.A1D()
            r2 = r28
            r1.A00(r0, r2)
            r0 = 1
            return r0
        L_0x011e:
            X.11S r0 = r3.A0s
            r0.A0I()
            X.1E8 r0 = r0.A0D
            if (r0 == 0) goto L_0x06be
            X.1BI r1 = r0.A0J
            if (r1 == 0) goto L_0x06be
            java.util.LinkedHashSet r0 = r3.A3g
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x06be
            r26 = 0
            r25 = 0
            if (r5 == r6) goto L_0x013b
        L_0x0139:
            r25 = 1
        L_0x013b:
            X.0vb r0 = r3.A1t
            java.util.Locale r7 = r0.A0N()
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r2] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r7, r0, r1)
            r8.A0B(r0)
            android.view.MenuItem r1 = r4.A05
            if (r5 != r6) goto L_0x0674
            r0 = 2131887492(0x7f120584, float:1.9409593E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0C
            r0 = 2131887501(0x7f12058d, float:1.940961E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A06
            r0 = 2131887494(0x7f120586, float:1.9409597E38)
            r1.setTitle(r0)
            android.view.MenuItem r2 = r4.A07
            X.1CJ r1 = r3.A1v
            X.1BI r0 = com.whatsapp.conversationslist.ConversationsFragment.A05(r3)
            boolean r1 = r1.A0R(r0)
            r0 = 2131887496(0x7f120588, float:1.94096E38)
            if (r1 == 0) goto L_0x0180
            r0 = 2131890178(0x7f121002, float:1.941504E38)
        L_0x0180:
            r2.setTitle(r0)
            android.view.MenuItem r1 = r4.A09
            r0 = 2131887498(0x7f12058a, float:1.9409605E38)
            r2 = 2131887498(0x7f12058a, float:1.9409605E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r4.A0E
            r1 = 2131887503(0x7f12058f, float:1.9409615E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r4.A0A
            r0.setTitle(r2)
            android.view.MenuItem r0 = r4.A0F
            r0.setTitle(r1)
            android.view.MenuItem r1 = r4.A0N
            r0 = 2131888162(0x7f120822, float:1.9410952E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0I
            r0 = 2131888161(0x7f120821, float:1.941095E38)
        L_0x01ad:
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A08
            r0 = 2131891999(0x7f12171f, float:1.9418734E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0D
            r0 = 2131892017(0x7f121731, float:1.941877E38)
            r1.setTitle(r0)
            X.00H r0 = r3.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01e4
            android.view.MenuItem r1 = r4.A02
            if (r1 == 0) goto L_0x01e4
            android.view.MenuItem r0 = r4.A0J
            if (r0 == 0) goto L_0x01e4
            r0 = 2131886518(0x7f1201b6, float:1.9407617E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0J
            r0 = 2131895126(0x7f122356, float:1.9425076E38)
            r1.setTitle(r0)
        L_0x01e4:
            android.view.MenuItem r1 = r4.A03
            r0 = 2131887184(0x7f120450, float:1.9408968E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0L
            r0 = 2131897290(0x7f122bca, float:1.9429465E38)
            r1.setTitle(r0)
            java.util.List r0 = com.whatsapp.conversationslist.ConversationsFragment.A08(r3)
            if (r0 != 0) goto L_0x066e
            r0 = 0
        L_0x01fb:
            r8 = 0
            if (r5 >= r0) goto L_0x01ff
            r8 = 1
        L_0x01ff:
            r0 = 64
            r24 = 0
            if (r5 <= r0) goto L_0x0207
            r24 = 1
        L_0x0207:
            X.00H r0 = r3.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            r2 = 1
            if (r0 != 0) goto L_0x0217
            r2 = 0
        L_0x0217:
            java.util.LinkedHashSet r0 = r3.A3g
            int r0 = r0.size()
            r23 = 0
            if (r0 != r6) goto L_0x0223
            r23 = 1
        L_0x0223:
            java.util.LinkedHashSet r0 = r3.A3g
            int r0 = r0.size()
            r9 = 0
            if (r0 != r6) goto L_0x022d
            r9 = 1
        L_0x022d:
            java.util.LinkedHashSet r1 = r3.A3g
            boolean r7 = r3 instanceof com.whatsapp.conversationslist.InteropConversationsFragment
            if (r7 == 0) goto L_0x063c
            r5 = 0
        L_0x0234:
            java.util.LinkedHashSet r0 = r3.A3g
            java.util.Iterator r13 = r0.iterator()
            r22 = 0
            r21 = 1
            r20 = 0
            r19 = 0
            r14 = 0
            r18 = 0
            r17 = 0
            r11 = 1
            r16 = 1
            r15 = 1
        L_0x024b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0348
            java.lang.Object r10 = r13.next()
            X.1BI r10 = (X.AnonymousClass1BI) r10
            X.1M9 r0 = r3.A18
            X.1E7 r1 = r0.A0H(r10)
            r1.A0B()
            X.1Nd r0 = r3.A1K
            boolean r12 = r0.A0G(r10)
            boolean r0 = X.C22971Dz.A0c(r10)
            if (r0 == 0) goto L_0x0278
            r24 = 1
            r23 = 0
            r9 = 0
            r5 = 0
            r19 = 1
            r14 = 1
            r18 = 1
            r11 = 0
        L_0x0278:
            boolean r0 = X.C22971Dz.A0J(r10)
            if (r0 == 0) goto L_0x028f
            r2 = 0
            r24 = 1
            r23 = 0
            r9 = 0
            r22 = 0
            r21 = 0
            r5 = 0
            r19 = 1
            r14 = 0
            r18 = 0
            r11 = 0
        L_0x028f:
            X.2lf r0 = r1.A0H
            if (r0 != 0) goto L_0x062e
            X.1BI r0 = r1.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 == 0) goto L_0x05e1
            android.view.MenuItem r1 = r4.A0O
            r0 = 2131891715(0x7f121603, float:1.9418158E38)
            r1.setTitle(r0)
            android.view.MenuItem r5 = r4.A0O
            android.content.Context r1 = r3.A14()
            r0 = 2131232010(0x7f08050a, float:1.8080117E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A01(r1, r0)
            r5.setIcon(r0)
            r23 = 0
            r5 = 0
        L_0x02b6:
            r11 = 0
        L_0x02b7:
            X.12L r0 = r3.A26
            boolean r0 = X.C42761yh.A01(r0, r10)
            if (r0 != 0) goto L_0x02c7
            X.1MB r0 = r3.A2B
            boolean r0 = r0.A03(r10)
            if (r0 == 0) goto L_0x02c8
        L_0x02c7:
            r5 = 0
        L_0x02c8:
            X.1CJ r0 = r3.A1v
            boolean r0 = r0.A0R(r10)
            r20 = r20 | r0
            X.1CJ r0 = r3.A1v
            boolean r0 = r0.A0Q(r10)
            r0 = r0 ^ 1
            r14 = r14 | r0
            X.1CJ r0 = r3.A1v
            boolean r0 = r0.A0S(r10)
            r22 = r22 | r0
            if (r7 == 0) goto L_0x05d9
            r0 = 0
        L_0x02e4:
            r21 = r21 & r0
            X.11S r0 = r3.A0s
            boolean r0 = r0.A0O(r10)
            if (r0 != 0) goto L_0x02fc
            X.1Nb r0 = r3.A2R
            X.1yM r0 = r0.A0a(r10)
            boolean r0 = r0.A0A()
            r0 = r0 ^ 1
            r19 = r19 | r0
        L_0x02fc:
            X.1Nb r0 = r3.A2R
            X.1yM r0 = r0.A0a(r10)
            boolean r0 = r0.A0S
            r0 = r0 ^ 1
            r18 = r18 | r0
            X.1CJ r0 = r3.A1v
            int r1 = r0.A03(r10)
            r0 = 0
            if (r1 != 0) goto L_0x0312
            r0 = 1
        L_0x0312:
            r0 = r0 ^ 1
            r24 = r24 | r0
            X.1CJ r0 = r3.A1v
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r0)
            java.lang.Object r0 = r0.get(r10)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 == 0) goto L_0x0329
            boolean r1 = r0.A0o
            r0 = 1
            if (r1 != 0) goto L_0x032a
        L_0x0329:
            r0 = 0
        L_0x032a:
            r17 = r17 | r0
            if (r6 != 0) goto L_0x05d6
            if (r11 != 0) goto L_0x05d6
            if (r2 != 0) goto L_0x05d6
            if (r23 != 0) goto L_0x05d6
            if (r9 != 0) goto L_0x05d6
            if (r5 != 0) goto L_0x05d6
            if (r16 != 0) goto L_0x05d6
            if (r18 == 0) goto L_0x05d6
            if (r19 == 0) goto L_0x05d6
            if (r24 == 0) goto L_0x05d6
            if (r14 == 0) goto L_0x05d6
            r11 = 0
            r15 = 0
            r23 = 0
            r9 = 0
            r5 = 0
        L_0x0348:
            r13 = r14 ^ 1
            if (r22 == 0) goto L_0x05cf
            r14 = 0
        L_0x034d:
            r10 = 0
        L_0x034e:
            if (r14 == 0) goto L_0x036a
            java.util.LinkedHashSet r0 = r3.A3g
            if (r7 != 0) goto L_0x036a
            java.util.Iterator r1 = r0.iterator()
        L_0x0358:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05cc
            java.lang.Object r0 = r1.next()
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = X.C22971Dz.A0J(r0)
            if (r0 == 0) goto L_0x0358
        L_0x036a:
            r12 = 0
        L_0x036b:
            if (r13 == 0) goto L_0x0387
            java.util.LinkedHashSet r0 = r3.A3g
            if (r7 != 0) goto L_0x0387
            java.util.Iterator r1 = r0.iterator()
        L_0x0375:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05c9
            java.lang.Object r0 = r1.next()
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = X.C22971Dz.A0J(r0)
            if (r0 == 0) goto L_0x0375
        L_0x0387:
            r13 = 0
        L_0x0388:
            if (r22 == 0) goto L_0x038d
            r7 = 1
            if (r21 != 0) goto L_0x0393
        L_0x038d:
            r7 = 0
            if (r22 != 0) goto L_0x0393
            r1 = 1
            if (r21 != 0) goto L_0x0394
        L_0x0393:
            r1 = 0
        L_0x0394:
            if (r20 == 0) goto L_0x03a0
            java.util.LinkedHashSet r0 = r3.A3g
            int r14 = r0.size()
            r0 = 1
            if (r14 <= r0) goto L_0x03a0
            r11 = 0
        L_0x03a0:
            android.view.MenuItem r0 = r4.A06
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A07
            r0.setVisible(r11)
            android.view.MenuItem r0 = r4.A0K
            r0.setVisible(r8)
            android.view.MenuItem r0 = r4.A05
            r0.setVisible(r12)
            android.view.MenuItem r0 = r4.A0C
            r0.setVisible(r13)
            android.view.MenuItem r0 = r4.A0N
            r0.setVisible(r7)
            android.view.MenuItem r0 = r4.A0I
            r0.setVisible(r1)
            X.1BI r1 = com.whatsapp.conversationslist.ConversationsFragment.A05(r3)
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r8 = X.C22941Dw.A01(r1)
            if (r8 == 0) goto L_0x05c3
            X.0ve r6 = r3.A25
            r1 = 2290(0x8f2, float:3.209E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x05c3
            boolean r0 = X.C22971Dz.A0J(r8)
            if (r0 != 0) goto L_0x05c3
            X.1M9 r0 = r3.A18
            X.1E7 r1 = r0.A0H(r8)
            r1.A0B()
            X.1yf r0 = r1.A0G
            if (r0 == 0) goto L_0x0400
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0400
            boolean r0 = r1.A0D()
            if (r0 != 0) goto L_0x0400
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x05c3
        L_0x0400:
            X.00H r0 = r3.A2m
            java.lang.Object r0 = r0.get()
            X.1pj r0 = (X.C37551pj) r0
            boolean r12 = r0.A0P(r8)
            X.1Mc r0 = r3.A2X
            boolean r11 = r0.A0A(r8)
            X.11S r0 = r3.A0s
            boolean r6 = r0.A0O(r8)
            if (r12 != 0) goto L_0x042d
            if (r11 == 0) goto L_0x042d
            if (r6 != 0) goto L_0x042d
            X.00H r0 = r3.A2o
            java.lang.Object r0 = r0.get()
            X.1Ps r0 = (X.C25811Ps) r0
            boolean r0 = r0.A0D(r8)
            r7 = 1
            if (r0 == 0) goto L_0x0433
        L_0x042d:
            r7 = 0
            if (r12 == 0) goto L_0x0433
            r1 = 1
            if (r11 != 0) goto L_0x0449
        L_0x0433:
            r1 = 0
            if (r12 != 0) goto L_0x0449
            if (r11 != 0) goto L_0x0449
            if (r6 != 0) goto L_0x0449
            X.00H r0 = r3.A2o
            java.lang.Object r0 = r0.get()
            X.1Ps r0 = (X.C25811Ps) r0
            boolean r0 = r0.A0D(r8)
            r8 = 1
            if (r0 == 0) goto L_0x044f
        L_0x0449:
            r8 = 0
            if (r12 == 0) goto L_0x044f
            r6 = 1
            if (r11 == 0) goto L_0x0450
        L_0x044f:
            r6 = 0
        L_0x0450:
            android.view.MenuItem r0 = r4.A04
            r0.setVisible(r7)
            android.view.MenuItem r0 = r4.A0M
            r0.setVisible(r1)
            android.view.MenuItem r0 = r4.A03
            r0.setVisible(r8)
            android.view.MenuItem r0 = r4.A0L
            r0.setVisible(r6)
            if (r18 == 0) goto L_0x046f
            java.util.LinkedHashSet r0 = r3.A3g
            boolean r0 = r3.A2K(r0)
            r7 = 1
            if (r0 != 0) goto L_0x047b
        L_0x046f:
            r7 = 0
            if (r18 != 0) goto L_0x047b
            java.util.LinkedHashSet r0 = r3.A3g
            boolean r0 = r3.A2K(r0)
            r1 = 1
            if (r0 != 0) goto L_0x047c
        L_0x047b:
            r1 = 0
        L_0x047c:
            if (r8 != 0) goto L_0x05ac
            if (r6 != 0) goto L_0x05ac
            android.view.MenuItem r0 = r4.A09
            r0.setVisible(r7)
            android.view.MenuItem r0 = r4.A0E
            r0.setVisible(r1)
            android.view.MenuItem r0 = r4.A0A
            r6 = 0
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0F
            r0.setVisible(r6)
        L_0x0495:
            if (r15 == 0) goto L_0x0537
            android.view.MenuItem r0 = r4.A08
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0D
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0B
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0G
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A05
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0C
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A09
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0E
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0A
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0F
        L_0x04c6:
            r0.setVisible(r6)
        L_0x04c9:
            X.00H r0 = r3.A3D
            java.lang.Object r0 = r0.get()
            X.1a8 r0 = (X.C28391a8) r0
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0503
            android.view.MenuItem r0 = r4.A02
            if (r0 == 0) goto L_0x0503
            android.view.MenuItem r6 = r4.A0J
            if (r6 == 0) goto L_0x0503
            X.00H r0 = r3.A39
            java.lang.Object r1 = r0.get()
            com.whatsapp.favorite.FavoriteManager r1 = (com.whatsapp.favorite.FavoriteManager) r1
            java.util.LinkedHashSet r0 = r3.A3g
            boolean r0 = r1.A09(r0)
            r6.setVisible(r0)
            android.view.MenuItem r6 = r4.A02
            X.00H r0 = r3.A39
            java.lang.Object r1 = r0.get()
            com.whatsapp.favorite.FavoriteManager r1 = (com.whatsapp.favorite.FavoriteManager) r1
            java.util.LinkedHashSet r0 = r3.A3g
            boolean r0 = r1.A08(r0)
            r6.setVisible(r0)
        L_0x0503:
            android.view.MenuItem r0 = r4.A01
            r0.setVisible(r10)
            android.view.MenuItem r0 = r4.A0O
            r0.setVisible(r9)
            android.view.MenuItem r0 = r4.A00
            r0.setVisible(r5)
            android.view.MenuItem r0 = r4.A0H
            if (r0 == 0) goto L_0x0111
            X.00H r0 = r3.A3I
            java.lang.Object r0 = r0.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0111
            if (r2 == 0) goto L_0x0533
            android.view.MenuItem r1 = r4.A0H
            X.00H r0 = r3.A3I
            r0.get()
            r0 = 2131891989(0x7f121715, float:1.9418714E38)
            r1.setTitle(r0)
        L_0x0533:
            android.view.MenuItem r0 = r4.A0H
            goto L_0x010e
        L_0x0537:
            if (r16 == 0) goto L_0x054c
            android.view.MenuItem r0 = r4.A08
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0D
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0B
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0G
            goto L_0x04c6
        L_0x054c:
            boolean r0 = r3 instanceof com.whatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 == 0) goto L_0x05aa
            X.0z4 r1 = r3.A1s
            boolean r0 = r1.A2Q()
            if (r0 == 0) goto L_0x055f
            boolean r1 = r1.A2R()
            r0 = 1
            if (r1 == 0) goto L_0x0560
        L_0x055f:
            r0 = 0
        L_0x0560:
            r1 = r0 ^ 1
        L_0x0562:
            android.view.MenuItem r0 = r4.A08
            if (r1 == 0) goto L_0x05a1
            if (r26 == 0) goto L_0x056b
            if (r19 == 0) goto L_0x056b
            r6 = 1
        L_0x056b:
            r0.setVisible(r6)
            android.view.MenuItem r1 = r4.A0D
            if (r25 == 0) goto L_0x0575
            r0 = 1
            if (r19 == 0) goto L_0x0576
        L_0x0575:
            r0 = 0
        L_0x0576:
            r1.setVisible(r0)
        L_0x0579:
            if (r17 == 0) goto L_0x0588
            X.0ve r6 = r3.A25
            r1 = 10455(0x28d7, float:1.465E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            r6 = 0
            if (r0 != 0) goto L_0x0589
        L_0x0588:
            r6 = 1
        L_0x0589:
            android.view.MenuItem r1 = r4.A0B
            if (r24 == 0) goto L_0x0590
            r0 = 1
            if (r6 != 0) goto L_0x0591
        L_0x0590:
            r0 = 0
        L_0x0591:
            r1.setVisible(r0)
            android.view.MenuItem r1 = r4.A0G
            if (r24 != 0) goto L_0x059b
            r0 = 1
            if (r6 != 0) goto L_0x059c
        L_0x059b:
            r0 = 0
        L_0x059c:
            r1.setVisible(r0)
            goto L_0x04c9
        L_0x05a1:
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0D
            r0.setVisible(r6)
            goto L_0x0579
        L_0x05aa:
            r1 = 1
            goto L_0x0562
        L_0x05ac:
            r6 = 0
            android.view.MenuItem r0 = r4.A09
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0E
            r0.setVisible(r6)
            android.view.MenuItem r0 = r4.A0A
            r0.setVisible(r7)
            android.view.MenuItem r0 = r4.A0F
            r0.setVisible(r1)
            goto L_0x0495
        L_0x05c3:
            r8 = 0
            r6 = 0
            r7 = 0
            r1 = 0
            goto L_0x0450
        L_0x05c9:
            r13 = 1
            goto L_0x0388
        L_0x05cc:
            r12 = 1
            goto L_0x036b
        L_0x05cf:
            if (r23 == 0) goto L_0x034d
            if (r7 != 0) goto L_0x034d
            r10 = 1
            goto L_0x034e
        L_0x05d6:
            r15 = 0
            goto L_0x024b
        L_0x05d9:
            X.1px r0 = r3.A1Z
            boolean r0 = r0.A03(r10)
            goto L_0x02e4
        L_0x05e1:
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x062c
            android.view.MenuItem r5 = r4.A0O
            X.00H r0 = r3.A32
            java.lang.Object r1 = r0.get()
            X.1kb r1 = (X.C34511kb) r1
            r0 = r10
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r1 = r1.A0R(r0)
            r0 = 2131891001(0x7f121339, float:1.941671E38)
            if (r1 == 0) goto L_0x0600
            r0 = 2131886667(0x7f12024b, float:1.940792E38)
        L_0x0600:
            r5.setTitle(r0)
            android.view.MenuItem r5 = r4.A0O
            android.content.Context r1 = r3.A14()
            r0 = 2131232010(0x7f08050a, float:1.8080117E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A01(r1, r0)
            r5.setIcon(r0)
            X.1MZ r1 = r3.A1z
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r10)
            X.C17960vV.A07(r0)
            boolean r0 = r1.A0J(r0)
            if (r0 == 0) goto L_0x062a
            r6 = 0
        L_0x0625:
            r5 = 0
            r16 = 0
            goto L_0x02b7
        L_0x062a:
            r11 = 0
            goto L_0x0625
        L_0x062c:
            r9 = 0
            goto L_0x0638
        L_0x062e:
            android.view.MenuItem r1 = r4.A0O
            r0 = 2131897875(0x7f122e13, float:1.9430652E38)
            r1.setTitle(r0)
            r6 = r6 & r12
            r5 = 0
        L_0x0638:
            r16 = 0
            goto L_0x02b6
        L_0x063c:
            int r0 = r1.size()
            r5 = 0
            if (r0 != r6) goto L_0x0234
            X.11S r0 = r3.A0s
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0234
            java.util.Iterator r0 = r1.iterator()
            java.lang.Object r1 = r0.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r0 = X.C22971Dz.A0T(r1)
            if (r0 != 0) goto L_0x0234
            X.00H r0 = r3.A2o
            java.lang.Object r0 = r0.get()
            X.1Ps r0 = (X.C25811Ps) r0
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x0234
            r5 = 1
            goto L_0x0234
        L_0x066e:
            int r0 = r0.size()
            goto L_0x01fb
        L_0x0674:
            r0 = 2131887491(0x7f120583, float:1.940959E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0C
            r0 = 2131887500(0x7f12058c, float:1.9409609E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A06
            r0 = 2131887493(0x7f120585, float:1.9409595E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A07
            r0 = 2131887495(0x7f120587, float:1.9409599E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A09
            r0 = 2131887497(0x7f120589, float:1.9409603E38)
            r2 = 2131887497(0x7f120589, float:1.9409603E38)
            r1.setTitle(r0)
            android.view.MenuItem r0 = r4.A0E
            r1 = 2131887502(0x7f12058e, float:1.9409613E38)
            r0.setTitle(r1)
            android.view.MenuItem r0 = r4.A0A
            r0.setTitle(r2)
            android.view.MenuItem r0 = r4.A0F
            r0.setTitle(r1)
            android.view.MenuItem r1 = r4.A0N
            r0 = 2131888160(0x7f120820, float:1.9410947E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r4.A0I
            r0 = 2131888159(0x7f12081f, float:1.9410945E38)
            goto L_0x01ad
        L_0x06be:
            r26 = 1
            goto L_0x0139
        L_0x06c2:
            com.whatsapp.conversationslist.ConversationsFragment.A0p(r3, r6)
            r8.A05()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34091ju.C1U(android.view.Menu, X.02B):boolean");
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r18) {
        AnonymousClass10I r3;
        Runnable akb;
        LinkedHashSet linkedHashSet;
        AnonymousClass10I r32;
        int i;
        AnonymousClass1BI r2;
        AnonymousClass4EF r5;
        AnonymousClass4EF r33;
        Object tag;
        Intent A13;
        AnonymousClass1EC r8;
        int i2;
        Collection collection;
        AnonymousClass1EC r22;
        String str;
        int itemId = menuItem.getItemId();
        ConversationsFragment conversationsFragment = this.A0Q;
        AnonymousClass1MC r4 = conversationsFragment.A16;
        int i3 = 5;
        if (conversationsFragment.A3g.size() == 1) {
            i3 = 1;
        }
        r4.A01 = i3;
        if (itemId == 2131432549) {
            AnonymousClass1EC A062 = ConversationsFragment.A06(conversationsFragment);
            if (A062 != null) {
                ArrayList arrayList = new ArrayList(AnonymousClass2TL.A00(((C34511kb) conversationsFragment.A32.get()).A0B(A062)));
                conversationsFragment.A17.CMf(conversationsFragment.A14(), new AnonymousClass4bC((Object) this, (Object) arrayList, 17), A062, arrayList.size());
            } else {
                ArrayList arrayList2 = new ArrayList(conversationsFragment.A3g);
                if (!arrayList2.isEmpty()) {
                    A00(this, arrayList2, true);
                    conversationsFragment.A2f.CGF(new C70633Bw(this, arrayList2, 17));
                }
            }
            i2 = 0;
        } else {
            if (itemId == 2131432569) {
                ArrayList arrayList3 = new ArrayList(conversationsFragment.A3g);
                ConversationsFragment.A0h(conversationsFragment, 0);
                C38231qw r1 = conversationsFragment.A1m;
                if (r1 != null) {
                    r1.BbU().post(new C70633Bw(this, arrayList3, 18));
                }
                if (conversationsFragment.A1s.A2Q()) {
                    int size = arrayList3.size();
                    conversationsFragment.A2F(conversationsFragment.A14().getResources().getQuantityString(2131755079, size, new Object[]{Integer.valueOf(size)}), conversationsFragment.A1H(2131897301), new C90014dO(this, arrayList3, 13));
                    return true;
                }
            } else if (itemId == 2131432554) {
                AnonymousClass1BI A052 = ConversationsFragment.A05(conversationsFragment);
                conversationsFragment.A2C = A052;
                if (A052 != null) {
                    C37681px r34 = conversationsFragment.A1Z;
                    r34.A08.A01(A052, new AnonymousClass3AM(conversationsFragment.A0I, r34, A052));
                    return true;
                }
                AnonymousClass1GP r23 = conversationsFragment.A0I;
                if (!(r23 == null || conversationsFragment.A3g.size() == 0)) {
                    AnonymousClass3AL r6 = new AnonymousClass3AL(r23, this);
                    C36741oO r52 = conversationsFragment.A2b;
                    C49222Pq r35 = new C49222Pq(r52.A02, (C72323Lm) r6, (Set) conversationsFragment.A3g);
                    r52.A03.CGD(r35, new Void[0]);
                    r52.A00.A0K(new AnonymousClass7RD(r35, r6, 36), 500);
                    return true;
                }
            } else if (itemId == 2131432557) {
                AnonymousClass1GP r42 = conversationsFragment.A0I;
                if (r42 != null) {
                    LinkedHashSet linkedHashSet2 = conversationsFragment.A3g;
                    Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
                    C18070vi.A0d(linkedHashSet2, 0);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object next : linkedHashSet2) {
                        if (next instanceof AnonymousClass1EC) {
                            arrayList4.add(next);
                        }
                    }
                    Set A12 = C29431cG.A12(arrayList4);
                    if (conversationsFragment.A3f == AnonymousClass00R.A01) {
                        r22 = ConversationsFragment.A06(conversationsFragment);
                        if (r22 == null) {
                            str = "ConversationsFragment/bad selectionMode state/null jid";
                        }
                        conversationsFragment.A17.BP0(r22).A2F(r42, "conversations_dialog_fragment_tag");
                        return true;
                    }
                    AnonymousClass1BI A053 = ConversationsFragment.A05(conversationsFragment);
                    if (conversationsFragment.A1v.A0R(A053)) {
                        r22 = ((C34511kb) conversationsFragment.A32.get()).A05((AnonymousClass1EC) A053);
                        if (r22 == null) {
                            str = "ConversationsFragment/selected CAG has no parent";
                        }
                        conversationsFragment.A17.BP0(r22).A2F(r42, "conversations_dialog_fragment_tag");
                        return true;
                    }
                    ProgressDialogFragment A002 = ProgressDialogFragment.A00(2131894782, 2131895077);
                    A002.A2C(r42, "count_progress");
                    AnonymousClass10I r24 = conversationsFragment.A2f;
                    C34591kk r14 = conversationsFragment.A22;
                    r24.CGD(new AnonymousClass2PS(new C91224fL(r42, A002, A12, 0), conversationsFragment, (C34511kb) conversationsFragment.A32.get(), r14, A12), new Object[0]);
                    return true;
                    Log.e(str);
                    return true;
                }
            } else if (itemId == 2131432563) {
                AnonymousClass1BI A054 = ConversationsFragment.A05(conversationsFragment);
                conversationsFragment.A2C = A054;
                if (A054 != null) {
                    collection = Collections.singleton(A054);
                } else {
                    collection = conversationsFragment.A3g;
                }
                AnonymousClass4Z1.A02(C32961i2.CHAT_LIST_SCREEN, collection).A2C(conversationsFragment.A1F(), (String) null);
                return true;
            } else {
                if (itemId == 2131432573) {
                    linkedHashSet = new LinkedHashSet(conversationsFragment.A3g);
                    ConversationsFragment.A0h(conversationsFragment, 1);
                    r32 = conversationsFragment.A2f;
                    i = 15;
                } else if (itemId == 2131432551 || itemId == 2131432571) {
                    A01(false);
                    return true;
                } else if (itemId == 2131432550 || itemId == 2131432570) {
                    A01(true);
                    return true;
                } else if (itemId == 2131432566 || itemId == 2131432564) {
                    HashSet hashSet = new HashSet(conversationsFragment.A3g);
                    Set A0f = conversationsFragment.A2R.A0f();
                    hashSet.removeAll(A0f);
                    int size2 = hashSet.size();
                    if (A0f.size() + size2 > 3) {
                        C37691py r43 = conversationsFragment.A1U;
                        r3 = r43.A05;
                        akb = new C70633Bw(r43, A0f, 5);
                    } else {
                        ConversationsFragment.A0h(conversationsFragment, 1);
                        r3 = conversationsFragment.A2f;
                        akb = new C21470Akb((Object) this, size2, 44, (Object) hashSet);
                    }
                    r3.CGF(akb);
                    return true;
                } else if (itemId == 2131432574 || itemId == 2131432565) {
                    linkedHashSet = new LinkedHashSet(conversationsFragment.A3g);
                    ConversationsFragment.A0h(conversationsFragment, 1);
                    r32 = conversationsFragment.A2f;
                    i = 16;
                } else if (itemId == 2131432553) {
                    AnonymousClass1BI A055 = ConversationsFragment.A05(conversationsFragment);
                    conversationsFragment.A2C = A055;
                    if (A055 != null) {
                        conversationsFragment.A0v.A05(conversationsFragment.A18.A0H(A055));
                    }
                    i2 = 2;
                } else {
                    if (itemId == 2131432552) {
                        AnonymousClass1BI A056 = ConversationsFragment.A05(conversationsFragment);
                        conversationsFragment.A2C = A056;
                        if (A056 != null) {
                            AnonymousClass1E7 A0H2 = conversationsFragment.A18.A0H(A056);
                            ConversationsFragment.A0h(conversationsFragment, 2);
                            if (A0H2.A0H != null) {
                                AnonymousClass1FL A1D = conversationsFragment.A1D();
                                A1D.startActivity(((AnonymousClass1LU) conversationsFragment.A3c.get()).A1v(A1D, A0H2, 12));
                                return true;
                            }
                            boolean A0N2 = C22971Dz.A0N(A0H2.A0J);
                            AnonymousClass1FL A1D2 = conversationsFragment.A1D();
                            if (A0N2) {
                                conversationsFragment.A3c.get();
                                A13 = AnonymousClass1LU.A12(A1D2, A0H2.A0J, true);
                            } else {
                                if (A0H2.A0F() && (r8 = (AnonymousClass1EC) A0H2.A06(AnonymousClass1EC.class)) != null) {
                                    if (((C34511kb) conversationsFragment.A32.get()).A0Q(r8)) {
                                        conversationsFragment.A17.CAo(A1D2, A1D2.findViewById(16908290), r8);
                                        return true;
                                    }
                                    AnonymousClass1EC A057 = ((C34511kb) conversationsFragment.A32.get()).A05(r8);
                                    if (A057 != null && conversationsFragment.A1v.A0R(r8)) {
                                        conversationsFragment.A17.CAq(A1D2, A1D2.findViewById(16908290), A057);
                                        return true;
                                    }
                                }
                                conversationsFragment.A3c.get();
                                A13 = AnonymousClass1LU.A13(A1D2, A0H2.A0J, true, false, true);
                                C60442o2.A00(A13, conversationsFragment.A1q, A1D2.getClass().getSimpleName());
                            }
                            A1D2.startActivity(A13, (Bundle) null);
                            return true;
                        }
                    } else if (itemId == 2131432546) {
                        AnonymousClass1BI A058 = ConversationsFragment.A05(conversationsFragment);
                        conversationsFragment.A2C = A058;
                        if (A058 != null) {
                            AnonymousClass1E7 A0H3 = conversationsFragment.A18.A0H(A058);
                            if (C18020vd.A05(C18040vf.A02, conversationsFragment.A25, 5868)) {
                                conversationsFragment.A1G.A01(conversationsFragment.A1D(), new C94284kN(A0H3, this, 2), 9);
                                return true;
                            }
                            CreateOrAddToContactsDialog.A00(A0H3, conversationsFragment.A0s.A0O(A0H3.A0J)).A2C(conversationsFragment.A1E(), (String) null);
                            return true;
                        }
                    } else {
                        if (itemId == 2131432560) {
                            conversationsFragment.A1J.A03(conversationsFragment.A3g);
                        } else if (itemId == 2131432561) {
                            Iterator it = conversationsFragment.A3g.iterator();
                            while (it.hasNext()) {
                                AnonymousClass1BI r25 = (AnonymousClass1BI) it.next();
                                if (!C22971Dz.A0N(r25) && !C22971Dz.A0c(r25)) {
                                    conversationsFragment.A1J.A02(r25, true);
                                }
                            }
                        } else if (itemId == 2131432548) {
                            ((FavoriteManager) conversationsFragment.A39.get()).A06(conversationsFragment.A14().getResources().getString(2131886531), conversationsFragment.A14().getResources().getString(2131890289), new ArrayList(conversationsFragment.A3g), 3);
                        } else if (itemId == 2131432567) {
                            ArrayList arrayList5 = new ArrayList(conversationsFragment.A3g);
                            C36901oe r12 = conversationsFragment.A0k;
                            View A17 = conversationsFragment.A17();
                            C37801q9 A1G = conversationsFragment.A1G();
                            AnonymousClass10E r53 = r12.A00.A02;
                            ((FavoriteManager) conversationsFragment.A39.get()).A05(new C98324qw(A17, A1G, C000200d.A00(r53.AAp), C000200d.A00(r53.A4J), (C18600wl) r53.A9E.get(), (AnonymousClass1OX) r53.A9C.get()), arrayList5, 3);
                        } else if (itemId == 2131432568) {
                            conversationsFragment.A3i.clear();
                            if (conversationsFragment.A1m != null) {
                                for (int i4 = 0; i4 < conversationsFragment.A1m.BbU().getChildCount(); i4++) {
                                    View childAt = conversationsFragment.A1m.BbU().getChildAt(i4);
                                    if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof C42071xZ))) {
                                        C42071xZ r36 = (C42071xZ) tag;
                                        AnonymousClass1BI BTb = r36.A0B.BTb();
                                        if (!conversationsFragment.A3g.contains(BTb) && !((C34511kb) conversationsFragment.A32.get()).A0Q(BTb)) {
                                            conversationsFragment.A3g.add(BTb);
                                            r36.A0J(false, 2);
                                            r36.A0L(true, true);
                                        }
                                    }
                                }
                            }
                            List<C39621tN> A082 = ConversationsFragment.A08(conversationsFragment);
                            if (A082 != null) {
                                for (C39621tN BTb2 : A082) {
                                    AnonymousClass1BI BTb3 = BTb2.BTb();
                                    if (!conversationsFragment.A3g.contains(BTb3) && !C22971Dz.A0c(BTb3)) {
                                        conversationsFragment.A3g.add(BTb3);
                                    }
                                }
                            }
                            if (conversationsFragment.A0M != null) {
                                int size3 = conversationsFragment.A3g.size();
                                conversationsFragment.A0M.A0B(String.format(conversationsFragment.A1t.A0N(), "%d", new Object[]{Integer.valueOf(size3)}));
                                conversationsFragment.A0M.A06();
                            }
                            if (!conversationsFragment.A3g.isEmpty()) {
                                conversationsFragment.A3f = AnonymousClass00R.A0C;
                                AnonymousClass1Y5.A00(conversationsFragment.A1D(), conversationsFragment.A1o, conversationsFragment.A14().getResources().getQuantityString(2131755256, conversationsFragment.A3g.size(), new Object[]{Integer.valueOf(conversationsFragment.A3g.size())}));
                                return true;
                            }
                        } else if (itemId == 2131432572) {
                            conversationsFragment.A2C = ConversationsFragment.A05(conversationsFragment);
                            ((C31191fA) conversationsFragment.A2x.get()).A00 = true;
                            if (conversationsFragment.A1B() instanceof AnonymousClass1FY) {
                                C31191fA r54 = (C31191fA) conversationsFragment.A2x.get();
                                AnonymousClass1FY r44 = (AnonymousClass1FY) conversationsFragment.A1B();
                                AnonymousClass1BI r13 = conversationsFragment.A2C;
                                if (r13 != null) {
                                    r33 = new C76833oV(r13);
                                } else {
                                    r33 = new C76843oW(conversationsFragment.A3g);
                                }
                                r54.A0A(r44, r33, conversationsFragment.A4D, 4);
                                return true;
                            }
                        } else if (itemId == 2131432558) {
                            conversationsFragment.A2C = ConversationsFragment.A05(conversationsFragment);
                            if (conversationsFragment.A1B() instanceof AnonymousClass1FY) {
                                LinkedHashSet linkedHashSet3 = conversationsFragment.A3g;
                                if (linkedHashSet3.iterator().hasNext()) {
                                    r2 = (AnonymousClass1BI) linkedHashSet3.iterator().next();
                                } else {
                                    r2 = null;
                                }
                                C31191fA r37 = (C31191fA) conversationsFragment.A2x.get();
                                AnonymousClass1FY r45 = (AnonymousClass1FY) conversationsFragment.A1B();
                                AnonymousClass1BI r15 = conversationsFragment.A2C;
                                if (r15 != null) {
                                    r5 = new C76853oX(r15);
                                } else {
                                    r5 = new C76863oY(conversationsFragment.A3g);
                                }
                                r37.A0C(r45, r5, conversationsFragment.A4E, r2, 1);
                                return true;
                            }
                        } else {
                            conversationsFragment.A3I.get();
                            if (itemId != 2131432591 || !((C38501rO) conversationsFragment.A3I.get()).A07()) {
                                C19880zA r16 = conversationsFragment.A0b;
                                if (r16.A07()) {
                                    r16.A03();
                                    throw new NullPointerException("getMenuItemChatAssignmentId");
                                }
                            } else {
                                conversationsFragment.A2C = ConversationsFragment.A05(conversationsFragment);
                                List<Jid> A0q = C29431cG.A0q(conversationsFragment.A3g);
                                for (Jid A012 : A0q) {
                                    C22941Dw r17 = UserJid.Companion;
                                    if (((C37551pj) conversationsFragment.A2m.get()).A0P(C22941Dw.A01(A012))) {
                                        conversationsFragment.A0r.A08(2131897280, 0);
                                        return true;
                                    }
                                }
                                ((C38501rO) conversationsFragment.A3I.get()).A06(conversationsFragment.A1D().A03.A00.A03, 4, A0q, new C99264sX(A0q, this, 2));
                                return true;
                            }
                        }
                        ConversationsFragment.A0h(conversationsFragment, 1);
                        return true;
                    }
                    return false;
                }
                r32.CGF(new C70633Bw(this, linkedHashSet, i));
                return true;
            }
            return true;
        }
        ConversationsFragment.A0h(conversationsFragment, i2);
        return true;
    }
}
