package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass1HF;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4DG;
import X.AnonymousClass6VM;
import X.AnonymousClass78Q;
import X.C123496Ur;
import X.C18070vi;
import X.C25932Cow;
import X.C27881Xz;
import X.C91314fU;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.util.Log;

public final class ImagineMeOnboardingErrorDialogFragment extends Hilt_ImagineMeOnboardingErrorDialogFragment {
    public WaButtonWithLoader A00;
    public ImagineMeOnboardingCameraFragment A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625371, viewGroup, false);
        Dialog dialog = this.A03;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            Log.e("ImagineMeOnboardingErrorDialogFragment/onCreateView window is null");
            return inflate;
        }
        C18070vi.A0b(inflate);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
        AnonymousClass6VM.A00(window, false);
        C123496Ur r0 = new C25932Cow(window.getDecorView(), window).A00;
        r0.A03(true);
        r0.A04(true);
        AnonymousClass1HF.A0g(inflate, new C91314fU(3));
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass3MY.A0v(A14(), view, 2131233694);
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) AnonymousClass1HF.A06(view, 2131433273);
        waButtonWithLoader.setVariant(C27881Xz.FILLED);
        waButtonWithLoader.setAction(AnonymousClass4DG.XMDS);
        waButtonWithLoader.setButtonText(2131892172);
        waButtonWithLoader.A00 = new AnonymousClass78Q((Object) waButtonWithLoader, (Object) this, 46);
        this.A00 = waButtonWithLoader;
        AnonymousClass3MZ.A1H(AnonymousClass1HF.A06(view, 2131433271), this, 22);
        AnonymousClass3MZ.A1H(AnonymousClass1HF.A06(view, 2131429136), this, 23);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
    }

    public int A25() {
        return 2132083998;
    }
}
