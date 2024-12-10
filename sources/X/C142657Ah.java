package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Ah  reason: invalid class name and case insensitive filesystem */
public final class C142657Ah implements C72343Lo {
    public float A00;
    public float A01;
    public final Integer A02;

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        float y;
        float f;
        boolean A17 = C18070vi.A17(recyclerView, motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (this.A02.intValue() != 0) {
                    if (C108945cZ.A00(motionEvent.getY(), this.A01) <= C108945cZ.A00(motionEvent.getX(), this.A00)) {
                        y = motionEvent.getX();
                        f = this.A00;
                    }
                } else if (C108945cZ.A00(motionEvent.getX(), this.A00) <= C108945cZ.A00(motionEvent.getY(), this.A01)) {
                    y = motionEvent.getY();
                    f = this.A01;
                }
                if (C108945cZ.A00(y, f) > 10.0f) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
            return false;
        }
        recyclerView.getParent().requestDisallowInterceptTouchEvent(A17);
        this.A00 = motionEvent.getX();
        this.A01 = motionEvent.getY();
        return false;
    }

    public void C3K(boolean z) {
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public C142657Ah(Integer num) {
        this.A02 = num;
    }

    public C142657Ah() {
        this(AnonymousClass00R.A00);
    }
}
