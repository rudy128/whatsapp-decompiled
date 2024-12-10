package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

public class BHH extends View.AccessibilityDelegate {
    public final /* synthetic */ C26147CtC A00;

    public BHH(C26147CtC ctC) {
        this.A00 = ctC;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.A00.A0R.A0B;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
