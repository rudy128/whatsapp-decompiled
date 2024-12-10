package androidx.preference;

import X.AnonymousClass8J3;
import X.C20313AFv;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DropDownPreference extends ListPreference {
    public Spinner A00;
    public final Context A01;
    public final AdapterView.OnItemSelectedListener A02 = new C20313AFv(this, 0);
    public final ArrayAdapter A03;

    public void A0G(AnonymousClass8J3 r6) {
        int i;
        Spinner spinner = (Spinner) r6.A0H.findViewById(2131435547);
        this.A00 = spinner;
        spinner.setAdapter(this.A03);
        this.A00.setOnItemSelectedListener(this.A02);
        Spinner spinner2 = this.A00;
        String str = this.A00;
        CharSequence[] charSequenceArr = this.A02;
        if (str != null && charSequenceArr != null) {
            i = charSequenceArr.length;
            while (true) {
                i--;
                if (i >= 0) {
                    if (charSequenceArr[i].equals(str)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            spinner2.setSelection(i);
            super.A0G(r6);
        }
        i = -1;
        spinner2.setSelection(i);
        super.A0G(r6);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969410, 0);
        this.A01 = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.A03 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.A01;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public void A05() {
        super.A05();
        ArrayAdapter arrayAdapter = this.A03;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
