package X;

import android.os.Bundle;
import java.util.Map;

/* renamed from: X.1GA  reason: invalid class name */
public final class AnonymousClass1GA {
    public boolean A00;
    public final AnonymousClass1GB A01 = new AnonymousClass1GB();
    public final AnonymousClass1FE A02;

    public final void A01() {
        AnonymousClass1FE r2 = this.A02;
        C23381Fv lifecycle = r2.getLifecycle();
        C18070vi.A0X(lifecycle);
        if (((C23391Fw) lifecycle).A02 == C23401Fx.INITIALIZED) {
            lifecycle.A05(new AnonymousClass1GF(r2));
            AnonymousClass1GB r22 = this.A01;
            if (!r22.A01) {
                lifecycle.A05(new C65002vg(r22, 1));
                r22.A01 = true;
                this.A00 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void A02(Bundle bundle) {
        Bundle bundle2;
        if (!this.A00) {
            A01();
        }
        C23381Fv lifecycle = this.A02.getLifecycle();
        C18070vi.A0X(lifecycle);
        C23391Fw r2 = (C23391Fw) lifecycle;
        if (!r2.A02.A00(C23401Fx.STARTED)) {
            AnonymousClass1GB r22 = this.A01;
            if (!r22.A01) {
                throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
            } else if (!r22.A03) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                r22.A00 = bundle2;
                r22.A03 = true;
            } else {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("performRestore cannot be called when owner is ");
            sb.append(r2.A02);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void A03(Bundle bundle) {
        AnonymousClass1GB r1 = this.A01;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = r1.A00;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C001200q r0 = r1.A05;
        C006702y r2 = new C006702y(r0);
        r0.A03.put(r2, false);
        while (r2.hasNext()) {
            Map.Entry entry = (Map.Entry) r2.next();
            bundle2.putBundle((String) entry.getKey(), ((AnonymousClass1GI) entry.getValue()).CGk());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public AnonymousClass1GA(AnonymousClass1FE r2) {
        this.A02 = r2;
    }

    public final AnonymousClass1GB A00() {
        return this.A01;
    }
}
