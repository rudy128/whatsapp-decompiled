package X;

import android.util.Base64;
import java.util.List;

/* renamed from: X.9mD  reason: invalid class name and case insensitive filesystem */
public final class C191219mD {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C191219mD(String str, String str2, String str3, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        C28111Yx.A02(list);
        this.A04 = list;
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append("-");
        C17890vO.A10(str2, "-", str3, A11);
        this.A00 = A11.toString();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("FontRequest {mProviderAuthority: ");
        A102.append(this.A01);
        A102.append(", mProviderPackage: ");
        A102.append(this.A02);
        A102.append(", mQuery: ");
        A102.append(this.A03);
        C108985cd.A1L(", mCertificates:", A102, A10);
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i >= list.size()) {
                return AnonymousClass000.A0y(AnonymousClass001.A1I("mCertificatesArray: ", AnonymousClass8BT.A0y("}", A10), 0), A10);
            }
            A10.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                A10.append(" \"");
                A10.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                A10.append("\"");
            }
            A10.append(" ]");
            i++;
        }
    }
}
