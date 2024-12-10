package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.CsG  reason: case insensitive filesystem */
public class C26096CsG {
    public static int A00 = Integer.MAX_VALUE;
    public static final Handler A01 = C17890vO.A0D();
    public static final int A02 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static volatile C24848CMr A03;

    public static C24848CMr A00() {
        if (A03 == null) {
            synchronized (C26096CsG.class) {
                if (A03 == null) {
                    A03 = new C24848CMr(A02);
                }
            }
        }
        return A03;
    }

    public static void A01(String str) {
        BlockingQueue<C27087DTm> blockingQueue = A00().A00;
        for (C27087DTm dTm : blockingQueue) {
            if (str.equals(dTm.A02)) {
                blockingQueue.remove(dTm);
                if (dTm instanceof C22795BPi) {
                    C26101CsL.A09.release();
                } else if (dTm instanceof C22794BPh) {
                    ((C22794BPh) dTm).A05.A04();
                }
            }
        }
    }
}
