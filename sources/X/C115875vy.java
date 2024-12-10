package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: X.5vy  reason: invalid class name and case insensitive filesystem */
public final class C115875vy extends C112935mH {
    public C143257Cr A00;
    public final RecyclerView A01;
    public final C115115tQ A02;
    public final Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115875vy(View view, C57642jP r12, C136486tt r13, C1598486c r14, Map map) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A03 = map;
        C57642jP r5 = r12;
        C136486tt r6 = r13;
        C115115tQ r4 = new C115115tQ(r5, r6, new C127026dg(view, this), r14, AnonymousClass000.A13());
        this.A02 = r4;
        View findViewById = view.findViewById(2131428856);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.A0t(new C112705lu(recyclerView, this, 1));
        recyclerView.A0R = true;
        C108965cb.A0z(view.getContext(), recyclerView);
        recyclerView.setAdapter(r4);
        C18070vi.A0X(findViewById);
        this.A01 = recyclerView;
    }
}
