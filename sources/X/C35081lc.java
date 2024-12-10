package X;

import java.io.UnsupportedEncodingException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1lc  reason: invalid class name and case insensitive filesystem */
public final class C35081lc implements C35071lb {
    public static final C35021lW A0D = C35011lV.A00;
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final C35061la A02;
    public final C35051lZ A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;

    public C35081lc(AnonymousClass11P r2, C18030ve r3, C35061la r4, C35051lZ r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r8, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r10, 7);
        C18070vi.A0d(r11, 8);
        C18070vi.A0d(r12, 9);
        C18070vi.A0d(r13, 10);
        C18070vi.A0d(r14, 11);
        C18070vi.A0d(r5, 12);
        C18070vi.A0d(r4, 13);
        this.A00 = r2;
        this.A01 = r3;
        this.A08 = r6;
        this.A04 = r7;
        this.A0A = r8;
        this.A05 = r9;
        this.A06 = r10;
        this.A09 = r11;
        this.A0C = r12;
        this.A07 = r13;
        this.A0B = r14;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final void A0A(AnonymousClass732 r17, C1606789m r18, AnonymousClass705 r19, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        AnonymousClass732 r1 = r17;
        C18070vi.A0d(r1, 1);
        PublicKey publicKey2 = publicKey;
        C18070vi.A0d(publicKey2, 2);
        int i2 = i;
        C1606789m r2 = r18;
        if (AnonymousClass6Y9.A00(r2, Integer.valueOf(i2), publicKey2)) {
            X509Certificate x509Certificate2 = x509Certificate;
            A03(r1, new C146207Of(r1, r2, r19, this, publicKey2, x509Certificate2, i2), this, (Long) null, "react", publicKey2, x509Certificate2, i2);
        }
    }

