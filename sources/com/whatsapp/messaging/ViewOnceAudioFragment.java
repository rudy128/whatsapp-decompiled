package com.whatsapp.messaging;

import X.AnonymousClass206;
import X.AnonymousClass3MX;
import X.C134196qC;
import X.C18070vi;
import X.C18100vl;
import X.C23819BqW;
import X.C27201Vd;
import X.C31131f4;
import X.C37451pZ;
import X.C441822l;
import X.C99164sN;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class ViewOnceAudioFragment extends Hilt_ViewOnceAudioFragment {
    public C27201Vd A00;
    public C134196qC A01;
    public C31131f4 A02;
    public final C18100vl A03 = C99164sN.A01(this, 4);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627370, viewGroup, false);
        AnonymousClass3MX.A1A(A14(), inflate, 2131102857);
        inflate.setVisibility(0);
        A1Z(true);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131427878);
        AnonymousClass206 r9 = this.A02;
        if (r9 == null) {
            str = "fMessage";
        } else {
            C441822l r92 = (C441822l) r9;
            Context A14 = A14();
            C37451pZ r5 = (C37451pZ) AnonymousClass3MX.A14(this.A03);
            C134196qC r7 = this.A01;
            if (r7 != null) {
                C31131f4 r8 = this.A02;
                if (r8 != null) {
                    C23819BqW bqW = new C23819BqW(A14, r5, this, r7, r8, r92);
                    bqW.A2W(true);
                    bqW.setEnabled(false);
                    bqW.setClickable(false);
                    bqW.setLongClickable(false);
                    bqW.A2i = false;
                    viewGroup.removeAllViews();
                    viewGroup.addView(bqW);
                    return;
                }
                str = "messageAudioPlayerProvider";
            } else {
                str = "messageAudioPlayerFactory";
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
