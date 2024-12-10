package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1g9  reason: invalid class name and case insensitive filesystem */
public final class C31801g9 extends Handler {
    public int A00 = -1;
    public final /* synthetic */ C31701fz A01;

    public void A02() {
        sendEmptyMessageDelayed(2, 32000);
    }

    public void A03() {
        this.A00 = -1;
        removeCallbacksAndMessages((Object) null);
    }

    public void A04() {
        removeMessages(2);
    }

    public void A05() {
        removeMessages(0);
        this.A00 = -1;
    }

    public void A07(int i) {
        Message obtainMessage = obtainMessage(0);
        obtainMessage.arg1 = i;
        this.A00 = i;
        sendMessageDelayed(obtainMessage, 10000);
    }

    public void A08(AnonymousClass205 r4) {
        sendMessageDelayed(obtainMessage(1, r4), 45000);
    }

    public boolean A09() {
        return hasMessages(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31801g9(C31701fz r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void A06(int i) {
        Log.w("ConnectionThread/TimeoutHandler/fire-logout-timeout");
        Message obtainMessage = obtainMessage(0);
        obtainMessage.arg1 = i;
        this.A00 = i;
        sendMessage(obtainMessage);
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.A01.A0R(message.arg1);
            this.A00 = -1;
        } else if (i == 1) {
            AnonymousClass205 r7 = (AnonymousClass205) message.obj;
            C31701fz r6 = this.A01;
            AnonymousClass206 A05 = r6.A18.A01.A05(r7);
            if (A05 != null) {
                int A0D = A05.A0D();
                if (C446824j.A03(A0D, 4) && A0D != 20) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("ConnectionThread/TimeoutHandler/message receipt timeout fired; messageKey=");
                    sb.append(r7);
                    sb.append("; fMessage.status=");
                    sb.append(A05.A0D());
                    Log.w(sb.toString());
                    removeMessages(1);
                    r6.A0V(9, 0, true);
                }
            }
        } else if (i == 2) {
            Log.w("ConnectionThread/TimeoutHandler/connection active timeout fired");
            removeMessages(2);
            this.A01.A0V(10, 0, true);
        }
    }

    public int A01() {
        return this.A00;
    }
}
