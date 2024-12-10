package X;

import android.os.SystemClock;
import com.facebook.exoplayer.bandwidthestimator.estimate.VideoBandwidthEstimate;
import java.util.Deque;

/* renamed from: X.CiK  reason: case insensitive filesystem */
public class C25580CiK {
    public VideoBandwidthEstimate A00;
    public Deque A01 = AnonymousClass8BR.A14();
    public Deque A02 = AnonymousClass8BR.A14();
    public boolean A03;
    public final C28617EAp A04;

    public C25580CiK(C28617EAp eAp) {
        this.A04 = eAp;
        this.A00 = new VideoBandwidthEstimate();
        this.A03 = false;
    }

    public static void A00(C25580CiK ciK) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Deque deque = ciK.A01;
            if (deque.size() > 10 && elapsedRealtime - ((CN5) deque.getFirst()).A00 > 20000) {
                deque.removeFirst();
                ciK.A03 = true;
            }
        }
        while (true) {
            Deque deque2 = ciK.A02;
            if (deque2.size() > 10 && elapsedRealtime - ((CN5) deque2.getFirst()).A00 > 20000) {
                deque2.removeFirst();
                ciK.A03 = true;
            } else {
                return;
            }
        }
    }
}
