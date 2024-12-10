package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Air  reason: case insensitive filesystem */
public final /* synthetic */ class C21362Air implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        boolean z = this.A03;
        String str = this.A01;
        String str2 = this.A02;
        int i = this.A00;
        AtomicInteger atomicInteger = A99.A4B;
        if (z) {
            Voip.rejectPendingCall(str);
        } else {
            Voip.rejectCall(str, str2, i);
        }
    }

    public /* synthetic */ C21362Air(String str, String str2, int i, boolean z) {
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
