package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass097;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.AnonymousClass1Y1;
import X.C22821Di;

public final class PaddingElement extends AnonymousClass0WA {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final C22821Di A04;

    public /* synthetic */ PaddingElement(C22821Di r7, AnonymousClass1Y1 r8, float f, float f2, float f3, float f4, boolean z) {
        this(r7, f, f2, f3, f4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.097] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        float f = this.A02;
        float f2 = this.A03;
        float f3 = this.A01;
        float f4 = this.A00;
        ? r0 = new AnonymousClass0XW();
        r0.A02 = f;
        r0.A03 = f2;
        r0.A01 = f3;
        r0.A00 = f4;
        r0.A04 = true;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass097 r22 = (AnonymousClass097) r2;
        r22.A02 = this.A02;
        r22.A03 = this.A03;
        r22.A01 = this.A01;
        r22.A00 = this.A00;
        r22.A04 = true;
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement == null || !AnonymousClass000.A1P(Float.compare(this.A02, paddingElement.A02)) || !AnonymousClass000.A1P(Float.compare(this.A03, paddingElement.A03)) || !AnonymousClass000.A1P(Float.compare(this.A01, paddingElement.A01)) || !AnonymousClass000.A1P(Float.compare(this.A00, paddingElement.A00))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A02), this.A03), this.A01), this.A00) + 1231;
    }

    public PaddingElement(C22821Di r3, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = r3;
        if ((f < 0.0f && !AnonymousClass000.A1P(Float.compare(f, Float.NaN))) || ((f2 < 0.0f && !AnonymousClass000.A1P(Float.compare(f2, Float.NaN))) || ((f3 < 0.0f && !AnonymousClass000.A1P(Float.compare(f3, Float.NaN))) || (f4 < 0.0f && !AnonymousClass000.A1P(Float.compare(f4, Float.NaN)))))) {
            throw AnonymousClass000.A0k("Padding must be non-negative");
        }
    }
}
