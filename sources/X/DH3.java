package X;

import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;

public class DH3 implements C28609EAd {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public long A03;
    public long A04 = -1;
    public E7q A05;
    public A5W A06;
    public C24322BzJ A07 = null;
    public C26052CrM A08;
    public C25833Cmm A09;
    public DH5 A0A;
    public C28609EAd A0B;
    public CAM A0C;
    public long A0D = -1;
    public boolean A0E;
    public final CZT A0F;

    private void A00() {
        CAF.A00("MediaCompositionDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0E) {
            this.A03 = 0;
            try {
                C26171Ctn.A03(AnonymousClass000.A1W(this.A07), "No tracks selected");
                int i = this.A02;
                if (i != -1) {
                    this.A00 = i;
                }
                if (A02()) {
                    this.A0E = true;
                    return;
                }
                throw new BW0();
            } catch (BW0 | IllegalArgumentException e) {
                CAF.A00("MediaCompositionDemuxer", "checkAndInitialize Exception=%s", e);
                throw new BW3("Cannot checkAndInitialize", e);
            }
        }
    }

    private boolean A02() {
        this.A01 = -1;
        if (this.A02 == -1) {
            this.A00++;
        }
        C26159CtX.A01(this.A07);
        C26052CrM crM = this.A08;
        C26159CtX.A01(crM);
        C25833Cmm A032 = crM.A03(this.A07, this.A00);
        this.A09 = A032;
        if (A032 == null) {
            return false;
        }
        if (A03()) {
            return true;
        }
        throw new BW3("No segments are provided in one of the tracks");
    }

    public void CHF(C24322BzJ bzJ, int i) {
        int i2 = i;
        if (i == -1) {
            i2 = 0;
        }
        C26052CrM crM = this.A08;
        C26159CtX.A01(crM);
        if (crM.A03(bzJ, i2) != null) {
            this.A07 = bzJ;
            this.A02 = i;
            A00();
        }
    }

    public void CIf(File file) {
        C26171Ctn.A03(AnonymousClass000.A1W(file), (String) null);
        try {
            C25271CcJ A002 = new CXD(file).A00();
            C26010CqR cqR = new C26010CqR(C24322BzJ.VIDEO);
            cqR.A04.add(A002);
            C25833Cmm cmm = new C25833Cmm(cqR);
            C25092CXd A0I = BE7.A0I(this.A05, file);
            C25186Cac cac = new C25186Cac();
            cac.A02(cmm);
            if (A0I.A0K) {
                C25833Cmm.A00(cac, new C26010CqR(C24322BzJ.AUDIO), A002);
            }
            this.A08 = new C26052CrM(cac);
        } catch (IOException e) {
            CAF.A00("MediaCompositionDemuxer", "setDataSource: create media composition from file failed %s", e);
            throw new BW3("create media composition from file failed", e);
        }
    }

    public synchronized void release() {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = this.A0B;
        CAF.A00("MediaCompositionDemuxer", "release mAndroidMediaDemuxer=%s", A1a);
        C28609EAd eAd = this.A0B;
        if (eAd != null) {
            eAd.release();
            this.A0B = null;
        }
    }

    public static void A01(DH3 dh3, StringBuilder sb) {
        sb.append(" mCurrentSegmentIndex: ");
        sb.append(dh3.A01);
        sb.append(" mSelectedTrackIndex: ");
        sb.append(dh3.A02);
        sb.append(" mSelectedTrackType: ");
        sb.append(dh3.A07);
        sb.append(" mCurrentMediaTrack: ");
        sb.append(dh3.A09);
        sb.append(" mCurrentMediaTrackIndex: ");
    }

    private boolean A03() {
        C25271CcJ ccJ;
        C26171Ctn.A03(AnonymousClass000.A1W(this.A09), "Cannot move to next Segment without a valid Track");
        C28609EAd eAd = this.A0B;
        if (eAd != null) {
            this.A03 += eAd.BR1();
            release();
        }
        this.A01++;
        C25833Cmm cmm = this.A09;
        C26159CtX.A01(cmm);
        C26052CrM crM = this.A08;
        C26159CtX.A01(crM);
        List A072 = crM.A07(cmm.A01, this.A00);
        if (A072 == null || this.A01 == A072.size()) {
            return false;
        }
        C25833Cmm cmm2 = this.A09;
        C26171Ctn.A03(AnonymousClass000.A1W(cmm2), "Not a valid Track");
        C26159CtX.A01(cmm2);
        C25833Cmm cmm3 = this.A09;
        C26171Ctn.A03(AnonymousClass000.A1W(cmm3), "No track is selected");
        C26159CtX.A01(cmm3);
        C26052CrM crM2 = this.A08;
        C26159CtX.A01(crM2);
        List A073 = crM2.A07(cmm3.A01, this.A00);
        if (A073 == null) {
            ccJ = null;
        } else {
            ccJ = (C25271CcJ) A073.get(this.A01);
        }
        C26159CtX.A01(ccJ);
        C28609EAd BGD = this.A0A.BGD(this.A05, this.A0C, this.A0F);
        URL url = ccJ.A06;
        if (url != null) {
            ((DH4) BGD).A0A = url;
        } else {
            File file = ccJ.A05;
            C26159CtX.A01(file);
            BGD.CIf(file);
        }
        A5W a5w = this.A06;
        if (a5w == null) {
            a5w = ccJ.A03;
        }
        BGD.CLG(a5w);
        this.A0B = BGD;
        if (BGD.BfV(this.A09.A01)) {
            this.A0B.CHF(this.A09.A01, this.A00);
            this.A04 = this.A0B.BXx();
            return true;
        }
        CAF.A00("MediaCompositionDemuxer", "initAndSetupMediaExtractor: MediaDemuxerException", new Object[0]);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Track not available in the provided source file.\n Track Type: ");
        A10.append(this.A09.A01);
        A10.append(" \nMedia Demuxer Stats : ");
        throw new BW3(C17890vO.A0V(BUZ(), A10));
    }

