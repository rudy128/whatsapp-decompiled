package X;

import android.util.Log;

/* renamed from: X.DEg  reason: case insensitive filesystem */
public class C26798DEg implements BCw {
    public void C6M() {
        Log.d("Camera1Lifecycle", "Camera Lifecycle: onStartPreview");
    }

    public void C74() {
        Log.d("Camera1Lifecycle", "Camera Lifecycle: onStopPreview");
    }

    public void Bt0(String str) {
        Log.d("Camera1Lifecycle", AnonymousClass001.A1H("Camera Lifecycle: ", str, AnonymousClass000.A10()));
    }

    public void BzW(String str) {
        Log.d("Camera1Lifecycle", AnonymousClass001.A1H("Camera Lifecycle: onOpen productName=", str, AnonymousClass000.A10()));
    }

    public void C2v(String str) {
        Log.d("Camera1Lifecycle", AnonymousClass001.A1H("Camera Lifecycle: onRelease productName=", str, AnonymousClass000.A10()));
    }

    public void C6N(int i) {
        Log.d("Camera1Lifecycle", AnonymousClass001.A1I("Camera Lifecycle: onStartPreviewFailure error: ", AnonymousClass000.A10(), i));
    }

    public void CDc(String str, String str2, String str3) {
        String str4;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Camera Lifecycle event: ");
        A10.append(str);
        A10.append(" hostActivity: ");
        A10.append(str2);
        if (str3 != null) {
            str4 = AnonymousClass001.A1H(" viewId: ", str3, AnonymousClass000.A10());
        } else {
            str4 = "";
        }
        Log.d("Camera1Lifecycle", AnonymousClass000.A0y(str4, A10));
    }
}
