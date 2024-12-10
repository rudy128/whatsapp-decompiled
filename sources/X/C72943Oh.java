package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.3Oh  reason: invalid class name and case insensitive filesystem */
public class C72943Oh extends ArrayAdapter {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C37451pZ A01;
    public final /* synthetic */ C94104k3 A02;
    public final /* synthetic */ List A03;

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.A03.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass1E7 r2 = (AnonymousClass1E7) this.A03.get(i);
        C17960vV.A07(r2);
        if (view == null) {
            view = AnonymousClass3MX.A09(LayoutInflater.from(this.A00), viewGroup, 2131626372);
        }
        AnonymousClass3MW.A0J(view, 2131429428).setText(this.A02.A0D.A0I(r2));
        ImageView A0G = AnonymousClass3MW.A0G(view, 2131429453);
        this.A01.A07(A0G, r2);
        A0G.setImportantForAccessibility(2);
        AnonymousClass1Y5.A04(view, 2131893919);
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72943Oh(Context context, Context context2, C37451pZ r4, C94104k3 r5, List list, List list2) {
        super(context, 2131626868, list);
        this.A02 = r5;
        this.A03 = list2;
        this.A00 = context2;
        this.A01 = r4;
    }
}
