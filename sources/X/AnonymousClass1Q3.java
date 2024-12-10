package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: X.1Q3  reason: invalid class name */
public class AnonymousClass1Q3 extends Handler {
    public void dispatchMessage(Message message) {
        C18070vi.A0d(message, 0);
        Bundle peekData = message.peekData();
        if (peekData != null) {
            peekData.getString("__wa_thread_marker");
        }
        super.dispatchMessage(message);
    }

    public boolean sendMessageAtTime(Message message, long j) {
        C18070vi.A0d(message, 0);
        return super.sendMessageAtTime(message, j);
    }
}
