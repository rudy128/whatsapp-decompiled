package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Rz  reason: invalid class name and case insensitive filesystem */
public class C05390Rz implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView A00;

    public C05390Rz(SearchView searchView) {
        this.A00 = searchView;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.A00.A0I();
        return true;
    }
}
