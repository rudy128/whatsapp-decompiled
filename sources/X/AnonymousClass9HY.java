package X;

import java.io.IOException;

/* renamed from: X.9HY  reason: invalid class name */
public class AnonymousClass9HY extends IOException implements B8K {
    public final int errorCode = 201;

    public AnonymousClass9HY(String str) {
        super(str);
    }

    public int BUv() {
        return this.errorCode;
    }

    public String getMessage() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.getMessage());
        A10.append(" (error_code=");
        A10.append(this.errorCode);
        return AnonymousClass8BU.A0q(A10);
    }
}
