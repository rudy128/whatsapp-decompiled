package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import java.util.Iterator;

/* renamed from: X.81G  reason: invalid class name */
public final class AnonymousClass81G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StatusPlaybackActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81G(StatusPlaybackActivity statusPlaybackActivity) {
        super(1);
        this.this$0 = statusPlaybackActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass3Ma.A1M(this.this$0.A0E);
        StatusPlaybackActivity statusPlaybackActivity = this.this$0;
        statusPlaybackActivity.A05.A0I(statusPlaybackActivity.A0h);
        StatusPlaybackActivity.A0c((C133576p0) obj, this.this$0);
        AnonymousClass00H r0 = this.this$0.A0K;
        if (r0 != null) {
            ((C1409373q) r0.get()).A05();
            StatusPlaybackActivity statusPlaybackActivity2 = this.this$0;
            Iterator it = statusPlaybackActivity2.A0Q.iterator();
            while (it.hasNext()) {
                statusPlaybackActivity2.BwK(C17880vN.A0v(it));
            }
            this.this$0.A0Q.clear();
            return C27621Wu.A00;
        }
        C18070vi.A11("statusPlaybackAudioManager");
        throw null;
    }
}
