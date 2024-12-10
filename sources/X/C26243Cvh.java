package X;

import android.util.SparseArray;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cvh  reason: case insensitive filesystem */
public class C26243Cvh {
    public static final long A0a;
    public static final long A0b;
    public long A00 = 0;
    public long A01 = -1;
    public long A02;
    public long A03;
    public C26861DGs A04;
    public C26861DGs A05;
    public C26236CvW A06;
    public CVH A07;
    public C25832Cml A08;
    public C25832Cml A09;
    public boolean A0A = false;
    public boolean A0B = true;
    public boolean A0C = false;
    public boolean A0D = false;
    public long A0E = A0a;
    public final C25325CdW A0F;
    public final C25933Coy A0G;
    public final E7q A0H;
    public final C25664Cju A0I;
    public final C25001CTb A0J;
    public final CUT A0K;
    public final CXE A0L;
    public final HashMap A0M;
    public final List A0N = AnonymousClass000.A13();
    public final Map A0O = C17880vN.A11();
    public final Map A0P = C17880vN.A11();
    public final ExecutorService A0Q;
    public final ExecutorService A0R;
    public final long A0S = TimeUnit.SECONDS.toMicros(10);
    public final CAH A0T;
    public final C25820CmX A0U;
    public final E9F A0V;
    public final E7t A0W;
    public volatile long A0X = 0;
    public volatile long A0Y;
    public volatile boolean A0Z;

