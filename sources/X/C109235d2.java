package X;

import android.app.Dialog;
import android.view.View;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import java.util.List;

/* renamed from: X.5d2  reason: invalid class name and case insensitive filesystem */
public final class C109235d2 extends Dialog implements C108515bp, B8E, B8F {
    public AnonymousClass4UI A00;
    public AnonymousClass8AQ A01;
    public C135286rx A02;
    public CaptionFragment A03;
    public C135316s0 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public KeyboardPopupLayout A09;
    public C74873d3 A0A;
    public final C107845ai A0B = new C142987Bo(this, 2);
    public final C18000vb A0C;
    public final C18030ve A0D;
    public final AnonymousClass7JS A0E;
    public final C122506Qq A0F;
    public final C132026m3 A0G;
    public final MediaJidViewModel A0H;
    public final List A0I;
    public final int A0J;
    public final AnonymousClass190 A0K;
    public final AnonymousClass6ZN A0L;
    public final AnonymousClass1FU A0M;
    public final AnonymousClass11C A0N;
    public final C19830z4 A0O;
    public final A59 A0P;
    public final C1193267r A0Q;
    public final AnonymousClass1KW A0R;
    public final EmojiSearchProvider A0S;
    public final MediaViewOnceViewModel A0T;
    public final C18010vc A0U;
    public final AnonymousClass1L4 A0V;
    public final CharSequence A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public /* synthetic */ void Bkz() {
    }

    public void Bns() {
        this.A06 = true;
        onDismiss();
    }

    public void C2i(boolean z) {
        this.A05 = true;
        this.A07 = z;
        onDismiss();
    }

    public void C6h() {
        this.A08 = true;
        onDismiss();
    }

