package com.whatsapp.payments.ui;

import X.AGI;
import X.AXO;
import X.AXS;
import X.AnonymousClass000;
import X.AnonymousClass01E;
import X.AnonymousClass02n;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass17K;
import X.AnonymousClass18O;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KN;
import X.AnonymousClass1QJ;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass74O;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.BGJ;
import X.C003401n;
import X.C108995ce;
import X.C1406772n;
import X.C17880vN;
import X.C18000vb;
import X.C185069by;
import X.C186299dy;
import X.C19740yt;
import X.C19830z4;
import X.C20118A8b;
import X.C20337AGt;
import X.C22801Dg;
import X.C27201Vd;
import X.C37451pZ;
import X.C40501uo;
import X.C72453Mb;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CopyableTextView;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;
import com.whatsapp.util.Log;

public class IndiaUpiMyQrFragment extends Hilt_IndiaUpiMyQrFragment {
    public View A00;
    public TextView A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11S A03;
    public WaTextView A04;
    public AnonymousClass1VW A05;
    public C27201Vd A06;
    public C19830z4 A07;
    public C18000vb A08;
    public AnonymousClass1QJ A09;
    public IndiaUpiDisplaySecureQrCodeView A0A;
    public IndiaUpiSecureQrCodeViewModel A0B;
    public C186299dy A0C;
    public ImageView A0D;
    public ImageView A0E;
    public C37451pZ A0F;
    public final AnonymousClass02n A0G = CDw(new AGI((Object) this, 14), new Object());

