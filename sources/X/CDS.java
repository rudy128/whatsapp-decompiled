package X;

import java.util.Formatter;

public abstract class CDS {
    public static String A00(StringBuilder sb, Formatter formatter, long j) {
        Object[] objArr;
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long A04 = C17880vN.A04(j + 500);
        long j2 = A04 % 60;
        long j3 = (A04 / 60) % 60;
        long j4 = A04 / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            objArr = AnonymousClass8BR.A1a();
            AnonymousClass3MX.A1S(objArr, 0, j4);
            AnonymousClass3MX.A1S(objArr, 1, j3);
            AnonymousClass3MX.A1S(objArr, 2, j2);
            str = "%d:%02d:%02d";
        } else {
            objArr = new Object[2];
            AnonymousClass3MX.A1S(objArr, 0, j3);
            AnonymousClass3MX.A1S(objArr, 1, j2);
            str = "%02d:%02d";
        }
        return formatter.format(str, objArr).toString();
    }
}
