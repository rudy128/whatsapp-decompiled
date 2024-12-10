package com.whatsapp.flows.phoenix.view;

import X.A2V;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass1L9;
import X.AnonymousClass1YF;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C104205Ng;
import X.C108955ca;
import X.C110745gz;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C72453Mb;
import X.C89944dH;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.jid.UserJid;

public final class PhoenixFlowsBottomSheetContainer extends Hilt_PhoenixFlowsBottomSheetContainer {
    public AnonymousClass1L9 A00;
    public C18030ve A01;
    public FlowsInitialLoadingView A02;
    public AnonymousClass129 A03;
    public ViewGroup A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final C18100vl A08 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C104205Ng(this));

    public void A21(Bundle bundle, View view) {
        View view2;
        ViewGroup viewGroup;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Dialog dialog = this.A03;
        if (!(dialog instanceof C110745gz) || dialog == null) {
            view2 = null;
        } else {
            view2 = dialog.findViewById(2131429948);
        }
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        this.A04 = viewGroup;
        UserJid userJid = (UserJid) this.A08.getValue();
        String str = this.A05;
        if (!(userJid == null || str == null)) {
            AnonymousClass3MX.A1Q(new PhoenixFlowsBottomSheetContainer$onViewCreated$1(this, userJid, str, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        }
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C89944dH(this, 12));
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A17 = C18070vi.A17(menu, menuInflater);
        super.A22(menu, menuInflater);
        if (!this.A07) {
            int i = 2131899101;
            if (this.A06) {
                i = 2131899401;
            }
            C108955ca.A1G(menu, 0, -1, i);
            this.A07 = A17;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C108955ca.A1M(this);
        String string = A15().getString("fds_observer_id");
        if (string != null) {
            AnonymousClass00H r0 = this.A0F;
            if (r0 != null) {
                synchronized (r0.get()) {
                    A2V.A01.put(string, AnonymousClass000.A0i());
                }
            } else {
                C18070vi.A11("uiObserversFactory");
                throw null;
            }
        }
        super.onDismiss(dialogInterface);
    }

    public void A1s() {
        super.A1s();
        this.A02 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C18030ve r1 = this.A01;
        if (r1 != null) {
            C18040vf r3 = C18040vf.A02;
            this.A05 = C18020vd.A01(r3, r1, 2069);
            C18030ve r12 = this.A01;
            if (r12 != null) {
                boolean z = false;
                if (C18020vd.A05(r3, r12, 4393)) {
                    C18030ve r13 = this.A01;
                    if (r13 != null) {
                        String A012 = C18020vd.A01(r3, r13, 3063);
                        if (A012 != null && AnonymousClass1YF.A0Y(A012, "extensions_help", false)) {
                            z = true;
                        }
                    }
                }
                this.A06 = z;
                return;
            }
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public boolean A24(MenuItem menuItem) {
        String str;
        Uri A032;
        if (C72453Mb.A0B(menuItem) != -1) {
            return super.A24(menuItem);
        }
        String str2 = this.A05;
        if (str2 == null) {
            return true;
        }
        if (this.A06) {
            A032 = Uri.parse("whatsapp://help/extensions_help");
        } else {
            AnonymousClass129 r0 = this.A03;
            if (r0 != null) {
                A032 = r0.A03(str2);
            } else {
                str = "faqLinkFactory";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass1L9 r2 = this.A00;
        if (r2 != null) {
            r2.CGU(A14(), A032, (AnonymousClass206) null);
            return true;
        }
        str = "activityUtils";
        C18070vi.A11(str);
        throw null;
    }
}
