package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass090;
import X.AnonymousClass0WA;
import X.AnonymousClass0XW;
import X.AnonymousClass1Y1;
import X.C02540Ek;
import X.C03380Hv;
import X.C05100Qk;
import X.C16370s9;
import X.C18070vi;
import X.C22821Di;

public final class BackgroundElement extends AnonymousClass0WA {
    public final long A00;
    public final C16370s9 A01;
    public final C22821Di A02;

    public /* synthetic */ BackgroundElement(C03380Hv r1, C16370s9 r2, C22821Di r3, AnonymousClass1Y1 r4, float f, long j) {
        this(r2, r3, j);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.0XW, X.090] */
    public /* bridge */ /* synthetic */ AnonymousClass0XW A01() {
        long j = this.A00;
        C16370s9 r1 = this.A01;
        ? r0 = new AnonymousClass0XW();
        r0.A00 = j;
        r0.A01 = r1;
        return r0;
    }

    public /* bridge */ /* synthetic */ void A02(AnonymousClass0XW r3) {
        AnonymousClass090 r32 = (AnonymousClass090) r3;
        r32.A00 = this.A00;
        r32.A01 = this.A01;
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null) {
            return false;
        }
        long j = this.A00;
        long j2 = backgroundElement.A00;
        C02540Ek r0 = C05100Qk.A06;
        if (j != j2 || !C18070vi.A18(this.A01, backgroundElement.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0B(AnonymousClass001.A0I(this.A00) * 31, 1.0f));
    }

    public BackgroundElement(C16370s9 r1, C22821Di r2, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = r2;
    }

    public /* synthetic */ BackgroundElement(C03380Hv r9, C16370s9 r10, C22821Di r11, AnonymousClass1Y1 r12, float f, int i, long j) {
        this((C03380Hv) null, r10, r11, (AnonymousClass1Y1) null, 1.0f, j);
    }
}
