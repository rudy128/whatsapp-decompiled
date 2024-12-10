package X;

import android.os.Build;
import java.util.Set;

/* renamed from: X.A6e  reason: case insensitive filesystem */
public final class C20078A6e {
    public static final C20078A6e A08 = new C20078A6e(AnonymousClass00R.A00);
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final long A05;
    public final long A06;
    public final Set A07;

    public final boolean A03() {
        if (Build.VERSION.SDK_INT < 24 || C108945cZ.A1U(this.A07)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        C20078A6e a6e = (C20078A6e) obj;
        if (this.A02 == a6e.A02 && this.A03 == a6e.A03 && this.A01 == a6e.A01 && this.A04 == a6e.A04 && this.A06 == a6e.A06 && this.A05 == a6e.A05 && this.A00 == a6e.A00) {
            return C18070vi.A18(this.A07, a6e.A07);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.A00;
        long j = this.A06;
        long j2 = this.A05;
        return AnonymousClass000.A0O(this.A07, ((((((((((((C72453Mb.A0E(num, AnonymousClass9OD.A00(num)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public C20078A6e(C20078A6e a6e) {
        this.A02 = a6e.A02;
        this.A03 = a6e.A03;
        this.A00 = a6e.A00;
        this.A01 = a6e.A01;
        this.A04 = a6e.A04;
        this.A07 = a6e.A07;
        this.A06 = a6e.A06;
        this.A05 = a6e.A05;
    }

    public final long A00() {
        return this.A05;
    }

    public final long A01() {
        return this.A06;
    }

    public final Set A02() {
        return this.A07;
    }

    public final boolean A04() {
        return this.A03;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Constraints{requiredNetworkType=");
        Integer num = this.A00;
        if (num != null) {
            str = AnonymousClass9OD.A00(num);
        } else {
            str = "null";
        }
        A10.append(str);
        A10.append(", requiresCharging=");
        A10.append(this.A02);
        A10.append(", requiresDeviceIdle=");
        A10.append(this.A03);
        A10.append(", requiresBatteryNotLow=");
        A10.append(this.A01);
        A10.append(", requiresStorageNotLow=");
        A10.append(this.A04);
        A10.append(", contentTriggerUpdateDelayMillis=");
        A10.append(this.A06);
        A10.append(", contentTriggerMaxDelayMillis=");
        A10.append(this.A05);
        A10.append(", contentUriTriggers=");
        A10.append(this.A07);
        return AnonymousClass000.A0y(", }", A10);
    }

    public C20078A6e(Integer num, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        C108965cb.A1P(num, 1, set);
        this.A00 = num;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A04 = z4;
        this.A06 = j;
        this.A05 = j2;
        this.A07 = set;
    }

    public C20078A6e(Integer num) {
        this(num, C25511Om.A00, -1, -1, false, false, false, false);
    }
}
