package X;

/* renamed from: X.97L  reason: invalid class name */
public final class AnonymousClass97L extends C180379Mh {
    public final C164398Yr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass97L) && C18070vi.A18(this.A00, ((AnonymousClass97L) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public AnonymousClass97L(C164398Yr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProtoEmbeddedContentMessageInfo(embeddedE2EContent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public AnonymousClass97L() {
        this((C164398Yr) null);
    }
}
