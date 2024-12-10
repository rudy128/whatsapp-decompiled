package X;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Nx  reason: invalid class name and case insensitive filesystem */
public final class C25361Nx {
    public final AnonymousClass1HA A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final AnonymousClass11P A04;
    public final C18100vl A05 = new C18110vm(new C25371Ny(this));

    public C25361Nx(AnonymousClass1HA r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass18K r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r3, 4);
        this.A04 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r3;
    }

    public final void A01(Integer num, Integer num2, String str) {
        C18070vi.A0d(str, 0);
        C56062gq r5 = (C56062gq) this.A03.get(str);
        if (r5 != null && r5.A07 == 0) {
            r5.A07 = SystemClock.uptimeMillis();
            r5.A01 = num;
            r5.A02 = num2;
            C222119a A002 = A00(this);
            int hashCode = str.hashCode();
            A002.A01(hashCode, "iq_send");
            A00(this).A02(hashCode, "iq_processing_queue");
        }
    }

    public final void A02(String str) {
        C18070vi.A0d(str, 0);
        C56062gq r5 = (C56062gq) this.A03.get(str);
        if (r5 != null && r5.A04 == 0) {
            r5.A04 = SystemClock.uptimeMillis();
            C222119a A002 = A00(this);
            int hashCode = str.hashCode();
            A002.A01(hashCode, "iq_processing_queue");
            A00(this).A02(hashCode, "iq_processing");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0089, code lost:
        if (r1 != 0) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r9, java.lang.Integer r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r8.A03
            java.lang.Object r4 = r0.remove(r9)
            X.2gq r4 = (X.C56062gq) r4
            if (r4 == 0) goto L_0x00b1
            long r1 = r4.A05
            r5 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A05 = r0
            if (r10 == 0) goto L_0x0020
            r4.A01 = r10
        L_0x0020:
            X.2Gu r5 = new X.2Gu
            r5.<init>()
            int r0 = r4.A00
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A07 = r0
            java.lang.String r0 = r4.A03
            r5.A09 = r0
            long r2 = r4.A09
            long r0 = r4.A06
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A05 = r0
            long r2 = r4.A07
            long r0 = r4.A09
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A02 = r0
            long r2 = r4.A05
            long r0 = r4.A04
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A03 = r0
            long r2 = r4.A05
            long r0 = r4.A07
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A04 = r0
            long r2 = r4.A05
            long r0 = r4.A06
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.A06 = r0
            long r1 = r4.A08
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            long r0 = r4.A08
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A01 = r0
        L_0x0079:
            java.lang.Integer r0 = r4.A01
            r3 = 1
            r2 = 2
            if (r0 == 0) goto L_0x008b
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x00b2
            if (r1 == r3) goto L_0x00b2
            r3 = 3
            r0 = 0
            if (r1 == r0) goto L_0x00b2
        L_0x008b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A00 = r0
        L_0x0091:
            X.18K r0 = r8.A02
            r0.CC7(r5)
            X.19a r1 = A00(r8)
            int r3 = r9.hashCode()
            java.lang.String r0 = "iq_processing"
            r1.A01(r3, r0)
            X.19a r2 = A00(r8)
            java.lang.Integer r1 = r4.A01
            r0 = 2
            if (r1 == 0) goto L_0x00ae
            r0 = 87
        L_0x00ae:
            r2.A04(r3, r0)
        L_0x00b1:
            return
        L_0x00b2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A00 = r0
            java.lang.Integer r0 = r4.A02
            if (r0 == 0) goto L_0x0091
            int r0 = r0.intValue()
            long r2 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0091
            r5.A08 = r1
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25361Nx.A03(java.lang.String, java.lang.Integer):void");
    }

    public static final C222119a A00(C25361Nx r0) {
        Object value = r0.A05.getValue();
        C18070vi.A0X(value);
        return (C222119a) value;
    }
}
