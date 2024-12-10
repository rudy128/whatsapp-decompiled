package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.28u  reason: invalid class name and case insensitive filesystem */
public class C453928u extends C65142vu {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ AnonymousClass1LH A03;

    public C453928u(View view, View view2, ViewGroup viewGroup, AnonymousClass1LH r4) {
        this.A03 = r4;
        this.A02 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }

    public void C9H(AnonymousClass1LG r4) {
        this.A01.setTag(2131434794, (Object) null);
        this.A02.getOverlay().remove(this.A00);
        r4.A0O(this);
    }

    public void C9I() {
        this.A02.getOverlay().remove(this.A00);
    }

    public void C9J() {
        View view = this.A00;
        if (view.getParent() == null) {
            this.A02.getOverlay().add(view);
        } else {
            this.A03.A08();
        }
    }
}
