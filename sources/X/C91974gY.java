package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.fragment.app.Fragment;
import com.whatsapp.CodeInputField;

/* renamed from: X.4gY  reason: invalid class name and case insensitive filesystem */
public class C91974gY implements AnonymousClass5YS {
    public final int A00;
    public final Object A01;

    public C91974gY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final SpannableStringBuilder BZV(String str) {
        SpannableStringBuilder spannableStringBuilder;
        Context A14;
        Context A142;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                CodeInputField codeInputField = (CodeInputField) this.A01;
                spannableStringBuilder = AnonymousClass3MW.A09(str);
                for (int i3 = 0; i3 < spannableStringBuilder.length(); i3++) {
                    if (spannableStringBuilder.charAt(i3) == codeInputField.A01) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass3MZ.A02(codeInputField.A06, codeInputField.getContext(), 2130969091, 2131100133)), i3, i3 + 1, 33);
                    }
                }
                break;
            case 1:
                Context context = (Context) this.A01;
                spannableStringBuilder = AnonymousClass3MW.A09(str);
                for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                    if (spannableStringBuilder.charAt(i4) == '*') {
                        int i5 = i4 + 1;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i5, 33);
                        spannableStringBuilder.setSpan(new C22625BGl(context, AnonymousClass3Ma.A00(context, 2130969091, 2131100133)), i4, i5, 33);
                    } else if (spannableStringBuilder.charAt(i4) != 160) {
                        spannableStringBuilder.setSpan(new C22625BGl(context, AnonymousClass3Ma.A00(context, 2130969092, 2131100134)), i4, i4 + 1, 33);
                    }
                }
                break;
            default:
                Fragment fragment = (Fragment) this.A01;
                spannableStringBuilder = AnonymousClass3MW.A09(str);
                int length = spannableStringBuilder.length();
                for (int i6 = 0; i6 < length; i6++) {
                    if (spannableStringBuilder.charAt(i6) == '*') {
                        A14 = fragment.A14();
                        A142 = fragment.A14();
                        i = 2130969091;
                        i2 = 2131100133;
                    } else if (spannableStringBuilder.charAt(i6) != 160) {
                        A14 = fragment.A14();
                        A142 = fragment.A14();
                        i = 2130969092;
                        i2 = 2131100134;
                    }
                    spannableStringBuilder.setSpan(new C22625BGl(fragment.A14(), AnonymousClass3MZ.A02(A142, A14, i, i2)), i6, i6 + 1, 33);
                }
                break;
        }
        return spannableStringBuilder;
    }
}
