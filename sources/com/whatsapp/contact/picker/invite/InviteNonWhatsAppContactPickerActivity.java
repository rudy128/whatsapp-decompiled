package com.whatsapp.contact.picker.invite;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass17K;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1VW;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass48m;
import X.AnonymousClass733;
import X.AnonymousClass783;
import X.AnonymousClass7EH;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C108955ca;
import X.C109005cf;
import X.C109015cg;
import X.C116635yL;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C222219b;
import X.C22801Dg;
import X.C23351Fr;
import X.C23581Gv;
import X.C23838Bqv;
import X.C24671Lf;
import X.C24921Me;
import X.C26623D6r;
import X.C27201Vd;
import X.C27708Djq;
import X.C27709Djr;
import X.C27996DpX;
import X.C28479E2u;
import X.C30191dX;
import X.C36261nb;
import X.C36271nc;
import X.C36711oL;
import X.C37451pZ;
import X.C64782vK;
import X.C72453Mb;
import X.C72463Mc;
import X.C88554a7;
import X.C89354cK;
import X.C89634cm;
import X.C91044f3;
import X.C94164k9;
import android.content.res.ColorStateList;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaImageButton;
import com.whatsapp.contact.picker.PhoneNumberSelectionDialog;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.List;

public final class InviteNonWhatsAppContactPickerActivity extends AnonymousClass1FY implements C23351Fr, C28479E2u {
    public static boolean A0Q = true;
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ListView A04;
    public Toolbar A05;
    public C36271nc A06;
    public AnonymousClass1VW A07;
    public C24671Lf A08;
    public C27201Vd A09;
    public AnonymousClass733 A0A;
    public C36261nb A0B;
    public C116635yL A0C;
    public InviteNonWhatsAppContactPickerViewModel A0D;
    public C36711oL A0E;
    public WDSSearchBar A0F;
    public AnonymousClass00H A0G;
    public ViewGroup A0H;
    public ViewGroup A0I;
    public Button A0J;
    public TextView A0K;
    public C37451pZ A0L;
    public boolean A0M;
    public final C18100vl A0N;
    public final C18100vl A0O;
    public final C23581Gv A0P;

