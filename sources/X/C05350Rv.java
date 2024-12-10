package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Rv  reason: invalid class name and case insensitive filesystem */
public class C05350Rv implements AdapterView.OnItemSelectedListener {
    public final int A00;
    public final Object A01;

    public C05350Rv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C009205e r1;
        if (this.A00 != 0) {
            SearchView.A05((SearchView) this.A01, i);
        } else if (i != -1 && (r1 = ((AnonymousClass0SF) this.A01).A0B) != null) {
            r1.A07 = false;
        }
    }

    public void onNothingSelected(AdapterView adapterView) {
    }
}
