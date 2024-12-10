package X;

/* renamed from: X.6rN  reason: invalid class name and case insensitive filesystem */
public final class C134926rN {
    public final C1418277c A00;
    public final Long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134926rN) {
                C134926rN r5 = (C134926rN) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A01);
    }

    public C134926rN(C1418277c r1, Long l) {
        this.A00 = r1;
        this.A01 = l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MusicSelectedSong(song=");
        A10.append(this.A00);
        A10.append(", startTimeMs=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
