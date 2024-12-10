package com.whatsapp.wabloks.ui;

import X.A2X;
import X.ALS;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6Nu;
import X.AnonymousClass6ZI;
import X.AnonymousClass75B;
import X.AnonymousClass75G;
import X.AnonymousClass7NI;
import X.AnonymousClass7NK;
import X.AnonymousClass7NL;
import X.AnonymousClass7NP;
import X.AnonymousClass7NQ;
import X.AnonymousClass7NS;
import X.AnonymousClass7NV;
import X.AnonymousClass7NX;
import X.AnonymousClass7OZ;
import X.AnonymousClass86V;
import X.AnonymousClass86X;
import X.AnonymousClass89U;
import X.B9Z;
import X.C003401n;
import X.C108985cd;
import X.C110745gz;
import X.C128046fM;
import X.C133976po;
import X.C154857ro;
import X.C18000vb;
import X.C18070vi;
import X.C199029zJ;
import X.C21106Aea;
import X.C217517g;
import X.C23736Boh;
import X.C25974Cph;
import X.C34001jj;
import X.C72453Mb;
import X.E8A;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaTextView;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.flows.phoenix.view.PhoenixFlowsBottomSheetContainer;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Queue;

public class FcsBottomSheetBaseContainer extends Hilt_FcsBottomSheetBaseContainer implements B9Z {
    public ViewGroup A00;
    public FrameLayout A01;
    public ProgressBar A02;
    public Toolbar A03;
    public AnonymousClass1KB A04;
    public WaTextView A05;
    public WaTextView A06;
    public AnonymousClass86V A07;
    public AnonymousClass86X A08;
    public C18000vb A09;
    public A2X A0A;
    public FdsContentFragmentManager A0B;
    public AnonymousClass6Nu A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public String A0G = "CLOSE";
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M = true;
    public int A0N = 100;
    public ImageView A0O;
    public boolean A0P;
    public final AnonymousClass00H A0Q = C217517g.A00(32851);

