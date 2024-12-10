package X;

import java.util.List;

/* renamed from: X.2Cs  reason: invalid class name and case insensitive filesystem */
public final class C46062Cs extends C50852Wa {
    public final List A00;

    public C46062Cs(List list) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C46062Cs) && C18070vi.A18(this.A00, ((C46062Cs) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SUCCESS(downloadedContacts=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
