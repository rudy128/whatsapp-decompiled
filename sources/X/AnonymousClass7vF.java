package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.7vF  reason: invalid class name */
public final class AnonymousClass7vF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C18100vl $owner$delegate;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vF(Fragment fragment, C18100vl r3) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1FC r1;
        C24051Ir BQR;
        AnonymousClass1FD A0T = C108945cZ.A0T(this.$owner$delegate);
        if (!(A0T instanceof AnonymousClass1FC) || (r1 = (AnonymousClass1FC) A0T) == null || (BQR = r1.BQR()) == null) {
            return this.$this_viewModels.BQR();
        }
        return BQR;
    }
}
