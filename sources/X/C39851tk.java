package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* renamed from: X.1tk  reason: invalid class name and case insensitive filesystem */
public final class C39851tk implements C39841tj {
    public final InputStream A00;
    public final C39831ti A01;

    public long CDN(C39881tn r7) {
        String message;
        C18070vi.A0c(r7, 0);
        try {
            if (!Thread.interrupted()) {
                C39911tq A06 = r7.A06(1);
                int i = A06.A00;
                int read = this.A00.read(A06.A06, i, (int) Math.min(8192, (long) (8192 - i)));
                if (read == -1) {
                    return -1;
                }
                A06.A00 += read;
                long j = (long) read;
                r7.A00 += j;
                return j;
            }
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } catch (AssertionError e) {
            if (e.getCause() == null || (message = e.getMessage()) == null || !AnonymousClass1YF.A0Y(message, "getsockname failed", false)) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public void close() {
        this.A00.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C39851tk(InputStream inputStream, C39831ti r2) {
        this.A00 = inputStream;
        this.A01 = r2;
    }
}
