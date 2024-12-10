package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.CpT  reason: case insensitive filesystem */
public final class C25961CpT {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C26356CyI A0A;
    public final C26382Cyi A0B;

    public static void A00(C25961CpT cpT) {
        Display defaultDisplay = cpT.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            cpT.A06 = refreshRate;
            cpT.A07 = (refreshRate * 80) / 100;
        }
    }

    public C25961CpT(Context context) {
        C26356CyI cyI;
        if (context != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            this.A09 = windowManager;
            if (windowManager != null) {
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager == null) {
                    cyI = null;
                } else {
                    cyI = new C26356CyI(displayManager, this);
                }
                this.A0A = cyI;
                this.A0B = C26382Cyi.A05;
            }
            this.A0A = null;
            this.A0B = null;
        } else {
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public C25961CpT() {
        this((Context) null);
    }
}
