package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Acn  reason: case insensitive filesystem */
public class C20995Acn implements AnonymousClass1O5 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1UP A01;
    public final C18030ve A02;
    public final C24751Ln A03;
    public final AnonymousClass1UN A04;
    public final AnonymousClass1OZ A05;
    public final Map A06 = Collections.synchronizedMap(C17880vN.A11());

    public static A00 A01(C29621ca r10, String str) {
        int i;
        Long l;
        if (str.equals("contact")) {
            String A0Q = r10.A0Q("integrity", "pass");
            if ("pending".equals(A0Q)) {
                i = 2;
            } else {
                i = 1;
                if ("timelock".equals(A0Q)) {
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        if (r10.A0K("error") != null) {
            C29621ca A0L = r10.A0L("error");
            Long valueOf = Long.valueOf(Math.min(A0L.A0D("backoff", 7200) * 1000, 3600000));
            String A022 = C29621ca.A02(A0L, "text");
            int A0A = A0L.A0A("code", -1);
            long A0D = A0L.A0D("backoff", -1);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("connection/unisynciq/parse/");
            A10.append(str);
            A10.append("/error/error_text= ");
            A10.append(A022);
            A10.append(", code: ");
            A10.append(A0A);
            Log.w(C17890vO.A0a(", backoff:", A10, A0D));
            return new A00(Integer.valueOf(A0A), (Long) null, valueOf, i, false);
        }
        String A0Q2 = r10.A0Q("refresh", (String) null);
        if (A0Q2 != null) {
            l = Long.valueOf(Long.parseLong(A0Q2) * 1000);
        } else {
            l = null;
        }
        return new A00((Integer) null, l, (Long) null, i, true);
    }

    private void A04(C188899iB r5, List list) {
        AnonymousClass1E2 A0C;
        UserJid userJid = r5.A09;
        if (C22971Dz.A0Y(userJid) && (A0C = this.A03.A0C((PhoneUserJid) userJid)) != null) {
            list.add(AnonymousClass8BR.A0k("lid", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) A0C, "jid")}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0271, code lost:
        if ((r33 & 16) == 16) goto L_0x0273;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0307, code lost:
        if (r0 != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03d2, code lost:
        if (r21 == false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ff, code lost:
        if (r21 != false) goto L_0x03d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0504, code lost:
        if (r6 != false) goto L_0x0506;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C26981Ug A05(X.A01 r50, java.lang.String r51, long r52) {
        /*
            r49 = this;
            r48 = r49
            r0 = r48
            X.1OZ r0 = r0.A05
            r47 = r0
            java.lang.String r20 = r47.A0B()
            r34 = r50
            r0 = r34
            X.2R1 r0 = r0.A01
            r46 = r0
            r0 = 4
            java.util.ArrayList r4 = X.C17880vN.A0z(r0)
            java.util.ArrayList r16 = X.AnonymousClass000.A13()
            java.util.ArrayList r18 = X.AnonymousClass000.A13()
            r0 = 2
            java.util.ArrayList r26 = X.C17880vN.A0z(r0)
            r25 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r33 = 0
            r41 = 0
            r11 = 0
            r42 = 0
            r43 = 0
            r44 = 0
        L_0x003f:
            r0 = r34
            java.util.List r3 = r0.A02
            int r2 = r3.size()
            java.lang.String r23 = "sidelist"
            java.lang.String r17 = "pay"
            java.lang.String r24 = "bot"
            java.lang.String r32 = "devices"
            java.lang.String r31 = "picture"
            java.lang.String r15 = "business"
            java.lang.String r28 = "id"
            java.lang.String r14 = "verified_name"
            java.lang.String r13 = "status"
            java.lang.String r27 = "profile"
            java.lang.String r19 = "type"
            java.lang.String r1 = "contact"
            r0 = r25
            if (r0 >= r2) goto L_0x0404
            java.lang.Object r3 = r3.get(r0)
            X.9iB r3 = (X.C188899iB) r3
            java.util.ArrayList r30 = X.AnonymousClass000.A13()
            r4.clear()
            boolean r0 = r3.A0K
            java.lang.String r29 = "delete"
            if (r0 == 0) goto L_0x0090
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x0090
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x0367
            r0 = 1
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            r2 = r19
            r0 = r29
            X.AnonymousClass8BV.A1M(r2, r0, r5)
        L_0x0088:
            X.1ca r2 = X.AnonymousClass8BR.A0k(r1, r5)
        L_0x008c:
            r4.add(r2)
        L_0x008f:
            r11 = 1
        L_0x0090:
            boolean r0 = r3.A0U
            r5 = 0
            if (r0 == 0) goto L_0x00b3
            long r0 = r3.A05
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b1
            r0 = 1
            X.1MD[] r2 = new X.AnonymousClass1MD[r0]
            long r0 = r3.A05
            long r0 = X.C17880vN.A04(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "t"
            X.AnonymousClass8BV.A1M(r0, r1, r2)
            X.C29621ca.A05(r13, r4, r2)
        L_0x00b1:
            r35 = 1
        L_0x00b3:
            boolean r0 = r3.A0J
            java.lang.String r8 = "tag"
            if (r0 == 0) goto L_0x00f5
            r26.clear()
            java.lang.String r0 = r3.A0H
            if (r0 == 0) goto L_0x00cf
            r0 = 1
            X.1MD[] r2 = new X.AnonymousClass1MD[r0]
            java.lang.String r1 = "serial"
            java.lang.String r0 = r3.A0H
            X.AnonymousClass8BV.A1M(r1, r0, r2)
            r0 = r26
            X.C29621ca.A05(r14, r0, r2)
        L_0x00cf:
            java.lang.String r0 = r3.A0C
            if (r0 == 0) goto L_0x0364
            r0 = 1
            X.1MD[] r5 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = r3.A0C
            boolean r2 = X.C17890vO.A1W(r8, r0, r5)
            r1 = r27
            r0 = r26
            X.C29621ca.A05(r1, r0, r5)
        L_0x00e3:
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x00f3
            r0 = r26
            X.1ca[] r1 = X.C17890vO.A1Y(r0, r2)
            r0 = 0
            X.AnonymousClass8BU.A1K(r15, r4, r0, r1)
        L_0x00f3:
            r37 = 1
        L_0x00f5:
            boolean r0 = r3.A0R
            java.lang.String r7 = "persona_id"
            if (r0 == 0) goto L_0x0126
            r0 = 2
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)
            int r0 = r3.A02
            if (r0 <= 0) goto L_0x010b
            int r1 = r3.A02
            r0 = r28
            X.AnonymousClass8BT.A1T(r0, r2, r1)
        L_0x010b:
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = r3.A0B
            X.C17890vO.A11(r7, r0, r2)
        L_0x0114:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0124
            r0 = 0
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r2, r0)
            r0 = r31
            X.C29621ca.A05(r0, r4, r1)
        L_0x0124:
            r36 = 1
        L_0x0126:
            X.2eA r0 = r3.A0A
            if (r0 == 0) goto L_0x014a
            X.2eA r0 = r3.A0A
            X.2lX r0 = r0.A00
            if (r0 == 0) goto L_0x013d
            byte[] r5 = r0.A01
            java.lang.String r2 = "tctoken"
            r1 = 0
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r2, (byte[]) r5, (X.AnonymousClass1MD[]) r1)
            r4.add(r0)
        L_0x013d:
            X.2eA r0 = r3.A0A
            X.1EC r2 = r0.A01
            if (r2 == 0) goto L_0x014a
            java.lang.String r1 = "common_gid"
            r0 = r30
            X.C17890vO.A0n(r2, r1, r0)
        L_0x014a:
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x018c
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r0 = r3.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x018a
            java.lang.String r1 = "device_hash"
            java.lang.String r0 = r3.A0D
            X.C17890vO.A11(r1, r0, r2)
            long r0 = r3.A04
            r9 = 0
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x017d
            java.lang.String r5 = "ts"
            long r0 = r3.A04
            X.AnonymousClass8BT.A1U(r5, r2, r0)
            long r5 = r3.A03
            int r9 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x017d
            java.lang.String r5 = "expected_ts"
            long r0 = r3.A03
            X.AnonymousClass8BT.A1U(r5, r2, r0)
        L_0x017d:
            int r0 = r2.size()
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r2, r0)
            r0 = r32
            X.C29621ca.A05(r0, r4, r1)
        L_0x018a:
            r39 = 1
        L_0x018c:
            boolean r0 = r3.A0I
            if (r0 == 0) goto L_0x01c0
            r0 = 2
            java.util.ArrayList r1 = X.C17880vN.A0z(r0)
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x019e
            int r0 = r3.A01
            X.AnonymousClass8BT.A1T(r8, r1, r0)
        L_0x019e:
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x01a7
            java.lang.String r0 = r3.A0B
            X.C17890vO.A11(r7, r0, r1)
        L_0x01a7:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01be
            r0 = 0
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r1, r0)
            r0 = r27
            X.1ca r2 = X.AnonymousClass8BR.A0k(r0, r1)
            r1 = 0
            r0 = r24
            X.AnonymousClass8BT.A1J(r2, r0, r4, r1)
        L_0x01be:
            r42 = 1
        L_0x01c0:
            com.whatsapp.jid.UserJid r0 = r3.A09
            if (r0 == 0) goto L_0x01cd
            java.lang.String r2 = "jid"
            com.whatsapp.jid.UserJid r1 = r3.A09
            r0 = r30
            X.C17890vO.A0n(r1, r2, r0)
        L_0x01cd:
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x02d9
            X.9ee r0 = r3.A06
            if (r0 == 0) goto L_0x02d9
            boolean r0 = r3.A0Q
            if (r0 == 0) goto L_0x023b
            X.9ee r2 = r3.A06
            if (r2 == 0) goto L_0x023b
            android.util.Pair r0 = r2.A00
            java.lang.Object r0 = r0.first
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x01e9
            r33 = r33 | 1
        L_0x01e9:
            X.10w r0 = r2.A01
            boolean r6 = r0.isEmpty()
            r5 = 3
            r1 = 1
            if (r6 != 0) goto L_0x0213
            X.10f r0 = r0.entrySet()
            X.1IZ r6 = r0.iterator()
        L_0x01fb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0213
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r6)
            int r0 = X.AnonymousClass8BV.A04(r0)
            if (r0 != r1) goto L_0x020e
            r33 = r33 | 2
            goto L_0x01fb
        L_0x020e:
            if (r0 != r5) goto L_0x01fb
            r33 = r33 | 8
            goto L_0x01fb
        L_0x0213:
            X.10w r0 = r2.A02
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x023b
            X.10f r0 = r0.entrySet()
            X.1IZ r2 = r0.iterator()
        L_0x0223:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x023b
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            int r0 = X.AnonymousClass8BV.A04(r0)
            if (r0 != r1) goto L_0x0236
            r33 = r33 | 16
            goto L_0x0223
        L_0x0236:
            if (r0 != r5) goto L_0x0223
            r33 = r33 | 32
            goto L_0x0223
        L_0x023b:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.9ee r1 = r3.A06
            android.util.Pair r5 = r1.A00
            r0 = 0
            r7 = 1
            java.lang.Object r6 = r5.first
            boolean r6 = X.AnonymousClass000.A1Y(r6)
            if (r6 == 0) goto L_0x0267
            java.lang.Object r6 = r5.second
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0267
            X.1MD[] r6 = new X.AnonymousClass1MD[r7]
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = "dhash"
            X.C17880vN.A1Q(r8, r5, r6, r0)
            java.lang.String r5 = "merchant_status"
            X.C29621ca.A05(r5, r2, r6)
        L_0x0267:
            r6 = r33 & 2
            r5 = 2
            if (r6 == r5) goto L_0x0273
            r6 = 16
            r5 = r33 & 16
            r8 = 0
            if (r5 != r6) goto L_0x0274
        L_0x0273:
            r8 = 1
        L_0x0274:
            r6 = 0
            if (r8 == 0) goto L_0x029a
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.10w r8 = r1.A01
            X.1ca r8 = A02(r8, r7)
            X.10w r9 = r1.A02
            X.1ca r7 = A03(r9, r7)
            if (r8 == 0) goto L_0x028c
            r5.add(r8)
        L_0x028c:
            if (r7 == 0) goto L_0x0291
            r5.add(r7)
        L_0x0291:
            X.1ca[] r7 = X.C17890vO.A1Y(r5, r0)
            java.lang.String r5 = "upi"
            X.AnonymousClass8BU.A1K(r5, r2, r6, r7)
        L_0x029a:
            r7 = r33 & 8
            r5 = 8
            if (r7 == r5) goto L_0x02a6
            r7 = 32
            r5 = r33 & 32
            if (r5 != r7) goto L_0x02ca
        L_0x02a6:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.10w r8 = r1.A01
            r7 = 3
            X.1ca r8 = A02(r8, r7)
            X.10w r1 = r1.A02
            X.1ca r1 = A03(r1, r7)
            if (r8 == 0) goto L_0x02bc
            r5.add(r8)
        L_0x02bc:
            if (r1 == 0) goto L_0x02c1
            r5.add(r1)
        L_0x02c1:
            X.1ca[] r5 = X.C17890vO.A1Y(r5, r0)
            java.lang.String r1 = "fbpay"
            X.AnonymousClass8BU.A1K(r1, r2, r6, r5)
        L_0x02ca:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x02d9
            X.1ca[] r1 = X.C17890vO.A1Y(r2, r0)
            r0 = r17
            X.AnonymousClass8BU.A1K(r0, r4, r6, r1)
        L_0x02d9:
            boolean r0 = r3.A0N
            if (r0 == 0) goto L_0x02df
            r40 = 1
        L_0x02df:
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x02e5
            r41 = 1
        L_0x02e5:
            boolean r0 = r3.A0W
            if (r0 == 0) goto L_0x02eb
            r43 = 1
        L_0x02eb:
            boolean r0 = r3.A0V
            if (r0 == 0) goto L_0x02f1
            r44 = 1
        L_0x02f1:
            boolean r0 = r3.A0O
            java.lang.String r5 = "user"
            if (r0 == 0) goto L_0x034c
            com.whatsapp.jid.UserJid r0 = r3.A09
            boolean r0 = X.C22971Dz.A0S(r0)
            if (r0 != 0) goto L_0x0346
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0309
            r0 = r38
            r38 = 0
            if (r0 == 0) goto L_0x030b
        L_0x0309:
            r38 = 1
        L_0x030b:
            boolean r0 = r3.A0L
            if (r0 == 0) goto L_0x034a
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            r2 = r19
            r0 = r29
            boolean r2 = X.C17890vO.A1W(r2, r0, r1)
            r0 = r23
            X.C29621ca.A05(r0, r4, r1)
        L_0x031f:
            if (r41 == 0) goto L_0x0326
            r0 = r48
            r0.A04(r3, r4)
        L_0x0326:
            r0 = r30
            X.1MD[] r6 = X.AnonymousClass8BT.A1b(r0, r2)
            X.1ca[] r1 = X.C17890vO.A1Y(r4, r2)
            r0 = r18
            X.AnonymousClass8BU.A1K(r5, r0, r6, r1)
            com.whatsapp.jid.UserJid r0 = r3.A09
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 == 0) goto L_0x0346
            X.1E7 r0 = r3.A07
            if (r0 == 0) goto L_0x0346
            X.1E7 r0 = r3.A07
            r0.A0C()
        L_0x0346:
            int r25 = r25 + 1
            goto L_0x003f
        L_0x034a:
            r2 = 0
            goto L_0x031f
        L_0x034c:
            if (r41 == 0) goto L_0x0353
            r0 = r48
            r0.A04(r3, r4)
        L_0x0353:
            r0 = 0
            r1 = r30
            X.1MD[] r1 = X.AnonymousClass8BT.A1b(r1, r0)
            X.1ca[] r0 = X.C17890vO.A1Y(r4, r0)
            r2 = r16
            X.AnonymousClass8BU.A1K(r5, r2, r1, r0)
            goto L_0x0346
        L_0x0364:
            r2 = 0
            goto L_0x00e3
        L_0x0367:
            java.lang.String r0 = r3.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x038e
            java.lang.String r0 = r3.A0E
            r5 = 0
            X.AnonymousClass8BU.A1J(r1, r0, r4)
            r1 = r48
            r0 = r46
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x008f
            byte[] r0 = r3.A00
            if (r0 == 0) goto L_0x008f
            java.lang.String r1 = "contact_metadata"
            byte[] r0 = r3.A00
            X.1ca r2 = new X.1ca
            r2.<init>((java.lang.String) r1, (byte[]) r0, (X.AnonymousClass1MD[]) r5)
            goto L_0x008c
        L_0x038e:
            com.whatsapp.jid.UserJid r0 = r3.A09
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 == 0) goto L_0x03a1
            java.lang.String r0 = r3.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03a1
            r5 = 0
            goto L_0x0088
        L_0x03a1:
            java.lang.String r0 = r3.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008f
            java.lang.String r12 = r3.A0F
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x008f
            X.1E2 r10 = r3.A08
            r8 = 0
            r9 = 1
            boolean r22 = X.AnonymousClass000.A1W(r10)
            java.lang.String r7 = r3.A0G
            boolean r21 = X.AnonymousClass8BR.A1S(r7)
            r0 = r48
            X.0ve r5 = r0.A02
            r2 = 12402(0x3072, float:1.7379E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r2)
            r11 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0402
            if (r22 == 0) goto L_0x03ff
            r2 = 3
            if (r21 != 0) goto L_0x03d5
        L_0x03d4:
            r2 = 2
        L_0x03d5:
            X.1MD[] r0 = new X.AnonymousClass1MD[r2]
            java.lang.String r5 = "username"
            X.C17880vN.A1Q(r5, r12, r0, r8)
            java.lang.String r5 = "pin"
            java.lang.String r8 = "lid"
            if (r2 != r11) goto L_0x03ee
            X.C17880vN.A1I(r10, r8, r0, r9)
            X.C17880vN.A1Q(r5, r7, r0, r6)
        L_0x03e8:
            X.1ca r2 = X.AnonymousClass8BR.A0k(r1, r0)
            goto L_0x008c
        L_0x03ee:
            if (r2 != r6) goto L_0x03e8
            if (r22 == 0) goto L_0x03fa
            X.1MD r2 = new X.1MD
            r2.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r8)
        L_0x03f7:
            r0[r9] = r2
            goto L_0x03e8
        L_0x03fa:
            X.1MD r2 = X.AnonymousClass8BR.A0h(r5, r7)
            goto L_0x03f7
        L_0x03ff:
            if (r21 == 0) goto L_0x0402
            goto L_0x03d4
        L_0x0402:
            r2 = 1
            goto L_0x03d5
        L_0x0404:
            int r2 = r11 + r35
            int r2 = r2 + r37
            int r2 = r2 + r38
            int r2 = r2 + r36
            int r2 = r2 + r39
            boolean r0 = X.AnonymousClass000.A1O(r33)
            int r2 = r2 + r0
            int r2 = r2 + r40
            int r2 = r2 + r41
            int r2 = r2 + r43
            int r2 = r2 + r42
            int r2 = r2 + r44
            r0 = r2
            if (r2 != 0) goto L_0x0421
            r0 = 1
        L_0x0421:
            X.1ca[] r4 = new X.C29621ca[r0]
            if (r11 != 0) goto L_0x0677
            if (r2 == 0) goto L_0x0677
            r12 = 0
            r3 = 0
            r0 = 0
        L_0x042a:
            if (r35 == 0) goto L_0x0431
            int r3 = r3 + 1
            X.AnonymousClass8BS.A1H(r13, r0, r4, r12)
        L_0x0431:
            java.lang.String r11 = "v"
            if (r37 == 0) goto L_0x0461
            r1 = 2
            X.1ca[] r2 = new X.C29621ca[r1]
            X.1ca r1 = X.AnonymousClass8BR.A0k(r14, r0)
            r0 = 0
            r2[r0] = r1
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            r0 = r34
            int r5 = r0.A00
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r11, (int) r5)
            r5 = 0
            r1[r5] = r0
            r0 = r27
            X.1ca r1 = X.AnonymousClass8BR.A0k(r0, r1)
            r0 = 1
            r2[r0] = r1
            int r1 = r3 + 1
            r0 = 0
            X.1ca r0 = X.AnonymousClass8BR.A0l(r15, r0, r2)
            r4[r3] = r0
            r3 = r1
        L_0x0461:
            if (r36 == 0) goto L_0x047b
            int r5 = r3 + 1
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            X.2R1 r2 = X.AnonymousClass2R1.A06
            r0 = r46
            if (r0 != r2) goto L_0x0673
            java.lang.String r2 = "image"
        L_0x0470:
            r0 = r19
            X.AnonymousClass8BV.A1M(r0, r2, r1)
            r0 = r31
            X.AnonymousClass8BS.A1H(r0, r1, r4, r3)
            r3 = r5
        L_0x047b:
            if (r38 == 0) goto L_0x0486
            int r2 = r3 + 1
            r1 = 0
            r0 = r23
            X.AnonymousClass8BS.A1H(r0, r1, r4, r3)
            r3 = r2
        L_0x0486:
            if (r39 == 0) goto L_0x0670
            int r5 = r3 + 1
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            java.lang.String r2 = "version"
            java.lang.String r0 = "2"
            boolean r2 = X.C17890vO.A1W(r2, r0, r1)
            r0 = r32
            X.AnonymousClass8BS.A1H(r0, r1, r4, r3)
            r3 = r5
        L_0x049b:
            r6 = r33 & 1
            r0 = 1
            if (r6 == r0) goto L_0x05f4
            r1 = r33 & 2
            r0 = 2
            if (r1 == r0) goto L_0x05f4
            r1 = r33 & 8
            r0 = 8
            if (r1 == r0) goto L_0x05f4
            r1 = r33 & 16
            r0 = 16
            if (r1 == r0) goto L_0x05f4
            r1 = 32
            r0 = r33 & 32
            if (r0 == r1) goto L_0x05f4
            r2 = 0
        L_0x04b8:
            if (r40 == 0) goto L_0x04c2
            int r1 = r3 + 1
            java.lang.String r0 = "disappearing_mode"
            X.AnonymousClass8BS.A1H(r0, r2, r4, r3)
            r3 = r1
        L_0x04c2:
            if (r41 == 0) goto L_0x04cc
            int r1 = r3 + 1
            java.lang.String r0 = "lid"
            X.AnonymousClass8BS.A1H(r0, r2, r4, r3)
            r3 = r1
        L_0x04cc:
            if (r43 == 0) goto L_0x04d6
            int r1 = r3 + 1
            java.lang.String r0 = "username"
            X.AnonymousClass8BS.A1H(r0, r2, r4, r3)
            r3 = r1
        L_0x04d6:
            if (r42 == 0) goto L_0x04f2
            int r6 = r3 + 1
            r0 = 1
            X.1MD[] r1 = new X.AnonymousClass1MD[r0]
            java.lang.String r0 = "1"
            X.AnonymousClass8BV.A1M(r11, r0, r1)
            r0 = r27
            X.1ca r5 = X.AnonymousClass8BR.A0k(r0, r1)
            X.1ca r1 = new X.1ca
            r0 = r24
            r1.<init>((X.C29621ca) r5, (java.lang.String) r0, (X.AnonymousClass1MD[]) r2)
            r4[r3] = r1
            r3 = r6
        L_0x04f2:
            if (r44 == 0) goto L_0x04f9
            java.lang.String r0 = "text_status"
            X.AnonymousClass8BS.A1H(r0, r2, r4, r3)
        L_0x04f9:
            boolean r7 = X.C17880vN.A1X(r16)
            boolean r6 = X.C17880vN.A1X(r18)
            if (r7 != 0) goto L_0x0506
            r3 = 1
            if (r6 == 0) goto L_0x0507
        L_0x0506:
            r3 = 0
        L_0x0507:
            int r0 = r7 + 1
            int r0 = r0 + r6
            int r0 = r0 + r3
            X.1ca[] r1 = new X.C29621ca[r0]
            r5 = 1
            java.lang.String r0 = "query"
            X.1ca r0 = X.AnonymousClass8BR.A0l(r0, r2, r4)
            r4 = 0
            r1[r4] = r0
            if (r7 != 0) goto L_0x051b
            if (r3 == 0) goto L_0x052a
        L_0x051b:
            r0 = r16
            X.1ca[] r3 = X.C17890vO.A1Y(r0, r4)
            java.lang.String r0 = "list"
            X.1ca r0 = X.AnonymousClass8BR.A0l(r0, r2, r3)
            r1[r5] = r0
            r5 = 2
        L_0x052a:
            if (r6 == 0) goto L_0x053a
            r0 = r18
            X.1ca[] r3 = X.C17890vO.A1Y(r0, r4)
            java.lang.String r0 = "side_list"
            X.1ca r0 = X.AnonymousClass8BR.A0l(r0, r2, r3)
            r1[r5] = r0
        L_0x053a:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.lang.String r0 = "sid"
            r5 = r51
            X.C17890vO.A11(r0, r5, r3)
            java.lang.String r2 = "index"
            java.lang.String r0 = "0"
            X.C17890vO.A11(r2, r0, r3)
            java.lang.String r0 = "last"
            java.lang.String r2 = "true"
            X.C17890vO.A11(r0, r2, r3)
            java.lang.String r4 = "mode"
            r0 = r46
            X.2Qw r0 = r0.mode
            java.lang.String r0 = r0.modeString
            X.C17890vO.A11(r4, r0, r3)
            java.lang.String r4 = "context"
            r0 = r46
            X.2Qy r0 = r0.context
            java.lang.String r0 = r0.contextString
            X.C17890vO.A11(r4, r0, r3)
            r0 = r34
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0574
            java.lang.String r0 = "allow_mutation"
            X.C17890vO.A11(r0, r2, r3)
        L_0x0574:
            int r0 = r3.size()
            X.1MD[] r2 = X.AnonymousClass8BT.A1b(r3, r0)
            java.lang.String r0 = "usync"
            X.1ca r2 = X.AnonymousClass8BR.A0l(r0, r2, r1)
            r1 = 3
            X.1MD[] r1 = new X.AnonymousClass1MD[r1]
            java.lang.String r3 = "xmlns"
            X.AnonymousClass8BV.A1M(r3, r0, r1)
            r3 = r28
            r0 = r20
            X.AnonymousClass8BV.A1N(r3, r0, r1)
            java.lang.String r3 = "get"
            r0 = r19
            X.C17890vO.A12(r0, r3, r1)
            X.1ca r2 = X.AnonymousClass8BT.A0a(r2, r1)
            r0 = r34
            boolean r1 = r0.A04
            X.2R1 r3 = X.AnonymousClass2R1.A06
            r0 = r46
            if (r0 != r3) goto L_0x05f1
            java.lang.String r31 = "image"
        L_0x05a8:
            X.9hu r0 = new X.9hu
            r29 = r0
            r30 = r46
            r32 = r5
            r34 = r12
            r45 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            android.util.Pair r3 = android.util.Pair.create(r0, r2)
            java.lang.Object r2 = r3.first
            X.9hu r2 = (X.C188739hu) r2
            r0 = r48
            java.util.Map r1 = r0.A06
            r0 = r20
            r1.put(r0, r2)
            r0 = r46
            X.2Qy r1 = r0.context
            X.2Qy r0 = X.C49562Qy.REGISTRATION
            boolean r1 = X.AnonymousClass000.A1Z(r1, r0)
            java.lang.Object r0 = r3.second
            X.1ca r0 = (X.C29621ca) r0
            r7 = 102(0x66, float:1.43E-43)
            boolean r10 = X.AnonymousClass8BU.A1X(r0)
            r8 = r52
            r3 = r47
            r4 = r48
            r5 = r0
            r6 = r20
            if (r1 == 0) goto L_0x05ed
            X.AnonymousClass1OZ.A06(r3, r4, r5, r6, r7, r8, r10)
        L_0x05ea:
            X.1Ug r0 = r2.A02
            return r0
        L_0x05ed:
            X.AnonymousClass1OZ.A04(r3, r4, r5, r6, r7, r8, r10)
            goto L_0x05ea
        L_0x05f1:
            java.lang.String r31 = "preview"
            goto L_0x05a8
        L_0x05f4:
            java.lang.String r0 = "merchant_status"
            r1 = 0
            X.1ca r7 = X.AnonymousClass8BR.A0k(r0, r1)
            java.lang.String r0 = "consumer_status"
            X.1ca r9 = X.AnonymousClass8BR.A0k(r0, r1)
            java.lang.String r0 = "eligible_offers"
            X.1ca r10 = X.AnonymousClass8BR.A0k(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5 = 1
            if (r6 != r5) goto L_0x0611
            r0.add(r7)
        L_0x0611:
            r7 = r33 & 2
            r6 = 2
            if (r7 == r6) goto L_0x061c
            r8 = 16
            r5 = r33 & 16
            if (r5 != r8) goto L_0x0637
        L_0x061c:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            if (r7 != r6) goto L_0x0625
            r5.add(r9)
        L_0x0625:
            r7 = r33 & 16
            r6 = 16
            if (r7 != r6) goto L_0x062e
            r5.add(r10)
        L_0x062e:
            X.1ca[] r6 = X.C17890vO.A1Y(r5, r2)
            java.lang.String r5 = "upi"
            X.AnonymousClass8BU.A1K(r5, r0, r1, r6)
        L_0x0637:
            r7 = r33 & 8
            r6 = 8
            if (r7 == r6) goto L_0x0643
            r8 = 32
            r5 = r33 & 32
            if (r5 != r8) goto L_0x065e
        L_0x0643:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            if (r7 != r6) goto L_0x064c
            r5.add(r9)
        L_0x064c:
            r7 = 32
            r6 = r33 & 32
            if (r6 != r7) goto L_0x0655
            r5.add(r10)
        L_0x0655:
            X.1ca[] r6 = X.C17890vO.A1Y(r5, r2)
            java.lang.String r5 = "fbpay"
            X.AnonymousClass8BU.A1K(r5, r0, r1, r6)
        L_0x065e:
            int r6 = r3 + 1
            X.1ca[] r5 = X.C17890vO.A1Y(r0, r2)
            r2 = 0
            r0 = r17
            X.1ca r0 = X.AnonymousClass8BR.A0l(r0, r1, r5)
            r4[r3] = r0
            r3 = r6
            goto L_0x04b8
        L_0x0670:
            r2 = 0
            goto L_0x049b
        L_0x0673:
            java.lang.String r2 = "preview"
            goto L_0x0470
        L_0x0677:
            r0 = 0
            X.1ca r2 = X.AnonymousClass8BR.A0k(r1, r0)
            r1 = 0
            r4[r1] = r2
            r3 = 1
            r12 = 1
            goto L_0x042a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20995Acn.A05(X.A01, java.lang.String, long):X.1Ug");
    }

    public boolean A06(AnonymousClass2R1 r3) {
        AnonymousClass1UN r1 = this.A04;
        if (r1.A03()) {
            if (!r1.A09()) {
                return r3.A00();
            }
            if (r3 != AnonymousClass2R1.A0A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void BrD(String str) {
        C188739hu r0 = (C188739hu) this.A06.remove(str);
        if (r0 != null) {
            r0.A02.BrC(new AnonymousClass9L7(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    public void Bt9(C29621ca r10, String str) {
        C188739hu r2 = (C188739hu) this.A06.remove(str);
        if (r2 != null) {
            C29621ca A0K = r10.A0K("error");
            int i = 0;
            long j = -1;
            if (A0K != null) {
                String A0Q = A0K.A0Q("code", (String) null);
                if (A0Q != null) {
                    i = Integer.parseInt(A0Q);
                }
                String A0Q2 = A0K.A0Q("backoff", (String) null);
                if (A0Q2 != null) {
                    j = Math.min(AnonymousClass8BW.A08(A0Q2), 3600000);
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("UniSyncProtocolHelper/handleSyncContactError sid=");
            String str2 = r2.A04;
            A10.append(str2);
            A10.append(" code=");
            A10.append(i);
            C17900vP.A0m(" backoff=", A10, j);
            this.A01.BcQ(r2.A01, str2, i, j);
            r2.A02.BrF((Object) null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.9ed] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object, X.9dG] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0235, code lost:
        r0 = X.AnonymousClass1UI.A01(X.AnonymousClass001.A1H("Invalid contact type=", r5, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0261, code lost:
        r0.A04 = r4;
        r5 = r6.A0M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0267, code lost:
        if (r5 == null) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        r0.A0K.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x06f7, code lost:
        if (r34 != false) goto L_0x06f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01fa A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0210 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02c5 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x059b A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x05f3 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0616 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06db A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0769 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0784 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x080b A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0812 A[Catch:{ 1UI -> 0x086e }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f9 A[Catch:{ 1UI -> 0x086e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r74, java.lang.String r75) {
        /*
            r73 = this;
            r72 = r73
            r0 = r72
            java.util.Map r0 = r0.A06
            r1 = r75
            java.lang.Object r2 = r0.remove(r1)
            X.9hu r2 = (X.C188739hu) r2
            if (r2 == 0) goto L_0x087a
            java.lang.String r0 = "usync"
            r1 = r74
            X.1ca r0 = r1.A0K(r0)     // Catch:{ 1UI -> 0x086e }
            if (r0 == 0) goto L_0x0867
            java.lang.String r1 = "result"
            X.1ca r1 = r0.A0L(r1)     // Catch:{ 1UI -> 0x086e }
            boolean r3 = r2.A08     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = " backoff="
            java.lang.String r5 = " code="
            java.lang.String r31 = "contact"
            if (r3 == 0) goto L_0x0107
            r3 = r31
            X.A00 r25 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
            r3 = r25
            boolean r3 = r3.A04     // Catch:{ 1UI -> 0x086e }
            if (r3 != 0) goto L_0x0077
            boolean r3 = r2.A05     // Catch:{ 1UI -> 0x086e }
            if (r3 != 0) goto L_0x0077
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "UniSyncProtocolHelper/handleSyncContactError sid="
            r8.append(r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r10 = r2.A04     // Catch:{ 1UI -> 0x086e }
            r8.append(r10)     // Catch:{ 1UI -> 0x086e }
            r8.append(r5)     // Catch:{ 1UI -> 0x086e }
            r3 = r25
            java.lang.Integer r7 = r3.A01     // Catch:{ 1UI -> 0x086e }
            r8.append(r7)     // Catch:{ 1UI -> 0x086e }
            r8.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.Long r6 = r3.A02     // Catch:{ 1UI -> 0x086e }
            r8.append(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "integrity="
            r8.append(r3)     // Catch:{ 1UI -> 0x086e }
            r3 = r25
            int r3 = r3.A00     // Catch:{ 1UI -> 0x086e }
            X.C17900vP.A0o(r8, r3)     // Catch:{ 1UI -> 0x086e }
            r3 = r72
            X.1UP r8 = r3.A01     // Catch:{ 1UI -> 0x086e }
            X.2R1 r9 = r2.A01     // Catch:{ 1UI -> 0x086e }
            int r11 = r7.intValue()     // Catch:{ 1UI -> 0x086e }
            long r12 = r6.longValue()     // Catch:{ 1UI -> 0x086e }
            r8.BcQ(r9, r10, r11, r12)     // Catch:{ 1UI -> 0x086e }
        L_0x0077:
            r3 = r31
            X.1ca r6 = r1.A0L(r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "version"
            java.lang.String r71 = X.C29621ca.A02(r6, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x0083:
            boolean r3 = r2.A0G     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0104
            java.lang.String r3 = "sidelist"
            X.A00 r24 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
            r3 = r24
            boolean r3 = r3.A04     // Catch:{ 1UI -> 0x086e }
            if (r3 != 0) goto L_0x00c6
            boolean r3 = r2.A05     // Catch:{ 1UI -> 0x086e }
            if (r3 != 0) goto L_0x00c6
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "UniSyncProtocolHelper/handleSyncSidelistError sid="
            r7.append(r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = r2.A04     // Catch:{ 1UI -> 0x086e }
            r7.append(r6)     // Catch:{ 1UI -> 0x086e }
            r7.append(r5)     // Catch:{ 1UI -> 0x086e }
            r3 = r24
            java.lang.Integer r5 = r3.A01     // Catch:{ 1UI -> 0x086e }
            r7.append(r5)     // Catch:{ 1UI -> 0x086e }
            r7.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.Long r4 = r3.A02     // Catch:{ 1UI -> 0x086e }
            X.C17900vP.A0b(r4, r7)     // Catch:{ 1UI -> 0x086e }
            r3 = r72
            X.1UP r7 = r3.A01     // Catch:{ 1UI -> 0x086e }
            int r5 = r5.intValue()     // Catch:{ 1UI -> 0x086e }
            long r3 = r4.longValue()     // Catch:{ 1UI -> 0x086e }
            r7.BcS(r5, r6, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x00c6:
            boolean r3 = r2.A0D     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0101
            java.lang.String r3 = "status"
            X.A00 r61 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x00d0:
            boolean r3 = r2.A0C     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x00fe
            java.lang.String r3 = "picture"
            X.A00 r62 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x00da:
            boolean r3 = r2.A07     // Catch:{ 1UI -> 0x086e }
            java.lang.String r30 = "business"
            if (r3 == 0) goto L_0x00fb
            r3 = r30
            X.A00 r21 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x00e6:
            boolean r3 = r2.A09     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x00f8
            java.lang.String r3 = "devices"
            X.A00 r63 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x00f0:
            int r5 = r2.A00     // Catch:{ 1UI -> 0x086e }
            r4 = r5 & 1
            r3 = 1
            if (r4 == r3) goto L_0x0127
            goto L_0x010d
        L_0x00f8:
            r63 = 0
            goto L_0x00f0
        L_0x00fb:
            r21 = 0
            goto L_0x00e6
        L_0x00fe:
            r62 = 0
            goto L_0x00da
        L_0x0101:
            r61 = 0
            goto L_0x00d0
        L_0x0104:
            r24 = 0
            goto L_0x00c6
        L_0x0107:
            r71 = 0
            r25 = 0
            goto L_0x0083
        L_0x010d:
            r4 = r5 & 2
            r3 = 2
            if (r4 == r3) goto L_0x0127
            r4 = r5 & 8
            r3 = 8
            if (r4 == r3) goto L_0x0127
            r4 = r5 & 16
            r3 = 16
            if (r4 == r3) goto L_0x0127
            r4 = 32
            r3 = r5 & 32
            if (r3 == r4) goto L_0x0127
            r64 = 0
            goto L_0x012d
        L_0x0127:
            java.lang.String r3 = "pay"
            X.A00 r64 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x012d:
            boolean r3 = r2.A0A     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0185
            java.lang.String r3 = "disappearing_mode"
            X.A00 r65 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x0137:
            boolean r3 = r2.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.String r29 = "lid"
            if (r3 == 0) goto L_0x0182
            r3 = r29
            X.A00 r20 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x0143:
            boolean r3 = r2.A06     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x017f
            java.lang.String r3 = "bot"
            X.A00 r67 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x014d:
            boolean r3 = r2.A0F     // Catch:{ 1UI -> 0x086e }
            java.lang.String r28 = "username"
            if (r3 == 0) goto L_0x017c
            r3 = r28
            X.A00 r19 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x0159:
            boolean r3 = r2.A0E     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0179
            java.lang.String r3 = "text_status"
            X.A00 r69 = A00(r1, r3)     // Catch:{ 1UI -> 0x086e }
        L_0x0163:
            java.lang.String r1 = "list"
            X.1ca r1 = r0.A0L(r1)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "side_list"
            X.1ca r22 = r0.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            X.1ca[] r0 = r1.A02     // Catch:{ 1UI -> 0x086e }
            r23 = r0
            if (r0 == 0) goto L_0x0188
            int r0 = r0.length     // Catch:{ 1UI -> 0x086e }
            r18 = r0
            goto L_0x018a
        L_0x0179:
            r69 = 0
            goto L_0x0163
        L_0x017c:
            r19 = 0
            goto L_0x0159
        L_0x017f:
            r67 = 0
            goto L_0x014d
        L_0x0182:
            r20 = 0
            goto L_0x0143
        L_0x0185:
            r65 = 0
            goto L_0x0137
        L_0x0188:
            r18 = 0
        L_0x018a:
            if (r22 == 0) goto L_0x018d
            goto L_0x0190
        L_0x018d:
            r17 = 0
            goto L_0x0199
        L_0x0190:
            r0 = r22
            X.1ca[] r0 = r0.A02     // Catch:{ 1UI -> 0x086e }
            if (r0 == 0) goto L_0x018d
            int r0 = r0.length     // Catch:{ 1UI -> 0x086e }
            r17 = r0
        L_0x0199:
            int r17 = r17 + r18
            java.util.HashMap r26 = X.C17880vN.A11()     // Catch:{ 1UI -> 0x086e }
            java.util.ArrayList r27 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x086e }
            r15 = 0
        L_0x01a4:
            r0 = r17
            if (r15 >= r0) goto L_0x0825
            r0 = r18
            if (r15 >= r0) goto L_0x01b1
            r1 = r23[r15]     // Catch:{ 1UI -> 0x086e }
            r16 = 0
            goto L_0x01bb
        L_0x01b1:
            r0 = r22
            X.1ca[] r0 = r0.A02     // Catch:{ 1UI -> 0x086e }
            int r1 = r15 - r18
            r1 = r0[r1]     // Catch:{ 1UI -> 0x086e }
            r16 = 1
        L_0x01bb:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r5 = r1.A0F(r0, r4)     // Catch:{ 1UI -> 0x086e }
            if (r5 != 0) goto L_0x01db
            X.9i3 r0 = new X.9i3     // Catch:{ 1UI -> 0x086e }
            r0.<init>()     // Catch:{ 1UI -> 0x086e }
        L_0x01ca:
            r3 = r27
            r3.add(r0)     // Catch:{ 1UI -> 0x086e }
        L_0x01cf:
            r3 = 0
            java.lang.String r4 = r1.A0Q(r4, r3)     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r4)     // Catch:{ 1UI -> 0x086e }
            r0.A0D = r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x01f7
        L_0x01db:
            r0 = r26
            boolean r0 = r0.containsKey(r5)     // Catch:{ 1UI -> 0x086e }
            if (r0 == 0) goto L_0x01ec
            r0 = r26
            java.lang.Object r0 = r0.get(r5)     // Catch:{ 1UI -> 0x086e }
            X.9i3 r0 = (X.C188829i3) r0     // Catch:{ 1UI -> 0x086e }
            goto L_0x01cf
        L_0x01ec:
            X.9i3 r0 = new X.9i3     // Catch:{ 1UI -> 0x086e }
            r0.<init>()     // Catch:{ 1UI -> 0x086e }
            r3 = r26
            r3.put(r5, r0)     // Catch:{ 1UI -> 0x086e }
            goto L_0x01ca
        L_0x01f7:
            if (r16 == 0) goto L_0x01fa
            goto L_0x01fd
        L_0x01fa:
            r4 = r31
            goto L_0x01ff
        L_0x01fd:
            java.lang.String r4 = "sidelist"
        L_0x01ff:
            java.util.List r5 = r1.A0R(r4)     // Catch:{ 1UI -> 0x086e }
            boolean r4 = r5.isEmpty()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r41 = "type"
            r32 = 3
            r33 = 1
            r8 = -1
            if (r4 != 0) goto L_0x026f
            java.util.List r4 = r0.A0K     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x021a
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x086e }
            r0.A0K = r4     // Catch:{ 1UI -> 0x086e }
        L_0x021a:
            java.util.Iterator r7 = r5.iterator()     // Catch:{ 1UI -> 0x086e }
        L_0x021e:
            boolean r4 = r7.hasNext()     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0273
            X.1ca r6 = X.C17880vN.A0a(r7)     // Catch:{ 1UI -> 0x086e }
            r4 = r41
            java.lang.String r5 = r6.A0P(r4)     // Catch:{ 1UI -> 0x086e }
            int r4 = r5.hashCode()     // Catch:{ 1UI -> 0x086e }
            switch(r4) {
                case 3365: goto L_0x0258;
                case 110414: goto L_0x024e;
                case 1959784951: goto L_0x0244;
                default: goto L_0x0235;
            }     // Catch:{ 1UI -> 0x086e }
        L_0x0235:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r0 = "Invalid contact type="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)     // Catch:{ 1UI -> 0x086e }
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ 1UI -> 0x086e }
        L_0x0243:
            throw r0     // Catch:{ 1UI -> 0x086e }
        L_0x0244:
            java.lang.String r4 = "invalid"
            boolean r4 = r5.equals(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0235
            r4 = 3
            goto L_0x0261
        L_0x024e:
            java.lang.String r4 = "out"
            boolean r4 = r5.equals(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0235
            r4 = 2
            goto L_0x0261
        L_0x0258:
            java.lang.String r4 = "in"
            boolean r4 = r5.equals(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0235
            r4 = 1
        L_0x0261:
            r0.A04 = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = r6.A0M()     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x021e
            java.util.List r4 = r0.A0K     // Catch:{ 1UI -> 0x086e }
            r4.add(r5)     // Catch:{ 1UI -> 0x086e }
            goto L_0x021e
        L_0x026f:
            r4 = r33
            r0.A04 = r4     // Catch:{ 1UI -> 0x086e }
        L_0x0273:
            java.lang.String r4 = "devices"
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r40 = "code"
            if (r5 == 0) goto L_0x02bd
            X.1ca r7 = r1.A0L(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = "error"
            X.1ca r4 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0357
            r0.A00 = r8     // Catch:{ 1UI -> 0x086e }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "UniSyncProtocolHelper/parseUser/partial error code="
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            X.1ca r9 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            r4 = r40
            int r4 = r9.A0A(r4, r8)     // Catch:{ 1UI -> 0x086e }
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "; text="
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            X.1ca r6 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "text"
            java.lang.String r4 = r6.A0Q(r4, r3)     // Catch:{ 1UI -> 0x086e }
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "; jid="
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r4 = r0.A0D     // Catch:{ 1UI -> 0x086e }
            X.AnonymousClass8BW.A1N(r4, r5)     // Catch:{ 1UI -> 0x086e }
        L_0x02bd:
            java.lang.String r4 = "bot"
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0591
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "profile"
            X.1ca r4 = r5.A0L(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = "tag"
            r5 = 0
            int r58 = r4.A0A(r6, r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "persona_id"
            java.lang.String r49 = r4.A0Q(r5, r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "pn_jid"
            java.lang.String r50 = r4.A0Q(r5, r3)     // Catch:{ 1UI -> 0x086e }
            X.1ca[] r5 = r4.A02     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0566
            java.lang.String r11 = "name"
            X.1ca r10 = r4.A0K(r11)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "default"
            X.1ca r39 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "attributes"
            X.1ca r38 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r9 = "description"
            X.1ca r14 = r4.A0K(r9)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "category"
            X.1ca r13 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "prompts"
            X.1ca r8 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "avatar"
            r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = "commands"
            X.1ca r5 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0354
            X.1ca r37 = r5.A0K(r9)     // Catch:{ 1UI -> 0x086e }
        L_0x031b:
            java.lang.String r6 = "is_meta_created"
            X.1ca r36 = r4.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = "creator"
            X.1ca r6 = r4.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r7 = "card_title"
            X.1ca r35 = r4.A0K(r7)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r7 = "count"
            X.1ca r34 = r4.A0K(r7)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r7 = "capabilities"
            X.1ca r12 = r4.A0K(r7)     // Catch:{ 1UI -> 0x086e }
            if (r10 == 0) goto L_0x0351
            java.lang.String r45 = r10.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x033f:
            java.lang.String r10 = "true"
            if (r39 == 0) goto L_0x0442
            java.lang.String r4 = r39.A0M()     // Catch:{ 1UI -> 0x086e }
            boolean r4 = r10.equals(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.Boolean r43 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x0444
        L_0x0351:
            r45 = 0
            goto L_0x033f
        L_0x0354:
            r37 = 0
            goto L_0x031b
        L_0x0357:
            r4 = r33
            r0.A00 = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 user="
            r5.append(r4)     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r4 = r0.A0D     // Catch:{ 1UI -> 0x086e }
            X.C17900vP.A0b(r4, r5)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "device-list"
            X.1ca r5 = r7.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            r10 = 0
            if (r5 == 0) goto L_0x03de
            X.1ca r5 = r7.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "device"
            java.util.List r5 = r5.A0R(r4)     // Catch:{ 1UI -> 0x086e }
            boolean r4 = r5.isEmpty()     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x03de
            java.util.Map r4 = r0.A0L     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x038d
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ 1UI -> 0x086e }
            r0.A0L = r4     // Catch:{ 1UI -> 0x086e }
        L_0x038d:
            java.util.Iterator r13 = r5.iterator()     // Catch:{ 1UI -> 0x086e }
        L_0x0391:
            boolean r4 = r13.hasNext()     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x03de
            X.1ca r5 = X.C17880vN.A0a(r13)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "id"
            int r6 = r5.A09(r4)     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r8 = r0.A0D     // Catch:{ 11T -> 0x042a }
            X.C17960vV.A07(r8)     // Catch:{ 11T -> 0x042a }
            X.1E0 r4 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 11T -> 0x042a }
            com.whatsapp.jid.DeviceJid r12 = r4.A03(r8, r6)     // Catch:{ 11T -> 0x042a }
            java.lang.String r4 = "is_hosted"
            java.lang.String r6 = r5.A0Q(r4, r3)     // Catch:{ 1UI -> 0x086e }
            boolean r8 = X.C62832s4.A00(r12)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r6)     // Catch:{ 1UI -> 0x086e }
            if (r8 == r4) goto L_0x03d2
            r4 = r72
            X.190 r9 = r4.A00     // Catch:{ 1UI -> 0x086e }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "sync; isHosted: "
            java.lang.String r8 = X.AnonymousClass001.A1H(r4, r6, r8)     // Catch:{ 1UI -> 0x086e }
            r6 = 0
            java.lang.String r4 = "invalid-hosted-flag"
            r9.A0G(r4, r8, r6)     // Catch:{ 1UI -> 0x086e }
        L_0x03d2:
            java.util.Map r6 = r0.A0L     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "key-index"
            long r4 = r5.A0D(r4, r10)     // Catch:{ 1UI -> 0x086e }
            X.AnonymousClass8BT.A1O(r12, r6, r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x0391
        L_0x03de:
            java.lang.String r6 = "key-index-list"
            X.1ca r4 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x02bd
            X.1ca r5 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "ts"
            long r4 = r5.A0C(r4)     // Catch:{ 1UI -> 0x086e }
            r0.A06 = r4     // Catch:{ 1UI -> 0x086e }
            X.1ca r5 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "expected_ts"
            long r4 = r5.A0D(r4, r10)     // Catch:{ 1UI -> 0x086e }
            r0.A05 = r4     // Catch:{ 1UI -> 0x086e }
            X.1ca r4 = r7.A0K(r6)     // Catch:{ 1UI -> 0x086e }
            byte[] r4 = r4.A01     // Catch:{ 1UI -> 0x086e }
            r0.A0O = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 index list="
            r6.append(r4)     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r4 = r0.A0D     // Catch:{ 1UI -> 0x086e }
            r6.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "; ts="
            r6.append(r4)     // Catch:{ 1UI -> 0x086e }
            long r4 = r0.A06     // Catch:{ 1UI -> 0x086e }
            r6.append(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "; expectedTs="
            r6.append(r4)     // Catch:{ 1UI -> 0x086e }
            long r4 = r0.A05     // Catch:{ 1UI -> 0x086e }
            X.C17890vO.A16(r6, r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x02bd
        L_0x042a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r1 = "Invalid device id jid="
            r3.append(r1)     // Catch:{ 1UI -> 0x086e }
            r3.append(r0)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r0 = "; id="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r3, r6)     // Catch:{ 1UI -> 0x086e }
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)     // Catch:{ 1UI -> 0x086e }
            goto L_0x0243
        L_0x0442:
            r43 = 0
        L_0x0444:
            if (r38 == 0) goto L_0x044b
            java.lang.String r46 = r38.A0M()     // Catch:{ 1UI -> 0x086e }
            goto L_0x044d
        L_0x044b:
            r46 = 0
        L_0x044d:
            if (r14 == 0) goto L_0x0454
            java.lang.String r47 = r14.A0M()     // Catch:{ 1UI -> 0x086e }
            goto L_0x0456
        L_0x0454:
            r47 = 0
        L_0x0456:
            if (r13 == 0) goto L_0x0459
            goto L_0x045c
        L_0x0459:
            r48 = 0
            goto L_0x0460
        L_0x045c:
            java.lang.String r48 = r13.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x0460:
            java.util.ArrayList r14 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x086e }
            if (r8 == 0) goto L_0x049b
            java.lang.String r4 = "prompt"
            java.util.Iterator r13 = X.C29621ca.A03(r8, r4)     // Catch:{ 1UI -> 0x086e }
        L_0x046c:
            boolean r4 = r13.hasNext()     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x049b
            X.1ca r4 = X.C17880vN.A0a(r13)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r7 = "text"
            X.1ca r7 = r4.A0K(r7)     // Catch:{ 1UI -> 0x086e }
            if (r7 == 0) goto L_0x046c
            java.lang.String r8 = r7.A0M()     // Catch:{ 1UI -> 0x086e }
            if (r8 == 0) goto L_0x046c
            java.lang.String r7 = "emoji"
            X.1ca r4 = r4.A0K(r7)     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x048e
            r7 = 0
            goto L_0x0492
        L_0x048e:
            java.lang.String r7 = r4.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x0492:
            X.2le r4 = new X.2le     // Catch:{ 1UI -> 0x086e }
            r4.<init>(r8, r7)     // Catch:{ 1UI -> 0x086e }
            r14.add(r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x046c
        L_0x049b:
            if (r37 == 0) goto L_0x049e
            goto L_0x04a1
        L_0x049e:
            r51 = 0
            goto L_0x04a5
        L_0x04a1:
            java.lang.String r51 = r37.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x04a5:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x04e0
            java.lang.String r4 = "command"
            java.util.Iterator r8 = X.C29621ca.A03(r5, r4)     // Catch:{ 1UI -> 0x086e }
        L_0x04b1:
            boolean r4 = r8.hasNext()     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x04e0
            X.1ca r4 = X.C17880vN.A0a(r8)     // Catch:{ 1UI -> 0x086e }
            X.1ca r5 = r4.A0K(r11)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x04b1
            java.lang.String r7 = r5.A0M()     // Catch:{ 1UI -> 0x086e }
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ 1UI -> 0x086e }
            if (r5 != 0) goto L_0x04b1
            X.1ca r4 = r4.A0K(r9)     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x04d3
            r5 = 0
            goto L_0x04d7
        L_0x04d3:
            java.lang.String r5 = r4.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x04d7:
            X.2ld r4 = new X.2ld     // Catch:{ 1UI -> 0x086e }
            r4.<init>(r7, r5)     // Catch:{ 1UI -> 0x086e }
            r13.add(r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x04b1
        L_0x04e0:
            if (r36 == 0) goto L_0x04ef
            java.lang.String r4 = r36.A0M()     // Catch:{ 1UI -> 0x086e }
            boolean r4 = r10.equals(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.Boolean r44 = java.lang.Boolean.valueOf(r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x04f1
        L_0x04ef:
            r44 = 0
        L_0x04f1:
            r52 = 0
            if (r6 == 0) goto L_0x04ff
            X.1ca r4 = r6.A0K(r11)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x04ff
            java.lang.String r52 = r4.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x04ff:
            java.lang.String r4 = "profile_url"
            r53 = 0
            if (r6 == 0) goto L_0x050f
            X.1ca r4 = r6.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x050f
            java.lang.String r53 = r4.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x050f:
            if (r35 == 0) goto L_0x0516
            java.lang.String r54 = r35.A0M()     // Catch:{ 1UI -> 0x086e }
            goto L_0x0518
        L_0x0516:
            r54 = 0
        L_0x0518:
            if (r34 == 0) goto L_0x0537
            java.lang.String r5 = r34.A0M()     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0537
            boolean r4 = r5.isEmpty()     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x0537
            long r4 = java.lang.Long.parseLong(r5)     // Catch:{ 1UI -> 0x086e }
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0535
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0538
        L_0x0535:
            int r6 = (int) r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x0538
        L_0x0537:
            r6 = 0
        L_0x0538:
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x086e }
            if (r12 == 0) goto L_0x0552
            X.1ca[] r5 = r12.A02     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0552
            int r8 = r5.length     // Catch:{ 1UI -> 0x086e }
            r4 = 0
        L_0x0544:
            if (r4 >= r8) goto L_0x0552
            r7 = r5[r4]     // Catch:{ 1UI -> 0x086e }
            java.lang.String r7 = r7.A0M()     // Catch:{ 1UI -> 0x086e }
            r9.add(r7)     // Catch:{ 1UI -> 0x086e }
            int r4 = r4 + 1
            goto L_0x0544
        L_0x0552:
            r60 = 0
            X.2n8 r4 = new X.2n8     // Catch:{ 1UI -> 0x086e }
            r42 = r4
            r55 = r14
            r56 = r13
            r57 = r9
            r59 = r6
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ 1UI -> 0x086e }
            r0.A0A = r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x0591
        L_0x0566:
            X.0wS r55 = X.C18460wS.A00     // Catch:{ 1UI -> 0x086e }
            java.lang.Boolean r44 = java.lang.Boolean.valueOf(r33)     // Catch:{ 1UI -> 0x086e }
            r59 = 0
            X.2n8 r4 = new X.2n8     // Catch:{ 1UI -> 0x086e }
            r45 = r3
            r46 = r3
            r47 = r3
            r48 = r3
            r50 = r3
            r51 = r3
            r52 = r3
            r53 = r3
            r54 = r3
            r57 = r55
            r42 = r4
            r43 = r3
            r56 = r55
            r60 = r33
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ 1UI -> 0x086e }
            r0.A0A = r4     // Catch:{ 1UI -> 0x086e }
        L_0x0591:
            java.lang.String r4 = "status"
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r14 = "t"
            if (r5 == 0) goto L_0x05e9
            X.1ca r8 = r1.A0L(r4)     // Catch:{ 1UI -> 0x086e }
            r4 = 0
            long r4 = r8.A0D(r14, r4)     // Catch:{ 1UI -> 0x086e }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r6 = r40
            java.lang.String r7 = r8.A0Q(r6, r3)     // Catch:{ 1UI -> 0x086e }
            r6 = r41
            java.lang.String r11 = r8.A0Q(r6, r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r13 = r8.A0M()     // Catch:{ 1UI -> 0x086e }
            r6 = r72
            X.0ve r10 = r6.A02     // Catch:{ 1UI -> 0x086e }
            r9 = 5839(0x16cf, float:8.182E-42)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ 1UI -> 0x086e }
            boolean r34 = X.C18020vd.A05(r6, r10, r9)     // Catch:{ 1UI -> 0x086e }
            if (r11 == 0) goto L_0x06e5
            java.lang.String r12 = "fail"
            boolean r11 = r11.equals(r12)     // Catch:{ 1UI -> 0x086e }
            if (r11 == 0) goto L_0x06e5
            java.lang.String r4 = "401"
            boolean r4 = r4.equals(r7)     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x06e0
            java.lang.String r4 = "403"
            boolean r4 = r4.equals(r7)     // Catch:{ 1UI -> 0x086e }
            if (r4 != 0) goto L_0x06e0
            java.lang.String r4 = "404"
            boolean r5 = r4.equals(r7)     // Catch:{ 1UI -> 0x086e }
            r4 = 0
            if (r5 != 0) goto L_0x06e0
            r0.A03 = r4     // Catch:{ 1UI -> 0x086e }
        L_0x05e9:
            java.lang.String r4 = "picture"
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r13 = "id"
            if (r5 == 0) goto L_0x06db
            X.1ca r5 = r1.A0L(r4)     // Catch:{ 1UI -> 0x086e }
            r4 = -1
            int r4 = r5.A0A(r13, r4)     // Catch:{ 1UI -> 0x086e }
            r0.A02 = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "direct_path"
            java.lang.String r4 = r5.A0Q(r4, r3)     // Catch:{ 1UI -> 0x086e }
            r0.A0E = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "hash"
            java.lang.String r4 = r5.A0Q(r4, r3)     // Catch:{ 1UI -> 0x086e }
            r0.A0F = r4     // Catch:{ 1UI -> 0x086e }
        L_0x060e:
            java.lang.String r4 = "pay"
            X.1ca r11 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r11 == 0) goto L_0x0761
            X.9ef r4 = new X.9ef     // Catch:{ 1UI -> 0x086e }
            r4.<init>()     // Catch:{ 1UI -> 0x086e }
            r0.A0B = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "merchant_status"
            X.1ca r6 = r11.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r12 = "value"
            java.lang.String r7 = "dhash"
            if (r6 == 0) goto L_0x0641
            X.9ef r8 = r0.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "false"
            java.lang.String r5 = r6.A0Q(r12, r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r5)     // Catch:{ 1UI -> 0x086e }
            r8.A01 = r4     // Catch:{ 1UI -> 0x086e }
            X.9ef r4 = r0.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = r6.A0Q(r7, r3)     // Catch:{ 1UI -> 0x086e }
            r4.A00 = r5     // Catch:{ 1UI -> 0x086e }
        L_0x0641:
            java.util.HashMap r6 = X.C17880vN.A11()     // Catch:{ 1UI -> 0x086e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r33)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "upi"
            r6.put(r5, r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r32)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "fbpay"
            r6.put(r5, r4)     // Catch:{ 1UI -> 0x086e }
            java.util.Iterator r33 = X.C17890vO.A0i(r6)     // Catch:{ 1UI -> 0x086e }
        L_0x065b:
            boolean r4 = r33.hasNext()     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0761
            java.util.Map$Entry r32 = X.AnonymousClass000.A16(r33)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = X.AnonymousClass8BR.A10(r32)     // Catch:{ 1UI -> 0x086e }
            X.1ca r6 = r11.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r6 == 0) goto L_0x065b
            java.lang.String r4 = "consumer_status"
            X.1ca r4 = r6.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0693
            X.9ef r9 = r0.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.Object r10 = r32.getKey()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r8 = r4.A0P(r12)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = r4.A0Q(r7, r3)     // Catch:{ 1UI -> 0x086e }
            X.9ay r4 = new X.9ay     // Catch:{ 1UI -> 0x086e }
            r4.<init>()     // Catch:{ 1UI -> 0x086e }
            r4.A01 = r8     // Catch:{ 1UI -> 0x086e }
            r4.A00 = r5     // Catch:{ 1UI -> 0x086e }
            java.util.HashMap r5 = r9.A02     // Catch:{ 1UI -> 0x086e }
            r5.put(r10, r4)     // Catch:{ 1UI -> 0x086e }
        L_0x0693:
            java.lang.String r4 = "eligible_offers"
            X.1ca r4 = r6.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x065b
            java.lang.String r5 = "offer"
            X.1ca r5 = r4.A0K(r5)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x06c0
            X.9ef r9 = r0.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.Object r8 = r32.getKey()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r5 = r5.A0P(r13)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = r4.A0Q(r7, r3)     // Catch:{ 1UI -> 0x086e }
            X.9az r4 = new X.9az     // Catch:{ 1UI -> 0x086e }
            r4.<init>()     // Catch:{ 1UI -> 0x086e }
            r4.A01 = r5     // Catch:{ 1UI -> 0x086e }
            r4.A00 = r6     // Catch:{ 1UI -> 0x086e }
            java.util.HashMap r5 = r9.A03     // Catch:{ 1UI -> 0x086e }
            r5.put(r8, r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x065b
        L_0x06c0:
            X.9ef r9 = r0.A0B     // Catch:{ 1UI -> 0x086e }
            java.lang.Object r8 = r32.getKey()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r6 = ""
            java.lang.String r5 = r4.A0Q(r7, r3)     // Catch:{ 1UI -> 0x086e }
            X.9az r4 = new X.9az     // Catch:{ 1UI -> 0x086e }
            r4.<init>()     // Catch:{ 1UI -> 0x086e }
            r4.A01 = r6     // Catch:{ 1UI -> 0x086e }
            r4.A00 = r5     // Catch:{ 1UI -> 0x086e }
            java.util.HashMap r5 = r9.A03     // Catch:{ 1UI -> 0x086e }
            r5.put(r8, r4)     // Catch:{ 1UI -> 0x086e }
            goto L_0x065b
        L_0x06db:
            r4 = -1
            r0.A02 = r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x060e
        L_0x06e0:
            r4 = 2
            r0.A03 = r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x05e9
        L_0x06e5:
            X.1MD[] r7 = r8.A0S()     // Catch:{ 1UI -> 0x086e }
            if (r7 == 0) goto L_0x06ee
            int r7 = r7.length     // Catch:{ 1UI -> 0x086e }
            if (r7 != 0) goto L_0x06f7
        L_0x06ee:
            boolean r7 = android.text.TextUtils.isEmpty(r13)     // Catch:{ 1UI -> 0x086e }
            if (r7 == 0) goto L_0x06f7
            if (r34 != 0) goto L_0x06f9
            goto L_0x0751
        L_0x06f7:
            if (r34 == 0) goto L_0x0757
        L_0x06f9:
            boolean r7 = X.AnonymousClass1EG.A0H(r13)     // Catch:{ 1UI -> 0x086e }
            if (r7 == 0) goto L_0x0757
            java.lang.String r4 = "text_status"
            X.1ca r5 = r1.A0K(r4)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0751
            boolean r5 = X.C18020vd.A05(r6, r10, r9)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x0751
            X.1ca r6 = r1.A0L(r4)     // Catch:{ 1UI -> 0x086e }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "last_update_time"
            r7 = 0
            long r4 = r6.A0D(r4, r7)     // Catch:{ 1UI -> 0x086e }
            long r11 = r9.toMillis(r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r4 = "ephemeral_duration_sec"
            long r4 = r6.A0D(r4, r7)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r9 = "text"
            java.lang.String r10 = r6.A0Q(r9, r3)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r9 = "emoji"
            X.1ca r6 = r6.A0K(r9)     // Catch:{ 1UI -> 0x086e }
            if (r6 == 0) goto L_0x073e
            java.lang.String r9 = "content"
            java.lang.String r6 = r6.A0Q(r9, r3)     // Catch:{ 1UI -> 0x086e }
            if (r6 == 0) goto L_0x073e
        L_0x073b:
            r0.A0I = r6     // Catch:{ 1UI -> 0x086e }
            goto L_0x0741
        L_0x073e:
            java.lang.String r6 = ""
            goto L_0x073b
        L_0x0741:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x074d
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ 1UI -> 0x086e }
            long r6 = r6.toMillis(r4)     // Catch:{ 1UI -> 0x086e }
            long r4 = r11 + r6
        L_0x074d:
            r0.A08 = r4     // Catch:{ 1UI -> 0x086e }
            r0.A0H = r10     // Catch:{ 1UI -> 0x086e }
        L_0x0751:
            r4 = r32
            r0.A03 = r4     // Catch:{ 1UI -> 0x086e }
            goto L_0x05e9
        L_0x0757:
            r6 = r33
            r0.A03 = r6     // Catch:{ 1UI -> 0x086e }
            r0.A08 = r4     // Catch:{ 1UI -> 0x086e }
            r0.A0H = r13     // Catch:{ 1UI -> 0x086e }
            goto L_0x05e9
        L_0x0761:
            java.lang.String r3 = "disappearing_mode"
            X.1ca r4 = r1.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r4 == 0) goto L_0x0778
            java.lang.String r5 = "duration"
            r3 = -1
            int r3 = r4.A0A(r5, r3)     // Catch:{ 1UI -> 0x086e }
            r0.A01 = r3     // Catch:{ 1UI -> 0x086e }
            long r3 = r4.A0C(r14)     // Catch:{ 1UI -> 0x086e }
            r0.A07 = r3     // Catch:{ 1UI -> 0x086e }
        L_0x0778:
            r3 = r16
            r0.A0N = r3     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = r2.A03     // Catch:{ 1UI -> 0x086e }
            r0.A0G = r3     // Catch:{ 1UI -> 0x086e }
            com.whatsapp.jid.UserJid r3 = r0.A0D     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x07df
            r3 = r30
            X.1ca r4 = r1.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r21 == 0) goto L_0x07df
            r3 = r21
            boolean r3 = r3.A04     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x07df
            if (r4 == 0) goto L_0x07df
            com.whatsapp.jid.UserJid r3 = r0.A0D     // Catch:{ 1UI -> 0x086e }
            X.9ed r7 = new X.9ed     // Catch:{ 1UI -> 0x086e }
            r7.<init>()     // Catch:{ 1UI -> 0x086e }
            r7.A02 = r3     // Catch:{ 1UI -> 0x086e }
            r7.A03 = r4     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "verified_name"
            X.1ca r6 = r4.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r6 == 0) goto L_0x07db
            X.9dG r5 = new X.9dG     // Catch:{ 1UI -> 0x086e }
            r5.<init>()     // Catch:{ 1UI -> 0x086e }
            byte[] r3 = r6.A01     // Catch:{ 1UI -> 0x086e }
            r5.A02 = r3     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "verified_level"
            r4 = 0
            java.lang.String r3 = X.AnonymousClass8BT.A0u(r6, r3, r4)     // Catch:{ 1UI -> 0x086e }
            int r3 = X.C50402Uh.A00(r3)     // Catch:{ 1UI -> 0x086e }
            r5.A00 = r3     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "host_storage"
            java.lang.String r9 = r6.A0Q(r3, r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "actual_actors"
            java.lang.String r8 = r6.A0Q(r3, r4)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r3 = "privacy_mode_ts"
            java.lang.String r4 = r6.A0Q(r3, r4)     // Catch:{ 1UI -> 0x086e }
            X.1ya r3 = new X.1ya     // Catch:{ 1UI -> 0x086e }
            r3.<init>((java.lang.String) r9, (java.lang.String) r8, (java.lang.String) r4)     // Catch:{ 1UI -> 0x086e }
            r5.A01 = r3     // Catch:{ 1UI -> 0x086e }
            r7.A00 = r5     // Catch:{ 1UI -> 0x086e }
        L_0x07d8:
            r0.A09 = r7     // Catch:{ 1UI -> 0x086e }
            goto L_0x07df
        L_0x07db:
            r3 = 0
            r7.A00 = r3     // Catch:{ 1UI -> 0x086e }
            goto L_0x07d8
        L_0x07df:
            if (r20 == 0) goto L_0x07fb
            r3 = r20
            boolean r3 = r3.A04     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x07fb
            r3 = r29
            X.1ca r5 = r1.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r5 == 0) goto L_0x07fb
            java.lang.Class<X.1E2> r4 = X.AnonymousClass1E2.class
            java.lang.String r3 = "val"
            com.whatsapp.jid.Jid r3 = r5.A0F(r4, r3)     // Catch:{ 1UI -> 0x086e }
            X.1E2 r3 = (X.AnonymousClass1E2) r3     // Catch:{ 1UI -> 0x086e }
            r0.A0C = r3     // Catch:{ 1UI -> 0x086e }
        L_0x07fb:
            if (r19 == 0) goto L_0x0821
            r3 = r19
            boolean r3 = r3.A04     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0821
            r3 = r28
            X.1ca r3 = r1.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0812
            java.lang.String r1 = r3.A0M()     // Catch:{ 1UI -> 0x086e }
        L_0x080f:
            r0.A0J = r1     // Catch:{ 1UI -> 0x086e }
            goto L_0x0821
        L_0x0812:
            r3 = r31
            X.1ca r3 = r1.A0K(r3)     // Catch:{ 1UI -> 0x086e }
            if (r3 == 0) goto L_0x0821
            r1 = r28
            java.lang.String r1 = X.C29621ca.A02(r3, r1)     // Catch:{ 1UI -> 0x086e }
            goto L_0x080f
        L_0x0821:
            int r15 = r15 + 1
            goto L_0x01a4
        L_0x0825:
            r0 = 0
            X.9i3[] r0 = new X.C188829i3[r0]     // Catch:{ 1UI -> 0x086e }
            r1 = r27
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ 1UI -> 0x086e }
            X.9i3[] r1 = (X.C188829i3[]) r1     // Catch:{ 1UI -> 0x086e }
            r70 = 0
            X.2n4 r0 = new X.2n4     // Catch:{ 1UI -> 0x086e }
            r57 = r0
            r58 = r25
            r59 = r24
            r60 = r21
            r66 = r20
            r68 = r19
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)     // Catch:{ 1UI -> 0x086e }
            X.2cQ r4 = new X.2cQ     // Catch:{ 1UI -> 0x086e }
            r4.<init>(r0, r1)     // Catch:{ 1UI -> 0x086e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x086e }
            java.lang.String r0 = "UniSyncProtocolHelper/handleSyncResult sid="
            r3.append(r0)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r1 = r2.A04     // Catch:{ 1UI -> 0x086e }
            r3.append(r1)     // Catch:{ 1UI -> 0x086e }
            java.lang.String r0 = " querySync="
            r3.append(r0)     // Catch:{ 1UI -> 0x086e }
            boolean r0 = r2.A05     // Catch:{ 1UI -> 0x086e }
            X.C17900vP.A0r(r3, r0)     // Catch:{ 1UI -> 0x086e }
            r0 = r72
            X.1UP r0 = r0.A01     // Catch:{ 1UI -> 0x086e }
            r0.BcR(r4, r1)     // Catch:{ 1UI -> 0x086e }
        L_0x0867:
            X.1Ug r1 = r2.A02
            r0 = 0
            r1.BrF(r0)
            return
        L_0x086e:
            r1 = move-exception
            java.lang.String r0 = "UniSyncProtocolHelper/onSuccess but corrupt stream"
            com.whatsapp.util.Log.e(r0, r1)
            X.1Ug r0 = r2.A02
            r0.BrC(r1)
            throw r1
        L_0x087a:
            java.lang.String r0 = "UniSyncProtocolHelper/onSuccess missing request"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20995Acn.C7Z(X.1ca, java.lang.String):void");
    }

    public C20995Acn(AnonymousClass190 r2, AnonymousClass1UP r3, C24751Ln r4, AnonymousClass1UN r5, C18030ve r6, AnonymousClass1OZ r7) {
        this.A02 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A03 = r4;
        this.A01 = r3;
        this.A04 = r5;
    }

    public static A00 A00(C29621ca r0, String str) {
        return A01(r0.A0L(str), str);
    }

    public static C29621ca A02(C201110w r3, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1MD[] r2 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r2 = new AnonymousClass1MD[1];
            AnonymousClass8BV.A1M("dhash", str, r2);
        }
        return AnonymousClass8BR.A0k("consumer_status", r2);
    }

    public static C29621ca A03(C201110w r3, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1MD[] r2 = null;
        if (!r3.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r3.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r2 = new AnonymousClass1MD[1];
            AnonymousClass8BV.A1M("dhash", str, r2);
        }
        return AnonymousClass8BR.A0k("eligible_offers", r2);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
