package X;

/* renamed from: X.BTd  reason: case insensitive filesystem */
public final class C22869BTd extends C3J {
    public final boolean A00;
    public final C24337BzY A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22869BTd) {
                C22869BTd bTd = (C22869BTd) obj;
                if (!(this.A00 == bTd.A00 && this.A01 == bTd.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, (AnonymousClass3MX.A03(this.A00) + 1237) * 31);
    }

    public C22869BTd(C24337BzY bzY, boolean z) {
        this.A00 = z;
        this.A01 = bzY;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkedAppConfig(enableFBPermissionService=");
        A10.append(this.A00);
        C108975cc.A15(A10, ", elevateLogLevel=");
        A10.append(", transportType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }

    public C22869BTd() {
        this(C24337BzY.BLE, false);
    }
}
