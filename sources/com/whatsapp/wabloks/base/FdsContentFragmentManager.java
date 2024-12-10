package com.whatsapp.wabloks.base;

import X.A2X;
import X.AnonymousClass00H;
import X.AnonymousClass1DF;
import X.AnonymousClass3MW;
import X.AnonymousClass7NI;
import X.AnonymousClass7NO;
import X.AnonymousClass7NU;
import X.C108985cd;
import X.C154837rm;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C34001jj;
import X.C72453Mb;
import X.C72473Md;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import java.util.LinkedList;
import java.util.Queue;

public final class FdsContentFragmentManager extends Hilt_FdsContentFragmentManager {
    public AnonymousClass00H A00;
    public boolean A01 = true;
    public FrameLayout A02;
    public final Queue A03 = new LinkedList();
    public final C18100vl A04 = AnonymousClass1DF.A01(new C154837rm(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627525, viewGroup, false);
        this.A02 = (FrameLayout) inflate.findViewById(2131436953);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.B5z] */
    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        String A0y = AnonymousClass3MW.A0y(this.A04);
        if (A0y != null) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                A2X A0c = C108985cd.A0c(r0, A0y);
                A0c.A01(new AnonymousClass7NI(this, 4), AnonymousClass7NU.class, A0c);
                A0c.A01(new AnonymousClass7NI(this, 5), AnonymousClass7NO.class, A0c);
                A0c.A02(new Object());
                return;
            }
            C18070vi.A11("uiObserverFactory");
            throw null;
        }
    }

    public boolean A24(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        Fragment A0O = A1E().A0O(2131436953);
        if (A0O != null) {
            return A0O.A24(menuItem);
        }
        return false;
    }

    public void A1r() {
        String A0y = AnonymousClass3MW.A0y(this.A04);
        if (A0y != null) {
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                C108985cd.A0c(r0, A0y).A04(this);
            } else {
                C18070vi.A11("uiObserverFactory");
                throw null;
            }
        }
        this.A02 = null;
        super.A1r();
    }

    public static final void A00(Fragment fragment, FdsContentFragmentManager fdsContentFragmentManager, String str) {
        C34001jj A0Y = C72453Mb.A0Y(fdsContentFragmentManager);
        A0Y.A0H(str);
        A0Y.A0G = true;
        C72473Md.A19(A0Y);
        FrameLayout frameLayout = fdsContentFragmentManager.A02;
        C17960vV.A05(frameLayout);
        A0Y.A0D(fragment, (String) null, frameLayout.getId());
        A0Y.A01();
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0h(menu, menuInflater);
        Fragment A0O = A1E().A0O(2131436953);
        if (A0O != null) {
            A0O.A22(menu, menuInflater);
        }
    }
}
