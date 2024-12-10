package X;

import java.util.Collection;

/* renamed from: X.3oY  reason: invalid class name and case insensitive filesystem */
public final class C76863oY extends AnonymousClass4EF {
    public final Collection A00;

    public C76863oY(Collection collection) {
        C18070vi.A0d(collection, 1);
        this.A00 = collection;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76863oY) && C18070vi.A18(this.A00, ((C76863oY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LockMultipleChats(chatJids=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
