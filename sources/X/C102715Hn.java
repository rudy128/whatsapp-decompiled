package X;

import com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase;

/* renamed from: X.5Hn  reason: invalid class name and case insensitive filesystem */
public final class C102715Hn extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SelectedMediaFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102715Hn(SelectedMediaFragmentBase selectedMediaFragmentBase) {
        super(0);
        this.this$0 = selectedMediaFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        SelectedMediaFragmentBase selectedMediaFragmentBase = this.this$0;
        C24771Lp r4 = selectedMediaFragmentBase.A01;
        if (r4 != null) {
            AnonymousClass11C r3 = selectedMediaFragmentBase.A02;
            if (r3 != null) {
                return new C136166tN(selectedMediaFragmentBase.A04, r4, r3, "image-loader-selected-media-fragment");
            }
            str = "systemServices";
        } else {
            str = "caches";
        }
        C18070vi.A11(str);
        throw null;
    }
}
