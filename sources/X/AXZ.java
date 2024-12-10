package X;

import android.app.Activity;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

public final /* synthetic */ class AXZ implements B8a {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C1418477e A01;
    public final /* synthetic */ C197929xV A02;
    public final /* synthetic */ C183469Yj A03;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.9fp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.9fp, java.lang.Object] */
    public final void C3q(UserJid userJid, C1418477e r11, C1418477e r12, C1418477e r13, A7B a7b, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object obj;
        C41731wy r0;
        String str3;
        BigDecimal bigDecimal;
        int i;
        C197929xV r02 = this.A02;
        C183469Yj r1 = this.A03;
        Activity activity = this.A00;
        C1418477e r6 = this.A01;
        if (!z || a7b != null) {
            ? obj2 = new Object();
            obj2.A00 = 1;
            obj2.A01 = a7b;
            r0 = r1.A00.A00;
            obj = obj2;
        } else {
            boolean z5 = z2;
            if (z3) {
                r02.A00.A00(activity, new AOH(r1, z5), userJid, r6, true, false);
                return;
            }
            AnonymousClass8GO r4 = r1.A00;
            AnonymousClass1DT r7 = r4.A03;
            C20118A8b a8b = (C20118A8b) AnonymousClass8BS.A0W(r7);
            a8b.A0P = z5;
            a8b.A09 = (String) AnonymousClass8BT.A0q(r11);
            String str4 = str2;
            if (str2 != null) {
                a8b.A06 = str4;
            }
            if (!TextUtils.isEmpty(a8b.A0A) && (str3 = a8b.A02) != null && (str3.contentEquals("DEEP_LINK") || str3.contentEquals("GALLERY_QR_CODE"))) {
                String str5 = a8b.A0A;
                AnonymousClass1KJ r3 = AnonymousClass1KL.A0B;
                AnonymousClass1KN A0H = AnonymousClass8BT.A0H(r3, str5);
                String A012 = r4.A06.A01(a8b.A06, a8b.A0C, z5);
                if (!AnonymousClass1EG.A0H(A012)) {
                    bigDecimal = new BigDecimal(A012);
                    if (A0H != null && A0H.A00.compareTo(bigDecimal) > 0) {
                        i = 9;
                        if (z2) {
                            i = 8;
                        }
                    }
                } else {
                    bigDecimal = new BigDecimal(A7Z.A00(r4.A04, a8b));
                    if (A0H != null && A0H.A00.compareTo(bigDecimal) > 0) {
                        i = 7;
                    }
                }
                ? obj3 = new Object();
                obj3.A00 = i;
                obj3.A02 = r3.BLd(r4.A05, bigDecimal);
                r0 = r4.A00;
                obj = obj3;
            }
            r7.A0F(a8b);
            AnonymousClass8GO.A03(r4);
            return;
        }
        r0.A0F(obj);
    }

    public /* synthetic */ AXZ(Activity activity, C1418477e r2, C197929xV r3, C183469Yj r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = activity;
        this.A01 = r2;
    }
}
