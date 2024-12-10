package X;

import java.io.File;

/* renamed from: X.10b  reason: invalid class name */
public final class AnonymousClass10b {
    public String A00;
    public final C17930vS A01;

    public AnonymousClass10b(C17930vS r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final String A00() {
        String A002;
        if (this.A00 == null) {
            synchronized (this) {
                if (this.A00 == null) {
                    File file = new File(this.A01.A02("account_switching", 0), "active_account");
                    if (!file.exists()) {
                        A002 = "";
                    } else {
                        A002 = AnonymousClass3Gr.A00(file, C26571Sq.A05);
                    }
                    this.A00 = A002;
                }
            }
        }
        return this.A00;
    }
}
