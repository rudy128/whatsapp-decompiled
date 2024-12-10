package X;

import android.widget.Filter;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5fI  reason: invalid class name and case insensitive filesystem */
public final class C110315fI extends Filter {
    public int A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Object r2;
        int i;
        ArrayList arrayList2 = null;
        if (charSequence != null) {
            arrayList = C20103A7h.A03(this.A01.A00, charSequence.toString());
        } else {
            arrayList = null;
        }
        int i2 = this.A00;
        DocumentPickerActivity documentPickerActivity = this.A01;
        int i3 = documentPickerActivity.A00;
        if (i2 != i3) {
            this.A00 = i3;
            C18000vb r22 = documentPickerActivity.A00;
            C18070vi.A0X(r22);
            List list = documentPickerActivity.A0R;
            int i4 = this.A00;
            if (list != null) {
                if (i4 == 0) {
                    Collator A0r = C108965cb.A0r(r22);
                    A0r.setDecomposition(1);
                    r2 = new AnonymousClass840(A0r);
                    i = 6;
                } else if (i4 == 1) {
                    r2 = AnonymousClass84F.A00;
                    i = 5;
                }
                Collections.sort(list, new C146997Rk(r2, i));
            }
        }
        if (documentPickerActivity.A0R == null || arrayList == null || arrayList.isEmpty()) {
            arrayList2 = documentPickerActivity.A0R;
        } else {
            List<C133676pJ> list2 = documentPickerActivity.A0R;
            if (list2 != null) {
                ArrayList A13 = AnonymousClass000.A13();
                for (C133676pJ r3 : list2) {
                    if (C20103A7h.A04(documentPickerActivity.A00, r3.A03, arrayList, true)) {
                        A13.add(r3);
                    }
                }
                arrayList2 = A13;
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList2;
        filterResults.count = AnonymousClass001.A0m(arrayList2);
        return filterResults;
    }

    public C110315fI(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults != null) {
            Object obj = filterResults.values;
            if (obj instanceof ArrayList) {
                DocumentPickerActivity documentPickerActivity = this.A01;
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : (Iterable) obj) {
                    if (next instanceof C133676pJ) {
                        A13.add(next);
                    }
                }
                documentPickerActivity.A0S = C29431cG.A0t(A13);
            }
        }
        DocumentPickerActivity documentPickerActivity2 = this.A01;
        C110275fD r0 = documentPickerActivity2.A0G;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r0.notifyDataSetChanged();
        DocumentPickerActivity.A13(documentPickerActivity2);
    }
}
