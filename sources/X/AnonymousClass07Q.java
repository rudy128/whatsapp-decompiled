package X;

import androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2;
import androidx.compose.material.ripple.RippleAnimation;
import java.util.Iterator;

/* renamed from: X.07Q  reason: invalid class name */
public final class AnonymousClass07Q extends AnonymousClass0UH implements AnonymousClass0t3 {
    public final C16300s2 A00;
    public final C06960a8 A01 = new C06960a8();
    public final float A02;
    public final C16300s2 A03;
    public final boolean A04;

    public void C2z() {
    }

    public void A04(AnonymousClass0Uk r2) {
        RippleAnimation rippleAnimation = (RippleAnimation) this.A01.get(r2);
        if (rippleAnimation != null) {
            rippleAnimation.A04();
        }
    }

    public void A05(AnonymousClass0Uk r7, AnonymousClass1OX r8) {
        AnonymousClass0QY r2;
        C06960a8 r5 = this.A01;
        Iterator it = r5.entrySet().iterator();
        while (it.hasNext()) {
            ((RippleAnimation) AnonymousClass000.A16(it).getValue()).A04();
        }
        boolean z = this.A04;
        if (z) {
            r2 = AnonymousClass000.A0e(r7.A00);
        } else {
            r2 = null;
        }
        RippleAnimation rippleAnimation = new RippleAnimation(r2, this.A02, z);
        r5.put(r7, rippleAnimation);
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new CommonRippleIndicationInstance$addRipple$2(r7, this, rippleAnimation, (C30391dr) null), r8, 3);
    }

    public void BJY(C17480uj r7) {
        long A0W = AnonymousClass000.A0W(this.A03);
        r7.BJR();
        A03(r7, this.A02, A0W);
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation rippleAnimation = (RippleAnimation) AnonymousClass000.A16(it).getValue();
            float f = ((AnonymousClass0K3) this.A00.getValue()).A03;
            if (f != 0.0f) {
                rippleAnimation.A05(r7, AnonymousClass0Oy.A03(AnonymousClass001.A11(A0W), C05100Qk.A04(A0W), C05100Qk.A03(A0W), C05100Qk.A02(A0W), f));
            }
        }
    }

    public void Bkh() {
        this.A01.clear();
    }

    public void Bux() {
        this.A01.clear();
    }

    public AnonymousClass07Q(C16300s2 r2, C16300s2 r3, float f, boolean z) {
        super(r3, z);
        this.A04 = z;
        this.A02 = f;
        this.A03 = r2;
        this.A00 = r3;
    }
}
