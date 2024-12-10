package X;

import android.text.format.Time;
import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8GR  reason: invalid class name */
public final class AnonymousClass8GR extends AnonymousClass1J2 {
    public AnonymousClass1E7 A00;
    public Integer A01 = AnonymousClass00R.A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final C34511kb A05;
    public final AnonymousClass1M9 A06;
    public final C24921Me A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1CJ A09;
    public final C195899u7 A0A;
    public final AnonymousClass1MZ A0B;
    public final AnonymousClass18K A0C;
    public final C187279fY A0D;
    public final AnonymousClass1EC A0E;
    public final C41731wy A0F = AnonymousClass3MW.A0o();
    public final C41731wy A0G = AnonymousClass3MW.A0o();
    public final C41731wy A0H = AnonymousClass3MW.A0o();
    public final C41731wy A0I = AnonymousClass3MW.A0o();
    public final AnonymousClass10I A0J;
    public final List A0K = AnonymousClass000.A13();

    public static final void A00(AUA aua, AnonymousClass8GR r6, boolean z) {
        C171098rA r2 = new C171098rA();
        C179639It r0 = aua.A03;
        if (r0 != null) {
            int ordinal = r0.ordinal();
            int i = 5;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = 6;
                } else {
                    return;
                }
            }
            r2.A01 = Integer.valueOf(i);
            r2.A03 = C108945cZ.A1B(AnonymousClass11P.A01(r6.A08), aua.A01);
            r2.A02 = C17880vN.A0n(aua.A00);
            r2.A00 = Boolean.valueOf(z);
            AnonymousClass1EC r1 = r6.A0E;
            C36321nh r02 = GroupJid.Companion;
            if (C36321nh.A02(r1.user)) {
                r2.A04 = r1.getRawString();
            }
            r6.A0C.CC7(r2);
        }
    }

    public static final void A03(AnonymousClass8GR r14, Integer num) {
        AnonymousClass1DT r1;
        int i;
        boolean z;
        int i2;
        Object[] objArr;
        r14.A01 = num;
        AnonymousClass1E7 r0 = r14.A00;
        if (r0 == null || !r0.A12) {
            r1 = r14.A03;
            i = 2131890893;
        } else {
            List<AUA> list = r14.A0K;
            if (list.isEmpty()) {
                r1 = r14.A03;
                i = 2131891121;
            } else {
                if (num.intValue() != 1) {
                    ArrayList A13 = AnonymousClass000.A13();
                    A13.add(AUB.A00);
                    Time time = new Time();
                    Integer num2 = null;
                    for (AUA aua : list) {
                        long j = aua.A05.A00;
                        time.set(j);
                        int i3 = (int) ((j + (time.gmtoff * 1000)) / 86400000);
                        if (num2 != null) {
                            if (num2.intValue() != i3) {
                                A13.add(AUC.A00);
                            } else {
                                A13.add(aua);
                                num2 = Integer.valueOf(i3);
                            }
                        }
                        A13.add(new AU7(j));
                        A13.add(aua);
                        num2 = Integer.valueOf(i3);
                    }
                    r14.A02.A0E(A13);
                } else {
                    ArrayList A132 = AnonymousClass000.A13();
                    ArrayList A133 = AnonymousClass000.A13();
                    ArrayList A134 = AnonymousClass000.A13();
                    ArrayList A135 = AnonymousClass000.A13();
                    ArrayList A136 = AnonymousClass000.A13();
                    AnonymousClass1EC A052 = r14.A05.A05(r14.A0E);
                    String A0F2 = r14.A09.A0F(A052);
                    for (AUA aua2 : list) {
                        C195349tC r3 = aua2.A05;
                        String str = r3.A05;
                        if (C18070vi.A18(str, "non_admin_add")) {
                            A135.add(aua2);
                        } else if (aua2.A07.A0B()) {
                            A132.add(aua2);
                        } else if (C18070vi.A18(str, "linked_group_join")) {
                            AnonymousClass1EC r02 = r3.A02;
                            if (r02 == null || C18070vi.A18(A052, r02)) {
                                A133.add(aua2);
                            } else {
                                A134.add(aua2);
                            }
                        } else {
                            A136.add(aua2);
                        }
                    }
                    ArrayList A137 = AnonymousClass000.A13();
                    A04(A137, A132, new Object[0], 2131891079);
                    A04(A137, A135, new Object[0], 2131891076);
                    if (A0F2 == null || A0F2.length() <= 0) {
                        i2 = 2131891078;
                        objArr = new Object[0];
                    } else {
                        i2 = 2131891077;
                        objArr = new Object[]{A0F2};
                    }
                    A04(A137, A133, objArr, i2);
                    A04(A137, A134, new Object[0], 2131891081);
                    A04(A137, A136, new Object[0], 2131891080);
                    AnonymousClass1DT r6 = r14.A02;
                    ArrayList A138 = AnonymousClass000.A13();
                    A138.add(AUB.A00);
                    Iterator it = A137.iterator();
                    boolean z2 = true;
                    while (it.hasNext()) {
                        C193829qj r2 = (C193829qj) it.next();
                        List list2 = r2.A01;
                        if (AnonymousClass000.A1a(list2)) {
                            if (!z2) {
                                A138.add(AUC.A00);
                            }
                            A138.add(r2.A00);
                            A138.addAll(list2);
                            z2 = false;
                        }
                    }
                    r6.A0E(A138);
                }
                r1 = r14.A0I;
                z = true;
                r1.A0E(z);
            }
        }
        z = Integer.valueOf(i);
        r1.A0E(z);
    }

    public static void A04(AbstractCollection abstractCollection, List list, Object[] objArr, int i) {
        abstractCollection.add(new C193829qj(new AU8(objArr, i), list));
    }

    public AnonymousClass8GR(C34511kb r4, AnonymousClass1M9 r5, C24921Me r6, AnonymousClass11P r7, AnonymousClass1CJ r8, C195899u7 r9, AnonymousClass1MZ r10, AnonymousClass18K r11, C187279fY r12, AnonymousClass1EC r13, AnonymousClass10I r14) {
        C18070vi.A0p(r7, r14, r8);
        C18070vi.A0d(r11, 5);
        C18070vi.A0x(r5, r4, r6, r10, r9);
        this.A0E = r13;
        this.A08 = r7;
        this.A0J = r14;
        this.A09 = r8;
        this.A0C = r11;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
        this.A0B = r10;
        this.A0A = r9;
        this.A0D = r12;
        AnonymousClass3MY.A1U(this.A0J, this, 27);
        C171098rA r2 = new C171098rA();
        r2.A01 = C17880vN.A0i();
        r2.A00 = AnonymousClass000.A0i();
        r2.A03 = C17890vO.A0L();
        C36321nh r0 = GroupJid.Companion;
        AnonymousClass1EC r1 = this.A0E;
        if (C36321nh.A02(r1.user)) {
            r2.A04 = r1.getRawString();
        }
        this.A0C.CC7(r2);
    }
}
