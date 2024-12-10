package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public class DHA implements EAM {
    public int A00;
    public long A01;
    public MediaFormat A02;
    public MediaFormat A03;
    public Map A04;
    public boolean A05;
    public int A06;
    public long A07;
    public long A08;
    public C24174Bwk A09;
    public C25820CmX A0A;
    public C24322BzJ A0B;
    public EAM A0C;
    public C28564E7r A0D;
    public CL1 A0E = new CL1();
    public CZT A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final E54 A0M;
    public final CNi A0N;
    public final String A0O;
    public final String A0P;

    public static Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass00R.A00(3)) {
            switch (num.intValue()) {
                case 1:
                    str2 = "Merlot";
                    break;
                case 2:
                    str2 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
                    break;
                default:
                    str2 = "Facebook View";
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass00R.A0C;
    }

    public void BFZ(String str) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void stop() {
        try {
            A03(this, false);
            long j = this.A0L;
            long j2 = j;
            long j3 = this.A01;
            if (j3 != -1) {
                j = j3;
            }
            long j4 = this.A07;
            if (j4 != -1) {
                j = Math.min(j, j4);
            }
            A02(this.A0C, j2 - j, true);
        } finally {
            this.A05 = false;
        }
    }

    private void A01(long j) {
        String path;
        if (this.A0G || (path = this.A0O) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A0P);
            A10.append("segmentingMuxer_");
            A10.append(this.A06);
            A10.append("_");
            A10.append(System.currentTimeMillis());
            A10.append("_");
            A10.append(this.A0B.name());
            File BHu = this.A0M.BHu(A10.toString());
            C26159CtX.A01(BHu);
            path = BHu.getPath();
        }
        boolean z = this.A0I;
        this.A09 = new C24174Bwk(path, z);
        boolean z2 = this.A0H;
        Map map = this.A04;
        Map map2 = null;
        boolean A1O = AnonymousClass000.A1O(z2 ? 1 : 0);
        if (map != null) {
            map2 = map;
        }
        EAM BHa = this.A0D.BHa(new C24864CNh(map2, A1O));
        this.A0C = BHa;
        if (z) {
            DH9 dh9 = new DH9(this.A09, BHa);
            this.A0C = dh9;
            BHa = dh9;
        }
        BHa.BFZ(this.A09.getPath());
        MediaFormat mediaFormat = this.A02;
        if (mediaFormat != null) {
            this.A0C.CHz(mediaFormat);
            this.A07 = j;
        }
        MediaFormat mediaFormat2 = this.A03;
        if (mediaFormat2 != null) {
            this.A0C.CLL(mediaFormat2);
            this.A0C.CJl(this.A00);
            this.A01 = j;
        }
        this.A0C.start();
        this.A06++;
        this.A08 = 0;
    }

    private void A02(EAM eam, long j, boolean z) {
        if (eam != null) {
            CNi cNi = this.A0N;
            C24174Bwk bwk = this.A09;
            C26159CtX.A01(bwk);
            C24322BzJ bzJ = this.A0B;
            MediaFormat mediaFormat = this.A03;
            C25242Cbd cbd = cNi.A01;
            boolean z2 = z;
            cbd.A03 = z2;
            CUT cut = cbd.A0F;
            if (cut.A05 != null) {
                C25092CXd cXd = cNi.A00;
                long j2 = cXd.A08;
                long length = bwk.length();
                int i = cXd.A05;
                int i2 = cXd.A03;
                long j3 = cXd.A06;
                C25752ClM clM = cut.A04;
                C25820CmX cmX = cbd.A0B;
                C25225CbM cbM = null;
                if (bzJ == C24322BzJ.AUDIO) {
                    C28609EAd eAd = cbd.A0D;
                    if (eAd != null) {
                        cbM = eAd.BUZ();
                    }
                } else {
                    EAT eat = cbd.A0H;
                    if (eat != null) {
                        cbM = eat.BUZ();
                    }
                }
                cbd.A0I.add(new C25241Cbc(mediaFormat, cbM, cmX, clM, bzJ, bwk, i, i2, j2, length, j3, j, z2));
            }
        }
    }

    public static void A03(DHA dha, boolean z) {
        EAM eam = dha.A0C;
        C24174Bwk bwk = dha.A09;
        if (eam != null && eam.BgY()) {
            try {
                eam.stop();
                if (z && bwk != null) {
                    bwk.delete();
                }
            } catch (RuntimeException e) {
                if (bwk != null && bwk.exists()) {
                    bwk.A00();
                }
                throw BE6.A0o("Cannot stop the muxer", e);
            }
        }
    }

    public String BV9() {
        EAM eam = this.A0C;
        if (eam != null) {
            return eam.BV9();
        }
        return null;
    }

    public boolean BgY() {
        return this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A03 != null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r3 = this;
            android.media.MediaFormat r0 = r3.A02
            r2 = 1
            if (r0 != 0) goto L_0x000a
            android.media.MediaFormat r0 = r3.A03
            r1 = 0
            if (r0 == 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r0 = 0
            X.C26171Ctn.A03(r1, r0)
            r0 = -1
            r3.A01(r0)
            r3.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHA.start():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DHA(X.C25092CXd r8, X.C25820CmX r9, X.E54 r10, X.C24322BzJ r11, X.C28564E7r r12, X.CNi r13, X.CZT r14, java.lang.String r15, java.lang.String r16, long r17, long r19, long r21, boolean r23, boolean r24) {
        /*
            r7 = this;
            r7.<init>()
            r7.A0N = r13
            r7.A0M = r10
            r7.A0D = r12
            r2 = r17
            r7.A0L = r2
            r0 = r19
            r7.A0K = r0
            r4 = r21
            r7.A0J = r4
            r7.A0B = r11
            r6 = r23
            r7.A0I = r6
            r5 = r24
            r7.A0H = r5
            r7.A0A = r9
            r4 = r16
            r7.A0P = r4
            X.CL1 r4 = new X.CL1
            r4.<init>()
            r7.A0E = r4
            r7.A0F = r14
            if (r23 == 0) goto L_0x0039
            if (r24 != 0) goto L_0x0039
            java.lang.String r0 = "Streaming mode can be used only with fragmented files"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0039:
            int r4 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r4)
            r7.A0G = r0
            java.util.HashMap r4 = X.C17880vN.A11()
            r7.A04 = r4
            r7.A0O = r15
            if (r8 == 0) goto L_0x00ef
            java.lang.String r5 = "copyright"
            boolean r0 = r4.containsKey(r5)
            if (r0 != 0) goto L_0x009c
            java.lang.String r6 = r8.A0E
            if (r6 != 0) goto L_0x008d
            java.util.HashMap r0 = r8.A0J
            if (r0 == 0) goto L_0x009c
            java.util.Iterator r3 = X.C17890vO.A0j(r0)
        L_0x005f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r3.next()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Iterator r2 = X.C17890vO.A0j(r0)
        L_0x006f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r2.next()
            java.util.Iterator r1 = X.AnonymousClass8BR.A13(r0)
        L_0x007d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.next()
            X.CXd r0 = (X.C25092CXd) r0
            java.lang.String r6 = r0.A0E
            if (r6 == 0) goto L_0x007d
        L_0x008d:
            java.lang.Integer r1 = A00(r6)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009c
            r4.put(r5, r6)
        L_0x009c:
            java.util.Map r5 = r7.A04
            java.lang.String r4 = "composer"
            boolean r0 = r5.containsKey(r4)
            if (r0 != 0) goto L_0x00ef
            java.lang.String r6 = r8.A0D
            if (r6 != 0) goto L_0x00e0
            java.util.HashMap r0 = r8.A0J
            if (r0 == 0) goto L_0x00ef
            java.util.Iterator r3 = X.C17890vO.A0j(r0)
        L_0x00b2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r3.next()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.Iterator r2 = X.C17890vO.A0j(r0)
        L_0x00c2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r2.next()
            java.util.Iterator r1 = X.AnonymousClass8BR.A13(r0)
        L_0x00d0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r1.next()
            X.CXd r0 = (X.C25092CXd) r0
            java.lang.String r6 = r0.A0D
            if (r6 == 0) goto L_0x00d0
        L_0x00e0:
            java.lang.Integer r1 = A00(r6)
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ef
            r5.put(r4, r6)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DHA.<init>(X.CXd, X.CmX, X.E54, X.BzJ, X.E7r, X.CNi, X.CZT, java.lang.String, java.lang.String, long, long, long, boolean, boolean):void");
    }

    public void CSO(C28577E8n e8n) {
        MediaCodec.BufferInfo BNo = e8n.BNo();
        if (this.A07 == -1) {
            this.A07 = BNo.presentationTimeUs;
        }
        EAM eam = this.A0C;
        C26159CtX.A01(eam);
        eam.CSO(e8n);
        long j = this.A08 + ((long) BNo.size);
        this.A08 = j;
        this.A0A.A02 = j;
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [X.DH0, java.lang.Object] */
    public void CSW(C28577E8n e8n) {
        MediaCodec.BufferInfo BNo = e8n.BNo();
        if (this.A01 == -1) {
            this.A01 = BNo.presentationTimeUs;
        }
        if ((BNo.flags & 2) != 0) {
            List list = this.A0E.A00;
            ? obj = new Object();
            C26159CtX.A01(e8n.BNu());
            ByteBuffer BNu = e8n.BNu();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(BNu.limit());
            allocateDirect.put(BNu.asReadOnlyBuffer());
            obj.A01 = allocateDirect;
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            obj.A00 = bufferInfo;
            MediaCodec.BufferInfo BNo2 = e8n.BNo();
            bufferInfo.set(BNo2.offset, BNo2.size, BNo2.presentationTimeUs, BNo2.flags);
            list.add(obj);
        }
        if ((BNo.flags & 1) != 0) {
            long j = BNo.presentationTimeUs;
            boolean A1Q = AnonymousClass000.A1Q(((j - this.A01) > this.A0K ? 1 : ((j - this.A01) == this.A0K ? 0 : -1)));
            if (this.A0L - j >= this.A0J && A1Q) {
                A03(this, false);
                A02(this.A0C, BNo.presentationTimeUs - this.A01, false);
                A01(BNo.presentationTimeUs);
                CL1 cl1 = this.A0E;
                EAM eam = this.A0C;
                C26159CtX.A01(eam);
                for (C28577E8n CSW : cl1.A00) {
                    eam.CSW(CSW);
                }
            }
        }
        BNo.presentationTimeUs -= this.A01;
        EAM eam2 = this.A0C;
        C26159CtX.A01(eam2);
        eam2.CSW(e8n);
        long j2 = this.A08 + ((long) BNo.size);
        this.A08 = j2;
        this.A0A.A02 = j2;
    }

    public void CHz(MediaFormat mediaFormat) {
        this.A02 = mediaFormat;
    }

    public void CJl(int i) {
        this.A00 = i;
    }

    public void CLL(MediaFormat mediaFormat) {
        this.A03 = mediaFormat;
    }
}
