package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.voipcalling.CallInfo;

/* renamed from: X.8Cj  reason: invalid class name and case insensitive filesystem */
public class C161238Cj extends Handler {
    public final boolean A00;
    public final /* synthetic */ A99 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161238Cj(Looper looper, A99 a99) {
        super(looper);
        this.A01 = a99;
        this.A00 = AnonymousClass000.A1Z(looper, Looper.getMainLooper());
    }

    public void handleMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        A99 a99 = this.A01;
        CallInfo A0r = AnonymousClass8BR.A0r(a99);
        if (this.A00) {
            A99.A0F(a99, A0r, uptimeMillis);
            a99.A0I.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        a99.A22.A0J(new AnonymousClass3C3(this, A0r, 2, uptimeMillis));
    }
}
