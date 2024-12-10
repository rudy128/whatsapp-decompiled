package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.Jid;

/* renamed from: X.743  reason: invalid class name */
public abstract class AnonymousClass743 {
    public static final Intent A00(C133996pq r3, C1404471l r4, C116505xr r5, boolean z, boolean z2) {
        Jid A01;
        Intent A0A = C17880vN.A0A();
        if (z2) {
            A0A.putExtra("contact_updated", true);
        }
        if (z || r3.A02) {
            String A02 = r4.A02();
            if (A02 == null || A02.length() == 0) {
                A02 = r5.A05();
            }
            A0A.putExtra("newly_added_contact_name_key", A02);
            A0A.putExtra("newly_added_contact_phone_number_key", r5.A05());
            AnonymousClass1E7 r0 = r3.A00;
            if (!(r0 == null || (A01 = AnonymousClass1E7.A01(r0)) == null)) {
                AnonymousClass3MY.A12(A0A, A01, "newly_added_contact_jid_key");
                return A0A;
            }
        }
        return A0A;
    }

    public static final void A05(Activity activity, Resources resources, View view, AnonymousClass1KB r22, C30191dX r23, AnonymousClass1M9 r24, C139486yv r25, C133496or r26, C136756uL r27, AnonymousClass12E r28, C219217x r29, C19830z4 r30, C133956pm r31, C37301pI r32, C28931bI r33, C28931bI r34, C28931bI r35, C28931bI r36, C28931bI r37, C28931bI r38, C28931bI r39, AnonymousClass10I r40, boolean z, boolean z2, boolean z3) {
        C30191dX r12 = r23;
        C18070vi.A0d(r12, 7);
        C139486yv r14 = r25;
        C18070vi.A0d(r14, 8);
        C133956pm r4 = r31;
        C18070vi.A0d(r4, 13);
        r34.A04(0);
        r36.A04(0);
        C28931bI r5 = r35;
        r5.A04(0);
        View view2 = view;
        View A05 = C18070vi.A05(view2, 2131435978);
        if (!z2) {
            A05.setVisibility(0);
            View A052 = C18070vi.A05(A05, 2131435977);
            A052.setVisibility(0);
            r5.A02().setEnabled(false);
            Activity activity2 = activity;
            if (activity != null) {
                AnonymousClass12E r17 = r28;
                C136756uL r16 = r27;
                C133496or r15 = r26;
                AnonymousClass1M9 r13 = r24;
                AnonymousClass1KB r11 = r22;
                AnonymousClass10I r232 = r40;
                Resources resources2 = resources;
                C37301pI r21 = r32;
                C133956pm r20 = r4;
                C28931bI r222 = r5;
                A052.setOnClickListener(new AnonymousClass78I(activity2, resources2, view2, A052, r11, r12, r13, r14, r15, r16, r17, r29, r30, r20, r21, r222, r232, z, z3));
            }
        }
        r37.A04(8);
        r38.A04(8);
        C18070vi.A05(view2, 2131427606).setVisibility(8);
        r33.A04(8);
        r39.A04(8);
    }

    public static final boolean A07(C30191dX r1, C219217x r2) {
        C18070vi.A0d(r1, 1);
        if (r2.A02("android.permission.GET_ACCOUNTS") != 0 || !r1.A00()) {
            return false;
        }
        return true;
    }

    public static final void A06(Bundle bundle, C1404471l r6, C116505xr r7) {
        if (bundle != null) {
            String string = bundle.getString("contact_data_first_name");
            if (!(string == null || string.length() == 0)) {
                r6.A01 = C1404471l.A01(string);
                r6.A04.setText(string);
            }
            String string2 = bundle.getString("contact_data_last_name");
            if (!(string2 == null || string2.length() == 0)) {
                r6.A02 = C1404471l.A01(string2);
                r6.A05.setText(string2);
            }
            String string3 = bundle.getString("contact_data_business_name");
            if (!(string3 == null || string3.length() == 0)) {
                C28931bI r3 = r6.A0A;
                if (r3.A00 == null) {
                    ((TextInputLayout) C18070vi.A05(r3.A02(), 2131428556)).setHint((CharSequence) r6.A03.getResources().getString(2131888756));
                    EditText editText = (EditText) AnonymousClass1HF.A06(r3.A02(), 2131428555);
                    C18070vi.A0b(editText);
                    editText.setOnFocusChangeListener(new AnonymousClass78W(editText, r6, 0));
                    editText.addTextChangedListener(new AnonymousClass6If(editText, r6, 0));
                    r6.A00 = editText;
                }
                r6.A09.A04(0);
                r3.A04(0);
                EditText editText2 = r6.A00;
                if (editText2 != null) {
                    editText2.setText(string3);
                }
            }
            String string4 = bundle.getString("contact_data_phone");
            boolean z = bundle.getBoolean("entry_point_dialer");
            if (string4 != null && string4.length() != 0) {
                try {
                    C42811ym A0H = C42771yi.A00().A0H(string4, (String) null);
                    String valueOf = String.valueOf(A0H.countryCode_);
                    String A03 = C42771yi.A03(A0H);
                    r7.A08(valueOf);
                    C72453Mb.A1R(A03);
                    WaEditText waEditText = r7.A04;
                    if (waEditText == null) {
                        C18070vi.A11("phoneField");
                        throw null;
                    }
                    waEditText.setText(A03);
                    r7.A01 = C17900vP.A0A(valueOf, C108985cd.A0o(A03, "[^0-9]"));
                } catch (C24931Mf e) {
                    if (z) {
                        r7.A01 = string4;
                        WaEditText waEditText2 = r7.A04;
                        if (waEditText2 == null) {
                            C18070vi.A11("phoneField");
                            throw null;
                        } else {
                            waEditText2.setText(string4);
                        }
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Error while parsing phoneNumber, message: ");
                        C17890vO.A19(A10, e.message);
                    }
                }
            }
        }
    }

    public static final void A01(Activity activity) {
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        C1411974r r1 = new C1411974r(14);
        A00.A0k(activity.getString(2131893395));
        C108955ca.A1D(activity, A00, 2131893388);
        C108975cc.A0n(activity, r1, A00, 2131893393);
        if (!activity.isFinishing()) {
            AnonymousClass3MY.A1G(A00);
        }
    }

    public static final void A02(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        A00.A0k(activity.getString(2131893380));
        C108955ca.A1D(activity, A00, 2131893378);
        C108975cc.A0n(activity, onClickListener, A00, 2131893379);
        C109005cf.A0J(activity, onClickListener2, A00, 2131893381);
    }

    public static final void A03(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        A00.A0k(activity.getString(2131893395));
        C108955ca.A1D(activity, A00, 2131893391);
        C108975cc.A0n(activity, onClickListener, A00, 2131893389);
        C109005cf.A0J(activity, onClickListener2, A00, 2131893390);
    }

    public static final void A04(Activity activity, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C73203Rj A00 = AnonymousClass4a6.A00(activity);
        A00.A0k(activity.getString(2131893395));
        C108955ca.A1D(activity, A00, 2131893392);
        A00.A0L(onClickListener2, activity.getString(2131893390));
        C108975cc.A0n(activity, onClickListener, A00, 2131893393);
        if (!activity.isFinishing()) {
            AnonymousClass3MY.A1G(A00);
        }
    }
}
