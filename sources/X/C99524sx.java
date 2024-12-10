package X;

import com.whatsapp.lists.ListsManagerFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

/* renamed from: X.4sx  reason: invalid class name and case insensitive filesystem */
public final class C99524sx implements AnonymousClass1G2 {
    public final /* synthetic */ C41761x1 A00;
    public final /* synthetic */ ListsManagerFragment A01;

    public C99524sx(C41761x1 r1, ListsManagerFragment listsManagerFragment) {
        this.A01 = listsManagerFragment;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r7) {
        Iterable iterable;
        WDSButton wDSButton;
        C88334Zg r6 = (C88334Zg) obj;
        ArrayList A0k = C29431cG.A0k(r6.A01, r6.A02);
        ListsManagerFragment listsManagerFragment = this.A01;
        C41761x1 r0 = this.A00;
        if (r0 == null || r0.A02 != 4) {
            iterable = C18460wS.A00;
        } else {
            iterable = C18070vi.A0M(new C96654oC(2131890378));
        }
        ArrayList A0k2 = C29431cG.A0k(iterable, A0k);
        boolean z = false;
        if (!listsManagerFragment.A15().getBoolean("arg_skip_contacts", false) && (wDSButton = listsManagerFragment.A06) != null) {
            if (r6.A00.length() > 0) {
                z = true;
            }
            wDSButton.setEnabled(z);
        }
        AnonymousClass3X7 r1 = listsManagerFragment.A05;
        if (r1 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r1.A02 = !r6.A04;
        C72453Mb.A1J(r1, A0k2, r1.A09);
        return C27621Wu.A00;
    }
}
