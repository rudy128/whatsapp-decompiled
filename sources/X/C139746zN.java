package X;

/* renamed from: X.6zN  reason: invalid class name and case insensitive filesystem */
public final class C139746zN {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C139746zN) && this.A00 == ((C139746zN) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C139746zN(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerAnimationData(firstFrameLength=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C139746zN() {
        this(-1);
    }
}
