package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: X.0Rt  reason: invalid class name and case insensitive filesystem */
public class C05330Rt implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C03360Ht A00;
    public final /* synthetic */ AlertController$RecycleListView A01;
    public final /* synthetic */ AnonymousClass0QH A02;

    public C05330Rt(C03360Ht r1, AlertController$RecycleListView alertController$RecycleListView, AnonymousClass0QH r3) {
        this.A00 = r1;
        this.A01 = alertController$RecycleListView;
        this.A02 = r3;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C03360Ht r2 = this.A00;
        boolean[] zArr = r2.A0O;
        if (zArr != null) {
            zArr[i] = this.A01.isItemChecked(i);
        }
        r2.A0A.onClick(this.A02.A0X, i, this.A01.isItemChecked(i));
    }
}
