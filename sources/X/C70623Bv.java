package X;

/* renamed from: X.3Bv  reason: invalid class name and case insensitive filesystem */
public class C70623Bv implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70623Bv(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.700} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.70L} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: X.700} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: X.700} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r5v2, types: [X.231, X.23L, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r6.A08 == 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ec, code lost:
        if (X.C18020vd.A05(r5, r6, 9816) == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0332, code lost:
        r4.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0335, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x055f, code lost:
        r0.A05(r1, r2, com.whatsapp.SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME, r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0565, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05c2, code lost:
        r1 = java.util.Collections.singletonList(r1);
        r0 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05c8, code lost:
        X.AnonymousClass35V.A00(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x05cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05e3, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05e7, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0653, code lost:
        r4.notifyAllObservers(new X.AnonymousClass35W((java.util.Collection) r3, r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x065b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x06c0, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0800, code lost:
        r1 = new X.C146437Pc(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0805, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0808, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1 = 9;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2.notifyAllObservers(new X.AnonymousClass35V(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r6.A08 != -1) goto L_0x0033;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x070e;
                case 1: goto L_0x070e;
                case 2: goto L_0x0424;
                case 3: goto L_0x06fe;
                case 4: goto L_0x06ad;
                case 5: goto L_0x0409;
                case 6: goto L_0x03c2;
                case 7: goto L_0x0352;
                case 8: goto L_0x065c;
                case 9: goto L_0x063c;
                case 10: goto L_0x0624;
                case 11: goto L_0x0612;
                case 12: goto L_0x05e8;
                case 13: goto L_0x05cc;
                case 14: goto L_0x0336;
                case 15: goto L_0x0283;
                case 16: goto L_0x0277;
                case 17: goto L_0x026b;
                case 18: goto L_0x05b6;
                case 19: goto L_0x025f;
                case 20: goto L_0x05ad;
                case 21: goto L_0x0235;
                case 22: goto L_0x022b;
                case 23: goto L_0x059c;
                case 24: goto L_0x020c;
                case 25: goto L_0x0200;
                case 26: goto L_0x0277;
                case 27: goto L_0x058d;
                case 28: goto L_0x022b;
                case 29: goto L_0x01f1;
                case 30: goto L_0x0578;
                case 31: goto L_0x0566;
                case 32: goto L_0x07ee;
                case 33: goto L_0x054b;
                case 34: goto L_0x053b;
                case 35: goto L_0x0007;
                case 36: goto L_0x0007;
                case 37: goto L_0x0007;
                case 38: goto L_0x07b8;
                case 39: goto L_0x0528;
                case 40: goto L_0x051a;
                case 41: goto L_0x01da;
                case 42: goto L_0x006d;
                case 43: goto L_0x001a;
                case 44: goto L_0x0505;
                case 45: goto L_0x04a2;
                case 46: goto L_0x048c;
                case 47: goto L_0x0480;
                case 48: goto L_0x0474;
                case 49: goto L_0x042f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r4.A01
            X.1PM r0 = (X.AnonymousClass1PM) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A01
        L_0x000f:
            r1 = 9
        L_0x0011:
            X.35V r0 = new X.35V
            r0.<init>(r4, r1)
            r2.notifyAllObservers(r0)
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r5 = r4.A01
            X.1Tv r5 = (X.C26881Tv) r5
            java.lang.Object r7 = r4.A02
            X.1BI r7 = (X.AnonymousClass1BI) r7
            X.1M9 r0 = r5.A01
            X.1E7 r6 = r0.A0H(r7)
            int r2 = r6.A07
            r9 = 1
            r1 = -1
            if (r2 != r1) goto L_0x0033
            int r0 = r6.A08
            r3 = 1
            if (r0 == r1) goto L_0x006b
        L_0x0033:
            r3 = 0
            if (r2 != 0) goto L_0x006b
            int r0 = r6.A08
            if (r0 != 0) goto L_0x006b
        L_0x003a:
            X.1Lr r0 = r5.A03
            r0.A03(r6)
            r5.A01(r6, r1, r1)
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r2 = r6.A06(r0)
            if (r2 == 0) goto L_0x005c
            X.00H r0 = r5.A06
            java.lang.Object r1 = r0.get()
            X.2eL r1 = (X.C54562eL) r1
            X.2lS r0 = r1.A01
            r0.A01(r2)
            X.2lS r0 = r1.A02
            r0.A01(r2)
        L_0x005c:
            if (r3 != 0) goto L_0x0019
            X.1KB r0 = r5.A00
            r8 = 13
            X.7RT r4 = new X.7RT
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A0J(r4)
            return
        L_0x006b:
            r9 = 0
            goto L_0x003a
        L_0x006d:
            java.lang.Object r5 = r4.A01
            X.1Tv r5 = (X.C26881Tv) r5
            java.lang.Object r8 = r4.A02
            X.2gM r8 = (X.C55782gM) r8
            r12 = 1
            X.1M9 r1 = r5.A01
            X.1BI r0 = r8.A03
            X.1E7 r4 = r1.A0H(r0)
            boolean r16 = X.C42701yb.A01(r0)
            int r14 = r8.A02
            r2 = 0
            if (r14 != r12) goto L_0x0165
            byte[] r6 = r8.A00
        L_0x0089:
            r13 = 2
            if (r14 != r13) goto L_0x0162
            byte[] r3 = r8.A00
        L_0x008e:
            r5.A02(r4, r6, r3)
            int r9 = r4.A07
            java.lang.String r11 = " should be >= "
            r10 = 0
            if (r6 == 0) goto L_0x0121
            int r9 = r8.A01
            r7 = r9
        L_0x009b:
            int r15 = r4.A08
            if (r3 == 0) goto L_0x00e4
            r10 = r7
        L_0x00a0:
            r5.A01(r4, r9, r10)
            java.lang.Class<X.1BI> r1 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r9 = r4.A06(r1)
            if (r14 != r12) goto L_0x00d4
            if (r9 == 0) goto L_0x00ba
            X.00H r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.2eL r0 = (X.C54562eL) r0
            X.2lS r0 = r0.A01
            r0.A01(r9)
        L_0x00ba:
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x01cb
            if (r14 != r13) goto L_0x01cb
            com.whatsapp.jid.Jid r10 = r4.A06(r1)
            X.1BI r10 = (X.AnonymousClass1BI) r10
            if (r10 == 0) goto L_0x01b3
            X.1R3 r11 = r5.A05
            X.1Cd r0 = r11.A04
            X.1at r13 = r0.get()
            goto L_0x0168
        L_0x00d4:
            if (r9 == 0) goto L_0x00ba
            X.00H r0 = r5.A06
            java.lang.Object r0 = r0.get()
            X.2eL r0 = (X.C54562eL) r0
            X.2lS r0 = r0.A02
            r0.A01(r9)
            goto L_0x00ba
        L_0x00e4:
            if (r15 == r7) goto L_0x0101
            if (r7 >= r15) goto L_0x0103
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x0103
            if (r16 != 0) goto L_0x0103
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb received photo_thumb_id invalid, "
            r1.append(r0)
            r1.append(r7)
            X.C17900vP.A0i(r11, r1, r15)
        L_0x0101:
            r10 = r15
            goto L_0x00a0
        L_0x0103:
            X.1Lr r0 = r5.A03
            java.io.File r11 = r0.A01(r4)
            if (r11 == 0) goto L_0x00a0
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r11.delete()
            if (r0 != 0) goto L_0x00a0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactPhotoUpdater/writeProfilePhotoToDb failed to delete; file="
            X.C17900vP.A0X(r11, r0, r1)
            goto L_0x00a0
        L_0x0121:
            int r7 = r8.A01
            if (r9 == r7) goto L_0x009b
            if (r7 >= r9) goto L_0x0142
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x0142
            if (r16 != 0) goto L_0x0142
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "received photo_full_id invalid, "
            r1.append(r0)
            r1.append(r7)
            X.C17900vP.A0i(r11, r1, r9)
            goto L_0x009b
        L_0x0142:
            X.1Lr r0 = r5.A03
            java.io.File r9 = r0.A00(r4)
            if (r9 == 0) goto L_0x015f
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x015f
            boolean r0 = r9.delete()
            if (r0 != 0) goto L_0x015f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "failed to delete; file="
            X.C17900vP.A0X(r9, r0, r1)
        L_0x015f:
            r9 = 0
            goto L_0x009b
        L_0x0162:
            r3 = r2
            goto L_0x008e
        L_0x0165:
            r6 = r2
            goto L_0x0089
        L_0x0168:
            java.lang.String[] r9 = new java.lang.String[r12]     // Catch:{ all -> 0x0728 }
            X.1LW r0 = r11.A00     // Catch:{ all -> 0x0728 }
            long r0 = r0.A09(r10)     // Catch:{ all -> 0x0728 }
            X.C17890vO.A1J(r9, r0)     // Catch:{ all -> 0x0728 }
            X.0ve r2 = r11.A05     // Catch:{ all -> 0x0728 }
            r1 = 6261(0x1875, float:8.774E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0728 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x0728 }
            if (r0 == 0) goto L_0x018d
            java.lang.String r2 = X.C50932Wi.A01     // Catch:{ all -> 0x0728 }
        L_0x0181:
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0728 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0728 }
            java.lang.String r0 = "GET_LAST_PHOTO_CHANGE_MESSAGE_SQL"
            android.database.Cursor r9 = r1.A0A(r2, r0, r9)     // Catch:{ all -> 0x0728 }
            goto L_0x0190
        L_0x018d:
            java.lang.String r2 = X.C50932Wi.A00     // Catch:{ all -> 0x0728 }
            goto L_0x0181
        L_0x0190:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x071c }
            if (r0 == 0) goto L_0x01a1
            X.00H r0 = r11.A07     // Catch:{ all -> 0x071c }
            X.1W6 r0 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x071c }
            X.206 r2 = r0.A02(r9, r10)     // Catch:{ all -> 0x071c }
            goto L_0x01ab
        L_0x01a1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x071c }
            java.lang.String r0 = "msgstore/last-photo-change/db no message for "
            X.C17900vP.A0Y(r10, r0, r1)     // Catch:{ all -> 0x071c }
            r2 = 0
        L_0x01ab:
            r9.close()     // Catch:{ all -> 0x0728 }
            r13.close()
            X.20i r2 = (X.C436420i) r2
        L_0x01b3:
            boolean r0 = r2 instanceof X.AnonymousClass2MP
            if (r0 == 0) goto L_0x01cb
            r0 = r2
            X.2MP r0 = (X.AnonymousClass2MP) r0
            com.whatsapp.data.ProfilePhotoChange r1 = r0.A00
            if (r1 == 0) goto L_0x01cb
            int r0 = r1.newPhotoId
            if (r0 != r7) goto L_0x01cb
            byte[] r0 = r8.A00
            r1.newPhoto = r0
            X.121 r0 = r5.A04
            r0.CQw(r2)
        L_0x01cb:
            if (r6 != 0) goto L_0x01cf
            if (r3 == 0) goto L_0x0019
        L_0x01cf:
            X.1KB r2 = r5.A00
            r0 = 41
            X.3Bv r1 = new X.3Bv
            r1.<init>(r5, r4, r0)
            goto L_0x0805
        L_0x01da:
            java.lang.Object r2 = r4.A01
            X.1Tv r2 = (X.C26881Tv) r2
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            r2.A00(r0)
            X.1BI r1 = X.AnonymousClass1E7.A00(r0)
            if (r1 == 0) goto L_0x0019
            X.1Lf r0 = r2.A02
            r0.A00(r1)
            return
        L_0x01f1:
            java.lang.Object r0 = r4.A01
            X.1M2 r0 = (X.AnonymousClass1M2) r0
            java.lang.Object r4 = r4.A02
            X.00H r0 = r0.A09
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 6
            goto L_0x0011
        L_0x0200:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A05
            r1 = 10
            goto L_0x0011
        L_0x020c:
            java.lang.Object r2 = r4.A01
            X.1M9 r2 = (X.AnonymousClass1M9) r2
            java.lang.Object r1 = r4.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1MA r0 = r2.A03
            X.1E7 r0 = r0.A0A(r1)
            boolean r0 = X.AnonymousClass1M9.A06(r2, r0)
            if (r0 == 0) goto L_0x0019
            X.11A r4 = r2.A0I
            r0 = 22
            X.3Bv r3 = new X.3Bv
            r3.<init>(r2, r1, r0)
            goto L_0x0332
        L_0x022b:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A05
            goto L_0x000f
        L_0x0235:
            java.lang.Object r3 = r4.A01
            X.1M9 r3 = (X.AnonymousClass1M9) r3
            java.lang.Object r0 = r4.A02
            java.util.Set r0 = (java.util.Set) r0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0245:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0259
            X.1E7 r1 = X.C17880vN.A0O(r2)
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            r4.add(r0)
            goto L_0x0245
        L_0x0259:
            X.1Lf r2 = r3.A05
            r1 = 13
            goto L_0x0011
        L_0x025f:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A05
            r1 = 15
            goto L_0x0011
        L_0x026b:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A05
            r1 = 11
            goto L_0x0011
        L_0x0277:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r4 = r4.A02
            X.1Lf r2 = r0.A05
            r1 = 16
            goto L_0x0011
        L_0x0283:
            java.lang.Object r2 = r4.A01
            X.1M9 r2 = (X.AnonymousClass1M9) r2
            java.lang.Object r0 = r4.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r9 = r0.iterator()
        L_0x028f:
            r8 = 0
        L_0x0290:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0327
            com.whatsapp.jid.UserJid r3 = X.C17880vN.A0T(r9)
            X.1E5 r1 = X.AnonymousClass1E5.A00
            r0 = 0
            if (r3 != r1) goto L_0x02a0
            r0 = 1
        L_0x02a0:
            r7 = 0
            if (r0 == 0) goto L_0x02ae
            java.lang.String r0 = "ContactManager/deleting MeJid status from ContactManager/deleteStatusesOnContactDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x02a8:
            if (r8 != 0) goto L_0x02ac
            if (r7 == 0) goto L_0x028f
        L_0x02ac:
            r8 = 1
            goto L_0x0290
        L_0x02ae:
            X.0ve r6 = r2.A0H
            r0 = 7435(0x1d0b, float:1.0419E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 != 0) goto L_0x02a8
            X.1Le r4 = r2.A0F
            if (r3 == 0) goto L_0x02ee
            X.00H r0 = r4.A08
            java.lang.Object r1 = r0.get()
            X.1TG r1 = (X.AnonymousClass1TG) r1
            r0 = -1
            java.util.ArrayList r0 = r1.A04(r3, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ee
            X.206 r0 = X.C17880vN.A0Y(r1)
            X.36j r0 = X.C63672tV.A02(r0)
            if (r0 == 0) goto L_0x02cf
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x02cf
            r0 = 9816(0x2658, float:1.3755E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            r1 = 1
            if (r0 != 0) goto L_0x02ef
        L_0x02ee:
            r1 = 0
        L_0x02ef:
            r0 = 7202(0x1c22, float:1.0092E-41)
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 != 0) goto L_0x031a
            if (r1 != 0) goto L_0x031a
            int r4 = r4.A06(r3)
        L_0x02fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactManager/delete "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " status of UserJid "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " deleted."
            X.C17890vO.A1A(r1, r0)
            if (r4 <= 0) goto L_0x02a8
            r7 = 1
            goto L_0x02a8
        L_0x031a:
            X.00H r0 = r2.A0O
            java.lang.Object r0 = r0.get()
            X.1TG r0 = (X.AnonymousClass1TG) r0
            int r4 = r0.A01(r3)
            goto L_0x02fd
        L_0x0327:
            if (r8 == 0) goto L_0x0019
            X.11A r4 = r2.A0I
            r0 = 31
            X.7Pc r3 = new X.7Pc
            r3.<init>(r2, r0)
        L_0x0332:
            r4.A00(r3)
            return
        L_0x0336:
            java.lang.Object r6 = r4.A01
            X.11E r6 = (X.AnonymousClass11E) r6
            java.lang.Object r5 = r4.A02
            X.2mn r5 = (X.C59732mn) r5
            X.2mn r0 = r6.A00
            if (r0 == 0) goto L_0x034f
            long r3 = r0.A00
        L_0x0344:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            java.lang.Object r1 = r6.A04
            monitor-enter(r1)
            goto L_0x0732
        L_0x034f:
            r3 = 0
            goto L_0x0344
        L_0x0352:
            java.lang.Object r0 = r4.A01
            X.1xI r0 = (X.C41911xI) r0
            java.lang.Object r4 = r4.A02
            X.2Ci r4 = (X.C45962Ci) r4
            X.1To r1 = r0.A01
            boolean r0 = r1.A0T()
            if (r0 == 0) goto L_0x0019
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r2 = 0
            java.lang.String r0 = "time_format"
            r3[r2] = r0
            java.lang.String r2 = X.AnonymousClass9QR.A00(r3)
            X.1Rs r0 = r4.A00
            X.A8l r3 = r0.A09(r2)
            if (r3 != 0) goto L_0x037e
            X.A8l r3 = r0.A0A(r2)
            if (r3 == 0) goto L_0x0397
        L_0x037e:
            X.0vb r0 = r4.A02
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r2 = r0.A00
            X.8cn r0 = r3.A09()
            X.C17960vV.A07(r0)
            X.8YN r0 = r0.timeFormatAction_
            if (r0 != 0) goto L_0x0393
            X.8YN r0 = X.AnonymousClass8YN.DEFAULT_INSTANCE
        L_0x0393:
            boolean r0 = r0.isTwentyFourHourFormatEnabled_
            if (r2 == r0) goto L_0x0019
        L_0x0397:
            X.11S r0 = r4.A00
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)
            X.0vb r0 = r4.A02
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r7 = r0.A00
            X.11P r0 = r4.A01
            long r5 = X.AnonymousClass11P.A01(r0)
            r3 = 0
            X.2Dw r2 = new X.2Dw
            r4 = r3
            r2.<init>(r3, r4, r5, r7)
            java.util.Set r0 = java.util.Collections.singleton(r2)
            r1.A0N(r0)
            r1.A0I()
            return
        L_0x03c2:
            java.lang.Object r5 = r4.A01
            X.1To r5 = (X.C26811To) r5
            java.lang.Object r4 = r4.A02
            X.77d r4 = (X.C1418377d) r4
            X.1SB r3 = r5.A0U
            java.lang.String r2 = r4.A0F
            X.C17960vV.A07(r2)
            X.1Ns r1 = r3.A04
            java.lang.String r0 = r4.A0E
            java.io.File r2 = r1.A04(r2, r0)
            r1 = 0
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x03ec
            java.io.File r0 = r3.A0A(r4, r2)
            if (r0 == 0) goto L_0x03ed
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x03ed
        L_0x03ec:
            r1 = 1
        L_0x03ed:
            java.lang.String r3 = r4.A0F
            if (r1 == 0) goto L_0x0019
            X.1S3 r2 = r5.A0K
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r3)
            java.lang.String r0 = "[\"favoriteSticker\",\""
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "\"]"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2.A06(r0)
            return
        L_0x0409:
            java.lang.Object r2 = r4.A01
            X.1To r2 = (X.C26811To) r2
            java.lang.Object r1 = r4.A02
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = r2.A0T()
            if (r0 == 0) goto L_0x0019
            X.1S3 r2 = r2.A0K
            X.205 r0 = r1.A0v
            X.1BI r1 = r0.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            monitor-enter(r2)
            goto L_0x073d
        L_0x0424:
            java.lang.Object r0 = r4.A01
            X.1Te r0 = (X.C26711Te) r0
            java.lang.Object r4 = r4.A02
            X.1Tc r2 = r0.A02
            r1 = 3
            goto L_0x0011
        L_0x042f:
            java.lang.Object r3 = r4.A01
            com.whatsapp.contact.picker.ContactPickerFragment r3 = (com.whatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1BI r1 = r0.A0J
            boolean r0 = X.C22971Dz.A0d(r1)
            if (r0 == 0) goto L_0x0472
            X.00H r0 = r3.A27
            java.lang.Object r0 = r0.get()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.24e r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0472
            java.lang.String r2 = r0.A0F
        L_0x0451:
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r1.A0C = r2
            java.lang.Integer r0 = X.C17880vN.A0m()
            r1.A06 = r0
            java.lang.String r0 = X.C50542Uv.A00()
            r1.A0E = r0
            X.18K r0 = r3.A1W
            r0.CC7(r1)
            return
        L_0x0472:
            r2 = 0
            goto L_0x0451
        L_0x0474:
            java.lang.Object r1 = r4.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            r1.A2Y(r0)
            return
        L_0x0480:
            java.lang.Object r1 = r4.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            java.lang.Object r0 = r4.A02
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.A2T(r0)
            return
        L_0x048c:
            java.lang.Object r0 = r4.A01
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            java.lang.Object r1 = r4.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1eX r0 = r0.A1C
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "contact_search"
            goto L_0x055f
        L_0x04a2:
            java.lang.Object r5 = r4.A01
            com.whatsapp.contact.picker.BroadcastListMembersSelector r5 = (com.whatsapp.contact.picker.BroadcastListMembersSelector) r5
            java.lang.Object r1 = r4.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            r6 = 1
            X.C18070vi.A0d(r1, r6)
            X.1L9 r3 = r5.A01
            X.00H r0 = r5.A0Q
            java.lang.Object r2 = r0.get()
            X.1LU r2 = (X.AnonymousClass1LU) r2
            X.1BI r1 = X.AnonymousClass1E7.A00(r1)
            r0 = 0
            android.content.Intent r1 = r2.A1w(r5, r1, r0)
            java.lang.String r0 = "extra_is_new_broadcast_list"
            android.content.Intent r0 = r1.putExtra(r0, r6)
            r3.A09(r5, r0)
            X.00H r0 = r5.A02
            if (r0 == 0) goto L_0x0501
            java.lang.Object r4 = r0.get()
            X.2sT r4 = (X.C63082sT) r4
            java.util.List r3 = r5.A0i
            int r0 = r3.size()
            long r1 = (long) r0
            r0 = 3
            X.C63082sT.A01(r4, r0, r1)
            r5.A03 = r6
            X.0zA r1 = r5.A01
            if (r1 == 0) goto L_0x04fc
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x04f8
            r1.A03()
            r3.size()
            java.lang.String r0 = "logBroadcastSmbJourneyNewBroadcastCreationSuccessAction"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04f8:
            r5.finish()
            return
        L_0x04fc:
            java.lang.String r0 = "smbBroadcastUserJourneyAnalyticsManager"
            goto L_0x05e3
        L_0x0501:
            java.lang.String r0 = "broadcastAnalyticsManager"
            goto L_0x05e3
        L_0x0505:
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r4.A02
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            android.content.Context r1 = r3.getApplicationContext()
            r0 = 3
            android.content.Intent r0 = X.AnonymousClass1LU.A0o(r1, r2, r0)
            r3.startActivity(r0)
            return
        L_0x051a:
            java.lang.Object r0 = r4.A01
            X.6zB r0 = (X.C139626zB) r0
            java.lang.Object r1 = r4.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            X.1M9 r0 = r0.A02
            r0.A0U(r1)
            return
        L_0x0528:
            java.lang.Object r1 = r4.A01
            X.6zB r1 = (X.C139626zB) r1
            java.lang.Object r0 = r4.A02
            r3 = 0
            X.1To r2 = r1.A01
            X.0wS r1 = X.C18460wS.A00
            java.util.List r0 = X.C18070vi.A0M(r0)
            r2.A0O(r1, r0, r3)
            return
        L_0x053b:
            java.lang.Object r0 = r4.A01
            X.700 r0 = (X.AnonymousClass700) r0
            java.lang.Object r2 = r4.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.31f r1 = r0.A05
            X.2R1 r0 = X.AnonymousClass2R1.A0F
            r1.A06(r0, r2)
            return
        L_0x054b:
            java.lang.Object r0 = r4.A01
            X.700 r0 = (X.AnonymousClass700) r0
            java.lang.Object r1 = r4.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1eX r0 = r0.A07
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "contact_card"
        L_0x055f:
            java.lang.String r3 = "whatsapp"
            r0.A05(r1, r2, r3, r4, r6)
            return
        L_0x0566:
            java.lang.Object r1 = r4.A01
            X.34X r1 = (X.AnonymousClass34X) r1
            java.lang.Object r0 = r4.A02
            r3 = 0
            r2 = 1
            X.1To r1 = r1.A00
            java.util.List r0 = X.C18070vi.A0M(r0)
            r1.A0P(r0, r2, r3)
            return
        L_0x0578:
            java.lang.Object r0 = r4.A01
            X.1M2 r0 = (X.AnonymousClass1M2) r0
            java.lang.Object r2 = r4.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.00H r0 = r0.A09
            java.lang.Object r1 = r0.get()
            X.2Kb r1 = (X.C47812Kb) r1
            r0 = 5
            X.AnonymousClass35V.A00(r1, r2, r0)
            return
        L_0x058d:
            java.lang.Object r1 = r4.A01
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            java.lang.Object r0 = r4.A02
            X.1Lf r2 = r1.A05
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 14
            goto L_0x05c8
        L_0x059c:
            java.lang.Object r1 = r4.A01
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1Lf r2 = r1.A05
            com.whatsapp.jid.Jid r1 = X.AnonymousClass1E7.A01(r0)
            r0 = 9
            goto L_0x05c8
        L_0x05ad:
            java.lang.Object r0 = r4.A01
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            java.lang.Object r1 = r4.A02
            X.1Lf r2 = r0.A05
            goto L_0x05c2
        L_0x05b6:
            java.lang.Object r1 = r4.A01
            X.1M9 r1 = (X.AnonymousClass1M9) r1
            java.lang.Object r0 = r4.A02
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            X.1Lf r2 = r1.A05
            X.1BI r1 = r0.A0J
        L_0x05c2:
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0 = 13
        L_0x05c8:
            X.AnonymousClass35V.A00(r2, r1, r0)
            return
        L_0x05cc:
            java.lang.Object r0 = r4.A01
            com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity r0 = (com.whatsapp.companionmode.registration.RegisterAsCompanionEnterNumberActivity) r0
            java.lang.Object r2 = r4.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1Tf r0 = r0.A01
            if (r0 == 0) goto L_0x05e1
            r1 = 0
            X.11w r0 = X.C26721Tf.A00(r0)
            r0.A09(r2, r1)
            return
        L_0x05e1:
            java.lang.String r0 = "companionRegistrationManager"
        L_0x05e3:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05e8:
            java.lang.Object r3 = r4.A01
            X.2ia r3 = (X.C57132ia) r3
            java.lang.Object r2 = r4.A02
            X.2gz r2 = (X.C56152gz) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "History Sync Download Failed: Type "
            r1.append(r0)
            int r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = " Order: "
            r1.append(r0)
            int r0 = r2.A00
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            r3.A00(r0)
            return
        L_0x0612:
            java.lang.Object r2 = r4.A01
            X.1S0 r2 = (X.AnonymousClass1S0) r2
            java.lang.Object r1 = r4.A02
            org.whispersystems.jobqueue.Job r1 = (org.whispersystems.jobqueue.Job) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1Mm r0 = r2.A02
            r0.A01(r1)
            return
        L_0x0624:
            java.lang.Object r0 = r4.A01
            X.5xB r0 = (X.C116385xB) r0
            java.lang.Object r1 = r4.A02
            X.00H r0 = r0.A04
            X.10T r4 = X.C17880vN.A0V(r0)
            java.util.Set r3 = java.util.Collections.singleton(r1)
            r2 = 1
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r1 = 9
            goto L_0x0653
        L_0x063c:
            java.lang.Object r0 = r4.A01
            X.5xB r0 = (X.C116385xB) r0
            java.lang.Object r1 = r4.A02
            X.00H r0 = r0.A04
            X.10T r4 = X.C17880vN.A0V(r0)
            java.util.Set r3 = java.util.Collections.singleton(r1)
            r2 = 1
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r1 = 8
        L_0x0653:
            X.35W r0 = new X.35W
            r0.<init>((java.util.Collection) r3, (int) r1, (boolean) r2)
            r4.notifyAllObservers(r0)
            return
        L_0x065c:
            java.lang.Object r5 = r4.A01
            X.5xB r5 = (X.C116385xB) r5
            java.lang.Object r4 = r4.A02
            X.5yu r4 = (X.C116955yu) r4
            X.77d r2 = X.C116385xB.A00(r5, r4)
            if (r2 == 0) goto L_0x0673
            long r0 = r4.A04
            X.C116385xB.A01(r5, r2, r0)
            r5.A07(r4)
            return
        L_0x0673:
            int r3 = r4.A00
            if (r3 < 0) goto L_0x06a2
            X.11S r1 = r5.A00
            int r0 = r1.A06()
            if (r0 == r3) goto L_0x06a2
            X.1lJ r2 = r5.A01     // Catch:{ 11T -> 0x0697 }
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r1)     // Catch:{ 11T -> 0x0697 }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 11T -> 0x0697 }
            com.whatsapp.jid.DeviceJid r1 = r0.A03(r1, r3)     // Catch:{ 11T -> 0x0697 }
            X.6ty r0 = r4.A01     // Catch:{ 11T -> 0x0697 }
            java.lang.String r0 = r0.A07     // Catch:{ 11T -> 0x0697 }
            java.util.Set r0 = java.util.Collections.singleton(r0)     // Catch:{ 11T -> 0x0697 }
            r2.A00(r1, r0)     // Catch:{ 11T -> 0x0697 }
            return
        L_0x0697:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FavoriteStickerHandler/sendRmrRequest invalid setter ex="
            X.C17900vP.A0X(r2, r0, r1)
            return
        L_0x06a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FavoriteStickerHandler/sendRmrRequest invalid setter id="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            goto L_0x06c0
        L_0x06ad:
            java.lang.Object r7 = r4.A01
            X.1TW r7 = (X.AnonymousClass1TW) r7
            java.lang.Object r6 = r4.A02
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            X.11S r0 = r7.A00
            com.whatsapp.jid.PhoneUserJid r1 = X.AnonymousClass11S.A00(r0)
            if (r1 != 0) goto L_0x06c4
            java.lang.String r0 = "security-notification-setting-manager/my user id is null (unregistered?)."
        L_0x06c0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06c4:
            X.0z4 r0 = r7.A03
            boolean r4 = r0.A2M()
            X.1PP r0 = r7.A05
            X.205 r3 = X.C17880vN.A0Z(r1, r0)
            X.11P r0 = r7.A02
            long r1 = X.AnonymousClass11P.A01(r0)
            r0 = 47
            X.23L r5 = new X.23L
            r5.<init>(r3, r0, r1)
            r5.A00 = r6
            r5.A00 = r4
            X.1Ry r0 = r7.A04
            long r3 = r0.A01(r5)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x06f3
            java.lang.String r0 = "security-notification-setting-manager/failed to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x06f3:
            X.1Mm r1 = r7.A01
            com.whatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.whatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r6, r5)
            r1.A01(r0)
            return
        L_0x06fe:
            java.lang.Object r0 = r4.A01
            com.whatsapp.companiondevice.sync.HistorySyncWorker r0 = (com.whatsapp.companiondevice.sync.HistorySyncWorker) r0
            java.lang.Object r1 = r4.A02
            X.Bly r1 = (X.C23570Bly) r1
            X.9rG r0 = com.whatsapp.companiondevice.sync.HistorySyncWorker.A00(r0)
            r1.A03(r0)
            return
        L_0x070e:
            java.lang.Object r0 = r4.A01
            X.37K r0 = (X.AnonymousClass37K) r0
            java.lang.Object r1 = r4.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            X.2tu r0 = r0.A03
            r0.A07(r1)
            return
        L_0x071c:
            r1 = move-exception
            if (r9 == 0) goto L_0x0727
            r9.close()     // Catch:{ all -> 0x0723 }
            goto L_0x0727
        L_0x0723:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0728 }
        L_0x0727:
            throw r1     // Catch:{ all -> 0x0728 }
        L_0x0728:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x072d }
            throw r1
        L_0x072d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0732:
            r6.A00 = r5     // Catch:{ all -> 0x073a }
            monitor-exit(r1)     // Catch:{ all -> 0x073a }
            r0 = 4
            X.AnonymousClass35V.A00(r6, r5, r0)
            return
        L_0x073a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x073a }
            throw r0
        L_0x073d:
            X.1Rs r6 = r2.A01     // Catch:{ all -> 0x07b5 }
            java.lang.String[] r7 = X.C17880vN.A1Y()     // Catch:{ all -> 0x07b5 }
            X.C17880vN.A1J(r1, r7, r0)     // Catch:{ all -> 0x07b5 }
            java.lang.String r3 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.lang.String r1 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x07b5 }
            X.1Oq r0 = r6.A00     // Catch:{ all -> 0x07b5 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x07b5 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x07ab }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x07ab }
            android.database.Cursor r3 = r0.A0A(r1, r3, r7)     // Catch:{ all -> 0x07ab }
        L_0x075d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0783
            java.lang.String r0 = "mutation_index"
            java.lang.String r1 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x079f }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = X.A4M.A00(r1)     // Catch:{ all -> 0x079f }
            boolean r0 = X.AnonymousClass2T1.A00(r0)     // Catch:{ all -> 0x079f }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x075d
            X.A8l r0 = X.C26331Rs.A01(r3, r6)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x075d
            r5.add(r0)     // Catch:{ all -> 0x079f }
            goto L_0x075d
        L_0x0783:
            r3.close()     // Catch:{ all -> 0x07ab }
            r4.close()     // Catch:{ all -> 0x07b5 }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x07b5 }
        L_0x078d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x07b5 }
            if (r0 == 0) goto L_0x079d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x07b5 }
            X.A8l r0 = (X.C20126A8l) r0     // Catch:{ all -> 0x07b5 }
            r2.A05(r0)     // Catch:{ all -> 0x07b5 }
            goto L_0x078d
        L_0x079d:
            monitor-exit(r2)
            return
        L_0x079f:
            r1 = move-exception
            if (r3 == 0) goto L_0x07aa
            r3.close()     // Catch:{ all -> 0x07a6 }
            goto L_0x07aa
        L_0x07a6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x07ab }
        L_0x07aa:
            throw r1     // Catch:{ all -> 0x07ab }
        L_0x07ab:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x07b0 }
            goto L_0x07b4
        L_0x07b0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x07b5 }
        L_0x07b4:
            throw r1     // Catch:{ all -> 0x07b5 }
        L_0x07b5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x07b8:
            java.lang.Object r3 = r4.A01
            X.70L r3 = (X.AnonymousClass70L) r3
            java.lang.Object r5 = r4.A02
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            X.1M9 r4 = r3.A09
            X.1BI r6 = r3.A0N
            java.lang.Long r7 = r3.A0Q
            X.5xr r0 = r3.A0G
            java.lang.String r8 = r0.A05()
            java.lang.String r9 = r0.A02()
            X.1M2 r0 = r4.A04
            r0.A0S(r5)
            X.0ve r2 = r4.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x07e6
            X.1Lo r0 = r4.A02
            r0.A00(r5)
        L_0x07e6:
            r4.A0Y(r5, r6, r7, r8, r9)
            X.1KB r2 = r3.A06
            r0 = 42
            goto L_0x0800
        L_0x07ee:
            java.lang.Object r3 = r4.A01
            X.700 r3 = (X.AnonymousClass700) r3
            java.lang.Object r2 = r4.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.1To r1 = r3.A01
            r0 = 0
            r1.A0P(r2, r0, r0)
            X.1KB r2 = r3.A00
            r0 = 34
        L_0x0800:
            X.7Pc r1 = new X.7Pc
            r1.<init>(r3, r0)
        L_0x0805:
            r2.A0J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70623Bv.run():void");
    }
}
