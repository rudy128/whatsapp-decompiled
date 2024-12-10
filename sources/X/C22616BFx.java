package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: X.BFx  reason: case insensitive filesystem */
public class C22616BFx extends Handler {
    public final /* synthetic */ C25744ClE A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22616BFx(Looper looper, C25744ClE clE) {
        super(looper);
        this.A00 = clE;
    }

    public void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        for (C26669D8s d8s : this.A00.A06) {
            if (Arrays.equals(d8s.A07, bArr)) {
                int i = message.what;
                int i2 = d8s.A01;
                if (i2 != 3 && i2 != 4) {
                    return;
                }
                if (i == 1) {
                    d8s.A01 = 3;
                    d8s.A0A.A01(d8s);
                    return;
                } else if (i == 2) {
                    C26669D8s.A03(d8s, false);
                    return;
                } else if (i == 3 && i2 == 4) {
                    d8s.A01 = 3;
                    C26669D8s.A02(d8s, new C1K(), 2);
                    return;
                } else {
                    return;
                }
            }
        }
    }
}
