package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.7Ag  reason: invalid class name and case insensitive filesystem */
public class C142647Ag implements C72343Lo {
    public final int A00;
    public final Object A01;

    public C142647Ag(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Bw2(MotionEvent motionEvent, RecyclerView recyclerView) {
        if (this.A00 != 0) {
            return AnonymousClass000.A1W(((ConversationsFragment) this.A01).A0M);
        }
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A01;
        C42011xT r0 = stickyHeadersRecyclerView.A04;
        if (r0 == null || r0.A0H == null) {
            return false;
        }
        float y = motionEvent.getY();
        int height = stickyHeadersRecyclerView.A04.A0H.getHeight();
        int i = stickyHeadersRecyclerView.A02;
        if (i >= 0) {
            i = 0;
        }
        if (y > ((float) (height + i))) {
            return false;
        }
        stickyHeadersRecyclerView.A03.A00.onTouchEvent(motionEvent);
        return true;
    }

    public void C8t(MotionEvent motionEvent, RecyclerView recyclerView) {
        if (this.A00 == 0) {
            ((StickyHeadersRecyclerView) this.A01).A03.A00.onTouchEvent(motionEvent);
        }
    }

    public void C3K(boolean z) {
    }
}
