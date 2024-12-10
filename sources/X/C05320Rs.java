package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Rs  reason: invalid class name and case insensitive filesystem */
public class C05320Rs implements AdapterView.OnItemClickListener {
    public final /* synthetic */ SearchView A00;

    public C05320Rs(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A00.A0Q(i);
    }
}
