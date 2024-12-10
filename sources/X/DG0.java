package X;

import android.graphics.ImageFormat;
import com.facebook.smartcapture.camera.CameraFragment;

public final class DG0 implements C28555E7g {
    public final /* synthetic */ CameraFragment A00;

    public void Bvy(C25556Chu chu) {
        C28614EAk eAk;
        C18070vi.A0d(chu, 0);
        CameraFragment cameraFragment = this.A00;
        cameraFragment.A00 = chu;
        ImageFormat.getBitsPerPixel(17);
        cameraFragment.A08.BbC();
        C26128Csq csq = new C26128Csq();
        C26128Csq.A01(C25971Cpe.A0m, csq, 17);
        BHG bhg = cameraFragment.A01;
        if (bhg != null && (eAk = bhg.A0Q) != null) {
            eAk.Bk3(new C22901BUm(cameraFragment, 14), csq.A03());
        }
    }

    public DG0(CameraFragment cameraFragment) {
        this.A00 = cameraFragment;
    }

    public void BtV(Exception exc) {
        C28555E7g e7g = (C28555E7g) this.A00.A09.BbC();
        if (e7g != null) {
            e7g.BtV(exc);
        }
    }
}
