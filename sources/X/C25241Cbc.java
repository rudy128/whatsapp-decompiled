package X;

import java.io.File;

/* renamed from: X.Cbc  reason: case insensitive filesystem */
public class C25241Cbc {
    public C25752ClM A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final C25225CbM A0F;
    public final C25820CmX A0G;
    public final C24322BzJ A0H;
    public final File A0I;
    public final boolean A0J;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25241Cbc(android.media.MediaFormat r8, X.C25225CbM r9, X.C25820CmX r10, X.C25752ClM r11, X.C24322BzJ r12, java.io.File r13, int r14, int r15, long r16, long r18, long r20, long r22, boolean r24) {
        /*
            r7 = this;
            r4 = -1
            r2 = -1
            r7.<init>()
            r7.A0I = r13
            r0 = r16
            r7.A0A = r0
            r0 = r18
            r7.A0B = r0
            r7.A03 = r14
            r7.A02 = r15
            r0 = r20
            r7.A0C = r0
            r5 = r22
            r7.A0E = r5
            r5 = r24
            r7.A0J = r5
            r7.A0H = r12
            boolean r5 = r10.A0X
            if (r5 == 0) goto L_0x0057
            r7.A09 = r14
            r7.A07 = r15
            r7.A0D = r0
        L_0x002c:
            r7.A06 = r4
            r7.A08 = r4
        L_0x0030:
            r7.A0G = r10
            r7.A0F = r9
            if (r8 == 0) goto L_0x0055
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0055
            java.lang.String r1 = "color-standard"
            boolean r0 = r8.containsKey(r1)
            if (r0 == 0) goto L_0x0055
            int r0 = r8.getInteger(r1)
            r7.A04 = r0
            java.lang.String r0 = "color-transfer"
            int r0 = r8.getInteger(r0)
        L_0x0050:
            r7.A05 = r0
            r7.A00 = r11
            return
        L_0x0055:
            r0 = 0
            goto L_0x0050
        L_0x0057:
            if (r11 != 0) goto L_0x0060
            r7.A09 = r4
            r7.A07 = r4
            r7.A0D = r2
            goto L_0x002c
        L_0x0060:
            int r0 = r11.A0A
            r7.A09 = r0
            int r0 = r11.A08
            r7.A07 = r0
            int r0 = r11.A00()
            long r0 = (long) r0
            r7.A0D = r0
            int r0 = r11.A01
            r7.A06 = r0
            int r0 = r11.A09
            r7.A08 = r0
            X.Cab r0 = r11.A0E
            if (r0 == 0) goto L_0x0030
            X.Bzp r0 = r0.A02
            java.lang.String r0 = r0.name()
            r7.A01 = r0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25241Cbc.<init>(android.media.MediaFormat, X.CbM, X.CmX, X.ClM, X.BzJ, java.io.File, int, int, long, long, long, long, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25241Cbc cbc = (C25241Cbc) obj;
            if (this.A0A != cbc.A0A || this.A0B != cbc.A0B || this.A03 != cbc.A03 || this.A02 != cbc.A02 || this.A0C != cbc.A0C || this.A09 != cbc.A09 || this.A07 != cbc.A07 || this.A0D != cbc.A0D || this.A06 != cbc.A06 || this.A08 != cbc.A08 || this.A0E != cbc.A0E || Double.compare(0.0d, 0.0d) != 0 || this.A0J != cbc.A0J || this.A0H.mValue != cbc.A0H.mValue || !this.A0I.equals(cbc.A0I) || !this.A0G.equals(cbc.A0G)) {
                return false;
            }
            C25225CbM cbM = this.A0F;
            C25225CbM cbM2 = cbc.A0F;
            if (cbM == null) {
                if (cbM2 != null) {
                    return false;
                }
            } else if (cbM2 == null || !cbM.equals(cbM2)) {
                return false;
            }
            String str = this.A01;
            String str2 = cbc.A01;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (str2 == null || !str.equals(str2)) {
                return false;
            }
            if (!(this.A05 == cbc.A05 && this.A04 == cbc.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[23];
        objArr[0] = this.A0I;
        C17890vO.A1M(objArr, this.A0A);
        C17890vO.A1N(objArr, this.A0B);
        C17890vO.A1G(objArr, this.A03);
        AnonymousClass3Ma.A1T(objArr, this.A02);
        C17890vO.A1Q(objArr, this.A0C);
        C17890vO.A1H(objArr, -1);
        C17890vO.A1I(objArr, this.A09);
        objArr[8] = Integer.valueOf(this.A07);
        objArr[9] = Long.valueOf(this.A0D);
        objArr[10] = Integer.valueOf(this.A06);
        objArr[11] = Integer.valueOf(this.A08);
        objArr[12] = Long.valueOf(this.A0E);
        objArr[13] = AnonymousClass8BV.A0Q();
        objArr[14] = Boolean.valueOf(this.A0J);
        objArr[15] = Integer.valueOf(this.A0H.mValue);
        objArr[16] = this.A0G;
        objArr[17] = this.A0F;
        objArr[18] = AnonymousClass8BV.A0a();
        objArr[19] = this.A01;
        objArr[20] = AnonymousClass000.A0h();
        objArr[21] = Integer.valueOf(this.A04);
        return AnonymousClass000.A0P(Integer.valueOf(this.A05), objArr, 22);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoResizeResult{outputFile=");
        A10.append(this.A0I);
        A10.append(", originalFileSize=");
        A10.append(this.A0A);
        A10.append(", outputFileSize=");
        A10.append(this.A0B);
        A10.append(", sourceWidth=");
        A10.append(this.A03);
        A10.append(", sourceHeight=");
        A10.append(this.A02);
        A10.append(", sourceBitRate=");
        A10.append(this.A0C);
        A10.append(", sourceFrameRate=");
        A10.append(-1);
        A10.append(", targetWidth=");
        A10.append(this.A09);
        A10.append(", targetHeight=");
        A10.append(this.A07);
        A10.append(", targetRotationDegreesClockwise=");
        A10.append(this.A08);
        A10.append(", targetBitRate=");
        A10.append(this.A0D);
        A10.append(", targetFrameRate=");
        A10.append(this.A06);
        A10.append(", videoTime=");
        A10.append(this.A0E);
        A10.append(", frameDropPercent=");
        A10.append(0.0d);
        A10.append(", mediaResizeStatus=");
        A10.append(this.A0G);
        A10.append(", mIsLastSegment=");
        A10.append(this.A0J);
        A10.append(", mTrackType=");
        A10.append(this.A0H);
        A10.append(", mediaDemuxerStats=");
        A10.append(this.A0F);
        BE8.A1F(A10, ", mOutputIndex=");
        A10.append(", framePts=");
        A10.append(-1);
        A10.append(", targetCodec=");
        A10.append(this.A01);
        C108975cc.A15(A10, ", useHLGHdrTranscode=");
        A10.append(", targetColorTransfer=");
        A10.append(this.A05);
        A10.append(", targetColorSpace=");
        A10.append(this.A04);
        return C17890vO.A0b(A10);
    }
}
