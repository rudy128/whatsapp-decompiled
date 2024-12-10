package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.List;

/* renamed from: X.9sE  reason: invalid class name and case insensitive filesystem */
public final class C194749sE {
    public final int A00;
    public final VersionedCapability A01;
    public final List A02;
    public final List A03;

    public C194749sE(VersionedCapability versionedCapability, List list, List list2, int i) {
        C18070vi.A0d(versionedCapability, 1);
        this.A01 = versionedCapability;
        this.A00 = i;
        this.A02 = list;
        this.A03 = list2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194749sE) {
                C194749sE r5 = (C194749sE) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A02, (AnonymousClass000.A0L(this.A01) + this.A00) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeMLModelMetadata(name=");
        A10.append(this.A01);
        A10.append(", version=");
        A10.append(this.A00);
        A10.append(", assets=");
        A10.append(this.A02);
        A10.append(", properties=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
