package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass095;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;

public final class UnspecifiedConstraintsElement extends AnonymousClass0WA {
    public final float A00;
    public final float A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.095] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        float f = this.A01;
        float f2 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A01 = f;
        r0.A00 = f2;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass095 r22 = (AnonymousClass095) r2;
        r22.A01 = this.A01;
        r22.A00 = this.A00;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        if (!AnonymousClass000.A1P(Float.compare(this.A01, unspecifiedConstraintsElement.A01)) || !AnonymousClass000.A1P(Float.compare(this.A00, unspecifiedConstraintsElement.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A01), this.A00);
    }

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
