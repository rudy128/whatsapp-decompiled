package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public class BMO extends RecyclerView {
    public final /* synthetic */ ViewPager2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BMO(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00.A09 || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A00.A09 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.A00;
        accessibilityEvent.setFromIndex(viewPager2.A00);
        accessibilityEvent.setToIndex(viewPager2.A00);
        accessibilityEvent.setSource(viewPager2.A07.A04);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }
}
