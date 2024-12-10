package X;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0Ru  reason: invalid class name and case insensitive filesystem */
public class C05340Ru implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C05340Ru(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            AnonymousClass06Q r3 = (AnonymousClass06Q) obj;
            AppCompatSpinner appCompatSpinner = r3.A04;
            appCompatSpinner.setSelection(i);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(view, i, r3.A01.getItemId(i));
            }
            r3.dismiss();
            return;
        }
        C03360Ht r32 = (C03360Ht) obj;
        DialogInterface.OnClickListener onClickListener = r32.A06;
        AnonymousClass02A r1 = ((AnonymousClass0QH) this.A02).A0X;
        onClickListener.onClick(r1, i);
        if (!r32.A0M) {
            r1.dismiss();
        }
    }
}
