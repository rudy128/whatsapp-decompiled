package X;

import android.view.ViewGroup;

/* renamed from: X.7vL  reason: invalid class name */
public final class AnonymousClass7vL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C27201Vd $contactPhotos;
    public final /* synthetic */ ViewGroup $container;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vL(ViewGroup viewGroup, C27201Vd r3) {
        super(0);
        this.$contactPhotos = r3;
        this.$container = viewGroup;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return this.$contactPhotos.A06(this.$container.getContext(), "status-mentions-panel");
    }
}
