package X;

import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.7Hl  reason: invalid class name and case insensitive filesystem */
public class C144477Hl implements C107435Zr {
    public final int A00;
    public final Object A01;

    public C144477Hl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void BvF(AnonymousClass77J r2) {
        if (this.A00 != 0) {
            TextStatusComposerFragment.A07(r2, (TextStatusComposerFragment) this.A01);
        } else {
            ((MessageReplyActivity) this.A01).A4d(r2);
        }
    }
}
