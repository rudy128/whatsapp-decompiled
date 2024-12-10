package X;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Re  reason: invalid class name */
public class AnonymousClass0Re implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0Re(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.A00;
        View.OnFocusChangeListener onFocusChangeListener = searchView.A03;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
