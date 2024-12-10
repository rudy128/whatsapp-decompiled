package X;

import android.os.Build;
import android.view.DisplayCutout;

public final class Cn4 {
    public final DisplayCutout A00;

    public static Cn4 A00(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new Cn4(displayCutout);
    }

    public int A01() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C26055CrQ.A00(this.A00);
        }
        return 0;
    }

    public int A02() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C26055CrQ.A01(this.A00);
        }
        return 0;
    }

    public int A03() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C26055CrQ.A02(this.A00);
        }
        return 0;
    }

    public int A04() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C26055CrQ.A03(this.A00);
        }
        return 0;
    }

    public C33321id A05() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C33321id.A01(C7N.A00(this.A00));
        }
        return C33321id.A04;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass026.A00(this.A00, ((Cn4) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Cn4(DisplayCutout displayCutout) {
        this.A00 = displayCutout;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisplayCutoutCompat{");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
