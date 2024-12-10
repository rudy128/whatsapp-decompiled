package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.05E  reason: invalid class name */
public abstract class AnonymousClass05E extends ViewGroup {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass05E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        setClipChildren(true);
    }

    public abstract void A0C(C03330Hq r1, int i, int i2);

    public abstract String getDescriptionOfMountedItems();

    public String getHostHierarchyMountStateIdentifier() {
        return null;
    }

    public abstract int getMountItemCount();
}
