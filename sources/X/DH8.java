package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

public class DH8 implements EAM {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    public void BFZ(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    public String BV9() {
        return "Platform";
    }

    public boolean BgY() {
        return this.A03;
    }

    public void CHz(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        this.A00 = mediaMuxer.addTrack(mediaFormat);
    }

    public void CJl(int i) {
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        mediaMuxer.setOrientationHint(i);
    }

    public void CLL(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        this.A01 = mediaMuxer.addTrack(mediaFormat);
    }

    public void start() {
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        mediaMuxer.start();
        this.A03 = true;
    }

    public void stop() {
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        mediaMuxer.stop();
        this.A03 = false;
        this.A02.release();
    }

    public void CSO(C28577E8n e8n) {
        C26159CtX.A01(e8n.BNu());
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        mediaMuxer.writeSampleData(this.A00, e8n.BNu(), e8n.BNo());
    }

    public void CSW(C28577E8n e8n) {
        C26159CtX.A01(e8n.BNu());
        MediaMuxer mediaMuxer = this.A02;
        C26159CtX.A01(mediaMuxer);
        mediaMuxer.writeSampleData(this.A01, e8n.BNu(), e8n.BNo());
    }
}
