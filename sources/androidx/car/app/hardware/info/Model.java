package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass026;
import androidx.car.app.hardware.common.CarValue;

public final class Model {
    public final CarValue mManufacturer;
    public final CarValue mName;
    public final CarValue mYear = CarValue.A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return AnonymousClass026.A00(this.mName, model.mName) && AnonymousClass026.A00(this.mYear, model.mYear) && AnonymousClass026.A00(this.mManufacturer, model.mManufacturer);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mYear;
        return AnonymousClass000.A0P(this.mManufacturer, objArr, 2);
    }

    public Model() {
        CarValue carValue = CarValue.A07;
        this.mName = carValue;
        this.mManufacturer = carValue;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ name: ");
        A10.append(this.mName);
        A10.append(", year: ");
        A10.append(this.mYear);
        A10.append(", manufacturer: ");
        return AnonymousClass001.A1G(this.mManufacturer, A10);
    }
}
