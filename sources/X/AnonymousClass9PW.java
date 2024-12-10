package X;

import android.os.Bundle;
import com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet;

/* renamed from: X.9PW  reason: invalid class name */
public abstract class AnonymousClass9PW {
    public static final CallPermissionRequestBottomSheet A00(A2A a2a, AnonymousClass21L r8) {
        String str;
        String str2;
        C20277AEk aEk;
        C20253ADl aDl;
        C20285AEt aEt = r8.A00;
        String str3 = null;
        if (aEt == null || (aEk = aEt.A06) == null || (aDl = (C20253ADl) C29431cG.A0c(aEk.A03)) == null) {
            str = null;
        } else {
            str = aDl.A01.A00;
        }
        A2Y A01 = a2a.A01(r8);
        Bundle A0D = C17880vN.A0D();
        AnonymousClass205 r0 = r8.A0v;
        AnonymousClass4aU.A0A(A0D, r0);
        AnonymousClass1BI r02 = r0.A00;
        if (r02 != null) {
            str2 = r02.getRawString();
        } else {
            str2 = null;
        }
        A0D.putString("chatjid_raw_params", str2);
        A0D.putString("reply_options_params", str);
        A0D.putBoolean("is_outgoing_call_missed_params", false);
        if (A01 != null) {
            str3 = A01.A00().toString();
        }
        A0D.putString("user_selected_reply_option_params", str3);
        CallPermissionRequestBottomSheet callPermissionRequestBottomSheet = new CallPermissionRequestBottomSheet();
        callPermissionRequestBottomSheet.A1R(A0D);
        return callPermissionRequestBottomSheet;
    }
}
