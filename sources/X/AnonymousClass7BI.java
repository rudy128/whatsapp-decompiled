package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.7BI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7BI implements OnFailureListener {
    public final /* synthetic */ C136046tB A00;
    public final /* synthetic */ AnonymousClass73G A01;
    public final /* synthetic */ String A02;

    public final void onFailure(Exception exc) {
        AnonymousClass73G r4 = this.A01;
        String str = this.A02;
        C136046tB r2 = this.A00;
        boolean A1K = C108975cc.A1K(exc);
        Log.w("thunderstorm_logs: ThunderstormManager/requestConnection() failed.", exc);
        C131726lZ r0 = r4.A01;
        if (r0 != null) {
            r0.A00(str, A1K ? 1 : 0);
        }
        if (r2 != null) {
            r2.A00 = 0;
        }
    }

    public /* synthetic */ AnonymousClass7BI(C136046tB r1, AnonymousClass73G r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = r1;
    }
}
