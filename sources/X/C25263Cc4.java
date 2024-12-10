package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* renamed from: X.Cc4  reason: case insensitive filesystem */
public final class C25263Cc4 {
    public final C4L A00;
    public final DPN A01;

    public C25263Cc4(DPN dpn, C25806CmJ cmJ, byte[] bArr) {
        C4L c4l;
        C18070vi.A0d(dpn, 2);
        this.A01 = dpn;
        if (!cmJ.A00) {
            DPI dpi = dpn.A00;
            if (!(dpi instanceof C23958Bss)) {
                if (!dpn.A02 || cmJ.A01) {
                    if (bArr != null) {
                        c4l = new C23908Bs4(cmJ, bArr);
                        this.A00 = c4l;
                        return;
                    }
                    throw new C23899Brv();
                } else if (!(dpi instanceof C23962Bsw) && !(dpi instanceof C23959Bst)) {
                    throw new C23902Bry(dpi);
                } else if (bArr != null) {
                    c4l = new C23909Bs5(cmJ, bArr);
                    this.A00 = c4l;
                    return;
                } else {
                    throw new C23897Brt();
                }
            }
        }
        if (bArr == null) {
            c4l = new C23907Bs3(cmJ);
            this.A00 = c4l;
            return;
        }
        throw new C23898Bru();
    }

