package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.Cit  reason: case insensitive filesystem */
public final class C25613Cit {
    public C24269ByS A00;
    public final int A01;
    public final Fragment A02;
    public final AnonymousClass1GP A03;
    public final C26329Cxm A04;
    public final BLR A05;
    public final BND A06;
    public final Integer A07;
    public final E7J A08;

    public static final void A00(C25613Cit cit, C24269ByS byS) {
        E7J e7j;
        Integer num;
        if (byS != cit.A00) {
            cit.A00 = byS;
            int ordinal = byS.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    e7j = cit.A08;
                    num = AnonymousClass00R.A01;
                } else if (ordinal == 2) {
                    e7j = cit.A08;
                    num = AnonymousClass00R.A0C;
                } else {
                    return;
                }
                e7j.BtZ(num);
                return;
            }
            cit.A08.Bsg();
        }
    }

    public C25613Cit(Bundle bundle, Fragment fragment, E7J e7j) {
        int A0K;
        BLR blr;
        int A0K2;
        this.A02 = fragment;
        this.A08 = e7j;
        AnonymousClass1GP A1F = fragment.A1F();
        this.A03 = A1F;
        if (bundle != null) {
            A0K = bundle.getInt("key_bloks_navigation_tracker_backstack_size");
        } else {
            A0K = A1F.A0K();
        }
        this.A01 = A0K;
        BND bnd = new BND(this);
        this.A06 = bnd;
        AnonymousClass1FL A1D = fragment.A1D();
        C27928DoQ doQ = new C27928DoQ(this);
        this.A04 = new C26329Cxm(A1D, doQ);
        if (fragment.A0E != null) {
            AnonymousClass1GP A1F2 = fragment.A19().A1F();
            if (bundle != null) {
                A0K2 = bundle.getInt("key_bloks_navigation_tracker_parent_backstack_size");
            } else {
                A0K2 = A1F2.A0K();
            }
            this.A07 = Integer.valueOf(A0K2);
            blr = new BLR(fragment.A19(), A1F2, doQ, A0K2);
        } else {
            blr = null;
            this.A07 = null;
        }
        this.A05 = blr;
        if (!bnd.A00) {
            bnd.A00 = true;
            AnonymousClass1GP r1 = bnd.A03;
            r1.A0q(bnd, false);
            r1.A0E.add(bnd);
        }
    }
}
