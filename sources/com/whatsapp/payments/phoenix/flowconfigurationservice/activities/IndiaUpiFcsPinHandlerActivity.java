package com.whatsapp.payments.phoenix.flowconfigurationservice.activities;

import X.A2V;
import X.A2X;
import X.A7B;
import X.A9Q;
import X.AGC;
import X.AXS;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1QE;
import X.AnonymousClass2XZ;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.AnonymousClass9YD;
import X.AnonymousClass9YE;
import X.C000200d;
import X.C010105w;
import X.C108975cc;
import X.C137116uw;
import X.C1418477e;
import X.C144717Ik;
import X.C170278pb;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C182579Ux;
import X.C186139di;
import X.C189549jQ;
import X.C196669vR;
import X.C20061A5k;
import X.C20129A8p;
import X.C20130A8q;
import X.C20284AEs;
import X.C20332AGo;
import X.C20336AGs;
import X.C20752AXh;
import X.C21109Aed;
import X.C22579BDz;
import X.C22851Dl;
import X.C63662tU;
import X.C63932tv;
import X.C73203Rj;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

public final class IndiaUpiFcsPinHandlerActivity extends AnonymousClass91S {
    public AnonymousClass2XZ A00;
    public C182579Ux A01;
    public AnonymousClass8pN A02;
    public C1418477e A03;
    public C189549jQ A04;
    public AnonymousClass00H A05;
    public String A06;
    public String A07;
    public boolean A08;
    public AnonymousClass9YE A09;
    public C186139di A0A;
    public String A0B;
    public boolean A0C;
    public final AnonymousClass1QE A0D;
    public final AnonymousClass9YD A0E;

    public static final C22579BDz A0Q(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        String str;
        C20129A8p a8p;
        C189549jQ r1 = indiaUpiFcsPinHandlerActivity.A04;
        if (r1 != null) {
            String str2 = indiaUpiFcsPinHandlerActivity.A06;
            if (str2 != null) {
                C20130A8q A002 = r1.A00(str2);
                if (A002 == null || (a8p = A002.A00) == null) {
                    return null;
                }
                return (C22579BDz) a8p.A0A("native_flow_npci_common_library");
            }
            str = "fdsManagerId";
        } else {
            str = "phoenixManagerRegistry";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0V(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity) {
        if (indiaUpiFcsPinHandlerActivity.A08) {
            A0d(indiaUpiFcsPinHandlerActivity, "finish_after_error");
            return;
        }
        indiaUpiFcsPinHandlerActivity.A4o();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
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
            AnonymousClass91U.A1T(A002, r2, r1, this);
            this.A00 = (AnonymousClass2XZ) A002.A3A.get();
            this.A01 = (C182579Ux) A002.A3B.get();
            this.A05 = C000200d.A00(r1.AEf);
            this.A04 = AnonymousClass8BV.A0H(r2);
        }
    }

    public final String A5F() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        C18070vi.A11("pinOp");
        throw null;
    }

