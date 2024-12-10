package X;

import com.whatsapp.events.EventCreateOrEditViewModel$sendMessageSendingResult$1;
import com.whatsapp.events.EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3VY  reason: invalid class name */
public final class AnonymousClass3VY extends AnonymousClass1J2 implements AnonymousClass8A4 {
    public final long A00;
    public final AnonymousClass1KB A01;
    public final C34531kd A02;
    public final C33251iW A03;
    public final AnonymousClass6h1 A04;
    public final AnonymousClass11E A05;
    public final AnonymousClass11P A06;
    public final C84854Lc A07;
    public final C84854Lc A08;
    public final C32981i4 A09;
    public final C88194Yr A0A;
    public final C88124Yk A0B;
    public final C25931Qe A0C;
    public final C57242il A0D;
    public final AnonymousClass1BI A0E;
    public final AnonymousClass205 A0F;
    public final AnonymousClass1W6 A0G;
    public final AnonymousClass00H A0H;
    public final Integer A0I;
    public final C18600wl A0J;
    public final AnonymousClass1G4 A0K;
    public final AnonymousClass1G4 A0L;
    public final AnonymousClass1G1 A0M;
    public final AnonymousClass1G1 A0N = AnonymousClass3MW.A18(new C86784Tb((File) null, this.A0D.A00()));
    public final AnonymousClass1G1 A0O;
    public final C24681Lg A0P;
    public final AnonymousClass1WS A0Q;
    public final AnonymousClass00H A0R;
    public final C18600wl A0S;

