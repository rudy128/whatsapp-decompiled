package X;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Boy  reason: case insensitive filesystem */
public class C23753Boy extends C25836Cmq {
    public final CYQ A00;
    public final boolean A01;
    public final boolean A02;

    public C25836Cmq A08(C24957CRh cRh) {
        Object A002;
        if (this.A01) {
            try {
                EnumSet<E> noneOf = EnumSet.noneOf(C24287Byk.class);
                ArrayList A13 = AnonymousClass000.A13();
                EBZ ebz = cRh.A00.A00;
                noneOf.addAll(AnonymousClass8BR.A15(C24287Byk.REQUIRE_PROPERTIES, new C24287Byk[1], 0));
                C25508Ch6 ch6 = C25508Ch6.A01;
                if (ebz == null) {
                    ebz = new DOV();
                }
                if (this.A00.A00(new C25670Ck0(ebz, ch6.A00, A13, noneOf), cRh.A01, cRh.A02).A00() == EBZ.A00) {
                    return EB4.A00;
                }
                return EB4.A01;
            } catch (C23737Boi unused) {
                return EB4.A00;
            }
        } else {
            try {
                CYQ cyq = this.A00;
                if (cyq.A01) {
                    HashMap hashMap = cRh.A03;
                    if (hashMap.containsKey(cyq)) {
                        cyq.toString();
                        A002 = hashMap.get(cyq);
                    } else {
                        Object obj = cRh.A02;
                        A002 = cyq.A00(cRh.A00, obj, obj).A00();
                        hashMap.put(cyq, A002);
                    }
                } else {
                    A002 = cyq.A00(cRh.A00, cRh.A01, cRh.A02).A00();
                }
                C25670Ck0 ck0 = cRh.A00;
                if (A002 instanceof Number) {
                    return new C23757Bp2((CharSequence) A002.toString());
                }
                if (A002 instanceof String) {
                    return new C23755Bp0(A002.toString(), false);
                }
                if (A002 instanceof Boolean) {
                    if (Boolean.parseBoolean(A002.toString().toString())) {
                        return EB4.A01;
                    }
                    return EB4.A00;
                } else if (A002 instanceof OffsetDateTime) {
                    return new C23754Boz(A002.toString());
                } else {
                    if (A002 == null) {
                        return EB4.A02;
                    }
                    if (A002 instanceof List) {
                        return new C23758Bp3(ck0.A01.A01(List.class, A002));
                    }
                    if (A002 instanceof Map) {
                        return new C23758Bp3(ck0.A01.A01(Map.class, A002));
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Could not convert ");
                    AnonymousClass8BS.A1D(A002.getClass(), A10);
                    A10.append(":");
                    AnonymousClass8BS.A1D(A002, A10);
                    throw new C27232DaC(AnonymousClass000.A0y(" to a ValueNode", A10));
                }
            } catch (C23737Boi unused2) {
                return EB4.A03;
            }
        }
    }

    public String toString() {
        if (!this.A01 || this.A02) {
            return this.A00.toString();
        }
        return C25888Cnz.A02("!", this.A00.toString());
    }

    public C23753Boy(CYQ cyq, boolean z, boolean z2) {
        this.A00 = cyq;
        this.A01 = z;
        this.A02 = z2;
    }
}
