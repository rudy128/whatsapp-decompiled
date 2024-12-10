package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.contact.picker.ContactPickerBottomSheetActivity;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.79H  reason: invalid class name */
public class AnonymousClass79H implements AbsListView.OnScrollListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public AnonymousClass79H(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ContactPickerFragment contactPickerFragment = this.A00;
        View view = contactPickerFragment.A08;
        if (view != null) {
            if (i != 0) {
                view.setVisibility(8);
            } else if (contactPickerFragment.A4G.containsKey(C29671cg.A00)) {
                contactPickerFragment.A08.setVisibility(0);
                View childAt = absListView.getChildAt(0);
                if (childAt != null) {
                    contactPickerFragment.A08.setAlpha(((float) (childAt.getHeight() + childAt.getTop())) / C108945cZ.A04(childAt));
                    contactPickerFragment.A08.setTranslationY((float) childAt.getTop());
                }
            }
        }
        C142977Bn r3 = contactPickerFragment.A0r;
        boolean z = !contactPickerFragment.A0D.canScrollList(-1);
        C166678dR r1 = r3.A00;
        if (r1 instanceof ContactPickerBottomSheetActivity) {
            ((ContactPickerBottomSheetActivity) r1).A01 = z;
        }
    }
}
