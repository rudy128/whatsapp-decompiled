package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class CWP {
    public List A00;
    public final AnonymousClass1GV A01;
    public final Activity A02;
    public final Executor A03;

    public final void A00(List list) {
        C18070vi.A0d(list, 0);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C25195Cam cam = (C25195Cam) next;
            Activity activity = this.A02;
            if (cam.A00.A00.contains(activity) || cam.A01.A00.contains(activity)) {
                A13.add(next);
            }
        }
        if (!A13.equals(this.A00)) {
            this.A00 = A13;
            this.A03.execute(new C21471Akc((Object) this, (Object) A13, 15));
        }
    }

    public CWP(Activity activity, AnonymousClass1GV r2, Executor executor) {
        this.A02 = activity;
        this.A03 = executor;
        this.A01 = r2;
    }
}
