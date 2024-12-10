package X;

import android.view.View;
import java.util.List;

/* renamed from: X.78e  reason: invalid class name and case insensitive filesystem */
public class C1421078e implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C1421078e(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    public final boolean onLongClick(View view) {
        if (this.A00 != 0) {
            int i = this.A01;
            List list = C42011xT.A0I;
            ((C117505zu) this.A02).A02.invoke(Integer.valueOf(i), ((C117525zw) this.A03).A04);
            return true;
        }
        int i2 = this.A01;
        Object obj = this.A03;
        List list2 = C42011xT.A0I;
        ((C117495zt) this.A02).A02.invoke(Integer.valueOf(i2), obj);
        return true;
    }
}
