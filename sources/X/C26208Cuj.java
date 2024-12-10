package X;

/* renamed from: X.Cuj  reason: case insensitive filesystem */
public abstract class C26208Cuj {
    public static void A00(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw BE6.A0j();
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw BE6.A0m();
        }
    }

    public static void A02(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass000.A0s(String.valueOf(obj2));
        }
    }

    public static void A03(String str, Object[] objArr, boolean z) {
        if (!z) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            int length2 = objArr.length;
            StringBuilder A0q = BE7.A0q(length, length2 * 16);
            int i = 0;
            int i2 = 0;
            while (i < length2) {
                int indexOf = valueOf.indexOf("%s", i2);
                if (indexOf == -1) {
                    break;
                }
                i = BE9.A0H(valueOf.substring(i2, indexOf), A0q, objArr, i);
                i2 = indexOf + 2;
            }
            A0q.append(valueOf.substring(i2));
            if (i < length2) {
                int A0H = BE9.A0H(" [", A0q, objArr, i);
                while (A0H < length2) {
                    A0H = BE9.A0H(", ", A0q, objArr, A0H);
                }
                A0q.append(']');
            }
            throw AnonymousClass000.A0j(A0q);
        }
    }

    public static void A05(boolean z) {
        if (!z) {
            throw BE6.A0k();
        }
    }

    public static void A04(boolean z) {
        A00(Boolean.valueOf(z));
    }
}
