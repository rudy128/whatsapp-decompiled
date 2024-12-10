package com.whatsapp.base;

import X.AnonymousClass1FT;
import X.AnonymousClass1GP;
import X.AnonymousClass1JA;
import X.AnonymousClass1ZK;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C34691kv;
import android.os.Bundle;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.updates.ui.UpdatesFragment;

public abstract class WaFragment extends Hilt_WaFragment implements AnonymousClass1FT, AnonymousClass1ZK {
    public C34691kv A00;

    public void A23(boolean z) {
        C34691kv r1 = this.A00;
        if (r1 != null) {
            r1.A00(this, this.A0n, z);
        }
        super.A23(z);
    }

    public /* synthetic */ C18180vt BYS() {
        if ((this instanceof UpdatesFragment) || (this instanceof ConversationsFragment)) {
            return C19620yd.A01;
        }
        return C19620yd.A02;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1GP A1E = A1E();
        C18070vi.A0d(A1E, 0);
        A1E.A0E.add(new AnonymousClass1JA(A1E));
    }
}
