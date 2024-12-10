package X;

/* renamed from: X.5vk  reason: invalid class name and case insensitive filesystem */
public final class C115785vk extends C123056Sy {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C115785vk) && C18070vi.A18(this.A00, ((C115785vk) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C115785vk(Integer num) {
        this.A00 = num;
    }

    public static boolean A00(AnonymousClass1G4 r3) {
        return r3.BFK(r3.getValue(), new C115785vk(new Integer(2131892188)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(userMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
