package X;

/* renamed from: X.Ajy  reason: case insensitive filesystem */
public class C21431Ajy implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21431Ajy(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(C200710s r1, Object obj, Object obj2, int i) {
        r1.execute(new C21431Ajy(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v351, resolved type: X.9yX} */
    /* JADX WARNING: type inference failed for: r0v350 */
    /* JADX WARNING: type inference failed for: r0v357, types: [com.whatsapp.jid.Jid, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v613 */
    /* JADX WARNING: type inference failed for: r0v614 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x047c, code lost:
        r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppAck(r4.A01, r3, r4.A00, r4.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04d1, code lost:
        switch(r0) {
            case 0: goto L_0x050d;
            case 1: goto L_0x04f6;
            case 2: goto L_0x04f1;
            case 3: goto L_0x0512;
            default: goto L_0x04d4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04d4, code lost:
        r7 = r2.A03.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04d8, code lost:
        if (r7 == null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04de, code lost:
        if (r7.A00 != 0) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04e8, code lost:
        if (r4.A02.equals(r7.A02) == false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04ea, code lost:
        r7.A00 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04f1, code lost:
        r7 = r2.A03.A0c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04f6, code lost:
        r7 = r2.A03.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04fa, code lost:
        if (r7 == null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0504, code lost:
        if (r4.A02.equals(r7.A02) == false) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x050a, code lost:
        if (r7.A00 != 0) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x050d, code lost:
        r7 = r2.A03.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0512, code lost:
        r7 = r2.A03;
        r8 = r7.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0516, code lost:
        if (r8 == null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0520, code lost:
        if (r4.A02.equals(r8.A02) == false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0526, code lost:
        if (r8.A00 != 0) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0528, code lost:
        r8.A00 = android.os.SystemClock.elapsedRealtime();
        r0 = r2.A01.BO3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0534, code lost:
        if (r0 == null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0538, code lost:
        if (r0.isBotCall == false) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x053a, code lost:
        ((X.C140076zu) r7.A3X.get()).A02(X.AnonymousClass00R.A0Y);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x054b, code lost:
        if (r4.A00 != 435) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x054d, code lost:
        r1 = r2.A00;
        r1.A0J(new X.C21461AkS(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05b2, code lost:
        if (com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmpp(r1.A00, r47, r1.A08, r1.A06, r1.A01, r1.A00, r1.A09) != 70004) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05b4, code lost:
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0678, code lost:
        if (r3.equals("video") == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0682, code lost:
        if (r3.equals("offer") == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0696, code lost:
        if (r3.equals("reject") == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06a3, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06a4, code lost:
        switch(r3) {
            case 0: goto L_0x0882;
            case 1: goto L_0x07bc;
            case 2: goto L_0x083f;
            case 3: goto L_0x09c5;
            case 4: goto L_0x0773;
            default: goto L_0x06a7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06a7, code lost:
        X.C19994A2h.A00(r2, r1);
        r5 = r2.A08;
        r3 = r1.A02;
        r26 = r3;
        r5 = X.AnonymousClass1N7.A00(r5, 3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06b4, code lost:
        if (r5 == null) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06b6, code lost:
        r5.A05(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06b9, code lost:
        r3 = r1.A03;
        r16 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06bd, code lost:
        if (r3 != null) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06bf, code lost:
        r0 = "call creator can not be null in call rekey request";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06c3, code lost:
        r4 = r1.A00;
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06c8, code lost:
        if ((r4 instanceof com.whatsapp.jid.DeviceJid) == false) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06ca, code lost:
        r13 = (com.whatsapp.jid.DeviceJid) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06cd, code lost:
        X.C17960vV.A07(r13);
        r12 = r2.A05.A05(r1, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06d6, code lost:
        if (r5 == null) goto L_0x06dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06d8, code lost:
        X.AnonymousClass8BY.A0y(r2.A07, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06dd, code lost:
        r3 = r2.A02;
        r11 = r1.A03;
        r8 = r1.A02;
        r10 = r12.A01;
        r5 = X.AnonymousClass000.A1T(r10, 3);
        r6 = r12.A00;
        X.C18070vi.A0d(r13, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x06ef, code lost:
        if (r5 == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06f1, code lost:
        r5 = r3.A01.A06();
        r4 = X.AnonymousClass000.A10();
        r4.append("voip/call-send-methods sending e2e reject with retry: ");
        r6 = r6 + 1;
        r4.append(r6);
        r4.append(" message.id=");
        r4.append(r11);
        X.C17900vP.A0j(" localRegistrationId=", r4, r5);
        r15 = X.A8G.A03(r5);
        r5 = X.C17880vN.A0U(r3.A03);
        r14 = r3.A02;
        r4 = r3.A00;
        r6 = (byte) r6;
        r3 = "enc_rekey_retry";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0723, code lost:
        r23 = r26;
        X.C63902ts.A07(r4, r14, "call", "rekey", r11, r23, true);
        r4 = X.C17880vN.A0D();
        X.C63902ts.A06(r4, r16, r13, r11, r8, r23);
        r4.putString(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r3);
        r4.putByteArray("registrationId", r15);
        r4.putByte("retry", r6);
        r3 = android.os.Message.obtain((android.os.Handler) null, 0, 157, 0, r4);
        X.C18070vi.A0X(r3);
        r5.A0G(r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0760, code lost:
        if (r10 == 0) goto L_0x0837;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0762, code lost:
        if (r10 == 1) goto L_0x0dfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0766, code lost:
        r5 = X.C17880vN.A0U(r3.A03);
        r14 = r3.A02;
        r4 = r3.A00;
        r3 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0773, code lost:
        r3 = r1.A00;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0778, code lost:
        if ((r3 instanceof com.whatsapp.jid.DeviceJid) == false) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x077a, code lost:
        r6 = (com.whatsapp.jid.DeviceJid) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x077d, code lost:
        X.C17960vV.A07(r6);
        r0 = r1.A02;
        r3 = r1.A01;
        r5 = X.AnonymousClass000.A11(r0);
        r9 = X.AnonymousClass000.A0y(X.AnonymousClass8BS.A0g(r6, "_", r5), r5);
        r8 = r2.A03.A3b;
        r7 = X.C108945cZ.A1E(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x079a, code lost:
        if (r7 == null) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x07a2, code lost:
        if (r3 >= r7.longValue()) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07a4, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("voip/receive_message/call-video-changed ignore this message. epochTimeMillis = ");
        r1.append(r3);
        X.C17900vP.A0Y(r7, ", latest = ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x07b7, code lost:
        X.AnonymousClass8BT.A1O(r9, r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07bc, code lost:
        r0 = r2.A08;
        r13 = r1.A02;
        r5 = X.AnonymousClass1N7.A00(r0, 3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07c4, code lost:
        if (r5 == null) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07c6, code lost:
        r5.A05(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07c9, code lost:
        r3 = r1.A00;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07ce, code lost:
        if ((r3 instanceof com.whatsapp.jid.DeviceJid) == false) goto L_0x07d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07d0, code lost:
        r4 = (com.whatsapp.jid.DeviceJid) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07d3, code lost:
        X.C17960vV.A07(r4);
        r3 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07d8, code lost:
        if (r3 != null) goto L_0x07eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07da, code lost:
        r3 = r2.A03.A23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07e2, code lost:
        if (X.C22971Dz.A0T(r4) == false) goto L_0x0831;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07e4, code lost:
        r3 = r3.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07e8, code lost:
        X.C17960vV.A07(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x07eb, code lost:
        if (r5 == null) goto L_0x07f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07ed, code lost:
        X.AnonymousClass8BY.A0y(r2.A07, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x07f2, code lost:
        r6 = r2.A02;
        r12 = r1.A03;
        r0 = r1.A02;
        X.C18070vi.A0e(r4, 1, r3);
        r5 = X.C17880vN.A0U(r6.A03);
        X.C63902ts.A07(r6.A00, r6.A02, "call", "reject", r12, r13, true);
        r6 = new android.os.Bundle(4);
        X.C63902ts.A06(r6, r3, r4, r12, r0, r13);
        r0 = android.os.Message.obtain((android.os.Handler) null, 0, 73, 0, r6);
        X.C18070vi.A0X(r0);
        r5.A0G(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0831, code lost:
        r3.A0I();
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0839, code lost:
        if (r12.A05 == null) goto L_0x0dfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x083b, code lost:
        r47 = r12.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x083f, code lost:
        r3 = r28.getFirstAttributeByName("scheduled-id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0847, code lost:
        if (r3 == null) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0849, code lost:
        r7 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x084b, code lost:
        r3 = r28.getFirstAttributeByName("group-jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0853, code lost:
        if (r3 == null) goto L_0x085d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0855, code lost:
        r3 = r3.A01;
        r0 = com.whatsapp.jid.GroupJid.Companion;
        r0 = X.C36321nh.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0861, code lost:
        if (android.text.TextUtils.isEmpty(r7) != false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0863, code lost:
        if (r0 == 0) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0865, code lost:
        r0.getRawString();
        r6 = (X.C35311m1) r2.A03.A3R.get();
        r6.A08.execute(new X.C146887Qz(r6, r0, r7, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0880, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0882, code lost:
        r5 = r2.A08;
        r3 = r1.A02;
        r8 = X.AnonymousClass1N7.A00(r5, 3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x088a, code lost:
        if (r8 == null) goto L_0x088f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x088c, code lost:
        r8.A05(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x088f, code lost:
        r6 = r1.A00;
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0894, code lost:
        if ((r6 instanceof com.whatsapp.jid.DeviceJid) == false) goto L_0x0899;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0896, code lost:
        r12 = (com.whatsapp.jid.DeviceJid) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0899, code lost:
        X.C17960vV.A07(r12);
        r11 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x089e, code lost:
        if (r11 != null) goto L_0x08b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08a0, code lost:
        r6 = r2.A03.A23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08a8, code lost:
        if (X.C22971Dz.A0T(r12) == false) goto L_0x0942;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08aa, code lost:
        r11 = r6.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x08ae, code lost:
        X.C17960vV.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x08b1, code lost:
        r5 = r2.A01.BO3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x08b7, code lost:
        if (r5 == null) goto L_0x08cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x08bb, code lost:
        if (r5.isBotCall == false) goto L_0x08cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x08bd, code lost:
        r15 = true;
        ((X.C140076zu) r2.A09.get()).A02(X.AnonymousClass00R.A0u);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x08d3, code lost:
        if (r47.getFirstChildByTag("enc") == null) goto L_0x08dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x08d5, code lost:
        if (r15 == false) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x08d7, code lost:
        r0 = r2.A05.A05(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x08dd, code lost:
        if (r8 == null) goto L_0x08e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x08df, code lost:
        X.AnonymousClass8BY.A0y(r2.A07, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x08e4, code lost:
        r14 = r2.A02;
        r13 = r1.A03;
        r8 = r1.A02;
        X.C18070vi.A0e(r12, 1, r11);
        r10 = X.C17880vN.A0U(r14.A03);
        r23 = r3;
        X.C63902ts.A07(r14.A00, r14.A02, "call", "accept", r13, r23, true);
        r5 = new android.os.Bundle(4);
        X.C63902ts.A06(r5, r11, r12, r13, r8, r23);
        r3 = android.os.Message.obtain((android.os.Handler) null, 0, 72, 0, r5);
        X.C18070vi.A0X(r3);
        r10.A0G(r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x092c, code lost:
        if (X.AnonymousClass8BT.A1Y(r8) == false) goto L_0x0938;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x092e, code lost:
        r4 = r2.A03;
        r4.A1B = r1.A08;
        r4.A1A = r1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0938, code lost:
        if (r0 == 0) goto L_0x094d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x093a, code lost:
        r3 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x093c, code lost:
        if (r3 == 0) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x093e, code lost:
        if (r3 == 1) goto L_0x0dfa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0942, code lost:
        r6.A0I();
        r11 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0949, code lost:
        r47 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x094d, code lost:
        if (r15 == false) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x094f, code lost:
        ((X.C140076zu) r2.A09.get()).A02(X.AnonymousClass00R.A15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x09c5, code lost:
        X.C19994A2h.A00(r2, r1);
        r0 = r2.A03;
        r14 = r0.A2R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x09d0, code lost:
        if (r14.A01() != false) goto L_0x09e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x09d2, code lost:
        r8 = r0.A0Q(r1.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x09de, code lost:
        if (r8.A00 != 0) goto L_0x09e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09e0, code lost:
        r8.A00 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x09ea, code lost:
        if (r1.A01() != false) goto L_0x0a34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x09f4, code lost:
        if (X.C40811vJ.A03(r47, "group_info") != null) goto L_0x0a34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x09f6, code lost:
        r12 = r1.A02;
        X.C17960vV.A07(r12);
        r8 = r1.A03;
        X.C17960vV.A07(r8);
        r28 = X.AnonymousClass000.A1W(X.C40811vJ.A03(r47, "video"));
        r5 = r1.A04;
        r0.A04 = X.C63982u1.A00(r0.A1s, r0.A2e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0a1c, code lost:
        if (r2.A04(r12) == false) goto L_0x0dc5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0a1e, code lost:
        r4 = X.AnonymousClass000.A10();
        r4.append("voip/service/peekIncomingOffer: Ignoring offer peek because phone is busy: ");
        r3 = X.AnonymousClass000.A0y(X.C40811vJ.A08(r0.A04), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0a31, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0a34, code lost:
        r8 = r0.A2I;
        r5 = r1.A02;
        X.C24911Md.A00(r8, r5, 726210665);
        r3 = X.AnonymousClass1N7.A00(r2.A08, 3, r1.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0a46, code lost:
        if (r3 == null) goto L_0x0a4b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0a48, code lost:
        r3.A05(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0a4b, code lost:
        r3 = r2.A07;
        r31 = r3;
        r22 = X.C18040vf.A02;
        r21 = X.C18020vd.A05(r22, r3, 4379);
        r15 = !r21;
        r10 = r1.A00;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0a62, code lost:
        if ((r10 instanceof com.whatsapp.jid.DeviceJid) == false) goto L_0x0a69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0a64, code lost:
        r20 = (com.whatsapp.jid.DeviceJid) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0a6b, code lost:
        if (r20 != null) goto L_0x0a94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0a6d, code lost:
        r4 = X.AnonymousClass000.A10();
        r4.append("voip/receive_message/call-offer dropping stanza: invalid fromJid: ");
        r3 = X.C17890vO.A0V(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0a7a, code lost:
        com.whatsapp.util.Log.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0a7f, code lost:
        if (r0.A47 == false) goto L_0x0a8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0a85, code lost:
        if (X.AnonymousClass8BT.A1Y(r5) == false) goto L_0x0a8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0a87, code lost:
        com.whatsapp.voipcalling.Voip.endCall(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0a8a, code lost:
        r8.A04(r5, 7952);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0a8d, code lost:
        if (r21 == false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0a8f, code lost:
        r2.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0a94, code lost:
        r3 = r1.A03;
        r19 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0a98, code lost:
        if (r3 != null) goto L_0x0a9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0a9a, code lost:
        r19 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0a9c, code lost:
        r4 = r1.A03;
        r3 = r0.A23;
        r3.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0aa5, code lost:
        if (r3.A0D != null) goto L_0x0aaa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0aa7, code lost:
        r3 = "voip/receive_message/call-offer ignoring call due to invalid registration";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0aaa, code lost:
        r12 = !r0.A3g.add(r4);
        r10 = X.AnonymousClass000.A10();
        r10.append("voip/receive_message/call-offer, id: ");
        r10.append(r4);
        r10.append(", from: ");
        r10.append(r20);
        r10.append(", call id: ");
        r10.append(r5);
        r10.append(", duplicatedCallOffer: ");
        r10.append(r12);
        r10.append(", callOfferElapsedTimeInMillisOnServer: ");
        r3 = r1.A00;
        r45 = r3;
        r10.append(r3);
        X.C17890vO.A1A(r10, "ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0ae9, code lost:
        if (r15 == false) goto L_0x0aee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0aeb, code lost:
        r2.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0aee, code lost:
        if (r12 != false) goto L_0x0a8a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0af0, code lost:
        r0.A24.A08(false);
        r0.A04 = X.C63982u1.A00(r0.A1s, r0.A2e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b03, code lost:
        if (r14.A01() == false) goto L_0x0b0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b07, code lost:
        if (r0.A47 == false) goto L_0x0b24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b0d, code lost:
        if (X.AnonymousClass8BT.A1Y(r5) == false) goto L_0x0b24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b0f, code lost:
        X.AnonymousClass8BX.A18(r0);
        r0.A0z = java.lang.Long.valueOf(r45);
        r0.A1H = r1.A09;
        r0.A1B = r1.A08;
        r0.A1A = r1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0b24, code lost:
        r10 = r0.A0Q(r5);
        r3 = r1.A09;
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0b2c, code lost:
        if (r3 == false) goto L_0x0b34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0b2e, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0b32, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0b34, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0b3b, code lost:
        if (r10.A04 != null) goto L_0x0b3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0b3d, code lost:
        r10.A04 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0b3f, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0b40, code lost:
        if (r18 != false) goto L_0x0b94;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0b42, code lost:
        r32 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0b44, code lost:
        r10.A05 = java.lang.Integer.valueOf(r32);
        r11 = new com.whatsapp.voipcalling.CallOfferInfo[1];
        r44 = r1.A08;
        r43 = r1.A06;
        r3 = r1.A01;
        r29 = r3;
        r10 = com.whatsapp.voipcalling.Voip.nativeParseXmppOffer(r11, r20, r47, r44, r43, r3, r45, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0b6c, code lost:
        if (r10 == 0) goto L_0x0be1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0b6e, code lost:
        X.C17900vP.A0i("voip/service/handleIncomingOfferStanza: parseXmppOffer failed: ", X.AnonymousClass000.A10(), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0b7a, code lost:
        if (r10 != 70004) goto L_0x0b86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0b7c, code lost:
        r2.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0b7f, code lost:
        r8.A04(r5, 7952);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0b88, code lost:
        if (r0.A47 == false) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0b8e, code lost:
        if (X.AnonymousClass8BT.A1Y(r5) == false) goto L_0x0b7f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0b90, code lost:
        com.whatsapp.voipcalling.Voip.endCall(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0b94, code lost:
        r14 = r0.A3L;
        r32 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0ba0, code lost:
        if (((X.C54512eG) r14.get()).A01 == false) goto L_0x0b44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0ba2, code lost:
        r32 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0ba6, code lost:
        if (r10.A0C != null) goto L_0x0b44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0bb4, code lost:
        if (((X.C54512eG) r14.get()).A00 <= 0) goto L_0x0b44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0bb6, code lost:
        r10.A0C = X.C108945cZ.A1B(android.os.SystemClock.elapsedRealtime(), ((X.C54512eG) r14.get()).A00);
        r4 = X.AnonymousClass000.A10();
        r4.append("voip/receive_message/call-offer/pushToCallOfferDelay ");
        r4.append(r10.A0C);
        X.C17890vO.A1A(r4, "ms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0bdb, code lost:
        if (r10.A0H == false) goto L_0x0b44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0bdd, code lost:
        r32 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0be1, code lost:
        r11 = r11[0];
        X.C17960vV.A07(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0be8, code lost:
        if (r11.isOfferExpired == false) goto L_0x0bef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0bea, code lost:
        r0.A3h.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0bef, code lost:
        r4 = r11.isVideoCall;
        r3 = r11.callGroupInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0bf3, code lost:
        if (r3 != null) goto L_0x0dc0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0bf5, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0bf6, code lost:
        r8.A02(r5, r3, r4, false);
        r3 = r11.callGroupInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0bfb, code lost:
        if (r3 == null) goto L_0x0dbd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0bfd, code lost:
        r3 = r3.transactionId;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0bff, code lost:
        r23 = new X.C167218fe(r2, r19, r11, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0c1a, code lost:
        if (X.C18020vd.A05(r22, r31, 12059) == false) goto L_0x0db8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0c1c, code lost:
        r2.A04.execute(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0c23, code lost:
        r12 = r20.userJid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0c2c, code lost:
        if (r2.A04(r5) == false) goto L_0x0db5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0c2e, code lost:
        r10 = r0.A04;
        r4 = X.AnonymousClass000.A10();
        r4.append("voip/receive_message/stanza-call-offer/ignored-phone-call-in-progress ");
        X.C17890vO.A1A(r4, X.C40811vJ.A08(r10));
        r4 = r0.A0Q(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0c44, code lost:
        if (r10 != 1) goto L_0x0dad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0c46, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0c4a, code lost:
        r4.A03 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0c4c, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0c4d, code lost:
        r13 = r2.A05.A05(r1, false);
        r3 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0c55, code lost:
        if (r3 == 0) goto L_0x0c60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0c57, code lost:
        X.C17900vP.A0i("voip/service/maybeHandleIncomingOffer: decryptCallPayloadForStanza failed: ", X.AnonymousClass000.A10(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0c62, code lost:
        if (r3 == 0) goto L_0x0da5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0c64, code lost:
        if (r3 == 1) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0c66, code lost:
        if (r3 == 2) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0c68, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0c69, code lost:
        if (r3 == 3) goto L_0x0d81;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0c6c, code lost:
        if (r3 == 4) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0c6e, code lost:
        r36 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0c70, code lost:
        r13 = r0.A2i;
        r13.A00.CGF(new X.C98714rb(r13, r9, r12, 47));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0c7e, code lost:
        if (r4 != 16) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0c8a, code lost:
        if (X.C18020vd.A05(r22, r31, 10858) != false) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0c8c, code lost:
        r23.A09(new X.C21125Aet(r2, r20, r1, r11, r5, r32, r36));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0ca1, code lost:
        r5 = r1.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0ca3, code lost:
        if (r5 == null) goto L_0x0a8d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0ca9, code lost:
        if (r5.isEmpty() != false) goto L_0x0a8d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0cab, code lost:
        r4 = r0.A2T;
        r3 = r4.A0H(r19.userJid);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0cbb, code lost:
        if (X.C42171xk.A00(r3.A0c, r5) != false) goto L_0x0a8d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0cbd, code lost:
        r3.A0c = r5;
        r4.A0W(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0cc4, code lost:
        r0.A0v(r12, r5);
        r3 = r0.A2T.A0E(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0ccd, code lost:
        if (r3 == null) goto L_0x0cdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0ccf, code lost:
        r3 = r3.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0cd1, code lost:
        if (r3 == null) goto L_0x0cdd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0cd3, code lost:
        r31 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0cdb, code lost:
        if (android.text.TextUtils.isEmpty(r3.A01) == false) goto L_0x0cdf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0cdd, code lost:
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0cdf, code lost:
        if (r4 == 0) goto L_0x0cf7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0ce2, code lost:
        if (r4 == 5) goto L_0x0cff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0ce6, code lost:
        if (r4 == 15) goto L_0x0cff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ce8, code lost:
        if (r4 == 16) goto L_0x0cff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0cea, code lost:
        X.C17960vV.A0F(false, X.AnonymousClass001.A1I("Unsupported reject result type ", X.AnonymousClass000.A10(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0cf7, code lost:
        r33 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0cf9, code lost:
        r6 = r11.groupJid;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0cfb, code lost:
        if (r6 == null) goto L_0x0d3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0cfd, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0cff, code lost:
        r33 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0d0c, code lost:
        if (r0.A2l.A04(X.C40811vJ.A0A(r5)) != null) goto L_0x0d27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0d18, code lost:
        if (X.C18020vd.A05(r22, r0.A2p, 7481) == false) goto L_0x0d27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0d1a, code lost:
        r3 = r0.A2y.A0a(r6).A09();
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0d25, code lost:
        if (r3 != false) goto L_0x0d28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0d27, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0d28, code lost:
        r0.A44.A02 = r6;
        r9 = X.AnonymousClass000.A10();
        r9.append("voip/updateLGCMutedNotificationState Call Notification State: ");
        X.C17900vP.A0b(r0.A44, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0d3a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0d3b, code lost:
        r35 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0d3d, code lost:
        if (r6 != false) goto L_0x0d41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0d3f, code lost:
        r35 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0d41, code lost:
        if (r4 != 16) goto L_0x0d7c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0d43, code lost:
        r37 = r0.A2h.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0d49, code lost:
        r6 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingXmppOffer(r20, r47, r44, r43, r29, r45, r18, r31, r32, r33, r4, r35, r36, r37);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0d5d, code lost:
        if (r6 == 0) goto L_0x0ca1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0d5f, code lost:
        X.C17900vP.A0i("voip/service/handleIncomingOfferStanza: Voip.nativeHandleIncomingXmppOffer failed: ", X.AnonymousClass000.A10(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0d6b, code lost:
        if (r6 == 70004) goto L_0x0d9b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0d6f, code lost:
        if (r0.A47 == false) goto L_0x0ca1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0d75, code lost:
        if (X.AnonymousClass8BT.A1Y(r5) == false) goto L_0x0ca1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0d77, code lost:
        com.whatsapp.voipcalling.Voip.endCall(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0d7c, code lost:
        r36 = 0;
        r37 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0d81, code lost:
        r36 = r13.A00 + 1;
        r4 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0d8d, code lost:
        if (X.AnonymousClass8BT.A1Y(r5) != false) goto L_0x0d93;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0d8f, code lost:
        com.whatsapp.voipcalling.Voip.clearVoipParam(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0d95, code lost:
        if (r0.A47 == false) goto L_0x0d9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0d97, code lost:
        com.whatsapp.voipcalling.Voip.endCall(false, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0d9b, code lost:
        r2.A03(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0d9e, code lost:
        r8.A04(r5, 7952);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0da5, code lost:
        r47 = r13.A03;
        r9 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0dad, code lost:
        if (r10 != 2) goto L_0x0c4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0daf, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0db5, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0db8, code lost:
        r23.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0dbd, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0dc0, code lost:
        r3 = r3.participants.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0dc5, code lost:
        r3 = X.C18020vd.A00(X.C18040vf.A02, r2.A07, 4217);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0dcf, code lost:
        if (r28 != false) goto L_0x0dd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0dd3, code lost:
        if ((r3 & 1) != 0) goto L_0x0de1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0dd5, code lost:
        r3 = "voip/service/peekIncomingOffer: Ignoring 1:1 voice call offer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0ddb, code lost:
        if ((r3 & 2) != 0) goto L_0x0de1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0ddd, code lost:
        r3 = "voip/service/peekIncomingOffer: Ignoring 1:1 video call offer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0de1, code lost:
        r2.A01(r8, r5, r12, r1.A01, r1.A00, X.C20113A7w.A0L, r28, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0dfa, code lost:
        r2.A03(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0f05, code lost:
        if (X.C18020vd.A00(r4, r5, 10194) < 2) goto L_0x0f07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x10a5, code lost:
        if (r9.A03 == false) goto L_0x10a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x1144, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x1147, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x135f, code lost:
        if (r5 >= X.C18020vd.A00(r1, r2, 5254)) goto L_0x1361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:829:0x13ed, code lost:
        r0.CC7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:0x13f0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x14be, code lost:
        r0.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:845:0x14c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x14eb, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:855:0x14ef, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:903:0x1690, code lost:
        r0.remove(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x1693, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x17bc, code lost:
        r0.A0B(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x17bf, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:983:0x17d6, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x17d9, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r48 = this;
            r7 = r48
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x170b;
                case 1: goto L_0x16ff;
                case 2: goto L_0x11b3;
                case 3: goto L_0x16cc;
                case 4: goto L_0x16c0;
                case 5: goto L_0x17c0;
                case 6: goto L_0x16a4;
                case 7: goto L_0x1694;
                case 8: goto L_0x1639;
                case 9: goto L_0x15ab;
                case 10: goto L_0x155a;
                case 11: goto L_0x154e;
                case 12: goto L_0x1148;
                case 13: goto L_0x1125;
                case 14: goto L_0x1532;
                case 15: goto L_0x150c;
                case 16: goto L_0x14f0;
                case 17: goto L_0x002a;
                case 18: goto L_0x14c2;
                case 19: goto L_0x14aa;
                case 20: goto L_0x1494;
                case 21: goto L_0x110f;
                case 22: goto L_0x13fd;
                case 23: goto L_0x13f1;
                case 24: goto L_0x13df;
                case 25: goto L_0x17b2;
                case 26: goto L_0x13d0;
                case 27: goto L_0x13c1;
                case 28: goto L_0x1386;
                case 29: goto L_0x10e0;
                case 30: goto L_0x1378;
                case 31: goto L_0x106a;
                case 32: goto L_0x1046;
                case 33: goto L_0x1020;
                case 34: goto L_0x132a;
                case 35: goto L_0x131e;
                case 36: goto L_0x1312;
                case 37: goto L_0x17a7;
                case 38: goto L_0x0e31;
                case 39: goto L_0x0dff;
                case 40: goto L_0x12f7;
                case 41: goto L_0x0375;
                case 42: goto L_0x0274;
                case 43: goto L_0x12e8;
                case 44: goto L_0x01d6;
                case 45: goto L_0x12d3;
                case 46: goto L_0x12c0;
                case 47: goto L_0x1245;
                case 48: goto L_0x01b1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r7.A01
            X.A99 r0 = (X.A99) r0
            java.lang.Object r2 = r7.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.A7t r0 = r0.A0i
            X.C17960vV.A07(r0)
            r1 = 1
            X.2l3 r0 = r0.A03
            java.util.HashSet r2 = r0.A00(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/maybePrefetchForGroupCall prefetch e2ee sessions for group call, "
            X.C17890vO.A14(r0, r1, r2)
            java.lang.String r0 = " session missing"
            X.C17890vO.A1B(r1, r0)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r5 = r7.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment r5 = (com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment) r5
            java.lang.Object r6 = r7.A02
            r0 = 1
            X.C18070vi.A0d(r6, r0)
            X.11P r0 = r5.A02
            if (r0 == 0) goto L_0x1241
            long r12 = java.lang.System.currentTimeMillis()
            X.1TD r3 = r5.A03
            if (r3 == 0) goto L_0x123d
            X.1HR r0 = r5.A01
            if (r0 == 0) goto L_0x1239
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            java.lang.String r4 = X.C40811vJ.A0A(r0)
            monitor-enter(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1236 }
            java.lang.String r0 = "CallsMessageStore/clearCallLogInBackground currentCallId: "
            X.C17900vP.A0f(r0, r4, r1)     // Catch:{ all -> 0x1236 }
            X.1TE r2 = r3.A00     // Catch:{ all -> 0x1236 }
            X.00z r1 = r2.A01     // Catch:{ all -> 0x1236 }
            monitor-enter(r1)     // Catch:{ all -> 0x1236 }
            r0 = -1
            r1.A07(r0)     // Catch:{ all -> 0x1230 }
            monitor-exit(r1)     // Catch:{ all -> 0x1230 }
            X.00z r1 = r2.A00     // Catch:{ all -> 0x1236 }
            monitor-enter(r1)     // Catch:{ all -> 0x1236 }
            r1.A07(r0)     // Catch:{ all -> 0x122d }
            monitor-exit(r1)     // Catch:{ all -> 0x122d }
            X.1Cd r0 = r3.A0A     // Catch:{ all -> 0x1236 }
            X.1au r10 = r0.A05()     // Catch:{ all -> 0x1236 }
            X.1xA r9 = r10.BD0()     // Catch:{ all -> 0x1223 }
            java.lang.String r2 = ""
            if (r4 == 0) goto L_0x0087
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1219 }
            java.lang.String r0 = " AND call_id != '"
            r1.append(r0)     // Catch:{ all -> 0x1219 }
            r1.append(r4)     // Catch:{ all -> 0x1219 }
            java.lang.String r0 = "'"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x1219 }
        L_0x0087:
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1219 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x1219 }
            java.lang.String r7 = "call_log"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1219 }
            java.lang.String r0 = "(is_joinable_group_call is NULL OR is_joinable_group_call = ?)"
            java.lang.String r4 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x1219 }
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x1219 }
            r1 = 0
            java.lang.String r0 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x1219 }
            r2[r1] = r0     // Catch:{ all -> 0x1219 }
            java.lang.String r0 = "clearCallLogInBackground/DELETE_CALL_LOG"
            r8.A04(r7, r4, r0, r2)     // Catch:{ all -> 0x1219 }
            r9.A00()     // Catch:{ all -> 0x1219 }
            r9.close()     // Catch:{ all -> 0x1223 }
            r10.close()     // Catch:{ all -> 0x1236 }
            X.1Q6 r4 = r3.A08     // Catch:{ all -> 0x1236 }
            java.lang.Class<X.22M> r11 = X.AnonymousClass22M.class
            X.1Q7 r7 = r4.A01     // Catch:{ all -> 0x1236 }
            monitor-enter(r7)     // Catch:{ all -> 0x1236 }
            X.00z r9 = r7.A01     // Catch:{ all -> 0x1233 }
            java.util.LinkedHashMap r0 = r9.A06()     // Catch:{ all -> 0x1233 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x1233 }
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)     // Catch:{ all -> 0x1233 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x1233 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x1233 }
        L_0x00ce:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x1233 }
            if (r0 == 0) goto L_0x00eb
            X.206 r1 = X.C17880vN.A0Y(r2)     // Catch:{ all -> 0x1233 }
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x1233 }
            boolean r0 = r11.isAssignableFrom(r0)     // Catch:{ all -> 0x1233 }
            if (r0 == 0) goto L_0x00ce
            r8.add(r1)     // Catch:{ all -> 0x1233 }
            X.205 r0 = r1.A0v     // Catch:{ all -> 0x1233 }
            r9.A05(r0)     // Catch:{ all -> 0x1233 }
            goto L_0x00ce
        L_0x00eb:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x1233 }
            java.util.Map r2 = r7.A02     // Catch:{ all -> 0x1233 }
            java.util.Iterator r9 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x1233 }
        L_0x00f5:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x1233 }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x1233 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x1233 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x1233 }
            X.206 r1 = (X.AnonymousClass206) r1     // Catch:{ all -> 0x1233 }
            if (r1 == 0) goto L_0x00f5
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x1233 }
            boolean r0 = r11.isAssignableFrom(r0)     // Catch:{ all -> 0x1233 }
            if (r0 == 0) goto L_0x00f5
            X.205 r0 = r1.A0v     // Catch:{ all -> 0x1233 }
            r10.add(r0)     // Catch:{ all -> 0x1233 }
            goto L_0x00f5
        L_0x0119:
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x1233 }
        L_0x011d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1233 }
            if (r0 == 0) goto L_0x012d
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1233 }
            X.205 r0 = (X.AnonymousClass205) r0     // Catch:{ all -> 0x1233 }
            r2.remove(r0)     // Catch:{ all -> 0x1233 }
            goto L_0x011d
        L_0x012d:
            monitor-exit(r7)     // Catch:{ all -> 0x1236 }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x1236 }
        L_0x0132:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x1236 }
            if (r0 == 0) goto L_0x0149
            X.206 r1 = X.C17880vN.A0Y(r2)     // Catch:{ all -> 0x1236 }
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x1236 }
            X.205 r1 = r1.A0v     // Catch:{ all -> 0x1236 }
            r0.remove(r1)     // Catch:{ all -> 0x1236 }
            X.1CJ r0 = r4.A00     // Catch:{ all -> 0x1236 }
            r0.A0N(r1)     // Catch:{ all -> 0x1236 }
            goto L_0x0132
        L_0x0149:
            monitor-exit(r3)
            X.0ve r0 = r5.A02
            boolean r0 = X.C40811vJ.A0W(r0)
            if (r0 == 0) goto L_0x0192
            X.1Uq r0 = r5.A04
            if (r0 == 0) goto L_0x1211
            X.1Cd r0 = r0.A03
            X.1au r10 = r0.A05()
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1207 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x1207 }
            java.lang.String r8 = "scheduled_calls"
            java.lang.String r7 = "scheduled_timestamp < ?"
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ all -> 0x1207 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1207 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            java.lang.String r1 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x1207 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x1207 }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_EXPIRED_SCHEDULED_CALLS"
            int r2 = r9.A04(r8, r7, r0, r4)     // Catch:{ all -> 0x1207 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1207 }
            java.lang.String r0 = "ScheduledCallsStore/deleteExpiredScheduledCalls "
            r1.append(r0)     // Catch:{ all -> 0x1207 }
            r1.append(r2)     // Catch:{ all -> 0x1207 }
            java.lang.String r0 = " deleted"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x1207 }
            r10.close()
        L_0x0192:
            X.11P r0 = r5.A02
            if (r0 == 0) goto L_0x1241
            long r3 = X.AnonymousClass8BR.A04(r12)
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a4
            long r1 = r1 - r3
            android.os.SystemClock.sleep(r1)
        L_0x01a4:
            X.1KB r2 = r5.A00
            if (r2 == 0) goto L_0x1215
            r0 = 18
            X.Ajy r1 = new X.Ajy
            r1.<init>(r5, r6, r0)
            goto L_0x1144
        L_0x01b1:
            java.lang.Object r3 = r7.A01
            X.A99 r3 = (X.A99) r3
            java.lang.Object r2 = r7.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            int r1 = com.whatsapp.voipcalling.Voip.sendMutePeerRequestInGroupCall(r2)
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r1 != r0) goto L_0x01cc
            java.util.List r1 = java.util.Collections.singletonList(r2)
            r0 = 18
            r3.A18(r1, r0)
            return
        L_0x01cc:
            if (r1 != 0) goto L_0x0029
            android.os.Handler r1 = r3.A0H
            r0 = 40
            r1.sendEmptyMessage(r0)
            return
        L_0x01d6:
            java.lang.Object r5 = r7.A01
            X.A99 r5 = (X.A99) r5
            java.lang.Object r6 = r7.A02
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            com.whatsapp.voipcalling.CallInfo r7 = X.AnonymousClass8BR.A0r(r5)
            if (r7 == 0) goto L_0x023c
            X.6qE r0 = r7.self
            if (r0 == 0) goto L_0x023c
            r4 = 1
            r3 = 0
            if (r6 != 0) goto L_0x0228
            boolean r0 = r0.A0I
            boolean r2 = X.AnonymousClass000.A1P(r0)
        L_0x01f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/toggleMuteStatus "
            r1.append(r0)
            if (r2 == 0) goto L_0x0225
            java.lang.String r0 = "mute"
        L_0x01ff:
            r1.append(r0)
            java.lang.String r0 = ", shouldMute = "
            X.C17900vP.A0Y(r6, r0, r1)
            com.whatsapp.voipcalling.Voip.muteCall(r2)
            if (r2 == 0) goto L_0x022d
            X.1DC r0 = r5.A30
            X.1DD r0 = (X.AnonymousClass1DD) r0
            X.0ve r2 = r0.A02
            r1 = 4226(0x1082, float:5.922E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0029
            X.Adx r0 = r5.A0R
            X.C17960vV.A07(r0)
            r0.A0C(r4)
            return
        L_0x0225:
            java.lang.String r0 = "unmute"
            goto L_0x01ff
        L_0x0228:
            boolean r2 = r6.booleanValue()
            goto L_0x01f2
        L_0x022d:
            boolean r0 = r7.isSelfCallOnHold()
            if (r0 != 0) goto L_0x0029
            X.Adx r0 = r5.A0R
            X.C17960vV.A07(r0)
            r0.A0C(r3)
            return
        L_0x023c:
            X.0ve r2 = r5.A2p
            r1 = 8524(0x214c, float:1.1945E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.voipcalling.CallLinkInfo r0 = com.whatsapp.voipcalling.Voip.getCallLinkInfo()
            if (r0 == 0) goto L_0x175c
            if (r6 != 0) goto L_0x026f
            X.6qE r0 = r0.self
            boolean r0 = r0.A0I
            boolean r2 = X.AnonymousClass000.A1P(r0)
        L_0x0258:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/maybeMuteInCallLinkLobby "
            r1.append(r0)
            if (r2 == 0) goto L_0x026c
            java.lang.String r0 = "mute"
        L_0x0265:
            X.C17890vO.A1A(r1, r0)
            com.whatsapp.voipcalling.Voip.muteCall(r2)
            return
        L_0x026c:
            java.lang.String r0 = "unmute"
            goto L_0x0265
        L_0x026f:
            boolean r2 = r6.booleanValue()
            goto L_0x0258
        L_0x0274:
            java.lang.Object r1 = r7.A01
            X.A99 r1 = (X.A99) r1
            java.lang.Object r0 = r7.A02
            X.A69 r0 = (X.A69) r0
            X.A2h r11 = r1.A0V
            java.lang.Object r5 = r0.A02
            X.C17960vV.A07(r5)
            X.9r8 r5 = (X.C194079r8) r5
            X.98v r4 = r5.A00
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "call_terminate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0297
            java.lang.String r0 = r4.A06
            com.whatsapp.voipcalling.Voip.handleIncomingTerminatePush(r0)
            return
        L_0x0297:
            java.lang.String r0 = "voip_call_offer_1on1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.jid.DeviceJid r12 = r4.A03
            if (r12 == 0) goto L_0x02c0
            boolean r0 = X.C22971Dz.A0T(r12)
            if (r0 == 0) goto L_0x02c0
            com.whatsapp.jid.DeviceJid r3 = r4.A04
            if (r3 == 0) goto L_0x02c0
            boolean r0 = r3 instanceof X.AnonymousClass1E3
            if (r0 == 0) goto L_0x02c0
            X.A99 r0 = r11.A03
            X.1Ln r2 = r0.A2n
            com.whatsapp.jid.UserJid r1 = r12.userJid
            X.1E1 r1 = (X.AnonymousClass1E1) r1
            com.whatsapp.jid.UserJid r0 = r3.userJid
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            r2.A0P(r1, r0)
        L_0x02c0:
            X.A99 r3 = r11.A03
            android.telephony.TelephonyManager r1 = r3.A1s
            X.17x r0 = r3.A2e
            int r0 = X.C63982u1.A00(r1, r0)
            r3.A04 = r0
            java.lang.String r14 = r4.A06
            boolean r0 = r11.A04(r14)
            if (r0 == 0) goto L_0x02e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/service/handleIncomingCallPushPayload: Ignoring because phone is busy: "
            r1.append(r0)
            int r0 = r3.A04
            java.lang.String r0 = X.C40811vJ.A08(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x17d6
        L_0x02e9:
            X.9hv r0 = r3.A0Q(r14)
            X.9t9 r5 = r5.A01
            int r6 = r5.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r1 = r0.A08
            if (r1 != 0) goto L_0x02fb
            r0.A08 = r2
        L_0x02fb:
            long r15 = r4.A00
            r9 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r9
            long r1 = r5.A01
            long r1 = r1 - r15
            java.lang.Long r7 = r0.A09
            if (r7 != 0) goto L_0x030d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.A09 = r1
        L_0x030d:
            java.lang.Long r1 = r5.A04
            if (r1 == 0) goto L_0x0320
            long r7 = r1.longValue()
            long r7 = r7 - r15
            java.lang.Long r1 = r0.A0B
            if (r1 != 0) goto L_0x0320
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r0.A0B = r1
        L_0x0320:
            java.lang.Long r1 = r5.A03
            if (r1 == 0) goto L_0x0333
            long r7 = r1.longValue()
            long r7 = r7 - r15
            java.lang.Long r1 = r0.A0A
            if (r1 != 0) goto L_0x0333
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r0.A0A = r1
        L_0x0333:
            java.lang.Integer r2 = r5.A02
            if (r2 == 0) goto L_0x033d
            java.lang.Integer r1 = r0.A06
            if (r1 != 0) goto L_0x033d
            r0.A06 = r2
        L_0x033d:
            r5 = 1
            r1 = 2
            if (r6 != r5) goto L_0x0342
            r1 = 3
        L_0x0342:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            monitor-enter(r0)
            java.lang.Integer r1 = r0.A04     // Catch:{ all -> 0x1763 }
            if (r1 != 0) goto L_0x034d
            r0.A04 = r2     // Catch:{ all -> 0x1763 }
        L_0x034d:
            monitor-exit(r0)
            X.11P r1 = r3.A2c
            long r17 = X.AnonymousClass11P.A01(r1)
            long r17 = r17 - r15
            long r1 = r4.A01
            long r1 = r1 * r9
            X.0ve r7 = r3.A2p
            r6 = 11175(0x2ba7, float:1.566E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r7, r6)
            if (r3 == 0) goto L_0x0029
            r0.A0H = r5
            com.whatsapp.jid.DeviceJid r13 = r4.A04
            boolean r0 = r4.A09
            r19 = r1
            r21 = r0
            r22 = r5
            r11.A01(r12, r13, r14, r15, r17, r19, r21, r22)
            return
        L_0x0375:
            java.lang.Object r0 = r7.A01
            r17 = r0
            r0 = r17
            X.A99 r0 = (X.A99) r0
            r17 = r0
            java.lang.Object r5 = r7.A02
            android.os.Message r5 = (android.os.Message) r5
            X.A2h r2 = r0.A0V
            r7 = 0
            X.C18070vi.A0d(r5, r7)
            int r4 = r5.arg1
            r3 = 197(0xc5, float:2.76E-43)
            r1 = 193(0xc1, float:2.7E-43)
            r0 = 192(0xc0, float:2.69E-43)
            if (r4 == r0) goto L_0x0559
            if (r4 == r1) goto L_0x046f
            if (r4 == r3) goto L_0x095e
            java.lang.Object r3 = r5.obj
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.Class<X.2nR> r0 = X.C60132nR.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r3.setClassLoader(r0)
            r0 = 15
            if (r4 == r0) goto L_0x0464
            r0 = 150(0x96, float:2.1E-43)
            if (r4 == r0) goto L_0x03d4
            java.lang.String r0 = "decodeCallMessage/unknown_message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03b1:
            java.util.concurrent.atomic.AtomicInteger r0 = X.A99.A4B
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L_0x0029
            r0 = r17
            X.1HQ r0 = r0.A29
            X.1HR r0 = (X.AnonymousClass1HR) r0
            X.0ve r0 = r0.A00
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.A03(r0)
            if (r1 == 0) goto L_0x175f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x175f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x175f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x175f
            return
        L_0x03d4:
            java.lang.String r0 = "deviceJidRawString"
            java.lang.String r1 = r3.getString(r0)
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r4 = r0.A06(r1)
            X.C17960vV.A07(r4)
            java.lang.String r0 = "type"
            java.lang.String r6 = r3.getString(r0)
            java.lang.String r0 = "callId"
            java.lang.String r8 = r3.getString(r0)
            java.lang.String r0 = "registrationId"
            byte[] r11 = r3.getByteArray(r0)
            java.lang.String r0 = "retry"
            byte r3 = r3.getByte(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/receive_message/call-rekey-receipt from "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", call id "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", type "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", retry "
            X.C17900vP.A0j(r0, r1, r3)
            com.whatsapp.jid.UserJid r10 = r4.userJid
            X.A99 r5 = r2.A03
            com.whatsapp.voipcalling.CallInfo r9 = X.AnonymousClass8BR.A0r(r5)
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r9, r8)
            r1 = 1
            if (r0 == 0) goto L_0x0568
            java.util.Map r0 = r9.participants
            java.lang.Object r0 = r0.get(r10)
            X.6qE r0 = (X.C134216qE) r0
            if (r0 == 0) goto L_0x0568
            int r0 = r0.A04
            if (r0 != r1) goto L_0x0568
            java.lang.String r0 = "enc_rekey_retry"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x09b6
            if (r3 > 0) goto L_0x0444
            r1 = 0
        L_0x0444:
            java.lang.String r0 = "retryCount should always be greater than 0 in enc rekey response"
            X.C17960vV.A0F(r1, r0)
            java.util.Map r1 = r5.A3d
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r1.put(r4, r0)
            X.10I r1 = r5.A31
            r13 = 8
            X.Aiu r0 = new X.Aiu
            r8 = r0
            r9 = r2
            r10 = r4
            r12 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r1.CGF(r0)
            goto L_0x03b1
        L_0x0464:
            X.A99 r0 = r2.A03
            android.os.Handler r1 = r0.A0H
            r0 = 29
            r1.sendEmptyMessage(r0)
            goto L_0x03b1
        L_0x046f:
            java.lang.Object r4 = r5.obj
            X.9fr r4 = (X.C187469fr) r4
            java.lang.String r3 = r4.A03
            int r0 = r3.hashCode()
            switch(r0) {
                case -1624583601: goto L_0x04c6;
                case -1423461112: goto L_0x04bc;
                case 103144406: goto L_0x04b2;
                case 105650780: goto L_0x04a8;
                case 1184155715: goto L_0x049e;
                case 1945493729: goto L_0x0488;
                default: goto L_0x047c;
            }
        L_0x047c:
            com.whatsapp.jid.Jid r5 = r4.A01
            int r1 = r4.A00
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r4.A04
            int r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppAck(r5, r3, r1, r0)
            goto L_0x09a7
        L_0x0488:
            java.lang.String r0 = "link_create"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            java.lang.String r1 = r4.A02
            java.lang.String r0 = X.A99.A49
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x047c
            java.lang.String r0 = "onCallIncomingAck: no matched request found, link_create_ack dropped"
            goto L_0x057a
        L_0x049e:
            java.lang.String r0 = "link_query"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            r0 = 4
            goto L_0x04cf
        L_0x04a8:
            java.lang.String r0 = "offer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            r0 = 3
            goto L_0x04cf
        L_0x04b2:
            java.lang.String r0 = "lobby"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            r0 = 2
            goto L_0x04cf
        L_0x04bc:
            java.lang.String r0 = "accept"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            r0 = 1
            goto L_0x04cf
        L_0x04c6:
            java.lang.String r0 = "link_join"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x047c
            r0 = 0
        L_0x04cf:
            r9 = 0
            switch(r0) {
                case 0: goto L_0x050d;
                case 1: goto L_0x04f6;
                case 2: goto L_0x04f1;
                case 3: goto L_0x0512;
                default: goto L_0x04d4;
            }
        L_0x04d4:
            X.A99 r0 = r2.A03
            X.9d6 r7 = r0.A0b
        L_0x04d8:
            if (r7 == 0) goto L_0x047c
            long r0 = r7.A00
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x047c
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r7.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x047c
        L_0x04ea:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.A00 = r0
            goto L_0x047c
        L_0x04f1:
            X.A99 r0 = r2.A03
            X.9d6 r7 = r0.A0c
            goto L_0x04fa
        L_0x04f6:
            X.A99 r0 = r2.A03
            X.9d6 r7 = r0.A0Z
        L_0x04fa:
            if (r7 == 0) goto L_0x047c
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r7.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x047c
            long r5 = r7.A00
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x047c
            goto L_0x04ea
        L_0x050d:
            X.A99 r0 = r2.A03
            X.9d6 r7 = r0.A0a
            goto L_0x04d8
        L_0x0512:
            X.A99 r7 = r2.A03
            X.9d6 r8 = r7.A0d
            if (r8 == 0) goto L_0x0547
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r8.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0547
            long r5 = r8.A00
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0547
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A00 = r0
            X.1HQ r0 = r2.A01
            com.whatsapp.voipcalling.CallInfo r0 = r0.BO3()
            if (r0 == 0) goto L_0x0547
            boolean r0 = r0.isBotCall
            if (r0 == 0) goto L_0x0547
            X.00H r0 = r7.A3X
            java.lang.Object r1 = r0.get()
            X.6zu r1 = (X.C140076zu) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r1.A02(r0)
        L_0x0547:
            int r1 = r4.A00
            r0 = 435(0x1b3, float:6.1E-43)
            if (r1 != r0) goto L_0x047c
            X.1KB r1 = r2.A00
            X.AkS r0 = new X.AkS
            r0.<init>(r1)
            r1.A0J(r0)
            goto L_0x047c
        L_0x0559:
            java.lang.Object r1 = r5.obj
            X.97K r1 = (X.AnonymousClass97K) r1
            X.1VK r0 = r2.A06
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x057f
            java.lang.String r0 = "voip/service/onCallIncomingStanza dropping incoming call stanza (isInCompanionMode)"
            goto L_0x057a
        L_0x0568:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/receive_message/call-rekey-receipt call "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " ended, ignoring"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x057a:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x03b1
        L_0x057f:
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r1.A01
            r47 = r0
            r28 = r0
            java.lang.String r3 = r0.tag
            int r0 = r3.hashCode()
            r15 = 0
            r6 = 3
            r9 = 1
            switch(r0) {
                case -1423461112: goto L_0x069a;
                case -934710369: goto L_0x0690;
                case -518602638: goto L_0x0686;
                case 105650780: goto L_0x067c;
                case 112202875: goto L_0x0672;
                case 1063018407: goto L_0x0668;
                case 2035990113: goto L_0x05b8;
                default: goto L_0x0591;
            }
        L_0x0591:
            com.whatsapp.jid.Jid r9 = r1.A00
            java.lang.String r8 = r1.A08
            java.lang.String r7 = r1.A06
            long r5 = r1.A01
            long r3 = r1.A00
            boolean r0 = r1.A09
            r19 = r47
            r20 = r8
            r21 = r7
            r22 = r5
            r24 = r3
            r26 = r0
            r18 = r9
            int r3 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmpp(r18, r19, r20, r21, r22, r24, r26)
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r3 != r0) goto L_0x03b1
        L_0x05b4:
            java.lang.String r0 = r1.A02
            goto L_0x09ad
        L_0x05b8:
            java.lang.String r11 = "terminate"
            boolean r0 = r3.equals(r11)
            if (r0 == 0) goto L_0x0591
            X.1N7 r0 = r2.A08
            long r3 = r1.A02
            X.2tQ r0 = X.AnonymousClass1N7.A00(r0, r6, r3)
            if (r0 == 0) goto L_0x05cd
            r0.A05(r6)
        L_0x05cd:
            X.2lD r5 = new X.2lD
            r5.<init>()
            com.whatsapp.jid.Jid r0 = r1.A00
            r5.A02 = r0
            java.lang.String r0 = "call"
            r5.A06 = r0
            java.lang.String r0 = r1.A03
            r5.A08 = r0
            r5.A00 = r3
            r0 = r47
            java.lang.String r0 = r0.tag
            r5.A09 = r0
            X.2nR r15 = r5.A00()
            com.whatsapp.jid.DeviceJid r14 = r1.A03
            java.lang.String r13 = r1.A02
            X.A99 r12 = r2.A03
            com.whatsapp.voipcalling.CallInfo r3 = X.AnonymousClass8BR.A0r(r12)
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r3, r13)
            if (r0 == 0) goto L_0x065d
            long r5 = r3.audioDuration
            long r3 = r3.videoDuration
            android.os.Handler r0 = r12.A0H
            r10 = 1
            r0.removeMessages(r9)
            r18 = 0
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x060e
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x065d
        L_0x060e:
            boolean r0 = X.AnonymousClass000.A1W(r14)
            int r8 = r0 + 1
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            int r8 = r8 + r0
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1R(r0)
            int r8 = r8 + r0
            X.1MD[] r9 = new X.AnonymousClass1MD[r8]
            r8 = 1
            java.lang.String r0 = "call-id"
            X.C17880vN.A1Q(r0, r13, r9, r7)
            if (r14 == 0) goto L_0x0632
            java.lang.String r0 = "call-creator"
            X.C17880vN.A1I(r14, r0, r9, r10)
            r8 = 2
        L_0x0632:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0642
            int r10 = r8 + 1
            java.lang.String r7 = "audio_duration"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            X.C17880vN.A1Q(r7, r0, r9, r8)
            r8 = r10
        L_0x0642:
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x064f
            java.lang.String r5 = "video_duration"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            X.C17880vN.A1Q(r5, r0, r9, r8)
        L_0x064f:
            X.1ca r3 = X.AnonymousClass8BR.A0k(r11, r9)
            X.2lD r0 = r15.A00()
            r0.A04 = r3
            X.2nR r15 = r0.A00()
        L_0x065d:
            X.00H r0 = r12.A3O
            X.1OZ r0 = X.C17880vN.A0U(r0)
            r0.A0K(r15)
            goto L_0x0591
        L_0x0668:
            java.lang.String r0 = "enc_rekey"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0591
            r3 = 5
            goto L_0x06a3
        L_0x0672:
            java.lang.String r0 = "video"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0773
            goto L_0x0591
        L_0x067c:
            java.lang.String r0 = "offer"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x09c5
            goto L_0x0591
        L_0x0686:
            java.lang.String r0 = "reminder"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0591
            r3 = 2
            goto L_0x06a3
        L_0x0690:
            java.lang.String r0 = "reject"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x07bc
            goto L_0x0591
        L_0x069a:
            java.lang.String r0 = "accept"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0591
            r3 = 0
        L_0x06a3:
            r0 = 0
            switch(r3) {
                case 0: goto L_0x0882;
                case 1: goto L_0x07bc;
                case 2: goto L_0x083f;
                case 3: goto L_0x09c5;
                case 4: goto L_0x0773;
                default: goto L_0x06a7;
            }
        L_0x06a7:
            X.C19994A2h.A00(r2, r1)
            X.1N7 r5 = r2.A08
            long r3 = r1.A02
            r26 = r3
            X.2tQ r5 = X.AnonymousClass1N7.A00(r5, r6, r3)
            if (r5 == 0) goto L_0x06b9
            r5.A05(r6)
        L_0x06b9:
            com.whatsapp.jid.DeviceJid r3 = r1.A03
            r16 = r3
            if (r3 != 0) goto L_0x06c3
            java.lang.String r0 = "call creator can not be null in call rekey request"
            goto L_0x09c0
        L_0x06c3:
            com.whatsapp.jid.Jid r4 = r1.A00
            boolean r3 = r4 instanceof com.whatsapp.jid.DeviceJid
            r13 = 0
            if (r3 == 0) goto L_0x06cd
            r13 = r4
            com.whatsapp.jid.DeviceJid r13 = (com.whatsapp.jid.DeviceJid) r13
        L_0x06cd:
            X.C17960vV.A07(r13)
            X.A7t r3 = r2.A05
            X.9yX r12 = r3.A05(r1, r7)
            if (r5 == 0) goto L_0x06dd
            X.0ve r3 = r2.A07
            X.AnonymousClass8BY.A0y(r3, r5)
        L_0x06dd:
            X.9lr r3 = r2.A02
            java.lang.String r11 = r1.A03
            java.lang.String r8 = r1.A02
            int r10 = r12.A01
            boolean r5 = X.AnonymousClass000.A1T(r10, r6)
            byte r6 = r12.A00
            r4 = 2
            X.C18070vi.A0d(r13, r4)
            if (r5 == 0) goto L_0x0766
            X.1P3 r4 = r3.A01
            int r5 = r4.A06()
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r14 = "voip/call-send-methods sending e2e reject with retry: "
            r4.append(r14)
            int r6 = r6 + 1
            r4.append(r6)
            java.lang.String r14 = " message.id="
            r4.append(r14)
            r4.append(r11)
            java.lang.String r14 = " localRegistrationId="
            X.C17900vP.A0j(r14, r4, r5)
            byte[] r15 = X.A8G.A03(r5)
            X.00H r4 = r3.A03
            X.1OZ r5 = X.C17880vN.A0U(r4)
            X.0ve r14 = r3.A02
            X.190 r4 = r3.A00
            byte r6 = (byte) r6
            java.lang.String r3 = "enc_rekey_retry"
        L_0x0723:
            java.lang.String r20 = "call"
            java.lang.String r21 = "rekey"
            r22 = r11
            r23 = r26
            r25 = r9
            r18 = r4
            r19 = r14
            X.C63902ts.A07(r18, r19, r20, r21, r22, r23, r25)
            android.os.Bundle r4 = X.C17880vN.A0D()
            r18 = r4
            r19 = r16
            r20 = r13
            r21 = r11
            r22 = r8
            X.C63902ts.A06(r18, r19, r20, r21, r22, r23)
            java.lang.String r13 = "type"
            r4.putString(r13, r3)
            java.lang.String r3 = "registrationId"
            r4.putByteArray(r3, r15)
            java.lang.String r3 = "retry"
            r4.putByte(r3, r6)
            r3 = 157(0x9d, float:2.2E-43)
            android.os.Message r3 = android.os.Message.obtain(r0, r7, r3, r7, r4)
            X.C18070vi.A0X(r3)
            r5.A0G(r3, r11)
            if (r10 == 0) goto L_0x0837
            if (r10 == r9) goto L_0x0dfa
            goto L_0x03b1
        L_0x0766:
            X.00H r4 = r3.A03
            X.1OZ r5 = X.C17880vN.A0U(r4)
            X.0ve r14 = r3.A02
            X.190 r4 = r3.A00
            r3 = 0
            r15 = r0
            goto L_0x0723
        L_0x0773:
            com.whatsapp.jid.Jid r3 = r1.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            r6 = 0
            if (r0 == 0) goto L_0x077d
            r6 = r3
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
        L_0x077d:
            X.C17960vV.A07(r6)
            java.lang.String r0 = r1.A02
            long r3 = r1.A01
            java.lang.StringBuilder r5 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "_"
            java.lang.String r0 = X.AnonymousClass8BS.A0g(r6, r0, r5)
            java.lang.String r9 = X.AnonymousClass000.A0y(r0, r5)
            X.A99 r0 = r2.A03
            java.util.Map r8 = r0.A3b
            java.lang.Number r7 = X.C108945cZ.A1E(r9, r8)
            if (r7 == 0) goto L_0x07b7
            long r5 = r7.longValue()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x07b7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/receive_message/call-video-changed ignore this message. epochTimeMillis = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", latest = "
            X.C17900vP.A0Y(r7, r0, r1)
            goto L_0x03b1
        L_0x07b7:
            X.AnonymousClass8BT.A1O(r9, r8, r3)
            goto L_0x0591
        L_0x07bc:
            X.1N7 r0 = r2.A08
            long r13 = r1.A02
            X.2tQ r5 = X.AnonymousClass1N7.A00(r0, r6, r13)
            if (r5 == 0) goto L_0x07c9
            r5.A05(r6)
        L_0x07c9:
            com.whatsapp.jid.Jid r3 = r1.A00
            boolean r0 = r3 instanceof com.whatsapp.jid.DeviceJid
            r4 = 0
            if (r0 == 0) goto L_0x07d3
            r4 = r3
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
        L_0x07d3:
            X.C17960vV.A07(r4)
            com.whatsapp.jid.DeviceJid r3 = r1.A03
            if (r3 != 0) goto L_0x07eb
            X.A99 r0 = r2.A03
            X.11S r3 = r0.A23
            boolean r0 = X.C22971Dz.A0T(r4)
            if (r0 == 0) goto L_0x0831
            X.1yJ r3 = r3.A08()
        L_0x07e8:
            X.C17960vV.A07(r3)
        L_0x07eb:
            if (r5 == 0) goto L_0x07f2
            X.0ve r0 = r2.A07
            X.AnonymousClass8BY.A0y(r0, r5)
        L_0x07f2:
            X.9lr r6 = r2.A02
            java.lang.String r12 = r1.A03
            java.lang.String r0 = r1.A02
            X.C18070vi.A0e(r4, r9, r3)
            X.00H r5 = r6.A03
            X.1OZ r5 = X.C17880vN.A0U(r5)
            X.0ve r9 = r6.A02
            X.190 r8 = r6.A00
            java.lang.String r10 = "call"
            java.lang.String r11 = "reject"
            r15 = 1
            X.C63902ts.A07(r8, r9, r10, r11, r12, r13, r15)
            r8 = 4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r8)
            r20 = r4
            r21 = r12
            r22 = r0
            r23 = r13
            r18 = r6
            r19 = r3
            X.C63902ts.A06(r18, r19, r20, r21, r22, r23)
            r3 = 73
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r0, r7, r3, r7, r6)
            X.C18070vi.A0X(r0)
            r5.A0G(r0, r12)
            goto L_0x0591
        L_0x0831:
            r3.A0I()
            X.1E3 r3 = r3.A02
            goto L_0x07e8
        L_0x0837:
            byte[] r3 = r12.A05
            if (r3 == 0) goto L_0x0dfa
            com.whatsapp.protocol.VoipStanzaChildNode r3 = r12.A03
            r47 = r3
        L_0x083f:
            java.lang.String r4 = "scheduled-id"
            r3 = r28
            X.1MD r3 = r3.getFirstAttributeByName(r4)
            if (r3 == 0) goto L_0x0880
            java.lang.String r7 = r3.A03
        L_0x084b:
            java.lang.String r4 = "group-jid"
            r3 = r28
            X.1MD r3 = r3.getFirstAttributeByName(r4)
            if (r3 == 0) goto L_0x085d
            com.whatsapp.jid.Jid r3 = r3.A01
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r3)
        L_0x085d:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L_0x0591
            if (r0 == 0) goto L_0x0591
            r0.getRawString()
            X.A99 r3 = r2.A03
            X.00H r3 = r3.A3R
            java.lang.Object r6 = r3.get()
            X.1m1 r6 = (X.C35311m1) r6
            X.10s r5 = r6.A08
            r4 = 16
            X.7Qz r3 = new X.7Qz
            r3.<init>(r6, r0, r7, r4)
            r5.execute(r3)
            goto L_0x0591
        L_0x0880:
            r7 = r0
            goto L_0x084b
        L_0x0882:
            X.1N7 r5 = r2.A08
            long r3 = r1.A02
            X.2tQ r8 = X.AnonymousClass1N7.A00(r5, r6, r3)
            if (r8 == 0) goto L_0x088f
            r8.A05(r6)
        L_0x088f:
            com.whatsapp.jid.Jid r6 = r1.A00
            boolean r5 = r6 instanceof com.whatsapp.jid.DeviceJid
            r12 = 0
            if (r5 == 0) goto L_0x0899
            r12 = r6
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
        L_0x0899:
            X.C17960vV.A07(r12)
            com.whatsapp.jid.DeviceJid r11 = r1.A03
            if (r11 != 0) goto L_0x08b1
            X.A99 r5 = r2.A03
            X.11S r6 = r5.A23
            boolean r5 = X.C22971Dz.A0T(r12)
            if (r5 == 0) goto L_0x0942
            X.1yJ r11 = r6.A08()
        L_0x08ae:
            X.C17960vV.A07(r11)
        L_0x08b1:
            X.1HQ r5 = r2.A01
            com.whatsapp.voipcalling.CallInfo r5 = r5.BO3()
            if (r5 == 0) goto L_0x08cb
            boolean r5 = r5.isBotCall
            if (r5 == 0) goto L_0x08cb
            r15 = 1
            X.00H r5 = r2.A09
            java.lang.Object r6 = r5.get()
            X.6zu r6 = (X.C140076zu) r6
            java.lang.Integer r5 = X.AnonymousClass00R.A0u
            r6.A02(r5)
        L_0x08cb:
            java.lang.String r6 = "enc"
            r5 = r47
            com.whatsapp.protocol.VoipStanzaChildNode r5 = r5.getFirstChildByTag(r6)
            if (r5 == 0) goto L_0x08dd
            if (r15 == 0) goto L_0x05b4
            X.A7t r0 = r2.A05
            X.9yX r0 = r0.A05(r1, r9)
        L_0x08dd:
            if (r8 == 0) goto L_0x08e4
            X.0ve r5 = r2.A07
            X.AnonymousClass8BY.A0y(r5, r8)
        L_0x08e4:
            X.9lr r14 = r2.A02
            java.lang.String r13 = r1.A03
            java.lang.String r8 = r1.A02
            X.C18070vi.A0e(r12, r9, r11)
            X.00H r5 = r14.A03
            X.1OZ r10 = X.C17880vN.A0U(r5)
            X.0ve r6 = r14.A02
            X.190 r5 = r14.A00
            java.lang.String r20 = "call"
            java.lang.String r21 = "accept"
            r22 = r13
            r23 = r3
            r25 = r9
            r19 = r6
            r18 = r5
            X.C63902ts.A07(r18, r19, r20, r21, r22, r23, r25)
            r6 = 4
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>(r6)
            r18 = r5
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r8
            X.C63902ts.A06(r18, r19, r20, r21, r22, r23)
            r4 = 72
            r3 = 0
            android.os.Message r3 = android.os.Message.obtain(r3, r7, r4, r7, r5)
            X.C18070vi.A0X(r3)
            r10.A0G(r3, r13)
            boolean r3 = X.AnonymousClass8BT.A1Y(r8)
            if (r3 == 0) goto L_0x0938
            X.A99 r4 = r2.A03
            java.lang.String r3 = r1.A08
            r4.A1B = r3
            java.lang.String r3 = r1.A06
            r4.A1A = r3
        L_0x0938:
            if (r0 == 0) goto L_0x094d
            int r3 = r0.A01
            if (r3 == 0) goto L_0x0949
            if (r3 == r9) goto L_0x0dfa
            goto L_0x03b1
        L_0x0942:
            r6.A0I()
            X.1E3 r11 = r6.A02
            goto L_0x08ae
        L_0x0949:
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r0.A03
            r47 = r0
        L_0x094d:
            if (r15 == 0) goto L_0x0591
            X.00H r0 = r2.A09
            java.lang.Object r3 = r0.get()
            X.6zu r3 = (X.C140076zu) r3
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            r3.A02(r0)
            goto L_0x0591
        L_0x095e:
            java.lang.Object r7 = r5.obj
            X.2d5 r7 = (X.C53782d5) r7
            com.whatsapp.protocol.VoipStanzaChildNode r6 = r7.A01
            java.lang.String r1 = "enc_rekey"
            java.lang.String r0 = r6.tag
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x09a1
            com.whatsapp.jid.DeviceJid r4 = r7.A00
            com.whatsapp.jid.UserJid r3 = r4.userJid
            r1 = 1
            java.lang.String r0 = "call_rekey"
            X.205 r5 = X.AnonymousClass205.A01(r3, r0, r1)
            X.2nE r4 = X.C63962tz.A02(r4)
            X.A99 r3 = r2.A03
            X.1P3 r1 = r3.A2h
            boolean r0 = r1.A0Y()
            if (r0 != 0) goto L_0x09b2
            X.A7t r0 = r2.A05
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x09b2
            X.00H r0 = r3.A3V
            java.lang.Object r3 = r0.get()
            X.1Ot r3 = (X.C25581Ot) r3
            r1 = 24
            X.Ak1 r0 = new X.Ak1
            r0.<init>(r2, r4, r5, r1)
            r3.A02(r0)
        L_0x09a1:
            com.whatsapp.jid.DeviceJid r0 = r7.A00
            int r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppReceipt(r0, r6)
        L_0x09a7:
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r1 != r0) goto L_0x03b1
            r0 = 0
        L_0x09ad:
            r2.A03(r0)
            goto L_0x03b1
        L_0x09b2:
            r1.A0U(r4, r5)
            goto L_0x09a1
        L_0x09b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unknown rekey receipt type "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)
        L_0x09c0:
            X.C17960vV.A0F(r7, r0)
            goto L_0x03b1
        L_0x09c5:
            X.C19994A2h.A00(r2, r1)
            X.A99 r0 = r2.A03
            X.1HS r14 = r0.A2R
            boolean r3 = r14.A01()
            if (r3 != 0) goto L_0x09e6
            java.lang.String r3 = r1.A02
            X.9hv r8 = r0.A0Q(r3)
            long r3 = r8.A00
            r10 = 0
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x09e6
            long r3 = android.os.SystemClock.elapsedRealtime()
            r8.A00 = r3
        L_0x09e6:
            boolean r3 = r1.A01()
            if (r3 != 0) goto L_0x0a34
            java.lang.String r4 = "group_info"
            r3 = r47
            com.whatsapp.protocol.VoipStanzaChildNode r3 = X.C40811vJ.A03(r3, r4)
            if (r3 != 0) goto L_0x0a34
            java.lang.String r12 = r1.A02
            X.C17960vV.A07(r12)
            com.whatsapp.jid.DeviceJid r8 = r1.A03
            X.C17960vV.A07(r8)
            java.lang.String r4 = "video"
            r3 = r47
            com.whatsapp.protocol.VoipStanzaChildNode r3 = X.C40811vJ.A03(r3, r4)
            boolean r28 = X.AnonymousClass000.A1W(r3)
            com.whatsapp.jid.DeviceJid r5 = r1.A04
            android.telephony.TelephonyManager r4 = r0.A1s
            X.17x r3 = r0.A2e
            int r3 = X.C63982u1.A00(r4, r3)
            r0.A04 = r3
            boolean r3 = r2.A04(r12)
            if (r3 == 0) goto L_0x0dc5
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/service/peekIncomingOffer: Ignoring offer peek because phone is busy: "
            r4.append(r3)
            int r3 = r0.A04
            java.lang.String r3 = X.C40811vJ.A08(r3)
            java.lang.String r3 = X.AnonymousClass000.A0y(r3, r4)
        L_0x0a31:
            com.whatsapp.util.Log.i((java.lang.String) r3)
        L_0x0a34:
            X.1Md r8 = r0.A2I
            java.lang.String r5 = r1.A02
            r3 = 726210665(0x2b491869, float:7.144342E-13)
            X.C24911Md.A00(r8, r5, r3)
            X.1N7 r10 = r2.A08
            long r3 = r1.A02
            X.2tQ r3 = X.AnonymousClass1N7.A00(r10, r6, r3)
            if (r3 == 0) goto L_0x0a4b
            r3.A05(r6)
        L_0x0a4b:
            X.0ve r3 = r2.A07
            r31 = r3
            r10 = 4379(0x111b, float:6.136E-42)
            X.0vf r22 = X.C18040vf.A02
            r4 = r3
            r3 = r22
            boolean r21 = X.C18020vd.A05(r3, r4, r10)
            r15 = r21 ^ 1
            com.whatsapp.jid.Jid r10 = r1.A00
            boolean r3 = r10 instanceof com.whatsapp.jid.DeviceJid
            r20 = 0
            if (r3 == 0) goto L_0x0a69
            r3 = r10
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            r20 = r3
        L_0x0a69:
            r13 = 7952(0x1f10, float:1.1143E-41)
            if (r20 != 0) goto L_0x0a94
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/receive_message/call-offer dropping stanza: invalid fromJid: "
            r4.append(r3)
            java.lang.String r3 = X.C17890vO.A0V(r10, r4)
        L_0x0a7a:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            boolean r0 = r0.A47
            if (r0 == 0) goto L_0x0a8a
            boolean r0 = X.AnonymousClass8BT.A1Y(r5)
            if (r0 == 0) goto L_0x0a8a
            com.whatsapp.voipcalling.Voip.endCall(r7, r7)
        L_0x0a8a:
            r8.A04(r5, r13)
        L_0x0a8d:
            if (r21 == 0) goto L_0x03b1
            r2.A02(r1)
            goto L_0x03b1
        L_0x0a94:
            com.whatsapp.jid.DeviceJid r3 = r1.A03
            r19 = r3
            if (r3 != 0) goto L_0x0a9c
            r19 = r20
        L_0x0a9c:
            java.lang.String r4 = r1.A03
            X.11S r3 = r0.A23
            r3.A0I()
            X.1E8 r3 = r3.A0D
            if (r3 != 0) goto L_0x0aaa
            java.lang.String r3 = "voip/receive_message/call-offer ignoring call due to invalid registration"
            goto L_0x0a7a
        L_0x0aaa:
            java.util.Set r3 = r0.A3g
            boolean r3 = r3.add(r4)
            r12 = r3 ^ 1
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/receive_message/call-offer, id: "
            r10.append(r3)
            r10.append(r4)
            java.lang.String r3 = ", from: "
            r10.append(r3)
            r3 = r20
            r10.append(r3)
            java.lang.String r3 = ", call id: "
            r10.append(r3)
            r10.append(r5)
            java.lang.String r3 = ", duplicatedCallOffer: "
            r10.append(r3)
            r10.append(r12)
            java.lang.String r3 = ", callOfferElapsedTimeInMillisOnServer: "
            r10.append(r3)
            long r3 = r1.A00
            r45 = r3
            r10.append(r3)
            java.lang.String r11 = "ms"
            X.C17890vO.A1A(r10, r11)
            if (r15 == 0) goto L_0x0aee
            r2.A02(r1)
        L_0x0aee:
            if (r12 != 0) goto L_0x0a8a
            X.181 r3 = r0.A24
            r3.A08(r7)
            android.telephony.TelephonyManager r4 = r0.A1s
            X.17x r3 = r0.A2e
            int r3 = X.C63982u1.A00(r4, r3)
            r0.A04 = r3
            boolean r3 = r14.A01()
            if (r3 == 0) goto L_0x0b0f
            boolean r3 = r0.A47
            if (r3 == 0) goto L_0x0b24
            boolean r3 = X.AnonymousClass8BT.A1Y(r5)
            if (r3 == 0) goto L_0x0b24
        L_0x0b0f:
            X.AnonymousClass8BX.A18(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r45)
            r0.A0z = r3
            boolean r3 = r1.A09
            r0.A1H = r3
            java.lang.String r3 = r1.A08
            r0.A1B = r3
            java.lang.String r3 = r1.A06
            r0.A1A = r3
        L_0x0b24:
            X.9hv r10 = r0.A0Q(r5)
            boolean r3 = r1.A09
            r18 = r3
            if (r3 == 0) goto L_0x0b34
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
        L_0x0b32:
            monitor-enter(r10)
            goto L_0x0b39
        L_0x0b34:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            goto L_0x0b32
        L_0x0b39:
            java.lang.Integer r3 = r10.A04     // Catch:{ all -> 0x1766 }
            if (r3 != 0) goto L_0x0b3f
            r10.A04 = r4     // Catch:{ all -> 0x1766 }
        L_0x0b3f:
            monitor-exit(r10)
            if (r18 != 0) goto L_0x0b94
            r32 = 5
        L_0x0b44:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r32)
            r10.A05 = r3
            com.whatsapp.voipcalling.CallOfferInfo[] r11 = new com.whatsapp.voipcalling.CallOfferInfo[r9]
            java.lang.String r3 = r1.A08
            r44 = r3
            java.lang.String r3 = r1.A06
            r43 = r3
            long r3 = r1.A01
            r29 = r3
            r33 = r11
            r34 = r20
            r35 = r47
            r36 = r44
            r37 = r43
            r38 = r3
            r40 = r45
            r42 = r18
            int r10 = com.whatsapp.voipcalling.Voip.nativeParseXmppOffer(r33, r34, r35, r36, r37, r38, r40, r42)
            if (r10 == 0) goto L_0x0be1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/service/handleIncomingOfferStanza: parseXmppOffer failed: "
            X.C17900vP.A0i(r3, r4, r10)
            r3 = 70004(0x11174, float:9.8096E-41)
            if (r10 != r3) goto L_0x0b86
            r2.A03(r5)
        L_0x0b7f:
            r0 = 7952(0x1f10, float:1.1143E-41)
            r8.A04(r5, r0)
            goto L_0x0a8d
        L_0x0b86:
            boolean r0 = r0.A47
            if (r0 == 0) goto L_0x0b7f
            boolean r0 = X.AnonymousClass8BT.A1Y(r5)
            if (r0 == 0) goto L_0x0b7f
            com.whatsapp.voipcalling.Voip.endCall(r7, r7)
            goto L_0x0b7f
        L_0x0b94:
            X.00H r14 = r0.A3L
            java.lang.Object r3 = r14.get()
            X.2eG r3 = (X.C54512eG) r3
            boolean r3 = r3.A01
            r32 = 1
            if (r3 == 0) goto L_0x0b44
            r32 = 4
            java.lang.Long r3 = r10.A0C
            if (r3 != 0) goto L_0x0b44
            java.lang.Object r3 = r14.get()
            X.2eG r3 = (X.C54512eG) r3
            long r3 = r3.A00
            r15 = 0
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0b44
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.lang.Object r3 = r14.get()
            X.2eG r3 = (X.C54512eG) r3
            long r3 = r3.A00
            java.lang.Long r3 = X.C108945cZ.A1B(r12, r3)
            r10.A0C = r3
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/receive_message/call-offer/pushToCallOfferDelay "
            r4.append(r3)
            java.lang.Long r3 = r10.A0C
            r4.append(r3)
            X.C17890vO.A1A(r4, r11)
            boolean r3 = r10.A0H
            if (r3 == 0) goto L_0x0b44
            r32 = 8
            goto L_0x0b44
        L_0x0be1:
            r11 = r11[r7]
            X.C17960vV.A07(r11)
            boolean r3 = r11.isOfferExpired
            if (r3 == 0) goto L_0x0bef
            java.util.Set r3 = r0.A3h
            r3.add(r5)
        L_0x0bef:
            boolean r4 = r11.isVideoCall
            com.whatsapp.voipcalling.CallGroupInfo r3 = r11.callGroupInfo
            if (r3 != 0) goto L_0x0dc0
            r3 = 1
        L_0x0bf6:
            r8.A02(r5, r3, r4, r7)
            com.whatsapp.voipcalling.CallGroupInfo r3 = r11.callGroupInfo
            if (r3 == 0) goto L_0x0dbd
            int r3 = r3.transactionId
        L_0x0bff:
            X.8fe r16 = new X.8fe
            r23 = r16
            r24 = r2
            r25 = r19
            r26 = r11
            r27 = r5
            r28 = r3
            r23.<init>(r24, r25, r26, r27, r28)
            r10 = 12059(0x2f1b, float:1.6898E-41)
            r4 = r31
            r3 = r22
            boolean r3 = X.C18020vd.A05(r3, r4, r10)
            if (r3 == 0) goto L_0x0db8
            X.AlA r4 = r2.A04
            r3 = r16
            r4.execute(r3)
        L_0x0c23:
            r3 = r20
            com.whatsapp.jid.UserJid r12 = r3.userJid
            boolean r3 = r2.A04(r5)
            r14 = 2
            if (r3 == 0) goto L_0x0db5
            int r10 = r0.A04
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/receive_message/stanza-call-offer/ignored-phone-call-in-progress "
            r4.append(r3)
            java.lang.String r3 = X.C40811vJ.A08(r10)
            X.C17890vO.A1A(r4, r3)
            X.9hv r4 = r0.A0Q(r5)
            if (r10 != r9) goto L_0x0dad
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
        L_0x0c4a:
            r4.A03 = r3
        L_0x0c4c:
            r4 = 5
        L_0x0c4d:
            X.A7t r3 = r2.A05
            X.9yX r13 = r3.A05(r1, r7)
            int r3 = r13.A01
            if (r3 == 0) goto L_0x0c60
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r15 = "voip/service/maybeHandleIncomingOffer: decryptCallPayloadForStanza failed: "
            X.C17900vP.A0i(r15, r10, r3)
        L_0x0c60:
            r10 = 16
            if (r3 == 0) goto L_0x0da5
            if (r3 == r9) goto L_0x0d9b
            if (r3 == r14) goto L_0x0d89
            r9 = 0
            if (r3 == r6) goto L_0x0d81
            r6 = 4
            if (r3 == r6) goto L_0x0d89
        L_0x0c6e:
            r36 = 0
        L_0x0c70:
            X.3An r13 = r0.A2i
            X.10I r14 = r13.A00
            r6 = 47
            X.4rb r3 = new X.4rb
            r3.<init>(r13, r9, r12, r6)
            r14.CGF(r3)
            if (r4 != r10) goto L_0x0cc4
            r9 = 10858(0x2a6a, float:1.5215E-41)
            r6 = r31
            r3 = r22
            boolean r3 = X.C18020vd.A05(r3, r6, r9)
            if (r3 != 0) goto L_0x0cc4
            X.Aet r4 = new X.Aet
            r6 = r4
            r7 = r2
            r8 = r20
            r9 = r1
            r10 = r11
            r11 = r5
            r12 = r32
            r13 = r36
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3 = r16
            r3.A09(r4)
        L_0x0ca1:
            java.lang.String r5 = r1.A07
            if (r5 == 0) goto L_0x0a8d
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x0a8d
            X.1M9 r4 = r0.A2T
            r0 = r19
            com.whatsapp.jid.UserJid r0 = r0.userJid
            X.1E7 r3 = r4.A0H(r0)
            java.lang.String r0 = r3.A0c
            boolean r0 = X.C42171xk.A00(r0, r5)
            if (r0 != 0) goto L_0x0a8d
            r3.A0c = r5
            r4.A0W(r3)
            goto L_0x0a8d
        L_0x0cc4:
            r0.A0v(r12, r5)
            X.1M9 r3 = r0.A2T
            X.1E7 r3 = r3.A0E(r12)
            if (r3 == 0) goto L_0x0cdd
            X.2lf r3 = r3.A0H
            if (r3 == 0) goto L_0x0cdd
            java.lang.String r3 = r3.A01
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r31 = 0
            if (r3 == 0) goto L_0x0cdf
        L_0x0cdd:
            r31 = 1
        L_0x0cdf:
            if (r4 == 0) goto L_0x0cf7
            r3 = 5
            if (r4 == r3) goto L_0x0cff
            r3 = 15
            if (r4 == r3) goto L_0x0cff
            if (r4 == r10) goto L_0x0cff
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r3 = "Unsupported reject result type "
            java.lang.String r3 = X.AnonymousClass001.A1I(r3, r6, r4)
            X.C17960vV.A0F(r7, r3)
        L_0x0cf7:
            r33 = 0
        L_0x0cf9:
            com.whatsapp.jid.GroupJid r6 = r11.groupJid
            if (r6 == 0) goto L_0x0d3f
            monitor-enter(r0)
            goto L_0x0d02
        L_0x0cff:
            r33 = 1
            goto L_0x0cf9
        L_0x0d02:
            X.1TA r9 = r0.A2l     // Catch:{ all -> 0x1763 }
            java.lang.String r3 = X.C40811vJ.A0A(r5)     // Catch:{ all -> 0x1763 }
            X.2Q4 r3 = r9.A04(r3)     // Catch:{ all -> 0x1763 }
            if (r3 != 0) goto L_0x0d27
            X.0ve r11 = r0.A2p     // Catch:{ all -> 0x1763 }
            r9 = 7481(0x1d39, float:1.0483E-41)
            r3 = r22
            boolean r3 = X.C18020vd.A05(r3, r11, r9)     // Catch:{ all -> 0x1763 }
            if (r3 == 0) goto L_0x0d27
            X.1Nb r3 = r0.A2y     // Catch:{ all -> 0x1763 }
            X.1yM r3 = r3.A0a(r6)     // Catch:{ all -> 0x1763 }
            boolean r3 = r3.A09()     // Catch:{ all -> 0x1763 }
            r6 = 1
            if (r3 != 0) goto L_0x0d28
        L_0x0d27:
            r6 = 0
        L_0x0d28:
            X.9sR r3 = r0.A44     // Catch:{ all -> 0x1763 }
            r3.A02 = r6     // Catch:{ all -> 0x1763 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1763 }
            java.lang.String r3 = "voip/updateLGCMutedNotificationState Call Notification State: "
            r9.append(r3)     // Catch:{ all -> 0x1763 }
            X.9sR r3 = r0.A44     // Catch:{ all -> 0x1763 }
            X.C17900vP.A0b(r3, r9)     // Catch:{ all -> 0x1763 }
            monitor-exit(r0)
            r35 = 1
            if (r6 != 0) goto L_0x0d41
        L_0x0d3f:
            r35 = 0
        L_0x0d41:
            if (r4 != r10) goto L_0x0d7c
            X.1P3 r3 = r0.A2h
            int r37 = r3.A06()
        L_0x0d49:
            r23 = r47
            r24 = r44
            r25 = r43
            r26 = r29
            r28 = r45
            r30 = r18
            r34 = r4
            r22 = r20
            int r6 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingXmppOffer(r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r36, r37)
            if (r6 == 0) goto L_0x0ca1
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "voip/service/handleIncomingOfferStanza: Voip.nativeHandleIncomingXmppOffer failed: "
            X.C17900vP.A0i(r3, r4, r6)
            r3 = 70004(0x11174, float:9.8096E-41)
            if (r6 == r3) goto L_0x0d9b
            boolean r3 = r0.A47
            if (r3 == 0) goto L_0x0ca1
            boolean r3 = X.AnonymousClass8BT.A1Y(r5)
            if (r3 == 0) goto L_0x0ca1
            com.whatsapp.voipcalling.Voip.endCall(r7, r7)
            goto L_0x0ca1
        L_0x0d7c:
            r36 = 0
            r37 = 0
            goto L_0x0d49
        L_0x0d81:
            byte r3 = r13.A00
            int r36 = r3 + 1
            r4 = 16
            goto L_0x0c70
        L_0x0d89:
            boolean r3 = X.AnonymousClass8BT.A1Y(r5)
            if (r3 != 0) goto L_0x0d93
            com.whatsapp.voipcalling.Voip.clearVoipParam(r5)
            goto L_0x0d9e
        L_0x0d93:
            boolean r3 = r0.A47
            if (r3 == 0) goto L_0x0d9e
            com.whatsapp.voipcalling.Voip.endCall(r7, r7)
            goto L_0x0d9e
        L_0x0d9b:
            r2.A03(r5)
        L_0x0d9e:
            r3 = 7952(0x1f10, float:1.1143E-41)
            r8.A04(r5, r3)
            goto L_0x0ca1
        L_0x0da5:
            com.whatsapp.protocol.VoipStanzaChildNode r3 = r13.A03
            r47 = r3
            X.Abw r9 = r13.A02
            goto L_0x0c6e
        L_0x0dad:
            if (r10 != r14) goto L_0x0c4c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            goto L_0x0c4a
        L_0x0db5:
            r4 = 0
            goto L_0x0c4d
        L_0x0db8:
            r16.run()
            goto L_0x0c23
        L_0x0dbd:
            r3 = -1
            goto L_0x0bff
        L_0x0dc0:
            com.whatsapp.voipcalling.CallParticipant[] r3 = r3.participants
            int r3 = r3.length
            goto L_0x0bf6
        L_0x0dc5:
            X.0ve r10 = r2.A07
            r4 = 4217(0x1079, float:5.909E-42)
            X.0vf r3 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r3, r10, r4)
            if (r28 != 0) goto L_0x0dd9
            r3 = r3 & 1
            if (r3 != 0) goto L_0x0de1
            java.lang.String r3 = "voip/service/peekIncomingOffer: Ignoring 1:1 voice call offer"
            goto L_0x0a31
        L_0x0dd9:
            r3 = r3 & 2
            if (r3 != 0) goto L_0x0de1
            java.lang.String r3 = "voip/service/peekIncomingOffer: Ignoring 1:1 video call offer"
            goto L_0x0a31
        L_0x0de1:
            long r10 = r1.A01
            long r3 = r1.A00
            r26 = 30000(0x7530, double:1.4822E-319)
            r18 = r2
            r19 = r8
            r20 = r5
            r21 = r12
            r22 = r10
            r24 = r3
            r29 = r7
            r18.A01(r19, r20, r21, r22, r24, r26, r28, r29)
            goto L_0x0a34
        L_0x0dfa:
            r2.A03(r8)
            goto L_0x03b1
        L_0x0dff:
            java.lang.Object r3 = r7.A01
            X.A99 r3 = (X.A99) r3
            java.lang.Object r0 = r7.A02
            X.A69 r0 = (X.A69) r0
            java.lang.Object r0 = r0.A02
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0029
            X.1TA r1 = r3.A2l
            java.lang.String r0 = X.C40811vJ.A0A(r0)
            X.2Q4 r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0029
            X.1TD r2 = r3.A2j
            long r0 = r0.A01()
            X.9Bw r2 = r2.A05(r0)
            if (r2 == 0) goto L_0x0029
            android.os.Handler r1 = r3.A0H
            r0 = 57
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r2)
            r0.sendToTarget()
            return
        L_0x0e31:
            java.lang.Object r6 = r7.A01
            X.A99 r6 = (X.A99) r6
            java.lang.Object r1 = r7.A02
            X.2qu r1 = (X.C62172qu) r1
            java.lang.String r14 = r1.A0B
            java.util.LinkedHashMap r0 = r1.A0D
            r29 = r0
            boolean r0 = r1.A0F
            r19 = r0
            com.whatsapp.jid.GroupJid r8 = r1.A08
            boolean r0 = r1.A0G
            r18 = r0
            java.lang.String r0 = r1.A0C
            r35 = r0
            boolean r0 = r1.A0E
            r17 = r0
            java.lang.String r9 = r1.A02
            boolean r7 = r1.A04
            boolean r0 = r1.A03
            r33 = r0
            int r0 = r1.A00
            r34 = r0
            boolean r0 = r1.A05
            r28 = r0
            java.util.Set r0 = r29.keySet()
            java.util.ArrayList r16 = X.C17880vN.A10(r0)
            boolean r0 = r16.isEmpty()
            r2 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Trying start a call with empty list of jids"
            X.C17960vV.A0F(r1, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/actionStartNewOutgoingCall callId: "
            r3.append(r0)
            r3.append(r14)
            java.lang.String r0 = " groupJid: "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = " phash: "
            r3.append(r0)
            r3.append(r9)
            java.lang.String r1 = "offerDelay: "
            r0 = r34
            X.C17900vP.A0j(r1, r3, r0)
            r1 = 0
            if (r9 != 0) goto L_0x1018
            r0 = r16
            java.lang.Object r1 = r0.get(r1)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
        L_0x0ea3:
            int r0 = r16.size()
            boolean r26 = X.C108975cc.A1D(r0, r2)
            r10 = 1
            r13 = 0
            r20 = r6
            r21 = r8
            r22 = r1
            r23 = r14
            r24 = r2
            r25 = r19
            r27 = r13
            r20.A0u(r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = r6.A1i
            if (r0 == 0) goto L_0x0029
            if (r19 == 0) goto L_0x0ec7
            X.AnonymousClass8BX.A18(r6)
        L_0x0ec7:
            X.11S r0 = r6.A23
            if (r7 == 0) goto L_0x1011
            X.1yJ r12 = r0.A08()
        L_0x0ecf:
            X.Af0 r15 = new X.Af0
            r15.<init>()
            X.0ve r5 = r6.A2p
            r0 = 12680(0x3188, float:1.7768E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r5, r0)
            if (r0 == 0) goto L_0x0fa3
            X.AlA r2 = r6.A2L
            X.AjC r0 = new X.AjC
            r20 = r0
            r21 = r15
            r22 = r6
            r23 = r12
            r24 = r1
            r25 = r14
            r26 = r18
            r27 = r19
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r2.execute(r0)
        L_0x0efa:
            if (r17 == 0) goto L_0x0f07
            r0 = 10194(0x27d2, float:1.4285E-41)
            int r1 = X.C18020vd.A00(r4, r5, r0)
            r0 = 2
            r30 = 1
            if (r1 >= r0) goto L_0x0f09
        L_0x0f07:
            r30 = 0
        L_0x0f09:
            java.util.Collection r1 = r29.values()
            com.whatsapp.voipcalling.CallParticipantJid[] r0 = new com.whatsapp.voipcalling.CallParticipantJid[r13]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.voipcalling.CallParticipantJid[] r1 = (com.whatsapp.voipcalling.CallParticipantJid[]) r1
            int r0 = r1.length
            if (r0 != r10) goto L_0x0f19
            r8 = 0
        L_0x0f19:
            X.2YP r0 = r6.A1y
            X.9hh r20 = new X.9hh
            r29 = r17
            r31 = r28
            r32 = r7
            r21 = r8
            r22 = r14
            r23 = r35
            r24 = r9
            r25 = r1
            r26 = r34
            r27 = r19
            r28 = r18
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.Alt r21 = new X.Alt
            r22 = r15
            r23 = r6
            r24 = r8
            r25 = r14
            r26 = r35
            r27 = r16
            r28 = r1
            r29 = r34
            r31 = r17
            r32 = r19
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.0ve r10 = X.AnonymousClass10E.A8r(r0)
            X.10I r11 = X.AnonymousClass10E.AL1(r0)
            X.00S r0 = r0.A99
            java.lang.Object r0 = r0.get()
            X.1HQ r0 = (X.AnonymousClass1HQ) r0
            X.9yP r3 = new X.9yP
            r7 = r3
            r8 = r0
            r9 = r20
            r12 = r21
            r7.<init>(r8, r9, r10, r11, r12)
            X.0ve r1 = r3.A00
            r0 = 7112(0x1bc8, float:9.966E-42)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x0f95
            X.10I r2 = r3.A01
            r0 = 7
            X.9Bd r1 = new X.9Bd
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.Void[] r0 = new java.lang.Void[r13]
            r2.CGM(r1, r0)
        L_0x0f85:
            java.lang.String r0 = "offer"
            boolean r0 = X.A99.A0N(r5, r0)
            if (r0 == 0) goto L_0x0029
            X.10I r1 = r6.A31
            r0 = 44
            X.C21452AkJ.A00(r1, r6, r14, r0)
            return
        L_0x0f95:
            X.1Di r1 = r3.A02
            int r0 = X.C198479yP.A00(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r0)
            goto L_0x0f85
        L_0x0fa3:
            if (r18 != 0) goto L_0x100e
            X.1TD r11 = r6.A2j
            java.lang.String r2 = X.C40811vJ.A0A(r14)
            X.11P r0 = r6.A2c
            long r24 = X.AnonymousClass11P.A01(r0)
            X.C17960vV.A07(r12)
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
            r23 = 0
            r0 = -1
            X.4cT r3 = new X.4cT
            r3.<init>(r0, r1, r2, r10)
            X.0ve r1 = r11.A0C
            r0 = 2843(0xb1b, float:3.984E-42)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x100a
            X.00H r0 = r11.A0E
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 42
            X.3Bw r1 = new X.3Bw
            r1.<init>(r11, r3, r0)
            r0 = 61
            r2.A01(r1, r0)
        L_0x0fdc:
            X.9Bw r0 = new X.9Bw
            r20 = r0
            r21 = r12
            r22 = r3
            r26 = r19
            r20.<init>(r21, r22, r23, r24, r26)
            X.00H r1 = r11.A0E
            java.lang.Object r3 = r1.get()
            X.1gM r3 = (X.C31931gM) r3
            r1 = 43
            X.3Bw r2 = new X.3Bw
            r2.<init>(r11, r0, r1)
            r1 = 15
            r3.A01(r2, r1)
            X.AnonymousClass1TD.A01(r11, r0)
            X.1Ha r1 = new X.1Ha
            r1.<init>(r0)
        L_0x1005:
            r15.A0B(r1)
            goto L_0x0efa
        L_0x100a:
            X.AnonymousClass1TD.A03(r11, r3)
            goto L_0x0fdc
        L_0x100e:
            X.0zB r1 = X.C19890zB.A00
            goto L_0x1005
        L_0x1011:
            r0.A0I()
            X.1E3 r12 = r0.A02
            goto L_0x0ecf
        L_0x1018:
            X.11S r0 = r6.A23
            com.whatsapp.jid.UserJid r1 = X.C40811vJ.A01(r0, r7)
            goto L_0x0ea3
        L_0x1020:
            java.lang.Object r5 = r7.A01
            X.A7S r5 = (X.A7S) r5
            java.lang.Object r4 = r7.A02
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            com.whatsapp.jid.UserJid r3 = r4.getInitialPeerJid()
            X.C17960vV.A07(r3)
            boolean r2 = r4.isCaller
            java.lang.String r1 = r4.callId
            int r0 = r4.initialGroupTransactionId
            X.9Bw r1 = r5.A05(r3, r1, r0, r2)
            if (r1 == 0) goto L_0x0029
            boolean r0 = r4.videoEnabled
            r1.A0L(r0)
            X.1TD r0 = r5.A09
            r0.A0A(r1)
            return
        L_0x1046:
            java.lang.Object r5 = r7.A01
            X.A7S r5 = (X.A7S) r5
            java.lang.Object r4 = r7.A02
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            com.whatsapp.jid.UserJid r3 = r4.getInitialPeerJid()
            X.C17960vV.A07(r3)
            boolean r2 = r4.isCaller
            java.lang.String r1 = r4.callId
            int r0 = r4.initialGroupTransactionId
            X.9Bw r1 = r5.A05(r3, r1, r0, r2)
            if (r1 == 0) goto L_0x0029
            boolean r0 = r4.videoEnabled
            r1.A0L(r0)
            X.1TD r0 = r5.A09
            goto L_0x17bc
        L_0x106a:
            java.lang.Object r5 = r7.A01
            X.A7S r5 = (X.A7S) r5
            java.lang.Object r7 = r7.A02
            com.whatsapp.voipcalling.CallInfo r7 = (com.whatsapp.voipcalling.CallInfo) r7
            java.lang.String r0 = r7.callId
            X.9Bw r4 = r5.A06(r0)
            r6 = 100
            if (r4 == 0) goto L_0x0029
            X.11S r0 = r5.A01
            X.4cT r9 = r4.A04
            com.whatsapp.jid.UserJid r1 = r9.A01
            boolean r0 = X.C40811vJ.A0K(r0, r1)
            if (r0 == 0) goto L_0x1769
            com.whatsapp.jid.UserJid r0 = r7.getPeerJid()
            if (r0 == 0) goto L_0x1769
            com.whatsapp.jid.UserJid r0 = r7.getPeerJid()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x1769
            X.1TD r5 = r5.A09
            com.whatsapp.jid.UserJid r8 = X.C108955ca.A0T(r7)
            X.2m4 r0 = r4.A0B
            if (r0 != 0) goto L_0x10a7
            boolean r0 = r9.A03
            r3 = 1
            if (r0 != 0) goto L_0x10a8
        L_0x10a7:
            r3 = 0
        L_0x10a8:
            java.lang.String r2 = r9.A02
            int r1 = r9.A00
            X.4cT r0 = new X.4cT
            r0.<init>(r1, r8, r2, r3)
            X.9Bw r3 = r5.A06(r4, r0)
            java.util.Map r1 = r7.participants
            com.whatsapp.jid.UserJid r0 = r7.getPeerJid()
            java.lang.Object r0 = r1.get(r0)
            X.6qE r0 = (X.C134216qE) r0
            com.whatsapp.jid.UserJid r2 = r7.getPeerJid()
            if (r0 == 0) goto L_0x10d4
            int r1 = r0.A04
            r0 = 1
            if (r1 != r0) goto L_0x10d4
            r6 = 5
        L_0x10cd:
            r3.A0J(r2, r6)
            r5.A0B(r3)
            return
        L_0x10d4:
            com.whatsapp.jid.UserJid r0 = r7.getPeerJid()
            boolean r0 = r4.A0a(r0)
            if (r0 != 0) goto L_0x10cd
            r6 = 2
            goto L_0x10cd
        L_0x10e0:
            java.lang.Object r5 = r7.A01
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r5 = (com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel) r5
            java.lang.Object r4 = r7.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            X.1M9 r0 = r5.A0A
            X.1E7 r1 = r0.A0F(r4)
            if (r1 == 0) goto L_0x0029
            r3 = 2131898225(0x7f122f71, float:1.9431362E38)
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()
            X.1Me r0 = r5.A0B
            java.lang.String r1 = r0.A0I(r1)
            r0 = 0
            r2[r0] = r1
            X.6IR r0 = X.C1402670q.A02(r2, r3)
            X.4TA r1 = new X.4TA
            r1.<init>(r4, r0)
            X.1wy r0 = r5.A0I
            r0.A0E(r1)
            return
        L_0x110f:
            java.lang.Object r2 = r7.A01
            X.22M r2 = (X.AnonymousClass22M) r2
            java.lang.Object r1 = r7.A02
            X.2jc r1 = (X.C57772jc) r1
            X.25F r0 = r2.A00
            X.229 r0 = r0.A02
            if (r0 == 0) goto L_0x0029
            X.1Lg r1 = r1.A00
            r0 = 17
            r1.A02(r2, r0)
            return
        L_0x1125:
            java.lang.Object r4 = r7.A01
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r4 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r4
            java.lang.Object r3 = r7.A02
            X.4Sa r3 = (X.C86534Sa) r3
            X.1Uq r2 = r4.A05
            java.lang.String r1 = r3.A0E
            X.1EC r0 = r3.A08
            X.2mw r0 = r2.A02(r0, r1)
            r4.A00 = r0
            if (r0 == 0) goto L_0x0029
            X.1KB r2 = r4.A02
            r0 = 11
            X.Ajy r1 = new X.Ajy
            r1.<init>(r4, r3, r0)
        L_0x1144:
            r2.A0J(r1)
            return
        L_0x1148:
            java.lang.Object r2 = r7.A01
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r2 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r2
            java.lang.Object r1 = r7.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1M9 r0 = r2.A04
            X.1E7 r7 = r0.A0H(r1)
            X.00H r6 = r2.A06
            java.lang.Object r0 = r6.get()
            X.9lp r0 = (X.C190979lp) r0
            X.1Me r0 = r0.A00
            java.lang.String r0 = r0.A0I(r7)
            if (r0 != 0) goto L_0x11ad
            java.lang.String r0 = "IncomingCallHeaderUserCase/ contact has no display name"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
        L_0x116c:
            java.lang.Object r0 = r6.get()
            X.9lp r0 = (X.C190979lp) r0
            X.4ZN r4 = r0.A00(r7)
            X.1DT r3 = r2.A01
            r1 = 0
            r2 = 0
            X.6sW r0 = new X.6sW
            r0.<init>(r5, r4, r1, r2)
            r3.A0E(r0)
            java.lang.Object r1 = r6.get()
            X.9lp r1 = (X.C190979lp) r1
            boolean r0 = r7.A0B()
            if (r0 != 0) goto L_0x0029
            X.1UL r0 = r1.A02
            X.9rc r0 = r0.A01(r7)
            X.2ml r1 = r0.A02
            java.lang.String r0 = r1.A03
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = r1.A03
            X.482 r1 = X.C1402670q.A00(r0)
            X.6sW r0 = new X.6sW
            r0.<init>(r5, r4, r1, r2)
            r3.A0E(r0)
            return
        L_0x11ad:
            X.482 r5 = new X.482
            r5.<init>(r0)
            goto L_0x116c
        L_0x11b3:
            java.lang.Object r3 = r7.A01
            X.Adx r3 = (X.C21067Adx) r3
            java.lang.Object r4 = r7.A02
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            if (r4 == 0) goto L_0x0029
            com.whatsapp.voipcalling.CallState r2 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r2 == r0) goto L_0x0029
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/audio_route/checkAndTurnOnSpeakerPhone usingSpeakerBefore: "
            r1.append(r0)
            boolean r0 = r3.A08
            r1.append(r0)
            java.lang.String r0 = ", video call: "
            r1.append(r0)
            boolean r0 = r4.videoEnabled
            r1.append(r0)
            java.lang.String r0 = ", call state: "
            X.C17900vP.A0Y(r2, r0, r1)
            int r2 = r3.A00
            r0 = 2
            r1 = 1
            if (r2 != r0) goto L_0x11f4
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x11f0
            boolean r0 = r3.A0E(r4)
            if (r0 == 0) goto L_0x11f4
        L_0x11f0:
            r3.A0A(r4, r1)
            return
        L_0x11f4:
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0029
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x0029
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0029
            r0 = 0
            r3.A0A(r4, r0)
            return
        L_0x1207:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x120c }
            throw r1
        L_0x120c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x1211:
            java.lang.String r0 = "scheduledCallsStore"
            goto L_0x14eb
        L_0x1215:
            java.lang.String r0 = "globalUI"
            goto L_0x14eb
        L_0x1219:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x121e }
            goto L_0x1222
        L_0x121e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1223 }
        L_0x1222:
            throw r1     // Catch:{ all -> 0x1223 }
        L_0x1223:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x1228 }
            goto L_0x122c
        L_0x1228:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1236 }
        L_0x122c:
            throw r1     // Catch:{ all -> 0x1236 }
        L_0x122d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x122d }
            goto L_0x1235
        L_0x1230:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1230 }
            goto L_0x1235
        L_0x1233:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x1236 }
        L_0x1235:
            throw r0     // Catch:{ all -> 0x1236 }
        L_0x1236:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x1239:
            java.lang.String r0 = "voipNative"
            goto L_0x14eb
        L_0x123d:
            java.lang.String r0 = "callsMessageStore"
            goto L_0x14eb
        L_0x1241:
            java.lang.String r0 = "time"
            goto L_0x14eb
        L_0x1245:
            java.lang.Object r4 = r7.A01
            X.A99 r4 = (X.A99) r4
            java.lang.Object r5 = r7.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            com.whatsapp.voipcalling.CallInfo r6 = X.AnonymousClass8BR.A0r(r4)
            X.A7S r1 = r4.A0T
            java.lang.String r0 = r6.callId
            X.9Bw r7 = r1.A06(r0)
            r2 = 8
            r1 = 7
            if (r5 != 0) goto L_0x1260
            r1 = 8
        L_0x1260:
            if (r7 == 0) goto L_0x1290
            X.C178119Bw.A00(r7)
            int r0 = r7.A09
            if (r0 == r2) goto L_0x1290
            if (r1 != r2) goto L_0x1290
            r0 = 3
            r7.A0F(r0)
            r7.A0G(r2)
            X.00H r0 = r4.A3H
            java.lang.Object r3 = r0.get()
            X.1yO r3 = (X.C42571yO) r3
            com.whatsapp.jid.GroupJid r2 = r7.A0C
            if (r2 == 0) goto L_0x1290
            int r1 = r7.A07
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r0 == 0) goto L_0x1290
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            X.C42571yO.A03(r3, r2, r7, r0, r1)
        L_0x1290:
            if (r5 != 0) goto L_0x12a4
            r0 = 0
            com.whatsapp.voipcalling.Voip.sendWaveToVoiceChat(r0)
            X.1VE r0 = r4.A2A
            r2 = -1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r0)
            java.lang.String r0 = "vc_mini_player_wave_all_education_last_seen"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x12a4:
            X.2hy r1 = r4.A2G
            boolean r0 = r6.isLidCall()
            com.whatsapp.jid.UserJid r3 = r1.A00(r5, r0)
            X.1VI r2 = r4.A2P
            java.lang.String r1 = "voip/sendWaveToVoiceChat"
            X.1MR r0 = r2.A00
            java.util.HashSet r0 = r0.A0A(r3)
            com.whatsapp.voipcalling.CallParticipantJid r0 = X.AnonymousClass1VI.A00(r2, r3, r1, r0)
            com.whatsapp.voipcalling.Voip.sendWaveToVoiceChat(r0)
            return
        L_0x12c0:
            java.lang.Object r2 = r7.A01
            X.A99 r2 = (X.A99) r2
            java.lang.Object r0 = r7.A02
            X.9rV r0 = (X.C194299rV) r0
            java.lang.String r1 = r0.A02
            com.whatsapp.jid.GroupJid r0 = r0.A01
            com.whatsapp.voipcalling.Voip.cancelServerReminder(r1, r0)
            r2.A0V()
            return
        L_0x12d3:
            java.lang.Object r4 = r7.A01
            X.A99 r4 = (X.A99) r4
            java.lang.Object r0 = r7.A02
            X.9rV r0 = (X.C194299rV) r0
            java.lang.String r3 = r0.A02
            com.whatsapp.jid.GroupJid r2 = r0.A01
            long r0 = r0.A00
            com.whatsapp.voipcalling.Voip.setServerReminder(r3, r2, r0)
            r4.A0V()
            return
        L_0x12e8:
            java.lang.Object r1 = r7.A01
            X.A99 r1 = (X.A99) r1
            java.lang.Object r0 = r7.A02
            java.util.List r0 = (java.util.List) r0
            r1.A17(r0)
            r1.A0V()
            return
        L_0x12f7:
            java.lang.Object r3 = r7.A01
            X.A99 r3 = (X.A99) r3
            java.lang.Object r2 = r7.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.00H r0 = r3.A3K
            java.lang.Object r1 = r0.get()
            X.2xj r1 = (X.C66162xj) r1
            X.2Qr r0 = X.C49492Qr.AOM
            r1.A00(r0)
            X.1KB r0 = r3.A22
            r0.A0J(r2)
            return
        L_0x1312:
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.Object r0 = r7.A02
            java.lang.Byte r0 = (java.lang.Byte) r0
            com.whatsapp.voipcalling.Voip.sendRekeyRequest(r1, r0.byteValue())
            return
        L_0x131e:
            java.lang.Object r1 = r7.A01
            X.1VQ r1 = (X.AnonymousClass1VQ) r1
            java.lang.Object r0 = r7.A02
            X.2qu r0 = (X.C62172qu) r0
            r1.A0B(r0)
            return
        L_0x132a:
            java.lang.Object r6 = r7.A01
            X.1VQ r6 = (X.AnonymousClass1VQ) r6
            java.lang.Object r4 = r7.A02
            X.2qu r4 = (X.C62172qu) r4
            com.whatsapp.jid.GroupJid r8 = r4.A08
            if (r8 == 0) goto L_0x136b
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x136b
            X.1MZ r0 = r6.A0H
            X.1MW r7 = r0.A08
            int r5 = r7.A0A(r8)
            X.9Bw r0 = r4.A09
            int r0 = r0.A07
            r3 = 3
            boolean r0 = X.AnonymousClass000.A1T(r0, r3)
            if (r0 != 0) goto L_0x1361
            X.0ve r2 = r6.A0J
            r0 = 4907(0x132b, float:6.876E-42)
            X.0vf r1 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r1, r2, r0)
            if (r0 < r3) goto L_0x136b
            r0 = 5254(0x1486, float:7.362E-42)
            int r0 = X.C18020vd.A00(r1, r2, r0)
            if (r5 < r0) goto L_0x136b
        L_0x1361:
            X.2tp r0 = r7.A0B(r8)
            java.lang.String r0 = r0.A0F()
            r4.A02 = r0
        L_0x136b:
            X.1V7 r2 = r6.A0A
            java.lang.String r1 = "start_from_call_log"
            X.A69 r0 = new X.A69
            r0.<init>((java.lang.String) r1, (java.lang.Object) r4)
            r2.A00(r0)
            return
        L_0x1378:
            java.lang.Object r0 = r7.A01
            X.A7S r0 = (X.A7S) r0
            java.lang.Object r1 = r7.A02
            java.util.List r1 = (java.util.List) r1
            X.A99 r0 = r0.A05
            r0.A17(r1)
            return
        L_0x1386:
            java.lang.Object r6 = r7.A01
            X.1Vn r6 = (X.C27301Vn) r6
            java.lang.Object r2 = r7.A02
            X.2qZ r2 = (X.C61962qZ) r2
            r1 = 4
            java.lang.String r0 = "MissedCallNotificationHelper/clearNotificationsSummary"
            r6.BEJ(r1, r0)
            java.util.LinkedHashMap r5 = r2.A01
            monitor-enter(r5)
            java.util.Iterator r4 = X.C17890vO.A0k(r5)     // Catch:{ all -> 0x13be }
        L_0x139b:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x13be }
            if (r0 == 0) goto L_0x13b9
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x13be }
            int r3 = X.AnonymousClass8BU.A03(r0)     // Catch:{ all -> 0x13be }
            int r2 = r3 + 4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x13be }
            java.lang.String r0 = "MissedCallNotificationHelper/clearNotifications/"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x13be }
            r6.BEJ(r2, r0)     // Catch:{ all -> 0x13be }
            goto L_0x139b
        L_0x13b9:
            r5.clear()     // Catch:{ all -> 0x13be }
            monitor-exit(r5)
            return
        L_0x13be:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x13c1:
            java.lang.Object r1 = r7.A01
            X.9sP r1 = (X.C194859sP) r1
            java.lang.Object r2 = r7.A02
            X.184 r2 = (X.AnonymousClass184) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.18K r0 = r1.A01
            goto L_0x13ed
        L_0x13d0:
            java.lang.Object r1 = r7.A01
            X.9oZ r1 = (X.C192539oZ) r1
            java.lang.Object r2 = r7.A02
            X.184 r2 = (X.AnonymousClass184) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.18K r0 = r1.A01
            goto L_0x13ed
        L_0x13df:
            java.lang.Object r1 = r7.A01
            X.9oh r1 = (X.C192619oh) r1
            java.lang.Object r2 = r7.A02
            X.184 r2 = (X.AnonymousClass184) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.18K r0 = r1.A01
        L_0x13ed:
            r0.CC7(r2)
            return
        L_0x13f1:
            java.lang.Object r1 = r7.A01
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r1
            java.lang.Object r0 = r7.A02
            X.4Sa r0 = (X.C86534Sa) r0
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel.A05(r0, r1)
            return
        L_0x13fd:
            java.lang.Object r0 = r7.A01
            com.whatsapp.calling.header.CallHeaderStateHolder r0 = (com.whatsapp.calling.header.CallHeaderStateHolder) r0
            java.lang.Object r8 = r7.A02
            X.1E9 r8 = (X.AnonymousClass1E9) r8
            X.1G4 r3 = r0.A0P
            X.00H r0 = r0.A0E
            java.lang.Object r7 = r0.get()
            X.9d5 r7 = (X.C185749d5) r7
            r2 = 0
            if (r8 == 0) goto L_0x148d
            X.1M9 r0 = r7.A00
            X.1E7 r1 = r0.A0H(r8)
            X.1Me r0 = r7.A01
            java.lang.String r5 = X.AnonymousClass3MY.A0q(r0, r1)
            r6 = 1
            r12 = 0
            if (r5 == 0) goto L_0x1491
            r4 = 2131898153(0x7f122f29, float:1.9431216E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r12] = r5
            X.6IR r19 = X.C1402670q.A02(r0, r4)
        L_0x142d:
            X.1MW r0 = r7.A02
            int r5 = r0.A09(r8)
            r4 = 2131755200(0x7f1000c0, float:1.9141273E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C17880vN.A1T(r0, r5, r12)
            X.6IS r0 = X.C1402670q.A01(r0, r4, r5)
            r4 = 2131898204(0x7f122f5c, float:1.943132E38)
            X.6IR r4 = X.AnonymousClass3MX.A0t(r4)
            X.4T9 r7 = new X.4T9
            r7.<init>(r4, r2)
            X.4D1 r8 = X.AnonymousClass4D1.NORMAL
            r10 = 2131232030(0x7f08051e, float:1.8080158E38)
            r9 = 0
            r11 = 1
            X.4Ux r6 = new X.4Ux
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4 = 2131898189(0x7f122f4d, float:1.9431289E38)
            X.6IR r5 = X.AnonymousClass3MX.A0t(r4)
            r4 = 2131898188(0x7f122f4c, float:1.9431287E38)
            X.6IR r4 = X.AnonymousClass3MX.A0t(r4)
            X.4T9 r13 = new X.4T9
            r13.<init>(r5, r4)
            r16 = 2131233313(0x7f080a21, float:1.808276E38)
            r17 = 0
            X.4Ux r12 = new X.4Ux
            r14 = r8
            r15 = r9
            r18 = r17
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5 = 2131103225(0x7f060df9, float:1.781891E38)
            X.4UW r4 = new X.4UW
            r4.<init>(r0, r2, r11, r5)
            X.3nA r2 = new X.3nA
            r14 = r2
            r15 = r6
            r16 = r12
            r17 = r4
            r18 = r1
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x148d:
            r3.setValue(r2)
            return
        L_0x1491:
            r19 = r2
            goto L_0x142d
        L_0x1494:
            java.lang.Object r4 = r7.A01
            com.whatsapp.calling.calllink.view.CallLinkActivity r4 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r4
            java.lang.Object r0 = r7.A02
            X.76u r0 = (X.C1417476u) r0
            boolean r3 = r0.A00()
            r2 = 3
            r1 = 1
            r0 = 0
            X.62u r1 = X.AnonymousClass74H.A02(r0, r2, r1, r3)
            X.A4u r0 = r4.A0A
            goto L_0x14be
        L_0x14aa:
            java.lang.Object r3 = r7.A01
            com.whatsapp.calling.calllink.view.CallLinkActivity r3 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r3
            java.lang.Object r0 = r7.A02
            X.76u r0 = (X.C1417476u) r0
            boolean r2 = r0.A00()
            r1 = 1
            r0 = 0
            X.62u r1 = X.AnonymousClass74H.A02(r0, r1, r1, r2)
            X.A4u r0 = r3.A0A
        L_0x14be:
            r0.A03(r1)
            return
        L_0x14c2:
            java.lang.Object r1 = r7.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment) r1
            java.lang.Object r2 = r7.A02
            com.whatsapp.dialogs.ProgressDialogFragment r2 = (com.whatsapp.dialogs.ProgressDialogFragment) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.3Ao r0 = r1.A05
            if (r0 == 0) goto L_0x14e9
            r0.A04()
            X.00H r0 = r1.A07
            if (r0 == 0) goto L_0x14e6
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 42
            X.C20735AWq.A00(r1, r0)
            r2.A2H()
            return
        L_0x14e6:
            java.lang.String r0 = "callLogObservers"
            goto L_0x14eb
        L_0x14e9:
            java.lang.String r0 = "missedCallNotification"
        L_0x14eb:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x14f0:
            java.lang.Object r1 = r7.A01
            X.2PI r1 = (X.AnonymousClass2PI) r1
            java.lang.Object r0 = r7.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            X.1vb r2 = r1.A00
            int r0 = r0.size()
            int r1 = r2.A00
            boolean r0 = X.C108975cc.A1C(r0, r1)
            r2.A08 = r0
            int r0 = r2.A01
            int r0 = r0 + r1
            r2.A01 = r0
            return
        L_0x150c:
            java.lang.Object r0 = r7.A01
            X.1vb r0 = (X.C40971vb) r0
            java.lang.Object r4 = r7.A02
            java.util.List r4 = (java.util.List) r4
            X.00H r0 = r0.A0W
            java.lang.Object r3 = r0.get()
            com.whatsapp.favorite.FavoriteManager r3 = (com.whatsapp.favorite.FavoriteManager) r3
            r2 = 0
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            com.whatsapp.favorite.FavoriteManager$deleteFavoritesBlocking$1 r1 = new com.whatsapp.favorite.FavoriteManager$deleteFavoritesBlocking$1
            r1.<init>(r3, r2, r4, r2)
            X.1OR r0 = X.AnonymousClass1OR.A00
            java.lang.Object r0 = X.AnonymousClass4GT.A00(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            r0.intValue()
            return
        L_0x1532:
            java.lang.Object r0 = r7.A01
            X.48q r0 = (X.AnonymousClass48q) r0
            java.lang.Object r1 = r7.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            com.whatsapp.calling.callhistory.CallLogActivity r0 = r0.A01
            if (r1 == 0) goto L_0x1544
            android.widget.ImageView r0 = r0.A01
            r0.setImageBitmap(r1)
            return
        L_0x1544:
            X.1VW r2 = r0.A09
            android.widget.ImageView r1 = r0.A01
            X.1E7 r0 = r0.A0L
            r2.A0C(r1, r0)
            return
        L_0x154e:
            java.lang.Object r1 = r7.A01
            X.3VX r1 = (X.AnonymousClass3VX) r1
            java.lang.Object r0 = r7.A02
            X.4Sa r0 = (X.C86534Sa) r0
            r1.BnL(r0)
            return
        L_0x155a:
            java.lang.Object r9 = r7.A01
            X.5nY r9 = (X.C113685nY) r9
            java.lang.Object r3 = r7.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.Iterator r4 = r3.iterator()
        L_0x1566:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x15a2
            java.lang.Object r8 = r4.next()
            X.1xT r8 = (X.C42011xT) r8
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x157d
            X.C113685nY.A01(r8, r9)
            r9.A0N()
            goto L_0x1566
        L_0x157d:
            android.view.View r6 = r8.A0H
            android.view.ViewPropertyAnimator r7 = r6.animate()
            java.util.ArrayList r0 = r9.A01
            r0.add(r8)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r7.scaleX(r1)
            android.view.ViewPropertyAnimator r2 = r0.scaleY(r1)
            r0 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r10 = 5
            X.5cx r5 = new X.5cx
            r5.<init>((android.view.View) r6, (android.view.ViewPropertyAnimator) r7, (X.C42011xT) r8, (X.C113685nY) r9, (int) r10)
            X.AnonymousClass8BS.A0y(r5, r0)
            goto L_0x1566
        L_0x15a2:
            r3.clear()
            java.util.ArrayList r0 = r9.A02
            r0.remove(r3)
            return
        L_0x15ab:
            java.lang.Object r10 = r7.A01
            X.5nY r10 = (X.C113685nY) r10
            java.lang.Object r2 = r7.A02
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.util.Iterator r5 = r2.iterator()
        L_0x15b7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1633
            java.lang.Object r9 = r5.next()
            X.6Ua r9 = (X.C123336Ua) r9
            X.1xT r0 = r9.A05
            r12 = 0
            if (r0 != 0) goto L_0x1630
            r7 = r12
        L_0x15c9:
            X.1xT r0 = r9.A04
            if (r0 == 0) goto L_0x15cf
            android.view.View r12 = r0.A0H
        L_0x15cf:
            r3 = 0
            if (r7 == 0) goto L_0x1602
            android.view.ViewPropertyAnimator r4 = r7.animate()
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r8 = r4.setDuration(r0)
            java.util.ArrayList r1 = r10.A03
            X.1xT r0 = r9.A05
            r1.add(r0)
            int r1 = r9.A02
            int r0 = r9.A00
            int r1 = r1 - r0
            float r0 = (float) r1
            r8.translationX(r0)
            int r1 = r9.A03
            int r0 = r9.A01
            int r1 = r1 - r0
            float r0 = (float) r1
            r8.translationY(r0)
            android.view.ViewPropertyAnimator r0 = r8.alpha(r3)
            r11 = 6
            X.5cx r6 = new X.5cx
            r6.<init>((android.view.View) r7, (android.view.ViewPropertyAnimator) r8, (X.C123336Ua) r9, (X.C113685nY) r10, (int) r11)
            X.AnonymousClass8BS.A0y(r6, r0)
        L_0x1602:
            if (r12 == 0) goto L_0x15b7
            android.view.ViewPropertyAnimator r13 = r12.animate()
            java.util.ArrayList r1 = r10.A03
            X.1xT r0 = r9.A04
            r1.add(r0)
            android.view.ViewPropertyAnimator r0 = r13.translationX(r3)
            android.view.ViewPropertyAnimator r3 = r0.translationY(r3)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r1.alpha(r0)
            r16 = 7
            X.5cx r11 = new X.5cx
            r14 = r9
            r15 = r10
            r11.<init>((android.view.View) r12, (android.view.ViewPropertyAnimator) r13, (X.C123336Ua) r14, (X.C113685nY) r15, (int) r16)
            X.AnonymousClass8BS.A0y(r11, r0)
            goto L_0x15b7
        L_0x1630:
            android.view.View r7 = r0.A0H
            goto L_0x15c9
        L_0x1633:
            r2.clear()
            java.util.ArrayList r0 = r10.A04
            goto L_0x1690
        L_0x1639:
            java.lang.Object r8 = r7.A01
            X.5nY r8 = (X.C113685nY) r8
            java.lang.Object r2 = r7.A02
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            java.util.Iterator r4 = r2.iterator()
        L_0x1645:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x168b
            java.lang.Object r3 = r4.next()
            X.6UP r3 = (X.AnonymousClass6UP) r3
            X.1xT r9 = r3.A04
            int r1 = r3.A00
            int r0 = r3.A01
            int r10 = r3.A02
            int r11 = r3.A03
            android.view.View r6 = r9.A0H
            int r10 = r10 - r1
            int r11 = r11 - r0
            r1 = 0
            if (r10 == 0) goto L_0x1669
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r0.translationX(r1)
        L_0x1669:
            if (r11 == 0) goto L_0x1672
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r0.translationY(r1)
        L_0x1672:
            android.view.ViewPropertyAnimator r7 = r6.animate()
            java.util.ArrayList r0 = r8.A05
            r0.add(r9)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r7.setDuration(r0)
            r12 = 1
            X.5cw r5 = new X.5cw
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass8BS.A0y(r5, r0)
            goto L_0x1645
        L_0x168b:
            r2.clear()
            java.util.ArrayList r0 = r8.A06
        L_0x1690:
            r0.remove(r2)
            return
        L_0x1694:
            java.lang.Object r0 = r7.A01
            X.7E1 r0 = (X.AnonymousClass7E1) r0
            java.lang.Object r1 = r7.A02
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r0 = r0.A01
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0
            com.whatsapp.calling.callgrid.view.CallGrid.A09(r0, r1)
            return
        L_0x16a4:
            java.lang.Object r3 = r7.A01
            X.Adx r3 = (X.C21067Adx) r3
            java.lang.Object r1 = r7.A02
            com.whatsapp.voipcalling.CallInfo r1 = (com.whatsapp.voipcalling.CallInfo) r1
            int r0 = r3.A00
            r2 = 1
            if (r0 != r2) goto L_0x16be
            boolean r0 = r1.videoEnabled
            if (r0 != 0) goto L_0x16be
            com.whatsapp.voipcalling.CallState r1 = r1.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x16be
        L_0x16bb:
            r3.A08 = r2
            return
        L_0x16be:
            r2 = 0
            goto L_0x16bb
        L_0x16c0:
            java.lang.Object r1 = r7.A01
            X.Adx r1 = (X.C21067Adx) r1
            java.lang.Object r0 = r7.A02
            com.whatsapp.voipcalling.CallInfo r0 = (com.whatsapp.voipcalling.CallInfo) r0
            r1.A05(r0)
            return
        L_0x16cc:
            java.lang.Object r3 = r7.A01
            X.Adx r3 = (X.C21067Adx) r3
            java.lang.Object r2 = r7.A02
            com.whatsapp.voipcalling.CallInfo r2 = (com.whatsapp.voipcalling.CallInfo) r2
            r0 = 0
            r3.A03 = r0
            int r1 = r3.A00
            r0 = 3
            if (r1 == r0) goto L_0x16ef
            r0 = 4
            if (r1 == r0) goto L_0x16ef
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x16f4
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x16f4
            boolean r0 = r2.isCallOnHold()
            if (r0 != 0) goto L_0x16f4
        L_0x16ef:
            r0 = 0
            r3.A06(r2, r0)
            return
        L_0x16f4:
            X.10s r1 = r3.A0L
            r0 = 6
            A00(r1, r3, r2, r0)
            r0 = 0
            r3.A07(r2, r0)
            return
        L_0x16ff:
            java.lang.Object r1 = r7.A01
            X.8CR r1 = (X.AnonymousClass8CR) r1
            java.lang.Object r0 = r7.A02
            java.util.concurrent.ScheduledFuture r0 = (java.util.concurrent.ScheduledFuture) r0
            r1.A01(r0)
            return
        L_0x170b:
            java.lang.Object r6 = r7.A01
            X.6oK r6 = (X.C133196oK) r6
            java.lang.Object r5 = r7.A02
            android.content.Context r5 = (android.content.Context) r5
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            android.app.Activity r4 = r6.A00
            boolean r0 = r4 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x1736
            X.1FL r4 = (X.AnonymousClass1FL) r4
            X.1o3 r3 = r6.A05
            X.0ve r2 = r6.A06
            r1 = 8659(0x21d3, float:1.2134E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x1733
            java.lang.String r0 = "business-search-mv-gated-learn-more"
        L_0x172f:
            r3.A01(r4, r0)
            return
        L_0x1733:
            java.lang.String r0 = "business-search-learn-more"
            goto L_0x172f
        L_0x1736:
            X.129 r3 = r6.A07
            X.0ve r2 = r6.A06
            r1 = 8659(0x21d3, float:1.2134E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x1759
            java.lang.String r0 = "1369388110405310"
        L_0x1746:
            android.net.Uri r0 = r3.A03(r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A1p(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            X.1L9 r0 = r6.A01
            r0.A08(r5, r1)
            return
        L_0x1759:
            java.lang.String r0 = "1102414640742596"
            goto L_0x1746
        L_0x175c:
            java.lang.String r0 = "voip/maybeMuteInCallLinkLobby no active call link"
            goto L_0x17d6
        L_0x175f:
            r17.A0V()
            return
        L_0x1763:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x1766:
            r1 = move-exception
            monitor-exit(r10)
            throw r1
        L_0x1769:
            java.util.Map r0 = r7.participants
            java.util.Iterator r3 = X.C17890vO.A0l(r0)
        L_0x176f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1791
            java.lang.Object r0 = r3.next()
            X.6qE r0 = (X.C134216qE) r0
            com.whatsapp.jid.UserJid r2 = r0.A0A
            int r1 = r0.A04
            r0 = 1
            if (r1 != r0) goto L_0x1787
            r1 = 5
        L_0x1783:
            r4.A0J(r2, r1)
            goto L_0x176f
        L_0x1787:
            boolean r0 = r4.A0a(r2)
            r1 = 2
            if (r0 == 0) goto L_0x1783
            r1 = 100
            goto L_0x1783
        L_0x1791:
            X.0ve r2 = r5.A0C
            r1 = 12680(0x3188, float:1.7768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.1TD r0 = r5.A09
            if (r1 == 0) goto L_0x17a3
            r0.A0B(r4)
            return
        L_0x17a3:
            r0.A0A(r4)
            return
        L_0x17a7:
            java.lang.Object r0 = r7.A01
            X.A99 r0 = (X.A99) r0
            java.lang.Object r1 = r7.A02
            X.9Bw r1 = (X.C178119Bw) r1
            X.1TD r0 = r0.A2j
            goto L_0x17bc
        L_0x17b2:
            java.lang.Object r0 = r7.A01
            X.9mr r0 = (X.C191599mr) r0
            java.lang.Object r1 = r7.A02
            X.9Bw r1 = (X.C178119Bw) r1
            X.1TD r0 = r0.A02
        L_0x17bc:
            r0.A0B(r1)
            return
        L_0x17c0:
            java.lang.Object r1 = r7.A02
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            r0 = 0
            r1.setMode(r0)     // Catch:{ Exception -> 0x17c9 }
            goto L_0x17cd
        L_0x17c9:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x17cd:
            java.lang.Object r0 = X.C21067Adx.A0N
            android.media.AudioManager$OnAudioFocusChangeListener r0 = (android.media.AudioManager.OnAudioFocusChangeListener) r0
            r1.abandonAudioFocus(r0)
            java.lang.String r0 = "abandon audio focus"
        L_0x17d6:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21431Ajy.run():void");
    }
}
