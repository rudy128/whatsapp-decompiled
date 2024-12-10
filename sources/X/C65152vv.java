package X;

import android.view.View;
import android.view.WindowId;

/* renamed from: X.2vv  reason: invalid class name and case insensitive filesystem */
public class C65152vv implements AnonymousClass3KD {
    public final WindowId A00;

    public boolean equals(Object obj) {
        if (!(obj instanceof C65152vv) || !((C65152vv) obj).A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C65152vv(View view) {
        this.A00 = view.getWindowId();
    }
}
