package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.Cro  reason: case insensitive filesystem */
public final class C26074Cro {
    public static final C26074Cro A00 = new Object();

    public static final C25511Ch9 A00(HandlerThread handlerThread, E49 e49, String str, String str2) {
        Looper looper;
        if (handlerThread == null || (looper = handlerThread.getLooper()) == null) {
            C22889BUa bUa = new C22889BUa();
            String A0y = AnonymousClass000.A0y(" Render Thread", AnonymousClass000.A11(str));
            try {
                C22889BUa.A00().A00(A0y, 0);
                C25481Cgc cgc = new C25481Cgc(str2);
                C25313CdJ cdJ = EBD.A0D;
                Map map = cgc.A00;
                map.put(cdJ, e49);
                map.put(EBD.A0G, bUa.BSH(A0y));
                map.put(EBD.A0H, A0y);
                return new C25511Ch9(cgc);
            } catch (IllegalArgumentException unused) {
                C25481Cgc cgc2 = new C25481Cgc(str2);
                C25313CdJ cdJ2 = EBD.A0D;
                Map map2 = cgc2.A00;
                map2.put(cdJ2, e49);
                BE7.A1J(EBD.A0K, map2, true);
                return new C25511Ch9(cgc2);
            }
        } else {
            Handler handler = new Handler(looper);
            C25481Cgc cgc3 = new C25481Cgc(str2);
            C25313CdJ cdJ3 = EBD.A0D;
            Map map3 = cgc3.A00;
            map3.put(cdJ3, e49);
            map3.put(EBD.A0G, handler);
            return new C25511Ch9(cgc3);
        }
    }

    public static final void A01(C28574E8g e8g, DDU ddu, E94 e94, CQQ cqq, int i) {
        ddu.A01(new C22807BPv(ddu), EDC.A01);
        ddu.A01(new BUJ(ddu), ED8.A01);
        ddu.A01(new C22805BPt(ddu), ED4.A01);
        C26723DAz dAz = new C26723DAz(cqq);
        C26719DAt dAt = new C26719DAt(e8g.Bbi());
        DDP ddp = new DDP(e8g, 0);
        ddu.A01(new C22804BPs(dAt, e94, dAz, ddp, ddu, i), C22804BPs.A07);
    }
}
