package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5fH  reason: invalid class name and case insensitive filesystem */
public final class C110305fH extends Filter {
    public final /* synthetic */ C111865kY A00;

    public C110305fH(C111865kY r1) {
        this.A00 = r1;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            C111865kY r2 = this.A00;
            Object obj = filterResults.values;
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.List<com.whatsapp.countries.CountryAndCode>");
            List list = (List) obj;
            r2.A01 = list;
            r2.A0W(list);
        }
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A13 = AnonymousClass000.A13();
        if (charSequence == null || charSequence.length() == 0) {
            A13.addAll(this.A00.A02);
        } else {
            String obj = charSequence.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj.toLowerCase(locale);
            C18070vi.A0X(lowerCase);
            int length = lowerCase.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A0u = C109005cf.A0u(lowerCase, i2);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    length--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i++;
                }
            }
            String A0g = C108985cd.A0g(length, i, lowerCase);
            for (C128386fu r1 : this.A00.A02) {
                String lowerCase2 = r1.A01.toLowerCase(locale);
                C18070vi.A0X(lowerCase2);
                if (AnonymousClass1YF.A0V(lowerCase2, A0g)) {
                    A13.add(r1);
                }
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = A13;
        return filterResults;
    }
}
