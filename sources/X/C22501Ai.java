package X;

import android.os.Handler;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.1Ai  reason: invalid class name and case insensitive filesystem */
public class C22501Ai {
    public int A00 = 0;
    public long A01;
    public C178019Bm A02;
    public final AnonymousClass11C A03;

    public static synchronized void A00(C22501Ai r5, C52942bj r6, String str, String str2, int i) {
        Handler handler;
        C70613Bu r1;
        synchronized (r5) {
            if (r5.A02.A02 == r5.A01) {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            r5.A00 = 0;
                        } else {
                            r5.A00 = 0;
                            Log.e("SigquitBasedANRDetector/onCheckFailed");
                        }
                        handler = r6.A01.A0C;
                        if (handler != null) {
                            r1 = new C70613Bu(r6, 40);
                        }
                    } else {
                        r5.A00 = 2;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SigquitBasedANRDetector/On error detected ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(str2);
                        Log.i(sb.toString());
                        if (str != null) {
                            SigquitBasedANRDetector sigquitBasedANRDetector = r6.A01;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(" : ");
                            sb2.append(str2);
                            SigquitBasedANRDetector.A00(sigquitBasedANRDetector, sb2.toString());
                        }
                        SigquitBasedANRDetector sigquitBasedANRDetector2 = r6.A01;
                        if (sigquitBasedANRDetector2.A0C != null) {
                            handler = sigquitBasedANRDetector2.A0C;
                            r1 = new C70613Bu(r6, 39);
                        }
                    }
                    handler.post(r1);
                } else {
                    Log.i("SigquitBasedANRDetector/Started monitoring");
                }
            }
        }
    }

    public C22501Ai(AnonymousClass11C r2) {
        this.A03 = r2;
    }
}
