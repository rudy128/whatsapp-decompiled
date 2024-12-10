package X;

import java.util.UUID;

/* renamed from: X.17C  reason: invalid class name */
public final class AnonymousClass17C {
    public Integer A00;
    public String A01;

    public final String A00() {
        String str = this.A01;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A01 = str;
            C18070vi.A0z(str, "null cannot be cast to non-null type kotlin.String");
            this.A01 = str;
        }
        C18070vi.A0z(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }
}
