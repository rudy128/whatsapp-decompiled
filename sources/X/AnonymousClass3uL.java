package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3uL  reason: invalid class name */
public abstract class AnonymousClass3uL extends AnonymousClass3tU {
    public View A00;
    public C19880zA A01;
    public C88644aH A02;
    public C219217x A03;
    public C86324Re A04;
    public C32861hs A05;
    public C32431hB A06;
    public C139246yW A07;
    public AnonymousClass00H A08;
    public Boolean A09;
    public boolean A0A = false;
    public TextEmojiLabel A0B;
    public final C38471rL A0C = new C825048f(this, 11);
    public final C38471rL A0D = new C825048f(this, 9);
    public final C38471rL A0E = new C825048f(this, 10);
    public final C38471rL A0F = new C825048f(this, 12);
    public final C108645c3 A0G;

    public static void A0P(View view, View view2, C28931bI r9, C28931bI r10, boolean z, boolean z2) {
        A0Q(view, view2, r9, r10, z, z2, false, false);
    }

    public static void A0R(ConversationRowMediaControlView conversationRowMediaControlView, boolean z, boolean z2) {
        ConversationRowMediaControlView conversationRowMediaControlView2 = conversationRowMediaControlView;
        A0P(conversationRowMediaControlView2, conversationRowMediaControlView2.A00, conversationRowMediaControlView.A05, conversationRowMediaControlView.A04, z, z2);
    }

    public boolean A2r() {
        return false;
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f5, code lost:
        if (r24 != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(android.view.View r19, android.view.View r20, X.C28931bI r21, X.C28931bI r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r5 = r19
            int r3 = r5.getWidth()
            r15 = 1
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r2 = 8
            r8 = 0
            r9 = r21
            int r0 = r9.A01()
            r4 = r20
            r6 = r22
            if (r23 == 0) goto L_0x00b2
            if (r0 != 0) goto L_0x0021
            int r0 = r6.A01()
            if (r0 == 0) goto L_0x00ad
        L_0x0021:
            r0 = 150(0x96, double:7.4E-322)
            if (r24 == 0) goto L_0x00ae
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r10 = new android.view.animation.ScaleAnimation
            r16 = r12
            r18 = r12
            r13 = r11
            r14 = r12
            r17 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            android.view.animation.AnimationSet r10 = X.C72473Md.A0J(r10, r11, r7)
            r10.setDuration(r0)
            r4.startAnimation(r10)
        L_0x003e:
            r4.setVisibility(r2)
            android.view.View r4 = r9.A02()
            android.view.View r9 = r6.A02()
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r4.setVisibility(r8)
            r9.setVisibility(r8)
            r2 = 0
            r9.setContentDescription(r2)
            r2 = 2131231824(0x7f080450, float:1.807974E38)
            if (r26 == 0) goto L_0x005d
            r2 = 2131231826(0x7f080452, float:1.8079744E38)
        L_0x005d:
            r9.setImageResource(r2)
            if (r24 == 0) goto L_0x00f9
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r7, r11)
            r6 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r6)
            r2.setStartOffset(r0)
            r4.startAnimation(r2)
            r9.startAnimation(r2)
        L_0x0075:
            X.C72463Mc.A12(r5)
            int r6 = r5.getMeasuredWidth()
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            boolean r0 = r1 instanceof X.AnonymousClass3NI
            if (r0 != 0) goto L_0x008e
            X.3NI r0 = new X.3NI
            r2 = r25
            r0.<init>(r1, r2)
            r5.setBackground(r0)
        L_0x008e:
            android.graphics.drawable.Drawable r4 = r5.getBackground()
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            int r0 = java.lang.Math.max(r3, r6)
            r1.width = r0
            X.3OX r2 = new X.3OX
            r2.<init>(r4, r3, r6, r8)
            r0 = 7
            X.C74603c1.A00(r2, r5, r4, r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r5.startAnimation(r2)
        L_0x00ad:
            return
        L_0x00ae:
            r4.clearAnimation()
            goto L_0x003e
        L_0x00b2:
            if (r0 != r2) goto L_0x00ba
            int r0 = r6.A01()
            if (r0 == r2) goto L_0x00ad
        L_0x00ba:
            r4.setVisibility(r8)
            if (r24 == 0) goto L_0x00e1
            r16 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r0 = new android.view.animation.ScaleAnimation
            r19 = r11
            r21 = r16
            r22 = r15
            r23 = r16
            r17 = r11
            r18 = r16
            r20 = r15
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            android.view.animation.AnimationSet r7 = X.C72473Md.A0J(r0, r7, r11)
            r0 = 300(0x12c, double:1.48E-321)
            r7.setDuration(r0)
            r4.startAnimation(r7)
        L_0x00e1:
            android.view.View r0 = r9.A00
            if (r0 == 0) goto L_0x00e8
            r0.clearAnimation()
        L_0x00e8:
            r9.A04(r2)
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x00f2
            r0.clearAnimation()
        L_0x00f2:
            r6.A04(r2)
            if (r24 == 0) goto L_0x00ff
            goto L_0x0075
        L_0x00f9:
            r4.clearAnimation()
            r9.clearAnimation()
        L_0x00ff:
            r5.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uL.A0Q(android.view.View, android.view.View, X.1bI, X.1bI, boolean, boolean, boolean, boolean):void");
    }

    public int A1l(int i) {
        if (C446824j.A02(i, 13)) {
            return AnonymousClass1YL.A01(getContext(), 2130970480, 2131101887, false);
        }
        return super.A1l(i);
    }

    public void A1x() {
        TextEmojiLabel textEmojiLabel = this.A0B;
        if (textEmojiLabel != null) {
            textEmojiLabel.setEnabled(true);
            textEmojiLabel.setSelectAllOnFocus(true);
            textEmojiLabel.setTextIsSelectable(true);
        }
    }

    public void A20() {
        C98784ri.A00(this.A1X, this, 19);
    }

    public boolean A2b() {
        Boolean bool = this.A09;
        if (bool == null) {
            bool = AnonymousClass3MZ.A15(this.A0F, 8959);
            this.A09 = bool;
        }
        return bool.booleanValue();
    }

    public void A2k() {
        View view = this.A00;
        if (view == null) {
            view = findViewById(2131428830);
            this.A00 = view;
            if (view == null) {
                return;
            }
        }
        if (this.A0B == null) {
            if (!(view instanceof TextEmojiLabel)) {
                view = ((ViewStub) view).inflate();
            }
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) view;
            this.A0B = textEmojiLabel;
            AnonymousClass3Ma.A1L(this.A0F, textEmojiLabel);
            this.A0B.setAutoLinkMask(0);
            this.A0B.setLinksClickable(false);
            this.A0B.setFocusable(false);
            this.A0B.setClickable(false);
            this.A0B.setLongClickable(false);
        }
    }

