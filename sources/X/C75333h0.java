package X;

import android.view.View;
import android.widget.Checkable;
import com.whatsapp.WaImageView;

/* renamed from: X.3h0  reason: invalid class name and case insensitive filesystem */
public final class C75333h0 extends WaImageView implements Checkable {
    public static final int[] A01 = {16842912};
    public boolean A00;

    public boolean isChecked() {
        return this.A00;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A01);
        }
        return onCreateDrawableState;
    }

    public void toggle() {
        this.A00 = !this.A00;
    }

    public void setChecked(boolean z) {
        this.A00 = z;
    }
}
