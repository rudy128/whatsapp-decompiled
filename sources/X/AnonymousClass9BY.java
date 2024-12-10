package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.9BY  reason: invalid class name */
public class AnonymousClass9BY extends A34 {
    public final boolean A00;
    public final AnonymousClass205 A01;
    public final String A02;
    public final /* synthetic */ C161588Gc A03;

    public AnonymousClass9BY(C161588Gc r1, AnonymousClass205 r2, String str, boolean z) {
        this.A03 = r1;
        this.A01 = r2;
        this.A02 = str;
        this.A00 = z;
    }

    public void A0E() {
        if (this.A00) {
            this.A03.A0q(false);
        }
        this.A03.A05 = null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass8pG r0;
        AnonymousClass9NU r02;
        AW0 aw0;
        AnonymousClass9NU r14 = (AnonymousClass9NU) obj;
        C161588Gc r3 = this.A03;
        AnonymousClass1QE r4 = r3.A0g;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onTransactionDetailData loaded: ");
        AnonymousClass8BW.A1D(r4, A10, AnonymousClass000.A1W(r14));
        if (r14.A01 == null) {
            r4.A06("onTransactionDetailData transactionInfo is null");
            r3.A08.A0F(C198789yu.A00(18));
        } else {
            if (this.A00) {
                r3.A0q(false);
            }
            if ("native".equals(r3.A0A)) {
                C21433Ak0.A00(r3.A0l, this, r14, 10);
                if (r14.A02 != null) {
                    r3.A08.A0F(C198789yu.A00(3));
                }
            }
            if (r3 instanceof AnonymousClass96K) {
                AnonymousClass96K r42 = (AnonymousClass96K) r3;
                r42.A06 = r14;
                AW0 aw02 = r14.A01;
                if (aw02.A03 == 1000 || (!aw02.A0K() && r42.A06.A01.A0N() && !TextUtils.isEmpty(r42.A06.A01.A0K))) {
                    r42.A0q(true);
                    AQF aqf = r42.A09;
                    String str = r42.A06.A01.A0K;
                    AZH azh = new AZH(r42);
                    if (!TextUtils.isEmpty(str)) {
                        AQF.A01(azh, aqf, C108965cb.A0s(str));
                    }
                } else {
                    r42.A0a();
                    int i = aw02.A03;
                    if (!((i != 20 && i != 40) || (r0 = aw02.A0A) == null || Boolean.TRUE.equals(r0.A03) || (r02 = r42.A06) == null || (aw0 = r02.A01) == null)) {
                        AW0 aw03 = new AW0(aw0.A0G, aw0.A03, aw0.A04, aw0.A01, aw0.A05);
                        AnonymousClass8pG r1 = aw0.A0A;
                        aw03.A0A = r1;
                        if (r1 != null) {
                            r1.A03 = AnonymousClass000.A0i();
                            r42.A0l.CGF(new AnonymousClass3C5(r42, aw03, aw0, 0));
                        }
                    }
                    AnonymousClass1DT r2 = r42.A01;
                    List A102 = AnonymousClass3MW.A10(r2);
                    if (A102 != null) {
                        A102.clear();
                    }
                    AnonymousClass9NU r03 = r42.A06;
                    if (!(r03 == null || r03.A01 == null)) {
                        r42.A0h(A102);
                        r2.A0F(A102);
                    }
                }
            } else {
                r3.A06 = r14;
                if (r3.A0b.A01()) {
                    C20478AMp.A00(r3.A0K, AnonymousClass11S.A00(r3.A0J), r3, 7);
                } else {
                    C161588Gc.A04(r3);
                }
            }
            r3.A0b();
        }
        r3.A05 = null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.9NU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9NU A0J() {
        /*
            r11 = this;
            X.8Gc r8 = r11.A03
            X.1QR r2 = r8.A0T
            java.lang.String r1 = r11.A02
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r6 = 0
            if (r0 == 0) goto L_0x006c
            X.205 r0 = r11.A01
            java.lang.String r0 = r0.A01
        L_0x0011:
            X.AW0 r5 = X.AnonymousClass8BU.A0J(r2, r0, r1)
            if (r5 == 0) goto L_0x0113
            int r1 = r5.A03
            r0 = 9
            if (r1 != r0) goto L_0x003c
            X.8pG r0 = r5.A0A
            if (r0 == 0) goto L_0x003c
            X.ADR r0 = r0.A01
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003c
            X.8pG r0 = r5.A0A
            X.ADR r0 = r0.A01
            java.lang.String r0 = r0.A03
            X.C17960vV.A07(r0)
            X.AW0 r0 = r2.A0M(r0)
            r8.A03 = r0
        L_0x003c:
            r4 = 1
            java.lang.String r0 = r5.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006a
            X.1KH r1 = r8.A0U
            java.lang.String r0 = r5.A0H
            X.AEs r3 = r1.A08(r0)
            if (r3 != 0) goto L_0x006e
        L_0x004f:
            java.util.ArrayList r0 = r5.A0N
            if (r0 == 0) goto L_0x006e
            java.util.Iterator r1 = r0.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            X.9dI r0 = (X.C185879dI) r0
            X.AEs r0 = r0.A01
            if (r0 == 0) goto L_0x0057
            r3 = r0
            r4 = 0
            goto L_0x0057
        L_0x006a:
            r3 = r6
            goto L_0x004f
        L_0x006c:
            r0 = r6
            goto L_0x0011
        L_0x006e:
            X.8pG r0 = r5.A0A
            if (r0 == 0) goto L_0x0115
            X.AEo r0 = r0.A02
            if (r0 == 0) goto L_0x0115
            X.C17960vV.A07(r0)
            java.lang.String r1 = r0.A02
            X.1Qn r9 = r8.A0R
            X.21K r6 = r9.A01(r1)
            if (r6 != 0) goto L_0x0115
            X.0ve r7 = r8.A0V
            r2 = 8355(0x20a3, float:1.1708E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r2)
            if (r0 == 0) goto L_0x0115
            X.C17960vV.A00()
            X.1Qg r0 = r9.A00
            X.C17960vV.A00()
            X.1Cd r0 = r0.A01
            X.1at r10 = r0.get()
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x0109 }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x0109 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0109 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0109 }
            java.lang.String r1 = X.C50952Wk.A00     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "GET_CAROUSEL_MESSAGE_BY_MESSAGE_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r7)     // Catch:{ all -> 0x0109 }
            r10.close()
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0102 }
            if (r0 == 0) goto L_0x00c6
            X.00H r0 = r9.A01     // Catch:{ all -> 0x0102 }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x0102 }
            X.206 r0 = r0.A01(r2)     // Catch:{ all -> 0x0102 }
            X.21L r0 = (X.AnonymousClass21L) r0     // Catch:{ all -> 0x0102 }
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            r2.close()
            if (r0 == 0) goto L_0x0115
            java.util.List r1 = r0.A17()
            if (r1 == 0) goto L_0x0115
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0115
            java.util.Iterator r7 = r1.iterator()
        L_0x00dc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0115
            X.206 r2 = X.C17880vN.A0Y(r7)
            X.21K r2 = (X.AnonymousClass21K) r2
            X.AEt r0 = r2.BPK()
            if (r0 == 0) goto L_0x00dc
            X.AEn r0 = r0.A02
            if (r0 == 0) goto L_0x00dc
            java.lang.String r1 = r0.A0K
            X.8pG r0 = r5.A0A
            X.AEo r0 = r0.A02
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dc
            r6 = r2
            goto L_0x00dc
        L_0x0102:
            r1 = move-exception
            if (r2 == 0) goto L_0x0112
            r2.close()     // Catch:{ all -> 0x010e }
            throw r1
        L_0x0109:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x010e }
            throw r1
        L_0x010e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x0112:
            throw r1
        L_0x0113:
            r3 = r6
            r4 = 1
        L_0x0115:
            X.2lL r0 = r8.A0S
            X.206 r1 = r0.A00(r5)
            X.9NU r0 = new X.9NU
            r0.<init>()
            r0.A00 = r3
            r0.A04 = r4
            r0.A01 = r5
            r0.A02 = r1
            r0.A03 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BY.A0J():X.9NU");
    }
}
