package X;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

public class DRJ implements Closeable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public ColorSpace A06;
    public C25783Clu A07;
    public String A08;
    public boolean A09;
    public final E4K A0A;
    public final DRN A0B;

    public static final int A01(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i3 * 8);
                } else {
                    i4 <<= 8;
                    i2 = read & 255;
                }
                i4 |= i2;
                i3++;
            } else {
                throw C17880vN.A0f("no more bytes");
            }
        }
        return i4;
    }

    public static final boolean A04(String str, byte[] bArr) {
        if (4 != str.length()) {
            return false;
        }
        C25411Oc r1 = new C25411Oc(0, 3);
        if (!(r1 instanceof Collection) || !((Collection) r1).isEmpty()) {
            Iterator it = r1.iterator();
            while (it.hasNext()) {
                int A002 = ((AnonymousClass20T) it).A00();
                if (((byte) str.charAt(A002)) != bArr[A002]) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r2.A0A != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0A() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.DRN r0 = r2.A0B     // Catch:{ all -> 0x0011 }
            boolean r0 = X.DRN.A02(r0)     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            X.E4K r1 = r2.A0A     // Catch:{ all -> 0x0011 }
            r0 = 0
            if (r1 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r2)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRJ.A0A():boolean");
    }

    public static void A03(DRJ drj) {
        if (drj.A05 < 0 || drj.A01 < 0) {
            A02(drj);
        }
    }

    public int A05() {
        int i;
        DRN drn = this.A0B;
        if (drn == null || drn.A05() == null) {
            return this.A04;
        }
        DRG drg = (DRG) drn.A05();
        synchronized (drg) {
            drg.A02();
            i = drg.A01;
        }
        return i;
    }

    public DRJ A07() {
        DRN A042;
        DRJ drj;
        E4K e4k = this.A0A;
        if (e4k != null) {
            drj = new DRJ(e4k, this.A04);
        } else {
            DRN drn = this.A0B;
            if (drn == null || (A042 = drn.A04()) == null) {
                return null;
            }
            try {
                drj = new DRJ(A042);
            } finally {
                A042.close();
            }
        }
        drj.A09(this);
        return drj;
    }

    public InputStream A08() {
        DRN drn;
        E4K e4k = this.A0A;
        if (e4k != null) {
            return (InputStream) e4k.get();
        }
        DRN drn2 = this.A0B;
        if (drn2 != null) {
            drn = drn2.A04();
        } else {
            drn = null;
        }
        if (drn == null) {
            return null;
        }
        try {
            return new C24220BxY((DRG) drn.A05());
        } finally {
            drn.close();
        }
    }

    public void close() {
        DRN drn = this.A0B;
        if (drn != null) {
            drn.close();
        }
    }

    public DRJ(E4K e4k, int i) {
        this.A07 = C25783Clu.A02;
        this.A02 = -1;
        this.A00 = 0;
        this.A05 = -1;
        this.A01 = -1;
        this.A03 = 1;
        this.A04 = -1;
        this.A0B = null;
        this.A0A = e4k;
        this.A04 = i;
    }

    public static int A00(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public static void A02(DRJ drj) {
        AnonymousClass1D6 r4;
        int i;
        int i2;
        int A012;
        Class<C9J> cls;
        String str;
        C25783Clu A002 = C26104CsO.A00(drj.A08());
        drj.A07 = A002;
        C18070vi.A0d(A002, 0);
        if (A002 == CIN.A0C || A002 == CIN.A0B || A002 == CIN.A09 || A002 == CIN.A0A || A002 == CIN.A08) {
            InputStream A082 = drj.A08();
            if (A082 == null) {
                r4 = null;
            } else {
                byte[] bArr = new byte[4];
                r4 = null;
                try {
                    A082.read(bArr);
                    if (A04("RIFF", bArr)) {
                        A082.read();
                        A082.read();
                        A082.read();
                        A082.read();
                        A082.read(bArr);
                        if (A04("WEBP", bArr)) {
                            A082.read(bArr);
                            StringBuilder A10 = AnonymousClass000.A10();
                            int i3 = 0;
                            do {
                                A10.append((char) (((short) bArr[i3]) & 65535));
                                i3++;
                            } while (i3 < 4);
                            String A0H = C18070vi.A0H(A10);
                            int hashCode = A0H.hashCode();
                            if (hashCode != 2640674) {
                                if (hashCode != 2640718) {
                                    if (hashCode == 2640730 && A0H.equals("VP8X")) {
                                        A082.skip(8);
                                        r4 = AnonymousClass1D6.A00(Integer.valueOf(((A00(A082) << 16) | (A00(A082) << 8) | A00(A082)) + 1), ((A00(A082) << 16) | (A00(A082) << 8) | A00(A082)) + 1);
                                    }
                                } else if (A0H.equals("VP8L")) {
                                    A082.read();
                                    A082.read();
                                    A082.read();
                                    A082.read();
                                    if (A00(A082) == 47) {
                                        int A003 = A00(A082);
                                        int A004 = A00(A082);
                                        r4 = AnonymousClass1D6.A00(Integer.valueOf((A003 | ((A004 & 63) << 8)) + 1), (((A00(A082) & 15) << 10) | (A00(A082) << 2) | ((A004 & 192) >> 6)) + 1);
                                    }
                                }
                            } else if (A0H.equals("VP8 ")) {
                                A082.skip(7);
                                int A005 = A00(A082);
                                int A006 = A00(A082);
                                int A007 = A00(A082);
                                if (A005 == 157 && A006 == 1 && A007 == 42) {
                                    r4 = AnonymousClass1D6.A00(Integer.valueOf((A00(A082) << 8) | A00(A082)), (A00(A082) << 8) | A00(A082));
                                }
                            }
                            try {
                                A082.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            if (r4 != null) {
                                drj.A05 = AnonymousClass3MZ.A04(r4);
                                drj.A01 = C108955ca.A09(r4);
                            }
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    try {
                        A082.close();
                        throw th;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        throw th;
                    }
                }
                try {
                    A082.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        } else {
            try {
                InputStream A083 = drj.A08();
                try {
                    C25053CVh A022 = C26077Crr.A02(A083);
                    drj.A06 = A022.A00();
                    r4 = A022.A00;
                    if (r4 != null) {
                        drj.A05 = BE6.A0F(r4.first);
                        drj.A01 = BE6.A0F(r4.second);
                    }
                    if (A083 != null) {
                        try {
                            A083.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (A083 != null) {
                        try {
                            A083.close();
                            throw th;
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
        if (A002 == CIN.A06 && drj.A02 == -1) {
            if (r4 != null) {
                InputStream A084 = drj.A08();
                boolean z = false;
                C18070vi.A0d(A084, 0);
                i2 = 0;
                while (true) {
                    try {
                        if (A01(A084, 1, false) != 255) {
                            break;
                        }
                        do {
                            A012 = A01(A084, 1, false);
                        } while (A012 == 255);
                        if (A012 != 225) {
                            if (!(A012 == 1 || A012 == 216)) {
                                if (A012 == 217 || A012 == 218) {
                                    break;
                                }
                                A084.skip((long) (A01(A084, 2, false) - 2));
                            }
                        } else {
                            int A013 = A01(A084, 2, false) - 2;
                            if (A013 > 6) {
                                int A014 = A01(A084, 4, false);
                                int i4 = A013 - 4;
                                int A015 = A01(A084, 2, false);
                                int i5 = i4 - 2;
                                if (A014 == 1165519206 && A015 == 0 && i5 != 0 && i5 > 8) {
                                    int A016 = A01(A084, 4, false);
                                    int i6 = i5 - 4;
                                    if (A016 == 1229531648) {
                                        z = true;
                                    } else if (A016 != 1296891946) {
                                        cls = C9J.class;
                                        str = "Invalid TIFF header";
                                        C26265CwA.A03(cls, str);
                                    }
                                    int A017 = A01(A084, 4, z);
                                    int i7 = i6 - 4;
                                    if (A017 < 8 || A017 - 8 > i7) {
                                        cls = C9J.class;
                                        str = "Invalid offset";
                                        C26265CwA.A03(cls, str);
                                    } else {
                                        int i8 = A017 - 8;
                                        if (i7 != 0 && i8 <= i7) {
                                            A084.skip((long) i8);
                                            int i9 = i7 - i8;
                                            if (i9 >= 14) {
                                                int A018 = A01(A084, 2, z);
                                                int i10 = i9 - 2;
                                                while (true) {
                                                    int i11 = A018 - 1;
                                                    if (A018 <= 0 || i10 < 12) {
                                                        break;
                                                    }
                                                    int i12 = i10 - 2;
                                                    if (A01(A084, 2, z) != 274) {
                                                        A084.skip(10);
                                                        i10 = i12 - 10;
                                                        A018 = i11;
                                                    } else if (i12 >= 10 && A01(A084, 2, z) == 3 && A01(A084, 4, z) == 1) {
                                                        i2 = A01(A084, 2, z);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IOException unused3) {
                    }
                }
            } else {
                return;
            }
        } else if (A002 == CIN.A04 && drj.A02 == -1) {
            InputStream A085 = drj.A08();
            i2 = 0;
            if (A085 == null) {
                EAY eay = C26265CwA.A00;
                if (eay.BfN(3)) {
                    eay.BHz("HeifExifUtil", "Trying to read Heif Exif from null inputStream -> ignoring");
                }
            } else {
                try {
                    i2 = new C26303CxM(A085).A0Z(1);
                } catch (IOException e5) {
                    EAY eay2 = C26265CwA.A00;
                    if (eay2.BfN(3)) {
                        eay2.BI0("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e5);
                    }
                }
            }
        } else if (drj.A02 == -1) {
            i = 0;
            drj.A02 = i;
        } else {
            return;
        }
        drj.A00 = i2;
        i = 0;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 3) {
                i = 180;
            } else if (i2 == 6) {
                i = 90;
            } else if (i2 == 8) {
                i = 270;
            }
        }
        drj.A02 = i;
    }

    public ColorSpace A06() {
        A03(this);
        return this.A06;
    }

    public void A09(DRJ drj) {
        A03(drj);
        this.A07 = drj.A07;
        A03(drj);
        this.A05 = drj.A05;
        A03(drj);
        this.A01 = drj.A01;
        A03(drj);
        this.A02 = drj.A02;
        A03(drj);
        this.A00 = drj.A00;
        this.A03 = drj.A03;
        this.A04 = drj.A05();
        A03(drj);
        this.A06 = drj.A06;
        this.A09 = drj.A09;
    }

    public DRJ(DRN drn) {
        this.A07 = C25783Clu.A02;
        this.A02 = -1;
        this.A00 = 0;
        this.A05 = -1;
        this.A01 = -1;
        this.A03 = 1;
        this.A04 = -1;
        C26208Cuj.A04(DRN.A02(drn));
        this.A0B = drn.clone();
        this.A0A = null;
    }
}
