package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.4Zy  reason: invalid class name and case insensitive filesystem */
public final class C88494Zy {
    public final int A00;
    public final CharSequence A01;
    public final CharSequence A02;

    public static List A00(CharSequence charSequence, Object[] objArr, int i) {
        C18070vi.A0X(charSequence);
        objArr[2] = new C88494Zy(charSequence, (CharSequence) null, i);
        List asList = Arrays.asList(objArr);
        C18070vi.A0X(asList);
        return asList;
    }

    public static void A02(CharSequence charSequence, Object[] objArr, int i) {
        C18070vi.A0X(charSequence);
        objArr[1] = new C88494Zy(charSequence, (CharSequence) null, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88494Zy) {
                C88494Zy r5 = (C88494Zy) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static void A01(CharSequence charSequence, CharSequence charSequence2, Object[] objArr, int i, int i2) {
        objArr[i2] = new C88494Zy(charSequence, charSequence2, i);
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, this.A00 * 31) + AnonymousClass001.A0k(this.A01);
    }

    public C88494Zy(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A00 = i;
        this.A02 = charSequence;
        this.A01 = charSequence2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BulletItemViewState(icon=");
        A10.append(this.A00);
        A10.append(", title=");
        A10.append(this.A02);
        A10.append(", subtitle=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
