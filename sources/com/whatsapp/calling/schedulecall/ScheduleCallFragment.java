package com.whatsapp.calling.schedulecall;

import X.A4u;
import X.A8I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8Dv;
import X.C17960vV;
import X.C18000vb;
import X.C72453Mb;
import X.C72463Mc;
import X.C81463zH;
import X.C88774al;
import X.C88784am;
import X.C90034dQ;
import X.C90134da;
import X.C91374fa;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.util.Calendar;

public class ScheduleCallFragment extends Hilt_ScheduleCallFragment {
    public int A00;
    public TimePickerDialog A01;
    public AnonymousClass11S A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaImageView A06;
    public WaTextView A07;
    public A4u A08;
    public AnonymousClass11P A09;
    public C18000vb A0A;
    public AnonymousClass122 A0B;
    public AnonymousClass8Dv A0C;
    public AnonymousClass1BI A0D;
    public String A0E;
    public Calendar A0F;
    public boolean A0G;
    public boolean A0H;
    public final DatePickerDialog.OnDateSetListener A0I = new C88774al(this, 0);
    public final TimePickerDialog.OnTimeSetListener A0J = new C88784am(this, 0);

    public static void A01(Bundle bundle, ScheduleCallFragment scheduleCallFragment, String str) {
        if ("single_selection_dialog_result".equals(str)) {
            boolean z = true;
            if (bundle.getBoolean("isSuccess", true)) {
                if (bundle.getInt("selectedIndex") != 0) {
                    z = false;
                }
                scheduleCallFragment.A0H = z;
                WaImageView waImageView = scheduleCallFragment.A06;
                int i = 2131233225;
                if (z) {
                    i = 2131233480;
                }
                waImageView.setImageResource(i);
                WaTextView waTextView = scheduleCallFragment.A07;
                int i2 = 2131898570;
                if (scheduleCallFragment.A0H) {
                    i2 = 2131898569;
                }
                waTextView.setText(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.booleanValue() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.calling.schedulecall.ScheduleCallFragment A00(X.AnonymousClass1BI r3, java.lang.Boolean r4, int r5) {
        /*
            android.os.Bundle r2 = X.C17880vN.A0D()
            java.lang.String r0 = "chatJid"
            X.AnonymousClass3MY.A15(r2, r3, r0)
            if (r4 == 0) goto L_0x0012
            boolean r0 = r4.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "isVideo"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "entrypoint"
            r2.putInt(r0, r5)
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = new com.whatsapp.calling.schedulecall.ScheduleCallFragment
            r0.<init>()
            r0.A1R(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.ScheduleCallFragment.A00(X.1BI, java.lang.Boolean, int):com.whatsapp.calling.schedulecall.ScheduleCallFragment");
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626765);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        Bundle A15 = A15();
        this.A0D = C72463Mc.A0f(A15, "chatJid");
        this.A0H = A15.getBoolean("isVideo");
        this.A00 = A15.getInt("entrypoint");
        if (this.A0D == null) {
            Log.w("ScheduleCallFragment chatJid is null");
            A28();
            return;
        }
        A1E().A0t(new C91374fa(this, 7), this, "single_selection_dialog_result");
        this.A05 = (WaEditText) AnonymousClass1HF.A06(view, 2131428744);
        this.A06 = AnonymousClass3MW.A0R(view, 2131428749);
        this.A07 = AnonymousClass3MW.A0T(view, 2131428754);
        this.A03 = (WaEditText) AnonymousClass1HF.A06(view, 2131428664);
        this.A04 = (WaEditText) AnonymousClass1HF.A06(view, 2131428743);
        Calendar instance = Calendar.getInstance();
        this.A0F = instance;
        instance.add(11, 1);
        int i = this.A0F.get(12) % 30;
        Calendar calendar = this.A0F;
        int i2 = 30 - i;
        if (i < 15) {
            i2 = -i;
        }
        calendar.add(12, i2);
        String A16 = AnonymousClass3MX.A16(this, this.A02.A0D(), new Object[1], 0, 2131895417);
        this.A0E = A16;
        this.A05.setHint(A16);
        this.A05.setOnFocusChangeListener(new C90134da(this, 0));
        this.A05.setContentDescription(A1H(2131895436));
        Editable text = this.A05.getText();
        C17960vV.A07(text);
        text.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(32)});
        this.A05.requestFocus();
        ((InputMethodManager) A14().getSystemService("input_method")).showSoftInput(this.A05, 0);
        C90034dQ.A01(this.A03, this, 48);
        this.A03.setKeyListener((KeyListener) null);
        this.A03.setHint(DateFormat.getDateInstance(2, this.A0A.A0N()).format(this.A0F.getTime()));
        C90034dQ.A01(this.A04, this, 47);
        this.A04.setKeyListener((KeyListener) null);
        this.A04.setHint(A8I.A03(this.A0A, this.A0F));
        C90034dQ.A01(this.A07, this, 44);
        WaImageView waImageView = this.A06;
        int i3 = 2131233225;
        if (this.A0H) {
            i3 = 2131233480;
        }
        waImageView.setImageResource(i3);
        WaTextView waTextView = this.A07;
        int i4 = 2131898570;
        if (this.A0H) {
            i4 = 2131898569;
        }
        waTextView.setText(i4);
        C90034dQ.A01(AnonymousClass1HF.A06(view, 2131434814), this, 45);
        C90034dQ.A01(AnonymousClass1HF.A06(view, 2131429702), this, 46);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Long l;
        super.onDismiss(dialogInterface);
        int A042 = C72453Mb.A04(this.A0H ? 1 : 0);
        if (this.A0G) {
            l = Long.valueOf(this.A0F.getTimeInMillis() - System.currentTimeMillis());
        } else {
            l = null;
        }
        boolean z = this.A0G;
        int i = this.A00;
        C81463zH r1 = new C81463zH();
        r1.A00 = Boolean.valueOf(z);
        r1.A01 = Integer.valueOf(A042);
        r1.A02 = Integer.valueOf(i);
        r1.A03 = l;
        this.A08.A00.CC7(r1);
    }

    public int A25() {
        return 2132083971;
    }
}
