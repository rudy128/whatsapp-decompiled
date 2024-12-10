package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3s0  reason: invalid class name */
public final class AnonymousClass3s0 extends C98524rI {
    public int A00;
    public View A01;
    public AnimationSet A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public PeerAvatarLayout A06;
    public C59822mw A07;
    public C178119Bw A08;
    public CallState A09;
    public WDSButton A0A;
    public boolean A0B;
    public final ViewGroup A0C;
    public final AnonymousClass11S A0D;
    public final AnonymousClass1HQ A0E;
    public final AnonymousClass1VP A0F;
    public final AnonymousClass1M9 A0G;
    public final AnonymousClass1MZ A0H;
    public final AnonymousClass1E7 A0I;
    public final C18030ve A0J;
    public final AnonymousClass10I A0K;
    public final AnonymousClass1IV A0L = new C98404r5(this, 1);
    public final AnonymousClass1VT A0M;
    public final C18100vl A0N = AnonymousClass1DF.A01(AnonymousClass5Q2.A00);
    public final C24921Me A0O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3s0(ViewGroup viewGroup, AnonymousClass11S r4, AnonymousClass1HQ r5, AnonymousClass1VP r6, AnonymousClass1M9 r7, C24921Me r8, C108885cS r9, AnonymousClass1MZ r10, AnonymousClass1E7 r11, C18030ve r12, AnonymousClass10I r13, AnonymousClass1VT r14, int i) {
        super(r9, 2);
        C18070vi.A0d(r12, 1);
        C18070vi.A0d(r4, 2);
        C72473Md.A1M(r13, r8, r7, 3);
        C18070vi.A0x(r6, r5, r14, r10, r9);
        C72473Md.A1L(r11, viewGroup);
        this.A0J = r12;
        this.A0D = r4;
        this.A0K = r13;
        this.A0O = r8;
        this.A0G = r7;
        this.A0F = r6;
        this.A0E = r5;
        this.A0M = r14;
        this.A0H = r10;
        this.A0I = r11;
        this.A0C = viewGroup;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r3.A0I.A0t != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass3s0 r3) {
        /*
            X.1HQ r0 = r3.A0E
            X.1HR r0 = (X.AnonymousClass1HR) r0
            X.0ve r0 = r0.A00
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r3.A0A
            if (r2 == 0) goto L_0x0029
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0025
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x001e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x001e
            X.2mw r0 = r3.A07
            if (r0 == 0) goto L_0x0025
        L_0x001e:
            X.1E7 r0 = r3.A0I
            boolean r1 = r0.A0t
            r0 = 1
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r2.setEnabled(r0)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3s0.A00(X.3s0):void");
    }

    public static final void A01(AnonymousClass3s0 r1) {
        AnimationSet animationSet = r1.A02;
        if (animationSet != null) {
            animationSet.cancel();
            r1.A02 = null;
            WaImageView waImageView = r1.A03;
            if (waImageView != null) {
                waImageView.clearAnimation();
                waImageView.setScaleX(1.0f);
                waImageView.setScaleY(1.0f);
                waImageView.setAlpha(0.75f);
            }
        }
    }

    public static final void A02(AnonymousClass3s0 r3) {
        if (r3.A07 == null && r3.A08 == null) {
            r3.A06(false);
        } else if (r3.A01 == null) {
            r3.A07(false);
        } else {
            r3.A0K.CGN(new C98774rh(r3, 32));
        }
    }

    public final void A0A(GroupJid groupJid) {
        Integer num;
        C178119Bw r0 = this.A08;
        if (r0 == null || !r0.A0W()) {
            AnonymousClass1VP r3 = this.A0F;
            if (groupJid != null) {
                num = Integer.valueOf(AnonymousClass3MW.A03(this.A0H, groupJid));
            } else {
                num = null;
            }
            r3.BiX(1, num, 7, true);
        }
    }
}
