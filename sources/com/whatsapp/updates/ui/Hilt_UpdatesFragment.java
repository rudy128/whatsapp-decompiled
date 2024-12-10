package com.whatsapp.updates.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1TF;
import X.AnonymousClass2Z2;
import X.C000200d;
import X.C008603v;
import X.C008703w;
import X.C008903z;
import X.C18030ve;
import X.C19880zA;
import X.C19890zB;
import X.C34731kz;
import X.C34741l0;
import X.C34771l3;
import X.C34781l4;
import X.C36241nZ;
import X.C51592Yw;
import X.C51602Yx;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_UpdatesFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C008603v(super.A1n(), (Fragment) this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (!this.A02) {
            this.A02 = true;
            UpdatesFragment updatesFragment = (UpdatesFragment) this;
            C36241nZ r4 = (C36241nZ) ((C008903z) generatedComponent());
            AnonymousClass10E r2 = r4.A2Q;
            AnonymousClass10G r3 = r2.A00;
            updatesFragment.A00 = AnonymousClass10G.A8i(r3);
            updatesFragment.A0E = (C18030ve) r2.A04.get();
            updatesFragment.A06 = (C51592Yw) r3.A1n.get();
            updatesFragment.A07 = (C51602Yx) r3.A1o.get();
            updatesFragment.A0Q = C000200d.A00(r2.A0E);
            updatesFragment.A0R = C000200d.A00(r3.A03);
            updatesFragment.A0S = C000200d.A00(r4.A2O.A0F);
            updatesFragment.A0T = C000200d.A00(r3.A0q);
            updatesFragment.A0U = C000200d.A00(r2.A2H);
            updatesFragment.A0V = C000200d.A00(r2.A2T);
            updatesFragment.A0W = C000200d.A00(r3.A1G);
            C19890zB r42 = C19890zB.A00;
            updatesFragment.A01 = r42;
            updatesFragment.A0X = C000200d.A00(r2.A4b);
            updatesFragment.A0Y = C000200d.A00(r2.A4h);
            updatesFragment.A0Z = C000200d.A00(r2.A63);
            updatesFragment.A0a = C000200d.A00(r2.A74);
            updatesFragment.A0b = C000200d.A00(r2.A7C);
            updatesFragment.A0c = C000200d.A00(r2.A7D);
            updatesFragment.A0d = C000200d.A00(r2.A7K);
            updatesFragment.A0e = C000200d.A00(r2.A7L);
            updatesFragment.A0f = C000200d.A00(r2.A7M);
            updatesFragment.A0g = C000200d.A00(r2.A7N);
            updatesFragment.A0h = C000200d.A00(r3.A3Y);
            updatesFragment.A0i = C000200d.A00(r2.A7W);
            updatesFragment.A0j = C000200d.A00(r2.A9Q);
            updatesFragment.A0k = C000200d.A00(r3.A3M);
            updatesFragment.A0l = C000200d.A00(r3.A44);
            updatesFragment.A02 = (C19880zA) r2.A7g.get();
            updatesFragment.A03 = r42;
            updatesFragment.A04 = r42;
            updatesFragment.A05 = r42;
            updatesFragment.A0m = C000200d.A00(r3.A4a);
            updatesFragment.A0n = C000200d.A00(r3.A4c);
            updatesFragment.A0J = (AnonymousClass1TF) r2.AAA.get();
            updatesFragment.A0o = C000200d.A00(r3.A4f);
            updatesFragment.A0p = C000200d.A00(r2.AAB);
            updatesFragment.A08 = (C34731kz) r3.A4i.get();
            updatesFragment.A0q = C000200d.A00(r3.A4j);
            updatesFragment.A0r = C000200d.A00(r2.AAI);
            updatesFragment.A0s = C000200d.A00(r3.A4q);
            updatesFragment.A0t = C000200d.A00(r3.A4r);
            updatesFragment.A0u = C000200d.A00(r3.A4s);
            updatesFragment.A09 = (C34741l0) r3.A0D.get();
            updatesFragment.A0L = (C34771l3) r3.A0E.get();
            updatesFragment.A0v = C000200d.A00(r2.AAV);
            updatesFragment.A0w = C000200d.A00(r2.A95);
            updatesFragment.A0x = C000200d.A00(r2.AAp);
            updatesFragment.A0A = (AnonymousClass2Z2) r3.A4z.get();
            updatesFragment.A0y = C000200d.A00(r3.A4p);
            updatesFragment.A0z = C000200d.A00(r2.AAv);
            updatesFragment.A0B = (C34781l4) r3.A52.get();
            updatesFragment.A0D = (AnonymousClass118) r2.ABY.get();
            updatesFragment.A10 = C000200d.A00(r2.ABd);
            updatesFragment.A11 = C000200d.A00(r2.ABj);
            updatesFragment.A12 = C000200d.A00(r2.ABl);
            updatesFragment.A13 = C000200d.A00(r2.AC1);
            updatesFragment.A14 = C000200d.A00(r3.A3a);
            updatesFragment.A15 = C000200d.A00(r3.A3b);
            updatesFragment.A16 = C000200d.A00(r3.A5I);
            updatesFragment.A17 = C000200d.A00(r2.AC9);
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        LayoutInflater A1o = super.A1o(bundle);
        return A1o.cloneInContext(new C008603v(A1o, (Fragment) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C008803x.A00(r0) == r5) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r5) {
        /*
            r4 = this;
            super.A1p(r5)
            android.content.ContextWrapper r0 = r4.A00
            r3 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C008803x.A00(r0)
            r2 = 0
            if (r0 != r5) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.String r1 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            X.C008303s.A00(r1, r0, r2)
            r4.A00()
            r4.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.Hilt_UpdatesFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A00();
        A25();
    }
}
