package X;

import android.content.ContentValues;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.6tl  reason: invalid class name and case insensitive filesystem */
public class C136406tl {
    public ContentValues A00 = C17880vN.A08();
    public String A01 = "";
    public String A02 = "";
    public List A03 = AnonymousClass000.A13();
    public Set A04 = C17880vN.A12();
    public Set A05 = C17880vN.A12();
    public byte[] A06;

    public boolean equals(Object obj) {
        if (!(obj instanceof C136406tl)) {
            return false;
        }
        C136406tl r6 = (C136406tl) obj;
        String str = this.A01;
        if (str == null || !str.equals(r6.A01) || !this.A00.equals(r6.A00) || !this.A04.equals(r6.A04) || !this.A05.equals(r6.A05)) {
            return false;
        }
        byte[] bArr = this.A06;
        if (bArr != null && Arrays.equals(bArr, r6.A06)) {
            return true;
        }
        if (!this.A02.equals(r6.A02)) {
            return false;
        }
        List list = this.A03;
        List list2 = r6.A03;
        if (list.equals(list2) || list.size() == 1 || list2.size() == 1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.A06;
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        if (obj == null) {
            return AnonymousClass000.A0P(this.A02, objArr, 4);
        }
        objArr[4] = obj;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("propName: ");
        A10.append(this.A01);
        A10.append(", paramMap: ");
        A10.append(this.A00.toString());
        A10.append(", propmMap_TYPE: ");
        A10.append(this.A04.toString());
        A10.append(", propGroupSet: ");
        A10.append(this.A05.toString());
        List list = this.A03;
        if (list.size() > 1) {
            C17890vO.A15(", propValue_vector size: ", A10, list);
        }
        byte[] bArr = this.A06;
        if (bArr != null) {
            A10.append(", propValue_bytes size: ");
            A10.append(bArr.length);
        }
        A10.append(", propValue: ");
        return AnonymousClass000.A0y(this.A02, A10);
    }
}