    public /* synthetic */ void onCaptionLayoutClicked(View view) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void CAB() {
        this.A0T.A0U();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x008a, code lost:
        if (r0 == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a5, code lost:
        if (r5.A0M == false) goto L_0x01a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r10 = r33
            r0 = r34
            super.onCreate(r0)
            android.view.Window r2 = r10.getWindow()
            if (r2 == 0) goto L_0x0014
            X.0ve r1 = r10.A0D
            X.0vb r0 = r10.A0C
            X.C27641Ww.A08(r2, r0, r1)
        L_0x0014:
            X.1FU r0 = r10.A0M
            r16 = r0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r16)
            r0 = 2131624497(0x7f0e0231, float:1.8876175E38)
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r3)
            r10.setContentView(r0)
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r9 = X.C123576Uz.A00(r10, r0)
            X.C18070vi.A0X(r9)
            X.1GP r1 = r16.getSupportFragmentManager()
            r0 = 2131431650(0x7f0b10e2, float:1.8485035E38)
            androidx.fragment.app.Fragment r4 = r1.A0O(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.mediacomposer.ui.caption.CaptionFragment"
            X.C18070vi.A0z(r4, r0)
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r4 = (com.whatsapp.mediacomposer.ui.caption.CaptionFragment) r4
            boolean r1 = r10.A0X
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r4.A26()
            r0.A08 = r1
            java.lang.CharSequence r13 = r10.A0W
            java.util.List r11 = r10.A0I
            int r0 = r11.size()
            r8 = 1
            if (r0 != r8) goto L_0x0177
            java.lang.Object r7 = X.C108955ca.A0p(r11)
            X.1BI r7 = (X.AnonymousClass1BI) r7
        L_0x005c:
            r0 = 2131432483(0x7f0b1423, float:1.8486725E38)
            android.view.View r12 = X.C18070vi.A05(r9, r0)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            X.7JS r5 = r10.A0E
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r6 = r10.A0T
            r0 = 2
            X.C72473Md.A1M(r12, r5, r6, r0)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r14 = r4.A26()
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x008c
            X.1Lc r2 = r5.A0C
            X.0ve r15 = r2.A01
            r1 = 12810(0x320a, float:1.795E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r1)
            if (r0 == 0) goto L_0x008c
            boolean r0 = r2.A02()
            r2 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008c:
            r2 = 0
        L_0x008d:
            X.1DS r0 = r5.A02
            java.lang.Object r1 = r0.A06()
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x0174
            android.net.Uri r0 = r5.A0A()
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = (java.util.Set) r1
        L_0x00a1:
            X.7nU r0 = new X.7nU
            r0.<init>(r5)
            r14.A00(r1, r0, r2)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r4.A26()
            if (r13 != 0) goto L_0x00b1
            java.lang.String r13 = ""
        L_0x00b1:
            r0.setCaptionEditTextView(r13)
            if (r7 == 0) goto L_0x00c4
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r4.A26()
            r0.setupStatusMentions(r7, r12, r9)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r4.A26()
            r0.setNewLineEnabledForNewsletter(r7)
        L_0x00c4:
            X.1q9 r2 = r4.A1G()
            r12 = 9
            X.7AQ r1 = new X.7AQ
            r1.<init>(r4, r12)
            X.1DT r0 = r6.A00
            X.1Dg r0 = X.C22791Df.A00(r0)
            r0.A0A(r2, r1)
            int r0 = r6.A0T()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A2B(r0)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r2 = r4.A26()
            android.widget.LinearLayout r1 = r2.A0A
            r0 = 0
            r1.setVisibility(r0)
            X.1bI r1 = r2.A0E
            r0 = 8
            r1.A04(r0)
            android.view.animation.AlphaAnimation r2 = X.C72463Mc.A0Q()
            r0 = 220(0xdc, double:1.087E-321)
            r2.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            r2.setInterpolator(r0)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r1 = r4.A26()
            android.widget.LinearLayout r0 = r1.A0A
            r0.startAnimation(r2)
            com.whatsapp.mentions.MentionableEntry r0 = r1.A0B
            r0.startAnimation(r2)
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r4.A26()
            r0.A03 = r10
            r4.A29(r10)
            r10.A03 = r4
            X.6ZN r2 = r10.A0L
            r0 = 2131435142(0x7f0b1e86, float:1.8492118E38)
            android.view.View r1 = X.C18070vi.A05(r9, r0)
            com.whatsapp.WaImageButton r1 = (com.whatsapp.WaImageButton) r1
            X.1K2 r0 = r2.A00
            X.10E r0 = r0.A01
            X.0vb r0 = X.AnonymousClass10E.A6R(r0)
            X.6rx r2 = new X.6rx
            r2.<init>(r1, r0)
            int r0 = r10.A0J
            X.0ve r7 = r10.A0D
            r13 = 0
            X.C18070vi.A0d(r7, r13)
            r2.A01(r0)
            com.whatsapp.WaImageButton r1 = r2.A01
            r0 = 8
            X.AnonymousClass3Ma.A1D(r1, r10, r0)
            r10.A02 = r2
            r0 = 2131432424(0x7f0b13e8, float:1.8486605E38)
            android.view.View r2 = X.C18070vi.A05(r9, r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            X.6m3 r1 = r10.A0G
            X.6Qq r0 = r10.A0F
            X.8AQ r0 = r1.A00(r2, r0, r13)
            r10.A01 = r0
            r0 = 2131431649(0x7f0b10e1, float:1.8485033E38)
            android.view.View r4 = X.C18070vi.A05(r9, r0)
            boolean r1 = r10.A0Y
            java.lang.String r2 = "recipientsController"
            X.8AQ r0 = r10.A01
            if (r1 == 0) goto L_0x017e
            if (r0 != 0) goto L_0x017a
            X.C18070vi.A11(r2)
            throw r3
        L_0x0174:
            r1 = 0
            goto L_0x00a1
        L_0x0177:
            r7 = r3
            goto L_0x005c
        L_0x017a:
            r0.CKK(r10)
            goto L_0x0187
        L_0x017e:
            if (r0 != 0) goto L_0x0184
            X.C18070vi.A11(r2)
            throw r3
        L_0x0184:
            r0.BIj()
        L_0x0187:
            X.8AQ r1 = r10.A01
            if (r1 == 0) goto L_0x01b7
            X.77K r0 = r5.A0B()
            r1.CKJ(r0, r11, r8)
            com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel r0 = r10.A0H
            X.6kY r0 = r0.A0T()
            X.0vl r0 = r0.A0C
            boolean r2 = X.C72453Mb.A1a(r0)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x01a7
            boolean r0 = r5.A0M
            r1 = 1
            if (r0 != 0) goto L_0x01a8
        L_0x01a7:
            r1 = 0
        L_0x01a8:
            if (r2 == 0) goto L_0x01bb
            if (r1 != 0) goto L_0x01bb
            X.0vb r6 = r10.A0C
            X.C137286vD.A00(r4, r6)
        L_0x01b1:
            X.6rx r0 = r10.A02
            if (r0 != 0) goto L_0x01c1
            java.lang.String r2 = "sendButtonController"
        L_0x01b7:
            X.C18070vi.A11(r2)
            throw r3
        L_0x01bb:
            X.0vb r6 = r10.A0C
            X.C137286vD.A01(r4, r6)
            goto L_0x01b1
        L_0x01c1:
            r0.A02(r2, r1)
            android.view.Window r1 = r10.getWindow()
            if (r1 == 0) goto L_0x01ce
            r0 = -1
            r1.setLayout(r0, r0)
        L_0x01ce:
            android.view.Window r0 = r16.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x01f1
            android.view.Window r0 = r10.getWindow()
            if (r0 == 0) goto L_0x01e6
            r0.setFlags(r1, r1)
        L_0x01e6:
            android.view.Window r1 = r10.getWindow()
            if (r1 == 0) goto L_0x01f1
            r0 = 256(0x100, float:3.59E-43)
            r1.clearFlags(r0)
        L_0x01f1:
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r1 = r9.findViewById(r0)
            r5 = r1
            com.whatsapp.KeyboardPopupLayout r5 = (com.whatsapp.KeyboardPopupLayout) r5
            r0 = 6
            X.AnonymousClass3Ma.A1D(r5, r10, r0)
            X.C18070vi.A0X(r1)
            r10.A09 = r5
            X.1L4 r0 = r10.A0V
            r30 = r0
            X.190 r0 = r10.A0K
            r18 = r0
            X.1KW r15 = r10.A0R
            X.67r r14 = r10.A0Q
            X.11C r4 = r10.A0N
            com.whatsapp.emoji.search.EmojiSearchProvider r3 = r10.A0S
            X.0z4 r2 = r10.A0O
            X.0vc r1 = r10.A0U
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = r10.A03
            if (r0 == 0) goto L_0x02b4
            android.widget.ImageButton r17 = r0.A25()
        L_0x0220:
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = r10.A03
            if (r0 == 0) goto L_0x02b1
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r0.A26()
            com.whatsapp.mentions.MentionableEntry r0 = r0.A0B
        L_0x022a:
            java.lang.Integer r31 = java.lang.Integer.valueOf(r12)
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x029d
            r32 = 0
        L_0x0236:
            X.A59 r12 = r10.A0P
            X.3d3 r11 = new X.3d3
            r19 = r5
            r20 = r0
            r21 = r4
            r22 = r2
            r23 = r6
            r24 = r12
            r25 = r14
            r26 = r15
            r27 = r3
            r28 = r7
            r29 = r1
            r15 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0 = 2131430335(0x7f0b0bbf, float:1.8482368E38)
            android.view.View r1 = r9.findViewById(r0)
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            X.4UI r2 = new X.4UI
            r0 = r16
            r2.<init>(r0, r11, r1)
            r10.A00 = r2
            X.3Br r0 = X.C108945cZ.A0X(r10, r8)
            r11.A0E = r0
            r10.A0A = r11
            r1 = 2
            X.7GD r0 = new X.7GD
            r0.<init>(r10, r1)
            r2.A00 = r0
            X.5ai r0 = r10.A0B
            r11.A0J(r0)
            r1 = 2131232116(0x7f080574, float:1.8080332E38)
            r0 = 2131232028(0x7f08051c, float:1.8080154E38)
            r11.A00 = r1
            r11.A02 = r0
            android.view.Window r1 = r10.getWindow()
            if (r1 == 0) goto L_0x028f
            r0 = 5
            r1.setSoftInputMode(r0)
        L_0x028f:
            com.whatsapp.mediacomposer.ui.caption.CaptionFragment r0 = r10.A03
            if (r0 == 0) goto L_0x029c
            com.whatsapp.mediacomposer.ui.caption.CaptionView r0 = r0.A26()
            com.whatsapp.mentions.MentionableEntry r0 = r0.A0B
            r0.A0I(r8)
        L_0x029c:
            return
        L_0x029d:
            int r12 = r11.size()
            if (r12 != r8) goto L_0x02ac
            X.1BI r11 = X.C108945cZ.A0i(r11, r13)
            java.lang.Integer r32 = X.A3P.A00(r11)
            goto L_0x0236
        L_0x02ac:
            java.lang.Integer r32 = X.C108955ca.A0e()
            goto L_0x0236
        L_0x02b1:
            r0 = 0
            goto L_0x022a
        L_0x02b4:
            r17 = 0
            goto L_0x0220
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109235d2.onCreate(android.os.Bundle):void");
    }

    public void onDismiss() {
        if (isShowing()) {
            try {
                super.dismiss();
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public void onStop() {
        C135316s0 r0;
        C74873d3 r02;
        super.onStop();
        KeyboardPopupLayout keyboardPopupLayout = this.A09;
        if (keyboardPopupLayout == null) {
            C18070vi.A11("rootLayout");
            throw null;
        }
        keyboardPopupLayout.setOnClickListener((View.OnClickListener) null);
        C74873d3 r03 = this.A0A;
        if (!(r03 == null || !r03.isShowing() || (r02 = this.A0A) == null)) {
            r02.dismiss();
        }
        this.A0A = null;
        CaptionFragment captionFragment = this.A03;
        if (captionFragment != null) {
            r0 = captionFragment.A27();
        } else {
            r0 = null;
        }
        this.A04 = r0;
        C34001jj r1 = new C34001jj(AnonymousClass3MX.A0O(this.A0M));
        CaptionFragment captionFragment2 = this.A03;
        if (captionFragment2 != null) {
            r1.A07(captionFragment2);
        }
        r1.A01();
        this.A03 = null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109235d2(X.AnonymousClass190 r21, X.AnonymousClass6ZN r22, X.AnonymousClass1FU r23, X.AnonymousClass11C r24, X.C19830z4 r25, X.C18000vb r26, X.A59 r27, X.C1193267r r28, X.AnonymousClass1KW r29, com.whatsapp.emoji.search.EmojiSearchProvider r30, X.C18030ve r31, X.AnonymousClass7JS r32, X.C122506Qq r33, X.C132026m3 r34, com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel r35, com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r36, X.C18010vc r37, X.AnonymousClass1L4 r38, java.lang.CharSequence r39, java.util.List r40, int r41, boolean r42, boolean r43) {
        /*
            r20 = this;
            r2 = r38
            r9 = r31
            r19 = r21
            r0 = r19
            X.C18070vi.A0p(r9, r2, r0)
            r0 = 5
            r11 = r29
            X.C18070vi.A0d(r11, r0)
            r14 = r28
            r10 = r30
            r17 = r24
            r16 = r25
            r13 = r26
            r1 = r17
            r0 = r16
            X.C18070vi.A0x(r14, r1, r13, r10, r0)
            r3 = r37
            r8 = r32
            r12 = r27
            X.C18070vi.A0r(r8, r3, r12)
            r1 = 14
            r18 = r22
            r0 = r18
            X.C18070vi.A0d(r0, r1)
            r0 = 19
            r7 = r33
            X.C18070vi.A0d(r7, r0)
            r0 = 20
            r6 = r34
            X.C18070vi.A0d(r6, r0)
            r0 = 22
            r5 = r35
            X.C18070vi.A0d(r5, r0)
            r0 = 23
            r4 = r36
            X.C18070vi.A0d(r4, r0)
            r0 = 2132083223(0x7f150217, float:1.9806582E38)
            r1 = r20
            r15 = r23
            r1.<init>(r15, r0)
            r1.A0M = r15
            r1.A0D = r9
            r1.A0V = r2
            r0 = r19
            r1.A0K = r0
            r1.A0R = r11
            r1.A0Q = r14
            r0 = r17
            r1.A0N = r0
            r1.A0C = r13
            r1.A0S = r10
            r0 = r16
            r1.A0O = r0
            r1.A0E = r8
            r1.A0U = r3
            r1.A0P = r12
            r0 = r18
            r1.A0L = r0
            r0 = r40
            r1.A0I = r0
            r0 = r39
            r1.A0W = r0
            r0 = r41
            r1.A0J = r0
            r0 = r42
            r1.A0Y = r0
            r1.A0F = r7
            r1.A0G = r6
            r0 = r43
            r1.A0X = r0
            r1.A0H = r5
            r1.A0T = r4
            r2 = 2
            X.7Bo r0 = new X.7Bo
            r0.<init>(r1, r2)
            r1.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109235d2.<init>(X.190, X.6ZN, X.1FU, X.11C, X.0z4, X.0vb, X.A59, X.67r, X.1KW, com.whatsapp.emoji.search.EmojiSearchProvider, X.0ve, X.7JS, X.6Qq, X.6m3, com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel, com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel, X.0vc, X.1L4, java.lang.CharSequence, java.util.List, int, boolean, boolean):void");
    }
}
