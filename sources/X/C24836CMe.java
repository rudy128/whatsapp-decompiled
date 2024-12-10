package X;

/* renamed from: X.CMe  reason: case insensitive filesystem */
public class C24836CMe {
    public int A00;
    public long A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CMe] */
    public static C24836CMe A00(String str, int i, int i2) {
        if (i < i2) {
            long j = 0;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int charAt = str.charAt(i3);
                    if (charAt < 48 || charAt > 57) {
                        break;
                    }
                    j = (j * 10) + ((long) (charAt - 48));
                    if (j > 2147483647L) {
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            if (i3 != i) {
                ? obj = new Object();
                obj.A01 = j;
                obj.A00 = i3;
                return obj;
            }
        }
        return null;
    }
}
