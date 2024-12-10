package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Dt  reason: invalid class name and case insensitive filesystem */
public final class C46232Dt extends C20126A8l {
    public final List A00;
    public final String[] A01 = C17880vN.A1a("favorites", 0);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46232Dt(C62382rJ r11, C19999A2n a2n, String str, List list, long j) {
        super(r11, a2n, str, "regular_high", 7, j, false);
        C18070vi.A0d(r11, 4);
        this.A00 = list;
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8XL.DEFAULT_INSTANCE.A0N();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            C23624Bmt A0N2 = AnonymousClass8Y5.DEFAULT_INSTANCE.A0N();
            String rawString = A0S.getRawString();
            AnonymousClass8Y5 r1 = (AnonymousClass8Y5) C17880vN.A0G(A0N2);
            rawString.getClass();
            r1.bitField0_ |= 1;
            r1.id_ = rawString;
            C23577Bm6 A0C = A0N2.A0C();
            AnonymousClass8XL r2 = (AnonymousClass8XL) C17880vN.A0G(A0N);
            A0C.getClass();
            EE9 ee9 = r2.favorites_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.favorites_ = ee9;
            }
            ee9.add(A0C);
        }
        AnonymousClass8XL r12 = (AnonymousClass8XL) A0N.A0C();
        C163398Uv A08 = super.A08();
        C166378cn r22 = (C166378cn) C17880vN.A0G(A08);
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r22.favoritesAction_ = r12;
        r22.bitField1_ |= 262144;
        return A08;
    }

    public String A0B() {
        return "favorites";
    }

    public String[] A0F() {
        return this.A01;
    }
}
