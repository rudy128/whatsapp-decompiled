package X;

import android.view.View;
import com.whatsapp.mediaview.MediaViewFragment;
import java.util.List;

/* renamed from: X.78f  reason: invalid class name and case insensitive filesystem */
public class C1421178f implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C1421178f(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final boolean onLongClick(View view) {
        if (this.A00 != 0) {
            MediaViewFragment.A09((View) this.A03, (MediaViewFragment) this.A01, ((C135816so) this.A02).A01, 0);
            return true;
        }
        Object obj = this.A02;
        List list = C42011xT.A0I;
        ((AnonymousClass61I) this.A01).A0I.invoke(obj, ((C1177260s) this.A03).A00);
        return false;
    }
}
