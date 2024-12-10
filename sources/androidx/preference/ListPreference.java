package androidx.preference;

import X.AHL;
import X.AnonymousClass3MW;
import X.AnonymousClass8BS;
import X.AnonymousClass8BW;
import X.AnonymousClass8Gs;
import X.AnonymousClass9UH;
import X.B6X;
import X.C63882tq;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ArrayAdapter;

public class ListPreference extends DialogPreference {
    public String A00;
    public CharSequence[] A01;
    public CharSequence[] A02;
    public String A03;
    public boolean A04;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CharSequence A04() {
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        B6X b6x = this.A0C;
        if (b6x != null) {
            return b6x.CCs(this);
        }
        int A0R = A0R(this.A00);
        if (A0R < 0 || (charSequenceArr = this.A01) == null) {
            charSequence = null;
        } else {
            charSequence = charSequenceArr[A0R];
        }
        CharSequence A042 = super.A04();
        String str = this.A03;
        if (str != null) {
            Object[] A1a = AnonymousClass3MW.A1a();
            if (charSequence == null) {
                charSequence = "";
            }
            String A0l = AnonymousClass8BS.A0l(charSequence, str, A1a, 0);
            if (!TextUtils.equals(A0l, A042)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return A0l;
            }
        }
        return A042;
    }

    public void A0C(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass8Gs.class)) {
            super.A0C(parcelable);
            return;
        }
        AnonymousClass8Gs r3 = (AnonymousClass8Gs) parcelable;
        super.A0C(r3.getSuperState());
        A0S(r3.A00);
    }

    public int A0R(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.A02) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!this.A02[length].equals(str));
        return length;
    }

    public void A0S(String str) {
        boolean z = !TextUtils.equals(this.A00, str);
        if (z || !this.A04) {
            this.A00 = str;
            this.A04 = true;
            A0K(str);
            if (z) {
                A05();
            }
        }
    }

    public void A0T(CharSequence[] charSequenceArr) {
        if (this instanceof DropDownPreference) {
            DropDownPreference dropDownPreference = (DropDownPreference) this;
            dropDownPreference.A01 = charSequenceArr;
            ArrayAdapter arrayAdapter = dropDownPreference.A03;
            arrayAdapter.clear();
            CharSequence[] charSequenceArr2 = dropDownPreference.A01;
            if (charSequenceArr2 != null) {
                for (CharSequence charSequence : charSequenceArr2) {
                    arrayAdapter.add(charSequence.toString());
                }
                return;
            }
            return;
        }
        this.A01 = charSequenceArr;
    }

    public void A0H(CharSequence charSequence) {
        String charSequence2;
        super.A0H(charSequence);
        String str = this.A03;
        if (charSequence == null) {
            if (str != null) {
                charSequence2 = null;
            } else {
                return;
            }
        } else if (!charSequence.equals(str)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.A03 = charSequence2;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.AHL, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A04, i, i2);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A01 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A02 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            AHL ahl = AHL.A00;
            AHL ahl2 = ahl;
            if (ahl == null) {
                ? obj = new Object();
                AHL.A00 = obj;
                ahl2 = obj;
            }
            this.A0C = ahl2;
            A05();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnonymousClass9UH.A06, i, i2);
        this.A03 = AnonymousClass8BW.A0b(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C63882tq.A01(context, 2130969360, 16842897));
    }

    public ListPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
