package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7G2  reason: invalid class name */
public class AnonymousClass7G2 implements C72233Ld {
    public final /* synthetic */ C112135kz A00;

    public AnonymousClass7G2(C112135kz r1) {
        this.A00 = r1;
    }

    public void Bsl() {
        RecyclerView recyclerView = this.A00.A09.A0S;
        if (recyclerView != null) {
            recyclerView.post(C108945cZ.A0X(this, 12));
        }
    }

    public /* bridge */ /* synthetic */ void C2Y(Object obj) {
        RecyclerView recyclerView = this.A00.A09.A0S;
        if (recyclerView != null) {
            recyclerView.post(new C70643By(this, obj, 9));
        }
    }
}
