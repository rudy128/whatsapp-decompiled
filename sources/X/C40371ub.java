package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1ub  reason: invalid class name and case insensitive filesystem */
public final class C40371ub {
    public final C32101gd A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05 = C217517g.A00(16445);
    public final AnonymousClass00H A06;

    public C40371ub(C32101gd r2, AnonymousClass1CJ r3, AnonymousClass1MZ r4, AnonymousClass18K r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r2, 5);
        C18070vi.A0d(r4, 6);
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final Integer A00(int i) {
        int i2;
        if (i != 1) {
            if (i == 3) {
                return 4;
            }
            i2 = 5;
            if (i != 4) {
                if (i != 5) {
                    i2 = 6;
                    if (i != 6) {
                        if (i == 9) {
                            return 1;
                        }
                        if (i != 10) {
                            return null;
                        }
                    }
                } else {
                    i2 = 7;
                }
            }
            return Integer.valueOf(i2);
        }
        i2 = 2;
        return Integer.valueOf(i2);
    }

    public static final Integer A01(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    return null;
                }
            }
        }
        return Integer.valueOf(i2);
    }

    public final void A04() {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, 20, 11);
    }

    public final void A05() {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, 21, 11);
    }

    public final void A06() {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, 22, 11);
    }

    public final void A07() {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, 11, 4);
    }

    public final void A08(int i) {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, i, 12);
    }

    public final void A09(int i) {
        AnonymousClass00H r1 = this.A05;
        A0D(((AnonymousClass17C) r1.get()).A00, (Long) null, ((AnonymousClass17C) r1.get()).A00(), (String) null, i, 14);
    }

    public final void A0D(Integer num, Long l, String str, String str2, int i, int i2) {
        C18070vi.A0d(str, 0);
        AnonymousClass2GA r1 = new AnonymousClass2GA();
        r1.A04 = str;
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = num;
        r1.A00 = Integer.valueOf(i);
        r1.A03 = l;
        r1.A05 = str2;
        this.A03.CC4(r1);
    }

    public final void A0E(Integer num, String str, int i, int i2) {
        C18070vi.A0d(str, 0);
        A0D(num, (Long) null, str, (String) null, i, i2);
    }

    private final void A02(int i, int i2, long j, int i3) {
        AnonymousClass2GC r1 = new AnonymousClass2GC();
        r1.A05 = ((C189339iv) this.A04.get()).A00();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A03 = Integer.valueOf(i3);
        r1.A04 = Long.valueOf(j);
        this.A03.CC7(r1);
    }

    public static final void A03(C40371ub r2, int i, int i2, int i3) {
        AnonymousClass2GC r1 = new AnonymousClass2GC();
        r1.A05 = ((C189339iv) r2.A04.get()).A00();
        r1.A00 = Integer.valueOf(i);
        r1.A03 = Integer.valueOf(i3);
        r1.A01 = Integer.valueOf(i2);
        r2.A03.CC7(r1);
    }

    public final void A0A(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A02(11, A002.intValue(), j, A012.intValue());
        }
    }

    public final void A0B(int i, long j, int i2) {
        Integer A002 = A00(i);
        Integer A012 = A01(i2);
        if (A002 != null && A012 != null) {
            A02(10, A002.intValue(), j, A012.intValue());
        }
    }

    public final void A0C(C436420i r6, int i) {
        AnonymousClass205 r0;
        AnonymousClass1BI r2;
        int i2;
        Integer A012 = A01(i);
        if (A012 != null) {
            A03(this, 15, 1, A012.intValue());
        }
        if (r6 != null && (r0 = r6.A0v) != null && (r2 = r0.A00) != null) {
            int i3 = r6.A00;
            if (i3 != 144) {
                switch (i3) {
                    case 122:
                        i2 = 1;
                        break;
                    case 123:
                        i2 = 4;
                        break;
                    case 124:
                        break;
                    case 125:
                    case 126:
                        i2 = 5;
                        break;
                    case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                        i2 = 3;
                        break;
                    case 128:
                        i2 = 6;
                        break;
                    default:
                        return;
                }
            }
            i2 = 2;
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf != null) {
                int i4 = 1;
                if (!(i == 1 || i == 2)) {
                    i4 = 2;
                }
                AnonymousClass1CJ r1 = this.A01;
                C36321nh r02 = GroupJid.Companion;
                int A062 = r1.A06(C36321nh.A00(r2));
                int i5 = 2;
                if (A062 != 2) {
                    if (A062 == 3) {
                        i5 = 3;
                    } else if (A062 != 6) {
                        i5 = 1;
                    }
                }
                AnonymousClass2FT r12 = new AnonymousClass2FT();
                r12.A01 = valueOf;
                r12.A02 = Integer.valueOf(i4);
                r12.A00 = Integer.valueOf(i5);
                this.A03.CC7(r12);
            }
        }
    }
}
