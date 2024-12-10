package X;

import android.os.Build;
import java.util.Collection;
import java.util.List;

public final class BTS extends C3J {
    public final C25741ClB A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BTS) {
                BTS bts = (BTS) obj;
                if (!C18070vi.A18(this.A00, bts.A00) || !C18070vi.A18(this.A01, bts.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        List<C28554E7f> list = this.A01;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (C28554E7f BkE : list) {
            if (BkE.BkE()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public BTS(C25741ClB clB, List list) {
        this.A00 = clB;
        this.A01 = list;
    }
}
