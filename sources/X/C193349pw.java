package X;

import java.util.List;

/* renamed from: X.9pw  reason: invalid class name and case insensitive filesystem */
public final class C193349pw {
    public final C195099sn A00;
    public final List A01;

    public C193349pw(C195099sn r2, List list) {
        C18070vi.A0d(r2, 2);
        this.A01 = list;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193349pw) {
                C193349pw r5 = (C193349pw) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArdGetModelMetadataParams(modelRequestMetadatas=");
        A10.append(this.A01);
        A10.append(", clientCapabilityMetadata=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
