package X;

import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.5gw  reason: invalid class name and case insensitive filesystem */
public final class C110715gw extends AnonymousClass01T {
    public final /* synthetic */ TextStatusComposerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110715gw(TextStatusComposerFragment textStatusComposerFragment) {
        super(true);
        this.A00 = textStatusComposerFragment;
    }

    public void A03() {
        TextStatusComposerFragment textStatusComposerFragment = this.A00;
        if (!TextStatusComposerFragment.A0i(textStatusComposerFragment) || !C108975cc.A0G(textStatusComposerFragment).A0U()) {
            C80753xv r0 = textStatusComposerFragment.A0a;
            if (r0 == null || !r0.A02()) {
                TextStatusComposerFragment.A0j(textStatusComposerFragment, false);
                return;
            }
            return;
        }
        C108975cc.A0G(textStatusComposerFragment).A0D();
    }
}
