package X;

import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class DH4 implements C28609EAd {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public C25225CbM A04;
    public E7q A05;
    public A5W A06;
    public C53 A07;
    public CAM A08;
    public CZT A09;
    public URL A0A;
    public HashMap A0B;
    public long A0C;
    public long A0D;
    public C25092CXd A0E;
    public File A0F;
    public boolean A0G;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.C53, java.lang.Object] */
    private void A02() {
        String obj;
        C24919CPq cPq;
        C24919CPq cPq2;
        Throwable th;
        CAF.A00("BaseMediaDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0G) {
            try {
                File file = this.A0F;
                if ((file == null || !file.exists()) && this.A0A == null) {
                    throw new FileNotFoundException();
                }
                A03();
                MediaExtractor mediaExtractor = new MediaExtractor();
                ? obj2 = new Object();
                obj2.A00 = mediaExtractor;
                this.A07 = obj2;
                URL url = this.A0A;
                if (url != null) {
                    obj2.A00.setDataSource(url.toString());
                } else {
                    File file2 = this.A0F;
                    C26159CtX.A01(file2);
                    obj2.A00.setDataSource(file2.getAbsolutePath());
                }
                ArrayList A13 = AnonymousClass000.A13();
                C24919CPq cPq3 = null;
                try {
                    C26159CtX.A01(this.A07);
                    if (this.A09 instanceof BWB) {
                        ArrayList A022 = C25873Cnh.A02(this.A07, "audio/");
                        if (!A022.isEmpty()) {
                            Iterator it = A022.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    cPq = (C24919CPq) A022.get(0);
                                    break;
                                }
                                cPq = (C24919CPq) it.next();
                                if (new MediaCodecList(1).findDecoderForFormat(cPq.A01) != null) {
                                    break;
                                }
                            }
                        } else {
                            cPq = null;
                        }
                    } else {
                        cPq = C25873Cnh.A00(this.A07);
                    }
                } catch (BW1 e) {
                    C108955ca.A1U(e, A13);
                    cPq = null;
                }
                try {
                    if (this.A09 instanceof BWB) {
                        C53 c53 = this.A07;
                        ArrayList A023 = C25873Cnh.A02(c53, "video/");
                        if (!A023.isEmpty()) {
                            Iterator it2 = A023.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    cPq2 = (C24919CPq) A023.get(0);
                                    break;
                                }
                                cPq2 = (C24919CPq) it2.next();
                                if (new MediaCodecList(1).findDecoderForFormat(cPq2.A01) != null) {
                                    break;
                                }
                            }
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("No video track exception. Track Info List: ");
                            throw new BW4(AnonymousClass000.A0y(C25873Cnh.A01(C25873Cnh.A02(c53, "")), A10));
                        }
                    } else {
                        C53 c532 = this.A07;
                        ArrayList A024 = C25873Cnh.A02(c532, "video/");
                        if (!A024.isEmpty()) {
                            Iterator it3 = A024.iterator();
                            while (it3.hasNext()) {
                                cPq2 = (C24919CPq) it3.next();
                                if (C26259Cw4.A05(cPq2.A02)) {
                                    if (A024.size() > 1) {
                                        C25873Cnh.A01(A024);
                                    }
                                }
                            }
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("Unsupported video codec. Contained ");
                            th = new BW1(AnonymousClass000.A0y(C25873Cnh.A01(A024), A102));
                        } else {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("No video track exception. Track Info List: ");
                            th = new BW4(AnonymousClass000.A0y(C25873Cnh.A01(C25873Cnh.A02(c532, "")), A103));
                        }
                        throw th;
                    }
                    cPq3 = cPq2;
                } catch (BW1 | BW4 e2) {
                    C108955ca.A1U(e2, A13);
                }
                if (cPq != null) {
                    HashMap hashMap = this.A0B;
                    C26159CtX.A01(hashMap);
                    C17890vO.A0z(C24322BzJ.AUDIO, hashMap, cPq.A00);
                }
                if (cPq3 != null) {
                    HashMap hashMap2 = this.A0B;
                    C26159CtX.A01(hashMap2);
                    C17890vO.A0z(C24322BzJ.VIDEO, hashMap2, cPq3.A00);
                }
                C25225CbM cbM = this.A04;
                cbM.A04 = A13.toString();
                HashMap hashMap3 = this.A0B;
                C26159CtX.A01(hashMap3);
                cbM.A05 = hashMap3.toString();
                this.A0G = true;
            } catch (IOException e3) {
                CAF.A00("BaseMediaDemuxer", "checkAndInitialize MediaDemuxerException=%s", e3);
                StringBuilder A104 = AnonymousClass000.A10();
                A104.append("Failed to initialize. path = ");
                URL url2 = this.A0A;
                if (url2 == null) {
                    File file3 = this.A0F;
                    if (file3 != null) {
                        obj = file3.getAbsolutePath();
                    } else {
                        obj = "";
                    }
                } else {
                    obj = url2.toString();
                }
                throw new BW3(AnonymousClass000.A0y(obj, A104), e3);
            }
        }
    }

    public boolean BBv() {
        C53 c53 = this.A07;
        if (c53 == null || !c53.A00.advance()) {
            return false;
        }
        A5W a5w = this.A06;
        long sampleTime = this.A07.A00.getSampleTime();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (sampleTime != -1) {
            long A022 = a5w.A02(timeUnit);
            if (A022 < 0 || sampleTime <= A022) {
                return true;
            }
        }
        this.A00++;
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r7 = this;
            X.C53 r0 = r7.A07
            X.C26159CtX.A01(r0)
            X.C53 r6 = r7.A07
            long r4 = r7.A0D
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x0011
            r1 = 2
        L_0x0011:
            android.media.MediaExtractor r0 = r6.A00
            r0.seekTo(r4, r1)
            X.C53 r0 = r7.A07
            android.media.MediaExtractor r0 = r0.A00
            long r0 = r0.getSampleTime()
            boolean r0 = r7.A04(r0)
            if (r0 == 0) goto L_0x0027
            r7.A03 = r2
        L_0x0026:
            return
        L_0x0027:
            X.C53 r0 = r7.A07
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.A5W r0 = r7.A06
            boolean r0 = r0.A05(r2, r1)
            if (r0 == 0) goto L_0x0056
            X.C53 r0 = r7.A07
            android.media.MediaExtractor r0 = r0.A00
            long r2 = r0.getSampleTime()
            long r0 = r7.A0D
            long r2 = r2 - r0
            long r0 = r7.A03
            long r0 = java.lang.Math.min(r2, r0)
            r7.A03 = r0
            X.C53 r0 = r7.A07
            android.media.MediaExtractor r0 = r0.A00
            long r0 = r0.getSampleTime()
            r7.A02 = r0
        L_0x0056:
            long r3 = r7.A03
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            boolean r0 = r7.BBv()
            if (r0 != 0) goto L_0x0027
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DH4.A01():void");
    }

    private void A03() {
        this.A0D = this.A06.A03(TimeUnit.MICROSECONDS);
        long A022 = this.A06.A02(TimeUnit.MICROSECONDS);
        this.A0C = A022;
        long j = this.A0D;
        if (j < 0) {
            j = 0;
        }
        this.A0D = j;
        if (A022 <= 0) {
            A022 = TimeUnit.MILLISECONDS.toMicros(BUc().A07);
            this.A0C = A022;
        }
        long j2 = this.A0D;
        if (A022 <= j2) {
            Object[] A1b = AnonymousClass3MW.A1b();
            BE8.A1N(A1b, A022);
            C17890vO.A1M(A1b, j2);
            CAF.A00("BaseMediaDemuxer", "setStartAndEndTime: MediaDemuxerException mEndTimeUs=%s, mStartTimeUs=%s", A1b);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("End time is lesser than the start time. StartTimeUs : ");
            A10.append(this.A0D);
            A10.append(", EndTimeUs = ");
            throw new BW3(C17880vN.A0u(A10, this.A0C));
        }
    }

    private boolean A04(long j) {
        if (!(this.A09 instanceof BWA) || j != this.A01 || this.A06.A02(TimeUnit.MICROSECONDS) > this.A01) {
            return false;
        }
        return true;
    }

    public C25225CbM BUZ() {
        return this.A04;
    }

    public C25092CXd BUc() {
        C25092CXd cXd = this.A0E;
        if (cXd == null) {
            try {
                URL url = this.A0A;
                if (url != null) {
                    cXd = this.A05.BKw(url);
                    this.A0E = cXd;
                } else {
                    E7q e7q = this.A05;
                    File file = this.A0F;
                    C26159CtX.A01(file);
                    cXd = BE7.A0I(e7q, file);
                    this.A0E = cXd;
                }
                if (cXd == null) {
                    CAF.A00("BaseMediaDemuxer", "getMediaMetadata: Media metadata is null", new Object[0]);
                    throw new BW3("Media metadata is null");
                }
            } catch (IOException e) {
                CAF.A00("BaseMediaDemuxer", "getMediaMetadata: IOException=%s", BE7.A1b(e));
                throw new BW3("Cannot extract metadata", e);
            }
        }
        return cXd;
    }

    public long BXx() {
        return this.A02;
    }

    public int BYU() {
        C53 c53 = this.A07;
        if (c53 != null) {
            return c53.A00.getSampleFlags();
        }
        return -1;
    }

    public MediaFormat BYV() {
        C53 c53 = this.A07;
        if (c53 == null) {
            return null;
        }
        try {
            return c53.A00.getTrackFormat(c53.A00.getSampleTrackIndex());
        } catch (Exception e) {
            CAF.A00("BaseMediaDemuxer", "getSampleMediaFormat: IllegalStateException=%s, getTrackInfos=%s", e, A00(this.A07).toString());
            throw new IllegalStateException(String.format(Locale.ROOT, "getSampleMediaFormat failed: %s, MediaDemuxerStats: %s", new Object[]{A00(this.A07), this.A04}), e);
        }
    }

    public long BYW() {
        C53 c53 = this.A07;
        if (c53 == null) {
            return -1;
        }
        long sampleTime = c53.A00.getSampleTime();
        if (A04(sampleTime)) {
            return 0;
        }
        if (this.A06.A05(sampleTime, TimeUnit.MICROSECONDS)) {
            return (sampleTime - this.A0D) - this.A03;
        }
        if (sampleTime >= 0) {
            return -2;
        }
        return sampleTime;
    }

    public int CDT(ByteBuffer byteBuffer) {
        C53 c53 = this.A07;
        if (c53 == null) {
            return -1;
        }
        long sampleTime = c53.A00.getSampleTime();
        A5W a5w = this.A06;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        boolean z = false;
        if (sampleTime != -1) {
            long A022 = a5w.A02(timeUnit);
            if (A022 < 0 || sampleTime <= A022) {
                z = true;
            }
        }
        if (z || A04(sampleTime)) {
            if (this.A06.A05(sampleTime, timeUnit) || A04(sampleTime)) {
                C25225CbM cbM = this.A04;
                if (cbM.A03 == -1) {
                    cbM.A03 = sampleTime;
                }
                cbM.A00 = sampleTime;
            } else if (sampleTime < this.A06.A03(timeUnit)) {
                this.A04.A02 = sampleTime;
            }
            return this.A07.A00.readSampleData(byteBuffer, 0);
        }
        C25225CbM cbM2 = this.A04;
        if (cbM2.A01 != -1) {
            return -1;
        }
        cbM2.A01 = sampleTime;
        return -1;
    }

    public void CHA(long j) {
        long j2 = j + this.A0D + this.A03;
        if (this.A07 != null) {
            if (this.A06.A05(j2, TimeUnit.MICROSECONDS)) {
                C53 c53 = this.A07;
                int i = 0;
                if (j2 == 0) {
                    i = 2;
                }
                c53.A00.seekTo(j2, i);
            }
        }
    }

    public void CIe(C26052CrM crM) {
        C25833Cmm A032 = crM.A03(C24322BzJ.AUDIO, 0);
        C26171Ctn.A03(AnonymousClass000.A1W(A032), "get null audio track when setting data source from MediaComposition");
        C26159CtX.A01(A032);
        List list = A032.A04;
        this.A0F = BE9.A0Q(list).A05;
        this.A0A = BE9.A0Q(list).A06;
        this.A06 = BE9.A0Q(list).A03;
    }

    public void CRX(A5W a5w) {
        this.A06 = a5w;
        A03();
        this.A03 = Long.MAX_VALUE;
        A01();
    }

    public static JSONObject A00(C53 c53) {
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("sample-track-index", c53.A00.getSampleTrackIndex());
            A15.put("track-count", c53.A00.getTrackCount());
            for (int i = 0; i < c53.A00.getTrackCount(); i++) {
                MediaFormat trackFormat = c53.A00.getTrackFormat(i);
                Locale locale = Locale.ROOT;
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, i, 0);
                A15.put(String.format(locale, "track-%d", A1a), trackFormat.toString());
            }
        } catch (Exception unused) {
        }
        return A15;
    }

    public long BR1() {
        A02();
        return this.A0C - this.A0D;
    }

    public boolean BfV(C24322BzJ bzJ) {
        A02();
        HashMap hashMap = this.A0B;
        C26159CtX.A01(hashMap);
        return hashMap.containsKey(bzJ);
    }

    public void CHF(C24322BzJ bzJ, int i) {
        A02();
        HashMap hashMap = this.A0B;
        C26159CtX.A01(hashMap);
        if (hashMap.containsKey(bzJ)) {
            int A0D2 = BE9.A0D(bzJ, hashMap);
            C26159CtX.A01(this.A07);
            this.A07.A00.selectTrack(A0D2);
            if (this.A09 instanceof BWA) {
                this.A01 = this.A07.A00.getSampleTime();
            }
            A01();
            this.A00 = 0;
            C53 c53 = this.A07;
            long j = this.A0D;
            int i2 = 0;
            if (j == 0) {
                i2 = 2;
            }
            c53.A00.seekTo(j, i2);
        }
    }

    public void CIf(File file) {
        C26171Ctn.A03(AnonymousClass000.A1W(file), (String) null);
        this.A0F = file;
    }

    public void release() {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = this.A07;
        CAF.A00("BaseMediaDemuxer", "release: mMediaExtractor=%s", A1a);
        C53 c53 = this.A07;
        if (c53 != null) {
            c53.A00.release();
            this.A07 = null;
        }
    }

    public void CLG(A5W a5w) {
        this.A06 = a5w;
    }
}
