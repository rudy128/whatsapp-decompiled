package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.List;

public class DHN implements EAS {
    public final /* synthetic */ DHV A00;

    public void CQV(int i, Bitmap bitmap) {
    }

    public void flush() {
    }

    public DHN(DHV dhv) {
        this.A00 = dhv;
    }

    public long BI8(long j) {
        DHV dhv = this.A00;
        DH2 dh2 = dhv.A04;
        long j2 = -1;
        if (dh2 != null && dh2.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = dh2.A00;
            long j3 = bufferInfo.presentationTimeUs;
            C25265Cc6 cc6 = dhv.A05;
            C26159CtX.A01(cc6);
            cc6.A04(dhv.A04, AnonymousClass000.A1Q((bufferInfo.presentationTimeUs > 0 ? 1 : (bufferInfo.presentationTimeUs == 0 ? 0 : -1))));
            if ((bufferInfo.flags & 4) != 0) {
                dhv.A09 = true;
            } else {
                if (bufferInfo.presentationTimeUs >= 0) {
                    MediaCodec.BufferInfo bufferInfo2 = dhv.A04.A00;
                    C25624Cj4 cj4 = dhv.A07;
                    C26159CtX.A01(cj4);
                    cj4.A01++;
                    C26343Cy2 cy2 = cj4.A0A;
                    C26159CtX.A01(cy2);
                    cy2.A00();
                    long j4 = bufferInfo2.presentationTimeUs;
                    C26159CtX.A01(dhv.A02);
                    C24802CKv cKv = dhv.A02;
                    if (j4 >= 1500000 && !cKv.A00) {
                        DHV.A00(dhv);
                    }
                }
                j2 = j3;
            }
            dhv.A04 = null;
        }
        C25265Cc6 cc62 = dhv.A05;
        C26159CtX.A01(cc62);
        DH2 A01 = cc62.A01(j);
        if (A01 != null && A01.A02 >= 0) {
            dhv.A04 = A01;
            dhv.A00 = A01.A00.presentationTimeUs;
        }
        return j2;
    }

    public DH2 BIR(long j) {
        C25265Cc6 cc6 = this.A00.A05;
        C26159CtX.A01(cc6);
        return cc6.A00(j);
    }

    public long BQJ() {
        return this.A00.A00;
    }

    public String BQK() {
        C25265Cc6 cc6 = this.A00.A05;
        C26159CtX.A01(cc6);
        return cc6.A01;
    }

    public String BQM() {
        C25265Cc6 cc6 = this.A00.A05;
        C26159CtX.A01(cc6);
        try {
            return cc6.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public boolean Bgl() {
        return this.A00.A09;
    }

    public void CCN(MediaFormat mediaFormat, CZT czt, List list, int i, boolean z) {
        C25265Cc6 A06;
        DHV dhv = this.A00;
        C26159CtX.A01(dhv.A07);
        List list2 = list;
        MediaFormat mediaFormat2 = mediaFormat;
        CZT czt2 = czt;
        if (list.isEmpty()) {
            String string = mediaFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            A06 = C26259Cw4.A01(mediaFormat, dhv.A07.A04, czt, string);
        } else {
            A06 = dhv.A0A.A06(mediaFormat2, dhv.A07.A04, czt2, list2, false);
        }
        dhv.A05 = A06;
        A06.A02();
    }

    public void CDC(DH2 dh2) {
        C25265Cc6 cc6 = this.A00.A05;
        C26159CtX.A01(cc6);
        cc6.A03(dh2);
    }

    public boolean CMT() {
        return this.A00.A08;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cjg, java.lang.Object] */
    public void finish() {
        ? obj = new Object();
        BVu.A00(obj, this.A00.A05, 9);
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }
}
