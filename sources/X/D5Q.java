package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

public class D5Q implements AdapterView.OnItemClickListener {
    public final /* synthetic */ BJ1 A00;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        long j2 = j;
        int i2 = i;
        View view2 = view;
        BJ1 bj1 = this.A00;
        if (i < 0) {
            AnonymousClass0SF r2 = bj1.A06;
            if (!r2.A0A.isShowing()) {
                item = null;
            } else {
                item = r2.A0B.getSelectedItem();
            }
        } else {
            item = bj1.getAdapter().getItem(i);
        }
        BJ1.A01(bj1, item);
        AdapterView.OnItemClickListener onItemClickListener = bj1.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                AnonymousClass0SF r3 = bj1.A06;
                PopupWindow popupWindow = r3.A0A;
                if (!popupWindow.isShowing()) {
                    view2 = null;
                } else {
                    view2 = r3.A0B.getSelectedView();
                }
                if (!popupWindow.isShowing()) {
                    i2 = -1;
                } else {
                    i2 = r3.A0B.getSelectedItemPosition();
                }
                if (!popupWindow.isShowing()) {
                    j2 = Long.MIN_VALUE;
                } else {
                    j2 = r3.A0B.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(bj1.A06.A0B, view2, i2, j2);
        }
        bj1.A06.dismiss();
    }

    public D5Q(BJ1 bj1) {
        this.A00 = bj1;
    }
}
