package X;

import com.whatsapp.consent.common.CommonAgeCollector$observeConsentData$3;
import com.whatsapp.consent.common.CommonAgeCollector$onYearSelected$1;
import com.whatsapp.consent.common.CommonAgeCollector$sendAgeVerification$3;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Dj  reason: invalid class name and case insensitive filesystem */
public class C143427Dj implements C160928Ao {
    public static final C25411Oc A0J = new C25411Oc(5, 149);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final C125756bd A05;
    public final AnonymousClass8AM A06;
    public final C18000vb A07;
    public final C25671Pd A08;
    public final C18030ve A09;
    public final AnonymousClass1CM A0A;
    public final AnonymousClass00H A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18600wl A0E;
    public final AnonymousClass11P A0F;
    public final C131516lE A0G;
    public final AnonymousClass11X A0H;
    public final C18100vl A0I;

    public void CFi() {
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = -1;
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A0C);
        do {
        } while (!A17.BFK(A17.getValue(), new C136416tm(A01(this), (String) null, (String) null, this.A02, 0, false, false, false)));
    }

    private final int A00() {
        ((C25681Pe) this.A08).A02().getString("idv_token", (String) null);
        return 18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.A00 == -1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(X.C143427Dj r4) {
        /*
            int r0 = r4.A01
            r1 = -1
            if (r0 == r1) goto L_0x000a
            int r0 = r4.A00
            r3 = 0
            if (r0 != r1) goto L_0x000b
        L_0x000a:
            r3 = 1
        L_0x000b:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x003a
            r1 = 2131886569(0x7f1201e9, float:1.940772E38)
            java.lang.String r2 = "dd / MM"
        L_0x0014:
            X.0vb r0 = r4.A07
            if (r3 == 0) goto L_0x0020
            java.lang.String r0 = r0.A09(r1)
        L_0x001c:
            X.C18070vi.A0X(r0)
            return r0
        L_0x0020:
            java.util.Locale r0 = r0.A0N()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r2, r0)
            X.00H r0 = r4.A0B
            java.lang.Object r0 = r0.get()
            java.util.Calendar r0 = (java.util.Calendar) r0
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r1.format(r0)
            goto L_0x001c
        L_0x003a:
            r1 = 2131886568(0x7f1201e8, float:1.9407719E38)
            java.lang.String r2 = "MM / dd"
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143427Dj.A01(X.7Dj):java.lang.String");
    }

    public final int A02() {
        Calendar calendar = (Calendar) this.A0B.get();
        int i = this.A02;
        int i2 = this.A01;
        if (i == -1) {
            return 0;
        }
        if (i2 == -1) {
            i2 = calendar.getMaximum(2);
        }
        int i3 = this.A00;
        if (i3 == -1) {
            i3 = calendar.getMaximum(5);
        }
        C131516lE r4 = this.A0G;
        int i4 = this.A02;
        AnonymousClass7x0 r3 = AnonymousClass7x0.A00;
        int A002 = r4.A00(r3, i4, i2, i3);
        if (A002 >= A00() && this.A00 == -1 && this.A01 == -1) {
            A002 = r4.A00(r3, this.A02, calendar.getMinimum(2), calendar.getMinimum(5));
        }
        return Math.max(A002, 0);
    }

    public boolean BI2() {
        String A082 = this.A07.A08(171);
        C18070vi.A0X(A082);
        boolean z = false;
        if (A082.length() != 0 && A082.charAt(0) == 'd') {
            z = true;
        }
        this.A04 = z;
        return z;
    }

    public C136116tI BQG() {
        Calendar calendar = (Calendar) this.A0B.get();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(this.A02, 0, calendar.getMinimum(5));
        Date time = gregorianCalendar.getTime();
        C18070vi.A0X(time);
        gregorianCalendar.set(this.A02, 11, calendar.getMaximum(5));
        Date time2 = gregorianCalendar.getTime();
        C18070vi.A0X(time2);
        return new C136116tI(calendar.get(1), calendar.get(2), calendar.get(5), System.currentTimeMillis(), time.getTime(), time2.getTime());
    }

    public List BU7() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(System.currentTimeMillis()));
        int i = gregorianCalendar.get(1);
        C25411Oc r1 = new C25411Oc(i - 149, i);
        NumberFormat A0L = this.A07.A0L();
        C18070vi.A0X(A0L);
        A0L.setGroupingUsed(false);
        ArrayList A0D2 = C29351c6.A0D(r1);
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            A0D2.add(A0L.format(Integer.valueOf(((AnonymousClass20T) it).A00())));
        }
        return A0D2;
    }

    public C23421Fz BVI() {
        return (C23421Fz) this.A0I.getValue();
    }

    public Object Bka(C30391dr r15, AnonymousClass1OX r16) {
        Object value;
        C136416tm r0;
        int A022;
        C18100vl r3 = this.A0C;
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(r3);
        do {
            value = A17.getValue();
            r0 = (C136416tm) value;
            A022 = A02();
        } while (!A17.BFK(value, new C136416tm(r0.A02, r0.A03, r0.A04, r0.A01, A022, r0.A06, r0.A07, r0.A05)));
        AnonymousClass3MX.A1Q(new CommonAgeCollector$observeConsentData$3(this, (C30391dr) null), r16);
        return r3.getValue();
    }

    public Object BlJ(C30391dr r19) {
        Object value;
        C136416tm r0;
        int i;
        C30391dr r13 = r19;
        if (this instanceof C116465xl) {
            return AnonymousClass3MX.A13(this.A08.COM(r13, this.A02, this.A01, this.A00, A02()));
        }
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A0C);
        do {
            value = A17.getValue();
            r0 = (C136416tm) value;
            i = r0.A01;
        } while (!A17.BFK(value, new C136416tm(r0.A02, r0.A03, (String) null, i, r0.A00, true, r0.A07, false)));
        return AnonymousClass3MX.A13(C30451dy.A00(r13, this.A0E, new CommonAgeCollector$sendAgeVerification$3(this, (C30391dr) null)));
    }

    public Object Bp7(C30391dr r3) {
        return AnonymousClass3MX.A13(((C108495bn) this.A0D.getValue()).CHH(C143507Dr.A00, r3));
    }

    public void Bs3(int i, int i2, int i3) {
        Object value;
        C136416tm r7;
        int A022;
        int i4;
        String A012;
        int i5;
        int i6;
        String A092;
        int i7 = i;
        this.A02 = i7;
        int i8 = i2;
        this.A01 = i8;
        int i9 = i3;
        this.A00 = i9;
        ((Calendar) this.A0B.get()).set(i7, i8, i9);
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A0C);
        do {
            value = A17.getValue();
            r7 = (C136416tm) value;
            A022 = A02();
            i4 = this.A02;
            A012 = A01(this);
            C25411Oc r0 = A0J;
            i5 = r0.A00;
            i6 = r0.A01;
            if (A022 > i6 || i5 > A022) {
                A092 = this.A07.A09(2131886576);
            } else {
                A092 = null;
            }
        } while (!A17.BFK(value, new C136416tm(A012, A092, (String) null, i4, A022, r7.A06, AnonymousClass000.A1U(A022, A00()), AnonymousClass000.A1O(C18020vd.A05(C18040vf.A02, this.A05.A00, 12577) ? 1 : 0))));
        int A023 = A02();
        if (A023 > i6 || i5 > A023) {
            this.A06.BiQ(true);
        }
    }

    public void CAh(int i) {
        Object value;
        C136416tm r8;
        int A022;
        String A012;
        int i2;
        int i3;
        String A092;
        boolean A1U;
        boolean z;
        int i4 = i;
        this.A02 = i4;
        int A023 = A02();
        AnonymousClass19D r5 = this.A05.A00;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r5, 12898) && A023 < A00() && this.A01 == -1 && this.A00 == -1 && i4 != this.A03) {
            this.A03 = i4;
            AnonymousClass3MX.A1Q(new CommonAgeCollector$onYearSelected$1(this, (C30391dr) null), AnonymousClass1OW.A02(this.A0E));
        }
        AnonymousClass1G4 A17 = AnonymousClass3MW.A17(this.A0C);
        do {
            value = A17.getValue();
            r8 = (C136416tm) value;
            A022 = A02();
            this.A01 = -1;
            this.A00 = -1;
            A012 = A01(this);
            C25411Oc r0 = A0J;
            i2 = r0.A00;
            i3 = r0.A01;
            if (A022 > i3 || i2 > A022) {
                A092 = this.A07.A09(2131886576);
            } else {
                A092 = null;
            }
            A1U = AnonymousClass000.A1U(A022, A00());
            z = true;
            if ((!(!AnonymousClass000.A1U(A022, A00())) || !C18020vd.A05(r4, r5, 12577) || this.A01 == -1) && (A022 < A00() || !C18020vd.A05(r4, r5, 12577))) {
                z = false;
            }
        } while (!A17.BFK(value, new C136416tm(A012, A092, (String) null, i4, A022, r8.A06, A1U, z)));
        int A024 = A02();
        if (A024 > i3 || i2 > A024) {
            this.A06.BiQ(false);
        }
    }

    public C143427Dj(C125756bd r5, AnonymousClass8AM r6, AnonymousClass11P r7, C131516lE r8, AnonymousClass11X r9, C18000vb r10, C25671Pd r11, C18030ve r12, AnonymousClass1CM r13, AnonymousClass00H r14, C18600wl r15) {
        this.A09 = r12;
        this.A0G = r8;
        this.A0B = r14;
        this.A08 = r11;
        this.A0F = r7;
        this.A07 = r10;
        this.A0H = r9;
        this.A06 = r6;
        this.A0A = r13;
        this.A0E = r15;
        this.A05 = r5;
        String A082 = r10.A08(171);
        C18070vi.A0X(A082);
        boolean z = false;
        if (A082.length() != 0 && A082.charAt(0) == 'd') {
            z = true;
        }
        this.A04 = z;
        this.A0D = AnonymousClass1DF.A01(C157467wy.A00);
        this.A0C = AnonymousClass1DF.A01(new C149527jC(this));
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = -1;
        this.A03 = -1;
        this.A0I = AnonymousClass1DF.A01(new C149537jD(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object Bqb(X.C30391dr r15) {
        /*
            r14 = this;
            int r3 = r14.A02()
            int r0 = r14.A02
            r1 = -1
            if (r0 != r1) goto L_0x003f
            X.0vl r0 = r14.A0C
            X.1G4 r4 = X.AnonymousClass3MW.A17(r0)
        L_0x000f:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.6tm r2 = (X.C136416tm) r2
            X.0vb r1 = r14.A07
            r0 = 2131886577(0x7f1201f1, float:1.9407737E38)
            java.lang.String r7 = r1.A09(r0)
            r8 = 0
            int r9 = r2.A01
            java.lang.String r6 = r2.A02
            int r10 = r2.A00
            boolean r11 = r2.A06
            boolean r12 = r2.A07
            boolean r13 = r2.A05
            X.6tm r5 = new X.6tm
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r4.BFK(r3, r5)
            if (r0 == 0) goto L_0x000f
            X.8AM r0 = r14.A06
            r0.Bic()
        L_0x003c:
            X.1Wu r1 = X.C27621Wu.A00
            return r1
        L_0x003f:
            int r0 = r14.A00()
            if (r3 >= r0) goto L_0x0081
            int r0 = r14.A01
            if (r0 != r1) goto L_0x0081
            int r0 = r14.A00
            if (r0 != r1) goto L_0x0081
            X.0vl r0 = r14.A0C
            X.1G4 r4 = X.AnonymousClass3MW.A17(r0)
        L_0x0053:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.6tm r2 = (X.C136416tm) r2
            X.0vb r1 = r14.A07
            r0 = 2131886574(0x7f1201ee, float:1.940773E38)
            java.lang.String r7 = r1.A09(r0)
            r8 = 0
            int r9 = r2.A01
            java.lang.String r6 = r2.A02
            int r10 = r2.A00
            boolean r11 = r2.A06
            boolean r12 = r2.A07
            boolean r13 = r2.A05
            X.6tm r5 = new X.6tm
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r4.BFK(r3, r5)
            if (r0 == 0) goto L_0x0053
            X.8AM r0 = r14.A06
            r0.BiT()
            goto L_0x003c
        L_0x0081:
            int r0 = r14.A00()
            if (r3 < r0) goto L_0x00a7
            X.0ve r2 = r14.A09
            r1 = 11912(0x2e88, float:1.6692E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00a7
            X.1CM r1 = r14.A0A
            r0 = 0
            int r1 = r1.A00(r0)
            r0 = 32
            if (r1 == r0) goto L_0x00a7
            java.lang.Object r1 = r14.BlJ(r15)
        L_0x00a2:
            X.1g4 r0 = X.C31751g4.COROUTINE_SUSPENDED
            if (r1 != r0) goto L_0x003c
            return r1
        L_0x00a7:
            X.0vl r0 = r14.A0D
            java.lang.Object r1 = r0.getValue()
            X.5bn r1 = (X.C108495bn) r1
            X.7Dk r0 = new X.7Dk
            r0.<init>(r3)
            java.lang.Object r1 = r1.CHH(r0, r15)
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143427Dj.Bqb(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C143427Dj(X.C125756bd r13, X.AnonymousClass8AM r14, X.AnonymousClass11P r15, X.C131516lE r16, X.AnonymousClass11X r17, X.C18000vb r18, X.C25671Pd r19, X.C18030ve r20, X.AnonymousClass1CM r21, X.C18600wl r22) {
        /*
            r12 = this;
            r0 = 3
            r3 = r15
            r4 = r16
            r8 = r20
            X.C72473Md.A1M(r8, r4, r15, r0)
            r0 = 6
            r1 = r13
            r6 = r18
            r9 = r21
            r11 = r22
            X.C72483Me.A16(r6, r9, r11, r13, r0)
            r0 = 7
            X.7Rx r0 = X.C147127Rx.A00(r0)
            X.0vq r10 = X.C18150vq.A01(r0)
            r0 = r12
            r2 = r14
            r5 = r17
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143427Dj.<init>(X.6bd, X.8AM, X.11P, X.6lE, X.11X, X.0vb, X.1Pd, X.0ve, X.1CM, X.0wl):void");
    }
}