    public static IndiaUpiMyQrFragment A00(String str) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("extra_account_holder_name", str);
        A0D2.putInt("action_bar_title_res_id", 0);
        A0D2.putBoolean("bottom_icon_visible", true);
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = new IndiaUpiMyQrFragment();
        indiaUpiMyQrFragment.A1R(A0D2);
        return indiaUpiMyQrFragment;
    }

    public static void A01(C20118A8b a8b, IndiaUpiMyQrFragment indiaUpiMyQrFragment) {
        TextView textView;
        int i;
        Object[] objArr;
        AnonymousClass1KJ A012 = indiaUpiMyQrFragment.A09.A01();
        if (TextUtils.isEmpty(a8b.A0A) || A012 == null) {
            textView = indiaUpiMyQrFragment.A01;
            i = 2131895401;
            objArr = new Object[]{a8b.A09};
        } else {
            AnonymousClass1KN A0H = AnonymousClass8BT.A0H(A012, a8b.A0A);
            textView = indiaUpiMyQrFragment.A01;
            i = 2131895400;
            objArr = AnonymousClass3MW.A1b();
            objArr[0] = A012.BLc(indiaUpiMyQrFragment.A08, A0H);
            objArr[1] = a8b.A09;
        }
        AnonymousClass8BT.A18(textView, indiaUpiMyQrFragment, objArr, i);
        indiaUpiMyQrFragment.A01.setVisibility(0);
    }

    public static void A02(IndiaUpiMyQrFragment indiaUpiMyQrFragment, boolean z) {
        AnonymousClass11S r0 = indiaUpiMyQrFragment.A03;
        r0.A0I();
        if (r0.A0D == null) {
            return;
        }
        if (z) {
            C37451pZ r2 = indiaUpiMyQrFragment.A0F;
            AnonymousClass11S r02 = indiaUpiMyQrFragment.A03;
            r02.A0I();
            r2.A07(indiaUpiMyQrFragment.A0E, r02.A0D);
        } else if (indiaUpiMyQrFragment.A07.A0I() != 0) {
            AnonymousClass1VW r22 = indiaUpiMyQrFragment.A05;
            ImageView imageView = indiaUpiMyQrFragment.A0E;
            AnonymousClass11S r03 = indiaUpiMyQrFragment.A03;
            r03.A0I();
            r22.A0C(imageView, r03.A0D);
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        View view;
        if (i == 1006) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A0A;
            int i3 = 8;
            if (indiaUpiDisplaySecureQrCodeView.A06.getVisibility() == 8) {
                view = indiaUpiDisplaySecureQrCodeView.A05;
            } else {
                view = indiaUpiDisplaySecureQrCodeView.A02;
            }
            view.setVisibility(0);
            boolean A092 = indiaUpiDisplaySecureQrCodeView.A0B.A09(AnonymousClass18O.A0W);
            TextView textView = indiaUpiDisplaySecureQrCodeView.A08;
            if (A092 && indiaUpiDisplaySecureQrCodeView.A04.getVisibility() != 0) {
                i3 = 0;
            }
            textView.setVisibility(i3);
            return;
        }
        super.A1w(i, i2, intent);
    }

    public void A21(Bundle bundle, View view) {
        boolean z;
        String[] A092;
        Object obj;
        String[] A093;
        String trim;
        this.A0F = this.A06.A06(view.getContext(), "india-upi-my-qr-fragment");
        this.A00 = AnonymousClass1HF.A06(view, 2131434264);
        this.A0E = AnonymousClass3MW.A0G(view, 2131429433);
        this.A01 = AnonymousClass3MW.A0J(view, 2131434812);
        this.A0A = (IndiaUpiDisplaySecureQrCodeView) AnonymousClass1HF.A06(view, 2131430069);
        this.A0D = AnonymousClass3MW.A0G(view, 2131428330);
        Bundle bundle2 = this.A06;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_account_holder_name");
            z = bundle2.getBoolean("bottom_icon_visible", true);
        } else {
            z = true;
        }
        this.A0D.setVisibility(C72453Mb.A07(z ? 1 : 0));
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = (IndiaUpiSecureQrCodeViewModel) AnonymousClass3MW.A0N(this).A00(IndiaUpiSecureQrCodeViewModel.class);
        this.A0B = indiaUpiSecureQrCodeViewModel;
        C20337AGt aGt = new C20337AGt(this, 15);
        C20337AGt aGt2 = new C20337AGt(this, 16);
        C22801Dg r2 = indiaUpiSecureQrCodeViewModel.A01;
        r2.A0A(this, aGt);
        C22801Dg r8 = indiaUpiSecureQrCodeViewModel.A00;
        r8.A0A(this, aGt2);
        AXS axs = indiaUpiSecureQrCodeViewModel.A06;
        synchronized (axs) {
            A092 = AXS.A09(axs, "signedQrCode", "signedQrCodeTs");
        }
        if (TextUtils.isEmpty(A092[0])) {
            C20118A8b a8b = (C20118A8b) AnonymousClass8BS.A0W(r8);
            a8b.A04 = "01";
            String A002 = AXS.A00(axs);
            a8b.A0O = A002;
            if (TextUtils.isEmpty(A002)) {
                obj = new C185069by(-1, -1);
            } else {
                if (TextUtils.isEmpty(str)) {
                    trim = indiaUpiSecureQrCodeViewModel.A05.A00.getString("push_name", "");
                    indiaUpiSecureQrCodeViewModel.A07.A0B(new AXO(indiaUpiSecureQrCodeViewModel, a8b, 9), AnonymousClass8BU.A0U(indiaUpiSecureQrCodeViewModel.A08));
                } else {
                    trim = str.trim();
                }
                a8b.A09 = trim;
                r2 = r8;
                obj = a8b;
            }
        } else {
            r2 = r8;
            obj = C20118A8b.A01(A092[0], "SCANNED_QR_CODE");
        }
        r2.A0F(obj);
        this.A0A.setup(this.A0B);
        A02(this, true);
        CopyableTextView copyableTextView = (CopyableTextView) AnonymousClass1HF.A06(view, 2131436648);
        String str2 = ((C20118A8b) AnonymousClass8BS.A0W(this.A0B.A00)).A0O;
        copyableTextView.A02 = str2;
        copyableTextView.setText(AnonymousClass3MY.A0o(this, str2, 0, 2131898300));
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131436602);
        this.A04 = A0T;
        A0T.setText(((C20118A8b) AnonymousClass8BS.A0W(this.A0B.A00)).A09);
        String A0B2 = this.A03.A0B();
        if (A0B2 != null) {
            AnonymousClass3MW.A0J(view, 2131436647).setText(AnonymousClass17K.A06(A0B2));
        }
        AnonymousClass8BT.A18(this.A01, this, new Object[]{((C20118A8b) AnonymousClass8BS.A0W(this.A0B.A00)).A09}, 2131895401);
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel2 = this.A0B;
        AXS axs2 = indiaUpiSecureQrCodeViewModel2.A06;
        synchronized (axs2) {
            A093 = AXS.A09(axs2, C17880vN.A1b("signedQrCode", "signedQrCodeTs", 2, 1));
        }
        if (!indiaUpiSecureQrCodeViewModel2.A03.A09(AnonymousClass18O.A0W) || (!TextUtils.isEmpty(A093[0]) && !TextUtils.isEmpty(A093[1]) && AnonymousClass11P.A01(indiaUpiSecureQrCodeViewModel2.A04) - Long.parseLong(A093[1]) <= 259200000)) {
            IndiaUpiSecureQrCodeViewModel.A03(indiaUpiSecureQrCodeViewModel2, 0, -1);
        } else {
            IndiaUpiSecureQrCodeViewModel.A00(indiaUpiSecureQrCodeViewModel2, -1);
        }
        A1Z(true);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625596);
    }

    public void A1s() {
        super.A1s();
        this.A0F.A02();
        this.A00 = null;
        this.A0E = null;
        this.A04 = null;
        this.A01 = null;
        this.A0A = null;
        this.A0D = null;
    }

    public void A1v() {
        C003401n supportActionBar;
        super.A1v();
        Bundle bundle = this.A06;
        AnonymousClass1FL A1D = A1D();
        if ((A1D instanceof AnonymousClass1FY) && bundle != null && bundle.getInt("action_bar_title_res_id", 0) != 0 && (supportActionBar = ((AnonymousClass01E) A1D).getSupportActionBar()) != null) {
            AnonymousClass8BU.A17(supportActionBar, bundle.getInt("action_bar_title_res_id"));
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        menu.add(0, 2131432626, 0, 2131899418).setIcon(C40501uo.A00(A14().getTheme(), AnonymousClass3MZ.A09(this), 2131232296)).setShowAsAction(1);
        menu.add(0, 2131432613, 0, 2131894720);
    }

    public boolean A24(MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == 2131432626) {
            if (C19740yt.A01(A14(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i = 2131893682;
                } else {
                    i = 2131893685;
                    if (i2 < 33) {
                        i = 2131893684;
                    }
                }
                this.A0G.A02((C1406772n) null, AnonymousClass74O.A03(A14(), 2131893683, i, true));
            } else {
                IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel = this.A0B;
                if (indiaUpiSecureQrCodeViewModel != null) {
                    IndiaUpiSecureQrCodeViewModel.A04(indiaUpiSecureQrCodeViewModel, AnonymousClass3Ma.A12(this.A0A.A0F), 0);
                    return true;
                }
            }
        } else if (menuItem.getItemId() != 2131432613) {
            return false;
        } else {
            if (!(this.A0A.A09 == null || A1B() == null || this.A00 == null)) {
                A02(this, false);
                this.A00.setDrawingCacheEnabled(true);
                this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                View view = this.A00;
                view.layout(0, 0, view.getMeasuredWidth(), this.A00.getMeasuredHeight());
                this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.A00.buildDrawingCache(true);
                Bitmap createBitmap = Bitmap.createBitmap(this.A00.getDrawingCache());
                try {
                    AnonymousClass1FL A1D = A1D();
                    String str = ((C20118A8b) AnonymousClass8BS.A0W(this.A0B.A00)).A09;
                    PrintManager printManager = (PrintManager) AnonymousClass11C.A02(A1D, "print");
                    if (printManager == null) {
                        Log.e("PAY: payments-display-qr/print/no-print-manager");
                    } else {
                        printManager.print(str, new BGJ(A1D, createBitmap), (PrintAttributes) null);
                    }
                } catch (Exception e) {
                    C108995ce.A1M("IndiaUpiMyQrFragment/onPrintQrCodeClicked facing issues ", AnonymousClass000.A10(), e);
                }
                this.A00.setDrawingCacheEnabled(false);
                A02(this, true);
                return true;
            }
        }
        return true;
    }
}
