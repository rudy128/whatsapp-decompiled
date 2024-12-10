package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.05N  reason: invalid class name */
public class AnonymousClass05N extends ArrayAdapter {
    public final /* synthetic */ C03360Ht A00;
    public final /* synthetic */ AlertController$RecycleListView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass05N(Context context, C03360Ht r3, AlertController$RecycleListView alertController$RecycleListView, CharSequence[] charSequenceArr, int i) {
        super(context, i, 16908308, charSequenceArr);
        this.A00 = r3;
        this.A01 = alertController$RecycleListView;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.A00.A0O;
        if (zArr != null && zArr[i]) {
            this.A01.setItemChecked(i, true);
        }
        return view2;
    }
}
