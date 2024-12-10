package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.1jq  reason: invalid class name and case insensitive filesystem */
public abstract class C34051jq {
    public void A00() {
        Bundle bundle;
        if (this instanceof C34061jr) {
            Fragment fragment = ((C34061jr) this).A00;
            fragment.A0O.A01();
            AnonymousClass1GG.A01(fragment);
            Bundle bundle2 = fragment.A07;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            fragment.A0O.A02(bundle);
            return;
        }
        AnonymousClass27i r6 = (AnonymousClass27i) this;
        Fragment fragment2 = r6.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(fragment2.A0V);
        sb.append("_rq#");
        sb.append(fragment2.A0p.getAndIncrement());
        String obj = sb.toString();
        r6.A04.set(((AnonymousClass01M) r6.A02.apply((Object) null)).A03(r6.A00, r6.A01, fragment2, obj));
    }
}
