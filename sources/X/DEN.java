package X;

import com.whatsapp.camera.litecamera.LiteCameraView;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public class DEN implements E4i {
    public final int A00;
    public final Object A01;

    public DEN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C1k() {
        C28417E0i e0i;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            e0i = ((C22808BPw) obj).A0C;
        } else {
            e0i = ((DAU) obj).A0B;
        }
        if (e0i != null) {
            C26703DAc dAc = (C26703DAc) e0i;
            if (dAc.A00 != 0) {
                VoipLiteCamera.renderingStartedListener$lambda$0((VoipLiteCamera) dAc.A01);
                return;
            }
            LiteCameraView liteCameraView = (LiteCameraView) dAc.A01;
            liteCameraView.A08.A01("LiteCamera");
            if (!liteCameraView.A0L || C17890vO.A1R(liteCameraView.getCameraFacing())) {
                liteCameraView.A0T.A00();
            } else {
                EDL edl = liteCameraView.A0R;
                C25688CkJ ckJ = liteCameraView.A0T;
                edl.CK7(ckJ.A01);
                if (!ckJ.A07) {
                    ckJ.A03.A01();
                    ckJ.A07 = true;
                }
            }
            if (liteCameraView.A0R instanceof DAU) {
                liteCameraView.A09.CGv(new AnonymousClass7R9((Object) dAc, 30), 200);
            }
        }
    }
}
