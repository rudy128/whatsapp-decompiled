package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.17s  reason: invalid class name and case insensitive filesystem */
public class C218717s implements C201511a {
    public final Set A00 = new HashSet();
    public final Set A01;

    public boolean A00() {
        Set<C22561Ci> set;
        synchronized (this) {
            set = this.A00;
            if (set.size() == 0) {
                for (C25521On BVq : this.A01) {
                    set.add(BVq.BVq());
                }
            }
        }
        for (C22561Ci r2 : set) {
            ThreadLocal threadLocal = r2.A01;
            if (threadLocal.get() != null) {
                Object obj = threadLocal.get();
                C17960vV.A07(obj);
                if (((Boolean) obj).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("TransactionLockManager/inTransactionOnCurrentThread/transaction is in progress ");
                    sb.append(r2.A00);
                    Log.w(sb.toString());
                    return true;
                }
            }
        }
        return false;
    }

    public C218717s(Set set) {
        this.A01 = set;
    }
}
