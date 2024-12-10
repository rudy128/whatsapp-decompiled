package com.whatsapp.storage;

import X.AnonymousClass000;
import X.AnonymousClass10I;
import X.AnonymousClass1GP;
import X.AnonymousClass206;
import X.AnonymousClass3QU;
import X.AnonymousClass4NJ;
import X.AnonymousClass4a6;
import X.C107675aP;
import X.C17880vN;
import X.C22971Dz;
import X.C33251iW;
import X.C34001jj;
import X.C73203Rj;
import X.C88814ar;
import X.C95714mg;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StorageUsageDeleteMessagesDialogFragment extends Hilt_StorageUsageDeleteMessagesDialogFragment {
    public C33251iW A00;
    public C107675aP A01;
    public AnonymousClass10I A02;
    public Collection A03;
    public Collection A04;
    public boolean A05;
    public boolean A06;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment, com.whatsapp.storage.Hilt_StorageUsageDeleteMessagesDialogFragment] */
    public static StorageUsageDeleteMessagesDialogFragment A00(C107675aP r5, Collection collection, Collection collection2) {
        ? hilt_StorageUsageDeleteMessagesDialogFragment = new Hilt_StorageUsageDeleteMessagesDialogFragment();
        hilt_StorageUsageDeleteMessagesDialogFragment.A04 = collection;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (!C22971Dz.A0a(A0Y.A0v.A00)) {
                A13.add(A0Y);
            }
        }
        hilt_StorageUsageDeleteMessagesDialogFragment.A03 = A13;
        hilt_StorageUsageDeleteMessagesDialogFragment.A01 = r5;
        return hilt_StorageUsageDeleteMessagesDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        String str;
        C95714mg r3;
        Iterator it = this.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C17880vN.A0Y(it).A0q) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it2 = this.A03.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C17880vN.A0Y(it2).A0q) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z) {
            i = 2131896549;
            if (this.A04.size() == 1) {
                i = 2131896550;
            }
        } else if (z2 || this.A03.size() <= this.A04.size()) {
            i = 2131896551;
            if (this.A04.size() == 1) {
                i = 2131896552;
            }
        } else {
            i = 2131896546;
            if (this.A04.size() == 1) {
                i = 2131896547;
            }
        }
        String A1H = A1H(i);
        Context A14 = A14();
        ArrayList A13 = AnonymousClass000.A13();
        int i2 = 2131896553;
        if (this.A04.size() == 1) {
            i2 = 2131896554;
        }
        String A1H2 = A1H(i2);
        if (z) {
            if (this.A04.size() == 1) {
                this.A06 = true;
            } else {
                str = A1H(2131896548);
                r3 = new C95714mg(this, 0);
                A13.add(new AnonymousClass4NJ(r3, str, false));
            }
        } else if (!z2 && this.A03.size() > this.A04.size()) {
            str = A1H(2131896545);
            r3 = new C95714mg(this, 1);
            A13.add(new AnonymousClass4NJ(r3, str, false));
        }
        C88814ar r1 = new C88814ar(this, 25);
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0c(new AnonymousClass3QU(A14, (LinearLayout.LayoutParams) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, A1H2, A1H, A13));
        A032.A0Z(r1, 2131898874);
        A032.A0X(new C88814ar(this, 26), 2131898766);
        A032.A0T(true);
        return A032.create();
    }

    public void A2C(AnonymousClass1GP r2, String str) {
        C34001jj r0 = new C34001jj(r2);
        r0.A0B(this, str);
        r0.A02();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        if (bundle != null) {
            A28();
        }
    }
}
