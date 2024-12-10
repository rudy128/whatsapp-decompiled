package X;

import android.os.Message;
import java.util.List;

/* renamed from: X.Cjc  reason: case insensitive filesystem */
public final class C25646Cjc {
    public Message A00;
    public C25936Cp1 A01;

    public void A01() {
        Message message = this.A00;
        C26056CrS.A01(message);
        message.sendToTarget();
        this.A00 = null;
        this.A01 = null;
        List list = C25936Cp1.A01;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(this);
            }
        }
    }

    public static void A00(C25936Cp1 cp1, Object obj, int i) {
        C25646Cjc A002 = C25936Cp1.A00();
        A002.A00 = cp1.A00.obtainMessage(i, obj);
        A002.A01 = cp1;
        A002.A01();
    }
}
