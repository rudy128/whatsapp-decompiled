package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7Ka  reason: invalid class name and case insensitive filesystem */
public final class C145127Ka implements C32941i0 {
    public Runnable A00;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;
    public final C132016m2 A04;
    public final C18180vt A05;
    public final C200710s A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final AnonymousClass1MZ A0D;
    public final C25241Nl A0E;

    public final void A05(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        String A002 = A00(this, r5);
        if (A002 != null) {
            this.A06.execute(new C146817Qs(31, A002, this));
        }
    }

    public /* synthetic */ void BoN(AnonymousClass205 r1, List list) {
    }

    public static final String A00(C145127Ka r5, AnonymousClass206 r6) {
        if (r6 instanceof AnonymousClass21V) {
            String str = ((AnonymousClass21V) r6).A05;
            if (r5.A05.A01(str)) {
                if (C18020vd.A05(C18040vf.A02, r5.A02, 11045)) {
                    return str;
                }
            }
        }
        return null;
    }

    public static final void A01(AnonymousClass1BI r4, C145127Ka r5, Integer num, String str) {
        C132016m2 r2 = r5.A04;
        C136646u9 A002 = r2.A00(str);
        A002.A0D = str;
        switch (num.intValue()) {
            case 0:
                A002.A09 = Integer.valueOf(C72463Mc.A0B(A002.A09) + 1);
                break;
            case 1:
                A002.A08 = Integer.valueOf(C72463Mc.A0B(A002.A08) + 1);
                break;
            case 2:
                A002.A03 = Integer.valueOf(C72463Mc.A0B(A002.A03) + 1);
                break;
            case 3:
                A002.A06 = Integer.valueOf(C72463Mc.A0B(A002.A06) + 1);
                break;
            default:
                A002.A0C = C108955ca.A0m();
                break;
        }
        if (r4 != null) {
            if (A002.A0E == null) {
                A002.A0E = r5.A0E.A05(r4.getRawString());
            }
            if ((r4 instanceof AnonymousClass1E9) && A002.A05 == null) {
                A002.A05 = Integer.valueOf(C64002u3.A03(r5.A0D.A08.A09((AnonymousClass1E9) r4)));
            }
        }
        String str2 = A002.A0D;
        if (str2 != null) {
            C17880vN.A1E(C17890vO.A0A(r2.A01), str2, A002.toString());
        }
    }

    public static final void A02(C145127Ka r2, AnonymousClass205 r3) {
        String str;
        AnonymousClass206 A012 = AnonymousClass1W2.A01(r3, r2.A08);
        if ((A012 instanceof AnonymousClass21V) && (str = ((AnonymousClass21V) A012).A05) != null) {
            C17880vN.A1B(C17890vO.A0A(r2.A04.A01), str);
        }
    }

    public final void A03(AnonymousClass206 r5) {
        String A002;
        if ((r5 instanceof C438321c) && (A002 = A00(this, r5)) != null) {
            this.A06.execute(new C21467AkY(this, r5, A002, 39));
        }
    }

    public void BoM(AnonymousClass1BI r4, AnonymousClass205 r5) {
        if (C18020vd.A05(C18040vf.A02, this.A02, 11045)) {
            this.A06.execute(new C146807Qr(this, r5, 44));
        }
    }

    public C145127Ka(AnonymousClass11P r3, AnonymousClass1MZ r4, C18030ve r5, AnonymousClass18K r6, C25241Nl r7, C132016m2 r8, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        C18070vi.A0w(r3, r5, r9, r6, r7);
        C18070vi.A0x(r10, r11, r12, r13, r4);
        C18070vi.A0d(r8, 11);
        this.A01 = r3;
        this.A02 = r5;
        this.A07 = r9;
        this.A03 = r6;
        this.A0E = r7;
        this.A08 = r10;
        this.A0A = r11;
        this.A09 = r12;
        this.A0B = r13;
        this.A0D = r4;
        this.A04 = r8;
        int A002 = C18020vd.A00(C18040vf.A02, r5, 11163);
        this.A06 = C200710s.A00(r9);
        this.A05 = new C18180vt(A002, A002);
    }

    public final void A04(AnonymousClass206 r7) {
        String A002 = A00(this, r7);
        if (A002 != null) {
            ConcurrentHashMap concurrentHashMap = this.A0C;
            if (concurrentHashMap.putIfAbsent(A002, C17880vN.A0o(AnonymousClass11P.A01(this.A01), 1000)) == null && this.A00 == null && !concurrentHashMap.isEmpty()) {
                this.A00 = this.A07.CGv(new C21467AkY(this, r7, A002, 40), 1000);
            }
        }
    }

    public void BoL(AnonymousClass1BI r4, AnonymousClass205 r5) {
        if (C22781De.A03()) {
            this.A06.execute(new C146807Qr(this, r5, 43));
        } else {
            A02(this, r5);
        }
    }
}
