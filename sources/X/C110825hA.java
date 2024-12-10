package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;

/* renamed from: X.5hA  reason: invalid class name and case insensitive filesystem */
public final class C110825hA extends C002100z {
    public final /* synthetic */ StatusPlaybackContactFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110825hA(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        super(3);
        this.A00 = statusPlaybackContactFragment;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        int i;
        AnonymousClass70K r6 = (AnonymousClass70K) obj2;
        C18070vi.A0d(r6, 2);
        AnonymousClass89M r0 = (AnonymousClass89M) this.A00.A1B();
        if (r0 != null) {
            i = ((StatusPlaybackActivity) r0).A02;
        } else {
            i = 0;
        }
        if (r6.A05) {
            AnonymousClass6Gp r1 = (AnonymousClass6Gp) r6;
            r1.A05 = false;
            r1.A0S(i);
        }
        if (r6.A04) {
            r6.A0H();
        }
        if (r6.A01) {
            if (r6.A03) {
                r6.A0E();
            }
            r6.A0D();
        }
    }
}
