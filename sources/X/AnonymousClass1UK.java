package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1UK  reason: invalid class name */
public final class AnonymousClass1UK {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass18K A02;
    public final Map A03;

    public AnonymousClass1UK(AnonymousClass11P r2, C19830z4 r3, AnonymousClass18K r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = linkedHashMap;
    }

    public final void A02(C46932Gl r3, Integer num, long j) {
        C18070vi.A0d(r3, 0);
        r3.A01 = 1;
        int i = 0;
        r3.A02 = 0;
        r3.A03 = num;
        r3.A08 = Long.valueOf(j);
        Integer num2 = r3.A00;
        if (num2 != null) {
            i = num2;
        }
        r3.A00 = i;
        A00(this, r3);
        this.A02.CC7(r3);
    }

    public static final void A00(AnonymousClass1UK r3, C46932Gl r4) {
        Map map = r3.A03;
        Long l = (Long) map.get(r4);
        if (l != null) {
            r4.A06 = l;
            r4.A04 = Long.valueOf(AnonymousClass11P.A01(r3.A00));
            map.remove(r4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C46932Gl A01(java.lang.Integer r7) {
        /*
            r6 = this;
            X.2Gl r5 = new X.2Gl
            r5.<init>()
            if (r7 == 0) goto L_0x0058
            int r4 = r7.intValue()
            r3 = 1
            r2 = 3
            if (r4 == r2) goto L_0x0052
            r1 = 4
            r0 = 5
            if (r4 == r1) goto L_0x004d
            if (r4 != r0) goto L_0x0058
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L_0x0019:
            r5.A03 = r0
            if (r0 == 0) goto L_0x004b
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x004b
            X.0z4 r0 = r6.A01
            X.00H r0 = r0.A00
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "native_contacts_nux_onboard_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0039:
            r5.A07 = r0
            java.util.Map r2 = r6.A03
            X.11P r0 = r6.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r5, r0)
            return r5
        L_0x004b:
            r0 = 0
            goto L_0x0039
        L_0x004d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L_0x0019
        L_0x0052:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0019
        L_0x0058:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UK.A01(java.lang.Integer):X.2Gl");
    }
}
