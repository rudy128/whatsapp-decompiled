package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: X.8pb  reason: invalid class name and case insensitive filesystem */
public abstract class C170278pb extends C64502us {
    public static C20284AEs A02(AnonymousClass1KI r1, C170278pb r2, C29621ca r3) {
        r2.A05(r1, r3, 0);
        return r2.A08();
    }

    public static Intent A01(Context context, AnonymousClass8pY r5, Object obj) {
        Intent intent = new Intent(context, BrazilPayBloksActivity.class);
        AnonymousClass8k7.A03(intent, "referral_screen", "payment_method_details");
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", obj);
        hashMap.put("last4", r5.A0J);
        intent.putExtra("screen_params", hashMap);
        intent.putExtra("screen_name", "brpay_p_add_cvv_card");
        return intent;
    }

    public static boolean A03(AnonymousClass8pS r0) {
        return ((Boolean) r0.A04.A00).booleanValue();
    }

    public C20284AEs A08() {
        C63572tK A00;
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        String str4;
        int i;
        AnonymousClass8pZ r3;
        C20284AEs aEs;
        int i2;
        if (this instanceof AnonymousClass8pJ) {
            return null;
        }
        if (this instanceof AnonymousClass8pT) {
            AnonymousClass8pT r2 = (AnonymousClass8pT) this;
            C63572tK A002 = C63572tK.A00("BR");
            String str5 = r2.A0H;
            int i3 = r2.A00;
            int A003 = AnonymousClass8BU.A00(r2.A0W ? 1 : 0);
            int A004 = AnonymousClass8BU.A00(r2.A0V ? 1 : 0);
            int A005 = AnonymousClass8BU.A00(r2.A0S ? 1 : 0);
            int A006 = AnonymousClass8BU.A00(r2.A0R ? 1 : 0);
            aEs = C20085A6m.A02(A002, r2, str5, r2.A0J, i3, A003, A004, A005, A006, r2.A01, r2.A05);
            i2 = r2.A01;
        } else if (this instanceof AnonymousClass8pR) {
            AnonymousClass8pR r10 = (AnonymousClass8pR) this;
            C63572tK A007 = C63572tK.A00("BR");
            String str6 = r10.A06;
            long j = r10.A00;
            aEs = new C20284AEs();
            C17960vV.A07(A007);
            aEs.A07 = A007;
            aEs.A05 = j;
            aEs.A06 = -1;
            aEs.A00 = 0;
            aEs.A01 = 0;
            aEs.A0A = str6;
            aEs.A0B("");
            aEs.A0B = (String) AnonymousClass8BT.A0q(r10.A01);
            aEs.A0D = null;
            aEs.A08 = r10;
            i2 = r10.A00;
        } else if (this instanceof AnonymousClass8pS) {
            return null;
        } else {
            if (this instanceof AnonymousClass8pZ) {
                AnonymousClass8pZ r32 = (AnonymousClass8pZ) this;
                A00 = C63572tK.A00("BR");
                str = r32.A05;
                str2 = r32.A08;
                str3 = r32.A09;
                z = r32.A0E;
                z2 = r32.A0F;
                str4 = r32.A03;
                i = r32.A00;
                r3 = r32;
            } else {
                AnonymousClass8pX r33 = (AnonymousClass8pX) this;
                A00 = C63572tK.A00("IN");
                str = r33.A05;
                str2 = r33.A08;
                str3 = r33.A09;
                z = r33.A0E;
                z2 = r33.A0F;
                str4 = r33.A03;
                i = 0;
                r3 = r33;
            }
            AnonymousClass8pO r4 = new AnonymousClass8pO(str3, str2, i, z, z2);
            C17960vV.A07(A00);
            r4.A07 = A00;
            r4.A0A = str;
            r4.A08 = r3;
            r4.A0B(str4);
            return r4;
        }
        aEs.A04 = i2;
        return aEs;
    }

    public C1418477e A09() {
        Object obj;
        if ((this instanceof AnonymousClass8pJ) || (this instanceof AnonymousClass8pR) || !(this instanceof AnonymousClass8pS)) {
            return null;
        }
        AnonymousClass8pS r1 = (AnonymousClass8pS) this;
        if (!C20061A5k.A02(r1.A02)) {
            return r1.A02;
        }
        try {
            C1418477e r0 = r1.A05;
            if (r0 != null) {
                obj = r0.A00;
            } else {
                obj = null;
            }
            return AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, C17880vN.A16((String) obj).optString("account_name"), "accountHolderName");
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean A0A() {
        if (this instanceof AnonymousClass8pY) {
            return ((AnonymousClass8pY) this).A0a;
        }
        return true;
    }
}
