package X;

import android.hardware.display.DisplayManager;

/* renamed from: X.CyI  reason: case insensitive filesystem */
public final class C26356CyI implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ C25961CpT A01;

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }

    public C26356CyI(DisplayManager displayManager, C25961CpT cpT) {
        this.A01 = cpT;
        this.A00 = displayManager;
    }

    public void onDisplayChanged(int i) {
        if (i == 0) {
            C25961CpT.A00(this.A01);
        }
    }
}
