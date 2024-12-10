package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

public class CN7 {
    public CN6 A00;
    public final VpsEventCallback A01;

    public CN7(VpsEventCallback vpsEventCallback) {
        this.A01 = vpsEventCallback;
        this.A00 = new CN6(vpsEventCallback);
    }
}
