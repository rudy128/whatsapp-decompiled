package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3P2  reason: invalid class name */
public final class AnonymousClass3P2 extends Filter {
    public final /* synthetic */ AnonymousClass3XN A00;

    public AnonymousClass3P2(AnonymousClass3XN r1) {
        this.A00 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A13;
        AnonymousClass3XN r6 = this.A00;
        if (AnonymousClass1YF.A0I(String.valueOf(charSequence)).length() == 0) {
            A13 = C29431cG.A0m(r6.A01);
        } else {
            A13 = AnonymousClass000.A13();
            String A0I = AnonymousClass1YF.A0I(String.valueOf(charSequence));
            Locale locale = Locale.ROOT;
            String lowerCase = A0I.toLowerCase(locale);
            C18070vi.A0X(lowerCase);
            List list = r6.A01;
            ArrayList<Object> A132 = AnonymousClass000.A13();
            for (Object next : list) {
                AnonymousClass4NP r3 = (AnonymousClass4NP) next;
                String lowerCase2 = r3.A02.toLowerCase(locale);
                C18070vi.A0X(lowerCase2);
                boolean A0Y = AnonymousClass1YF.A0Y(lowerCase2, lowerCase, false);
                String lowerCase3 = r3.A01.toLowerCase(locale);
                C18070vi.A0X(lowerCase3);
                if (AnonymousClass1YF.A0Y(lowerCase3, lowerCase, false) || A0Y) {
                    A132.add(next);
                }
            }
            for (Object add : A132) {
                A13.add(add);
            }
        }
        C18070vi.A0d(A13, 0);
        r6.A00 = A13;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = r6.A00;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null && filterResults.count > 0) {
            AnonymousClass3XN r2 = this.A00;
            Object obj = filterResults.values;
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.whatsapp.inappbugreporting.data.BugCategoryFactory.BugCategory>");
            List A01 = C41681wt.A01(obj);
            C18070vi.A0d(A01, 0);
            r2.A00 = A01;
        }
        this.A00.notifyDataSetChanged();
    }
}
