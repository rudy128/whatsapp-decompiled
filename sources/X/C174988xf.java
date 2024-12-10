package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8xf  reason: invalid class name and case insensitive filesystem */
public class C174988xf extends C175028xj {
    public final C38251qy A00;
    public final RecyclerView A01;
    public final AnonymousClass8Ha A02;
    public final AnonymousClass1XN A03;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.1rD, X.8Ha] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174988xf(View view, AnonymousClass1XN r6) {
        super(view);
        C38251qy gridLayoutManager;
        C18070vi.A0d(view, 1);
        this.A03 = r6;
        this.A01 = C108945cZ.A0U(view, 2131433967);
        boolean A012 = r6.A01();
        Context context = view.getContext();
        if (A012) {
            gridLayoutManager = new LinearLayoutManager(context, 0, false);
        } else {
            gridLayoutManager = new GridLayoutManager(context, A00(this));
        }
        this.A00 = gridLayoutManager;
        Resources resources = view.getResources();
        RecyclerView recyclerView = this.A01;
        recyclerView.A0r(new AnonymousClass8I4(resources, this));
        recyclerView.setLayoutManager(this.A00);
        if (!r6.A01()) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C20296AFe(this, 1));
        }
        this.A02 = new C38391rD();
    }

    public static int A00(C174988xf r4) {
        View view = r4.A0H;
        Resources resources = view.getResources();
        int paddingStart = resources.getDisplayMetrics().widthPixels - (view.getPaddingStart() + view.getPaddingEnd());
        return (int) Math.floor((double) (((float) paddingStart) / ((float) resources.getDimensionPixelSize(2131168273))));
    }
}
