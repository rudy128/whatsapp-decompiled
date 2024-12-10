package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1iV  reason: invalid class name and case insensitive filesystem */
public final class C33241iV {
    public final C18030ve A00;
    public final AnonymousClass00H A01 = C217517g.A00(32891);
    public final AnonymousClass18K A02;
    public final AnonymousClass00H A03;

    public C33241iV(C18030ve r2, AnonymousClass18K r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A02 = r3;
        this.A00 = r2;
        this.A03 = r4;
    }

    public static final void A00(C33241iV r8, AnonymousClass206 r9, int i, int i2) {
        AnonymousClass206 r4 = r9;
        if (A03(r9)) {
            Object obj = r8.A03.get();
            C18070vi.A0X(obj);
            List singletonList = Collections.singletonList(r9);
            C18070vi.A0X(singletonList);
            ((A5M) obj).A05((Integer) null, singletonList, 5);
            A01(r8, r4, Integer.valueOf(i2), (Long) null, i, 1, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017d, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C33241iV r18, X.AnonymousClass206 r19, java.lang.Integer r20, java.lang.Long r21, int r22, int r23, int r24) {
        /*
            r0 = 0
            r3 = r19
            java.lang.Integer r7 = X.C62852s6.A01(r3)
            int r19 = X.C62852s6.A00(r3)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            boolean r5 = r3 instanceof X.AnonymousClass21K
            r1 = 0
            if (r5 == 0) goto L_0x0018
            r0 = r3
            X.21K r0 = (X.AnonymousClass21K) r0
        L_0x0018:
            r4 = 0
            if (r0 == 0) goto L_0x014d
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x014d
            X.AEk r0 = r0.A06
            if (r0 == 0) goto L_0x014d
        L_0x0025:
            java.util.List r6 = r0.A03
        L_0x0027:
            java.lang.String r5 = "num_buttons"
            int r0 = r6.size()
            r2.put(r5, r0)
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0054
            java.lang.Object r4 = r6.get(r4)
            boolean r0 = r4 instanceof X.C20253ADl
            if (r0 == 0) goto L_0x0046
            X.ADl r4 = (X.C20253ADl) r4
            if (r4 == 0) goto L_0x0046
            X.AEe r0 = r4.A01
            java.lang.String r1 = r0.A02
        L_0x0046:
            java.lang.String r0 = "review_and_pay_v2"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = "has_payments_cta"
            r0 = 1
            r2.put(r1, r0)
        L_0x0054:
            if (r20 == 0) goto L_0x005f
            int r1 = r20.intValue()
            java.lang.String r0 = "button_index"
            r2.put(r0, r1)
        L_0x005f:
            if (r21 == 0) goto L_0x006a
            long r0 = r21.longValue()
            java.lang.String r4 = "duration_ms"
            r2.put(r4, r0)
        L_0x006a:
            java.lang.Integer r0 = X.C20120A8f.A02(r3)
            if (r0 == 0) goto L_0x0079
            int r1 = r0.intValue()
            java.lang.String r0 = "card_index"
            r2.put(r0, r1)
        L_0x0079:
            boolean r0 = X.C20120A8f.A08(r3)
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = "feature_type"
            java.lang.String r0 = "offer"
            r2.put(r1, r0)
            java.lang.Long r0 = X.C20120A8f.A03(r3)
            if (r0 == 0) goto L_0x0095
            long r0 = r0.longValue()
            java.lang.String r4 = "expiration_time"
            r2.put(r4, r0)
        L_0x0095:
            X.206 r1 = X.C20120A8f.A00(r3)
            boolean r0 = r1 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x00b6
            X.21K r1 = (X.AnonymousClass21K) r1
            if (r1 == 0) goto L_0x00b6
            X.AEt r0 = r1.BPK()
            if (r0 == 0) goto L_0x00b6
            X.ADa r0 = r0.A04
            if (r0 == 0) goto L_0x00b6
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.lang.String r0 = "num_cards"
            r2.put(r0, r1)
        L_0x00b6:
            java.lang.String r12 = r2.toString()
            X.C18070vi.A0X(r12)
            java.lang.String r13 = X.C20120A8f.A04(r3)
            r6 = r18
            X.0ve r4 = r6.A00
            r0 = 6748(0x1a5c, float:9.456E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            r8 = 0
            if (r0 == 0) goto L_0x00de
            X.206 r0 = X.C20120A8f.A00(r3)
            X.1ya r0 = r0.A0O
            if (r0 == 0) goto L_0x00de
            int r0 = r0.hostStorage
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x00de:
            java.lang.String r14 = X.C62852s6.A02(r4, r3)
            r0 = 6816(0x1aa0, float:9.551E-42)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x014b
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.206 r0 = X.C20120A8f.A00(r3)
            long r0 = r0.A0G
            long r0 = r5.toSeconds(r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
        L_0x00fa:
            r0 = 9048(0x2358, float:1.2679E-41)
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0149
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.206 r0 = X.C20120A8f.A00(r3)
            long r0 = r0.A0I
            long r0 = r5.toSeconds(r0)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x0112:
            r5 = 6837(0x1ab5, float:9.58E-42)
            boolean r0 = X.C18020vd.A05(r2, r4, r5)
            if (r0 == 0) goto L_0x0147
            X.206 r0 = X.C20120A8f.A00(r3)
            X.205 r0 = r0.A0v
            int r0 = r0.hashCode()
            long r0 = (long) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
        L_0x0129:
            boolean r0 = X.C18020vd.A05(r2, r4, r5)
            if (r0 == 0) goto L_0x0145
            X.206 r0 = X.C20120A8f.A00(r3)
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            java.lang.String r15 = X.C17970vW.A04(r0)
        L_0x013b:
            r16 = r22
            r17 = r23
            r18 = r24
            A02(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0145:
            r15 = 0
            goto L_0x013b
        L_0x0147:
            r11 = 0
            goto L_0x0129
        L_0x0149:
            r10 = 0
            goto L_0x0112
        L_0x014b:
            r9 = 0
            goto L_0x00fa
        L_0x014d:
            boolean r0 = r3 instanceof X.C439421n
            if (r0 == 0) goto L_0x0160
            r0 = r3
            X.21n r0 = (X.C439421n) r0
            if (r0 == 0) goto L_0x0160
            X.2k6 r0 = r0.BaE()
            if (r0 == 0) goto L_0x0160
            java.util.List r6 = r0.A06
            if (r6 != 0) goto L_0x0027
        L_0x0160:
            if (r5 == 0) goto L_0x0054
            r0 = r3
            X.21K r0 = (X.AnonymousClass21K) r0
            if (r0 == 0) goto L_0x0054
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x0054
            X.ADa r0 = r0.A04
            if (r0 == 0) goto L_0x0054
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r4)
            X.AEt r0 = (X.C20285AEt) r0
            if (r0 == 0) goto L_0x0054
            X.AEk r0 = r0.A06
            if (r0 == 0) goto L_0x0054
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33241iV.A01(X.1iV, X.206, java.lang.Integer, java.lang.Long, int, int, int):void");
    }

    public static final void A02(C33241iV r2, Integer num, Integer num2, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4) {
        AnonymousClass2H7 r1 = new AnonymousClass2H7();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(i3);
        r1.A03 = num;
        r1.A05 = Integer.valueOf(i4);
        r1.A0A = str;
        r1.A0C = str2;
        r1.A04 = num2;
        r1.A0B = str3;
        r1.A07 = l;
        r1.A08 = l2;
        r1.A06 = l3;
        r1.A09 = str4;
        r2.A02.CC7(r1);
    }

    public static final boolean A03(AnonymousClass206 r2) {
        C20285AEt BPK;
        C20277AEk aEk;
        if (r2 == null || !(!AnonymousClass1EG.A0H(C20120A8f.A04(r2)))) {
            return false;
        }
        if (C20120A8f.A07(r2)) {
            return true;
        }
        if ((!(r2 instanceof AnonymousClass21K) || (BPK = ((AnonymousClass21K) r2).BPK()) == null || !BPK.A04() || (aEk = BPK.A06) == null || aEk.A01 != 0) && !(r2 instanceof C439421n)) {
            return false;
        }
        return true;
    }

    public final void A04(Collection collection) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass206 r3 = (AnonymousClass206) it.next();
                if (A03(r3)) {
                    A01(this, r3, (Integer) null, (Long) null, 0, 2, 0);
                }
            }
        }
    }
}
