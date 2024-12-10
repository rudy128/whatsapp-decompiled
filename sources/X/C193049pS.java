package X;

/* renamed from: X.9pS  reason: invalid class name and case insensitive filesystem */
public final class C193049pS {
    public Integer A00 = null;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193049pS) && C18070vi.A18(this.A00, ((C193049pS) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsEntryPointConversionData(entryPointConversationInitiated=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
