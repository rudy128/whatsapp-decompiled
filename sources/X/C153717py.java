package X;

import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.7py  reason: invalid class name and case insensitive filesystem */
public final class C153717py extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153717py(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(0);
        this.this$0 = statusPlaybackContactFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.this$0;
        C27201Vd r2 = statusPlaybackContactFragment.A0C;
        if (r2 != null) {
            return r2.A06(statusPlaybackContactFragment.A14(), "status-playback-contact-fragment");
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }
}
