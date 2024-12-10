package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.1Ac  reason: invalid class name and case insensitive filesystem */
public class C22471Ac {
    public final AnonymousClass00H A00;

    public synchronized void A00() {
        SigquitBasedANRDetector sigquitBasedANRDetector = (SigquitBasedANRDetector) this.A00.get();
        synchronized (sigquitBasedANRDetector.A0B) {
            if (!sigquitBasedANRDetector.A0E) {
                Log.i("SigquitBasedANRDetector/start called");
                HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                sigquitBasedANRDetector.A00 = handlerThread;
                handlerThread.start();
                sigquitBasedANRDetector.A0C = new Handler(sigquitBasedANRDetector.A00.getLooper());
                Log.i("SigquitBasedANRDetector/start thread started");
                SigquitBasedANRDetector.startDetector();
                sigquitBasedANRDetector.A0E = true;
                Log.i("SigquitBasedANRDetector/started");
            }
        }
    }

    public C22471Ac(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
