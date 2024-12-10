package androidx.compose.foundation.layout;

import X.AnonymousClass000;
import X.AnonymousClass09C;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.AnonymousClass1Y1;
import X.C22821Di;

public final class SizeElement extends AnonymousClass0WA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;
    public final C22821Di A05;

    public /* synthetic */ SizeElement(C22821Di r8, AnonymousClass1Y1 r9, float f, float f2, float f3, float f4, boolean z) {
        this(r8, f, f2, f3, f4, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SizeElement) {
                SizeElement sizeElement = (SizeElement) obj;
                if (!AnonymousClass000.A1P(Float.compare(this.A03, sizeElement.A03)) || !AnonymousClass000.A1P(Float.compare(this.A02, sizeElement.A02)) || !AnonymousClass000.A1P(Float.compare(this.A01, sizeElement.A01)) || !AnonymousClass000.A1P(Float.compare(this.A00, sizeElement.A00)) || this.A04 != sizeElement.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.09C] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        float f = this.A03;
        float f2 = this.A02;
        float f3 = this.A01;
        float f4 = this.A00;
        boolean z = this.A04;
        ? r0 = new AnonymousClass0XW();
        r0.A03 = f;
        r0.A02 = f2;
        r0.A01 = f3;
        r0.A00 = f4;
        r0.A04 = z;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r2) {
        AnonymousClass09C r22 = (AnonymousClass09C) r2;
        r22.A03 = this.A03;
        r22.A02 = this.A02;
        r22.A01 = this.A01;
        r22.A00 = this.A00;
        r22.A04 = this.A04;
    }

    public int hashCode() {
        int A0B = AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A03), this.A02), this.A01), this.A00);
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return A0B + i;
    }

    public SizeElement(C22821Di r1, float f, float f2, float f3, float f4, boolean z) {
        this.A03 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A00 = f4;
        this.A04 = z;
        this.A05 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeElement(C22821Di r9, float f, float f2, float f3, float f4, int i) {
        this(r9, (AnonymousClass1Y1) null, (i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }
}
