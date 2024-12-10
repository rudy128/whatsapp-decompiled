package X;

import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.81J  reason: invalid class name */
public final class AnonymousClass81J extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TextStatusComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81J(TextStatusComposerFragment textStatusComposerFragment) {
        super(1);
        this.this$0 = textStatusComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4UP r4 = (AnonymousClass4UP) obj;
        C18070vi.A0d(r4, 0);
        TextStatusComposerFragment textStatusComposerFragment = this.this$0;
        AnonymousClass206 r2 = r4.A00;
        C693536w r0 = r4.A02;
        if (r0 != null) {
            C60502o8.A01(r2, r0);
        }
        C33251iW r02 = textStatusComposerFragment.A0M;
        if (r02 != null) {
            r02.A0U.CQx(r2, 1);
            return C27621Wu.A00;
        }
        C18070vi.A11("userActions");
        throw null;
    }
}
