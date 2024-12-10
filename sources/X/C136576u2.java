package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.6u2  reason: invalid class name and case insensitive filesystem */
public class C136576u2 {
    public final AnonymousClass1KB A00;
    public final C32531hL A01;
    public final AnonymousClass118 A02;
    public final C27301Vn A03;
    public final C19830z4 A04;
    public final C33841jT A05;
    public final AnonymousClass1CM A06;
    public final AnonymousClass71O A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass19D A09;
    public final C18030ve A0A;

    public boolean A02(ADM adm, boolean z) {
        if (!z || adm == null || TextUtils.isEmpty(adm.A01)) {
            return false;
        }
        String str = adm.A04;
        return !TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str);
    }

    public Intent A00(Context context, ADM adm) {
        Log.i("banmanager/createBanAppealActivityIntent");
        boolean z = adm.A05;
        String str = adm.A04;
        C17960vV.A07(str);
        int parseInt = Integer.parseInt(str);
        String str2 = adm.A03;
        String str3 = adm.A01;
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
        A0A2.putExtra("is_eu_smb", z);
        A0A2.putExtra("ban_violation_type", parseInt);
        A0A2.putExtra("ban_violation_reason", str2);
        A0A2.putExtra("appeal_request_token", str3);
        A0A2.putExtra("launch_source", 2);
        return A0A2;
    }

    public boolean A01() {
        boolean z;
        int A002 = this.A06.A00(false);
        if (A002 == 9 || A002 == 10) {
            z = !TextUtils.isEmpty(C17880vN.A0r(C17890vO.A0B(this.A07.A06), "support_ban_appeal_token"));
        } else {
            z = false;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BanManager/canFetchOrSubmitBanAppeal returning ");
        A10.append(z);
        C17900vP.A0j(", reg_state: ", A10, A002);
        return z;
    }

    public C136576u2(AnonymousClass1KB r1, C32531hL r2, AnonymousClass118 r3, C27301Vn r4, C19830z4 r5, AnonymousClass19D r6, C18030ve r7, C33841jT r8, AnonymousClass1CM r9, AnonymousClass71O r10, AnonymousClass00H r11) {
        this.A0A = r7;
        this.A00 = r1;
        this.A02 = r3;
        this.A09 = r6;
        this.A08 = r11;
        this.A01 = r2;
        this.A07 = r10;
        this.A05 = r8;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r9;
    }
}
