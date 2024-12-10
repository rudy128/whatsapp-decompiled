package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

public class CVD {
    public TotalCaptureResult A00;

    public Object A00(CaptureResult.Key key) {
        try {
            TotalCaptureResult totalCaptureResult = this.A00;
            if (totalCaptureResult != null) {
                return totalCaptureResult.get(key);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
