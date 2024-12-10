package X;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public final class Cv2 {
    public static final char[] A07 = {'N', 'E', 'T', 'S', 'C', 'A', 'P', 'E', '2', '.', '0'};
    public int A00;
    public boolean A01;
    public boolean A02;
    public final InputStream A03;
    public final OutputStream A04;
    public final List A05 = AnonymousClass000.A13();
    public final byte[] A06 = new byte[256];

    public static final int A00(Cv2 cv2) {
        int read = cv2.A03.read();
        cv2.A00++;
        if (read != -1) {
            return read;
        }
        throw new EOFException("Unexpected end of gif file");
    }

    public static final int A01(Cv2 cv2, int i, int i2) {
        OutputStream outputStream;
        InputStream inputStream = cv2.A03;
        byte[] bArr = cv2.A06;
        int read = inputStream.read(bArr, i, i2);
        cv2.A00 += i2;
        if (cv2.A02 && (outputStream = cv2.A04) != null) {
            outputStream.write(bArr, i, i2);
        }
        if (read != -1) {
            return read;
        }
        throw new EOFException("Unexpected end of gif file");
    }

    public static final void A02(Cv2 cv2, int i) {
        OutputStream outputStream;
        if (!cv2.A02 || (outputStream = cv2.A04) == null) {
            cv2.A03.skip((long) i);
        } else {
            InputStream inputStream = cv2.A03;
            int i2 = i;
            while (i2 > 0) {
                byte[] bArr = cv2.A06;
                i2 -= 256;
                outputStream.write(bArr, 0, inputStream.read(bArr, 0, Math.min(256, i2)));
            }
        }
        cv2.A00 += i;
    }

    public static final void A03(Cv2 cv2, int i) {
        OutputStream outputStream;
        if (cv2.A02 && (outputStream = cv2.A04) != null) {
            outputStream.write(i);
        }
    }

    public final void A04() {
        char c;
        int A002;
        OutputStream outputStream;
        if (!this.A01) {
            this.A01 = true;
            boolean z = false;
            A01(this, 0, 6);
            byte[] bArr = this.A06;
            if ('G' == ((char) (((short) bArr[0]) & 65535)) && 'I' == ((char) (((short) bArr[1]) & 65535)) && 'F' == ((char) (((short) bArr[2]) & 65535)) && '8' == ((char) (((short) bArr[3]) & 65535)) && (('7' == (c = (char) (((short) bArr[4]) & 65535)) || '9' == c) && 'a' == ((char) (((short) bArr[5]) & 65535)))) {
                A02(this, 4);
                int A003 = A00(this);
                A03(this, A003);
                if ((A003 & 128) != 0) {
                    z = true;
                }
                int i = 2 << (A003 & 7);
                A02(this, 2);
                if (z) {
                    A02(this, i * 3);
                }
                int[] iArr = {0, 0};
                while (true) {
                    A002 = A00(this);
                    A03(this, A002);
                    if (A002 != 33) {
                        if (A002 == 44) {
                            List list = this.A05;
                            int[] copyOf = Arrays.copyOf(iArr, 2);
                            C18070vi.A0X(copyOf);
                            list.add(copyOf);
                            A02(this, 8);
                            int A004 = A00(this);
                            A03(this, A004);
                            if ((A004 & 128) != 0) {
                                A02(this, (2 << (A004 & 7)) * 3);
                            }
                            A02(this, 1);
                            while (true) {
                                int A005 = A00(this);
                                A03(this, A005);
                                int i2 = 0;
                                if (A005 <= 0) {
                                    break;
                                }
                                do {
                                    i2 += A01(this, i2, A005 - i2);
                                } while (i2 < A005);
                            }
                        } else {
                            break;
                        }
                    } else {
                        int A006 = A00(this);
                        A03(this, A006);
                        if (A006 == 1) {
                            List list2 = this.A05;
                            int[] copyOf2 = Arrays.copyOf(iArr, 2);
                            C18070vi.A0X(copyOf2);
                            list2.add(copyOf2);
                        } else if (A006 == 249) {
                            A02(this, 1);
                            int A007 = A00(this);
                            A03(this, A007);
                            iArr[0] = (A007 & 28) >> 2;
                            int A008 = (A00(this) | (A00(this) << 8)) * 10;
                            iArr[1] = A008;
                            if (A008 == 0) {
                                iArr[1] = 100;
                                if (!this.A02 && (outputStream = this.A04) != null) {
                                    this.A02 = true;
                                    InputStream inputStream = this.A03;
                                    if (inputStream instanceof FileInputStream) {
                                        ((FileInputStream) inputStream).getChannel().position(0);
                                    } else {
                                        inputStream.reset();
                                    }
                                    int i3 = this.A00 - 2;
                                    while (i3 > 0) {
                                        i3 -= 256;
                                        outputStream.write(bArr, 0, inputStream.read(bArr, 0, Math.min(256, i3)));
                                    }
                                    inputStream.skip(2);
                                }
                            }
                            int i4 = iArr[1] / 10;
                            A03(this, i4);
                            A03(this, i4 >> 8);
                            A02(this, 2);
                        } else if (A006 == 255) {
                            int A009 = A00(this);
                            A03(this, A009);
                            int i5 = 0;
                            if (A009 > 0) {
                                do {
                                    i5 += A01(this, i5, A009 - i5);
                                } while (i5 < A009);
                            }
                            char[] cArr = A07;
                            int i6 = 0;
                            while (true) {
                                if (cArr[i6] != ((char) (((short) bArr[i6]) & 65535))) {
                                    break;
                                }
                                i6++;
                                if (i6 >= 11) {
                                    while (true) {
                                        int A0010 = A00(this);
                                        A03(this, A0010);
                                        int i7 = 0;
                                        if (A0010 <= 0) {
                                            break;
                                        }
                                        do {
                                            i7 += A01(this, i7, A0010 - i7);
                                        } while (i7 < A0010);
                                    }
                                }
                            }
                        }
                        while (true) {
                            int A0011 = A00(this);
                            A03(this, A0011);
                            int i8 = 0;
                            if (A0011 <= 0) {
                                break;
                            }
                            do {
                                i8 += A01(this, i8, A0011 - i8);
                            } while (i8 < A0011);
                        }
                    }
                }
                if (A002 != 59) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    BE9.A1J("Unknown block header [", A10, A002);
                    throw C17880vN.A0f(C17890vO.A0c(A10, ']'));
                }
                return;
            }
            throw C17880vN.A0f("Illegal header for gif");
        }
        throw AnonymousClass000.A0n("extract called multiple times");
    }

    public Cv2(InputStream inputStream, OutputStream outputStream) {
        this.A03 = inputStream;
        this.A04 = outputStream;
    }
}
