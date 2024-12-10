package X;

import java.io.File;
import java.util.Arrays;

public final class BVz extends C26867DGy {
    public final int A00;
    public final int A01;
    public final File A02;
    public final /* synthetic */ DPW A03;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012a, code lost:
        if (r0 < 100.0d) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BpP(java.util.List r26) {
        /*
            r25 = this;
            r3 = 0
            r4 = r26
            X.C18070vi.A0d(r4, r3)
            r2 = r25
            int r1 = r2.A00
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0013
            java.io.File r0 = r2.A02
            X.C64062u9.A0Q(r0)
        L_0x0013:
            int r0 = r4.size()
            r10 = 1
            if (r0 == r10) goto L_0x0026
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoTranscoder/uumos_cs: error, VideoResizeResult size = "
            X.C17890vO.A15(r0, r1, r4)
            X.C17890vO.A0w(r1)
        L_0x0026:
            java.lang.Object r5 = r4.get(r3)
            X.Cbc r5 = (X.C25241Cbc) r5
            X.DPW r0 = r2.A03
            r24 = r0
            X.CiG r9 = r0.A0G
            if (r9 == 0) goto L_0x020d
            r9.A03 = r5
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0155
            X.CTw r8 = r9.A01
            if (r8 == 0) goto L_0x0209
            X.ClM r6 = r9.A02
            if (r6 == 0) goto L_0x0209
            if (r5 == 0) goto L_0x0209
            int r7 = r6.A07
            if (r7 > r10) goto L_0x004a
            int r7 = r5.A03
        L_0x004a:
            int r3 = r6.A05
            if (r3 > r10) goto L_0x0050
            int r3 = r5.A02
        L_0x0050:
            long r0 = r5.A0C
            int r4 = (int) r0
            int r14 = r6.A01
            int r2 = r6.A0A
            int r11 = r6.A08
            long r0 = r5.A0D
            int r6 = (int) r0
            r15 = r14
            if (r7 > r10) goto L_0x0061
            r7 = 720(0x2d0, float:1.009E-42)
        L_0x0061:
            if (r3 > r10) goto L_0x0065
            r3 = 1280(0x500, float:1.794E-42)
        L_0x0065:
            if (r4 > r10) goto L_0x006a
            r4 = 1000000(0xf4240, float:1.401298E-39)
        L_0x006a:
            if (r14 > r10) goto L_0x006e
            r15 = 30
        L_0x006e:
            if (r2 > r10) goto L_0x0072
            r2 = 720(0x2d0, float:1.009E-42)
        L_0x0072:
            if (r11 > r10) goto L_0x0076
            r11 = 1280(0x500, float:1.794E-42)
        L_0x0076:
            if (r6 > r10) goto L_0x007b
            r6 = 1000000(0xf4240, float:1.401298E-39)
        L_0x007b:
            if (r14 > r10) goto L_0x007f
            r14 = 30
        L_0x007f:
            if (r15 <= r10) goto L_0x012c
            if (r3 < r7) goto L_0x0084
            r3 = r7
        L_0x0084:
            if (r11 < r2) goto L_0x0087
            r11 = r2
        L_0x0087:
            double r0 = (double) r3
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r16
            r2 = 4571453861756211473(0x3f71111111111111, double:0.004166666666666667)
            double r22 = X.C25576CiG.A00(r0, r2)
            double r12 = (double) r11
            double r0 = r12 * r16
            double r20 = X.C25576CiG.A00(r0, r2)
            double r4 = (double) r4
            double r4 = r4 * r16
            double r6 = (double) r6
            r2 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = r6 * r2
            double r0 = java.lang.Math.min(r4, r0)
            double r0 = r0 * r16
            r2 = 4508321993853365645(0x3e90c6f7a0b5ed8d, double:2.5E-7)
            double r18 = X.C25576CiG.A00(r0, r2)
            double r6 = r6 * r16
            r2 = 4506651814115716936(0x3e8ad7f29abcaf48, double:2.0E-7)
            double r0 = X.C25576CiG.A00(r6, r2)
            double r2 = X.C25576CiG.A00(r4, r2)
            double r0 = r0 / r2
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r16
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = X.C25576CiG.A00(r0, r2)
            r0 = 4607002274814922588(0x3fef5c28f5c28f5c, double:0.98)
            r2 = 1080(0x438, float:1.513E-42)
            if (r11 >= r2) goto L_0x00ea
            double r2 = r4 - r0
            double r2 = r2 * r12
            r0 = 4652464705678344192(0x4090e00000000000, double:1080.0)
            double r2 = r2 / r0
            double r0 = r4 - r2
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00ea
            r0 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
        L_0x00ea:
            double r2 = r8.A08
            double r6 = java.lang.Math.pow(r0, r2)
            double r6 = r6 - r4
            double r6 = r6 / r2
            double r0 = r8.A09
            double r6 = r6 * r0
            double r0 = r8.A07
            double r2 = r8.A02
            double r22 = r22 * r2
            double r0 = r0 + r22
            double r2 = r8.A06
            double r20 = r20 * r2
            double r0 = r0 + r20
            double r2 = r8.A00
            double r18 = r18 * r2
            double r0 = r0 + r18
            double r4 = (double) r15
            double r2 = r8.A01
            double r4 = r4 * r2
            double r0 = r0 + r4
            double r4 = (double) r14
            double r2 = r8.A05
            double r4 = r4 * r2
            double r0 = r0 + r4
            double r2 = r8.A04
            double r6 = r6 * r2
            double r0 = r0 + r6
            double r2 = r8.A03
            double r16 = r16 * r2
            double r0 = r0 + r16
            r2 = 0
            double r0 = r0 + r2
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x012c
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x012e
        L_0x012c:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x012e:
            X.CNf r2 = new X.CNf
            r2.<init>(r9, r0)
        L_0x0133:
            double r2 = r2.A00
        L_0x0135:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VideoTranscoder/uumos_cs: score = "
            X.BEA.A1Q(r0, r1, r2)
        L_0x013e:
            r0 = r24
            X.70S r0 = r0.A0B
            X.64V r4 = r0.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r4.A04 = r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            long r0 = (long) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0P = r0
            return
        L_0x0155:
            X.CTj r8 = r9.A00
            if (r8 == 0) goto L_0x0209
            X.ClM r2 = r9.A02
            if (r2 == 0) goto L_0x0209
            if (r5 == 0) goto L_0x0209
            int r7 = r2.A07
            if (r7 > r10) goto L_0x0165
            int r7 = r5.A03
        L_0x0165:
            int r6 = r2.A05
            if (r6 > r10) goto L_0x016b
            int r6 = r5.A02
        L_0x016b:
            long r0 = r5.A0C
            int r3 = (int) r0
            int r13 = r2.A01
            int r11 = r2.A0A
            int r4 = r2.A08
            long r0 = r5.A0D
            int r2 = (int) r0
            if (r7 > r10) goto L_0x017b
            r7 = 815(0x32f, float:1.142E-42)
        L_0x017b:
            if (r6 > r10) goto L_0x017f
            r6 = 1112(0x458, float:1.558E-42)
        L_0x017f:
            if (r3 > r10) goto L_0x0184
            r3 = 1300588(0x13d86c, float:1.822512E-39)
        L_0x0184:
            if (r13 > r10) goto L_0x0188
            r13 = 30
        L_0x0188:
            if (r11 > r10) goto L_0x018c
            r11 = 815(0x32f, float:1.142E-42)
        L_0x018c:
            if (r4 > r10) goto L_0x0190
            r4 = 1112(0x458, float:1.558E-42)
        L_0x0190:
            if (r2 > r10) goto L_0x0195
            r2 = 1300588(0x13d86c, float:1.822512E-39)
        L_0x0195:
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r6 < r7) goto L_0x019a
            r6 = r7
        L_0x019a:
            if (r4 < r11) goto L_0x019d
            r4 = r11
        L_0x019d:
            double r6 = (double) r6
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r6 * r11
            double r0 = (double) r4
            double r16 = r16 / r0
            double r4 = (double) r3
            double r4 = r4 * r11
            double r11 = (double) r2
            double r4 = r4 / r11
            double r0 = r8.A08
            double r2 = r8.A06
            double r6 = java.lang.Math.log(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A00
            r6 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r6 = java.lang.Math.log(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A07
            double r6 = java.lang.Math.log(r11)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A02
            r6 = 4669471951536783360(0x40cd4c0000000000, double:15000.0)
            double r6 = java.lang.Math.log(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A03
            r6 = 4655631299166339072(0x409c200000000000, double:1800.0)
            double r6 = java.lang.Math.log(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A01
            double r6 = (double) r13
            double r6 = java.lang.Math.log(r6)
            double r2 = r2 * r6
            double r0 = r0 + r2
            double r2 = r8.A05
            double r2 = r2 * r16
            double r0 = r0 + r2
            double r2 = r8.A04
            double r2 = r2 * r4
            double r0 = r0 + r2
            r2 = 0
            double r0 = r0 + r2
            double r0 = r0 + r2
            double r0 = r0 + r2
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0202
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x012e
        L_0x0202:
            X.CNf r2 = new X.CNf
            r2.<init>(r9, r14)
            goto L_0x0133
        L_0x0209:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0135
        L_0x020d:
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVz.BpP(java.util.List):void");
    }

    public BVz(DPW dpw, File file, int i, int i2) {
        this.A03 = dpw;
        this.A02 = file;
        this.A00 = i;
        this.A01 = i2;
    }

    public /* bridge */ /* synthetic */ void BtX(C25820CmX cmX, Object obj) {
        String str;
        C2Z c2z = (C2Z) obj;
        boolean A16 = C18070vi.A16(c2z, cmX);
        String A002 = C25359CeJ.A00(c2z);
        String arrays = Arrays.toString(c2z.getStackTrace());
        StringBuilder A15 = C108955ca.A15(arrays);
        A15.append("e = ");
        A15.append(c2z);
        StringBuilder A11 = AnonymousClass000.A11(C17890vO.A0c(A15, 10));
        A11.append("mediaResizeStatus= ");
        A11.append(cmX);
        StringBuilder A112 = AnonymousClass000.A11(C17890vO.A0c(A11, 10));
        A112.append("message = ");
        StringBuilder A113 = AnonymousClass000.A11(AnonymousClass8BW.A0l(c2z.getMessage(), A112, 10));
        A113.append("trace = ");
        StringBuilder A114 = AnonymousClass000.A11(AnonymousClass8BW.A0l(arrays, A113, 10));
        A114.append("cause = ");
        A114.append(c2z.getCause());
        StringBuilder A115 = AnonymousClass000.A11(C17890vO.A0c(A114, 10));
        A115.append("cause trace = ");
        Throwable cause = c2z.getCause();
        if (cause != null) {
            str = C25359CeJ.A00(cause);
        } else {
            str = null;
        }
        String A1H = AnonymousClass001.A1H("full trace = ", A002, AnonymousClass000.A11(AnonymousClass8BW.A0l(str, A115, 10)));
        DPW dpw = this.A03;
        dpw.A0A.A0G("VideoTranscoder/onException", A1H, A16);
        dpw.A01 = c2z;
    }
}
