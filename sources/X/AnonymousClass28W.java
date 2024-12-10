package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.28W  reason: invalid class name */
public abstract class AnonymousClass28W extends C42011xT {
    public C41121vq A0B() {
        C41121vq r0;
        if (this instanceof AnonymousClass2CW) {
            r0 = ((AnonymousClass2CW) this).A00;
        } else {
            r0 = ((AnonymousClass2CV) this).A00;
        }
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("callItem");
        throw null;
    }

    public SelectionCheckView A0C() {
        C18100vl r0;
        if (this instanceof AnonymousClass2CW) {
            r0 = ((AnonymousClass2CW) this).A0D;
        } else {
            r0 = ((AnonymousClass2CV) this).A08;
        }
        return (SelectionCheckView) r0.getValue();
    }

    public final void A0D(boolean z, boolean z2, boolean z3) {
        if (A0C().A0D != z) {
            A0B();
            View view = this.A0H;
            if (z) {
                view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130970064, 2131101205));
            } else if (z3) {
                C42491yG.A03(view);
            } else {
                C42491yG.A02(view);
            }
            view.setSelected(z);
            A0C().A04(z, z2);
        }
    }
}
