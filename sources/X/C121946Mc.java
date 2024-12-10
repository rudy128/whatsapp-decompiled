package X;

import com.whatsapp.jid.UserJid;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Mc  reason: invalid class name and case insensitive filesystem */
public final class C121946Mc extends A34 {
    public Set A00;
    public Set A01;
    public final UserJid A02;
    public final WeakReference A03;
    public final /* synthetic */ C133166oH A04;

    public static C23624Bmt A00(C23624Bmt bmt, String str, byte[] bArr) {
        C23624Bmt A0N = C164588Zk.DEFAULT_INSTANCE.A0N();
        byte[] bytes = str.getBytes();
        C23581BmB A012 = DSQ.A01(bytes, 0, bytes.length);
        A0N.A0E();
        C164588Zk r1 = (C164588Zk) A0N.A00;
        r1.bitField0_ |= 2;
        r1.identifier_ = A012;
        C23581BmB A013 = DSQ.A01(bArr, 0, bArr.length);
        A0N.A0E();
        C164588Zk r12 = (C164588Zk) A0N.A00;
        r12.bitField0_ |= 1;
        r12.content_ = A013;
        bmt.A0E();
        return A0N;
    }

    public C121946Mc(AnonymousClass894 r2, C133166oH r3, UserJid userJid) {
        this.A04 = r3;
        this.A02 = userJid;
        this.A03 = AnonymousClass3MW.A0z(r2);
    }

