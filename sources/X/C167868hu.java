package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.8hu  reason: invalid class name and case insensitive filesystem */
public class C167868hu extends C167898hx {
    public final AnonymousClass190 A00;
    public final C26911Ty A01;
    public final B7I A02;
    public final C19949A0g A03;
    public final AnonymousClass1OZ A04;
    public final C20004A2u A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final A6T A09;

    public void BrD(String str) {
        this.A05.A02("plm_details_view_tag");
        Log.e("RequestBizProductListProtocolHelper/onDeliveryFailure");
        AN6.A00(this.A02, 3);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.AN6] */
    public void C7Z(C29621ca r5, String str) {
        this.A05.A02("plm_details_view_tag");
        UserJid userJid = this.A00;
        A6T a6t = this.A09;
        AN5 A022 = a6t.A02(r5);
        a6t.A05(this.A01, userJid, r5);
        if (A022 == null) {
            AN6.A00(this.A02, 4);
            this.A00.A0G("RequestBizProductListProtocolHelper/get product catalog error", "error_code=0", true);
            return;
        }
        List list = A022.A03;
        B7I b7i = this.A02;
        ? obj = new Object();
        obj.A00 = 1;
        obj.A01 = list;
        b7i.CBu(obj);
    }

    public C167868hu(AnonymousClass190 r3, C26911Ty r4, B7I b7i, A6T a6t, UserJid userJid, C19949A0g a0g, AnonymousClass1OZ r9, C183479Yk r10, String str, String str2, List list) {
        super(r4, userJid);
        this.A02 = b7i;
        this.A05 = AnonymousClass8BT.A0W((AnonymousClass10E) ((C000100c) C000400h.A00(C000100c.class, r10.A00.A00)));
        this.A04 = r9;
        this.A01 = r4;
        this.A09 = a6t;
        this.A00 = r3;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = list;
        this.A03 = a0g;
    }
}
