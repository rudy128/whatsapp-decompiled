package X;

import android.animation.ValueAnimator;
import android.widget.ListView;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.74a  reason: invalid class name and case insensitive filesystem */
public final class C1410374a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C18070vi.A0d(valueAnimator, 0);
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A00;
        ListView listView = selectedListContactPickerFragment.A0D;
        if (listView != null) {
            SelectedListContactPickerFragment.A02(listView, selectedListContactPickerFragment, C72473Md.A02(valueAnimator));
        }
    }

    public C1410374a(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }
}
