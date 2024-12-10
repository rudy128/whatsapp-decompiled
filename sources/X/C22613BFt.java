package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.BFt  reason: case insensitive filesystem */
public class C22613BFt extends Handler {
    public void handleMessage(Message message) {
        DFL dfl;
        E8A A0A;
        super.handleMessage(message);
        CUL cul = (CUL) message.obj;
        if (message.what == 0 && cul != null && (dfl = cul.A0E) != null && cul.A0D != null && (A0A = dfl.A0A(38)) != null) {
            DFL dfl2 = cul.A0E;
            C20046A4p a4p = new C20046A4p();
            a4p.A03(Float.valueOf(((float) cul.A07) / 2.14748365E9f), 0);
            C25681CkC.A03(cul.A0D, dfl2, BE7.A0R(a4p, cul.A0D, 1), A0A);
        }
    }

    public C22613BFt(Looper looper) {
        super(looper);
    }
}
