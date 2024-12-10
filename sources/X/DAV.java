package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

public class DAV implements E7R {
    public final /* synthetic */ C28654ECo A00;
    public final /* synthetic */ LiteCameraView A01;

    public DAV(C28654ECo eCo, LiteCameraView liteCameraView) {
        this.A01 = liteCameraView;
        this.A00 = eCo;
    }

    public void Bnt() {
        this.A00.Bnt();
    }

    public void Bnv(Exception exc) {
        LiteCameraView.A04(this.A01, exc, "/onCaptureError/");
        this.A00.Bnv(exc);
    }
}
