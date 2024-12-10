package X;

import java.util.Set;

/* renamed from: X.6zh  reason: invalid class name and case insensitive filesystem */
public final class C139946zh {
    public final String A00;
    public final Set A01;
    public final Set A02;
    public final Set A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139946zh) {
                C139946zh r5 = (C139946zh) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A01))) + C17900vP.A00(this.A00);
    }

    public C139946zh(String str, Set set, Set set2, Set set3) {
        this.A01 = set;
        this.A03 = set2;
        this.A02 = set3;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PackageNameMatchingResult(allPackageNames=");
        A10.append(this.A01);
        A10.append(", packageNamesWithOtpRequest=");
        A10.append(this.A03);
        A10.append(", packageNamesWithActiveOtpRequest=");
        A10.append(this.A02);
        A10.append(", matchedPackageName=");
        return C17900vP.A0B(this.A00, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C139946zh() {
        /*
            r2 = this;
            r1 = 0
            X.1Om r0 = X.C25511Om.A00
            r2.<init>(r1, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139946zh.<init>():void");
    }
}
