package X;

import android.app.Activity;
import java.util.Iterator;

public final class D7S implements E3i {
    public final /* synthetic */ D7R A00;

    public D7S(D7R d7r) {
        this.A00 = d7r;
    }

    public void CAc(Activity activity, C192929pG r7) {
        Iterator it = this.A00.A01.iterator();
        while (it.hasNext()) {
            C24944CQu cQu = (C24944CQu) it.next();
            if (C18070vi.A18(cQu.A01, activity)) {
                cQu.A00 = r7;
                cQu.A03.execute(new C21471Akc((Object) cQu, (Object) r7, 16));
            }
        }
    }
}
