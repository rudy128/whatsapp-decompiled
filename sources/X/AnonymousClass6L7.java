package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.6L7  reason: invalid class name */
public class AnonymousClass6L7 extends AnonymousClass79L {
    public final int A00 = 0;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6L7(AnonymousClass11P r2, MyStatusesActivity myStatusesActivity) {
        super(r2);
        this.A01 = myStatusesActivity;
        C18070vi.A0b(r2);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (1 - this.A00 == 0) {
            C18070vi.A0h(adapterView, view);
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A01;
            if (!myStatusesActivity.A12.isEmpty()) {
                C110235f9 r0 = myStatusesActivity.A0W;
                if (r0 == null) {
                    C18070vi.A11("myStatusesAdapter");
                    throw null;
                } else {
                    myStatusesActivity.A4d(view, AnonymousClass3MW.A0k(r0.A00, i));
                    return;
                }
            }
        }
        super.onItemClick(adapterView, view, i, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6L7(AnonymousClass11P r2, StatusesFragment statusesFragment) {
        super(r2);
        this.A01 = statusesFragment;
    }
}
