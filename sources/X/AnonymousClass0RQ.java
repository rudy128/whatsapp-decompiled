package X;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0RQ  reason: invalid class name */
public class AnonymousClass0RQ implements TextWatcher {
    public final /* synthetic */ SearchView A00;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public AnonymousClass0RQ(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00.A0M(charSequence);
    }
}
