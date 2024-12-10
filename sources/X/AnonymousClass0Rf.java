package X;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Rf  reason: invalid class name */
public class AnonymousClass0Rf implements View.OnKeyListener {
    public final /* synthetic */ SearchView A00;

    public AnonymousClass0Rf(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.A00;
        if (searchView.A00 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0b;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                return searchView.A0R(i, keyEvent);
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                searchView.A0O(searchAutoComplete.getText().toString());
                return true;
            }
        }
        return false;
    }
}
