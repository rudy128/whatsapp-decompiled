package X;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;

/* renamed from: X.1A1  reason: invalid class name */
public class AnonymousClass1A1 {
    public char A00;
    public int A01 = -1;
    public boolean A02 = true;
    public boolean A03 = false;
    public char A04;
    public int A05;
    public RandomAccessFile A06;
    public final String A07;
    public final byte[] A08;

    public void A04() {
        this.A02 = true;
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
            } catch (IOException unused) {
                A03();
            }
        }
        if (this.A06 == null) {
            try {
                this.A06 = new RandomAccessFile(this.A07, "r");
            } catch (IOException unused2) {
                this.A02 = false;
                A03();
            }
        }
        if (this.A02) {
            this.A01 = -1;
            this.A05 = 0;
            this.A00 = 0;
            this.A04 = 0;
            this.A03 = false;
        }
    }

    public AnonymousClass1A1(String str) {
        this.A07 = str;
        this.A08 = new byte[512];
    }

    public static void A01(AnonymousClass1A1 r2) {
        if (!r2.A03) {
            r2.A01--;
            r2.A00 = r2.A04;
            r2.A03 = true;
            return;
        }
        throw new C223219l("Can only rewind one step!");
    }

    public long A02() {
        long j = 1;
        long j2 = 0;
        boolean z = true;
        while (true) {
            if (A07()) {
                A00(this);
                if (!Character.isDigit(this.A00)) {
                    if (!z) {
                        A01(this);
                        break;
                    } else if (this.A00 == '-') {
                        j = -1;
                    } else {
                        throw new C223219l("Couldn't read number!");
                    }
                } else {
                    j2 = (j2 * 10) + ((long) (this.A00 - '0'));
                }
                z = false;
            } else if (z) {
                throw new C223219l("Couldn't read number because the file ended!");
            }
        }
        return j * j2;
    }

    public void A03() {
        RandomAccessFile randomAccessFile = this.A06;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.A06 = null;
                throw th;
            }
            this.A06 = null;
        }
    }

    public void A05() {
        boolean z = false;
        while (A07()) {
            A00(this);
            if (this.A00 == 10) {
                z = true;
            } else if (z) {
                A01(this);
                return;
            }
        }
    }

    public void A06() {
        boolean z = false;
        while (A07()) {
            A00(this);
            if (this.A00 == ' ') {
                z = true;
            } else if (z) {
                A01(this);
                return;
            }
        }
    }

    public boolean A07() {
        RandomAccessFile randomAccessFile;
        if (this.A02 && (randomAccessFile = this.A06) != null) {
            int i = this.A01;
            int i2 = this.A05;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.A05 = randomAccessFile.read(this.A08);
                    this.A01 = -1;
                } catch (IOException unused) {
                    this.A02 = false;
                    A03();
                }
                return A07();
            }
        }
        return false;
    }

    public static void A00(AnonymousClass1A1 r2) {
        if (r2.A07()) {
            int i = r2.A01 + 1;
            r2.A01 = i;
            r2.A04 = r2.A00;
            r2.A00 = (char) r2.A08[i];
            r2.A03 = false;
            return;
        }
        throw new NoSuchElementException();
    }

    public void finalize() {
        A03();
    }
}
