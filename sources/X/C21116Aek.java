package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.Aek  reason: case insensitive filesystem */
public final /* synthetic */ class C21116Aek implements AnonymousClass1TI {
    public final /* synthetic */ AnonymousClass91R A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public final void accept(Object obj) {
        String str;
        AnonymousClass91R r1 = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        r1.A0P.A0J = (Boolean) obj;
        if (!r1.A4y()) {
            AnonymousClass91R.A1A(r1, z2, false);
        } else if (!r1.A0P.A0K(r1.A0H, r1.A0g) || z || !r1.A05.A0P(C22971Dz.A00(r1.A0H))) {
            HashMap hashMap = r1.A0M.A06;
            if (hashMap == null) {
                Log.i("IndiaUpiPaymentActivity/sendToNonWhatsAppUser: CredentialBlobs is null");
                return;
            }
            boolean isEmpty = TextUtils.isEmpty(r1.A0Y);
            C20284AEs aEs = r1.A0B;
            C170278pb r3 = aEs.A08;
            C17960vV.A07(r3);
            AnonymousClass8pS r32 = (AnonymousClass8pS) r3;
            if (!isEmpty) {
                C175828zL r5 = r1.A0D;
                String str2 = r1.A0s;
                AnonymousClass1KN r6 = r1.A09;
                C170318pf r2 = r1.A0P;
                String str3 = r2.A0T;
                String str4 = r2.A0U;
                String str5 = r2.A0R;
                String str6 = r2.A0S;
                C1418477e r7 = r32.A05;
                String str7 = aEs.A0A;
                r5.A01(r6, r7, new AY7(r1), r1.A06, r1.A0S, str2, str3, str4, str5, str6, str7, (String) null, hashMap);
                return;
            }
            r1.A0P.A0M = AnonymousClass1PP.A00(r1.A02, r1.A05, false);
            AEP aep = r1.A0U;
            if (aep != null) {
                str = aep.A00;
            } else {
                str = null;
            }
            C175788zH r36 = r1.A0E;
            C18030ve r18 = r1.A0E;
            C170318pf r20 = r1.A0P;
            C1418477e r17 = r32.A05;
            String str8 = r1.A0B.A0A;
            AnonymousClass1KN r15 = r1.A09;
            String A0j = AnonymousClass8BS.A0j(r1.A06);
            C1418477e r14 = r1.A0H;
            String str9 = r1.A0h;
            String str10 = r1.A0a;
            String str11 = r1.A0e;
            String str12 = r1.A0d;
            String str13 = r1.A0Z;
            C175758zE r72 = r1.A06;
            boolean A1X = AnonymousClass8BT.A1X(r1);
            String str14 = r1.A0s;
            String str15 = r1.A0U;
            C1418477e r4 = r1.A0I;
            String A012 = r1.A09.A01();
            C18030ve r16 = r18;
            C1418477e r182 = r14;
            C1418477e r19 = r4;
            C175788zH r142 = r36;
            r142.A00(r15, r16, r17, r182, r19, r20, r72, new AYR(r1, 0), str8, A0j, str9, str10, str11, str12, str13, str14, str15, str, A012, hashMap, A1X);
        } else {
            AnonymousClass91R.A1A(r1, false, true);
        }
    }

    public /* synthetic */ C21116Aek(AnonymousClass91R r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }
}
