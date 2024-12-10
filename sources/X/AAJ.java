package X;

import android.os.Handler;
import android.os.Message;

public final class AAJ implements Handler.Callback {
    public final Handler.Callback A00;

    public boolean handleMessage(Message message) {
        String str;
        C18070vi.A0d(message, 0);
        Object obj = message.obj;
        if (obj instanceof C180169Lk) {
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = "BloksSurface_process_attach_to_view";
            AnonymousClass0O7.A01(str);
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                AnonymousClass0O7.A00();
            }
        }
    }

    public AAJ(Handler.Callback callback) {
        this.A00 = callback;
    }
}
