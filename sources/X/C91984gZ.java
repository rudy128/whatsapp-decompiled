package X;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import com.whatsapp.CodeInputField;

/* renamed from: X.4gZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91984gZ implements AnonymousClass5YS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CodeInputField A01;

    public final SpannableStringBuilder BZV(String str) {
        int A002;
        CodeInputField codeInputField = this.A01;
        int i = this.A00;
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(str);
        for (int i2 = 0; i2 < A09.length(); i2++) {
            if (A09.charAt(i2) == ')') {
                A09.setSpan(new RelativeSizeSpan(0.9f), i2, i2 + 1, 33);
            } else if (A09.charAt(i2) == 160) {
            }
            if (i != 0) {
                A002 = i;
            } else {
                A002 = C19740yt.A00(codeInputField.getContext(), AnonymousClass4Z9.A00(codeInputField.getContext(), 2130968579));
            }
            A09.setSpan(new C22625BGl(codeInputField.A06, A002), i2, i2 + 1, 33);
        }
        return A09;
    }

    public /* synthetic */ C91984gZ(CodeInputField codeInputField, int i) {
        this.A01 = codeInputField;
        this.A00 = i;
    }
}