    /* JADX WARNING: type inference failed for: r1v95, types: [com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0235, code lost:
        if (r14.length() == 0) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        if (X.C18070vi.A18(r14, r1) == false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (X.AnonymousClass3MX.A0f(r5).A00 == r29) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ee, code lost:
        if (r8 != false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        if (r29 == X.AnonymousClass3MX.A0f(r5).A00) goto L_0x0107;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(java.lang.Long r26, java.lang.String r27, java.lang.String r28, long r29, boolean r31) {
        /*
            r25 = this;
            r15 = 0
            r0 = r27
            java.lang.String r17 = X.C26302CxJ.A0G(r0, r15)
            X.C18070vi.A0X(r17)
            r0 = r28
            java.lang.String r13 = X.C26302CxJ.A0G(r0, r15)
            X.C18070vi.A0X(r13)
            int r1 = r17.length()
            r0 = r25
            if (r1 != 0) goto L_0x002d
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            r1 = 2131890110(0x7f120fbe, float:1.9414903E38)
        L_0x0020:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            X.4Tc r1 = new X.4Tc
            r1.<init>(r9, r2)
            A04(r1, r0)
        L_0x002c:
            return
        L_0x002d:
            X.1G1 r5 = r0.A0M
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.Integer r1 = r1.A02
            java.lang.Integer r9 = X.AnonymousClass00R.A01
            if (r1 != r9) goto L_0x003d
            r1 = 2131890077(0x7f120f9d, float:1.9414836E38)
            goto L_0x0020
        L_0x003d:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r1 = r1.A03
            r3 = r29
            if (r1 == 0) goto L_0x0068
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0068
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            long r1 = r1.A00
            X.11P r6 = r0.A06
            long r7 = X.AnonymousClass11P.A01(r6)
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0068
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            long r1 = r1.A00
            int r6 = (r1 > r29 ? 1 : (r1 == r29 ? 0 : -1))
            r2 = 1
            if (r6 != 0) goto L_0x0069
        L_0x0068:
            r2 = 0
        L_0x0069:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x00ee
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x0087
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0.A05()
            if (r1 == 0) goto L_0x0087
            if (r2 == 0) goto L_0x00ee
        L_0x0087:
            boolean r1 = r0.A06(r3)
            if (r1 != 0) goto L_0x002c
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x00bd
            int r1 = r1.length()
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r0.A05()
            if (r1 == 0) goto L_0x00bd
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            long r5 = r1.A00
            int r1 = (r29 > r5 ? 1 : (r29 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00bd
            X.1G4 r3 = r0.A0K
        L_0x00ad:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.4Zf r1 = (X.C88324Zf) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = A07(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x00ad
            return
        L_0x00bd:
            X.11E r1 = r0.A05
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x01ec
            X.1G4 r6 = r0.A0K
        L_0x00c7:
            java.lang.Object r5 = r6.getValue()
            r1 = r5
            X.4Zf r1 = (X.C88324Zf) r1
            r2 = 0
            java.lang.String r10 = r1.A03
            X.4CW r8 = r1.A01
            boolean r1 = r1.A04
            X.4Zf r7 = new X.4Zf
            r11 = r3
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r13)
            boolean r1 = r6.BFK(r5, r7)
            if (r1 == 0) goto L_0x00c7
            X.1OX r6 = X.C41561wd.A00(r0)
            X.0wl r5 = r0.A0J
            com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3 r1 = new com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3
            r1.<init>(r0, r2, r3)
            goto L_0x0163
        L_0x00ee:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r1 = r1.A03
            if (r1 == 0) goto L_0x0107
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0107
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            long r1 = r1.A00
            int r6 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            r2 = 1
            if (r6 != 0) goto L_0x0108
        L_0x0107:
            r2 = 0
        L_0x0108:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x0167
            if (r2 == 0) goto L_0x0167
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r2 = r1.A03
            if (r2 == 0) goto L_0x002c
            java.lang.String r1 = "/"
            java.lang.String[] r2 = r2.split(r1)
            int r1 = r2.length
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + -1
            r14 = r2[r1]
            if (r14 == 0) goto L_0x002c
            boolean r1 = r0.A06(r3)
            if (r1 != 0) goto L_0x002c
            X.11E r1 = r0.A05
            boolean r1 = r1.A09()
            if (r1 == 0) goto L_0x01fe
            X.1G4 r5 = r0.A0K
        L_0x0139:
            java.lang.Object r2 = r5.getValue()
            r1 = r2
            X.4Zf r1 = (X.C88324Zf) r1
            r15 = 0
            java.lang.String r10 = r1.A03
            X.4CW r8 = r1.A01
            boolean r1 = r1.A04
            X.4Zf r7 = new X.4Zf
            r11 = r3
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r13)
            boolean r1 = r5.BFK(r2, r7)
            if (r1 == 0) goto L_0x0139
            X.1OX r6 = X.C41561wd.A00(r0)
            X.0wl r5 = r0.A0J
            com.whatsapp.events.EventCreateOrEditViewModel$editCallLink$2 r1 = new com.whatsapp.events.EventCreateOrEditViewModel$editCallLink$2
            r12 = r1
            r13 = r0
            r16 = r3
            r12.<init>(r13, r14, r15, r16)
        L_0x0163:
            X.AnonymousClass3MW.A1X(r5, r1, r6)
            return
        L_0x0167:
            X.11P r6 = r0.A06
            long r7 = X.AnonymousClass11P.A01(r6)
            int r1 = (r29 > r7 ? 1 : (r29 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x017c
            java.lang.Integer r2 = r0.A0I
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r2 != r1) goto L_0x017c
            r1 = 2131890143(0x7f120fdf, float:1.941497E38)
            goto L_0x0020
        L_0x017c:
            r12 = r26
            if (r26 == 0) goto L_0x018d
            long r7 = r12.longValue()
            int r1 = (r29 > r7 ? 1 : (r29 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x018d
            r1 = 2131890090(0x7f120faa, float:1.9414862E38)
            goto L_0x0020
        L_0x018d:
            X.4Yk r7 = r0.A0B
            X.0ve r8 = r7.A03
            r2 = 7420(0x1cfc, float:1.0398E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r2)
            r24 = r31
            if (r1 == 0) goto L_0x0210
            java.lang.Integer r1 = r0.A0I
            if (r1 != r9) goto L_0x0210
            if (r31 != 0) goto L_0x0210
            X.23z r1 = r0.A0T()
            if (r1 == 0) goto L_0x0210
            java.util.List r1 = r1.A18()
            if (r1 == 0) goto L_0x0210
            java.util.Iterator r8 = r1.iterator()
        L_0x01b3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0210
            java.lang.Object r1 = r8.next()
            X.24H r1 = (X.AnonymousClass24H) r1
            X.2Qx r2 = r1.A02
            if (r2 == 0) goto L_0x01b3
            int r1 = r1.A00
            boolean r1 = r7.A03(r2, r1)
            if (r1 == 0) goto L_0x01b3
            X.1G4 r3 = r0.A0L
        L_0x01cd:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.4YY r1 = (X.AnonymousClass4YY) r1
            com.whatsapp.location.PlaceInfo r13 = r1.A02
            X.23z r11 = r1.A01
            X.23z r12 = r1.A00
            java.lang.Integer r14 = r1.A03
            X.4YY r10 = new X.4YY
            r10.<init>(r11, r12, r13, r14, r15)
            boolean r1 = r3.BFK(r2, r10)
            if (r1 == 0) goto L_0x01cd
            r1 = 2131890047(0x7f120f7f, float:1.9414775E38)
            goto L_0x0020
        L_0x01ec:
            X.1G4 r3 = r0.A0K
        L_0x01ee:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.4Zf r1 = (X.C88324Zf) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            boolean r0 = A07(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x01ee
            return
        L_0x01fe:
            X.1G4 r3 = r0.A0K
        L_0x0200:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.4Zf r1 = (X.C88324Zf) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            boolean r0 = A07(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x0200
            return
        L_0x0210:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.Integer r1 = r1.A02
            int r7 = r1.intValue()
            r1 = 2
            r2 = 0
            if (r7 == r1) goto L_0x0228
            if (r7 != r15) goto L_0x02f2
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x02f2
        L_0x0228:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            java.lang.String r14 = r1.A03
            if (r14 == 0) goto L_0x0237
            int r1 = r14.length()
            r7 = 0
            if (r1 != 0) goto L_0x0238
        L_0x0237:
            r7 = 1
        L_0x0238:
            r8 = r7 ^ 1
            java.lang.Integer r1 = r0.A0I
            int r7 = r1.intValue()
            if (r7 == r15) goto L_0x02ee
            r1 = 1
            if (r7 != r1) goto L_0x02f5
            if (r8 == 0) goto L_0x0272
            X.23z r1 = r0.A0T()
            if (r1 == 0) goto L_0x02eb
            java.lang.String r1 = r1.A05
        L_0x024f:
            boolean r1 = X.C18070vi.A18(r14, r1)
            if (r1 != 0) goto L_0x0272
        L_0x0255:
            X.4Zf r1 = X.AnonymousClass3MX.A0f(r5)
            X.4CW r5 = r1.A01
            X.4CW r1 = X.AnonymousClass4CW.WA_VIDEO_CALL
            if (r5 != r1) goto L_0x0260
            r15 = 1
        L_0x0260:
            r5 = 3
            r1 = 8
            X.62u r5 = X.AnonymousClass74H.A02(r2, r5, r1, r15)
            X.00H r1 = r0.A0R
            java.lang.Object r1 = r1.get()
            X.A4u r1 = (X.A4u) r1
            r1.A03(r5)
        L_0x0272:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r24)
            long r20 = X.AnonymousClass11P.A01(r6)
            X.4Yr r8 = r0.A0A
            X.1BI r9 = r0.A0E
            boolean r22 = X.C72453Mb.A1Y(r1)
            X.1G1 r7 = r0.A0O
            java.lang.Object r1 = r7.getValue()
            X.4YY r1 = (X.AnonymousClass4YY) r1
            com.whatsapp.location.PlaceInfo r1 = r1.A02
            if (r1 == 0) goto L_0x02e9
            double r5 = r1.A01
            java.lang.Double r10 = java.lang.Double.valueOf(r5)
        L_0x0294:
            java.lang.Object r1 = r7.getValue()
            X.4YY r1 = (X.AnonymousClass4YY) r1
            com.whatsapp.location.PlaceInfo r1 = r1.A02
            if (r1 == 0) goto L_0x02e7
            double r5 = r1.A02
            java.lang.Double r11 = java.lang.Double.valueOf(r5)
        L_0x02a4:
            java.lang.Object r1 = r7.getValue()
            X.4YY r1 = (X.AnonymousClass4YY) r1
            com.whatsapp.location.PlaceInfo r1 = r1.A02
            if (r1 == 0) goto L_0x02e5
            java.lang.String r5 = r1.A06
        L_0x02b0:
            java.lang.Object r1 = r7.getValue()
            X.4YY r1 = (X.AnonymousClass4YY) r1
            com.whatsapp.location.PlaceInfo r1 = r1.A02
            if (r1 == 0) goto L_0x02e3
            java.lang.String r15 = r1.A04
        L_0x02bc:
            r23 = 0
            r18 = r3
            r16 = r5
            X.23z r6 = X.C83644Gc.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r23)
            r18 = r0
            r19 = r12
            r20 = r17
            r21 = r13
            r22 = r3
            boolean r5 = A09(r18, r19, r20, r21, r22, r24)
            X.1OX r4 = X.C41561wd.A00(r0)
            X.0wl r3 = r0.A0J
            com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCreateOrEdit$3 r1 = new com.whatsapp.events.EventCreateOrEditViewModel$onSendEventCreateOrEdit$3
            r1.<init>(r6, r0, r2, r5)
            X.AnonymousClass3MW.A1X(r3, r1, r4)
            return
        L_0x02e3:
            r15 = r2
            goto L_0x02bc
        L_0x02e5:
            r5 = r2
            goto L_0x02b0
        L_0x02e7:
            r11 = r2
            goto L_0x02a4
        L_0x02e9:
            r10 = r2
            goto L_0x0294
        L_0x02eb:
            r1 = 0
            goto L_0x024f
        L_0x02ee:
            if (r8 == 0) goto L_0x0272
            goto L_0x0255
        L_0x02f2:
            r14 = r2
            goto L_0x0237
        L_0x02f5:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VY.A0V(java.lang.Long, java.lang.String, java.lang.String, long, boolean):void");
    }

    public void Bwg(String str, boolean z) {
        Object value;
        C88324Zf r0;
        Integer num;
        String A072;
        AnonymousClass4CW r4;
        C18070vi.A0d(str, 0);
        AnonymousClass1G4 r2 = this.A0K;
        do {
            value = r2.getValue();
            r0 = (C88324Zf) value;
            num = AnonymousClass00R.A0C;
            A072 = AnonymousClass74H.A07(str, z);
            if (z) {
                r4 = AnonymousClass4CW.WA_VIDEO_CALL;
            } else {
                r4 = AnonymousClass4CW.WA_VOICE_CALL;
            }
        } while (!r2.BFK(value, new C88324Zf(r4, num, A072, r0.A00, r0.A04)));
    }

    public static final void A00(C445823z r2, AnonymousClass3VY r3) {
        Integer num;
        int i;
        if (r2.A08) {
            num = AnonymousClass00R.A01;
            i = 2131890078;
        } else if (((AnonymousClass4YY) r3.A0O.getValue()).A03 == AnonymousClass00R.A0C) {
            num = AnonymousClass00R.A01;
            i = 2131890079;
        } else {
            return;
        }
        A04(new C86794Tc(num, Integer.valueOf(i)), r3);
    }

    public static final void A03(C445823z r5, AnonymousClass3VY r6) {
        C438421d r1;
        if (r5.A0x <= 0) {
            Log.w("Cover image not saved because event message had no row id");
            return;
        }
        C445823z r0 = ((AnonymousClass4YY) r6.A0O.getValue()).A01;
        if (r0 != null) {
            r1 = r0.A17();
        } else {
            r1 = null;
        }
        File file = ((C86784Tb) r6.A0N.getValue()).A00;
        if (file != null) {
            if (r1 != null) {
                r6.A03.A0q(C18070vi.A0P(r1), true);
            }
            r6.A01.A0J(new AnonymousClass3C4(r6, file, r5, 33));
        } else if (r1 != null) {
            r6.A03.A0q(C18070vi.A0P(r1), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (X.AnonymousClass3MX.A0f(r1).A01 != X.AnonymousClass4CW.A02) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A05() {
        /*
            r5 = this;
            X.1i4 r2 = r5.A09
            X.1G1 r1 = r5.A0M
            X.4Zf r0 = X.AnonymousClass3MX.A0f(r1)
            java.lang.String r0 = r0.A03
            boolean r4 = r2.A0L(r0)
            X.4Zf r0 = X.AnonymousClass3MX.A0f(r1)
            boolean r0 = r0.A04
            r3 = 1
            if (r0 == 0) goto L_0x0022
            X.4Zf r0 = X.AnonymousClass3MX.A0f(r1)
            X.4CW r2 = r0.A01
            X.4CW r1 = X.AnonymousClass4CW.WA_VIDEO_CALL
            r0 = 1
            if (r2 == r1) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            if (r4 == r0) goto L_0x0026
            r3 = 0
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VY.A05():boolean");
    }

    private final boolean A06(long j) {
        Object value;
        Object value2;
        C88124Yk r1 = this.A0B;
        if (j > AnonymousClass11P.A01(r1.A01) + TimeUnit.DAYS.toMillis((long) C18020vd.A00(C18040vf.A02, r1.A03, 6265))) {
            AnonymousClass1G4 r3 = this.A0K;
            do {
                value2 = r3.getValue();
            } while (!A07((C88324Zf) value2, AnonymousClass00R.A15, value2, r3));
            return true;
        } else if (j >= AnonymousClass11P.A01(this.A06)) {
            return false;
        } else {
            AnonymousClass1G4 r32 = this.A0K;
            do {
                value = r32.getValue();
            } while (!A07((C88324Zf) value, AnonymousClass00R.A18, value, r32));
            return true;
        }
    }

    public static boolean A07(C88324Zf r6, Integer num, Object obj, AnonymousClass1G4 r9) {
        return r9.BFK(obj, new C88324Zf(r6.A01, num, r6.A03, r6.A00, r6.A04));
    }

    public static final boolean A08(AnonymousClass3VY r2) {
        File file;
        C438421d A17;
        C62572rc r0;
        File file2 = ((C86784Tb) r2.A0N.getValue()).A00;
        C445823z A0T = r2.A0T();
        if (A0T == null || (A17 = A0T.A17()) == null || (r0 = A17.A02) == null) {
            file = null;
        } else {
            file = r0.A0G;
        }
        return !C18070vi.A18(file2, file);
    }

    public static final boolean A09(AnonymousClass3VY r22, Long l, String str, String str2, long j, boolean z) {
        String str3;
        Double d;
        Double d2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        double d3;
        Double valueOf;
        double d4;
        C193789qf r0;
        C193789qf r02;
        C193789qf r03;
        C193789qf r04;
        String str9;
        AnonymousClass3VY r5 = r22;
        C445823z A0T = r5.A0T();
        if (A0T == null) {
            return false;
        }
        String A0G2 = C26302CxJ.A0G(str, false);
        C18070vi.A0X(A0G2);
        String A0G3 = C26302CxJ.A0G(str2, false);
        C18070vi.A0X(A0G3);
        AnonymousClass1G1 r10 = r5.A0M;
        int intValue = AnonymousClass3MX.A0f(r10).A02.intValue();
        String str10 = null;
        if (intValue == 2 || (intValue == 0 && AnonymousClass3MX.A0f(r10).A04)) {
            str3 = AnonymousClass3MX.A0f(r10).A03;
        } else {
            str3 = null;
        }
        Boolean valueOf2 = Boolean.valueOf(z);
        long j2 = A0T.A0I;
        C88194Yr r11 = r5.A0A;
        AnonymousClass1BI r12 = r5.A0E;
        boolean A1Y = C72453Mb.A1Y(valueOf2);
        AnonymousClass1G1 r8 = r5.A0O;
        PlaceInfo placeInfo = ((AnonymousClass4YY) r8.getValue()).A02;
        if (placeInfo != null) {
            d = Double.valueOf(placeInfo.A01);
        } else {
            d = null;
        }
        PlaceInfo placeInfo2 = ((AnonymousClass4YY) r8.getValue()).A02;
        if (placeInfo2 != null) {
            d2 = Double.valueOf(placeInfo2.A02);
        } else {
            d2 = null;
        }
        PlaceInfo placeInfo3 = ((AnonymousClass4YY) r8.getValue()).A02;
        if (placeInfo3 != null) {
            str4 = placeInfo3.A06;
        } else {
            str4 = null;
        }
        PlaceInfo placeInfo4 = ((AnonymousClass4YY) r8.getValue()).A02;
        if (placeInfo4 != null) {
            str5 = placeInfo4.A04;
        } else {
            str5 = null;
        }
        C445823z A002 = C83644Gc.A00(r11, r12, d, d2, l, A0G3, str3, str5, str4, A0G2, j, j2, A1Y, false);
        if (C18070vi.A18(A0T.A06, A002.A06) && A0T.A00 == A002.A00 && C18070vi.A18(A0T.A03, A002.A03) && C18070vi.A18(A0T.A04, A002.A04) && C18070vi.A18(A0T.A05, A002.A05) && A0T.A07 == A002.A07 && ((!AnonymousClass3MX.A0f(r10).A04 || !((str9 = A0T.A05) == null || str9.length() == 0)) && r5.A05())) {
            C194409rg r05 = A0T.A01;
            if (r05 != null) {
                str6 = r05.A02;
            } else {
                str6 = null;
            }
            C194409rg r06 = A002.A01;
            if (r06 != null) {
                str7 = r06.A02;
            } else {
                str7 = null;
            }
            if (C18070vi.A18(str6, str7)) {
                C194409rg r07 = A0T.A01;
                if (r07 != null) {
                    str8 = r07.A01;
                } else {
                    str8 = null;
                }
                C194409rg r08 = A002.A01;
                if (r08 != null) {
                    str10 = r08.A01;
                }
                if (C18070vi.A18(str8, str10)) {
                    C194409rg r09 = A0T.A01;
                    double d5 = 0.0d;
                    if (r09 == null || (r04 = r09.A00) == null) {
                        d3 = 0.0d;
                    } else {
                        d3 = r04.A00;
                    }
                    Double valueOf3 = Double.valueOf(d3);
                    C194409rg r010 = A002.A01;
                    if (r010 == null || (r03 = r010.A00) == null) {
                        valueOf = Double.valueOf(0.0d);
                    } else {
                        valueOf = Double.valueOf(r03.A00);
                    }
                    if (C18070vi.A18(valueOf3, valueOf)) {
                        C194409rg r011 = A0T.A01;
                        if (r011 == null || (r02 = r011.A00) == null) {
                            d4 = 0.0d;
                        } else {
                            d4 = r02.A01;
                        }
                        Double valueOf4 = Double.valueOf(d4);
                        C194409rg r012 = A002.A01;
                        if (!(r012 == null || (r0 = r012.A00) == null)) {
                            d5 = r0.A01;
                        }
                        if (!C18070vi.A18(valueOf4, Double.valueOf(d5))) {
                            return true;
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public void A0S() {
        AnonymousClass6h1 r1 = this.A04;
        Set set = r1.A03;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.unregisterObserver(r1);
        }
        this.A0P.unregisterObserver(this.A0Q);
    }

    public final C445823z A0T() {
        AnonymousClass1G1 r3 = this.A0O;
        Integer num = ((AnonymousClass4YY) r3.getValue()).A03;
        Integer num2 = AnonymousClass00R.A01;
        AnonymousClass4YY r0 = (AnonymousClass4YY) r3.getValue();
        if (num == num2) {
            return r0.A00;
        }
        return r0.A01;
    }

    public final void A0U(PlaceInfo placeInfo) {
        Object value;
        AnonymousClass4YY r0;
        AnonymousClass1G4 r2 = this.A0L;
        do {
            value = r2.getValue();
            r0 = (AnonymousClass4YY) value;
        } while (!r2.BFK(value, new AnonymousClass4YY(r0.A01, r0.A00, placeInfo, r0.A03, r0.A04)));
    }

    public final void A0W(boolean z) {
        Object value;
        C88324Zf r0;
        AnonymousClass1G4 r2 = this.A0K;
        do {
            value = r2.getValue();
            r0 = (C88324Zf) value;
        } while (!r2.BFK(value, new C88324Zf(r0.A01, r0.A02, r0.A03, r0.A00, z)));
    }

    public void Bn9() {
        Object value;
        AnonymousClass1G4 r3 = this.A0K;
        do {
            value = r3.getValue();
        } while (!A07((C88324Zf) value, AnonymousClass00R.A0N, value, r3));
    }

    public void BsT() {
        Object value;
        C88324Zf r0;
        AnonymousClass1G4 r2 = this.A0K;
        do {
            value = r2.getValue();
            r0 = (C88324Zf) value;
        } while (!r2.BFK(value, new C88324Zf(r0.A01, AnonymousClass00R.A0Y, (String) null, r0.A00, r0.A04)));
    }

    public void Bwh() {
        Object value;
        AnonymousClass1G4 r3 = this.A0K;
        do {
            value = r3.getValue();
        } while (!A07((C88324Zf) value, AnonymousClass00R.A0C, value, r3));
    }

    public static final void A04(C86794Tc r4, AnonymousClass3VY r5) {
        AnonymousClass3MW.A1X(r5.A0S, new EventCreateOrEditViewModel$sendMessageSendingResult$1(r4, r5, (C30391dr) null), C41561wd.A00(r5));
    }

    public AnonymousClass3VY(AnonymousClass1KB r18, C34531kd r19, C33251iW r20, AnonymousClass6h1 r21, AnonymousClass11E r22, AnonymousClass11P r23, C24681Lg r24, C32981i4 r25, C88194Yr r26, C88124Yk r27, C25931Qe r28, C57242il r29, AnonymousClass1BI r30, AnonymousClass205 r31, AnonymousClass1W6 r32, AnonymousClass00H r33, AnonymousClass00H r34, C18600wl r35, C18600wl r36, long j) {
        AnonymousClass1W6 r0 = r32;
        AnonymousClass11P r12 = r23;
        C32981i4 r11 = r25;
        C88124Yk r7 = r27;
        C33251iW r15 = r20;
        C18070vi.A0w(r12, r7, r15, r11, r0);
        C24681Lg r6 = r24;
        C88194Yr r10 = r26;
        C18070vi.A0l(r6, r10);
        AnonymousClass11E r14 = r22;
        AnonymousClass1KB r16 = r18;
        C72473Md.A1K(r14, r16);
        AnonymousClass00H r5 = r33;
        AnonymousClass00H r4 = r34;
        C25931Qe r9 = r28;
        C57242il r8 = r29;
        C34531kd r13 = r19;
        C18070vi.A0y(r13, r8, r9, r5, r4);
        C18600wl r2 = r36;
        C18600wl r3 = r35;
        C18070vi.A0m(r3, r2);
        this.A06 = r12;
        this.A0B = r7;
        this.A03 = r15;
        this.A09 = r11;
        this.A0G = r0;
        this.A0P = r6;
        this.A0A = r10;
        AnonymousClass6h1 r72 = r21;
        this.A04 = r72;
        this.A05 = r14;
        this.A01 = r16;
        this.A02 = r13;
        this.A0D = r8;
        this.A0C = r9;
        this.A0R = r5;
        this.A0H = r4;
        this.A0S = r3;
        this.A0J = r2;
        this.A0E = r30;
        this.A00 = j;
        this.A0F = r31;
        Integer num = AnonymousClass00R.A00;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new AnonymousClass4YY((C445823z) null, (C445823z) null, (PlaceInfo) null, num, true));
        this.A0L = A18;
        this.A0O = A18;
        AnonymousClass1G7 A182 = AnonymousClass3MW.A18(new C88324Zf(AnonymousClass4CW.WA_VIDEO_CALL, num, (String) null, 0, false));
        this.A0K = A182;
        this.A0M = A182;
        C84854Lc r02 = new C84854Lc(new C27178DXn(0));
        this.A07 = r02;
        this.A08 = r02;
        C95514mM r42 = new C95514mM(this, 5);
        this.A0Q = r42;
        r72.A03.add(this);
        if (r31 != null) {
            C30451dy.A02(num, this.A0J, new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this, (C30391dr) null), C41561wd.A00(this));
            num = AnonymousClass00R.A01;
        }
        this.A0I = num;
        r6.registerObserver(r42);
    }
}
