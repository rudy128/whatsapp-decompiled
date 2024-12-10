package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import java.util.List;

/* renamed from: X.3sm  reason: invalid class name and case insensitive filesystem */
public class C78423sm extends AnonymousClass3uP {
    public C19880zA A00;
    public C125436b4 A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final LinearLayout A08;
    public final TextEmojiLabel A09;
    public final WaTextView A0A;
    public final C37451pZ A0B;
    public final C28931bI A0C;
    public final List A0D = AnonymousClass000.A13();
    public final boolean A0E;

    public void A1u() {
        AnonymousClass3uP.A0h(this, false);
        A01(true);
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A00(int i) {
        int i2;
        LinearLayout linearLayout = this.A08;
        linearLayout.setVisibility(0);
        TextView A0J = AnonymousClass3MW.A0J(linearLayout, 2131433959);
        ImageView A0G = AnonymousClass3MW.A0G(linearLayout, 2131432838);
        Context context = getContext();
        if (i == 1) {
            AnonymousClass3MX.A1B(context, A0G, 2131231800);
            i2 = 2131894694;
        } else {
            AnonymousClass3MX.A1B(context, A0G, 2131232253);
            i2 = 2131894695;
        }
        A0J.setText(i2);
    }

    private void setEnabledForAccessibility(boolean z) {
        LinearLayout linearLayout = this.A07;
        if (z) {
            linearLayout.setImportantForAccessibility(1);
            ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0p;
            if (conversationRowParticipantHeaderMainView != null) {
                conversationRowParticipantHeaderMainView.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        linearLayout.setImportantForAccessibility(4);
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView2 = this.A0p;
        if (conversationRowParticipantHeaderMainView2 != null) {
            conversationRowParticipantHeaderMainView2.setImportantForAccessibility(2);
        }
    }

    public void A1M() {
        if (!this.A05) {
            this.A05 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r4 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r4, A0O, this);
            AnonymousClass10G r2 = r4.A00;
            AnonymousClass3uQ.A16(r2, this);
            AnonymousClass3uQ.A0w(A0n, r4, r2, this);
            AnonymousClass3uQ.A12(r4, r2, this);
            AnonymousClass3uQ.A0y(A0n, r4, this, BE8.A0d(r4));
            AnonymousClass3uQ.A13(r4, r2, this, r4.ABq);
            AnonymousClass3uQ.A0x(A0n, r4, r2, this, r4.AIy);
            C19890zB r1 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A11(r4, r2, this);
            AnonymousClass3uQ.A15(r4, this);
            AnonymousClass3uQ.A0s(r1, A0n, r4, r2, this);
            AnonymousClass3uQ.A0u(r1, r4, r2, A0O, this);
            AnonymousClass3uQ.A0t(r1, A0n, r4, A0O, this);
            AnonymousClass3uQ.A10(r4, r2, this);
            AnonymousClass3uQ.A0z(r4, r2, A0O, this, AnonymousClass3uQ.A0o(r4));
            this.A01 = (C125436b4) A0O.A0A.get();
            this.A00 = r1;
        }
    }

    public /* synthetic */ void A2i() {
        if (BEA.A0O(this.A06).isTouchExplorationEnabled()) {
            boolean z = true;
            if (this.A04) {
                z = false;
            }
            this.A04 = z;
            setEnabledForAccessibility(z);
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(2131166274);
    }

    public List getPollVoteSelectedOptionIds() {
        return this.A02;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass22H);
        this.A0I = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00a2, code lost:
        if ((X.AnonymousClass11P.A01(r1) - r8.A0I) > 2592000000L) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C78423sm(android.content.Context r11, X.C37451pZ r12, X.C108875cR r13, X.AnonymousClass22H r14) {
        /*
            r10 = this;
            r10.<init>(r11, r13, r14)
            r10.A1M()
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r10.A0D = r0
            r10.A0B = r12
            r0 = 2131433962(0x7f0b19ea, float:1.8489724E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r10, r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r10.A06 = r5
            r0 = 2131433927(0x7f0b19c7, float:1.8489654E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.TextEmojiLabel r4 = (com.whatsapp.TextEmojiLabel) r4
            r10.A09 = r4
            X.0ve r0 = r10.A0F
            X.AnonymousClass3Ma.A1L(r0, r4)
            r3 = 0
            r4.setAutoLinkMask(r3)
            r4.setLinksClickable(r3)
            r0 = 2131433939(0x7f0b19d3, float:1.8489678E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.A07 = r0
            r0 = 2131433958(0x7f0b19e6, float:1.8489716E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.A08 = r0
            r0 = 2131431780(0x7f0b1164, float:1.8485299E38)
            X.1bI r2 = X.C28931bI.A00(r10, r0)
            r10.A0C = r2
            r1 = 2
            X.4qq r0 = new X.4qq
            r0.<init>((java.lang.Object) r11, (java.lang.Object) r10, (java.lang.Object) r14, (int) r1)
            r2.A07(r0)
            r0 = 2131436785(0x7f0b24f1, float:1.849545E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r10, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r10.A0A = r0
            X.206 r8 = r10.getFMessage()
            boolean r0 = r8.A0w()
            r9 = 0
            if (r0 == 0) goto L_0x00a5
            X.1CJ r1 = r10.A0E
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            X.1ci r0 = r1.A0A(r0)
            X.2Dk r0 = (X.C46162Dk) r0
            if (r0 == 0) goto L_0x00a4
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x00a4
            X.0ve r2 = r10.A0F
            r1 = 6382(0x18ee, float:8.943E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00a4
            X.11P r1 = r10.A0u
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            long r6 = X.AnonymousClass11P.A01(r1)
            long r0 = r8.A0I
            long r6 = r6 - r0
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
        L_0x00a4:
            r9 = 1
        L_0x00a5:
            r7 = 8
            if (r9 == 0) goto L_0x00f7
            com.whatsapp.WaTextView r0 = r10.A0A
            r0.setVisibility(r7)
        L_0x00ae:
            int r0 = r14.A02
            r10.A00(r0)
            X.AnonymousClass3uP.A0W(r4, r10)
            X.0ve r2 = r10.A0F
            r1 = 2390(0x956, float:3.349E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r10.A0E = r0
            if (r0 != 0) goto L_0x00db
            r10.setEnabledForAccessibility(r3)
            r10.A03 = r3
        L_0x00c9:
            X.0zA r1 = r10.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0126
            r1.A03()
            java.lang.String r0 = "maybeInflateAdditionalRowViews"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00db:
            android.view.accessibility.AccessibilityManager r0 = X.BEA.A0O(r5)
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x00c9
            r0 = 1
            r10.A03 = r0
            r0 = 2131886258(0x7f1200b2, float:1.940709E38)
            X.AnonymousClass1Y5.A02(r5, r0)
            r10.setEnabledForAccessibility(r3)
            r0 = 46
            X.C89904dD.A00(r5, r10, r0)
            goto L_0x00c9
        L_0x00f7:
            com.whatsapp.WaTextView r6 = r10.A0A
            r0 = 27
            X.C90074dU.A01(r6, r10, r11, r0)
            X.0ve r2 = r10.A0F
            r1 = 1948(0x79c, float:2.73E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x010b
            r7 = 0
        L_0x010b:
            r6.setVisibility(r7)
            X.0zA r1 = r10.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0120
            r1.A03()
            java.lang.String r0 = "maybeInitPollViewDetails"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0120:
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r6, r0)
            goto L_0x00ae
        L_0x0126:
            r10.A01(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78423sm.<init>(android.content.Context, X.1pZ, X.5cR, X.22H):void");
    }

    private void A01(boolean z) {
        AnonymousClass22H r4 = (AnonymousClass22H) getFMessage();
        String str = r4.A05;
        if (str != null) {
            setMessageText(str, this.A09, r4);
        }
        A00(r4.A02);
        AnonymousClass7RF r3 = new AnonymousClass7RF(this, r4, 31, z);
        this.A07.setTag(r4.A0v);
        if (!this.A18.A0B(r4.A06)) {
            r3.run();
        } else {
            this.A0c.A02(r4, r3, 67, false);
        }
    }

    public boolean A1Y() {
        if (getFMessage().A0w()) {
            if (!C18020vd.A05(C18040vf.A02, this.A0F, 10412)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2V(X.AnonymousClass206 r5, boolean r6) {
        /*
            r4 = this;
            X.206 r0 = r4.getFMessage()
            r3 = 1
            r1 = 0
            r2 = 0
            if (r5 == r0) goto L_0x0016
            r2 = 1
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0016
            r4.A04 = r1
            android.widget.LinearLayout r1 = r4.A07
            r0 = 4
            r1.setImportantForAccessibility(r0)
        L_0x0016:
            super.A2V(r5, r6)
            if (r6 != 0) goto L_0x0022
            if (r2 == 0) goto L_0x0021
        L_0x001d:
            r3 = 0
        L_0x001e:
            r4.A01(r3)
        L_0x0021:
            return
        L_0x0022:
            if (r2 != 0) goto L_0x001d
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78423sm.A2V(X.206, boolean):void");
    }

    public int getCenteredLayoutId() {
        return 2131624898;
    }

    public int getIncomingLayoutId() {
        return 2131624898;
    }

    public int getOutgoingLayoutId() {
        return 2131624901;
    }
}
