package X;

import android.content.Intent;

/* renamed from: X.1W0  reason: invalid class name */
public final class AnonymousClass1W0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1W0 r5 = (AnonymousClass1W0) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public double A00() {
        int i;
        int i2 = this.A02;
        if (i2 < 0 || (i = this.A03) <= 0) {
            return Double.NaN;
        }
        return (((double) i2) * 100.0d) / ((double) i);
    }

    public boolean A01() {
        int i = this.A01;
        if (i == 0 || i == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public boolean A03() {
        if (this.A00 != 1 || this.A02 > 0 || this.A03 > 0 || this.A01 != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + this.A02) * 31) + this.A01) * 31) + this.A03;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BatteryState{health=");
        int i = this.A00;
        switch (i) {
            case 1:
                str = "unknown";
                break;
            case 2:
                str = "good";
                break;
            case 3:
                str = "overheat";
                break;
            case 4:
                str = "dead";
                break;
            case 5:
                str = "over_voltage";
                break;
            case 6:
                str = "unspecified_failure";
                break;
            case 7:
                str = "cold";
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("other(");
                sb2.append(i);
                sb2.append(')');
                str = sb2.toString();
                break;
        }
        sb.append(str);
        sb.append(", level=");
        sb.append(this.A02);
        sb.append(", plugged=");
        sb.append(this.A01);
        sb.append(", scale=");
        sb.append(this.A03);
        sb.append(", percent=");
        sb.append(A00());
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass1W0(Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.A00 = intent.getIntExtra("health", 1);
            this.A02 = intent.getIntExtra("level", -1);
            this.A01 = intent.getIntExtra("plugged", 0);
            this.A03 = intent.getIntExtra("scale", -1);
            return;
        }
        throw new IllegalArgumentException("Intent must be android.intent.action.BATTERY_CHANGED");
    }

    public boolean A02() {
        double A002 = A00();
        if (A01() || A03()) {
            return true;
        }
        if (A002 == Double.NaN || A002 <= 20.0d) {
            return false;
        }
        return true;
    }

    public AnonymousClass1W0() {
        this.A00 = 1;
        this.A02 = 0;
        this.A01 = Integer.MIN_VALUE;
        this.A03 = 0;
    }
}
