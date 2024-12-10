package X;

import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.81I  reason: invalid class name */
public final class AnonymousClass81I extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ TextStatusComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81I(TextStatusComposerFragment textStatusComposerFragment) {
        super(1);
        this.this$0 = textStatusComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass85B r2 = (AnonymousClass85B) obj;
        if (r2 != null) {
            AnonymousClass1T6 r0 = this.this$0.A0g;
            if (r0 != null) {
                r0.A0K(r2);
            } else {
                C18070vi.A11("mediaJobManager");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
