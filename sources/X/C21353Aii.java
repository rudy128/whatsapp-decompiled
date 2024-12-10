package X;

import com.whatsapp.voipcalling.Voip;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Aii  reason: case insensitive filesystem */
public final /* synthetic */ class C21353Aii implements Runnable {
    public final /* synthetic */ String A00;

    public final void run() {
        String str = this.A00;
        AtomicInteger atomicInteger = A99.A4B;
        Voip.rejectCall(str, "", 0);
    }

    public /* synthetic */ C21353Aii(String str) {
        this.A00 = str;
    }
}