    public boolean BBv() {
        if (AnonymousClass000.A1W(this.A09)) {
            C28609EAd eAd = this.A0B;
            C26159CtX.A01(eAd);
            if (!eAd.BBv()) {
                if (A03()) {
                    this.A03++;
                } else if (this.A02 == -1 && A02()) {
                    return true;
                } else {
                    this.A09 = null;
                    this.A00 = -1;
                }
            }
            return true;
        }
        return false;
    }

    public C25225CbM BUZ() {
        C28609EAd eAd = this.A0B;
        if (eAd != null) {
            return eAd.BUZ();
        }
        return new C25225CbM();
    }

    public long BXx() {
        return this.A04;
    }

    public int BYU() {
        if (this.A09 == null) {
            return -1;
        }
        C28609EAd eAd = this.A0B;
        C26159CtX.A01(eAd);
        return eAd.BYU();
    }

    public MediaFormat BYV() {
        if (this.A09 == null) {
            return null;
        }
        C28609EAd eAd = this.A0B;
        C26159CtX.A01(eAd);
        return eAd.BYV();
    }

    public long BYW() {
        if (this.A09 == null) {
            return -1;
        }
        try {
            C28609EAd eAd = this.A0B;
            C26159CtX.A01(eAd);
            long BYW = eAd.BYW();
            if (BYW >= 0) {
                return BYW + this.A03;
            }
            return BYW;
        } catch (NullPointerException e) {
            Object[] A1b = AnonymousClass000.A1b(e, 6);
            AnonymousClass000.A1M(A1b, this.A01);
            AnonymousClass3Ma.A1S(A1b, this.A02);
            A1b[3] = this.A07;
            A1b[4] = this.A09;
            AnonymousClass3Ma.A1U(A1b, this.A00);
            CAF.A00("MediaCompositionDemuxer", "getSampleTime Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", A1b);
            StringBuilder A0f = C17890vO.A0f(e);
            A01(this, A0f);
            throw AnonymousClass000.A0s(C17880vN.A0t(A0f, this.A00));
        }
    }

    public boolean BfV(C24322BzJ bzJ) {
        C26052CrM crM = this.A08;
        C26159CtX.A01(crM);
        int i = this.A02;
        if (i == -1) {
            HashMap A062 = crM.A06(bzJ);
            C26159CtX.A01(A062);
            return !A062.isEmpty();
        } else if (crM.A03(bzJ, i) == null) {
            return false;
        } else {
            return true;
        }
    }

    public int CDT(ByteBuffer byteBuffer) {
        if (this.A09 == null) {
            return -1;
        }
        try {
            C28609EAd eAd = this.A0B;
            C26159CtX.A01(eAd);
            return eAd.CDT(byteBuffer);
        } catch (NullPointerException e) {
            Object[] A1b = AnonymousClass000.A1b(e, 6);
            AnonymousClass000.A1M(A1b, this.A01);
            AnonymousClass3Ma.A1S(A1b, this.A02);
            A1b[3] = this.A07;
            A1b[4] = this.A09;
            AnonymousClass3Ma.A1U(A1b, this.A00);
            CAF.A00("MediaCompositionDemuxer", "readSampleData Exception=%s, mCurrentSegmentIndex=%s, mSelectedTrackIndex=%s, mSelectedTrackType=%s, mCurrentMediaTrack=%s, mCurrentMediaTrackIndex=%s", A1b);
            StringBuilder A0f = C17890vO.A0f(e);
            A01(this, A0f);
            throw AnonymousClass000.A0s(C17880vN.A0t(A0f, this.A00));
        }
    }

    public void CHA(long j) {
        if (this.A09 == null) {
            this.A01 = -1;
            this.A0E = false;
            A00();
        }
        C28609EAd eAd = this.A0B;
        if (eAd != null) {
            eAd.CHA(j);
        }
    }

    public void CLG(A5W a5w) {
        throw AnonymousClass000.A0k("Not supported");
    }

    public void CRX(A5W a5w) {
        this.A06 = a5w;
        C28609EAd eAd = this.A0B;
        if (eAd != null) {
            eAd.CLG(a5w);
            eAd.CRX(a5w);
        }
    }

    public DH3(E7q e7q, DH5 dh5, CAM cam, CZT czt) {
        this.A05 = e7q;
        this.A0A = dh5;
        this.A0C = cam;
        this.A0F = czt;
    }

    public long BR1() {
        A00();
        long j = this.A0D;
        if (j != -1) {
            return j;
        }
        try {
            C26052CrM crM = this.A08;
            C26159CtX.A01(crM);
            C24322BzJ bzJ = this.A07;
            C26159CtX.A01(bzJ);
            long A002 = C26162Ctb.A00(this.A05, bzJ, crM, this.A0F.A02());
            this.A0D = A002;
            return A002;
        } catch (IOException e) {
            CAF.A00("MediaCompositionDemuxer", "getDurationUs IOException=%s", AnonymousClass8BV.A1b(e));
            throw new BW3("Cannot calculate duration");
        }
    }

    public C25092CXd BUc() {
        A00();
        C28609EAd eAd = this.A0B;
        C26159CtX.A01(eAd);
        return eAd.BUc();
    }

    public void CIe(C26052CrM crM) {
        this.A08 = crM;
    }
}
