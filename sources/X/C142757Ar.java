package X;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Ar  reason: invalid class name and case insensitive filesystem */
public final class C142757Ar implements C23521Gp {
    public boolean A00;
    public int A01 = -1;
    public StatusPlaybackFragment A02;
    public final Rect A03 = AnonymousClass3MW.A07();
    public final Rect A04 = AnonymousClass3MW.A07();
    public final WeakReference A05;

    public void Bzw(int i) {
        int i2;
        WeakReference weakReference = this.A05;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) weakReference.get();
        if (statusPlaybackActivity != null) {
            int i3 = 0;
            if (i == 0) {
                statusPlaybackActivity.A0Y = false;
                this.A01 = -1;
                this.A00 = false;
                this.A02 = null;
                AnonymousClass1FU A0Z = C108945cZ.A0Z(weakReference);
                if (A0Z != null) {
                    List A3W = A0Z.A3W();
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next : A3W) {
                        if ((next instanceof StatusPlaybackFragment) && next != null) {
                            A13.add(next);
                        }
                    }
                    ArrayList<StatusPlaybackFragment> A132 = AnonymousClass000.A13();
                    for (Object next2 : A13) {
                        AnonymousClass3MZ.A1V(next2, A132, ((StatusPlaybackFragment) next2).A00 ? 1 : 0);
                    }
                    for (StatusPlaybackFragment statusPlaybackFragment : A132) {
                        AnonymousClass70K A012 = StatusPlaybackContactFragment.A01((StatusPlaybackContactFragment) statusPlaybackFragment);
                        if (A012 != null && A012.A05) {
                            AnonymousClass6Gp r1 = (AnonymousClass6Gp) A012;
                            r1.A05 = false;
                            r1.A0S(0);
                        }
                    }
                    this.A00 = false;
                }
                Runnable runnable = statusPlaybackActivity.A0P;
                if (runnable != null) {
                    runnable.run();
                }
                statusPlaybackActivity.A0P = null;
                i2 = 0;
            } else {
                if (!statusPlaybackActivity.A0Y) {
                    statusPlaybackActivity.A0Y = true;
                    ViewPager viewPager = statusPlaybackActivity.A05;
                    if (viewPager != null) {
                        i3 = viewPager.getCurrentItem();
                    }
                    this.A01 = i3;
                }
                i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        throw AnonymousClass000.A0n("Invalid scrollState value from ViewPager");
                    }
                }
            }
            AnonymousClass1FU A0Z2 = C108945cZ.A0Z(weakReference);
            if (A0Z2 != null) {
                List A3W2 = A0Z2.A3W();
                ArrayList<StatusPlaybackFragment> A133 = AnonymousClass000.A13();
                for (Object next3 : A3W2) {
                    if ((next3 instanceof StatusPlaybackFragment) && next3 != null) {
                        A133.add(next3);
                    }
                }
                for (StatusPlaybackFragment statusPlaybackFragment2 : A133) {
                    boolean A1O = AnonymousClass000.A1O(i2);
                    AnonymousClass70K A013 = StatusPlaybackContactFragment.A01((StatusPlaybackContactFragment) ((StatusPlaybackBaseFragment) statusPlaybackFragment2));
                    if (A013 != null) {
                        ((AnonymousClass6Gp) A013).A0K().A0H(A1O);
                    }
                }
            }
        }
    }

    public void Bzy(int i) {
        C133576p0 r0;
        AnonymousClass881 r9;
        boolean z;
        WeakReference weakReference = this.A05;
        StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) weakReference.get();
        if (statusPlaybackActivity != null && i != statusPlaybackActivity.A00) {
            statusPlaybackActivity.A4b().A01 = false;
            StatusPlaybackActivity statusPlaybackActivity2 = (StatusPlaybackActivity) weakReference.get();
            if (!(statusPlaybackActivity2 == null || (r0 = statusPlaybackActivity2.A0C) == null || (r9 = (AnonymousClass881) r0.A01.get(i)) == null)) {
                List A3W = statusPlaybackActivity2.A3W();
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : A3W) {
                    if ((next instanceof StatusPlaybackFragment) && next != null) {
                        A13.add(next);
                    }
                }
                ArrayList A132 = AnonymousClass000.A13();
                for (Object next2 : A13) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) next2;
                    if (!C18070vi.A18(statusPlaybackFragment.A26(), r9.BhH()) && statusPlaybackFragment.A00) {
                        A132.add(next2);
                    }
                }
                Iterator it = A132.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    StatusPlaybackFragment statusPlaybackFragment2 = (StatusPlaybackFragment) it.next();
                    if (i > statusPlaybackActivity2.A00) {
                        z = true;
                    }
                    int i2 = statusPlaybackActivity2.A02;
                    if (i2 != 0) {
                        statusPlaybackActivity2.A02 = 0;
                    } else {
                        i2 = 6;
                        if (z) {
                            i2 = 7;
                        }
                    }
                    AnonymousClass70K A012 = StatusPlaybackContactFragment.A01((StatusPlaybackContactFragment) statusPlaybackFragment2);
                    if (A012 != null && A012.A05) {
                        AnonymousClass6Gp r1 = (AnonymousClass6Gp) A012;
                        r1.A05 = false;
                        r1.A0S(i2);
                    }
                    statusPlaybackFragment2.A29();
                }
                StatusPlaybackFragment A032 = StatusPlaybackActivity.A03(statusPlaybackActivity2, r9.BhH());
                if (!(A032 == null || A032.A00)) {
                    A032.A28();
                    if (i > statusPlaybackActivity2.A00) {
                        z = true;
                    }
                    int i3 = statusPlaybackActivity2.A01;
                    if (i3 != 0) {
                        statusPlaybackActivity2.A01 = 0;
                    } else {
                        i3 = 2;
                        if (z) {
                            i3 = 3;
                        }
                    }
                    A032.A2A(i3);
                }
            }
            statusPlaybackActivity.A00 = i;
        }
    }

    public C142757Ar(StatusPlaybackActivity statusPlaybackActivity) {
        this.A05 = AnonymousClass3MW.A0z(statusPlaybackActivity);
    }

    public void Bzx(int i, float f, int i2) {
        View view;
        ViewPager viewPager;
        if (!Float.isNaN(f) && f != 0.0f && f != 1.0f) {
            boolean A1T = AnonymousClass000.A1T(i, this.A01);
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A05.get();
            if (statusPlaybackActivity != null && !this.A00) {
                StatusPlaybackFragment statusPlaybackFragment = this.A02;
                if (statusPlaybackFragment == null) {
                    if (A1T) {
                        i++;
                    }
                    statusPlaybackFragment = statusPlaybackActivity.A4c(i);
                    this.A02 = statusPlaybackFragment;
                    if (statusPlaybackFragment == null) {
                        return;
                    }
                }
                if (statusPlaybackFragment.A00 && (view = statusPlaybackFragment.A0B) != null && (viewPager = statusPlaybackActivity.A05) != null && viewPager.isShown() && view.isShown()) {
                    Rect rect = this.A04;
                    viewPager.getGlobalVisibleRect(rect);
                    Rect rect2 = this.A03;
                    view.getGlobalVisibleRect(rect2);
                    if (rect.intersect(rect2)) {
                        int i3 = statusPlaybackActivity.A01;
                        if (i3 != 0) {
                            statusPlaybackActivity.A01 = 0;
                        } else {
                            i3 = 2;
                            if (A1T) {
                                i3 = 3;
                            }
                        }
                        statusPlaybackFragment.A2A(i3);
                        this.A00 = true;
                    }
                }
            }
        }
    }
}
