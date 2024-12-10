package X;

import java.util.Calendar;

/* renamed from: X.4S4  reason: invalid class name */
public final class AnonymousClass4S4 {
    public final C18030ve A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;

    public final String A01(Integer num, Long l, long j) {
        String A002;
        String A003;
        AnonymousClass118 r2;
        int i;
        if (!C18020vd.A05(C18040vf.A02, this.A00, 8509) || l == null) {
            return A00(num, j);
        }
        long longValue = l.longValue();
        if (A87.A04(j, longValue)) {
            AnonymousClass11P r0 = this.A01;
            C18000vb r5 = this.A03;
            A002 = C64052u8.A01(r0, r5, num, j);
            C18070vi.A0X(A002);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(longValue);
            A003 = A8I.A05(r5, instance, instance2);
            r2 = this.A02;
            i = 2131890084;
        } else {
            A002 = A00(num, j);
            A003 = A00(num, longValue);
            r2 = this.A02;
            i = 2131890083;
        }
        String A022 = r2.A02(i, A002, A003);
        C18070vi.A0X(A022);
        return A022;
    }

    public final String A00(Integer num, long j) {
        AnonymousClass11P r0 = this.A01;
        C18000vb r5 = this.A03;
        String A012 = C64052u8.A01(r0, r5, num, j);
        C18070vi.A0X(A012);
        String A002 = A8I.A00(r5, j);
        AnonymousClass118 r2 = this.A02;
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass3MY.A1V(A012, A002, A1b);
        String A022 = r2.A02(2131890080, A1b);
        C18070vi.A0X(A022);
        return A8I.A01(r5, A022, j);
    }

    public AnonymousClass4S4(AnonymousClass11P r1, AnonymousClass118 r2, C18000vb r3, C18030ve r4) {
        C18070vi.A0s(r1, r4, r2, r3);
        this.A01 = r1;
        this.A00 = r4;
        this.A02 = r2;
        this.A03 = r3;
    }
}
