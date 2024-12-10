package X;

/* renamed from: X.6z2  reason: invalid class name and case insensitive filesystem */
public class C139556z2 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i >= length) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 3) {
                stringBuffer.append(charAt);
            } else if (str.charAt(i + 1) == 'r' && str.charAt(i + 2) == '\\' && str.charAt(i + 3) == 'n') {
                stringBuffer.append(10);
                i += 3;
            }
            i++;
        }
    }

    public String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        String str = this.A03;
        if (str != null) {
            A10.append(str);
        }
        A10.append(";");
        String str2 = this.A00;
        if (str2 != null) {
            A10.append(str2);
        }
        A10.append(";");
        String str3 = this.A02;
        if (str3 != null) {
            A10.append(str3);
        }
        A10.append(";");
        String str4 = this.A04;
        if (str4 != null) {
            A10.append(str4);
        }
        A10.append(";");
        String str5 = this.A01;
        if (str5 != null) {
            A10.append(str5);
        }
        return A10.toString();
    }

    public String toString() {
        String A002;
        StringBuilder A10 = AnonymousClass000.A10();
        String str = this.A03;
        if (str == null) {
            A002 = null;
        } else {
            A002 = A00(str);
        }
        A10.append(A002);
        A10.append(" ");
        A10.append(this.A00);
        A10.append(" ");
        A10.append(this.A02);
        A10.append(" ");
        A10.append(this.A04);
        A10.append(" ");
        return AnonymousClass000.A0y(this.A01, A10);
    }
}
