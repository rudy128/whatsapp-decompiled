package X;

import java.util.Map;

/* renamed from: X.0y4  reason: invalid class name and case insensitive filesystem */
public final class C19350y4 extends C19340y3 {
    public final C19130xi A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C19340y3)) {
                return false;
            }
            C19350y4 r4 = (C19350y4) ((C19340y3) obj);
            if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SchedulerConfig{clock=");
        sb.append(this.A00);
        sb.append(", values=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C19350y4(C19130xi r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public int hashCode() {
        return ((1000003 ^ this.A00.hashCode()) * 1000003) ^ this.A01.hashCode();
    }
}
