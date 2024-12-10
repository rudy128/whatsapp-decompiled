package X;

import com.whatsapp.jid.Jid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Wx  reason: invalid class name and case insensitive filesystem */
public final class C87774Wx {
    public C18090vk A00;
    public final C23581Gv A01 = new C94174kA(this, 0);
    public final C24671Lf A02;
    public final C25221Nj A03;
    public final C25191Ng A04;
    public final List A05;

    public C87774Wx(C24671Lf r3, C25191Ng r4, List list) {
        int A0G = C72453Mb.A0G(r4, r3, 1);
        this.A04 = r4;
        this.A02 = r3;
        this.A05 = list;
        this.A03 = new C96314ne(this, A0G);
    }

    public static final boolean A00(C87774Wx r3, AnonymousClass1BI r4, boolean z) {
        List list = r3.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jid A0S = C17880vN.A0S(it);
                if ((!z || C22971Dz.A0e(A0S)) && C18070vi.A18(A0S, r4)) {
                    return true;
                }
            }
        }
        return false;
    }
}
