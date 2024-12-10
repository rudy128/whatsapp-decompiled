package X;

import com.whatsapp.stickers.WebpInfo;

/* renamed from: X.7qN  reason: invalid class name and case insensitive filesystem */
public final class C153967qN extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass6HI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153967qN(AnonymousClass6HI r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        AnonymousClass6HI r2 = this.this$0;
        WebpInfo webpInfo = r2.A02;
        if (webpInfo == null || webpInfo.numFrames <= 1) {
            i = -1;
        } else {
            i = r2.A00.getFirstFrameLocation(r2.A03.getAbsolutePath());
        }
        return Integer.valueOf(i);
    }
}
