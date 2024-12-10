package X;

/* renamed from: X.4ic  reason: invalid class name and case insensitive filesystem */
public final class C93214ic implements C106695Wv {
    public final boolean A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93214ic) && this.A00 == ((C93214ic) obj).A00);
    }

    public int hashCode() {
        if (this.A00) {
            return 1231;
        }
        return 1237;
    }

    public C93214ic(boolean z) {
        this.A00 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Mute(isMuted=");
        return C17900vP.A0F(A10, this.A00);
    }
}
