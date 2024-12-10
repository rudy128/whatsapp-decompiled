package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.9oN  reason: invalid class name and case insensitive filesystem */
public class C192429oN {
    public final Collection A00;
    public final Map A01;
    public final byte[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C192429oN r5 = (C192429oN) obj;
            if (!Arrays.equals(this.A02, r5.A02) || !this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C192429oN(Collection collection, Map map, byte[] bArr) {
        this.A02 = bArr;
        this.A00 = collection;
        this.A01 = map;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A02;
        A1a[1] = this.A01;
        return AnonymousClass000.A0P(this.A00, A1a, 2);
    }
}
