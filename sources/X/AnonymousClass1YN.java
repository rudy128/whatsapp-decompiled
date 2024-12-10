package X;

import android.widget.ImageButton;

/* renamed from: X.1YN  reason: invalid class name */
public abstract class AnonymousClass1YN extends ImageButton {
    public int A00;

    public final void A03(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.A00 = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.A00;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.A00 = i;
    }
}
