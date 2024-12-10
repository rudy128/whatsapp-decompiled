package X;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.4nj  reason: invalid class name and case insensitive filesystem */
public final class C96364nj implements C108065b4 {
    public final AnonymousClass4DU A00 = AnonymousClass4DU.FREQUENTLY_CONTACTED;
    public final AnonymousClass4QF A01;
    public final AnonymousClass00H A02;

    public C96364nj(AnonymousClass4QF r2, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A02 = r3;
        this.A01 = r2;
    }

    public C86854Ti Bhf(Set set) {
        C18070vi.A0d(set, 1);
        ArrayList A012 = ((C26051Qq) this.A02.get()).A01(false, true);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupMemberSuggestionsBucketFrequentlyContacted/loadBucket frequentOneOnOneJids size: ");
        C17900vP.A0o(A10, A012.size());
        return new C86854Ti(this.A01.A00(A012, set));
    }

    public AnonymousClass4DU BNn() {
        return this.A00;
    }
}
