package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.4RQ  reason: invalid class name */
public final class AnonymousClass4RQ {
    public AnonymousClass0SF A00;
    public AnonymousClass4LC A01;
    public AnonymousClass4LD A02;
    public C73003Op A03;
    public final Context A04;
    public final View.OnTouchListener A05 = new C90334du((Object) this, 10);
    public final View A06;
    public final C18000vb A07;
    public final List A08;
    public final C18100vl A09 = C99144sL.A01(this, 35);

    public final void A00(Long l) {
        Long l2;
        C73003Op r1;
        C73003Op r0 = this.A03;
        if (r0 != null) {
            l2 = r0.A00;
        } else {
            l2 = null;
        }
        if (!C18070vi.A18(l, l2) && (r1 = this.A03) != null && !C18070vi.A18(l, r1.A00)) {
            r1.A00 = l;
            r1.notifyDataSetChanged();
        }
    }

    public AnonymousClass4RQ(Context context, View view, C18000vb r5, List list) {
        C18070vi.A0j(r5, context);
        this.A07 = r5;
        this.A04 = context;
        this.A06 = view;
        this.A08 = list;
    }
}
