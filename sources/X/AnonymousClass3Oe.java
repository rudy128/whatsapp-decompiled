package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Oe  reason: invalid class name */
public final class AnonymousClass3Oe extends ArrayAdapter {
    public int A00;
    public final AnonymousClass1LA A01;
    public final List A02;

    /* JADX WARNING: type inference failed for: r1v5, types: [X.4NX, java.lang.Object] */
    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass4NX r1;
        C18070vi.A0d(viewGroup, 2);
        boolean z = false;
        if (view == null) {
            view = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625764, false);
            ? obj = new Object();
            view.setTag(obj);
            obj.A02 = C17880vN.A0E(view, 2131436208);
            obj.A01 = C17880vN.A0E(view, 2131435885);
            obj.A00 = (RadioButton) view.findViewById(2131434310);
            r1 = obj;
        } else {
            Object tag = view.getTag();
            C18070vi.A0z(tag, "null cannot be cast to non-null type com.whatsapp.registration.SelectPhoneNumberDialog.MyArrayAdapter.ViewHolder");
            r1 = (AnonymousClass4NX) tag;
        }
        C89384cN r8 = (C89384cN) this.A02.get(i);
        String str = r8.A00;
        String str2 = r8.A02;
        TextView textView = r1.A02;
        if (textView != null) {
            textView.setText(A9B.A0D(this.A01, str, C17900vP.A0A(str, str2)));
        }
        TextView textView2 = r1.A01;
        if (textView2 != null) {
            Context context = viewGroup.getContext();
            Object[] objArr = new Object[2];
            C17880vN.A1T(objArr, i + 1, 0);
            objArr[1] = r8.A01;
            AnonymousClass3MY.A0y(context, textView2, objArr, 2131895620);
        }
        RadioButton radioButton = r1.A00;
        if (radioButton != null) {
            if (i == this.A00) {
                z = true;
            }
            radioButton.setChecked(z);
        }
        return view;
    }

    public int getCount() {
        return this.A02.size();
    }

    public AnonymousClass3Oe(Context context, AnonymousClass1LA r3, List list) {
        super(context, 2131625764, list);
        this.A01 = r3;
        this.A02 = list;
    }
}
