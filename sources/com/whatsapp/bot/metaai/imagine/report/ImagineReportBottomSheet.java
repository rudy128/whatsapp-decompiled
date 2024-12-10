package com.whatsapp.bot.metaai.imagine.report;

import X.AnonymousClass3MZ;
import X.AnonymousClass4bH;
import X.AnonymousClass86E;
import X.C139436yq;
import X.C18070vi;
import X.C19740yt;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class ImagineReportBottomSheet extends Hilt_ImagineReportBottomSheet implements AnonymousClass86E {
    public View.OnClickListener A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131626717, viewGroup, false);
        C72483Me.A0m(inflate, this);
        C72473Md.A13(inflate, this);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A05 = C18070vi.A05(view, 2131434564);
        View A052 = C18070vi.A05(view, 2131434530);
        AnonymousClass3MZ.A1H(A05, this, 14);
        AnonymousClass3MZ.A1H(A052, this, 15);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        this.A00 = null;
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }

    public Dialog A27(Bundle bundle) {
        Window window;
        Dialog A27 = super.A27(bundle);
        A27.setOnShowListener(new AnonymousClass4bH(this, 1));
        Context A1n = A1n();
        if (!(A1n == null || (window = A27.getWindow()) == null)) {
            window.setNavigationBarColor(C19740yt.A00(A1n, 2131099919));
        }
        return A27;
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }

    public int A25() {
        return 2132084859;
    }
}
