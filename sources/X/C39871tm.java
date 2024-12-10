package X;

import java.nio.ByteBuffer;

/* renamed from: X.1tm  reason: invalid class name and case insensitive filesystem */
public final class C39871tm implements C39861tl {
    public boolean A00;
    public final C39881tn A01 = new Object();
    public final C39841tj A02;

    public long Bd3(C40081u8 r10) {
        C18070vi.A0c(r10, 0);
        long j = 0;
        if (!(!this.A00)) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C39881tn r5 = this.A01;
            long A04 = r5.A04(r10, j);
            if (A04 != -1) {
                return A04;
            }
            long j2 = r5.A00;
            if (this.A02.CDN(r5) == -1) {
                return -1;
            }
            j = Math.max(j, j2);
        }
    }

    public int CHC(C40131uD r8) {
        C18070vi.A0c(r8, 0);
        if (!(!this.A00)) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            C39881tn r3 = this.A01;
            int A022 = r3.A02(r8, true);
            if (A022 == -2) {
                if (this.A02.CDN(r3) == -1) {
                    break;
                }
            } else if (A022 != -1) {
                r3.A08((long) r8.A01[A022].A01());
                return A022;
            }
        }
        return -1;
    }

    public int read(ByteBuffer byteBuffer) {
        C18070vi.A0c(byteBuffer, 0);
        C39881tn r5 = this.A01;
        if (r5.A00 == 0 && this.A02.CDN(r5) == -1) {
            return -1;
        }
        return r5.read(byteBuffer);
    }

    public boolean CFQ(long j) {
        C39881tn r3;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!(!this.A00)) {
            throw new IllegalStateException("closed");
        } else {
            do {
                r3 = this.A01;
                if (r3.A00 >= j) {
                    return true;
                }
            } while (this.A02.CDN(r3) != -1);
            return false;
        }
    }

    public void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            C39881tn r2 = this.A01;
            r2.A08(r2.A00);
        }
    }

    public boolean isOpen() {
        return !this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1tn, java.lang.Object] */
    public C39871tm(C39841tj r2) {
        this.A02 = r2;
    }

    public long CDN(C39881tn r2) {
        throw AnonymousClass04E.createAndThrow();
    }
}
