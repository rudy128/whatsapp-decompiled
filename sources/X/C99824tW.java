package X;

import java.util.NoSuchElementException;

/* renamed from: X.4tW  reason: invalid class name and case insensitive filesystem */
public final class C99824tW extends AnonymousClass20T {
    public int A00;
    public final int[] A01;

    public int A00() {
        try {
            int[] iArr = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.A00--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return AnonymousClass000.A1U(this.A00, this.A01.length);
    }

    public C99824tW(int[] iArr) {
        this.A01 = iArr;
    }
}
