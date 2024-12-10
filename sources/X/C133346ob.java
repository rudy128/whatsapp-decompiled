package X;

/* renamed from: X.6ob  reason: invalid class name and case insensitive filesystem */
public class C133346ob {
    public final boolean A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C133346ob) obj).A00;
        }
        return true;
    }

    public C133346ob(boolean z) {
        this.A00 = z;
    }

    public int hashCode() {
        return AnonymousClass000.A0P(Boolean.valueOf(this.A00), AnonymousClass3MW.A1a(), 0);
    }
}
