package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass094;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;

public final class FillElement extends AnonymousClass0WA {
    public final float A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FillElement) {
                FillElement fillElement = (FillElement) obj;
                if (!(this.A01 == fillElement.A01 && this.A00 == fillElement.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.094] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        Integer num = this.A01;
        float f = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A01 = num;
        r0.A00 = f;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass094 r22 = (AnonymousClass094) r2;
        r22.A01 = this.A01;
        r22.A00 = this.A00;
    }

    public int hashCode() {
        String str;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 0:
                str = "Vertical";
                break;
            case 1:
                str = "Horizontal";
                break;
            default:
                str = "Both";
                break;
        }
        return AnonymousClass000.A0C((str.hashCode() + intValue) * 31, this.A00);
    }

    public FillElement(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }
}
