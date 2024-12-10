package X;

import java.util.Map;

/* renamed from: X.2PF  reason: invalid class name */
public class AnonymousClass2PF extends C200910u {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PF(C199410f r2, C26811To r3) {
        super("SyncManager/onDeviceRemoved");
        this.A01 = r3;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c6, code lost:
        r1 = X.C18020vd.A00(r4, r5, 1318);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02cc, code lost:
        if (r1 <= 0) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ce, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02d4, code lost:
        if (r11.size() >= r1) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d6, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d8, code lost:
        r30 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02de, code lost:
        r1 = X.C18020vd.A00(r4, r5, 1119);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02e4, code lost:
        if (r1 <= 0) goto L_0x02d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r29 = r11.entrySet().iterator();
        r28 = 0;
        r27 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f7, code lost:
        if (r29.hasNext() == false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f9, code lost:
        r0 = (java.util.Map.Entry) r29.next();
        r3 = (X.AnonymousClass1BI) r0.getKey();
        r8 = (X.AnonymousClass206) r0.getValue();
        r1 = r6.A0F;
        r2 = new X.AnonymousClass97S(r1.A00);
        r9 = r1.A02;
        r2.A04 = r9.A08(r3);
        r2.A06 = r3;
        r11 = r1.A05;
        r11.A0a(r3).A00();
        r2.A00 = r9.A03(r3);
        r2.A0D = r9.A0Q(r3);
        r13 = r1.A03.A01(r3);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0342, code lost:
        if (android.text.TextUtils.isEmpty(r13.A0K()) != false) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0344, code lost:
        r0 = r13.A0K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0348, code lost:
        r2.A0A = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x034e, code lost:
        if (r13.A0F() == false) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0350, code lost:
        r2.A0E = !r1.A04.A0J((com.whatsapp.jid.GroupJid) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x035d, code lost:
        r0 = com.whatsapp.jid.UserJid.Companion;
        r0 = X.C22941Dw.A01(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0363, code lost:
        if (r0 == null) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0365, code lost:
        r10 = r1.A01.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x036b, code lost:
        if (r10 == null) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0373, code lost:
        if (r3.equals(r10.A00) == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0375, code lost:
        r2.A08 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0379, code lost:
        r10 = r11.A0a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x037f, code lost:
        if (r10.A0S == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0381, code lost:
        r10 = r10.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0383, code lost:
        r2.A03 = r10;
        r10 = r1.A06;
        X.C18070vi.A0d(r3, 0);
        X.C24901Mc.A00(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x038e, code lost:
        if (r0 == null) goto L_0x0391;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0391, code lost:
        r2.A01 = r13.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0396, code lost:
        r1 = r9.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x039a, code lost:
        if (r1 == null) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x039c, code lost:
        r2.A01 = r1.expiration;
        r2.A02 = r1.ephemeralSettingTimestamp / 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03a7, code lost:
        r9.A02(r3);
        r14 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03af, code lost:
        if (r34 <= 0) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03b1, code lost:
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b7, code lost:
        if (r28 >= r33) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b9, code lost:
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03c3, code lost:
        if ((r40 - 86400000) < r2.A04) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03cb, code lost:
        if (r2.A03 <= 0) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03cd, code lost:
        if (r8 == null) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03cf, code lost:
        if (r25 != false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03d9, code lost:
        if (r27 >= X.C18020vd.A00(r4, r5, 1375)) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03db, code lost:
        r10 = X.C18020vd.A00(r4, r5, 1376) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03e4, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03e5, code lost:
        if (r25 != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e7, code lost:
        if (r31 != false) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03e9, code lost:
        r10 = java.lang.Math.max(java.lang.Math.min(r2.A00, 50), 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03f7, code lost:
        r11 = r6.A0B;
        r1 = r8.A0v;
        r19 = r10 + 1;
        r37 = r11.A02;
        r23 = X.AnonymousClass25A.A02(((X.AnonymousClass1W6) r37.get()).A01.A05(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0413, code lost:
        if (r23 != 1) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0415, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("msgstore/get/previous no id for ");
        r9.append(r1);
        com.whatsapp.util.Log.i(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x042d, code lost:
        if (r1 == null) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x042f, code lost:
        r15 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0438, code lost:
        if (X.C22971Dz.A0N(r15) != false) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x043a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x043f, code lost:
        if (X.C22971Dz.A0e(r15) == false) goto L_0x0442;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0441, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0442, code lost:
        r21 = r11.A01.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(X.AnonymousClass203.A0J);
        X.C26121Qx.A02(r1, X.C26121Qx.A01(r0, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0459, code lost:
        if (r42 == false) goto L_0x0496;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x045b, code lost:
        r0 = new java.util.ArrayList();
        r0.add(42);
        r0.add(43);
        r0.add(78);
        r0.add(82);
        X.C26121Qx.A02(r1, r0);
        r1.append(" AND ( ");
        r1.append("expire_timestamp IS NULL");
        r1.append(") ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0496, code lost:
        r1.append(" AND (view_mode IS NOT 1 AND view_mode IS NOT 3) ");
        r1.append(" ");
        r1.append(" AND _id < ? ");
        r1.append(" ORDER BY _id DESC");
        r1.append(" LIMIT ");
        r1.append(r19);
        r12 = r1.toString();
        X.C18070vi.A0X(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04bb, code lost:
        if (r15 == null) goto L_0x05a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04bd, code lost:
        r11 = ((X.C28801av) r21).A02.A0A(r12, "GET_PREVIOUS_MESSAGES_AT_FOR_TYPE", new java.lang.String[]{java.lang.String.valueOf(r11.A00.A09(r15)), java.lang.String.valueOf(r23)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04e7, code lost:
        if (r11.moveToNext() == false) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04e9, code lost:
        r0 = ((X.AnonymousClass1W6) r37.get()).A02(r11, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04f3, code lost:
        if (r0 == null) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        if ((r0 instanceof X.AnonymousClass215) == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04fb, code lost:
        if ((r0 instanceof X.AnonymousClass21V) == false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04fd, code lost:
        ((X.AnonymousClass21V) r0).A07 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0504, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0508, code lost:
        r0 = new X.C27352DcO(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0517, code lost:
        if (r0.size() <= r10) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0519, code lost:
        r0.get(0);
        r1 = java.lang.Long.valueOf(((X.AnonymousClass206) r0.get(0)).A0I);
        r0.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cf, code lost:
        if (r0 == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x052b, code lost:
        r9 = !r0.isEmpty();
        r14.addAll(X.AnonymousClass1TQ.A00(r0, r38, r40, r42));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x053b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x053e, code lost:
        if (r9 != false) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0541, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0544, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0546, code lost:
        if (r25 != false) goto L_0x054b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0548, code lost:
        if (r8 == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x054b, code lost:
        if (r8 == null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x054d, code lost:
        r1 = java.lang.Long.valueOf(r8.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0554, code lost:
        r14.addAll(X.AnonymousClass1TQ.A00(java.util.Collections.singletonList(r8), r38, r40, r42));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x055f, code lost:
        r28 = r28 + r14.size();
        java.util.Collections.reverse(r14);
        r14.addAll(r6.A08.A01(r14, X.C18020vd.A00(r4, r5, 6049)));
        r30.add(new X.C186669eZ(r2, (java.lang.Long) r36.get(r3), r1, r14));
        r27 = r27 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x058d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0597, code lost:
        if (r3.equals(r10.A01) == false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0599, code lost:
        r2.A07 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05a1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:?, code lost:
        r0 = new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05a9, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05af, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:?, code lost:
        X.CDX.A00(r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05b6, code lost:
        r1 = new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05bb, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05bc, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("HistorySyncManager/createInitialBootstrapData end, msgCount=");
        r1.append(r28);
        r1.append("; chatCount=");
        r1.append(r30.size());
        r1.append("; optimizationEnabled=");
        r1.append(r35);
        com.whatsapp.util.Log.i(r1.toString());
        r30 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05e9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05ea, code lost:
        com.whatsapp.util.Log.e("HistorySyncManager/createInitialBootstrapData: aborting data creation", r1);
        r30 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0728, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x072c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x072f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0730, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0733, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01dc, code lost:
        r5 = r6.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0e3b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0e3c, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0e3f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0200, code lost:
        if (r34 > 0) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0202, code lost:
        r33 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0204, code lost:
        r10 = X.C18020vd.A00(r4, r5, 1420);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020a, code lost:
        if (r10 > 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x020c, code lost:
        r10 = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x020f, code lost:
        r42 = X.C62832s4.A00(r43);
        r8 = r44.A07;
        r2 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0219, code lost:
        if (r8 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x021b, code lost:
        r0 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x021d, code lost:
        if (r0 == null) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x021f, code lost:
        r2 = java.lang.Math.min(180, (long) r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0228, code lost:
        r40 = r6.A02(r43, r44.A06);
        r38 = r40 - (r2 * 86400000);
        r13 = r9.iterator();
        r9 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x023f, code lost:
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0245, code lost:
        if (r13.hasNext() == false) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0247, code lost:
        r2 = (X.AnonymousClass1BI) r13.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x024d, code lost:
        if (r9 >= r10) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0251, code lost:
        if ((r2 instanceof X.AnonymousClass1EB) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0258, code lost:
        if (X.C62832s4.A00(r43) == false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x025e, code lost:
        if (X.C62832s4.A01(r2) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0260, code lost:
        r0 = r6.A07.A06(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0266, code lost:
        if (r0 == null) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x026c, code lost:
        if (r0.A0I >= r38) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x026f, code lost:
        if (r8 == null) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0273, code lost:
        if (r8.A07 == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0277, code lost:
        if (r8.A0A == false) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0279, code lost:
        r1 = r6.A07.A06(r2, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0282, code lost:
        if (r3 < r33) goto L_0x028c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0284, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x028a, code lost:
        if (X.C22971Dz.A0N(r2) == false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028c, code lost:
        r3 = r3 + 1;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x028f, code lost:
        r11.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0292, code lost:
        if (r1 == null) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0294, code lost:
        r32 = java.lang.Long.valueOf(r1.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029a, code lost:
        r36.put(r2, r32);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a8, code lost:
        if (X.C42701yb.A01(r2) != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02aa, code lost:
        if (r8 == null) goto L_0x02ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b1, code lost:
        if (X.C22971Dz.A0M(r2) == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c0, code lost:
        if (r34 > 0) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c4, code lost:
        if (r35 == false) goto L_0x02de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:605:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r47 = this;
            r6 = r47
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0108;
                case 2: goto L_0x0737;
                case 3: goto L_0x0749;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A01
            X.1xI r0 = (X.C41911xI) r0
            X.1To r1 = r0.A01
            boolean r0 = r1.A0T()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r6.A02
            X.2Cl r0 = (X.C45992Cl) r0
            X.8q9 r0 = r0.A0K()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A0N(r0)
            r1.A0I()
        L_0x0025:
            return
        L_0x0026:
            java.lang.Object r5 = r6.A01
            X.1To r5 = (X.C26811To) r5
            X.1TQ r4 = r5.A0C
            java.lang.Object r0 = r6.A02
            X.10e r0 = (X.C199310e) r0
            X.1IZ r3 = r0.iterator()
        L_0x0034:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0059
            com.whatsapp.jid.DeviceJid r2 = X.C17880vN.A0R(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "HistorySyncManager/stopMessageHistorySync for "
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            X.C17890vO.A1A(r1, r0)
            X.1TH r1 = r4.A0C
            r0 = 2
            r1.A04(r2, r0)
            r0 = 3
            r1.A04(r2, r0)
            goto L_0x0034
        L_0x0059:
            X.18O r1 = r5.A08
            X.18Q r0 = X.AnonymousClass18O.A0y
            int r1 = r1.A04(r0)
            X.1RK r0 = r5.A0Q
            java.util.ArrayList r11 = r0.A07()
            boolean r0 = X.C17880vN.A1X(r11)
            if (r1 != 0) goto L_0x00cf
            if (r0 != 0) goto L_0x00a2
            r0 = 3
            r5.A0K(r0)
        L_0x0073:
            X.1Rw r4 = r5.A0G
            X.11P r0 = r4.A04
            long r2 = X.AnonymousClass11P.A01(r0)
            X.1Pw r10 = r4.A03
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r10)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_companion_dereg_logging_time"
            X.C17880vN.A1D(r1, r0, r2)
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r10)
            java.lang.String r1 = "syncd_first_companion_reg_logging_time"
            r8 = 0
            long r6 = r0.getLong(r1, r8)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "syncStatsManager/onLastCompanionDeregistration, first registerTs is 0L"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00a2:
            X.1S0 r1 = r5.A0L
            java.lang.String r0 = "SyncdKeyManager/unblockAllCollections"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rz r0 = r1.A0A
            X.1Oq r0 = r0.A00
            X.1au r4 = r0.A06()
            goto L_0x00d2
        L_0x00b2:
            android.content.SharedPreferences r0 = X.C25851Pw.A00(r10)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1B(r0, r1)
            X.2Eo r1 = new X.2Eo
            r1.<init>()
            long r2 = r2 - r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.18K r0 = r4.A08
            r0.CC7(r1)
            goto L_0x00a2
        L_0x00cf:
            if (r0 != 0) goto L_0x00a2
            goto L_0x0073
        L_0x00d2:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0e39 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0e39 }
            java.lang.String r2 = "missing_keys"
            java.lang.String r1 = "SyncdMissingKeysTable.deleteAllRows"
            r0 = 0
            r3.A04(r2, r0, r1, r0)     // Catch:{ all -> 0x0e39 }
            r4.close()
            r5.A0I()
            X.0zA r3 = r5.A05
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r2 = r11.iterator()
        L_0x00f1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e1e
            java.lang.Object r0 = r2.next()
            X.4Zh r0 = (X.C88344Zh) r0
            X.2RG r1 = r0.A09
            X.2RG r0 = X.AnonymousClass2RG.AR_WRIST
            if (r1 == r0) goto L_0x0025
            X.2RG r0 = X.AnonymousClass2RG.SMARTGLASSES
            if (r1 != r0) goto L_0x00f1
            return
        L_0x0108:
            java.lang.Object r0 = r6.A01
            r18 = r0
            r0 = r18
            X.1To r0 = (X.C26811To) r0
            r18 = r0
            X.1TZ r7 = r0.A0H
            java.lang.Object r3 = r6.A02
            X.2m6 r3 = (X.C59312m6) r3
            X.1Rw r0 = r7.A03
            r45 = r0
            X.6ii r0 = r3.A00
            java.lang.String r2 = r0.A03
            X.2kO r1 = r3.A01
            r0 = r45
            X.2SB r26 = r0.A07(r1, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "SyncdBootstrapManager/prepareCriticalDataUpload bootstrapId: "
            r0 = r26
            X.C17900vP.A0Y(r0, r1, r2)
            X.1TW r4 = r7.A02
            X.4Zh r0 = r3.A02
            r44 = r0
            com.whatsapp.jid.DeviceJid r0 = r0.A08
            r43 = r0
            X.10I r3 = r4.A06
            r2 = 4
            X.3Bv r1 = new X.3Bv
            r1.<init>(r4, r0, r2)
            r3.CGN(r1)
            X.1TQ r6 = r7.A01
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.LinkedHashMap r36 = new java.util.LinkedHashMap
            r36.<init>()
            X.1Nd r2 = r6.A05
            X.1Nb r1 = r6.A0H
            X.1CJ r0 = r2.A02
            X.AnonymousClass1CJ.A01(r0)
            X.1Ne r2 = r2.A01
            java.util.ArrayList r0 = r2.A01
            int r0 = r0.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.Set r0 = r1.A0f()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0734 }
        L_0x017d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0734 }
            if (r0 == 0) goto L_0x018f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0734 }
            X.1ng r0 = (X.C36311ng) r0     // Catch:{ all -> 0x0734 }
            X.1BI r0 = r0.A01     // Catch:{ all -> 0x0734 }
            r4.add(r0)     // Catch:{ all -> 0x0734 }
            goto L_0x017d
        L_0x018f:
            monitor-exit(r2)     // Catch:{ all -> 0x0734 }
            java.util.Iterator r2 = r4.iterator()
        L_0x0194:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r1 = r2.next()
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0194
            r9.add(r1)
            goto L_0x0194
        L_0x01a8:
            r3.retainAll(r4)
            r0 = 0
            r9.addAll(r0, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "HistorySyncManager/createInitialBootstrapData start: conversation list size is "
            r1.append(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Pw r0 = r6.A04
            android.content.SharedPreferences r3 = X.C25851Pw.A00(r0)
            java.lang.String r2 = "syncd_bootstrap_fail_time"
            r0 = 0
            long r14 = r3.getLong(r2, r0)
            r35 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x02b4
            X.0ve r5 = r6.A0E
            r0 = 1324(0x52c, float:1.855E-42)
            X.0vf r4 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r4, r5, r0)
            if (r1 <= 0) goto L_0x02b4
            X.11P r0 = r6.A06
            long r12 = X.AnonymousClass11P.A01(r0)
            long r12 = r12 - r14
            long r0 = (long) r1
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x02b4
            r35 = 1
            r0 = 1317(0x525, float:1.846E-42)
            int r34 = X.C18020vd.A00(r4, r5, r0)
            if (r34 <= 0) goto L_0x02b4
        L_0x0202:
            r33 = r34
        L_0x0204:
            r0 = 1420(0x58c, float:1.99E-42)
            int r10 = X.C18020vd.A00(r4, r5, r0)
            if (r10 > 0) goto L_0x020f
            r10 = 2147483647(0x7fffffff, float:NaN)
        L_0x020f:
            boolean r42 = X.C62832s4.A00(r43)
            r0 = r44
            X.2qr r8 = r0.A07
            r2 = 180(0xb4, double:8.9E-322)
            if (r8 == 0) goto L_0x0228
            java.lang.Integer r0 = r8.A00
            if (r0 == 0) goto L_0x0228
            int r0 = r0.intValue()
            long r0 = (long) r0
            long r2 = java.lang.Math.min(r2, r0)
        L_0x0228:
            r0 = r44
            long r0 = r0.A06
            r12 = r43
            long r40 = r6.A02(r12, r0)
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r16
            long r38 = r40 - r2
            java.util.Iterator r13 = r9.iterator()
            r9 = 0
            r3 = 0
        L_0x023f:
            boolean r0 = r13.hasNext()
            r32 = 0
            if (r0 == 0) goto L_0x02c4
            java.lang.Object r2 = r13.next()
            X.1BI r2 = (X.AnonymousClass1BI) r2
            if (r9 >= r10) goto L_0x02c4
            boolean r0 = r2 instanceof X.AnonymousClass1EB
            if (r0 != 0) goto L_0x023f
            boolean r0 = X.C62832s4.A00(r43)
            r1 = 0
            if (r0 == 0) goto L_0x026f
            boolean r0 = X.C62832s4.A01(r2)
            if (r0 != 0) goto L_0x023f
            X.1R3 r0 = r6.A07
            X.206 r0 = r0.A06(r2, r1)
            if (r0 == 0) goto L_0x026f
            long r0 = r0.A0I
            int r12 = (r0 > r38 ? 1 : (r0 == r38 ? 0 : -1))
            if (r12 >= 0) goto L_0x026f
            goto L_0x023f
        L_0x026f:
            if (r8 == 0) goto L_0x02a4
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x02a4
        L_0x0275:
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x02ad
        L_0x0279:
            X.1R3 r1 = r6.A07
            r0 = 0
            X.206 r1 = r1.A06(r2, r0)
            r0 = r33
            if (r3 < r0) goto L_0x028c
            boolean r12 = X.C22971Dz.A0N(r2)
            r0 = r32
            if (r12 == 0) goto L_0x028f
        L_0x028c:
            int r3 = r3 + 1
            r0 = r1
        L_0x028f:
            r11.put(r2, r0)
            if (r1 == 0) goto L_0x029a
            long r0 = r1.A0I
            java.lang.Long r32 = java.lang.Long.valueOf(r0)
        L_0x029a:
            r1 = r36
            r0 = r32
            r1.put(r2, r0)
            int r9 = r9 + 1
            goto L_0x023f
        L_0x02a4:
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 != 0) goto L_0x023f
            if (r8 == 0) goto L_0x02ad
            goto L_0x0275
        L_0x02ad:
            boolean r0 = X.C22971Dz.A0M(r2)
            if (r0 == 0) goto L_0x0279
            goto L_0x023f
        L_0x02b4:
            X.0ve r5 = r6.A0E
            r0 = 1170(0x492, float:1.64E-42)
            X.0vf r4 = X.C18040vf.A02
            int r34 = X.C18020vd.A00(r4, r5, r0)
            r33 = 1000(0x3e8, float:1.401E-42)
            if (r34 <= 0) goto L_0x0204
            goto L_0x0202
        L_0x02c4:
            if (r35 == 0) goto L_0x02de
            r0 = 1318(0x526, float:1.847E-42)
            int r1 = X.C18020vd.A00(r4, r5, r0)
            if (r1 <= 0) goto L_0x02de
        L_0x02ce:
            int r0 = r11.size()
            r31 = 1
            if (r0 >= r1) goto L_0x02d8
        L_0x02d6:
            r31 = 0
        L_0x02d8:
            java.util.ArrayList r30 = new java.util.ArrayList
            r30.<init>()
            goto L_0x02e7
        L_0x02de:
            r0 = 1119(0x45f, float:1.568E-42)
            int r1 = X.C18020vd.A00(r4, r5, r0)
            if (r1 <= 0) goto L_0x02d6
            goto L_0x02ce
        L_0x02e7:
            java.util.Set r0 = r11.entrySet()     // Catch:{ Exception -> 0x05e9 }
            java.util.Iterator r29 = r0.iterator()     // Catch:{ Exception -> 0x05e9 }
            r28 = 0
            r27 = 0
        L_0x02f3:
            boolean r0 = r29.hasNext()     // Catch:{ Exception -> 0x05e9 }
            if (r0 == 0) goto L_0x05bc
            java.lang.Object r0 = r29.next()     // Catch:{ Exception -> 0x05e9 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ Exception -> 0x05e9 }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object r8 = r0.getValue()     // Catch:{ Exception -> 0x05e9 }
            X.206 r8 = (X.AnonymousClass206) r8     // Catch:{ Exception -> 0x05e9 }
            X.1SH r1 = r6.A0F     // Catch:{ Exception -> 0x05e9 }
            X.190 r0 = r1.A00     // Catch:{ Exception -> 0x05e9 }
            X.97S r2 = new X.97S     // Catch:{ Exception -> 0x05e9 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x05e9 }
            X.1CJ r9 = r1.A02     // Catch:{ Exception -> 0x05e9 }
            long r10 = r9.A08(r3)     // Catch:{ Exception -> 0x05e9 }
            r2.A04 = r10     // Catch:{ Exception -> 0x05e9 }
            r2.A06 = r3     // Catch:{ Exception -> 0x05e9 }
            X.1Nb r11 = r1.A05     // Catch:{ Exception -> 0x05e9 }
            X.1yM r0 = r11.A0a(r3)     // Catch:{ Exception -> 0x05e9 }
            r0.A00()     // Catch:{ Exception -> 0x05e9 }
            int r0 = r9.A03(r3)     // Catch:{ Exception -> 0x05e9 }
            r2.A00 = r0     // Catch:{ Exception -> 0x05e9 }
            boolean r0 = r9.A0Q(r3)     // Catch:{ Exception -> 0x05e9 }
            r2.A0D = r0     // Catch:{ Exception -> 0x05e9 }
            X.1Nf r0 = r1.A03     // Catch:{ Exception -> 0x05e9 }
            X.1E7 r13 = r0.A01(r3)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r0 = r13.A0K()     // Catch:{ Exception -> 0x05e9 }
            boolean r10 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = 0
            if (r10 != 0) goto L_0x0348
            java.lang.String r0 = r13.A0K()     // Catch:{ Exception -> 0x05e9 }
        L_0x0348:
            r2.A0A = r0     // Catch:{ Exception -> 0x05e9 }
            boolean r0 = r13.A0F()     // Catch:{ Exception -> 0x05e9 }
            if (r0 == 0) goto L_0x035d
            X.1MZ r10 = r1.A04     // Catch:{ Exception -> 0x05e9 }
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ Exception -> 0x05e9 }
            boolean r0 = r10.A0J(r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = r0 ^ 1
            r2.A0E = r0     // Catch:{ Exception -> 0x05e9 }
        L_0x035d:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x05e9 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r3)     // Catch:{ Exception -> 0x05e9 }
            if (r0 == 0) goto L_0x0379
            X.1SG r10 = r1.A01     // Catch:{ Exception -> 0x05e9 }
            X.2MN r10 = r10.A00(r0)     // Catch:{ Exception -> 0x05e9 }
            if (r10 == 0) goto L_0x0379
            com.whatsapp.jid.UserJid r12 = r10.A00     // Catch:{ Exception -> 0x05e9 }
            boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x05e9 }
            if (r12 == 0) goto L_0x0591
            com.whatsapp.jid.UserJid r10 = r10.A01     // Catch:{ Exception -> 0x05e9 }
            r2.A08 = r10     // Catch:{ Exception -> 0x05e9 }
        L_0x0379:
            X.1yM r10 = r11.A0a(r3)     // Catch:{ Exception -> 0x05e9 }
            boolean r11 = r10.A0S     // Catch:{ Exception -> 0x05e9 }
            if (r11 == 0) goto L_0x058d
            long r10 = r10.A07     // Catch:{ Exception -> 0x05e9 }
        L_0x0383:
            r2.A03 = r10     // Catch:{ Exception -> 0x05e9 }
            X.1Mc r10 = r1.A06     // Catch:{ Exception -> 0x05e9 }
            r1 = 0
            X.C18070vi.A0d(r3, r1)     // Catch:{ Exception -> 0x05e9 }
            X.C24901Mc.A00(r3, r10)     // Catch:{ Exception -> 0x05e9 }
            if (r0 == 0) goto L_0x0391
            goto L_0x0396
        L_0x0391:
            int r0 = r13.A04     // Catch:{ Exception -> 0x05e9 }
            r2.A01 = r0     // Catch:{ Exception -> 0x05e9 }
            goto L_0x03a7
        L_0x0396:
            X.1cl r1 = r9.A0D(r0)     // Catch:{ Exception -> 0x05e9 }
            if (r1 == 0) goto L_0x03a7
            int r0 = r1.expiration     // Catch:{ Exception -> 0x05e9 }
            r2.A01 = r0     // Catch:{ Exception -> 0x05e9 }
            long r0 = r1.ephemeralSettingTimestamp     // Catch:{ Exception -> 0x05e9 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r10
            r2.A02 = r0     // Catch:{ Exception -> 0x05e9 }
        L_0x03a7:
            r9.A02(r3)     // Catch:{ Exception -> 0x05e9 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x05e9 }
            r14.<init>()     // Catch:{ Exception -> 0x05e9 }
            if (r34 <= 0) goto L_0x03b9
            r25 = 1
            r1 = r28
            r0 = r33
            if (r1 >= r0) goto L_0x03bb
        L_0x03b9:
            r25 = 0
        L_0x03bb:
            long r10 = r40 - r16
            long r0 = r2.A04     // Catch:{ Exception -> 0x05e9 }
            r12 = 1
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x03cd
            long r0 = r2.A03     // Catch:{ Exception -> 0x05e9 }
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0541
        L_0x03cd:
            if (r8 == 0) goto L_0x0541
            if (r25 != 0) goto L_0x03e4
            r0 = 1375(0x55f, float:1.927E-42)
            int r1 = X.C18020vd.A00(r4, r5, r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = r27
            if (r0 >= r1) goto L_0x03e4
            r0 = 1376(0x560, float:1.928E-42)
            int r10 = X.C18020vd.A00(r4, r5, r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = 1
            int r10 = r10 - r0
            goto L_0x03e7
        L_0x03e4:
            r10 = 0
            if (r25 != 0) goto L_0x03f7
        L_0x03e7:
            if (r31 != 0) goto L_0x03f7
            int r1 = r2.A00     // Catch:{ Exception -> 0x05e9 }
            r0 = 50
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = 30
            int r10 = java.lang.Math.max(r1, r0)     // Catch:{ Exception -> 0x05e9 }
        L_0x03f7:
            X.1SF r11 = r6.A0B     // Catch:{ Exception -> 0x05e9 }
            X.205 r1 = r8.A0v     // Catch:{ Exception -> 0x05e9 }
            int r19 = r10 + 1
            X.00H r0 = r11.A02     // Catch:{ Exception -> 0x05e9 }
            r37 = r0
            java.lang.Object r0 = r37.get()     // Catch:{ Exception -> 0x05e9 }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ Exception -> 0x05e9 }
            X.1W2 r0 = r0.A01     // Catch:{ Exception -> 0x05e9 }
            X.206 r0 = r0.A05(r1)     // Catch:{ Exception -> 0x05e9 }
            long r23 = X.AnonymousClass25A.A02(r0)     // Catch:{ Exception -> 0x05e9 }
            int r0 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x042b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05e9 }
            r9.<init>()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r0 = "msgstore/get/previous no id for "
            r9.append(r0)     // Catch:{ Exception -> 0x05e9 }
            r9.append(r1)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x05e9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0544
        L_0x042b:
            java.lang.String r13 = "Required value was null."
            if (r1 == 0) goto L_0x05b6
            X.1BI r15 = r1.A00     // Catch:{ Exception -> 0x05e9 }
            boolean r0 = X.C22971Dz.A0N(r15)     // Catch:{ Exception -> 0x05e9 }
            r22 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0441
            boolean r1 = X.C22971Dz.A0e(r15)     // Catch:{ Exception -> 0x05e9 }
            r0 = 1
            if (r1 == 0) goto L_0x0442
        L_0x0441:
            r0 = 0
        L_0x0442:
            X.1Cd r1 = r11.A01     // Catch:{ Exception -> 0x05e9 }
            X.1at r21 = r1.get()     // Catch:{ Exception -> 0x05e9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ad }
            r1.<init>()     // Catch:{ all -> 0x05ad }
            java.lang.String r12 = X.AnonymousClass203.A0J     // Catch:{ all -> 0x05ad }
            r1.append(r12)     // Catch:{ all -> 0x05ad }
            java.util.ArrayList r0 = X.C26121Qx.A01(r0, r9)     // Catch:{ all -> 0x05ad }
            X.C26121Qx.A02(r1, r0)     // Catch:{ all -> 0x05ad }
            if (r42 == 0) goto L_0x0496
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05ad }
            r0.<init>()     // Catch:{ all -> 0x05ad }
            r12 = 42
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05ad }
            r0.add(r12)     // Catch:{ all -> 0x05ad }
            r12 = 43
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05ad }
            r0.add(r12)     // Catch:{ all -> 0x05ad }
            r12 = 78
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05ad }
            r0.add(r12)     // Catch:{ all -> 0x05ad }
            r12 = 82
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05ad }
            r0.add(r12)     // Catch:{ all -> 0x05ad }
            X.C26121Qx.A02(r1, r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = " AND ( "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = "expire_timestamp IS NULL"
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = ") "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
        L_0x0496:
            java.lang.String r0 = " AND (view_mode IS NOT 1 AND view_mode IS NOT 3) "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = " "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = " AND _id < ? "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = " ORDER BY _id DESC"
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r0 = " LIMIT "
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            r0 = r19
            r1.append(r0)     // Catch:{ all -> 0x05ad }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x05ad }
            X.C18070vi.A0X(r12)     // Catch:{ all -> 0x05ad }
            if (r15 == 0) goto L_0x05a3
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x05ad }
            X.1LW r1 = r11.A00     // Catch:{ all -> 0x05ad }
            long r19 = r1.A09(r15)     // Catch:{ all -> 0x05ad }
            java.lang.String r1 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x05ad }
            r0[r9] = r1     // Catch:{ all -> 0x05ad }
            java.lang.String r1 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x05ad }
            r0[r22] = r1     // Catch:{ all -> 0x05ad }
            r1 = r21
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x05ad }
            X.1Ev r11 = r1.A02     // Catch:{ all -> 0x05ad }
            java.lang.String r1 = "GET_PREVIOUS_MESSAGES_AT_FOR_TYPE"
            android.database.Cursor r11 = r11.A0A(r12, r1, r0)     // Catch:{ all -> 0x05ad }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x059f }
            r1.<init>()     // Catch:{ all -> 0x059f }
        L_0x04e3:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x0508
            java.lang.Object r0 = r37.get()     // Catch:{ all -> 0x059f }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x059f }
            X.206 r0 = r0.A02(r11, r15)     // Catch:{ all -> 0x059f }
            if (r0 == 0) goto L_0x04e3
            boolean r12 = r0 instanceof X.AnonymousClass215     // Catch:{ all -> 0x059f }
            if (r12 == 0) goto L_0x0504
            boolean r12 = r0 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x059f }
            if (r12 == 0) goto L_0x0504
            r13 = r0
            X.21V r13 = (X.AnonymousClass21V) r13     // Catch:{ all -> 0x059f }
            java.lang.String r12 = ""
            r13.A07 = r12     // Catch:{ all -> 0x059f }
        L_0x0504:
            r1.add(r0)     // Catch:{ all -> 0x059f }
            goto L_0x04e3
        L_0x0508:
            X.DcO r0 = new X.DcO     // Catch:{ all -> 0x059f }
            r0.<init>(r1)     // Catch:{ all -> 0x059f }
            r11.close()     // Catch:{ all -> 0x05ad }
            r21.close()     // Catch:{ Exception -> 0x05e9 }
            int r1 = r0.size()     // Catch:{ Exception -> 0x05e9 }
            if (r1 <= r10) goto L_0x053b
            r0.get(r9)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object r1 = r0.get(r9)     // Catch:{ Exception -> 0x05e9 }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ Exception -> 0x05e9 }
            long r10 = r1.A0I     // Catch:{ Exception -> 0x05e9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x05e9 }
            r0.remove(r9)     // Catch:{ Exception -> 0x05e9 }
        L_0x052b:
            boolean r9 = r0.isEmpty()     // Catch:{ Exception -> 0x05e9 }
            r9 = r9 ^ 1
            r37 = r0
            java.util.ArrayList r0 = X.AnonymousClass1TQ.A00(r37, r38, r40, r42)     // Catch:{ Exception -> 0x05e9 }
            r14.addAll(r0)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x053e
        L_0x053b:
            r1 = r32
            goto L_0x052b
        L_0x053e:
            if (r9 != 0) goto L_0x0554
            goto L_0x0546
        L_0x0541:
            r1 = r32
            goto L_0x0546
        L_0x0544:
            r1 = r32
        L_0x0546:
            if (r25 != 0) goto L_0x054b
            if (r8 == 0) goto L_0x055f
            goto L_0x0554
        L_0x054b:
            if (r8 == 0) goto L_0x055f
            long r0 = r8.A0I     // Catch:{ Exception -> 0x05e9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x055f
        L_0x0554:
            java.util.List r37 = java.util.Collections.singletonList(r8)     // Catch:{ Exception -> 0x05e9 }
            java.util.ArrayList r0 = X.AnonymousClass1TQ.A00(r37, r38, r40, r42)     // Catch:{ Exception -> 0x05e9 }
            r14.addAll(r0)     // Catch:{ Exception -> 0x05e9 }
        L_0x055f:
            int r0 = r14.size()     // Catch:{ Exception -> 0x05e9 }
            int r28 = r28 + r0
            java.util.Collections.reverse(r14)     // Catch:{ Exception -> 0x05e9 }
            r0 = 6049(0x17a1, float:8.476E-42)
            int r8 = X.C18020vd.A00(r4, r5, r0)     // Catch:{ Exception -> 0x05e9 }
            X.1Ql r0 = r6.A08     // Catch:{ Exception -> 0x05e9 }
            java.util.ArrayList r0 = r0.A01(r14, r8)     // Catch:{ Exception -> 0x05e9 }
            r14.addAll(r0)     // Catch:{ Exception -> 0x05e9 }
            r0 = r36
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x05e9 }
            X.9eZ r3 = new X.9eZ     // Catch:{ Exception -> 0x05e9 }
            r3.<init>(r2, r0, r1, r14)     // Catch:{ Exception -> 0x05e9 }
            r0 = r30
            r0.add(r3)     // Catch:{ Exception -> 0x05e9 }
            int r27 = r27 + 1
            goto L_0x02f3
        L_0x058d:
            r10 = 0
            goto L_0x0383
        L_0x0591:
            com.whatsapp.jid.UserJid r12 = r10.A01     // Catch:{ Exception -> 0x05e9 }
            boolean r12 = r3.equals(r12)     // Catch:{ Exception -> 0x05e9 }
            if (r12 == 0) goto L_0x0379
            com.whatsapp.jid.UserJid r10 = r10.A00     // Catch:{ Exception -> 0x05e9 }
            r2.A07 = r10     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0379
        L_0x059f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x05a1 }
        L_0x05a1:
            r0 = move-exception
            goto L_0x05a9
        L_0x05a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x05ad }
            r0.<init>(r13)     // Catch:{ all -> 0x05ad }
            goto L_0x05ac
        L_0x05a9:
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x05ad }
        L_0x05ac:
            throw r0     // Catch:{ all -> 0x05ad }
        L_0x05ad:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x05af }
        L_0x05af:
            r1 = move-exception
            r0 = r21
            X.CDX.A00(r0, r2)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x05bb
        L_0x05b6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x05e9 }
            r1.<init>(r13)     // Catch:{ Exception -> 0x05e9 }
        L_0x05bb:
            throw r1     // Catch:{ Exception -> 0x05e9 }
        L_0x05bc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "HistorySyncManager/createInitialBootstrapData end, msgCount="
            r1.append(r0)
            r0 = r28
            r1.append(r0)
            java.lang.String r0 = "; chatCount="
            r1.append(r0)
            int r0 = r30.size()
            r1.append(r0)
            java.lang.String r0 = "; optimizationEnabled="
            r1.append(r0)
            r0 = r35
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x05f3
        L_0x05e9:
            r1 = move-exception
            java.lang.String r0 = "HistorySyncManager/createInitialBootstrapData: aborting data creation"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.List r30 = java.util.Collections.emptyList()
        L_0x05f3:
            X.10I r1 = r6.A0I
            X.AkZ r0 = new X.AkZ
            r8 = r0
            r9 = r6
            r10 = r26
            r11 = r44
            r12 = r43
            r13 = r30
            r8.<init>((X.AnonymousClass1TQ) r9, (X.AnonymousClass2SB) r10, (X.C88344Zh) r11, (com.whatsapp.jid.DeviceJid) r12, (java.util.List) r13)
            r1.CGN(r0)
            X.1S0 r5 = r7.A06
            r4 = 0
            java.lang.String r0 = "SyncdKeyManager/shareAllKeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rr r0 = r5.A09
            java.util.LinkedHashSet r6 = X.C17880vN.A14()
            X.1Oq r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x072d }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x072d }
            java.lang.String r1 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info"
            java.lang.String r0 = "SyncdCryptoInfoTable.SELECT_KEYS"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x072d }
        L_0x0628:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0726 }
            if (r0 == 0) goto L_0x0636
            X.2lh r0 = X.C26321Rr.A00(r2)     // Catch:{ all -> 0x0726 }
            r6.add(r0)     // Catch:{ all -> 0x0726 }
            goto L_0x0628
        L_0x0636:
            r2.close()     // Catch:{ all -> 0x072d }
            r3.close()
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x067f
            int r0 = X.C200510q.A00(r6)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x064f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0662
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2lh r0 = (X.C59062lh) r0
            X.A2n r0 = r0.A01
            r3.put(r0, r1)
            goto L_0x064f
        L_0x0662:
            X.C18070vi.A0X(r43)
            r5.A09(r12, r3, r4)
            X.1Rw r4 = r5.A03
            int r0 = r3.size()
            long r2 = (long) r0
            X.2Em r1 = new X.2Em
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A00 = r0
            X.18K r0 = r4.A08
            r0.CC7(r1)
        L_0x067f:
            X.1Pw r2 = r7.A04
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r2)
            java.lang.String r0 = "syncd_bootstrap_state"
            int r0 = X.C17890vO.A00(r1, r0)
            if (r0 != 0) goto L_0x071c
            if (r26 == 0) goto L_0x069e
            X.2j7 r1 = new X.2j7
            r1.<init>(r10)
            r7.A02(r1)
            r3 = 1
            r1 = r45
            X.C26371Rw.A06(r10, r1, r3)
        L_0x069e:
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap triggered for release"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r5 = X.C17880vN.A12()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.00H r6 = r7.A09
            java.lang.Object r0 = r6.get()
            X.2lN r0 = (X.C58862lN) r0
            java.util.Set r0 = r0.A02()
            java.util.Iterator r9 = r0.iterator()
        L_0x06bb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x070f
            java.lang.String r3 = X.C17880vN.A0v(r9)
            java.lang.Object r0 = r6.get()
            X.2lN r0 = (X.C58862lN) r0
            X.2nY r8 = r0.A00(r3)
            if (r8 != 0) goto L_0x06d7
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap handler not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x06bb
        L_0x06d7:
            java.util.Set r1 = X.C20126A8l.A09
            java.lang.String r0 = r8.A0D()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x06bb
            boolean r0 = r8 instanceof X.C46032Cp
            if (r0 == 0) goto L_0x0709
            r1 = r8
            X.2Cp r1 = (X.C46032Cp) r1
            java.util.List r0 = r1.A0L(r13)
        L_0x06ee:
            r4.addAll(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SyncdBootstrapManager/prepareAppStateSyncCriticalBootstrap adding mutations for "
            r1.append(r0)
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            X.C17890vO.A1A(r1, r0)
            r5.add(r3)
            goto L_0x06bb
        L_0x0709:
            r0 = 0
            java.util.List r0 = r8.A0F(r0)
            goto L_0x06ee
        L_0x070f:
            X.1S3 r0 = r7.A05
            r0.A07(r4)
            r2.A07(r5)
            r0 = 1
            r2.A04(r0)
            goto L_0x0722
        L_0x071c:
            X.1RE r1 = r7.A07
            r0 = 1
            r1.A02(r0)
        L_0x0722:
            r18.A0J()
            return
        L_0x0726:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0728 }
        L_0x0728:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x072d }
            throw r0     // Catch:{ all -> 0x072d }
        L_0x072d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x072f }
        L_0x072f:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        L_0x0734:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0734 }
            throw r0
        L_0x0737:
            java.lang.String r0 = "sync-manager/doPreCompanionLogoutTask timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r6.A02
            X.Af0 r1 = (X.C21132Af0) r1
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r1.A0B(r0)
            return
        L_0x0749:
            java.lang.Object r8 = r6.A01
            X.1To r8 = (X.C26811To) r8
            monitor-enter(r8)
            X.37K r5 = r8.A00     // Catch:{ all -> 0x0e1b }
            if (r5 != 0) goto L_0x0777
            X.11S r7 = r8.A07     // Catch:{ all -> 0x0e1b }
            X.10I r4 = r8.A0W     // Catch:{ all -> 0x0e1b }
            X.00H r0 = r8.A0Z     // Catch:{ all -> 0x0e1b }
            X.1OZ r16 = X.C17880vN.A0U(r0)     // Catch:{ all -> 0x0e1b }
            X.1Rw r3 = r8.A0G     // Catch:{ all -> 0x0e1b }
            X.1TZ r2 = r8.A0H     // Catch:{ all -> 0x0e1b }
            X.1TS r1 = r8.A0R     // Catch:{ all -> 0x0e1b }
            X.1Tj r0 = r8.A0E     // Catch:{ all -> 0x0e1b }
            X.2tu r11 = X.C26811To.A01(r8)     // Catch:{ all -> 0x0e1b }
            X.37K r5 = new X.37K     // Catch:{ all -> 0x0e1b }
            r9 = r5
            r10 = r7
            r12 = r0
            r13 = r3
            r14 = r2
            r15 = r1
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0e1b }
            r8.A00 = r5     // Catch:{ all -> 0x0e1b }
        L_0x0777:
            monitor-exit(r8)
            java.lang.Object r1 = r6.A02
            java.util.Map r1 = (java.util.Map) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0e13
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = X.AnonymousClass000.A15(r1)
        L_0x0790:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0df6
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r16)
            X.1Tj r0 = r5.A04
            r46 = r0
            java.lang.String r10 = X.C17880vN.A0x(r1)
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            X.C18070vi.A0h(r10, r2)
            X.Af0 r18 = new X.Af0
            r18.<init>()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x07d1
            java.util.List r2 = java.util.Collections.emptyList()
            r1 = 0
            X.2kH r0 = new X.2kH
            r0.<init>(r10, r2, r1, r1)
            X.9gA r1 = r0.A00()
            r0 = r18
            r0.A0B(r1)
        L_0x07c9:
            r1 = r17
            r0 = r18
            r1.add(r0)
            goto L_0x0790
        L_0x07d1:
            r0 = r46
            X.1TR r13 = r0.A02     // Catch:{ 1Tp -> 0x0de9 }
            r30 = 0
            r12 = 0
            r31 = 0
            r19 = 0
            r32 = 0
            java.lang.String r33 = "SyncEncryptionHelper/encryptMutations: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = "SyncEncryptionHelper/encryptMutations for collectionName: "
            r1.append(r0)     // Catch:{ 1Tp -> 0x0de9 }
            r1.append(r10)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = "; size="
            r1.append(r0)     // Catch:{ 1Tp -> 0x0de9 }
            int r0 = r2.size()     // Catch:{ 1Tp -> 0x0de9 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            X.1S0 r0 = r13.A06     // Catch:{ 1Tp -> 0x0de9 }
            r26 = r0
            X.2lh r11 = r26.A04()     // Catch:{ 1Tp -> 0x0de9 }
            if (r11 != 0) goto L_0x0816
            X.2lh r11 = r26.A05()     // Catch:{ 1Tp -> 0x0de9 }
            if (r11 != 0) goto L_0x0816
            java.lang.String r1 = "Missing active key exception"
            X.2E0 r2 = new X.2E0     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r30
            r2.<init>(r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0815:
            throw r2     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0816:
            java.util.LinkedHashSet r6 = X.C17880vN.A14()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.LinkedHashSet r3 = X.C17880vN.A14()     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r9 = r11.A01     // Catch:{ 1Tp -> 0x0de9 }
            r6.add(r9)     // Catch:{ 1Tp -> 0x0de9 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0827:
            boolean r0 = r14.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x088e
            java.lang.Object r7 = r14.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r7 = (X.C20126A8l) r7     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r7.A00     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x0839
            r7.A00 = r9     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0839:
            X.1Rs r1 = r13.A0A     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = r7.A0A()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r1 = r1.A0A(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r1 == 0) goto L_0x0872
            X.A2n r8 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            if (r8 == 0) goto L_0x0b4e
            X.A2n r0 = r7.A00     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r8.equals(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x0872
            X.2rJ r8 = r7.A05     // Catch:{ 1Tp -> 0x0de9 }
            X.2rJ r0 = X.C62382rJ.A03     // Catch:{ 1Tp -> 0x0de9 }
            if (r8 != r0) goto L_0x0882
            X.2Dx r1 = X.AnonymousClass1TR.A00(r1)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Tp -> 0x0de9 }
            r3.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            X.A6U r0 = new X.A6U     // Catch:{ 1Tp -> 0x0de9 }
            r0.<init>(r1)     // Catch:{ 1Tp -> 0x0de9 }
            X.AnonymousClass1D6.A02(r1, r0, r4)     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0872
            r6.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0872:
            X.A6U r0 = new X.A6U     // Catch:{ 1Tp -> 0x0de9 }
            r0.<init>(r7)     // Catch:{ 1Tp -> 0x0de9 }
            X.AnonymousClass1D6.A02(r7, r0, r4)     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r0.A02     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0827
            r6.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0827
        L_0x0882:
            java.lang.String r0 = r7.A0A()     // Catch:{ 1Tp -> 0x0de9 }
            r3.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            r7.A00 = r0     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0872
        L_0x088e:
            X.1S4 r0 = r13.A04     // Catch:{ 1Tp -> 0x0de9 }
            X.1NG r0 = r0.A01     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r0.A04()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x090a
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x08a0:
            boolean r0 = r14.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x08e2
            java.lang.Object r1 = r14.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r1 = (X.C20126A8l) r1     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r1 instanceof X.C170598qH     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x08a0
            r0 = r1
            X.8qH r0 = (X.C170598qH) r0     // Catch:{ 1Tp -> 0x0de9 }
            X.1BI r7 = r0.getChatJid()     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0d(r7, r12)     // Catch:{ 1Tp -> 0x0de9 }
            X.8qH r2 = r0.A0G(r7)     // Catch:{ 1Tp -> 0x0de9 }
            if (r2 == r1) goto L_0x08a0
            X.1BI r1 = r2.getChatJid()     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r1 instanceof com.whatsapp.jid.PhoneUserJid     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x08a0
            boolean r0 = X.C18070vi.A18(r1, r7)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x08a0
            X.1Rs r0 = r13.A0A     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r1 = r2.A0A()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r0 = r0.A0A(r1)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x08a0
            X.2Dx r0 = X.AnonymousClass1TR.A00(r0)     // Catch:{ 1Tp -> 0x0de9 }
            r8.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x08a0
        L_0x08e2:
            java.util.Iterator r2 = r8.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x08e6:
            boolean r0 = r2.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x090a
            java.lang.Object r1 = r2.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.2Dx r1 = (X.C46272Dx) r1     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Tp -> 0x0de9 }
            r3.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            X.A6U r0 = new X.A6U     // Catch:{ 1Tp -> 0x0de9 }
            r0.<init>(r1)     // Catch:{ 1Tp -> 0x0de9 }
            X.AnonymousClass1D6.A02(r1, r0, r4)     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r1.A00     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x08e6
            r6.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x08e6
        L_0x090a:
            X.0ve r1 = r13.A0B     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 2777(0xad9, float:3.891E-42)
            X.0vf r8 = X.C18040vf.A02     // Catch:{ 1Tp -> 0x0de9 }
            int r25 = X.C18020vd.A00(r8, r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r24 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            r23 = 0
        L_0x091a:
            int r2 = r24.size()     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r25
            if (r2 >= r0) goto L_0x09c4
            X.1Rs r14 = r13.A0A     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r22 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            r2.add(r10)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = java.lang.String.valueOf(r23)     // Catch:{ 1Tp -> 0x0de9 }
            r2.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = java.lang.String.valueOf(r25)     // Catch:{ 1Tp -> 0x0de9 }
            r2.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            X.1Oq r0 = r14.A00     // Catch:{ 1Tp -> 0x0de9 }
            X.1at r21 = r0.get()     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r21
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x09b5 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x09b5 }
            r7 = r0
            java.lang.String r20 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE collection_name = ?  ORDER BY epoch ASC, device_id DESC  LIMIT ?, ? "
            java.lang.String[] r0 = X.C19620yd.A0M     // Catch:{ all -> 0x09b5 }
            java.lang.Object[] r15 = r2.toArray(r0)     // Catch:{ all -> 0x09b5 }
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ all -> 0x09b5 }
            java.lang.String r0 = "SyncdMutationsStore.SELECT_MUTATIONS_WITH_OLDEST_KEY"
            r2 = r20
            android.database.Cursor r7 = r7.A0A(r2, r0, r15)     // Catch:{ all -> 0x09b5 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x09a9 }
            if (r0 != 0) goto L_0x0963
            goto L_0x09a5
        L_0x0963:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x09a9 }
            if (r0 == 0) goto L_0x0975
            X.A8l r2 = X.C26331Rs.A01(r7, r14)     // Catch:{ all -> 0x09a9 }
            if (r2 == 0) goto L_0x0963
            r0 = r22
            r0.add(r2)     // Catch:{ all -> 0x09a9 }
            goto L_0x0963
        L_0x0975:
            r7.close()     // Catch:{ all -> 0x09b5 }
            r21.close()     // Catch:{ 1Tp -> 0x0de9 }
            int r23 = r23 + r25
            java.util.Iterator r7 = r22.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0981:
            boolean r0 = r7.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x091a
            java.lang.Object r2 = r7.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r2 = (X.C20126A8l) r2     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r2.A00     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = X.C18070vi.A18(r9, r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x09c4
            java.lang.String r0 = r2.A0A()     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r3.contains(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x0981
            r0 = r24
            r0.add(r2)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0981
        L_0x09a5:
            r7.close()     // Catch:{ all -> 0x09b5 }
            goto L_0x09c1
        L_0x09a9:
            r1 = move-exception
            if (r7 == 0) goto L_0x09b4
            r7.close()     // Catch:{ all -> 0x09b0 }
            goto L_0x09b4
        L_0x09b0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x09b5 }
        L_0x09b4:
            throw r1     // Catch:{ all -> 0x09b5 }
        L_0x09b5:
            r2 = move-exception
            r21.close()     // Catch:{ all -> 0x09bb }
            goto L_0x0815
        L_0x09bb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0815
        L_0x09c1:
            r21.close()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x09c4:
            java.util.Iterator r7 = r24.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x09c8:
            boolean r0 = r7.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x09f2
            java.lang.Object r3 = r7.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r3 = (X.C20126A8l) r3     // Catch:{ 1Tp -> 0x0de9 }
            X.2Dx r2 = X.AnonymousClass1TR.A00(r3)     // Catch:{ 1Tp -> 0x0de9 }
            X.A6U r0 = new X.A6U     // Catch:{ 1Tp -> 0x0de9 }
            r0.<init>(r2)     // Catch:{ 1Tp -> 0x0de9 }
            X.AnonymousClass1D6.A02(r2, r0, r4)     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r0 = r0.A02     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x09e7
            r6.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x09e7:
            r3.A00 = r9     // Catch:{ 1Tp -> 0x0de9 }
            X.A6U r0 = new X.A6U     // Catch:{ 1Tp -> 0x0de9 }
            r0.<init>(r3)     // Catch:{ 1Tp -> 0x0de9 }
            X.AnonymousClass1D6.A02(r3, r0, r4)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x09c8
        L_0x09f2:
            r6.size()     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r26
            java.util.LinkedHashMap r29 = r0.A07(r10, r6)     // Catch:{ 1Tp -> 0x0de9 }
            java.util.Collection r2 = r29.values()     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r30
            boolean r0 = r2.contains(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 != 0) goto L_0x0b43
            java.util.ArrayList r28 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r27 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r26 = X.AnonymousClass000.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.LinkedHashMap r25 = X.C17880vN.A13()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.Iterator r24 = r4.iterator()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0a1f:
            boolean r0 = r24.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0b76
            java.lang.Object r0 = r24.next()     // Catch:{ 1Tp -> 0x0de9 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.Object r4 = r0.first     // Catch:{ 1Tp -> 0x0de9 }
            X.A8l r4 = (X.C20126A8l) r4     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.Object r3 = r0.second     // Catch:{ 1Tp -> 0x0de9 }
            X.A6U r3 = (X.A6U) r3     // Catch:{ 1Tp -> 0x0de9 }
            X.A2n r6 = r3.A02     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r7 = "Required value was null."
            if (r6 == 0) goto L_0x0b70
            r0 = r29
            java.lang.Object r6 = r0.get(r6)     // Catch:{ 1Tp -> 0x0de9 }
            if (r6 == 0) goto L_0x0b6a
            X.2lh r6 = (X.C59062lh) r6     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r27
            r0.add(r4)     // Catch:{ 1Tp -> 0x0de9 }
            X.1TT r0 = r13.A08     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2fa r14 = r0.BK7(r3, r6)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xt r0 = X.C164158Xt.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bmt r23 = r0.A0N()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            byte[] r6 = r14.A03     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r6.length     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.BmB r15 = X.DSQ.A01(r6, r12, r0)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r23)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xt r7 = (X.C164158Xt) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 1
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.blob_ = r15     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xu r0 = X.C164168Xu.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bmt r22 = r0.A0N()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            byte[] r7 = r14.A02     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.length     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.BmB r15 = X.DSQ.A01(r7, r12, r0)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r22)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xu r7 = (X.C164168Xu) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 1
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.blob_ = r15     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xs r0 = X.C164148Xs.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bmt r21 = r0.A0N()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.A2n r0 = r14.A01     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            byte[] r7 = r0.A00     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.length     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.BmB r15 = X.DSQ.A01(r7, r12, r0)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r21)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xs r7 = (X.C164148Xs) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 1
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.id_ = r15     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2BG r0 = X.AnonymousClass2BG.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bmt r20 = r0.A0N()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r20)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2BG r7 = (X.AnonymousClass2BG) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r0 = r23.A0C()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xt r0 = (X.C164158Xt) r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0.getClass()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.index_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 1
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r20)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2BG r7 = (X.AnonymousClass2BG) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r0 = r22.A0C()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xu r0 = (X.C164168Xu) r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0.getClass()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.value_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 2
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r20)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2BG r7 = (X.AnonymousClass2BG) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r0 = r21.A0C()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.8Xs r0 = (X.C164148Xs) r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0.getClass()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.keyId_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 4
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2B8 r0 = X.AnonymousClass2B8.DEFAULT_INSTANCE     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bmt r15 = r0.A0N()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2rJ r0 = r14.A00     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2R4 r0 = r0.A00     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r15)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2B8 r7 = (X.AnonymousClass2B8) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r0.value     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.operation_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 1
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = X.C17880vN.A0G(r15)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2B8 r7 = (X.AnonymousClass2B8) r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r0 = r20.A0C()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2BG r0 = (X.AnonymousClass2BG) r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0.getClass()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r7.record_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            int r0 = r7.bitField0_     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r0 | 2
            r7.bitField0_ = r0     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.Bm6 r7 = r15.A0C()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r28
            r0.add(r7)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            byte[] r7 = r14.A04     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r4.A01 = r7     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2rJ r3 = r3.A01     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            X.2rJ r0 = X.C62382rJ.A03     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            if (r3 != r0) goto L_0x0b38
            r2.add(r7)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r26
            r0.add(r6)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
        L_0x0b38:
            java.lang.String r3 = r4.A0A()     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            r0 = r25
            r0.put(r3, r6)     // Catch:{ 2E3 -> 0x0b54, 2Dz -> 0x0c86 }
            goto L_0x0a1f
        L_0x0b43:
            java.lang.String r1 = "Missing keys exception"
            X.2E0 r2 = new X.2E0     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r30
            r2.<init>(r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0815
        L_0x0b4e:
            java.lang.IllegalStateException r7 = X.C17880vN.A0g()     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c9a
        L_0x0b54:
            r1 = move-exception
            r0 = r33
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1Tp -> 0x0de9 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ 1Tp -> 0x0de9 }
            r9 = r30
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r8 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c9a
        L_0x0b6a:
            java.lang.IllegalStateException r7 = X.AnonymousClass000.A0n(r7)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c9a
        L_0x0b70:
            java.lang.IllegalStateException r7 = X.AnonymousClass000.A0n(r7)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c9a
        L_0x0b76:
            X.1TS r6 = r13.A09     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r7 = r6.A07(r10)     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 6614(0x19d6, float:9.268E-42)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            boolean r21 = X.AnonymousClass000.A1O(r0)
            java.lang.String[] r3 = X.C20068A5s.A02(r27)     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r3)     // Catch:{ 1Tp -> 0x0de9 }
            X.1Rs r0 = r13.A0A     // Catch:{ 1Tp -> 0x0de9 }
            java.util.HashMap r15 = r0.A0E(r10, r3)     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 624(0x270, float:8.74E-43)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0ba2
            java.lang.String r0 = java.util.Arrays.toString(r3)     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0ba2:
            java.util.LinkedHashSet r14 = X.C17880vN.A14()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.Collection r0 = r15.values()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.List r0 = X.C29431cG.A0t(r0)     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r4 = X.AnonymousClass1TR.A0E     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r3 = X.AnonymousClass2TC.A00(r0, r7, r4, r12)     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r3)     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 1
            byte[] r20 = X.AnonymousClass2TC.A00(r2, r3, r4, r0)     // Catch:{ 1Tp -> 0x0de9 }
            X.C18070vi.A0X(r20)     // Catch:{ 1Tp -> 0x0de9 }
            if (r21 == 0) goto L_0x0bd7
            r30 = r7
            r32 = r3
            int r12 = r2.size()     // Catch:{ 1Tp -> 0x0de9 }
            int r19 = r15.size()     // Catch:{ 1Tp -> 0x0de9 }
            int r0 = r14.size()     // Catch:{ 1Tp -> 0x0de9 }
            int r19 = r19 - r0
            int r31 = r14.size()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0bd7:
            boolean r0 = r28.isEmpty()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0bf0
            X.190 r4 = r13.A00     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = "name="
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r10, r2)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r2 = "syncd_empty_patch"
            r0 = 0
            r4.A0G(r2, r3, r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0bf0:
            java.lang.Long r0 = r6.A01(r10)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0c2a
            long r38 = r0.longValue()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0bfa:
            r2 = 1
            long r38 = r38 + r2
            X.1TT r14 = r13.A08     // Catch:{ 1Tp -> 0x0de9 }
            r40 = r14
            r41 = r11
            r42 = r10
            r43 = r20
            r44 = r38
            byte[] r15 = r40.BDz(r41, r42, r43, r44)     // Catch:{ 1Tp -> 0x0de9 }
            X.4so r2 = X.C29431cG.A0V(r27)     // Catch:{ 1Tp -> 0x0de9 }
            X.3Iv r0 = X.C71913Iv.A00     // Catch:{ 1Tp -> 0x0de9 }
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r2)     // Catch:{ 1Tp -> 0x0de9 }
            X.7Sa r0 = X.AnonymousClass1b2.A0B(r0)     // Catch:{ 1Tp -> 0x0de9 }
            r7 = 0
            X.7Rp r3 = new X.7Rp     // Catch:{ 1Tp -> 0x0de9 }
            r3.<init>((X.C147157Sa) r0)     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r3.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            r6 = 0
            if (r0 != 0) goto L_0x0c2f
            goto L_0x0c2d
        L_0x0c2a:
            r38 = 0
            goto L_0x0bfa
        L_0x0c2d:
            r2 = r6
            goto L_0x0c46
        L_0x0c2f:
            java.lang.Object r2 = r3.next()     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0c33:
            boolean r0 = r3.hasNext()     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0c46
            java.lang.Object r0 = r3.next()     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r0 = (byte[]) r0     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r2 = (byte[]) r2     // Catch:{ 1Tp -> 0x0de9 }
            byte[] r2 = X.C200310o.A0A(r2, r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c33
        L_0x0c46:
            byte[] r2 = (byte[]) r2     // Catch:{ 1Tp -> 0x0de9 }
            r4 = 0
            if (r2 != 0) goto L_0x0c4d
            byte[] r2 = new byte[r7]     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0c4d:
            r33 = r14
            r34 = r11
            r35 = r10
            r36 = r2
            r37 = r15
            byte[] r14 = r33.BDu(r34, r35, r36, r37, r38)     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 11821(0x2e2d, float:1.6565E-41)
            org.json.JSONObject r1 = X.C18020vd.A02(r8, r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.String r0 = "allowlist"
            org.json.JSONArray r3 = r1.optJSONArray(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r3 == 0) goto L_0x0c9b
            int r2 = r3.length()     // Catch:{ 1Tp -> 0x0de9 }
            java.util.ArrayList r1 = X.C17880vN.A0z(r2)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0c71:
            if (r4 >= r2) goto L_0x0c9c
            java.lang.Object r0 = r3.get(r4)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0c7f
            r1.add(r0)     // Catch:{ 1Tp -> 0x0de9 }
            int r4 = r4 + 1
            goto L_0x0c71
        L_0x0c7f:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            java.lang.NullPointerException r7 = X.AnonymousClass000.A0s(r0)     // Catch:{ 1Tp -> 0x0de9 }
            goto L_0x0c9a
        L_0x0c86:
            r1 = move-exception
            r0 = r33
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1Tp -> 0x0de9 }
            r15 = 10
            X.1Tq r7 = new X.1Tq     // Catch:{ 1Tp -> 0x0de9 }
            r9 = r30
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r8 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0c9a:
            throw r7     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0c9b:
            r1 = r6
        L_0x0c9c:
            X.2kH r3 = new X.2kH     // Catch:{ 1Tp -> 0x0de9 }
            r2 = r27
            r0 = r20
            r3.<init>(r10, r2, r1, r0)     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r28
            r3.A09 = r0     // Catch:{ 1Tp -> 0x0de9 }
            r0 = 0
            r3.A05 = r0     // Catch:{ 1Tp -> 0x0de9 }
            r3.A0E = r15     // Catch:{ 1Tp -> 0x0de9 }
            r3.A0D = r14     // Catch:{ 1Tp -> 0x0de9 }
            r3.A04 = r9     // Catch:{ 1Tp -> 0x0de9 }
            X.2mC r0 = r11.A00     // Catch:{ 1Tp -> 0x0de9 }
            r3.A03 = r0     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r38)     // Catch:{ 1Tp -> 0x0de9 }
            r3.A07 = r0     // Catch:{ 1Tp -> 0x0de9 }
            X.18O r1 = r13.A02     // Catch:{ 1Tp -> 0x0de9 }
            X.18R r0 = X.AnonymousClass18O.A0O     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r1.A09(r0)     // Catch:{ 1Tp -> 0x0de9 }
            if (r0 == 0) goto L_0x0cd0
            X.11S r0 = r13.A01     // Catch:{ 1Tp -> 0x0de9 }
            int r0 = r0.A06()     // Catch:{ 1Tp -> 0x0de9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0cd0:
            r3.A06 = r6     // Catch:{ 1Tp -> 0x0de9 }
            X.11S r0 = r13.A01     // Catch:{ 1Tp -> 0x0de9 }
            boolean r0 = r0.A0N()     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r0 ^ 1
            r3.A0A = r0     // Catch:{ 1Tp -> 0x0de9 }
            if (r21 == 0) goto L_0x0cf0
            r0 = r30
            r3.A0B = r0     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r32
            r3.A0C = r0     // Catch:{ 1Tp -> 0x0de9 }
            r3.A00 = r12     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r19
            r3.A02 = r0     // Catch:{ 1Tp -> 0x0de9 }
            r0 = r31
            r3.A01 = r0     // Catch:{ 1Tp -> 0x0de9 }
        L_0x0cf0:
            X.9gA r4 = r3.A00()
            r0 = r46
            X.18O r2 = r0.A00
            X.18Q r0 = X.AnonymousClass18O.A0x
            int r1 = r2.A04(r0)
            X.18Q r0 = X.AnonymousClass18O.A12
            int r0 = r2.A04(r0)
            long r9 = (long) r0
            r12 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r12
            X.2BT r11 = r4.A01
            if (r11 == 0) goto L_0x0df1
            r0 = 0
            int r6 = r11.A0J(r0)
            java.util.List r0 = r4.A04
            int r0 = r0.size()
            if (r0 > r1) goto L_0x0d25
            long r0 = (long) r6
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0d25
        L_0x0d1e:
            r0 = r18
            r0.A0B(r4)
            goto L_0x07c9
        L_0x0d25:
            long r1 = (long) r6
            r0 = r46
            X.0ve r6 = r0.A03
            r0 = 5097(0x13e9, float:7.142E-42)
            int r0 = X.C18020vd.A00(r8, r6, r0)
            long r8 = (long) r0
            long r8 = r8 * r12
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0d1e
            X.2B4 r0 = X.AnonymousClass2B4.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            X.EE9 r4 = r11.mutations_
            if (r4 != 0) goto L_0x0d42
            X.0wS r4 = X.C18460wS.A00
        L_0x0d42:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            X.Bm6 r2 = X.C17880vN.A0G(r6)
            X.2B4 r2 = (X.AnonymousClass2B4) r2
            X.EE9 r1 = r2.mutations_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0d59
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.mutations_ = r1
        L_0x0d59:
            X.DND.A09(r4, r1)
            X.2by r4 = new X.2by
            r0 = r18
            r4.<init>(r0, r3)
            r0 = r46
            X.1Ti r8 = r0.A01
            X.Bm6 r2 = r6.A0C()
            X.2B4 r2 = (X.AnonymousClass2B4) r2
            r3 = 0
            X.17y r0 = r8.A01     // Catch:{ IOException -> 0x0ddb }
            X.17z r1 = r0.A00     // Catch:{ IOException -> 0x0ddb }
            java.lang.String r0 = ""
            java.io.File r6 = r1.A01(r0)     // Catch:{ IOException -> 0x0ddb }
            byte[] r0 = r2.A0M()     // Catch:{ IOException -> 0x0ddb }
            X.C64062u9.A0L(r6, r0)     // Catch:{ IOException -> 0x0ddb }
            r6.getAbsolutePath()     // Catch:{ IOException -> 0x0ddb }
            X.EE9 r0 = r2.mutations_     // Catch:{ IOException -> 0x0ddb }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0ddb }
            if (r0 != 0) goto L_0x0d97
            java.lang.String r0 = "external-mutations-uploader: empty external patch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0ddb }
            X.190 r1 = r8.A00     // Catch:{ IOException -> 0x0ddb }
            java.lang.String r0 = "syncd_empty_external_patch"
            r1.A0G(r0, r3, r7)     // Catch:{ IOException -> 0x0ddb }
        L_0x0d97:
            r1 = 1
            X.2qf r0 = new X.2qf     // Catch:{ IOException -> 0x0ddb }
            r0.<init>(r7, r7, r1)     // Catch:{ IOException -> 0x0ddb }
            X.1So r23 = X.C26551So.A0N     // Catch:{ IOException -> 0x0ddb }
            android.net.Uri r19 = android.net.Uri.fromFile(r6)     // Catch:{ IOException -> 0x0ddb }
            r14 = 1
            r21 = r3
            r24 = r3
            r25 = r3
            r27 = r7
            r28 = r7
            r20 = r3
            r22 = r0
            r26 = r7
            r29 = r1
            X.2ta r0 = X.C63722ta.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ IOException -> 0x0ddb }
            X.1T6 r2 = r8.A02     // Catch:{ IOException -> 0x0ddb }
            X.34B r1 = r2.A0C(r0, r7)     // Catch:{ IOException -> 0x0ddb }
            java.lang.String r0 = "mms"
            r1.A0Z = r0     // Catch:{ IOException -> 0x0ddb }
            X.Aeo r0 = new X.Aeo     // Catch:{ IOException -> 0x0ddb }
            r9 = r0
            r10 = r6
            r11 = r8
            r12 = r1
            r13 = r4
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0ddb }
            r1.A07(r0, r3)     // Catch:{ IOException -> 0x0ddb }
            r2.A0J(r1, r3)     // Catch:{ IOException -> 0x0ddb }
            java.lang.String r0 = "external-mutations-uploader start media upload"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0ddb }
            goto L_0x07c9
        L_0x0ddb:
            r1 = move-exception
            java.lang.String r0 = "external-mutations-uploader"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "prepare-syncd-mutations-helper/startPrepareJob/onError: IOException"
            X.2E0 r1 = new X.2E0
            r1.<init>(r0, r3)
            goto L_0x0dea
        L_0x0de9:
            r1 = move-exception
        L_0x0dea:
            r0 = r18
            r0.A0C(r1)
            goto L_0x07c9
        L_0x0df1:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()
            throw r1
        L_0x0df6:
            X.8fc r3 = new X.8fc
            r0 = r17
            r3.<init>(r0)
            r1 = 3
            X.Aef r0 = new X.Aef
            r0.<init>(r5, r1)
            r3.A09(r0)
            r0 = 4
            X.Aef r2 = new X.Aef
            r2.<init>(r5, r0)
            X.1TJ r1 = r3.A00
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x0e13:
            java.lang.String r0 = "sync-request-handler/sendRequest: mutation map is empty"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)
            throw r1
        L_0x0e1b:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x0e1e:
            java.lang.Object r2 = r3.A03()
            X.1TN r2 = (X.AnonymousClass1TN) r2
            monitor-enter(r2)
            X.1HY r0 = r2.A01     // Catch:{ all -> 0x0e36 }
            android.content.SharedPreferences r0 = X.AnonymousClass1HY.A00(r0)     // Catch:{ all -> 0x0e36 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0e36 }
            java.lang.String r0 = "sciek/key"
            X.C17880vN.A1B(r1, r0)     // Catch:{ all -> 0x0e36 }
            monitor-exit(r2)
            return
        L_0x0e36:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0e39:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0e3b }
        L_0x0e3b:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PF.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PF(C21132Af0 af0, C26811To r3) {
        super("SyncManager/doPreCompanionLogoutTask");
        this.A01 = r3;
        this.A02 = af0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PF(C41911xI r2, C45992Cl r3) {
        super("SyncdUpdateHelper/onLocaleChanged");
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PF(C26811To r2, Map map) {
        super("SyncManager/prepareAndSendRequest");
        this.A01 = r2;
        this.A02 = map;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2PF(C59312m6 r2, C26811To r3) {
        super("SyncManager/CriticalDataUploadManager/startObserver");
        this.A01 = r3;
        this.A02 = r2;
    }
}
