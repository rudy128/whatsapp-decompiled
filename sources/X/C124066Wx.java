package X;

import java.util.Arrays;

/* renamed from: X.6Wx  reason: invalid class name and case insensitive filesystem */
public abstract class C124066Wx {
    public static final String A00(Long l) {
        Object[] copyOf;
        String str;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        long j = longValue / 3600000;
        long j2 = (longValue % 3600000) / 60000;
        long A04 = C17880vN.A04(longValue % 60000);
        if (j > 0) {
            Object[] objArr = new Object[3];
            AnonymousClass3MX.A1S(objArr, 0, j);
            AnonymousClass3MX.A1S(objArr, 1, j2);
            AnonymousClass3MX.A1S(objArr, 2, A04);
            copyOf = Arrays.copyOf(objArr, 3);
            str = "%d:%02d:%02d";
        } else {
            Object[] objArr2 = new Object[2];
            AnonymousClass3MX.A1S(objArr2, 0, j2);
            AnonymousClass3MX.A1S(objArr2, 1, A04);
            copyOf = Arrays.copyOf(objArr2, 2);
            str = "%d:%02d";
        }
        String format = String.format(str, copyOf);
        C18070vi.A0X(format);
        return format;
    }
}
