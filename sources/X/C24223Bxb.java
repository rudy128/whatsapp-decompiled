package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Bxb  reason: case insensitive filesystem */
public class C24223Bxb extends InputStream implements C28534E6i {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = 0;
    public byte[] A03 = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];

    public synchronized void A00() {
        this.A00 = this.A02;
    }

    public void BCC(byte[] bArr, int i) {
        int i2;
        byte[] bArr2 = this.A03;
        if (bArr2 == null) {
            throw C17880vN.A0f("Stream is closed.");
        } else if (i == 0) {
        } else {
            if (i <= bArr.length) {
                int i3 = this.A02;
                int i4 = this.A01;
                if (i3 == i4 && this.A00 == -1) {
                    this.A01 = 0;
                    i4 = 0;
                    this.A02 = 0;
                    i3 = 0;
                }
                int i5 = i2 + i;
                int length = bArr2.length;
                if (i5 > length) {
                    int i6 = this.A00;
                    int i7 = i2 - i6;
                    if (i6 == -1) {
                        i7 = i2 - i3;
                    }
                    int i8 = length - i7;
                    if (i8 < i) {
                        length += BE7.A03((double) (i - i8), 1024.0d) * EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                    }
                    byte[] bArr3 = new byte[length];
                    if (i6 == -1) {
                        i2 -= i3;
                        System.arraycopy(bArr2, i3, bArr3, 0, i2);
                        this.A02 = 0;
                        this.A01 = i2;
                        this.A00 = -1;
                    } else {
                        System.arraycopy(bArr2, i6, bArr3, 0, i2 - i6);
                        int i9 = this.A02;
                        int i10 = this.A00;
                        this.A02 = i9 - i10;
                        i2 = this.A01 - i10;
                        this.A01 = i2;
                        this.A00 = 0;
                    }
                    this.A03 = bArr3;
                    bArr2 = bArr3;
                }
                System.arraycopy(bArr, 0, bArr2, i2, i);
                this.A01 += i;
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Len ");
            A10.append(i);
            throw BE9.A0e(" exceeds supplied buffer limits.", A10);
        }
    }

    public synchronized void mark(int i) {
        A00();
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized void reset() {
        IOException iOException;
        if (this.A03 != null) {
            int i = this.A00;
            if (i != -1) {
                this.A02 = i;
                this.A00 = -1;
            } else {
                iOException = C17880vN.A0f("No marked position found.");
            }
        } else {
            iOException = C17880vN.A0f("Stream is closed.");
        }
        throw iOException;
    }

    public int available() {
        if (this.A03 == null) {
            return -1;
        }
        return this.A01 - this.A02;
    }

    public void close() {
        if (this.A03 != null) {
            this.A03 = null;
            this.A01 = 0;
            this.A02 = 0;
            this.A00 = -1;
            return;
        }
        throw C17880vN.A0f("Stream is already closed.");
    }

    public int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw C17880vN.A0f("Dst buffer is null");
        } else if (i2 == 0) {
            return i2;
        } else {
            if (i + i2 <= bArr.length) {
                int available = available();
                if (available < 1) {
                    return available;
                }
                int min = Math.min(available, i2);
                System.arraycopy(this.A03, this.A02, bArr, i, min);
                this.A02 += min;
                return min;
            }
            throw C17880vN.A0f("Not enough space in destination buffer.");
        }
    }

    public long skip(long j) {
        if (this.A03 == null) {
            throw C17880vN.A0f("Stream is closed.");
        } else if (j <= 0) {
            return 0;
        } else {
            long j2 = ((long) this.A02) + j;
            int i = this.A01;
            if (j2 >= ((long) i)) {
                int available = available();
                this.A02 = i;
                return (long) available;
            }
            this.A02 = (int) j2;
            return j;
        }
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw C17880vN.A0f("Dst buffer is null");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw C17880vN.A0f("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }
}
