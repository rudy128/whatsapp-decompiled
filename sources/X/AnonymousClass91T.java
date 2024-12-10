package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.91T  reason: invalid class name */
public abstract class AnonymousClass91T extends C1762590e {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public C132216mP A04;
    public AnonymousClass181 A05;
    public C24921Me A06;
    public AnonymousClass1QR A07;
    public AnonymousClass1E7 A08;
    public AnonymousClass1KN A09;
    public AnonymousClass8pN A0A;
    public C20284AEs A0B;
    public AnonymousClass18K A0C;
    public AnonymousClass1D9 A0D;
    public AnonymousClass1LU A0E;
    public UserJid A0F;
    public C1418477e A0G;
    public C1418477e A0H;
    public C1418477e A0I;
    public C1418477e A0J;
    public A12 A0K;
    public AnonymousClass8pS A0L;
    public A7U A0M;
    public AXS A0N;
    public C20080A6g A0O;
    public C170318pf A0P = new C170318pf();
    public AnonymousClass1QD A0Q;
    public C170628qP A0R;
    public AZ6 A0S;
    public AnonymousClass6MW A0T;
    public AEP A0U = null;
    public AnonymousClass90Z A0V;
    public AnonymousClass1R2 A0W;
    public AnonymousClass00H A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public List A0j;
    public C18140vp A0k;
    public boolean A0l;
    public boolean A0m = true;
    public boolean A0n = false;
    public boolean A0o = false;
    public boolean A0p = true;
    public final AnonymousClass1QE A0q = AnonymousClass1QE.A00("IndiaUpiBasePaymentsActivity", "payment", "IN");
    public final AtomicInteger A0r = new AtomicInteger();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0m != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.A0m != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4q() {
        /*
            r3 = this;
            r0 = 1
            r3.A0n = r0
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131893820(0x7f121e3c, float:1.9422427E38)
            r2.A0E(r0)
            boolean r0 = r3 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0038
            boolean r1 = r3.A0m
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x0016:
            r1 = 2131893823(0x7f121e3f, float:1.9422433E38)
        L_0x0019:
            java.lang.String r0 = r3.getString(r1)
        L_0x001d:
            r2.A0S(r0)
            r1 = 2131893819(0x7f121e3b, float:1.9422425E38)
            r0 = 9
            X.C20154A9q.A00(r2, r3, r0, r1)
            r1 = 2131893818(0x7f121e3a, float:1.9422423E38)
            r0 = 10
            X.C20154A9q.A01(r2, r3, r0, r1)
            r0 = 0
            r2.A0T(r0)
            r2.A0C()
            return
        L_0x0038:
            boolean r0 = r3.A0m
            r1 = 2131893817(0x7f121e39, float:1.9422421E38)
            if (r0 == 0) goto L_0x0019
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91T.A4q():void");
    }

    private void A1G(AnonymousClass8pS r5, A7B a7b, C19967A1c a1c, String str) {
        this.A0S.BiL((Integer) null, str, (String) null, 0);
        this.A0N.BIG(this.A0M.A05(r5), true);
        if (this instanceof IndiaUpiDeviceBindStepActivity) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this;
            if (a7b.A00 == 11473) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                IndiaUpiDeviceBindStepActivity.A0z(indiaUpiDeviceBindStepActivity, new C19967A1c(2131890762), true);
            } else {
                indiaUpiDeviceBindStepActivity.A01 = 7;
                IndiaUpiDeviceBindStepActivity.A0z(indiaUpiDeviceBindStepActivity, a1c, true);
            }
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            if (a7b.A00 == 11473) {
                indiaUpiBankAccountPickerActivity.A00 = 1;
                IndiaUpiBankAccountPickerActivity.A0V(indiaUpiBankAccountPickerActivity, new C19967A1c(2131890762), true);
            } else {
                indiaUpiBankAccountPickerActivity.A00 = 7;
                IndiaUpiBankAccountPickerActivity.A0V(indiaUpiBankAccountPickerActivity, a1c, true);
            }
        }
        A7U a7u = this.A0M;
        ArrayList arrayList = a7u.A05;
        if (arrayList != null && arrayList.size() > 1) {
            a7u.A01++;
        }
        ArrayList A032 = A7U.A03(r5, a7u);
        if (A032 != null) {
            int size = A032.size();
            a7u.A00 = size;
            int i = a7u.A02 + 1;
            if (i != size) {
                a7u.A02 = i;
                return;
            }
        }
        a7u.A02 = 0;
    }

    public String A4m(String str) {
        try {
            String rawString = AnonymousClass11S.A01(this.A02).getRawString();
            try {
                MessageDigest A1I = C108945cZ.A1I();
                long A012 = AnonymousClass8BS.A01(this);
                byte[] bArr = new byte[8];
                for (int i = 7; i >= 0; i--) {
                    bArr[i] = (byte) ((int) A012);
                    A012 >>= 8;
                }
                A1I.update(bArr);
                A1I.update(rawString.getBytes());
                A1I.update(AnonymousClass8BX.A1Z());
                byte[] bArr2 = new byte[15];
                System.arraycopy(A1I.digest(), 0, bArr2, 0, 15);
                return A4n(str, C17970vW.A06(bArr2));
            } catch (NoSuchAlgorithmException e) {
                this.A0q.A08("payment", "generateUuid unable to hash due to missing sha256 algorithm", e);
                return null;
            }
        } catch (Exception e2) {
            this.A0q.A08("payment", "generateUuid unable to hash due to missing phone user jid", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.91S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4o() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass91S
            if (r0 == 0) goto L_0x002a
            r3 = r4
            X.91S r3 = (X.AnonymousClass91S) r3
            X.A7U r0 = r3.A0M
            X.9ui r0 = r0.A04
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1QE r2 = r3.A0K
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.A7U r0 = r3.A0M
            X.9ui r0 = r0.A04
            X.AnonymousClass8BV.A1D(r2, r0, r1)
        L_0x0024:
            X.A7U r0 = r3.A0M
        L_0x0026:
            r0.A0A()
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity
            if (r0 == 0) goto L_0x0031
            X.A7U r0 = r4.A0M
            goto L_0x0026
        L_0x0031:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x0054
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r3 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r3
            X.9ui r0 = r3.A0B
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1QE r2 = r3.A0h
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9ui r0 = r3.A0B
            X.AnonymousClass8BV.A1D(r2, r0, r1)
            goto L_0x0024
        L_0x0054:
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0079
            r3 = r4
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r3
            X.9ui r0 = r3.A07
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1QE r2 = r3.A0Y
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9ui r0 = r3.A07
            java.lang.String r0 = r0.toString()
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            goto L_0x0024
        L_0x0079:
            boolean r0 = r4 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0029
            r3 = r4
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r3 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r3
            X.9ui r0 = r3.A09
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.A07
            java.lang.String r0 = "done"
            r1.add(r0)
            X.1QE r2 = r3.A0Q
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "clearStates: "
            r1.append(r0)
            X.9ui r0 = r3.A09
            java.lang.String r0 = r0.toString()
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91T.A4o():void");
    }

    public void A4p() {
        if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0J = false;
            C38391rD r0 = indiaUpiBankAccountPickerActivity.A02.A0B;
            if (r0 != null) {
                r0.notifyDataSetChanged();
                return;
            }
            return;
        }
        C72453Mb.A1B(findViewById(2131434180));
    }

    public void A4t(int i, String str) {
        String str2 = str;
        this.A0S.A0C(C17880vN.A0h(), Integer.valueOf(i), str2, this.A0g, this.A0m, this.A0l, AnonymousClass8BT.A1X(this));
    }

    public void A4v(Intent intent) {
        intent.putExtra("extra_conversation_message_type", this.A00);
        intent.putExtra("extra_jid", C22971Dz.A06(this.A0G));
        intent.putExtra("extra_receiver_jid", C22971Dz.A06(this.A0J));
        intent.putExtra("extra_quoted_msg_row_id", this.A02);
        intent.putExtra("extra_payment_preset_amount", this.A0o);
        intent.putExtra("extra_transaction_id", this.A0s);
        intent.putExtra("extra_payment_preset_min_amount", this.A0q);
        intent.putExtra("extra_payment_preset_max_amount", this.A0p);
        intent.putExtra("extra_request_message_key", this.A0r);
        intent.putExtra("extra_is_pay_money_only", this.A0y);
        intent.putExtra("extra_payment_note", this.A0n);
        intent.putExtra("extra_payment_background", this.A0C);
        intent.putExtra("extra_payment_sticker", this.A0a);
        intent.putExtra("extra_payment_sticker_send_origin", this.A0j);
        List list = this.A0u;
        if (list != null) {
            intent.putExtra("extra_mentioned_jids", AnonymousClass4aJ.A01(list));
        }
        intent.putExtra("extra_inviter_jid", C22971Dz.A06(this.A0I));
        AnonymousClass3MY.A13(intent, this.A0J, "extra_receiver_jid");
        intent.putExtra("extra_in_setup", this.A0l);
        intent.putExtra("extra_setup_mode", this.A03);
        intent.putExtra("extra_payment_handle", this.A0J);
        intent.putExtra("extra_payment_handle_id", this.A0i);
        intent.putExtra("extra_merchant_code", this.A0a);
        intent.putExtra("extra_transaction_ref", this.A0h);
        intent.putExtra("extra_payee_name", this.A0H);
        intent.putExtra("extra_transaction_ref_url", this.A0e);
        intent.putExtra("extra_purpose_code", this.A0d);
        intent.putExtra("extra_initiation_mode", this.A0Z);
        intent.putExtra("extra_incoming_pay_request_id", this.A0Y);
        intent.putExtra("extra_selected_bank", this.A0L);
        intent.putExtra("extra_payment_bank_account_added_in_onboarding", this.A0A);
        intent.putExtra("extra_payments_entry_type", this.A02);
        intent.putExtra("extra_is_first_payment_method", this.A0m);
        intent.putExtra("extra_skip_value_props_display", this.A0p);
        intent.putExtra("extra_transaction_type", this.A0t);
        intent.putExtra("extra_transaction_is_merchant", this.A0x);
        intent.putExtra("extra_transaction_is_valid_merchant", this.A0z);
        intent.putExtra("extra_banner_type", this.A00);
        intent.putExtra("extra_payment_flow_entry_point", this.A01);
        intent.putExtra("extra_referral_screen", this.A0f);
        intent.putExtra("extra_order_type", this.A0m);
        intent.putExtra("extra_payment_config_id", this.A0l);
        intent.putExtra("extra_order_formatted_discount_amount", this.A0G);
        intent.putExtra("extra_payment_method_type", this.A0b);
        intent.putExtra("extra_external_payment_source", this.A0k);
        intent.putExtra("extra_is_interop_add_payment_method", this.A0v);
        intent.putExtra("extra_scan_qr_onboarding_only", this.A10);
    }

    public void A4w(Menu menu) {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 732)) {
            MenuItem add = menu.add(0, 2131432589, 0, this.A00.A0A(2131899401));
            add.setIcon(2131231968).setShowAsAction(9);
            A3C.A01(ColorStateList.valueOf(C19740yt.A00(this, 2131102007)), add);
        }
    }

    public void A4x(String str) {
        Intent intent;
        String str2;
        int i = this.A02;
        switch (i) {
            case 0:
                Log.e("Entry point not provided while onboarding");
            case 6:
            case 11:
                if (!this.A0m) {
                    AnonymousClass8pN r0 = this.A0A;
                    if (r0 != null) {
                        AnonymousClass8pS r02 = (AnonymousClass8pS) r0.A08;
                        if (r02 != null) {
                            if (!AnonymousClass000.A1Y(AnonymousClass8BT.A0q(r02.A04))) {
                                intent = C17880vN.A0A();
                                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity");
                                intent.putExtra("extra_bank_account", this.A0A);
                                intent.putExtra("extra_payment_method_type", this.A0b);
                                intent.putExtra("event_screen", "setup_pin");
                                break;
                            }
                        } else {
                            str2 = "Invalid bank's country data";
                        }
                    } else {
                        str2 = "Invalid Bank Account added is null";
                    }
                    Log.e(str2);
                    finish();
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 14:
                A4o();
                intent = C17880vN.A0A();
                intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
                break;
            default:
                C17900vP.A0j("No implementation for payments entry point ", AnonymousClass000.A10(), i);
                return;
        }
        A4o();
        intent = C17880vN.A0A();
        intent.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity");
        A4v(intent);
        AnonymousClass8BU.A13(intent, this, "extra_previous_screen", str);
    }

    public boolean A4y() {
        if ((this.A0J != null || this.A0G != null || C20061A5k.A02(this.A0J)) && ((this.A0G != null || !this.A0P.A0K(this.A0H, this.A0g)) && TextUtils.isEmpty(this.A0Y))) {
            return false;
        }
        return true;
    }

    public boolean A4z(AnonymousClass8pS r6, A7B a7b, String str) {
        C19967A1c a1c;
        int i;
        int i2 = a7b.A00;
        if (i2 != 11473) {
            if (i2 == 11474) {
                i = 2131897459;
            } else if (i2 != 11484) {
                if (i2 != 11498) {
                    if (i2 != 11500) {
                        if (i2 != 11534) {
                            if (i2 != 20686) {
                                switch (i2) {
                                    case 21143:
                                        break;
                                    case 21144:
                                    case 21145:
                                        break;
                                    default:
                                        switch (i2) {
                                            case 21147:
                                            case 21148:
                                            case 21149:
                                            case 21150:
                                                break;
                                        }
                                }
                            }
                        }
                    }
                    a1c = new C19967A1c(i2, str);
                    A1G(r6, a7b, a1c, "retry_device_binding_on_error");
                    return true;
                }
                this.A0S.BiL((Integer) null, "updated_onboarding_error_strings", (String) null, 0);
                return false;
            } else {
                i = 2131897460;
            }
            a1c = new C19967A1c(i);
            A1G(r6, a7b, a1c, "retry_device_binding_on_error");
            return true;
        }
        if (C18020vd.A05(C18040vf.A02, this.A0E, 1685)) {
            A1G(r6, a7b, new C19967A1c(a7b.A00, str), "retry_device_binding_xh_error");
            return true;
        }
        return false;
    }

    public String BXz() {
        AnonymousClass1E7 r1 = this.A08;
        if (r1 == null) {
            return (String) AnonymousClass8BT.A0q(this.A0J);
        }
        return this.A06.A0I(r1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            A4o();
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        AnonymousClass8BV.A1E(this.A0q, " onBackPressed", C17890vO.A0f(this));
        A4o();
        finish();
        super.onBackPressed();
    }

    public static void A1F(AlertDialog$Builder alertDialog$Builder, AnonymousClass91T r4, String str, String str2) {
        alertDialog$Builder.setPositiveButton(2131888960, new A9W(r4, str2, str));
        alertDialog$Builder.setNegativeButton(2131899286, new A9R(6));
        alertDialog$Builder.A0T(true);
        alertDialog$Builder.A0C();
        r4.A0S.BiL(39, str, (String) null, 0);
    }

    public void A3h(int i) {
        A4o();
        finish();
    }

    public String A4n(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0A2 = C17900vP.A0A(str, str2);
            if (A0A2.length() > 35) {
                return AnonymousClass8BS.A0o(A0A2, 35);
            }
            return A0A2;
        }
        throw AnonymousClass000.A0k(this.A0q.A03(AnonymousClass001.A1I("prefixAndTruncate called with too long a prefix: ", AnonymousClass000.A10(), length)));
    }

    public void A4r(int i, int i2) {
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        C003401n A0K2 = AnonymousClass3MY.A0K(this, A0G2);
        if (A0K2 != null) {
            A0K2.A0O(C24261Jm.A00(this, i));
            A0K2.A0W(true);
            A0K2.A0Y(false);
            A0G2.setOverflowIcon(AnonymousClass4aX.A08(C24261Jm.A00(this, 2131233368), C19740yt.A00(this, 2131102007)));
            View findViewById = findViewById(i2);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new C20303AFl(this, findViewById, A0K2, 1));
            }
        }
    }

    public void A4s(int i, int i2) {
        A4r(2131232759, i2);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(i);
            supportActionBar.A0Y(true);
        }
    }

    public void A4u(int i, String str, String str2) {
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(i);
        A1F(A002, this, str, str2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass8BX.A1D(this.A0q, this, "onCreate", AnonymousClass000.A10());
        this.A0K.A01(new AX3(this, 1));
        if (getIntent() != null) {
            boolean z = false;
            this.A0l = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A0J = (C1418477e) getIntent().getParcelableExtra("extra_payment_handle");
            this.A0i = getIntent().getStringExtra("extra_payment_handle_id");
            this.A0a = getIntent().getStringExtra("extra_merchant_code");
            this.A0h = getIntent().getStringExtra("extra_transaction_ref");
            this.A0H = (C1418477e) getIntent().getParcelableExtra("extra_payee_name");
            this.A0I = (C1418477e) getIntent().getParcelableExtra("extra_payment_upi_number");
            this.A0e = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A0d = getIntent().getStringExtra("extra_purpose_code");
            this.A0Z = getIntent().getStringExtra("extra_initiation_mode");
            this.A0Y = getIntent().getStringExtra("extra_incoming_pay_request_id");
            this.A0L = (AnonymousClass8pS) getIntent().getParcelableExtra("extra_selected_bank");
            this.A0A = (AnonymousClass8pN) getIntent().getParcelableExtra("extra_payment_bank_account_added_in_onboarding");
            this.A02 = getIntent().getIntExtra("extra_payments_entry_type", 0);
            this.A0m = getIntent().getBooleanExtra("extra_is_first_payment_method", true);
            this.A0p = getIntent().getBooleanExtra("extra_skip_value_props_display", true);
            this.A00 = getIntent().getIntExtra("extra_banner_type", 0);
            this.A01 = getIntent().getIntExtra("extra_payment_flow_entry_point", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("extra_should_open_transaction_detail_after_send_override", false);
            int i = this.A01;
            if (i == 2 || i == 3 || booleanExtra) {
                z = true;
            }
            this.A11 = z;
            this.A0f = getIntent().getStringExtra("extra_referral_screen");
            this.A0g = C108955ca.A0r(this, "extra_referral_screen");
            this.A0c = getIntent().getStringExtra("extra_previous_screen");
            this.A0G = (C1418477e) getIntent().getParcelableExtra("extra_order_formatted_discount_amount");
            this.A0b = getIntent().getStringExtra("extra_payment_method_type");
        }
        if (C18020vd.A05(C18040vf.A02, this.A0P.A02, 698)) {
            this.A0R.A0B();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass8BV.A1E(this.A0q, " action bar home", C17890vO.A0f(this));
        A4o();
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A0K.A02()) {
            A12.A00(this);
        }
    }
}
