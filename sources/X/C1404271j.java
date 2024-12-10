package X;

import android.app.Activity;

/* renamed from: X.71j  reason: invalid class name and case insensitive filesystem */
public final class C1404271j {
    public static final C131176kd A08 = new Object();
    public final AnonymousClass194 A00;
    public final AnonymousClass1DM A01;
    public final AnonymousClass1NP A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass1LU A06;
    public final AnonymousClass00H A07;

    public final C010105w A01(Activity activity, C40751vD r19) {
        Activity activity2 = activity;
        C40751vD r7 = r19;
        int A17 = C18070vi.A17(activity2, r7);
        AnonymousClass1DM r1 = this.A01;
        int time = ((int) ((r1.A00.A00().getTime() - AnonymousClass11P.A01(r1.A01)) / 86400000)) + 1;
        long j = (long) time;
        A00(this, (Integer) null, 0, j, this.A00.A00().getTime());
        C73203Rj A002 = AnonymousClass4a6.A00(activity2);
        A002.A0E(2131896249);
        C18000vb r2 = this.A03;
        Object[] objArr = new Object[A17];
        C17880vN.A1T(objArr, time, 0);
        A002.A0S(r2.A0K(objArr, 2131755398, j));
        A002.A0Z(new AnonymousClass754(activity2, this, r7, time, 0), 2131897387);
        A002.A0X(new C88864ax(activity2, time, 0, this), 2131898766);
        return AnonymousClass3MY.A0L(A002);
    }

    public static final void A00(C1404271j r3, Integer num, int i, long j, long j2) {
        if (C18020vd.A05(C18040vf.A02, r3.A04, 3299)) {
            AnonymousClass63G r1 = new AnonymousClass63G();
            r1.A02 = AnonymousClass3MY.A0f();
            if (i != 0) {
                r1.A01 = num;
            }
            r1.A00 = Integer.valueOf(i);
            r1.A04 = Long.valueOf(j);
            r1.A03 = Long.valueOf(j2);
            r3.A05.CC4(r1);
        }
    }

    public C1404271j(AnonymousClass194 r1, AnonymousClass1DM r2, AnonymousClass1NP r3, C18000vb r4, C18030ve r5, AnonymousClass18K r6, AnonymousClass1LU r7, AnonymousClass00H r8) {
        C18070vi.A0w(r5, r7, r1, r6, r4);
        C18070vi.A0q(r3, r8, r2);
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
    }
}
