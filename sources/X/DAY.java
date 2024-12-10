package X;

import com.whatsapp.camera.litecamera.LiteCameraView;

public class DAY implements C28654ECo {
    public final /* synthetic */ E8C A00;
    public final /* synthetic */ LiteCameraView A01;

    public DAY(E8C e8c, LiteCameraView liteCameraView) {
        this.A01 = liteCameraView;
        this.A00 = e8c;
    }

    public void Bnt() {
    }

    public void Bny() {
        this.A00.onShutter();
    }

    public void C0X(byte[] bArr) {
        this.A00.C0c(bArr, C17890vO.A1R(this.A01.getCameraFacing()));
    }

    public void Bnv(Exception exc) {
        C17900vP.A0X(exc, "LiteCamera/onCaptureError: An error occurred during capture - ", AnonymousClass000.A10());
        LiteCameraView liteCameraView = this.A01;
        LiteCameraView.A04(liteCameraView, exc, "/onCaptureError/");
        C28598E9p e9p = liteCameraView.A06;
        if (e9p != null) {
            e9p.BnT(exc, 3);
        }
    }
}
