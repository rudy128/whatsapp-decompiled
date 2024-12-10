package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.7BH  reason: invalid class name */
public class AnonymousClass7BH implements OnFailureListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public AnonymousClass7BH(AnonymousClass73G r1, String str, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = str;
    }

    public final void onFailure(Exception exc) {
        if (this.A00 != 0) {
            AnonymousClass73G r3 = (AnonymousClass73G) this.A01;
            String str = this.A02;
            C18070vi.A0d(exc, 2);
            Log.w("thunderstorm_logs: ThunderstormManager/acceptConnection() failed.", exc);
            C131726lZ r0 = r3.A01;
            if (r0 != null) {
                r0.A00(str, 2);
            }
            C136046tB r1 = (C136046tB) r3.A0E.get(str);
            if (r1 != null) {
                r1.A00 = 0;
                return;
            }
            return;
        }
        String str2 = this.A02;
        C18070vi.A0d(exc, 2);
        Log.w("thunderstorm_logs: ThunderstormManager/sendPayload() failed.", exc);
        C131726lZ r12 = ((AnonymousClass73G) this.A01).A01;
        if (r12 != null) {
            r12.A00(str2, 4);
        }
    }
}
