package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* renamed from: X.47Z  reason: invalid class name */
public class AnonymousClass47Z extends C74373Zs {
    public final AnonymousClass1BI A00;
    public final C85314Mx A01;
    public final AnonymousClass10I A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final Map A06 = C17880vN.A11();
    public final boolean A07;
    public final C87864Xj A08;

    public int A0E() {
        int size = this.A03.size();
        List list = this.A05;
        if (list != null) {
            return size + list.size();
        }
        return size;
    }

    public AnonymousClass47Z(Context context, Resources resources, AnonymousClass1BI r4, C87864Xj r5, C85314Mx r6, AnonymousClass10I r7, List list, List list2, List list3, boolean z) {
        super(context, resources);
        this.A02 = r7;
        this.A08 = r5;
        this.A01 = r6;
        this.A03 = list;
        this.A05 = list2;
        this.A04 = list3;
        this.A00 = r4;
        this.A07 = z;
    }

    public static void A00(AnonymousClass47S r6, AnonymousClass47Z r7, int i) {
        r6.A00();
        C827149l r2 = new C827149l(r6.getContext(), (Uri) r7.A03.get(i), new C97774q2(r7, i, 1, r6), r7.A08);
        A34 a34 = (A34) r7.A06.put(Integer.valueOf(i), r2);
        if (a34 != null) {
            a34.A0B(true);
        }
        C17890vO.A0u(r2, r7.A02);
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        super.A0G(viewGroup, obj, i);
        C17890vO.A0t((A34) this.A06.remove(Integer.valueOf(i)));
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass000.A1Z(view, obj);
    }
}
