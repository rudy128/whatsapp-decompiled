package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.3rw  reason: invalid class name and case insensitive filesystem */
public final class C77993rw extends C98524rI {
    public View A00;
    public final ViewGroup A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1E7 A03;
    public final C86444Rq A04;
    public final AnonymousClass1LU A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77993rw(ViewGroup viewGroup, C108885cS r4, AnonymousClass1CJ r5, AnonymousClass1E7 r6, AnonymousClass1LU r7, C86444Rq r8) {
        super(r4, 80);
        C18070vi.A0p(r4, r6, viewGroup);
        C18070vi.A0d(r7, 5);
        C18070vi.A0l(r5, r8);
        this.A03 = r6;
        this.A01 = viewGroup;
        this.A05 = r7;
        this.A02 = r5;
        this.A04 = r8;
    }

    public final void A0A() {
        View findViewById;
        TextView A0E;
        View view = this.A00;
        if (!(view == null || (A0E = C17880vN.A0E(view, 2131433750)) == null)) {
            A0E.setText(2131892590);
        }
        View view2 = this.A00;
        if (!(view2 == null || (findViewById = view2.findViewById(2131433748)) == null)) {
            C89904dD.A00(findViewById, this, 10);
        }
        View view3 = this.A00;
        if (view3 != null) {
            C89904dD.A00(view3, this, 11);
        }
    }
}
