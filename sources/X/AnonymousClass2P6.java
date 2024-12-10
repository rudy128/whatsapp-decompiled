package X;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.2P6  reason: invalid class name */
public class AnonymousClass2P6 extends AnonymousClass1Q3 {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2P6(Looper looper, C31931gM r3, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = r3;
        C18070vi.A0d(looper, 1);
    }

    public void dispatchMessage(Message message) {
        StringBuilder A10;
        String str;
        int i = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        super.dispatchMessage(message);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        int i2 = (uptimeMillis2 > 1000 ? 1 : (uptimeMillis2 == 1000 ? 0 : -1));
        if (i != 0) {
            if (i2 > 0) {
                A10 = AnonymousClass000.A10();
                str = "AsyncCommitManager/receipt/dispatching id: ";
            } else {
                return;
            }
        } else if (i2 > 0) {
            A10 = AnonymousClass000.A10();
            str = "AsyncCommitManager/dispatching id: ";
        } else {
            return;
        }
        A10.append(str);
        A10.append(message.arg1);
        A10.append(" msg:");
        A10.append(message.getCallback());
        C17900vP.A0m(" took:", A10, uptimeMillis2);
    }
}
