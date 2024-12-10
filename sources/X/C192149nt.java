package X;

import android.net.Uri;

/* renamed from: X.9nt  reason: invalid class name and case insensitive filesystem */
public final class C192149nt {
    public final Uri A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (C18070vi.A18(getClass(), C108975cc.A0R(obj))) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                C192149nt r5 = (C192149nt) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0L(this.A00), this.A01);
    }

    public C192149nt(boolean z, Uri uri) {
        this.A00 = uri;
        this.A01 = z;
    }
}
