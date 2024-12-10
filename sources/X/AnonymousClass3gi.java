package X;

import android.view.View;
import android.widget.Checkable;
import com.whatsapp.WaDynamicRoundCornerImageView;

/* renamed from: X.3gi  reason: invalid class name */
public final class AnonymousClass3gi extends WaDynamicRoundCornerImageView implements Checkable {
    public static final int[] A02 = {16842912};
    public boolean A00;
    public boolean A01;

    public boolean isChecked() {
        return this.A01;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A02);
        }
        return onCreateDrawableState;
    }

    public void toggle() {
        this.A01 = !this.A01;
    }

    public void setChecked(boolean z) {
        this.A01 = z;
    }
}
