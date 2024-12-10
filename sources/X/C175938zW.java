package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.8zW  reason: invalid class name and case insensitive filesystem */
public class C175938zW extends C175498yo {
    public final /* synthetic */ C1418477e A00;
    public final /* synthetic */ B8a A01;
    public final /* synthetic */ C175788zH A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public void A04(A7B a7b) {
        A02(a7b);
        this.A01.C3q((UserJid) null, (C1418477e) null, (C1418477e) null, (C1418477e) null, a7b, (String) null, (String) null, false, false, false, false);
    }

    public void A05(A7B a7b) {
        A02(a7b);
        this.A01.C3q((UserJid) null, (C1418477e) null, (C1418477e) null, (C1418477e) null, a7b, (String) null, (String) null, false, false, false, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175938zW(Context context, AnonymousClass1KB r8, C1418477e r9, B8a b8a, C33711jG r11, C196259ui r12, C175788zH r13, Integer num, boolean z) {
        super(context, r8, r11, r12, "upi-get-vpa-name");
        this.A02 = r13;
        this.A01 = b8a;
        this.A04 = z;
        this.A03 = num;
        this.A00 = r9;
    }

    private void A02(A7B a7b) {
        AnonymousClass90Z r0 = this.A02.A02;
        r0.A02.A01(a7b, this.A03, "upi-get-vpa-name");
    }

    public void A06(C29621ca r19) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C29621ca A0j = AnonymousClass8BR.A0j(r19);
        if (A0j != null) {
            AnonymousClass8pH r3 = new AnonymousClass8pH();
            C175788zH r6 = this.A02;
            r3.A05(r6.A00, A0j, 7);
            C144717Ik A0Z = AnonymousClass8BR.A0Z();
            Class<String> cls = String.class;
            Bundle bundle = r3.A00;
            if (bundle != null) {
                str = bundle.getString("vpa");
            } else {
                str = null;
            }
            C1418477e A0L = AnonymousClass8BT.A0L(A0Z, str);
            Bundle bundle2 = r3.A00;
            if (bundle2 != null) {
                str2 = bundle2.getString("jid");
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                C196199uc r4 = r6.A01;
                Bundle bundle3 = r3.A00;
                if (bundle3 != null) {
                    str8 = bundle3.getString("blocked");
                } else {
                    str8 = null;
                }
                r4.A02(A0L, "1".equals(str8));
            }
            r6.A02.A04(this.A03, "upi-get-vpa-name");
            B8a b8a = this.A01;
            Bundle bundle4 = r3.A00;
            boolean z = false;
            if (bundle4 != null) {
                z = C108975cc.A1B("1".equals(bundle4.getString("vpaValid")) ? 1 : 0);
            }
            Bundle bundle5 = r3.A00;
            boolean z2 = false;
            if (bundle5 != null) {
                z2 = C108975cc.A1B("1".equals(bundle5.getString("verifiedMerchant")) ? 1 : 0);
            }
            C144717Ik A0Z2 = AnonymousClass8BR.A0Z();
            Bundle bundle6 = r3.A00;
            if (bundle6 != null) {
                str3 = bundle6.getString("vpaName");
            } else {
                str3 = null;
            }
            C1418477e A0Y = AnonymousClass8BR.A0Y(A0Z2, cls, str3, "accountHolderName");
            Bundle bundle7 = r3.A00;
            if (bundle7 != null) {
                str4 = bundle7.getString("vpaId");
            } else {
                str4 = null;
            }
            Bundle bundle8 = r3.A00;
            if (bundle8 != null) {
                str5 = bundle8.getString("jid");
            } else {
                str5 = null;
            }
            UserJid A022 = C22941Dw.A02(str5);
            C1418477e r10 = this.A00;
            Bundle bundle9 = r3.A00;
            if (bundle9 != null) {
                str6 = bundle9.getString("blocked");
            } else {
                str6 = null;
            }
            boolean equals = "1".equals(str6);
            Bundle bundle10 = r3.A00;
            boolean z3 = false;
            if (bundle10 != null) {
                z3 = C108975cc.A1B("1".equals(bundle10.getString("merchant")) ? 1 : 0);
            }
            Bundle bundle11 = r3.A00;
            if (bundle11 != null) {
                str7 = bundle11.getString("mcc");
            } else {
                str7 = null;
            }
            b8a.C3q(A022, A0Y, A0L, r10, (A7B) null, str4, str7, z, z2, equals, z3);
            return;
        }
        Log.e("PAY: IndiaUpiPayNonWaVpaAction verifyPaymentVpa: missing account node");
        A02((A7B) null);
        this.A01.C3q((UserJid) null, (C1418477e) null, (C1418477e) null, (C1418477e) null, (A7B) null, (String) null, (String) null, false, false, false, false);
    }
}