    public final Object A00(C26032Cqs cqs) {
        Throwable th;
        Throwable brz;
        Object A012;
        boolean z;
        try {
            DPN dpn = this.A01;
            DPI dpi = dpn.A00;
            if (dpi instanceof C23958Bss) {
                C4L c4l = this.A00;
                if (c4l instanceof C23909Bs5) {
                    brz = new C23902Bry(C23958Bss.A00);
                } else if (c4l instanceof C23907Bs3) {
                    A012 = cqs.A00.A01();
                    if (!(A012 instanceof AnonymousClass1IU)) {
                        long A05 = C17880vN.A05(A012);
                        if (A05 == 0) {
                            z = false;
                        } else if (A05 == 1) {
                            z = true;
                        } else {
                            throw new C23901Brx(A05);
                        }
                        A012 = Boolean.valueOf(z);
                    }
                    C30691eM.A01(A012);
                    return (Boolean) A012;
                } else if (c4l instanceof C23908Bs4) {
                    brz = new C23903Brz(C23958Bss.A00);
                } else {
                    th = AnonymousClass3MW.A14();
                }
                A012 = C108945cZ.A1J(brz);
                C30691eM.A01(A012);
                return (Boolean) A012;
            }
            th = new C23906Bs2(C23958Bss.A00, dpi, dpn.A01);
            throw th;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }

    public final Object A01(C26032Cqs cqs) {
        Throwable th;
        byte[] bArr;
        Throwable th2;
        try {
            DPN dpn = this.A01;
            DPI dpi = dpn.A00;
            if (dpi instanceof C23959Bst) {
                C4L c4l = this.A00;
                if (c4l instanceof C23909Bs5) {
                    Object A03 = cqs.A03();
                    boolean z = !(A03 instanceof AnonymousClass1IU);
                    bArr = A03;
                    if (z) {
                        C4N c4n = (C4N) A03;
                        if (c4n instanceof C23917BsD) {
                            long j = ((C23917BsD) c4n).A00;
                            ArrayList arrayList = ((C23909Bs5) c4l).A02;
                            if (j < ((long) arrayList.size())) {
                                C4M c4m = (C4M) AnonymousClass8BS.A0Z(arrayList, (int) j);
                                if (c4m instanceof C23914BsA) {
                                    bArr = ((C23914BsA) c4m).A00;
                                } else {
                                    th2 = new C23905Bs1(C23959Bst.A00, C23962Bsw.A00);
                                }
                            } else {
                                th2 = new C23900Brw(j);
                            }
                        } else if (c4n instanceof C23918BsE) {
                            C23909Bs5 bs5 = (C23909Bs5) c4l;
                            Object A002 = bs5.A00.A00(((C23918BsE) c4n).A00);
                            C30691eM.A01(A002);
                            byte[] bArr2 = (byte[]) A002;
                            bs5.A02.add(new C23914BsA(bArr2));
                            bArr = bArr2;
                        } else {
                            th2 = AnonymousClass3MW.A14();
                        }
                        throw th2;
                    }
                } else if (c4l instanceof C23907Bs3) {
                    Object A04 = cqs.A04();
                    boolean z2 = !(A04 instanceof AnonymousClass1IU);
                    bArr = A04;
                    if (z2) {
                        Object A05 = cqs.A05(C17880vN.A05(A04));
                        C30691eM.A01(A05);
                        bArr = (byte[]) A05;
                    }
                } else if (c4l instanceof C23908Bs4) {
                    Object A042 = cqs.A04();
                    boolean z3 = !(A042 instanceof AnonymousClass1IU);
                    bArr = A042;
                    if (z3) {
                        Object A003 = ((C23908Bs4) c4l).A00.A00(C17880vN.A05(A042));
                        C30691eM.A01(A003);
                        bArr = (byte[]) A003;
                    }
                } else {
                    th = AnonymousClass3MW.A14();
                }
                C30691eM.A01(bArr);
                return (byte[]) bArr;
            }
            th = new C23906Bs2(C23959Bst.A00, dpi, dpn.A01);
            throw th;
        } catch (Throwable th3) {
            return C108945cZ.A1J(th3);
        }
    }

    public final Object A02(C26032Cqs cqs) {
        Throwable th;
        Object A02;
        try {
            DPN dpn = this.A01;
            DPI dpi = dpn.A00;
            if (dpi instanceof C23961Bsv) {
                C4L c4l = this.A00;
                if (c4l instanceof C23909Bs5) {
                    A02 = C30691eM.A00(new C23902Bry(C23961Bsv.A00));
                } else if (c4l instanceof C23907Bs3) {
                    A02 = cqs.A00.A02(8);
                    if (!(A02 instanceof AnonymousClass1IU)) {
                        A02 = Double.valueOf(ByteBuffer.wrap((byte[]) A02).order(ByteOrder.LITTLE_ENDIAN).getDouble());
                    }
                } else if (c4l instanceof C23908Bs4) {
                    A02 = ((C23908Bs4) c4l).A00.A00.A02(8);
                    if (!(A02 instanceof AnonymousClass1IU)) {
                        try {
                            A02 = Double.valueOf(ByteBuffer.wrap((byte[]) A02).order(ByteOrder.LITTLE_ENDIAN).getDouble());
                        } catch (Throwable th2) {
                            A02 = C108945cZ.A1J(th2);
                        }
                    }
                } else {
                    th = AnonymousClass3MW.A14();
                }
                C30691eM.A01(A02);
                return Double.valueOf(AnonymousClass8BR.A00(A02));
            }
            th = new C23906Bs2(C23961Bsv.A00, dpi, dpn.A01);
            throw th;
        } catch (Throwable th3) {
            return C108945cZ.A1J(th3);
        }
    }

    public final Object A03(C26032Cqs cqs) {
        Throwable th;
        String str;
        Object A002;
        Throwable th2;
        try {
            DPN dpn = this.A01;
            DPI dpi = dpn.A00;
            if (dpi instanceof C23962Bsw) {
                C4L c4l = this.A00;
                if (c4l instanceof C23909Bs5) {
                    Object A03 = cqs.A03();
                    boolean z = !(A03 instanceof AnonymousClass1IU);
                    str = A03;
                    if (z) {
                        try {
                            C4N c4n = (C4N) A03;
                            if (c4n instanceof C23917BsD) {
                                long j = ((C23917BsD) c4n).A00;
                                ArrayList arrayList = ((C23909Bs5) c4l).A02;
                                if (j < ((long) arrayList.size())) {
                                    C4M c4m = (C4M) AnonymousClass8BS.A0Z(arrayList, (int) j);
                                    if (c4m instanceof C23915BsB) {
                                        str = ((C23915BsB) c4m).A00;
                                    } else {
                                        th2 = new C23905Bs1(C23962Bsw.A00, C23959Bst.A00);
                                    }
                                } else {
                                    th2 = new C23900Brw(j);
                                }
                            } else if (c4n instanceof C23918BsE) {
                                C23909Bs5 bs5 = (C23909Bs5) c4l;
                                Object A012 = bs5.A00.A01(((C23918BsE) c4n).A00, bs5.A01.A02);
                                C30691eM.A01(A012);
                                String str2 = (String) A012;
                                bs5.A02.add(new C23915BsB(str2));
                                str = str2;
                            } else {
                                th2 = AnonymousClass3MW.A14();
                            }
                            throw th2;
                        } catch (Throwable th3) {
                            str = C108945cZ.A1J(th3);
                        }
                    }
                } else if (c4l instanceof C23907Bs3) {
                    Object A04 = cqs.A04();
                    boolean z2 = !(A04 instanceof AnonymousClass1IU);
                    str = A04;
                    if (z2) {
                        long A05 = C17880vN.A05(A04);
                        boolean z3 = ((C23907Bs3) c4l).A00.A02;
                        Object A052 = cqs.A05(A05);
                        if (!(A052 instanceof AnonymousClass1IU)) {
                            try {
                                A052 = C18070vi.A0H(cqs.A01.decode(ByteBuffer.wrap((byte[]) A052)));
                                if (z3) {
                                    A002 = cqs.A00.A00();
                                    if (!(A002 instanceof AnonymousClass1IU)) {
                                        byte b = ((DSD) A002).A00;
                                        if ((b & 255) == 0) {
                                            A002 = C27621Wu.A00;
                                        } else {
                                            throw new C23924BsK(b);
                                        }
                                    }
                                    C30691eM.A01(A002);
                                }
                            } catch (Throwable th4) {
                                A052 = C108945cZ.A1J(th4);
                            }
                        }
                        C30691eM.A01(A052);
                        str = (String) A052;
                    }
                } else if (c4l instanceof C23908Bs4) {
                    Object A042 = cqs.A04();
                    boolean z4 = !(A042 instanceof AnonymousClass1IU);
                    str = A042;
                    if (z4) {
                        C23908Bs4 bs4 = (C23908Bs4) c4l;
                        Object A013 = bs4.A00.A01(C17880vN.A05(A042), bs4.A01.A02);
                        C30691eM.A01(A013);
                        str = (String) A013;
                    }
                } else {
                    th = AnonymousClass3MW.A14();
                }
                C30691eM.A01(str);
                return (String) str;
            }
            th = new C23906Bs2(C23962Bsw.A00, dpi, dpn.A01);
            throw th;
        } catch (Throwable th5) {
            return C108945cZ.A1J(th5);
        }
    }

    public final Object A04(C26032Cqs cqs) {
        Throwable th;
        C25171CaN caN;
        Object A012;
        try {
            DPN dpn = this.A01;
            DPI dpi = dpn.A00;
            if (dpi instanceof C23963Bsx) {
                C4L c4l = this.A00;
                if (c4l instanceof C23909Bs5) {
                    A012 = C30691eM.A00(new C23902Bry(C23963Bsx.A00));
                } else {
                    if (c4l instanceof C23907Bs3) {
                        caN = cqs.A00;
                    } else if (c4l instanceof C23908Bs4) {
                        caN = ((C23908Bs4) c4l).A00.A00;
                    } else {
                        th = AnonymousClass3MW.A14();
                    }
                    A012 = caN.A01();
                }
                C30691eM.A01(A012);
                return Long.valueOf(C17880vN.A05(A012));
            }
            th = new C23906Bs2(C23963Bsx.A00, dpi, dpn.A01);
            throw th;
        } catch (Throwable th2) {
            return C108945cZ.A1J(th2);
        }
    }
}
