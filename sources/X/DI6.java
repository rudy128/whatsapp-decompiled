package X;

import android.os.Bundle;

public final class DI6 implements EDW, EDX {
    public EDT A00;
    public final C24924CPx A01;
    public final boolean A02;

    public DI6(C24924CPx cPx, boolean z) {
        this.A01 = cPx;
        this.A02 = z;
    }

    public final void onConnected(Bundle bundle) {
        C18210vx.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnected(bundle);
    }

    public final void onConnectionFailed(C23203Bcx bcx) {
        C24924CPx cPx = this.A01;
        boolean z = this.A02;
        C18210vx.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.CSb(bcx, cPx, z);
    }

    public final void onConnectionSuspended(int i) {
        C18210vx.A02(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.onConnectionSuspended(i);
    }
}
