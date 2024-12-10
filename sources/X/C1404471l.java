package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.71l  reason: invalid class name and case insensitive filesystem */
public final class C1404471l {
    public EditText A00;
    public String A01 = "";
    public String A02 = "";
    public final Context A03;
    public final EditText A04;
    public final EditText A05;
    public final C132296mY A06;
    public final AnonymousClass1KW A07;
    public final C18030ve A08;
    public final C28931bI A09;
    public final C28931bI A0A;
    public final View A0B;

    public C1404471l(Context context, View view, C132296mY r8, AnonymousClass1KW r9, C18030ve r10) {
        this.A08 = r10;
        this.A0B = view;
        this.A03 = context;
        this.A07 = r9;
        this.A06 = r8;
        EditText editText = (EditText) C18070vi.A05(view, 2131430883);
        this.A04 = editText;
        EditText editText2 = (EditText) C18070vi.A05(view, 2131431950);
        this.A05 = editText2;
        this.A09 = C28931bI.A00(view, 2131429402);
        this.A0A = C28931bI.A00(view, 2131428556);
        ((TextInputLayout) AnonymousClass1HF.A06(view, 2131430884)).setHint((CharSequence) context.getResources().getString(2131888760));
        ((TextInputLayout) AnonymousClass1HF.A06(view, 2131431951)).setHint((CharSequence) context.getResources().getString(2131888761));
        editText.addTextChangedListener(new AnonymousClass6If(editText, this, 0));
        editText2.addTextChangedListener(new AnonymousClass6If(editText2, this, 0));
    }

    public static String A00(EditText editText) {
        return A01(editText.getText().toString());
    }

    public static final String A01(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A0u = C109005cf.A0u(str, i2);
            if (z) {
                if (!A0u) {
                    break;
                }
                length--;
            } else if (!A0u) {
                z = true;
            } else {
                i++;
            }
        }
        return new C41661wr(" +").A00(C108985cd.A0g(length, i, str), " ");
    }

    public final String A02() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(A00(this.A04));
        A10.append(' ');
        String A0y = AnonymousClass000.A0y(A00(this.A05), A10);
        int length = A0y.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1A = C108975cc.A1A(C18070vi.A00(A0y.charAt(i2), 32));
            if (z) {
                if (!A1A) {
                    break;
                }
                length--;
            } else if (!A1A) {
                z = true;
            } else {
                i++;
            }
        }
        return C108985cd.A0g(length, i, A0y);
    }
}
