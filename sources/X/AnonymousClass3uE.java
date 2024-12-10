package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.location.WaMapView;
import java.util.Set;

/* renamed from: X.3uE  reason: invalid class name */
public class AnonymousClass3uE extends C78233sS {
    public static final Set A0L = C200410p.A0S(new String[]{"www.facebook.com", "maps.google.com", "foursquare"});
    public C19880zA A00;
    public C108355bZ A01;
    public C88644aH A02;
    public C86304Rc A03;
    public C86324Re A04;
    public boolean A05;
    public final LinearLayout A06;
    public final C28931bI A07;
    public final C28931bI A08 = C28931bI.A00(this, 2131432192);
    public final C28931bI A09 = C28931bI.A00(this, 2131432193);
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5GX(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new AnonymousClass5GZ(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C102325Ga(this));
    public final View A0D;
    public final FrameLayout A0E;
    public final WaMapView A0F = ((WaMapView) AnonymousClass3MX.A0C(this, 2131432278));
    public final C18100vl A0G = AnonymousClass1DF.A01(new AnonymousClass5GW(this));
    public final C18100vl A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(new C102335Gb(this));
    public final C18100vl A0J;
    public final C18100vl A0K;

    public void A2V(AnonymousClass206 r2, boolean z) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, getFMessage());
        super.A2V(r2, z);
        if (z || A1Z) {
            A04();
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 0;
    }

