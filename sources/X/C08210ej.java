package X;

import java.util.Iterator;

/* renamed from: X.0ej  reason: invalid class name and case insensitive filesystem */
public final class C08210ej extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass0NO $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08210ej(AnonymousClass0NO r2) {
        super(0);
        this.$state = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0VQ r2 = this.$state.A00;
        if (r2 != null) {
            AnonymousClass0XV r3 = r2.A07;
            if (r2.A03 != C06970a9.A00(r3.A0R.A00)) {
                Iterator it = r2.A08.entrySet().iterator();
                while (it.hasNext()) {
                    ((AnonymousClass0N6) AnonymousClass000.A16(it).getValue()).A03 = true;
                }
                if (!r3.A0Q.A0E) {
                    AnonymousClass000.A1D(r3);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0k("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
