package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.6Ug  reason: invalid class name and case insensitive filesystem */
public abstract class C123386Ug {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;

    public abstract View buildPaymentHelpSupportSection(Context context, C20284AEs aEs, String str);

    public ArrayList A00() {
        boolean z = this instanceof C120076Bo;
        ArrayList A13 = AnonymousClass000.A13();
        if (z) {
            String str = this.A02;
            if (!(str == null || str.length() == 0)) {
                C108965cb.A1Q("Payments fb txn id", str, A13);
            }
            String str2 = this.A01;
            if (!(str2 == null || str2.length() == 0)) {
                C108965cb.A1Q("Payments return value", str2, A13);
            }
            String str3 = this.A03;
            if (!(str3 == null || str3.length() == 0)) {
                C108965cb.A1Q("Payments status", str3, A13);
            }
        } else {
            if (!TextUtils.isEmpty(this.A02)) {
                C108965cb.A1Q("Payments fb txn id", this.A02, A13);
            }
            if (!TextUtils.isEmpty(this.A00)) {
                C108965cb.A1Q("Payments bank txn id", this.A00, A13);
            }
            if (!TextUtils.isEmpty(this.A01)) {
                C108965cb.A1Q("Payments return value", this.A01, A13);
            }
            if (!TextUtils.isEmpty(this.A03)) {
                C108965cb.A1Q("Payments status", this.A03, A13);
            }
        }
        ArrayList arrayList = this.A04;
        if (arrayList != null && !arrayList.isEmpty()) {
            StringBuilder A10 = AnonymousClass000.A10();
            for (int i = 0; i < arrayList.size(); i++) {
                A10.append(C108945cZ.A1H(arrayList, i));
                if (i < AnonymousClass000.A0Q(arrayList)) {
                    A10.append(", ");
                }
            }
            A13.add(C108945cZ.A0N("Topic IDs", A10.toString()));
        }
        return A13;
    }
}