    public static void A02(C24322BzJ bzJ, C26243Cvh cvh, long j) {
        Object obj;
        ArrayList A002 = A00(bzJ, cvh, j, j + cvh.A0S);
        C25664Cju cju = cvh.A0I;
        C25664Cju.A00(cju);
        ArrayList A13 = AnonymousClass000.A13();
        Map map = cju.A00;
        SparseArray sparseArray = (SparseArray) map.get(bzJ);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                C17890vO.A1D(A13, sparseArray.keyAt(i));
            }
        }
        Iterator it = AnonymousClass8BR.A12(A13).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            int intValue = number.intValue();
            if (!A002.contains(number)) {
                C25664Cju.A00(cju);
                SparseArray sparseArray2 = (SparseArray) map.get(bzJ);
                if (sparseArray2 != null) {
                    obj = sparseArray2.get(intValue);
                    sparseArray2.remove(intValue);
                } else {
                    obj = null;
                }
                C26159CtX.A01(obj);
                cvh.A0N.add(cvh.A0Q.submit(new DVY(cvh, obj, 15)));
            }
        }
    }

    private void A01(long j) {
        long max;
        long micros = TimeUnit.MILLISECONDS.toMicros(10);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (i < 0) {
            if (j < timeUnit.toNanos(-200)) {
                max = TimeUnit.NANOSECONDS.toMicros(-j);
            } else {
                max = this.A0E + micros;
            }
        } else if (j > timeUnit.toNanos(200)) {
            max = A0b;
        } else {
            max = Math.max(this.A0E - micros, A0b);
        }
        this.A0E = max;
    }

    public static void A03(C24322BzJ bzJ, C26243Cvh cvh, List list, boolean z) {
        C26243Cvh cvh2 = cvh;
        CUT cut = cvh2.A0K;
        C26052CrM crM = cut.A06;
        C26159CtX.A01(crM);
        Iterator it = list.iterator();
        while (true) {
            C24322BzJ bzJ2 = bzJ;
            if (it.hasNext()) {
                Number number = (Number) it.next();
                if (!cvh2.A0Z) {
                    C25664Cju cju = cvh2.A0I;
                    int intValue = number.intValue();
                    C25664Cju.A00(cju);
                    Map map = cju.A00;
                    SparseArray sparseArray = (SparseArray) map.get(bzJ2);
                    if (sparseArray == null || sparseArray.get(intValue) == null) {
                        CXE cxe = cvh2.A0L;
                        ExecutorService executorService = cvh2.A0R;
                        C26159CtX.A01(executorService);
                        E7t e7t = cvh2.A0W;
                        C26159CtX.A01(e7t);
                        C25820CmX cmX = cvh2.A0U;
                        C25833Cmm A032 = crM.A03(C24322BzJ.VIDEO, intValue);
                        Object[] A1b = BE7.A1b(crM);
                        if (A032 != null) {
                            CUT cut2 = cut;
                            EAT A012 = cxe.A01(cmX, BE9.A0Q(A032.A04), cut2, e7t, executorService, true);
                            CAF.A00("MultipleTrackCoordinatorRealtime", "createDemuxDecodeWrapperCallable", new Object[0]);
                            Future submit = cvh2.A0Q.submit(new DVi(cvh2, intValue, 1, A012));
                            C25664Cju.A00(cju);
                            Map map2 = cju.A01;
                            SparseArray sparseArray2 = (SparseArray) map2.get(bzJ2);
                            SparseArray sparseArray3 = (SparseArray) map.get(bzJ2);
                            if (sparseArray2 == null) {
                                sparseArray2 = BE6.A0Q();
                                map2.put(bzJ2, sparseArray2);
                            }
                            if (sparseArray3 == null) {
                                sparseArray3 = BE6.A0Q();
                                map.put(bzJ2, sparseArray3);
                            }
                            sparseArray2.put(intValue, A012);
                            sparseArray3.put(intValue, submit);
                        } else {
                            throw AnonymousClass000.A0s(StringFormatUtil.formatStrLocaleSafe("mc: %s", A1b));
                        }
                    }
                } else {
                    CAF.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: CancellationException", new Object[0]);
                    throw new CancellationException();
                }
            } else if (z) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Number number2 = (Number) it2.next();
                    if (!cvh2.A0Z) {
                        Future A013 = cvh2.A0I.A01(bzJ2, number2.intValue());
                        C26159CtX.A01(A013);
                        A013.get();
                    } else {
                        CAF.A00("MultipleTrackCoordinatorRealtime", "maybePreloadDemuxDecodeWrappers: ensureLoaded CancellationException", new Object[0]);
                        throw new CancellationException();
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public static void A04(C26243Cvh cvh) {
        Map map = cvh.A0P;
        C25001CTb cTb = cvh.A0J;
        cTb.getClass();
        cvh.A09 = C26060CrZ.A00(new DHL(cTb, 0), new DHM(cTb, 0), cvh.A0K.A08, map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r9 == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(long r21, boolean r23) {
        /*
            r20 = this;
            r8 = r20
            X.CvW r0 = r8.A06
            if (r0 == 0) goto L_0x000e
            if (r23 != 0) goto L_0x000e
            android.os.Handler r1 = r0.A0D
            r0 = 1
            X.AnonymousClass8BT.A17(r1, r0)
        L_0x000e:
            X.BzJ r7 = X.C24322BzJ.VIDEO
            long r0 = r8.A0X
            java.util.Map r14 = r8.A0P
            java.util.ArrayList r3 = X.C26060CrZ.A02(r7, r14, r0)
            boolean r2 = r3.isEmpty()
            r9 = 1
            r6 = 0
            long r0 = r8.A0X
            r10 = r21
            if (r2 == 0) goto L_0x0061
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x0044
            r8.A0D = r9
            long r0 = java.lang.System.nanoTime()
            r8.A01 = r0
            r8.A0A = r6
        L_0x0036:
            long r2 = r8.A0X
            long r0 = r8.A0E
            long r2 = r2 + r0
            long r0 = java.lang.Math.min(r2, r10)
            r8.A0X = r0
        L_0x0041:
            long r0 = r8.A0X
            return r0
        L_0x0044:
            long r3 = r8.A01
            long r5 = r8.A0X
            long r0 = r8.A00
            long r5 = r5 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r3 = r3 + r5
            long r0 = java.lang.System.nanoTime()
            long r3 = r3 - r0
            r1 = 30000000(0x1c9c380, double:1.48219694E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            r9 = 0
        L_0x005c:
            r8.A0A = r9
            if (r9 != 0) goto L_0x0041
            goto L_0x0036
        L_0x0061:
            X.Cml r2 = r8.A09
            if (r2 == 0) goto L_0x0068
            r2.A01(r0)
        L_0x0068:
            X.Cml r2 = r8.A08
            if (r2 == 0) goto L_0x006f
            r2.A01(r0)
        L_0x006f:
            long r0 = r8.A0X
            int r2 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            boolean r0 = r8.A0A
            r12 = 0
            if (r0 != 0) goto L_0x00bd
            java.util.Iterator r5 = r3.iterator()
        L_0x007f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00bd
            int r1 = X.C72453Mb.A0H(r5)
            X.EAT r4 = r8.A06(r7, r1)
            boolean r0 = r4.BeS()
            if (r0 != 0) goto L_0x00b5
            java.lang.Object r0 = X.C26159CtX.A00(r7, r14)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r1 = r0.get(r1)
            X.C26159CtX.A01(r1)
            X.A5W r1 = (X.A5W) r1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r2 = r1.A03(r0)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            r2 = 0
        L_0x00ae:
            long r0 = r8.A0X     // Catch:{ CancellationException -> 0x026e }
            long r0 = r0 - r2
            r4.BI7(r0)     // Catch:{ CancellationException -> 0x026e }
            goto L_0x007f
        L_0x00b5:
            long r0 = r8.A03
            r2 = 1
            long r0 = r0 + r2
            r8.A03 = r0
            goto L_0x007f
        L_0x00bd:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x00ec
            r8.A0C = r6
            java.lang.String r0 = "MultipleTrackCoordinator.warmup"
            android.os.Trace.beginSection(r0)
            X.CTb r0 = r8.A0J
            java.util.Map r0 = r0.A07
            java.util.Iterator r1 = X.AnonymousClass000.A15(r0)
        L_0x00d4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = X.C17890vO.A0P(r1)
            X.DHS r0 = (X.DHS) r0
            X.EAR r0 = r0.A01
            X.C26159CtX.A01(r0)
            r0.CS3()
            goto L_0x00d4
        L_0x00e9:
            android.os.Trace.endSection()
        L_0x00ec:
            long r0 = r8.A0X
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x01c7
            boolean r0 = r8.A0A
            if (r0 != 0) goto L_0x0121
            X.CTb r2 = r8.A0J     // Catch:{ Exception -> 0x0110 }
            long r0 = r8.A0X     // Catch:{ Exception -> 0x0110 }
            java.util.Map r2 = r2.A07     // Catch:{ Exception -> 0x0110 }
            java.util.Iterator r3 = X.AnonymousClass000.A15(r2)     // Catch:{ Exception -> 0x0110 }
        L_0x0100:
            boolean r2 = r3.hasNext()     // Catch:{ Exception -> 0x0110 }
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = X.C17890vO.A0P(r3)     // Catch:{ Exception -> 0x0110 }
            X.DHS r2 = (X.DHS) r2     // Catch:{ Exception -> 0x0110 }
            r2.CFD(r0)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0100
        L_0x0110:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r6] = r3
            java.lang.String r1 = "demuxAndDecodeMediaCompositionRealtime renderFrame Exception=%s"
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.CAF.A00(r0, r1, r2)
            boolean r0 = r3 instanceof X.C27208DZi
            if (r0 != 0) goto L_0x0121
            throw r3
        L_0x0121:
            boolean r0 = r8.A0D
            java.lang.String r18 = "MultipleTrackCoordinator.displayFrame()"
            if (r0 != 0) goto L_0x0170
            long r0 = java.lang.System.nanoTime()
            r8.A01 = r0
            android.os.Trace.beginSection(r18)
            X.CTb r4 = r8.A0J
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r8.A01
            long r0 = r2.toMicros(r0)
            java.util.Map r2 = r4.A07
            java.util.Iterator r5 = X.AnonymousClass000.A15(r2)
        L_0x0140:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0153
            X.DHS r3 = X.BEB.A0O(r5)
            X.CAP r2 = r4.A04
            X.C26159CtX.A01(r2)
            r3.BJ1(r0)
            goto L_0x0140
        L_0x0153:
            X.CVH r4 = r8.A07
            if (r4 == 0) goto L_0x016a
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass8BR.A1L(r2, r6, r9)
            long r0 = java.lang.System.currentTimeMillis()
            X.C17890vO.A1M(r2, r0)
            r4.A00(r3, r2)
        L_0x016a:
            android.os.Trace.endSection()
            r8.A0D = r9
            goto L_0x01c7
        L_0x0170:
            long r2 = r8.A01
            long r4 = r8.A0X
            long r0 = r8.A00
            long r4 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r2 = r2 + r4
            X.DGs r15 = r8.A05
            if (r15 != 0) goto L_0x0193
            long r15 = java.lang.System.nanoTime()
        L_0x0183:
            long r0 = r2 - r15
            r15 = 30000000(0x1c9c380, double:1.48219694E-316)
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b3
            r8.A01(r0)
            r8.A0A = r9
            goto L_0x0041
        L_0x0193:
            X.Cha r4 = r15.A02
            long r0 = X.C25537Cha.A02
            android.media.AudioTrack r0 = r4.A01
            int r0 = r0.getPlaybackHeadPosition()
            long r0 = (long) r0
            long r16 = X.C25537Cha.A02
            long r0 = r0 * r16
            long r4 = r4.A00
            long r0 = r0 / r4
            java.util.concurrent.atomic.AtomicLong r4 = r15.A03
            long r15 = r4.get()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r0 = r4.toNanos(r0)
            long r15 = r15 + r0
            goto L_0x0183
        L_0x01b3:
            r15 = -30000000(0xfffffffffe363c80, double:NaN)
            int r4 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x0225
            r8.A01(r0)
            X.CVH r2 = r8.A07
            if (r2 == 0) goto L_0x01c7
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 0
            r2.A00(r1, r0)
        L_0x01c7:
            r8.A0A = r6
            long r0 = r8.A0X
            long r2 = r8.A0E
            long r0 = r0 + r2
            long r0 = java.lang.Math.min(r0, r10)
            r8.A0X = r0
            long r0 = r8.A0X
            java.util.ArrayList r11 = X.C26060CrZ.A02(r7, r14, r0)
            java.util.HashSet r10 = X.AnonymousClass8BR.A12(r11)
            java.util.Map r9 = r8.A0O
            java.lang.Object r0 = r9.get(r7)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x01f2
            r10.removeAll(r0)
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r0.removeAll(r11)
        L_0x01f2:
            long r0 = r8.A0X
            A02(r7, r8, r0)
            long r4 = r8.A0X
            long r2 = r8.A0Y
            long r2 = r2 - r4
            long r0 = r8.A02
            long r0 = java.lang.Math.min(r2, r0)
            long r18 = r4 + r0
            r15 = r8
            r16 = r4
            r14 = r7
            java.util.ArrayList r0 = A00(r14, r15, r16, r18)
            A03(r7, r8, r0, r6)
            java.util.Iterator r1 = r10.iterator()
        L_0x0213:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0265
            int r0 = X.C72453Mb.A0H(r1)
            X.EAT r0 = r8.A06(r7, r0)
            r0.CHA(r12)
            goto L_0x0213
        L_0x0225:
            android.os.Trace.beginSection(r18)
            X.CTb r4 = r8.A0J
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.toMicros(r2)
            java.util.Map r2 = r4.A07
            java.util.Iterator r5 = X.AnonymousClass000.A15(r2)
        L_0x0236:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0249
            X.DHS r3 = X.BEB.A0O(r5)
            X.CAP r2 = r4.A04
            X.C26159CtX.A01(r2)
            r3.BJ1(r0)
            goto L_0x0236
        L_0x0249:
            X.CVH r4 = r8.A07
            if (r4 == 0) goto L_0x0260
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass8BR.A1L(r2, r6, r6)
            long r0 = java.lang.System.currentTimeMillis()
            X.C17890vO.A1M(r2, r0)
            r4.A00(r3, r2)
        L_0x0260:
            android.os.Trace.endSection()
            goto L_0x01c7
        L_0x0265:
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r11)
            r9.put(r7, r0)
            goto L_0x0041
        L_0x026e:
            java.lang.String r2 = "demuxAndDecodeMediaCompositionRealtime decodeFrameAndAdvance CancellationException"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = "MultipleTrackCoordinatorRealtime"
            X.CAF.A00(r0, r2, r1)
            long r0 = r8.A0X
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26243Cvh.A05(long, boolean):long");
    }

    public EAT A06(C24322BzJ bzJ, int i) {
        Future A012 = this.A0I.A01(bzJ, i);
        if (A012 != null) {
            return (EAT) A012.get();
        }
        CAF.A00("MultipleTrackCoordinatorRealtime", "getDemuxDecodeWrapperRealtime: Null future for presentationTrack=%s", BEA.A1b(i));
        throw new C2Z(AnonymousClass001.A1I("Null future for presentationTrack=", AnonymousClass000.A10(), i));
    }

    static {
        long A012 = (long) (BEA.A01() / 30.0d);
        A0a = A012;
        A0b = A012 / 2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public C26243Cvh(C25325CdW cdW, C25933Coy coy, CAH cah, E7q e7q, C25820CmX cmX, C25001CTb cTb, CUT cut, E7t e7t, CXE cxe) {
        ThreadPoolExecutor threadPoolExecutor;
        int size;
        this.A0L = cxe;
        this.A0F = cdW;
        this.A0T = cah;
        this.A0K = cut;
        this.A0U = cmX;
        this.A0J = cTb;
        this.A0W = e7t;
        this.A0H = e7q;
        this.A0G = coy;
        this.A0M = C17880vN.A11();
        this.A0I = new C25664Cju();
        C26052CrM crM = cut.A06;
        C24322BzJ bzJ = C24322BzJ.VIDEO;
        if (crM == null || crM.A06(bzJ) == null || (size = crM.A06(bzJ).size()) == 0) {
            threadPoolExecutor = null;
        } else {
            threadPoolExecutor = C25325CdW.A00("PLAYER_VIDEO_DEMUX_DECODE", new Object(), size, false);
        }
        this.A0R = threadPoolExecutor;
        this.A0Q = C25325CdW.A00("PLAYER_PRELOAD_QUEUE", new Object(), 4, true);
        this.A0V = cut.A05;
    }

    public static ArrayList A00(C24322BzJ bzJ, C26243Cvh cvh, long j, long j2) {
        HashSet A12 = C17880vN.A12();
        SparseArray sparseArray = (SparseArray) cvh.A0P.get(bzJ);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                A5W a5w = (A5W) sparseArray.valueAt(i);
                if (j2 >= a5w.A03(TimeUnit.MICROSECONDS) && j <= a5w.A02(TimeUnit.MICROSECONDS)) {
                    C17890vO.A1D(A12, keyAt);
                }
            }
        }
        return C17880vN.A10(A12);
    }

    public void A07() {
        CAF.A00("MultipleTrackCoordinatorRealtime", "pausePlayback", BE6.A1Z());
        long j = this.A0X;
        CAF.A00("MultipleTrackCoordinatorRealtime", "resetPlayer", new Object[0]);
        this.A0D = false;
        this.A01 = -1;
        this.A00 = j;
        this.A0A = false;
        C26236CvW cvW = this.A06;
        if (cvW != null) {
            AnonymousClass8BT.A17(cvW.A0D, 6);
        }
    }
}
