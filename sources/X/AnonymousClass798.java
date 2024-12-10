package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.798  reason: invalid class name */
public class AnonymousClass798 implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public AnonymousClass798(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }

    public boolean onPreDraw() {
        if (this.A00 != 0) {
            SelectionCheckView selectionCheckView = ((C131076kT) this.A02).A0F;
            AnonymousClass3MX.A1G(selectionCheckView, this);
            selectionCheckView.A04(this.A03, true);
            return false;
        }
        C128936gv r3 = (C128936gv) this.A02;
        AnonymousClass3MX.A1G(r3.A02, this);
        SelectionCheckView selectionCheckView2 = r3.A02;
        boolean z = this.A03;
        selectionCheckView2.A04(z, true);
        C110265fC.A00((C110265fC) this.A01, r3.A02, z);
        return false;
    }
}
