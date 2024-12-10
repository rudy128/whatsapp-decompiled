package X;

import android.view.LayoutInflater;
import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;

/* renamed from: X.5Hg  reason: invalid class name and case insensitive filesystem */
public final class C102645Hg extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SelectedMediaCaptionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102645Hg(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        super(0);
        this.this$0 = selectedMediaCaptionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LayoutInflater from = LayoutInflater.from(this.this$0.A14());
        C18070vi.A0X(from);
        C136166tN r2 = (C136166tN) this.this$0.A08.getValue();
        AnonymousClass5W9 r1 = new AnonymousClass5W9(this.this$0);
        C18070vi.A0d(r2, 2);
        return new C112225l8(from, r2, r1);
    }
}
