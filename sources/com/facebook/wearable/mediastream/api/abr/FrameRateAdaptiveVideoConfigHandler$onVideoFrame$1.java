package com.facebook.wearable.mediastream.api.abr;

import X.AnonymousClass1OS;
import X.C25625Cj5;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1", f = "FrameRateAdaptiveVideoConfigHandler.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
public final class FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C25625Cj5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(C25625Cj5 cj5, C30391dr r3) {
        super(2, r3);
        this.this$0 = cj5;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0315  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.1g4 r18 = X.C31751g4.COROUTINE_SUSPENDED
            r15 = r19
            int r1 = r15.label
            r17 = 1
            if (r1 == 0) goto L_0x0342
            r0 = r17
            if (r1 != r0) goto L_0x034a
            X.C30691eM.A01(r20)
        L_0x0011:
            X.Cj5 r9 = r15.this$0
            int r7 = r9.A02
            double r4 = (double) r7
            long r2 = r9.A0H
            double r0 = (double) r2
            double r2 = r4 / r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r0
            X.BTZ r0 = r9.A03
            int r6 = r0.A02
            double r0 = (double) r6
            double r2 = r2 / r0
            X.Cn1 r8 = X.C24712CGy.A01
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Computed throughput. latency: "
            r11.append(r0)
            X.Cii r10 = r9.A04
            long r0 = r10.A00
            r11.append(r0)
            java.lang.String r0 = " ms, drift: "
            r11.append(r0)
            long r0 = r10.A01
            r11.append(r0)
            java.lang.String r0 = " ms, ratio: "
            r11.append(r0)
            X.BE8.A1D(r11, r7)
            r11.append(r6)
            java.lang.String r0 = " = "
            r11.append(r0)
            r11.append(r2)
            java.lang.String r0 = r11.toString()
            java.lang.String r13 = "sup:FrameRateAdaptiveVideoConfigHandler"
            r8.A03(r13, r0)
            r0 = 0
            r9.A02 = r0
            long r0 = r10.A01
            long r6 = r10.A05
            int r11 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ce
            long r6 = r10.A00
            r11 = 0
            int r10 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ce
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r4 = "High latency drift: "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = "ms"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r5)
            r8.A03(r13, r0)
            double r0 = r9.A09
            double r2 = r2 * r0
        L_0x008a:
            int r4 = r9.A01
            r0 = 0
            if (r4 <= r0) goto L_0x0090
            r4 = 0
        L_0x0090:
            int r4 = r4 - r17
            r9.A01 = r4
            int r0 = r9.A0D
            int r0 = r4 % r0
            java.lang.String r11 = "handleCongestion - offset ["
            if (r0 == 0) goto L_0x0178
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            r1.append(r4)
        L_0x00a3:
            java.lang.String r0 = "] :: no change required"
        L_0x00a5:
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r8.A03(r13, r0)
        L_0x00ac:
            X.BTZ r3 = r9.A03
        L_0x00ae:
            r9.A03 = r3
            X.Cj5 r0 = r15.this$0
            X.1Di r1 = r0.A06
            X.BTZ r0 = r0.A03
            r1.invoke(r0)
        L_0x00b9:
            X.Cj5 r1 = r15.this$0
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0347
            long r1 = r1.A0H
            r0 = r17
            r15.label = r0
            java.lang.Object r1 = X.C62882s9.A00(r15, r1)
            r0 = r18
            if (r1 != r0) goto L_0x0011
            return r18
        L_0x00ce:
            double r0 = r9.A09
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 - r0
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0311
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0311
            int r0 = r9.A01
            int r7 = r0 + 1
            r9.A01 = r7
            int r12 = r9.A0G
            java.lang.String r16 = "handleNormalThroughput - offset ["
            if (r7 < r12) goto L_0x0308
            int r0 = r7 % r12
            if (r0 != 0) goto L_0x0308
            int r14 = r9.A0E
            double r5 = r9.A0B
            X.BTZ r0 = r9.A03
            int r4 = r0.A00
            double r0 = (double) r4
            double r5 = r5 * r0
            X.Cii r10 = r9.A04
            long r0 = r10.A01
            double r2 = (double) r0
            long r10 = r10.A05
            double r0 = (double) r10
            double r2 = r2 / r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            double r5 = r5 * r0
            int r0 = (int) r5
            if (r14 >= r0) goto L_0x0106
            r14 = r0
        L_0x0106:
            int r0 = r7 / r12
            int r0 = r0 + -1
            double r2 = (double) r0
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            double r2 = (double) r14
            double r2 = r2 * r0
            int r5 = (int) r2
            int r2 = r9.A0F
            if (r5 <= r2) goto L_0x0119
            r5 = r2
        L_0x0119:
            int r4 = r4 + r5
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r16)
            r3.append(r7)
            java.lang.String r2 = "] :: multiplier ("
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = ") // current bitrate: "
            r3.append(r0)
            X.BTZ r0 = r9.A03
            int r0 = r0.A00
            r3.append(r0)
            java.lang.String r0 = " // adjusted bitrate: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = " //  increment bitrate: "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = " // new bitrate: "
            r3.append(r0)
            X.0vl r2 = r9.A0L
            java.lang.Object r0 = r2.getValue()
            X.CcE r0 = (X.C25269CcE) r0
            X.BTZ r0 = r0.A03()
            int r1 = r0.A00
            r0 = r4
            if (r4 <= r1) goto L_0x015c
            r0 = r1
        L_0x015c:
            java.lang.String r0 = X.C17880vN.A0t(r3, r0)
            r8.A03(r13, r0)
            java.lang.Object r0 = r2.getValue()
            X.CcE r0 = (X.C25269CcE) r0
            X.BTZ r0 = r0.A03()
            int r0 = r0.A00
            if (r4 <= r0) goto L_0x0172
            r4 = r0
        L_0x0172:
            java.lang.Object r5 = r2.getValue()
            goto L_0x0202
        L_0x0178:
            double r0 = r9.A0A
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0183
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
        L_0x0183:
            X.0vl r6 = r9.A0K
            java.lang.Object r7 = r6.getValue()
            X.CcE r7 = (X.C25269CcE) r7
            X.BTZ r0 = r9.A03
            int r0 = r0.A00
            double r0 = (double) r0
            double r0 = r0 * r2
            int r5 = (int) r0
            int r0 = r9.A00
            int r4 = r0 + 1
            X.0vl r7 = r7.A00
            java.util.List r0 = X.AnonymousClass3MW.A11(r7)
            int r0 = r0.size()
            java.lang.String r1 = "sup:BaseBitrateLadderProvider"
            if (r4 != r0) goto L_0x02a9
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Already at lowest rung! Using bitrate: "
        L_0x01aa:
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r10, r5)
            r8.A03(r1, r0)
        L_0x01b1:
            X.0vl r0 = r9.A0L
            java.lang.Object r0 = r0.getValue()
            X.CcE r0 = (X.C25269CcE) r0
            X.BTZ r0 = r0.A03()
            int r0 = r0.A00
            if (r5 <= r0) goto L_0x01c2
            r5 = r0
        L_0x01c2:
            X.BTZ r0 = r9.A03
            int r7 = r0.A00
            int r0 = r9.A0C
            int r0 = r7 - r0
            r4 = r5
            if (r5 >= r0) goto L_0x01ce
            r4 = r0
        L_0x01ce:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            int r0 = r9.A01
            r1.append(r0)
            java.lang.String r0 = "] :: current bitrate: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " // bitrate adjustment percent: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " // computed bitrate: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " // new bitrate: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            r8.A03(r13, r0)
            X.BTZ r0 = r9.A03
            int r0 = r0.A00
            if (r4 > r0) goto L_0x00ac
            java.lang.Object r5 = r6.getValue()
        L_0x0202:
            X.CcE r5 = (X.C25269CcE) r5
            java.lang.Integer r2 = r9.A05
            r3 = r4
            r0 = r17
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r2, r0)
            java.lang.String r0 = "Checking ladder for rung with max quality: "
            r1.append(r0)
            java.lang.String r0 = X.C24594CAp.A00(r2)
            r1.append(r0)
            java.lang.String r0 = ", Bitrate: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            java.lang.String r7 = "sup:BaseBitrateLadderProvider"
            r8.A03(r7, r0)
            X.0vl r10 = r5.A00
            java.lang.Object r0 = r10.getValue()
            java.util.Iterator r12 = X.AnonymousClass8BR.A13(r0)
        L_0x022e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r6 = r12.next()
            r11 = r6
            X.BTa r11 = (X.C22866BTa) r11
            java.lang.Integer r0 = r11.A05
            int r1 = r0.intValue()
            int r0 = r2.intValue()
            if (r1 < r0) goto L_0x022e
            X.1Oc r0 = r11.A06
            int r0 = r0.A00
            if (r0 > r4) goto L_0x022e
        L_0x024d:
            X.BTa r6 = (X.C22866BTa) r6
            if (r6 != 0) goto L_0x025b
            java.util.List r0 = X.AnonymousClass3MW.A11(r10)
            java.lang.Object r6 = X.C29431cG.A0d(r0)
            X.BTa r6 = (X.C22866BTa) r6
        L_0x025b:
            X.1Oc r2 = r6.A06
            int r0 = r2.A00
            if (r4 >= r0) goto L_0x0262
            r3 = r0
        L_0x0262:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Using Rung: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " and max bitrate "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            r8.A03(r7, r0)
            java.lang.Integer r1 = r5.A04()
            int r0 = r2.A01
            if (r0 <= r3) goto L_0x0280
            r0 = r3
        L_0x0280:
            X.BTZ r3 = X.C24593CAo.A00(r6, r1, r0)
            int r0 = r5.A01(r4)
            r9.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "checkConfig - Adjusted Video Format = "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)
            r8.A03(r13, r0)
            int r2 = r3.A02
            X.BTZ r0 = r9.A03
            int r1 = r0.A02
            if (r2 <= r1) goto L_0x00ae
            int r0 = r9.A02
            int r2 = r2 - r1
            int r0 = r0 + r2
            r9.A02 = r0
            goto L_0x00ae
        L_0x02a7:
            r6 = 0
            goto L_0x024d
        L_0x02a9:
            java.util.List r0 = X.AnonymousClass3MW.A11(r7)
            java.lang.Object r0 = r0.get(r4)
            X.BTa r0 = (X.C22866BTa) r0
            X.1Oc r10 = r0.A06
            int r0 = r10.A00
            if (r0 > r5) goto L_0x02d5
            int r0 = r10.A01
            if (r5 > r0) goto L_0x02d5
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Using next lower rung: "
            r10.append(r0)
            java.util.List r0 = X.AnonymousClass3MW.A11(r7)
            java.lang.Object r0 = r0.get(r4)
            r10.append(r0)
            java.lang.String r0 = " and bitrate "
            goto L_0x01aa
        L_0x02d5:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Attempted to move one than one step down! Using next lower rung "
            r10.append(r0)
            java.util.List r0 = X.AnonymousClass3MW.A11(r7)
            java.lang.Object r0 = r0.get(r4)
            r10.append(r0)
            java.lang.String r0 = " average bitrate"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r10)
            r8.A03(r1, r0)
            java.util.List r0 = X.AnonymousClass3MW.A11(r7)
            java.lang.Object r0 = r0.get(r4)
            X.BTa r0 = (X.C22866BTa) r0
            X.1Oc r0 = r0.A06
            double r0 = X.C29431cG.A0T(r0)
            int r4 = (int) r0
            if (r5 >= r4) goto L_0x01b1
            r5 = r4
            goto L_0x01b1
        L_0x0308:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r16)
            r1.append(r7)
            goto L_0x00a3
        L_0x0311:
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x008a
            int r2 = r9.A01
            int r1 = r9.A0G
            int r0 = r1 + -1
            if (r2 < r0) goto L_0x0322
            int r0 = r2 + 1
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x032a
        L_0x0322:
            r0 = -1
            if (r2 >= r0) goto L_0x0326
            r2 = -1
        L_0x0326:
            int r2 = r2 + 1
            r9.A01 = r2
        L_0x032a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "handleHighThroughput - offset ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] :: Received video frames {"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "} within the threshold, so not updating bitrate."
            goto L_0x00a5
        L_0x0342:
            X.C30691eM.A01(r20)
            goto L_0x00b9
        L_0x0347:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x034a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.mediastream.api.abr.FrameRateAdaptiveVideoConfigHandler$onVideoFrame$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
