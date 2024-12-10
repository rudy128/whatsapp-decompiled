package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.4sB  reason: invalid class name and case insensitive filesystem */
public class C99044sB implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C99044sB(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object get() {
        C72043Kk r2;
        View view;
        switch (this.A00) {
            case 0:
                List list = (List) ((C128996h5) this.A01).A03.get();
                Set set = (Set) ((C18140vp) this.A02).get();
                ArrayList A14 = AnonymousClass000.A14(list);
                for (Object next : list) {
                    if (!set.contains(next)) {
                        A14.add(next);
                    }
                }
                return A14;
            case 1:
                r2 = (C72043Kk) this.A01;
                view = (View) this.A02;
                List list2 = C42011xT.A0I;
                break;
            default:
                r2 = (C72043Kk) this.A01;
                List list3 = C42011xT.A0I;
                view = ((C42011xT) this.A02).A0H;
                break;
        }
        C42141xh A012 = C42141xh.A01(view, r2, 2131429428);
        A012.A01.setSingleLine(true);
        return A012;
    }
}
