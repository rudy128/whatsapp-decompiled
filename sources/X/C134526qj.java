package X;

import android.os.Parcelable;

/* renamed from: X.6qj  reason: invalid class name and case insensitive filesystem */
public final class C134526qj {
    public final int A00;
    public final Parcelable A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134526qj) {
                C134526qj r5 = (C134526qj) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, this.A00 * 31);
    }

    public C134526qj(Parcelable parcelable, int i) {
        this.A00 = i;
        this.A01 = parcelable;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BonsaiOnboardingRequestData(requestCode=");
        A10.append(this.A00);
        A10.append(", args=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
