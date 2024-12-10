package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

public class BLQ extends C27461We {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ BLs A02;

    public BLQ(FrameLayout frameLayout, Fragment fragment, BLs bLs) {
        this.A02 = bLs;
        this.A01 = fragment;
        this.A00 = frameLayout;
    }

    public void A03(View view, Fragment fragment, AnonymousClass1GP r4) {
        if (fragment == this.A01) {
            r4.A0p(this);
            BLs.A03(view, this.A00);
        }
    }
}
