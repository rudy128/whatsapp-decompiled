package X;

/* renamed from: X.9rD  reason: invalid class name and case insensitive filesystem */
public final class C194129rD {
    public final int A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194129rD) {
                C194129rD r5 = (C194129rD) obj;
                if (!("com.facebook.katana".equals("com.facebook.katana") && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C194129rD(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(674642223, this.A01) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FacebookAppInfo(packageName=");
        A10.append("com.facebook.katana");
        A10.append(", isInstalled=");
        A10.append(this.A01);
        A10.append(", versionCode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
