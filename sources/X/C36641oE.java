package X;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.1oE  reason: invalid class name and case insensitive filesystem */
public class C36641oE extends C36621oC {
    public boolean A06(AnonymousClass5YR r6) {
        int i;
        C21319Ai4 A00;
        if (C18020vd.A05(C18040vf.A02, this.A00, 3712)) {
            HashSet hashSet = new HashSet();
            hashSet.add("whatsapp_banner_chat_list");
            C191939nR r2 = ((C61942qX) this.A01.A05.getValue()).A00;
            Integer num = ((C21319Ai4) r6).A0B;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C188729ht A002 = r2.A00((C22484B9q) null, 11114, Integer.valueOf(i), hashSet);
            JSONObject A01 = C196949vu.A01(r6);
            if (A01 == null || (A00 = C196949vu.A00(A01)) == null || !((C189789jr) C61942qX.A02.A00.invoke()).A00(A002, A00).A04) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C36641oE(C18030ve r1, AnonymousClass18K r2, C36561o6 r3) {
        super(r1, r2, r3);
    }
}
