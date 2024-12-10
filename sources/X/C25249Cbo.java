package X;

/* renamed from: X.Cbo  reason: case insensitive filesystem */
public abstract class C25249Cbo {
    public int A00;
    public C24828CLw A01;
    public final EAP A02;

    public int A00() {
        int readInt;
        boolean z = this instanceof C24026BuC;
        A01();
        if (z) {
            EAP eap = this.A02;
            eap.readInt();
            readInt = eap.readInt() * this.A01.A00[((C24359Bzu) AnonymousClass000.A0w(C24359Bzu.A00, eap.readByte() & 255)).typeId];
            byte[] bArr = new byte[readInt];
            DPX dpx = (DPX) eap;
            dpx.A00.CDM(bArr);
            dpx.A01.write(new byte[bArr.length]);
        } else {
            EAP eap2 = this.A02;
            eap2.readInt();
            readInt = eap2.readInt() * this.A01.A00[((C24359Bzu) AnonymousClass000.A0w(C24359Bzu.A00, eap2.readByte() & 255)).typeId];
            A03((long) readInt);
        }
        return this.A00 + 4 + 4 + 1 + readInt;
    }

    public long A01() {
        int i;
        int i2 = this.A00;
        if (i2 == 1) {
            i = this.A02.readByte();
        } else if (i2 == 2) {
            i = this.A02.readShort();
        } else if (i2 == 4) {
            i = this.A02.readInt();
        } else if (i2 == 8) {
            return this.A02.readLong();
        } else {
            throw AnonymousClass000.A0k("ID Length must be 1, 2, 4, or 8");
        }
        return (long) i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CLw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r13v6, types: [X.C5U, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0315, code lost:
        A01();
        r8.readInt();
        r8.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x031e, code lost:
        r11 = (r9.A00 + 4) + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r18 = this;
            X.CLw r0 = new X.CLw
            r0.<init>()
            r9 = r18
            r9.A01 = r0
        L_0x0009:
            X.EAP r8 = r9.A02     // Catch:{ EOFException -> 0x037c }
            byte r0 = r8.readByte()     // Catch:{ EOFException -> 0x037c }
            if (r0 != 0) goto L_0x0009
            int r3 = r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r9.A00 = r3     // Catch:{ EOFException -> 0x037c }
            X.CLw r5 = r9.A01     // Catch:{ EOFException -> 0x037c }
            r6 = -1
            r4 = 0
            r2 = 0
            r1 = -1
        L_0x001d:
            X.Bzu[] r0 = X.C24359Bzu.values()     // Catch:{ EOFException -> 0x037c }
            int r0 = r0.length     // Catch:{ EOFException -> 0x037c }
            if (r2 >= r0) goto L_0x0033
            X.Bzu[] r0 = X.C24359Bzu.values()     // Catch:{ EOFException -> 0x037c }
            r0 = r0[r2]     // Catch:{ EOFException -> 0x037c }
            int r0 = r0.typeId     // Catch:{ EOFException -> 0x037c }
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ EOFException -> 0x037c }
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0033:
            int r0 = r1 + 1
            int[] r0 = new int[r0]     // Catch:{ EOFException -> 0x037c }
            r5.A00 = r0     // Catch:{ EOFException -> 0x037c }
            java.util.Arrays.fill(r0, r6)     // Catch:{ EOFException -> 0x037c }
        L_0x003c:
            X.Bzu[] r0 = X.C24359Bzu.values()     // Catch:{ EOFException -> 0x037c }
            int r0 = r0.length     // Catch:{ EOFException -> 0x037c }
            int[] r2 = r5.A00     // Catch:{ EOFException -> 0x037c }
            if (r4 >= r0) goto L_0x005a
            X.Bzu[] r0 = X.C24359Bzu.values()     // Catch:{ EOFException -> 0x037c }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x037c }
            int r1 = r0.typeId     // Catch:{ EOFException -> 0x037c }
            X.Bzu[] r0 = X.C24359Bzu.values()     // Catch:{ EOFException -> 0x037c }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x037c }
            int r0 = r0.size     // Catch:{ EOFException -> 0x037c }
            r2[r1] = r0     // Catch:{ EOFException -> 0x037c }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005a:
            X.Bzu r10 = X.C24359Bzu.A09     // Catch:{ EOFException -> 0x037c }
            int r0 = r10.typeId     // Catch:{ EOFException -> 0x037c }
            r2[r0] = r3     // Catch:{ EOFException -> 0x037c }
            r8.readLong()     // Catch:{ EOFException -> 0x037c }
        L_0x0063:
            boolean r0 = r8.Bcp()     // Catch:{ EOFException -> 0x037c }
            if (r0 == 0) goto L_0x037c
            byte r0 = r8.readByte()     // Catch:{ EOFException -> 0x037c }
            r1 = r0 & 255(0xff, float:3.57E-43)
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            int r0 = r8.readInt()     // Catch:{ EOFException -> 0x037c }
            long r4 = X.BE7.A0C(r0)
            r0 = 12
            if (r1 == r0) goto L_0x0086
            r0 = 28
            if (r1 == r0) goto L_0x0086
            r9.A03(r4)     // Catch:{ EOFException -> 0x037c }
            goto L_0x0063
        L_0x0086:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            byte r0 = r8.readByte()     // Catch:{ EOFException -> 0x037c }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r0 = 1
            long r4 = r4 - r0
            r0 = 144(0x90, float:2.02E-43)
            if (r3 == r0) goto L_0x0340
            r0 = 195(0xc3, float:2.73E-43)
            if (r3 == r0) goto L_0x036b
            r0 = 254(0xfe, float:3.56E-43)
            if (r3 == r0) goto L_0x0335
            r0 = 255(0xff, float:3.57E-43)
            if (r3 == r0) goto L_0x0340
            switch(r3) {
                case 1: goto L_0x0325;
                case 2: goto L_0x030a;
                case 3: goto L_0x030a;
                case 4: goto L_0x02ff;
                case 5: goto L_0x0340;
                case 6: goto L_0x02ff;
                case 7: goto L_0x0340;
                case 8: goto L_0x0315;
                default: goto L_0x00a8;
            }     // Catch:{ EOFException -> 0x037c }
        L_0x00a8:
            switch(r3) {
                case 32: goto L_0x014f;
                case 33: goto L_0x00b0;
                case 34: goto L_0x02e2;
                case 35: goto L_0x02dd;
                default: goto L_0x00ab;
            }     // Catch:{ EOFException -> 0x037c }
        L_0x00ab:
            switch(r3) {
                case 137: goto L_0x0340;
                case 138: goto L_0x0340;
                case 139: goto L_0x0340;
                case 140: goto L_0x0340;
                case 141: goto L_0x0340;
                case 142: goto L_0x0315;
                default: goto L_0x00ae;
            }     // Catch:{ EOFException -> 0x037c }
        L_0x00ae:
            goto L_0x034c
        L_0x00b0:
            boolean r0 = r9 instanceof X.C24026BuC     // Catch:{ EOFException -> 0x037c }
            if (r0 == 0) goto L_0x0134
            r3 = r9
            X.BuC r3 = (X.C24026BuC) r3     // Catch:{ EOFException -> 0x037c }
            r3.A01()     // Catch:{ EOFException -> 0x037c }
            X.EAP r2 = r3.A02     // Catch:{ EOFException -> 0x037c }
            r2.readInt()     // Catch:{ EOFException -> 0x037c }
            long r11 = r3.A01()     // Catch:{ EOFException -> 0x037c }
            int r15 = r2.readInt()     // Catch:{ EOFException -> 0x037c }
            X.CLv r0 = r3.A00     // Catch:{ EOFException -> 0x037c }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ EOFException -> 0x037c }
            java.util.Map r7 = r0.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ EOFException -> 0x037c }
        L_0x00d3:
            java.lang.Object r14 = r7.get(r0)     // Catch:{ EOFException -> 0x037c }
            X.C5U r14 = (X.C5U) r14     // Catch:{ EOFException -> 0x037c }
            r13.add(r14)     // Catch:{ EOFException -> 0x037c }
            if (r14 == 0) goto L_0x00ed
            long r0 = r14.A01     // Catch:{ EOFException -> 0x037c }
            r11 = 0
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00ed
            long r0 = r14.A01     // Catch:{ EOFException -> 0x037c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ EOFException -> 0x037c }
            goto L_0x00d3
        L_0x00ed:
            java.util.Iterator r11 = r13.iterator()     // Catch:{ EOFException -> 0x037c }
        L_0x00f1:
            boolean r0 = r11.hasNext()     // Catch:{ EOFException -> 0x037c }
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r11.next()     // Catch:{ EOFException -> 0x037c }
            X.C5U r0 = (X.C5U) r0     // Catch:{ EOFException -> 0x037c }
            java.util.List r0 = r0.A02     // Catch:{ EOFException -> 0x037c }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ EOFException -> 0x037c }
        L_0x0103:
            boolean r0 = r7.hasNext()     // Catch:{ EOFException -> 0x037c }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r7.next()     // Catch:{ EOFException -> 0x037c }
            X.Bzu r0 = (X.C24359Bzu) r0     // Catch:{ EOFException -> 0x037c }
            if (r0 != r10) goto L_0x0115
            r3.A01()     // Catch:{ EOFException -> 0x037c }
            goto L_0x0103
        L_0x0115:
            r6 = r2
            X.DPX r6 = (X.DPX) r6     // Catch:{ EOFException -> 0x037c }
            int r0 = r0.size     // Catch:{ EOFException -> 0x037c }
            byte[] r1 = new byte[r0]     // Catch:{ EOFException -> 0x037c }
            X.EAP r0 = r6.A00     // Catch:{ EOFException -> 0x037c }
            r0.CDM(r1)     // Catch:{ EOFException -> 0x037c }
            int r0 = r1.length     // Catch:{ EOFException -> 0x037c }
            byte[] r1 = new byte[r0]     // Catch:{ EOFException -> 0x037c }
            java.io.DataOutputStream r0 = r6.A01     // Catch:{ EOFException -> 0x037c }
            r0.write(r1)     // Catch:{ EOFException -> 0x037c }
            goto L_0x0103
        L_0x012a:
            int r1 = r3.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r1 + 4
            int r0 = r0 + r1
            int r11 = r0 + 4
            int r11 = r11 + r15
            goto L_0x0348
        L_0x0134:
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            int r2 = r8.readInt()     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r2     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r1 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r1 + 4
            int r0 = r0 + r1
            int r11 = r0 + 4
            int r11 = r11 + r2
            goto L_0x0348
        L_0x014f:
            boolean r0 = r9 instanceof X.C24026BuC     // Catch:{ EOFException -> 0x037c }
            if (r0 == 0) goto L_0x0204
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 * 7
            int r0 = r0 + 4
            int r0 = r0 + 4
            short r7 = r8.readShort()     // Catch:{ EOFException -> 0x037c }
            r13 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r13
            int r12 = r0 + 2
            r3 = 0
            r6 = 0
        L_0x0182:
            if (r6 >= r7) goto L_0x01a9
            r8.readShort()     // Catch:{ EOFException -> 0x037c }
            byte r0 = r8.readByte()     // Catch:{ EOFException -> 0x037c }
            r1 = r0 & 255(0xff, float:3.57E-43)
            java.util.Map r0 = X.C24359Bzu.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Object r2 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ EOFException -> 0x037c }
            X.Bzu r2 = (X.C24359Bzu) r2     // Catch:{ EOFException -> 0x037c }
            X.CLw r0 = r9.A01     // Catch:{ EOFException -> 0x037c }
            int[] r1 = r0.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r2.typeId     // Catch:{ EOFException -> 0x037c }
            r2 = r1[r0]     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r2     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r0 = r2 + 1
            int r0 = r0 + 2
            int r12 = r12 + r0
            int r6 = r6 + 1
            goto L_0x0182
        L_0x01a9:
            short r11 = r8.readShort()     // Catch:{ EOFException -> 0x037c }
            r11 = r11 & r13
            int r7 = r12 + 2
            r6 = 0
        L_0x01b1:
            if (r6 >= r11) goto L_0x01ed
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            byte r1 = r8.readByte()     // Catch:{ EOFException -> 0x037c }
            java.util.Map r0 = X.C24359Bzu.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Object r12 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ EOFException -> 0x037c }
            X.Bzu r12 = (X.C24359Bzu) r12     // Catch:{ EOFException -> 0x037c }
            if (r12 != r10) goto L_0x01d8
            r9.A01()     // Catch:{ EOFException -> 0x037c }
        L_0x01c7:
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r2 = r0 + 1
            X.CLw r0 = r9.A01     // Catch:{ EOFException -> 0x037c }
            int[] r1 = r0.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r12.typeId     // Catch:{ EOFException -> 0x037c }
            int r7 = X.BE6.A0J(r1, r0, r2, r7)     // Catch:{ EOFException -> 0x037c }
            int r6 = r6 + 1
            goto L_0x01b1
        L_0x01d8:
            r2 = r8
            X.DPX r2 = (X.DPX) r2     // Catch:{ EOFException -> 0x037c }
            int r0 = r12.size     // Catch:{ EOFException -> 0x037c }
            byte[] r1 = new byte[r0]     // Catch:{ EOFException -> 0x037c }
            X.EAP r0 = r2.A00     // Catch:{ EOFException -> 0x037c }
            r0.CDM(r1)     // Catch:{ EOFException -> 0x037c }
            int r0 = r1.length     // Catch:{ EOFException -> 0x037c }
            byte[] r1 = new byte[r0]     // Catch:{ EOFException -> 0x037c }
            java.io.DataOutputStream r0 = r2.A01     // Catch:{ EOFException -> 0x037c }
            r0.write(r1)     // Catch:{ EOFException -> 0x037c }
            goto L_0x01c7
        L_0x01ed:
            short r1 = r8.readShort()     // Catch:{ EOFException -> 0x037c }
            r1 = r1 & r13
            int r11 = r7 + 2
        L_0x01f4:
            if (r3 >= r1) goto L_0x0348
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readByte()     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 + 1
            int r11 = r11 + r0
            int r3 = r3 + 1
            goto L_0x01f4
        L_0x0204:
            r12 = r9
            X.BuB r12 = (X.C24025BuB) r12     // Catch:{ EOFException -> 0x037c }
            long r6 = r12.A01()     // Catch:{ EOFException -> 0x037c }
            X.EAP r0 = r12.A02     // Catch:{ EOFException -> 0x037c }
            r17 = r0
            r17.readInt()     // Catch:{ EOFException -> 0x037c }
            long r2 = r12.A01()     // Catch:{ EOFException -> 0x037c }
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            r17.readInt()     // Catch:{ EOFException -> 0x037c }
            int r0 = r12.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 * 7
            int r0 = r0 + 4
            int r0 = r0 + 4
            short r13 = r17.readShort()     // Catch:{ EOFException -> 0x037c }
            r16 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r16
            int r15 = r0 + 2
            r11 = 0
        L_0x023c:
            if (r11 >= r13) goto L_0x0263
            r17.readShort()     // Catch:{ EOFException -> 0x037c }
            byte r0 = r17.readByte()     // Catch:{ EOFException -> 0x037c }
            r1 = r0 & 255(0xff, float:3.57E-43)
            java.util.Map r0 = X.C24359Bzu.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Object r14 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ EOFException -> 0x037c }
            X.Bzu r14 = (X.C24359Bzu) r14     // Catch:{ EOFException -> 0x037c }
            X.CLw r0 = r12.A01     // Catch:{ EOFException -> 0x037c }
            int[] r1 = r0.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r14.typeId     // Catch:{ EOFException -> 0x037c }
            r14 = r1[r0]     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r14     // Catch:{ EOFException -> 0x037c }
            r12.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r0 = r14 + 1
            int r0 = r0 + 2
            int r15 = r15 + r0
            int r11 = r11 + 1
            goto L_0x023c
        L_0x0263:
            short r14 = r17.readShort()     // Catch:{ EOFException -> 0x037c }
            r14 = r14 & r16
            int r15 = r15 + 2
            r13 = 0
        L_0x026c:
            if (r13 >= r14) goto L_0x029a
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            byte r1 = r17.readByte()     // Catch:{ EOFException -> 0x037c }
            java.util.Map r0 = X.C24359Bzu.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Object r11 = X.AnonymousClass000.A0w(r0, r1)     // Catch:{ EOFException -> 0x037c }
            X.Bzu r11 = (X.C24359Bzu) r11     // Catch:{ EOFException -> 0x037c }
            X.CLw r0 = r12.A01     // Catch:{ EOFException -> 0x037c }
            int[] r1 = r0.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r11.typeId     // Catch:{ EOFException -> 0x037c }
            r0 = r1[r0]     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x037c }
            r12.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r0 = r12.A00     // Catch:{ EOFException -> 0x037c }
            int r1 = r0 + 1
            X.CLw r0 = r12.A01     // Catch:{ EOFException -> 0x037c }
            int[] r0 = r0.A00     // Catch:{ EOFException -> 0x037c }
            int r11 = r11.typeId     // Catch:{ EOFException -> 0x037c }
            int r15 = X.BE6.A0J(r0, r11, r1, r15)     // Catch:{ EOFException -> 0x037c }
            int r13 = r13 + 1
            goto L_0x026c
        L_0x029a:
            short r13 = r17.readShort()     // Catch:{ EOFException -> 0x037c }
            r13 = r13 & r16
            X.Bzu[] r14 = new X.C24359Bzu[r13]     // Catch:{ EOFException -> 0x037c }
            int r11 = r15 + 2
            r1 = 0
        L_0x02a5:
            if (r1 >= r13) goto L_0x02c0
            r12.A01()     // Catch:{ EOFException -> 0x037c }
            byte r0 = r17.readByte()     // Catch:{ EOFException -> 0x037c }
            r15 = r0 & 255(0xff, float:3.57E-43)
            java.util.Map r0 = X.C24359Bzu.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r15)     // Catch:{ EOFException -> 0x037c }
            r14[r1] = r0     // Catch:{ EOFException -> 0x037c }
            int r0 = r12.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 + 1
            int r11 = r11 + r0
            int r1 = r1 + 1
            goto L_0x02a5
        L_0x02c0:
            X.C5U r13 = new X.C5U     // Catch:{ EOFException -> 0x037c }
            r13.<init>()     // Catch:{ EOFException -> 0x037c }
            r13.A00 = r6     // Catch:{ EOFException -> 0x037c }
            r13.A01 = r2     // Catch:{ EOFException -> 0x037c }
            java.util.List r0 = java.util.Arrays.asList(r14)     // Catch:{ EOFException -> 0x037c }
            r13.A02 = r0     // Catch:{ EOFException -> 0x037c }
            X.CLv r0 = r12.A00     // Catch:{ EOFException -> 0x037c }
            java.util.Map r2 = r0.A00     // Catch:{ EOFException -> 0x037c }
            long r0 = r13.A00     // Catch:{ EOFException -> 0x037c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ EOFException -> 0x037c }
            r2.put(r0, r13)     // Catch:{ EOFException -> 0x037c }
            goto L_0x0348
        L_0x02dd:
            int r11 = r9.A00()     // Catch:{ EOFException -> 0x037c }
            goto L_0x0348
        L_0x02e2:
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            int r2 = r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r2 = r2 * r0
            long r0 = (long) r2     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r1 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r1 + 4
            int r11 = r0 + 4
            int r11 = r11 + r1
            int r11 = r11 + r2
            goto L_0x0348
        L_0x02ff:
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r11 = r0 + 4
            goto L_0x0348
        L_0x030a:
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 + 4
            int r0 = r0 + 4
            long r0 = (long) r0     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            goto L_0x031e
        L_0x0315:
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
        L_0x031e:
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r0 = r0 + 4
            int r11 = r0 + 4
            goto L_0x0348
        L_0x0325:
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x037c }
            long r4 = r4 - r0
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            int r11 = r9.A00     // Catch:{ EOFException -> 0x037c }
            goto L_0x0348
        L_0x0335:
            r8.readInt()     // Catch:{ EOFException -> 0x037c }
            r9.A01()     // Catch:{ EOFException -> 0x037c }
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            int r11 = r0 + 4
            goto L_0x0348
        L_0x0340:
            int r0 = r9.A00     // Catch:{ EOFException -> 0x037c }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x037c }
            r9.A03(r0)     // Catch:{ EOFException -> 0x037c }
            int r11 = r9.A00     // Catch:{ EOFException -> 0x037c }
        L_0x0348:
            long r0 = (long) r11     // Catch:{ EOFException -> 0x037c }
            long r4 = r4 - r0
            goto L_0x0086
        L_0x034c:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x037c }
            java.lang.String r0 = "loadHeapDump loop with unknown tag "
            r2.append(r0)     // Catch:{ EOFException -> 0x037c }
            r2.append(r3)     // Catch:{ EOFException -> 0x037c }
            java.lang.String r0 = " with "
            r2.append(r0)     // Catch:{ EOFException -> 0x037c }
            long r0 = r8.CEP()     // Catch:{ EOFException -> 0x037c }
            r2.append(r0)     // Catch:{ EOFException -> 0x037c }
            java.lang.String r0 = " bytes possibly remaining"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r2)     // Catch:{ EOFException -> 0x037c }
            goto L_0x037b
        L_0x036b:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ EOFException -> 0x037c }
            java.lang.String r0 = "+--- PRIMITIVE ARRAY NODATA DUMP"
            r1.println(r0)     // Catch:{ EOFException -> 0x037c }
            r9.A00()     // Catch:{ EOFException -> 0x037c }
            java.lang.String r0 = "Don't know how to load a nodata array"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ EOFException -> 0x037c }
        L_0x037b:
            throw r0     // Catch:{ EOFException -> 0x037c }
        L_0x037c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25249Cbo.A02():void");
    }

    public void A03(long j) {
        EAP eap = this.A02;
        eap.CK2(eap.position() + j);
    }

    public C25249Cbo(EAP eap) {
        this.A02 = eap;
    }
}
