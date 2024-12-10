package X;

import android.view.View;
import android.widget.EditText;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$onSearchInputFocusChanged$1;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.78W  reason: invalid class name */
public class AnonymousClass78W implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass78W(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        String str;
        switch (this.A00) {
            case 0:
                View view2 = (View) this.A02;
                C18070vi.A0d(view2, 1);
                ((C1404471l) this.A01).A06.A00();
                view2.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                return;
            case 1:
                WDSSearchView wDSSearchView = (WDSSearchView) this.A01;
                AnonymousClass1FU r2 = (AnonymousClass1FU) this.A02;
                C18070vi.A0d(wDSSearchView, 0);
                if (z) {
                    wDSSearchView.A01();
                    C108965cb.A19(r2.A05, r2, 1);
                    return;
                }
                return;
            default:
                ExpressionsSearchViewModel A0N = C108965cb.A0N((ExpressionsSearchView) this.A01);
                String A17 = AnonymousClass3MZ.A17((EditText) this.A02);
                C18070vi.A0d(A17, 0);
                if (z) {
                    AnonymousClass3MX.A1Q(new ExpressionsSearchViewModel$onSearchInputFocusChanged$1(A0N, A17, (C30391dr) null), C41561wd.A00(A0N));
                    return;
                }
                int indexOf = A0N.A04.indexOf(A0N.A03);
                if (A0N.A04.isEmpty()) {
                    str = "expression_search_input_focus_failed_expression_tabs_is_empty";
                } else if (indexOf < 0) {
                    str = "expression_search_input_focus_failed";
                } else {
                    AnonymousClass1DT r1 = A0N.A08;
                    C127246e2 r4 = A0N.A03;
                    int indexOf2 = A0N.A04.indexOf(r4);
                    r1.A0F(new C1176160g(A0N.A02, r4, A0N.A04, indexOf2, false, false));
                    return;
                }
                ExpressionsSearchViewModel.A03(A0N, Integer.valueOf(indexOf), str);
                return;
        }
    }
}
