package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.7vI  reason: invalid class name */
public final class AnonymousClass7vI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass205 $messageKey;
    public final /* synthetic */ StatusPlaybackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vI(AnonymousClass205 r2, StatusPlaybackActivity statusPlaybackActivity) {
        super(0);
        this.$messageKey = r2;
        this.this$0 = statusPlaybackActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass205 r1 = this.$messageKey;
        if (r1 == null) {
            return null;
        }
        AnonymousClass00H r0 = this.this$0.A0G;
        if (r0 != null) {
            return AnonymousClass1W2.A01(r1, r0);
        }
        C18070vi.A11("fMessageDatabase");
        throw null;
    }
}
