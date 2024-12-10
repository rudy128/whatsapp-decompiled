package X;

/* renamed from: X.CkD  reason: case insensitive filesystem */
public class C25682CkD {
    public static C25682CkD A07;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C25737Cl7 A04;
    public C25580CiK A05;
    public final C28617EAp A06;

    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ee, code lost:
        if (r50 != null) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020d, code lost:
        if (r48.shouldUseLowPassWithWeightedEMAForBWEstimation() == false) goto L_0x020f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x036b A[LOOP:8: B:148:0x0363->B:150:0x036b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0395 A[LOOP:9: B:152:0x038f->B:154:0x0395, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02b2 A[EDGE_INSN: B:184:0x02b2->B:121:0x02b2 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r50) {
        /*
            r49 = this;
            r33 = r49
            monitor-enter(r33)
            r0 = r33
            X.CiK r13 = r0.A05     // Catch:{ all -> 0x03f9 }
            monitor-enter(r13)     // Catch:{ all -> 0x03f9 }
            X.C25580CiK.A00(r13)     // Catch:{ all -> 0x03f6 }
            boolean r0 = r13.A03     // Catch:{ all -> 0x03f6 }
            if (r0 != 0) goto L_0x0013
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = r13.A00     // Catch:{ all -> 0x03f6 }
            goto L_0x03f3
        L_0x0013:
            java.util.Deque r0 = r13.A01     // Catch:{ all -> 0x03f6 }
            r35 = r0
            boolean r0 = r35.isEmpty()     // Catch:{ all -> 0x03f6 }
            if (r0 != 0) goto L_0x03e5
            java.util.Deque r0 = r13.A02     // Catch:{ all -> 0x03f6 }
            r34 = r0
            boolean r0 = r34.isEmpty()     // Catch:{ all -> 0x03f6 }
            if (r0 != 0) goto L_0x03e5
            r48 = r50
            if (r50 == 0) goto L_0x01f5
            boolean r0 = r48.shouldUseLowPassEMAForBWEstimation()     // Catch:{ all -> 0x03f6 }
            if (r0 == 0) goto L_0x01f5
            java.util.Iterator r5 = r35.iterator()     // Catch:{ all -> 0x03e3 }
            r16 = 0
            r20 = 0
            r3 = r16
            r11 = 0
            r0 = 0
        L_0x003f:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x03e3 }
            X.BRZ r4 = (X.BRZ) r4     // Catch:{ all -> 0x03e3 }
            if (r3 == 0) goto L_0x0055
            long r2 = r4.A01     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            double r11 = r11 + r2
        L_0x0055:
            r3 = r4
            goto L_0x003f
        L_0x0057:
            int r2 = r35.size()     // Catch:{ all -> 0x03e3 }
            r5 = 1
            if (r2 <= r5) goto L_0x006a
            double r2 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            double r11 = r11 - r2
            int r2 = r35.size()     // Catch:{ all -> 0x03e3 }
            int r2 = r2 - r5
            double r2 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r11 = r11 / r2
        L_0x006a:
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            double r14 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03e3 }
            goto L_0x0078
        L_0x0074:
            double r14 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03e3 }
        L_0x0078:
            boolean r2 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x03e3 }
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r2 == 0) goto L_0x008a
            double r9 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03e3 }
            double r2 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03e3 }
            double r9 = r9 / r2
            goto L_0x008c
        L_0x008a:
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x008c:
            int r2 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a0
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x0096
            r2 = r9
            goto L_0x0098
        L_0x0096:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0098:
            double r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            double r0 = r0 / r11
            double r2 = r2 + r0
            double r6 = r6 / r2
            double r14 = r14 * r6
        L_0x00a0:
            java.util.Iterator r8 = r34.iterator()     // Catch:{ all -> 0x03e3 }
            r6 = 0
            r1 = 0
        L_0x00a8:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x03e3 }
            X.BRa r0 = (X.C22822BRa) r0     // Catch:{ all -> 0x03e3 }
            if (r16 == 0) goto L_0x00be
            long r3 = r0.A00     // Catch:{ all -> 0x03e3 }
            double r1 = (double) r3     // Catch:{ all -> 0x03e3 }
            double r3 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x03e3 }
            double r6 = r6 + r3
        L_0x00be:
            r16 = r0
            goto L_0x00a8
        L_0x00c1:
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            if (r0 <= r5) goto L_0x00d3
            double r3 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x03e3 }
            double r6 = r6 - r3
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            int r0 = r0 - r5
            double r3 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r6 = r6 / r3
        L_0x00d3:
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            double r18 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03e3 }
            goto L_0x00e1
        L_0x00dd:
            double r18 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03e3 }
        L_0x00e1:
            boolean r0 = r48.shouldUseLowPassEMAAsymmetryForBWEstimation()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x00f0
            double r9 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03e3 }
            double r3 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03e3 }
            double r9 = r9 / r3
        L_0x00f0:
            int r0 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0105
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fa
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x00fa:
            double r0 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x03e3 }
            double r0 = r0 / r6
            double r9 = r9 + r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 / r9
            double r18 = r18 * r0
        L_0x0105:
            java.lang.Object r0 = r35.peekLast()     // Catch:{ all -> 0x03e3 }
            X.BRZ r0 = (X.BRZ) r0     // Catch:{ all -> 0x03e3 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r14
            X.C199610h.A04(r0)     // Catch:{ all -> 0x03e3 }
            double r2 = r2 * r20
            X.C199610h.A04(r0)     // Catch:{ all -> 0x03e3 }
            long r4 = r0.A00     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r4     // Catch:{ all -> 0x03e3 }
            double r0 = r0 * r14
            double r2 = r2 + r0
            long r8 = (long) r2     // Catch:{ all -> 0x03e3 }
            java.lang.Object r0 = r34.peekLast()     // Catch:{ all -> 0x03e3 }
            X.BRa r0 = (X.C22822BRa) r0     // Catch:{ all -> 0x03e3 }
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r18
            X.C199610h.A04(r0)     // Catch:{ all -> 0x03e3 }
            double r2 = r2 * r20
            X.C199610h.A04(r0)     // Catch:{ all -> 0x03e3 }
            long r4 = r0.A01     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r4     // Catch:{ all -> 0x03e3 }
            double r0 = r0 * r18
            double r2 = r2 + r0
            long r6 = (long) r2     // Catch:{ all -> 0x03e3 }
            java.util.Iterator r12 = r35.iterator()     // Catch:{ all -> 0x03e3 }
            r4 = 0
        L_0x013b:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x03e3 }
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0157
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x03e3 }
            X.BRZ r0 = (X.BRZ) r0     // Catch:{ all -> 0x03e3 }
            long r0 = r0.A00     // Catch:{ all -> 0x03e3 }
            long r0 = r0 - r8
            long r0 = r0 / r10
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x03e3 }
            double r20 = r20 + r4
            goto L_0x013b
        L_0x0157:
            int r0 = r35.size()     // Catch:{ all -> 0x03e3 }
            r1 = 1
            if (r0 <= r1) goto L_0x0168
            double r20 = r20 - r4
            int r0 = r35.size()     // Catch:{ all -> 0x03e3 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r20 = r20 / r0
        L_0x0168:
            double r1 = r48.getMaxAlphaLowPassEMABwVol()     // Catch:{ all -> 0x03e3 }
            r16 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            r14 = r1
        L_0x0176:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r14
            double r2 = java.lang.Math.sqrt(r20)     // Catch:{ all -> 0x03e3 }
            double r0 = r0 * r2
            double r2 = java.lang.Math.sqrt(r4)     // Catch:{ all -> 0x03e3 }
            double r14 = r14 * r2
            double r0 = r0 + r14
            long r4 = (long) r0     // Catch:{ all -> 0x03e3 }
            long r4 = r4 * r10
            java.util.Iterator r12 = r34.iterator()     // Catch:{ all -> 0x03e3 }
            r14 = 0
            r10 = 0
        L_0x018e:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x03e3 }
            X.BRa r0 = (X.C22822BRa) r0     // Catch:{ all -> 0x03e3 }
            long r0 = r0.A01     // Catch:{ all -> 0x03e3 }
            long r0 = r0 - r6
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x03e3 }
            double r10 = r10 + r14
            goto L_0x018e
        L_0x01a6:
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            r1 = 1
            if (r0 <= r1) goto L_0x01b5
            double r10 = r10 - r14
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            int r0 = r0 - r1
            double r0 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r10 = r10 / r0
        L_0x01b5:
            double r1 = r48.getMaxAlphaLowPassEMATtfbVol()     // Catch:{ all -> 0x03e3 }
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bf
            r18 = r1
        L_0x01bf:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r18
            double r0 = java.lang.Math.sqrt(r10)     // Catch:{ all -> 0x03e3 }
            double r2 = r2 * r0
            double r0 = java.lang.Math.sqrt(r14)     // Catch:{ all -> 0x03e3 }
            double r18 = r18 * r0
            double r2 = r2 + r18
            long r0 = (long) r2     // Catch:{ all -> 0x03e3 }
            int r3 = r35.size()     // Catch:{ all -> 0x03e3 }
            int r2 = r34.size()     // Catch:{ all -> 0x03e3 }
            int r3 = r3 + r2
            int r3 = r3 / 2
            r37 = 1000(0x3e8, double:4.94E-321)
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03e3 }
            r34 = r2
            r35 = r6
            r39 = r0
            r41 = r8
            r43 = r37
            r45 = r4
            r47 = r3
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x03e3 }
            r13.A00 = r2     // Catch:{ all -> 0x03e3 }
            goto L_0x03f0
        L_0x01f5:
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x03e3 }
            r32 = r0
            int r0 = r35.size()     // Catch:{ all -> 0x03e3 }
            double[] r0 = new double[r0]     // Catch:{ all -> 0x03e3 }
            r31 = r0
            if (r50 == 0) goto L_0x020f
            boolean r0 = r48.shouldUseLowPassWithWeightedEMAForBWEstimation()     // Catch:{ all -> 0x03e3 }
            r20 = 1
            if (r0 != 0) goto L_0x0211
        L_0x020f:
            r20 = 0
        L_0x0211:
            r4 = 0
            if (r20 == 0) goto L_0x0234
            java.util.Iterator r2 = r35.iterator()     // Catch:{ all -> 0x03e3 }
            r8 = 0
        L_0x021b:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x022f
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x03e3 }
            X.BRZ r0 = (X.BRZ) r0     // Catch:{ all -> 0x03e3 }
            long r0 = r0.A01     // Catch:{ all -> 0x03e3 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            long r8 = r8 + r0
            goto L_0x021b
        L_0x022f:
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            goto L_0x0237
        L_0x0234:
            r8 = 1
            goto L_0x023d
        L_0x0237:
            int r0 = r35.size()     // Catch:{ all -> 0x03e3 }
            long r0 = (long) r0     // Catch:{ all -> 0x03e3 }
            long r8 = r8 / r0
        L_0x023d:
            long r29 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03e3 }
            java.util.Iterator r17 = r35.iterator()     // Catch:{ all -> 0x03e3 }
            r11 = 0
            r27 = 0
            r16 = 0
        L_0x024b:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x03e3 }
            r25 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r23 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r10 = r17.next()     // Catch:{ all -> 0x03e3 }
            X.BRZ r10 = (X.BRZ) r10     // Catch:{ all -> 0x03e3 }
            long r2 = r10.A00     // Catch:{ all -> 0x03e3 }
            long r0 = r29 - r2
            double r6 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r6 = r6 / r25
            if (r20 == 0) goto L_0x0281
            long r0 = r10.A01     // Catch:{ all -> 0x03e3 }
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0275
            X.C199610h.A04(r48)     // Catch:{ all -> 0x03e3 }
            double r14 = r48.getMaxAlphaLowPassEMABwUp()     // Catch:{ all -> 0x03e3 }
            goto L_0x027c
        L_0x0275:
            X.C199610h.A04(r48)     // Catch:{ all -> 0x03e3 }
            double r14 = r48.getMaxAlphaLowPassEMABwDown()     // Catch:{ all -> 0x03e3 }
        L_0x027c:
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x028f
            goto L_0x0284
        L_0x0281:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x028f
        L_0x0284:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r8     // Catch:{ all -> 0x03e3 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r23 = r23 / r2
        L_0x028f:
            r0 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            double r6 = r6 * r0
            double r4 = java.lang.Math.exp(r6)     // Catch:{ all -> 0x03e3 }
            long r2 = r10.A01     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r4 = r4 * r0
            double r4 = r4 * r23
            double r4 = r4 * r14
            long r2 = r10.A00     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x03e3 }
            double r0 = r0 * r4
            double r27 = r27 + r0
            double r11 = r11 + r4
            r31[r16] = r4     // Catch:{ all -> 0x03e3 }
            int r16 = r16 + 1
            r4 = 0
            goto L_0x024b
        L_0x02b2:
            if (r20 == 0) goto L_0x02d3
            java.util.Iterator r2 = r34.iterator()     // Catch:{ all -> 0x03e3 }
        L_0x02b8:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x02cc
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x03e3 }
            X.BRa r0 = (X.C22822BRa) r0     // Catch:{ all -> 0x03e3 }
            long r0 = r0.A00     // Catch:{ all -> 0x03e3 }
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            long r4 = r4 + r0
            goto L_0x02b8
        L_0x02cc:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02d3
            goto L_0x02d6
        L_0x02d3:
            r4 = 1
            goto L_0x02dc
        L_0x02d6:
            int r0 = r34.size()     // Catch:{ all -> 0x03e3 }
            long r0 = (long) r0     // Catch:{ all -> 0x03e3 }
            long r4 = r4 / r0
        L_0x02dc:
            java.util.Iterator r19 = r34.iterator()     // Catch:{ all -> 0x03e3 }
            r6 = 0
            r18 = 0
            r21 = 0
        L_0x02e6:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r0 == 0) goto L_0x034c
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x03e3 }
            X.BRa r10 = (X.C22822BRa) r10     // Catch:{ all -> 0x03e3 }
            long r2 = r10.A00     // Catch:{ all -> 0x03e3 }
            long r0 = r29 - r2
            double r8 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r8 = r8 / r25
            if (r20 == 0) goto L_0x031c
            r20 = 1
            long r0 = r10.A00     // Catch:{ all -> 0x03e3 }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x030d
            X.C199610h.A04(r48)     // Catch:{ all -> 0x03e3 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbDown()     // Catch:{ all -> 0x03e3 }
            goto L_0x0314
        L_0x030d:
            X.C199610h.A04(r48)     // Catch:{ all -> 0x03e3 }
            double r16 = r48.getMaxAlphaLowPassEMATtfbUp()     // Catch:{ all -> 0x03e3 }
        L_0x0314:
            int r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0319
            goto L_0x0323
        L_0x0319:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x032e
        L_0x031c:
            r20 = 0
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x032e
        L_0x0323:
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x03e3 }
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r4     // Catch:{ all -> 0x03e3 }
            double r2 = r2 / r0
            double r2 = r2 + r23
            double r14 = r23 / r2
        L_0x032e:
            r0 = -4625196817309499392(0xbfd0000000000000, double:-0.25)
            double r8 = r8 * r0
            double r8 = java.lang.Math.exp(r8)     // Catch:{ all -> 0x03e3 }
            long r2 = r10.A01     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r8 = r8 * r0
            double r8 = r8 * r14
            double r8 = r8 * r16
            long r2 = r10.A01     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r2     // Catch:{ all -> 0x03e3 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x03e3 }
            double r0 = r0 * r8
            double r21 = r21 + r0
            double r6 = r6 + r8
            r32[r18] = r8     // Catch:{ all -> 0x03e3 }
            int r18 = r18 + 1
            goto L_0x02e6
        L_0x034c:
            double r27 = r27 / r11
            double r2 = java.lang.Math.exp(r27)     // Catch:{ all -> 0x03e3 }
            long r0 = (long) r2     // Catch:{ all -> 0x03e3 }
            r19 = r0
            double r21 = r21 / r6
            double r0 = java.lang.Math.exp(r21)     // Catch:{ all -> 0x03e3 }
            long r14 = (long) r0     // Catch:{ all -> 0x03e3 }
            java.util.Iterator r16 = r35.iterator()     // Catch:{ all -> 0x03e3 }
            r4 = -1
            r10 = 0
        L_0x0363:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03e3 }
            r45 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0388
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x03e3 }
            X.BRZ r0 = (X.BRZ) r0     // Catch:{ all -> 0x03e3 }
            double r2 = (double) r4     // Catch:{ all -> 0x03e3 }
            r8 = r31[r10]     // Catch:{ all -> 0x03e3 }
            long r0 = r0.A00     // Catch:{ all -> 0x03e3 }
            long r0 = r0 - r19
            long r0 = r0 / r45
            double r4 = (double) r0     // Catch:{ all -> 0x03e3 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r4, r0)     // Catch:{ all -> 0x03e3 }
            double r8 = r8 * r0
            double r8 = r8 / r11
            double r2 = r2 + r8
            long r4 = (long) r2     // Catch:{ all -> 0x03e3 }
            int r10 = r10 + 1
            goto L_0x0363
        L_0x0388:
            java.util.Iterator r18 = r34.iterator()     // Catch:{ all -> 0x03e3 }
            r0 = -1
            r10 = 0
        L_0x038f:
            boolean r2 = r18.hasNext()     // Catch:{ all -> 0x03e3 }
            if (r2 == 0) goto L_0x03b2
            java.lang.Object r8 = r18.next()     // Catch:{ all -> 0x03e3 }
            X.BRa r8 = (X.C22822BRa) r8     // Catch:{ all -> 0x03e3 }
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            r16 = r32[r10]     // Catch:{ all -> 0x03e3 }
            long r0 = r8.A01     // Catch:{ all -> 0x03e3 }
            long r0 = r0 - r14
            double r8 = (double) r0     // Catch:{ all -> 0x03e3 }
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r8, r0)     // Catch:{ all -> 0x03e3 }
            double r16 = r16 * r0
            double r16 = r16 / r6
            double r2 = r2 + r16
            long r0 = (long) r2     // Catch:{ all -> 0x03e3 }
            int r10 = r10 + 1
            goto L_0x038f
        L_0x03b2:
            double r2 = (double) r0     // Catch:{ all -> 0x03e3 }
            double r0 = java.lang.Math.sqrt(r2)     // Catch:{ all -> 0x03e3 }
            long r8 = (long) r0     // Catch:{ all -> 0x03e3 }
            double r0 = (double) r4     // Catch:{ all -> 0x03e3 }
            double r2 = java.lang.Math.sqrt(r0)     // Catch:{ all -> 0x03e3 }
            long r0 = (long) r2     // Catch:{ all -> 0x03e3 }
            long r45 = r45 * r0
            long r0 = (long) r6     // Catch:{ all -> 0x03e3 }
            long r3 = (long) r11     // Catch:{ all -> 0x03e3 }
            int r5 = r35.size()     // Catch:{ all -> 0x03e3 }
            int r2 = r34.size()     // Catch:{ all -> 0x03e3 }
            int r5 = r5 + r2
            int r5 = r5 / 2
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03e3 }
            r34 = r2
            r35 = r14
            r37 = r0
            r39 = r8
            r41 = r19
            r43 = r3
            r47 = r5
            r34.<init>(r35, r37, r39, r41, r43, r45, r47, r48)     // Catch:{ all -> 0x03e3 }
            r13.A00 = r2     // Catch:{ all -> 0x03e3 }
            goto L_0x03ed
        L_0x03e3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03f6 }
        L_0x03e5:
            com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate r2 = new com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate     // Catch:{ all -> 0x03f6 }
            r2.<init>()     // Catch:{ all -> 0x03f6 }
            r13.A00 = r2     // Catch:{ all -> 0x03f6 }
            goto L_0x03f0
        L_0x03ed:
            r0 = 1
            if (r50 == 0) goto L_0x03f1
        L_0x03f0:
            r0 = 0
        L_0x03f1:
            r13.A03 = r0     // Catch:{ all -> 0x03f6 }
        L_0x03f3:
            monitor-exit(r13)     // Catch:{ all -> 0x03f9 }
            monitor-exit(r33)
            return r2
        L_0x03f6:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x03f9 }
            throw r0     // Catch:{ all -> 0x03f9 }
        L_0x03f9:
            r0 = move-exception
            monitor-exit(r33)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25682CkD.A00(com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration):com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate");
    }

    public C25682CkD(C28617EAp eAp) {
        this();
        this.A06 = eAp;
    }

    public C25682CkD() {
        this.A02 = -1;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = new C25737Cl7();
        this.A05 = new C25580CiK(C28617EAp.A00);
    }
}
