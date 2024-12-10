package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0U1  reason: invalid class name */
public final class AnonymousClass0U1 implements C17170uE {
    public final float A00;
    public final C02070Cp A01;

    public float BRJ(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.0Cp] */
    public AnonymousClass0U1(float f, float f2) {
        this.A00 = f2;
        ? obj = new Object();
        obj.A05 = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        obj.A03 = sqrt;
        obj.A04 = 1.0f;
        obj.A04 = 1.0f;
        obj.A06 = false;
        if (((float) (sqrt * sqrt)) > 0.0f) {
            obj.A03 = Math.sqrt((double) f);
            obj.A06 = false;
            this.A01 = obj;
            return;
        }
        throw AnonymousClass000.A0k("Spring stiffness constant must be positive.");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.0Cv, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.0Cv, java.lang.Object] */
    public static final C02130Cv A00(double d) {
        if (d < 0.0d) {
            double sqrt = Math.sqrt(Math.abs(d));
            ? obj = new Object();
            obj.A01 = 0.0d;
            obj.A00 = sqrt;
            return obj;
        }
        double sqrt2 = Math.sqrt(d);
        ? obj2 = new Object();
        obj2.A01 = sqrt2;
        obj2.A00 = 0.0d;
        return obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164 A[EDGE_INSN: B:83:0x0164->B:47:0x0164 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long BQz(float r29, float r30, float r31) {
        /*
            r28 = this;
            r4 = r28
            X.0Cp r3 = r4.A01
            double r0 = r3.A03
            double r0 = r0 * r0
            float r2 = (float) r0
            float r1 = r3.A04
            float r8 = r29 - r30
            float r0 = r4.A00
            float r8 = r8 / r0
            float r5 = r31 / r0
            double r12 = (double) r2
            double r1 = (double) r1
            double r6 = (double) r5
            double r8 = (double) r8
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 * r1
            double r3 = java.lang.Math.sqrt(r12)
            double r10 = r10 * r3
            double r14 = r10 * r10
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r3 = r3 * r12
            double r14 = r14 - r3
            double r12 = -r10
            X.0Cv r4 = A00(r14)
            double r10 = r4.A01
            double r10 = r10 + r12
            r4.A01 = r10
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r16
            r4.A01 = r10
            double r10 = r4.A00
            double r10 = r10 * r16
            r4.A00 = r10
            X.0Cv r0 = A00(r14)
            double r10 = r0.A01
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r10 = r10 * r14
            double r10 = r10 + r12
            double r10 = r10 * r16
            r22 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 0
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0058
            r2 = 0
        L_0x0053:
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            return r2
        L_0x0058:
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            double r6 = -r6
        L_0x005d:
            double r20 = java.lang.Math.abs(r8)
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 <= 0) goto L_0x0148
            r26 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r4.A01
            double r2 = r8 * r20
            double r2 = r2 - r6
            double r16 = r8 - r10
            double r2 = r2 / r16
            double r20 = r20 - r2
            double r0 = r22 / r20
            double r0 = java.lang.Math.abs(r0)
            double r4 = java.lang.Math.log(r0)
            double r4 = r4 / r8
            double r0 = r22 / r2
            double r0 = java.lang.Math.abs(r0)
            double r0 = java.lang.Math.log(r0)
            double r0 = r0 / r10
            boolean r6 = java.lang.Double.isInfinite(r4)
            if (r6 != 0) goto L_0x0145
            boolean r6 = java.lang.Double.isNaN(r4)
            if (r6 != 0) goto L_0x0145
            boolean r6 = java.lang.Double.isInfinite(r0)
            if (r6 != 0) goto L_0x00a4
            boolean r6 = java.lang.Double.isNaN(r0)
            if (r6 != 0) goto L_0x00a4
            double r4 = java.lang.Math.max(r4, r0)
        L_0x00a4:
            double r24 = r20 * r8
            double r0 = -r2
            double r0 = r0 * r10
            double r6 = r24 / r0
            double r12 = java.lang.Math.log(r6)
            double r0 = r10 - r8
            double r12 = r12 / r0
            boolean r0 = java.lang.Double.isNaN(r12)
            if (r0 != 0) goto L_0x00e1
            r14 = 0
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0137
            double r0 = r8 * r12
            double r6 = java.lang.Math.exp(r0)
            double r0 = r20 * r6
            double r6 = r10 * r12
            double r12 = java.lang.Math.exp(r6)
            double r6 = r2 * r12
            double r0 = r0 + r6
            double r6 = -r0
            int r0 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0137
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            int r0 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e1
            r4 = 0
        L_0x00e1:
            r26 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x00e3:
            double r0 = r8 * r4
            double r0 = java.lang.Math.exp(r0)
            double r12 = r24 * r0
            double r22 = r2 * r10
            double r0 = r10 * r4
            double r6 = java.lang.Math.exp(r0)
            double r0 = r22 * r6
            double r12 = r12 + r0
            double r12 = java.lang.Math.abs(r12)
            r6 = 4547007122018943789(0x3f1a36e2eb1c432d, double:1.0E-4)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0164
            r1 = 0
        L_0x0104:
            int r1 = r1 + 1
            double r6 = r8 * r4
            double r18 = java.lang.Math.exp(r6)
            double r16 = r18 * r20
            double r6 = r10 * r4
            double r14 = java.lang.Math.exp(r6)
            double r6 = r2 * r14
            double r16 = r16 + r6
            double r16 = r16 + r26
            double r12 = r24 * r18
            double r6 = r22 * r14
            double r12 = r12 + r6
            double r16 = r16 / r12
            double r6 = r4 - r16
            double r4 = r4 - r6
            double r12 = java.lang.Math.abs(r4)
            r4 = r6
            r6 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            r0 = 100
            if (r1 >= r0) goto L_0x0164
            goto L_0x0104
        L_0x0137:
            double r0 = r2 * r10
            double r0 = r0 * r10
            double r4 = -r0
            double r0 = r24 * r8
            double r4 = r4 / r0
            double r4 = java.lang.Math.log(r4)
            double r4 = r4 / r16
            goto L_0x00e3
        L_0x0145:
            r4 = r0
            goto L_0x00a4
        L_0x0148:
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x016d
            double r2 = r4.A01
            double r0 = r2 * r20
            double r6 = r6 - r0
            double r0 = r4.A00
            double r6 = r6 / r0
            double r20 = r20 * r20
            double r6 = r6 * r6
            double r20 = r20 + r6
            double r0 = java.lang.Math.sqrt(r20)
            double r22 = r22 / r0
            double r4 = java.lang.Math.log(r22)
            double r4 = r4 / r2
        L_0x0164:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r0
            long r2 = (long) r4
            goto L_0x0053
        L_0x016d:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r4.A01
            double r15 = r2 * r20
            double r6 = r6 - r15
            double r0 = r22 / r20
            double r0 = java.lang.Math.abs(r0)
            double r4 = java.lang.Math.log(r0)
            double r4 = r4 / r2
            double r0 = r22 / r6
            double r0 = java.lang.Math.abs(r0)
            double r12 = java.lang.Math.log(r0)
            r10 = 0
            r0 = r12
            r11 = 0
        L_0x018c:
            double r0 = r0 / r2
            double r0 = java.lang.Math.abs(r0)
            double r8 = java.lang.Math.log(r0)
            double r0 = r12 - r8
            int r11 = r11 + 1
            r8 = 6
            if (r11 < r8) goto L_0x018c
            double r0 = r0 / r2
            boolean r8 = java.lang.Double.isInfinite(r4)
            if (r8 != 0) goto L_0x021f
            boolean r8 = java.lang.Double.isNaN(r4)
            if (r8 != 0) goto L_0x021f
            boolean r8 = java.lang.Double.isInfinite(r0)
            if (r8 != 0) goto L_0x01b9
            boolean r8 = java.lang.Double.isNaN(r0)
            if (r8 != 0) goto L_0x01b9
            double r4 = java.lang.Math.max(r4, r0)
        L_0x01b9:
            double r0 = r15 + r6
            double r8 = -r0
            double r0 = r2 * r6
            double r8 = r8 / r0
            double r0 = r2 * r8
            double r13 = java.lang.Math.exp(r0)
            double r0 = r13 * r20
            double r11 = r6 * r8
            double r11 = r11 * r13
            double r0 = r0 + r11
            boolean r11 = java.lang.Double.isNaN(r8)
            if (r11 != 0) goto L_0x01ea
            r12 = 0
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x01ea
            int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0217
            double r8 = -r0
            int r0 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x0217
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ea
            int r0 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ea
            r4 = 0
        L_0x01ea:
            r17 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x01ec:
            int r10 = r10 + 1
            double r0 = r6 * r4
            double r11 = r20 + r0
            double r8 = r2 * r4
            double r0 = java.lang.Math.exp(r8)
            double r11 = r11 * r0
            double r11 = r11 + r17
            double r8 = r8 + r22
            double r8 = r8 * r6
            double r8 = r8 + r15
            double r8 = r8 * r0
            double r11 = r11 / r8
            double r0 = r4 - r11
            double r4 = r4 - r0
            double r11 = java.lang.Math.abs(r4)
            r4 = r0
            r8 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
            r0 = 100
            if (r10 >= r0) goto L_0x0164
            goto L_0x01ec
        L_0x0217:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r2
            double r4 = -r0
            double r0 = r20 / r6
            double r4 = r4 - r0
            goto L_0x01ec
        L_0x021f:
            r4 = r0
            goto L_0x01b9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0U1.BQz(float, float, float):long");
    }

    public /* bridge */ /* synthetic */ C16830tI CRk(C16590sg r3) {
        return new AnonymousClass0U9(new AnonymousClass0Tu((C17170uE) this));
    }

    public float BbE(float f, float f2, float f3, long j) {
        long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
        C02070Cp r0 = this.A01;
        r0.A05 = f2;
        return AnonymousClass001.A02(r0.A00(f, f3, j2));
    }

    public float BbJ(float f, float f2, float f3, long j) {
        long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
        C02070Cp r0 = this.A01;
        r0.A05 = f2;
        return AnonymousClass001.A01(r0.A00(f, f3, j2));
    }

    public AnonymousClass0U1() {
        this(1500.0f, 0.01f);
    }
}
