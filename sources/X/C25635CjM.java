package X;

import android.media.MediaCodec;
import android.view.Surface;
import java.io.IOException;

/* renamed from: X.CjM  reason: case insensitive filesystem */
public abstract class C25635CjM {
    public final /* synthetic */ C25650Cjg A00;

    /* JADX WARNING: type inference failed for: r2v3, types: [X.Cjg, java.lang.Object] */
    public final void A02() {
        C25265Cc6 cc6;
        String str;
        try {
            BVu bVu = (BVu) this;
            switch (bVu.A00) {
                case 0:
                    EAX eax = (EAX) bVu.A01;
                    if (eax != null) {
                        eax.cancel();
                        return;
                    }
                    return;
                case 1:
                    DHA dha = (DHA) bVu.A01;
                    if (dha != null) {
                        try {
                            DHA.A03(dha, true);
                        } catch (IOException | RuntimeException unused) {
                        }
                        dha.A05 = false;
                        return;
                    }
                    return;
                case 2:
                    EAX eax2 = (EAX) bVu.A01;
                    if (eax2 != null) {
                        eax2.release();
                        return;
                    }
                    return;
                case 3:
                    EAT eat = (EAT) bVu.A01;
                    if (eat != null) {
                        eat.release();
                        return;
                    }
                    return;
                case 4:
                    C28609EAd eAd = (C28609EAd) bVu.A01;
                    if (eAd != null) {
                        eAd.release();
                        return;
                    }
                    return;
                case 5:
                    EAS eas = (EAS) bVu.A01;
                    if (eas != null) {
                        eas.finish();
                        return;
                    }
                    return;
                case 6:
                    MediaCodec mediaCodec = (MediaCodec) bVu.A01;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                        return;
                    }
                    return;
                case 7:
                    C26236CvW cvW = (C26236CvW) bVu.A01;
                    if (cvW != null) {
                        AnonymousClass8BT.A17(cvW.A0D, 5);
                        return;
                    }
                    return;
                case 8:
                    ((DHA) bVu.A01).stop();
                    return;
                default:
                    cc6 = (C25265Cc6) bVu.A01;
                    if (cc6 != null) {
                        StringBuilder sb = cc6.A07;
                        sb.append("stopB,");
                        ? obj = new Object();
                        MediaCodec mediaCodec2 = cc6.A04;
                        try {
                            mediaCodec2.stop();
                        } catch (Exception unused2) {
                        }
                        A01(obj, mediaCodec2, 6);
                        cc6.A02 = null;
                        cc6.A03 = null;
                        cc6.A00 = null;
                        Surface surface = cc6.A05;
                        if (surface != null) {
                            surface.release();
                        }
                        Throwable th = obj.A00;
                        if (th == null) {
                            sb.append("stopE,");
                            return;
                        }
                        throw th;
                    }
                    return;
            }
        } catch (Throwable th2) {
            C25650Cjg.A00(this.A00, th2);
        }
        C25650Cjg.A00(this.A00, th2);
    }

    public C25635CjM(C25650Cjg cjg) {
        this.A00 = cjg;
    }

    public static void A01(C25650Cjg cjg, Object obj, int i) {
        new CVE(new BVu(cjg, obj, i)).A00();
    }
}
