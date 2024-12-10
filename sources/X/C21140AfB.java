package X;

import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import org.pjsip.PjCamera;

/* renamed from: X.AfB  reason: case insensitive filesystem */
public class C21140AfB implements C28608E9z {
    public final /* synthetic */ VoipCameraManager A00;

    public void BtT() {
    }

    public void C5E() {
    }

    public void C9W() {
    }

    public C21140AfB(VoipCameraManager voipCameraManager) {
        this.A00 = voipCameraManager;
    }

    public void Ble(int i) {
        C20736AWr.A00(this.A00, i, 12);
    }

    public void BnX(VoipPhysicalCamera voipPhysicalCamera, int i) {
        this.A00.clearStoredRawCameraInfo(i, C72453Mb.A04(voipPhysicalCamera instanceof PjCamera ? 1 : 0));
    }

    public void Bp6(VoipPhysicalCamera voipPhysicalCamera) {
        this.A00.closeCurrentCamera(voipPhysicalCamera);
    }

    public void BzX() {
        B65 b65 = this.A00.onCameraOpenedListener;
        if (b65 != null) {
            C21139AfA afA = (C21139AfA) b65;
            afA.A00.A01.post(new C146427Pb(afA, 0));
        }
    }

    public C21140AfB() {
    }
}
