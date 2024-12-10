package X;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Pair;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.HashMap;
import java.util.Iterator;

public class DHS implements EAb {
    public C25752ClM A00;
    public EAR A01;
    public C25265Cc6 A02;
    public final /* synthetic */ DHT A03;

    public void CCO(Context context, C25092CXd cXd, C25752ClM clM, CZT czt) {
        int i;
        boolean z;
        String str;
        C18030ve r1;
        HashMap A06;
        C24354Bzp bzp = C24354Bzp.CODEC_VIDEO_H264;
        C25752ClM clM2 = clM;
        C25185Cab cab = clM2.A0E;
        if (cab != null) {
            bzp = cab.A02;
        }
        int i2 = clM2.A0A;
        if (i2 <= 0 || (i = clM2.A08) <= 0) {
            Object[] objArr = new Object[2];
            C17880vN.A1T(objArr, i2, 0);
            C17880vN.A1T(objArr, clM2.A08, 1);
            throw new BW2(String.format("Invalid dimensions: width=%d, height=%d", objArr));
        }
        boolean z2 = false;
        int i3 = 1;
        int i4 = 256;
        int i5 = -1;
        int A002 = clM2.A00();
        int i6 = clM2.A02;
        int i7 = clM2.A01;
        C25185Cab cab2 = clM2.A0E;
        if (cab2 != null) {
            i3 = cab2.A01;
            i4 = cab2.A00;
            z2 = true;
        }
        DHT dht = this.A03;
        C26052CrM crM = dht.A01;
        CZT czt2 = czt;
        boolean A022 = czt2.A02();
        if (!(crM == null || (A06 = crM.A06(C24322BzJ.VIDEO)) == null)) {
            Iterator A0j = C17890vO.A0j(A06);
            while (A0j.hasNext()) {
                Iterator A0y = AnonymousClass8BV.A0y(((C25833Cmm) A0j.next()).A04);
                while (A0y.hasNext()) {
                    ((C25271CcJ) A0y.next()).A02(A022);
                }
            }
        }
        int i8 = clM2.A0B;
        if (i8 != -1) {
            i5 = i8;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(bzp.value, i2, i);
        createVideoFormat.setInteger("color-format", 2130708361);
        if (A002 > 0) {
            createVideoFormat.setInteger("bitrate", A002);
        }
        if (i7 > 0) {
            createVideoFormat.setInteger("frame-rate", i7);
        }
        if (i6 > -1) {
            createVideoFormat.setInteger("i-frame-interval", i6);
        }
        if (z2) {
            createVideoFormat.setInteger("profile", i3);
            createVideoFormat.setInteger("level", i4);
        }
        if (i5 != -1) {
            createVideoFormat.setInteger("bitrate-mode", i5);
        }
        if (!(czt2 instanceof BWB) || (r1 = ((BWB) czt2).A00) == null) {
            z = false;
        } else {
            r1.A0J(10157);
            z = true;
        }
        Pair A003 = czt2.A00();
        int A012 = C108965cb.A01(A003);
        int A004 = C108965cb.A00(A003);
        if (z && A012 > 0 && A004 > 0) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                createVideoFormat.setInteger("video-qp-i-max", A012);
                str = "video-qp-p-max";
            } else if (i9 >= 23) {
                createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.I-maxQP", A012);
                createVideoFormat.setInteger("vendor-sec-ext-enc-qp-range.P-maxQP", A004);
                createVideoFormat.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", A012);
                str = "vendor.qti-ext-enc-qp-range.qp-p-max";
            }
            createVideoFormat.setInteger(str, A004);
        }
        C25265Cc6 A023 = C26259Cw4.A02(createVideoFormat, C24251By9.SURFACE, czt2, bzp.value, clM2.A0G);
        this.A02 = A023;
        A023.A02();
        CVl cVl = dht.A00;
        C25265Cc6 cc6 = this.A02;
        C26171Ctn.A03(AnonymousClass000.A1Z(cc6.A06, AnonymousClass00R.A01), (String) null);
        Surface surface = cc6.A05;
        C199610h.A04(surface);
        this.A01 = cVl.A00(context, surface, cXd, clM2, crM, dht.A03, (CTK) null, czt2);
        this.A00 = clM2;
    }

    public DHS(DHT dht) {
        this.A03 = dht;
    }

    public void BB9(MediaEffect mediaEffect) {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.BB8(mediaEffect);
    }

    public void BBq(int i) {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.BBq(i);
    }

    public void BJ1(long j) {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.BJ1(j * 1000);
    }

    public String BRF() {
        C25265Cc6 cc6 = this.A02;
        C26159CtX.A01(cc6);
        try {
            return cc6.A04.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public MediaFormat BVu() {
        C25265Cc6 cc6 = this.A02;
        C26159CtX.A01(cc6);
        MediaFormat mediaFormat = cc6.A00;
        C199610h.A04(mediaFormat);
        return mediaFormat;
    }

    public int BVy() {
        C25752ClM clM = this.A00;
        C26159CtX.A01(clM);
        return (clM.A09 + clM.A04) % 360;
    }

    public void CEJ(DH2 dh2) {
        C25265Cc6 cc6 = this.A02;
        C26159CtX.A01(cc6);
        cc6.A07.append("releaseOutputBuffer,");
        cc6.A04(dh2, cc6.A09);
    }

    public void CEg(MediaEffect mediaEffect) {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.CEf(mediaEffect);
    }

    public void CF5() {
        C26159CtX.A01(this.A01);
    }

    public void CFD(long j) {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.BJS(j * 1000);
    }

    public void CNL() {
        C25265Cc6 cc6 = this.A02;
        C26159CtX.A01(cc6);
        C26171Ctn.A03(AnonymousClass000.A1Z(cc6.A06, AnonymousClass00R.A01), (String) null);
        cc6.A04.signalEndOfInputStream();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cjg, java.lang.Object] */
    public void finish() {
        ? obj = new Object();
        BVu.A00(obj, this.A02, 9);
        EAR ear = this.A01;
        if (ear != null) {
            ear.release();
        }
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }

    public void flush() {
        EAR ear = this.A01;
        C26159CtX.A01(ear);
        ear.flush();
    }

    public DH2 BIS() {
        try {
            C25265Cc6 cc6 = this.A02;
            C26159CtX.A01(cc6);
            return cc6.A01(250000);
        } catch (Throwable th) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("mMediaTranscodeParams.mDebugStats: ");
            C25752ClM clM = this.A00;
            C26159CtX.A01(clM);
            throw new IllegalStateException(AnonymousClass000.A0y(clM.A0G, A10), th);
        }
    }
}
