package X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CvW  reason: case insensitive filesystem */
public class C26236CvW {
    public static final long A0P = TimeUnit.SECONDS.toMillis(1);
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public A5W A04;
    public C26052CrM A05;
    public C25832Cml A06;
    public C25832Cml A07;
    public CUT A08;
    public HashSet A09;
    public boolean A0A;
    public A5W[] A0B;
    public final long A0C;
    public final Handler A0D;
    public final C25933Coy A0E;
    public final C24994CSu A0F;
    public final E7q A0G;
    public final CVH A0H;
    public final CXE A0I;
    public final List A0J;
    public final Map A0K;
    public final Map A0L;
    public final ExecutorService A0M;
    public final Handler.Callback A0N;
    public final Thread.UncaughtExceptionHandler A0O;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Cjg, java.lang.Object] */
    public static void A01(C26236CvW cvW) {
        List list;
        cvW.A00 = 0;
        ? obj = new Object();
        C25933Coy coy = cvW.A0E;
        if (coy != null) {
            C25933Coy.A00(coy, (Map) null);
        }
        while (true) {
            list = cvW.A0J;
            if (list.isEmpty()) {
                break;
            }
            try {
                Future future = (Future) list.remove(0);
                C26159CtX.A01(future);
                future.get();
            } catch (Exception e) {
                C25650Cjg.A00(obj, e);
            }
        }
        list.clear();
        Map map = cvW.A0K;
        Iterator it = AnonymousClass8BR.A12(map.keySet()).iterator();
        while (it.hasNext()) {
            obj.A01(A00(cvW, C72453Mb.A0H(it))).A00();
        }
        map.clear();
        cvW.A0M.shutdown();
        Handler handler = cvW.A0D;
        handler.removeCallbacksAndMessages((Object) null);
        handler.getLooper().quit();
        cvW.A0F.A02.release();
        Throwable th = obj.A01;
        if (th != null) {
            throw th;
        }
    }

    public static EAT A00(C26236CvW cvW, int i) {
        Map map = cvW.A0K;
        Integer valueOf = Integer.valueOf(i);
        Future future = (Future) map.get(valueOf);
        if (future != null) {
            try {
                return (EAT) future.get();
            } catch (Exception e) {
                map.remove(valueOf);
                cvW.A0F.A01.A03[i] = false;
                Integer num = AnonymousClass00R.A01;
                CVH cvh = cvW.A0H;
                if (cvh != null) {
                    cvh.A00(num, e);
                }
            }
        }
        return null;
    }

    public static void A02(C26236CvW cvW) {
        boolean z;
        C26236CvW cvW2 = cvW;
        C25832Cml cml = cvW2.A06;
        int i = 0;
        if (cml != null) {
            cml.A00();
            z = true;
        } else {
            z = false;
        }
        HashMap A11 = C17880vN.A11();
        C26052CrM crM = cvW2.A05;
        C26159CtX.A01(crM);
        Iterator A0i = C17890vO.A0i(crM.A05(C24322BzJ.AUDIO));
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Integer num = (Integer) A16.getKey();
            Iterator A13 = AnonymousClass8BR.A13(A16.getValue());
            while (A13.hasNext()) {
                A11.put(Integer.toString(i), new C24918CPp((C6M) A13.next(), num));
                i++;
            }
        }
        HashMap A112 = C17880vN.A11();
        Iterator A0i2 = C17890vO.A0i(A11);
        while (A0i2.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A0i2);
            A5W a5w = ((C24918CPp) A162.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0, a5w.A03(timeUnit));
            long A022 = a5w.A02(timeUnit);
            if (A022 < 0) {
                A022 = Long.MAX_VALUE;
            }
            A112.put(A162.getKey(), new A5W(timeUnit, max, A022));
        }
        BW8 bw8 = new BW8(cvW2.A08.A08, cvW2, A11, A112, 0);
        cvW2.A06 = bw8;
        if (z) {
            bw8.A01(cvW2.A02);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Cjg, java.lang.Object] */
    public static void A03(C26236CvW cvW, Throwable th) {
        String stackTraceString;
        ? obj = new Object();
        C18070vi.A0d(th, 0);
        C25650Cjg.A00(obj, th);
        try {
            A01(cvW);
        } catch (Throwable unused) {
            C25650Cjg.A00(obj, th);
        }
        C25933Coy coy = cvW.A0E;
        if (coy != null) {
            Throwable th2 = obj.A01;
            HashMap A11 = C17880vN.A11();
            if (th2 == null) {
                stackTraceString = "";
            } else {
                stackTraceString = Log.getStackTraceString(th2);
                C18070vi.A0b(stackTraceString);
            }
            A11.put("error_trace", stackTraceString);
            C25933Coy.A00(coy, A11);
        }
        Integer num = AnonymousClass00R.A01;
        Throwable th3 = obj.A01;
        CVH cvh = cvW.A0H;
        if (cvh != null) {
            cvh.A00(num, th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r8.A0A != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C26236CvW r8) {
        /*
            long r2 = r8.A02
            long r6 = r8.A03
            r5 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x000e
            boolean r0 = r8.A0A
            r4 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r4 = 1
        L_0x000f:
            int r1 = r8.A00
            r0 = 2
            if (r1 != r0) goto L_0x0022
            if (r4 == 0) goto L_0x0021
            X.A5W r1 = r8.A04
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            boolean r0 = r1.A05(r2, r0)
            if (r0 == 0) goto L_0x0021
            r5 = 1
        L_0x0021:
            return r5
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26236CvW.A04(X.CvW):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    public C26236CvW(C25933Coy coy, C24994CSu cSu, E7q e7q, CVH cvh, CUT cut, CXE cxe, Integer num) {
        Integer num2;
        String str;
        C26370CyW cyW = new C26370CyW(this, 2);
        this.A0N = cyW;
        C27090DTp dTp = new C27090DTp(this, 0);
        this.A0O = dTp;
        CUT cut2 = cut;
        this.A08 = cut2;
        this.A05 = cut2.A06;
        this.A0G = e7q;
        this.A0I = cxe;
        if (num == AnonymousClass00R.A00) {
            num2 = AnonymousClass00R.A03;
        } else {
            num2 = AnonymousClass00R.A04;
        }
        ? obj = new Object();
        if (11 - num2.intValue() != 0) {
            str = "AUDIO_PRELOAD_QUEUE";
        } else {
            str = "PLAYER_AUDIO_PRELOAD_QUEUE";
        }
        this.A0M = C25325CdW.A00(str, obj, 4, true);
        this.A0J = AnonymousClass8BR.A14();
        this.A0K = C17880vN.A11();
        this.A0L = C17880vN.A11();
        this.A0F = cSu;
        this.A0H = cvh;
        this.A0E = coy;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.A0C = (timeUnit.toMicros(1) * 1024) / 44100;
        this.A04 = new A5W(timeUnit, -1, -1);
        this.A09 = C17880vN.A12();
        Looper A0L2 = BEA.A0L("audio", -16);
        C26159CtX.A01(A0L2);
        this.A0D = new C22617BFy(cyW, A0L2, dTp);
    }
}
