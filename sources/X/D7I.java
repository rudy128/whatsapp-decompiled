package X;

import androidx.window.extensions.core.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class D7I implements Consumer {
    public final /* synthetic */ D7H A00;
    public final /* synthetic */ E0R A01;

    public final void accept(Object obj) {
        E0R e0r = this.A01;
        D7H d7h = this.A00;
        List list = (List) obj;
        C18070vi.A0d(e0r, 0);
        C26275CwR cwR = d7h.A00;
        C18070vi.A0Y(list);
        List A09 = cwR.A09(list);
        D7G d7g = (D7G) e0r;
        d7g.A00 = A09;
        Iterator it = d7g.A01.A04.iterator();
        while (it.hasNext()) {
            ((CWP) it.next()).A00(A09);
        }
    }

    public /* synthetic */ D7I(D7H d7h, E0R e0r) {
        this.A01 = e0r;
        this.A00 = d7h;
    }
}
