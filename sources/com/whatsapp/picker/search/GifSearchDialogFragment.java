package com.whatsapp.picker.search;

import X.AnonymousClass1FL;
import X.AnonymousClass77J;
import X.AnonymousClass7MX;
import X.AnonymousClass85A;
import X.AnonymousClass87C;
import X.C140126zz;
import X.C18070vi;
import X.C80753xv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaEditText;
import com.whatsapp.gifsearch.GifSearchContainer;

public final class GifSearchDialogFragment extends Hilt_GifSearchDialogFragment implements AnonymousClass87C, AnonymousClass85A {
    public C140126zz A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        super.A1q(bundle, layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(2131625451, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.whatsapp.gifsearch.GifSearchContainer");
        GifSearchContainer gifSearchContainer = (GifSearchContainer) inflate;
        gifSearchContainer.A00 = 48;
        AnonymousClass1FL A1D = A1D();
        C140126zz r1 = this.A00;
        if (r1 != null) {
            gifSearchContainer.A02(A1D, (C80753xv) null, r1, this);
            gifSearchContainer.A0F = this;
            return gifSearchContainer;
        }
        C18070vi.A11("gifSearchProvider");
        throw null;
    }

    public void BvG(AnonymousClass77J r2, boolean z) {
        WaEditText waEditText;
        C18070vi.A0d(r2, 0);
        GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A0B;
        if (!(gifSearchContainer == null || (waEditText = gifSearchContainer.A06) == null)) {
            waEditText.A0H();
        }
        AnonymousClass7MX r0 = this.A00;
        if (r0 != null) {
            r0.BvG(r2, z);
        }
    }

    public void A1v() {
        GifSearchContainer gifSearchContainer;
        WaEditText waEditText;
        super.A1v();
        View view = this.A0B;
        if ((view instanceof GifSearchContainer) && (gifSearchContainer = (GifSearchContainer) view) != null && (waEditText = gifSearchContainer.A06) != null) {
            waEditText.A0I(false);
        }
    }
}