    public static String A01(String str, List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            byte[] A042 = A04(list);
            byte[] bArr = new byte[2];
            bArr[1] = 0;
            bArr[0] = 0;
            byte[] A05 = A8G.A05(bArr, A042, str.getBytes());
            for (int i = 0; i < 5200; i++) {
                instance.update(A05);
                A05 = instance.digest(A042);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A02(A05, 0));
            A10.append(A02(A05, 5));
            A10.append(A02(A05, 10));
            A10.append(A02(A05, 15));
            A10.append(A02(A05, 20));
            return AnonymousClass000.A0y(A02(A05, 25), A10);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static String A02(byte[] bArr, int i) {
        long j = ((long) bArr[i + 4]) & 255;
        Object[] A1a = AnonymousClass3MW.A1a();
        AnonymousClass3MX.A1S(A1a, 0, (j | (((((((long) bArr[i]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 24)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 8))) % 100000);
        return String.format("%05d", A1a);
    }

    public void A0F() {
        AnonymousClass894 r0 = (AnonymousClass894) this.A03.get();
        if (r0 != null) {
            r0.C1J();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024c, code lost:
        r2 = (com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOO(4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0253, code lost:
        if (r2 == null) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0255, code lost:
        r1 = new X.C126816dL(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025b, code lost:
        r0 = "wamsys/generateFingerprint/processing-fingerprints-failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        com.whatsapp.wamsys.JniBridge.getInstance();
        r6 = r1.A00;
        r3 = (java.lang.String) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(2, 37, r6);
        com.whatsapp.wamsys.JniBridge.getInstance();
        r1 = (java.lang.String) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(2, 38, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0277, code lost:
        if (r3 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0279, code lost:
        if (r1 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027b, code lost:
        r0 = new X.C133506os(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0280, code lost:
        com.whatsapp.wamsys.JniBridge.getInstance();
        r1 = new X.C128396fv(r0, (X.C165098aa) X.C23577Bm6.A07(X.C165098aa.DEFAULT_INSTANCE, (byte[]) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(0, 36, r6)));
        r1.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029b, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a1, code lost:
        r3 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a3, code lost:
        if (r8 != false) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a5, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a7, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a8, code lost:
        if (r7 != false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02aa, code lost:
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ab, code lost:
        r15 = (long) r6;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ae, code lost:
        if (r13 != null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b0, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b2, code lost:
        if (r14 == null) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02b4, code lost:
        r20 = r14.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b8, code lost:
        r6 = new X.C126806dK((com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(0, r15, r17, r18, r19, r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c4, code lost:
        if (r8 != false) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c6, code lost:
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02c8, code lost:
        if (r7 == false) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ca, code lost:
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02cb, code lost:
        r4 = (long) r5;
        r24 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ce, code lost:
        if (r2 != null) goto L_0x0300;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d0, code lost:
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02d2, code lost:
        if (r1 == null) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d4, code lost:
        r24 = r1.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02d8, code lost:
        r5 = (com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(1, r3.wajContext.get(), r6.A00, new X.C126806dK((com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(0, r4, r21, r22, r23, r24)).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f8, code lost:
        if (r5 != null) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02fa, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/create-fingerprint-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ff, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0300, code lost:
        r23 = r2.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0305, code lost:
        r19 = r13.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x030a, code lost:
        r2 = (com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOO(4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0311, code lost:
        if (r2 == null) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0313, code lost:
        r1 = new X.C126816dL(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        com.whatsapp.wamsys.JniBridge.getInstance();
        r6 = r1.A00;
        r4 = (java.lang.String) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(2, 37, r6);
        com.whatsapp.wamsys.JniBridge.getInstance();
        r1 = (java.lang.String) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(2, 38, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0331, code lost:
        if (r4 == null) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0333, code lost:
        if (r1 == null) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0336, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0338, code lost:
        r3 = new X.C133506os(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033d, code lost:
        com.whatsapp.wamsys.JniBridge.getInstance();
        r1 = new X.C128396fv(r3, (X.C165098aa) X.C23577Bm6.A07(X.C165098aa.DEFAULT_INSTANCE, (byte[]) com.whatsapp.wamsys.JniBridge.jvidispatchOIO(0, 36, r6)));
        r1.A00 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0357, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0358, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x035e, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/processing-fingerprints-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0363, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01aa, code lost:
        if (((X.AnonymousClass12B) r5.A09.get()).A01(r3) == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01ad, code lost:
        if (r11 != false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01af, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01bc, code lost:
        if (((X.AnonymousClass12B) r5.A09.get()).A01(r7) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01be, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bf, code lost:
        r5 = r8.A00;
        r18 = X.AnonymousClass1PK.A00(r5, r9);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01c6, code lost:
        if (r18 != null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c8, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/local-identity-key-conversion-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01cd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e5, code lost:
        r22 = X.AnonymousClass1PK.A00(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e9, code lost:
        if (r22 != null) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01eb, code lost:
        com.whatsapp.util.Log.e("wamsys/generateFingerprint/remote-identity-key-conversion-failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01f1, code lost:
        r7 = r5.A00;
        r8 = X.C18020vd.A05(r10, r7, 7468);
        r7 = X.C18020vd.A05(r10, r7, 7587);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ff, code lost:
        if (r7 != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0201, code lost:
        if (r8 != false) goto L_0x02a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0203, code lost:
        r10 = X.AnonymousClass1PK.A00(r5, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0208, code lost:
        if (r10 != null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x020a, code lost:
        r0 = "wamsys/generateFingerprint/local-identity-key-conversion-failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x020c, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0210, code lost:
        r11 = X.AnonymousClass1PK.A00(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0214, code lost:
        if (r11 != null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0216, code lost:
        r0 = "wamsys/generateFingerprint/remote-identity-key-conversion-failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0219, code lost:
        r9 = r5.A01.wajContext.get();
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0222, code lost:
        if (r13 != null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0224, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0225, code lost:
        if (r2 != null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0227, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0228, code lost:
        if (r14 != null) goto L_0x023d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022a, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022b, code lost:
        if (r1 == null) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022d, code lost:
        r15 = r1.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0231, code lost:
        r5 = (com.facebook.simplejni.NativeHolder) com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOOO(0, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0238, code lost:
        if (r5 != null) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023a, code lost:
        r0 = "wamsys/generateFingerprint/create-fingerprint-failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x023d, code lost:
        r14 = r14.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0242, code lost:
        r13 = r2.getRawString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0247, code lost:
        r12 = r13.getRawString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r26) {
        /*
            r25 = this;
            r6 = r25
            com.whatsapp.jid.UserJid r7 = r6.A02
            if (r7 == 0) goto L_0x0364
            X.6oH r5 = r6.A04
            X.1MR r8 = r5.A06
            java.util.HashSet r0 = r8.A0A(r7)
            java.util.Set r3 = r5.A00(r0)
            r6.A01 = r3
            X.2kp r1 = r5.A05
            java.lang.String r2 = "userDeviceJids"
            r0 = 0
            java.util.HashMap r4 = r1.A00(r3)
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0365
            java.util.Set r1 = r6.A01
            if (r1 != 0) goto L_0x002b
            X.C18070vi.A11(r2)
            throw r0
        L_0x002b:
            int r2 = r1.size()
            int r1 = r4.size()
            if (r2 != r1) goto L_0x0365
            X.10f r0 = r8.A02()
            java.util.Set r0 = r5.A00(r0)
            r6.A00 = r0
            X.11S r12 = r5.A00
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A01(r12)
            X.C18070vi.A0X(r3)
            com.whatsapp.jid.DeviceJid r0 = r7.getPrimaryDevice()
            X.2nE r9 = X.C63962tz.A02(r0)
            java.util.Collection r0 = r4.values()
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r1.next()
            X.2kO r0 = (X.C58252kO) r0
            X.1jP r0 = r0.A00
            r2.add(r0)
            goto L_0x005c
        L_0x006e:
            java.util.ArrayList r4 = X.C17880vN.A10(r2)
            boolean r1 = r7 instanceof X.AnonymousClass1E2
            if (r1 != 0) goto L_0x0143
            boolean r0 = r7 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x0143
            X.1P3 r2 = r5.A01
            java.lang.String r0 = r3.user
            java.lang.String r8 = X.C181659Ri.A00(r0)
            r0 = 0
            java.util.ArrayList r1 = r6.A03(r0)
            java.lang.String r0 = r9.A03
            X.C18070vi.A0X(r0)
            java.lang.String r7 = X.C181659Ri.A00(r0)
            X.1PJ r3 = r2.A01
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r1.iterator()
        L_0x009a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r1 = r2.next()
            X.1jP r1 = (X.C33801jP) r1
            X.2kO r0 = new X.2kO
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x009a
        L_0x00af:
            X.2cG r0 = r3.A03()
            X.2kO r0 = r0.A01
            r5.add(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r4.iterator()
        L_0x00c0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r1 = r2.next()
            X.1jP r1 = (X.C33801jP) r1
            X.2kO r0 = new X.2kO
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x00c0
        L_0x00d5:
            java.lang.String r1 = A01(r8, r5)
            java.lang.String r0 = A01(r7, r3)
            if (r1 == 0) goto L_0x0141
            if (r0 == 0) goto L_0x0141
            X.6os r2 = new X.6os
            r2.<init>(r1, r0)
        L_0x00e6:
            byte[] r6 = A04(r5)
            byte[] r5 = A04(r3)
            X.8aa r0 = X.C165098aa.DEFAULT_INSTANCE
            X.Bmt r4 = r0.A0N()
            X.Bm6 r3 = X.C17880vN.A0G(r4)
            X.8aa r3 = (X.C165098aa) r3
            r1 = 0
            int r0 = r3.bitField0_
            r0 = r0 | 1
            r3.bitField0_ = r0
            r3.version_ = r1
            X.Bmt r0 = A00(r4, r8, r6)
            X.Bm6 r1 = r4.A00
            X.8aa r1 = (X.C165098aa) r1
            X.Bm6 r0 = r0.A0C()
            X.8Zk r0 = (X.C164588Zk) r0
            r0.getClass()
            r1.localFingerprint_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            X.Bmt r0 = A00(r4, r7, r5)
            X.Bm6 r1 = r4.A00
            X.8aa r1 = (X.C165098aa) r1
            X.Bm6 r0 = r0.A0C()
            X.8Zk r0 = (X.C164588Zk) r0
            r0.getClass()
            r1.remoteFingerprint_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
            X.Bm6 r1 = r4.A0C()
            X.8aa r1 = (X.C165098aa) r1
            X.6fv r0 = new X.6fv
            r0.<init>(r2, r1)
            return r0
        L_0x0141:
            r2 = 0
            goto L_0x00e6
        L_0x0143:
            X.1E2 r14 = r12.A09()
            boolean r0 = r7 instanceof com.whatsapp.jid.PhoneUserJid
            r13 = 0
            if (r0 == 0) goto L_0x01d4
            r2 = r7
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2
            X.1Ln r0 = r5.A03
            X.1E2 r1 = r0.A0C(r2)
        L_0x0155:
            X.0ve r9 = r5.A07
            r0 = 7468(0x1d2c, float:1.0465E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r8 = X.C18020vd.A05(r10, r9, r0)
            r0 = 7587(0x1da3, float:1.0632E-41)
            boolean r11 = X.C18020vd.A05(r10, r9, r0)
            if (r8 == 0) goto L_0x01d1
            java.lang.String r17 = r12.A0C()
        L_0x016b:
            int r0 = r17.length()
            if (r0 != 0) goto L_0x0173
            r17 = r13
        L_0x0173:
            if (r8 == 0) goto L_0x01ce
            if (r1 == 0) goto L_0x01ce
            X.1M4 r0 = r5.A02
            java.lang.String r21 = r0.BMn(r1)
        L_0x017d:
            X.1P3 r8 = r5.A01
            r0 = 1
            java.util.ArrayList r9 = r6.A03(r0)
            boolean r0 = X.C22971Dz.A0Y(r7)
            if (r0 != 0) goto L_0x019a
            if (r1 == 0) goto L_0x019b
            X.1RL r0 = r5.A04
            java.lang.Boolean r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x019b
        L_0x019a:
            r13 = r3
        L_0x019b:
            if (r11 == 0) goto L_0x01ac
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.12B r0 = (X.AnonymousClass12B) r0
            boolean r0 = r0.A01(r3)
            r6 = 1
            if (r0 != 0) goto L_0x01af
        L_0x01ac:
            r6 = 0
            if (r11 == 0) goto L_0x01be
        L_0x01af:
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.12B r0 = (X.AnonymousClass12B) r0
            boolean r0 = r0.A01(r7)
            r11 = 1
            if (r0 != 0) goto L_0x01bf
        L_0x01be:
            r11 = 0
        L_0x01bf:
            X.1PK r5 = r8.A00
            java.util.ArrayList r18 = X.AnonymousClass1PK.A00(r5, r9)
            r0 = 0
            if (r18 != 0) goto L_0x01e5
            java.lang.String r1 = "wamsys/generateFingerprint/local-identity-key-conversion-failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x01ce:
            r21 = r13
            goto L_0x017d
        L_0x01d1:
            java.lang.String r17 = ""
            goto L_0x016b
        L_0x01d4:
            if (r1 == 0) goto L_0x01e1
            r1 = r7
            X.1E2 r1 = (X.AnonymousClass1E2) r1
            X.1Ln r0 = r5.A03
            com.whatsapp.jid.PhoneUserJid r2 = r0.A0D(r1)
            goto L_0x0155
        L_0x01e1:
            r2 = r13
            r1 = r13
            goto L_0x0155
        L_0x01e5:
            java.util.ArrayList r22 = X.AnonymousClass1PK.A00(r5, r4)
            if (r22 != 0) goto L_0x01f1
            java.lang.String r1 = "wamsys/generateFingerprint/remote-identity-key-conversion-failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x01f1:
            X.0ve r7 = r5.A00
            r3 = 7468(0x1d2c, float:1.0465E-41)
            boolean r8 = X.C18020vd.A05(r10, r7, r3)
            r3 = 7587(0x1da3, float:1.0632E-41)
            boolean r7 = X.C18020vd.A05(r10, r7, r3)
            if (r7 != 0) goto L_0x02a1
            if (r8 != 0) goto L_0x02a1
            java.util.ArrayList r10 = X.AnonymousClass1PK.A00(r5, r9)
            r7 = 0
            if (r10 != 0) goto L_0x0210
            java.lang.String r0 = "wamsys/generateFingerprint/local-identity-key-conversion-failed"
        L_0x020c:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x0210:
            java.util.ArrayList r11 = X.AnonymousClass1PK.A00(r5, r4)
            if (r11 != 0) goto L_0x0219
            java.lang.String r0 = "wamsys/generateFingerprint/remote-identity-key-conversion-failed"
            goto L_0x020c
        L_0x0219:
            com.whatsapp.wamsys.JniBridge r3 = r5.A01
            java.util.concurrent.atomic.AtomicReference r3 = r3.wajContext
            java.lang.Object r9 = r3.get()
            r15 = 0
            if (r13 != 0) goto L_0x0247
            r12 = r0
        L_0x0225:
            if (r2 != 0) goto L_0x0242
            r13 = r0
        L_0x0228:
            if (r14 != 0) goto L_0x023d
            r14 = r0
        L_0x022b:
            if (r1 == 0) goto L_0x0231
            java.lang.String r15 = r1.getRawString()
        L_0x0231:
            r8 = 0
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOOOOO(r8, r9, r10, r11, r12, r13, r14, r15)
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5
            if (r5 != 0) goto L_0x024c
            java.lang.String r0 = "wamsys/generateFingerprint/create-fingerprint-failed"
            goto L_0x020c
        L_0x023d:
            java.lang.String r14 = r14.getRawString()
            goto L_0x022b
        L_0x0242:
            java.lang.String r13 = r2.getRawString()
            goto L_0x0228
        L_0x0247:
            java.lang.String r12 = r13.getRawString()
            goto L_0x0225
        L_0x024c:
            r1 = 4
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r1, r5)
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2
            if (r2 == 0) goto L_0x025b
            X.6dL r1 = new X.6dL
            r1.<init>(r2)
            goto L_0x025e
        L_0x025b:
            java.lang.String r0 = "wamsys/generateFingerprint/processing-fingerprints-failed"
            goto L_0x020c
        L_0x025e:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x029b }
            com.facebook.simplejni.NativeHolder r6 = r1.A00     // Catch:{ 1PN -> 0x029b }
            r4 = 2
            r1 = 37
            java.lang.Object r3 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r1, r6)     // Catch:{ 1PN -> 0x029b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 1PN -> 0x029b }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x029b }
            r1 = 38
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r4, r1, r6)     // Catch:{ 1PN -> 0x029b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1PN -> 0x029b }
            if (r3 == 0) goto L_0x0280
            if (r1 == 0) goto L_0x0280
            X.6os r0 = new X.6os     // Catch:{ 1PN -> 0x029b }
            r0.<init>(r3, r1)     // Catch:{ 1PN -> 0x029b }
        L_0x0280:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x029b }
            r1 = 36
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r8, r1, r6)     // Catch:{ 1PN -> 0x029b }
            byte[] r2 = (byte[]) r2     // Catch:{ 1PN -> 0x029b }
            X.8aa r1 = X.C165098aa.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x029b }
            X.Bm6 r2 = X.C23577Bm6.A07(r1, r2)     // Catch:{ 1PN -> 0x029b }
            X.8aa r2 = (X.C165098aa) r2     // Catch:{ 1PN -> 0x029b }
            X.6fv r1 = new X.6fv     // Catch:{ 1PN -> 0x029b }
            r1.<init>(r0, r2)     // Catch:{ 1PN -> 0x029b }
            r1.A00 = r5     // Catch:{ 1PN -> 0x029b }
            return r1
        L_0x029b:
            java.lang.String r0 = "wamsys/generateFingerprint/protobuf-parsing-failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r7
        L_0x02a1:
            com.whatsapp.wamsys.JniBridge r3 = r5.A01
            if (r8 != 0) goto L_0x02a7
            r17 = r0
        L_0x02a7:
            r5 = -1
            if (r7 != 0) goto L_0x02ab
            r6 = -1
        L_0x02ab:
            long r15 = (long) r6
            r20 = 0
            if (r13 != 0) goto L_0x0305
            r19 = r0
        L_0x02b2:
            if (r14 == 0) goto L_0x02b8
            java.lang.String r20 = r14.getRawString()
        L_0x02b8:
            r14 = 0
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r14, r15, r17, r18, r19, r20)
            com.facebook.simplejni.NativeHolder r4 = (com.facebook.simplejni.NativeHolder) r4
            X.6dK r6 = new X.6dK
            r6.<init>(r4)
            if (r8 != 0) goto L_0x02c8
            r21 = r0
        L_0x02c8:
            if (r7 == 0) goto L_0x02cb
            r5 = r11
        L_0x02cb:
            long r4 = (long) r5
            r24 = 0
            if (r2 != 0) goto L_0x0300
            r23 = r0
        L_0x02d2:
            if (r1 == 0) goto L_0x02d8
            java.lang.String r24 = r1.getRawString()
        L_0x02d8:
            r18 = r14
            r19 = r4
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOOOO(r18, r19, r21, r22, r23, r24)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            X.6dK r2 = new X.6dK
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r1 = r3.wajContext
            java.lang.Object r4 = r1.get()
            com.facebook.simplejni.NativeHolder r3 = r6.A00
            com.facebook.simplejni.NativeHolder r2 = r2.A00
            r1 = 1
            java.lang.Object r5 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOO(r1, r4, r3, r2)
            com.facebook.simplejni.NativeHolder r5 = (com.facebook.simplejni.NativeHolder) r5
            if (r5 != 0) goto L_0x030a
            java.lang.String r1 = "wamsys/generateFingerprint/create-fingerprint-failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x0300:
            java.lang.String r23 = r2.getRawString()
            goto L_0x02d2
        L_0x0305:
            java.lang.String r19 = r13.getRawString()
            goto L_0x02b2
        L_0x030a:
            r1 = 4
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r1, r5)
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2
            if (r2 == 0) goto L_0x035e
            X.6dL r1 = new X.6dL
            r1.<init>(r2)
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x0358 }
            com.facebook.simplejni.NativeHolder r6 = r1.A00     // Catch:{ 1PN -> 0x0358 }
            r3 = 2
            r1 = 37
            java.lang.Object r4 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r3, r1, r6)     // Catch:{ 1PN -> 0x0358 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 1PN -> 0x0358 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x0358 }
            r1 = 38
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r3, r1, r6)     // Catch:{ 1PN -> 0x0358 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1PN -> 0x0358 }
            if (r4 == 0) goto L_0x0336
            if (r1 == 0) goto L_0x0336
            goto L_0x0338
        L_0x0336:
            r3 = r0
            goto L_0x033d
        L_0x0338:
            X.6os r3 = new X.6os     // Catch:{ 1PN -> 0x0358 }
            r3.<init>(r4, r1)     // Catch:{ 1PN -> 0x0358 }
        L_0x033d:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 1PN -> 0x0358 }
            r1 = 36
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r14, r1, r6)     // Catch:{ 1PN -> 0x0358 }
            byte[] r2 = (byte[]) r2     // Catch:{ 1PN -> 0x0358 }
            X.8aa r1 = X.C165098aa.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0358 }
            X.Bm6 r2 = X.C23577Bm6.A07(r1, r2)     // Catch:{ 1PN -> 0x0358 }
            X.8aa r2 = (X.C165098aa) r2     // Catch:{ 1PN -> 0x0358 }
            X.6fv r1 = new X.6fv     // Catch:{ 1PN -> 0x0358 }
            r1.<init>(r3, r2)     // Catch:{ 1PN -> 0x0358 }
            r1.A00 = r5     // Catch:{ 1PN -> 0x0358 }
            return r1
        L_0x0358:
            java.lang.String r1 = "wamsys/generateFingerprint/protobuf-parsing-failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x035e:
            java.lang.String r1 = "wamsys/generateFingerprint/processing-fingerprints-failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            return r0
        L_0x0364:
            r0 = 0
        L_0x0365:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121946Mc.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C128396fv r3 = (C128396fv) obj;
        AnonymousClass894 r1 = (AnonymousClass894) this.A03.get();
        if (r1 != null) {
            Set set = this.A01;
            if (set == null) {
                C18070vi.A11("userDeviceJids");
                throw null;
            } else {
                r1.Bub(r3, set);
            }
        }
    }

    private final ArrayList A03(boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        if (z) {
            byte[] bArr = this.A04.A01.A06.A03().A01;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
            C17960vV.A07(copyOfRange);
            C33801jP r0 = new C58252kO(new C33801jP(copyOfRange)).A00;
            C18070vi.A0X(r0);
            A13.add(r0);
        }
        C133166oH r2 = this.A04;
        Iterator A0j = C17890vO.A0j(r2.A05.A00(r2.A00(r2.A06.A02())));
        while (A0j.hasNext()) {
            C33801jP r02 = ((C58252kO) A0j.next()).A00;
            C18070vi.A0X(r02);
            A13.add(r02);
        }
        return A13;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, java.util.Comparator] */
    public static byte[] A04(List list) {
        ArrayList A14 = AnonymousClass000.A14(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A14.add(((C58252kO) it.next()).A00.A00());
        }
        Collections.sort(A14, new Object());
        ByteArrayOutputStream A15 = C108945cZ.A15();
        Iterator it2 = A14.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            A15.write(bArr, 0, bArr.length);
        }
        return A15.toByteArray();
    }
}
