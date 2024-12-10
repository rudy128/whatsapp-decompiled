package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9zB  reason: invalid class name and case insensitive filesystem */
public final class C198949zB {
    public final String A00;

    public final String A00(String str) {
        List list;
        String str2 = this.A00;
        if (str2 != null) {
            C25654Cjk A002 = C25489Cgk.A00(str2);
            int A03 = AnonymousClass8BU.A03(A002.A01("$.length()", new E6J[0]));
            for (int i = 0; i < A03; i++) {
                try {
                    list = (List) A002.A01(AnonymousClass000.A0y("].error_equals", AnonymousClass8BW.A0n(i, "$.[")), new E6J[0]);
                } catch (ClassCastException e) {
                    Log.e("FcsStateErrors: Failed to parse error_equals as a List<String>", e);
                    list = C18460wS.A00;
                } catch (C23737Boi unused) {
                    list = C18460wS.A00;
                }
                if (list.contains(str) || list.isEmpty()) {
                    return (String) A002.A01(AnonymousClass000.A0y("].next", AnonymousClass8BW.A0n(i, "$.[")), new E6J[0]);
                }
            }
        }
        return null;
    }

    public C198949zB(String str) {
        this.A00 = str;
    }

    public C198949zB() {
        this((String) null);
    }
}
