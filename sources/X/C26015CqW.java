package X;

import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CqW  reason: case insensitive filesystem */
public class C26015CqW {
    public static final long A0H = ((long) (BEA.A01() / 30.0d));
    public long A00 = 0;
    public C5F A01;
    public C25832Cml A02;
    public C25832Cml A03;
    public boolean A04;
    public final E7q A05;
    public final C25820CmX A06;
    public final C25242Cbd A07;
    public final CUT A08;
    public final E7t A09;
    public final CXE A0A;
    public final Map A0B = C17880vN.A11();
    public final Map A0C = BE8.A0q();
    public final ExecutorService A0D;
    public final C26052CrM A0E;
    public final C24921CPs A0F;
    public volatile boolean A0G;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.C5F, java.lang.Object] */
    public void A01() {
        long j;
        Trace.beginSection("MultipleTrackCooridnator.demuxAndDecodeMediaPosition");
        try {
            C25242Cbd cbd = this.A07;
            C26171Ctn.A03(AnonymousClass000.A1W(cbd), "MultiOutputCoordinator cannot be null");
            C26052CrM crM = this.A0E;
            C24322BzJ bzJ = C24322BzJ.VIDEO;
            E7q e7q = this.A05;
            CUT cut = this.A08;
            CZT czt = cut.A08;
            long A002 = C26162Ctb.A00(e7q, bzJ, crM, czt.A02());
            Map map = this.A0B;
            C26060CrZ.A03(e7q, bzJ, cut, map);
            SparseArray sparseArray = (SparseArray) C26159CtX.A00(bzJ, map);
            ? obj = new Object();
            obj.A00 = C17880vN.A11();
            obj.A01 = AnonymousClass000.A13();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                if (sparseArray.valueAt(i) != null) {
                    j = ((A5W) sparseArray.valueAt(i)).A03(TimeUnit.MICROSECONDS);
                } else {
                    j = -1;
                }
                obj.A01.add(C108945cZ.A0N(Integer.valueOf(keyAt), Long.valueOf(j)));
            }
            DUP.A00(obj, obj.A01, 11);
            for (int i2 = 0; i2 < obj.A01.size(); i2++) {
                C17890vO.A0z(((Pair) obj.A01.get(i2)).first, obj.A00, i2);
            }
            this.A01 = obj;
            cbd.getClass();
            this.A03 = C26060CrZ.A00(new DHL(cbd, 1), new DHM(cbd, 1), czt, map);
            C26052CrM crM2 = cut.A06;
            C26159CtX.A01(crM2);
            this.A02 = C26060CrZ.A01(crM2, new DHJ(cbd, 0), new DHK(cbd, 0), czt);
            A02(A002);
            int i3 = 0;
            while (true) {
                C26159CtX.A01(cbd.A00);
                if (i3 >= 1) {
                    break;
                }
                Object A0w = AnonymousClass000.A0w(cbd.A01, i3);
                C26159CtX.A01(A0w);
                ((EAX) A0w).flush();
                i3 = 1;
            }
            int i4 = 0;
            while (true) {
                C26159CtX.A01(cbd.A00);
                if (i4 < 1) {
                    EAX eax = (EAX) AnonymousClass000.A0w(cbd.A01, i4);
                    if (eax != null) {
                        eax.CNM();
                    }
                    i4 = 1;
                } else {
                    this.A00 = 0;
                    A00(Collections.EMPTY_LIST);
                    Trace.endSection();
                    return;
                }
            }
        } catch (Throwable th) {
            A00(Collections.EMPTY_LIST);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0139, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0177, code lost:
        if (r22.A05(r0, r15) != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0179, code lost:
        if (r8 != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (r1 == false) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(long r32) {
        /*
            r31 = this;
            java.lang.String r0 = "MultipleTrackCooridnator.demuxAndDecodeMediaPosition"
            android.os.Trace.beginSection(r0)
            X.BzJ r11 = X.C24322BzJ.VIDEO
            r5 = r31
            long r1 = r5.A00
            java.util.Map r0 = r5.A0B
            r30 = r0
            X.CUT r0 = r5.A08
            r29 = r0
            r0 = r30
            java.util.ArrayList r21 = X.C26060CrZ.A02(r11, r0, r1)
        L_0x0019:
            long r1 = r5.A00
            int r0 = (r1 > r32 ? 1 : (r1 == r32 ? 0 : -1))
            if (r0 >= 0) goto L_0x0209
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = "MultipleTrackCooridnator.demux"
            android.os.Trace.beginSection(r0)
            long r1 = r5.A00
            X.Cml r0 = r5.A03
            if (r0 == 0) goto L_0x0031
            r0.A01(r1)
        L_0x0031:
            X.Cml r0 = r5.A02
            if (r0 == 0) goto L_0x0038
            r0.A01(r1)
        L_0x0038:
            java.util.Iterator r20 = r21.iterator()
        L_0x003c:
            boolean r0 = r20.hasNext()
            r18 = 0
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r7 = r20.next()
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.String r0 = "MultipleTrackCooridnator.createOrGetDemuxDecodeWrapper"
            android.os.Trace.beginSection(r0)
            int r9 = r7.intValue()
            X.CrM r8 = r5.A0E
            java.util.Map r4 = r5.A0C
            java.lang.Object r6 = r4.get(r7)
            X.EAT r6 = (X.EAT) r6
            if (r6 != 0) goto L_0x0094
            X.CXE r6 = r5.A0A
            java.util.concurrent.ExecutorService r3 = r5.A0D
            X.E7t r2 = r5.A09
            X.CmX r1 = r5.A06
            X.Cmm r12 = r8.A03(r11, r9)
            java.lang.Object[] r10 = X.AnonymousClass3MW.A1a()
            r28 = 0
            r10[r28] = r8
            java.lang.String r0 = "mc: %s"
            if (r12 == 0) goto L_0x01f8
            java.util.List r0 = r12.A04
            X.CcJ r24 = X.BE9.A0Q(r0)
            r22 = r6
            r23 = r1
            r25 = r29
            r26 = r2
            r27 = r3
            X.EAT r6 = r22.A01(r23, r24, r25, r26, r27, r28)
            r6.BFX(r9)
            r6.start()
            r4.put(r7, r6)
        L_0x0094:
            android.os.Trace.endSection()
            boolean r0 = r6.BeS()
            if (r0 != 0) goto L_0x003c
            X.Cmm r12 = r8.A03(r11, r9)
            if (r12 == 0) goto L_0x01f2
            long r2 = r12.A00
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            r2 = 0
        L_0x00ab:
            r0 = r29
            X.ClM r9 = r0.A04
            if (r9 == 0) goto L_0x013b
            int r10 = r21.size()
            long r0 = r5.A00
            long r26 = r6.BQJ()
            long r26 = r26 + r2
            X.CPs r8 = r5.A0F
            X.C5F r14 = r5.A01
            X.C26159CtX.A01(r14)
            r4 = 1
            if (r10 > r4) goto L_0x017b
            X.CKv r4 = r9.A0D
            if (r4 == 0) goto L_0x00cf
            boolean r4 = r4.A00
            if (r4 != 0) goto L_0x017b
        L_0x00cf:
            int r4 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0190
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.A5W r4 = new X.A5W
            r22 = r4
            r23 = r15
            r24 = r0
            r22.<init>(r23, r24, r26)
        L_0x00e0:
            int r1 = r8.A00
            java.util.List r13 = r8.A02
            int r0 = r13.size()
            if (r1 >= r0) goto L_0x0139
            int r0 = r8.A00
            java.lang.Object r10 = r13.get(r0)
            X.A5W r10 = (X.A5W) r10
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r10.A03(r0)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
            boolean r0 = r4.A05(r0, r9)
            if (r0 != 0) goto L_0x014c
            long r0 = r10.A02(r9)
            boolean r0 = r4.A05(r0, r9)
            if (r0 != 0) goto L_0x014c
            long r0 = r4.A03(r9)
            boolean r0 = r10.A05(r0, r9)
            if (r0 != 0) goto L_0x014c
            long r0 = r4.A02(r9)
            boolean r0 = r10.A05(r0, r9)
            if (r0 != 0) goto L_0x014c
            int r0 = r8.A00
            java.lang.Object r0 = r13.get(r0)
            X.A5W r0 = (X.A5W) r0
            long r16 = r0.A03(r9)
            long r9 = r4.A02(r9)
            int r0 = (r16 > r9 ? 1 : (r16 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0139
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            goto L_0x00e0
        L_0x0139:
            r8 = 0
            goto L_0x014d
        L_0x013b:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceNormalClock"
            android.os.Trace.beginSection(r0)
            long r6 = r6.BI6()
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x018b
            long r2 = r2 + r6
            r5.A00 = r2
            goto L_0x018b
        L_0x014c:
            r8 = 1
        L_0x014d:
            java.util.HashMap r1 = r14.A00
            boolean r0 = r1.containsKey(r7)
            if (r0 == 0) goto L_0x0179
            int r7 = X.BE9.A0D(r7, r1)
            java.util.List r1 = r14.A01
            int r0 = X.AnonymousClass3MX.A01(r1)
            if (r7 == r0) goto L_0x0179
            int r0 = r7 + 1
            java.lang.Object r0 = r1.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            long r0 = X.C17880vN.A05(r0)
            int r7 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x0179
            boolean r0 = r4.A05(r0, r15)
            if (r0 != 0) goto L_0x017b
        L_0x0179:
            if (r8 == 0) goto L_0x0190
        L_0x017b:
            r1 = 1
        L_0x017c:
            r5.A04 = r1
            if (r1 == 0) goto L_0x013b
        L_0x0180:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceCustomClock"
            android.os.Trace.beginSection(r0)
            long r0 = r5.A00
            long r0 = r0 - r2
            r6.BI7(r0)
        L_0x018b:
            android.os.Trace.endSection()
            goto L_0x003c
        L_0x0190:
            java.util.List r0 = r12.A06
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x017b
            r1 = 0
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x017c
            r5.A04 = r1
            goto L_0x0180
        L_0x01a4:
            java.lang.String r0 = "MultipleTrackCooridnator.render"
            android.os.Trace.beginSection(r0)
            long r1 = r5.A00
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x01b4
            X.Cbd r0 = r5.A07
            r0.A02(r1)
        L_0x01b4:
            long r1 = r5.A00
            long r3 = A0H
            long r1 = r1 + r3
            r5.A00 = r1
            r0 = r30
            java.util.ArrayList r21 = X.C26060CrZ.A02(r11, r0, r1)
            r0 = r21
            r5.A00(r0)
            X.Cbd r3 = r5.A07
            r2 = 0
            r1 = 1
        L_0x01ca:
            X.CAP r0 = r3.A00
            X.C26159CtX.A01(r0)
            r0 = 1
            if (r2 >= r0) goto L_0x01e8
            java.util.Map r0 = r3.A01
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r2)
            X.EAX r0 = (X.EAX) r0
            if (r0 == 0) goto L_0x01e6
            if (r1 == 0) goto L_0x01e5
            boolean r0 = r0.BeK()
            r1 = 1
            if (r0 != 0) goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            r2 = 1
            goto L_0x01ca
        L_0x01e8:
            if (r1 != 0) goto L_0x0201
            android.os.Trace.endSection()
            android.os.Trace.endSection()
            goto L_0x0019
        L_0x01f2:
            X.BW4 r1 = new X.BW4
            r1.<init>()
            throw r1
        L_0x01f8:
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r10)
            java.lang.NullPointerException r1 = X.AnonymousClass000.A0s(r0)
            throw r1
        L_0x0201:
            java.lang.String r0 = "Muxer stopped even before EOS is enqueued"
            X.C2Z r1 = new X.C2Z
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0209:
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26015CqW.A02(long):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public C26015CqW(E7q e7q, C25820CmX cmX, C25242Cbd cbd, CUT cut, E7t e7t, CXE cxe) {
        int i;
        this.A07 = cbd;
        this.A08 = cut;
        this.A0A = cxe;
        this.A05 = e7q;
        this.A06 = cmX;
        this.A09 = e7t;
        C26052CrM crM = cut.A06;
        C26159CtX.A01(crM);
        this.A0E = crM;
        CZT czt = cut.A08;
        C24322BzJ bzJ = C24322BzJ.VIDEO;
        if (crM == null || crM.A06(bzJ) == null) {
            i = 0;
        } else {
            i = crM.A06(bzJ).size();
        }
        this.A0D = C25325CdW.A00("VIDEO_DEMUX_DECODE", new Object(), i, false);
        this.A0F = new C24921CPs(bzJ, crM, czt);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Cjg, java.lang.Object] */
    private void A00(List list) {
        HashMap A11 = C17880vN.A11();
        Map map = this.A0C;
        A11.putAll(map);
        for (Object remove : list) {
            A11.remove(remove);
        }
        ? obj = new Object();
        Iterator A0i = C17890vO.A0i(A11);
        while (A0i.hasNext()) {
            obj.A01((EAT) C17890vO.A0P(A0i)).A00();
        }
        Throwable th = obj.A01;
        if (th == null) {
            map.keySet().removeAll(A11.keySet());
            return;
        }
        throw th;
    }
}
