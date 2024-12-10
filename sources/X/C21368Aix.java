package X;

/* renamed from: X.Aix  reason: case insensitive filesystem */
public class C21368Aix implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C21368Aix(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARNING: type inference failed for: r2v41, types: [java.lang.Object, X.9zw] */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:9|10|11|(1:13)|14|(1:16)|17|(1:19)|20|21|22|23|24|25|677) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:26|27|28|29|30|31|678) */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0483, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0484, code lost:
        r0 = "encb/RegisterUserHandler/createEncRegPayload/rsaEncrypt/exception.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0b08, code lost:
        com.whatsapp.util.Log.e(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0b0b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        r0.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0c04, code lost:
        if (r0.doubleValue() > 102400.0d) goto L_0x0c1e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x1296, code lost:
        r2.A0J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x1299, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00c3 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0483 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException (e java.lang.Throwable), Splitter:B:122:0x03ea] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0093=Splitter:B:23:0x0093, B:29:0x00c3=Splitter:B:29:0x00c3} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x06c8;
                case 1: goto L_0x064f;
                case 2: goto L_0x06f2;
                case 3: goto L_0x0031;
                case 4: goto L_0x079e;
                case 5: goto L_0x07b6;
                case 6: goto L_0x07ce;
                case 7: goto L_0x0047;
                case 8: goto L_0x07e6;
                case 9: goto L_0x009c;
                case 10: goto L_0x00d9;
                case 11: goto L_0x01b7;
                case 12: goto L_0x0803;
                case 13: goto L_0x09e8;
                case 14: goto L_0x0a3f;
                case 15: goto L_0x01df;
                case 16: goto L_0x0a51;
                case 17: goto L_0x0a6c;
                case 18: goto L_0x01fe;
                case 19: goto L_0x0a9d;
                case 20: goto L_0x0ad8;
                case 21: goto L_0x0b16;
                case 22: goto L_0x0262;
                case 23: goto L_0x0280;
                case 24: goto L_0x0b2e;
                case 25: goto L_0x0bb8;
                case 26: goto L_0x0c3a;
                case 27: goto L_0x0cc9;
                case 28: goto L_0x0ce7;
                case 29: goto L_0x0da3;
                case 30: goto L_0x0dbe;
                case 31: goto L_0x0ef0;
                case 32: goto L_0x02f2;
                case 33: goto L_0x034d;
                case 34: goto L_0x1098;
                case 35: goto L_0x10b1;
                case 36: goto L_0x04a2;
                case 37: goto L_0x115e;
                case 38: goto L_0x11dc;
                case 39: goto L_0x04d1;
                case 40: goto L_0x120c;
                case 41: goto L_0x125b;
                case 42: goto L_0x051c;
                case 43: goto L_0x053f;
                case 44: goto L_0x05b5;
                case 45: goto L_0x129a;
                case 46: goto L_0x0606;
                case 47: goto L_0x12c1;
                case 48: goto L_0x122f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r0.A01
            X.3o1 r5 = (X.C76723o1) r5
            java.lang.Object r6 = r0.A02
            X.1BI r6 = (X.AnonymousClass1BI) r6
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            X.C18070vi.A0h(r5, r6)
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            X.1M9 r0 = r5.getContactManager$app_product_community_community()
            X.1E7 r4 = r0.A0H(r6)
            X.1KB r0 = r5.getGlobalUI$app_product_community_community()
            r7 = 14
            X.AkZ r1 = new X.AkZ
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x002d:
            r0.A0J(r1)
        L_0x0030:
            return
        L_0x0031:
            java.lang.Object r3 = r0.A03
            X.E8A r3 = (X.E8A) r3
            java.lang.Object r2 = r0.A02
            X.DFL r2 = (X.DFL) r2
            java.lang.Object r1 = r0.A01
            X.DOZ r1 = (X.DOZ) r1
            if (r3 == 0) goto L_0x0030
            X.A4p r0 = X.C108985cd.A0J(r1)
            X.C20046A4p.A01(r1, r2, r0, r3)
            return
        L_0x0047:
            java.lang.Object r4 = r0.A01
            X.DG7 r4 = (X.DG7) r4
            java.lang.Object r5 = r0.A02
            X.Cjf r5 = (X.C25649Cjf) r5
            java.lang.Object r6 = r0.A04
            X.BVl r6 = (X.C22923BVl) r6
            java.lang.Object r3 = r0.A03
            java.io.File r3 = (java.io.File) r3
            org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0030 }
            X.8Qu r0 = r6.A01     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = "size_config"
            org.json.JSONObject r0 = r0.CPJ()     // Catch:{ JSONException -> 0x0030 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0030 }
        L_0x0068:
            X.BVh r0 = r6.A02     // Catch:{ JSONException -> 0x0030 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = "staleness_config"
            org.json.JSONObject r0 = r0.CPJ()     // Catch:{ JSONException -> 0x0030 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0030 }
        L_0x0075:
            java.lang.String r1 = "eviction_type"
            java.lang.String r0 = r6.A03     // Catch:{ JSONException -> 0x0030 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x0030 }
            if (r1 == 0) goto L_0x0085
            java.lang.String r0 = "cache_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0030 }
        L_0x0085:
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = r5.A00     // Catch:{ JSONException -> 0x0030 }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0030 }
            X.CaB r1 = r4.A02     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ JSONException -> 0x0030 }
        L_0x0097:
            r1.A02(r0, r2)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x1319
        L_0x009c:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Object r8 = r0.A03
            java.io.File r8 = (java.io.File) r8
            r8.setLastModified(r5)
            java.lang.Object r7 = r0.A01
            X.DG5 r7 = (X.DG5) r7
            java.lang.Object r1 = r0.A02
            X.Cjf r1 = (X.C25649Cjf) r1
            java.lang.String r4 = r1.A00
            java.lang.Object r3 = r0.A04
            X.BVh r3 = (X.C22919BVh) r3
            long r1 = X.C17880vN.A04(r5)
            X.BVj r0 = new X.BVj
            r0.<init>(r3, r4, r1)
            java.lang.String r4 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r4 = r8.getAbsolutePath()     // Catch:{ JSONException -> 0x0030 }
        L_0x00c7:
            org.json.JSONObject r3 = r0.CPJ()     // Catch:{ JSONException -> 0x0030 }
            java.lang.String r2 = "usage_timestamp_s"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0030 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x0030 }
            X.CaB r0 = r7.A00     // Catch:{ JSONException -> 0x0030 }
            r0.A02(r4, r3)     // Catch:{ JSONException -> 0x0030 }
            goto L_0x131a
        L_0x00d9:
            java.lang.Object r2 = r0.A01
            X.Cyg r2 = (X.C26380Cyg) r2
            java.lang.Object r1 = r0.A02
            X.COY r1 = (X.COY) r1
            java.lang.Object r7 = r0.A03
            java.lang.Object r5 = r0.A04
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r10 = r2.A0n
            if (r5 != 0) goto L_0x01ae
            java.lang.String r8 = ""
        L_0x00ed:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.C18070vi.A0o(r10, r5, r8)
            X.Cmo r0 = r1.A01
            X.CM3 r2 = r0.A07
            if (r2 == 0) goto L_0x0030
            X.Cyg r0 = r1.A00
            X.Cvh r0 = r0.A0q
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x01aa
            long r0 = r0.A0X
            long r0 = r0 * r3
        L_0x0105:
            r4 = 1
            r9 = 3
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r3 = "oldState = "
            r6.append(r3)
            r6.append(r7)
            r3 = 10
            java.lang.String r6 = X.C17890vO.A0c(r6, r3)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r6)
            java.lang.String r6 = "oldPlayerSessionId = "
            r7.append(r6)
            java.lang.String r6 = X.AnonymousClass8BW.A0l(r10, r7, r3)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A11(r6)
            java.lang.String r6 = "currentPlayerPosition = "
            r7.append(r6)
            java.lang.String r0 = X.AnonymousClass8BV.A0u(r7, r3, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "stackTrace = "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass8BW.A0l(r8, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "e = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C17890vO.A0c(r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "cause = "
            r1.append(r0)
            java.lang.Throwable r0 = r5.getCause()
            r1.append(r0)
            java.lang.String r0 = X.C17890vO.A0c(r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "cause trace = "
            r1.append(r0)
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = X.C25359CeJ.A00(r0)
        L_0x0177:
            java.lang.String r0 = X.AnonymousClass8BW.A0l(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "fullInfo = "
            r1.append(r0)
            java.lang.String r0 = X.C25359CeJ.A00(r5)
            java.lang.String r3 = X.AnonymousClass8BW.A0l(r0, r1, r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "VirtualVideoPlayer/debugInfo/"
            X.C17900vP.A0h(r0, r3, r1, r5)
            X.BwG r2 = r2.A00
            X.190 r1 = r2.A04
            java.lang.String r0 = "VirtualVideoPlayer/onError"
            r1.A0G(r0, r3, r4)
            X.6ra r1 = r2.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.A01(r0)
            return
        L_0x01a8:
            r0 = 0
            goto L_0x0177
        L_0x01aa:
            r0 = 0
            goto L_0x0105
        L_0x01ae:
            java.lang.String r8 = android.util.Log.getStackTraceString(r5)
            X.C18070vi.A0b(r8)
            goto L_0x00ed
        L_0x01b7:
            java.lang.Object r1 = r0.A02
            X.CLt r1 = (X.C24825CLt) r1
            java.lang.Object r3 = r0.A03
            X.Byz r3 = (X.C24302Byz) r3
            java.lang.Object r2 = r0.A04
            X.Byz r2 = (X.C24302Byz) r2
            X.Cmo r1 = r1.A00
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            X.Byz r0 = X.C24302Byz.ERROR
            if (r2 != r0) goto L_0x01d0
            if (r3 != r0) goto L_0x01d0
            return
        L_0x01d0:
            X.6lf r0 = r1.A06
            if (r0 == 0) goto L_0x01d7
            r0.A00(r3, r2)
        L_0x01d7:
            X.Byz r0 = X.C24302Byz.RELEASED
            if (r2 != r0) goto L_0x0030
            r0 = 0
            r1.A04 = r0
            return
        L_0x01df:
            java.lang.Object r2 = r0.A01
            com.whatsapp.Main r2 = (com.whatsapp.Main) r2
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            java.lang.Object r5 = r0.A04
            X.1Cd r0 = r2.A04
            r0.A06()
            java.lang.String r0 = "Main/keepSplashscreen/message-store-ready now redirect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r0 = r2.A05
            r6 = 16
            X.Aix r1 = new X.Aix
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x002d
        L_0x01fe:
            java.lang.Object r1 = r0.A01
            X.2lT r1 = (X.C58922lT) r1
            java.lang.Object r6 = r0.A02
            X.2tp r6 = (X.C63872tp) r6
            java.lang.Object r5 = r0.A03
            X.2ho r5 = (X.C56652ho) r5
            java.lang.Object r7 = r0.A04
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            X.C18070vi.A0o(r6, r5, r7)
            X.1Ln r1 = r1.A00
            X.10f r0 = r6.A07()
            X.C18070vi.A0X(r0)
            java.util.LinkedHashMap r0 = r1.A0G(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A15(r0)
        L_0x0222:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0030
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)
            java.lang.Object r3 = r0.getKey()
            X.1E1 r3 = (X.AnonymousClass1E1) r3
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1
            int r0 = r6.A00
            r2 = r3
            if (r0 != 0) goto L_0x023f
            r2 = r1
            r1 = r3
        L_0x023f:
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A00
            java.lang.Number r0 = X.C108945cZ.A1D(r2, r0)
            if (r0 == 0) goto L_0x0258
            int r0 = r0.intValue()
            r5.A00(r1, r0)
        L_0x0254:
            r7.run()
            goto L_0x0222
        L_0x0258:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ParticipantColorUtils/initParticipantColorIndices/color index not found for "
            X.C17900vP.A0X(r2, r0, r1)
            goto L_0x0254
        L_0x0262:
            java.lang.Object r5 = r0.A01
            X.1iW r5 = (X.C33251iW) r5
            java.lang.Object r4 = r0.A02
            X.21V r4 = (X.AnonymousClass21V) r4
            java.lang.Object r3 = r0.A03
            X.7Ir r3 = (X.C144787Ir) r3
            java.lang.Object r2 = r0.A04
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.1hB r1 = r5.A0n
            r0 = 0
            r1.A0D(r3, r4, r0)
            if (r2 == 0) goto L_0x0030
            X.1KB r0 = r5.A03
            r0.CGP(r2)
            return
        L_0x0280:
            java.lang.Object r3 = r0.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r7 = r0.A02
            X.2Qx r7 = (X.C49552Qx) r7
            java.lang.Object r6 = r0.A03
            X.205 r6 = (X.AnonymousClass205) r6
            java.lang.Object r2 = r0.A04
            java.lang.Number r2 = (java.lang.Number) r2
            X.00H r0 = r3.A1L     // Catch:{  }
            X.1W6 r1 = X.C17880vN.A0c(r0)     // Catch:{  }
            X.1PP r5 = r3.A0x     // Catch:{  }
            X.11P r0 = r3.A0K     // Catch:{  }
            long r9 = X.AnonymousClass11P.A01(r0)     // Catch:{  }
            int r8 = r2.intValue()     // Catch:{  }
            r4 = 1
            X.C18070vi.A0e(r1, r4, r5)     // Catch:{  }
            r0 = 4
            X.C18070vi.A0d(r6, r0)     // Catch:{  }
            X.206 r1 = X.C108945cZ.A0s(r6, r1)     // Catch:{  }
            if (r1 == 0) goto L_0x02e0
            int r2 = r1.A0u     // Catch:{  }
            r0 = 92
            if (r2 != r0) goto L_0x02e7
            byte[] r0 = r1.A1D     // Catch:{  }
            if (r0 == 0) goto L_0x02d9
            X.205 r2 = r1.A0v     // Catch:{  }
            X.1BI r0 = r2.A00     // Catch:{  }
            X.205 r6 = r5.A01(r0, r4)     // Catch:{  }
            X.24H r5 = new X.24H     // Catch:{  }
            r5.<init>((X.AnonymousClass205) r6, (X.C49552Qx) r7, (int) r8, (long) r9)     // Catch:{  }
            X.1BI r1 = r1.A0H()     // Catch:{  }
            X.A51 r0 = new X.A51     // Catch:{  }
            r0.<init>(r1, r2)     // Catch:{  }
            r5.A05 = r0     // Catch:{  }
            X.1iU r0 = r3.A0b     // Catch:{  }
            r0.A01(r5)     // Catch:{  }
            goto L_0x131b
        L_0x02d9:
            java.lang.String r0 = "EventResponseMessageManager/parent message has not secret"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{  }
            goto L_0x02f1
        L_0x02e0:
            java.lang.String r0 = "EventResponseMessageManager/cannot find Event message for the given response"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{  }
            goto L_0x02f1
        L_0x02e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{  }
            java.lang.String r0 = "EventResponseMessageManager/parent message not of type EVENT: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)     // Catch:{  }
        L_0x02f1:
            throw r0     // Catch:{  }
        L_0x02f2:
            java.lang.Object r5 = r0.A01
            X.8g3 r5 = (X.C167358g3) r5
            java.lang.Object r1 = r0.A02
            X.9Y0 r1 = (X.AnonymousClass9Y0) r1
            java.lang.Object r6 = r0.A03
            byte[] r6 = (byte[]) r6
            java.lang.Object r12 = r0.A04
            X.B71 r12 = (X.B71) r12
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r8 = r1.A00
            r2 = 0
            r0 = 65
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r2, r0, r8)
            byte[] r0 = (byte[]) r0
            r4 = 0
            r3 = 16
            byte[] r11 = java.util.Arrays.copyOfRange(r0, r2, r3)
            java.lang.String r9 = "encb/LoginUserHandler/retrieveBackupKey/parseLoginPayload/exception."
            X.8Zd r0 = X.C164518Zd.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x136f }
            X.Bm6 r1 = X.C23577Bm6.A07(r0, r6)     // Catch:{ 1PN -> 0x136f }
            X.8Zd r1 = (X.C164518Zd) r1     // Catch:{ 1PN -> 0x136f }
            X.DSQ r0 = r1.backupKeyDataEncrypted_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            byte[] r10 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            X.DSQ r0 = r1.rkNonce_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            byte[] r2 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            java.lang.String r7 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            java.lang.String r6 = "AES"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            r0.<init>(r11, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            X.AnonymousClass8BW.A1O(r0, r1, r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            byte[] r1 = r1.doFinal(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x1366 }
            X.8Ze r0 = X.C164528Ze.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x136f }
            X.Bm6 r2 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x136f }
            X.8Ze r2 = (X.C164528Ze) r2     // Catch:{ 1PN -> 0x136f }
            if (r2 == 0) goto L_0x0030
            goto L_0x131c
        L_0x034d:
            java.lang.Object r6 = r0.A01
            X.8g4 r6 = (X.AnonymousClass8g4) r6
            java.lang.Object r5 = r0.A02
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.A03
            byte[] r4 = (byte[]) r4
            java.lang.Object r7 = r0.A04
            byte[] r7 = (byte[]) r7
            java.lang.Object r3 = r6.A0B
            monitor-enter(r3)
            byte[] r8 = r6.A05     // Catch:{ all -> 0x1386 }
            X.9Y5 r9 = r6.A02     // Catch:{ all -> 0x1386 }
            monitor-exit(r3)     // Catch:{ all -> 0x1386 }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1W(r8)
            X.C17960vV.A0D(r0)
            if (r9 != 0) goto L_0x0370
            r1 = 0
        L_0x0370:
            X.C17960vV.A0D(r1)
            X.9WV r2 = r6.A09
            r0 = 100000(0x186a0, double:4.94066E-319)
            com.facebook.simplejni.NativeHolder r10 = r9.A00
            r9 = 2
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOO(r9, r0, r10, r4)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            X.9Y3 r0 = new X.9Y3
            r0.<init>(r1)
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r9 = r0.A00
            r10 = 1
            r0 = 75
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r10, r0, r9)
            int r10 = (int) r0
            if (r10 == 0) goto L_0x039c
            r1 = 4
        L_0x0396:
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r2.A00
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A00(r0, r1)
            return
        L_0x039c:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r10 = 0
            r0 = 76
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r10, r0, r9)
            byte[] r1 = (byte[]) r1
            r0 = 16
            r15 = 0
            byte[] r14 = java.util.Arrays.copyOfRange(r1, r10, r0)
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 77
            java.lang.Object r10 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r10, r0, r9)
            byte[] r10 = (byte[]) r10
            X.1NT r0 = r6.A08     // Catch:{ IOException -> 0x0490 }
            byte[] r13 = r0.A05()     // Catch:{ IOException -> 0x0490 }
            r0 = 12
            byte[] r12 = X.C17970vW.A0I(r0)
            int r1 = r13.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            r0 = 32
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            X.C17960vV.A0C(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            javax.crypto.Cipher r11 = X.AnonymousClass8BR.A18()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            javax.crypto.spec.SecretKeySpec r9 = X.AnonymousClass8BS.A0v(r14)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r12)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            r0 = 1
            byte[] r9 = X.AnonymousClass8BS.A1Q(r9, r1, r11, r13, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            int r1 = r9.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            r0 = 48
            if (r1 != r0) goto L_0x03e7
            r15 = 1
        L_0x03e7:
            X.C17960vV.A0C(r15)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0487 }
            X.8Ze r0 = X.C164528Ze.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bmt r11 = r0.A0N()     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = 0
            X.BmB r9 = X.DSQ.A01(r9, r0, r1)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = X.C17880vN.A0G(r11)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8Ze r1 = (X.C164528Ze) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.aesK_ = r9     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.BmB r9 = X.C17900vP.A03(r11, r12)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = r11.A00     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8Ze r1 = (X.C164528Ze) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.kNonce_ = r9     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            byte[] r1 = X.AnonymousClass8BT.A1Z(r11)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r9.write(r5)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r9.write(r4)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r9.write(r7)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8ay r0 = X.C165338ay.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bmt r5 = r0.A0N()     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.BmB r4 = X.C17900vP.A03(r5, r1)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = r5.A00     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8ay r1 = (X.C165338ay) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.backupKeyData_ = r4     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.BmB r4 = X.C17900vP.A03(r5, r10)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = r5.A00     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8ay r1 = (X.C165338ay) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 2
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.r3_ = r4     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.BmB r4 = X.C17900vP.A03(r5, r7)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = r5.A00     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8ay r1 = (X.C165338ay) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 4
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.opaqueChallenge_ = r4     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            byte[] r1 = r9.toByteArray()     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            java.lang.String r0 = "SHA-256"
            byte[] r0 = X.AnonymousClass8BW.A1W(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x047d, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.BmB r4 = X.C17900vP.A03(r5, r0)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.Bm6 r1 = r5.A00     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            X.8ay r1 = (X.C165338ay) r1     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            int r0 = r1.bitField0_     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            r1.transcript_ = r4     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            byte[] r0 = X.AnonymousClass8BT.A1Z(r5)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            byte[] r0 = X.A60.A02(r0, r8)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            goto L_0x049d
        L_0x047d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
            throw r0     // Catch:{ IOException -> 0x0494, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0483 }
        L_0x0483:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/rsaEncrypt/exception."
            goto L_0x048a
        L_0x0487:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/aesEncrypt/exception."
        L_0x048a:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 5
            goto L_0x0396
        L_0x0490:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/getAndSaveRootKey/exception."
            goto L_0x0497
        L_0x0494:
            r1 = move-exception
            java.lang.String r0 = "encb/RegisterUserHandler/createEncRegPayload/createTranscript/exception."
        L_0x0497:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            goto L_0x0396
        L_0x049d:
            if (r0 == 0) goto L_0x0030
            monitor-enter(r3)
            goto L_0x1379
        L_0x04a2:
            java.lang.Object r4 = r0.A01
            X.B77 r4 = (X.B77) r4
            java.lang.Object r3 = r0.A02
            X.AEW r3 = (X.AEW) r3
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A04
            X.1Ty r1 = (X.C26911Ty) r1
            r4.Bmx(r3)
            if (r2 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x0030
            X.0vl r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.9nw r0 = (X.C192179nw) r0
            int r0 = r0.A00()
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 <= 0) goto L_0x0030
            boolean r0 = r3.A0b
            if (r0 == 0) goto L_0x0030
            X.0vl r0 = r1.A08
            r0.getValue()
            return
        L_0x04d1:
            java.lang.Object r4 = r0.A01
            X.9bN r4 = (X.C184699bN) r4
            java.lang.Object r6 = r0.A02
            X.1ca r6 = (X.C29621ca) r6
            java.lang.Object r5 = r0.A03
            X.9sN r5 = (X.C194839sN) r5
            java.lang.Object r3 = r0.A04
            X.A71 r3 = (X.A71) r3
            if (r4 == 0) goto L_0x0503
            java.util.ArrayList r0 = X.C20992Ack.A03(r6)
            java.util.Iterator r2 = r0.iterator()
        L_0x04eb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0503
            java.lang.Object r0 = r2.next()
            X.A7B r0 = (X.A7B) r0
            int r1 = r0.A00
            r0 = 453(0x1c5, float:6.35E-43)
            if (r1 != r0) goto L_0x04eb
            X.1Mn r1 = r4.A00
            r0 = 1
            r1.A04(r0)
        L_0x0503:
            if (r5 == 0) goto L_0x0030
            java.lang.String r4 = "on_failure"
            java.util.HashMap r3 = X.A71.A01(r3, r6)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0030
            X.9k6 r2 = r5.A03
            r1 = 40
            X.AkQ r0 = new X.AkQ
            r0.<init>(r5, r3, r4, r1)
            r2.A00(r0)
            return
        L_0x051c:
            java.lang.Object r5 = r0.A01
            X.1E7 r5 = (X.AnonymousClass1E7) r5
            java.lang.Object r4 = r0.A02
            java.lang.Object r3 = r0.A03
            X.6oK r3 = (X.C133196oK) r3
            java.lang.Object r2 = r0.A04
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            X.5yh r1 = new X.5yh
            r1.<init>(r5)
            java.util.List r0 = X.C18070vi.A0M(r4)
            boolean r0 = X.AnonymousClass1E7.A03(r1, r0)
            if (r0 == 0) goto L_0x0030
            X.1pZ r0 = r3.A04
            r0.A07(r2, r5)
            return
        L_0x053f:
            java.lang.Object r2 = r0.A01
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r2
            java.lang.Object r1 = r0.A02
            X.4Sa r1 = (X.C86534Sa) r1
            java.lang.Object r5 = r0.A03
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r0.A04
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            com.whatsapp.voipcalling.CallState r0 = r1.A0B
            boolean r0 = X.AnonymousClass72U.A01(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0586
            com.whatsapp.jid.UserJid r1 = r2.A06
            if (r1 == 0) goto L_0x058c
            X.11S r0 = r2.A0V
            boolean r0 = r0.A0O(r1)
            if (r0 != 0) goto L_0x058c
            com.whatsapp.jid.UserJid r0 = r2.A06
            java.lang.Object r1 = r5.get(r0)
            X.6qE r1 = (X.C134216qE) r1
            if (r1 == 0) goto L_0x0586
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x0586
            com.whatsapp.jid.UserJid r0 = r1.A0A
            X.6IR r3 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A06(r2, r0)
        L_0x0578:
            if (r3 == 0) goto L_0x0586
            X.1DT r0 = r2.A0P
            java.lang.Object r0 = r0.A06()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0030
        L_0x0586:
            X.1DT r0 = r2.A0P
            r0.A0E(r3)
            return
        L_0x058c:
            if (r4 == 0) goto L_0x0586
            X.11S r1 = r2.A0V
            X.8yP r0 = r2.A0W
            X.4Sa r0 = r0.A07()
            boolean r0 = r0.A0N
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r1, r0)
            if (r0 == 0) goto L_0x05b0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x05b0
            boolean r0 = r2.A0A
            if (r0 != 0) goto L_0x0586
            r0 = 2131898289(0x7f122fb1, float:1.9431492E38)
            X.6IR r3 = X.AnonymousClass3MX.A0t(r0)
            goto L_0x0578
        L_0x05b0:
            X.6IR r3 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A06(r2, r4)
            goto L_0x0578
        L_0x05b5:
            java.lang.Object r6 = r0.A01
            X.0z4 r6 = (X.C19830z4) r6
            java.lang.Object r5 = r0.A02
            X.2qZ r5 = (X.C61962qZ) r5
            java.lang.Object r8 = r0.A03
            X.1TD r8 = (X.AnonymousClass1TD) r8
            java.lang.Object r7 = r0.A04
            X.2cp r7 = (X.C53622cp) r7
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r6)
            java.lang.String r0 = "first_missed_call"
            r1 = 0
            long r3 = r3.getLong(r0, r1)
            java.util.LinkedHashMap r0 = r5.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0030
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0030
            java.util.ArrayList r2 = r8.A08(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MissedCallNotificationHelper/init count:"
            X.C17890vO.A14(r0, r1, r2)
            java.lang.String r0 = " timestamp:"
            X.C17900vP.A0m(r0, r1, r3)
            java.util.Iterator r1 = r2.iterator()
        L_0x05f3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()
            X.9Bw r0 = (X.C178119Bw) r0
            X.C18070vi.A0b(r0)
            X.C61962qZ.A00(r5, r6, r7, r0)
            goto L_0x05f3
        L_0x0606:
            java.lang.Object r7 = r0.A01
            X.A99 r7 = (X.A99) r7
            java.lang.Object r6 = r0.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.Object r5 = r0.A03
            com.whatsapp.voipcalling.CallInfo r5 = (com.whatsapp.voipcalling.CallInfo) r5
            java.lang.Object r4 = r0.A04
            java.util.List r4 = (java.util.List) r4
            X.A7S r3 = r7.A0T
            boolean r2 = r5.isCaller
            java.lang.String r1 = r5.callId
            int r0 = r5.initialGroupTransactionId
            X.9Bw r6 = r3.A05(r6, r1, r0, r2)
            if (r6 == 0) goto L_0x0030
            X.A7S.A02(r5, r6)
            java.util.Iterator r5 = r4.iterator()
        L_0x062b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0030
            X.1BI r4 = X.C17880vN.A0Q(r5)
            X.00H r0 = r7.A3H
            java.lang.Object r3 = r0.get()
            X.1yO r3 = (X.C42571yO) r3
            r2 = 1
            X.C18070vi.A0d(r4, r2)
            X.2m4 r0 = r6.A0B
            if (r0 != 0) goto L_0x062b
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C42571yO.A03(r3, r4, r6, r0, r1)
            goto L_0x062b
        L_0x064f:
            java.lang.Object r3 = r0.A03     // Catch:{ all -> 0x06bf }
            android.content.Intent r3 = (android.content.Intent) r3     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            r2 = 0
            boolean r7 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            boolean r6 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            boolean r5 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            boolean r4 = r3.getBooleanExtra(r1, r2)     // Catch:{ all -> 0x06bf }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "Updating proxies: (BatteryNotLowProxy ("
            r2.append(r1)     // Catch:{ all -> 0x06bf }
            r2.append(r7)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "), BatteryChargingProxy ("
            r2.append(r1)     // Catch:{ all -> 0x06bf }
            r2.append(r6)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "), StorageNotLowProxy ("
            r2.append(r1)     // Catch:{ all -> 0x06bf }
            r2.append(r5)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "), NetworkStateProxy ("
            r2.append(r1)     // Catch:{ all -> 0x06bf }
            r2.append(r4)     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = "), "
            java.lang.String r3 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ all -> 0x06bf }
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x06bf }
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.A00     // Catch:{ all -> 0x06bf }
            r2.A03(r1, r3)     // Catch:{ all -> 0x06bf }
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x06bf }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x06bf }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class
            X.C197039w3.A00(r2, r1, r7)     // Catch:{ all -> 0x06bf }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class
            X.C197039w3.A00(r2, r1, r6)     // Catch:{ all -> 0x06bf }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class
            X.C197039w3.A00(r2, r1, r5)     // Catch:{ all -> 0x06bf }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy> r1 = androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class
            X.C197039w3.A00(r2, r1, r4)     // Catch:{ all -> 0x06bf }
            java.lang.Object r0 = r0.A04
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            r0.finish()
            return
        L_0x06bf:
            r1 = move-exception
            java.lang.Object r0 = r0.A04
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            r0.finish()
            throw r1
        L_0x06c8:
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.A02
            X.9pp r5 = (X.C193279pp) r5
            java.lang.Object r4 = r0.A03
            X.00I r4 = (X.AnonymousClass00I) r4
            java.lang.Object r3 = r0.A04
            androidx.work.impl.WorkDatabase r3 = (androidx.work.impl.WorkDatabase) r3
            java.util.Iterator r2 = r6.iterator()
        L_0x06dc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06ee
            java.lang.Object r1 = r2.next()
            X.BBo r1 = (X.C22531BBo) r1
            java.lang.String r0 = r5.A01
            r1.BEL(r0)
            goto L_0x06dc
        L_0x06ee:
            X.C20066A5p.A01(r4, r3, r6)
            return
        L_0x06f2:
            java.lang.Object r4 = r0.A04
            java.lang.String r7 = r4.toString()
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r5 = X.C20347AHd.A02
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Updating progress for "
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " ("
            r2.append(r1)
            java.lang.Object r6 = r0.A02
            X.A6Y r6 = (X.A6Y) r6
            r2.append(r6)
            java.lang.String r1 = ")"
            X.AnonymousClass8BW.A16(r3, r1, r5, r2)
            java.lang.Object r1 = r0.A01
            X.AHd r1 = (X.C20347AHd) r1
            androidx.work.impl.WorkDatabase r4 = r1.A00
            r4.A07()
            X.BD8 r1 = r4.A0E()     // Catch:{ all -> 0x0784 }
            X.A2t r1 = r1.Bbs(r7)     // Catch:{ all -> 0x0784 }
            if (r1 == 0) goto L_0x077d
            java.lang.Integer r2 = r1.A0G     // Catch:{ all -> 0x0784 }
            java.lang.Integer r1 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0784 }
            if (r2 != r1) goto L_0x0758
            X.9ZX r3 = new X.9ZX     // Catch:{ all -> 0x0784 }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x0784 }
            X.B6e r1 = r4.A0D()     // Catch:{ all -> 0x0784 }
            X.AHu r1 = (X.C20364AHu) r1     // Catch:{ all -> 0x0784 }
            X.A6c r2 = r1.A01     // Catch:{ all -> 0x0784 }
            r2.A06()     // Catch:{ all -> 0x0784 }
            r2.A07()     // Catch:{ all -> 0x0784 }
            X.8JG r1 = r1.A00     // Catch:{ all -> 0x0753 }
            r1.A03(r3)     // Catch:{ all -> 0x0753 }
            r2.A08()     // Catch:{ all -> 0x0753 }
            X.C20076A6c.A02(r2)     // Catch:{ all -> 0x0784 }
            goto L_0x0771
        L_0x0753:
            r1 = move-exception
            X.C20076A6c.A02(r2)     // Catch:{ all -> 0x0784 }
            goto L_0x0783
        L_0x0758:
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x0784 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0784 }
            java.lang.String r1 = "Ignoring setProgressAsync(...). WorkSpec ("
            r2.append(r1)     // Catch:{ all -> 0x0784 }
            r2.append(r7)     // Catch:{ all -> 0x0784 }
            java.lang.String r1 = ") is not in a RUNNING state."
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ all -> 0x0784 }
            r3.A06(r5, r1)     // Catch:{ all -> 0x0784 }
        L_0x0771:
            java.lang.Object r2 = r0.A03     // Catch:{ all -> 0x0784 }
            X.5oM r2 = (X.C113975oM) r2     // Catch:{ all -> 0x0784 }
            r1 = 0
            r2.A05(r1)     // Catch:{ all -> 0x0784 }
            r4.A08()     // Catch:{ all -> 0x0784 }
            goto L_0x0795
        L_0x077d:
            java.lang.String r1 = "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x0784 }
        L_0x0783:
            throw r1     // Catch:{ all -> 0x0784 }
        L_0x0784:
            r3 = move-exception
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x0799 }
            java.lang.String r1 = "Error updating Worker progress"
            r2.A08(r5, r1, r3)     // Catch:{ all -> 0x0799 }
            java.lang.Object r0 = r0.A03     // Catch:{ all -> 0x0799 }
            X.5oM r0 = (X.C113975oM) r0     // Catch:{ all -> 0x0799 }
            r0.A06(r3)     // Catch:{ all -> 0x0799 }
        L_0x0795:
            X.C20076A6c.A02(r4)
            return
        L_0x0799:
            r0 = move-exception
            X.C20076A6c.A02(r4)
            throw r0
        L_0x079e:
            java.lang.Object r4 = r0.A02
            X.BCy r4 = (X.C22563BCy) r4
            java.lang.Object r1 = r0.A01
            X.CtM r1 = (X.C26154CtM) r1
            int r3 = r1.A00
            X.Caq r2 = r1.A01
            java.lang.Object r1 = r0.A03
            X.CJ1 r1 = (X.CJ1) r1
            java.lang.Object r0 = r0.A04
            X.CTB r0 = (X.CTB) r0
            r4.Bx2(r2, r1, r0, r3)
            return
        L_0x07b6:
            java.lang.Object r4 = r0.A02
            X.BCy r4 = (X.C22563BCy) r4
            java.lang.Object r1 = r0.A01
            X.CtM r1 = (X.C26154CtM) r1
            int r3 = r1.A00
            X.Caq r2 = r1.A01
            java.lang.Object r1 = r0.A03
            X.CJ1 r1 = (X.CJ1) r1
            java.lang.Object r0 = r0.A04
            X.CTB r0 = (X.CTB) r0
            r4.Bwp(r2, r1, r0, r3)
            return
        L_0x07ce:
            java.lang.Object r1 = r0.A01
            X.9Zc r1 = (X.C183659Zc) r1
            X.A05 r1 = r1.A00
            X.9kr r3 = r1.A03
            java.lang.Object r2 = r0.A02
            X.AEq r2 = (X.C20282AEq) r2
            java.lang.Object r1 = r0.A04
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r0.A03
            X.9LV r0 = (X.AnonymousClass9LV) r0
            r3.A00(r2, r0, r1)
            return
        L_0x07e6:
            java.lang.Object r4 = r0.A01
            X.DG8 r4 = (X.DG8) r4
            java.lang.Object r3 = r0.A03
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r0.A02
            X.Cjf r1 = (X.C25649Cjf) r1
            java.lang.String r1 = r1.A00
            java.lang.Object r0 = r0.A04
            X.C5o r0 = (X.C24473C5o) r0
            X.BVg r2 = new X.BVg
            r2.<init>(r0, r1)
            r0 = -1
            r4.A00(r2, r3, r0)
            return
        L_0x0803:
            java.lang.Object r10 = r0.A01
            X.0y8 r10 = (X.C19390y8) r10
            java.lang.Object r9 = r0.A02
            X.0yE r9 = (X.C19450yE) r9
            java.lang.Object r1 = r0.A04
            X.9Ns r1 = (X.C180739Ns) r1
            X.0xn r0 = r10.A00     // Catch:{ Exception -> 0x09d7 }
            r3 = r9
            X.0yF r3 = (X.C19460yF) r3     // Catch:{ Exception -> 0x09d7 }
            java.lang.String r6 = r3.A01     // Catch:{ Exception -> 0x09d7 }
            X.B6q r0 = r0.BM0(r6)     // Catch:{ Exception -> 0x09d7 }
            if (r0 != 0) goto L_0x082c
            java.lang.String r1 = "Transport backend '%s' is not registered"
            java.lang.Object[] r0 = X.AnonymousClass8BV.A1b(r6)     // Catch:{ Exception -> 0x09d7 }
            java.lang.String r1 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x09d7 }
            java.util.logging.Logger r0 = X.C19390y8.A05     // Catch:{ Exception -> 0x09d7 }
            r0.warning(r1)     // Catch:{ Exception -> 0x09d7 }
            return
        L_0x082c:
            X.8R7 r11 = r0.BI9(r1)     // Catch:{ Exception -> 0x09d7 }
            X.0xw r1 = r10.A03     // Catch:{ Exception -> 0x09d7 }
            X.0xx r1 = (X.C19280xx) r1     // Catch:{ Exception -> 0x09d7 }
            android.database.sqlite.SQLiteDatabase r16 = r1.A04()     // Catch:{ Exception -> 0x09d7 }
            r0 = r16
            X.C19280xx.A03(r0, r1)     // Catch:{ Exception -> 0x09d7 }
            X.0xu r5 = r10.A02     // Catch:{ all -> 0x09d2 }
            X.0xx r5 = (X.C19280xx) r5     // Catch:{ all -> 0x09d2 }
            java.lang.Object[] r7 = X.AnonymousClass8BR.A1a()     // Catch:{ all -> 0x09d2 }
            r0 = 0
            X.0xz r4 = r3.A00     // Catch:{ all -> 0x09d2 }
            r7[r0] = r4     // Catch:{ all -> 0x09d2 }
            r0 = 1
            java.lang.String r12 = r11.A04     // Catch:{ all -> 0x09d2 }
            r7[r0] = r12     // Catch:{ all -> 0x09d2 }
            r0 = 2
            r7[r0] = r6     // Catch:{ all -> 0x09d2 }
            java.lang.String r0 = "SQLiteEventStore"
            java.lang.String r2 = "Storing event with priority=%s, name=%s for destination %s"
            java.lang.String r1 = X.A3G.A00(r0)     // Catch:{ all -> 0x09d2 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ all -> 0x09d2 }
            if (r0 == 0) goto L_0x0868
            java.lang.String r0 = java.lang.String.format(r2, r7)     // Catch:{ all -> 0x09d2 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x09d2 }
        L_0x0868:
            android.database.sqlite.SQLiteDatabase r8 = r5.A04()     // Catch:{ all -> 0x09d2 }
            r8.beginTransaction()     // Catch:{ all -> 0x09d2 }
            android.database.sqlite.SQLiteDatabase r1 = r5.A04()     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)     // Catch:{ all -> 0x09cd }
            long r13 = r0.simpleQueryForLong()     // Catch:{ all -> 0x09cd }
            android.database.sqlite.SQLiteDatabase r1 = r5.A04()     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)     // Catch:{ all -> 0x09cd }
            long r0 = r0.simpleQueryForLong()     // Catch:{ all -> 0x09cd }
            long r13 = r13 * r0
            r1 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x08a3
            X.9JT r2 = X.AnonymousClass9JT.CACHE_FULL     // Catch:{ all -> 0x09cd }
            r0 = 1
            r5.CDf(r2, r12, r0)     // Catch:{ all -> 0x09cd }
            java.lang.Long r0 = X.AnonymousClass8BV.A0a()     // Catch:{ all -> 0x09cd }
        L_0x089e:
            r8.setTransactionSuccessful()     // Catch:{ all -> 0x09cd }
            goto L_0x09ab
        L_0x08a3:
            java.lang.Long r0 = X.C19280xx.A00(r8, r9)     // Catch:{ all -> 0x09cd }
            if (r0 == 0) goto L_0x08bb
            long r0 = r0.longValue()     // Catch:{ all -> 0x09cd }
        L_0x08ad:
            r7 = 81920(0x14000, float:1.14794E-40)
            X.9pq r13 = r11.A02     // Catch:{ all -> 0x09cd }
            byte[] r6 = r13.A01     // Catch:{ all -> 0x09cd }
            int r5 = r6.length     // Catch:{ all -> 0x09cd }
            r3 = 0
            r4 = 1
            r14 = 0
            if (r5 > r7) goto L_0x08ed
            goto L_0x08ec
        L_0x08bb:
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "backend_name"
            r2.put(r0, r6)     // Catch:{ all -> 0x09cd }
            int r0 = X.C61072p4.A00(r4)     // Catch:{ all -> 0x09cd }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "priority"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "next_request_ms"
            r1 = 0
            X.C17880vN.A18(r2, r0, r1)     // Catch:{ all -> 0x09cd }
            byte[] r0 = r3.A02     // Catch:{ all -> 0x09cd }
            if (r0 == 0) goto L_0x08e4
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "extras"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
        L_0x08e4:
            java.lang.String r1 = "transport_contexts"
            r0 = 0
            long r0 = r8.insert(r1, r0, r2)     // Catch:{ all -> 0x09cd }
            goto L_0x08ad
        L_0x08ec:
            r14 = 1
        L_0x08ed:
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x09cd }
            java.lang.String r15 = "context_id"
            X.C17880vN.A19(r2, r15, r0)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "transport_name"
            r2.put(r0, r12)     // Catch:{ all -> 0x09cd }
            long r0 = r11.A00     // Catch:{ all -> 0x09cd }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "timestamp_ms"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
            long r0 = r11.A01     // Catch:{ all -> 0x09cd }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "uptime_ms"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
            X.0xy r0 = r13.A00     // Catch:{ all -> 0x09cd }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "payload_encoding"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r1 = "code"
            java.lang.Integer r0 = r11.A03     // Catch:{ all -> 0x09cd }
            r2.put(r1, r0)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "num_attempts"
            X.C17880vN.A18(r2, r0, r3)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "inline"
            X.AnonymousClass8BT.A13(r2, r0, r14)     // Catch:{ all -> 0x09cd }
            if (r14 == 0) goto L_0x092f
            r1 = r6
            goto L_0x0931
        L_0x092f:
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x09cd }
        L_0x0931:
            java.lang.String r0 = "payload"
            r2.put(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "events"
            r13 = 0
            long r2 = r8.insert(r0, r13, r2)     // Catch:{ all -> 0x09cd }
            java.lang.String r12 = "event_id"
            if (r14 != 0) goto L_0x0972
            double r0 = (double) r5     // Catch:{ all -> 0x09cd }
            r14 = 4680365912744787968(0x40f4000000000000, double:81920.0)
            double r0 = r0 / r14
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x09cd }
            int r14 = (int) r0     // Catch:{ all -> 0x09cd }
        L_0x094a:
            if (r4 > r14) goto L_0x0972
            int r1 = r4 + -1
            int r1 = r1 * r7
            int r0 = r4 * r7
            int r0 = java.lang.Math.min(r0, r5)     // Catch:{ all -> 0x09cd }
            byte[] r15 = java.util.Arrays.copyOfRange(r6, r1, r0)     // Catch:{ all -> 0x09cd }
            android.content.ContentValues r1 = X.C17880vN.A08()     // Catch:{ all -> 0x09cd }
            X.C17880vN.A19(r1, r12, r2)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "sequence_num"
            X.C17880vN.A18(r1, r0, r4)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "bytes"
            r1.put(r0, r15)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "event_payloads"
            r8.insert(r0, r13, r1)     // Catch:{ all -> 0x09cd }
            int r4 = r4 + 1
            goto L_0x094a
        L_0x0972:
            java.util.Map r0 = r11.A05     // Catch:{ all -> 0x09cd }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x09cd }
            java.util.Iterator r6 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x09cd }
        L_0x097c:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x09cd }
            if (r0 == 0) goto L_0x09a5
            java.util.Map$Entry r5 = X.AnonymousClass000.A16(r6)     // Catch:{ all -> 0x09cd }
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x09cd }
            X.C17880vN.A19(r4, r12, r2)     // Catch:{ all -> 0x09cd }
            java.lang.String r1 = X.C17880vN.A0x(r5)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "name"
            r4.put(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r1 = X.AnonymousClass8BR.A10(r5)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "value"
            r4.put(r0, r1)     // Catch:{ all -> 0x09cd }
            java.lang.String r0 = "event_metadata"
            r8.insert(r0, r13, r4)     // Catch:{ all -> 0x09cd }
            goto L_0x097c
        L_0x09a5:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x09cd }
            goto L_0x089e
        L_0x09ab:
            r8.endTransaction()     // Catch:{ all -> 0x09d2 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x09d2 }
            r3 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x09bd
            X.8R9 r0 = new X.8R9     // Catch:{ all -> 0x09d2 }
            r0.<init>(r11, r9, r1)     // Catch:{ all -> 0x09d2 }
        L_0x09bd:
            X.0y5 r2 = r10.A01     // Catch:{ all -> 0x09d2 }
            r1 = 1
            X.0y6 r2 = (X.C19370y6) r2     // Catch:{ all -> 0x09d2 }
            r0 = 0
            r2.CGt(r9, r1, r0)     // Catch:{ all -> 0x09d2 }
            r16.setTransactionSuccessful()     // Catch:{ all -> 0x09d2 }
            r16.endTransaction()     // Catch:{ Exception -> 0x09d7 }
            return
        L_0x09cd:
            r0 = move-exception
            r8.endTransaction()     // Catch:{ all -> 0x09d2 }
            throw r0     // Catch:{ all -> 0x09d2 }
        L_0x09d2:
            r0 = move-exception
            r16.endTransaction()     // Catch:{ Exception -> 0x09d7 }
            throw r0     // Catch:{ Exception -> 0x09d7 }
        L_0x09d7:
            r3 = move-exception
            java.util.logging.Logger r2 = X.C19390y8.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error scheduling event "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r3)
            r2.warning(r0)
            return
        L_0x09e8:
            java.lang.Object r7 = r0.A04
            X.CpP r7 = (X.C25957CpP) r7
            java.lang.Object r6 = r7.A03
            java.lang.Object r3 = r0.A02
            X.CbU r3 = (X.C25233CbU) r3
            java.lang.Object r2 = r0.A03
            X.CO8 r2 = (X.CO8) r2
            java.lang.Object r1 = r0.A01
            X.Boh r1 = (X.C23736Boh) r1
            monitor-enter(r6)
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0a3c }
            java.util.List r0 = X.C25957CpP.A00(r7, r1, r2, r3, r0)     // Catch:{ all -> 0x0a3c }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0a3c }
        L_0x0a05:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0a3c }
            if (r0 == 0) goto L_0x0a3a
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0a3c }
            X.CaF r1 = (X.C25164CaF) r1     // Catch:{ all -> 0x0a3c }
            X.DNk r4 = r7.A01     // Catch:{ all -> 0x0a3c }
            X.Bno r0 = r1.A00     // Catch:{ all -> 0x0a3c }
            r4.A09(r0)     // Catch:{ all -> 0x0a3c }
            X.Cae r3 = r1.A01     // Catch:{ all -> 0x0a3c }
            if (r3 == 0) goto L_0x0a05
            java.lang.String r2 = "Tree operations are only supported from the UI Thread"
            X.C26176Ctu.A02(r2)     // Catch:{ all -> 0x0a3c }
            X.CvV r1 = r3.A00     // Catch:{ all -> 0x0a3c }
            boolean r0 = r4.A0N     // Catch:{ all -> 0x0a3c }
            if (r0 != 0) goto L_0x0a32
            X.C26176Ctu.A02(r2)     // Catch:{ all -> 0x0a3c }
            java.util.List r0 = r4.A0I     // Catch:{ all -> 0x0a3c }
            r0.add(r1)     // Catch:{ all -> 0x0a3c }
            X.C26962DNk.A03(r4)     // Catch:{ all -> 0x0a3c }
        L_0x0a32:
            X.E6I r1 = r3.A01     // Catch:{ all -> 0x0a3c }
            X.C5s r0 = r3.A02     // Catch:{ all -> 0x0a3c }
            r4.A0A(r1, r0)     // Catch:{ all -> 0x0a3c }
            goto L_0x0a05
        L_0x0a3a:
            monitor-exit(r6)
            return
        L_0x0a3c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0a3f:
            java.lang.Object r3 = r0.A01
            X.5dq r3 = (X.C109685dq) r3
            java.lang.Object r2 = r0.A02
            X.88o[] r2 = (X.C1604588o[]) r2
            r1 = 0
            r0 = 1
            r3.A00 = r0
            r0 = r2[r1]
            r0.BxU()
            return
        L_0x0a51:
            java.lang.Object r4 = r0.A01
            com.whatsapp.Main r4 = (com.whatsapp.Main) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            android.view.ViewTreeObserver$OnPreDrawListener r2 = (android.view.ViewTreeObserver.OnPreDrawListener) r2
            java.lang.Object r1 = r0.A04
            com.whatsapp.Me r1 = (com.whatsapp.Me) r1
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.removeOnPreDrawListener(r2)
            com.whatsapp.Main.A0c(r4, r1)
            return
        L_0x0a6c:
            java.lang.Object r5 = r0.A01
            X.21V r5 = (X.AnonymousClass21V) r5
            java.lang.Object r1 = r0.A02
            X.6uk r1 = (X.C136996uk) r1
            java.lang.Object r4 = r0.A03
            X.2nS r4 = (X.C60142nS) r4
            java.lang.Object r3 = r0.A04
            X.206 r3 = (X.AnonymousClass206) r3
            r2 = 1
            X.2rc r0 = r5.A02
            if (r0 == 0) goto L_0x0a97
            java.io.File r1 = r1.A03()
            if (r1 == 0) goto L_0x0a94
            r0.A0G = r1
            X.122 r0 = r4.A01
            r0.A0R(r3)
            X.1Ns r0 = r4.A00
            r0.A06(r1, r2, r2)
            return
        L_0x0a94:
            java.lang.String r0 = "MainMessageObserverHelper/getQuotedMediaDownloadListener null download onComplete"
            goto L_0x0a99
        L_0x0a97:
            java.lang.String r0 = "MainMessageObserverHelper/getQuotedMediaDownloadListener null mediaDataV2"
        L_0x0a99:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0a9d:
            java.lang.Object r4 = r0.A01
            X.1kd r4 = (X.C34531kd) r4
            java.lang.Object r5 = r0.A02
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r0.A03
            X.1FR r3 = (X.AnonymousClass1FR) r3
            java.lang.Object r2 = r0.A04
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0ace
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0ace
            X.1KB r1 = r4.A02
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0F(r3, r0)
        L_0x0acb:
            java.lang.String r0 = "SendMedia/sendAnimatedGifResult/e"
            goto L_0x0b08
        L_0x0ace:
            X.1KB r2 = r4.A02
            r1 = 2131896086(0x7f122716, float:1.9427023E38)
            r0 = 0
            r2.A08(r1, r0)
            goto L_0x0acb
        L_0x0ad8:
            java.lang.Object r4 = r0.A01
            X.1kd r4 = (X.C34531kd) r4
            java.lang.Object r5 = r0.A02
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r3 = r0.A03
            X.1FR r3 = (X.AnonymousClass1FR) r3
            java.lang.Object r2 = r0.A04
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0b0c
            java.lang.String r1 = r5.getMessage()
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0b0c
            X.1KB r1 = r4.A02
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            java.lang.String r0 = r2.getString(r0)
            r1.A0F(r3, r0)
        L_0x0b06:
            java.lang.String r0 = "SendMedia/sendAudioResult/e "
        L_0x0b08:
            com.whatsapp.util.Log.e(r0, r5)
            return
        L_0x0b0c:
            X.1KB r2 = r4.A02
            r1 = 2131896086(0x7f122716, float:1.9427023E38)
            r0 = 0
            r2.A08(r1, r0)
            goto L_0x0b06
        L_0x0b16:
            java.lang.Object r1 = r0.A01
            X.1kd r1 = (X.C34531kd) r1
            java.lang.Object r2 = r0.A02
            X.2tS r2 = (X.C63642tS) r2
            java.lang.Object r4 = r0.A03
            byte[] r4 = (byte[]) r4
            java.lang.Object r3 = r0.A04
            java.lang.Long r3 = (java.lang.Long) r3
            X.1iW r1 = r1.A03
            r5 = 0
            r6 = r5
            r1.A0I(r2, r3, r4, r5, r6)
            return
        L_0x0b2e:
            java.lang.Object r6 = r0.A01
            X.1iW r6 = (X.C33251iW) r6
            java.lang.Object r5 = r0.A02
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r0.A03
            X.206 r4 = (X.AnonymousClass206) r4
            java.lang.Object r7 = r0.A04
            X.2bF r7 = (X.C52642bF) r7
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r5.iterator()
        L_0x0b46:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0ba0
            X.206 r8 = X.C17880vN.A0Y(r10)
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C33251iW.A0E(r6, r0, r4)
            if (r0 == 0) goto L_0x0b87
            r1 = 1
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0b81
            X.00H r0 = r6.A1S
            java.lang.Object r9 = r0.get()
            X.2rF r9 = (X.C62342rF) r9
            X.00H r0 = r9.A03
            java.lang.Object r2 = r0.get()
            X.1gM r2 = (X.C31931gM) r2
            r0 = 24
            X.AkP r1 = new X.AkP
            r1.<init>(r9, r8, r0)
            r0 = 73
            r2.A01(r1, r0)
        L_0x0b7d:
            r3.add(r8)
            goto L_0x0b46
        L_0x0b81:
            X.122 r0 = r6.A0U
            r0.BBN(r8, r1)
            goto L_0x0b7d
        L_0x0b87:
            r1 = -1
            boolean r0 = r8.A0w()
            if (r0 == 0) goto L_0x0b9a
            X.00H r0 = r6.A1S
            java.lang.Object r0 = r0.get()
            X.2rF r0 = (X.C62342rF) r0
            r0.A02(r8)
            goto L_0x0b46
        L_0x0b9a:
            X.122 r0 = r6.A0U
            r0.BBN(r8, r1)
            goto L_0x0b46
        L_0x0ba0:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0bb2
            X.10I r2 = r6.A19
            r1 = 49
            X.DTg r0 = new X.DTg
            r0.<init>(r3, r6, r4, r1)
            r2.CGF(r0)
        L_0x0bb2:
            X.Af0 r0 = r7.A00
            r0.A0B(r5)
            return
        L_0x0bb8:
            java.lang.Object r6 = r0.A02
            X.206 r6 = (X.AnonymousClass206) r6
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r7 = r0.A04
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            X.C17960vV.A02()
            X.36u r5 = r6.A0O()
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0c34
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            X.36v r10 = r0.A17()
        L_0x0bd6:
            java.util.Iterator r9 = r1.iterator()
        L_0x0bda:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0c36
            X.206 r8 = X.C17880vN.A0Y(r9)
            if (r5 == 0) goto L_0x0c1e
            boolean r0 = r6.A0w()
            if (r0 == 0) goto L_0x0c06
            monitor-enter(r5)
            byte[] r0 = r5.A02     // Catch:{ all -> 0x122c }
            if (r0 == 0) goto L_0x0bf8
            int r0 = r0.length     // Catch:{ all -> 0x122c }
            double r0 = (double) r0     // Catch:{ all -> 0x122c }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x122c }
            goto L_0x0bf9
        L_0x0bf8:
            r0 = 0
        L_0x0bf9:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0c06
            double r3 = r0.doubleValue()
            r1 = 4681773287628341248(0x40f9000000000000, double:102400.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0c1e
        L_0x0c06:
            X.36u r0 = r8.A0O()
            X.C17960vV.A07(r0)
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r8, r0)
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x0c1e
            byte[] r0 = r5.A01()
            r8.A0p(r0)
        L_0x0c1e:
            if (r10 == 0) goto L_0x0bda
            X.21V r8 = (X.AnonymousClass21V) r8
            X.36v r2 = r8.A17()
            if (r2 == 0) goto L_0x0bda
            byte[] r1 = r10.A06()
            int[] r0 = r10.A07()
            r2.A03(r1, r0)
            goto L_0x0bda
        L_0x0c34:
            r10 = 0
            goto L_0x0bd6
        L_0x0c36:
            r7.run()
            return
        L_0x0c3a:
            java.lang.Object r4 = r0.A01
            X.1iW r4 = (X.C33251iW) r4
            java.lang.Object r1 = r0.A02
            X.206 r1 = (X.AnonymousClass206) r1
            java.lang.Object r3 = r0.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r0.A04
            X.2bF r5 = (X.C52642bF) r5
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0c9d
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r0 = r1.A02
            X.C17960vV.A07(r0)
            java.lang.String r8 = r0.A0J
            X.11P r0 = r4.A0K
            long r6 = X.AnonymousClass11P.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0c81
            android.net.Uri r0 = android.net.Uri.parse(r8)
            android.net.Uri$Builder r2 = r0.buildUpon()
            long r0 = X.C17880vN.A04(r6)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "_nc_hot"
            android.net.Uri$Builder r0 = X.C50462Un.A00(r2, r0, r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r8 = r0.toString()
        L_0x0c81:
            java.util.Iterator r2 = r3.iterator()
        L_0x0c85:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c9d
            X.206 r1 = X.C17880vN.A0Y(r2)
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0c85
            X.21V r1 = (X.AnonymousClass21V) r1
            X.2rc r0 = r1.A02
            X.C17960vV.A07(r0)
            r0.A0J = r8
            goto L_0x0c85
        L_0x0c9d:
            java.util.Iterator r2 = r3.iterator()
        L_0x0ca1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0cc3
            X.206 r1 = X.C17880vN.A0Y(r2)
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x0cbd
            X.00H r0 = r4.A1S
            java.lang.Object r0 = r0.get()
            X.2rF r0 = (X.C62342rF) r0
            r0.A02(r1)
            goto L_0x0ca1
        L_0x0cbd:
            X.122 r0 = r4.A0U
            r0.BBM(r1)
            goto L_0x0ca1
        L_0x0cc3:
            X.Af0 r0 = r5.A00
            r0.A0B(r3)
            return
        L_0x0cc9:
            java.lang.Object r4 = r0.A01
            X.1iW r4 = (X.C33251iW) r4
            java.lang.Object r3 = r0.A02
            X.3TA r3 = (X.AnonymousClass3TA) r3
            java.lang.Object r2 = r0.A03
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A04
            X.3M1 r1 = (X.AnonymousClass3M1) r1
            X.36w r0 = r3.A05
            if (r0 == 0) goto L_0x0ce0
            X.C60502o8.A01(r2, r0)
        L_0x0ce0:
            r1.ByT(r2)
            r4.A0c(r2)
            return
        L_0x0ce7:
            java.lang.Object r3 = r0.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r0.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r0.A04
            X.2bF r0 = (X.C52642bF) r0
            X.21V r2 = (X.AnonymousClass21V) r2
            java.lang.String r13 = r2.A08
            X.C17960vV.A07(r13)
            r11 = 0
            java.lang.String r15 = "mms"
            X.1SY r10 = r3.A0l
            X.1So r4 = X.C63972u0.A02(r2)
            java.lang.String r14 = r4.A02
            if (r13 == 0) goto L_0x0d9c
            r4 = 0
            r16 = r11
            r19 = r4
            r20 = r4
            r21 = r4
            r17 = r4
            X.99o r9 = new X.99o
            r12 = r11
            r18 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1Kg r12 = r3.A13
            r12.A0D()
            X.1So r5 = X.C63972u0.A02(r2)
            java.lang.String r5 = r5.A02
            r15 = r11
            r13 = r5
            r14 = r11
            r16 = r4
            X.9kM r18 = X.C24421Kg.A00(r12, r13, r14, r15, r16, r17)
            X.1SW r8 = r3.A0o
            java.lang.String r7 = r2.A08
            X.1Ka r13 = r8.A00
            X.1SJ r6 = r8.A04
            X.1KX r5 = r8.A03
            X.1SV r14 = r8.A01
            X.1Kb r15 = r8.A02
            r22 = r11
            X.9nL r12 = new X.9nL
            r16 = r5
            r17 = r6
            r19 = r11
            r20 = r9
            r21 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.9tP r5 = r12.A00()
            X.9Hz r6 = r5.A02
            X.9Hz r5 = X.C179449Hz.COMPLETE
            if (r6 != r5) goto L_0x0d80
            X.2bF r7 = new X.2bF
            r7.<init>()
            r6 = 26
            X.Aix r5 = new X.Aix
            r12 = r5
            r13 = r3
            r14 = r1
            r15 = r2
            r16 = r7
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            X.C33251iW.A0C(r3, r2, r5, r1, r11)
            X.C18070vi.A0d(r0, r4)
            X.7Nc r1 = new X.7Nc
            r1.<init>(r0, r6)
            X.Af0 r0 = r7.A00
            r0.A09(r1)
            return
        L_0x0d80:
            X.1KB r6 = r3.A03
            r5 = 39
            X.3Bt r1 = new X.3Bt
            r1.<init>(r3, r5)
            r6.A0J(r1)
            X.1Mn r1 = r3.A0r
            r1.A01(r2)
            X.0wS r1 = X.C18460wS.A00
            X.C18070vi.A0d(r1, r4)
            X.Af0 r0 = r0.A00
            r0.A0B(r1)
            return
        L_0x0d9c:
            java.lang.String r0 = "mediaHash and fileType not both present for upload URL generation"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0da3:
            java.lang.Object r4 = r0.A01
            com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup r4 = (com.whatsapp.actionfeedback.view.ActionFeedbackViewGroup) r4
            java.lang.Object r3 = r0.A02
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            X.4VL r2 = (X.AnonymousClass4VL) r2
            java.lang.Object r1 = r0.A04
            X.5cE r1 = (X.C108745cE) r1
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r4.A02(r3)
            r2.A03(r1)
            return
        L_0x0dbe:
            java.lang.Object r2 = r0.A01
            X.A4B r2 = (X.A4B) r2
            java.lang.Object r1 = r0.A02
            java.lang.Object r9 = r0.A03
            X.A4D r9 = (X.A4D) r9
            java.lang.Object r8 = r0.A04
            X.AIQ r8 = (X.AIQ) r8
            r6 = 1
            X.AnonymousClass8BX.A1J(r1, r9, r8, r6)
            X.0vl r0 = r2.A03
            java.lang.Object r15 = r0.getValue()
            X.AIg r15 = (X.C20375AIg) r15
            java.util.List r20 = X.C18070vi.A0M(r1)
            r12 = 0
            r5 = 0
            r9.A02 = r5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r20.iterator()
        L_0x0de8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0e00
            java.lang.Object r2 = r3.next()
            X.AEq r2 = (X.C20282AEq) r2
            X.A6K r0 = r2.A01
            com.facebook.cameracore.ardelivery.model.ARAssetType r1 = r0.A02
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r1 != r0) goto L_0x0de8
            r4.add(r2)
            goto L_0x0de8
        L_0x0e00:
            int r0 = r4.size()
            if (r0 == r6) goto L_0x0e27
            X.9zw r2 = new X.9zw
            r2.<init>()
            X.9Is r0 = X.C179629Is.REQUEST_ASSET_CREATION_FAILURE
            r2.A00 = r0
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0e24
            java.lang.String r0 = "effect asset is missing"
        L_0x0e17:
            r2.A01 = r0
            r1 = 15
            X.DTg r0 = new X.DTg
            r0.<init>(r8, r15, r2, r1)
            r0.run()
            return
        L_0x0e24:
            java.lang.String r0 = "can't load more than one effect at once"
            goto L_0x0e17
        L_0x0e27:
            java.lang.Object r7 = r4.get(r5)
            X.AEq r7 = (X.C20282AEq) r7
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x0ed5
            java.util.Set r6 = r15.A07
            monitor-enter(r6)
            java.lang.String r5 = r15.A01     // Catch:{ all -> 0x0ed2 }
            if (r5 == 0) goto L_0x0eae
            X.A23 r11 = r15.A06     // Catch:{ all -> 0x0ed2 }
            java.util.Map r0 = r11.A04     // Catch:{ all -> 0x0ed2 }
            java.lang.Object r10 = r0.get(r5)     // Catch:{ all -> 0x0ed2 }
            X.A4D r10 = (X.A4D) r10     // Catch:{ all -> 0x0ed2 }
            if (r10 == 0) goto L_0x0e90
            r0.remove(r5)     // Catch:{ all -> 0x0ed2 }
            boolean r0 = X.A23.A00(r10, r11)     // Catch:{ all -> 0x0ed2 }
            if (r0 != 0) goto L_0x0e70
            X.8fV r4 = r11.A01     // Catch:{ all -> 0x0ed2 }
            java.lang.String r13 = r10.A01     // Catch:{ all -> 0x0ed2 }
            int r1 = r13.hashCode()     // Catch:{ all -> 0x0ed2 }
            r0 = 22421767(0x1562107, float:3.9329288E-38)
            long r2 = r4.A00(r0, r1)     // Catch:{ all -> 0x0ed2 }
            monitor-enter(r4)     // Catch:{ all -> 0x0ed2 }
            long r0 = r4.A00     // Catch:{ all -> 0x0eab }
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0e67
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x0eab }
        L_0x0e67:
            monitor-exit(r4)     // Catch:{ all -> 0x0ed2 }
            r4.A01(r2)     // Catch:{ all -> 0x0ed2 }
            java.util.Map r0 = r11.A03     // Catch:{ all -> 0x0ed2 }
            r0.remove(r13)     // Catch:{ all -> 0x0ed2 }
        L_0x0e70:
            java.lang.String r1 = r10.A00     // Catch:{ all -> 0x0ed2 }
            if (r1 == 0) goto L_0x0e90
            X.8fU r2 = r15.A05     // Catch:{ all -> 0x0ed2 }
            X.0vl r0 = r2.A00     // Catch:{ all -> 0x0ed2 }
            boolean r0 = X.C72453Mb.A1a(r0)     // Catch:{ all -> 0x0ed2 }
            if (r0 != 0) goto L_0x0e90
            boolean r0 = r10.A02     // Catch:{ all -> 0x0ed2 }
            if (r0 != 0) goto L_0x0e90
            int r1 = r1.hashCode()     // Catch:{ all -> 0x0ed2 }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r0 = r2.A00(r0, r1)     // Catch:{ all -> 0x0ed2 }
            r2.A01(r0)     // Catch:{ all -> 0x0ed2 }
        L_0x0e90:
            java.lang.String r0 = r15.A01     // Catch:{ all -> 0x0ea9 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0ea9 }
            if (r0 == 0) goto L_0x0eae
            X.B6l r0 = r15.A00     // Catch:{ all -> 0x0ea9 }
            if (r0 == 0) goto L_0x0eae
            r0.cancel()     // Catch:{ all -> 0x0ea9 }
            X.B6l r0 = r15.A00     // Catch:{ all -> 0x0ea9 }
            r6.remove(r0)     // Catch:{ all -> 0x0ea9 }
            r15.A00 = r12     // Catch:{ all -> 0x0ea9 }
            r15.A01 = r12     // Catch:{ all -> 0x0ea9 }
            goto L_0x0eae
        L_0x0ea9:
            r0 = move-exception
            goto L_0x0ead
        L_0x0eab:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0ed2 }
        L_0x0ead:
            throw r0     // Catch:{ all -> 0x0ed2 }
        L_0x0eae:
            X.A6K r0 = r7.A01     // Catch:{ all -> 0x0ed2 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x0ed2 }
            r15.A01 = r0     // Catch:{ all -> 0x0ed2 }
            r0 = 0
            X.AIP r1 = new X.AIP     // Catch:{ all -> 0x0ed2 }
            r1.<init>(r15, r7, r8, r0)     // Catch:{ all -> 0x0ed2 }
            X.C20375AIg.A03(r15, r7, r9)     // Catch:{ all -> 0x0ed2 }
            X.9OY r0 = r15.A03     // Catch:{ all -> 0x0ed2 }
            r19 = r9
            r17 = r0
            r18 = r7
            r16 = r1
            X.AIO r0 = X.C20375AIg.A00(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0ed2 }
            r15.A00 = r0     // Catch:{ all -> 0x0ed2 }
            r6.add(r0)     // Catch:{ all -> 0x0ed2 }
            monitor-exit(r6)     // Catch:{ all -> 0x0ed2 }
            return
        L_0x0ed2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0ed2 }
            throw r0
        L_0x0ed5:
            X.C20375AIg.A03(r15, r7, r9)
            X.9OY r0 = r15.A03
            r1 = r15
            r2 = r8
            r3 = r0
            r4 = r7
            r5 = r9
            r6 = r20
            X.AIO r0 = X.C20375AIg.A00(r1, r2, r3, r4, r5, r6)
            java.util.Set r1 = r15.A07
            monitor-enter(r1)
            r1.add(r0)     // Catch:{ all -> 0x0eed }
            monitor-exit(r1)     // Catch:{ all -> 0x0eed }
            return
        L_0x0eed:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0eed }
            throw r0
        L_0x0ef0:
            java.lang.Object r3 = r0.A01
            X.9fK r3 = (X.C187139fK) r3
            java.lang.Object r5 = r0.A02
            X.AEq r5 = (X.C20282AEq) r5
            java.lang.Object r4 = r0.A03
            X.9Zc r4 = (X.C183659Zc) r4
            java.lang.Object r6 = r0.A04
            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6
            X.C18070vi.A0k(r4, r6)
            java.lang.String r2 = r5.A08     // Catch:{ MalformedURLException -> 0x1060 }
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x1060 }
            r0.<init>(r2)     // Catch:{ MalformedURLException -> 0x1060 }
            if (r2 == 0) goto L_0x105b
            r0 = 26
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x1048 }
            X.1D9 r1 = r3.A01     // Catch:{ IOException -> 0x1048 }
            X.18j r0 = r3.A02     // Catch:{ IOException -> 0x1048 }
            r11 = 0
            X.AUZ r2 = r1.A05(r11, r0, r2, r11)     // Catch:{ IOException -> 0x1048 }
            X.C18070vi.A0b(r2)     // Catch:{ IOException -> 0x1048 }
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ IOException -> 0x1082 }
            int r7 = r0.getResponseCode()     // Catch:{ IOException -> 0x1082 }
            r0 = 400(0x190, float:5.6E-43)
            if (r7 >= r0) goto L_0x1030
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "ArdAssetDownloader Received response from server for asset "
            r7.append(r0)     // Catch:{ 9LV -> 0x1092 }
            X.A6K r0 = r5.A01     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r1 = r0.A09     // Catch:{ 9LV -> 0x1092 }
            r7.append(r1)     // Catch:{ 9LV -> 0x1092 }
            r0 = 46
            java.lang.String r0 = X.C17890vO.A0c(r7, r0)     // Catch:{ 9LV -> 0x1092 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 9LV -> 0x1092 }
            java.io.File r0 = r3.A04     // Catch:{ 9LV -> 0x1092 }
            r0.mkdirs()     // Catch:{ 9LV -> 0x1092 }
            if (r1 == 0) goto L_0x0ffc
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ 9LV -> 0x1092 }
            java.io.File r9 = X.AnonymousClass8BR.A0u(r0, r1)     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = r9.getCanonicalPath()     // Catch:{ 9LV -> 0x1092 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ 9LV -> 0x1092 }
            if (r0 == 0) goto L_0x1003
            r10 = 0
            X.181 r1 = r3.A00     // Catch:{ IOException -> 0x0fe4 }
            r0 = 38
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0fe4 }
            X.9Hb r0 = r2.BMP(r1, r11, r0)     // Catch:{ IOException -> 0x0fe4 }
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0fe4 }
            r12.<init>(r0)     // Catch:{ IOException -> 0x0fe4 }
            java.lang.String r3 = "local_io_failure"
            r1 = 1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0fbf, SecurityException -> 0x0fc9 }
            r0.<init>(r9, r1)     // Catch:{ FileNotFoundException -> 0x0fbf, SecurityException -> 0x0fc9 }
            r10 = r0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r0]     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            long r2 = r9.length()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r0 = 0
        L_0x0f82:
            boolean r7 = r6.get()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            if (r7 == 0) goto L_0x0f8c
            r9.delete()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            goto L_0x0fac
        L_0x0f8c:
            int r8 = r12.read(r13)     // Catch:{ IOException | RuntimeException -> 0x0fb3 }
            r7 = -1
            if (r8 != r7) goto L_0x0f94
            goto L_0x0f9b
        L_0x0f94:
            r7 = 0
            r10.write(r13, r7, r8)     // Catch:{  }
            long r7 = (long) r8     // Catch:{  }
            long r0 = r0 + r7
            goto L_0x0f82
        L_0x0f9b:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            java.lang.String r7 = "ArdAssetDownloader Download finished. Start bytes: "
            r8.append(r7)     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r8.append(r2)     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            java.lang.String r2 = ". Bytes saved: "
            X.C17900vP.A0m(r2, r8, r0)     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
        L_0x0fac:
            X.C196459v6.A01(r10, r12)     // Catch:{ 9LV -> 0x1092 }
            X.C196459v6.A00(r4, r5, r11, r9, r6)     // Catch:{ 9LV -> 0x1092 }
            return
        L_0x0fb3:
            r1 = move-exception
            X.9zw r0 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r0.A03 = r1     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            X.9LV r0 = r0.A01()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            throw r0     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
        L_0x0fbf:
            r2 = move-exception
            X.9zw r1 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r1.A02 = r3     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            java.lang.String r0 = "Destination file could not be found."
            goto L_0x0fd2
        L_0x0fc9:
            r2 = move-exception
            X.9zw r1 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r1.A02 = r3     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            java.lang.String r0 = "No write access to the destination file."
        L_0x0fd2:
            r1.A01 = r0     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            r1.A03 = r2     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            X.9LV r0 = r1.A01()     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
            throw r0     // Catch:{ 9LV -> 0x0fe0, all -> 0x0fdb }
        L_0x0fdb:
            r0 = move-exception
            r11 = r10
            r10 = r12
            goto L_0x108e
        L_0x0fe0:
            r0 = move-exception
            r11 = r10
            r10 = r12
            goto L_0x0ff5
        L_0x0fe4:
            r2 = move-exception
            X.9zw r1 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x0ff4 }
            java.lang.String r0 = "downloader_error"
            r1.A02 = r0     // Catch:{ 9LV -> 0x0ff4 }
            r1.A03 = r2     // Catch:{ 9LV -> 0x0ff4 }
            X.9LV r0 = r1.A01()     // Catch:{ 9LV -> 0x0ff4 }
            throw r0     // Catch:{ 9LV -> 0x0ff4 }
        L_0x0ff4:
            r0 = move-exception
        L_0x0ff5:
            r9.delete()     // Catch:{ all -> 0x0ff9 }
            throw r0     // Catch:{ all -> 0x0ff9 }
        L_0x0ff9:
            r0 = move-exception
            goto L_0x108e
        L_0x0ffc:
            X.9zw r2 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "Asset has no cache key. This is unexpected."
            goto L_0x1029
        L_0x1003:
            r9.delete()     // Catch:{ 9LV -> 0x1092 }
            X.9zw r2 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "downloader_error"
            r2.A02 = r0     // Catch:{ 9LV -> 0x1092 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "The absolute path of temp file: "
            X.C17900vP.A0N(r9, r0, r1)     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = " is different from the canonical path: "
            r1.append(r0)     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = r9.getCanonicalPath()     // Catch:{ 9LV -> 0x1092 }
            r1.append(r0)     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = ". This might cause directory traversal."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ 9LV -> 0x1092 }
        L_0x1029:
            r2.A01 = r0     // Catch:{ 9LV -> 0x1092 }
            X.9LV r0 = r2.A01()     // Catch:{ 9LV -> 0x1092 }
            goto L_0x1091
        L_0x1030:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x1082 }
            java.lang.String r0 = "ArdAssetDownloader Download error, code = "
            X.C17900vP.A0i(r0, r1, r7)     // Catch:{ IOException -> 0x1082 }
            X.9zw r1 = X.C199399zw.A00()     // Catch:{ IOException -> 0x1082 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x1082 }
            r1.A02 = r0     // Catch:{ IOException -> 0x1082 }
            X.9LV r0 = r1.A01()     // Catch:{ IOException -> 0x1082 }
            throw r0     // Catch:{ IOException -> 0x1082 }
        L_0x1048:
            r1 = move-exception
            java.lang.String r0 = "ArdAssetDownloader Runtime exception when downloading."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 9LV -> 0x1092 }
            X.9zw r2 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "local_io_failure"
            r2.A02 = r0     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "Error in downloading file."
            r2.A01 = r0     // Catch:{ 9LV -> 0x1092 }
            goto L_0x1087
        L_0x105b:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ 9LV -> 0x1092 }
            goto L_0x1091
        L_0x1060:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "ArdAssetDownloader Invalid URI: "
            r2.append(r0)     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r1 = r5.A08     // Catch:{ 9LV -> 0x1092 }
            X.C108985cd.A1M(r1, r2, r3)     // Catch:{ 9LV -> 0x1092 }
            X.9zw r2 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "malformed_url"
            r2.A02 = r0     // Catch:{ 9LV -> 0x1092 }
            java.lang.String r0 = "url"
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r1)     // Catch:{ 9LV -> 0x1092 }
            r2.A04 = r0     // Catch:{ 9LV -> 0x1092 }
            r2.A03 = r3     // Catch:{ 9LV -> 0x1092 }
            goto L_0x1089
        L_0x1082:
            r1 = move-exception
            X.9zw r2 = X.C199399zw.A00()     // Catch:{ 9LV -> 0x1092 }
        L_0x1087:
            r2.A03 = r1     // Catch:{ 9LV -> 0x1092 }
        L_0x1089:
            X.9LV r0 = r2.A01()     // Catch:{ 9LV -> 0x1092 }
            goto L_0x1091
        L_0x108e:
            X.C196459v6.A01(r11, r10)     // Catch:{ 9LV -> 0x1092 }
        L_0x1091:
            throw r0     // Catch:{ 9LV -> 0x1092 }
        L_0x1092:
            r1 = move-exception
            r0 = 0
            X.C196459v6.A00(r4, r5, r1, r0, r6)
            return
        L_0x1098:
            java.lang.Object r3 = r0.A02
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r2 = r0.A03
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            java.lang.Object r1 = r0.A04
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            X.00H r0 = X.C20134A8u.A00
            r0 = 0
            r3.set(r0)
            r2.disconnect()
            X.AnonymousClass1EY.A02(r1)
            return
        L_0x10b1:
            java.lang.Object r1 = r0.A01
            X.9q2 r1 = (X.C193399q2) r1
            java.lang.Object r6 = r0.A02
            X.A1x r6 = (X.C19986A1x) r6
            java.lang.Object r2 = r0.A03
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r2 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r2
            java.lang.Object r5 = r0.A04
            boolean r8 = X.C18070vi.A16(r1, r6)
            r0 = 3
            X.C18070vi.A0d(r5, r0)
            X.9pa r10 = r1.A00
            X.9pZ r0 = r6.A00
            X.9pc r7 = r0.A00
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            r0 = 12
            byte[] r3 = r7.A00
            byte[] r0 = X.C200310o.A09(r3, r1, r0)
            X.9pc r9 = new X.9pc
            r9.<init>(r0)
            int r1 = r3.length
            r0 = 12
            byte[] r0 = X.C200310o.A09(r3, r0, r1)
            X.9pc r4 = new X.9pc
            r4.<init>(r0)
            javax.crypto.Cipher r3 = X.AnonymousClass8BR.A18()
            X.9pc r0 = r10.A00
            byte[] r0 = r0.A00
            javax.crypto.spec.SecretKeySpec r1 = X.AnonymousClass8BS.A0v(r0)
            byte[] r0 = r9.A00
            X.AnonymousClass8BW.A1O(r1, r3, r0)
            byte[] r0 = r4.A00
            byte[] r0 = r3.doFinal(r0)
            X.C18070vi.A0X(r0)
            X.9pc r1 = new X.9pc
            r1.<init>(r0)
            X.1NO r0 = r2.A06     // Catch:{ IOException -> 0x1150 }
            r0.A02(r1)     // Catch:{ IOException -> 0x1150 }
            X.9pb r6 = r6.A01     // Catch:{ IOException -> 0x1150 }
            X.118 r0 = r0.A00     // Catch:{ IOException -> 0x1150 }
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)     // Catch:{ IOException -> 0x1150 }
            java.lang.String r0 = "passkey_data.key"
            java.io.File r4 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x1150 }
            org.json.JSONObject r3 = X.C17880vN.A15()     // Catch:{ IOException -> 0x1150 }
            java.lang.String r0 = "version"
            r3.put(r0, r8)     // Catch:{ IOException -> 0x1150 }
            X.9pc r0 = r6.A00     // Catch:{ IOException -> 0x1150 }
            java.lang.String r1 = X.C196759vb.A01(r0)     // Catch:{ IOException -> 0x1150 }
            java.lang.String r0 = "credentialId"
            r3.put(r0, r1)     // Catch:{ IOException -> 0x1150 }
            java.lang.String r1 = X.C196759vb.A01(r7)     // Catch:{ IOException -> 0x1150 }
            java.lang.String r0 = "encapsulatedRootKey"
            java.lang.String r1 = X.AnonymousClass8BV.A0r(r1, r0, r3)     // Catch:{ IOException -> 0x1150 }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ IOException -> 0x1150 }
            X.AnonymousClass3Gr.A01(r4, r1, r0)     // Catch:{ IOException -> 0x1150 }
            X.00H r0 = r2.A0A     // Catch:{ IOException -> 0x1150 }
            X.1NP r1 = X.AnonymousClass8BS.A0A(r0)     // Catch:{ IOException -> 0x1150 }
            X.2Qv r0 = X.C49532Qv.PASSKEY_ENCRYPTED     // Catch:{ IOException -> 0x1150 }
            r1.A0J(r0)     // Catch:{ IOException -> 0x1150 }
            X.1DT r0 = r2.A04
            r0.A0E(r5)
            return
        L_0x1150:
            r1 = move-exception
            java.lang.String r0 = "RestoreFromBackupViewModel/handlePasskeyInputSuccess/error"
            com.whatsapp.util.Log.e(r0, r1)
            X.9IE r1 = X.AnonymousClass9IE.OTHER_PASSKEY_ERROR
            X.1DT r0 = r2.A02
            r0.A0E(r1)
            return
        L_0x115e:
            java.lang.Object r3 = r0.A01
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r1 = r0.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r7 = r0.A03
            com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment r7 = (com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment) r7
            java.lang.Object r6 = r0.A04
            android.widget.TextView r6 = (android.widget.TextView) r6
            boolean r0 = r3.A0E()
            if (r0 == 0) goto L_0x117a
            r0 = 2131895164(0x7f12237c, float:1.9425153E38)
            r1.setText(r0)
        L_0x117a:
            X.C18070vi.A0b(r6)
            X.0ve r2 = r7.A02
            X.C18070vi.A0W(r2)
            r1 = 6187(0x182b, float:8.67E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x11cc
            X.1np r5 = r7.A0D
            if (r5 == 0) goto L_0x11c2
            android.content.Context r4 = r7.A1n()
            r2 = 2131894886(0x7f122266, float:1.942459E38)
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            r0 = 0
            java.lang.String r3 = "learn-more"
            java.lang.String r2 = X.AnonymousClass3MX.A16(r7, r3, r1, r0, r2)
            r1 = 14
            X.AkC r0 = new X.AkC
            r0.<init>(r7, r1)
            android.text.SpannableStringBuilder r1 = r5.A05(r4, r0, r2, r3)
            X.C18070vi.A0X(r1)
            X.0ve r0 = r7.A02
            X.AnonymousClass3Ma.A1I(r6, r0)
            android.graphics.Rect r0 = X.C39401t1.A0A
            X.11C r0 = r7.A06
            if (r0 == 0) goto L_0x11c5
            X.AnonymousClass3MZ.A1Q(r6, r0)
            r6.setText(r1)
            return
        L_0x11c2:
            java.lang.String r0 = "linkifier"
            goto L_0x11c7
        L_0x11c5:
            java.lang.String r0 = "systemServices"
        L_0x11c7:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x11cc:
            boolean r1 = r3.A0E()
            r0 = 2131895170(0x7f122382, float:1.9425165E38)
            if (r1 == 0) goto L_0x11d8
            r0 = 2131895165(0x7f12237d, float:1.9425155E38)
        L_0x11d8:
            r6.setText(r0)
            return
        L_0x11dc:
            java.lang.Object r6 = r0.A01
            X.9hX r6 = (X.C188509hX) r6
            java.lang.Object r5 = r0.A02
            X.1pj r5 = (X.C37551pj) r5
            java.lang.Object r4 = r0.A03
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r0.A04
            X.3Kn r3 = (X.C72073Kn) r3
            r2 = 1
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.util.List r0 = r6.A01
            if (r0 != 0) goto L_0x1208
            boolean r1 = r6.A0A
            X.1E7 r0 = r6.A02
            boolean r0 = r5.A0O(r0, r1)
            if (r0 == 0) goto L_0x1208
            com.whatsapp.jid.UserJid r0 = r6.A03
            java.util.ArrayList r0 = r5.A08(r0)
            r6.A01 = r0
        L_0x1208:
            X.C37551pj.A03(r4, r3, r5, r6, r2)
            return
        L_0x120c:
            java.lang.Object r5 = r0.A01
            X.6o4 r5 = (X.C133036o4) r5
            java.lang.Object r4 = r0.A02
            X.34B r4 = (X.AnonymousClass34B) r4
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A04
            monitor-enter(r5)
            java.util.LinkedHashMap r1 = r5.A03     // Catch:{ all -> 0x122c }
            r0 = 0
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r2)     // Catch:{ all -> 0x122c }
            r1.put(r3, r0)     // Catch:{ all -> 0x122c }
            monitor-exit(r5)
            X.1T6 r1 = r5.A00
            java.lang.String r0 = "ImagineMeSelfieUploader"
            r1.A0J(r4, r0)
            return
        L_0x122c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x122f:
            java.lang.Object r6 = r0.A01
            X.1kb r6 = (X.C34511kb) r6
            java.lang.Object r5 = r0.A02
            X.A2B r5 = (X.A2B) r5
            java.lang.Object r4 = r0.A03
            X.1EC r4 = (X.AnonymousClass1EC) r4
            java.lang.Object r3 = r0.A04
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            X.1NI r2 = r6.A05
            com.whatsapp.jid.GroupJid r1 = r5.A02
            int r0 = r5.A00
            r2.A02(r1, r0)
            X.1MG r0 = r6.A08
            r0.A05(r5, r4, r3)
            X.1KB r2 = r6.A00
            r0 = 43
            X.7RL r1 = new X.7RL
            r1.<init>(r6, r4, r0)
            goto L_0x1296
        L_0x125b:
            java.lang.Object r4 = r0.A01
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r4 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r4
            java.lang.Object r3 = r0.A02
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.Object r2 = r0.A03
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r5 = r0.A04
            android.content.Context r1 = r4.getApplicationContext()
            X.0vb r0 = r4.A0C
            double r7 = r3.doubleValue()
            double r9 = r2.doubleValue()
            java.util.Locale r0 = r0.A0N()
            android.location.Geocoder r6 = new android.location.Geocoder
            r6.<init>(r1, r0)
            r11 = 1
            java.util.List r3 = r6.getFromLocation(r7, r9, r11)     // Catch:{ Exception -> 0x1286 }
            goto L_0x128d
        L_0x1286:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateAddress"
            com.whatsapp.util.Log.w(r0, r1)
            r3 = 0
        L_0x128d:
            X.1KB r2 = r4.A05
            r0 = 13
            X.Ak1 r1 = new X.Ak1
            r1.<init>(r4, r3, r5, r0)
        L_0x1296:
            r2.A0J(r1)
            return
        L_0x129a:
            java.lang.Object r7 = r0.A01
            X.9Bw r7 = (X.C178119Bw) r7
            java.lang.Object r6 = r0.A02
            X.2qZ r6 = (X.C61962qZ) r6
            java.lang.Object r5 = r0.A03
            X.0z4 r5 = (X.C19830z4) r5
            java.lang.Object r4 = r0.A04
            X.2cp r4 = (X.C53622cp) r4
            java.util.LinkedHashMap r0 = r6.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x12bd
            long r2 = r7.A01
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)
            java.lang.String r0 = "first_missed_call"
            X.C17880vN.A1D(r1, r0, r2)
        L_0x12bd:
            X.C61962qZ.A00(r6, r5, r4, r7)
            return
        L_0x12c1:
            java.lang.Object r2 = r0.A01
            X.9yZ r2 = (X.C198579yZ) r2
            java.lang.Object r1 = r0.A02
            X.9hY r1 = (X.C188519hY) r1
            java.lang.Object r4 = r0.A03
            X.1Di r4 = (X.C22821Di) r4
            java.lang.Object r5 = r0.A04
            X.AN5 r5 = (X.AN5) r5
            X.00H r6 = r2.A05
            java.lang.Object r0 = r6.get()
            X.9aj r0 = (X.C184299aj) r0
            com.whatsapp.jid.UserJid r3 = r1.A08
            X.9NJ r1 = r1.A00
            if (r1 == 0) goto L_0x1316
            X.0vl r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r2 = r0.get()
            java.lang.String r1 = r1.A02
            X.9qa r0 = new X.9qa
            r0.<init>(r3, r1)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1316
            java.lang.Object r1 = r6.get()
            X.9aj r1 = (X.C184299aj) r1
            X.9q5 r0 = r5.A02
            r1.A00 = r0
            java.util.List r0 = r5.A03
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x1313
            X.8lt r0 = new X.8lt
            r0.<init>(r5)
        L_0x130f:
            r4.invoke(r0)
            return
        L_0x1313:
            X.8lx r0 = X.C169578lx.A00
            goto L_0x130f
        L_0x1316:
            X.8ly r0 = X.C169588ly.A00
            goto L_0x130f
        L_0x1319:
            return
        L_0x131a:
            return
        L_0x131b:
            return
        L_0x131c:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 66
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r0, r8)
            byte[] r0 = (byte[]) r0
            byte[] r4 = java.util.Arrays.copyOfRange(r0, r4, r3)
            X.DSQ r0 = r2.aesK_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            byte[] r3 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            X.DSQ r0 = r2.kNonce_     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            byte[] r0 = r0.A06()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            r1.<init>(r4, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            javax.crypto.spec.IvParameterSpec r0 = X.AnonymousClass8BR.A19(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            r14 = 2
            byte[] r10 = X.AnonymousClass8BS.A1Q(r1, r0, r2, r3, r14)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            X.1NT r9 = r5.A09     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            X.2Qv r11 = X.C49532Qv.PASSWORD_ENCRYPTED     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            java.lang.String r13 = r5.A0C     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            X.10I r0 = r9.A07     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            X.AkT r8 = new X.AkT     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            r8.<init>(r9, r10, r11, r12, r13, r14)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            r0.CGF(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x135a }
            return
        L_0x135a:
            r1 = move-exception
            java.lang.String r0 = "encb/LoginUserHandler//retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r1 = -1
            r0 = 5
            r12.BtE(r0, r1, r1)
            return
        L_0x1366:
            r1 = move-exception
            java.lang.String r0 = "encb/LoginUserHandler/retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r1 = -1
            r0 = 5
            goto L_0x1375
        L_0x136f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
            r1 = -1
            r0 = 7
        L_0x1375:
            r12.BtE(r0, r1, r1)
            return
        L_0x1379:
            r6.A04 = r0     // Catch:{ all -> 0x1383 }
            r0 = 2
            r6.A00 = r0     // Catch:{ all -> 0x1383 }
            monitor-exit(r3)     // Catch:{ all -> 0x1383 }
            r6.A00()
            return
        L_0x1383:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1383 }
            throw r0
        L_0x1386:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x1386 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21368Aix.run():void");
    }
}
