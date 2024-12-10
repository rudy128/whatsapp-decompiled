package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaDynamicRoundCornerImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.5wV  reason: invalid class name and case insensitive filesystem */
public class C116165wV extends C113615nN {
    public int A00;
    public ValueAnimator A01;
    public CircularProgressBar A02;
    public C108525bq A03;
    public C28931bI A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final View A0A;
    public final View A0B;
    public final ViewGroup A0C;
    public final ViewGroup A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextEmojiLabel A0G;
    public final WaDynamicRoundCornerImageView A0H;
    public final WaImageView A0I;
    public final C138416x2 A0J;
    public final VoiceParticipantAudioWave A0K;
    public final ThumbnailButton A0L;
    public final ThumbnailButton A0M;
    public final C18000vb A0N;
    public final C18030ve A0O;
    public final AnonymousClass1DC A0P;
    public final C18140vp A0Q;
    public final C42141xh A0R;
    public final WaImageView A0S;
    public final AnonymousClass1VW A0T;
    public final C143867Fc A0U;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116165wV(android.view.View r18, X.C72043Kk r19, X.C24771Lp r20, X.C143867Fc r21, X.AnonymousClass6bT r22, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r23, X.AnonymousClass1VW r24, X.C24921Me r25, X.C18000vb r26, X.C18030ve r27, X.AnonymousClass1DC r28, X.C18140vp r29) {
        /*
            r17 = this;
            r10 = r17
            r11 = r18
            r12 = r20
            r13 = r22
            r14 = r23
            r15 = r24
            r16 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0 = r21
            r10.A0U = r0
            r0 = r27
            r10.A0O = r0
            r0 = r26
            r10.A0N = r0
            r0 = r28
            r10.A0P = r0
            r0 = r29
            r10.A0Q = r0
            r10.A0T = r15
            r0 = 2131427881(0x7f0b0229, float:1.847739E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0C(r11, r0)
            r10.A0C = r0
            r0 = 2131427883(0x7f0b022b, float:1.8477395E38)
            r1 = 2131427883(0x7f0b022b, float:1.8477395E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0W(r11, r0)
            r10.A0G = r0
            r3 = 0
            if (r0 == 0) goto L_0x0196
            r0 = r19
            X.1xh r0 = X.C42141xh.A01(r11, r0, r1)
            r10.A0R = r0
        L_0x0047:
            r0 = 2131427884(0x7f0b022c, float:1.8477397E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r11, r0)
            com.whatsapp.components.button.ThumbnailButton r5 = (com.whatsapp.components.button.ThumbnailButton) r5
            r10.A0L = r5
            r0 = 2131427885(0x7f0b022d, float:1.8477399E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r0 = (com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave) r0
            r10.A0K = r0
            r0 = 2131432880(0x7f0b15b0, float:1.848753E38)
            com.whatsapp.WaImageView r2 = X.AnonymousClass3MW.A0S(r11, r0)
            r10.A0I = r2
            r0 = 2131436186(0x7f0b229a, float:1.8494235E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0S(r11, r0)
            r10.A0S = r0
            r0 = 2131428678(0x7f0b0546, float:1.8479007E38)
            android.view.View r0 = r11.findViewById(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = (com.whatsapp.WaDynamicRoundCornerImageView) r0
            r10.A0H = r0
            r0 = 2131429767(0x7f0b0987, float:1.8481216E38)
            android.view.View r0 = r11.findViewById(r0)
            r10.A0A = r0
            r0 = 2131435625(0x7f0b2069, float:1.8493097E38)
            android.view.ViewGroup r1 = X.AnonymousClass3MW.A0D(r11, r0)
            r10.A0E = r1
            r0 = 2131433838(0x7f0b196e, float:1.8489473E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MW.A0D(r11, r0)
            r10.A0D = r0
            r0 = 2131433839(0x7f0b196f, float:1.8489475E38)
            android.view.View r4 = r11.findViewById(r0)
            com.whatsapp.components.button.ThumbnailButton r4 = (com.whatsapp.components.button.ThumbnailButton) r4
            r10.A0M = r4
            r0 = r3
            if (r1 == 0) goto L_0x00aa
            r0 = 2131435610(0x7f0b205a, float:1.8493067E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r1, r0)
        L_0x00aa:
            r10.A0F = r0
            r0 = 2131435543(0x7f0b2017, float:1.8492931E38)
            android.view.View r8 = r11.findViewById(r0)
            r10.A0B = r8
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165639(0x7f0701c7, float:1.79455E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A01 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131169196(0x7f070fac, float:1.7952715E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A06 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131169198(0x7f070fae, float:1.795272E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A07 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131169249(0x7f070fe1, float:1.7952823E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A05 = r0
            android.content.res.Resources$Theme r6 = X.AnonymousClass3Ma.A06(r11)
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r0 = 2130968927(0x7f04015f, float:1.7546521E38)
            r1 = 1
            r6.resolveAttribute(r0, r7, r1)
            int r0 = r7.resourceId
            if (r0 != 0) goto L_0x00fe
            r1 = 0
        L_0x00fe:
            X.C17960vV.A0C(r1)
            if (r8 == 0) goto L_0x0118
            android.graphics.drawable.Drawable r6 = r8.getBackground()
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            if (r6 == 0) goto L_0x0118
            android.content.res.Resources r1 = r11.getResources()
            int r0 = r7.resourceId
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            r6.setCornerRadius(r0)
        L_0x0118:
            r9 = r11
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            android.view.ViewGroup r0 = r10.A0C
            r8.add(r0)
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r10.A0H
            if (r0 == 0) goto L_0x012b
            r8.add(r0)
        L_0x012b:
            android.view.ViewGroup r7 = r10.A0D
            if (r7 == 0) goto L_0x013f
            X.0ve r6 = r10.A0O
            r1 = 3153(0xc51, float:4.418E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r6, r1)
            r0 = 3
            if (r1 < r0) goto L_0x013f
            r8.add(r7)
        L_0x013f:
            X.6x2 r0 = new X.6x2
            r0.<init>(r9, r8)
            r10.A0J = r0
            android.util.DisplayMetrics r0 = X.AnonymousClass3Ma.A09(r11)
            int r0 = r0.widthPixels
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r5.A01 = r1
            if (r4 == 0) goto L_0x0159
            r4.A01 = r1
        L_0x0159:
            r0 = 2131429675(0x7f0b092b, float:1.848103E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L_0x0167
            X.1bI r3 = new X.1bI
            r3.<init>(r0)
        L_0x0167:
            r10.A04 = r3
            if (r2 == 0) goto L_0x017b
            if (r23 == 0) goto L_0x017b
            X.0vp r0 = r14.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x017b
            r0 = 2131232421(0x7f0806a5, float:1.808095E38)
            r2.setImageResource(r0)
        L_0x017b:
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165643(0x7f0701cb, float:1.7945509E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A08 = r0
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131169544(0x7f071108, float:1.7953421E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.A09 = r0
            return
        L_0x0196:
            r10.A0R = r3
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116165wV.<init>(android.view.View, X.3Kk, X.1Lp, X.7Fc, X.6bT, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, X.1VW, X.1Me, X.0vb, X.0ve, X.1DC, X.0vp):void");
    }

    public static void A00(C116165wV r2) {
        if (r2.A02 != null) {
            ValueAnimator valueAnimator = r2.A01;
            if (valueAnimator != null) {
                valueAnimator.end();
                r2.A01 = null;
            }
            r2.A02.setVisibility(8);
            r2.A0A.setAlpha(0.0f);
        }
    }

    private void A01(AnonymousClass70A r6) {
        WaImageView waImageView;
        boolean z;
        String A0I2;
        TextEmojiLabel textEmojiLabel;
        if (r6 != null && (waImageView = this.A0S) != null) {
            int i = 1;
            if (this.A0C.getVisibility() == 8 || (textEmojiLabel = this.A0G) == null || textEmojiLabel.getVisibility() == 8) {
                z = true;
                if (r6.A0N) {
                    A0I2 = waImageView.getContext().getString(2131898595);
                } else {
                    A0I2 = this.A0C.A0I(r6.A0g);
                }
            } else {
                z = false;
                A0I2 = "";
            }
            waImageView.setContentDescription(A0I2);
            if (!z) {
                i = 2;
            }
            waImageView.setImportantForAccessibility(i);
        }
    }

    public void A0B() {
        C22851Dl r4;
        AnonymousClass70A r2 = this.A05;
        if (r2 != null) {
            CallGridViewModel callGridViewModel = this.A04;
            if (!(callGridViewModel == null || (r4 = this.A09) == null)) {
                C131896lq r1 = callGridViewModel.A0a;
                UserJid userJid = r2.A0h;
                Map map = r1.A01;
                if (map.containsKey(userJid)) {
                    Map map2 = r1.A00;
                    if (r4.equals(map2.get(userJid))) {
                        map2.remove(userJid);
                        map.remove(userJid);
                    }
                }
                this.A09 = null;
            }
            this.A05 = null;
            A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r5.A05.A0O != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a7, code lost:
        if (r5.A05.A0O != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0140, code lost:
        if (r5.A05.A0O != false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(int r9) {
        /*
            r8 = this;
            int r0 = r8.A02
            if (r9 == r0) goto L_0x003f
            r8.A02 = r9
            boolean r0 = r8 instanceof X.C116155wU
            if (r0 == 0) goto L_0x0183
            X.70A r0 = r8.A05
            if (r0 == 0) goto L_0x0036
            android.content.Context r1 = X.C108945cZ.A0D(r8)
            int r3 = r8.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2
            r0 = 2131169195(0x7f070fab, float:1.7952713E38)
            if (r3 != r1) goto L_0x0025
            r0 = 2131169197(0x7f070fad, float:1.7952717E38)
        L_0x0025:
            int r1 = r2.getDimensionPixelSize(r0)
            com.whatsapp.components.button.ThumbnailButton r2 = r8.A0L
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.height = r1
            r0.width = r1
        L_0x0033:
            r2.setLayoutParams(r0)
        L_0x0036:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r2 = r8.A0K
            if (r2 == 0) goto L_0x003f
            r1 = 0
            r0 = 1
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave.A02(r2, r1, r0)
        L_0x003f:
            r5 = r8
            boolean r0 = r8 instanceof X.C116155wU
            if (r0 == 0) goto L_0x0149
            X.5wU r5 = (X.C116155wU) r5
            X.70A r0 = r5.A05
            if (r0 == 0) goto L_0x00e0
            com.whatsapp.TextEmojiLabel r4 = r5.A0G
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r4)
            int r1 = r5.A02
            r0 = 3
            if (r1 == r0) goto L_0x0144
            r0 = 4
            if (r1 == r0) goto L_0x0139
            r0 = 5
            if (r1 == r0) goto L_0x0139
            X.70A r0 = r5.A05
            boolean r0 = r0.A0O
            if (r0 == 0) goto L_0x0144
        L_0x0061:
            r1 = 2131169275(0x7f070ffb, float:1.7952875E38)
        L_0x0064:
            int r0 = r2.getDimensionPixelSize(r1)
            r3 = 0
            float r0 = (float) r0
            r4.setTextSize(r3, r0)
            X.70A r0 = r5.A05
            if (r0 == 0) goto L_0x00e0
            com.whatsapp.components.button.ThumbnailButton r0 = r5.A0L
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r0)
            int r7 = r5.A02
            r0 = 4
            if (r7 == r0) goto L_0x0114
            r0 = 5
            if (r7 == r0) goto L_0x0114
            r0 = 6
            if (r7 == r0) goto L_0x00f0
            r0 = 7
            if (r7 == r0) goto L_0x00f0
            r1 = 9
            r0 = 2131169258(0x7f070fea, float:1.795284E38)
            int r6 = r2.getDimensionPixelSize(r0)
            if (r7 == r1) goto L_0x00e8
            X.70A r0 = r5.A05
            boolean r1 = r0.A0O
            r0 = 2131169262(0x7f070fee, float:1.795285E38)
            if (r1 == 0) goto L_0x009c
            r0 = 2131169278(0x7f070ffe, float:1.7952882E38)
        L_0x009c:
            int r7 = r2.getDimensionPixelSize(r0)
            X.70A r0 = r5.A05
            boolean r0 = r0.A0O
            r1 = 2131169255(0x7f070fe7, float:1.7952835E38)
            if (r0 == 0) goto L_0x00ac
        L_0x00a9:
            r1 = 2131169274(0x7f070ffa, float:1.7952873E38)
        L_0x00ac:
            int r2 = r2.getDimensionPixelSize(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r4)
            r0.setMargins(r3, r7, r3, r3)
            r0.height = r6
            r4.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A02
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            android.widget.TextView r1 = r5.A03
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r5.A0K
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass3MW.A0B(r1)
            r0.setMargins(r3, r2, r3, r3)
            r1.setLayoutParams(r0)
        L_0x00e0:
            android.view.ViewGroup r1 = r8.A0E
            android.widget.TextView r0 = r8.A0F
            r8.A0G(r1, r0)
            return
        L_0x00e8:
            r0 = 2131169278(0x7f070ffe, float:1.7952882E38)
            int r7 = r2.getDimensionPixelSize(r0)
            goto L_0x00a9
        L_0x00f0:
            r0 = 2131169257(0x7f070fe9, float:1.7952839E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.70A r0 = r5.A05
            boolean r1 = r0.A0O
            r0 = 2131169261(0x7f070fed, float:1.7952847E38)
            if (r1 == 0) goto L_0x0103
            r0 = 2131169277(0x7f070ffd, float:1.795288E38)
        L_0x0103:
            int r7 = r2.getDimensionPixelSize(r0)
            X.70A r0 = r5.A05
            boolean r0 = r0.A0O
            r1 = 2131169254(0x7f070fe6, float:1.7952833E38)
            if (r0 == 0) goto L_0x00ac
            r1 = 2131169273(0x7f070ff9, float:1.7952871E38)
            goto L_0x00ac
        L_0x0114:
            r0 = 2131169256(0x7f070fe8, float:1.7952837E38)
            int r6 = r2.getDimensionPixelSize(r0)
            X.70A r0 = r5.A05
            boolean r1 = r0.A0O
            r0 = 2131169260(0x7f070fec, float:1.7952845E38)
            if (r1 == 0) goto L_0x0127
            r0 = 2131169276(0x7f070ffc, float:1.7952878E38)
        L_0x0127:
            int r7 = r2.getDimensionPixelSize(r0)
            X.70A r0 = r5.A05
            boolean r0 = r0.A0O
            r1 = 2131169253(0x7f070fe5, float:1.795283E38)
            if (r0 == 0) goto L_0x00ac
            r1 = 2131169272(0x7f070ff8, float:1.795287E38)
            goto L_0x00ac
        L_0x0139:
            X.70A r0 = r5.A05
            boolean r0 = r0.A0O
            r1 = 2131169259(0x7f070feb, float:1.7952843E38)
            if (r0 == 0) goto L_0x0064
            goto L_0x0061
        L_0x0144:
            r1 = 2131169436(0x7f07109c, float:1.7953202E38)
            goto L_0x0064
        L_0x0149:
            com.whatsapp.TextEmojiLabel r3 = r8.A0G
            if (r3 == 0) goto L_0x00e0
            int r1 = r8.A02
            if (r1 == 0) goto L_0x00e0
            int r4 = r8.A07
            r0 = 1
            if (r1 == r0) goto L_0x0159
            r0 = 3
            if (r1 != r0) goto L_0x0172
        L_0x0159:
            android.view.View r0 = r8.A0H
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r2 = r0.height
            int r0 = r8.A05
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0179
            float r1 = (float) r2
            r0 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r0
            int r1 = (int) r1
            int r0 = r8.A06
            int r4 = java.lang.Math.min(r1, r0)
        L_0x0172:
            r1 = 0
            float r0 = (float) r4
            r3.setTextSize(r1, r0)
            goto L_0x00e0
        L_0x0179:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VoiceParticipantViewHolder/updateParticipantNameTextSize, gridHeight <= 0: "
            X.C17900vP.A0j(r0, r1, r2)
            goto L_0x0172
        L_0x0183:
            r0 = 2
            r4 = 1051260355(0x3ea8f5c3, float:0.33)
            if (r9 != r0) goto L_0x018c
            r4 = 1050253722(0x3e99999a, float:0.3)
        L_0x018c:
            android.content.Context r1 = X.C108945cZ.A0D(r8)
            int r3 = r8.A02
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2
            r0 = 2131169195(0x7f070fab, float:1.7952713E38)
            if (r3 != r1) goto L_0x01a3
            r0 = 2131169197(0x7f070fad, float:1.7952717E38)
        L_0x01a3:
            int r1 = r2.getDimensionPixelSize(r0)
            com.whatsapp.components.button.ThumbnailButton r2 = r8.A0L
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.1sZ r0 = (X.C39151sZ) r0
            r0.A04 = r4
            r0.A0X = r1
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116165wV.A0E(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x027c, code lost:
        if (r2 == r0) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0128, code lost:
        if (r1 != null) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0206  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass70A r13) {
        /*
            r12 = this;
            X.70A r0 = r12.A05
            r5 = 0
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.AnonymousClass70A.A00(r0, r13)
            if (r0 != 0) goto L_0x0049
        L_0x000b:
            r12.A01(r13)
            r12.A06 = r5
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r12.A01
            if (r1 == 0) goto L_0x0021
            r1.setStroke(r0, r5)
        L_0x0021:
            A00(r12)
            r0 = 34
            X.7AN r4 = new X.7AN
            r4.<init>(r12, r0)
            r12.A09 = r4
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r12.A04
            if (r0 == 0) goto L_0x0046
            X.6lq r3 = r0.A0a
            com.whatsapp.jid.UserJid r2 = r13.A0h
            java.util.Map r1 = r3.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0041
            r0 = 0
            r1.put(r2, r0)
        L_0x0041:
            java.util.Map r0 = r3.A00
            r0.put(r2, r4)
        L_0x0046:
            r12.A0L(r13, r5)
        L_0x0049:
            X.1VW r0 = r12.A0T
            boolean r0 = r0.A0D()
            r4 = 1
            android.view.View r3 = r12.A0H
            android.content.Context r1 = r3.getContext()
            if (r0 == 0) goto L_0x033e
            com.whatsapp.jid.UserJid r0 = r13.A0h
            X.1VX r0 = X.AnonymousClass1VW.A01(r0)
            int r0 = r0.accentColorRes
            int r1 = X.C19740yt.A00(r1, r0)
        L_0x0064:
            r12.A00 = r1
            com.whatsapp.TextEmojiLabel r0 = r12.A0G
            if (r0 == 0) goto L_0x006d
            r0.setTextColor(r1)
        L_0x006d:
            float r0 = r13.A00
            r3.setAlpha(r0)
            r12.A0K(r13)
            boolean r0 = r13.A0H
            r7 = 0
            r6 = 8
            if (r0 == 0) goto L_0x0320
            android.view.ViewGroup r0 = r12.A0D
            if (r0 == 0) goto L_0x0320
            r1 = 0
            r7 = 8
        L_0x0083:
            android.view.ViewGroup r0 = r12.A0E
            if (r0 == 0) goto L_0x008a
            r0.setVisibility(r7)
        L_0x008a:
            android.view.ViewGroup r7 = r12.A0C
            r7.setVisibility(r6)
            android.view.ViewGroup r6 = r12.A0D
            if (r6 == 0) goto L_0x0096
            r6.setVisibility(r1)
        L_0x0096:
            r12.A01(r13)
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x010b
            boolean r0 = r13.A0I
            if (r0 == 0) goto L_0x010b
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r8 = -1
            if (r0 != 0) goto L_0x00d1
            android.content.Context r1 = r3.getContext()
            com.whatsapp.CircularProgressBar r0 = new com.whatsapp.CircularProgressBar
            r0.<init>(r1)
            r12.A02 = r0
            r0.A0C = r8
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r3)
            r0 = 2131165644(0x7f0701cc, float:1.794551E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r0, r0)
            r0 = 17
            r2.gravity = r0
            r1 = r3
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r1.addView(r0, r2)
        L_0x00d1:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00dd
            android.animation.ValueAnimator r0 = r12.A01
            if (r0 != 0) goto L_0x010b
        L_0x00dd:
            com.whatsapp.CircularProgressBar r0 = r12.A02
            r0.setVisibility(r5)
            android.view.View r1 = r12.A0A
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            int[] r0 = X.C108945cZ.A1W()
            r0 = {0, 100} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r12.A01 = r2
            r0 = 750(0x2ee, double:3.705E-321)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.setRepeatCount(r8)
            android.animation.ValueAnimator r1 = r12.A01
            r0 = 5
            X.C109195cy.A02(r1, r12, r0)
            android.animation.ValueAnimator r0 = r12.A01
            r0.start()
        L_0x010b:
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x0141
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r1 = r12.A0K
            r8 = 0
            if (r1 == 0) goto L_0x0127
            int r2 = r12.A01
            r0 = 7
            if (r2 != r0) goto L_0x031d
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r12.A04
            if (r0 == 0) goto L_0x031d
            X.0vp r0 = r0.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x031d
        L_0x0127:
            r2 = 1
            if (r1 == 0) goto L_0x0134
        L_0x012a:
            boolean r0 = r13.A0a
            if (r0 == 0) goto L_0x0315
            if (r2 == 0) goto L_0x0315
            r0 = 4
            r1.setVisibility(r0)
        L_0x0134:
            com.whatsapp.WaImageView r1 = r12.A0I
            if (r1 == 0) goto L_0x0141
            boolean r0 = r13.A0a
            if (r0 == 0) goto L_0x0311
            if (r2 == 0) goto L_0x0311
        L_0x013e:
            r1.setVisibility(r8)
        L_0x0141:
            int r0 = r7.getVisibility()
            if (r0 != 0) goto L_0x01b2
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r8 = r12.A0K
            if (r8 == 0) goto L_0x01b2
            int r1 = r13.A02
            r0 = -1
            if (r1 == r0) goto L_0x030d
            android.content.res.Resources r1 = r8.getResources()
            int r0 = r13.A02
            int r0 = r1.getColor(r0)
        L_0x015a:
            r8.setColor(r0)
            boolean r0 = r13.A0R
            if (r0 == 0) goto L_0x0165
            r0 = 0
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave.A02(r8, r0, r5)
        L_0x0165:
            boolean r1 = r13.A0S
            android.animation.ValueAnimator r0 = r8.A03
            if (r0 == 0) goto L_0x016e
            r0.cancel()
        L_0x016e:
            if (r1 == 0) goto L_0x01a3
            r2 = 2
            float[] r0 = new float[r2]
            r0 = {1036831949, 1058642330} // fill-array
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofFloat(r0)
            r8.A03 = r9
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.setDuration(r0)
            android.animation.ValueAnimator r1 = r8.A03
            android.view.animation.Interpolator r0 = r8.A0I
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r8.A03
            r0 = -1
            r1.setRepeatCount(r0)
            android.animation.ValueAnimator r0 = r8.A03
            r0.setRepeatMode(r2)
            android.animation.ValueAnimator r2 = r8.A03
            r1 = 3
            X.4aj r0 = new X.4aj
            r0.<init>(r8, r1)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r8.A03
            r0.start()
        L_0x01a3:
            X.4ZN r1 = r13.A0C
            if (r1 == 0) goto L_0x02f8
            android.content.Context r0 = r8.getContext()
            java.lang.CharSequence r0 = r1.A03(r0)
        L_0x01af:
            r8.setContentDescription(r0)
        L_0x01b2:
            X.70A r0 = r12.A05
            if (r0 == 0) goto L_0x02f5
            boolean r1 = r0.A0H
            boolean r0 = r13.A0H
            if (r1 == r0) goto L_0x02f5
        L_0x01bc:
            int r2 = r13.A07
            int r0 = r12.A03
            if (r0 != r2) goto L_0x0267
            if (r4 != 0) goto L_0x0267
        L_0x01c4:
            boolean r0 = r13.A0T
            if (r0 != 0) goto L_0x01cc
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x01d0
        L_0x01cc:
            r0 = 1
            X.C1422578t.A00(r3, r13, r12, r0)
        L_0x01d0:
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x01d9
            r0 = 16
            X.C89994dM.A00(r3, r12, r13, r0)
        L_0x01d9:
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x01e1
            r0 = 3
            X.C1421578j.A00(r3, r13, r12, r0)
        L_0x01e1:
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x0230
            boolean r7 = r13.A0J
            boolean r6 = r13.A0E
            boolean r4 = r13.A0H
            boolean r2 = r13.A01()
            X.0ve r1 = r12.A0O
            X.0vp r0 = r12.A0Q
            boolean r1 = X.C40811vJ.A0b(r1, r0)
            if (r2 != 0) goto L_0x0263
            if (r4 == 0) goto L_0x0256
            r0 = 2131165645(0x7f0701cd, float:1.7945513E38)
        L_0x01fe:
            int r2 = X.AnonymousClass3Ma.A02(r3, r0)
            int r0 = r12.A00
            if (r0 == r2) goto L_0x0230
            r12.A00 = r2
            com.whatsapp.WaImageView r1 = r12.A0S
            boolean r0 = r1 instanceof com.whatsapp.WaDynamicRoundCornerImageView
            if (r0 == 0) goto L_0x0214
            com.whatsapp.WaDynamicRoundCornerImageView r1 = (com.whatsapp.WaDynamicRoundCornerImageView) r1
            float r0 = (float) r2
            r1.setRadius(r0)
        L_0x0214:
            com.whatsapp.WaDynamicRoundCornerImageView r1 = r12.A0H
            if (r1 == 0) goto L_0x021e
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x021e:
            android.view.View r0 = r12.A0B
            if (r0 == 0) goto L_0x0230
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x0230
            int r0 = r12.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x0230:
            X.1bI r1 = r12.A04
            if (r1 == 0) goto L_0x0241
            boolean r0 = r13.A0Y
            if (r0 == 0) goto L_0x0253
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x0253
        L_0x023e:
            r1.A04(r5)
        L_0x0241:
            com.whatsapp.WaImageView r1 = r12.A0I
            if (r1 == 0) goto L_0x024e
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x0251
            java.lang.String r0 = "transition_target_floating_view"
        L_0x024b:
            r1.setTransitionName(r0)
        L_0x024e:
            r12.A05 = r13
            return
        L_0x0251:
            r0 = 0
            goto L_0x024b
        L_0x0253:
            r5 = 8
            goto L_0x023e
        L_0x0256:
            if (r7 == 0) goto L_0x0263
            if (r6 != 0) goto L_0x0263
            r0 = 2131165650(0x7f0701d2, float:1.7945523E38)
            if (r1 == 0) goto L_0x01fe
            r0 = 2131169533(0x7f0710fd, float:1.7953399E38)
            goto L_0x01fe
        L_0x0263:
            r0 = 2131165638(0x7f0701c6, float:1.7945499E38)
            goto L_0x01fe
        L_0x0267:
            r12.A03 = r2
            boolean r0 = r13.A0J
            if (r0 == 0) goto L_0x02e5
            r0 = 2
            r11 = 0
            r9 = 3
            r1 = 1
            if (r2 == r0) goto L_0x027e
            int r8 = r12.A01
            r4 = 8
            r0 = 1
            if (r8 != r4) goto L_0x027b
            r0 = 3
        L_0x027b:
            r10 = 0
            if (r2 != r0) goto L_0x027f
        L_0x027e:
            r10 = 1
        L_0x027f:
            int r8 = r12.A01
            r0 = 8
            r4 = 1
            if (r8 != r0) goto L_0x0287
            r4 = -1
        L_0x0287:
            r8 = 0
            if (r10 == 0) goto L_0x028c
            r8 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x028c:
            int r0 = r2 * 90
            int r0 = r0 % 180
            int r0 = r0 * r4
            float r4 = (float) r0
            com.whatsapp.WaDynamicRoundCornerImageView r0 = r12.A0H
            if (r0 == 0) goto L_0x0299
            X.C123806Vx.A00(r0, r2)
        L_0x0299:
            com.whatsapp.calling.callgrid.view.VoiceParticipantAudioWave r10 = r12.A0K
            if (r10 == 0) goto L_0x02b7
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r10)
            int r0 = r12.A03
            if (r0 == r1) goto L_0x02a7
            if (r0 != r9) goto L_0x02b2
        L_0x02a7:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165392(0x7f0700d0, float:1.7945E38)
            int r11 = r1.getDimensionPixelSize(r0)
        L_0x02b2:
            r2.topMargin = r11
            r10.setLayoutParams(r2)
        L_0x02b7:
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0L
            r0.setRotation(r4)
            if (r10 == 0) goto L_0x02c1
            r10.setRotation(r4)
        L_0x02c1:
            com.whatsapp.WaImageView r0 = r12.A0I
            if (r0 == 0) goto L_0x02c8
            r0.setRotation(r4)
        L_0x02c8:
            if (r6 == 0) goto L_0x02e0
            X.0ve r2 = r12.A0O
            r1 = 3153(0xc51, float:4.418E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 < r9) goto L_0x02e0
            r6.setRotation(r8)
            com.whatsapp.components.button.ThumbnailButton r0 = r12.A0M
            if (r0 == 0) goto L_0x02e0
            r0.setRotation(r4)
        L_0x02e0:
            r7.setRotation(r8)
            goto L_0x01c4
        L_0x02e5:
            X.6x2 r1 = r12.A0J
            r0 = 1
            r1.A03 = r0
            int r0 = r1.A02
            if (r2 == r0) goto L_0x01c4
            r1.A02 = r2
            X.C138416x2.A00(r1)
            goto L_0x01c4
        L_0x02f5:
            r4 = 0
            goto L_0x01bc
        L_0x02f8:
            boolean r0 = r13.A0a
            if (r0 == 0) goto L_0x0309
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131898275(0x7f122fa3, float:1.9431463E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x01af
        L_0x0309:
            java.lang.String r0 = ""
            goto L_0x01af
        L_0x030d:
            int r0 = r12.A00
            goto L_0x015a
        L_0x0311:
            r8 = 8
            goto L_0x013e
        L_0x0315:
            r1.setMuteIconVisibility(r0)
            r1.setVisibility(r5)
            goto L_0x0134
        L_0x031d:
            r2 = 0
            goto L_0x012a
        L_0x0320:
            android.widget.TextView r2 = r12.A0F
            if (r2 == 0) goto L_0x0337
            boolean r0 = r13.A0O
            if (r0 == 0) goto L_0x0337
            X.4ZN r1 = r13.A0C
            if (r1 == 0) goto L_0x0337
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass4ZN.A01(r0, r2, r1)
            r1 = 8
            goto L_0x0083
        L_0x0337:
            r1 = 8
            r7 = 8
            r6 = 0
            goto L_0x0083
        L_0x033e:
            int r0 = r13.A03
            int r1 = X.AnonymousClass4aR.A01(r1, r0, r4)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116165wV.A0J(X.70A):void");
    }

    public void A0K(AnonymousClass70A r6) {
        C42141xh r2;
        TextEmojiLabel textEmojiLabel = this.A0G;
        if (textEmojiLabel != null && (r2 = this.A0R) != null) {
            textEmojiLabel.setVisibility(C72453Mb.A07(r6.A0b ? 1 : 0));
            if (r6.A0N) {
                r2.A02();
                return;
            }
            AnonymousClass1E7 r4 = r6.A0g;
            if (r4.A0O()) {
                C18030ve r3 = this.A0O;
                if (C40811vJ.A0S(r3) && C18020vd.A05(C18040vf.A02, r3, 4455)) {
                    r2.A08(r4, -1);
                    return;
                }
            }
            CallGridViewModel callGridViewModel = this.A04;
            if (callGridViewModel != null && C72463Mc.A1O(callGridViewModel.A0t) && !r4.A0B()) {
                C24921Me r1 = this.A0C;
                if (C24921Me.A06(r4)) {
                    r2.A01.setText(AnonymousClass3MX.A17(r1, r4));
                    return;
                }
            }
            String A0I2 = this.A0C.A0I(r4);
            TextEmojiLabel textEmojiLabel2 = r2.A01;
            textEmojiLabel2.setText(A0I2);
            textEmojiLabel2.A0N();
        }
    }

    public void A0L(AnonymousClass70A r5, boolean z) {
        AnonymousClass1E7 r3 = r5.A0g;
        A0H(this.A0L, r3, false, false);
        ThumbnailButton thumbnailButton = this.A0M;
        if (thumbnailButton != null) {
            A0H(thumbnailButton, r3, false, false);
        }
        WaDynamicRoundCornerImageView waDynamicRoundCornerImageView = this.A0H;
        if (waDynamicRoundCornerImageView != null && r5.A0e) {
            A0H(waDynamicRoundCornerImageView, r3, true, z);
            waDynamicRoundCornerImageView.setVisibility(0);
        }
    }
}
