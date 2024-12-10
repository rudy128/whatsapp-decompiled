package X;

import android.content.Context;
import java.util.List;
import org.whispersystems.jobqueue.JobParameters;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.3EC  reason: invalid class name */
public final class AnonymousClass3EC implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C23651Hc A00;

    public static JobParameters A00(C190849lc r2) {
        r2.A02 = true;
        Object obj = new Object();
        List list = r2.A01;
        list.add(obj);
        list.add(new Object());
        return r2.A00();
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        this.A00 = (C23651Hc) ((AnonymousClass10E) C17890vO.A0H(context)).ACD.get();
    }

    public boolean Bfv() {
        C23651Hc r0 = this.A00;
        if (r0 == null || r0.A01()) {
            return false;
        }
        return true;
    }
}
