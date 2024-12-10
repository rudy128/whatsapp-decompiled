package X;

import android.os.Handler;
import android.os.Looper;

@Deprecated
/* renamed from: X.1V5  reason: invalid class name */
public class AnonymousClass1V5 extends Handler {
    public final AnonymousClass1KB A00;
    public final AnonymousClass18O A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass118 A04;
    public final C18000vb A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass1MZ A07;
    public final C18030ve A08;
    public final C27141Uw A09;
    public final AnonymousClass1V0 A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x05a9, code lost:
        r2.A00.A0L(r3.toString(), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0671, code lost:
        r0 = r3.getString(r2, new java.lang.Object[]{r8.obj});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0698, code lost:
        r4.A0L(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x069b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x06b6, code lost:
        r1 = r2.A00;
        r0 = 2131890970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x071b, code lost:
        r1.A06(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x071e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0769, code lost:
        r1.A08(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x076c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0792, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0795, code lost:
        r3 = (X.AnonymousClass206) r8.obj;
        r2.A06.BBM(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r8 = r18
            int r3 = r8.what
            r0 = 3
            r2 = r17
            if (r3 == r0) goto L_0x0786
            r0 = 5
            if (r3 == r0) goto L_0x077c
            r0 = 6
            if (r3 == r0) goto L_0x076d
            r7 = 1
            r6 = 0
            switch(r3) {
                case 1001: goto L_0x05b3;
                case 1002: goto L_0x071f;
                case 1003: goto L_0x072e;
                case 1004: goto L_0x05b3;
                case 1005: goto L_0x073d;
                case 1006: goto L_0x073d;
                case 1007: goto L_0x074c;
                case 1008: goto L_0x075b;
                default: goto L_0x0014;
            }
        L_0x0014:
            switch(r3) {
                case 2001: goto L_0x062e;
                case 2002: goto L_0x0638;
                case 2003: goto L_0x0668;
                case 2004: goto L_0x0642;
                case 2005: goto L_0x064c;
                case 2006: goto L_0x0653;
                case 2007: goto L_0x065a;
                case 2008: goto L_0x0661;
                case 2009: goto L_0x0668;
                case 2010: goto L_0x069c;
                case 2011: goto L_0x06a2;
                case 2012: goto L_0x06a8;
                case 2013: goto L_0x06b6;
                case 2014: goto L_0x06bc;
                case 2015: goto L_0x06c2;
                case 2016: goto L_0x06c8;
                case 2017: goto L_0x06ce;
                case 2018: goto L_0x06d4;
                case 2019: goto L_0x06da;
                case 2020: goto L_0x06e0;
                case 2021: goto L_0x06e6;
                case 2022: goto L_0x06ec;
                case 2023: goto L_0x06f2;
                case 2024: goto L_0x06f8;
                case 2025: goto L_0x06fe;
                case 2026: goto L_0x0704;
                case 2027: goto L_0x070a;
                case 2028: goto L_0x0710;
                default: goto L_0x0017;
            }
        L_0x0017:
            r10 = 403(0x193, float:5.65E-43)
            r1 = 419(0x1a3, float:5.87E-43)
            r9 = 406(0x196, float:5.69E-43)
            r5 = 404(0x194, float:5.66E-43)
            java.lang.String r11 = "/"
            java.lang.String r4 = "\n"
            switch(r3) {
                case 3001: goto L_0x00d1;
                case 3002: goto L_0x043d;
                case 3003: goto L_0x04b1;
                case 3004: goto L_0x052a;
                case 3005: goto L_0x061f;
                case 3006: goto L_0x0626;
                case 3007: goto L_0x06ae;
                case 3008: goto L_0x062a;
                default: goto L_0x0026;
            }
        L_0x0026:
            switch(r3) {
                case 3010: goto L_0x060a;
                case 3011: goto L_0x0611;
                case 3012: goto L_0x0618;
                default: goto L_0x0029;
            }
        L_0x0029:
            switch(r3) {
                case 3014: goto L_0x067c;
                case 3015: goto L_0x05f2;
                case 3016: goto L_0x0602;
                case 3017: goto L_0x0606;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 3019: goto L_0x0030;
                case 3020: goto L_0x05d8;
                case 3021: goto L_0x05e3;
                case 3022: goto L_0x05e7;
                case 3023: goto L_0x05dc;
                case 3024: goto L_0x05eb;
                case 3025: goto L_0x0716;
                case 3026: goto L_0x0795;
                case 3027: goto L_0x0790;
                default: goto L_0x002f;
            }
        L_0x002f:
            return
        L_0x0030:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r0 = r8.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x0041:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r9 = r13.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r8 = r9.getKey()
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "groupmgr/add-cadmins/error/"
            r5.append(r0)
            r5.append(r8)
            r5.append(r11)
            java.lang.Object r0 = r9.getValue()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r9.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            X.1M9 r0 = r2.A02
            X.1E7 r12 = r0.A0H(r8)
            if (r5 == r10) goto L_0x00c5
            if (r5 == r1) goto L_0x00a1
            X.118 r0 = r2.A04
            android.content.Context r9 = r0.A00
            r8 = 2131889949(0x7f120f1d, float:1.9414576E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            X.1Me r0 = r2.A03
            java.lang.String r0 = r0.A0I(r12)
            r5[r6] = r0
            java.lang.String r0 = r9.getString(r8, r5)
        L_0x009a:
            r3.append(r0)
            r3.append(r4)
            goto L_0x0041
        L_0x00a1:
            X.1MZ r0 = r2.A07
            X.0ve r8 = r0.A0D
            r5 = 1655(0x677, float:2.319E-42)
            X.0vf r0 = X.C18040vf.A02
            int r12 = X.C18020vd.A00(r0, r8, r5)
            X.118 r0 = r2.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r9 = r0.getResources()
            r8 = 2131755145(0x7f100089, float:1.914116E38)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r5[r6] = r0
            java.lang.String r0 = r9.getQuantityString(r8, r12, r5)
            goto L_0x009a
        L_0x00c5:
            X.118 r0 = r2.A04
            android.content.Context r5 = r0.A00
            r0 = 2131889951(0x7f120f1f, float:1.941458E38)
            java.lang.String r0 = r5.getString(r0)
            goto L_0x009a
        L_0x00d1:
            java.lang.Object r0 = r8.obj
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x002f
            int r3 = r0.size()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x00e8:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x013c
            java.lang.Object r13 = r15.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r12 = r13.getKey()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "groupmgr/add-participant/error/"
            r14.append(r0)
            r14.append(r12)
            r14.append(r11)
            java.lang.Object r0 = r13.getValue()
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r13 = r13.getValue()
            boolean r0 = r8.containsKey(r13)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r8.get(r13)
            if (r0 == 0) goto L_0x0130
            java.lang.Object r0 = r8.get(r13)
            java.util.List r0 = (java.util.List) r0
            r0.add(r12)
            goto L_0x00e8
        L_0x0130:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            r8.put(r13, r0)
            goto L_0x00e8
        L_0x013c:
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0168
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0168
            X.1KB r3 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r2 = r0.A00
            r0 = 2131891025(0x7f121351, float:1.9416758E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131891024(0x7f121350, float:1.9416756E38)
        L_0x0160:
            java.lang.String r0 = r2.getString(r0)
            r3.A0M(r1, r0, r6)
            return
        L_0x0168:
            r0 = 421419(0x66e2b, float:5.90534E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r8.remove(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x018e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x018e
            X.1KB r3 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r2 = r0.A00
            r0 = 2131889973(0x7f120f35, float:1.9414625E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131889972(0x7f120f34, float:1.9414623E38)
            goto L_0x0160
        L_0x018e:
            r0 = 421(0x1a5, float:5.9E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            r0 = 409(0x199, float:5.73E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r8.remove(r0)
            r0 = 417(0x1a1, float:5.84E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r8.remove(r0)
            r0 = 451(0x1c3, float:6.32E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.remove(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x01d6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r12 = r16.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            r0 = 401(0x191, float:5.62E-43)
            if (r8 == r0) goto L_0x0398
            r0 = 402(0x192, float:5.63E-43)
            if (r8 == r0) goto L_0x02c5
            if (r8 == r5) goto L_0x0332
            if (r8 == r9) goto L_0x028a
            r0 = 408(0x198, float:5.72E-43)
            if (r8 == r0) goto L_0x03e9
            r0 = 421304(0x66db8, float:5.90373E-40)
            if (r8 == r0) goto L_0x023c
            r1.setLength(r6)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x020e:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.1BI r13 = (X.AnonymousClass1BI) r13
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r10 = 2131889949(0x7f120f1d, float:1.9414576E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            X.1Me r8 = r2.A03
            X.1M9 r0 = r2.A02
            X.1E7 r0 = r0.A0H(r13)
            java.lang.String r0 = r8.A0I(r0)
            r9[r6] = r0
            java.lang.String r0 = r11.getString(r10, r9)
            r1.append(r0)
            r1.append(r4)
            goto L_0x020e
        L_0x023c:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x025a
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131889971(0x7f120f33, float:1.941462E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131889996(0x7f120f4c, float:1.9414671E38)
            goto L_0x034e
        L_0x025a:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0278
            X.1KB r9 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r0 = 2131889971(0x7f120f33, float:1.941462E38)
            java.lang.String r8 = r10.getString(r0)
            r0 = 2131889954(0x7f120f22, float:1.9414586E38)
            goto L_0x038f
        L_0x0278:
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131890016(0x7f120f60, float:1.9414712E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131890015(0x7f120f5f, float:1.941471E38)
            goto L_0x0321
        L_0x028a:
            r1.setLength(r6)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x0297:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.1BI r13 = (X.AnonymousClass1BI) r13
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r10 = 2131889952(0x7f120f20, float:1.9414582E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            X.1Me r8 = r2.A03
            X.1M9 r0 = r2.A02
            X.1E7 r0 = r0.A0H(r13)
            java.lang.String r0 = r8.A0I(r0)
            r9[r6] = r0
            java.lang.String r0 = r11.getString(r10, r9)
            r1.append(r0)
            r1.append(r4)
            goto L_0x0297
        L_0x02c5:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x02e2
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131891096(0x7f121398, float:1.9416902E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131889997(0x7f120f4d, float:1.9414673E38)
            goto L_0x034e
        L_0x02e2:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0300
            X.1KB r9 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r0 = 2131891096(0x7f121398, float:1.9416902E38)
            java.lang.String r8 = r10.getString(r0)
            r0 = 2131889955(0x7f120f23, float:1.9414588E38)
            goto L_0x038f
        L_0x0300:
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131891154(0x7f1213d2, float:1.941702E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131890017(0x7f120f61, float:1.9414714E38)
            goto L_0x0321
        L_0x0311:
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131891154(0x7f1213d2, float:1.941702E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131890018(0x7f120f62, float:1.9414716E38)
        L_0x0321:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0368
        L_0x0332:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r7) goto L_0x0373
            X.1KB r10 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r0 = 2131891096(0x7f121398, float:1.9416902E38)
            java.lang.String r9 = r11.getString(r0)
            r13 = 2131889998(0x7f120f4e, float:1.9414675E38)
        L_0x034e:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            X.1Me r14 = r2.A03
            X.1M9 r15 = r2.A02
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r6)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r0 = r15.A0H(r0)
            java.lang.String r0 = r14.A0I(r0)
        L_0x0368:
            r8[r6] = r0
            java.lang.String r0 = r11.getString(r13, r8)
            r10.A0M(r9, r0, r6)
            goto L_0x0423
        L_0x0373:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0311
            X.1KB r9 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r0 = 2131891096(0x7f121398, float:1.9416902E38)
            java.lang.String r8 = r10.getString(r0)
            r0 = 2131889956(0x7f120f24, float:1.941459E38)
        L_0x038f:
            java.lang.String r0 = r10.getString(r0)
            r9.A0M(r8, r0, r6)
            goto L_0x0423
        L_0x0398:
            r1.setLength(r6)
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r14 = r0.iterator()
        L_0x03a5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r13 = r14.next()
            X.1BI r13 = (X.AnonymousClass1BI) r13
            X.118 r0 = r2.A04
            android.content.Context r11 = r0.A00
            r10 = 2131889950(0x7f120f1e, float:1.9414578E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            X.1Me r8 = r2.A03
            X.1M9 r0 = r2.A02
            X.1E7 r0 = r0.A0H(r13)
            java.lang.String r0 = r8.A0I(r0)
            r9[r6] = r0
            java.lang.String r0 = r11.getString(r10, r9)
            r1.append(r0)
            r1.append(r4)
            goto L_0x03a5
        L_0x03d3:
            java.lang.Object r0 = r12.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0423
            X.1KB r8 = r2.A00
            java.lang.String r0 = r1.toString()
            r8.A0L(r0, r6)
            goto L_0x0423
        L_0x03e9:
            java.lang.Object r13 = r12.getValue()
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0423
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0423
            int r11 = r13.size()
            X.118 r0 = r2.A04
            if (r11 != r7) goto L_0x0427
            android.content.Context r12 = r0.A00
            r11 = 2131889953(0x7f120f21, float:1.9414584E38)
            java.lang.Object[] r10 = new java.lang.Object[r7]
            X.1Me r9 = r2.A03
            X.1M9 r8 = r2.A02
            java.lang.Object r0 = r13.get(r6)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            X.1E7 r0 = r8.A0H(r0)
            java.lang.String r0 = r9.A0I(r0)
            r10[r6] = r0
            java.lang.String r8 = r12.getString(r11, r10)
        L_0x041e:
            X.1KB r0 = r2.A00
            r0.A0L(r8, r6)
        L_0x0423:
            r9 = 406(0x196, float:5.69E-43)
            goto L_0x01d6
        L_0x0427:
            android.content.Context r0 = r0.A00
            android.content.res.Resources r10 = r0.getResources()
            r9 = 2131755130(0x7f10007a, float:1.914113E38)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r8[r6] = r0
            java.lang.String r8 = r10.getQuantityString(r9, r11, r8)
            goto L_0x041e
        L_0x043d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r0 = r8.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x044e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a3
            java.lang.Object r10 = r13.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r8 = r10.getKey()
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/remove-participant/error/"
            r1.append(r0)
            r1.append(r8)
            r1.append(r11)
            java.lang.Object r0 = r10.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1M9 r0 = r2.A02
            X.1E7 r12 = r0.A0H(r8)
            if (r1 == r5) goto L_0x044e
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r8 = 2131890012(0x7f120f5c, float:1.9414704E38)
            if (r1 == r9) goto L_0x049c
            r8 = 2131890011(0x7f120f5b, float:1.9414702E38)
        L_0x049c:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.1Me r0 = r2.A03
            java.lang.String r0 = r0.A0I(r12)
            r1[r6] = r0
            java.lang.String r0 = r10.getString(r8, r1)
            r3.append(r0)
            r3.append(r4)
            goto L_0x044e
        L_0x04b1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r0 = r8.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x04c2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r10 = r13.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r9 = r10.getKey()
            X.1BI r9 = (X.AnonymousClass1BI) r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "groupmgr/add-admins/error/"
            r8.append(r0)
            r8.append(r9)
            r8.append(r11)
            java.lang.Object r0 = r10.getValue()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r8 = r0.intValue()
            X.1M9 r0 = r2.A02
            X.1E7 r12 = r0.A0H(r9)
            if (r8 == r5) goto L_0x0522
            if (r8 != r1) goto L_0x0522
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r9 = 2131899028(0x7f123294, float:1.943299E38)
        L_0x050d:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            X.1Me r0 = r2.A03
            java.lang.String r0 = r0.A0I(r12)
            r8[r6] = r0
            java.lang.String r0 = r10.getString(r9, r8)
            r3.append(r0)
            r3.append(r4)
            goto L_0x04c2
        L_0x0522:
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r9 = 2131889949(0x7f120f1d, float:1.9414576E38)
            goto L_0x050d
        L_0x052a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r0 = r8.obj
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x053b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05a9
            java.lang.Object r10 = r13.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r8 = r10.getKey()
            X.1BI r8 = (X.AnonymousClass1BI) r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupmgr/remove-admins/error/"
            r1.append(r0)
            r1.append(r8)
            r1.append(r11)
            java.lang.Object r0 = r10.getValue()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.1M9 r0 = r2.A02
            X.1E7 r12 = r0.A0H(r8)
            if (r1 == r5) goto L_0x059b
            if (r1 != r9) goto L_0x059b
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r8 = 2131890009(0x7f120f59, float:1.9414698E38)
        L_0x0586:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.1Me r0 = r2.A03
            java.lang.String r0 = r0.A0I(r12)
            r1[r6] = r0
            java.lang.String r0 = r10.getString(r8, r1)
            r3.append(r0)
            r3.append(r4)
            goto L_0x053b
        L_0x059b:
            X.118 r0 = r2.A04
            android.content.Context r10 = r0.A00
            r8 = 2131890011(0x7f120f5b, float:1.9414702E38)
            goto L_0x0586
        L_0x05a3:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x002f
        L_0x05a9:
            X.1KB r1 = r2.A00
            java.lang.String r0 = r3.toString()
            r1.A0L(r0, r6)
            return
        L_0x05b3:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1M9 r0 = r2.A02
            X.1E7 r5 = r0.A0G(r1)
            if (r5 == 0) goto L_0x002f
            X.1KB r4 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890317(0x7f12108d, float:1.9415322E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r5.A0K()
            r1[r6] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            r4.A0G(r0, r6)
            return
        L_0x05d8:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval request"
            goto L_0x0792
        L_0x05dc:
            X.1KB r1 = r2.A00
            r0 = 2131889974(0x7f120f36, float:1.9414627E38)
            goto L_0x071b
        L_0x05e3:
            java.lang.String r0 = "groupmgr/handle groupchat membership approval mode change"
            goto L_0x0792
        L_0x05e7:
            java.lang.String r0 = "groupmgr/handle group member add mode change"
            goto L_0x0792
        L_0x05eb:
            X.1KB r1 = r2.A00
            r0 = 2131889975(0x7f120f37, float:1.9414629E38)
            goto L_0x071b
        L_0x05f2:
            java.lang.String r0 = "groupmgr/handle groupchat description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r8.obj
            X.206 r3 = (X.AnonymousClass206) r3
            X.121 r0 = r2.A06
            r0.CQw(r3)
            goto L_0x079e
        L_0x0602:
            java.lang.String r0 = "groupmgr/handle groupchat no frequently forwarded change"
            goto L_0x0792
        L_0x0606:
            java.lang.String r0 = "groupmgr/handle groupchat ephemeral setting changed"
            goto L_0x0792
        L_0x060a:
            X.1KB r1 = r2.A00
            r0 = 2131890328(0x7f121098, float:1.9415345E38)
            goto L_0x071b
        L_0x0611:
            X.1KB r1 = r2.A00
            r0 = 2131890329(0x7f121099, float:1.9415347E38)
            goto L_0x071b
        L_0x0618:
            X.1KB r1 = r2.A00
            r0 = 2131890327(0x7f121097, float:1.9415343E38)
            goto L_0x071b
        L_0x061f:
            X.1KB r1 = r2.A00
            r0 = 2131890973(0x7f12131d, float:1.9416653E38)
            goto L_0x071b
        L_0x0626:
            java.lang.String r0 = "groupmgr/handle groupchat description change"
            goto L_0x0792
        L_0x062a:
            java.lang.String r0 = "groupmgr/handle groupchat restrict mode change"
            goto L_0x0792
        L_0x062e:
            X.1KB r4 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890979(0x7f121323, float:1.9416665E38)
            goto L_0x0671
        L_0x0638:
            X.1KB r4 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890981(0x7f121325, float:1.941667E38)
            goto L_0x0671
        L_0x0642:
            X.1KB r4 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890982(0x7f121326, float:1.9416671E38)
            goto L_0x0671
        L_0x064c:
            X.1KB r1 = r2.A00
            r0 = 2131890990(0x7f12132e, float:1.9416687E38)
            goto L_0x071b
        L_0x0653:
            X.1KB r1 = r2.A00
            r0 = 2131890992(0x7f121330, float:1.9416691E38)
            goto L_0x071b
        L_0x065a:
            X.1KB r1 = r2.A00
            r0 = 2131890993(0x7f121331, float:1.9416693E38)
            goto L_0x071b
        L_0x0661:
            X.1KB r1 = r2.A00
            r0 = 2131890991(0x7f12132f, float:1.941669E38)
            goto L_0x071b
        L_0x0668:
            X.1KB r4 = r2.A00
            X.118 r0 = r2.A04
            android.content.Context r3 = r0.A00
            r2 = 2131890980(0x7f121324, float:1.9416667E38)
        L_0x0671:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r8.obj
            r1[r6] = r0
            java.lang.String r0 = r3.getString(r2, r1)
            goto L_0x0698
        L_0x067c:
            X.18O r1 = r2.A01
            X.18Q r0 = X.AnonymousClass18O.A11
            int r0 = r1.A04(r0)
            X.1KB r4 = r2.A00
            X.0vb r8 = r2.A05
            r5 = 2131755517(0x7f1001fd, float:1.9141916E38)
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = r8.A0K(r3, r5, r1)
        L_0x0698:
            r4.A0L(r0, r6)
            return
        L_0x069c:
            X.1KB r1 = r2.A00
            r0 = 2131890969(0x7f121319, float:1.9416645E38)
            goto L_0x071b
        L_0x06a2:
            X.1KB r1 = r2.A00
            r0 = 2131890971(0x7f12131b, float:1.9416649E38)
            goto L_0x071b
        L_0x06a8:
            X.1KB r1 = r2.A00
            r0 = 2131890972(0x7f12131c, float:1.941665E38)
            goto L_0x071b
        L_0x06ae:
            X.1KB r1 = r2.A00
            r0 = 2131890968(0x7f121318, float:1.9416643E38)
            r1.A06(r0, r6)
        L_0x06b6:
            X.1KB r1 = r2.A00
            r0 = 2131890970(0x7f12131a, float:1.9416647E38)
            goto L_0x071b
        L_0x06bc:
            X.1KB r1 = r2.A00
            r0 = 2131890994(0x7f121332, float:1.9416696E38)
            goto L_0x071b
        L_0x06c2:
            X.1KB r1 = r2.A00
            r0 = 2131890996(0x7f121334, float:1.94167E38)
            goto L_0x071b
        L_0x06c8:
            X.1KB r1 = r2.A00
            r0 = 2131890997(0x7f121335, float:1.9416702E38)
            goto L_0x071b
        L_0x06ce:
            X.1KB r1 = r2.A00
            r0 = 2131890995(0x7f121333, float:1.9416698E38)
            goto L_0x071b
        L_0x06d4:
            X.1KB r1 = r2.A00
            r0 = 2131890974(0x7f12131e, float:1.9416655E38)
            goto L_0x071b
        L_0x06da:
            X.1KB r1 = r2.A00
            r0 = 2131890976(0x7f121320, float:1.941666E38)
            goto L_0x071b
        L_0x06e0:
            X.1KB r1 = r2.A00
            r0 = 2131890977(0x7f121321, float:1.9416661E38)
            goto L_0x071b
        L_0x06e6:
            X.1KB r1 = r2.A00
            r0 = 2131890975(0x7f12131f, float:1.9416657E38)
            goto L_0x071b
        L_0x06ec:
            X.1KB r1 = r2.A00
            r0 = 2131890987(0x7f12132b, float:1.9416681E38)
            goto L_0x071b
        L_0x06f2:
            X.1KB r1 = r2.A00
            r0 = 2131890989(0x7f12132d, float:1.9416685E38)
            goto L_0x071b
        L_0x06f8:
            X.1KB r1 = r2.A00
            r0 = 2131890988(0x7f12132c, float:1.9416683E38)
            goto L_0x071b
        L_0x06fe:
            X.1KB r1 = r2.A00
            r0 = 2131890986(0x7f12132a, float:1.941668E38)
            goto L_0x071b
        L_0x0704:
            X.1KB r1 = r2.A00
            r0 = 2131890978(0x7f121322, float:1.9416663E38)
            goto L_0x071b
        L_0x070a:
            X.1KB r1 = r2.A00
            r0 = 2131889107(0x7f120bd3, float:1.9412868E38)
            goto L_0x071b
        L_0x0710:
            X.1KB r1 = r2.A00
            r0 = 2131891599(0x7f12158f, float:1.9417923E38)
            goto L_0x071b
        L_0x0716:
            X.1KB r1 = r2.A00
            r0 = 2131889976(0x7f120f38, float:1.941463E38)
        L_0x071b:
            r1.A06(r0, r6)
            return
        L_0x071f:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            X.1KB r1 = r2.A00
            r0 = 2131890969(0x7f121319, float:1.9416645E38)
            goto L_0x0769
        L_0x072e:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            X.1KB r1 = r2.A00
            r0 = 2131890994(0x7f121332, float:1.9416696E38)
            goto L_0x0769
        L_0x073d:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            X.1KB r1 = r2.A00
            r0 = 2131890974(0x7f12131e, float:1.9416655E38)
            goto L_0x0769
        L_0x074c:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            X.1KB r1 = r2.A00
            r0 = 2131890990(0x7f12132e, float:1.9416687E38)
            goto L_0x0769
        L_0x075b:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            X.1KB r1 = r2.A00
            r0 = 2131890978(0x7f121322, float:1.9416663E38)
        L_0x0769:
            r1.A08(r0, r6)
            return
        L_0x076d:
            X.1V0 r3 = r2.A0A
            java.lang.Object r2 = r8.obj
            r1 = 49
            X.35V r0 = new X.35V
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x077c:
            java.lang.Object r1 = r8.obj
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Uw r0 = r2.A09
            r0.A02(r1)
            return
        L_0x0786:
            java.lang.String r0 = "groupmgr/conversations/leave group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r3 = r8.obj
            X.206 r3 = (X.AnonymousClass206) r3
            goto L_0x079e
        L_0x0790:
            java.lang.String r0 = "groupmgr/handle groupchat report to admin status change"
        L_0x0792:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0795:
            java.lang.Object r3 = r8.obj
            X.206 r3 = (X.AnonymousClass206) r3
            X.121 r0 = r2.A06
            r0.BBM(r3)
        L_0x079e:
            X.1Uw r1 = r2.A09
            X.205 r0 = r3.A0v
            X.1BI r0 = r0.A00
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V5.handleMessage(android.os.Message):void");
    }

    public AnonymousClass1V5(AnonymousClass1KB r2, AnonymousClass18O r3, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass118 r6, C18000vb r7, AnonymousClass121 r8, AnonymousClass1MZ r9, C18030ve r10, C27141Uw r11, AnonymousClass1V0 r12) {
        super(Looper.getMainLooper());
        this.A08 = r10;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        this.A07 = r9;
        this.A0A = r12;
    }
}