    public static final void A0V(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity, boolean z, boolean z2) {
        if (!z2) {
            View A032 = inviteNonWhatsAppContactPickerActivity.A03();
            ViewGroup viewGroup = inviteNonWhatsAppContactPickerActivity.A0I;
            if (viewGroup == null) {
                C18070vi.A11("shareActionContainer");
                throw null;
            }
            viewGroup.addView(A032);
            ViewGroup viewGroup2 = inviteNonWhatsAppContactPickerActivity.A0I;
            if (viewGroup2 == null) {
                C18070vi.A11("shareActionContainer");
                throw null;
            }
            viewGroup2.setVisibility(0);
        }
        View inflate = inviteNonWhatsAppContactPickerActivity.getLayoutInflater().inflate(2131625857, (ViewGroup) null, false);
        View A062 = AnonymousClass1HF.A06(inflate, 2131436208);
        C18070vi.A0z(A062, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) A062).setText(2131899050);
        ViewGroup viewGroup3 = inviteNonWhatsAppContactPickerActivity.A0H;
        if (viewGroup3 == null) {
            C18070vi.A11("contactsSectionContainer");
            throw null;
        }
        viewGroup3.addView(inflate);
        ViewGroup viewGroup4 = inviteNonWhatsAppContactPickerActivity.A0H;
        if (viewGroup4 == null) {
            C18070vi.A11("contactsSectionContainer");
            throw null;
        }
        viewGroup4.setVisibility(0);
        View view = inviteNonWhatsAppContactPickerActivity.A01;
        if (view == null) {
            C18070vi.A11("emptyView");
            throw null;
        }
        view.setVisibility(0);
        if (!z) {
            if (!C18020vd.A05(C18040vf.A02, inviteNonWhatsAppContactPickerActivity.A0E, 5868)) {
                C36261nb r4 = inviteNonWhatsAppContactPickerActivity.A0B;
                if (r4 != null) {
                    Integer A0Q2 = A0Q(inviteNonWhatsAppContactPickerActivity);
                    C23838Bqv bqv = new C23838Bqv();
                    bqv.A03 = 1;
                    bqv.A04 = A0Q2;
                    bqv.A00 = true;
                    r4.A03.CC7(bqv);
                    TextView textView = inviteNonWhatsAppContactPickerActivity.A0K;
                    if (textView == null) {
                        C18070vi.A11("emptyViewDescription");
                        throw null;
                    }
                    textView.setText(2131894328);
                    Button button = inviteNonWhatsAppContactPickerActivity.A0J;
                    if (button == null) {
                        C18070vi.A11("openPermissionsButton");
                        throw null;
                    } else {
                        button.setVisibility(0);
                        return;
                    }
                } else {
                    C18070vi.A11("inviteFlowLogger");
                    throw null;
                }
            }
        }
        TextView textView2 = inviteNonWhatsAppContactPickerActivity.A0K;
        if (textView2 == null) {
            C18070vi.A11("emptyViewDescription");
            throw null;
        }
        textView2.setText(2131892933);
        Button button2 = inviteNonWhatsAppContactPickerActivity.A0J;
        if (button2 == null) {
            C18070vi.A11("openPermissionsButton");
            throw null;
        } else {
            button2.setVisibility(8);
        }
    }

    public int A31() {
        return 78318969;
    }

    public final void A4b(AnonymousClass7EH r10) {
        String str;
        List<AnonymousClass1E7> list = r10.A01;
        if (list.size() > 1) {
            ArrayList A13 = AnonymousClass000.A13();
            for (AnonymousClass1E7 r1 : list) {
                String A022 = C24921Me.A02(this, this.A00, r1);
                String A023 = AnonymousClass17K.A02(r1);
                C17960vV.A07(A023);
                C18070vi.A0X(A023);
                A13.add(new C89354cK(A022, A023));
            }
            C36261nb r5 = this.A0B;
            if (r5 != null) {
                Integer A0Q2 = A0Q(this);
                C23838Bqv bqv = new C23838Bqv();
                bqv.A03 = 1;
                bqv.A04 = A0Q2;
                bqv.A02 = true;
                bqv.A01 = true;
                r5.A03.CC7(bqv);
                CMk(PhoneNumberSelectionDialog.A00(getString(2131892049, new Object[]{r10.A00}), A13), (String) null);
                return;
            }
            str = "inviteFlowLogger";
        } else {
            AnonymousClass1E7 contact = r10.getContact();
            C17960vV.A07(contact);
            String A024 = AnonymousClass17K.A02(contact);
            C17960vV.A07(A024);
            C18070vi.A0X(A024);
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                str = "viewModel";
            } else {
                inviteNonWhatsAppContactPickerViewModel.A0L.A0F(A024);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        C18070vi.A0d(menu, 0);
        WDSSearchBar wDSSearchBar = this.A0F;
        if (wDSSearchBar == null) {
            str = "wdsSearchBar";
        } else {
            MenuItem icon = menu.add(0, 2131432620, 0, wDSSearchBar.getResources().getString(2131899369)).setIcon(2131232271);
            C18070vi.A0X(icon);
            icon.setShowAsAction(10);
            icon.setOnActionExpandListener(new C89634cm(this, 2));
            this.A00 = icon;
            icon.setShowAsAction(2);
            MenuItem menuItem = this.A00;
            if (menuItem != null) {
                menuItem.setActionView(2131627506);
                MenuItem menuItem2 = this.A00;
                if (menuItem2 != null) {
                    View actionView = menuItem2.getActionView();
                    if (actionView != null && (actionView instanceof WaImageButton)) {
                        actionView.setEnabled(true);
                        actionView.setOnClickListener(new AnonymousClass783(this, 45));
                        ImageView imageView = (ImageView) actionView;
                        imageView.setImageResource(2131232271);
                        AnonymousClass3MY.A0w(this, actionView, 2131899369);
                        imageView.setImageTintList(ColorStateList.valueOf(AnonymousClass3Ma.A00(this, 2130970056, 2131101194)));
                    }
                    InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
                    if (inviteNonWhatsAppContactPickerViewModel == null) {
                        str = "viewModel";
                    } else {
                        C26623D6r.A00(this, inviteNonWhatsAppContactPickerViewModel.A06, new C27996DpX(this), 0);
                        return super.onCreateOptionsMenu(menu);
                    }
                }
            }
            C18070vi.A11("searchMenuItem");
            throw null;
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
            if (inviteNonWhatsAppContactPickerViewModel == null) {
                C18070vi.A11("viewModel");
                throw null;
            }
            inviteNonWhatsAppContactPickerViewModel.A0D.A0F(true);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    public void A2y() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            BEB.A0x(A0A2, r1, this);
            C109015cg.A03(A0A2, r1, this, r1.A5A);
            this.A0G = C000200d.A00(A0A2.A2b);
            this.A07 = BE9.A0W(A0A2);
            this.A08 = (C24671Lf) A0A2.A2g.get();
            this.A09 = BE9.A0Y(A0A2);
            this.A0A = (AnonymousClass733) r1.A2s.get();
            this.A0B = (C36261nb) r1.A2t.get();
            this.A0E = (C36711oL) r1.A4N.get();
            this.A06 = (C36271nc) r1.A4x.get();
        }
    }

    public void BzM(String str) {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            C18070vi.A11("viewModel");
            throw null;
        } else {
            inviteNonWhatsAppContactPickerViewModel.A0L.A0F(str);
        }
    }

    public void onBackPressed() {
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
        if (inviteNonWhatsAppContactPickerViewModel != null) {
            if (C72463Mc.A1Y(inviteNonWhatsAppContactPickerViewModel.A0D.A06())) {
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel2 = this.A0D;
                if (inviteNonWhatsAppContactPickerViewModel2 != null) {
                    inviteNonWhatsAppContactPickerViewModel2.A0D.A0F(false);
                    return;
                }
            } else {
                super.onBackPressed();
                return;
            }
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0119, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A0E, 7478) == false) goto L_0x011b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r14 = r17
            r0 = r18
            super.onCreate(r0)
            r0 = 2131625742(0x7f0e070e, float:1.88787E38)
            r14.setContentView((int) r0)
            r0 = 2131896794(0x7f1229da, float:1.942846E38)
            r14.setTitle(r0)
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r1 = r14.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.widget.Toolbar"
            X.C18070vi.A0z(r1, r0)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r14.A05 = r1
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "toolbar"
        L_0x0027:
            X.C18070vi.A11(r0)
        L_0x002a:
            r0 = 0
            throw r0
        L_0x002c:
            r14.setSupportActionBar(r1)
            X.01n r1 = r14.getSupportActionBar()
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            r0 = 1
            r1.A0W(r0)
            r1.A0G()
            r0 = 2131437029(0x7f0b25e5, float:1.8495945E38)
            android.view.View r1 = r14.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.search.WDSSearchBar"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.wds.components.search.WDSSearchBar r1 = (com.whatsapp.wds.components.search.WDSSearchBar) r1
            r14.A0F = r1
            java.lang.String r2 = "wdsSearchBar"
            if (r1 == 0) goto L_0x026d
            com.whatsapp.wds.components.search.WDSSearchView r1 = r1.A08
            r4 = 1
            X.4rB r0 = new X.4rB
            r0.<init>(r14, r4)
            r1.setOnQueryTextChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r14.A0F
            if (r0 == 0) goto L_0x026d
            com.whatsapp.wds.components.search.WDSSearchView r1 = r0.A08
            X.4CB r0 = X.AnonymousClass4CB.A00
            r1.setTrailingButtonIcon(r0)
            X.1Vd r1 = r14.A09
            if (r1 == 0) goto L_0x0269
            java.lang.String r0 = "invite-non-wa-contact-picker"
            X.1pZ r0 = r1.A06(r14, r0)
            r14.A0L = r0
            X.1It r1 = new X.1It
            r1.<init>(r14)
            java.lang.Class<com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel> r0 = com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel.class
            X.1J2 r6 = r1.A00(r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r6 = (com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel) r6
            r14.A0D = r6
            java.lang.String r7 = "viewModel"
            r9 = 0
            if (r6 == 0) goto L_0x0282
            X.1DT r1 = r6.A0E
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
            r1.A0F(r0)
            X.1DT r5 = r6.A0F
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A0F(r0)
            X.CW0 r2 = r6.A0K
            X.1Dg r3 = r6.A0A
            r1 = 2
            X.D5b r0 = new X.D5b
            r0.<init>(r6, r1)
            r2.A00(r0, r5, r3)
            X.1Dg r1 = r6.A09
            r2 = 0
            X.D6m r0 = new X.D6m
            r0.<init>(r6, r2)
            r1.A0H(r3, r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A02
            X.DpS r0 = new X.DpS
            r0.<init>(r14)
            X.C26623D6r.A00(r14, r1, r0, r2)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A03
            X.DpT r0 = new X.DpT
            r0.<init>(r14)
            X.C26623D6r.A00(r14, r1, r0, r2)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A05
            X.DpU r0 = new X.DpU
            r0.<init>(r14)
            X.C26623D6r.A00(r14, r1, r0, r2)
            X.1Lf r1 = r14.A08
            if (r1 == 0) goto L_0x0279
            X.1Gv r0 = r14.A0P
            r1.registerObserver(r0)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "search_string"
            java.lang.String r5 = r1.getStringExtra(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0102
            X.1KB r3 = r14.A05
            r1 = 5
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r5, r14)
            r3.A0J(r0)
        L_0x0102:
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "hide_share_link"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x011b
            X.0ve r3 = r14.A0E
            r1 = 7478(0x1d36, float:1.0479E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            r3 = 1
            if (r0 != 0) goto L_0x018b
        L_0x011b:
            r3 = 0
            X.0vl r0 = r14.A0N
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x018b
            X.DpW r13 = new X.DpW
            r13.<init>(r14)
            X.Dju r10 = new X.Dju
            r10.<init>(r14)
            X.Djs r11 = new X.Djs
            r11.<init>(r14)
            X.Djt r12 = new X.Djt
            r12.<init>(r14)
            r0 = 2131429327(0x7f0b07cf, float:1.8480324E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r14, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r8 = r14.A0D
            if (r8 == 0) goto L_0x0282
            X.0vl r0 = r14.A0O
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0152
            X.1oL r0 = r14.A0E
            if (r0 == 0) goto L_0x027c
            r9 = r0
        L_0x0152:
            X.C18070vi.A0d(r1, r2)
            android.view.View r1 = r1.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView"
            X.C18070vi.A0z(r1, r0)
            androidx.compose.ui.platform.ComposeView r1 = (androidx.compose.ui.platform.ComposeView) r1
            r1.setVisibility(r2)
            X.DtB r7 = new X.DtB
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0 = 1805807305(0x6ba26ec9, float:3.927383E26)
            X.04D r0 = X.AnonymousClass0LC.A01(r7, r0, r4)
            r1.setContent(r0)
        L_0x0172:
            X.0vl r0 = r14.A0N
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x0181
            android.view.View r1 = r14.A00
            X.1KB r0 = r14.A05
            r14.A39(r1, r0)
        L_0x0181:
            java.lang.String r1 = "is_first_open"
            boolean r0 = A0Q
            r14.A3E(r1, r0, r2)
            A0Q = r2
            return
        L_0x018b:
            r0 = 2131427796(0x7f0b01d4, float:1.8477218E38)
            android.view.View r0 = X.C110885hR.A0A(r14, r0)
            r0.setVisibility(r2)
            r0 = 2131431631(0x7f0b10cf, float:1.8484997E38)
            android.view.View r4 = X.AnonymousClass3MY.A0C(r14, r0)
            r0 = 2131430398(0x7f0b0bfe, float:1.8482496E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r14, r0)
            r14.A01 = r0
            r0 = 2131435369(0x7f0b1f69, float:1.8492578E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r14, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A0I = r0
            r0 = 2131429496(0x7f0b0878, float:1.8480666E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r14, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r14.A0H = r0
            r0 = 2131431801(0x7f0b1179, float:1.8485341E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r14, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r14.A0K = r0
            r0 = 2131428611(0x7f0b0503, float:1.8478871E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r14, r0)
            android.widget.Button r1 = (android.widget.Button) r1
            r14.A0J = r1
            if (r1 != 0) goto L_0x01d7
            java.lang.String r0 = "openPermissionsButton"
            goto L_0x027e
        L_0x01d7:
            r0 = 30
            X.AnonymousClass48m.A00(r1, r14, r0)
            r0 = 2131429424(0x7f0b0830, float:1.848052E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r14, r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r14.A04 = r0
            X.1VW r12 = r14.A07
            if (r12 == 0) goto L_0x0276
            X.1pZ r13 = r14.A0L
            if (r13 != 0) goto L_0x01f3
            java.lang.String r0 = "contactPhotoLoader"
            goto L_0x027e
        L_0x01f3:
            java.util.ArrayList r16 = X.AnonymousClass000.A13()
            X.0vb r15 = r14.A00
            X.C18070vi.A0W(r15)
            X.5yL r11 = new X.5yL
            r11.<init>(r12, r13, r14, r15, r16)
            r14.A0C = r11
            android.view.View r1 = r14.A03()
            r14.A02 = r1
            r14.A03 = r1
            android.widget.ListView r0 = r14.A04
            java.lang.String r6 = "listView"
            if (r0 == 0) goto L_0x0272
            r0.addHeaderView(r1)
            android.widget.ListView r1 = r14.A04
            if (r1 == 0) goto L_0x0272
            android.view.View r0 = r14.A01
            if (r0 != 0) goto L_0x021f
            java.lang.String r0 = "emptyView"
            goto L_0x027e
        L_0x021f:
            r1.setEmptyView(r0)
            android.widget.ListView r0 = r14.A04
            if (r0 == 0) goto L_0x0272
            r0.setAdapter(r11)
            android.widget.ListView r0 = r14.A04
            if (r0 == 0) goto L_0x0272
            r14.registerForContextMenu(r0)
            android.widget.ListView r5 = r14.A04
            if (r5 == 0) goto L_0x0272
            r1 = 3
            X.4eg r0 = new X.4eg
            r0.<init>(r14, r1)
            r5.setOnItemClickListener(r0)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A06
            X.DpV r0 = new X.DpV
            r0.<init>(r14)
            X.C26623D6r.A00(r14, r1, r0, r2)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A08
            X.Dqv r0 = new X.Dqv
            r0.<init>(r4, r14, r3)
            X.C26623D6r.A00(r14, r1, r0, r2)
            com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel r0 = r14.A0D
            if (r0 == 0) goto L_0x0282
            X.1DS r1 = r0.A04
            X.Dqd r0 = new X.Dqd
            r0.<init>(r14, r3)
            X.C26623D6r.A00(r14, r1, r0, r2)
            goto L_0x0172
        L_0x0269:
            java.lang.String r0 = "contactPhotos"
            goto L_0x0027
        L_0x026d:
            X.C18070vi.A11(r2)
            goto L_0x002a
        L_0x0272:
            X.C18070vi.A11(r6)
            throw r9
        L_0x0276:
            java.lang.String r0 = "contactAvatars"
            goto L_0x027e
        L_0x0279:
            java.lang.String r0 = "contactObservers"
            goto L_0x027e
        L_0x027c:
            java.lang.String r0 = "scrollPerfLoggerManager"
        L_0x027e:
            X.C18070vi.A11(r0)
            throw r9
        L_0x0282:
            X.C18070vi.A11(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity.onCreate(android.os.Bundle):void");
    }

    public InviteNonWhatsAppContactPickerActivity(int i) {
        this.A0M = false;
        C91044f3.A00(this, 0);
    }

    private final View A03() {
        View A092 = AnonymousClass3MX.A09(getLayoutInflater(), (ViewGroup) null, 2131624680);
        C88554a7.A04(A092, 2131232296, AnonymousClass1YL.A00(A092.getContext(), 2130970097, AnonymousClass1YL.A00(this, 2130971957, 2131103410)), 2131231553, 2131896095, 0);
        AnonymousClass48m.A00(A092, this, 29);
        return A092;
    }

    public static final Integer A0Q(InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        int intExtra = inviteNonWhatsAppContactPickerActivity.getIntent().getIntExtra("invite_source", 0);
        if (intExtra == 0) {
            return null;
        }
        return Integer.valueOf(intExtra);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        A33.A04 = true;
        A33.A00(C108955ca.A0x(this), 18);
        return A33;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C24671Lf r1 = this.A08;
        if (r1 != null) {
            r1.unregisterObserver(this.A0P);
            C37451pZ r0 = this.A0L;
            if (r0 == null) {
                str = "contactPhotoLoader";
            } else {
                r0.A02();
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    str = "viewModel";
                } else {
                    C22801Dg r12 = inviteNonWhatsAppContactPickerViewModel.A0A;
                    r12.A0G(inviteNonWhatsAppContactPickerViewModel.A0F);
                    inviteNonWhatsAppContactPickerViewModel.A09.A0G(r12);
                    return;
                }
            }
        } else {
            str = "contactObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        String str;
        super.onResume();
        InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = this.A0D;
        if (inviteNonWhatsAppContactPickerViewModel == null) {
            str = "viewModel";
        } else {
            AnonymousClass00H r0 = this.A0G;
            if (r0 != null) {
                inviteNonWhatsAppContactPickerViewModel.A0C.A0F(Boolean.valueOf(((C30191dX) r0.get()).A00()));
                if (!C72453Mb.A1a(this.A0N) && C72453Mb.A1a(this.A0O)) {
                    C36711oL r02 = this.A0E;
                    if (r02 != null) {
                        r02.A02(this);
                        ListView listView = this.A04;
                        if (listView == null) {
                            str = "listView";
                        } else {
                            listView.setOnScrollListener(new C64782vK(this, 6));
                            return;
                        }
                    } else {
                        str = "scrollPerfLoggerManager";
                    }
                } else {
                    return;
                }
            } else {
                str = "contactAccessHelper";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public InviteNonWhatsAppContactPickerActivity() {
        this(0);
        this.A0N = AnonymousClass1DF.A01(new C27708Djq(this));
        this.A0O = AnonymousClass1DF.A01(new C27709Djr(this));
        this.A0P = new C94164k9(this, 10);
    }
}
