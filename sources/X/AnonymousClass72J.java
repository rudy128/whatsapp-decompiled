package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72J  reason: invalid class name */
public final class AnonymousClass72J {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass6J9 A03;
    public final AnonymousClass6JC A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass72J) {
                AnonymousClass72J r5 = (AnonymousClass72J) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || this.A02 != r5.A02 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || this.A08 != r5.A08 || this.A01 != r5.A01 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A05, AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A07, AnonymousClass000.A0N(this.A06, AnonymousClass000.A0L(this.A04))), this.A02)) + AnonymousClass001.A0k(this.A03)) * 31, this.A08), this.A01), this.A00);
    }

    public AnonymousClass72J(AnonymousClass6J9 r2, AnonymousClass6JC r3, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4) {
        C18070vi.A0k(list, list2);
        C18070vi.A0d(list3, 5);
        this.A04 = r3;
        this.A06 = list;
        this.A07 = list2;
        this.A02 = z;
        this.A05 = list3;
        this.A03 = r2;
        this.A08 = z2;
        this.A01 = z3;
        this.A00 = z4;
    }

    public static final List A00(List list) {
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6JB r1 = (AnonymousClass6JB) it.next();
            AnonymousClass1E7 A052 = r1.A00.A05();
            if (A052 == null) {
                A052 = r1.A00;
            }
            C18070vi.A0b(A052);
            C63372sx r5 = r1.A01;
            AnonymousClass206 r7 = r1.A04;
            CharSequence charSequence = r1.A05;
            boolean z = r1.A06;
            boolean z2 = r1.A07;
            AnonymousClass206 r8 = r1.A03;
            AnonymousClass206 r9 = r1.A02;
            C18070vi.A0n(r5, A052, r7);
            A0D.add(new AnonymousClass6JB(r5, A052, r7, r8, r9, charSequence, z, z2));
        }
        return A0D;
    }

    public static final boolean A01(AnonymousClass1E7 r4, List list) {
        Object obj;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
        } while (!C18070vi.A18(((AnonymousClass6JB) obj).A00.A0J, r4.A0J));
        AnonymousClass6JB r2 = (AnonymousClass6JB) obj;
        if (r2 == null) {
            return false;
        }
        r2.A00 = r4;
        return true;
    }

    public final ArrayList A02() {
        ArrayList A13 = AnonymousClass000.A13();
        boolean z = this.A08;
        if (!z) {
            A13.add(this.A04);
        }
        A13.addAll(this.A06);
        A13.addAll(this.A07);
        if (z) {
            A13.addAll(this.A05);
        } else {
            AnonymousClass6J9 r0 = this.A03;
            if (r0 != null) {
                A13.add(r0);
                return A13;
            }
        }
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StatusListUpdates(myStatus=");
        A10.append(this.A04);
        A10.append(", newUpdates=");
        A10.append(this.A06);
        A10.append(", viewedUpdates=");
        A10.append(this.A07);
        A10.append(", viewedStatusesExpanded=");
        A10.append(this.A02);
        A10.append(", mutedStatuses=");
        A10.append(this.A05);
        A10.append(", mutedStatusesEntrypoint=");
        A10.append(this.A03);
        A10.append(", inSearchMode=");
        A10.append(this.A08);
        A10.append(", mutedStatusesExpanded=");
        A10.append(this.A01);
        A10.append(", isPreviewListExpanded=");
        return C17900vP.A0F(A10, this.A00);
    }
}
