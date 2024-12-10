package com.whatsapp.payments.onboarding;

import X.A0F;
import X.A3C;
import X.A43;
import X.A7B;
import X.A7U;
import X.AGC;
import X.AGK;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass1QS;
import X.AnonymousClass1YF;
import X.AnonymousClass3Gr;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4VT;
import X.AnonymousClass4VZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8HG;
import X.AnonymousClass8HM;
import X.AnonymousClass8ID;
import X.AnonymousClass8pH;
import X.AnonymousClass8pS;
import X.AnonymousClass91T;
import X.AnonymousClass91U;
import X.AnonymousClass9B7;
import X.B5U;
import X.BBA;
import X.C108945cZ;
import X.C108965cb;
import X.C137116uw;
import X.C137476vW;
import X.C1418477e;
import X.C161748Hp;
import X.C171858sO;
import X.C175758zE;
import X.C175768zF;
import X.C1764594h;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18090vk;
import X.C182559Uv;
import X.C191049lw;
import X.C192459oQ;
import X.C196259ui;
import X.C19740yt;
import X.C19967A1c;
import X.C20061A5k;
import X.C20063A5m;
import X.C20752AXh;
import X.C21054Adk;
import X.C21448AkF;
import X.C21486Akr;
import X.C21528Alb;
import X.C22462B8u;
import X.C26571Sq;
import X.C27641Ww;
import X.C29431cG;
import X.C31061ex;
import X.C37961qT;
import X.C60442o2;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import X.C72473Md;
import X.C86284Ra;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity;
import com.whatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.whatsapp.scroller.RecyclerFastScroller;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class IndiaUpiBankPickerActivity extends AnonymousClass91T implements BBA, B5U {
    public int A00;
    public TextView A01;
    public RecyclerView A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public C182559Uv A05;
    public AnonymousClass1KI A06;
    public C20752AXh A07;
    public A7B A08;
    public C196259ui A09;
    public C175768zF A0A;
    public C161748Hp A0B;
    public AnonymousClass9B7 A0C;
    public A0F A0D;
    public C1764594h A0E;
    public A43 A0F;
    public AnonymousClass4VZ A0G;
    public String A0H;
    public ArrayList A0I;
    public List A0J;
    public boolean A0K;
    public boolean A0L;
    public LinearLayout A0M;
    public AnonymousClass4VT A0N;
    public boolean A0O;
    public final C171858sO A0P;
    public final AnonymousClass1QE A0Q;
    public final AtomicBoolean A0R;

    public static boolean A0r(AnonymousClass8pH r4, A7U a7u, AXS axs, ArrayList arrayList, ArrayList arrayList2) {
        return AnonymousClass000.A1R(arrayList.size()) ? ((AnonymousClass8pS) arrayList.get(0)).A00 <= 1 || !TextUtils.isEmpty(axs.A0G()) || !(arrayList2 == null || arrayList2.size() <= 0 || r4 == null) : a7u.A0B();
    }

    public void BmQ(AnonymousClass8pH r6, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        if (z) {
            AXS axs = this.A0N;
            synchronized (axs) {
                C17880vN.A1F(AnonymousClass8BU.A07(axs.A01), "is_payment_account_created", true);
            }
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
            if (paymentIncentiveViewModel != null) {
                C21448AkF.A00(paymentIncentiveViewModel.A07, paymentIncentiveViewModel, 3);
            }
        }
        if (A0r(r6, this.A0M, this.A0N, arrayList, arrayList2)) {
            if (!this.A0M.A0B() || C20063A5m.A03(this.A0b)) {
                ArrayList A10 = C17880vN.A10(arrayList);
                C21486Akr.A01(37, A10);
                A7U.A00(this).A00(A10);
            } else {
                A7U.A00(this).A00(arrayList);
            }
            A7U a7u = this.A0M;
            a7u.A05 = arrayList2;
            a7u.A03 = r6;
            C17900vP.A0Y(arrayList2, "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspConfig: ", AnonymousClass000.A10());
            C17900vP.A0Y(r6, "PAY: IndiaUpiPaymentSetup setPspAndBanksList pspRouting: ", AnonymousClass000.A10());
            AnonymousClass1QE r4 = this.A0Q;
            StringBuilder A102 = AnonymousClass000.A10();
            C17890vO.A14("banks returned: ", A102, arrayList);
            AnonymousClass8BS.A19(r4, A102);
            A0V((A7B) null, z);
            if (!this.A0n) {
                A0c(this);
            }
        } else {
            this.A0Q.A05("Invalid Banks Data, throwing error");
            BmR(A7B.A00(), false, z);
        }
        if (this.A0M.A0B() && this.A0R.compareAndSet(true, false)) {
            AnonymousClass8pS r42 = this.A0L;
            ArrayList arrayList3 = A7U.A00(this).A03;
            if (r42 != null) {
                Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass8pS r2 = (AnonymousClass8pS) it.next();
                    C1418477e r1 = r2.A01;
                    if (r1 != null && r1.equals(r42.A01)) {
                        if (!C137476vW.A00(r2.A0F)) {
                            this.A0L = r2;
                        }
                    }
                }
            }
            A03(this.A0L, this, this.A00);
        }
    }

    public static void A03(AnonymousClass8pS r11, IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, int i) {
        Class cls;
        if (indiaUpiBankPickerActivity.A0N.A0T(r11, indiaUpiBankPickerActivity.A0S, indiaUpiBankPickerActivity.A0M.A05(r11))) {
            try {
                JSONObject A15 = C17880vN.A15();
                A15.put("step", "SelectBankStep");
                AnonymousClass8BS.A1C(indiaUpiBankPickerActivity.A0K.A05(), "completedSteps", A15);
                A15.put("isCompleteWith2FA", indiaUpiBankPickerActivity.A0K.A0E());
                A15.put("isCompleteWithout2FA", indiaUpiBankPickerActivity.A0K.A0F());
                String A052 = indiaUpiBankPickerActivity.A0M.A05(r11);
                A15.put("pspForDeviceBinding", A052);
                A15.put("isDeviceBindingDone", indiaUpiBankPickerActivity.A0N.A0T(r11, indiaUpiBankPickerActivity.A0S, A052));
                C175758zE r5 = new C175758zE(indiaUpiBankPickerActivity.A05, indiaUpiBankPickerActivity.A0E, AnonymousClass8BT.A0M(indiaUpiBankPickerActivity), indiaUpiBankPickerActivity.A0M, indiaUpiBankPickerActivity.A0N);
                r5.A00 = A15;
                r5.A00("SKIPPED_DEVICE_BINDING", (List) null);
            } catch (JSONException e) {
                Log.e("IndiaUpiBankPickerActivity/logSkippedDeviceBindingEvent", e);
                indiaUpiBankPickerActivity.A03.A0G("payments/log-skipped-device-binding-event-failed", e.getLocalizedMessage(), false);
            }
            cls = IndiaUpiBankAccountPickerActivity.class;
        } else {
            cls = IndiaUpiSimVerificationActivity.class;
        }
        Intent A072 = AnonymousClass8BR.A07(indiaUpiBankPickerActivity, cls);
        indiaUpiBankPickerActivity.A0E.A00.A08("bankSelected");
        indiaUpiBankPickerActivity.A4v(A072);
        A072.putExtra("extra_previous_screen", "nav_bank_select");
        C60442o2.A00(A072, indiaUpiBankPickerActivity.A05, "bankPicker");
        indiaUpiBankPickerActivity.A3q(A072, true);
        C171858sO r1 = indiaUpiBankPickerActivity.A0P;
        r1.A02 = Boolean.valueOf(indiaUpiBankPickerActivity.A0L);
        String str = indiaUpiBankPickerActivity.A0H;
        r1.A0P = str;
        r1.A04 = C108945cZ.A1A(TextUtils.isEmpty(str));
        r1.A0Q = (String) AnonymousClass8BT.A0q(r11.A01);
        r1.A0J = C17880vN.A0n(i);
        r1.A0b = "nav_bank_select";
        r1.A0Y = indiaUpiBankPickerActivity.A0c;
        r1.A0a = indiaUpiBankPickerActivity.A0f;
        r1.A08 = 1;
        r1.A0P = indiaUpiBankPickerActivity.A0H;
        r1.A07 = C17880vN.A0l();
        AZ6.A02(r1, indiaUpiBankPickerActivity);
    }

    public static void A0Q(A7B a7b, IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, boolean z) {
        String str;
        int i;
        if (z) {
            str = "upi-batch";
        } else {
            str = "upi-get-banks";
        }
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity2 = indiaUpiBankPickerActivity;
        if (!C20752AXh.A01(indiaUpiBankPickerActivity, str, a7b.A00, false)) {
            AnonymousClass1QE r4 = indiaUpiBankPickerActivity.A0Q;
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(" failed with error: ");
            A11.append(a7b);
            AnonymousClass8BV.A1E(r4, "; showErrorAndFinish", A11);
            int i2 = a7b.A00;
            if (i2 == 21129) {
                indiaUpiBankPickerActivity2.A3j((Context) null, 2131897487, 2131897486, 2131899286, (Integer) null, (Integer) null, (String) null, new C21528Alb(indiaUpiBankPickerActivity, 35), (C18090vk) null, (String[]) null);
                return;
            }
            C19967A1c A022 = indiaUpiBankPickerActivity.A07.A02(indiaUpiBankPickerActivity.A09, i2);
            indiaUpiBankPickerActivity.A0E.A00.A0C(3);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("showErrorAndFinish: ");
            AnonymousClass8BV.A1F(r4, A10, A022.A00);
            indiaUpiBankPickerActivity.A4p();
            if (A022.A00 == 0) {
                A022.A00 = 2131894057;
                String str2 = indiaUpiBankPickerActivity.A09.A04;
                if ("upi-batch".equalsIgnoreCase(str2)) {
                    i = 2131893855;
                } else if ("upi-get-banks".equalsIgnoreCase(str2)) {
                    i = 2131893854;
                }
                A022.A00 = i;
            }
            if (indiaUpiBankPickerActivity.A0l) {
                indiaUpiBankPickerActivity.A4o();
                Intent A1H = AnonymousClass91U.A1H(indiaUpiBankPickerActivity, A022);
                A1H.putExtra("error", A022.A00);
                indiaUpiBankPickerActivity.A4v(A1H);
                A1H.putExtra("extra_skip_value_props_display", false);
                indiaUpiBankPickerActivity.A3q(A1H, true);
                return;
            }
            String A002 = A022.A00(indiaUpiBankPickerActivity);
            LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
            legacyMessageDialogFragment.A1R(AnonymousClass8BX.A0E(A002));
            AnonymousClass3MY.A1H(legacyMessageDialogFragment, indiaUpiBankPickerActivity, (String) null);
        }
    }

    private void A0V(A7B a7b, boolean z) {
        AZ6 az6 = this.A0S;
        int i = 4;
        if (z) {
            i = 3;
        }
        C171858sO A052 = az6.A05(a7b, i);
        A052.A0Y = this.A0c;
        A052.A0b = "nav_bank_select";
        A052.A0a = this.A0f;
        AZ6.A02(A052, this);
        AnonymousClass8BX.A1D(this.A0Q, A052, "logBanksList: ", AnonymousClass000.A10());
    }

    public static void A0c(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity) {
        A7U a7u = indiaUpiBankPickerActivity.A0M;
        AXS axs = indiaUpiBankPickerActivity.A0N;
        ArrayList arrayList = ((C191049lw) a7u.A09.get()).A03;
        A7U a7u2 = indiaUpiBankPickerActivity.A0M;
        if (A0r(a7u2.A03, a7u, axs, arrayList, a7u2.A05) || !indiaUpiBankPickerActivity.A0M.A0B() || "CREDIT".equals(indiaUpiBankPickerActivity.A0b)) {
            indiaUpiBankPickerActivity.A0q(A7U.A00(indiaUpiBankPickerActivity).A03);
        }
    }

    public static void A0d(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, Integer num) {
        C171858sO r1 = indiaUpiBankPickerActivity.A0P;
        r1.A0b = "nav_bank_select";
        r1.A0Y = indiaUpiBankPickerActivity.A0c;
        r1.A08 = C17880vN.A0h();
        r1.A0a = indiaUpiBankPickerActivity.A0f;
        r1.A07 = num;
        r1.A02 = Boolean.valueOf(indiaUpiBankPickerActivity.A0L);
        AZ6.A02(r1, indiaUpiBankPickerActivity);
    }

    public void A2y() {
        if (!this.A0O) {
            this.A0O = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            this.A0D = (A0F) r1.A7s.get();
            this.A0F = (A43) r2.AW8.get();
            this.A07 = AnonymousClass8BU.A0M(r1);
            this.A06 = AnonymousClass8BT.A0I(r2);
            this.A0E = (C1764594h) r1.ACM.get();
            this.A05 = (C182559Uv) A002.A39.get();
        }
    }

    public void A3h(int i) {
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i != 2131893803) {
            A4o();
            finish();
        }
    }

    public void BmR(A7B a7b, boolean z, boolean z2) {
        if (!z && !z2) {
            AXS axs = this.A0N;
            synchronized (axs) {
                C17880vN.A1F(AnonymousClass8BU.A07(axs.A01), "is_payment_account_created", false);
            }
        }
        A0V(a7b, z2);
        if (!this.A0n) {
            A0Q(a7b, this, z2);
            return;
        }
        this.A0K = z2;
        this.A08 = a7b;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1QE r2 = this.A0Q;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onActivityResult: request: ");
        A10.append(i);
        r2.A0A(AnonymousClass001.A1I(" result: ", A10, i2), (Throwable) null);
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A4o();
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A0G.A0C()) {
            this.A0G.A05(true);
            this.A0P.A0P = this.A0H;
            A0d(this, 1);
            return;
        }
        A0d(this, 1);
        A4q();
    }

    public void onCreate(Bundle bundle) {
        RecyclerFastScroller recyclerFastScroller;
        super.onCreate(bundle);
        AnonymousClass8BW.A0y(this);
        if (!C20063A5m.A03(this.A0b)) {
            C191049lw A002 = A7U.A00(this);
            synchronized (A002) {
                if (C18020vd.A05(C18040vf.A02, A002.A02.A02, 7727)) {
                    try {
                        ArrayList A13 = AnonymousClass000.A13();
                        File A0e = C17880vN.A0e(AnonymousClass8BR.A0t(A002.A01), "upi_bank_list.json");
                        if (A0e.exists()) {
                            String A003 = AnonymousClass3Gr.A00(A0e, C26571Sq.A05);
                            if (A003.length() > 0) {
                                JSONArray jSONArray = new JSONArray(A003);
                                int length = jSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    AnonymousClass8pS r2 = new AnonymousClass8pS();
                                    r2.A0B = jSONObject.getString("code");
                                    r2.A01 = C20061A5k.A00(jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "bankName");
                                    r2.A03 = jSONObject.getString("image");
                                    r2.A0K = "1".equals(jSONObject.getString("popular-bank"));
                                    A13.add(r2);
                                }
                                A002.A00(A13);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e("IndiaUpiBankListCache/readFileCache/error while reading file");
                        AnonymousClass8BS.A17(A002.A00, "payments/india-upi-bank-list-fetch-failed", e, false);
                    }
                }
            }
        }
        this.A09 = this.A0M.A04;
        this.A0X = AnonymousClass8BX.A0M(this);
        C18030ve r13 = this.A0E;
        AnonymousClass1KB r11 = this.A05;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(this);
        AnonymousClass1QS r3 = this.A0Q;
        A7U a7u = this.A0M;
        C31061ex r22 = this.A0N;
        this.A0A = new C175768zF(this, r11, this.A06, r13, A0M2, a7u, AnonymousClass8BT.A0S(this), r22, r3, this, this.A0S, this.A0V);
        onConfigurationChanged(C108965cb.A03(this));
        File A0e2 = C17880vN.A0e(getCacheDir(), "BankLogos");
        if (!A0e2.mkdirs() && !A0e2.isDirectory()) {
            this.A0Q.A06("create unable to create bank logos cache directory");
        }
        this.A0N = new C86284Ra(this.A05, this.A05, this.A0D, this.A05, A0e2, "india-upi-bank-picker-activity").A00();
        setContentView(2131625647);
        A4s(2131893806, 2131428054);
        C18000vb r14 = this.A00;
        this.A0G = new AnonymousClass4VZ(this, findViewById(2131434898), new AGK(this, 3), AnonymousClass3Ma.A0G(this), r14);
        this.A04 = (ShimmerFrameLayout) findViewById(2131431233);
        this.A03 = (ShimmerFrameLayout) findViewById(2131432114);
        this.A01 = AnonymousClass3MX.A0L(this, 2131428053);
        this.A0M = (LinearLayout) findViewById(2131432101);
        this.A02 = (RecyclerView) findViewById(2131428054);
        C161748Hp r1 = new C161748Hp(this, this, this.A0N, this.A09);
        this.A0B = r1;
        this.A02.setAdapter(r1);
        RecyclerView recyclerView = this.A02;
        C161748Hp r32 = this.A0B;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(r32.A00, 4);
        gridLayoutManager.A01 = new AnonymousClass8HM(r32);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.A02.setItemAnimator((C37961qT) null);
        C18030ve r12 = this.A0O.A02;
        C18040vf r23 = C18040vf.A02;
        if (C18020vd.A05(r23, r12, 8173) && (recyclerFastScroller = (RecyclerFastScroller) findViewById(2131430798)) != null) {
            recyclerFastScroller.setRecyclerView(this.A02);
            recyclerFastScroller.A09 = AnonymousClass3MW.A1Z(this.A00);
            ImageView imageView = new ImageView(this);
            AnonymousClass3NL.A01(this, imageView, this.A00, 2131231481);
            recyclerFastScroller.setThumbView(imageView);
            RecyclerView recyclerView2 = this.A02;
            C161748Hp r4 = this.A0B;
            View A092 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(recyclerView2), recyclerView2, 2131625959);
            recyclerFastScroller.setBubbleView(A092, new C21054Adk(recyclerView2, (WaTextView) A092.findViewById(2131430796), r4));
        }
        View findViewById = findViewById(2131430962);
        if ("CREDIT_LINE".equals(this.A0b)) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        C196259ui r15 = this.A0M.A04;
        this.A09 = r15;
        r15.A00("upi-bank-picker");
        this.A0S.COK();
        this.A0L = false;
        AnonymousClass8ID.A00(this.A02, this, 8);
        C171858sO r33 = this.A0P;
        r33.A0Y = this.A0c;
        r33.A0b = "nav_bank_select";
        r33.A0a = this.A0f;
        r33.A08 = 0;
        r33.A01 = Boolean.valueOf(this.A0K.A0G("add_bank"));
        r33.A02 = Boolean.valueOf(this.A0L);
        AZ6.A02(r33, this);
        this.A0Q.A09();
        if (C18020vd.A05(r23, this.A0E, 9526)) {
            A0F a0f = this.A0D;
            if (a0f.A00 == null) {
                a0f.A01((C22462B8u) null);
                return;
            }
            return;
        }
        return;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r2.equals(r3) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r23 = this;
            r1 = r23
            super.onResume()
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x0052
            X.1QE r3 = r1.A0Q
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "bank setup onResume states: "
            r2.append(r0)
            X.9ui r0 = r1.A09
            X.AnonymousClass8BV.A1D(r3, r0, r2)
            X.9lw r0 = X.A7U.A00(r1)
            java.util.ArrayList r0 = r0.A03
            r1.A0q(r0)
            X.A7U r0 = r1.A0M
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0053
            r5 = 0
            java.lang.String r0 = r1.A0b
            X.9bw r0 = X.A43.A00(r5, r0)
            java.lang.String r4 = r0.A01
            java.lang.String r3 = r1.A0b
            java.lang.String r2 = "CREDIT"
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x0047
            java.lang.String r2 = "CREDIT_LINE"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0048
        L_0x0047:
            r5 = r2
        L_0x0048:
            X.8zF r0 = r1.A0A
            r0.A00(r5, r4)
        L_0x004d:
            X.AZ6 r0 = r1.A0S
            r0.COK()
        L_0x0052:
            return
        L_0x0053:
            X.A6g r2 = r1.A0O
            java.lang.String r0 = r1.A0b
            java.lang.String r10 = r2.A07(r0)
            r2 = 0
            java.lang.String r0 = r1.A0b
            X.9bw r0 = X.A43.A00(r2, r0)
            java.lang.String r9 = r0.A01
            X.0ve r2 = r1.A0E
            r0 = 10971(0x2adb, float:1.5374E-41)
            X.0vf r13 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r13, r2, r0)
            if (r0 == 0) goto L_0x00b7
            X.9Uv r0 = r1.A05
            X.1IT r4 = X.C23761Hn.A00()
            X.1K2 r0 = r0.A00
            X.1K1 r2 = r0.A00
            X.00S r0 = r2.A37
            java.lang.Object r3 = r0.get()
            X.9Uw r3 = (X.C182569Uw) r3
            X.00S r0 = r2.A38
            java.lang.Object r0 = r0.get()
            X.6ki r0 = (X.C131206ki) r0
            X.9ew r2 = new X.9ew
            r2.<init>(r3, r0, r4)
            X.AZ7 r4 = new X.AZ7
            r4.<init>(r1)
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.6ki r5 = r2.A01
            X.1lW r6 = X.AnonymousClass9TW.A00
            X.ATo r8 = new X.ATo
            r8.<init>(r2, r9, r10)
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            r7 = 0
            r9 = 0
            X.7IB r3 = r5.A01(r6, r7, r8, r9)
            X.1OX r2 = r2.A02
            com.whatsapp.payments.graphql.IndiaUpiBankListGraphqlManager$getBankList$1 r0 = new com.whatsapp.payments.graphql.IndiaUpiBankListGraphqlManager$getBankList$1
            r0.<init>(r3, r4, r7)
            X.AnonymousClass3MX.A1Q(r0, r2)
            goto L_0x004d
        L_0x00b7:
            X.AXS r3 = r1.A0N
            monitor-enter(r3)
            X.1QD r0 = r3.A01     // Catch:{ all -> 0x01e7 }
            android.content.SharedPreferences r2 = r0.A03()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "is_payment_account_created"
            boolean r0 = X.C17880vN.A1W(r2, r0)     // Catch:{ all -> 0x01e7 }
            monitor-exit(r3)
            r8 = 0
            if (r0 != 0) goto L_0x00ec
            X.1QL r0 = r1.A0K
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00ec
            X.8zF r4 = r1.A0A
            java.lang.String r3 = r1.A0b
            java.lang.String r2 = "CREDIT"
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r2 = "CREDIT_LINE"
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L_0x00e7
            r2 = 0
        L_0x00e7:
            r4.A00(r2, r9)
            goto L_0x004d
        L_0x00ec:
            X.8zF r7 = r1.A0A
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup sendGetBanksList called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AZ6 r0 = r7.A09
            r17 = r0
            r2 = 4
            r6 = 0
            r0.A0A(r6, r2, r8)
            X.9ui r0 = r7.A00
            r22 = r0
            java.lang.String r2 = "upi-get-banks"
            r0.A02(r2)
            X.1OZ r0 = r7.A05
            r21 = r0
            java.lang.String r5 = r21.A0B()
            java.lang.String r15 = "0"
            r4 = 1
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r3[r8] = r15
            java.lang.String r0 = "1"
            java.util.List r14 = X.C18070vi.A0O(r0, r3, r4)
            r0 = 10
            java.lang.String[] r11 = new java.lang.String[r0]
            X.AnonymousClass8BY.A1Q(r11)
            X.AnonymousClass8BY.A1P(r11)
            r3 = 9
            java.lang.String r0 = "UNKNOWN"
            java.util.List r12 = X.C18070vi.A0O(r0, r11, r3)
            X.1cX r11 = X.C108955ca.A0Y()
            java.lang.String r3 = "xmlns"
            java.lang.String r0 = "w:pay"
            X.AnonymousClass8BY.A19(r11, r3, r0)
            java.lang.String r3 = "type"
            java.lang.String r0 = "get"
            X.C29591cX.A01(r11, r3, r0)
            X.AnonymousClass8BY.A15(r11, r5)
            X.1cX r0 = X.AnonymousClass8BS.A0R()
            java.lang.String r3 = "action"
            X.C29591cX.A01(r0, r3, r2)
            java.lang.String r3 = "version"
            java.lang.String r2 = "2"
            X.C29591cX.A01(r0, r3, r2)
            r2 = 1
            boolean r2 = X.AnonymousClass8BV.A1V(r9, r2, r4)
            if (r2 == 0) goto L_0x015f
            java.lang.String r2 = "provider-type"
            X.C29591cX.A01(r0, r2, r9)
        L_0x015f:
            java.lang.String r2 = "popular-banks"
            r0.A08(r15, r2, r14)
            java.lang.String r2 = "account-type"
            r0.A08(r10, r2, r12)
            X.1ca r3 = X.C29591cX.A00(r0, r11)
            X.0ve r10 = r7.A04
            r0 = 2227(0x8b3, float:3.12E-42)
            boolean r11 = X.C18020vd.A05(r13, r10, r0)
            java.lang.String r9 = "in_upi_get_banks_tag"
            if (r11 == 0) goto L_0x0181
            X.90Z r2 = r7.A0A
            r0 = 185478219(0xb0e2c4b, float:2.7381528E-32)
            r2.A01(r0, r9)
        L_0x0181:
            r0 = 11244(0x2bec, float:1.5756E-41)
            boolean r0 = X.C18020vd.A05(r13, r10, r0)
            android.content.Context r10 = r7.A01
            if (r0 == 0) goto L_0x01c5
            X.1KB r2 = r7.A02
            X.1jG r0 = r7.A07
            if (r11 == 0) goto L_0x01c3
            X.90Z r6 = r7.A0A
        L_0x0193:
            r20 = 3
            X.8zY r11 = new X.8zY
            r16 = r7
            r18 = r6
            r19 = r9
            r12 = r10
            r13 = r2
            r14 = r0
            r15 = r22
            r11.<init>((android.content.Context) r12, (X.AnonymousClass1KB) r13, (X.C33711jG) r14, (X.C196259ui) r15, (X.C175768zF) r16, (X.AZ6) r17, (X.AnonymousClass90Z) r18, (java.lang.String) r19, (int) r20)
            r14 = 0
            r13 = 204(0xcc, float:2.86E-43)
            r9 = r21
            r10 = r11
            r11 = r3
            r12 = r5
            boolean r0 = r9.A0N(r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x004d
            X.BBA r3 = r7.A00
            if (r3 == 0) goto L_0x004d
            r2 = 7
            X.A7B r0 = new X.A7B
            r0.<init>((int) r2)
            r3.BmR(r0, r4, r8)
            goto L_0x004d
        L_0x01c3:
            r9 = r6
            goto L_0x0193
        L_0x01c5:
            X.1KB r4 = r7.A02
            X.1jG r0 = r7.A07
            if (r11 == 0) goto L_0x01e5
            X.90Z r6 = r7.A0A
        L_0x01cd:
            r15 = 4
            X.8zY r2 = new X.8zY
            r11 = r7
            r12 = r17
            r13 = r6
            r14 = r9
            r6 = r2
            r7 = r10
            r8 = r4
            r9 = r0
            r10 = r22
            r6.<init>((android.content.Context) r7, (X.AnonymousClass1KB) r8, (X.C33711jG) r9, (X.C196259ui) r10, (X.C175768zF) r11, (X.AZ6) r12, (X.AnonymousClass90Z) r13, (java.lang.String) r14, (int) r15)
            r0 = r21
            X.AnonymousClass8BW.A1B(r0, r2, r3, r5)
            goto L_0x004d
        L_0x01e5:
            r9 = r6
            goto L_0x01cd
        L_0x01e7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity.onResume():void");
    }

    public boolean onSearchRequested() {
        this.A0P.A03 = true;
        this.A0G.A06(false);
        DisplayMetrics A082 = C108965cb.A08(this);
        C27641Ww.A03(this.A0G.A00, (int) TypedValue.applyDimension(1, 16.0f, A082), 0);
        C27641Ww.A03(this.A0G.A03.findViewById(2131434851), (int) TypedValue.applyDimension(1, 8.0f, A082), 0);
        AnonymousClass4VZ r2 = this.A0G;
        String string = getString(2131893808);
        SearchView searchView = r2.A00;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        AnonymousClass3Ma.A19(findViewById(2131434851), this, 33);
        A0d(this, 65);
        return false;
    }

    public IndiaUpiBankPickerActivity(int i) {
        this.A0O = false;
        AGC.A00(this, 9);
    }

    private void A0q(List list) {
        String A0I2;
        Character valueOf;
        if (list.isEmpty()) {
            int i = 0;
            do {
                this.A0M.addView(AnonymousClass3MX.A08(this, 2131625652), C72463Mc.A0R());
                i++;
            } while (i < 25);
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(0);
            this.A03.A03();
            this.A04.setVisibility(0);
            this.A04.A03();
            return;
        }
        this.A02.setVisibility(0);
        this.A04.setVisibility(8);
        this.A03.setVisibility(8);
        this.A01.setVisibility(8);
        this.A04.A04();
        this.A03.A04();
        this.A0M.removeAllViews();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        Character ch = null;
        while (it.hasNext()) {
            AnonymousClass8pS r4 = (AnonymousClass8pS) it.next();
            if (r4.A0K) {
                if (A132.isEmpty()) {
                    A132.add(new C192459oQ((AnonymousClass8pS) null, (String) null, 2));
                }
                A132.add(new C192459oQ(r4, (String) null, 1));
            } else {
                String str = (String) AnonymousClass8BT.A0q(r4.A01);
                if (!(str == null || (A0I2 = AnonymousClass1YF.A0I(str)) == null || A0I2.length() == 0 || (valueOf = Character.valueOf(A0I2.charAt(0))) == null || (ch != null && ch.equals(valueOf)))) {
                    A13.add(new C192459oQ((AnonymousClass8pS) null, valueOf.toString(), 0));
                    ch = valueOf;
                }
                A13.add(new C192459oQ(r4, (String) null, 3));
            }
        }
        ArrayList A0k = C29431cG.A0k(A13, A132);
        this.A0J = A0k;
        C161748Hp r2 = this.A0B;
        List list2 = r2.A03;
        C72473Md.A1B(new AnonymousClass8HG(list2, A0k), r2, A0k, list2);
        this.A0E.A00.A08("bankPickerShown");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, 2131432620, 0, this.A00.A0A(2131899369));
        add.setIcon(2131232271).setShowAsAction(9);
        A3C.A01(ColorStateList.valueOf(C19740yt.A00(this, 2131102007)), add);
        A4w(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0A.A00 = null;
        AnonymousClass9B7 r1 = this.A0C;
        if (r1 != null) {
            r1.A0B(true);
            this.A0C = null;
        }
        this.A0N.A02.A04(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432589) {
            A4u(2131888959, "nav_bank_select", "payments:bank-select");
        } else if (itemId == 2131432620) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            this.A0Q.A04("action bar home");
            A0d(this, 1);
            A4q();
            return true;
        }
        return true;
    }

    public IndiaUpiBankPickerActivity() {
        this(0);
        this.A0K = false;
        this.A0R = new AtomicBoolean();
        this.A0Q = AnonymousClass1QE.A00("IndiaUpiBankPickerActivity", "onboarding", "IN");
        this.A0P = new C171858sO();
    }
}
