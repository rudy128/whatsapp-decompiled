package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.core.graphics.drawable.IconCompat;

public final class CarIcon {
    public static final CarIcon A00;
    public static final CarIcon A01;
    public static final CarIcon A02;
    public static final CarIcon A03;
    public static final CarIcon A04;
    public final IconCompat mIcon;
    public final CarColor mTint;
    public final int mType;

    public CarIcon(CarColor carColor, int i) {
        this.mType = i;
        this.mIcon = null;
        this.mTint = carColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        return this.mType == carIcon.mType && AnonymousClass026.A00(this.mTint, carIcon.mTint) && A01(carIcon.mIcon);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.mType);
        objArr[1] = this.mTint;
        return AnonymousClass000.A0P(A00(), objArr, 2);
    }

    static {
        CarColor carColor = CarColor.A00;
        A01 = new CarIcon(carColor, 5);
        A02 = new CarIcon(carColor, 3);
        A00 = new CarIcon(carColor, 4);
        A03 = new CarIcon(carColor, 6);
        A04 = new CarIcon(carColor, 7);
    }

    private Object A00() {
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            return null;
        }
        int A06 = iconCompat.A06();
        if (A06 == 2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.mIcon.A0E());
            A10.append(this.mIcon.A05());
            return A10.toString();
        } else if (A06 == 4) {
            return this.mIcon.A0B();
        } else {
            return Integer.valueOf(A06);
        }
    }

    private boolean A01(IconCompat iconCompat) {
        int A06;
        IconCompat iconCompat2 = this.mIcon;
        if (iconCompat2 == null) {
            if (iconCompat == null) {
                return true;
            }
            return false;
        } else if (iconCompat == null || (A06 = iconCompat2.A06()) != iconCompat.A06()) {
            return false;
        } else {
            if (A06 == 2) {
                if (!AnonymousClass026.A00(this.mIcon.A0E(), iconCompat.A0E()) || this.mIcon.A05() != iconCompat.A05()) {
                    return false;
                }
                return true;
            } else if (A06 == 4) {
                return AnonymousClass026.A00(this.mIcon.A0B(), iconCompat.A0B());
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[type: ");
        int i = this.mType;
        if (i == 1) {
            str = "CUSTOM";
        } else if (i == 3) {
            str = "BACK";
        } else if (i == 4) {
            str = "ALERT";
        } else if (i == 5) {
            str = "APP";
        } else if (i == 6) {
            str = "ERROR";
        } else if (i != 7) {
            str = "<unknown>";
        } else {
            str = "PAN";
        }
        A10.append(str);
        A10.append(", tint: ");
        return AnonymousClass001.A1G(this.mTint, A10);
    }

    public CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }
}
