package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.DPl  reason: case insensitive filesystem */
public final class C27015DPl implements EBR {
    public static final DQV A01 = new Object();
    public final List A00;

    public boolean BKb(C5x c5x) {
        C18070vi.A0d(c5x, 0);
        List<EBR> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (EBR BKb : list) {
                if (!BKb.BKb(c5x)) {
                    return false;
                }
            }
        }
        return true;
    }

    public C27015DPl(List list) {
        this.A00 = list;
    }
}
