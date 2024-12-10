package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;

/* renamed from: X.8xX  reason: invalid class name and case insensitive filesystem */
public class C174908xX extends C175028xj {
    public final View A00;
    public final C38251qy A01;
    public final RecyclerView A02;
    public final WaTextView A03;
    public final AnonymousClass8Hb A04;
    public final AnonymousClass1XN A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174908xX(View view, AnonymousClass8Hb r5, C18000vb r6, AnonymousClass1XN r7) {
        super(view);
        C38251qy gridLayoutManager;
        C18070vi.A0d(view, 1);
        this.A05 = r7;
        this.A03 = AnonymousClass3MW.A0T(view, 2131436208);
        this.A00 = AnonymousClass1HF.A06(view, 2131436777);
        this.A02 = C108945cZ.A0U(view, 2131433967);
        boolean A012 = r7.A01();
        Context context = view.getContext();
        if (A012) {
            gridLayoutManager = new LinearLayoutManager(context, 0, false);
        } else {
            gridLayoutManager = new GridLayoutManager(context, C181189Pm.A00(view));
        }
        this.A01 = gridLayoutManager;
        RecyclerView recyclerView = this.A02;
        recyclerView.setLayoutManager(gridLayoutManager);
        if (!this.A05.A01()) {
            recyclerView.A0r(new AnonymousClass28M(r6, view.getResources().getDimensionPixelSize(2131168354)));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C20297AFf(view, this));
        } else if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(3);
        }
        this.A04 = r5;
    }

    public void A0B() {
        this.A02.setAdapter((C38391rD) null);
    }
}
