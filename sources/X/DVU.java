package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

public class DVU implements Callable {
    public final /* synthetic */ C26225CvG A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public DVU(C26225CvG cvG, boolean z, boolean z2) {
        this.A00 = cvG;
        this.A01 = z;
        this.A02 = z2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A0A(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new C27223Da2(C17900vP.A0C("Could not start preview: ", AnonymousClass000.A10(), e));
        }
    }
}
