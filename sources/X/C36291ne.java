package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1ne  reason: invalid class name and case insensitive filesystem */
public final class C36291ne extends Handler implements C36281nd {
    public final /* synthetic */ C31701fz A00;

    public boolean Bcm() {
        if (!hasMessages(4)) {
            C31881gH r1 = (C31881gH) this.A00.A04;
            if (r1.hasMessages(2) || !r1.A00.A04.isEmpty()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void CHR(boolean z, int i) {
        int i2 = 1;
        if (z) {
            i2 = 2;
        }
        hasMessages(0);
        hasMessages(i2);
        removeMessages(i2);
        removeMessages(0);
        Message obtainMessage = obtainMessage(i2);
        Bundle data = obtainMessage.getData();
        data.putLong("requestTime", SystemClock.uptimeMillis());
        data.putInt("disconnectReason", i);
        obtainMessage.sendToTarget();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36291ne(C31701fz r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void CHN(UserJid userJid, C54412e6 r6, String str, boolean z, boolean z2) {
        String str2;
        String rawString;
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionThread/sendConnect/ forcePassiveMode=");
        sb.append(z2);
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" reg=");
            sb2.append(this.A00.A15.A00(false));
            str2 = sb2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        Log.i(sb.toString());
        removeMessages(0);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        if (userJid == null) {
            rawString = null;
        } else {
            rawString = userJid.getRawString();
        }
        data.putString("jid", rawString);
        data.putString("ipaddress", str);
        data.putBoolean("available", z);
        data.putBoolean("forcePassiveMode", z2);
        obtainMessage.obj = r6;
        obtainMessage.sendToTarget();
    }

    public void handleMessage(Message message) {
        C31701fz r4;
        int i;
        long j;
        boolean z;
        switch (message.what) {
            case 0:
                Log.i("ConnectionThread/MessageServiceHandler/recv/connect");
                Bundle data = message.getData();
                UserJid A04 = UserJid.Companion.A04(data.getString("jid"));
                C31701fz r3 = this.A00;
                r3.A0h(A04, (C54412e6) message.obj, data.getString("ipaddress"), data.getBoolean("available"), data.getBoolean("forcePassiveMode"));
                if (r3.A0i.A00) {
                    removeMessages(10);
                    C31801g9 A08 = r3.A03;
                    if (A08.hasMessages(1)) {
                        A08.A01.A0D.A0G("connect-without-disconnect", (String) null, false);
                        A08.removeMessages(1);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r4 = this.A00;
                j = message.getData().getLong("requestTime");
                i = message.getData().getInt("disconnectReason", -1);
                z = false;
                break;
            case 2:
                r4 = this.A00;
                j = message.getData().getLong("requestTime");
                i = message.getData().getInt("disconnectReason", -1);
                z = true;
                break;
            case 3:
                this.A00.A0S(message.arg1);
                return;
            case 4:
                this.A00.A0a(message);
                return;
            case 6:
                this.A00.A0P();
                return;
            case 7:
                this.A00.A0O();
                return;
            case 8:
                this.A00.A0N();
                return;
            case 10:
                this.A00.A0K();
                return;
            default:
                return;
        }
        r4.A0V(i, j, z);
    }
}
