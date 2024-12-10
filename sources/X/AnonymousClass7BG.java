package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.7BG  reason: invalid class name */
public class AnonymousClass7BG implements OnFailureListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass7BG(AnonymousClass73G r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final void onFailure(Exception exc) {
        String str;
        int i = this.A00;
        AnonymousClass73G r2 = (AnonymousClass73G) this.A01;
        boolean A1Z = C72453Mb.A1Z(exc);
        if (i != 0) {
            str = "thunderstorm_logs: ThunderstormManager/startDiscovering() failed.";
        } else {
            str = "thunderstorm_logs: ThunderstormManager/startAdvertising() failed.";
        }
        Log.w(str, exc);
        r2.A04 = A1Z;
    }
}