    public void A2l(View view, String str) {
        if (view != null) {
            String accessibilityLabel = getAccessibilityLabel();
            StringBuilder A10 = AnonymousClass000.A10();
            if (!TextUtils.isEmpty(str)) {
                A10.append(str);
            }
            if (!TextUtils.isEmpty(accessibilityLabel)) {
                A10.append(" ");
                A10.append(accessibilityLabel);
            }
            String trim = A10.toString().trim();
            if (!trim.isEmpty()) {
                view.setContentDescription(trim);
            }
        }
    }

    public void A2m(View view, String str) {
        TextView textView;
        if (this.A00 == null) {
            View findViewById = findViewById(2131428830);
            this.A00 = findViewById;
            if (findViewById == null) {
                return;
            }
        }
        AnonymousClass21V fMessage = getFMessage();
        A2L(fMessage);
        A2Q(fMessage);
        Resources resources = getResources();
        int A022 = AnonymousClass3MZ.A02(getContext(), getContext(), 2130969251, 2131100261);
        int secondaryTextColor = getSecondaryTextColor();
        if (!TextUtils.isEmpty(fMessage.A0S())) {
            str = fMessage.A0S();
        }
        if (!TextUtils.isEmpty(str)) {
            A2k();
            this.A0B.setVisibility(0);
            setMessageText(str, this.A0B, fMessage);
            textView = this.A0H;
            textView.setTextColor(secondaryTextColor);
            this.A06.setPadding(resources.getDimensionPixelSize(2131166200), 0, resources.getDimensionPixelSize(2131166200), resources.getDimensionPixelSize(2131166198));
            AnonymousClass3MW.A0B(view).topMargin = 0;
        } else {
            C72453Mb.A1B(this.A0B);
            textView = this.A0H;
            textView.setTextColor(A022);
            ViewGroup viewGroup = this.A06;
            viewGroup.setPadding(resources.getDimensionPixelSize(2131166201), 0, resources.getDimensionPixelSize(2131166201), 0);
            C72463Mc.A12(viewGroup);
            if (view != null) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(2131166199);
                AnonymousClass3MW.A0B(view).topMargin = (-viewGroup.getMeasuredHeight()) - dimensionPixelSize;
                AnonymousClass3MW.A0B(view).bottomMargin = dimensionPixelSize;
            }
        }
        C28931bI r0 = this.A1V;
        if (r0 != null) {
            AnonymousClass3MX.A0M(r0).setTextColor(textView.getTextColors());
        }
        C28931bI r02 = this.A1W;
        if (r02 != null) {
            ((ImageView) r02.A02()).setImageTintList(textView.getTextColors());
        }
        ImageView imageView = this.A0A;
        if (imageView != null) {
            C79103uS.A1E(getContext(), imageView, this, 1);
        }
        ImageView imageView2 = this.A0B;
        if (imageView2 != null) {
            C79103uS.A1E(getContext(), imageView2, this, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009d, code lost:
        if (r6.A04 == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2n(X.AnonymousClass206 r31) {
        /*
            r30 = this;
            r7 = r31
            X.Abv r1 = X.C60532oB.A00(r7)
            r9 = r30
            if (r1 == 0) goto L_0x00b8
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00b8
            android.view.ViewGroup r12 = r9.getExternalAdContentHolder()
            if (r12 == 0) goto L_0x00b7
            X.0ve r3 = r9.A0F
            X.1gU r2 = r9.A1D
            android.content.Context r1 = r9.getContext()
            X.4X8 r0 = X.C87754Wv.A05
            X.4Wv r6 = r0.A01(r1, r3, r2, r7)
            r0 = 0
            r12.setVisibility(r0)
            X.4aH r0 = r9.A02
            if (r0 != 0) goto L_0x0094
            android.content.Context r16 = r9.getContext()
            X.5c7 r14 = r9.A0l
            X.1nl r13 = r9.A0T
            X.1no r11 = r9.A10
            X.1gV r10 = r9.A1S
            X.6lM r8 = r9.A1C
            X.4Oj r21 = r9.A1n()
            X.0zA r1 = r9.A01
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x004b
            r1.A03()
        L_0x004b:
            X.0ve r5 = r9.A0F
            X.5bZ r4 = r9.A09
            X.00H r0 = r9.A0Q
            java.lang.Object r3 = r0.get()
            X.2r5 r3 = (X.C62242r5) r3
            X.00H r0 = r9.A0S
            java.lang.Object r2 = r0.get()
            X.4Qu r2 = (X.C86224Qu) r2
            X.00H r0 = r9.A0L
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            X.10I r0 = r9.A1X
            X.4aH r15 = new X.4aH
            r29 = r0
            r27 = r3
            r28 = r10
            r25 = r5
            r26 = r8
            r23 = r14
            r24 = r11
            r22 = r9
            r20 = r4
            r19 = r2
            r18 = r1
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r9.A02 = r15
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r15.A0K
            X.C72453Mb.A1E(r0, r12)
            X.4aH r0 = r9.A02
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
            X.AnonymousClass3uP.A0W(r0, r9)
        L_0x0094:
            X.5c3 r1 = r9.A0G
            boolean r0 = r1 instanceof X.DR0
            if (r0 == 0) goto L_0x009f
            boolean r0 = r6.A04
            r12 = 1
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r12 = 0
        L_0x00a0:
            X.4aH r8 = r9.A02
            X.4Re r0 = r9.A04
            boolean r13 = r0.A00(r7)
            X.4Re r0 = r9.A04
            boolean r14 = r0.A01(r7)
            r15 = 0
            r9 = r7
            r10 = r1
            r11 = r6
            r16 = r15
            r8.A04(r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x00b7:
            return
        L_0x00b8:
            X.0ve r1 = r9.A0F
            r0 = 11800(0x2e18, float:1.6535E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x00e2
            r0 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r2 = r9.findViewById(r0)
        L_0x00c9:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00b7
            X.4aH r0 = r9.A02
            if (r0 == 0) goto L_0x00dc
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
            r1.removeView(r0)
            r0 = 0
            r9.A02 = r0
        L_0x00dc:
            r0 = 8
            r2.setVisibility(r0)
            return
        L_0x00e2:
            android.view.ViewGroup r2 = r9.getExternalAdContentHolder()
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uL.A2n(X.206):void");
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass21V);
        this.A0I = r2;
    }

    public AnonymousClass3uL(Context context, C108875cR r4, AnonymousClass21V r5) {
        super(context, r4, r5);
        A1M();
        this.A0G = C63752td.A00(context);
    }

    public static String A0O(AnonymousClass206 r2) {
        return AnonymousClass206.A03(r2, "status-transition-", AnonymousClass000.A10());
    }

    public int A1k(int i) {
        if (!AnonymousClass3MZ.A1b(getFMessage()) || !A2r()) {
            return super.A1k(i);
        }
        if (C446824j.A02(i, 13)) {
            return 2131232628;
        }
        if (C446824j.A02(i, 5)) {
            return 2131232632;
        }
        if (i == 4) {
            return 2131232630;
        }
        return 2131232641;
    }

    public void A1s() {
        if (!getFMessage().A0w()) {
            return;
        }
        if (!C79103uS.A1L(this)) {
            A2o();
            this.A0A = true;
            return;
        }
        this.A0A = false;
        AnonymousClass3uP.A0e(this);
    }

    public void A2B(ViewGroup viewGroup, TextView textView, AnonymousClass206 r4) {
        if (!C20120A8f.A06(r4)) {
            super.A2B(viewGroup, textView, r4);
        }
    }

    public boolean A2o() {
        AnonymousClass1KB r1;
        int i;
        int i2;
        AnonymousClass21V fMessage = getFMessage();
        C98814rl.A00(this.A1X, this, fMessage, 19);
        if (C50302Tx.A00(fMessage)) {
            C139246yW r0 = this.A07;
            C17960vV.A07(r0);
            r0.A01(fMessage);
            return true;
        }
        AnonymousClass205 r4 = fMessage.A0v;
        AnonymousClass1BI r12 = r4.A00;
        if (AnonymousClass206.A00(fMessage).A07 == 1) {
            int i3 = fMessage.A0u;
            AnonymousClass1KB r2 = this.A0S;
            if (i3 == 2) {
                i2 = 2131890636;
            } else {
                i2 = 2131890637;
                if (i3 == 9) {
                    i2 = 2131897346;
                }
            }
            r2.A06(i2, 1);
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with suspicious content");
            return false;
        }
        if (C22971Dz.A0e(r12) && C72463Mc.A1T(r12, this.A2S)) {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message because group is integrity suspended");
            r1 = this.A0S;
            i = 2131891165;
        } else if (C22971Dz.A0V(r12) && ((AnonymousClass4RG) this.A08.get()).A00(fMessage)) {
            Log.e("ConversationRowMedia/downloadMedia/cannot download newsletter media message because is no longer available in server");
            r1 = this.A0S;
            i = 2131890208;
        } else if (fMessage.A1F()) {
            C18030ve r22 = this.A0F;
            C18070vi.A0d(r22, 0);
            if (C18020vd.A05(C18040vf.A02, r22, 12555)) {
                AnonymousClass10I r3 = this.A1X;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("conversation-row-media-token-");
                r3.CGL(new C98814rl(this, fMessage, 20), AnonymousClass000.A0y(r4.A01, A10));
                return true;
            }
            this.A0a.A0M(AnonymousClass3MZ.A0P(getContext()), fMessage, (Runnable) null, true, true);
            return true;
        } else {
            Log.e("ConversationRowMedia/downloadMedia/cannot download media message with no media attached");
            this.A0S.A08(2131891444, 0);
            return false;
        }
        r1.A06(i, 1);
        return false;
    }

    public boolean A2p() {
        boolean A042 = C88564a8.A04(getFMessage(), this.A1S);
        if (A042) {
            this.A0S.CGP(new C98784ri((Object) this, 18));
        }
        return A042;
    }

    public boolean A2q() {
        String A0S;
        boolean isEmpty = TextUtils.isEmpty(getFMessage().A0S());
        AnonymousClass21V fMessage = getFMessage();
        if (isEmpty) {
            A0S = fMessage.A18();
        } else {
            A0S = fMessage.A0S();
        }
        if (A0S == null || A0S.length() <= 500) {
            return true;
        }
        return false;
    }

    public boolean A2s(AnonymousClass206 r5) {
        if (r5.A0w() && this.A0A) {
            if (C18020vd.A00(C18040vf.A02, ((AnonymousClass1c4) this.A2B.get()).A02, 7234) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String getAccessibilityLabel() {
        String str;
        AnonymousClass21V fMessage = getFMessage();
        String str2 = fMessage.A03;
        if (str2 != null) {
            str = AnonymousClass1EG.A0C(str2, 255);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C62572rc r0 = fMessage.A02;
        if (r0 == null) {
            return null;
        }
        return r0.A0H;
    }

    public ViewGroup getExternalAdContentHolder() {
        View findViewById = findViewById(2131437044);
        if (findViewById instanceof ViewStub) {
            findViewById = ((ViewStub) findViewById).inflate();
        }
        return (ViewGroup) findViewById;
    }

    public AnonymousClass77F getTempFMessageMediaInfo() {
        String str;
        AnonymousClass21V fMessage = getFMessage();
        File file = AnonymousClass206.A00(fMessage).A0G;
        String A18 = fMessage.A18();
        if (file != null) {
            str = file.toURI().toString();
        } else {
            str = null;
        }
        if (A18 == null || str == null) {
            return null;
        }
        return new AnonymousClass77F(fMessage.A0I, A18, fMessage.A0u, fMessage.A0S(), str);
    }

    public AnonymousClass21V getFMessage() {
        return (AnonymousClass21V) this.A0I;
    }
}
