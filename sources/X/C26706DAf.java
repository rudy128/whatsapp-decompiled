package X;

import com.whatsapp.util.Log;

/* renamed from: X.DAf  reason: case insensitive filesystem */
public class C26706DAf implements E49 {
    public final int A00;

    public C26706DAf(int i) {
        this.A00 = i;
    }

    public final void Bxl(C2X c2x) {
        StringBuilder sb;
        String str;
        String A1E;
        switch (this.A00) {
            case 0:
                sb = AnonymousClass000.A10();
                str = "LiteCameraArFactory/mediaGraphErrorCallback/";
                break;
            case 2:
                sb = AnonymousClass000.A10();
                str = "LiteCameraFactory/mediaGraphErrorCallback/";
                break;
            default:
                A1E = "CameraProcessor/mediaGraphErrorCallback";
                break;
        }
        A1E = AnonymousClass001.A1E(c2x, str, sb);
        Log.e(A1E);
    }
}
