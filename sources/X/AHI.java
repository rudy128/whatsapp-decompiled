package X;

import android.os.Handler;
import androidx.preference.PreferenceGroup;

public class AHI implements B6W {
    public final /* synthetic */ PreferenceGroup A00;
    public final /* synthetic */ C161808Hv A01;

    public AHI(PreferenceGroup preferenceGroup, C161808Hv r2) {
        this.A01 = r2;
        this.A00 = preferenceGroup;
    }

    public void C1S() {
        this.A00.A00 = Integer.MAX_VALUE;
        C161808Hv r0 = this.A01;
        Handler handler = r0.A00;
        Runnable runnable = r0.A02;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
