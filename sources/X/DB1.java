package X;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;

public class DB1 implements TouchGesturesListener$HitTestCallback {
    public final /* synthetic */ C26273CwN A00;

    public void hitTestResult(long j, boolean z) {
        this.A00.A0F.post(new DTY(this, 0, j, z));
    }

    public DB1(C26273CwN cwN) {
        this.A00 = cwN;
    }
}