    public void A1l(Menu menu) {
        C18070vi.A0d(menu, 0);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        this.A0K = A15().getString("fds_state_name");
        this.A0H = A15().getString("fds_on_back");
        this.A0J = A15().getString("fds_on_back_params");
        this.A0I = A15().getString("fds_observer_id");
        String string = A15().getString("fds_button_style");
        if (string != null) {
            this.A0G = string;
        }
        A2X a2x = this.A0A;
        if (a2x != null) {
            AnonymousClass7NI.A00(a2x, AnonymousClass7NV.class, this, 12);
            AnonymousClass7NI.A00(a2x, AnonymousClass7NS.class, this, 13);
            AnonymousClass7NI.A00(a2x, AnonymousClass7NK.class, this, 7);
            AnonymousClass7NI.A00(a2x, AnonymousClass7NL.class, this, 8);
            AnonymousClass7NI.A00(a2x, AnonymousClass7NQ.class, this, 9);
            AnonymousClass7NI.A00(a2x, AnonymousClass7NP.class, this, 10);
        }
        Context A14 = A14();
        AnonymousClass1FL A1B = A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.wabloks.base.BkFragmentHostSurface");
        AnonymousClass89U r2 = (AnonymousClass89U) A1B;
        C18000vb r1 = this.A09;
        if (r1 != null) {
            this.A0C = new AnonymousClass6Nu(A14, r1, r2);
            View inflate = layoutInflater.inflate(2131627524, viewGroup, false);
            this.A03 = (Toolbar) AnonymousClass1HF.A06(inflate, 2131428143);
            AnonymousClass1FL A1B2 = A1B();
            C18070vi.A0z(A1B2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            C003401n A0K2 = AnonymousClass3MY.A0K((AnonymousClass01E) A1B2, this.A03);
            if (A0K2 != null) {
                A0K2.A0Y(false);
            }
            this.A05 = AnonymousClass3MW.A0T(inflate, 2131436273);
            this.A0O = AnonymousClass3MW.A0G(inflate, 2131428144);
            ProgressBar progressBar = (ProgressBar) C18070vi.A05(inflate, 2131428194);
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(C108985cd.A03(inflate), PorterDuff.Mode.SRC_IN);
            }
            this.A02 = progressBar;
            ViewGroup A0C2 = AnonymousClass3MW.A0C(inflate, 2131437060);
            this.A00 = A0C2;
            if (A0C2 != null) {
                AnonymousClass3MZ.A1M(A0C2, this, 3);
            }
            this.A06 = AnonymousClass3MW.A0T(inflate, 2131437049);
            A2K();
            View A052 = C18070vi.A05(inflate, 2131436951);
            AnonymousClass1GP A1E = A1E();
            C18070vi.A0X(A1E);
            if (this.A06 != null) {
                C34001jj r3 = new C34001jj(A1E);
                String string2 = A15().getString("fds_observer_id");
                FdsContentFragmentManager fdsContentFragmentManager = new FdsContentFragmentManager();
                C108985cd.A15(fdsContentFragmentManager, "fds_observer_id", string2);
                r3.A0C(fdsContentFragmentManager, "fds_content_manager", A052.getId());
                r3.A01();
                this.A0B = fdsContentFragmentManager;
            }
            this.A0N = A15().getInt("fcs_bottom_sheet_max_height_percentage");
            PercentageBasedMaxHeightLinearLayout percentageBasedMaxHeightLinearLayout = (PercentageBasedMaxHeightLinearLayout) inflate.findViewById(2131430826);
            if (percentageBasedMaxHeightLinearLayout != null) {
                percentageBasedMaxHeightLinearLayout.A00 = this.A0N;
            }
            this.A0P = A15().getBoolean("fcs_show_divider_under_nav_bar");
            C18070vi.A05(inflate, 2131430085).setVisibility(C72453Mb.A07(this.A0P ? 1 : 0));
            if (this instanceof PhoenixFlowsBottomSheetContainer) {
                PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer = (PhoenixFlowsBottomSheetContainer) this;
                FlowsInitialLoadingView flowsInitialLoadingView = new FlowsInitialLoadingView(phoenixFlowsBottomSheetContainer.A14());
                flowsInitialLoadingView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                phoenixFlowsBottomSheetContainer.A02 = flowsInitialLoadingView;
                FrameLayout frameLayout = (FrameLayout) C18070vi.A05(inflate, 2131433308);
                frameLayout.setVisibility(0);
                frameLayout.addView(flowsInitialLoadingView);
                this.A01 = frameLayout;
            }
            return inflate;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putString("fds_state_name", this.A0K);
        bundle.putString("fds_on_back", this.A0H);
        bundle.putString("fds_on_back_params", this.A0J);
        bundle.putString("fds_button_style", this.A0G);
        bundle.putString("fds_observer_id", this.A0I);
        bundle.putInt("fcs_bottom_sheet_max_height_percentage", this.A0N);
        bundle.putBoolean("fcs_show_divider_under_nav_bar", this.A0P);
        super.A20(bundle);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        A2X a2x = this.A0A;
        if (a2x != null) {
            AnonymousClass7NI.A00(a2x, AnonymousClass7NX.class, this, 11);
        }
        A1Z(true);
    }

    public boolean A24(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        AnonymousClass6Nu r0 = this.A0C;
        if (r0 != null && r0.Bze(menuItem)) {
            return true;
        }
        Fragment A0O2 = A1E().A0O(2131436951);
        if (A0O2 == null || !A0O2.A24(menuItem)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.B5z] */
    public void onDismiss(DialogInterface dialogInterface) {
        A2X a2x;
        C18070vi.A0d(dialogInterface, 0);
        if (this.A0M && (a2x = this.A0A) != null) {
            a2x.A02(new Object());
        }
        super.onDismiss(dialogInterface);
    }

    public static final void A01(FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer) {
        C23736Boh boh;
        AnonymousClass86V r0 = fcsBottomSheetBaseContainer.A07;
        E8A e8a = null;
        if (r0 != null) {
            boh = r0.BM1();
        } else {
            boh = null;
        }
        AnonymousClass86X r02 = fcsBottomSheetBaseContainer.A08;
        if (r02 != null) {
            e8a = r02.BM3();
        }
        if (boh == null || e8a == null) {
            C72453Mb.A1D(fcsBottomSheetBaseContainer.A01);
            A2X a2x = fcsBottomSheetBaseContainer.A0A;
            if (a2x != null) {
                a2x.A02(new C21106Aea(fcsBottomSheetBaseContainer.A0H, fcsBottomSheetBaseContainer.A0J, true));
                return;
            }
            return;
        }
        C25974Cph.A00(ALS.A06(boh), C199029zJ.A01, e8a);
    }

    public final void A2K() {
        C72453Mb.A1C(this.A03);
        this.A08 = null;
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            ((C133976po) r0.get()).A01(A14(), this.A03, new AnonymousClass7OZ(this, 0), this.A0K, this.A0J, this.A0G);
            return;
        }
        C18070vi.A11("phoenixNavigationBarHelper");
        throw null;
    }

    public void CL9(boolean z) {
        ProgressBar progressBar = this.A02;
        if (progressBar != null) {
            progressBar.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
        A1Z(!z);
        A1D().invalidateOptionsMenu();
    }

    public void A1r() {
        super.A1r();
        C128046fM r2 = (C128046fM) this.A0Q.get();
        r2.A00 = false;
        while (true) {
            Queue queue = r2.A01;
            if (queue.isEmpty()) {
                break;
            }
            queue.remove();
        }
        A2X a2x = this.A0A;
        if (a2x != null) {
            a2x.A04(this);
        }
        this.A0A = null;
    }

    public void A1s() {
        super.A1s();
        this.A03 = null;
        this.A0O = null;
        this.A05 = null;
        this.A02 = null;
        this.A0B = null;
        this.A0C = null;
        this.A01 = null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132084053);
        String string = A15().getString("fds_observer_id");
        if (string != null) {
            AnonymousClass00H r0 = this.A0F;
            if (r0 != null) {
                this.A0A = C108985cd.A0c(r0, string);
            } else {
                C18070vi.A11("uiObserversFactory");
                throw null;
            }
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0h(menu, menuInflater);
        menu.clear();
        AnonymousClass6Nu r0 = this.A0C;
        if (r0 != null) {
            r0.BqX(menu);
        }
        Fragment A0O2 = A1E().A0O(2131436951);
        if (A0O2 != null) {
            A0O2.A22(menu, menuInflater);
        }
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        C18070vi.A0z(A27, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C110745gz r4 = (C110745gz) A27;
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            r4.setOnShowListener(new AnonymousClass75G(A1D(), r4, (AnonymousClass6ZI) r0.get(), new C154857ro(this)));
            r4.setOnKeyListener(new AnonymousClass75B(this, 4));
            return r4;
        }
        C18070vi.A11("bottomSheetDragBehavior");
        throw null;
    }
}
