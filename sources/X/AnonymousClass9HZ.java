package X;

import java.io.IOException;

/* renamed from: X.9HZ  reason: invalid class name */
public class AnonymousClass9HZ extends IOException implements B8K {
    public final int migrationErrorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9HZ(String str, Throwable th, int i) {
        super(str, th);
        C18070vi.A0k(str, th);
        this.migrationErrorCode = i;
    }

    public final int BUv() {
        return this.migrationErrorCode;
    }

    public String getMessage() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.getMessage());
        A10.append(" (error_code=");
        return AnonymousClass001.A1L(A10, this.migrationErrorCode);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9HZ(int i, String str) {
        super(str);
        C18070vi.A0d(str, 2);
        this.migrationErrorCode = i;
    }

    public AnonymousClass9HZ(int i, Throwable th) {
        super(th);
        this.migrationErrorCode = i;
    }
}
