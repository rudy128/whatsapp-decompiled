package X;

import android.media.MediaFormat;

public class DH9 implements EAM {
    public int A00;
    public boolean A01;
    public final C24174Bwk A02;
    public final EAM A03;

    public void BFZ(String str) {
        this.A03.BFZ(this.A02.getCanonicalPath());
    }

    public String BV9() {
        return this.A03.BV9();
    }

    public boolean BgY() {
        return this.A01;
    }

    public void CHz(MediaFormat mediaFormat) {
        this.A03.CHz(mediaFormat);
    }

    public void CJl(int i) {
        this.A03.CJl(i);
    }

    public void CLL(MediaFormat mediaFormat) {
        this.A03.CLL(mediaFormat);
    }

    public void CSO(C28577E8n e8n) {
        this.A03.CSO(e8n);
        this.A00++;
    }

    public void CSW(C28577E8n e8n) {
        this.A03.CSW(e8n);
        this.A00++;
    }

    public void start() {
        this.A03.start();
        this.A01 = true;
    }

    public void stop() {
        this.A03.stop();
        this.A01 = false;
        this.A02.A00();
    }

    public DH9(C24174Bwk bwk, EAM eam) {
        this.A03 = eam;
        this.A02 = bwk;
    }
}
