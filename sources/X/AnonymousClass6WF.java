package X;

import java.util.List;

/* renamed from: X.6WF  reason: invalid class name */
public abstract class AnonymousClass6WF {
    public static final String A00(List list) {
        StringBuilder sb = new StringBuilder("(");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append("?");
        }
        String A0y = AnonymousClass000.A0y(")", sb);
        C18070vi.A0X(A0y);
        return A0y;
    }
}
