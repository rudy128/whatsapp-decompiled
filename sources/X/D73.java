package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class D73 implements C72343Lo {
    public final Context A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27707Djp(this));
    public final BMF A02;
    public final C111725kK A03;

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        View A0M;
        C38251qy layoutManager;
        BMI A06;
        boolean A17 = C18070vi.A17(recyclerView, motionEvent);
        if (!(!recyclerView.isEnabled() || !((GestureDetector) this.A01.getValue()).onTouchEvent(motionEvent) || (A0M = recyclerView.A0M(motionEvent.getX(), motionEvent.getY())) == null || (layoutManager = recyclerView.getLayoutManager()) == null || (recyclerView.getScrollState() == 0 && C38251qy.A02(A0M) == this.A02.A00))) {
            C111725kK r2 = this.A03;
            int A022 = C38251qy.A02(A0M);
            if (!(A022 == -1 || (A06 = r2.A06(layoutManager)) == null)) {
                A06.A00 = A022;
                layoutManager.A0e(A06);
                return A17;
            }
        }
        return false;
    }

    public void C3K(boolean z) {
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public D73(Context context, BMF bmf, C111725kK r4) {
        this.A00 = context;
        this.A03 = r4;
        this.A02 = bmf;
    }
}
