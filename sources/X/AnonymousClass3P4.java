package X;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3P4  reason: invalid class name */
public final class AnonymousClass3P4 extends Filter {
    public final /* synthetic */ C73073Ow A00;

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        C18070vi.A0d(charSequence, 0);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (AnonymousClass1YF.A0G(charSequence).length() > 0) {
            ArrayList A13 = AnonymousClass000.A13();
            String obj = charSequence.toString();
            C73073Ow r8 = this.A00;
            C18000vb r7 = r8.A09;
            ArrayList A03 = C20103A7h.A03(r7, obj);
            C18070vi.A0X(A03);
            String A06 = AnonymousClass1EG.A06(charSequence);
            C18070vi.A0X(A06);
            String A062 = AnonymousClass1EG.A06(r8.A0B.getString(2131890881));
            C18070vi.A0X(A062);
            boolean A0Y = AnonymousClass1YF.A0Y(A06, A062, false);
            List list = r8.A0C;
            ArrayList<AnonymousClass43Q> A132 = AnonymousClass000.A13();
            for (Object next : list) {
                if (next instanceof AnonymousClass43Q) {
                    A132.add(next);
                }
            }
            for (AnonymousClass43Q r2 : A132) {
                AnonymousClass1E7 r1 = r2.A00.A00;
                if (r8.A07.A0l(r1, A03) || C20103A7h.A04(r7, r1.A0c, A03, true) || A0Y) {
                    A13.add(r2);
                }
            }
            boolean isEmpty = A13.isEmpty();
            arrayList = A13;
            if (isEmpty) {
                A13.add(0, new AnonymousClass43T(charSequence.toString()));
                arrayList = A13;
            }
        } else {
            arrayList = this.A00.A0C;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list;
        C18070vi.A0d(filterResults, 1);
        Object obj = filterResults.values;
        if (!(obj instanceof List) || (list = (List) obj) == null) {
            list = this.A00.A0C;
        }
        C73073Ow.A00(this.A00, list);
    }

    public AnonymousClass3P4(C73073Ow r1) {
        this.A00 = r1;
    }
}
