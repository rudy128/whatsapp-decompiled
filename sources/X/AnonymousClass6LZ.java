package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6LZ  reason: invalid class name */
public class AnonymousClass6LZ extends A34 {
    public final ArrayList A00;
    public final List A01;
    public final /* synthetic */ C114635rQ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6LZ(C114635rQ r2, List list, List list2) {
        super(r2, true);
        ArrayList arrayList;
        this.A02 = r2;
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        this.A01 = list2;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String A0q;
        C114635rQ r5 = this.A02;
        r5.A02 = null;
        C110265fC r2 = r5.A0O;
        r2.A00 = (List) obj;
        r2.notifyDataSetChanged();
        View findViewById = r5.findViewById(16908292);
        if (r2.isEmpty()) {
            findViewById.setVisibility(0);
            if (TextUtils.isEmpty(r5.A0G)) {
                A0q = r5.getString(2131888805);
            } else {
                A0q = C17880vN.A0q(r5, r5.A0G, AnonymousClass3MW.A1a(), 0, 2131895497);
            }
            TextView A0L = AnonymousClass3MX.A0L(r5, 2131434939);
            A0L.setText(A0q);
            A0L.setVisibility(0);
            findViewById = r5.findViewById(2131431631);
        }
        findViewById.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            if (this.A02.A07.A0l(A0O, this.A00)) {
                A13.add(A0O);
            }
        }
        return A13;
    }
}
