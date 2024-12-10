package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CkU  reason: case insensitive filesystem */
public class C25699CkU {
    public C28409E0a A00;
    public C26725DBb A01;
    public CN7 A02;
    public final C26029Cqn A03;
    public final C26185Cu9 A04;
    public final CTJ A05;
    public final C27066DRp A06;
    public final CAC A07;
    public final AtomicBoolean A08;
    public final AtomicBoolean A09;
    public final Context A0A;
    public final C91 A0B;
    public final C24788CKh A0C;
    public final E1O A0D;
    public final ServiceEventCallbackImpl A0E;
    public final E1P A0F;
    public final Map A0G;
    public final AtomicReference A0H;
    public final AtomicReference A0I;

    public static CRF A00(C25238CbZ cbZ) {
        CRF crf = new CRF();
        D47 d47 = cbZ.A0C;
        boolean A1S = BE8.A1S(d47.A0O ? 1 : 0);
        synchronized (crf) {
            crf.A02 = A1S;
        }
        synchronized (crf) {
        }
        synchronized (crf) {
        }
        boolean z = d47.A0P;
        synchronized (crf) {
            crf.A03 = z;
        }
        String str = d47.A0B;
        synchronized (crf) {
            crf.A00 = str;
        }
        String str2 = d47.A0C;
        synchronized (crf) {
            crf.A01 = str2;
        }
        synchronized (crf) {
        }
        synchronized (crf) {
        }
        Uri uri = d47.A05;
        if (uri != null) {
            uri.getHost();
            synchronized (crf) {
            }
        }
        synchronized (crf) {
        }
        return crf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c0, code lost:
        if (X.BE9.A0E("dash.use_play_when_ready_for_load_control", r6) == 0) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.EAG A01(X.C25238CbZ r54, X.C27064DRk r55, java.util.concurrent.atomic.AtomicBoolean r56, java.util.concurrent.atomic.AtomicBoolean r57) {
        /*
            r53 = this;
            r4 = r54
            X.D47 r3 = r4.A0C
            boolean r8 = r4.A0D
            r2 = r53
            X.DRp r0 = r2.A06
            boolean r1 = r0.useWAPlayerPoolLoadControl
            if (r1 == 0) goto L_0x0044
            if (r8 == 0) goto L_0x0044
            boolean r1 = r4.A0E
            if (r1 == 0) goto L_0x0044
            r0 = 32768(0x8000, float:4.5918E-41)
            X.CbB r4 = new X.CbB
            r4.<init>(r0)
            r5 = 700(0x2bc, float:9.81E-43)
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 100
            java.lang.String r3 = "bufferForPlaybackMs"
            java.lang.String r2 = "0"
            r1 = 0
            X.C26656D8f.A00(r7, r1, r3, r2)
            java.lang.String r0 = "bufferForPlaybackAfterRebufferMs"
            X.C26656D8f.A00(r7, r1, r0, r2)
            java.lang.String r1 = "minBufferMs"
            X.C26656D8f.A00(r5, r7, r1, r3)
            X.C26656D8f.A00(r5, r7, r1, r0)
            java.lang.String r0 = "maxBufferMs"
            X.C26656D8f.A00(r6, r5, r0, r1)
            r9 = -1
            X.D8f r3 = new X.D8f
            r8 = r7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0044:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r4 = r0.sdkVersionToUseDefaultLoadControl
            if (r1 >= r4) goto L_0x00a2
            if (r8 == 0) goto L_0x009c
            int r2 = r0.sdkVersionToUseConservativeLoadControl
            if (r1 >= r2) goto L_0x009c
            int r2 = r0.sdKVersionToUseCustomizedBuffering
            if (r1 > r2) goto L_0x0090
            int r2 = r0.customizedWAIndividualAllocationSize
            int r7 = r0.minCustomizedWABufferMs
            int r8 = r0.maxCustomizedWABufferMs
            int r9 = r0.customizedWABufferForPlaybackMs
            int r10 = r0.customizedWARebufferMs
        L_0x005e:
            X.CbB r6 = new X.CbB
            r6.<init>(r2)
            r11 = -1
            java.lang.String r5 = "bufferForPlaybackMs"
            java.lang.String r4 = "0"
            r3 = 0
            X.C26656D8f.A00(r9, r3, r5, r4)
            java.lang.String r2 = "bufferForPlaybackAfterRebufferMs"
            X.C26656D8f.A00(r10, r3, r2, r4)
            java.lang.String r3 = "minBufferMs"
            X.C26656D8f.A00(r7, r9, r3, r5)
            X.C26656D8f.A00(r7, r10, r3, r2)
            java.lang.String r2 = "maxBufferMs"
            X.C26656D8f.A00(r8, r7, r2, r3)
            int r2 = r0.sdKVersionToUseTargetBufferOverwrite
            if (r2 <= 0) goto L_0x0089
            if (r1 > r2) goto L_0x0089
            int r0 = r0.targetBytesForOverwrite
            if (r0 <= 0) goto L_0x0089
            r11 = r0
        L_0x0089:
            X.D8f r3 = new X.D8f
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r3
        L_0x0090:
            r7 = 1000(0x3e8, float:1.401E-42)
            r8 = 2000(0x7d0, float:2.803E-42)
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 1000(0x3e8, float:1.401E-42)
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x005e
        L_0x009c:
            X.D8f r3 = new X.D8f
            r3.<init>()
            return r3
        L_0x00a2:
            r40 = 0
            r24 = -1
            r17 = r40
            r30 = 0
            r4 = r55
            int r11 = r4.minBufferMs
            int r10 = r4.minRebufferMs
            java.util.Map r6 = r2.A0G
            java.lang.String r5 = "dash.use_play_when_ready_for_load_control"
            boolean r4 = r6.containsKey(r5)
            if (r4 == 0) goto L_0x00c2
            int r4 = X.BE9.A0E(r5, r6)
            r29 = 1
            if (r4 != 0) goto L_0x00c4
        L_0x00c2:
            r29 = 0
        L_0x00c4:
            X.C91 r4 = r2.A0B
            r16 = r4
            X.Cu9 r6 = r2.A04
            X.CKh r4 = r2.A0C
            r18 = r4
            X.DRj r12 = r0.intentBasedBufferingConfig
            int r9 = r0.playerWarmUpWatermarkMs
            int r7 = r0.dashLowWatermarkMs
            int r5 = r0.dashHighWatermarkMs
            boolean r4 = r0.useCellMaxWaterMarkMsConfig
            X.CkH r31 = new X.CkH
            r20 = r56
            r21 = r57
            r32 = r6
            r33 = r12
            r34 = r20
            r35 = r21
            r36 = r9
            r37 = r7
            r38 = r5
            r39 = r4
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            android.net.Uri r4 = r3.A05
            boolean r4 = X.C93.A00(r4)
            if (r4 != 0) goto L_0x010a
            java.lang.Integer r5 = r3.A07
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            boolean r4 = X.AnonymousClass3Ma.A1Z(r5, r4)
            X.C26056CrS.A02(r4)
            java.lang.String r4 = r3.A0A
            if (r4 == 0) goto L_0x010a
            r17 = r31
        L_0x010a:
            int r4 = r0.sdKVersionToUseCustomizedBuffering
            boolean r9 = X.BE8.A1U(r1, r4)
            if (r8 == 0) goto L_0x0226
            if (r9 == 0) goto L_0x0221
            int r4 = r0.customizedWAIndividualAllocationSize
        L_0x0116:
            X.CbB r13 = new X.CbB
            r13.<init>(r4)
            java.lang.Integer r5 = r3.A07
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            if (r5 != r4) goto L_0x012d
            boolean r7 = r0.useWatermarkEvaluatorForProgressive
            if (r7 == 0) goto L_0x0127
            r17 = r31
        L_0x0127:
            boolean r7 = r0.useMaxBufferForProgressive
            if (r7 != 0) goto L_0x012d
            r24 = 2097152(0x200000, float:2.938736E-39)
        L_0x012d:
            if (r8 == 0) goto L_0x0158
            int r7 = r0.sdkVersionToUseConservativeLoadControl
            if (r1 >= r7) goto L_0x0158
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r9 == 0) goto L_0x0219
            int r11 = r0.customizedWABufferForPlaybackMs
            int r10 = r0.customizedWARebufferMs
            int r7 = r0.minCustomizedWABufferMs
            int r1 = r0.maxCustomizedWABufferMs
        L_0x013f:
            java.util.concurrent.atomic.AtomicBoolean r42 = X.BE6.A16(r30)
            java.util.concurrent.atomic.AtomicBoolean r43 = X.BE6.A16(r30)
            r44 = 1000(0x3e8, float:1.401E-42)
            X.CkH r17 = new X.CkH
            r39 = r17
            r41 = r40
            r45 = r7
            r46 = r1
            r47 = r30
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47)
        L_0x0158:
            boolean r1 = r0.disableCapBufferSizeLocalProgressive
            if (r1 == 0) goto L_0x0215
            if (r5 == r4) goto L_0x0166
            android.net.Uri r1 = r3.A05
            boolean r1 = X.C93.A00(r1)
            if (r1 == 0) goto L_0x0215
        L_0x0166:
            r9 = 1
        L_0x0167:
            int r8 = r0.videoBufferSize
            int r7 = r0.audioBufferSize
            boolean r1 = r0.enableMemoryAwareBufferSizeUsingRed
            if (r1 == 0) goto L_0x0212
            java.util.concurrent.atomic.AtomicReference r1 = r2.A0I
            if (r1 == 0) goto L_0x017b
            java.lang.Object r4 = r1.get()
            X.C0W r1 = X.C0W.RED
            if (r4 == r1) goto L_0x0187
        L_0x017b:
            java.util.concurrent.atomic.AtomicReference r1 = r2.A0H
            if (r1 == 0) goto L_0x0212
            java.lang.Object r4 = r1.get()
            X.C0W r1 = X.C0W.RED
            if (r4 != r1) goto L_0x0212
        L_0x0187:
            r5 = 1
        L_0x0188:
            boolean r1 = r0.enableMemoryAwareBufferSizeUsingYellow
            if (r1 == 0) goto L_0x0210
            java.util.concurrent.atomic.AtomicReference r1 = r2.A0I
            if (r1 == 0) goto L_0x0198
            java.lang.Object r4 = r1.get()
            X.C0W r1 = X.C0W.YELLOW
            if (r4 == r1) goto L_0x01a4
        L_0x0198:
            java.util.concurrent.atomic.AtomicReference r1 = r2.A0H
            if (r1 == 0) goto L_0x0210
            java.lang.Object r2 = r1.get()
            X.C0W r1 = X.C0W.YELLOW
            if (r2 != r1) goto L_0x0210
        L_0x01a4:
            r1 = 1
        L_0x01a5:
            if (r5 != 0) goto L_0x01a9
            if (r1 == 0) goto L_0x01b1
        L_0x01a9:
            double r1 = (double) r8
            double r4 = r0.redMemoryBufferSizeMultiplier
            double r1 = r1 * r4
            int r8 = (int) r1
            double r1 = (double) r7
            double r1 = r1 * r4
            int r7 = (int) r1
        L_0x01b1:
            boolean r15 = r0.useHeroBufferSize
            java.lang.String r2 = r3.A0B
            java.lang.String r1 = "fb_stories"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x01c3
            boolean r1 = r0.disableStoriesCustomizedUnstallBuffer
            if (r1 != 0) goto L_0x01c3
            r30 = 1
        L_0x01c3:
            boolean r14 = r0.updateUnstallBufferDuringPlayback
            boolean r12 = r0.reportUnexpectedStopLoading
            boolean r4 = r0.forceMinWatermarkGreaterThanMinRebuffer
            boolean r2 = r0.bypassGreaterThanMinRebufferWhenBeforePlay
            boolean r1 = r0.useMaxOfLowWatermarkOrPrevHighWaterMarkWhenForced
            java.lang.String r5 = r3.A0H
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x022a
            boolean r0 = r0.useAdAwareLoadControl
            if (r0 == 0) goto L_0x022a
            X.D8e r0 = X.C26655D8e.$redex_init_class
            r0 = 1
            if (r17 != 0) goto L_0x01e3
            X.CkH r17 = new X.CkH
            r17.<init>()
        L_0x01e3:
            if (r6 != 0) goto L_0x01e6
            r0 = 0
        L_0x01e6:
            X.C26056CrS.A02(r0)
            X.D8g r5 = new X.D8g
            r22 = r11
            r23 = r10
            r25 = r8
            r26 = r7
            r27 = r15
            r28 = r9
            r31 = r14
            r32 = r12
            r33 = r4
            r34 = r1
            r35 = r2
            r19 = r6
            r14 = r5
            r15 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.Ch0 r1 = X.Ch0.A01
            X.D8e r0 = new X.D8e
            r0.<init>(r5, r3, r1)
            return r0
        L_0x0210:
            r1 = 0
            goto L_0x01a5
        L_0x0212:
            r5 = 0
            goto L_0x0188
        L_0x0215:
            boolean r9 = r0.prioritizeTimeOverSizeThresholds
            goto L_0x0167
        L_0x0219:
            r11 = 1000(0x3e8, float:1.401E-42)
            r10 = 1000(0x3e8, float:1.401E-42)
            r1 = 2000(0x7d0, float:2.803E-42)
            goto L_0x013f
        L_0x0221:
            r4 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0116
        L_0x0226:
            r4 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0116
        L_0x022a:
            r0 = 1
            if (r17 != 0) goto L_0x0232
            X.CkH r17 = new X.CkH
            r17.<init>()
        L_0x0232:
            if (r6 != 0) goto L_0x0235
            r0 = 0
        L_0x0235:
            X.C26056CrS.A02(r0)
            X.D8g r0 = new X.D8g
            r31 = r0
            r32 = r13
            r33 = r16
            r34 = r17
            r35 = r18
            r36 = r6
            r37 = r20
            r38 = r21
            r39 = r11
            r40 = r10
            r41 = r24
            r42 = r8
            r43 = r7
            r44 = r15
            r45 = r9
            r46 = r29
            r47 = r30
            r48 = r14
            r49 = r12
            r50 = r4
            r51 = r1
            r52 = r2
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25699CkU.A01(X.CbZ, X.DRk, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicBoolean):X.EAG");
    }

    public C25699CkU(Context context, C26029Cqn cqn, E1O e1o, C25018CTu cTu, ServiceEventCallbackImpl serviceEventCallbackImpl, E1P e1p, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A0A = context;
        this.A0G = map;
        C27066DRp dRp = cTu.A05;
        this.A06 = dRp;
        C26185Cu9 cu9 = (C26185Cu9) cTu.A08.get();
        this.A04 = cu9;
        this.A0E = serviceEventCallbackImpl;
        CAC cac = cTu.A06;
        this.A07 = cac;
        this.A0F = e1p;
        C26029Cqn cqn2 = cqn;
        this.A05 = new CTJ(context, cqn2, new DGJ(), cu9, serviceEventCallbackImpl, dRp, cac);
        this.A0B = cTu.A02;
        this.A03 = cqn;
        this.A09 = atomicBoolean;
        this.A08 = atomicBoolean2;
        this.A0C = (C24788CKh) cTu.A07.get();
        this.A0D = e1o;
        this.A0I = cTu.A01;
        this.A0H = cTu.A00;
    }
}
