package X;

/* renamed from: X.0Ia  reason: invalid class name and case insensitive filesystem */
public class C03420Ia {
    public final int A00;
    public final CharSequence A01;

    public int hashCode() {
        String str;
        Object[] objArr = new Object[2];
        AnonymousClass000.A1L(objArr, this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return AnonymousClass000.A0P(str, objArr, 1);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof C03420Ia) {
            C03420Ia r5 = (C03420Ia) obj;
            if (this.A00 == r5.A00) {
                CharSequence charSequence = r5.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                    return true;
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C03420Ia(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }
}