    public void Bwk(A7B a7b, String str) {
        AnonymousClass8pS r1;
        String str2 = str;
        if (str == null || str2.length() == 0) {
            A7B a7b2 = a7b;
            if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b2.A00, false)) {
                Integer num = null;
                if (this.A04.A05("upi-list-keys")) {
                    AnonymousClass91U.A1b(this);
                    AnonymousClass8pN r0 = this.A02;
                    if (r0 == null) {
                        C18070vi.A11("paymentBankAccount");
                        throw null;
                    } else {
                        A5A(r0.A08);
                    }
                } else {
                    AnonymousClass1QE r2 = this.A0D;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("onListKeys: ");
                    if (str != null) {
                        num = AnonymousClass8BT.A0j(str2);
                    }
                    A10.append(num);
                    AnonymousClass8BV.A1E(r2, " failed; ; showErrorAndFinish", A10);
                    A56();
                }
            }
        } else {
            this.A0D.A06("onListKeys called");
            if (C18070vi.A18(A5F(), "pay") || C18070vi.A18(A5F(), "collect")) {
                AnonymousClass8pN r02 = this.A02;
                if (r02 == null) {
                    C18070vi.A11("paymentBankAccount");
                    throw null;
                }
                C170278pb r6 = r02.A08;
                C18070vi.A0z(r6, "null cannot be cast to non-null type com.whatsapp.payments.IndiaUpiMethodData");
                C17960vV.A07(r6);
                C18070vi.A0X(r6);
                AnonymousClass8pS r62 = (AnonymousClass8pS) r6;
                long A062 = C108975cc.A06(getIntent(), "extra_payment_preset_amount");
                int intExtra = getIntent().getIntExtra("extra_payment_offset", 100);
                AnonymousClass1KJ r22 = AnonymousClass1KL.A0B;
                if (intExtra <= 0) {
                    intExtra = 1;
                }
                C17960vV.A07(r22);
                C18070vi.A0X(r22);
                AnonymousClass1KN r10 = C196669vR.A00(r22, intExtra, A062).A02;
                AnonymousClass8pN r03 = this.A02;
                if (r03 == null) {
                    C18070vi.A11("paymentBankAccount");
                    throw null;
                }
                String str3 = r03.A0B;
                C1418477e r11 = r62.A07;
                if (r11 != null) {
                    String A0h = AnonymousClass8BS.A0h(this.A0N.A0D());
                    String stringExtra = getIntent().getStringExtra("extra_receiver_vpa");
                    C1418477e r04 = this.A03;
                    if (r04 != null) {
                        String A0h2 = AnonymousClass8BS.A0h(r04);
                        AnonymousClass8pN r05 = this.A02;
                        if (r05 == null) {
                            C18070vi.A11("paymentBankAccount");
                            throw null;
                        }
                        String str4 = (String) C20061A5k.A01(r05.A09);
                        String stringExtra2 = getIntent().getStringExtra("extra_payee_name");
                        int i = 5;
                        if (C18070vi.A18(A5F(), "pay")) {
                            i = 6;
                        }
                        A58(r10, r11, str2, str3, A0h, stringExtra, A0h2, str4, stringExtra2, (String) null, i);
                        return;
                    }
                } else {
                    throw C17880vN.A0g();
                }
            } else {
                AnonymousClass8pN r12 = this.A02;
                if (r12 == null) {
                    C18070vi.A11("paymentBankAccount");
                    throw null;
                }
                String str5 = r12.A0B;
                C1418477e r06 = this.A03;
                if (r06 != null) {
                    String str6 = (String) r06.A00;
                    C170278pb r13 = r12.A08;
                    if (r13 instanceof AnonymousClass8pS) {
                        r1 = (AnonymousClass8pS) r13;
                    } else {
                        r1 = null;
                    }
                    int A032 = A03(A5F());
                    AnonymousClass8pN r07 = this.A02;
                    if (r07 == null) {
                        C18070vi.A11("paymentBankAccount");
                        throw null;
                    } else {
                        A5C(r1, str2, str5, str6, (String) C20284AEs.A02(r07), A032);
                        return;
                    }
                }
            }
            C18070vi.A11("seqNumber");
            throw null;
        }
    }

    public void C2e(int i, Bundle bundle) {
        if (this.A08 && i == 1 && bundle != null && C18070vi.A18(bundle.getSerializable("error"), "USER_ABORTED")) {
            A0d(this, "cancel");
        }
        super.C2e(i, bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A08 && i == 200 && i2 == 252) {
            A0d(this, "cancel");
        }
        super.onActivityResult(i, i2, intent);
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r3;
        int i2;
        int i3;
        C22851Dl aGs;
        if (i != 19) {
            r3 = AnonymousClass4a6.A00(this);
            if (i != 27) {
                switch (i) {
                    case 10:
                        r3.A0E(2131897423);
                        r3.A0D(2131897422);
                        C20336AGs.A01(this, r3, 25, 2131894173);
                        r3.A0e(this, new C20336AGs(this, 28), 2131898766);
                        r3.A0T(true);
                        i2 = 17;
                        break;
                    case 11:
                        r3.A0D(2131888268);
                        C20336AGs.A01(this, r3, 23, 2131890512);
                        r3.A0e(this, new C20336AGs(this, 24), 2131899286);
                        r3.A0T(true);
                        i2 = 14;
                        break;
                    case 12:
                        AnonymousClass8BW.A19(r3);
                        C20336AGs.A01(this, r3, 29, 2131899101);
                        r3.A0e(this, new C20336AGs(this, 21), 2131899286);
                        r3.A0T(true);
                        i2 = 13;
                        break;
                    default:
                        r3.A0D(2131893867);
                        i3 = 2131899286;
                        aGs = new C20332AGo(this, i);
                        break;
                }
            } else {
                r3.A0E(2131888267);
                r3.A0D(2131888266);
                i3 = 2131899286;
                aGs = new C20336AGs(this, 22);
            }
            r3.A0g(this, aGs, i3);
        } else {
            r3 = AnonymousClass4a6.A00(this);
            r3.A0D(2131893943);
            C20336AGs.A01(this, r3, 26, 2131898593);
            r3.A0e(this, new C20336AGs(this, 27), 2131892908);
            r3.A0T(true);
            i2 = 16;
            A9Q.A00(r3, this, i2);
        }
        C010105w create = r3.create();
        C18070vi.A0b(create);
        return create;
    }

    public IndiaUpiFcsPinHandlerActivity(int i) {
        this.A0C = false;
        AGC.A00(this, 10);
    }

    public static final int A03(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2131583866:
                if (str.equals("change_pin")) {
                    return 2;
                }
                break;
            case 110760:
                str2 = "pay";
                break;
            case 74085029:
                str2 = "check_balance";
                break;
            case 398918110:
                str2 = "check_pin";
                break;
            case 949444906:
                if (str.equals("collect")) {
                    return 5;
                }
                break;
            case 1985322040:
                if (str.equals("set_pin")) {
                    return 1;
                }
                break;
        }
        if (str.equals(str2)) {
            return 4;
        }
        throw AnonymousClass000.A0k("Unexpected pin operation");
    }

    public static final void A0c(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, int i) {
        int i2;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("error_code", i);
        if (C18070vi.A18(indiaUpiFcsPinHandlerActivity.A5F(), "check_balance")) {
            indiaUpiFcsPinHandlerActivity.A0S.A0A(new A7B(i), 29, 1);
        }
        if (i == 11454) {
            i2 = 12;
        } else if (i == 11459) {
            i2 = 10;
        } else if (i == 11468) {
            i2 = 11;
        } else if (i == 11487 || i == 20682 || i == 20697) {
            i2 = 27;
        } else if (C18070vi.A18(indiaUpiFcsPinHandlerActivity.A5F(), "pay") || C18070vi.A18(indiaUpiFcsPinHandlerActivity.A5F(), "collect")) {
            indiaUpiFcsPinHandlerActivity.A4o();
            indiaUpiFcsPinHandlerActivity.finish();
            return;
        } else {
            indiaUpiFcsPinHandlerActivity.A56();
            return;
        }
        if (!AnonymousClass4Yv.A02(indiaUpiFcsPinHandlerActivity)) {
            indiaUpiFcsPinHandlerActivity.showDialog(i2, A0D2);
        }
    }

    public static final void A0d(IndiaUpiFcsPinHandlerActivity indiaUpiFcsPinHandlerActivity, String str) {
        C22579BDz A0Q = A0Q(indiaUpiFcsPinHandlerActivity);
        if (A0Q != null) {
            A0Q.BLG(C108975cc.A0h("action", str));
        }
        indiaUpiFcsPinHandlerActivity.A4o();
        indiaUpiFcsPinHandlerActivity.finish();
    }

    public void C5K(A7B a7b) {
        throw AnonymousClass8BY.A0b();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9YE r0 = new AnonymousClass9YE(this);
            this.A09 = r0;
            if (bundle != null) {
                Activity activity = (Activity) r0.A00.get();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            Parcelable A1I = AnonymousClass91U.A1I(this);
            C18070vi.A0b(A1I);
            this.A02 = (AnonymousClass8pN) A1I;
            String stringExtra = getIntent().getStringExtra("extra_india_upi_pin_op");
            boolean A1W = AnonymousClass8BU.A1W(stringExtra);
            this.A07 = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("extra_fds_manager_id");
            C18070vi.A0b(stringExtra2);
            C18070vi.A0d(stringExtra2, A1W ? 1 : 0);
            this.A06 = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("extra_fcs_observer_id");
            C18070vi.A0b(stringExtra3);
            this.A0B = stringExtra3;
            this.A08 = getIntent().getBooleanExtra("is_asynchronous", A1W);
            C144717Ik A0Z = AnonymousClass8BR.A0Z();
            Class<String> cls = String.class;
            String stringExtra4 = getIntent().getStringExtra("extra_seq_number");
            if (stringExtra4 == null) {
                stringExtra4 = AXS.A01(this);
            }
            this.A03 = AnonymousClass8BR.A0Y(A0Z, cls, stringExtra4, "upiSequenceNumber");
            if (!this.A08) {
                C182579Ux r02 = this.A01;
                if (r02 != null) {
                    String str2 = this.A0B;
                    if (str2 == null) {
                        str = "observerId";
                    } else {
                        C186139di r3 = new C186139di(this.A0E, (A2V) r02.A00.A01.AB2.get(), str2);
                        this.A0A = r3;
                        A2X.A00(r3.A01.A02(r3.A02), C21109Aed.class, r3, 7);
                    }
                } else {
                    str = "fcsResourceExecutionCallbackHandlerFactory";
                }
            }
            int intExtra = getIntent().getIntExtra("code", 0);
            if (intExtra == 0) {
                A44(getString(2131895077));
                this.A07 = AnonymousClass91U.A1K(this);
                AnonymousClass8pN r03 = this.A02;
                if (r03 == null) {
                    str = "paymentBankAccount";
                } else {
                    A5A(r03.A08);
                    return;
                }
            } else {
                A0c(this, intExtra);
                return;
            }
        } else {
            str = "fcsActivityLifecycleManagerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C186139di r2 = this.A0A;
        if (r2 != null) {
            r2.A01.A02(r2.A02).A03(C21109Aed.class, r2);
        }
    }

    public IndiaUpiFcsPinHandlerActivity() {
        this(0);
        this.A0D = AnonymousClass1QE.A00("IndiaUpiFcsPinHandlerActivity", "payment-settings", "IN");
        this.A0E = new AnonymousClass9YD(this);
    }
}
