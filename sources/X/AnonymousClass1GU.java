package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1GU  reason: invalid class name */
public final class AnonymousClass1GU {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final AnonymousClass1GP A01;

    public final void A00(Bundle bundle, View view, Fragment fragment, boolean z) {
        C18070vi.A0d(view, 1);
        AnonymousClass1GP r3 = this.A01;
        Fragment fragment2 = r3.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A00(bundle, view, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A03(view, fragment, r3);
            }
        }
    }

    public final void A04(Bundle bundle, Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A04(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A02(bundle, fragment);
            }
        }
    }

    public final void A01(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A01(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A02(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(Bundle bundle, Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A03(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A01(bundle, fragment);
            }
        }
    }

    public final void A05(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A05(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A06(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A06(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A07(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A07(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A08(Fragment fragment, boolean z) {
        AnonymousClass1GP r3 = this.A01;
        Fragment fragment2 = r3.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A08(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A05(fragment, r3);
            }
        }
    }

    public final void A09(Fragment fragment, boolean z) {
        AnonymousClass1GP r3 = this.A01;
        Fragment fragment2 = r3.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A09(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A06(fragment, r3);
            }
        }
    }

    public final void A0A(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A0A(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                C27461We r3 = r1.A00;
                if (r3 instanceof C27471Wf) {
                    C27471Wf r32 = (C27471Wf) r3;
                    if (fragment.A0n) {
                        r32.A01.A02(fragment.getClass().getSimpleName(), "Pause");
                        r32.A02.A00(fragment, 2);
                    }
                }
            }
        }
    }

    public final void A0B(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A0B(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                C27461We r4 = r1.A00;
                if (r4 instanceof C27471Wf) {
                    C27471Wf r42 = (C27471Wf) r4;
                    if (fragment.A0n) {
                        r42.A01.A02(fragment.getClass().getSimpleName(), "resumed visible");
                        r42.A02.A00(fragment, 1);
                    }
                }
            }
        }
    }

    public final void A0C(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A0C(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A04(fragment);
            }
        }
    }

    public final void A0D(Fragment fragment, boolean z) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.A1F().A0T.A0D(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C27481Wg r1 = (C27481Wg) it.next();
            if (!z || r1.A01) {
                r1.A00.A00();
            }
        }
    }

    public AnonymousClass1GU(AnonymousClass1GP r2) {
        this.A01 = r2;
    }
}
