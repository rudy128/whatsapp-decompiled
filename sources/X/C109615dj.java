package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;

/* renamed from: X.5dj  reason: invalid class name and case insensitive filesystem */
public class C109615dj extends Handler {
    public final /* synthetic */ AnonymousClass11S A00;
    public final /* synthetic */ C132846nh A01;
    public final /* synthetic */ AnonymousClass12E A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109615dj(Looper looper, AnonymousClass11S r2, C132846nh r3, AnonymousClass12E r4) {
        super(looper);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            Log.i("AndroidContactsContentObserver/handleMessage/CONTACTS_CHANGED");
            AnonymousClass11S r1 = this.A00;
            r1.A0I();
            if (r1.A00 != null && !r1.A0N()) {
                this.A02.A09();
            }
        }
    }
}
