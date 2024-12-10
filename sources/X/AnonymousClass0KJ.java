package X;

import java.util.List;

/* renamed from: X.0KJ  reason: invalid class name */
public final class AnonymousClass0KJ {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0KJ) {
                AnonymousClass0KJ r9 = (AnonymousClass0KJ) obj;
                if (this.A02 == r9.A02 && this.A07 == r9.A07) {
                    long j = this.A05;
                    long j2 = r9.A05;
                    long j3 = AnonymousClass0QY.A03;
                    if (!(j == j2 && this.A04 == r9.A04 && this.A09 == r9.A09 && Float.compare(this.A00, r9.A00) == 0 && this.A01 == r9.A01 && this.A0A == r9.A0A && C18070vi.A18(this.A08, r9.A08) && this.A06 == r9.A06 && this.A03 == r9.A03)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0K = AnonymousClass001.A0K(this.A07, AnonymousClass000.A0I(this.A02) * 31);
        long j = this.A05;
        long j2 = AnonymousClass0QY.A03;
        return AnonymousClass001.A0J(this.A03, AnonymousClass001.A0K(this.A06, AnonymousClass000.A0N(this.A08, AnonymousClass0DV.A00((AnonymousClass000.A0B(AnonymousClass0DV.A00(AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(j, A0K)), this.A09), this.A00) + this.A01) * 31, this.A0A))));
    }

    public AnonymousClass0KJ(List list, float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        this.A02 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A09 = z;
        this.A00 = f;
        this.A01 = i;
        this.A0A = z2;
        this.A08 = list;
        this.A06 = j5;
        this.A03 = j6;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PointerInputEventData(id=");
        long j = this.A02;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("PointerId(value=");
        A102.append(j);
        A10.append(AnonymousClass001.A1J(A102));
        A10.append(", uptime=");
        A10.append(this.A07);
        A10.append(", positionOnScreen=");
        A10.append(AnonymousClass0QY.A06(this.A05));
        A10.append(", position=");
        A10.append(AnonymousClass0QY.A06(this.A04));
        A10.append(", down=");
        A10.append(this.A09);
        A10.append(", pressure=");
        A10.append(this.A00);
        A10.append(", type=");
        int i = this.A01;
        if (i == 1) {
            str = "Touch";
        } else if (i == 2) {
            str = "Mouse";
        } else if (i == 3) {
            str = "Stylus";
        } else if (i != 4) {
            str = "Unknown";
        } else {
            str = "Eraser";
        }
        A10.append(str);
        A10.append(", issuesEnterExit=");
        A10.append(this.A0A);
        A10.append(", historical=");
        A10.append(this.A08);
        A10.append(", scrollDelta=");
        A10.append(AnonymousClass0QY.A06(this.A06));
        A10.append(", originalEventPosition=");
        return AnonymousClass001.A1F(AnonymousClass0QY.A06(this.A03), A10);
    }
}
