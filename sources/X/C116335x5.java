package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.5x5  reason: invalid class name and case insensitive filesystem */
public final class C116335x5 extends C45702Bd {
    public final WeakReference A00;

    public int A0E() {
        C133576p0 r2;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity == null || (r2 = statusPlaybackActivity.A0C) == null || !statusPlaybackActivity.A0R) {
            return 0;
        }
        return r2.A01.size();
    }

    public /* bridge */ /* synthetic */ int A0I(Object obj) {
        Fragment fragment = (Fragment) obj;
        C18070vi.A0d(fragment, 0);
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity != null) {
            C133576p0 r2 = statusPlaybackActivity.A0C;
            if ((fragment instanceof StatusPlaybackFragment) && r2 != null) {
                int A002 = r2.A00(((StatusPlaybackFragment) fragment).A26());
                if (Integer.valueOf(A002) == null || A002 < 0 || A002 >= r2.A01.size()) {
                    return -2;
                }
                return A002;
            }
        }
        return -2;
    }

    public long A0M(int i) {
        Number A1D;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity == null) {
            return 0;
        }
        C133576p0 r0 = statusPlaybackActivity.A0C;
        if (r0 == null || (A1D = C108945cZ.A1D(((AnonymousClass881) r0.A01.get(i)).BhH(), r0.A00)) == null) {
            return -2;
        }
        return A1D.longValue();
    }

    public Fragment A0N(int i) {
        AnonymousClass881 r2;
        Bundle A0D;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A00.get();
        if (statusPlaybackActivity != null) {
            C133576p0 r0 = statusPlaybackActivity.A0C;
            if (r0 != null) {
                r2 = (AnonymousClass881) r0.A01.get(i);
            } else {
                r2 = null;
            }
            if (r2 instanceof AnonymousClass7MD) {
                AnonymousClass205 r1 = statusPlaybackActivity.A09;
                UserJid userJid = ((AnonymousClass7MD) r2).A00.A0A;
                if (r1 == null) {
                    C18070vi.A0X(userJid);
                    boolean z = statusPlaybackActivity.A4b().A03;
                    A0D = C17880vN.A0D();
                    AnonymousClass3MY.A15(A0D, userJid, "jid");
                    A0D.putBoolean("unseen_only", z);
                } else {
                    C18070vi.A0X(userJid);
                    AnonymousClass205 r12 = statusPlaybackActivity.A09;
                    if (r12 != null) {
                        A0D = C17880vN.A0D();
                        AnonymousClass3MY.A15(A0D, userJid, "jid");
                        AnonymousClass4aU.A0A(A0D, r12);
                    } else {
                        throw C17890vO.A0K();
                    }
                }
                StatusPlaybackContactFragment statusPlaybackContactFragment = new StatusPlaybackContactFragment();
                statusPlaybackContactFragment.A1R(A0D);
                statusPlaybackContactFragment.A2B(statusPlaybackActivity.A0g);
                return statusPlaybackContactFragment;
            } else if (r2 instanceof AnonymousClass7MC) {
                new Bundle();
                throw AnonymousClass000.A0s("getId");
            } else {
                throw AnonymousClass000.A0k("Unsupported StatusItem instance");
            }
        } else {
            throw AnonymousClass000.A0k("Unsupported StatusItem instance");
        }
    }

    public C116335x5(AnonymousClass1GP r2, StatusPlaybackActivity statusPlaybackActivity) {
        super(r2);
        this.A00 = AnonymousClass3MW.A0z(statusPlaybackActivity);
    }
}
