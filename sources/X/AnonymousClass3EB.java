package X;

import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.3EB  reason: invalid class name */
public final class AnonymousClass3EB implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C23651Hc A00;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        this.A00 = (C23651Hc) ((AnonymousClass10E) C17890vO.A0H(context)).ACD.get();
    }

    public static void A00(String str, C190849lc r2) {
        r2.A00 = str;
        r2.A02 = true;
        r2.A01.add(new Object());
    }

    public boolean Bfv() {
        C23651Hc r0 = this.A00;
        if (r0 == null || !r0.A02()) {
            return false;
        }
        return true;
    }
}
