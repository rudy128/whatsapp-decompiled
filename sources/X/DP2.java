package X;

import android.app.Activity;
import android.view.View;

public class DP2 implements C28530E6e {
    public final int A00;
    public final Object A01;

    public DP2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C5U(boolean z) {
        Activity A002;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                View findViewById = AnonymousClass3Ma.A05((C23820BqX) obj).findViewById(2131434215);
                if (findViewById != null) {
                    new C28931bI(findViewById).A04(C72453Mb.A07(z ? 1 : 0));
                    return;
                }
                return;
            case 1:
                A002 = C18050vg.A00(((View) obj).getContext());
                if (A002 == null) {
                    return;
                }
                break;
            default:
                A002 = AnonymousClass3Ma.A05((View) obj);
                break;
        }
        View findViewById2 = A002.findViewById(2131434215);
        if (findViewById2 != null) {
            new C28931bI(findViewById2).A04(C72453Mb.A07(z));
        }
    }
}
