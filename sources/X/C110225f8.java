package X;

import android.widget.BaseAdapter;

/* renamed from: X.5f8  reason: invalid class name and case insensitive filesystem */
public abstract class C110225f8 extends BaseAdapter {
    public long getItemId(int i) {
        return ((long) i) * 1024;
    }

    public int getViewTypeCount() {
        return 5;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof AnonymousClass7EJ) {
            return 1;
        }
        if ((item instanceof AnonymousClass7EF) || (item instanceof AnonymousClass7EC)) {
            return 2;
        }
        if (item instanceof AnonymousClass7E8) {
            return 3;
        }
        return 0;
    }
}
