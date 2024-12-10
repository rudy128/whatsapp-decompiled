package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.3rW  reason: invalid class name */
public class AnonymousClass3rW extends C75433hU {
    public long A00;
    public Handler A01;
    public C446324e A02;
    public C28931bI A03;
    public C28931bI A04;
    public AnonymousClass00H A05;
    public Runnable A06;
    public String A07;
    public boolean A08 = false;
    public boolean A09;
    public C21472Akd A0A;
    public ConversationTitleViewModel A0B;
    public final C25001Mm A0C;
    public final C37311pJ A0D;
    public final C62632ri A0E;
    public final AnonymousClass11P A0F;
    public final AnonymousClass12L A0G;
    public final AnonymousClass1MB A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass1F9 A0L;
    public final AnonymousClass1FD A0M;
    public final C19880zA A0N;
    public final C19880zA A0O;
    public final AnonymousClass11S A0P;
    public final C107115Yl A0Q = new C93034iK(this);
    public final AnonymousClass2LL A0R;
    public final AnonymousClass1UD A0S;
    public final C72103Kq A0T = new C94364kV(this, 0);
    public final AnonymousClass1CJ A0U;
    public final C24641Lc A0V;
    public final C34771l3 A0W;
    public final AnonymousClass1PV A0X;
    public final C32131gh A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;

