package X;

import android.os.Handler;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.4pb  reason: invalid class name and case insensitive filesystem */
public class C97514pb implements B9K {
    public final int A00;
    public final Object A01;

    public C97514pb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CGB(int i) {
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                ((AnonymousClass49O) obj).A00 = i;
                return;
            case 1:
                AnonymousClass3VM.A00((AnonymousClass3VM) obj, i);
                return;
            case 2:
                ((AnonymousClass49Q) obj).A00 = i;
                return;
            default:
                Handler handler = ((SetAboutInfo) obj).A08;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
                return;
        }
    }
}
