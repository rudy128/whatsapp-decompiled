package X;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.7JT  reason: invalid class name */
public final class AnonymousClass7JT implements AnonymousClass85Q {
    public final long A00;
    public final Uri A01;
    public final Bundle A02;
    public final C1405471x A03;
    public final AnonymousClass1D6 A04;
    public final AnonymousClass1D6 A05;
    public final boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7JT) {
                AnonymousClass7JT r8 = (AnonymousClass7JT) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A03, r8.A03) || this.A00 != r8.A00 || this.A06 != r8.A06 || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return AnonymousClass000.A0O(this.A04, AnonymousClass000.A0N(this.A05, (AnonymousClass0DV.A00(AnonymousClass001.A0K(j, (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A03)) * 31), this.A06) + C17880vN.A02(this.A02)) * 31));
    }

    public AnonymousClass7JT(Uri uri, Bundle bundle, C1405471x r3, AnonymousClass1D6 r4, AnonymousClass1D6 r5, long j, boolean z) {
        this.A01 = uri;
        this.A03 = r3;
        this.A00 = j;
        this.A06 = z;
        this.A02 = bundle;
        this.A05 = r4;
        this.A04 = r5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewCreatedResult(uri=");
        A10.append(this.A01);
        A10.append(", videoMeta=");
        A10.append(this.A03);
        A10.append(", videoFileLength=");
        A10.append(this.A00);
        A10.append(", shouldTranscode=");
        A10.append(this.A06);
        A10.append(", savedInstanceState=");
        A10.append(this.A02);
        A10.append(", videoEdges=");
        A10.append(this.A05);
        A10.append(", videoDesiredSize=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
