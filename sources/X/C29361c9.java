package X;

/* renamed from: X.1c9  reason: invalid class name and case insensitive filesystem */
public abstract class C29361c9 extends AnonymousClass1c8 {
    public static final String A0D(String str, int i) {
        C18070vi.A0d(str, 0);
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(i);
            C18070vi.A0X(substring);
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final String A0Q(String str, int i) {
        C18070vi.A0d(str, 0);
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            C18070vi.A0X(substring);
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested character count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final String A0Z(String str, int i) {
        C18070vi.A0d(str, 0);
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(length - i);
        C18070vi.A0X(substring);
        return substring;
    }
}
