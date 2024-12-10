package com.whatsapp.calling.incallnotifbanner.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11C;
import X.AnonymousClass1DS;
import X.AnonymousClass1F9;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass75Y;
import X.AnonymousClass7AN;
import X.AnonymousClass7C7;
import X.C108945cZ;
import X.C109195cy;
import X.C160968Au;
import X.C18030ve;
import X.C27201Vd;
import X.C27691Xc;
import X.C37451pZ;
import X.C43421zm;
import X.C66812ym;
import X.C72463Mc;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.whatsapp.contact.photos.MultiContactThumbnail;

@Deprecated
public class VoipInCallNotifBanner extends LinearLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public Animator A02;
    public AnonymousClass1KB A03;
    public AnonymousClass7C7 A04;
    public C160968Au A05;
    public C66812ym A06;
    public AnonymousClass1VW A07;
    public AnonymousClass1M9 A08;
    public C27201Vd A09;
    public AnonymousClass11C A0A;
    public C18030ve A0B;
    public AnonymousClass031 A0C;
    public boolean A0D;
    public int A0E;
    public final int A0F;
    public final Handler A0G;
    public final VoipCallControlRingingDotsIndicator A0H;
    public final C37451pZ A0I;
    public final MultiContactThumbnail A0J;
    public final ImageView A0K;
    public final TextEmojiLabel A0L;
    public final TextEmojiLabel A0M;
    public final WaImageButton A0N;
    public final WaTextView A0O;

    private void setupBannerBackground(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AnonymousClass3MY.A02(this, i));
        gradientDrawable.setCornerRadius(getResources().getDimension(2131165693));
        setBackground(gradientDrawable);
    }

    public void A01() {
        this.A0G.removeMessages(0);
        if (getVisibility() != 8) {
            float[] A1V = C108945cZ.A1V();
            A1V[0] = 0.0f;
            A1V[1] = (float) this.A0F;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationY", A1V);
            this.A02 = ofFloat;
            ofFloat.setDuration(600);
            this.A02.setInterpolator(new DecelerateInterpolator(2.0f));
            C109195cy.A02(this.A02, this, 6);
            this.A02.start();
        }
        this.A0H.clearAnimation();
    }

    public void A02(AnonymousClass1F9 r3, C160968Au r4) {
        AnonymousClass1DS A0Q;
        int i;
        this.A05 = r4;
        if (r4 instanceof InCallBannerViewModel) {
            InCallBannerViewModel inCallBannerViewModel = (InCallBannerViewModel) r4;
            AnonymousClass7AN.A01(r3, inCallBannerViewModel.A04, this, 40);
            A0Q = inCallBannerViewModel.A05;
            i = 41;
        } else if (r4 instanceof InCallBannerViewModelV2) {
            A0Q = C108945cZ.A0Q(((InCallBannerViewModelV2) r4).A0J);
            i = 42;
        } else {
            return;
        }
        AnonymousClass7AN.A01(r3, A0Q, this, i);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public int getBannerHeight() {
        int i = this.A0E;
        if (i != 0) {
            return i;
        }
        int A012 = (AnonymousClass3MW.A01(getResources(), 2131166080) + (AnonymousClass3MW.A01(getResources(), 2131167007) * 2)) - AnonymousClass3MW.A01(getResources(), 2131165694);
        this.A0E = A012;
        return A012;
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            C27691Xc.A0m((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass7C7 r10, com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner r11) {
        /*
            android.content.Context r6 = r11.getContext()
            android.animation.Animator r0 = r11.A02
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0013
            android.animation.Animator r0 = r11.A02
            r0.cancel()
        L_0x0013:
            com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator r7 = r11.A0H
            r7.clearAnimation()
            r4 = 8
            r7.setVisibility(r4)
            android.widget.ImageView r8 = r11.A0K
            r3 = 0
            r8.setImageDrawable(r3)
            r8.setVisibility(r4)
            android.widget.ImageView$ScaleType r0 = r10.A03
            r8.setScaleType(r0)
            com.whatsapp.contact.photos.MultiContactThumbnail r9 = r11.A0J
            r9.setVisibility(r4)
            X.7C7 r0 = r11.A04
            if (r0 == 0) goto L_0x003a
            int r1 = r10.A00
            int r0 = r0.A00
            if (r1 == r0) goto L_0x003f
        L_0x003a:
            int r0 = r10.A00
            r11.setupBannerBackground(r0)
        L_0x003f:
            X.5Zi r0 = r10.A05
            if (r0 == 0) goto L_0x006c
            android.graphics.drawable.Drawable r2 = r0.BQt(r6)
        L_0x0047:
            boolean r0 = r10.A0F
            r5 = 0
            if (r0 == 0) goto L_0x0079
            java.util.List r1 = r10.A0B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0079
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x005c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006e
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.1M9 r0 = r11.A08
            X.AnonymousClass3MY.A1O(r0, r1, r8)
            goto L_0x005c
        L_0x006c:
            r2 = r3
            goto L_0x0047
        L_0x006e:
            r9.setVisibility(r5)
            X.1pZ r1 = r11.A0I
            X.2ym r0 = r11.A06
            r9.A00(r0, r1, r8)
            goto L_0x0081
        L_0x0079:
            if (r2 == 0) goto L_0x0081
            r8.setImageDrawable(r2)
            r8.setVisibility(r5)
        L_0x0081:
            boolean r0 = r10.A0G
            if (r0 == 0) goto L_0x0094
            r7.setVisibility(r5)
            X.3Ob r1 = new X.3Ob
            r1.<init>(r7)
            r0 = -1
            r1.setRepeatCount(r0)
            r7.startAnimation(r1)
        L_0x0094:
            if (r6 == 0) goto L_0x00cc
            com.whatsapp.TextEmojiLabel r1 = r11.A0M
            X.4ZN r0 = r10.A09
            X.AnonymousClass4ZN.A01(r6, r1, r0)
            X.4ZN r1 = r10.A08
            com.whatsapp.TextEmojiLabel r0 = r11.A0L
            if (r1 == 0) goto L_0x0124
            r0.setVisibility(r5)
            X.AnonymousClass4ZN.A01(r6, r0, r1)
        L_0x00a9:
            X.4ZN r0 = r10.A06
            if (r0 == 0) goto L_0x00b6
            X.11C r1 = r11.A0A
            java.lang.CharSequence r0 = r0.A03(r6)
            X.AnonymousClass1Y5.A00(r6, r1, r0)
        L_0x00b6:
            X.4ZN r2 = r10.A07
            if (r2 == 0) goto L_0x011e
            X.8Au r0 = r11.A05
            if (r0 == 0) goto L_0x011e
            X.6Rd r1 = r10.A04
            X.6Rd r0 = X.C122636Rd.A06
            if (r1 != r0) goto L_0x011e
            com.whatsapp.WaTextView r0 = r11.A0O
            X.AnonymousClass4ZN.A01(r6, r0, r2)
            r0.setVisibility(r5)
        L_0x00cc:
            X.8Au r2 = r11.A05
            boolean r0 = r2 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel
            if (r0 == 0) goto L_0x0117
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0113
            r1 = 33
            X.4dV r0 = new X.4dV
            r0.<init>((java.lang.Object) r11, (java.lang.Object) r10, (java.lang.Object) r2, (int) r1)
        L_0x00dd:
            r11.setOnClickListener(r0)
        L_0x00e0:
            java.lang.Long r0 = r10.A0A
            if (r0 != 0) goto L_0x010e
            r1 = 3000(0xbb8, double:1.482E-320)
        L_0x00e6:
            int r0 = r11.getVisibility()
            if (r0 == 0) goto L_0x00f7
            X.1KB r4 = r11.A03
            r3 = 3
            X.7Ph r0 = new X.7Ph
            r0.<init>(r11, r1, r3)
            r4.A0J(r0)
        L_0x00f7:
            android.os.Handler r0 = r11.A0G
            r0.removeMessages(r5)
            r0.sendEmptyMessageDelayed(r5, r1)
            r11.A04 = r10
            com.whatsapp.WaImageButton r2 = r11.A0N
            r1 = 25
            X.4dQ r0 = new X.4dQ
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            return
        L_0x010e:
            long r1 = r0.longValue()
            goto L_0x00e6
        L_0x0113:
            r11.setOnClickListener(r3)
            goto L_0x00e0
        L_0x0117:
            boolean r0 = r2 instanceof com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2
            if (r0 == 0) goto L_0x00e0
            android.view.View$OnClickListener r0 = r10.A02
            goto L_0x00dd
        L_0x011e:
            com.whatsapp.WaTextView r0 = r11.A0O
            r0.setVisibility(r4)
            goto L_0x00cc
        L_0x0124:
            r0.setVisibility(r4)
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner.A00(X.7C7, com.whatsapp.calling.incallnotifbanner.view.VoipInCallNotifBanner):void");
    }

    public VoipInCallNotifBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            C27691Xc.A0m((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0G = new Handler(new AnonymousClass75Y(this, 2));
        LayoutInflater.from(context).inflate(2131627503, this, true);
        setVisibility(8);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(this, 2131436208);
        this.A0M = A0V;
        this.A0L = AnonymousClass3MX.A0V(this, 2131435885);
        this.A0K = AnonymousClass3MW.A0G(this, 2131431970);
        this.A0J = (MultiContactThumbnail) AnonymousClass1HF.A06(this, 2131427946);
        this.A0H = (VoipCallControlRingingDotsIndicator) AnonymousClass1HF.A06(this, 2131434728);
        this.A0O = AnonymousClass3MW.A0T(this, 2131436060);
        this.A0N = (WaImageButton) AnonymousClass1HF.A06(this, 2131429138);
        C43421zm.A04(A0V);
        C72463Mc.A0y(context, A0V, 2130970664, 2131102051);
        this.A0I = this.A09.A08("voip-in-call-notif-banner-multi", 0.0f, getResources().getDimensionPixelSize(2131168742));
        this.A0F = getResources().getDimensionPixelSize(2131165692);
        setImportantForAccessibility(4);
    }

    public VoipInCallNotifBanner(Context context) {
        this(context, (AttributeSet) null);
    }
}
