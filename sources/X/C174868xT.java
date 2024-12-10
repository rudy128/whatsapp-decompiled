package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8xT  reason: invalid class name and case insensitive filesystem */
public class C174868xT extends C175028xj {
    public final RecyclerView A00;
    public final C161788Ht A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174868xT(View view, C161788Ht r6) {
        super(view);
        C18070vi.A0d(view, 1);
        RecyclerView A0U = C108945cZ.A0U(view, 2131434887);
        this.A00 = A0U;
        A0U.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.A01 = r6;
    }

    public void A0B() {
        this.A00.setAdapter((C38391rD) null);
    }
}
