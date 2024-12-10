package X;

import java.util.Set;

/* renamed from: X.4rY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98684rY implements Runnable {
    public final /* synthetic */ AnonymousClass5YU A00;
    public final /* synthetic */ C107835ah A01;
    public final /* synthetic */ AnonymousClass1KB A02;
    public final /* synthetic */ C33251iW A03;
    public final /* synthetic */ C18000vb A04;
    public final /* synthetic */ C18030ve A05;
    public final /* synthetic */ AnonymousClass18K A06;
    public final /* synthetic */ C25241Nl A07;
    public final /* synthetic */ C62242r5 A08;
    public final /* synthetic */ Set A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public final void run() {
        boolean z;
        AnonymousClass18K r10 = this.A06;
        C62242r5 r2 = this.A08;
        C25241Nl r1 = this.A07;
        Set set = this.A09;
        boolean z2 = this.A0A;
        AnonymousClass5YU r11 = this.A00;
        AnonymousClass1KB r7 = this.A02;
        C33251iW r4 = this.A03;
        boolean z3 = this.A0B;
        C18000vb r8 = this.A04;
        C107835ah r6 = this.A01;
        C88224Yu.A02(r10, r1, r2, set, 0);
        if (!z2 || r11 == null) {
            z = false;
        } else {
            z = true;
            if (set.size() > 999) {
                r7.A09(2131896160, 1);
                return;
            }
        }
        r4.A0o(set, z3, z);
        if (z) {
            r7.A0J(new C70713Cf(r11, set, 23));
        } else {
            AnonymousClass206 A0Y = C17880vN.A0Y(set.iterator());
            if (set.size() != 1 || A0Y == null || !A0Y.A11(16777216)) {
                long size = (long) set.size();
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, set.size(), 0);
                r7.A0H(r8.A0K(objArr, 2131755234, size), 0);
            }
        }
        r6.getClass();
        r7.A0J(new C27080DTf((Object) r6, 49));
    }

    public /* synthetic */ C98684rY(AnonymousClass5YU r1, C107835ah r2, AnonymousClass1KB r3, C33251iW r4, C18000vb r5, C18030ve r6, AnonymousClass18K r7, C25241Nl r8, C62242r5 r9, Set set, boolean z, boolean z2) {
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A09 = set;
        this.A0A = z;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0B = z2;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }
}
