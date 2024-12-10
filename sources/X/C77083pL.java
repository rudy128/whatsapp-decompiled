package X;

/* renamed from: X.3pL  reason: invalid class name and case insensitive filesystem */
public final class C77083pL extends AnonymousClass4EK {
    public final C18090vk A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C77083pL) && C18070vi.A18(this.A00, ((C77083pL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C77083pL(C18090vk r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowNoConnectionError(onConnectionErrorDisplayed=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
