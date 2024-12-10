package X;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;

public final class D5L implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final E0F A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5L)) {
            return false;
        }
        return this.A00.equals(((D5L) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        Bio bio = ((D6X) this.A00).A00;
        AutoCompleteTextView autoCompleteTextView = bio.A04;
        if (autoCompleteTextView != null && autoCompleteTextView.getInputType() == 0) {
            CheckableImageButton checkableImageButton = bio.A01;
            int i = 1;
            if (z) {
                i = 2;
            }
            checkableImageButton.setImportantForAccessibility(i);
        }
    }

    public D5L(E0F e0f) {
        this.A00 = e0f;
    }
}
