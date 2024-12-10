package X;

import java.util.List;

/* renamed from: X.9mn  reason: invalid class name and case insensitive filesystem */
public class C191559mn {
    public String A00;
    public final int A01;
    public final C20267ADz A02;
    public final C20251ADj A03;
    public final Integer A04;
    public final List A05;

    public C191559mn(C20267ADz aDz, C20251ADj aDj, Integer num, String str, List list, int i) {
        this.A01 = i;
        this.A00 = str;
        this.A05 = list;
        this.A02 = aDz;
        this.A03 = aDj;
        this.A04 = num;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r5.add(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A00() {
        /*
            r8 = this;
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.List r4 = r8.A05
            if (r4 == 0) goto L_0x0069
            r3 = 0
        L_0x0009:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0069
            java.lang.Object r0 = r4.get(r3)
            X.AEZ r0 = (X.AEZ) r0
            java.lang.String r7 = r0.A0A
            int r0 = r7.hashCode()
            java.lang.String r6 = "pix"
            java.lang.String r2 = "hpp"
            java.lang.String r1 = "boleto"
            switch(r0) {
                case -2032781930: goto L_0x0027;
                case -1890748409: goto L_0x0032;
                case -1383481471: goto L_0x003d;
                case -611537030: goto L_0x0047;
                case 103528: goto L_0x0055;
                case 111007: goto L_0x005f;
                default: goto L_0x0024;
            }
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0027:
            java.lang.String r0 = "WhatsappPay"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "native"
            goto L_0x0051
        L_0x0032:
            java.lang.String r0 = "checkout_lite"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "payment_link"
            goto L_0x0051
        L_0x003d:
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x0024
            r5.add(r1)
            goto L_0x0024
        L_0x0047:
            java.lang.String r0 = "CustomPaymentInstructions"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "cpi"
        L_0x0051:
            r5.add(r0)
            goto L_0x0024
        L_0x0055:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L_0x0024
            r5.add(r2)
            goto L_0x0024
        L_0x005f:
            boolean r0 = r7.equals(r6)
            if (r0 == 0) goto L_0x0024
            r5.add(r6)
            goto L_0x0024
        L_0x0069:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191559mn.A00():java.util.ArrayList");
    }
}
