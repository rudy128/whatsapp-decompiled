package X;

import androidx.compose.runtime.Recomposer;
import java.util.Set;

/* renamed from: X.0mg  reason: invalid class name and case insensitive filesystem */
public final class C13010mg extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ Recomposer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13010mg(Recomposer recomposer) {
        super(2);
        this.this$0 = recomposer;
    }

    public final void A00(Set set) {
        C31761g5 r1;
        Recomposer recomposer = this.this$0;
        synchronized (recomposer.A0B) {
            if (((AnonymousClass0CU) recomposer.A0L.getValue()).compareTo(AnonymousClass0CU.Idle) >= 0) {
                if (set instanceof C06990aB) {
                    C06990aB r9 = (C06990aB) set;
                    Object[] A04 = r9.A04();
                    int size = r9.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = A04[i];
                        C18070vi.A0z(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        if (!(obj instanceof AnonymousClass0W5) || (1 & ((AnonymousClass0W5) obj).A00.get()) != 0) {
                            recomposer.A06.add(obj);
                        }
                    }
                } else {
                    for (Object next : set) {
                        if (!(next instanceof AnonymousClass0W5) || (1 & ((AnonymousClass0W5) next).A00.get()) != 0) {
                            recomposer.A06.add(next);
                        }
                    }
                }
                r1 = recomposer.A0B();
            } else {
                r1 = null;
            }
        }
        if (r1 != null) {
            r1.resumeWith(C27621Wu.A00);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((Set) obj);
        return C27621Wu.A00;
    }
}
