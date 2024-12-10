package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Wx  reason: invalid class name and case insensitive filesystem */
public final class C06090Wx implements C16870tM {
    public final AnonymousClass0To A00;

    public C06090Wx(AnonymousClass0To r1) {
        this.A00 = r1;
    }

    public int BjA(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bj9(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bj9(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int BjD(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).BjC(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).BjC(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public C16820tH BjZ(C17530uo r11, List list, long j) {
        Object obj;
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass001.A1T(A14, list, i2, j);
        }
        Object obj2 = null;
        int i3 = 1;
        if (A14.isEmpty()) {
            obj = null;
        } else {
            obj = A14.get(0);
            int i4 = ((AnonymousClass0XJ) obj).A01;
            int A04 = AnonymousClass1ZU.A04(A14);
            if (1 <= A04) {
                int i5 = 1;
                while (true) {
                    Object obj3 = A14.get(i5);
                    int i6 = ((AnonymousClass0XJ) obj3).A01;
                    if (i4 < i6) {
                        obj = obj3;
                        i4 = i6;
                    }
                    if (i5 == A04) {
                        break;
                    }
                    i5++;
                }
            }
        }
        int A0K = AnonymousClass000.A0K((AnonymousClass0XJ) obj);
        if (!A14.isEmpty()) {
            obj2 = A14.get(0);
            int i7 = ((AnonymousClass0XJ) obj2).A00;
            int A042 = AnonymousClass1ZU.A04(A14);
            if (1 <= A042) {
                while (true) {
                    Object obj4 = A14.get(i3);
                    int i8 = ((AnonymousClass0XJ) obj4).A00;
                    if (i7 < i8) {
                        obj2 = obj4;
                        i7 = i8;
                    }
                    if (i3 == A042) {
                        break;
                    }
                    i3++;
                }
            }
        }
        AnonymousClass0XJ r8 = (AnonymousClass0XJ) obj2;
        if (r8 != null) {
            i = r8.A00;
        }
        this.A00.A01.setValue(C26142Ct5.A00(C25293Ccv.A00(A0K, i)));
        return r11.BhL(AnonymousClass1D7.A0I(), new C09440gi(A14), A0K, i);
    }

    public int Bjw(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bjv(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bjv(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public int Bjz(C17740v9 r6, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(AnonymousClass000.A0g(list, 0).Bjy(i));
        int A04 = AnonymousClass1ZU.A04(list);
        int i2 = 1;
        if (1 <= A04) {
            while (true) {
                valueOf = AnonymousClass001.A16(valueOf, AnonymousClass000.A0g(list, i2).Bjy(i));
                if (i2 == A04) {
                    break;
                }
                i2++;
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
