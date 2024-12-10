package com.whatsapp.calling.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FR;
import X.AnonymousClass1FU;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1VP;
import X.AnonymousClass3MY;
import X.AnonymousClass5X3;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C19830z4;
import X.C22971Dz;
import X.C63982u1;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;
import java.util.List;

public class CallConfirmationFragment extends Hilt_CallConfirmationFragment {
    public AnonymousClass11S A00;
    public AnonymousClass1VP A01;
    public AnonymousClass1M9 A02;
    public C19830z4 A03;
    public AnonymousClass1MZ A04;
    public AnonymousClass00H A05;
    public boolean A06 = false;
    public final List A07 = AnonymousClass000.A13();

    public static void A03(AnonymousClass1KB r7, AnonymousClass1E7 r8, Integer num, String str, boolean z) {
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A0D = C17880vN.A0D();
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        A0D.putString("jid", C22971Dz.A06(r8.A06(cls)));
        A0D.putBoolean("is_video_call", z);
        A0D.putInt("call_from_ui", num.intValue());
        A0D.putInt("education_message_resouce_id", 2131887623);
        A0D.putString("callee_name", str);
        A0D.putInt("education_message_display_limit", 0);
        callConfirmationFragment.A1R(A0D);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("showCallConfirmationDialog groupJid: ");
        C17900vP.A0b(r8.A06(cls), A10);
        AnonymousClass1FR r1 = r7.A00;
        if (r1 != null) {
            r1.CMk(callConfirmationFragment, "CallConfirmationFragment");
        } else {
            Log.e("CallConfirmationFragment null dialog interface, show dialog failed.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.05w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.5gz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.05w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.05w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.05w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.05w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r13) {
        /*
            r12 = this;
            r8 = r12
            X.1FL r7 = r12.A1D()
            android.os.Bundle r1 = r12.A15()
            java.lang.String r0 = "is_video_call"
            boolean r11 = r1.getBoolean(r0)
            android.os.Bundle r1 = r12.A15()
            java.lang.String r0 = "jid"
            X.1BI r1 = X.C72463Mc.A0f(r1, r0)
            X.C17960vV.A07(r1)
            X.1M9 r0 = r12.A02
            X.1E7 r9 = r0.A0H(r1)
            android.os.Bundle r1 = r12.A15()
            java.lang.String r0 = "education_message_resouce_id"
            r6 = 0
            int r5 = r1.getInt(r0, r6)
            if (r5 != 0) goto L_0x00dd
            boolean r0 = r9.A0F()
            if (r0 == 0) goto L_0x00b9
            X.5gz r2 = new X.5gz
            r2.<init>(r7, r6)
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r0 = 1
            int[] r1 = new int[r0]
            r0 = 2130969449(0x7f040369, float:1.754758E38)
            r1[r6] = r0
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r1)
            boolean r0 = r0.getBoolean(r6, r6)
            r2.A06 = r0
            r0 = 2131624431(0x7f0e01ef, float:1.8876042E38)
            r2.setContentView(r0)
            r0 = 2131428647(0x7f0b0527, float:1.8478944E38)
            android.view.View r4 = r2.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0098
            r0 = 2131231735(0x7f0803f7, float:1.807956E38)
            if (r11 == 0) goto L_0x006d
            r0 = 2131231736(0x7f0803f8, float:1.8079561E38)
        L_0x006d:
            android.graphics.drawable.Drawable r3 = X.C24261Jm.A00(r7, r0)
            if (r3 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r3 = X.C27831Xu.A02(r3)
            r1 = 2130968707(0x7f040083, float:1.7546075E38)
            r0 = 2131099797(0x7f060095, float:1.7811957E38)
            int r0 = X.AnonymousClass3Ma.A00(r7, r1, r0)
            X.C27831Xu.A0C(r3, r0)
        L_0x0084:
            X.0vb r0 = r12.A01
            boolean r1 = X.AnonymousClass3MY.A1b(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00b5
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r0, r0, r0)
        L_0x0090:
            X.4cx r0 = new X.4cx
            r0.<init>(r7, r12, r9, r11)
            r4.setOnClickListener(r0)
        L_0x0098:
            r0 = 2131429948(0x7f0b0a3c, float:1.8481583E38)
            android.view.View r1 = r2.findViewById(r0)
            if (r1 == 0) goto L_0x00a7
            r0 = 2131232893(0x7f08087d, float:1.8081908E38)
            r1.setBackgroundResource(r0)
        L_0x00a7:
            r0 = 1
            r2.setCanceledOnTouchOutside(r0)
            boolean r0 = r7 instanceof X.AnonymousClass5X3
            if (r0 == 0) goto L_0x00b4
            java.util.List r0 = r12.A07
            r0.add(r7)
        L_0x00b4:
            return r2
        L_0x00b5:
            r4.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r3, r0)
            goto L_0x0090
        L_0x00b9:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r7)
            r0 = 2131886774(0x7f1202b6, float:1.9408136E38)
            if (r11 == 0) goto L_0x00c5
            r0 = 2131897834(0x7f122dea, float:1.9430569E38)
        L_0x00c5:
            r2.A0D(r0)
            r0 = 2131887611(0x7f1205fb, float:1.9409834E38)
            r10 = 1
            X.4az r6 = new X.4az
            r6.<init>(r7, r8, r9, r10, r11)
            r2.setPositiveButton(r0, r6)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 0
            X.05w r2 = X.AnonymousClass3MX.A0N(r0, r2, r1)
            goto L_0x00a7
        L_0x00dd:
            android.os.Bundle r1 = r12.A15()
            java.lang.String r0 = "education_message_display_limit"
            int r10 = r1.getInt(r0, r6)
            android.os.Bundle r1 = r12.A15()
            java.lang.String r0 = "callee_name"
            java.lang.String r2 = r1.getString(r0)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r7)
            r4 = 2131898713(0x7f123159, float:1.9432352E38)
            if (r11 == 0) goto L_0x00fd
            r4 = 2131899576(0x7f1234b8, float:1.9434102E38)
        L_0x00fd:
            r0 = 1
            if (r2 != 0) goto L_0x0120
            android.content.res.Resources r2 = X.AnonymousClass3MZ.A09(r12)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r2, r0, r1, r6, r5)
        L_0x010c:
            r3.setTitle(r0)
            X.4b1 r6 = new X.4b1
            r6.<init>(r7, r8, r9, r10, r11)
            r3.setPositiveButton(r4, r6)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 0
            X.05w r2 = X.AnonymousClass3MX.A0N(r0, r3, r1)
            goto L_0x00a7
        L_0x0120:
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r12)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = X.AnonymousClass3MW.A0x(r1, r2, r0, r6, r5)
            goto L_0x010c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.fragment.CallConfirmationFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    public static void A02(AnonymousClass1FU r5, AnonymousClass1E7 r6, Integer num, boolean z) {
        CallConfirmationFragment callConfirmationFragment = new CallConfirmationFragment();
        Bundle A0D = C17880vN.A0D();
        Class<AnonymousClass1BI> cls = AnonymousClass1BI.class;
        A0D.putString("jid", C22971Dz.A06(r6.A06(cls)));
        A0D.putBoolean("is_video_call", z);
        A0D.putInt("call_from_ui", num.intValue());
        callConfirmationFragment.A1R(A0D);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("showCallConfirmationDialog groupJid: ");
        C17900vP.A0b(r6.A06(cls), A10);
        r5.CMl(callConfirmationFragment);
    }

    public static void A00(Activity activity, CallConfirmationFragment callConfirmationFragment, AnonymousClass1E7 r10, boolean z) {
        int i = callConfirmationFragment.A15().getInt("call_from_ui");
        Activity activity2 = activity;
        callConfirmationFragment.A01.CNy(activity2, AnonymousClass3MY.A0a(r10), C63982u1.A04(callConfirmationFragment.A00, callConfirmationFragment.A02, callConfirmationFragment.A04, r10), i, z);
        callConfirmationFragment.A06 = true;
    }

    public static void A01(AnonymousClass1FU r1, AnonymousClass1E7 r2, Integer num, boolean z) {
        if (r2.A0F()) {
            A02(r1, r2, num, z);
        }
    }

    public static boolean A04(AnonymousClass1FU r2, C19830z4 r3, AnonymousClass1E7 r4, Integer num, boolean z) {
        if (C17890vO.A00(C17890vO.A0B(r3), "call_confirmation_dialog_count") >= 5 && !r4.A0F()) {
            return false;
        }
        A02(r2, r4, num, z);
        return true;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A06) {
            for (AnonymousClass5X3 r1 : this.A07) {
                QuickContactActivity.A0V((QuickContactActivity) r1, false);
            }
        }
        this.A07.clear();
    }
}
