package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.5dI  reason: invalid class name and case insensitive filesystem */
public class C109345dI extends ContentObserver {
    public final /* synthetic */ AnonymousClass11S A00;
    public final /* synthetic */ C132846nh A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109345dI(AnonymousClass11S r2, C132846nh r3) {
        super((Handler) null);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        Log.i("AndroidContactsContentObserver/onChange");
        AnonymousClass11S r1 = this.A00;
        r1.A0I();
        if (r1.A00 != null && !r1.A0N()) {
            C132846nh r0 = this.A01;
            Handler handler = r0.A00;
            handler.removeMessages(1);
            handler.sendEmptyMessageDelayed(1, (long) C18020vd.A00(C18040vf.A02, r0.A01, 11780));
        }
    }
}
