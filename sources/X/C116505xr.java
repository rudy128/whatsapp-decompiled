package X;

import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5xr  reason: invalid class name and case insensitive filesystem */
public class C116505xr extends AnonymousClass70Q {
    public TextWatcher A00;
    public String A01;
    public final TextInputLayout A02;
    public final WaEditText A03;
    public final AnonymousClass7EL A04;
    public final C133996pq A05;
    public final C132296mY A06;
    public final C28931bI A07;
    public final EditText A08;
    public final String A09;

    public void A0C(int i, Intent intent) {
        InputMethodManager inputMethodManager;
        if (i == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("iso");
            String stringExtra2 = intent.getStringExtra("cc");
            if (!(stringExtra == null || stringExtra2 == null)) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C108955ca.A0y(stringExtra));
                this.A08.setText(AnonymousClass001.A1H(" +", stringExtra2, A10));
                A07(stringExtra);
            }
            AnonymousClass7EL r1 = this.A04;
            r1.A00();
            this.A05.A00();
            Editable text = this.A03.getText();
            text.getClass();
            A00(r1, this, text.toString());
        }
        WaEditText waEditText = this.A03;
        waEditText.requestFocus();
        if (waEditText.getText() != null) {
            waEditText.setSelection(AnonymousClass3Ma.A03(waEditText));
        }
        Object systemService = this.A06.getSystemService("input_method");
        if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null && !inputMethodManager.isAcceptingText()) {
            inputMethodManager.toggleSoftInput(1, 1);
        }
    }

    public boolean A0D(CharSequence charSequence) {
        String A042;
        if (charSequence == null || (A042 = C63942tw.A04(this.A09)) == null) {
            return false;
        }
        return A042.equals(C63942tw.A04(AnonymousClass001.A1E(charSequence, A02(), AnonymousClass000.A10())));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116505xr(android.app.Activity r17, android.view.View r18, X.AnonymousClass1LA r19, X.AnonymousClass1KB r20, X.C1599386l r21, X.AnonymousClass7EL r22, X.C133996pq r23, X.C132296mY r24, X.AnonymousClass11C r25, X.C18000vb r26, X.AnonymousClass1K3 r27, X.AnonymousClass10I r28, java.lang.String r29) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r28
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r29
            r6.A09 = r0
            r0 = r22
            r6.A04 = r0
            r0 = r24
            r6.A06 = r0
            r0 = r23
            r6.A05 = r0
            r0 = 2131433781(0x7f0b1935, float:1.8489357E38)
            android.view.View r5 = X.AnonymousClass1HF.A06(r8, r0)
            com.whatsapp.WaEditText r5 = (com.whatsapp.WaEditText) r5
            r6.A03 = r5
            r0 = 2131433782(0x7f0b1936, float:1.848936E38)
            X.1bI r4 = X.C28931bI.A00(r8, r0)
            r6.A07 = r4
            r0 = 2131433786(0x7f0b193a, float:1.8489368E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r8, r0)
            com.google.android.material.textfield.TextInputLayout r3 = (com.google.android.material.textfield.TextInputLayout) r3
            r6.A02 = r3
            r0 = 2131429684(0x7f0b0934, float:1.8481048E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r8, r0)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r6.A08 = r2
            r0 = 2131428939(0x7f0b064b, float:1.8479537E38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            X.C18070vi.A0p(r3, r2, r1)
            r6.A04 = r5
            r6.A05 = r4
            r6.A01 = r2
            r6.A03 = r3
            r6.A02 = r1
            android.app.Activity r0 = r6.A06
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131894509(0x7f1220ed, float:1.9423825E38)
            java.lang.String r0 = r0.getString(r1)
            r3.setHint((java.lang.CharSequence) r0)
            android.content.res.Resources r0 = r7.getResources()
            java.lang.String r0 = r0.getString(r1)
            r3.setHint((java.lang.CharSequence) r0)
            r0 = 2131429685(0x7f0b0935, float:1.848105E38)
            android.view.View r2 = X.AnonymousClass1HF.A06(r8, r0)
            com.google.android.material.textfield.TextInputLayout r2 = (com.google.android.material.textfield.TextInputLayout) r2
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131889067(0x7f120bab, float:1.9412787E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint((java.lang.CharSequence) r0)
            r6.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116505xr.<init>(android.app.Activity, android.view.View, X.1LA, X.1KB, X.86l, X.7EL, X.6pq, X.6mY, X.11C, X.0vb, X.1K3, X.10I, java.lang.String):void");
    }

    public PhoneUserJid A0B() {
        String str = this.A09;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = "";
        if (str != null) {
            try {
                str2 = str.replaceAll("\\D", str2);
            } catch (AnonymousClass11T e) {
                Log.e((Throwable) e);
                return null;
            }
        }
        C22951Dx r0 = PhoneUserJid.Companion;
        return C22951Dx.A01(str2);
    }

    public static void A00(AnonymousClass7EL r4, C116505xr r5, CharSequence charSequence) {
        if (!r5.A0D(charSequence) && C63942tw.A00(r5.A07, (C139576z4) null, r5.A02(), AnonymousClass70Q.A01(r5)) == 1) {
            r4.A01(r5.A05(), r5.A04());
        }
    }
}
