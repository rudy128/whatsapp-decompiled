package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.1GJ  reason: invalid class name */
public final class AnonymousClass1GJ implements AnonymousClass1GI {
    public Bundle A00;
    public boolean A01;
    public final C18100vl A02;
    public final AnonymousClass1GB A03;

    public AnonymousClass1GJ(AnonymousClass1FD r3, AnonymousClass1GB r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A03 = r4;
        this.A02 = new C18110vm(new AnonymousClass1GK(r3));
    }

    public final void A01() {
        if (!this.A01) {
            Bundle A002 = this.A03.A00("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (A002 != null) {
                bundle.putAll(A002);
            }
            this.A00 = bundle;
            this.A01 = true;
            this.A02.getValue();
        }
    }

    public Bundle CGk() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((C29571cV) this.A02.getValue()).A00.entrySet()) {
            String str = (String) entry.getKey();
            Bundle CGk = ((C37361pP) entry.getValue()).A00.CGk();
            if (!C18070vi.A18(CGk, Bundle.EMPTY)) {
                bundle.putBundle(str, CGk);
            }
        }
        this.A01 = false;
        return bundle;
    }

    public final Bundle A00(String str) {
        Bundle bundle;
        A01();
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.A00;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.A00;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.A00 = null;
        }
        return bundle;
    }
}
