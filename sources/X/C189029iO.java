package X;

/* renamed from: X.9iO  reason: invalid class name and case insensitive filesystem */
public final class C189029iO {
    public final String A00(String str, String str2) {
        String A0I;
        if (str == null || (A0I = AnonymousClass1YF.A0I(str)) == null) {
            return str;
        }
        String A0s = AnonymousClass8BV.A0s(A0I, "-");
        if (!C18070vi.A18(str2, "cep") || A0s.length() <= 5) {
            return str;
        }
        StringBuilder sb = new StringBuilder(A0s);
        sb.insert(5, '-');
        return sb.toString();
    }
}
