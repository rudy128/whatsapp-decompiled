package X;

import org.json.JSONArray;

/* renamed from: X.9QR  reason: invalid class name */
public abstract class AnonymousClass9QR {
    public static final String A00(String[] strArr) {
        C18070vi.A0d(strArr, 0);
        JSONArray A1A = AnonymousClass8BR.A1A();
        for (String put : strArr) {
            A1A.put(put);
        }
        String obj = A1A.toString();
        if (obj != null) {
            return obj;
        }
        throw C17880vN.A0g();
    }
}
