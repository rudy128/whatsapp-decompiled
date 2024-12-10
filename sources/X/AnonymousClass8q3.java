package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.8q3  reason: invalid class name */
public final class AnonymousClass8q3 extends C20126A8l {
    public final int A00;
    public final Set A01;
    public final String[] A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8q3(C62382rJ r12, C19999A2n a2n, String str, Set set, int i, long j) {
        super(r12, a2n, str, "regular_high", 7, j, false);
        C18070vi.A0d(r12, 4);
        this.A00 = i;
        this.A01 = set;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "status_privacy";
        this.A02 = A1Y;
    }

    public C163398Uv A08() {
        AnonymousClass9K4 r0;
        int i = this.A00;
        if (i == 3) {
            Log.e("StatusPrivacySyncMutation invalid status setting");
            return super.A08();
        }
        C23624Bmt A0N = AnonymousClass8ZZ.DEFAULT_INSTANCE.A0N();
        if (i == 1) {
            r0 = AnonymousClass9K4.ALLOW_LIST;
        } else if (i != 2) {
            r0 = AnonymousClass9K4.CONTACTS;
        } else {
            r0 = AnonymousClass9K4.DENY_LIST;
        }
        AnonymousClass8ZZ r1 = (AnonymousClass8ZZ) C17880vN.A0G(A0N);
        r1.mode_ = r0.value;
        r1.bitField0_ |= 1;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            String A0d = AnonymousClass8BS.A0d(A0N, C17880vN.A0S(it));
            AnonymousClass8ZZ r2 = (AnonymousClass8ZZ) A0N.A00;
            A0d.getClass();
            EE9 ee9 = r2.userJid_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.userJid_ = ee9;
            }
            ee9.add(A0d);
        }
        AnonymousClass8ZZ r02 = (AnonymousClass8ZZ) A0N.A0C();
        C163398Uv A08 = super.A08();
        C166378cn A0O = AnonymousClass8BW.A0O(A08, r02);
        A0O.statusPrivacy_ = r02;
        A0O.bitField1_ |= 64;
        return A08;
    }
}
