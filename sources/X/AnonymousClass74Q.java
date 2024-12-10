package X;

import android.animation.Animator;
import android.widget.RelativeLayout;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;
import java.util.Map;

/* renamed from: X.74Q  reason: invalid class name */
public final class AnonymousClass74Q implements Animator.AnimatorListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public AnonymousClass74Q(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }

    public void onAnimationEnd(Animator animator) {
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A00;
        RelativeLayout relativeLayout = selectedListContactPickerFragment.A00;
        if (relativeLayout != null) {
            Map map = selectedListContactPickerFragment.A4G;
            C18070vi.A0W(map);
            relativeLayout.setVisibility(C72453Mb.A07(map.isEmpty() ^ true ? 1 : 0));
        }
        selectedListContactPickerFragment.A35();
    }

    public void onAnimationStart(Animator animator) {
        C72453Mb.A1C(this.A00.A00);
    }
}
