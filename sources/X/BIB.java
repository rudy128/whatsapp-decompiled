package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class BIB extends FrameLayout {
    public ViewGroup A00;
    public boolean A01;

    public void onViewAdded(View view) {
        if (this.A01) {
            super.onViewAdded(view);
            return;
        }
        throw AnonymousClass000.A0n("This GhostViewHolder is detached!");
    }

    public static void A00(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            A00((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            ViewGroup viewGroup = this.A00;
            viewGroup.setTag(2131431116, (Object) null);
            viewGroup.getOverlay().remove(this);
            this.A01 = false;
        }
    }
}
