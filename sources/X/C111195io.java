package X;

import com.whatsapp.util.Log;

/* renamed from: X.5io  reason: invalid class name and case insensitive filesystem */
public final class C111195io extends AnonymousClass1J2 {
    public static final C122736Rs A0C = C122736Rs.SEVEN_DAYS;
    public C122736Rs A00 = A0C;
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C132056m6 A03;
    public final C58052k4 A04;
    public final C62262r7 A05;
    public final AnonymousClass205 A06;
    public final AnonymousClass1W6 A07;
    public final C18600wl A08;
    public final AnonymousClass1G4 A09;
    public final AnonymousClass1G1 A0A;
    public final AnonymousClass206 A0B;

    public static final AnonymousClass206 A00(C111195io r2) {
        AnonymousClass1G4 r22 = r2.A09;
        if (r22.getValue() == null) {
            Log.e("PinInChatExpirationDialogViewModel/getSelectedMessage/trying to get a null value, make sure to wait for [queryFMessageFromDatabase()] to be called first instead. If you already did this, something wrong happened.");
            C17960vV.A0F(false, "PinInChatExpirationDialogViewModel/getSelectedMessage/trying to get a null value, make sure to wait for [queryFMessageFromDatabase()] to be called first instead. If you already did this, something wrong happened.");
        }
        return (AnonymousClass206) r22.getValue();
    }

    public C111195io(AnonymousClass11P r2, C18030ve r3, C132056m6 r4, C58052k4 r5, C62262r7 r6, AnonymousClass206 r7, AnonymousClass205 r8, AnonymousClass1W6 r9, C18600wl r10) {
        C18070vi.A0w(r2, r3, r9, r5, r6);
        C108965cb.A1P(r10, 7, r8);
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r9;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A08 = r10;
        this.A06 = r8;
        this.A0B = r7;
        AnonymousClass1G7 A002 = C34071js.A00(r7);
        this.A09 = A002;
        this.A0A = A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r8 > r2) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r7.A08 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r3 != r0) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0T() {
        /*
            r14 = this;
            X.206 r6 = A00(r14)
            if (r6 != 0) goto L_0x0009
            X.0wS r0 = X.C18460wS.A00
            return r0
        L_0x0009:
            X.0z2 r0 = X.C122736Rs.A00
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x0013:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r4 = r13.next()
            r3 = r4
            X.6Rs r3 = (X.C122736Rs) r3
            r12 = 0
            boolean r0 = r3.debugMenuOnlyField
            boolean r11 = X.AnonymousClass000.A1P(r0)
            int r2 = r6.A0u
            r1 = 92
            X.6Rs r0 = X.C122736Rs.DYNAMIC_DURATION
            if (r2 != r1) goto L_0x007d
            if (r3 != r0) goto L_0x006e
            X.6m6 r3 = r14.A03
            X.0ve r2 = r3.A01
            r1 = 9063(0x2367, float:1.27E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006f
            X.6bo r10 = r3.A00
            boolean r0 = r6 instanceof X.C445823z
            if (r0 == 0) goto L_0x006f
            r7 = r6
            X.23z r7 = (X.C445823z) r7
            long r2 = r7.A00
            java.lang.Long r0 = r7.A03
            if (r0 == 0) goto L_0x0077
            long r8 = r0.longValue()
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
        L_0x0056:
            X.11P r0 = r10.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            long r8 = r8 - r0
            long r2 = X.C17880vN.A04(r8)
            r0 = 0
            long r1 = java.lang.Math.max(r2, r0)
            int r0 = (int) r1
            if (r0 <= 0) goto L_0x006f
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x006f
        L_0x006e:
            r12 = 1
        L_0x006f:
            if (r11 == 0) goto L_0x0013
            if (r12 == 0) goto L_0x0013
            r5.add(r4)
            goto L_0x0013
        L_0x0077:
            r0 = 10800000(0xa4cb80, double:5.335909E-317)
            long r8 = r2 + r0
            goto L_0x0056
        L_0x007d:
            if (r3 == r0) goto L_0x006f
            goto L_0x006e
        L_0x0080:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111195io.A0T():java.util.List");
    }
}
