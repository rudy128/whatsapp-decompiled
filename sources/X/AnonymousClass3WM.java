package X;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.3WM  reason: invalid class name */
public class AnonymousClass3WM extends C41251w3 {
    public final /* synthetic */ PeerAvatarLayout A00;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 1) {
            List list = C42011xT.A0I;
            return new C74093Ym(A00(), this);
        } else if (i == 2) {
            List list2 = C42011xT.A0I;
            return new C74103Yn(A00(), this);
        } else {
            throw new RuntimeException("PeerAvatarLayout/onCreateViewHolder invalid item type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3WM(PeerAvatarLayout peerAvatarLayout) {
        super(new C40471ul(new AnonymousClass3W0(0)).A00());
        this.A00 = peerAvatarLayout;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.FrameLayout, android.view.View, java.lang.Object, X.3PV, android.view.ViewGroup] */
    private AnonymousClass3PV A00() {
        int i;
        PeerAvatarLayout peerAvatarLayout = this.A00;
        ? frameLayout = new FrameLayout(peerAvatarLayout.getContext(), (AttributeSet) null, 0);
        if (!frameLayout.A0A) {
            frameLayout.A0A = true;
            frameLayout.A08 = C000200d.A00(AnonymousClass3MW.A0O(frameLayout.generatedComponent()).A1R);
        }
        frameLayout.A00 = 1.5d;
        View.inflate(frameLayout.getContext(), 2131624409, frameLayout);
        frameLayout.A02 = (FrameLayout) AnonymousClass1HF.A06(frameLayout, 2131429436);
        frameLayout.A04 = (ThumbnailButton) AnonymousClass1HF.A06(frameLayout, 2131429433);
        frameLayout.A07 = C28931bI.A00(frameLayout, 2131433731);
        C28931bI A002 = C28931bI.A00(frameLayout, 2131427911);
        frameLayout.A06 = A002;
        C98254qp.A00(A002, frameLayout, 2);
        frameLayout.A01 = peerAvatarLayout.A04;
        int i2 = peerAvatarLayout.A01;
        if (!(i2 == 0 || (i = peerAvatarLayout.A00) == 0)) {
            frameLayout.A04.A00 = (float) AnonymousClass3Ma.A02(frameLayout, i2);
            frameLayout.A04.A02 = AnonymousClass3MY.A02(frameLayout, i);
        }
        C38471rL r0 = peerAvatarLayout.A0B;
        if (r0 != null) {
            frameLayout.setOnClickListener(r0);
        }
        return frameLayout;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.2ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.4kD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: X.2ym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.2ym} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e3, code lost:
        if (X.C72463Mc.A1Z(r4.A0E) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r15, int r16) {
        /*
            r14 = this;
            r3 = r16
            java.lang.Object r0 = r14.A0U(r3)
            X.5c8 r0 = (X.C108685c8) r0
            int r1 = r0.BTW()
            r0 = 1
            if (r1 == r0) goto L_0x0087
            boolean r0 = r15 instanceof X.C74103Yn
            if (r0 == 0) goto L_0x0082
            X.3Yn r15 = (X.C74103Yn) r15
            java.util.List r0 = X.C42011xT.A0I
            X.3PV r5 = r15.A00
            com.whatsapp.calling.PeerAvatarLayout r0 = r14.A00
            int r0 = r0.A04
            r5.A01 = r0
            java.lang.Object r2 = r14.A0U(r3)
            X.4iS r2 = (X.C93114iS) r2
            double r0 = r2.A01
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = 2
            r14.A01(r5, r1, r3, r0)
            X.4ZN r1 = r2.A03
            android.content.Context r0 = r5.getContext()
            java.lang.CharSequence r0 = r1.A03(r0)
            java.lang.String r8 = r0.toString()
            boolean r7 = r2.A04
            int r4 = r2.A02
            double r1 = r2.A00
            com.whatsapp.components.button.ThumbnailButton r3 = r5.A04
            r0 = 8
            r3.setVisibility(r0)
            X.1bI r0 = r5.A07
            r6 = 0
            r0.A04(r6)
            X.1bI r0 = r5.A07
            android.widget.TextView r0 = X.AnonymousClass3MX.A0M(r0)
            r0.setText(r8)
            r5.A00 = r1
            if (r7 == 0) goto L_0x0083
            r0 = 1
            int r0 = r5.A01(r0)
            double r2 = (double) r0
            r0 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r2 = r2 * r0
            int r0 = (int) r2
            int r0 = r0 / 2
            r5.setPadding(r6, r0, r6, r0)
        L_0x006f:
            X.1bI r0 = r5.A07
            android.view.View r0 = r0.A02()
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = X.AnonymousClass3MY.A02(r5, r4)
            r1.setColor(r0)
        L_0x0082:
            return
        L_0x0083:
            r5.setPadding(r6, r6, r6, r6)
            goto L_0x006f
        L_0x0087:
            boolean r0 = r15 instanceof X.C74093Ym
            if (r0 == 0) goto L_0x0082
            X.3Ym r15 = (X.C74093Ym) r15
            java.util.List r0 = X.C42011xT.A0I
            X.3PV r2 = r15.A00
            com.whatsapp.calling.PeerAvatarLayout r4 = r14.A00
            int r0 = r4.A04
            r2.A01 = r0
            java.lang.Object r1 = r14.A0U(r3)
            X.4iR r1 = (X.C93104iR) r1
            double r5 = r1.A00
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r6 = 1
            r14.A01(r2, r0, r3, r6)
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x016d
            android.content.res.Resources r3 = r4.getResources()
            int r0 = r4.A04
            if (r0 != 0) goto L_0x00b6
            r0 = 2131165582(0x7f07018e, float:1.7945385E38)
        L_0x00b6:
            int r11 = r3.getDimensionPixelSize(r0)
            X.1E7 r9 = r1.A02
            int r12 = r1.A01
            X.1VW r8 = r4.A07
            X.00H r10 = r4.A0C
            boolean r13 = r4.A0H
            X.4kD r7 = new X.4kD
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.1BI r0 = r9.A0J
            r7.CIg(r0)
        L_0x00ce:
            X.1pZ r3 = r4.A08
            X.1E7 r5 = r1.A02
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A04
            r3.A05(r0, r7, r5, r6)
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x00e5
            X.0vp r0 = r4.A0E
            boolean r0 = X.C72463Mc.A1Z(r0)
            r6 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x00e7
        L_0x00e5:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x00e7:
            com.whatsapp.components.button.ThumbnailButton r3 = r2.A04
            r0 = 0
            r3.setVisibility(r0)
            com.whatsapp.components.button.ThumbnailButton r0 = r2.A04
            r0.setAlpha(r6)
            X.1bI r3 = r2.A07
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x00ff
            android.widget.TextView r0 = X.AnonymousClass3MX.A0M(r3)
            X.AnonymousClass3MW.A1S(r0)
        L_0x00ff:
            X.1bI r3 = r2.A07
            r0 = 8
            r3.A04(r0)
            java.lang.Integer r8 = r1.A03
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r7 = 0
            if (r8 != r0) goto L_0x010f
            r7 = 8
        L_0x010f:
            android.content.Context r3 = r2.getContext()
            int r1 = r1.A01
            boolean r0 = r4.A0H
            int r6 = X.AnonymousClass4aR.A01(r3, r1, r0)
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass3MZ.A0x(r5)
            int r4 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r3 = X.AnonymousClass000.A1Z(r8, r0)
            r1 = 0
            if (r5 == 0) goto L_0x0173
            r2.A05 = r5
            X.1bI r0 = r2.A06
            r0.A04(r7)
            if (r7 != 0) goto L_0x0173
            com.whatsapp.jid.UserJid r0 = r2.A05
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0149
            r2.A05 = r5
            X.1bI r0 = r2.A06
            android.view.View r1 = r0.A02()
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r1
            r0 = 0
            r1.A00(r0)
        L_0x0149:
            X.1bI r0 = r2.A06
            android.view.View r0 = r0.A02()
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r0 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r0
            r0.A03 = r6
            X.1bI r0 = r2.A06
            android.view.View r1 = r0.A02()
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r1
            int r0 = X.AnonymousClass3MY.A02(r2, r4)
            r1.A02 = r0
            X.1bI r0 = r2.A06
            android.view.View r0 = r0.A02()
            com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave r0 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatMiniPillWave) r0
            r0.setWithRandomAnimation(r3)
            return
        L_0x016d:
            X.2ym r7 = r4.A06
            if (r7 == 0) goto L_0x0082
            goto L_0x00ce
        L_0x0173:
            r2.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3WM.Bmc(X.1xT, int):void");
    }

    private void A01(AnonymousClass3PV r7, Double d, int i, int i2) {
        int A01;
        r7.clearAnimation();
        int A0Q = A0Q();
        boolean A1T = AnonymousClass000.A1T(i2, 2);
        int A012 = r7.A01(A0Q);
        if (A1T) {
            r7.A07.A03().height = (int) (((float) A012) - r7.A04.A00);
            AnonymousClass3MX.A0M(r7.A07).setMinWidth((int) (((double) A012) * r7.A00));
        } else {
            ViewGroup.LayoutParams layoutParams = r7.A04.getLayoutParams();
            layoutParams.height = A012;
            layoutParams.width = A012;
            r7.A04.setLayoutParams(layoutParams);
            r7.A04.A01 = (float) A012;
        }
        AnonymousClass3PV.A00(r7, (VoiceChatMiniPillWave) null, A012);
        LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
        if (i != 0) {
            int A0Q2 = A0Q();
            double doubleValue = d.doubleValue();
            if (A0Q2 <= 1) {
                A01 = 0;
            } else {
                A01 = (int) (((double) r7.A01(A0Q2)) * doubleValue);
            }
            int i3 = -A01;
            if (AnonymousClass3MW.A1Z(this.A00.A0A)) {
                A0D.rightMargin = i3;
            } else {
                A0D.leftMargin = i3;
            }
        }
        r7.setLayoutParams(A0D);
        PeerAvatarLayout peerAvatarLayout = this.A00;
        float f = (float) (peerAvatarLayout.A02 - (peerAvatarLayout.A03 * i));
        r7.setElevation(f);
        r7.setElevation(f);
    }

    public int getItemViewType(int i) {
        Object A0U = A0U(i);
        C17960vV.A07(A0U);
        return ((C108685c8) A0U).BTW();
    }
}
