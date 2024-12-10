package X;

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

public class CWY {
    public final CYE A00 = new CYE();
    public final C25132CZh A01 = new C25132CZh();
    public final C25132CZh A02 = new C25132CZh();
    public volatile C25103CXw A03;

    public void A00(boolean z, Camera camera) {
        CYE cye = this.A00;
        ReentrantLock reentrantLock = cye.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!cye.A01()) {
                    camera.stopPreview();
                    reentrantLock.lock();
                    cye.A00 = 0;
                    reentrantLock.unlock();
                    C25103CXw cXw = this.A03;
                    if (cXw != null && !cXw.A00.isEmpty()) {
                        C26078Crs.A00(C27082DTh.A00(cXw, 28));
                    }
                    if (z) {
                        C25132CZh cZh = this.A02;
                        if (!cZh.A00.isEmpty()) {
                            C26078Crs.A00(new C27076DTa(this, cZh.A00, 15));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        reentrantLock.unlock();
    }
}
