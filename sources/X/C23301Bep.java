package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Bep  reason: case insensitive filesystem */
public abstract class C23301Bep extends C26164Ctd {
    public static final boolean A01 = C26267CwC.A06;
    public static final Logger A02 = BE7.A0w(C23301Bep.class);
    public C26925DJg A00;

    public static int A01(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public void A02(byte b) {
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            long j = beo.A00;
            long j2 = beo.A02;
            if (j < j2) {
                beo.A00 = 1 + j;
                C26267CwC.A02.A07(j, b);
                return;
            }
            Object[] A1a = AnonymousClass8BR.A1a();
            C17890vO.A1L(A1a, j);
            A1a[1] = Long.valueOf(j2);
            BE8.A1M(A1a, 1);
            throw new C24213BxQ(String.format("Pos: %d, limit: %d, len: %d", A1a));
        } else if (this instanceof C23298Bem) {
            try {
                ((C23298Bem) this).A01.put(b);
            } catch (BufferOverflowException e) {
                throw new C24213BxQ((Throwable) e);
            }
        } else {
            C23299Ben ben = (C23299Ben) this;
            try {
                byte[] bArr = ben.A05;
                int i = ben.A00;
                ben.A00 = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1a2 = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a2, ben.A00);
                throw new C24213BxQ(BEB.A0b(ben.A02, A1a2), e2);
            }
        }
    }

    public void A03(int i) {
        long j;
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            if (beo.A00 <= beo.A03) {
                while (true) {
                    int i2 = i & -128;
                    j = beo.A00;
                    if (i2 == 0) {
                        break;
                    }
                    beo.A00 = j + 1;
                    C26267CwC.A02.A07(j, (byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    j = beo.A00;
                    long j2 = beo.A02;
                    if (j < j2) {
                        if ((i & -128) == 0) {
                            break;
                        }
                        beo.A00 = j + 1;
                        C26267CwC.A02.A07(j, (byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                        i >>>= 7;
                    } else {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        C17890vO.A1L(A1a, j);
                        A1a[1] = Long.valueOf(j2);
                        BE8.A1M(A1a, 1);
                        throw new C24213BxQ(String.format("Pos: %d, limit: %d, len: %d", A1a));
                    }
                }
            }
            beo.A00 = 1 + j;
            C26267CwC.A02.A07(j, (byte) i);
        } else if (this instanceof C23298Bem) {
            C23298Bem bem = (C23298Bem) this;
            while ((i & -128) != 0) {
                try {
                    bem.A01.put((byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C24213BxQ((Throwable) e);
                }
            }
            bem.A01.put((byte) i);
        } else {
            C23299Ben ben = (C23299Ben) this;
            if (!A01 || ben.A02 - ben.A00 < 10) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = ben.A05;
                        int i3 = ben.A00;
                        ben.A00 = i3 + 1;
                        BE7.A1T(bArr, i, i3);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1a2 = AnonymousClass8BR.A1a();
                        AnonymousClass000.A1L(A1a2, ben.A00);
                        throw new C24213BxQ(BEB.A0b(ben.A02, A1a2), e2);
                    }
                }
                byte[] bArr2 = ben.A05;
                int i4 = ben.A00;
                ben.A00 = i4 + 1;
                bArr2[i4] = (byte) i;
                return;
            }
            while (true) {
                int i5 = i & -128;
                byte[] bArr3 = ben.A05;
                int i6 = ben.A00;
                ben.A00 = i6 + 1;
                long j3 = (long) i6;
                if (i5 == 0) {
                    C26267CwC.A06(bArr3, j3, (byte) i);
                    return;
                } else {
                    C26267CwC.A06(bArr3, j3, (byte) ((i & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    i >>>= 7;
                }
            }
        }
    }

    public void A04(int i) {
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            beo.A05.putInt((int) (beo.A00 - beo.A01), i);
            beo.A00 += 4;
        } else if (this instanceof C23298Bem) {
            try {
                ((C23298Bem) this).A01.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C24213BxQ((Throwable) e);
            }
        } else {
            C23299Ben ben = (C23299Ben) this;
            try {
                byte[] bArr = ben.A05;
                int A0B = BEB.A0B(bArr, ben.A00, i);
                ben.A00 = A0B + 1;
                bArr[A0B] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a, ben.A00);
                throw new C24213BxQ(BEB.A0b(ben.A02, A1a), e2);
            }
        }
    }

    public void A05(int i, int i2) {
        A03(i << 3);
        if (i2 >= 0) {
            A03(i2);
        } else {
            A09((long) i2);
        }
    }

    public void A06(int i, int i2) {
        A03((i << 3) | 5);
        A04(i2);
    }

    public void A07(int i, long j) {
        A03((i << 3) | 1);
        A0A(j);
    }

    public void A08(int i, String str) {
        int A002;
        C24213BxQ bxQ;
        long j;
        long j2;
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            C26164Ctd.A04(beo, i);
            long j3 = beo.A00;
            try {
                int length = str.length();
                int A022 = BEB.A02(length * 3);
                int A023 = BEB.A02(length);
                if (A023 == A022) {
                    int i2 = ((int) (j3 - beo.A01)) + A023;
                    ByteBuffer byteBuffer = beo.A05;
                    byteBuffer.position(i2);
                    C25908CoM.A01(str, byteBuffer);
                    int position = byteBuffer.position() - i2;
                    beo.A03(position);
                    j = beo.A00;
                    j2 = (long) position;
                } else {
                    int A003 = C25908CoM.A00(str);
                    beo.A03(A003);
                    long j4 = beo.A00;
                    ByteBuffer byteBuffer2 = beo.A05;
                    byteBuffer2.position((int) (j4 - beo.A01));
                    C25908CoM.A01(str, byteBuffer2);
                    j = beo.A00;
                    j2 = (long) A003;
                }
                beo.A00 = j + j2;
            } catch (C24406C2d e) {
                beo.A00 = j3;
                beo.A05.position((int) (j3 - beo.A01));
                beo.A0D(e, str);
            } catch (IllegalArgumentException e2) {
                throw new C24213BxQ((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C24213BxQ((Throwable) e3);
            }
        } else if (this instanceof C23298Bem) {
            C23298Bem bem = (C23298Bem) this;
            C26164Ctd.A04(bem, i);
            ByteBuffer byteBuffer3 = bem.A01;
            int position2 = byteBuffer3.position();
            try {
                int length2 = str.length();
                int A024 = BEB.A02(length2 * 3);
                int A025 = BEB.A02(length2);
                if (A025 == A024) {
                    int position3 = byteBuffer3.position() + A025;
                    byteBuffer3.position(position3);
                    try {
                        C25908CoM.A01(str, byteBuffer3);
                        int position4 = byteBuffer3.position();
                        byteBuffer3.position(position2);
                        bem.A03(position4 - position3);
                        byteBuffer3.position(position4);
                    } catch (IndexOutOfBoundsException e4) {
                        bxQ = new C24213BxQ((Throwable) e4);
                        throw bxQ;
                    }
                } else {
                    bem.A03(C25908CoM.A00(str));
                    try {
                        C25908CoM.A01(str, byteBuffer3);
                    } catch (IndexOutOfBoundsException e5) {
                        bxQ = new C24213BxQ((Throwable) e5);
                        throw bxQ;
                    }
                }
            } catch (C24406C2d e6) {
                byteBuffer3.position(position2);
                bem.A0D(e6, str);
            } catch (IllegalArgumentException e7) {
                throw new C24213BxQ((Throwable) e7);
            }
        } else {
            C23299Ben ben = (C23299Ben) this;
            C26164Ctd.A04(ben, i);
            int i3 = ben.A00;
            try {
                int length3 = str.length();
                int A026 = BEB.A02(length3 * 3);
                int A027 = BEB.A02(length3);
                if (A027 == A026) {
                    int i4 = i3 + A027;
                    ben.A00 = i4;
                    A002 = C25908CoM.A00.A00(str, ben.A05, i4, ben.A02 - i4);
                    ben.A00 = i3;
                    ben.A03((A002 - i3) - A027);
                } else {
                    ben.A03(C25908CoM.A00(str));
                    byte[] bArr = ben.A05;
                    int i5 = ben.A00;
                    A002 = C25908CoM.A00.A00(str, bArr, i5, ben.A02 - i5);
                }
                ben.A00 = A002;
            } catch (C24406C2d e8) {
                ben.A00 = i3;
                ben.A0D(e8, str);
            } catch (IndexOutOfBoundsException e9) {
                throw new C24213BxQ((Throwable) e9);
            }
        }
    }

    public void A09(long j) {
        long j2;
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            if (beo.A00 <= beo.A03) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = beo.A00;
                    if (i == 0) {
                        break;
                    }
                    beo.A00 = j2 + 1;
                    C26267CwC.A02.A07(j2, (byte) ((((int) j) & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = beo.A00;
                    long j3 = beo.A02;
                    if (j2 < j3) {
                        if ((j & -128) == 0) {
                            break;
                        }
                        beo.A00 = j2 + 1;
                        C26267CwC.A02.A07(j2, (byte) ((((int) j) & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                        j >>>= 7;
                    } else {
                        Object[] A1a = AnonymousClass8BR.A1a();
                        C17890vO.A1L(A1a, j2);
                        A1a[1] = Long.valueOf(j3);
                        BE8.A1M(A1a, 1);
                        throw new C24213BxQ(String.format("Pos: %d, limit: %d, len: %d", A1a));
                    }
                }
            }
            beo.A00 = 1 + j2;
            C26267CwC.A02.A07(j2, (byte) ((int) j));
        } else if (this instanceof C23298Bem) {
            C23298Bem bem = (C23298Bem) this;
            while ((-128 & j) != 0) {
                try {
                    bem.A01.put((byte) ((((int) j) & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C24213BxQ((Throwable) e);
                }
            }
            bem.A01.put((byte) ((int) j));
        } else {
            C23299Ben ben = (C23299Ben) this;
            if (!A01 || ben.A02 - ben.A00 < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = ben.A05;
                        int i2 = ben.A00;
                        ben.A00 = i2 + 1;
                        BE7.A1T(bArr, (int) j, i2);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1a2 = AnonymousClass8BR.A1a();
                        AnonymousClass000.A1L(A1a2, ben.A00);
                        throw new C24213BxQ(BEB.A0b(ben.A02, A1a2), e2);
                    }
                }
                byte[] bArr2 = ben.A05;
                int i3 = ben.A00;
                ben.A00 = i3 + 1;
                bArr2[i3] = (byte) ((int) j);
                return;
            }
            while (true) {
                int i4 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                byte[] bArr3 = ben.A05;
                int i5 = ben.A00;
                ben.A00 = i5 + 1;
                long j4 = (long) i5;
                int i6 = (int) j;
                if (i4 == 0) {
                    C26267CwC.A06(bArr3, j4, (byte) i6);
                    return;
                } else {
                    C26267CwC.A06(bArr3, j4, (byte) ((i6 & StringTreeSet.OFFSET_BASE_ENCODING) | 128));
                    j >>>= 7;
                }
            }
        }
    }

    public void A0A(long j) {
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            beo.A05.putLong((int) (beo.A00 - beo.A01), j);
            beo.A00 += 8;
        } else if (this instanceof C23298Bem) {
            try {
                ((C23298Bem) this).A01.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C24213BxQ((Throwable) e);
            }
        } else {
            C23299Ben ben = (C23299Ben) this;
            try {
                byte[] bArr = ben.A05;
                int i = ben.A00;
                int i2 = i + 1;
                int A0A = BE6.A0A((int) j, bArr, i, i2);
                BE6.A1B(j, bArr, 8, i2);
                int i3 = A0A + 1;
                BE6.A1B(j, bArr, 16, A0A);
                int i4 = i3 + 1;
                BE6.A1B(j, bArr, 24, i3);
                int i5 = i4 + 1;
                BE6.A1B(j, bArr, 32, i4);
                int i6 = i5 + 1;
                BE6.A1B(j, bArr, 40, i5);
                int i7 = i6 + 1;
                BE6.A1B(j, bArr, 48, i6);
                ben.A00 = i7 + 1;
                BE6.A1B(j, bArr, 56, i7);
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a, ben.A00);
                throw new C24213BxQ(BEB.A0b(ben.A02, A1a), e2);
            }
        }
    }

    public void A0B(DSP dsp, int i) {
        if (this instanceof C23300Beo) {
            C26164Ctd.A04(this, i);
            A03(dsp.A02());
            dsp.A03(this);
            return;
        }
        C26164Ctd.A04(this, i);
        A03(dsp.A02());
        dsp.A03(this);
    }

    public void A0C(EDY edy, EAC eac, int i) {
        if (this instanceof C23300Beo) {
            C26164Ctd.A04(this, i);
            A03(C26919DJa.A04(eac, edy));
            eac.CT9(this.A00, edy);
            return;
        }
        C26164Ctd.A04(this, i);
        A03(C26919DJa.A04(eac, edy));
        eac.CT9(this.A00, edy);
    }

    public final void A0D(C24406C2d c2d, String str) {
        A02.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", c2d);
        byte[] bytes = str.getBytes(C25461CgE.A00);
        try {
            int length = bytes.length;
            A03(length);
            A0E(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C24213BxQ((Throwable) e);
        } catch (C24213BxQ e2) {
            throw e2;
        }
    }

    public void A0E(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        if (this instanceof C23300Beo) {
            C23300Beo beo = (C23300Beo) this;
            if (bArr != null) {
                if (i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                    long j = (long) i2;
                    long j2 = beo.A00;
                    if (beo.A02 - j >= j2) {
                        C26267CwC.A02.A0E(bArr2, (long) i, j2, j);
                        beo.A00 += j;
                        return;
                    }
                }
                Object[] A1a = AnonymousClass8BR.A1a();
                C17890vO.A1L(A1a, beo.A00);
                C17890vO.A1M(A1a, beo.A02);
                BE8.A1M(A1a, i2);
                throw new C24213BxQ(String.format("Pos: %d, limit: %d, len: %d", A1a));
            }
            throw AnonymousClass000.A0s("value");
        } else if (this instanceof C23298Bem) {
            try {
                ((C23298Bem) this).A01.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C24213BxQ((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C24213BxQ((Throwable) e2);
            }
        } else {
            C23299Ben ben = (C23299Ben) this;
            try {
                System.arraycopy(bArr, i, ben.A05, ben.A00, i2);
                ben.A00 += i2;
            } catch (IndexOutOfBoundsException e3) {
                Object[] A1a2 = AnonymousClass8BR.A1a();
                AnonymousClass000.A1L(A1a2, ben.A00);
                AnonymousClass000.A1M(A1a2, ben.A02);
                BE8.A1M(A1a2, i2);
                throw new C24213BxQ(String.format("Pos: %d, limit: %d, len: %d", A1a2), e3);
            }
        }
    }

    public static int A00(int i) {
        return BEB.A02(i);
    }
}
