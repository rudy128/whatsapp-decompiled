package X;

import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.updates.viewmodels.UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1;
import java.util.Collection;

/* renamed from: X.7E1  reason: invalid class name */
public class AnonymousClass7E1 implements C23581Gv, C23971Ii {
    public final int A00;
    public final Object A01;

    public AnonymousClass7E1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* synthetic */ void Bq1(Collection collection) {
        if (3 - this.A00 == 0) {
            StatusPlaybackContactFragment.A07((StatusPlaybackContactFragment) this.A01);
        }
    }

    public /* synthetic */ void Brx(UserJid userJid) {
        if (3 - this.A00 == 0) {
            C18070vi.A0d(userJid, 0);
            StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A01;
            if (userJid.equals(statusPlaybackContactFragment.A0N)) {
                StatusPlaybackContactFragment.A07(statusPlaybackContactFragment);
            }
        }
    }

    public void C1w(AnonymousClass1BI r6) {
        AnonymousClass1E7 A0E;
        switch (this.A00) {
            case 0:
                CallGrid callGrid = (CallGrid) this.A01;
                if (callGrid.A0A != null && (A0E = callGrid.A0I.A0E(r6)) != null && A0E.equals(callGrid.A0A.A05)) {
                    callGrid.A02.A0J(new C21431Ajy(this, A0E, 7));
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(r6, 0);
                C111135iO r3 = (C111135iO) this.A01;
                AnonymousClass1EC r1 = r3.A02;
                if (r6.equals(r1)) {
                    AnonymousClass1E7 A0H = r3.A01.A0H(r1);
                    AnonymousClass1DS r12 = r3.A00;
                    C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whatsapp.data.WAContact>");
                    r12.A0E(A0H);
                    return;
                }
                return;
            case 2:
                C18070vi.A0d(r6, 0);
                if (C22971Dz.A0V(r6)) {
                    ((AnonymousClass6BJ) this.A01).A4j((C29681ch) r6, false, true);
                    return;
                }
                return;
            case 3:
                C18070vi.A0d(r6, 0);
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A01;
                if (r6.equals(statusPlaybackContactFragment.A0N)) {
                    StatusPlaybackContactFragment.A07(statusPlaybackContactFragment);
                    return;
                }
                return;
            default:
                C18070vi.A0d(r6, 0);
                C131026kO r4 = (C131026kO) this.A01;
                AnonymousClass3MW.A1X(r4.A0C, new UpdatesViewModelObservers$contactObserver$1$onProfilePhotoChanged$1(r6, r4, (C30391dr) null), r4.A0D);
                return;
        }
    }

    public /* synthetic */ void Bm3() {
    }

    public /* synthetic */ void Bpv() {
    }

    public /* synthetic */ void Bkk(UserJid userJid) {
    }

    public /* synthetic */ void Bmh(Collection collection) {
    }

    public /* synthetic */ void Bpw(UserJid userJid) {
    }

    public /* synthetic */ void Bq0(Collection collection) {
    }

    public /* synthetic */ void Bq3(Collection collection) {
    }

    public /* synthetic */ void Bq4(Collection collection) {
    }

    public /* synthetic */ void BtU(UserJid userJid) {
    }

    public /* synthetic */ void C1z(AnonymousClass1BI r1) {
    }
}
