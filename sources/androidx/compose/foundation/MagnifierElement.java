package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09V;
import X.AnonymousClass0WA;
import X.AnonymousClass1Y1;
import X.C17070th;
import X.C18070vi;
import X.C22821Di;
import X.C26200CuV;

public final class MagnifierElement extends AnonymousClass0WA {
    public final long A00;
    public final C17070th A01;
    public final C22821Di A02;
    public final C22821Di A03;

    public /* synthetic */ MagnifierElement(C17070th r7, C22821Di r8, C22821Di r9, C22821Di r10, AnonymousClass1Y1 r11, float f, float f2, float f3, long j, boolean z, boolean z2) {
        this(r7, r8, r10, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MagnifierElement) {
            C18070vi.A18(this.A03, ((MagnifierElement) obj).A03);
        }
        return false;
    }

    /* renamed from: A03 */
    public AnonymousClass09V A01() {
        C22821Di r2 = this.A03;
        long j = this.A00;
        return new AnonymousClass09V(this.A01, r2, (C22821Di) null, this.A02, (AnonymousClass1Y1) null, Float.NaN, Float.NaN, Float.NaN, j, true, true);
    }

    /* renamed from: A04 */
    public void A02(AnonymousClass09V r7) {
        C22821Di r2 = this.A03;
        long j = this.A00;
        AnonymousClass09V r0 = r7;
        r0.A0N(this.A01, r2, this.A02, j);
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(Float.NaN);
        int A0L = ((((AnonymousClass000.A0L(this.A03) * 31) + floatToIntBits) * 31) + 1231) * 31;
        long j = this.A00;
        long j2 = C26200CuV.A02;
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, (((((AnonymousClass001.A0K(j, A0L) + floatToIntBits) * 31) + floatToIntBits) * 31) + 1231) * 31));
    }

    public MagnifierElement(C17070th r1, C22821Di r2, C22821Di r3, long j) {
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = j;
        this.A01 = r1;
    }
}