    private void A03(int i) {
        View view = this.A02;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0310, code lost:
        if (X.AnonymousClass72Y.A01(r15.A0U, r15.A0F, r9) == null) goto L_0x0312;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass3rW r19) {
        /*
            r15 = r19
            r15.A0D()
            android.util.Pair r8 = r15.A0K()
            java.lang.Object r0 = r8.first
            int r0 = X.AnonymousClass000.A0M(r0)
            r5 = 1
            if (r0 != r5) goto L_0x00ac
            java.lang.Object r1 = r8.second
            java.lang.String r1 = (java.lang.String) r1
            r7 = 0
            X.C18070vi.A0d(r1, r7)
            X.1bI r0 = r15.A0J
            X.AnonymousClass3Ma.A1M(r0)
            android.view.View r0 = r15.A02
            if (r0 == 0) goto L_0x0026
            r0.setVisibility(r7)
        L_0x0026:
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            r0.setVisibility(r7)
            android.view.View r0 = r15.A02
            if (r0 == 0) goto L_0x0092
            int r0 = r0.getWidth()
            float r10 = (float) r0
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            android.text.TextPaint r0 = r0.getPaint()
            if (r0 == 0) goto L_0x0092
            float r2 = r0.measureText(r1)
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a4
            boolean r0 = r15.A0L
            if (r0 != 0) goto L_0x00a4
            r15.A0L = r5
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            r0.setText(r1)
            X.0vb r0 = r15.A0a
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x005e
            float r10 = -r2
        L_0x005e:
            r8 = 0
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r11 = r7
            r13 = r7
            r14 = r8
            r9 = r7
            r12 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 3000(0xbb8, double:1.482E-320)
            r6.setDuration(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.setStartOffset(r0)
            r0 = 2
            X.C74613c2.A00(r6, r15, r0)
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0084
            int r0 = (int) r2
            r1.width = r0
        L_0x0084:
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            r0.setLayoutParams(r1)
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            r0.startAnimation(r6)
        L_0x0092:
            com.whatsapp.conversation.viewmodel.ConversationTitleViewModel r3 = r15.A0B
            X.1E7 r2 = r15.A0H
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x00a3
            r3.A00 = r5
            X.10I r1 = r3.A04
            r0 = 44
            X.C98704ra.A00(r1, r3, r2, r0)
        L_0x00a3:
            return
        L_0x00a4:
            com.whatsapp.TextEmojiLabel r0 = r15.A0A()
            r0.setText(r1)
            goto L_0x0092
        L_0x00ac:
            boolean r9 = r15.A0F()
            r1 = 3
            if (r9 == 0) goto L_0x00df
            X.1xh r6 = r15.A0D
            if (r6 == 0) goto L_0x00df
            X.1E7 r0 = r15.A0H
            java.lang.String r4 = r0.A0L()
            X.01E r3 = r15.A0U
            X.1xh r0 = r15.A0D
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            android.text.TextPaint r2 = r0.getPaint()
            X.1KW r0 = r15.A0z
            java.lang.CharSequence r2 = X.C43251zV.A03(r3, r2, r0, r4)
            com.whatsapp.TextEmojiLabel r0 = r6.A01
            r0.setText(r2)
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00df
            X.1xh r0 = r15.A0D
            r0.A03(r1)
        L_0x00df:
            X.11S r2 = r15.A0P
            X.1E7 r0 = r15.A0H
            boolean r3 = X.AnonymousClass3Ma.A1V(r2, r0)
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x00f6
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            r1 = 2131898573(0x7f1230cd, float:1.9432068E38)
        L_0x00f2:
            r3.setText(r1)
            return
        L_0x00f6:
            boolean r0 = A08(r15)
            r7 = 8
            r2 = 0
            if (r0 == 0) goto L_0x0158
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r2)
            X.0zA r2 = r15.A0O
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x00a3
            X.24e r0 = r15.A02
            if (r0 != 0) goto L_0x0119
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r7)
            return
        L_0x0119:
            java.lang.String r0 = r0.A0B
            boolean r0 = X.C24605CBj.A00(r0)
            if (r0 != 0) goto L_0x014f
            X.0zA r1 = r15.A0N
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x014f
            X.1UD r0 = r15.A0S
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r1 = r1.A03()
            X.2jP r1 = (X.C57642jP) r1
            X.01E r2 = r15.A0U
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            X.24e r0 = r15.A02
            java.lang.String r5 = r0.A0B
            java.lang.String r6 = r0.A0C
            int r7 = r0.A00
            boolean r11 = r0.A0J
            boolean r12 = r0.A0I
            r8 = 1
            r9 = 0
            r4 = 0
            r10 = r9
            r1.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x014f:
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            r2.A03()
            r1 = 2131887302(0x7f1204c6, float:1.9409207E38)
            goto L_0x00f2
        L_0x0158:
            X.0ve r13 = r15.A0d
            boolean r0 = X.C84104Hw.A00(r13)
            if (r0 == 0) goto L_0x01bc
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x01bc
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r2)
            r3 = 2131887348(0x7f1204f4, float:1.94093E38)
            X.1E7 r0 = r15.A0H
            java.lang.String r4 = r0.A0L()
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0243
            X.1E7 r0 = r15.A0H
            java.lang.String r0 = r0.A0K()
            if (r0 == 0) goto L_0x0243
            android.widget.TextView r1 = r15.A0A
            X.1E7 r0 = r15.A0H
            java.lang.String r0 = r0.A0K()
            r1.setText(r0)
            if (r4 == 0) goto L_0x01aa
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setText(r3)
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = " · "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            r3.append(r0)
        L_0x01aa:
            int r1 = X.C196929vs.A00(r13)
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x00a3
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r1, r2)
            return
        L_0x01bc:
            boolean r0 = r15.A07()
            if (r0 == 0) goto L_0x01dc
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r2)
            X.00H r0 = r15.A0a
            boolean r0 = X.C72463Mc.A1V(r0)
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            r1 = 2131887340(0x7f1204ec, float:1.9409284E38)
            if (r0 == 0) goto L_0x00f2
            r1 = 2131887341(0x7f1204ed, float:1.9409286E38)
            goto L_0x00f2
        L_0x01dc:
            if (r3 == 0) goto L_0x01fe
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r2)
            X.2ri r4 = r15.A0E
            X.01E r3 = r15.A0U
            X.1E7 r2 = r15.A0H
            long r0 = r15.A00
            android.util.Pair r0 = r4.A02(r3, r2, r0)
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            if (r0 == 0) goto L_0x023e
            android.text.SpannableStringBuilder r0 = r4.A01(r3)
        L_0x01fa:
            r3.setText(r0)
            return
        L_0x01fe:
            X.1BI r1 = r15.A0f
            boolean r0 = X.C22971Dz.A0S(r1)
            if (r0 == 0) goto L_0x025b
            X.C75433hU.A00(r15)
            X.1tF r0 = r15.A0I
            if (r0 == 0) goto L_0x025b
            boolean r0 = r0.A00()
            if (r0 != r5) goto L_0x025b
            boolean r0 = r1 instanceof X.AnonymousClass1ED
            if (r0 == 0) goto L_0x00a3
            X.1kr r0 = r15.A0S
            if (r0 == 0) goto L_0x00a3
            X.1ED r1 = (X.AnonymousClass1ED) r1
            int r1 = r1.A00
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.2cM r0 = (X.C53332cM) r0
            java.util.Map r0 = r0.A01
            java.lang.Object r1 = X.AnonymousClass000.A0w(r0, r1)
            X.4ca r1 = (X.C89514ca) r1
            if (r1 == 0) goto L_0x00a3
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r2)
            com.whatsapp.TextEmojiLabel r3 = r15.A0C
            java.lang.String r0 = r1.A03
            goto L_0x01fa
        L_0x023e:
            r1 = 2131892106(0x7f12178a, float:1.941895E38)
            goto L_0x00f2
        L_0x0243:
            android.widget.TextView r0 = r15.A0A
            r0.setText(r4)
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setText(r3)
            X.1E7 r0 = r15.A0H
            boolean r0 = r0.A0O()
            if (r0 == 0) goto L_0x00a3
            X.1xh r0 = r15.A0E
            r0.A03(r1)
            return
        L_0x025b:
            java.lang.Object r0 = r8.first
            int r0 = X.AnonymousClass000.A0M(r0)
            r6 = 6
            X.2ri r4 = r15.A0E
            if (r0 != r6) goto L_0x0363
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            android.text.SpannableStringBuilder r0 = r4.A01(r0)
        L_0x026c:
            boolean r1 = X.AnonymousClass1EG.A0H(r0)
            if (r1 != 0) goto L_0x0396
            r15.A03(r2)
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r1.setVisibility(r2)
            X.1bI r2 = r15.A0J
            X.C17960vV.A07(r2)
            int r1 = X.C72453Mb.A07(r9)
            r2.A04(r1)
            android.widget.TextView r2 = r15.A09
            if (r2 == 0) goto L_0x0291
            int r1 = X.C72453Mb.A07(r9)
            r2.setVisibility(r1)
        L_0x0291:
            android.view.View r1 = r15.A02
            if (r1 != 0) goto L_0x035d
            r3 = 0
        L_0x0296:
            if (r9 == 0) goto L_0x035b
            if (r3 == 0) goto L_0x035b
            android.widget.TextView r1 = r15.A09
            if (r1 == 0) goto L_0x035b
            android.text.TextPaint r2 = r1.getPaint()
            java.lang.String r1 = "•"
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r9 = (int) r1
            android.widget.TextView r1 = r15.A09
            int r1 = r1.getPaddingLeft()
            int r9 = r9 + r1
            android.widget.TextView r1 = r15.A09
            int r1 = r1.getPaddingRight()
            int r9 = r9 + r1
            int r11 = X.C196929vs.A00(r13)
            X.1xh r1 = r15.A0D
            com.whatsapp.TextEmojiLabel r1 = r1.A01
            android.text.TextPaint r2 = r1.getPaint()
            X.1E7 r1 = r15.A0H
            java.lang.String r1 = r1.A0L()
            float r1 = r2.measureText(r1)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r10 = (int) r1
            X.01E r2 = r15.A0U
            android.content.res.Resources r1 = r2.getResources()
            X.C18070vi.A0X(r1)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r11)
            int r1 = r1.getIntrinsicWidth()
            int r10 = r10 + r1
            android.content.res.Resources r2 = r2.getResources()
            X.C18070vi.A0X(r2)
            r1 = 2131169136(0x7f070f70, float:1.7952594E38)
            int r1 = X.AnonymousClass3MX.A00(r2, r1, r10)
            int r1 = r1 + r9
            int r10 = r3 - r1
        L_0x02fb:
            r2 = 6172(0x181c, float:8.649E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r13, r2)
            if (r1 == 0) goto L_0x0312
            X.1E7 r9 = r15.A0H
            X.11P r2 = r15.A0F
            X.01E r1 = r15.A0U
            java.lang.String r2 = X.AnonymousClass72Y.A01(r1, r2, r9)
            r1 = 1
            if (r2 != 0) goto L_0x0313
        L_0x0312:
            r1 = 0
        L_0x0313:
            r15.A08 = r1
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            android.text.TextPaint r2 = r1.getPaint()
            java.lang.String r1 = r0.toString()
            float r2 = r2.measureText(r1)
            r9 = 5
            if (r10 == 0) goto L_0x0370
            float r1 = (float) r10
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0370
            X.Akd r1 = r15.A0A
            if (r1 != 0) goto L_0x03c5
            java.lang.Object r1 = r8.first
            int r1 = X.AnonymousClass000.A0M(r1)
            if (r1 == r6) goto L_0x03bd
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r1.setText(r0)
            X.11P r2 = r15.A0F
            X.1xn r14 = r15.A0V
            X.1Me r1 = r15.A0Z
            X.0vb r0 = r15.A0a
            X.Akd r12 = new X.Akd
            r17 = r1
            r18 = r0
            r19 = r7
            r16 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r15.A0A = r12
            X.1KB r2 = r15.A0W
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.A0K(r12, r0)
            return
        L_0x035b:
            r10 = r3
            goto L_0x02fb
        L_0x035d:
            int r3 = r1.getWidth()
            goto L_0x0296
        L_0x0363:
            android.view.animation.Animation r0 = r4.A02
            if (r0 == 0) goto L_0x036a
            r0.cancel()
        L_0x036a:
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x026c
        L_0x0370:
            X.Akd r2 = r15.A0A
            if (r2 == 0) goto L_0x0379
            X.1KB r1 = r15.A0W
            r1.A0I(r2)
        L_0x0379:
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r1.setText(r0)
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r8.first
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r0 == r9) goto L_0x00a3
            android.os.Handler r3 = r15.A01
            if (r3 == 0) goto L_0x00a3
            java.lang.Runnable r2 = r15.A06
            r0 = 2500(0x9c4, double:1.235E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0396:
            com.whatsapp.TextEmojiLabel r0 = r15.A0C
            r0.setVisibility(r7)
            if (r9 == 0) goto L_0x03b9
            r15.A03(r2)
            X.1bI r0 = r15.A0J
            X.C17960vV.A07(r0)
            r0.A04(r2)
        L_0x03a8:
            android.widget.TextView r0 = r15.A09
            if (r0 == 0) goto L_0x03af
            r0.setVisibility(r7)
        L_0x03af:
            X.Akd r1 = r15.A0A
            if (r1 == 0) goto L_0x00a3
            X.1KB r0 = r15.A0W
            r0.A0I(r1)
            return
        L_0x03b9:
            r15.A03(r7)
            goto L_0x03a8
        L_0x03bd:
            com.whatsapp.TextEmojiLabel r2 = r15.A0C
            android.view.View r1 = r15.A02
            r4.A04(r1, r2, r0)
            return
        L_0x03c5:
            boolean r1 = r15.A0N
            if (r1 == 0) goto L_0x03f5
            float r1 = (float) r3
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x03ef
            java.lang.Object r1 = r8.first
            int r1 = X.AnonymousClass000.A0M(r1)
            if (r1 == r9) goto L_0x03ef
            X.1xn r2 = r15.A0V
            X.1E7 r1 = r15.A0H
            java.lang.String r2 = r2.A01(r1)
            if (r2 == 0) goto L_0x03e1
            r5 = 0
        L_0x03e1:
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            if (r5 == 0) goto L_0x03e6
            r2 = r0
        L_0x03e6:
            r1.setText(r2)
        L_0x03e9:
            X.1bI r0 = r15.A0J
            r0.A04(r7)
            return
        L_0x03ef:
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r1.setText(r0)
            goto L_0x03e9
        L_0x03f5:
            com.whatsapp.TextEmojiLabel r1 = r15.A0C
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3rW.A04(X.3rW):void");
    }

    public static void A05(AnonymousClass3rW r4) {
        C42741yf r0;
        if (r4.A04 != null) {
            if (r4.A07()) {
                r4.A0W.A0J(new C70563Bp(r4, 49));
                if (C72463Mc.A1V(r4.A0a)) {
                    return;
                }
            }
            if (C18020vd.A05(C18040vf.A02, r4.A0d, 5869) && (r0 = r4.A0H.A0G) != null && r0.A01()) {
                r4.A0W.A0J(new AnonymousClass7RK(33, (Object) r4, AnonymousClass73F.A02(r4.A0f, (AnonymousClass73F) r4.A0a.get())));
            }
            if (((C88504Zz) r4.A0Z.get()).A05(AnonymousClass3MZ.A0x(r4.A0H), r4.A0H.A0C())) {
                r4.A0W.A0J(new C98774rh(r4, 0));
            }
        }
    }

    public static void A06(AnonymousClass3rW r4) {
        C39331st r0;
        boolean z = true;
        int i = 0;
        if (r4.A0M) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) AnonymousClass1E7.A01(r4.A0H);
            if (r1 == null || r4.A0U.A04(r1) <= 0) {
                z = false;
            }
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) r4.A07;
            if (z) {
                r0 = new C39331st();
            } else {
                r0 = null;
            }
            wDSProfilePhoto.setProfileBadge(r0);
        } else if (r4.A0F != null) {
            AnonymousClass1BI r12 = (AnonymousClass1BI) AnonymousClass1E7.A01(r4.A0H);
            if (r12 == null || r4.A0U.A04(r12) <= 0) {
                z = false;
            }
            WaImageView waImageView = r4.A0F;
            if (!z) {
                i = 8;
            }
            waImageView.setVisibility(i);
            if (z) {
                r4.A0F.setImageResource(2131231888);
            }
        }
    }

    private boolean A07() {
        C18030ve r3 = this.A0d;
        AnonymousClass1E7 r2 = this.A0H;
        C18070vi.A0d(r3, 0);
        if (!C18020vd.A05(C18040vf.A02, r3, 4873) || !r2.A0D() || !this.A0X.A02()) {
            return false;
        }
        return true;
    }

    public static boolean A08(AnonymousClass3rW r2) {
        C19880zA r1 = r2.A0O;
        if (!r1.A07() || !((C25811Ps) r1.A03()).A0D(r2.A0H.A0J)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r0 >= 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0143, code lost:
        if (r3 >= 0) goto L_0x0145;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0K() {
        /*
            r17 = this;
            r6 = r17
            X.11P r5 = r6.A0F
            long r15 = java.lang.System.currentTimeMillis()
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r7 = 0
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r0, r7)
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r14 = r0 ^ 1
            r12 = 5000(0x1388, double:2.4703E-320)
            if (r14 == 0) goto L_0x0028
            long r3 = r6.A00
            long r1 = r15 - r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x015a
        L_0x0028:
            X.12L r0 = r6.A0G
            X.1BI r1 = r6.A0f
            boolean r0 = X.C42761yh.A01(r0, r1)
            if (r0 != 0) goto L_0x0122
            X.0ve r0 = r6.A0d
            boolean r0 = X.C43381zi.A01(r0, r1)
            if (r0 != 0) goto L_0x0122
            X.1E7 r0 = r6.A0H
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0116
            X.00H r0 = r6.A0J
            java.lang.Object r4 = r0.get()
            X.A1E r4 = (X.A1E) r4
            X.1E7 r3 = r6.A0H
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.9aH r0 = r4.A02
            X.0ve r2 = r0.A01
            r1 = 11061(0x2b35, float:1.55E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0113
            boolean r0 = r3.A0G()
            if (r0 == 0) goto L_0x0113
            boolean r1 = X.A1E.A00(r4, r3)
        L_0x0068:
            r0 = 3
            if (r1 != 0) goto L_0x0117
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.01E r1 = r6.A0U
            r0 = 2131888978(0x7f120b52, float:1.9412607E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0078:
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r2, r0)
        L_0x007d:
            java.lang.Object r0 = r8.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r11 = r0 ^ 1
            java.lang.Integer r9 = X.C17880vN.A0k()
            X.1xn r7 = r6.A0V
            X.1E7 r4 = r6.A0H
            X.0ve r3 = r6.A0d
            r2 = 0
            r0 = 10056(0x2748, float:1.4091E-41)
            r1 = 0
            int r0 = X.C36301nf.A00(r3, r0, r2)
            if (r0 <= 0) goto L_0x009c
            r1 = 1
        L_0x009c:
            r0 = r1 ^ 1
            java.lang.String r0 = r7.A02(r4, r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r9, r0)
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0131
            r9 = 2500(0x9c4, double:1.235E-320)
            if (r11 == 0) goto L_0x00b9
            long r0 = r6.A00
            long r3 = r15 - r0
            if (r14 != 0) goto L_0x0110
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
        L_0x00b7:
            if (r0 < 0) goto L_0x015a
        L_0x00b9:
            X.2ri r4 = r6.A0E
            X.01E r3 = r6.A0U
            X.1E7 r7 = r6.A0H
            long r0 = r6.A00
            android.util.Pair r8 = r4.A02(r3, r7, r0)
            if (r8 != 0) goto L_0x015a
            java.lang.Object r1 = r2.second
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2131888979(0x7f120b53, float:1.9412609E38)
            java.lang.String r0 = r3.getString(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0159
            java.lang.Object r0 = r2.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x010d
            if (r11 != 0) goto L_0x00e8
            if (r14 == 0) goto L_0x010d
        L_0x00e8:
            X.1E7 r0 = r6.A0H
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x010a
            r0 = 0
        L_0x00f2:
            long r12 = r12 + r0
            long r0 = r6.A00
            long r15 = r15 - r0
            int r0 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0159
            X.1E7 r0 = r6.A0H
            java.lang.String r1 = X.AnonymousClass72Y.A01(r3, r5, r0)
            java.lang.Integer r0 = X.C17880vN.A0l()
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r0, r1)
            return r3
        L_0x010a:
            long r0 = r4.A01
            goto L_0x00f2
        L_0x010d:
            r12 = 2500(0x9c4, double:1.235E-320)
            goto L_0x00e8
        L_0x0110:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            goto L_0x00b7
        L_0x0113:
            r1 = 0
            goto L_0x0068
        L_0x0116:
            r0 = 0
        L_0x0117:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r0, r7)
            goto L_0x007d
        L_0x0122:
            java.lang.Integer r2 = X.C17880vN.A0i()
            X.01E r1 = r6.A0U
            r0 = 2131898332(0x7f122fdc, float:1.9431579E38)
            java.lang.String r0 = X.C80613xU.A04(r1, r0)
            goto L_0x0078
        L_0x0131:
            if (r11 == 0) goto L_0x0145
            java.lang.Object r0 = r8.first
            int r1 = X.AnonymousClass000.A0M(r0)
            r0 = 2
            if (r1 == r0) goto L_0x015a
            long r0 = r6.A00
            long r15 = r15 - r0
            if (r14 != 0) goto L_0x0154
            int r3 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
        L_0x0143:
            if (r3 < 0) goto L_0x015a
        L_0x0145:
            X.2ri r5 = r6.A0E
            X.01E r4 = r6.A0U
            X.1E7 r3 = r6.A0H
            long r0 = r6.A00
            android.util.Pair r3 = r5.A02(r4, r3, r0)
            if (r3 == 0) goto L_0x0159
            return r3
        L_0x0154:
            r0 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            goto L_0x0143
        L_0x0159:
            return r2
        L_0x015a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3rW.A0K():android.util.Pair");
    }

    public String BO6() {
        return "ContactConversationTitle";
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        Handler handler = this.A01;
        if (!(handler == null || (runnable = this.A06) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.A0E.A03();
        if (C42701yb.A01(this.A0H.A0J) && this.A0S.A00()) {
            this.A0R.unregisterObserver(this.A0Q);
        }
        super.onActivityDestroyed(activity);
    }

    public void A0I() {
        super.A0I();
        C19880zA r1 = this.A0O;
        if ((r1.A07() && A07() && !C72463Mc.A1V(this.A0a)) || (A08(this) && !this.A0S.A00())) {
            ((C25811Ps) r1.A03()).A06(this.A0C, AnonymousClass1YL.A00(this.A0U, 2130969226, 2131102411), true);
        }
    }

    public void A0J(Activity activity) {
        ViewGroup viewGroup;
        int i;
        super.A0J(activity);
        this.A03 = null;
        this.A04 = null;
        AnonymousClass00H r1 = this.A0a;
        if (C72463Mc.A1V(r1)) {
            View findViewById = this.A03.findViewById(2131429782);
            if (findViewById != null) {
                this.A03 = AnonymousClass3MW.A0p(findViewById);
            }
            viewGroup = this.A03;
            i = 2131429785;
        } else {
            boolean A062 = ((AnonymousClass73F) r1.get()).A06();
            viewGroup = this.A03;
            i = 2131429781;
            if (A062) {
                i = 2131429784;
            }
        }
        View findViewById2 = viewGroup.findViewById(i);
        if (findViewById2 != null) {
            this.A04 = AnonymousClass3MW.A0p(findViewById2);
        }
        this.A0E.A03 = this.A0T;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) AnonymousClass3MW.A0N(this.A0M).A00(ConversationTitleViewModel.class);
        this.A0B = conversationTitleViewModel;
        C91624fz.A01(this.A0L, conversationTitleViewModel.A01, this, 28);
        ConversationTitleViewModel conversationTitleViewModel2 = this.A0B;
        conversationTitleViewModel2.A03.A0A(this.A0f);
        conversationTitleViewModel2.A05.get();
        conversationTitleViewModel2.A01.A0F(new Object());
        A0E(new C90004dN(this, activity, 40));
        AnonymousClass1Y5.A02(this.A04, 2131886187);
        A06(this);
        if (C42701yb.A01(this.A0H.A0J) && this.A0S.A00()) {
            this.A0R.registerObserver(this.A0Q);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3rW(X.AnonymousClass01E r31, X.AnonymousClass1F9 r32, X.AnonymousClass1FD r33, X.C19880zA r34, X.C19880zA r35, X.C446324e r36, X.C42201xn r37, X.AnonymousClass1KB r38, X.AnonymousClass11S r39, X.C72043Kk r40, X.C25001Mm r41, X.AnonymousClass4ZR r42, X.C39511tC r43, X.AnonymousClass2LL r44, X.AnonymousClass1UD r45, X.C35751mk r46, X.AnonymousClass1VW r47, X.C24671Lf r48, X.C24921Me r49, X.C27191Vc r50, X.C27171Va r51, X.C37311pJ r52, X.C62632ri r53, X.AnonymousClass11P r54, X.C18000vb r55, X.C88654aI r56, X.AnonymousClass1Q1 r57, X.AnonymousClass1CJ r58, X.C25181Nf r59, X.AnonymousClass1E7 r60, X.AnonymousClass1KW r61, X.C18030ve r62, X.AnonymousClass12L r63, X.C25191Ng r64, X.AnonymousClass1MB r65, X.AnonymousClass1LT r66, X.AnonymousClass1BI r67, X.C24641Lc r68, X.C34771l3 r69, X.AnonymousClass1PU r70, X.AnonymousClass1DC r71, X.AnonymousClass10I r72, X.AnonymousClass1PV r73, X.C32131gh r74, X.AnonymousClass00H r75, X.AnonymousClass00H r76, X.AnonymousClass00H r77, X.AnonymousClass00H r78, X.AnonymousClass00H r79, X.AnonymousClass00H r80, java.lang.String r81) {
        /*
            r30 = this;
            r29 = 0
            r2 = r30
            r19 = r59
            r18 = r57
            r17 = r56
            r16 = r55
            r15 = r51
            r14 = r50
            r13 = r49
            r12 = r48
            r11 = r47
            r10 = r46
            r3 = r31
            r7 = r40
            r26 = r70
            r27 = r71
            r8 = r42
            r28 = r72
            r9 = r43
            r6 = r39
            r25 = r67
            r5 = r38
            r24 = r66
            r4 = r37
            r23 = r64
            r22 = r62
            r21 = r61
            r20 = r60
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0 = 0
            r2.A08 = r0
            r1 = 0
            X.4kV r0 = new X.4kV
            r0.<init>(r2, r1)
            r2.A0T = r0
            X.4iK r0 = new X.4iK
            r0.<init>(r2)
            r2.A0Q = r0
            r0 = r54
            r2.A0F = r0
            r2.A0P = r6
            r0 = r58
            r2.A0U = r0
            r0 = r41
            r2.A0C = r0
            r0 = r63
            r2.A0G = r0
            r0 = r73
            r2.A0X = r0
            r0 = r34
            r2.A0O = r0
            r0 = r35
            r2.A0N = r0
            r0 = r45
            r2.A0S = r0
            r0 = r81
            r2.A07 = r0
            r0 = r32
            r2.A0L = r0
            r0 = r33
            r2.A0M = r0
            r0 = r68
            r2.A0V = r0
            r0 = r69
            r2.A0W = r0
            r0 = r78
            r2.A05 = r0
            r0 = r65
            r2.A0H = r0
            r0 = r75
            r2.A0K = r0
            r0 = r76
            r2.A0a = r0
            r0 = r77
            r2.A0Z = r0
            r0 = r53
            r2.A0E = r0
            r0 = r36
            r2.A02 = r0
            r0 = r52
            r2.A0D = r0
            r0 = r74
            r2.A0Y = r0
            r0 = r44
            r2.A0R = r0
            r0 = r79
            r2.A0J = r0
            r0 = r80
            r2.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3rW.<init>(X.01E, X.1F9, X.1FD, X.0zA, X.0zA, X.24e, X.1xn, X.1KB, X.11S, X.3Kk, X.1Mm, X.4ZR, X.1tC, X.2LL, X.1UD, X.1mk, X.1VW, X.1Lf, X.1Me, X.1Vc, X.1Va, X.1pJ, X.2ri, X.11P, X.0vb, X.4aI, X.1Q1, X.1CJ, X.1Nf, X.1E7, X.1KW, X.0ve, X.12L, X.1Ng, X.1MB, X.1LT, X.1BI, X.1Lc, X.1l3, X.1PU, X.1DC, X.10I, X.1PV, X.1gh, X.00H, X.00H, X.00H, X.00H, X.00H, X.00H, java.lang.String):void");
    }
}
