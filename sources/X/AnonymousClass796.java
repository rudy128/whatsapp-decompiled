package X;

import android.view.ViewTreeObserver;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.796  reason: invalid class name */
public final class AnonymousClass796 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C130926kE A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass796(C130926kE r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        SelectionCheckView selectionCheckView = this.A00.A06;
        AnonymousClass3MX.A1G(selectionCheckView, this);
        selectionCheckView.A04(this.A01, true);
        return false;
    }
}
