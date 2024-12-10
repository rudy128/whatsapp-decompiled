package X;

import android.animation.TimeInterpolator;
import android.view.View;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.5yH  reason: invalid class name and case insensitive filesystem */
public class C116595yH extends AnonymousClass7A2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C116595yH(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj2;
        this.A02 = obj;
    }

    public void BlP(View view) {
        switch (this.A00) {
            case 0:
                ((AnonymousClass1HC) this.A02).A0B((AnonymousClass1HM) null);
                C108975cc.A0s(view);
                C113675nX r2 = (C113675nX) this.A01;
                C42011xT r1 = (C42011xT) this.A03;
                r2.A08(r1);
                TimeInterpolator timeInterpolator = C113675nX.A0C;
                C108995ce.A14(r2, r1, r2.A07);
                SelectedListContactPickerFragment selectedListContactPickerFragment = r2.A00;
                if (selectedListContactPickerFragment != null) {
                    selectedListContactPickerFragment.A33();
                    return;
                }
                return;
            case 1:
                ((AnonymousClass1HC) this.A02).A0B((AnonymousClass1HM) null);
                C113675nX r22 = (C113675nX) this.A01;
                C42011xT r12 = (C42011xT) this.A03;
                r22.A08(r12);
                TimeInterpolator timeInterpolator2 = C113675nX.A0C;
                C108995ce.A14(r22, r12, r22.A01);
                return;
            default:
                ((AnonymousClass1HC) this.A03).A0B((AnonymousClass1HM) null);
                C108995ce.A0t(view);
                C113675nX r3 = (C113675nX) this.A01;
                C123346Ub r23 = (C123346Ub) this.A02;
                r3.A08(r23.A05);
                TimeInterpolator timeInterpolator3 = C113675nX.A0C;
                C108995ce.A14(r3, r23.A05, r3.A03);
                return;
        }
    }

    public void BlQ() {
    }
}
