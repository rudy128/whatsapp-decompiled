package X;

/* renamed from: X.6xp  reason: invalid class name and case insensitive filesystem */
public class C138866xp {
    public final String A00;
    public final String A01;

    public boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }

    public C138866xp(C138866xp... r8) {
        String str = "";
        String str2 = str;
        int i = 0;
        do {
            C138866xp r2 = r8[i];
            str = AnonymousClass000.A0y(r2.A01, AnonymousClass000.A11(str));
            str2 = AnonymousClass000.A0y(r2.A00, AnonymousClass000.A11(str2));
            i++;
        } while (i < 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public C138866xp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
