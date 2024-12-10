package X;

import android.hardware.camera2.CameraDevice;
import java.util.concurrent.ExecutionException;

public class BFN extends CameraDevice.StateCallback implements E7d {
    public CameraDevice A00;
    public C27223Da2 A01;
    public Boolean A02;
    public final C25203Caw A03;
    public final CKA A04;
    public final CKB A05;

    public void BDG() {
        this.A03.A00();
    }

    public /* bridge */ /* synthetic */ Object BYK() {
        Boolean bool = this.A02;
        if (bool == null) {
            throw AnonymousClass000.A0n("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            CameraDevice cameraDevice = this.A00;
            C28111Yx.A02(cameraDevice);
            return cameraDevice;
        } else {
            throw this.A01;
        }
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A02 = AnonymousClass000.A0h();
            this.A01 = new C27223Da2("Could not open camera. Operation disconnected.");
            this.A03.A01();
            return;
        }
        CKB ckb = this.A05;
        if (ckb != null) {
            C26809DEr.A05(ckb.A00, "Camera has been disconnected.", 2);
        }
    }

    public void onError(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        if (this.A00 == null) {
            this.A02 = AnonymousClass000.A0h();
            this.A01 = new C27223Da2(AnonymousClass001.A1I("Could not open camera. Operation error: ", AnonymousClass000.A10(), i));
            this.A03.A01();
            return;
        }
        CKB ckb = this.A05;
        if (ckb != null) {
            C26809DEr dEr = ckb.A00;
            if (i == 1) {
                str = "Camera in use by higher priority component.";
            } else if (i == 2) {
                str = "There are too many open camera devices.";
            } else if (i == 3) {
                str = "Camera disabled, device policy error.";
            } else if (i == 4 || i == 5) {
                i2 = 100;
                str = "Camera device has encountered a fatal error.";
                C26809DEr.A05(dEr, str, i2);
            } else {
                str = "Unknown camera error.";
            }
            i2 = 1;
            C26809DEr.A05(dEr, str, i2);
        }
    }

    public BFN(CKA cka, CKB ckb) {
        this.A04 = cka;
        this.A05 = ckb;
        C25203Caw caw = new C25203Caw();
        this.A03 = caw;
        caw.A02(0);
    }

    public void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        CKA cka = this.A04;
        if (cka != null) {
            C26809DEr dEr = cka.A00;
            if (dEr.A0l == cameraDevice) {
                C26225CvG cvG = dEr.A0V;
                C25103CXw cXw = dEr.A0n;
                if (cXw != null) {
                    String A022 = dEr.A0a.A02();
                    if (!cXw.A00.isEmpty()) {
                        C26078Crs.A00(new C21452AkJ(7, A022, cXw));
                    }
                }
                dEr.A0r = false;
                dEr.A0l = null;
                dEr.A0E = null;
                dEr.A09 = null;
                dEr.A0A = null;
                dEr.A06 = null;
                C26223CvD cvD = dEr.A08;
                if (cvD != null) {
                    cvD.A0E.removeMessages(1);
                    cvD.A08 = null;
                    cvD.A06 = null;
                    cvD.A07 = null;
                    cvD.A05 = null;
                    cvD.A04 = null;
                    cvD.A0A = null;
                    cvD.A0D = null;
                    cvD.A0C = null;
                }
                dEr.A0U.A0F = false;
                dEr.A0T.A00();
                C25090CXb cXb = dEr.A0W;
                if (cXb.A0D && (!dEr.A0s || cXb.A0C)) {
                    try {
                        dEr.A0b.A00(new C22901BUm(cka, 12), "on_camera_closed_stop_video_recording", new C27132DVt((Object) cka, 10)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        C26175Cts.A00(e);
                    }
                }
                if (cvG.A08 != null) {
                    synchronized (C26225CvG.A0T) {
                        DEU deu = cvG.A07;
                        if (deu != null) {
                            deu.A0I = false;
                            cvG.A07 = null;
                        }
                    }
                    try {
                        cvG.A08.BAM();
                        cvG.A08.close();
                    } catch (Exception unused) {
                    }
                    cvG.A08 = null;
                }
                String id = cameraDevice.getId();
                C22902BUn bUn = dEr.A0R;
                if (id.equals(bUn.A00)) {
                    bUn.A01();
                    bUn.A00 = null;
                }
            }
        }
    }

    public void onOpened(CameraDevice cameraDevice) {
        this.A02 = AnonymousClass000.A0i();
        this.A00 = cameraDevice;
        this.A03.A01();
    }
}
