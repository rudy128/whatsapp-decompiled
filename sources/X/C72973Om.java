package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Om  reason: invalid class name and case insensitive filesystem */
public final class C72973Om extends BaseAdapter {
    public int A00 = 0;
    public final Context A01;
    public final List A02;

    public C72973Om(Context context, List list) {
        this.A01 = context;
        this.A02 = list;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = LayoutInflater.from(this.A01).inflate(2131625170, viewGroup, false);
        }
        CompoundButton compoundButton = (CompoundButton) AnonymousClass3MX.A0C(view, 2131434311);
        TextView A0W = C72453Mb.A0W(view, 2131430295);
        List list = this.A02;
        A0W.setText((CharSequence) list.get(i));
        if (i == this.A00) {
            z = true;
        }
        compoundButton.setChecked(z);
        if (list.size() <= 1) {
            compoundButton.setVisibility(8);
        }
        C90104dX.A00(compoundButton, this, i, 23);
        C90104dX.A00(view, this, i, 24);
        return view;
    }

    public int getCount() {
        return this.A02.size();
    }

    public Object getItem(int i) {
        return this.A02.get(i);
    }
}
