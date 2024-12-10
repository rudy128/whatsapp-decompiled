package X;

/* renamed from: X.9pl  reason: invalid class name and case insensitive filesystem */
public final class C193239pl {
    public final C194119rC A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193239pl) && C18070vi.A18(this.A00, ((C193239pl) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C193239pl(C194119rC r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProtobufRecordTag(asVarint=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
