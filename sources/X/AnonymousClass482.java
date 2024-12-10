package X;

import android.content.Context;

/* renamed from: X.482  reason: invalid class name */
public final class AnonymousClass482 extends AnonymousClass4ZN {
    public final String A00;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((AnonymousClass482) obj).A00);
    }

    public AnonymousClass482(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ CharSequence A03(Context context) {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(this.A00, AnonymousClass3MW.A1a(), 0);
    }
}
