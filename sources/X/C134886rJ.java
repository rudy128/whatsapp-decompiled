package X;

import java.util.List;

/* renamed from: X.6rJ  reason: invalid class name and case insensitive filesystem */
public final class C134886rJ {
    public final List A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134886rJ) {
                C134886rJ r5 = (C134886rJ) obj;
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

    public C134886rJ(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarCoinFlipGetProfilePhotoPosesEntity(poses=");
        A10.append(this.A01);
        A10.append(", backgrounds=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
