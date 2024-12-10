package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.location.LiveLocationPrivacyActivity;

/* renamed from: X.79I  reason: invalid class name */
public class AnonymousClass79I implements AbsListView.OnScrollListener {
    public int A00;
    public final int A01 = 0;
    public final Object A02;

    public AnonymousClass79I(PhoneContactsSelector phoneContactsSelector) {
        this.A02 = phoneContactsSelector;
        this.A00 = 0;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        View view;
        float f;
        if (this.A01 != 0) {
            if (i + i2 == i3) {
                int bottom = absListView.getChildAt(i2 - 1).getBottom();
                LiveLocationPrivacyActivity liveLocationPrivacyActivity = (LiveLocationPrivacyActivity) this.A02;
                int bottom2 = liveLocationPrivacyActivity.A01.getBottom() - liveLocationPrivacyActivity.A01.getPaddingBottom();
                view = liveLocationPrivacyActivity.A00;
                if (bottom == bottom2) {
                    f = 0.0f;
                }
                f = (float) this.A00;
            } else {
                view = ((LiveLocationPrivacyActivity) this.A02).A00;
                f = (float) this.A00;
            }
            view.setElevation(f);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.A01 == 0) {
            int i2 = this.A00;
            if (i2 == 0 && i != i2) {
                ((AnonymousClass1FY) this.A02).A09.A01(absListView);
            }
            this.A00 = i;
        }
    }

    public AnonymousClass79I(LiveLocationPrivacyActivity liveLocationPrivacyActivity, int i) {
        this.A02 = liveLocationPrivacyActivity;
        this.A00 = i;
    }
}
