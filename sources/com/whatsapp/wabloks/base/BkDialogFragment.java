package com.whatsapp.wabloks.base;

import X.AnonymousClass000;
import X.AnonymousClass1GP;
import X.C18070vi;
import X.C34001jj;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$5;
import java.io.Serializable;

public abstract class BkDialogFragment extends Hilt_BkDialogFragment {
    /* JADX WARNING: type inference failed for: r2v1, types: [com.whatsapp.wabloks.base.BkFragment, com.whatsapp.wabloks.base.BkScreenFragment, androidx.fragment.app.Fragment, com.whatsapp.wabloks.base.Hilt_BkScreenFragment] */
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624277, viewGroup, false);
        View findViewById = inflate.findViewById(2131436950);
        AnonymousClass1GP A1E = A1E();
        C18070vi.A0X(A1E);
        if (A1E.A0Q("FRAGMENT_CONTENT") == null) {
            C34001jj r7 = new C34001jj(A1E);
            int id = findViewById.getId();
            WaBkGlobalInterpreterExtImpl$5 waBkGlobalInterpreterExtImpl$5 = (WaBkGlobalInterpreterExtImpl$5) this;
            String str = waBkGlobalInterpreterExtImpl$5.A02;
            String str2 = waBkGlobalInterpreterExtImpl$5.A01;
            C18070vi.A0d(str, 0);
            ? hilt_BkScreenFragment = new Hilt_BkScreenFragment();
            hilt_BkScreenFragment.A2A(str);
            BkFragment.A03(hilt_BkScreenFragment);
            hilt_BkScreenFragment.A15().putSerializable("screen_params", str2);
            BkFragment.A03(hilt_BkScreenFragment);
            hilt_BkScreenFragment.A15().putParcelable("screen_cache_config", (Parcelable) null);
            BkFragment.A03(hilt_BkScreenFragment);
            hilt_BkScreenFragment.A15().putSerializable("qpl_params", (Serializable) null);
            hilt_BkScreenFragment.A07 = false;
            r7.A0C(hilt_BkScreenFragment, "FRAGMENT_CONTENT", id);
            r7.A01();
        }
        return inflate;
    }

    public void onConfigurationChanged(Configuration configuration) {
        Window window;
        Window window2;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 2) {
            Dialog dialog = this.A03;
            if (dialog == null || (window2 = dialog.getWindow()) == null) {
                throw AnonymousClass000.A0s("Dialog window is null");
            }
            window2.setLayout((int) (((double) A1D().getWindowManager().getDefaultDisplay().getWidth()) * 0.8d), -2);
        } else if (i == 1) {
            Dialog dialog2 = this.A03;
            if (dialog2 == null || (window = dialog2.getWindow()) == null) {
                throw AnonymousClass000.A0s("Dialog window is null");
            }
            window.setLayout(-2, (int) (((double) A1D().getWindowManager().getDefaultDisplay().getHeight()) * 0.85d));
        }
    }
}