    public final void setAdAttributionChecker(C86324Re r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setAdAttributionLoggingController(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setBubbleResolver(C108355bZ r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setDoubleTapTrayUtils(C86304Rc r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof AnonymousClass218);
        this.A0I = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0167, code lost:
        if (r7.A04 == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01db, code lost:
        if (r5 == 2) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04() {
        /*
            r30 = this;
            r3 = r30
            X.21B r2 = r3.getFMessage()
            double r4 = r2.A01
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            double r4 = r2.A00
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
        L_0x0014:
            X.4Rc r0 = r3.getDoubleTapTrayUtils()
            boolean r0 = r0.A01()
            X.0vl r4 = r3.A0C
            android.view.View r1 = X.C72453Mb.A0T(r4)
            if (r0 == 0) goto L_0x0343
            android.view.View$OnTouchListener r0 = r3.getThumbViewOnTouchLister()
            r1.setOnTouchListener(r0)
        L_0x002b:
            android.view.View r0 = X.C72453Mb.A0T(r4)
            X.AnonymousClass3uP.A0W(r0, r3)
        L_0x0032:
            com.whatsapp.location.WaMapView r8 = r3.A0F
            X.689 r0 = r3.A0G
            X.C17960vV.A07(r0)
            r8.A04(r0, r2)
            X.0vl r7 = r3.A0A
            android.view.View r0 = X.AnonymousClass3MW.A0A(r7)
            int r6 = X.C72453Mb.A0D(r0)
            android.view.View r5 = r3.A0D
            r4 = 0
            if (r5 == 0) goto L_0x0077
            java.lang.String r10 = r2.A01
            java.lang.String r1 = r2.A00
            boolean r0 = X.C24605CBj.A00(r10)
            if (r0 == 0) goto L_0x021a
            boolean r0 = X.C24605CBj.A00(r1)
            if (r0 == 0) goto L_0x021a
            X.1bI r1 = r3.A09
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0064
            X.AnonymousClass3MY.A1T(r1, r6)
        L_0x0064:
            X.1bI r1 = r3.A08
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x006d
            X.AnonymousClass3MY.A1T(r1, r6)
        L_0x006d:
            android.widget.LinearLayout r0 = r3.A06
            if (r0 == 0) goto L_0x0074
            r0.setBackgroundResource(r4)
        L_0x0074:
            r5.setVisibility(r4)
        L_0x0077:
            android.widget.TextView r0 = r3.getControlBtn()
            if (r0 == 0) goto L_0x0080
            r0.setVisibility(r6)
        L_0x0080:
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L_0x01ca
            X.0vl r0 = r3.A0B
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            if (r0 == 0) goto L_0x0090
            r0.setVisibility(r4)
        L_0x0090:
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00a9
            android.view.View r0 = X.AnonymousClass3MW.A0A(r7)
            if (r0 == 0) goto L_0x009f
            r0.setVisibility(r4)
        L_0x009f:
            X.0vl r0 = r3.A0C
            android.view.View r1 = X.C72453Mb.A0T(r0)
            r0 = 0
        L_0x00a6:
            r1.setOnClickListener(r0)
        L_0x00a9:
            r0 = 5
            X.4qb r5 = new X.4qb
            r5.<init>(r3, r0)
            int r4 = r8.getVisibility()
            X.1gV r1 = r3.A1S
            X.C17960vV.A07(r1)
            android.widget.ImageView r0 = r3.getThumbView()
            if (r4 != 0) goto L_0x01c5
            r1.A0D(r0, r2, r5)
        L_0x00c1:
            X.Abv r1 = X.C60532oB.A00(r2)
            if (r1 == 0) goto L_0x018f
            boolean r0 = r1.A0H
            if (r0 != 0) goto L_0x018f
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x018f
            r0 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.ViewGroup r12 = X.AnonymousClass3MW.A0D(r3, r0)
            if (r12 == 0) goto L_0x018b
            X.4X8 r5 = X.C87754Wv.A05
            X.0ve r4 = r3.A0F
            X.C18070vi.A0W(r4)
            X.1gU r1 = r3.A1D
            X.C18070vi.A0W(r1)
            android.content.Context r0 = X.AnonymousClass3MY.A04(r3)
            X.4Wv r7 = r5.A01(r0, r4, r1, r2)
            r0 = 0
            r12.setVisibility(r0)
            X.4aH r0 = r3.A02
            if (r0 != 0) goto L_0x015c
            android.content.Context r16 = r3.getContext()
            X.5c7 r14 = r3.A0l
            X.1nl r13 = r3.A0T
            X.1no r11 = r3.A10
            X.1gV r10 = r3.A1S
            X.6lM r9 = r3.A1C
            X.4Oj r21 = r3.A1n()
            X.0zA r0 = r3.getAdAttributionLoggingController()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0117
            X.0zA r0 = r3.getAdAttributionLoggingController()
            r0.A03()
        L_0x0117:
            X.0ve r8 = r3.A0F
            X.5bZ r6 = r3.A01
            X.00H r0 = r3.A0Q
            java.lang.Object r5 = r0.get()
            X.2r5 r5 = (X.C62242r5) r5
            X.00H r0 = r3.A0S
            java.lang.Object r4 = r0.get()
            X.4Qu r4 = (X.C86224Qu) r4
            X.00H r0 = r3.A0L
            java.lang.Object r1 = r0.get()
            X.A5M r1 = (X.A5M) r1
            X.10I r0 = r3.A1X
            X.4aH r15 = new X.4aH
            r28 = r10
            r29 = r0
            r26 = r9
            r27 = r5
            r24 = r11
            r25 = r8
            r22 = r3
            r23 = r14
            r20 = r6
            r19 = r4
            r18 = r1
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r15.A0K
            X.C72453Mb.A1E(r0, r12)
            X.AnonymousClass3uP.A0W(r0, r3)
            r3.A02 = r15
        L_0x015c:
            X.5c3 r0 = r3.getInlineVideoPlaybackHandler()
            boolean r0 = r0 instanceof X.DR0
            if (r0 == 0) goto L_0x0169
            boolean r0 = r7.A04
            r1 = 1
            if (r0 != 0) goto L_0x016a
        L_0x0169:
            r1 = 0
        L_0x016a:
            r3.A05 = r1
            X.4aH r4 = r3.A02
            if (r4 == 0) goto L_0x018b
            X.5c3 r6 = r3.getInlineVideoPlaybackHandler()
            X.4Re r0 = r3.getAdAttributionChecker()
            boolean r9 = r0.A00(r2)
            X.4Re r0 = r3.getAdAttributionChecker()
            boolean r10 = r0.A01(r2)
            r11 = 0
            r5 = r2
            r8 = r1
            r12 = r11
            r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x018b:
            r3.A2N(r2)
            return
        L_0x018f:
            X.0ve r1 = r3.A0F
            r0 = 11798(0x2e16, float:1.6533E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x01c0
            r0 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r5 = r3.findViewById(r0)
        L_0x01a0:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x018b
            X.4aH r0 = r3.A02
            if (r0 == 0) goto L_0x01ba
            android.view.ViewGroup r4 = r3.getWebPagePreviewHolder()
            r1 = 0
            if (r4 == 0) goto L_0x01b8
            X.4aH r0 = r3.A02
            if (r0 == 0) goto L_0x01be
            com.whatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0K
        L_0x01b5:
            r4.removeView(r0)
        L_0x01b8:
            r3.A02 = r1
        L_0x01ba:
            r5.setVisibility(r6)
            goto L_0x018b
        L_0x01be:
            r0 = r1
            goto L_0x01b5
        L_0x01c0:
            android.view.ViewGroup r5 = r3.getWebPagePreviewHolder()
            goto L_0x01a0
        L_0x01c5:
            r1.A0E(r0, r2, r5)
            goto L_0x00c1
        L_0x01ca:
            X.21B r1 = r3.getFMessage()
            X.C18070vi.A0d(r1, r4)
            X.205 r0 = r1.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01dd
            int r5 = r1.A02
            r0 = 2
            r1 = 1
            if (r5 != r0) goto L_0x01de
        L_0x01dd:
            r1 = 0
        L_0x01de:
            X.0vl r0 = r3.A0B
            android.view.View r0 = X.AnonymousClass3MW.A0A(r0)
            if (r1 != 0) goto L_0x01ed
            if (r0 == 0) goto L_0x00a9
            r0.setVisibility(r6)
            goto L_0x00a9
        L_0x01ed:
            if (r0 == 0) goto L_0x01f2
            r0.setVisibility(r6)
        L_0x01f2:
            android.widget.TextView r1 = r3.getControlBtn()
            if (r1 == 0) goto L_0x0204
            r1.setVisibility(r4)
            r0 = 2131895332(0x7f122424, float:1.9425494E38)
            r1.setText(r0)
            X.C825048f.A00(r1, r3, r6)
        L_0x0204:
            android.view.View r0 = X.AnonymousClass3MW.A0A(r7)
            if (r0 == 0) goto L_0x020d
            r0.setVisibility(r4)
        L_0x020d:
            X.0vl r0 = r3.A0C
            android.view.View r1 = X.C72453Mb.A0T(r0)
            X.48f r0 = new X.48f
            r0.<init>(r3, r6)
            goto L_0x00a6
        L_0x021a:
            java.lang.String r9 = r2.A19()
            boolean r0 = X.C24605CBj.A00(r10)
            if (r0 != 0) goto L_0x032b
            if (r10 == 0) goto L_0x0074
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r12 = X.AnonymousClass1EG.A0C(r10, r0)
            X.C18070vi.A0X(r12)
            android.widget.LinearLayout r0 = r3.A06
            android.content.Context r14 = r3.getContext()
            if (r0 != 0) goto L_0x02fd
            X.C18070vi.A0X(r14)
            X.1KB r11 = r3.A0S
            X.C18070vi.A0W(r11)
            X.11C r10 = r3.A0C
            X.C18070vi.A0W(r10)
            X.1nl r0 = r3.A0T
            X.C18070vi.A0W(r0)
            r18 = 0
            X.3cE r13 = new X.3cE
            r19 = r9
            r16 = r11
            r17 = r10
            r15 = r0
            r13.<init>((android.content.Context) r14, (X.AnonymousClass1L8) r15, (X.AnonymousClass1KB) r16, (X.AnonymousClass11C) r17, (X.AnonymousClass206) r18, (java.lang.String) r19)
        L_0x0257:
            android.text.SpannableStringBuilder r10 = X.AnonymousClass3MW.A09(r12)
            X.C17960vV.A07(r12)
            int r11 = r12.length()
            r0 = 18
            r10.setSpan(r13, r4, r11, r0)
            X.1bI r0 = r3.A09
            android.view.View r12 = r0.A02()
            r11 = r12
            com.whatsapp.TextEmojiLabel r11 = (com.whatsapp.TextEmojiLabel) r11
            X.0ve r0 = r11.getAbProps()
            X.AnonymousClass3Ma.A1L(r0, r11)
            r11.setAutoLinkMask(r4)
            r11.setLinksClickable(r4)
            r11.setFocusable(r4)
            r11.setClickable(r4)
            r11.setLongClickable(r4)
            java.lang.CharSequence r10 = r3.A1p(r10)
            android.widget.TextView$BufferType r0 = android.widget.TextView.BufferType.SPANNABLE
            r11.setText(r10, r0)
            r11.setVisibility(r4)
            X.C18070vi.A0X(r12)
        L_0x0295:
            if (r1 == 0) goto L_0x02eb
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02eb
            r0 = 300(0x12c, float:4.2E-43)
            java.lang.String r11 = X.AnonymousClass1EG.A0C(r1, r0)
            X.C18070vi.A0X(r11)
            X.1bI r0 = r3.A08
            android.view.View r1 = r0.A02()
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.CharSequence r0 = r3.A1p(r11)
            r10.setText(r0)
            r10.setVisibility(r4)
            X.C18070vi.A0X(r1)
            r1 = 5
            X.48i r0 = new X.48i
            r0.<init>(r1, r9, r3)
            r10.setOnClickListener(r0)
        L_0x02c5:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            java.lang.String r1 = r0.getHost()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0336
            java.util.Set r0 = A0L
            boolean r0 = X.C29431cG.A18(r0, r1)
            if (r0 != 0) goto L_0x0336
            X.1bI r0 = r3.A07
            if (r0 == 0) goto L_0x0336
            android.widget.TextView r0 = X.AnonymousClass3MX.A0M(r0)
            r0.setText(r1)
            r0.setVisibility(r4)
            goto L_0x0074
        L_0x02eb:
            X.1bI r1 = r3.A08
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x02c5
            android.view.View r1 = r1.A02()
            r1.setVisibility(r6)
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x02c5
        L_0x02fd:
            X.C18070vi.A0X(r14)
            android.content.Context r11 = r3.getContext()
            r10 = 2130969261(0x7f0402ad, float:1.7547199E38)
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            int r19 = X.AnonymousClass1YL.A00(r11, r10, r0)
            X.1KB r11 = r3.A0S
            X.C18070vi.A0W(r11)
            X.11C r10 = r3.A0C
            X.C18070vi.A0W(r10)
            X.1nl r0 = r3.A0T
            X.C18070vi.A0W(r0)
            X.3cE r13 = new X.3cE
            r15 = r0
            r16 = r11
            r17 = r10
            r18 = r9
            r13.<init>((android.content.Context) r14, (X.AnonymousClass1L8) r15, (X.AnonymousClass1KB) r16, (X.AnonymousClass11C) r17, (java.lang.String) r18, (int) r19)
            goto L_0x0257
        L_0x032b:
            X.1bI r10 = r3.A09
            android.view.View r0 = r10.A00
            if (r0 == 0) goto L_0x0295
            X.AnonymousClass3MY.A1T(r10, r6)
            goto L_0x0295
        L_0x0336:
            X.1bI r1 = r3.A07
            if (r1 == 0) goto L_0x0074
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0074
            X.AnonymousClass3MY.A1T(r1, r6)
            goto L_0x0074
        L_0x0343:
            android.view.View$OnClickListener r0 = r3.getThumbViewOnClickListener()
            r1.setOnClickListener(r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uE.A04():void");
    }

    private final TextView getControlBtn() {
        return (TextView) this.A0G.getValue();
    }

    private final View getControlFrame() {
        return AnonymousClass3MW.A0A(this.A0A);
    }

    private final C108645c3 getInlineVideoPlaybackHandler() {
        return (C108645c3) this.A0H.getValue();
    }

    private final View getProgressBar() {
        return AnonymousClass3MW.A0A(this.A0B);
    }

    private final View getThumbBtn() {
        return C72453Mb.A0T(this.A0C);
    }

    /* access modifiers changed from: private */
    public final ImageView getThumbView() {
        return (ImageView) AnonymousClass3MX.A14(this.A0I);
    }

    /* access modifiers changed from: private */
    public final View.OnClickListener getThumbViewOnClickListener() {
        return (View.OnClickListener) this.A0J.getValue();
    }

    public boolean A1X() {
        return C79103uS.A1K(this, getFMessage(), this.A1h);
    }

    public final C86324Re getAdAttributionChecker() {
        C86324Re r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("adAttributionChecker");
        throw null;
    }

    public final C19880zA getAdAttributionLoggingController() {
        C19880zA r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("adAttributionLoggingController");
        throw null;
    }

    public final C108355bZ getBubbleResolver() {
        C108355bZ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("bubbleResolver");
        throw null;
    }

    public final C86304Rc getDoubleTapTrayUtils() {
        C86304Rc r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("doubleTapTrayUtils");
        throw null;
    }

    public AnonymousClass21B getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageStaticLocation");
        return (AnonymousClass21B) r1;
    }

    /* renamed from: getMainChildMaxWidth$app_productinfra_conversation_ui_ui */
    public int getMainChildMaxWidth() {
        if (this.A0l.Bew(getFMessage())) {
            return 0;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166243);
        if (this.A05) {
            return (int) Math.min((double) dimensionPixelSize, (double) C88264Yz.A01(getContext(), 72));
        }
        return dimensionPixelSize;
    }

    public final View.OnTouchListener getThumbViewOnTouchLister() {
        return (View.OnTouchListener) this.A0K.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3uE(Context context, C108875cR r4, AnonymousClass21B r5) {
        super(context, r4, r5);
        C28931bI r0;
        C18070vi.A0j(context, r5);
        A1M();
        this.A0H = AnonymousClass1DF.A01(new AnonymousClass5GY(context));
        this.A0J = AnonymousClass1DF.A01(new AnonymousClass5PJ(context, this, r5));
        this.A0K = AnonymousClass1DF.A01(new AnonymousClass5NH(context, this));
        View findViewById = findViewById(2131432183);
        if (findViewById != null) {
            r0 = AnonymousClass3MW.A0p(findViewById);
        } else {
            r0 = null;
        }
        this.A07 = r0;
        this.A0D = findViewById(2131432678);
        this.A06 = (LinearLayout) findViewById(2131432194);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131432178);
        this.A0E = frameLayout;
        if (frameLayout != null) {
            frameLayout.setForeground(getInnerFrameForegroundDrawable());
        }
        A04();
    }

    public boolean A1V() {
        AnonymousClass21B fMessage = getFMessage();
        C18070vi.A0d(fMessage, 0);
        if ((!fMessage.A0v.A02 || fMessage.A02 == 2) && this.A0l.CMI()) {
            return true;
        }
        return false;
    }

    public void A1u() {
        A04();
        AnonymousClass3uP.A0h(this, false);
    }

    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        FrameLayout frameLayout = this.A0E;
        if (frameLayout != null) {
            innerFrameLayouts.add(frameLayout);
        }
        C18070vi.A0b(innerFrameLayouts);
        return innerFrameLayouts;
    }

    public final ViewGroup getWebPagePreviewHolder() {
        View findViewById = findViewById(2131437044);
        if (findViewById == null) {
            return null;
        }
        if (findViewById instanceof ViewStub) {
            findViewById = ((ViewStub) findViewById).inflate();
        }
        if (findViewById instanceof ViewGroup) {
            return (ViewGroup) findViewById;
        }
        return null;
    }

    public int getIncomingLayoutId() {
        return 2131624863;
    }

    public int getOutgoingLayoutId() {
        return 2131624865;
    }
}
