package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.util.List;

public class DHP implements EAS {
    public MediaFormat A00;
    public long A01 = -1;
    public DH2 A02;
    public C25265Cc6 A03;
    public CSW A04;
    public CZT A05;
    public boolean A06;
    public final /* synthetic */ DHT A07;

    public void CCN(MediaFormat mediaFormat, CZT czt, List list, int i, boolean z) {
        C25265Cc6 A062;
        MediaFormat mediaFormat2 = mediaFormat;
        this.A00 = mediaFormat;
        CZT czt2 = czt;
        this.A05 = czt;
        DHT dht = this.A07;
        this.A04 = new CSW(dht.A00, czt, i);
        List list2 = list;
        boolean z2 = z;
        if (!list.isEmpty() || z) {
            A062 = dht.A02.A06(mediaFormat2, this.A04.A02, czt2, list2, z2);
        } else {
            String string = mediaFormat.getString("mime");
            C26159CtX.A01(string);
            A062 = C26259Cw4.A01(mediaFormat, this.A04.A02, czt, string);
        }
        this.A03 = A062;
        A062.A02();
    }

    public boolean CMT() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Cjg, java.lang.Object] */
    public void finish() {
        long j;
        CAF.A00("VideoTranscoderJBMR2", "finish", new Object[0]);
        ? obj = new Object();
        new BVu(obj, this.A03, 9).A02();
        CSW csw = this.A04;
        if (csw != null) {
            long j2 = csw.A00;
            C26343Cy2 cy2 = csw.A03;
            C26159CtX.A01(cy2);
            synchronized (cy2) {
                j = cy2.A01;
            }
            CAF.A00("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", Double.valueOf((((double) (j2 - j)) / ((double) csw.A00)) * 100.0d));
            CSW csw2 = this.A04;
            CAF.A00("TranscodeOutputSurfaceForJBMR2", "release", new Object[0]);
            Surface surface = csw2.A02;
            if (surface != null) {
                surface.release();
            }
            csw2.A02 = null;
            csw2.A03 = null;
            if (csw2.A01 != null) {
                CAF.A00("TranscodeOutputSurfaceForJBMR2", "release: mHandlerThread.quitSafely", new Object[0]);
                csw2.A01.quitSafely();
                csw2.A01 = null;
            }
        }
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }

    public void flush() {
        CAF.A00("VideoTranscoderJBMR2", "flush", new Object[0]);
        C25265Cc6 cc6 = this.A03;
        C26159CtX.A01(cc6);
        StringBuilder sb = cc6.A07;
        sb.append("flushB,");
        cc6.A04.flush();
        sb.append("flushE,");
        this.A01 = -1;
        this.A06 = false;
        this.A02 = null;
    }

    public DHP(DHT dht) {
        this.A07 = dht;
    }

    public long BI8(long j) {
        MediaFormat mediaFormat;
        DH2 dh2 = this.A02;
        long j2 = -1;
        if (dh2 != null && dh2.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = dh2.A00;
            long j3 = bufferInfo.presentationTimeUs;
            if (Build.VERSION.SDK_INT >= 29 && (mediaFormat = this.A00) != null && mediaFormat.containsKey("color-transfer")) {
                this.A00.getInteger("color-transfer");
            }
            try {
                C25265Cc6 cc6 = this.A03;
                C26159CtX.A01(cc6);
                cc6.A04(this.A02, AnonymousClass000.A1Q((bufferInfo.presentationTimeUs > 0 ? 1 : (bufferInfo.presentationTimeUs == 0 ? 0 : -1))));
                if ((bufferInfo.flags & 4) != 0) {
                    this.A06 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        CSW csw = this.A04;
                        C26159CtX.A01(csw);
                        csw.A00++;
                        C26343Cy2 cy2 = csw.A03;
                        C26159CtX.A01(cy2);
                        cy2.A00();
                    }
                    j2 = j3;
                }
                this.A02 = null;
            } catch (IllegalStateException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("codec info: ");
                C25265Cc6 cc62 = this.A03;
                C26159CtX.A01(cc62);
                A10.append(cc62.A01);
                throw new IllegalStateException(C17890vO.A0a(" , mDecoder Presentation Time: ", A10, j3), e);
            }
        }
        try {
            C25265Cc6 cc63 = this.A03;
            C26159CtX.A01(cc63);
            DH2 A012 = cc63.A01(j);
            if (A012 != null && A012.A02 >= 0) {
                this.A02 = A012;
                this.A01 = A012.A00.presentationTimeUs;
            }
            return j2;
        } catch (Throwable th) {
            throw new IllegalStateException(C17890vO.A0a("Previous pts: ", AnonymousClass000.A10(), j2), th);
        }
    }

    public DH2 BIR(long j) {
        C25265Cc6 cc6 = this.A03;
        C26159CtX.A01(cc6);
        return cc6.A00(j);
    }

    public long BQJ() {
        return this.A01;
    }

    public String BQK() {
        C25265Cc6 cc6 = this.A03;
        C26159CtX.A01(cc6);
        return cc6.A01;
    }

    public String BQM() {
        C25265Cc6 cc6 = this.A03;
        C26159CtX.A01(cc6);
        try {
            return cc6.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public boolean Bgl() {
        return this.A06;
    }

    public void CDC(DH2 dh2) {
        C25265Cc6 cc6 = this.A03;
        C26159CtX.A01(cc6);
        cc6.A03(dh2);
    }

    public void CQV(int i, Bitmap bitmap) {
        EAZ eaz = this.A07.A00.A00;
        C26159CtX.A01(eaz);
        eaz.CQV(i, bitmap);
    }
}
