package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9PZ  reason: invalid class name */
public abstract class AnonymousClass9PZ {
    public static void A00(View view, DOZ doz, DFL dfl, C26025Cqj cqj) {
        AGW agw;
        DFL dfl2 = dfl;
        String A0D = dfl2.A0D(42);
        E8A A0A = dfl2.A0A(44);
        DOZ doz2 = doz;
        if (A0A != null) {
            agw = new AGW(doz2, dfl2, A0A, 0);
        } else {
            agw = null;
        }
        String A0D2 = dfl2.A0D(43);
        String A0D3 = dfl2.A0D(45);
        String A0D4 = dfl2.A0D(41);
        String A0D5 = dfl2.A0D(48);
        String A0D6 = dfl2.A0D(35);
        String A0D7 = dfl2.A0D(36);
        String A0D8 = dfl2.A0D(40);
        boolean A0I = dfl2.A0I(46, false);
        boolean A0I2 = dfl2.A0I(38, false);
        int A04 = dfl2.A04(50, -1);
        Context context = doz2.A00;
        View view2 = view;
        RecyclerView A0U = C108945cZ.A0U(view2, 2131434428);
        AnonymousClass3Ma.A15(view2.getContext(), A0U);
        A0U.A0R = true;
        try {
            A0U.setAdapter(new C73613Wq(LayoutInflater.from(context), agw, cqj.A02.A00, A0D2, A0D3, A0D4, A0D5, A0D6, A0D7, A0D8, new JSONArray(A0D), A04, A0I, A0I2));
        } catch (JSONException unused) {
            C17900vP.A0e("WaBkComponentConfiguratorImpl/bindView data source is not a valid JSON: ", A0D, AnonymousClass000.A10());
        }
    }
}
