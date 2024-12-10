package X;

import android.os.Bundle;
import com.whatsapp.gallery.GalleryRecentsFragment;

/* renamed from: X.7lk  reason: invalid class name and case insensitive filesystem */
public final class C151097lk extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C113825np this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151097lk(C113825np r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GalleryRecentsFragment galleryRecentsFragment = new GalleryRecentsFragment();
        C113825np r3 = this.this$0;
        Bundle A0D = C17880vN.A0D();
        A0D.putString("jid", r3.A0M);
        A0D.putInt("include", r3.A00);
        A0D.putBoolean("is_coming_from_chat", r3.A0R);
        Boolean bool = r3.A08;
        if (bool != null) {
            A0D.putBoolean("is_send_as_document", bool.booleanValue());
        }
        A0D.putBoolean("picker_redesign", r3.A0S);
        Integer num = r3.A0G;
        if (num != null) {
            A0D.putInt("picker_action", num.intValue());
        }
        galleryRecentsFragment.A1R(A0D);
        galleryRecentsFragment.A02 = r3.A03;
        galleryRecentsFragment.A00 = r3.A02;
        return galleryRecentsFragment;
    }
}
