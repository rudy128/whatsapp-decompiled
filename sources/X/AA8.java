package X;

import android.hardware.display.DisplayManager;

public class AA8 implements DisplayManager.DisplayListener {
    public final /* synthetic */ DisplayManager A00;
    public final /* synthetic */ A12 A01;

    public void onDisplayChanged(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public AA8(DisplayManager displayManager, A12 a12) {
        this.A01 = a12;
        this.A00 = displayManager;
    }

    public void onDisplayAdded(int i) {
        A12 a12 = this.A01;
        if (a12.A02()) {
            B8W b8w = a12.A01;
            if (b8w != null) {
                b8w.C4W();
            }
            this.A00.unregisterDisplayListener(a12.A00);
        }
    }
}
