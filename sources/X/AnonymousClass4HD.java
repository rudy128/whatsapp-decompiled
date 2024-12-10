package X;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.4HD  reason: invalid class name */
public abstract class AnonymousClass4HD {
    public static final void A00(ListView listView) {
        C18070vi.A0d(listView, 0);
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 1073741824);
            int count = adapter.getCount();
            int i = 0;
            for (int i2 = 0; i2 < count; i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                C18070vi.A0X(view);
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            listView.getLayoutParams().height = i + (listView.getDividerHeight() * (adapter.getCount() - 1));
            listView.requestLayout();
        }
    }
}
