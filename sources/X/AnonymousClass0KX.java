package X;

import java.util.List;

/* renamed from: X.0KX  reason: invalid class name */
public final class AnonymousClass0KX {
    public long A00 = AnonymousClass0QY.A03;
    public AnonymousClass0HS A01;
    public List A02;
    public final float A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final List A00() {
        List list = this.A02;
        if (list == null) {
            return AnonymousClass1ZU.A09();
        }
        return list;
    }

    public final void A01() {
        AnonymousClass0HS r1 = this.A01;
        r1.A00 = true;
        r1.A01 = true;
    }

    public final boolean A02() {
        AnonymousClass0HS r1 = this.A01;
        if (r1.A00 || r1.A01) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.0HS, java.lang.Object] */
    public AnonymousClass0KX(float f, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A05 = j;
        this.A0A = j2;
        this.A06 = j3;
        this.A0B = z;
        this.A03 = f;
        this.A08 = j4;
        this.A07 = j5;
        this.A0C = z2;
        this.A04 = i;
        this.A09 = j6;
        ? obj = new Object();
        boolean z4 = z3;
        obj.A01 = z4;
        obj.A00 = z4;
        this.A01 = obj;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PointerInputChange(id=");
        long j = this.A05;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("PointerId(value=");
        A102.append(j);
        A10.append(AnonymousClass001.A1J(A102));
        A10.append(", uptimeMillis=");
        A10.append(this.A0A);
        A10.append(", position=");
        A10.append(AnonymousClass0QY.A06(this.A06));
        A10.append(", pressed=");
        A10.append(this.A0B);
        A10.append(", pressure=");
        A10.append(this.A03);
        A10.append(", previousUptimeMillis=");
        A10.append(this.A08);
        A10.append(", previousPosition=");
        A10.append(AnonymousClass0QY.A06(this.A07));
        A10.append(", previousPressed=");
        A10.append(this.A0C);
        A10.append(", isConsumed=");
        A10.append(A02());
        A10.append(", type=");
        int i = this.A04;
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
        A10.append(", historical=");
        A10.append(A00());
        A10.append(",scrollDelta=");
        return AnonymousClass001.A1F(AnonymousClass0QY.A06(this.A09), A10);
    }
}
