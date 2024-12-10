package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.DHc  reason: case insensitive filesystem */
public class C26871DHc implements EAT {
    public int A00;
    public long A01;
    public C25092CXd A02;
    public C25752ClM A03;
    public CRT A04;
    public C24464C5e A05;
    public C27340DcC A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final Context A0E;
    public final E7q A0F;
    public final C25820CmX A0G;
    public final E55 A0H;
    public final CAM A0I;
    public final CUT A0J;
    public final E7t A0K;
    public final E56 A0L;
    public final ExecutorService A0M;
    public volatile long A0N;
    public volatile C28609EAd A0O;
    public volatile EAS A0P;
    public volatile Future A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;
    public volatile boolean A0T;

    private void A04() {
        CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture", new Object[0]);
        if (this.A0Q != null && !this.A0Q.isDone()) {
            C27340DcC dcC = this.A06;
            if (dcC.mEnableThreadLockSync) {
                CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.isEnabled", new Object[0]);
                this.A0T = true;
                try {
                    long j = this.A01;
                    if (j >= 0) {
                        this.A0Q.get(j, TimeUnit.MILLISECONDS);
                    } else {
                        this.A0Q.get();
                    }
                } catch (Throwable th) {
                    CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th);
                }
                if (dcC.mEnableThreadLockSync) {
                    dcC.lock();
                }
                try {
                    CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.open", new Object[0]);
                    dcC.close();
                    CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock done", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            } else {
                CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture: mExtractFuture.cancel", new Object[0]);
                this.A0Q.cancel(true);
                try {
                    this.A0Q.get();
                    return;
                } catch (Throwable th3) {
                    CAF.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th3);
                    return;
                }
            }
        } else {
            return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x020d A[EDGE_INSN: B:135:0x020d->B:113:0x020d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea A[SYNTHETIC, Splitter:B:50:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ff A[Catch:{ Exception -> 0x0105 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BFX(int r20) {
        /*
            r19 = this;
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r0 = "configure"
            java.lang.String r7 = "VideoDemuxDecodeWrapperTag"
            X.CAF.A00(r7, r0, r1)
            r10 = r19
            r11 = r20
            r10.A00 = r11
            X.E55 r3 = r10.A0H
            X.E7q r1 = r10.A0F
            X.CAM r0 = r10.A0I
            X.CUT r4 = r10.A0J
            X.CZT r2 = r4.A08
            X.EAd r0 = r3.BGD(r1, r0, r2)
            r10.A0O = r0
            X.E7t r0 = r10.A0K
            X.EAS r0 = r0.BHI()
            r10.A0P = r0
            X.EAd r0 = r10.A0O
            X.C25327CdY.A01(r0, r4)
            X.EAd r1 = r10.A0O
            X.BzJ r0 = X.C24322BzJ.VIDEO
            r1.CHF(r0, r11)
            boolean r0 = X.C25872Cng.A02(r4)
            if (r0 != 0) goto L_0x0050
            X.EAd r0 = r10.A0O
            X.CXd r3 = r0.BUc()
            r10.A02 = r3
            X.ClM r1 = r4.A04
            int r0 = r3.A05
            r1.A07 = r0
            int r0 = r3.A03
            r1.A05 = r0
            int r0 = r3.A04
            r1.A06 = r0
        L_0x0050:
            boolean r1 = r2 instanceof X.BWA
            if (r1 == 0) goto L_0x0064
            r0 = r2
            X.BWA r0 = (X.BWA) r0
            X.0ve r3 = r0.A00
            r0 = 12654(0x316e, float:1.7732E-41)
        L_0x005b:
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r3, r0)
            if (r0 == 0) goto L_0x0118
            goto L_0x0072
        L_0x0064:
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x0118
            r0 = r2
            X.BWB r0 = (X.BWB) r0
            X.0ve r3 = r0.A00
            if (r3 == 0) goto L_0x0118
            r0 = 12653(0x316d, float:1.773E-41)
            goto L_0x005b
        L_0x0072:
            X.EAS r3 = r10.A0P     // Catch:{ all -> 0x007f }
            X.EAd r0 = r10.A0O     // Catch:{ all -> 0x007f }
            android.media.MediaFormat r0 = r0.BYV()     // Catch:{ all -> 0x007f }
            r10.A06(r0, r3, r11, r9)     // Catch:{ all -> 0x007f }
            goto L_0x020d
        L_0x007f:
            r17 = move-exception
            if (r1 == 0) goto L_0x00a1
            r0 = r2
            X.BWA r0 = (X.BWA) r0
            X.0ve r3 = r0.A00
            r0 = 12650(0x316a, float:1.7726E-41)
        L_0x0089:
            boolean r0 = X.C18020vd.A05(r4, r3, r0)
            if (r0 == 0) goto L_0x025f
            X.CXd r5 = r10.A02
            if (r5 == 0) goto L_0x025f
            int r0 = r5.A04
            int r0 = r0 % 180
            r3 = 1
            boolean r16 = X.AnonymousClass000.A1O(r0)
            int r8 = r5.A05
            int r12 = r5.A03
            goto L_0x00af
        L_0x00a1:
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x025f
            r0 = r2
            X.BWB r0 = (X.BWB) r0
            X.0ve r3 = r0.A00
            if (r3 == 0) goto L_0x025f
            r0 = 12649(0x3169, float:1.7725E-41)
            goto L_0x0089
        L_0x00af:
            int r5 = r5.A02     // Catch:{ Exception -> 0x025f }
            r0 = 6
            if (r5 == r0) goto L_0x025f
            r0 = 7
            if (r5 == r0) goto L_0x025f
            r6 = 0
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0105 }
            r0 = 29
            if (r5 < r0) goto L_0x01cc
            X.EAd r0 = r10.A0O     // Catch:{ Exception -> 0x0105 }
            android.media.MediaFormat r15 = r0.BYV()     // Catch:{ Exception -> 0x0105 }
            X.C26159CtX.A01(r15)     // Catch:{ Exception -> 0x0105 }
            if (r1 == 0) goto L_0x00ca
            goto L_0x00d8
        L_0x00ca:
            boolean r0 = r2 instanceof X.BWB     // Catch:{ Exception -> 0x0105 }
            if (r0 == 0) goto L_0x00e4
            r0 = r2
            X.BWB r0 = (X.BWB) r0     // Catch:{ Exception -> 0x0105 }
            X.0ve r5 = r0.A00     // Catch:{ Exception -> 0x0105 }
            if (r5 == 0) goto L_0x00e4
            r0 = 12651(0x316b, float:1.7728E-41)
            goto L_0x00df
        L_0x00d8:
            r0 = r2
            X.BWA r0 = (X.BWA) r0     // Catch:{ Exception -> 0x0105 }
            X.0ve r5 = r0.A00     // Catch:{ Exception -> 0x0105 }
            r0 = 12652(0x316c, float:1.7729E-41)
        L_0x00df:
            boolean r0 = X.C18020vd.A05(r4, r5, r0)     // Catch:{ Exception -> 0x0105 }
            goto L_0x00e5
        L_0x00e4:
            r0 = 0
        L_0x00e5:
            r14 = 0
            java.lang.String r13 = "frame-rate"
            if (r0 == 0) goto L_0x00ff
            int r5 = r15.getValueTypeForKey(r13)     // Catch:{ Exception -> 0x0105 }
            r0 = 3
            if (r5 != r0) goto L_0x00f7
            float r0 = r15.getFloat(r13, r14)     // Catch:{ Exception -> 0x0105 }
            goto L_0x01cb
        L_0x00f7:
            if (r5 != r3) goto L_0x01cc
            int r6 = r15.getInteger(r13, r9)     // Catch:{ Exception -> 0x0105 }
            goto L_0x01cc
        L_0x00ff:
            float r0 = r15.getFloat(r13, r14)     // Catch:{ Exception -> 0x0105 }
            goto L_0x01cb
        L_0x0105:
            r13 = move-exception
            java.lang.String r5 = "getInputFrameRate"
            X.EAY r14 = X.C26294Cx6.A01
            r0 = 3
            boolean r0 = r14.BfN(r0)
            if (r0 == 0) goto L_0x01cc
            X.EAY r0 = X.C26294Cx6.A01
            r0.BI0(r7, r5, r13)
            goto L_0x01cc
        L_0x0118:
            X.EAS r13 = r10.A0P
            X.EAd r0 = r10.A0O
            android.media.MediaFormat r6 = r0.BYV()
            if (r13 == 0) goto L_0x020d
            if (r6 == 0) goto L_0x020d
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r0 = 0
        L_0x0129:
            int r5 = r0 + 1
            r8 = 4
            if (r0 >= r8) goto L_0x020d
            r16 = r4
            r17 = r11
            r18 = r9
            r14 = r6
            r15 = r2
            r13.CCN(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x013b }
            goto L_0x020d
        L_0x013b:
            r3 = move-exception
            boolean r0 = r3 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L_0x0177
            if (r5 > r8) goto L_0x0177
            java.lang.String r0 = r3.getMessage()
            if (r0 == 0) goto L_0x0163
            java.lang.String r12 = r3.getMessage()
            java.lang.String r0 = "codec name:"
            boolean r0 = r12.startsWith(r0)
            if (r0 == 0) goto L_0x0163
            java.lang.String r3 = r3.getMessage()
            r0 = 11
            java.lang.String r0 = r3.substring(r0)
            r4.add(r0)
        L_0x0161:
            r0 = r5
            goto L_0x0129
        L_0x0163:
            if (r1 != 0) goto L_0x0161
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x0177
            r0 = r2
            X.BWB r0 = (X.BWB) r0
            X.0ve r0 = r0.A00
            if (r0 == 0) goto L_0x0177
            boolean r0 = X.C1402270m.A02(r0)
            if (r0 == 0) goto L_0x0177
            goto L_0x0161
        L_0x0177:
            boolean r0 = r3 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x01c8
            r0 = r3
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r2 = X.C26171Ctn.A00(r0)
        L_0x0182:
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r9] = r6
            X.AnonymousClass000.A1M(r1, r5)
            java.lang.Object[] r0 = r4.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            X.AnonymousClass001.A1R(r0, r2, r1)
            r1[r8] = r3
            java.lang.String r0 = "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, mediaCodecException=%s, Exception=%s"
            X.CAF.A00(r7, r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "media format:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", number of retries:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", blacklisted decoders:"
            r1.append(r0)
            java.lang.Object[] r0 = r4.toArray()
            X.BE6.A1L(r1, r0)
            java.lang.String r0 = " mediaCodecException: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r3)
            throw r0
        L_0x01c8:
            java.lang.String r2 = "null"
            goto L_0x0182
        L_0x01cb:
            int r6 = (int) r0
        L_0x01cc:
            r0 = -1
            if (r12 <= r0) goto L_0x025f
            if (r8 <= r0) goto L_0x025f
            if (r6 <= 0) goto L_0x025f
            if (r16 == 0) goto L_0x01d6
            r8 = r12
        L_0x01d6:
            if (r1 == 0) goto L_0x0251
            r0 = r2
            X.BWA r0 = (X.BWA) r0
            X.0ve r5 = r0.A00
            r0 = 12605(0x313d, float:1.7663E-41)
        L_0x01df:
            int r0 = X.C18020vd.A00(r4, r5, r0)
            if (r8 > r0) goto L_0x025f
            if (r1 == 0) goto L_0x0243
            r0 = r2
            X.BWA r0 = (X.BWA) r0
            X.0ve r5 = r0.A00
            r0 = 12607(0x313f, float:1.7666E-41)
        L_0x01ee:
            int r0 = X.C18020vd.A00(r4, r5, r0)
            if (r6 > r0) goto L_0x025f
            if (r1 == 0) goto L_0x0236
            X.BWA r2 = (X.BWA) r2
            X.0ve r1 = r2.A00
            r0 = 12598(0x3136, float:1.7654E-41)
        L_0x01fc:
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x025f
            X.EAS r1 = r10.A0P
            X.EAd r0 = r10.A0O
            android.media.MediaFormat r0 = r0.BYV()
            r10.A06(r0, r1, r11, r3)
        L_0x020d:
            X.C5e r0 = r10.A02()
            r10.A05 = r0
            X.CRT r0 = r10.A01()
            r10.A04 = r0
            X.CmX r1 = r10.A0G
            X.EAS r0 = r10.A0P
            java.lang.String r0 = r0.BQM()
            r1.A0G = r0
            X.EAS r0 = r10.A0P
            java.lang.String r0 = r0.BQK()
            r1.A0F = r0
            r0 = 1
            r10.A09 = r0
            java.lang.String r1 = "configure: mIsConfigured done"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.CAF.A00(r7, r1, r0)
            return
        L_0x0236:
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x025f
            X.BWB r2 = (X.BWB) r2
            X.0ve r1 = r2.A00
            if (r1 == 0) goto L_0x025f
            r0 = 12597(0x3135, float:1.7652E-41)
            goto L_0x01fc
        L_0x0243:
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x025f
            r0 = r2
            X.BWB r0 = (X.BWB) r0
            X.0ve r5 = r0.A00
            if (r5 == 0) goto L_0x025f
            r0 = 12606(0x313e, float:1.7665E-41)
            goto L_0x01ee
        L_0x0251:
            boolean r0 = r2 instanceof X.BWB
            if (r0 == 0) goto L_0x025f
            r0 = r2
            X.BWB r0 = (X.BWB) r0
            X.0ve r5 = r0.A00
            if (r5 == 0) goto L_0x025f
            r0 = 12604(0x313c, float:1.7662E-41)
            goto L_0x01df
        L_0x025f:
            throw r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26871DHc.BFX(int):void");
    }

    public void CRW(A5W a5w) {
        CAF.A00("VideoDemuxDecodeWrapperTag", "updateTrim", new Object[0]);
        A04();
        this.A0O.CRX(a5w);
        this.A0A = false;
    }

    private long A00(long j) {
        C24464C5e c5e = this.A05;
        if (c5e == null || j < 0) {
            return j;
        }
        if (!c5e.A04) {
            c5e.A00 = c5e.A03.A00(TimeUnit.MICROSECONDS, j);
            c5e.A04 = true;
        }
        c5e.A01 = (long) (((float) c5e.A01) + (((float) (j - c5e.A02)) / c5e.A00));
        c5e.A00 = c5e.A03.A00(TimeUnit.MICROSECONDS, j);
        c5e.A02 = j;
        return c5e.A01;
    }

    private CRT A01() {
        C26052CrM crM = this.A0J.A06;
        if (crM == null) {
            return null;
        }
        CRT crt = new CRT(crM);
        C24322BzJ bzJ = C24322BzJ.VIDEO;
        int i = this.A00;
        crt.A00 = bzJ;
        C25833Cmm A032 = crt.A03.A03(bzJ, i);
        crt.A01 = A032;
        if (A032 != null) {
            Iterator A0y = AnonymousClass8BV.A0y(A032.A06);
            crt.A02 = A0y;
            if (A0y != null && A0y.hasNext()) {
                crt.A02.next();
            }
            return crt;
        }
        throw AnonymousClass000.A0k("Requested Track is not available");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.C5e, java.lang.Object] */
    private C24464C5e A02() {
        C26052CrM crM = this.A0J.A06;
        if (crM == null) {
            return null;
        }
        C25217CbD cbD = new C25217CbD(crM);
        cbD.A01(C24322BzJ.VIDEO, this.A00);
        ? obj = new Object();
        obj.A04 = false;
        obj.A00 = 1.0f;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = cbD;
        return obj;
    }

    private void A05() {
        if (!this.A0B && !this.A0C) {
            CAF.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", BE6.A1Z());
            throw new C2Z("VideoDemuxDecodeWrapper not started");
        }
    }

    private void A06(MediaFormat mediaFormat, EAS eas, int i, boolean z) {
        String str;
        long j;
        C18030ve r0;
        EAS eas2 = eas;
        if (eas != null) {
            MediaFormat mediaFormat2 = mediaFormat;
            if (mediaFormat != null) {
                ArrayList A13 = AnonymousClass000.A13();
                Exception e = null;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break;
                    }
                    try {
                        eas2.CCN(mediaFormat2, this.A0J.A08, A13, i, z);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        if (!(e instanceof IllegalStateException)) {
                            break;
                        }
                        if (e.getMessage() == null || !e.getMessage().startsWith("codec name:")) {
                            CZT czt = this.A0J.A08;
                            if (!(czt instanceof BWA)) {
                                if (!(czt instanceof BWB) || (r0 = ((BWB) czt).A00) == null || !C1402270m.A02(r0)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            A13.add(e.getMessage().substring(11));
                        }
                        i2++;
                    }
                }
                if (e instanceof MediaCodec.CodecException) {
                    str = C26171Ctn.A00((MediaCodec.CodecException) e);
                } else {
                    str = "null";
                }
                ActivityManager activityManager = (ActivityManager) this.A0E.getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                } else {
                    j = -1;
                }
                long j2 = C24737CHz.A02.get();
                long j3 = C24737CHz.A01.get();
                long j4 = C24737CHz.A03.get();
                long j5 = C24737CHz.A00.get();
                Object[] objArr = new Object[11];
                objArr[0] = mediaFormat;
                AnonymousClass000.A1M(objArr, i2);
                objArr[2] = Arrays.toString(A13.toArray());
                AnonymousClass3MX.A1S(objArr, 3, j);
                C17890vO.A1P(objArr, j2);
                AnonymousClass3MX.A1S(objArr, 5, j3);
                AnonymousClass3MX.A1S(objArr, 6, j4);
                AnonymousClass3MX.A1S(objArr, 7, j5);
                C17890vO.A0x(A03(), str, objArr);
                objArr[10] = e;
                CAF.A00("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, availMem=%s, successCreateCodecs=%d, requestReleaseCodecs=%d, successReleaseCodecs=%d, failedReleaseCodecs=%d, badThreads=%s, mediaCodecException=%s, Exception=%s", objArr);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("media format:");
                A10.append(mediaFormat2);
                A10.append(", number of retries:");
                A10.append(i2);
                A10.append(", avail mem:");
                A10.append(j);
                A10.append(", successCreateCodecs:");
                A10.append(j2);
                A10.append(", requestReleaseCodecs:");
                A10.append(j3);
                A10.append(", successReleaseCodecs:");
                A10.append(j4);
                A10.append(", failedReleaseCodecs:");
                A10.append(j5);
                A10.append(", badThreads:");
                A10.append(A03());
                A10.append(", blacklisted decoders:");
                BE6.A1L(A10, A13.toArray());
                throw new IllegalStateException(AnonymousClass001.A1H(" mediaCodecException: ", str, A10), e);
            }
        }
        throw AnonymousClass000.A0s("videoDecoder or mediaFormat is null");
    }

    public long BI6() {
        Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        A05();
        this.A0A = false;
        long j = this.A0N;
        try {
            EAS eas = this.A0P;
            long j2 = (long) this.A0D;
            long BI8 = eas.BI8(j2) + j;
            while (BI8 < 0 && !this.A0P.Bgl() && !this.A0R) {
                Trace.beginSection("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                BI8 = this.A0N + this.A0P.BI8(j2);
                Trace.endSection();
            }
            if (this.A0Q.isDone() && !this.A0S) {
                this.A0Q.get();
                this.A0S = true;
            }
            if (this.A0P.Bgl() && !this.A0S) {
                if (this.A08) {
                    CAF.A00("VideoDemuxDecodeWrapperTag", "decodeFrameAndAdvance mEnableCancelDecoderExtractFuture", new Object[0]);
                    A04();
                } else {
                    this.A0Q.get();
                }
            }
            long A002 = A00(BI8);
            Trace.endSection();
            return A002;
        } catch (IllegalStateException e) {
            throw new IllegalStateException(C17890vO.A0a("Previous Enqueue Buffer: ", AnonymousClass000.A10(), j), e);
        }
    }

    public long BQJ() {
        C25833Cmm cmm;
        long BQJ = this.A0P.BQJ() + this.A0N;
        CRT crt = this.A04;
        if (crt == null || (cmm = crt.A01) == null || C17880vN.A10(cmm.A06).isEmpty()) {
            return A00(BQJ);
        }
        C26171Ctn.A03(AnonymousClass000.A1W(this.A04.A00), "No track is selected");
        return BQJ;
    }

    public C25225CbM BUZ() {
        return this.A0O.BUZ();
    }

    public boolean BeS() {
        return this.A0P.Bgl();
    }

    public void CS4() {
        Trace.beginSection("VideoDemuxDecodeWrapper.warmup");
        A05();
        while (this.A0P.BQJ() + this.A0N < 0 && !this.A0P.Bgl() && !this.A0R) {
            this.A0P.BI8((long) this.A0D);
        }
        this.A0A = true;
        Trace.endSection();
    }

    public void start() {
        if (this.A09) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            CAF.A00("VideoDemuxDecodeWrapperTag", "start", new Object[0]);
            this.A0T = false;
            this.A0Q = this.A0M.submit(new DVV(this, threadPriority, 4));
            this.A0C = true;
            return;
        }
        CAF.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", BE6.A1Z());
        throw new C2Z("VideoDemuxDecodeWrapper not configured");
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [X.DcC, java.util.concurrent.locks.ReentrantLock] */
    public C26871DHc(Context context, E7q e7q, C25820CmX cmX, E55 e55, CAM cam, CUT cut, E7t e7t, E56 e56, ExecutorService executorService, boolean z) {
        long j;
        boolean z2;
        C18030ve r2;
        boolean z3;
        C18030ve r22;
        boolean z4;
        C18030ve r23;
        long j2;
        C18030ve r24;
        this.A0E = context;
        this.A0M = executorService;
        this.A0J = cut;
        this.A0L = e56;
        this.A0H = e55;
        this.A0F = e7q;
        this.A0I = cam;
        this.A0G = cmX;
        this.A0K = e7t;
        this.A0B = z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (z) {
            j = 10;
        } else {
            j = 250;
        }
        this.A0D = (int) timeUnit.toMicros(j);
        CZT czt = cut.A08;
        boolean z5 = czt instanceof BWA;
        if (z5) {
            z2 = true;
        } else if (!(czt instanceof BWB) || (r2 = ((BWB) czt).A00) == null) {
            z2 = false;
        } else {
            z2 = C18020vd.A05(C18040vf.A02, r2, 10156);
        }
        this.A07 = z2;
        if (z5) {
            z3 = true;
        } else if (!(czt instanceof BWB) || (r22 = ((BWB) czt).A00) == null) {
            z3 = false;
        } else {
            z3 = C18020vd.A05(C18040vf.A02, r22, 10156);
        }
        this.A08 = z3;
        if (z5) {
            z4 = true;
        } else if (!(czt instanceof BWB) || (r23 = ((BWB) czt).A00) == null) {
            z4 = false;
        } else {
            z4 = C18020vd.A05(C18040vf.A02, r23, 10156);
        }
        ? reentrantLock = new ReentrantLock();
        reentrantLock.mEnableThreadLockSync = z4;
        this.A06 = reentrantLock;
        if (z5 || ((czt instanceof BWB) && (r24 = ((BWB) czt).A00) != null && C18020vd.A05(C18040vf.A02, r24, 10156))) {
            j2 = 1000;
        } else {
            j2 = -1;
        }
        this.A01 = j2;
        this.A03 = cut.A04;
    }

    public static final String A03() {
        StringBuilder A10 = AnonymousClass000.A10();
        Iterator A0i = C17890vO.A0i(C24737CHz.A04);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            StringBuilder A102 = AnonymousClass000.A10();
            BE8.A1E(A102, C29361c9.A0Q(C17880vN.A0x(A16), 15));
            A102.append(BE9.A0J(A16));
            A102.append('|');
            AnonymousClass8BS.A1D(A102, A10);
        }
        return C18070vi.A0H(A10);
    }

    public void BI7(long j) {
        A05();
        while (BQJ() <= j && !this.A0P.Bgl() && !this.A0R) {
            BI6();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CHA(long r8) {
        /*
            r7 = this;
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            boolean r5 = X.BE8.A1b(r1, r8)
            java.lang.String r0 = "seekTo: ptsUs=%s"
            java.lang.String r4 = "VideoDemuxDecodeWrapperTag"
            X.CAF.A00(r4, r0, r1)
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x00b7
            boolean r6 = r7.A0B
            if (r6 != 0) goto L_0x002a
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started"
            X.CAF.A00(r4, r0, r1)
            java.lang.String r1 = "VideoDemuxDecodeWrapper has already started"
            X.C2Z r0 = new X.C2Z
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x002a:
            X.CRT r0 = r7.A04
            if (r0 == 0) goto L_0x0066
            X.Cmm r0 = r0.A01
            if (r0 == 0) goto L_0x0066
            java.util.List r0 = r0.A06
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0066
            X.CRT r0 = r7.A01()
            r7.A04 = r0
            X.BzJ r0 = r0.A00
            boolean r1 = X.AnonymousClass000.A1W(r0)
            java.lang.String r0 = "No track is selected"
            X.C26171Ctn.A03(r1, r0)
        L_0x004f:
            r1 = 0
            if (r6 == 0) goto L_0x005c
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0085
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
        L_0x005b:
            return
        L_0x005c:
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            X.EAd r0 = r7.A0O
            r0.CHA(r8)
            return
        L_0x0066:
            float r3 = (float) r8
            X.CUT r0 = r7.A0J
            X.CrM r0 = r0.A06
            if (r0 == 0) goto L_0x0082
            X.CbD r2 = new X.CbD
            r2.<init>(r0)
            X.BzJ r1 = X.C24322BzJ.VIDEO
            int r0 = r7.A00
            r2.A01(r1, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            float r0 = r2.A00(r0, r8)
        L_0x007f:
            float r3 = r3 * r0
            long r8 = (long) r3
            goto L_0x004f
        L_0x0082:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x007f
        L_0x0085:
            r7.A0A = r5
            java.lang.String r3 = "seekTo mIsRealtime"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            X.CAF.A00(r4, r3, r0)
            r7.A04()
            X.EAS r0 = r7.A0P
            r0.flush()
            X.EAd r0 = r7.A0O
            r0.CHA(r8)
            X.EAd r0 = r7.A0O
            long r3 = r0.BYW()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            X.EAd r0 = r7.A0O
            long r1 = r0.BYW()
        L_0x00ab:
            r7.A0N = r1
            X.C5e r0 = r7.A02()
            r7.A05 = r0
            r7.start()
            return
        L_0x00b7:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured"
            X.CAF.A00(r4, r0, r1)
            java.lang.String r1 = "VideoDemuxDecodeWrapper not configured"
            X.C2Z r0 = new X.C2Z
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26871DHc.CHA(long):void");
    }

    public void cancel() {
        CAF.A00("VideoDemuxDecodeWrapperTag", "cancel", BE6.A1Z());
        this.A0R = true;
        A04();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Cjg, java.lang.Object] */
    public void release() {
        CAF.A00("VideoDemuxDecodeWrapperTag", "release", BE6.A1Z());
        if (this.A07) {
            cancel();
        }
        ? obj = new Object();
        C25635CjM.A01(obj, this.A0O, 4);
        C25635CjM.A01(obj, this.A0P, 5);
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }
}
