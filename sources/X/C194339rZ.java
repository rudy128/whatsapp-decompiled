package X;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.9rZ  reason: invalid class name and case insensitive filesystem */
public final class C194339rZ {
    public final AnonymousClass00H A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass00H A02;

    public final AnonymousClass1D6 A00(C46132Da r6) {
        String str;
        boolean z;
        AnonymousClass8oP r3 = r6.A02;
        boolean z2 = false;
        if (AnonymousClass73F.A02(r3.A00, (AnonymousClass73F) this.A02.get())) {
            str = r3.A01;
            String str2 = str;
            if (str == null) {
                str = r3.A02;
            }
            if (str2 != null) {
                z2 = true;
            }
            z = Boolean.valueOf(z2);
        } else {
            str = r3.A02;
            z = false;
        }
        return AnonymousClass1D6.A01(str, z);
    }

    public final boolean A01(C46132Da r9) {
        String str;
        AnonymousClass8oP r7 = r9.A02;
        if (AnonymousClass73F.A02(r7.A00, (AnonymousClass73F) this.A02.get())) {
            str = "consented_collection_window_in_hours";
        } else {
            str = "non_consented_collection_window_in_hours";
        }
        return C108975cc.A19(((System.currentTimeMillis() - r7.A00) > TimeUnit.HOURS.toMillis(((C198929z9) this.A00.get()).A00.A0J(10302).optLong(str, 168)) ? 1 : ((System.currentTimeMillis() - r7.A00) == TimeUnit.HOURS.toMillis(((C198929z9) this.A00.get()).A00.A0J(10302).optLong(str, 168)) ? 0 : -1)));
    }

    public final boolean A02(C46132Da r5, int i) {
        String str;
        if (AnonymousClass73F.A02(r5.A02.A00, (AnonymousClass73F) this.A02.get())) {
            str = "consented_types_allowlist";
        } else {
            str = "non_consented_types_allowlist";
        }
        JSONArray optJSONArray = ((C198929z9) this.A00.get()).A00.A0J(10302).optJSONArray(str);
        if (optJSONArray == null) {
            return false;
        }
        C99434so r0 = new C99434so(new C21717Aol((C30391dr) null, optJSONArray), 5);
        Integer valueOf = Integer.valueOf(i);
        Iterator it = r0.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i2 < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            } else if (C18070vi.A18(valueOf, next)) {
                return true;
            } else {
                i2++;
            }
        }
        return false;
    }

    public C194339rZ(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
