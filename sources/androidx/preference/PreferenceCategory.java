package androidx.preference;

import X.AnonymousClass8J3;
import X.C25476CgV;
import X.C26228CvK;
import X.C63882tq;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;

public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }

    public boolean A0O() {
        return false;
    }

    @Deprecated
    public void A0E(C26228CvK cvK) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 28 && (collectionItemInfo = cvK.A02.getCollectionItemInfo()) != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) new C25476CgV(collectionItemInfo).A00;
            cvK.A0a(C25476CgV.A00(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), true, collectionItemInfo2.isSelected()));
        }
    }

    public void A0G(AnonymousClass8J3 r4) {
        super.A0G(r4);
        if (Build.VERSION.SDK_INT >= 28) {
            r4.A0H.setAccessibilityHeading(true);
        }
    }

    public boolean A0P() {
        return !super.A0O();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130970799, 16842892));
    }

    public PreferenceCategory(Context context) {
        this(context, (AttributeSet) null);
    }
}
