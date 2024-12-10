package X;

import java.util.List;

/* renamed from: X.7N2  reason: invalid class name */
public final class AnonymousClass7N2 implements AnonymousClass88J {
    public final boolean A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7N2) {
                AnonymousClass7N2 r5 = (AnonymousClass7N2) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void BFb(C126676d7 r4) {
        List list;
        boolean z = this.A01;
        if (z) {
            r4.A00.A02.addAll(C18070vi.A0M(C122666Rg.STOP));
        }
        if (this.A00) {
            List A0M = C18070vi.A0M(C122666Rg.BLOCK);
            C129866iV r0 = r4.A00;
            if (z) {
                list = r0.A03;
            } else {
                list = r0.A02;
            }
            list.addAll(A0M);
        }
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass3MX.A03(this.A01), this.A00);
    }

    public AnonymousClass7N2(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserControlNotInterestedBehaviour(shouldShowStopInNotInterestedLevel=");
        A10.append(this.A01);
        A10.append(", shouldShowBlockAction=");
        return C17900vP.A0F(A10, this.A00);
    }

    public AnonymousClass7N2() {
        this(false, false);
    }
}
