package X;

import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3SM  reason: invalid class name */
public final class AnonymousClass3SM extends C123426Uk {
    public final /* synthetic */ AnonymousClass01E A00;
    public final /* synthetic */ C87804Xb A01;

    public AnonymousClass3SM(AnonymousClass01E r1, C87804Xb r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A01(List list, List list2, List list3) {
        C18070vi.A0n(list, list2, list3);
        this.A00.A2k((C123426Uk) null);
        C87804Xb r1 = this.A01;
        AnonymousClass1Xr.A04(r1.A07, (String) null);
        if (!r1.A0J) {
            AnonymousClass1Xr.A04(r1.A09, (String) null);
            ImageView imageView = r1.A08;
            if (imageView != null) {
                AnonymousClass1Xr.A04(imageView, (String) null);
            }
        }
    }

    public void A02(List list, Map map) {
        View A06;
        C18070vi.A0h(list, map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (!map.containsKey(A0v) && (A06 = AnonymousClass745.A06(AnonymousClass3MZ.A0F(this.A00), A0v)) != null) {
                map.put(A0v, A06);
            }
        }
    }
}
