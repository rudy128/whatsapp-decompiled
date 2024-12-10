package X;

import android.view.View;
import com.whatsapp.mediacomposer.GifComposerFragment;

/* renamed from: X.7mV  reason: invalid class name and case insensitive filesystem */
public final class C151567mV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GifComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151567mV(GifComposerFragment gifComposerFragment) {
        super(0);
        this.this$0 = gifComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View A09;
        AnonymousClass70X r0 = this.this$0.A00;
        if (!(r0 == null || (A09 = r0.A09()) == null)) {
            A09.setAlpha(1.0f);
            A09.setVisibility(0);
        }
        return C27621Wu.A00;
    }
}
