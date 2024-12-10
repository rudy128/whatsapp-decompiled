package X;

import android.app.Activity;
import android.os.Looper;

/* renamed from: X.1Hl  reason: invalid class name and case insensitive filesystem */
public class C23741Hl extends C23701Hh {
    public final C23751Hm A00;
    public final AnonymousClass00H A01;

    public void onActivityResumed(Activity activity) {
        boolean z;
        if (activity instanceof AnonymousClass1FY) {
            z = ((AnonymousClass1FY) activity).A0E;
        } else {
            z = activity instanceof AnonymousClass8dN;
        }
        if (z) {
            this.A00.sendEmptyMessageDelayed(0, 3000);
        }
    }

    public C23741Hl(AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A01 = r3;
        this.A00 = new C23751Hm(Looper.getMainLooper(), r3, r4);
    }
}