    /* renamed from: A0B */
    public void CBY(C1606789m r21, AnonymousClass705 r22, C53932dK r23, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 1);
        C1606789m r7 = r21;
        C18070vi.A0d(r7, 4);
        AnonymousClass705 r8 = r22;
        C18070vi.A0d(r8, 5);
        C53932dK r3 = r23;
        C17960vV.A07(r3);
        C18070vi.A0b(r3);
        PublicKey publicKey2 = publicKey;
        if (r3.A00 != 1) {
            Object obj = r3.A01;
            C17960vV.A07(obj);
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            C18070vi.A0b(publicKey2);
            C18070vi.A0b(num);
            Integer num2 = (Integer) list.get(1);
            A04(r7, r8, (C1418477e) list.get(0), (C1418477e) list.get(2), (C1418477e) list.get(3), (C1418477e) list.get(4), (C1418477e) list.get(5), (C1418477e) list.get(6), this, num2, publicKey2, x509Certificate2, num.intValue());
            return;
        }
        Object obj2 = r3.A01;
        C17960vV.A07(obj2);
        C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.fbusers.FBUserEntity");
        C18070vi.A0b(publicKey2);
        C18070vi.A0b(num);
        A0A((AnonymousClass732) obj2, r7, r8, publicKey2, x509Certificate2, num.intValue());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C1606789m r27, X.AnonymousClass705 r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.security.PublicKey r33, java.security.cert.X509Certificate r34, int r35) {
        /*
            r26 = this;
            r0 = 0
            r13 = r34
            X.C18070vi.A0d(r13, r0)
            r0 = 3
            r4 = r27
            X.C18070vi.A0d(r4, r0)
            r0 = 4
            r5 = r28
            X.C18070vi.A0d(r5, r0)
            r7 = r29
            r12 = r33
            boolean r0 = X.AnonymousClass6Y9.A00(r4, r7, r12)
            if (r0 == 0) goto L_0x00a9
            java.security.KeyPair r3 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r3)     // Catch:{  }
            java.security.PublicKey r0 = r3.getPublic()
            java.lang.String r1 = X.C20059A5i.A01(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r8 = X.C20059A5i.A00()
            X.C18070vi.A0X(r8)
            X.C18070vi.A0b(r12)     // Catch:{ NoSuchAlgorithmException -> 0x00a4 }
            X.C18070vi.A0b(r7)     // Catch:{ NoSuchAlgorithmException -> 0x00a4 }
            int r0 = r7.intValue()     // Catch:{ NoSuchAlgorithmException -> 0x00a4 }
            r6 = r26
            java.lang.String r0 = A00(r6, r8, r12, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00a4 }
            r2 = 0
            org.json.JSONObject r0 = A01(r6, r1, r0, r2)     // Catch:{  }
            java.lang.String r1 = r0.toString()     // Catch:{  }
            X.C18070vi.A0b(r1)     // Catch:{  }
            X.00H r0 = r6.A04     // Catch:{  }
            java.lang.Object r0 = r0.get()     // Catch:{  }
            X.A0V r0 = (X.A0V) r0     // Catch:{  }
            X.6h6 r16 = r0.A01(r1, r13)     // Catch:{  }
            X.11P r0 = r6.A00     // Catch:{  }
            long r24 = X.AnonymousClass11P.A01(r0)     // Catch:{  }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r0
            X.6Oe r15 = new X.6Oe     // Catch:{  }
            r21 = r2
            r22 = r2
            r9 = r30
            r10 = r31
            r11 = r32
            r14 = r35
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r23 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{  }
            X.00H r0 = r6.A07
            java.lang.Object r1 = r0.get()
            X.C18070vi.A0X(r1)
            X.878 r1 = (X.AnonymousClass878) r1
            java.security.PrivateKey r16 = r3.getPrivate()
            X.7Ok r3 = new X.7Ok
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = 37
            X.7GP r11 = new X.7GP
            r12 = r4
            r13 = r3
            r14 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r1.CHQ(r11, r15, r0)
            return
        L_0x00a4:
            r0 = move-exception
            r4.Bsw(r0)
            return
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.A0C(X.89m, X.705, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public void CBb(AnonymousClass732 r13, C1606789m r14, AnonymousClass705 r15, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 0);
        C18070vi.A0d(r14, 2);
        C18070vi.A0d(r15, 5);
        Object obj = this.A0B.get();
        C18070vi.A0X(obj);
        ((AnonymousClass878) obj).CHQ(new AnonymousClass7GP(r14, new C146227Oh(r14, r15, this, num, str, publicKey, x509Certificate2), this, (Object) null, (PrivateKey) null), (Object) null, 59);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBd(X.AnonymousClass732 r24, X.C1606789m r25, X.AnonymousClass705 r26, java.lang.Integer r27, java.security.PublicKey r28, java.security.cert.X509Certificate r29) {
        /*
            r23 = this;
            r0 = 0
            r3 = r29
            X.C18070vi.A0d(r3, r0)
            r0 = 1
            r6 = r24
            X.C18070vi.A0d(r6, r0)
            r0 = 4
            r5 = r25
            X.C18070vi.A0d(r5, r0)
            r0 = 5
            r8 = r26
            X.C18070vi.A0d(r8, r0)
            r7 = r27
            r4 = r28
            boolean r0 = X.AnonymousClass6Y9.A00(r5, r7, r4)
            if (r0 == 0) goto L_0x00b9
            X.77e r0 = r6.A02     // Catch:{ JSONException -> 0x00b4 }
            java.lang.Object r14 = r0.A00     // Catch:{ JSONException -> 0x00b4 }
            X.C17960vV.A07(r14)     // Catch:{ JSONException -> 0x00b4 }
            X.C18070vi.A0X(r14)     // Catch:{ JSONException -> 0x00b4 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b4 }
            r13.<init>()     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r1 = "version"
            r0 = 1
            r13.put(r1, r0)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r12 = "timestamp"
            r2 = r23
            X.11P r9 = r2.A00     // Catch:{ JSONException -> 0x00b4 }
            long r0 = X.AnonymousClass11P.A01(r9)     // Catch:{ JSONException -> 0x00b4 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r10
            r13.put(r12, r0)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r0 = "access_token"
            r13.put(r0, r14)     // Catch:{ JSONException -> 0x00b4 }
            java.lang.String r1 = r13.toString()     // Catch:{ JSONException -> 0x00b4 }
            X.C18070vi.A0b(r1)     // Catch:{ JSONException -> 0x00b4 }
            X.00H r0 = r2.A04     // Catch:{  }
            java.lang.Object r0 = r0.get()     // Catch:{  }
            X.A0V r0 = (X.A0V) r0     // Catch:{  }
            X.6h6 r12 = r0.A01(r1, r3)     // Catch:{  }
            long r20 = X.AnonymousClass11P.A01(r9)     // Catch:{  }
            long r20 = r20 / r10
            X.77e r13 = r6.A04     // Catch:{  }
            r14 = 0
            r19 = -1
            X.6Oe r11 = new X.6Oe     // Catch:{  }
            r16 = r14
            r17 = r14
            r18 = r14
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.00H r1 = r2.A08
            java.lang.Object r0 = r1.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r9 = r0.A0B()
            java.lang.Object r1 = r1.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.00H r0 = r2.A07
            java.lang.Object r10 = r0.get()
            X.61Q r10 = (X.AnonymousClass61Q) r10
            r0 = 83
            X.1ca r18 = r10.A00(r11, r9, r0)
            X.7LT r10 = new X.7LT
            r12 = r5
            r13 = r8
            r14 = r2
            r15 = r7
            r16 = r4
            r17 = r3
            r11 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r21 = 32000(0x7d00, double:1.581E-319)
            r20 = 264(0x108, float:3.7E-43)
            r17 = r10
            r16 = r1
            r19 = r9
            r16.A0N(r17, r18, r19, r20, r21)
            return
        L_0x00b4:
            r0 = move-exception
            r5.Bsw(r0)
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.CBd(X.732, X.89m, X.705, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBe(X.AnonymousClass732 r23, X.C1606789m r24, X.AnonymousClass705 r25, java.lang.Integer r26, java.security.PublicKey r27, java.security.cert.X509Certificate r28) {
        /*
            r22 = this;
            r1 = 0
            r0 = r28
            X.C18070vi.A0d(r0, r1)
            r1 = 1
            r6 = r23
            X.C18070vi.A0d(r6, r1)
            r1 = 4
            r3 = r24
            X.C18070vi.A0d(r3, r1)
            r1 = 5
            r5 = r25
            X.C18070vi.A0d(r5, r1)
            r4 = r26
            r2 = r27
            boolean r1 = X.AnonymousClass6Y9.A00(r3, r4, r2)
            if (r1 == 0) goto L_0x00b9
            java.security.KeyPair r10 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r10)     // Catch:{  }
            java.security.PublicKey r1 = r10.getPublic()
            java.lang.String r9 = X.C20059A5i.A01(r1)
            X.C18070vi.A0X(r9)
            X.77e r1 = r6.A05     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            java.lang.Object r8 = r1.A00     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            X.C17960vV.A07(r8)     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            X.C18070vi.A0X(r8)     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            X.C18070vi.A0b(r2)     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            X.C18070vi.A0b(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            int r7 = r4.intValue()     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            r1 = r22
            java.lang.String r7 = A00(r1, r8, r2, r7)     // Catch:{ NoSuchAlgorithmException -> 0x00b4 }
            r14 = 0
            org.json.JSONObject r7 = A01(r1, r9, r7, r14)     // Catch:{  }
            java.lang.String r8 = r7.toString()     // Catch:{  }
            X.C18070vi.A0b(r8)     // Catch:{  }
            X.00H r7 = r1.A04     // Catch:{  }
            java.lang.Object r7 = r7.get()     // Catch:{  }
            X.A0V r7 = (X.A0V) r7     // Catch:{  }
            X.6h6 r12 = r7.A01(r8, r0)     // Catch:{  }
            X.11P r7 = r1.A00     // Catch:{  }
            long r20 = X.AnonymousClass11P.A01(r7)     // Catch:{  }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 / r7
            X.77e r13 = r6.A04     // Catch:{  }
            r19 = -1
            X.6Oe r11 = new X.6Oe     // Catch:{  }
            r16 = r14
            r17 = r14
            r18 = r14
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{  }
            X.00H r7 = r1.A07
            java.lang.Object r7 = r7.get()
            X.C18070vi.A0X(r7)
            X.878 r7 = (X.AnonymousClass878) r7
            java.security.PrivateKey r20 = r10.getPrivate()
            X.7Oi r12 = new X.7Oi
            r14 = r3
            r15 = r5
            r16 = r1
            r17 = r4
            r18 = r2
            r19 = r0
            r13 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0 = 46
            X.7GP r15 = new X.7GP
            r16 = r3
            r17 = r12
            r18 = r1
            r19 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r7.CHQ(r15, r11, r0)
            return
        L_0x00b4:
            r0 = move-exception
            r3.Bsw(r0)
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.CBe(X.732, X.89m, X.705, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate):void");
    }

    public static final String A00(C35081lc r2, String str, PublicKey publicKey, int i) {
        r2.A04.get();
        String A002 = A0V.A00(Integer.valueOf(i), str, (String) null, publicKey);
        C18070vi.A0X(A002);
        StringBuilder sb = new StringBuilder();
        sb.append("#PWD_WA:11:");
        sb.append(AnonymousClass11P.A01(r2.A00) / 1000);
        sb.append(':');
        sb.append(A002);
        return sb.toString();
    }

    public static final JSONObject A01(C35081lc r6, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("timestamp", AnonymousClass11P.A01(r6.A00) / 1000);
        jSONObject.put("password", str2);
        if (str3 != null) {
            jSONObject.put("nonce", str3);
        }
        jSONObject.put("client_pub_key", str);
        jSONObject.put("client_pub_key_type", "RSA 2048");
        return jSONObject;
    }

    public static final void A02(AnonymousClass732 r7, C1606789m r8, AnonymousClass705 r9, C122936Sm r10, C35081lc r11, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        C31081ez.A02("AccountLinkingFbUserEntityOperationHelper/handleSuspendedError");
        C35081lc r3 = r11;
        ((C34951lN) r11.A09.get()).A06(true);
        C29621ca A0K = r10.node.A0K("error");
        C1606789m r4 = r8;
        if (A0K != null) {
            Boolean valueOf = Boolean.valueOf(A0K.A0Q("npr", (String) null));
            C18070vi.A0b(valueOf);
            if (!valueOf.booleanValue()) {
                r3.CBY(r4, r9, new C53932dK(1, r7), Integer.valueOf(i), publicKey, x509Certificate);
                return;
            }
        }
        r8.Bsw(r10);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass732 r16, X.AnonymousClass89X r17, X.C35081lc r18, java.lang.Long r19, java.lang.String r20, java.security.PublicKey r21, java.security.cert.X509Certificate r22, int r23) {
        /*
            r7 = r17
            java.security.KeyPair r5 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r5)     // Catch:{  }
            java.security.PublicKey r0 = r5.getPublic()
            java.lang.String r1 = X.C20059A5i.A01(r0)
            X.C18070vi.A0X(r1)
            r8 = r16
            X.77e r0 = r8.A05     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            java.lang.Object r0 = r0.A00     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            X.C17960vV.A07(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            X.C18070vi.A0X(r0)     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            r6 = r18
            r3 = r21
            r2 = r23
            java.lang.String r0 = A00(r6, r0, r3, r2)     // Catch:{ NoSuchAlgorithmException -> 0x00c2 }
            r14 = 0
            org.json.JSONObject r0 = A01(r6, r1, r0, r14)     // Catch:{  }
            java.lang.String r1 = r0.toString()     // Catch:{  }
            X.C18070vi.A0b(r1)     // Catch:{  }
            X.00H r0 = r6.A04     // Catch:{  }
            java.lang.Object r0 = r0.get()     // Catch:{  }
            X.A0V r0 = (X.A0V) r0     // Catch:{  }
            r2 = r22
            X.6h6 r4 = r0.A01(r1, r2)     // Catch:{  }
            X.11P r0 = r6.A00     // Catch:{  }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{  }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            X.77e r3 = r8.A04     // Catch:{  }
            X.6Od r2 = new X.6Od     // Catch:{  }
            r2.<init>(r4, r3, r0)     // Catch:{  }
            X.00H r12 = r6.A08
            java.lang.Object r0 = r12.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r15 = r0.A0B()
            X.6h6 r0 = r2.A01
            byte[] r11 = r0.A01
            X.C18070vi.A0W(r11)
            byte[] r10 = r0.A02
            X.C18070vi.A0W(r10)
            byte[] r9 = r0.A00
            X.C18070vi.A0W(r9)
            byte[] r4 = r0.A03
            X.C18070vi.A0W(r4)
            long r0 = r2.A00
            X.77e r2 = r2.A02
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r2 = r2.A00
            X.C17960vV.A07(r2)
        L_0x0083:
            java.lang.String r16 = java.lang.String.valueOf(r2)
            if (r19 == 0) goto L_0x0092
            long r2 = r19.longValue()
            X.9EZ r14 = new X.9EZ
            r14.<init>(r2)
        L_0x0092:
            X.9F5 r13 = new X.9F5
            r17 = r20
            r21 = r4
            r22 = r0
            r18 = r11
            r19 = r10
            r20 = r9
            r13.<init>((X.AnonymousClass9EZ) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (byte[]) r18, (byte[]) r19, (byte[]) r20, (byte[]) r21, (long) r22)
            X.6hn r0 = new X.6hn
            r0.<init>(r8, r7, r6, r5)
            java.lang.Object r1 = r12.get()
            X.1OZ r1 = (X.AnonymousClass1OZ) r1
            X.1ca r3 = r13.BVP()
            X.6P1 r2 = new X.6P1
            r2.<init>(r0, r13)
            r5 = 449(0x1c1, float:6.29E-43)
            r6 = 32000(0x7d00, double:1.581E-319)
            r4 = r15
            r1.A0N(r2, r3, r4, r5, r6)
            return
        L_0x00c0:
            r2 = r14
            goto L_0x0083
        L_0x00c2:
            r0 = move-exception
            r7.Bsw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.A03(X.732, X.89X, X.1lc, java.lang.Long, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C1606789m r19, X.AnonymousClass705 r20, X.C1418477e r21, X.C35081lc r22, java.lang.String r23, java.security.PublicKey r24, java.security.cert.X509Certificate r25, int r26) {
        /*
            r2 = r19
            java.security.KeyPair r8 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r8)     // Catch:{  }
            java.security.PublicKey r0 = r8.getPublic()
            java.lang.String r6 = X.C20059A5i.A01(r0)
            X.C18070vi.A0X(r6)
            r3 = r22
            r5 = r23
            r4 = r24
            r0 = r26
            java.lang.String r1 = A00(r3, r5, r4, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0086 }
            r11 = r21
            byte[] r16 = A09(r11, r3)
            r12 = 0
            org.json.JSONObject r1 = A01(r3, r6, r1, r12)     // Catch:{  }
            java.lang.String r7 = r1.toString()     // Catch:{  }
            X.C18070vi.A0b(r7)     // Catch:{  }
            X.00H r1 = r3.A04     // Catch:{  }
            java.lang.Object r6 = r1.get()     // Catch:{  }
            X.A0V r6 = (X.A0V) r6     // Catch:{  }
            r1 = r25
            X.6h6 r10 = r6.A01(r7, r1)     // Catch:{  }
            X.11P r6 = r3.A00     // Catch:{  }
            long r18 = X.AnonymousClass11P.A01(r6)     // Catch:{  }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r6
            r17 = -1
            X.6Oe r9 = new X.6Oe     // Catch:{  }
            r14 = r12
            r15 = r12
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{  }
            X.00H r6 = r3.A07
            java.lang.Object r6 = r6.get()
            X.C18070vi.A0X(r6)
            X.878 r6 = (X.AnonymousClass878) r6
            java.security.PrivateKey r19 = r8.getPrivate()
            X.7Oj r10 = new X.7Oj
            r12 = r20
            r13 = r11
            r14 = r3
            r15 = r5
            r16 = r4
            r17 = r1
            r18 = r0
            r11 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = 38
            X.7GP r14 = new X.7GP
            r15 = r2
            r16 = r10
            r17 = r3
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            r6.CHQ(r14, r9, r0)
            return
        L_0x0086:
            r0 = move-exception
            r2.Bsw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.A05(X.89m, X.705, X.77e, X.1lc, java.lang.String, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }

    public static final void A06(C29621ca r4, C35081lc r5) {
        C35051lZ r2;
        long j;
        C29621ca A0K = r4.A0K("ping_interval");
        int A0A2 = r4.A0A("ping_interval", -1);
        if (A0K != null && A0K.A0M() != null) {
            r2 = r5.A03;
            String A0M = A0K.A0M();
            if (A0M != null) {
                j = Long.parseLong(A0M);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (A0A2 != -1) {
            r2 = r5.A03;
            j = (long) A0A2;
        } else {
            throw new IllegalStateException("ping interval not present");
        }
        r2.A02(j);
    }

    public static final boolean A08(C1606789m r4, AnonymousClass705 r5, C122936Sm r6, C35081lc r7, Runnable runnable, int i) {
        if (!(i == 400 || i == 405)) {
            if (i != 408) {
                if (i != 416) {
                    if (i != 429) {
                        if (i == 481) {
                            r7.A0A.get();
                            C18070vi.A0d(r5, 0);
                            if (r5.A04()) {
                                runnable.run();
                                return true;
                            }
                        } else if (!(i == 485 || i == 500 || i == 503)) {
                            return false;
                        }
                    }
                }
            }
            C139996zm r3 = (C139996zm) r7.A0A.get();
            C18070vi.A0d(r5, 0);
            Long A012 = r5.A01();
            if (A012 != null) {
                r3.A00.CGv(runnable, A012.longValue());
                return true;
            }
        }
        r4.Bsw(r6);
        return true;
    }

    public static final byte[] A09(C1418477e r4, C35081lc r5) {
        C53272cG A032 = ((AnonymousClass1P3) r5.A0C.get()).A01.A03();
        StringBuilder sb = new StringBuilder();
        sb.append("1539");
        Object obj = r4.A00;
        C17960vV.A07(obj);
        sb.append(((Number) obj).longValue());
        String obj2 = sb.toString();
        C58242kN r1 = A032.A00;
        byte[] bytes = obj2.getBytes(C26571Sq.A05);
        C18070vi.A0X(bytes);
        return C63962tz.A09(r1, bytes);
    }

    public /* bridge */ /* synthetic */ void CBW(C1606789m r2, AnonymousClass705 r3, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw new UnsupportedEncodingException();
    }

    public /* bridge */ /* synthetic */ void CBZ() {
        throw new UnsupportedOperationException();
    }

    public static final boolean A07(C1606789m r2, AnonymousClass705 r3, C122936Sm r4, C35081lc r5, Runnable runnable, int i) {
        if (!A08(r2, r3, r4, r5, runnable, i)) {
            if (i != 483) {
                return false;
            }
            ((C139996zm) r5.A0A.get()).A00();
            r2.Bsw(r4);
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void CBX(C1606789m r11, AnonymousClass705 r12, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        A0C(r11, r12, num, str, str2, str3, publicKey, x509Certificate, num2.intValue());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C1606789m r35, X.AnonymousClass705 r36, X.C1418477e r37, X.C1418477e r38, X.C1418477e r39, X.C1418477e r40, X.C1418477e r41, X.C1418477e r42, X.C35081lc r43, java.lang.Integer r44, java.security.PublicKey r45, java.security.cert.X509Certificate r46, int r47) {
        /*
            java.lang.String r5 = "account_type"
            r17 = r47
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r15 = r35
            r3 = r45
            boolean r0 = X.AnonymousClass6Y9.A00(r15, r0, r3)
            if (r0 == 0) goto L_0x0134
            java.security.KeyPair r16 = X.C20059A5i.A02()     // Catch:{  }
            X.C18070vi.A0b(r16)     // Catch:{  }
            java.security.PublicKey r0 = r16.getPublic()
            java.lang.String r1 = X.C20059A5i.A01(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r2 = X.C20059A5i.A00()
            X.C18070vi.A0X(r2)
            r4 = r43
            r0 = r17
            java.lang.String r0 = A00(r4, r2, r3, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            r8 = 0
            org.json.JSONObject r12 = A01(r4, r1, r0, r8)     // Catch:{  }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{  }
            r14.<init>()     // Catch:{  }
            r24 = r44
            if (r44 == 0) goto L_0x004b
            int r0 = r24.intValue()     // Catch:{  }
            r12.put(r5, r0)     // Catch:{  }
            r14.put(r5, r0)     // Catch:{  }
        L_0x004b:
            r11 = r37
            r9 = r38
            r7 = r39
            r6 = r40
            r5 = r41
            if (r37 == 0) goto L_0x005a
            if (r38 == 0) goto L_0x005a
            goto L_0x0093
        L_0x005a:
            java.lang.String r13 = "reset_password_auth_blob"
            if (r39 == 0) goto L_0x0070
            java.lang.String r1 = "native_auth_blob"
            java.lang.Object r0 = r7.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            r14.put(r1, r0)     // Catch:{  }
            java.lang.String r0 = r14.toString()     // Catch:{  }
            r12.put(r13, r0)     // Catch:{  }
            goto L_0x00ae
        L_0x0070:
            if (r40 == 0) goto L_0x00ae
            if (r41 == 0) goto L_0x00ae
            java.lang.String r1 = "web_auth_token"
            java.lang.Object r0 = r6.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            org.json.JSONObject r10 = r14.put(r1, r0)     // Catch:{  }
            java.lang.String r1 = "web_auth_uri"
            java.lang.Object r0 = r5.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            r10.put(r1, r0)     // Catch:{  }
            java.lang.String r0 = r14.toString()     // Catch:{  }
            r12.put(r13, r0)     // Catch:{  }
            goto L_0x00ae
        L_0x0093:
            java.lang.String r10 = "fbid"
            java.lang.Object r0 = r11.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{  }
            long r0 = r0.longValue()     // Catch:{  }
            org.json.JSONObject r10 = r12.put(r10, r0)     // Catch:{  }
            java.lang.String r1 = "native_auth_nonce"
            java.lang.Object r0 = r9.A00     // Catch:{  }
            X.C17960vV.A07(r0)     // Catch:{  }
            r10.put(r1, r0)     // Catch:{  }
        L_0x00ae:
            java.lang.String r13 = r12.toString()     // Catch:{  }
            X.C18070vi.A0b(r13)     // Catch:{  }
            r1 = r42
            if (r42 == 0) goto L_0x00c1
            java.lang.Object r10 = r1.A00
            X.C17960vV.A07(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00c2
        L_0x00c1:
            r10 = 0
        L_0x00c2:
            X.00H r0 = r4.A04     // Catch:{  }
            java.lang.Object r0 = r0.get()     // Catch:{  }
            X.A0V r0 = (X.A0V) r0     // Catch:{  }
            r12 = r46
            X.6h6 r26 = r0.A01(r13, r12)     // Catch:{  }
            X.11P r0 = r4.A00     // Catch:{  }
            long r34 = X.AnonymousClass11P.A01(r0)     // Catch:{  }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r34 = r34 / r13
            r33 = -1
            X.6Oe r0 = new X.6Oe     // Catch:{  }
            r28 = r8
            r29 = r8
            r30 = r8
            r32 = r8
            r25 = r0
            r27 = r8
            r31 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{  }
            X.00H r8 = r4.A07
            java.lang.Object r8 = r8.get()
            X.C18070vi.A0X(r8)
            X.878 r8 = (X.AnonymousClass878) r8
            java.security.PrivateKey r29 = r16.getPrivate()
            X.7Ol r14 = new X.7Ol
            r16 = r36
            r25 = r2
            r26 = r3
            r27 = r12
            r28 = r17
            r20 = r6
            r21 = r5
            r22 = r1
            r23 = r4
            r17 = r11
            r18 = r9
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 64
            X.7GP r1 = new X.7GP
            r24 = r1
            r25 = r15
            r26 = r14
            r27 = r4
            r28 = r0
            r24.<init>(r25, r26, r27, r28, r29)
            r8.CHQ(r1, r0, r2)
            return
        L_0x0130:
            r0 = move-exception
            r15.Bsw(r0)
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lc.A04(X.89m, X.705, X.77e, X.77e, X.77e, X.77e, X.77e, X.77e, X.1lc, java.lang.Integer, java.security.PublicKey, java.security.cert.X509Certificate, int):void");
    }
}
