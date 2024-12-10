package X;

import java.security.DigestOutputStream;

/* renamed from: X.Amn  reason: case insensitive filesystem */
public final class C21599Amn extends DigestOutputStream {
    public boolean A00;

    public synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            super.close();
        }
    }
}
