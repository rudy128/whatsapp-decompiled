package X;

import java.util.AbstractCollection;

/* renamed from: X.7EJ  reason: invalid class name */
public final class AnonymousClass7EJ implements C1599786p {
    public final String A00;
    public final boolean A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass7EJ(String str) {
        this(str, false);
        C18070vi.A0d(str, 1);
    }

    public static void A00(String str, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass7EJ(str));
    }

    public /* bridge */ /* synthetic */ AnonymousClass1E7 getContact() {
        return null;
    }

    public AnonymousClass7EJ(String str, boolean z) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = z;
    }
}
