package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.TextAndDateLayout;
import java.util.Collections;

/* renamed from: X.3uO  reason: invalid class name */
public class AnonymousClass3uO extends C78313sa {
    public int A00;
    public View A01;
    public ViewGroup A02;
    public TextView A03;
    public C19880zA A04;
    public AnonymousClass2ZN A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public TextEmojiLabel A09;
    public TextAndDateLayout A0A;
    public C88644aH A0B;
    public C86324Re A0C;
    public AnonymousClass1NN A0D;
    public C32981i4 A0E;
    public AnonymousClass12M A0F;
    public AnonymousClass1LU A0G;
    public AnonymousClass1PU A0H;
    public C108645c3 A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;

    public static void A06(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.85f, 0.8f, 0.85f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setDuration(500);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
    }

    public void A2j(TextEmojiLabel textEmojiLabel, AnonymousClass210 r7, String str) {
        textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textEmojiLabel.clearAnimation();
        Integer A002 = C137596vi.A00(str);
        if (A002 != null) {
            textEmojiLabel.setCompoundDrawablesWithIntrinsicBounds(A002.intValue(), 0, 0, 0);
            AnonymousClass3MW.A1S(textEmojiLabel);
            A06(textEmojiLabel);
        }
        C18030ve r3 = this.A0F;
        C32011gU r2 = this.A1D;
        A2k(r7, C87754Wv.A05.A01(getContext(), r3, r2, r7));
        if (r7.A0z(32768)) {
            if (C18020vd.A05(C18040vf.A02, this.A0F, 9584)) {
                this.A18.A08(new C98814rl(this, r7, 34), Collections.singleton(C18070vi.A09(r7, C20952Ac6.class)), false);
            }
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a2, code lost:
        if (X.C18070vi.A18(X.C29431cG.A0d(r2), "refresh") != false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0300, code lost:
        if (r25 != false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0369, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0F, 9422) == false) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ef, code lost:
        if (r4.A04 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        if (X.C137186v3.A00(r1.A0P()) >= 90) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0207, code lost:
        if (r6 != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0.A0C.A00(r1) != false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.AnonymousClass3uO r27, X.AnonymousClass210 r28) {
        /*
            r0 = r27
            boolean r2 = r0.A08()
            r1 = r28
            if (r2 == 0) goto L_0x0334
            android.view.ViewGroup r6 = r0.getWebPagePreviewHolder()
            if (r6 == 0) goto L_0x022e
            X.5c3 r2 = r0.A0I
            if (r2 == 0) goto L_0x022e
            r2 = 0
            r6.setVisibility(r2)
            X.Abv r2 = X.C60532oB.A00(r1)
            if (r2 == 0) goto L_0x0028
            X.4Re r2 = r0.A0C
            boolean r2 = r2.A00(r1)
            r25 = 0
            if (r2 == 0) goto L_0x002a
        L_0x0028:
            r25 = 1
        L_0x002a:
            X.4Re r2 = r0.A0C
            boolean r26 = r2.A01(r1)
            X.4aH r2 = r0.A0B
            if (r2 != 0) goto L_0x00d7
            android.content.Context r11 = r0.getContext()
            X.5c7 r9 = r0.A0l
            X.1nl r12 = r0.A0T
            X.1no r8 = r0.A10
            X.1gV r7 = r0.A1S
            X.6lM r5 = r0.A1C
            X.4Oj r16 = r0.A1n()
            X.0zA r3 = r0.A04
            boolean r2 = r3.A07()
            if (r2 == 0) goto L_0x0051
            r3.A03()
        L_0x0051:
            X.0ve r4 = r0.A0F
            X.5bZ r15 = r0.A09
            X.00H r2 = r0.A0Q
            java.lang.Object r3 = r2.get()
            X.2r5 r3 = (X.C62242r5) r3
            X.00H r2 = r0.A0S
            java.lang.Object r14 = r2.get()
            X.4Qu r14 = (X.C86224Qu) r14
            X.00H r2 = r0.A0L
            java.lang.Object r13 = r2.get()
            X.A5M r13 = (X.A5M) r13
            X.10I r2 = r0.A1X
            X.4aH r10 = new X.4aH
            r23 = r7
            r24 = r2
            r21 = r5
            r22 = r3
            r20 = r4
            r19 = r8
            r18 = r9
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A0B = r10
            int r3 = r6.getPaddingLeft()
            int r2 = r6.getPaddingRight()
            r10.A00 = r3
            r10.A01 = r2
            X.4aH r2 = r0.A0B
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r2.A0K
            X.C72453Mb.A1E(r2, r6)
            X.4aH r2 = r0.A0B
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r2.A0K
            X.AnonymousClass3uP.A0W(r2, r0)
            X.0ve r4 = r0.A0F
            r3 = 9213(0x23fd, float:1.291E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x00d7
            r3 = 6
            int r2 = r1.A01
            if (r3 != r2) goto L_0x00d7
            X.4aH r3 = r0.A0B
            X.00H r2 = r0.A0N
            java.lang.Object r2 = r2.get()
            X.A2e r2 = (X.C19991A2e) r2
            r3.A05 = r2
            X.4aH r3 = r0.A0B
            X.11S r2 = r0.A0U
            r3.A02 = r2
            X.00H r2 = r0.A0M
            java.lang.Object r2 = r2.get()
            X.AR0 r2 = (X.AR0) r2
            r3.A04 = r2
            X.4aH r3 = r0.A0B
            X.00H r2 = r0.A0P
            X.10I r2 = X.AnonymousClass3MX.A0x(r2)
            r3.A06 = r2
        L_0x00d7:
            X.0ve r5 = r0.A0F
            X.1gU r4 = r0.A1D
            android.content.Context r3 = r0.getContext()
            X.4X8 r2 = X.C87754Wv.A05
            X.4Wv r4 = r2.A01(r3, r5, r4, r1)
            X.5c3 r2 = r0.A0I
            boolean r2 = r2 instanceof X.DR0
            if (r2 == 0) goto L_0x00f1
            boolean r2 = r4.A04
            r24 = 1
            if (r2 != 0) goto L_0x00f3
        L_0x00f1:
            r24 = 0
        L_0x00f3:
            r5 = 72
            if (r24 == 0) goto L_0x00f9
            r0.A00 = r5
        L_0x00f9:
            r8 = 1
            if (r24 == 0) goto L_0x010a
            java.lang.String r2 = r1.A0P()
            int r3 = X.C137186v3.A00(r2)
            r2 = 90
            r27 = 1
            if (r3 < r2) goto L_0x010c
        L_0x010a:
            r27 = 0
        L_0x010c:
            X.0ve r3 = r0.A0F
            r2 = 9584(0x2570, float:1.343E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r7, r3, r2)
            X.Abv r3 = X.C60532oB.A00(r1)
            X.1gV r2 = r0.A1S
            boolean r2 = X.AnonymousClass2T7.A00(r1, r2, r8)
            if (r2 == 0) goto L_0x0304
            X.36w r8 = X.C60502o8.A00(r1)
            if (r8 == 0) goto L_0x02fa
            android.content.Context r2 = r0.getContext()
            int r5 = X.C88264Yz.A00(r2)
            if (r27 == 0) goto L_0x02f3
            if (r6 == 0) goto L_0x02ed
            X.4QT r3 = X.C80023wQ.A03
            X.4QT r2 = X.C80023wQ.A02
        L_0x0138:
            X.3wQ r9 = new X.3wQ
            r9.<init>(r3, r2, r5)
        L_0x013d:
            int r3 = r8.A01
            int r2 = r8.A00
            r9.A05(r3, r2)
        L_0x0144:
            boolean r2 = r9 instanceof X.C79953wJ
            if (r2 == 0) goto L_0x02d4
            r5 = 72
        L_0x014a:
            r0.A00 = r5
        L_0x014c:
            X.4aH r3 = r0.A0B
            X.5c3 r2 = r0.A0I
            r21 = r1
            r22 = r2
            r23 = r4
            r28 = r6
            r20 = r3
            r20.A04(r21, r22, r23, r24, r25, r26, r27, r28)
            X.Ac1 r2 = X.AnonymousClass9RY.A00(r1)
            if (r2 == 0) goto L_0x016d
            X.0ve r3 = r0.A0F
            r2 = 9422(0x24ce, float:1.3203E-41)
            boolean r2 = X.C18020vd.A05(r7, r3, r2)
            if (r2 != 0) goto L_0x022e
        L_0x016d:
            android.view.ViewGroup r2 = r0.A02
            if (r2 == 0) goto L_0x022e
            java.lang.String r5 = r4.A03
            boolean r12 = X.C87504Vv.A01(r5)
            X.1i4 r3 = r0.A0E
            java.lang.String r2 = r4.A02
            boolean r11 = r3.A0J(r2)
            X.1i4 r6 = r0.A0E
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r10 = 0
            if (r2 != 0) goto L_0x0195
            android.net.Uri r2 = android.net.Uri.parse(r5)
            r3 = 13
            int r2 = r6.A0E(r2)
            if (r3 != r2) goto L_0x0195
            r10 = 1
        L_0x0195:
            X.1i4 r2 = r0.A0E
            boolean r16 = r2.A0I(r5)
            android.net.Uri r2 = android.net.Uri.parse(r5)
            X.2tm r7 = X.AnonymousClass4YQ.A03
            boolean r15 = r7.A07(r2)
            r9 = 0
            if (r5 == 0) goto L_0x01ac
            android.net.Uri r9 = android.net.Uri.parse(r5)
        L_0x01ac:
            r6 = 0
            if (r9 == 0) goto L_0x01fb
            java.lang.String r3 = "wa.me"
            java.lang.String r2 = r9.getHost()
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 == 0) goto L_0x01fb
            java.util.List r2 = r9.getPathSegments()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01fb
            java.util.List r2 = r9.getPathSegments()
            java.lang.Object r3 = r2.get(r6)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r2 = "ais"
            boolean r8 = android.text.TextUtils.equals(r2, r3)
            r3 = 1
            java.util.List r2 = r9.getPathSegments()
            if (r8 == 0) goto L_0x02c2
            int r2 = r2.size()
            if (r2 <= r3) goto L_0x01fb
            java.util.List r2 = r9.getPathSegments()
            java.lang.String r3 = X.C17880vN.A0w(r2, r3)
            if (r3 == 0) goto L_0x01fb
            boolean r2 = android.text.TextUtils.isDigitsOnly(r3)
            if (r2 == 0) goto L_0x01fb
            X.2qw r2 = X.C42711yc.A01
            X.1yc r2 = r2.A01(r3)
        L_0x01f8:
            if (r2 == 0) goto L_0x01fb
            r6 = 1
        L_0x01fb:
            r9 = 0
            if (r12 != 0) goto L_0x0209
            if (r11 != 0) goto L_0x0209
            if (r10 != 0) goto L_0x0209
            if (r16 != 0) goto L_0x0209
            if (r15 != 0) goto L_0x0209
            r8 = 0
            if (r6 == 0) goto L_0x0220
        L_0x0209:
            r8 = 1
            if (r12 == 0) goto L_0x0255
            int r2 = r1.A00
            r3 = 1
            if (r2 == r8) goto L_0x0212
            r3 = 0
        L_0x0212:
            X.205 r2 = r1.A0v
            boolean r2 = r2.A02
            if (r2 == 0) goto L_0x024c
            r9 = 2131897886(0x7f122e1e, float:1.9430674E38)
            if (r3 == 0) goto L_0x0220
            r9 = 2131897957(0x7f122e65, float:1.9430818E38)
        L_0x0220:
            android.view.ViewGroup r2 = r0.A02
            r14 = 0
            X.7Q6 r10 = new X.7Q6
            r11 = r0
            r12 = r4
            r13 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A2C(r2, r10, r9, r8)
        L_0x022e:
            android.view.ViewGroup r1 = r0.A02
            if (r1 == 0) goto L_0x024b
            com.whatsapp.components.TextAndDateLayout r1 = r0.A0A
            if (r1 == 0) goto L_0x024b
            boolean r1 = X.C79103uS.A1H(r0)
            if (r1 == 0) goto L_0x024b
            android.view.ViewGroup r1 = r0.A02
            r0.setViewToMatchParent(r1)
            com.whatsapp.components.TextAndDateLayout r1 = r0.A0A
            r0.setViewToMatchParent(r1)
            com.whatsapp.components.TextAndDateLayout r1 = r0.A0A
            r0 = 1
            r1.A03 = r0
        L_0x024b:
            return
        L_0x024c:
            r9 = 2131891518(0x7f12153e, float:1.9417758E38)
            if (r3 == 0) goto L_0x0220
            r9 = 2131891522(0x7f121542, float:1.9417766E38)
            goto L_0x0220
        L_0x0255:
            if (r11 == 0) goto L_0x025b
            r9 = 2131897869(0x7f122e0d, float:1.943064E38)
            goto L_0x0220
        L_0x025b:
            if (r10 == 0) goto L_0x0261
            r9 = 2131897962(0x7f122e6a, float:1.9430828E38)
            goto L_0x0220
        L_0x0261:
            if (r16 == 0) goto L_0x0267
            r9 = 2131887655(0x7f120627, float:1.9409923E38)
            goto L_0x0220
        L_0x0267:
            if (r15 == 0) goto L_0x02bb
            android.net.Uri r3 = android.net.Uri.parse(r5)
            java.lang.String r2 = "create"
            boolean r2 = X.C63842tm.A03(r3, r7, r2)
            if (r2 == 0) goto L_0x0279
            r9 = 2131889090(0x7f120bc2, float:1.9412834E38)
            goto L_0x0220
        L_0x0279:
            android.net.Uri r3 = android.net.Uri.parse(r5)
            java.lang.String r2 = "directory"
            boolean r2 = X.C63842tm.A03(r3, r7, r2)
            if (r2 != 0) goto L_0x02a4
            android.net.Uri r3 = android.net.Uri.parse(r5)
            if (r3 == 0) goto L_0x02a9
            boolean r2 = r7.A07(r3)
            if (r2 == 0) goto L_0x02a9
            java.util.List r2 = r3.getPathSegments()
            X.C18070vi.A0X(r2)
            java.lang.Object r3 = X.C29431cG.A0d(r2)
            java.lang.String r2 = "refresh"
            boolean r2 = X.C18070vi.A18(r3, r2)
            if (r2 == 0) goto L_0x02a9
        L_0x02a4:
            r9 = 2131890410(0x7f1210ea, float:1.9415511E38)
            goto L_0x0220
        L_0x02a9:
            android.net.Uri r2 = android.net.Uri.parse(r5)
            java.lang.Long r2 = r7.A05(r2)
            r9 = 2131897901(0x7f122e2d, float:1.9430705E38)
            if (r2 == 0) goto L_0x0220
            r9 = 2131897965(0x7f122e6d, float:1.9430834E38)
            goto L_0x0220
        L_0x02bb:
            if (r6 == 0) goto L_0x0220
            r9 = 2131886594(0x7f120202, float:1.9407771E38)
            goto L_0x0220
        L_0x02c2:
            java.lang.String r3 = X.C17880vN.A0w(r2, r6)
            boolean r2 = android.text.TextUtils.isDigitsOnly(r3)
            if (r2 == 0) goto L_0x01fb
            X.1Dx r2 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r2 = r2.A03(r3)
            goto L_0x01f8
        L_0x02d4:
            boolean r2 = r9 instanceof X.C80043wS
            if (r2 == 0) goto L_0x02e9
            X.3wS r9 = (X.C80043wS) r9
            boolean r2 = r9.A06()
            if (r2 == 0) goto L_0x02e6
            X.4QT r2 = r9.A01
        L_0x02e2:
            int r5 = r2.A02
            goto L_0x014a
        L_0x02e6:
            X.4QT r2 = r9.A00
            goto L_0x02e2
        L_0x02e9:
            r5 = 100
            goto L_0x014a
        L_0x02ed:
            X.4QT r3 = X.C80023wQ.A01
            X.4QT r2 = X.C80023wQ.A00
            goto L_0x0138
        L_0x02f3:
            X.3wR r9 = new X.3wR
            r9.<init>(r5, r6)
            goto L_0x013d
        L_0x02fa:
            if (r3 == 0) goto L_0x014c
            byte[] r2 = r3.A0N
            if (r2 == 0) goto L_0x014c
            if (r25 == 0) goto L_0x014c
            goto L_0x014a
        L_0x0304:
            if (r6 == 0) goto L_0x014c
            X.Abv r2 = X.C60532oB.A00(r1)
            if (r2 != 0) goto L_0x014c
            byte[] r2 = r1.A1A()
            if (r2 != 0) goto L_0x0316
            r5 = 65
            goto L_0x014a
        L_0x0316:
            android.content.Context r2 = r0.getContext()
            int r5 = X.C88264Yz.A00(r2)
            if (r27 == 0) goto L_0x032e
            X.4QT r3 = X.C80023wQ.A03
            X.4QT r2 = X.C80023wQ.A02
            X.3wQ r9 = new X.3wQ
            r9.<init>(r3, r2, r5)
        L_0x0329:
            r9.A05(r8, r8)
            goto L_0x0144
        L_0x032e:
            X.3wR r9 = new X.3wR
            r9.<init>(r5, r8)
            goto L_0x0329
        L_0x0334:
            X.0ve r3 = r0.A0F
            r2 = 11800(0x2e18, float:1.6535E-41)
            boolean r2 = X.C25291Nq.A04(r3, r2)
            if (r2 == 0) goto L_0x0469
            r2 = 2131437044(0x7f0b25f4, float:1.8495976E38)
            android.view.View r4 = r0.findViewById(r2)
        L_0x0345:
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x038b
            X.4aH r2 = r0.A0B
            r5 = 0
            if (r2 == 0) goto L_0x0358
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.whatsapp.webpagepreview.WebPagePreviewView r2 = r2.A0K
            r3.removeView(r2)
            r0.A0B = r5
        L_0x0358:
            X.Ac1 r2 = X.AnonymousClass9RY.A00(r1)
            if (r2 == 0) goto L_0x036b
            X.0ve r6 = r0.A0F
            r3 = 9422(0x24ce, float:1.3203E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r6, r3)
            r3 = 1
            if (r2 != 0) goto L_0x036c
        L_0x036b:
            r3 = 0
        L_0x036c:
            android.view.View r2 = r0.A05
            if (r2 == 0) goto L_0x0386
            if (r3 != 0) goto L_0x0386
            boolean r2 = X.AnonymousClass3uP.A0j(r0, r1)
            if (r2 == 0) goto L_0x045c
            int r3 = r1.A0u
            r2 = 1
            if (r3 == 0) goto L_0x0386
            if (r3 == r2) goto L_0x0386
            r2 = 9
            if (r3 == r2) goto L_0x0386
            r2 = 3
            if (r3 != r2) goto L_0x045c
        L_0x0386:
            r2 = 8
            r4.setVisibility(r2)
        L_0x038b:
            X.0ve r4 = r0.A0F
            r3 = 2446(0x98e, float:3.428E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r4, r3)
            if (r2 == 0) goto L_0x022e
            r2 = 2131434307(0x7f0b1b43, float:1.8490424E38)
            com.whatsapp.TextEmojiLabel r2 = X.AnonymousClass3MX.A0W(r0, r2)
            r0.A09 = r2
            r2 = 2131434293(0x7f0b1b35, float:1.8490396E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r0, r2)
            r0.A03 = r2
            r2 = 2131434304(0x7f0b1b40, float:1.8490418E38)
            com.whatsapp.TextEmojiLabel r2 = X.AnonymousClass3MX.A0W(r0, r2)
            r0.A08 = r2
            r2 = 2131434305(0x7f0b1b41, float:1.849042E38)
            com.whatsapp.TextEmojiLabel r2 = X.AnonymousClass3MX.A0W(r0, r2)
            r0.A07 = r2
            if (r28 == 0) goto L_0x022e
            X.206 r4 = r1.A0K()
            if (r4 == 0) goto L_0x022e
            boolean r2 = r4 instanceof X.AnonymousClass23W
            if (r2 == 0) goto L_0x022e
            X.23W r4 = (X.AnonymousClass23W) r4
            X.205 r2 = r4.A0v
            X.1BI r3 = r2.A00
            X.205 r2 = r1.A0v
            boolean r2 = r2.A02
            if (r2 != 0) goto L_0x022e
            boolean r2 = X.C22971Dz.A0e(r3)
            if (r2 == 0) goto L_0x022e
            java.lang.String r3 = r4.A01
            X.1yz r2 = X.AnonymousClass1EC.A01
            X.1EC r2 = r2.A02(r3)
            if (r2 == 0) goto L_0x022e
            X.206 r2 = r1.A0K()
            if (r2 == 0) goto L_0x022e
            X.205 r2 = r2.A0v
            X.1BI r2 = r2.A00
            X.1EC r4 = X.C42941yz.A00(r2)
            if (r4 == 0) goto L_0x0426
            com.whatsapp.TextEmojiLabel r3 = r0.A09
            if (r3 == 0) goto L_0x0426
            android.widget.TextView r2 = r0.A03
            if (r2 == 0) goto L_0x0426
            com.whatsapp.TextEmojiLabel r2 = r0.A08
            if (r2 == 0) goto L_0x0426
            com.whatsapp.TextEmojiLabel r2 = r0.A07
            if (r2 == 0) goto L_0x0426
            X.1CJ r2 = r0.A0E
            java.lang.String r2 = r2.A0F(r4)
            r3.setText(r2)
            android.widget.TextView r2 = r0.A03
            r3 = 8
            r2.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r2 = r0.A08
            r2.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r3 = r0.A07
            r2 = 0
            r3.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r3 = r0.A07
            r2 = 2131886749(0x7f12029d, float:1.9408086E38)
            r3.setText(r2)
        L_0x0426:
            android.view.View r2 = r0.A05
            if (r2 != 0) goto L_0x0441
            android.view.ViewGroup r2 = r0.A02
            if (r2 == 0) goto L_0x0441
            android.view.LayoutInflater r5 = X.AnonymousClass3MZ.A0D(r0)
            r3 = 2131623986(0x7f0e0032, float:1.8875139E38)
            r2 = 0
            android.view.View r3 = X.AnonymousClass3MX.A09(r5, r2, r3)
            r0.A05 = r3
            android.view.ViewGroup r2 = r0.A02
            X.C72453Mb.A1E(r3, r2)
        L_0x0441:
            android.widget.TextView r5 = r0.getActionButtonView()
            if (r5 == 0) goto L_0x022e
            android.view.View r3 = r0.A05
            if (r3 == 0) goto L_0x022e
            r2 = 0
            r3.setVisibility(r2)
            r2 = 2131886747(0x7f12029b, float:1.9408082E38)
            r5.setText(r2)
            r2 = 17
            X.AnonymousClass48j.A00(r5, r1, r4, r0, r2)
            goto L_0x022e
        L_0x045c:
            android.view.ViewGroup r3 = r0.A02
            if (r3 == 0) goto L_0x0465
            android.view.View r2 = r0.A05
            r3.removeView(r2)
        L_0x0465:
            r0.A05 = r5
            goto L_0x0386
        L_0x0469:
            android.view.ViewGroup r4 = r0.getWebPagePreviewHolder()
            goto L_0x0345
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uO.A07(X.3uO, X.210):void");
    }

    private boolean A08() {
        AnonymousClass206 r5 = this.A0I;
        C20941Abv A002 = C60532oB.A00(r5);
        if (A002 == null || !A002.A00) {
            C18030ve r6 = this.A0F;
            C63752td r4 = (C63752td) this.A1r.get();
            C32011gU r2 = this.A1D;
            C32981i4 r3 = this.A0E;
            String str = C87754Wv.A05.A01(getContext(), r6, r2, r5).A03;
            if ((!r3.A0I(str) || !C18020vd.A05(C18040vf.A02, r6, 10630)) && !TextUtils.isEmpty(str) && r4.A04(r5)) {
                return true;
            }
            C20941Abv A003 = C60532oB.A00(r5);
            if (A003 == null || A003.A0H || A003.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    private TextView getActionButtonView() {
        View view = this.A05;
        if (view == null) {
            return null;
        }
        return C17880vN.A0E(view, 2131427479);
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public boolean A1Z() {
        if (!AnonymousClass25A.A0W(this.A0E, this.A0I, this.A2O) || !AnonymousClass25A.A0t(this.A0I)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r1 != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1i() {
        /*
            r4 = this;
            X.206 r2 = r4.A0I
            boolean r0 = X.AnonymousClass25A.A0m(r2)
            r3 = 0
            if (r0 == 0) goto L_0x004a
            X.18O r1 = r4.A0W
            X.18R r0 = X.AnonymousClass18O.A0b
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0032
            X.206 r0 = r4.A0I
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x0032
            X.0ve r0 = r4.A0F
            boolean r1 = r4.A0V
            boolean r0 = X.C26180Cu0.A03(r0, r2)
            if (r0 != 0) goto L_0x0032
            boolean r0 = X.AnonymousClass25A.A0w(r2)
            if (r0 == 0) goto L_0x0032
            r2 = 1
            if (r1 == 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            X.00H r0 = r4.A0O
            java.lang.Object r1 = r0.get()
            X.4R1 r1 = (X.AnonymousClass4R1) r1
            X.206 r0 = r4.A0I
            java.util.List r0 = r1.A00(r0)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r2 == 0) goto L_0x004a
            if (r0 != 0) goto L_0x004a
            r3 = 1
        L_0x004a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uO.A1i():boolean");
    }

    public void A1x() {
        TextEmojiLabel textEmojiLabel = this.A06;
        if (textEmojiLabel != null) {
            textEmojiLabel.setEnabled(true);
            textEmojiLabel.setSelectAllOnFocus(true);
            textEmojiLabel.setTextIsSelectable(true);
        }
    }

    public void A2R(AnonymousClass206 r3) {
        A4u.A01((A4u) this.A0K.get(), r3, 3);
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        boolean A1Z = AnonymousClass3Ma.A1Z(r2, this.A0I);
        super.A2V(r2, z);
        if (z || A1Z) {
            A2i();
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A06;
        if (!(textEmojiLabel == null || textEmojiLabel.getAnimation() != null || C137596vi.A00(getMessageText()) == null)) {
            A06(this.A06);
        }
        if (C60502o8.A00(this.A0I) != null && C79103uS.A1H(this)) {
            A07(this, (AnonymousClass210) this.A0I);
        }
    }

    public void A2i() {
        if (this.A06 != null) {
            AnonymousClass210 r4 = (AnonymousClass210) this.A0I;
            String messageText = getMessageText();
            this.A00 = 0;
            A2P(r4);
            A2N(r4);
            A07(this, r4);
            TextEmojiLabel textEmojiLabel = this.A06;
            if (textEmojiLabel != null) {
                setMessageText(messageText, textEmojiLabel, r4);
                A2j(textEmojiLabel, r4, messageText);
            }
            C53542ch r1 = (C53542ch) this.A23.get();
            C18070vi.A0d(r4, 0);
            if (r4.A0z(65536)) {
                if (C18020vd.A05(C18040vf.A02, r1.A00, 12655)) {
                    this.A18.A09(new C98814rl(this, r4, 33), new AnonymousClass25F[]{C18070vi.A09(r4, C97504pa.class)});
                }
            }
        }
    }

    public void A2k(AnonymousClass206 r3, C87754Wv r4) {
        String str = r4.A02;
        if (str != null) {
            this.A0E.A0K(str);
            this.A0E.A0J(str);
            C18070vi.A0d(r3, 0);
            ((AnonymousClass4N7) this.A0J.get()).A00.A0N(3544);
            ((AnonymousClass4N7) this.A0J.get()).A00.A0N(3545);
        }
    }

    public void A2m(C108645c3 r4) {
        C39441t5 r2 = new C39441t5(this.A0F);
        this.A02 = AnonymousClass3MW.A0C(this, 2131432248);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(this, 2131432683);
        this.A06 = A0V;
        A0V.setLinkHandler(r2);
        this.A06.setAutoLinkMask(0);
        this.A06.setLinksClickable(false);
        this.A06.setFocusable(false);
        this.A06.setClickable(false);
        this.A06.setLongClickable(false);
        this.A0A = (TextAndDateLayout) AnonymousClass1HF.A06(this, 2131429622);
        this.A0I = r4;
        A2i();
        r2.A00 = new C98784ri((Object) this, 30);
    }

    public AnonymousClass210 getFMessage() {
        return (AnonymousClass210) this.A0I;
    }

    public String getMessageText() {
        boolean isEmpty = TextUtils.isEmpty(this.A0I.A0S());
        AnonymousClass206 r0 = this.A0I;
        if (!isEmpty) {
            return r0.A0S();
        }
        String A0P2 = r0.A0P();
        if (A0P2 == null) {
            return "";
        }
        return A0P2;
    }

    public void setFMessage(AnonymousClass206 r4) {
        C17960vV.A0H(r4 instanceof AnonymousClass210, AnonymousClass001.A1E(r4, "Expected a message of type FMessageText but instead found ", AnonymousClass000.A10()));
        this.A0I = r4;
    }

    public AnonymousClass3uO(Context context, C108875cR r3, AnonymousClass210 r4) {
        super(context, r3, r4);
        A1M();
        A2m(C63752td.A00(context));
    }

    private void setViewToMatchParent(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            viewGroup.setLayoutParams(layoutParams);
        }
    }

    public boolean A1V() {
        if (!A08() || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public boolean A1Y() {
        if (!A1f()) {
            return false;
        }
        if (!A08()) {
            if (!C18020vd.A05(C18040vf.A02, AnonymousClass3MY.A0W(this.A2B), 7389)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void A1u() {
        A2i();
        AnonymousClass3uP.A0h(this, false);
    }

    public void A23(int i) {
        super.A23(i);
        if (this.A0I.A0K() == null && !A08()) {
            if (A2d(this.A17, this.A0I, i, this.A0V)) {
                TextEmojiLabel textEmojiLabel = this.A06;
                if (textEmojiLabel != null) {
                    textEmojiLabel.setPadding(textEmojiLabel.getPaddingLeft(), 0, this.A06.getPaddingRight(), this.A06.getPaddingBottom());
                    return;
                }
                return;
            }
            TextAndDateLayout textAndDateLayout = this.A0A;
            if (textAndDateLayout != null) {
                textAndDateLayout.setPadding(textAndDateLayout.getPaddingLeft(), AnonymousClass000.A0Y(this).getDimensionPixelOffset(2131168783), this.A0A.getPaddingRight(), this.A0A.getPaddingBottom());
            }
        }
    }

    public void A2K(AnonymousClass206 r3) {
        C90074dU r1;
        ViewStub A0F2;
        super.A2K(r3);
        A2L(r3);
        A2Q(r3);
        if (this.A0A == null) {
            this.A0A = (TextAndDateLayout) AnonymousClass1HF.A06(this, 2131429622);
        }
        if (AnonymousClass3MW.A0X(this.A1k).A0D() && AnonymousClass25A.A0P(this.A0U, r3)) {
            boolean A0z = r3.A0z(16384);
            View view = this.A01;
            if (!A0z) {
                C72453Mb.A1B(view);
                r1 = null;
            } else {
                if (view == null && (A0F2 = AnonymousClass3MW.A0F(this, 2131428303)) != null) {
                    this.A01 = A0F2.inflate();
                }
                View view2 = this.A01;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                r1 = new C90074dU(this, r3, 36);
            }
            setOnClickListener(r1);
        }
    }

    public void A2l(AnonymousClass210 r1) {
        setFMessage(r1);
        A2i();
        A2L(r1);
    }

    public int getMainChildMaxWidth() {
        if (C79103uS.A1H(this) || this.A00 == 0) {
            return 0;
        }
        return C88264Yz.A01(getContext(), this.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float getTextFontSize() {
        /*
            r5 = this;
            float r2 = super.getTextFontSize()
            X.00H r0 = r5.A0L
            java.lang.Object r1 = r0.get()
            X.16y r1 = (X.C216716y) r1
            java.lang.String r0 = r5.getMessageText()
            int r4 = X.C63462t7.A00(r0)
            if (r4 <= 0) goto L_0x0061
            r0 = 1
            if (r4 != r0) goto L_0x003e
            X.0ve r3 = r1.A00
            r1 = 12839(0x3227, float:1.7991E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x003e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131166226(0x7f070412, float:1.7946691E38)
            float r1 = X.AnonymousClass3MW.A00(r1, r0)
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r5)
            float r0 = r0.density
            float r1 = r1 / r0
        L_0x0037:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0061
            return r1
        L_0x003e:
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r5)
            float r1 = r0.density
            float r1 = r1 * r2
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r5)
            float r0 = r0.scaledDensity
            float r1 = r1 / r0
            float r1 = java.lang.Math.min(r2, r1)
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            float r1 = java.lang.Math.max(r2, r1)
            float r1 = r1 - r2
            int r0 = 4 - r4
            float r0 = (float) r0
            float r1 = r1 * r0
            r0 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            float r1 = r1 + r2
            goto L_0x0037
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3uO.getTextFontSize():float");
    }

    public ViewGroup getWebPagePreviewHolder() {
        View findViewById = findViewById(2131437044);
        if (findViewById == null) {
            return null;
        }
        if (findViewById instanceof ViewStub) {
            findViewById = ((ViewStub) findViewById).inflate();
        }
        return (ViewGroup) findViewById;
    }

    public int getCenteredLayoutId() {
        return 2131624945;
    }

    public int getIncomingLayoutId() {
        return 2131624946;
    }

    public int getOutgoingLayoutId() {
        return 2131624948;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
