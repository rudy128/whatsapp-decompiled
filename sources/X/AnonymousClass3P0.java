package X;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: X.3P0  reason: invalid class name */
public class AnonymousClass3P0 extends Filter {
    public C108175bG A00;

    public CharSequence convertResultToString(Object obj) {
        return this.A00.BFv((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor CGR = this.A00.CGR(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (CGR != null) {
            filterResults.count = CGR.getCount();
        } else {
            filterResults.count = 0;
            CGR = null;
        }
        filterResults.values = CGR;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        C108175bG r2 = this.A00;
        Cursor cursor = ((C73093Oy) r2).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            r2.BEZ((Cursor) obj);
        }
    }
}
