package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.33t  reason: invalid class name and case insensitive filesystem */
public final class C685433t implements C28911bG {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C23281Fk A01;
    public final /* synthetic */ C28911bG A02;

    public void Bvv(View view, ViewGroup viewGroup, String str, int i) {
        String str2;
        C18070vi.A0d(view, 0);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.A00.addView(view);
        C23281Fk r5 = this.A01;
        r5.A00 = view;
        C28941bJ r2 = (C28941bJ) C18070vi.A05(view, 2131428335);
        AnonymousClass1LF r1 = r5.A06;
        if (r1 != null) {
            C28911bG r4 = this.A02;
            C18070vi.A0d(r2, 0);
            r1.A01 = r2;
            ViewGroup viewGroup2 = r5.A02;
            str2 = "mainContainer";
            if (viewGroup2 != null) {
                View view2 = r5.A00;
                AnonymousClass1LI r12 = r1.A03;
                C18070vi.A0d(r12, 2);
                if (view2 != null) {
                    r12.A0G(view2);
                    r12.A0E(view2);
                    C29191bl.A02(viewGroup2, r12);
                }
                r4.Bvv(view, viewGroup, str, i);
                return;
            }
        } else {
            str2 = "navBarHelper";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public C685433t(ViewGroup viewGroup, C23281Fk r2, C28911bG r3) {
        this.A00 = viewGroup;
        this.A01 = r2;
        this.A02 = r3;
    }
}
