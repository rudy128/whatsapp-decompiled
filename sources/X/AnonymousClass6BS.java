package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6BS  reason: invalid class name */
public final class AnonymousClass6BS extends C112945mI implements AnonymousClass85W {
    public final RecyclerView A00;
    public final AnonymousClass7KN A01;
    public final C34571ki A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6BS(View view, C131416l3 r4, C37451pZ r5, C34571ki r6) {
        super(view);
        C72473Md.A1I(r4, r5);
        this.A02 = r6;
        RecyclerView A0Q = AnonymousClass3MX.A0Q(view, 2131430004);
        this.A00 = A0Q;
        C18070vi.A0V(A0Q);
        AnonymousClass7KN A002 = r4.A00(A0Q, r5, r6, false);
        this.A01 = A002;
        A002.A00();
    }
}
