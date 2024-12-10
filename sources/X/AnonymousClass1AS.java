package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.1AS  reason: invalid class name */
public abstract class AnonymousClass1AS {
    public static long A00(AnonymousClass1AQ r1, ByteBuffer byteBuffer, long j) {
        A01(r1, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void A01(AnonymousClass1AQ r3, ByteBuffer byteBuffer, int i, long j) {
        int CDK;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (CDK = r3.CDK(byteBuffer, j)) != -1) {
            j += (long) CDK;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new AnonymousClass3EQ("ELF file truncated");
    }

    public static String[] A02(AnonymousClass1AQ r29) {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        AnonymousClass1AQ r9 = r29;
        long A00 = A00(r9, allocate, 0);
        if (A00 == 1179403647) {
            A01(r9, allocate, 1, 4);
            boolean z = true;
            if (((short) (allocate.get() & 255)) != 1) {
                z = false;
            }
            A01(r9, allocate, 1, 5);
            if (((short) (allocate.get() & 255)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = A00(r9, allocate, 28);
                i = 2;
                A01(r9, allocate, 2, 44);
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 42;
            } else {
                A01(r9, allocate, 8, 32);
                j = allocate.getLong();
                i = 2;
                A01(r9, allocate, 2, 56);
                j2 = (long) (allocate.getShort() & 65535);
                j3 = 54;
            }
            A01(r9, allocate, i, j3);
            short s = allocate.getShort() & 65535;
            if (j2 == 65535) {
                if (z) {
                    j13 = A00(r9, allocate, 32) + 28;
                } else {
                    A01(r9, allocate, 8, 40);
                    j13 = allocate.getLong() + 44;
                }
                j2 = A00(r9, allocate, j13);
            }
            long j14 = j;
            long j15 = 0;
            while (true) {
                if (j15 >= j2) {
                    break;
                } else if (A00(r9, allocate, j14) == 2) {
                    if (z) {
                        j4 = A00(r9, allocate, j14 + 4);
                    } else {
                        A01(r9, allocate, 8, j14 + 8);
                        j4 = allocate.getLong();
                    }
                    if (j4 != 0) {
                        long j16 = j4;
                        long j17 = 0;
                        int i2 = 0;
                        do {
                            if (z) {
                                j5 = A00(r9, allocate, j16);
                            } else {
                                A01(r9, allocate, 8, j16);
                                j5 = allocate.getLong();
                            }
                            if (j5 == 1) {
                                if (i2 != Integer.MAX_VALUE) {
                                    i2++;
                                } else {
                                    throw new AnonymousClass3EQ("malformed DT_NEEDED section");
                                }
                            } else if (j5 == 5) {
                                if (z) {
                                    j17 = A00(r9, allocate, j16 + 4);
                                } else {
                                    A01(r9, allocate, 8, j16 + 8);
                                    j17 = allocate.getLong();
                                }
                            }
                            if (z) {
                                j6 = 8;
                            } else {
                                j6 = 16;
                            }
                            j16 += j6;
                        } while (j5 != 0);
                        if (j17 != 0) {
                            int i3 = 0;
                            while (true) {
                                if (((long) i3) >= j2) {
                                    break;
                                }
                                if (A00(r9, allocate, j) == 1) {
                                    if (z) {
                                        j7 = A00(r9, allocate, j + 8);
                                        j8 = A00(r9, allocate, j + 20);
                                    } else {
                                        A01(r9, allocate, 8, j + 16);
                                        j7 = allocate.getLong();
                                        A01(r9, allocate, 8, j + 40);
                                        j8 = allocate.getLong();
                                    }
                                    if (j7 <= j17 && j17 < j8 + j7) {
                                        if (z) {
                                            j9 = A00(r9, allocate, j + 4);
                                        } else {
                                            A01(r9, allocate, 8, j + 8);
                                            j9 = allocate.getLong();
                                        }
                                        long j18 = j9 + (j17 - j7);
                                        if (j18 != 0) {
                                            String[] strArr = new String[i2];
                                            int i4 = 0;
                                            do {
                                                if (z) {
                                                    j10 = A00(r9, allocate, j4);
                                                } else {
                                                    A01(r9, allocate, 8, j4);
                                                    j10 = allocate.getLong();
                                                }
                                                if (j10 == 1) {
                                                    if (z) {
                                                        j12 = A00(r9, allocate, j4 + 4);
                                                    } else {
                                                        A01(r9, allocate, 8, j4 + 8);
                                                        j12 = allocate.getLong();
                                                    }
                                                    long j19 = j12 + j18;
                                                    StringBuilder sb = new StringBuilder();
                                                    while (true) {
                                                        long j20 = 1 + j19;
                                                        A01(r9, allocate, 1, j19);
                                                        short s2 = (short) (allocate.get() & 255);
                                                        if (s2 == 0) {
                                                            break;
                                                        }
                                                        sb.append((char) s2);
                                                        j19 = j20;
                                                    }
                                                    strArr[i4] = sb.toString();
                                                    if (i4 != Integer.MAX_VALUE) {
                                                        i4++;
                                                    } else {
                                                        throw new AnonymousClass3EQ("malformed DT_NEEDED section");
                                                    }
                                                }
                                                if (z) {
                                                    j11 = 8;
                                                } else {
                                                    j11 = 16;
                                                }
                                                j4 += j11;
                                            } while (j10 != 0);
                                            if (i4 == i2) {
                                                return strArr;
                                            }
                                            throw new AnonymousClass3EQ("malformed DT_NEEDED section");
                                        }
                                    }
                                }
                                j += (long) s;
                                i3++;
                            }
                            throw new AnonymousClass3EQ("did not find file offset of DT_STRTAB table");
                        }
                        throw new AnonymousClass3EQ("Dynamic section string-table not found");
                    }
                } else {
                    j14 += (long) s;
                    j15++;
                }
            }
            throw new AnonymousClass3EQ("ELF file does not contain dynamic linking information");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file is not ELF: 0x");
        sb2.append(Long.toHexString(A00));
        throw new AnonymousClass3EQ(sb2.toString());
    }
}
