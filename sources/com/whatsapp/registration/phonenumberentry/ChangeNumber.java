package com.whatsapp.registration.phonenumberentry;

import X.A5R;
import X.A9B;
import X.AGE;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass122;
import X.AnonymousClass1K1;
import X.AnonymousClass1K3;
import X.AnonymousClass1LU;
import X.AnonymousClass1PM;
import X.AnonymousClass2KW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48o;
import X.AnonymousClass4W1;
import X.AnonymousClass4Yv;
import X.AnonymousClass4Z9;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.AnonymousClass8nC;
import X.AnonymousClass99S;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C137116uw;
import X.C161268Cm;
import X.C166988f1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17970vW;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C187799gO;
import X.C188129gv;
import X.C192319oA;
import X.C19830z4;
import X.C19880zA;
import X.C20152A9o;
import X.C20300AFi;
import X.C20301AFj;
import X.C21428Ajv;
import X.C217517g;
import X.C219017v;
import X.C22524BBh;
import X.C25011Mn;
import X.C27131Uv;
import X.C27301Vn;
import X.C28281Zt;
import X.C33451iq;
import X.C33841jT;
import X.C37191p7;
import X.C38471rL;
import X.C57302ir;
import X.C63662tU;
import X.C63932tv;
import X.C72293Lj;
import X.C72453Mb;
import X.C72463Mc;
import X.C73203Rj;
import X.C96984oj;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class ChangeNumber extends AnonymousClass99S implements C22524BBh {
    public static String A0T;
    public static String A0U;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public ScrollView A06;
    public AnonymousClass1PM A07;
    public C27301Vn A08;
    public AnonymousClass122 A09;
    public C27131Uv A0A;
    public C219017v A0B;
    public C25011Mn A0C;
    public C33451iq A0D;
    public C188129gv A0E;
    public C192319oA A0F;
    public A5R A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public ArrayList A0J;
    public boolean A0K;
    public float A0L;
    public View A0M;
    public boolean A0N;
    public final Handler A0O;
    public final Runnable A0P;
    public final C72293Lj A0Q;
    public final C38471rL A0R;
    public final AnonymousClass00H A0S;

    public void A4f() {
        AnonymousClass4Yv.A00(this, 1);
        super.A4f();
    }

    public void COI() {
        A12(this, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            r10 = this;
            r0 = 1
            r2 = -1
            if (r11 == r0) goto L_0x000b
            r0 = 2
            if (r11 == r0) goto L_0x01dc
            super.onActivityResult(r11, r12, r13)
        L_0x000a:
            return
        L_0x000b:
            if (r12 != r2) goto L_0x000a
            if (r13 == 0) goto L_0x000a
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = r13.getStringArrayListExtra(r0)
            if (r0 != 0) goto L_0x001b
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
        L_0x001b:
            r10.A0J = r0
            X.11S r0 = r10.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            if (r0 == 0) goto L_0x000a
            X.1fR r1 = r10.A03
            X.11S r0 = r10.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A01(r0)
            java.lang.String r4 = r0.user
            java.util.ArrayList r3 = r10.A0J
            X.C18070vi.A0j(r4, r3)
            java.lang.String r0 = "changenumbermanager/savechangenumbercontacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.118 r0 = r1.A00     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            android.content.Context r2 = r0.A00     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            java.lang.String r1 = "change_number_contacts.json"
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r1, r0)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            java.lang.String r1 = X.C19620yd.A0A     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            r0.<init>(r2, r1)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            android.util.JsonWriter r2 = new android.util.JsonWriter     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            r2.beginObject()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "old_jid"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0081 }
            r0.value(r4)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "notify_jids"
            android.util.JsonWriter r0 = r2.name(r0)     // Catch:{ all -> 0x0081 }
            r0.beginArray()     // Catch:{ all -> 0x0081 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0069:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0081 }
            r2.value(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0069
        L_0x0077:
            r2.endArray()     // Catch:{ all -> 0x0081 }
            r2.endObject()     // Catch:{ all -> 0x0081 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
            goto L_0x0095
        L_0x0081:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
        L_0x008a:
            throw r1     // Catch:{ FileNotFoundException -> 0x008f, IOException -> 0x008b }
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/ioErrorJson "
            goto L_0x0092
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumberManager/saveChangeNumberContacts/notFoundJson "
        L_0x0092:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0095:
            X.9gv r0 = r10.A0E
            java.lang.String r9 = "oldNumberEntry"
            if (r0 == 0) goto L_0x01f7
            android.widget.EditText r0 = r0.A02
            java.lang.String r7 = X.AnonymousClass3Ma.A12(r0)
            int r4 = r7.length()
            r6 = 1
            int r4 = r4 - r6
            r5 = 0
            r3 = 0
            r1 = 0
        L_0x00aa:
            r2 = 32
            if (r3 > r4) goto L_0x00cc
            r0 = r4
            if (r1 != 0) goto L_0x00b2
            r0 = r3
        L_0x00b2:
            char r0 = r7.charAt(r0)
            int r0 = X.C18070vi.A00(r0, r2)
            boolean r0 = X.C108975cc.A1A(r0)
            if (r1 != 0) goto L_0x00c7
            if (r0 != 0) goto L_0x00c4
            r1 = 1
            goto L_0x00aa
        L_0x00c4:
            int r3 = r3 + 1
            goto L_0x00aa
        L_0x00c7:
            if (r0 == 0) goto L_0x00cc
            int r4 = r4 + -1
            goto L_0x00aa
        L_0x00cc:
            java.lang.String r8 = X.C108985cd.A0g(r4, r3, r7)
            X.9gv r0 = r10.A0E
            if (r0 == 0) goto L_0x01f7
            android.widget.EditText r0 = r0.A03
            java.lang.String r4 = X.AnonymousClass3Ma.A12(r0)
            X.9gv r0 = r10.A0E
            if (r0 == 0) goto L_0x01f7
            boolean r0 = A13(r10, r0, r8, r4)
            if (r0 == 0) goto L_0x000a
            X.9gv r0 = r10.A0L
            android.widget.EditText r0 = r0.A02
            java.lang.String r9 = X.AnonymousClass3Ma.A12(r0)
            int r7 = r9.length()
            int r7 = r7 - r6
            r3 = 0
            r1 = 0
        L_0x00f3:
            if (r3 > r7) goto L_0x0113
            r0 = r7
            if (r1 != 0) goto L_0x00f9
            r0 = r3
        L_0x00f9:
            char r0 = r9.charAt(r0)
            int r0 = X.C18070vi.A00(r0, r2)
            boolean r0 = X.C108975cc.A1A(r0)
            if (r1 != 0) goto L_0x010e
            if (r0 != 0) goto L_0x010b
            r1 = 1
            goto L_0x00f3
        L_0x010b:
            int r3 = r3 + 1
            goto L_0x00f3
        L_0x010e:
            if (r0 == 0) goto L_0x0113
            int r7 = r7 + -1
            goto L_0x00f3
        L_0x0113:
            java.lang.String r3 = X.C108985cd.A0g(r7, r3, r9)
            X.9gv r0 = r10.A0L
            android.widget.EditText r0 = r0.A03
            java.lang.String r1 = X.AnonymousClass3Ma.A12(r0)
            X.9gv r0 = r10.A0L
            X.C18070vi.A0W(r0)
            boolean r0 = A13(r10, r0, r3, r1)
            if (r0 == 0) goto L_0x000a
            int r1 = java.lang.Integer.parseInt(r8)
            java.lang.String r0 = "\\D"
            java.lang.String r7 = X.C108985cd.A0o(r4, r0)
            X.1LA r0 = r10.A04     // Catch:{ IOException -> 0x013e }
            java.lang.String r0 = r0.A03(r1, r7)     // Catch:{ IOException -> 0x013e }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x013e }
            goto L_0x0145
        L_0x013e:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumber/phone failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0146
        L_0x0145:
            r7 = r0
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChangeNumber/phone/cc="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "/number="
            X.C17900vP.A0f(r0, r7, r1)
            A0T = r8
            A0U = r7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChangeNumber/submit/cc "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " ph="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " jid="
            r1.append(r0)
            X.11S r0 = r10.A02
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            X.AnonymousClass8BW.A1N(r0, r1)
            X.17v r0 = r10.A0B
            if (r0 == 0) goto L_0x01f4
            X.1Hc r0 = r0.A0I
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x01b4
            java.lang.String r0 = "ChangeNumber/submit/no-connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 2131888041(0x7f1207a9, float:1.9410706E38)
            X.C17880vN.A1A(r10, r1, r0)
            r1.append(r2)
            r0 = 2131888732(0x7f120a5c, float:1.9412108E38)
            X.C17880vN.A1A(r10, r1, r0)
            java.lang.String r0 = "\n\n"
            r1.append(r0)
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            X.C17880vN.A1A(r10, r1, r0)
            java.lang.String r0 = r1.toString()
        L_0x01b0:
            r10.BhR(r0)
            return
        L_0x01b4:
            X.AnonymousClass4Yv.A01(r10, r6)
            android.os.Handler r4 = r10.A0O
            r2 = 30000(0x7530, double:1.4822E-319)
            r1 = 4
            r4.sendEmptyMessageDelayed(r1, r2)
            X.1Mn r0 = r10.A0C
            if (r0 == 0) goto L_0x01fb
            boolean r0 = r0.A06(r8, r7)
            if (r0 != 0) goto L_0x000a
            r4.removeMessages(r1)
            X.AnonymousClass4Yv.A00(r10, r6)
            r2 = 2131894981(0x7f1222c5, float:1.9424782E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = X.AnonymousClass8BV.A0q(r10, r1, r0, r5, r2)
            goto L_0x01b0
        L_0x01dc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChangeNumber/register/phone/sms permission "
            r1.append(r0)
            if (r12 != r2) goto L_0x01f1
            java.lang.String r0 = "granted"
        L_0x01e9:
            X.C17890vO.A1A(r1, r0)
            r0 = 0
            A12(r10, r0)
            return
        L_0x01f1:
            java.lang.String r0 = "denied"
            goto L_0x01e9
        L_0x01f4:
            java.lang.String r0 = "messageHandler"
            goto L_0x01fd
        L_0x01f7:
            X.C18070vi.A11(r9)
            goto L_0x0200
        L_0x01fb:
            java.lang.String r0 = "sendMethods"
        L_0x01fd:
            X.C18070vi.A11(r0)
        L_0x0200:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.ChangeNumber.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A06;
        if (scrollView == null) {
            C18070vi.A11("scrollView");
            throw null;
        }
        ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new C20300AFi(this, 3));
        }
    }

    public Dialog onCreateDialog(int i) {
        Dialog dialog;
        if (i == 1) {
            String string = getString(2131894984);
            ProgressDialog progressDialog = new ProgressDialog(this);
            AnonymousClass8BX.A0x(progressDialog, string);
            dialog = progressDialog;
        } else if (i != 2) {
            dialog = super.onCreateDialog(i);
        } else {
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(2131888046);
            C20152A9o.A00(A002, this, 18, 2131887451);
            dialog = A002.create();
        }
        C18070vi.A0X(dialog);
        return dialog;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18070vi.A0d(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onRestoreInstanceState(bundle);
        A0T = bundle.getString("oldCountryCode");
        A0U = bundle.getString("oldPhoneNumber");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("notifyJids");
        if (stringArrayList == null) {
            stringArrayList = AnonymousClass000.A13();
        }
        this.A0J = stringArrayList;
        this.A00 = bundle.getInt("mode");
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("oldCountryCode", A0T);
        bundle.putCharSequence("oldPhoneNumber", A0U);
        bundle.putStringArrayList("notifyJids", this.A0J);
        bundle.putInt("mode", this.A00);
    }

    public static final void A10(ChangeNumber changeNumber) {
        String str;
        float f;
        ScrollView scrollView = changeNumber.A06;
        if (scrollView == null) {
            str = "scrollView";
        } else {
            boolean canScrollVertically = scrollView.canScrollVertically(1);
            str = "bottomButtonContainer";
            View view = changeNumber.A0M;
            if (canScrollVertically) {
                if (view != null) {
                    f = changeNumber.A0L;
                }
            } else if (view != null) {
                f = 0.0f;
            }
            view.setElevation(f);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A12(ChangeNumber changeNumber, boolean z) {
        boolean booleanValue;
        boolean z2;
        int i;
        int i2;
        long j;
        long j2;
        long j3;
        Intent A0G2;
        String A1F;
        int A012;
        long j4;
        long j5;
        long j6;
        long j7;
        int A002;
        String str;
        boolean z3;
        ChangeNumber changeNumber2 = changeNumber;
        boolean z4 = z;
        C17880vN.A1F(AnonymousClass8BR.A08(changeNumber2), "registration_use_sms_retriever", z4);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChangeNumber/startVerifyCode/useSmsRetriever=");
        A10.append(z4);
        A10.append("/shouldStartAccountDefenceFlow=");
        Boolean bool = (Boolean) changeNumber2.A0M.A0J.A06();
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        C17900vP.A0r(A10, booleanValue);
        if (changeNumber2.A0M.A0I.A06() != null) {
            if (C18020vd.A05(C18040vf.A02, changeNumber2.A00, 4031)) {
                C33841jT.A03(changeNumber2.A0I, 12, true);
                AnonymousClass8BT.A0e(changeNumber2).A0F("autoconf_verification_step", "autoconf_verification_started");
            }
            A1F = C108945cZ.A1F(changeNumber2.A0M.A0I);
            A012 = AnonymousClass8BX.A01(changeNumber2.A0M.A0A);
            j4 = changeNumber2.A03;
            j5 = changeNumber2.A04;
            j6 = changeNumber2.A05;
            A002 = ExistViewModel.A00(changeNumber2);
            str = null;
            z3 = false;
            j7 = -1;
        } else {
            int A013 = AnonymousClass8BX.A01(changeNumber2.A0M.A09);
            Boolean bool2 = C17970vW.A01;
            z2 = true;
            if (A013 == 1) {
                C33841jT.A03(changeNumber2.A0I, 17, true);
                A1F = C108945cZ.A1F(changeNumber2.A0M.A0I);
                A012 = AnonymousClass8BX.A01(changeNumber2.A0M.A0A);
                j4 = changeNumber2.A03;
                j5 = changeNumber2.A04;
                j6 = changeNumber2.A05;
                j7 = changeNumber2.A01;
                A002 = ExistViewModel.A00(changeNumber2);
                str = null;
                z3 = false;
            } else {
                Boolean bool3 = (Boolean) changeNumber2.A0M.A0J.A06();
                if (bool3 == null || !bool3.booleanValue()) {
                    Log.i("ChangeNumber/startVerifyCode/fallback");
                    j = changeNumber2.A03;
                    j2 = changeNumber2.A04;
                    j3 = changeNumber2.A05;
                    i2 = ExistViewModel.A00(changeNumber2);
                    i = 0;
                } else {
                    int A014 = AnonymousClass8BX.A01(changeNumber2.A0M.A02);
                    C33841jT r1 = changeNumber2.A0I;
                    if (A014 == 1) {
                        C33841jT.A03(r1, 14, true);
                        A0G2 = AnonymousClass1LU.A0L(changeNumber2, changeNumber2.A03, changeNumber2.A04, true, z4);
                        changeNumber2.A3q(A0G2, z2);
                    }
                    C33841jT.A03(r1, 13, true);
                    j = changeNumber2.A03;
                    j2 = changeNumber2.A04;
                    i2 = 0;
                    j3 = 0;
                    i = 1;
                }
                A0G2 = AnonymousClass1LU.A0G(changeNumber2, i2, i, j, j2, j3, true, z4);
                changeNumber2.A3q(A0G2, z2);
            }
        }
        z2 = true;
        boolean z5 = z3;
        boolean z6 = z3;
        int i3 = z3 ? 1 : 0;
        A0G2 = AnonymousClass1LU.A1W(changeNumber2, A1F, str, A012, A002, i3, j4, j5, j6, j7, z4, z6, true, z5);
        changeNumber2.A3q(A0G2, z2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r3 = new java.lang.Object[1];
        r2 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r2 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        r1 = r6.A0O.A03(r6.A00, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r6.BhR(X.C17880vN.A0q(r6, r1, r3, 0, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        r0 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0.requestFocus();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A13(com.whatsapp.registration.phonenumberentry.ChangeNumber r6, X.C188129gv r7, java.lang.String r8, java.lang.String r9) {
        /*
            X.1LA r0 = r6.A04
            r1 = 0
            int r0 = X.C63942tw.A00(r0, r1, r8, r9)
            java.lang.String r3 = ""
            r2 = 1
            r4 = 0
            switch(r0) {
                case 1: goto L_0x0073;
                case 2: goto L_0x002c;
                case 3: goto L_0x0061;
                case 4: goto L_0x005a;
                case 5: goto L_0x0048;
                case 6: goto L_0x0044;
                default: goto L_0x000e;
            }
        L_0x000e:
            r5 = 2131894977(0x7f1222c1, float:1.9424774E38)
        L_0x0011:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r7.A06
            if (r2 == 0) goto L_0x001f
            X.1K3 r1 = r6.A0O
            X.0vb r0 = r6.A00
            java.lang.String r1 = r1.A03(r0, r2)
        L_0x001f:
            java.lang.String r0 = X.C17880vN.A0q(r6, r1, r3, r4, r5)
            r6.BhR(r0)
        L_0x0026:
            android.widget.EditText r0 = r7.A03
        L_0x0028:
            r0.requestFocus()
        L_0x002b:
            return r4
        L_0x002c:
            r3 = 2131894973(0x7f1222bd, float:1.9424766E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.C17880vN.A1T(r1, r2, r4)
            r0 = 3
            X.C17880vN.A1T(r1, r0, r2)
            java.lang.String r0 = r6.getString(r3, r1)
            r6.BhR(r0)
            android.widget.EditText r0 = r7.A02
            goto L_0x0028
        L_0x0044:
            r5 = 2131894978(0x7f1222c2, float:1.9424776E38)
            goto L_0x0011
        L_0x0048:
            r5 = 2131894979(0x7f1222c3, float:1.9424778E38)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            X.1K3 r2 = r6.A0O
            X.0vb r1 = r6.A00
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L_0x00b3
            java.lang.String r1 = r2.A03(r1, r0)
            goto L_0x001f
        L_0x005a:
            r0 = 2131894987(0x7f1222cb, float:1.9424794E38)
            r6.BhQ(r0)
            goto L_0x0026
        L_0x0061:
            r0 = 2131894974(0x7f1222be, float:1.9424768E38)
            r6.BhQ(r0)
            android.widget.EditText r0 = r7.A02
            if (r0 == 0) goto L_0x006e
            r0.setText(r3)
        L_0x006e:
            android.widget.EditText r0 = r7.A02
            if (r0 == 0) goto L_0x002b
            goto L_0x0028
        L_0x0073:
            int r4 = java.lang.Integer.parseInt(r8)
            java.lang.String r1 = "\\D"
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            java.lang.String r3 = r0.A00(r9, r3)
            X.1LA r0 = r6.A04     // Catch:{ IOException -> 0x008d }
            java.lang.String r0 = r0.A03(r4, r3)     // Catch:{ IOException -> 0x008d }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x008d }
            r3 = r0
            goto L_0x0093
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "ChangeNumber/cc failed trimLeadingZero from CountryPhoneInfo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0093:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChangeNumber/cc="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "/number="
            X.C17900vP.A0f(r0, r3, r1)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r6.A0M
            X.1DT r0 = r0.A06
            r0.A0F(r8)
            com.whatsapp.registration.phonenumberentry.viewmodel.ExistViewModel r0 = r6.A0M
            X.1DT r0 = r0.A0D
            r0.A0F(r3)
            return r2
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.ChangeNumber.A13(com.whatsapp.registration.phonenumberentry.ChangeNumber, X.9gv, java.lang.String, java.lang.String):boolean");
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A00 = C72463Mc.A0e(r1);
            this.A00 = AnonymousClass1K1.A1f(A002);
            this.A07 = C72453Mb.A0d(r1);
            C166988f1.A0t(r1, r2, AnonymousClass3MZ.A0l(r1), this);
            C166988f1.A0r(A002, r1, r2, this, r1.A03);
            this.A01 = (C19880zA) r1.A7j.get();
            this.A09 = (C27301Vn) r1.A9A.get();
            this.A0H = C000200d.A00(r2.A0g);
            this.A09 = AnonymousClass3MZ.A0n(r1);
            this.A0A = (C27131Uv) r1.A5p.get();
            this.A0B = (C219017v) r1.A6S.get();
            this.A0C = (C25011Mn) r1.A9o.get();
            this.A0F = AnonymousClass1K1.A1j(A002);
            this.A0D = (C33451iq) r1.ABJ.get();
            this.A07 = AnonymousClass3MZ.A0f(r1);
            this.A0G = (A5R) r2.AIb.get();
            this.A08 = (C27301Vn) r1.A9A.get();
            this.A0I = C000200d.A00(r1.ABv);
        }
    }

    public void CCW() {
        Log.i("ChangeNumber/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        A9B.A0R(this, 2);
    }

    public void onDestroy() {
        C72293Lj r1 = this.A0Q;
        C18070vi.A0d(r1, 0);
        ((C37191p7) this.A0S.get()).A00.remove(r1);
        super.onDestroy();
    }

    public ChangeNumber(int i) {
        this.A0N = false;
        AGE.A00(this, 30);
    }

    public static final void A11(ChangeNumber changeNumber) {
        if (changeNumber.isFinishing()) {
            Log.i("ChangeNumber/verify/cancel");
            return;
        }
        changeNumber.A0M.A0F.A0F(0L);
        changeNumber.A0A.A1c((String) null);
        changeNumber.A05.CGN(new C21428Ajv(changeNumber, 18));
        AnonymousClass00H r0 = changeNumber.A0H;
        if (r0 != null) {
            Log.i("BusinessDirectoryStorageManager/onNumberChanged");
            AnonymousClass2KW r1 = ((C57302ir) r0.get()).A01;
            Log.i("BusinessDirectorySharedPrefManager/deleteLocation");
            C17880vN.A1B(AnonymousClass8BT.A05(r1), "current_search_location");
            C21428Ajv.A00(changeNumber.A05, changeNumber, 19);
            changeNumber.A0M.A0X((C187799gO) null, (String) null, 0, false);
            return;
        }
        C18070vi.A11("businessDirectoryStorageManager");
        throw null;
    }

    public void A4k(String str, String str2, String str3) {
        boolean A1J = C108975cc.A1J(str3);
        super.A4k(str, str2, str3);
        if (this.A0H.A00) {
            A9B.A0P(this, this.A08, this.A0I, A1J);
        }
        C21428Ajv.A00(this.A05, this, 20);
        finish();
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.9gv] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.9gv] */
    public void onCreate(Bundle bundle) {
        String simCountryIso;
        super.onCreate(bundle);
        this.A0C.A04();
        C28281Zt.A0A(getWindow(), false);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
        setTitle(2131888080);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0G();
            setContentView(2131624511);
            PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) AnonymousClass3MY.A0H(this, 2131434458);
            PhoneNumberEntry phoneNumberEntry2 = (PhoneNumberEntry) AnonymousClass3MY.A0H(this, 2131434461);
            ? obj = new Object();
            this.A0E = obj;
            obj.A05 = phoneNumberEntry;
            ? obj2 = new Object();
            this.A0L = obj2;
            obj2.A05 = phoneNumberEntry2;
            this.A06 = (ScrollView) AnonymousClass3MY.A0H(this, 2131434837);
            this.A0M = AnonymousClass3MY.A0H(this, 2131428324);
            C188129gv r0 = this.A0E;
            if (r0 != null) {
                WaEditText waEditText = phoneNumberEntry.A01;
                r0.A02 = waEditText;
                C18070vi.A0z(waEditText, "null cannot be cast to non-null type com.whatsapp.WaEditText");
                AnonymousClass3MY.A0w(this, waEditText, 2131893146);
                C188129gv r02 = this.A0L;
                WaEditText waEditText2 = phoneNumberEntry2.A01;
                r02.A02 = waEditText2;
                AnonymousClass3MY.A0w(this, waEditText2, 2131892465);
                C188129gv r1 = this.A0E;
                if (r1 != null) {
                    r1.A03 = phoneNumberEntry.A02;
                    C188129gv r12 = this.A0L;
                    WaEditText waEditText3 = phoneNumberEntry2.A02;
                    r12.A03 = waEditText3;
                    waEditText3.setTextDirection(3);
                    C188129gv r03 = this.A0E;
                    if (r03 != null) {
                        r03.A03.setTextDirection(3);
                        this.A0L = (float) getResources().getDimensionPixelSize(2131168631);
                        phoneNumberEntry.A03 = new AnonymousClass8nC(this, 0);
                        phoneNumberEntry2.A03 = new AnonymousClass8nC(this, 1);
                        String A0t = C108955ca.A0t(this.A0A);
                        String A0u = C108955ca.A0u(this.A0A);
                        if (A0t.length() <= 0 || A0u.length() <= 0) {
                            TelephonyManager A0K2 = this.A08.A0K();
                            Charset charset = AnonymousClass1K3.A06;
                            if (!(A0K2 == null || (simCountryIso = A0K2.getSimCountryIso()) == null)) {
                                try {
                                    A0T = this.A04.A06(simCountryIso);
                                } catch (IOException e) {
                                    Log.e("ChangeNumber/iso/code failed to get code from CountryPhoneInfo", e);
                                }
                            }
                        } else {
                            A0T = A0t;
                            A0U = A0u;
                            C188129gv r04 = this.A0E;
                            if (r04 != null) {
                                EditText editText = r04.A03;
                                if (editText != null) {
                                    editText.setText(A0u);
                                }
                            }
                        }
                        String str = A0T;
                        if (str != null) {
                            C188129gv r05 = this.A0E;
                            if (r05 != null) {
                                EditText editText2 = r05.A02;
                                if (editText2 != null) {
                                    editText2.setText(str);
                                }
                                this.A0L.A02.setText(A0T);
                            }
                        }
                        C188129gv r13 = this.A0E;
                        if (r13 != null) {
                            EditText editText3 = r13.A03;
                            C18070vi.A0z(editText3, "null cannot be cast to non-null type com.whatsapp.WaEditText");
                            r13.A01 = AnonymousClass4W1.A00(editText3);
                            C188129gv r14 = this.A0E;
                            if (r14 != null) {
                                EditText editText4 = r14.A02;
                                C18070vi.A0z(editText4, "null cannot be cast to non-null type com.whatsapp.WaEditText");
                                r14.A00 = AnonymousClass4W1.A00(editText4);
                                C188129gv r15 = this.A0L;
                                r15.A01 = AnonymousClass4W1.A00(r15.A03);
                                C188129gv r16 = this.A0L;
                                r16.A00 = AnonymousClass4W1.A00(r16.A02);
                                TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131433119);
                                textView.setText(2131899268);
                                textView.setOnClickListener(this.A0R);
                                C188129gv r06 = this.A0E;
                                if (r06 != null) {
                                    String str2 = r06.A06;
                                    if (!(str2 == null || str2.length() == 0)) {
                                        C17900vP.A0f("ChangeNumber/country: ", str2, AnonymousClass000.A10());
                                        C188129gv r07 = this.A0E;
                                        if (r07 != null) {
                                            PhoneNumberEntry phoneNumberEntry3 = r07.A05;
                                            if (phoneNumberEntry3 != null) {
                                                phoneNumberEntry3.A03(str2);
                                            }
                                            this.A0L.A05.A03(str2);
                                        }
                                    }
                                    ExistViewModel existViewModel = this.A0M;
                                    existViewModel.A05.A0F(C17880vN.A0r(C72453Mb.A0M(this), "change_number_new_number_banned"));
                                    C72293Lj r17 = this.A0Q;
                                    C18070vi.A0d(r17, 0);
                                    ((C37191p7) this.A0S.get()).A00.add(r17);
                                    this.A0L = (float) AnonymousClass3MZ.A01(this, 2131168631);
                                    ScrollView scrollView = this.A06;
                                    if (scrollView != null) {
                                        scrollView.getViewTreeObserver().addOnScrollChangedListener(new C20301AFj(this, 2));
                                        ScrollView scrollView2 = this.A06;
                                        if (scrollView2 != null) {
                                            ViewTreeObserver viewTreeObserver = scrollView2.getViewTreeObserver();
                                            if (viewTreeObserver != null) {
                                                viewTreeObserver.addOnPreDrawListener(new C20300AFi(this, 3));
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    C18070vi.A11("scrollView");
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
            C18070vi.A11("oldNumberEntry");
            throw null;
        }
        throw C17880vN.A0g();
    }

    public void onPause() {
        SharedPreferences.Editor remove;
        super.onPause();
        C188129gv r1 = this.A0E;
        if (r1 != null) {
            r1.A01 = AnonymousClass4W1.A00(r1.A03);
            C188129gv r12 = this.A0E;
            if (r12 != null) {
                r12.A00 = AnonymousClass4W1.A00(r12.A02);
                C188129gv r13 = this.A0L;
                r13.A01 = AnonymousClass4W1.A00(r13.A03);
                C188129gv r14 = this.A0L;
                r14.A00 = AnonymousClass4W1.A00(r14.A02);
                this.A0M.A05.A06();
                Object A062 = this.A0M.A05.A06();
                C19830z4 r0 = this.A0A;
                if (A062 != null) {
                    String A042 = ExistViewModel.A04(this);
                    String A052 = ExistViewModel.A05(this);
                    SharedPreferences.Editor A002 = C19830z4.A00(r0);
                    StringBuilder A10 = AnonymousClass000.A10();
                    C17890vO.A10("+", A042, A052, A10);
                    remove = A002.putString("change_number_new_number_banned", A10.toString());
                } else if (C17880vN.A0r(C17890vO.A0B(r0), "change_number_new_number_banned") != null) {
                    remove = AnonymousClass8BR.A08(this).remove("change_number_new_number_banned");
                } else {
                    return;
                }
                remove.apply();
                return;
            }
        }
        C18070vi.A11("oldNumberEntry");
        throw null;
    }

    public void onResume() {
        super.onResume();
        this.A0K = false;
        C188129gv r0 = this.A0E;
        if (r0 != null) {
            AnonymousClass4W1.A01(r0.A02, r0.A00);
            C188129gv r02 = this.A0E;
            if (r02 != null) {
                AnonymousClass4W1.A01(r02.A03, r02.A01);
                C188129gv r03 = this.A0L;
                AnonymousClass4W1.A01(r03.A02, r03.A00);
                C188129gv r04 = this.A0L;
                AnonymousClass4W1.A01(r04.A03, r04.A01);
                C188129gv r05 = this.A0E;
                if (r05 != null) {
                    r05.A03.clearFocus();
                    return;
                }
            }
        }
        C18070vi.A11("oldNumberEntry");
        throw null;
    }

    public ChangeNumber() {
        this(0);
        this.A0J = AnonymousClass000.A13();
        this.A0S = C217517g.A00(16449);
        this.A0P = new C21428Ajv(this, 21);
        this.A0Q = new C96984oj(this, 2);
        this.A0O = new C161268Cm(Looper.getMainLooper(), this, 6);
        this.A0R = new AnonymousClass48o(this, 11);
    }
}
