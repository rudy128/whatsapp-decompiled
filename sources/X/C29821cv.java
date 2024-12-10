package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.1cv  reason: invalid class name and case insensitive filesystem */
public class C29821cv implements Handler.Callback {
    public final /* synthetic */ C29811cu A00;

    public C29821cv(C29811cu r1) {
        this.A00 = r1;
    }

    public boolean handleMessage(Message message) {
        String str = (String) message.obj;
        int i = message.what;
        if (i == 1) {
            C29811cu.A04(this.A00, str);
            return true;
        } else if (i == 2) {
            C29811cu r1 = this.A00;
            if (!C29811cu.A05(r1, str)) {
                C29811cu.A04(r1, str);
            }
            return true;
        } else if (i == 3) {
            C29811cu.A02(this.A00, str);
            return true;
        } else if (i != 4) {
            return false;
        } else {
            C29811cu r12 = this.A00;
            Log.i("xmpp/handler/logout-timer/reset");
            if (!C29811cu.A05(r12, str)) {
                return false;
            }
            C29811cu.A04(r12, str);
            return false;
        }
    }
}
