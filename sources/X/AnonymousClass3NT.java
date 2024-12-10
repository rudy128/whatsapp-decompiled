package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.3NT  reason: invalid class name */
public final class AnonymousClass3NT extends Handler {
    public final C108755cF A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NT(AnonymousClass1FY r2, C108755cF r3) {
        super(Looper.getMainLooper());
        C18070vi.A0d(r3, 2);
        this.A00 = r3;
        this.A01 = AnonymousClass3MW.A0z(r2);
    }

    public void handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        Object obj = this.A01.get();
        if (obj == null) {
            C17900vP.A0Z(message, "MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ", AnonymousClass000.A10());
        }
        int i = message.what;
        if (i == 1) {
            Log.i("MatchPhoneNumberFragment/check-number/match");
            removeMessages(4);
            if (obj != null) {
                C108755cF r0 = this.A00;
                r0.BIv();
                r0.Bxc();
            }
        } else if (i != 2) {
            if (i == 3) {
                Log.e("MatchPhoneNumberFragment/error");
            } else if (i == 4) {
                Log.w("MatchPhoneNumberFragment/timeout");
                removeMessages(4);
            } else {
                return;
            }
            if (obj != null) {
                C108755cF r02 = this.A00;
                r02.BIv();
                r02.Bpm();
            }
        } else {
            Log.w("MatchPhoneNumberFragment/check-number/mismatch");
            removeMessages(4);
            if (obj != null) {
                C108755cF r03 = this.A00;
                r03.BIv();
                r03.Byf();
            }
        }
    }
}
