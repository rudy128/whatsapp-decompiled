package X;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class D5R implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ Bio A00;

    public final void onDismiss() {
        Bio bio = this.A00;
        bio.A05 = true;
        bio.A00 = System.currentTimeMillis();
        Bio.A01(bio, false);
    }

    public /* synthetic */ D5R(Bio bio) {
        this.A00 = bio;
    }
}
