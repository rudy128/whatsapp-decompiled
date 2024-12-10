package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1P3  reason: invalid class name */
public class AnonymousClass1P3 {
    public AnonymousClass1PK A00;
    public AnonymousClass1PJ A01;
    public final C25591Ou A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass18O A04;
    public final AnonymousClass1P2 A05;
    public final AnonymousClass1P0 A06;
    public final AnonymousClass1PC A07;
    public final C25631Oy A08;
    public final C25601Ov A09;
    public final AnonymousClass1PD A0A;
    public final AnonymousClass11P A0B;
    public final AnonymousClass118 A0C;
    public final C19830z4 A0D;
    public final AnonymousClass1P1 A0E;
    public final AnonymousClass1PE A0F;
    public final C25581Ot A0G;
    public final C25571Os A0H;
    public final AnonymousClass1MH A0I;
    public final AnonymousClass1MJ A0J;
    public final C18030ve A0K;
    public final AnonymousClass1MK A0L;
    public final JniBridge A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;

    public AnonymousClass1P3(C25591Ou r16, AnonymousClass11S r17, AnonymousClass18O r18, AnonymousClass1P2 r19, AnonymousClass1P0 r20, C25631Oy r21, C25601Ov r22, AnonymousClass11P r23, AnonymousClass118 r24, C19830z4 r25, AnonymousClass1P1 r26, C25641Oz r27, C25581Ot r28, C25571Os r29, AnonymousClass1MH r30, AnonymousClass1MJ r31, C18030ve r32, AnonymousClass1MK r33, JniBridge jniBridge, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40) {
        AnonymousClass11P r5 = r23;
        AnonymousClass18O r7 = r18;
        AnonymousClass1MH r4 = r30;
        AnonymousClass1PC r10 = new AnonymousClass1PC(r7, r5, r4);
        AnonymousClass1PD r13 = new AnonymousClass1PD(r5, r4);
        AnonymousClass1PE r1 = new AnonymousClass1PE(this);
        this.A0F = r1;
        this.A0B = r5;
        C18030ve r3 = r32;
        this.A0K = r3;
        JniBridge jniBridge2 = jniBridge;
        this.A0M = jniBridge2;
        this.A03 = r17;
        this.A04 = r7;
        this.A0H = r29;
        this.A0P = r35;
        C25581Ot r0 = r28;
        this.A0G = r0;
        this.A0I = r4;
        this.A02 = r16;
        this.A07 = r10;
        C25601Ov r12 = r22;
        this.A09 = r12;
        this.A0N = r36;
        this.A0D = r25;
        this.A0S = r37;
        C25631Oy r11 = r21;
        this.A08 = r11;
        this.A0J = r31;
        AnonymousClass1P0 r9 = r20;
        this.A06 = r9;
        this.A0A = r13;
        this.A0Q = r39;
        this.A0E = r26;
        this.A0L = r33;
        this.A0R = r40;
        AnonymousClass1P2 r8 = r19;
        this.A05 = r8;
        AnonymousClass11P r92 = r5;
        this.A01 = new AnonymousClass1PJ(new AnonymousClass1PH(r7, r8, r9, r10, r11, r12, r13, this), r92, r27, r0, r3);
        this.A00 = new AnonymousClass1PK(r3, jniBridge2);
        r4.A00 = r1;
        this.A0O = r38;
        this.A0C = r24;
    }

    private C60002nE A00(C60002nE r3, String str) {
        C60002nE A022;
        AnonymousClass1MK r1 = this.A0L;
        if (!r1.A0A(r3) || (A022 = r1.A02(r3, str, "sessions")) == null) {
            return r3;
        }
        return A022;
    }

    public static C54492eE A01(byte[] bArr, int i) {
        byte[] A062 = ((AnonymousClass2BH) C23577Bm6.A07(AnonymousClass2BH.DEFAULT_INSTANCE, bArr)).publicKey_.A06();
        int length = A062.length - 1;
        byte[] bArr2 = new byte[length];
        System.arraycopy(A062, 1, bArr2, 0, length);
        byte[] bArr3 = new byte[3];
        bArr3[2] = (byte) i;
        bArr3[1] = (byte) (i >> 8);
        bArr3[0] = (byte) (i >> 16);
        return new C54492eE(bArr3, bArr2, (byte[]) null);
    }

    public static void A03(C199249zg r1) {
        if (r1.A01.A00.aliceBaseKey_.A06().length == 0) {
            throw new IOException("Alice base key missing from session");
        }
    }

    private void A04(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(A0N((C60002nE) it.next()));
        }
        this.A06.A04(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        r13.A00();
        r1 = new java.lang.StringBuilder();
        r1.append("SignalCoordinator/axolotl saved identity completed ");
        r1.append(r5);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r14.close();
        r9 = r15.entrySet().iterator();
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        if (r9.hasNext() == false) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r1 = (java.util.Map.Entry) r9.next();
        r5 = X.C63962tz.A03((X.C60002nE) r1.getKey());
        r0 = (X.C58252kO) r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        if (r5 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010e, code lost:
        if (r16 != null) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0110, code lost:
        if (r0 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        r6.A02.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0118, code lost:
        if (r0 != null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        r3 = r6.A02;
        r2 = r3.A00.A08(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.notifyAllObservers(new X.C20723AWd(r5, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        if (r2 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0135, code lost:
        if (r7.equals(r0) != false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        r6.A02.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013f, code lost:
        if (r2 != null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0145, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014d, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.C58252kO r16, X.C60002nE r17, X.AnonymousClass1P3 r18) {
        /*
            r6 = r18
            r5 = r17
            java.util.List r2 = r6.A0N(r5)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r2)
            X.1Os r0 = r6.A0H
            java.util.HashSet r4 = r0.A09(r1)
            r0.A0A(r4)     // Catch:{ all -> 0x0162 }
            java.util.HashMap r15 = r6.A0L(r1)     // Catch:{ all -> 0x0162 }
            X.1MH r0 = r6.A0I     // Catch:{ all -> 0x0162 }
            X.1au r14 = r0.A06()     // Catch:{ all -> 0x0162 }
            X.1xA r13 = r14.BD0()     // Catch:{ all -> 0x0158 }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x014e }
        L_0x0028:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x014e }
            r7 = r16
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r8 = r12.next()     // Catch:{ all -> 0x014e }
            X.2nE r8 = (X.C60002nE) r8     // Catch:{ all -> 0x014e }
            X.1P0 r2 = r6.A06     // Catch:{ all -> 0x014e }
            if (r16 == 0) goto L_0x00c0
            X.1jP r0 = r7.A00     // Catch:{ all -> 0x014e }
            byte[] r3 = r0.A00()     // Catch:{ all -> 0x014e }
        L_0x0040:
            r0 = 0
            X.C18070vi.A0d(r8, r0)     // Catch:{ all -> 0x014e }
            X.1MK r1 = r2.A05     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "saveIdentity"
            java.lang.String r10 = "identities"
            r1.A07(r8, r10, r0)     // Catch:{ all -> 0x014e }
            X.1MH r0 = r2.A03     // Catch:{ all -> 0x014e }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x014e }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x00c3 }
            r9.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x00c3 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "recipient_type"
            int r0 = r8.A01     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c3 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "device_id"
            int r0 = r8.A00     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c3 }
            r9.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "public_key"
            if (r3 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            r9.putNull(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0081
        L_0x007e:
            r9.put(r0, r3)     // Catch:{ all -> 0x00c3 }
        L_0x0081:
            java.lang.String r11 = "timestamp"
            X.11P r0 = r2.A02     // Catch:{ all -> 0x00c3 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00c3 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00c3 }
            r9.put(r11, r0)     // Catch:{ all -> 0x00c3 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c3 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "SignalIdentityKeyStore/saveIdentity"
            long r1 = r1.A08(r10, r0, r9)     // Catch:{ all -> 0x00c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r3.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "SignalIdentityKeyStore/saved identity for "
            r3.append(r0)     // Catch:{ all -> 0x00c3 }
            r3.append(r8)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = " with resultant row id "
            r3.append(r0)     // Catch:{ all -> 0x00c3 }
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00c3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
            r7.close()     // Catch:{ all -> 0x014e }
            goto L_0x0028
        L_0x00c0:
            r3 = 0
            goto L_0x0040
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x00ca:
            r13.A00()     // Catch:{ all -> 0x014e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014e }
            r1.<init>()     // Catch:{ all -> 0x014e }
            java.lang.String r0 = "SignalCoordinator/axolotl saved identity completed "
            r1.append(r0)     // Catch:{ all -> 0x014e }
            r1.append(r5)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x014e }
            r13.close()     // Catch:{ all -> 0x0158 }
            r14.close()     // Catch:{ all -> 0x0162 }
            java.util.Set r0 = r15.entrySet()     // Catch:{ all -> 0x0162 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0162 }
            r8 = 0
        L_0x00f0:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0162 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0162 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x0162 }
            X.2nE r0 = (X.C60002nE) r0     // Catch:{ all -> 0x0162 }
            com.whatsapp.jid.DeviceJid r5 = X.C63962tz.A03(r0)     // Catch:{ all -> 0x0162 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0162 }
            X.2kO r0 = (X.C58252kO) r0     // Catch:{ all -> 0x0162 }
            if (r5 == 0) goto L_0x00f0
            if (r16 != 0) goto L_0x0118
            if (r0 == 0) goto L_0x00f0
            X.1Ou r0 = r6.A02     // Catch:{ all -> 0x0162 }
            r0.A01(r5)     // Catch:{ all -> 0x0162 }
            goto L_0x013c
        L_0x0118:
            if (r0 != 0) goto L_0x0131
            X.1Ou r3 = r6.A02     // Catch:{ all -> 0x0162 }
            X.1Os r0 = r3.A00     // Catch:{ all -> 0x0162 }
            X.3Ez r2 = r0.A08(r5)     // Catch:{ all -> 0x0162 }
            r1 = 1
            X.AWd r0 = new X.AWd     // Catch:{ all -> 0x013e }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x013e }
            r3.notifyAllObservers(r0)     // Catch:{ all -> 0x013e }
            if (r2 == 0) goto L_0x00f0
            r2.close()     // Catch:{ all -> 0x0162 }
            goto L_0x00f0
        L_0x0131:
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x0162 }
            if (r0 != 0) goto L_0x00f0
            X.1Ou r0 = r6.A02     // Catch:{ all -> 0x0162 }
            r0.A00(r5)     // Catch:{ all -> 0x0162 }
        L_0x013c:
            r8 = 1
            goto L_0x00f0
        L_0x013e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0161
            r2.close()     // Catch:{ all -> 0x0145 }
            goto L_0x0161
        L_0x0145:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0162 }
            goto L_0x0161
        L_0x014a:
            X.C25571Os.A05(r4)
            return r8
        L_0x014e:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0153 }
            goto L_0x0157
        L_0x0153:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0158 }
        L_0x0157:
            throw r1     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x015d }
            goto L_0x0161
        L_0x015d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0162 }
        L_0x0161:
            throw r1     // Catch:{ all -> 0x0162 }
        L_0x0162:
            r0 = move-exception
            X.C25571Os.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A05(X.2kO, X.2nE, X.1P3):boolean");
    }

    public int A06() {
        return this.A06.A02();
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [X.2gC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v3, types: [X.9z2, java.lang.Object] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8 A[Catch:{ 1P8 -> 0x0051, all -> 0x02e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca A[Catch:{ 1P8 -> 0x0051, all -> 0x02e0 }] */
    public int A07(X.C60002nE r28, X.C54492eE r29, X.C54492eE r30, byte[] r31, byte[] r32, byte r33) {
        /*
            r27 = this;
            r8 = r27
            X.1P1 r0 = r8.A0E
            r1 = r28
            X.2nE r5 = r0.A01(r1)
            X.1Os r0 = r8.A0H
            X.3Ez r2 = X.C25571Os.A00(r5, r0)
            X.C25571Os.A03(r2, r0)
            X.9zg r0 = r8.A0F(r5)     // Catch:{ all -> 0x02e0 }
            X.9XJ r0 = r0.A01     // Catch:{ all -> 0x02e0 }
            X.8cI r0 = r0.A00     // Catch:{ all -> 0x02e0 }
            X.DSQ r0 = r0.remoteIdentityPublic_     // Catch:{ all -> 0x02e0 }
            byte[] r6 = r0.A06()     // Catch:{ all -> 0x02e0 }
            int r4 = r6.length     // Catch:{ all -> 0x02e0 }
            r7 = r31
            r13 = r33
            if (r4 == 0) goto L_0x003d
            r3 = 1
            int r4 = r4 - r3
            byte[] r1 = new byte[r4]     // Catch:{ all -> 0x02e0 }
            r0 = 0
            java.lang.System.arraycopy(r6, r3, r1, r0, r4)     // Catch:{ all -> 0x02e0 }
            byte r0 = r6[r0]     // Catch:{ all -> 0x02e0 }
            if (r0 != r13) goto L_0x003a
            boolean r0 = java.util.Arrays.equals(r7, r1)     // Catch:{ all -> 0x02e0 }
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r8.A0G(r5)     // Catch:{ all -> 0x02e0 }
        L_0x003d:
            X.1PJ r6 = r8.A01     // Catch:{ all -> 0x02e0 }
            r8 = 0
            int r4 = r7.length     // Catch:{ 1P8 -> 0x0051 }
            r3 = 1
            int r0 = r4 + 1
            byte[] r1 = new byte[r0]     // Catch:{ 1P8 -> 0x0051 }
            r0 = 0
            r1[r0] = r33     // Catch:{ 1P8 -> 0x0051 }
            java.lang.System.arraycopy(r7, r0, r1, r3, r4)     // Catch:{ 1P8 -> 0x0051 }
            X.AiX r1 = X.C20065A5o.A01(r1)     // Catch:{ 1P8 -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e0 }
            r1.<init>()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "SignalCoordinatorDefault/process invalid identity key returned from server during prekey fetch; address="
            r1.append(r0)     // Catch:{ all -> 0x02e0 }
            r1.append(r5)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x02e0 }
            r1 = r8
        L_0x0067:
            r9 = r29
            if (r29 == 0) goto L_0x0093
            byte[] r10 = r9.A00     // Catch:{ all -> 0x02e0 }
            int r7 = r10.length     // Catch:{ 1P8 -> 0x007e }
            r4 = 1
            int r0 = r7 + 1
            byte[] r3 = new byte[r0]     // Catch:{ 1P8 -> 0x007e }
            r0 = 0
            r3[r0] = r33     // Catch:{ 1P8 -> 0x007e }
            java.lang.System.arraycopy(r10, r0, r3, r4, r7)     // Catch:{ 1P8 -> 0x007e }
            X.AiX r10 = X.C20065A5o.A01(r3)     // Catch:{ 1P8 -> 0x007e }
            goto L_0x0094
        L_0x007e:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e0 }
            r3.<init>()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "SignalCoordinatorDefault/process invalid prekey returned from server during prekey fetch; address="
            r3.append(r0)     // Catch:{ all -> 0x02e0 }
            r3.append(r5)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x02e0 }
        L_0x0093:
            r10 = r8
        L_0x0094:
            r3 = r30
            byte[] r12 = r3.A00     // Catch:{ 1P8 -> 0x00a9 }
            int r11 = r12.length     // Catch:{ 1P8 -> 0x00a9 }
            r7 = 1
            int r0 = r11 + 1
            byte[] r4 = new byte[r0]     // Catch:{ 1P8 -> 0x00a9 }
            r0 = 0
            r4[r0] = r33     // Catch:{ 1P8 -> 0x00a9 }
            java.lang.System.arraycopy(r12, r0, r4, r7, r11)     // Catch:{ 1P8 -> 0x00a9 }
            X.AiX r8 = X.C20065A5o.A01(r4)     // Catch:{ 1P8 -> 0x00a9 }
            goto L_0x00be
        L_0x00a9:
            r7 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e0 }
            r4.<init>()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "SignalCoordinatorDefault/process invalid signed prekey returned from server during prekey fetch; address="
            r4.append(r0)     // Catch:{ all -> 0x02e0 }
            r4.append(r5)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.e(r0, r7)     // Catch:{ all -> 0x02e0 }
        L_0x00be:
            r0 = 0
            r4 = r32
            int r18 = X.A8G.A01(r4, r0)     // Catch:{ all -> 0x02e0 }
            r4 = 0
            if (r29 != 0) goto L_0x00ca
            r12 = -1
            goto L_0x00d0
        L_0x00ca:
            byte[] r0 = r9.A01     // Catch:{ all -> 0x02e0 }
            int r12 = X.A8G.A00(r0)     // Catch:{ all -> 0x02e0 }
        L_0x00d0:
            byte[] r0 = r3.A01     // Catch:{ all -> 0x02e0 }
            int r17 = X.A8G.A00(r0)     // Catch:{ all -> 0x02e0 }
            byte[] r9 = r3.A02     // Catch:{ all -> 0x02e0 }
            X.2r0 r3 = new X.2r0     // Catch:{ all -> 0x02e0 }
            r3.<init>((X.C21344AiX) r1)     // Catch:{ all -> 0x02e0 }
            X.1PH r1 = r6.A00     // Catch:{ all -> 0x02e0 }
            X.1PI r0 = r1.A05     // Catch:{ all -> 0x02e0 }
            X.2mN r22 = X.C62812s2.A01(r5)     // Catch:{ all -> 0x02e0 }
            X.9g0 r7 = new X.9g0     // Catch:{ all -> 0x02e0 }
            r23 = r1
            r24 = r1
            r19 = r7
            r20 = r1
            r21 = r0
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02e0 }
            java.lang.Object r16 = X.A7H.A04     // Catch:{ 1P8 -> 0x02d5, 1PB -> 0x02d8, Exception -> 0x02cc }
            monitor-enter(r16)     // Catch:{ 1P8 -> 0x02d5, 1PB -> 0x02d8, Exception -> 0x02cc }
            X.1PG r0 = r7.A03     // Catch:{ all -> 0x02c9 }
            r26 = r0
            X.2mN r5 = r7.A02     // Catch:{ all -> 0x02c9 }
            r0.Bgm(r3, r5)     // Catch:{ all -> 0x02c9 }
            if (r8 == 0) goto L_0x02bb
            X.AiX r0 = r3.A00     // Catch:{ all -> 0x02c9 }
            byte[] r6 = r8.A00()     // Catch:{ all -> 0x02c9 }
            X.A0c r1 = X.C19945A0c.A00()     // Catch:{ all -> 0x02c9 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x02c9 }
            boolean r0 = r1.A01(r0, r6, r9)     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x02b3
            X.1PF r7 = r7.A04     // Catch:{ all -> 0x02c9 }
            X.A0z r6 = r7.Bhr(r5)     // Catch:{ all -> 0x02c9 }
            X.9cI r11 = X.C20065A5o.A02()     // Catch:{ all -> 0x02c9 }
            if (r10 != 0) goto L_0x0173
            X.3K4 r9 = X.AnonymousClass3K4.A00     // Catch:{ all -> 0x02c9 }
        L_0x0122:
            boolean r0 = r9 instanceof X.AnonymousClass3K3     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x0170
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x02c3
            X.3K3 r1 = new X.3K3     // Catch:{ all -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02c9 }
        L_0x0131:
            X.2gC r13 = new X.2gC     // Catch:{ all -> 0x02c9 }
            r13.<init>()     // Catch:{ all -> 0x02c9 }
            r13.A04 = r11     // Catch:{ all -> 0x02c9 }
            X.2dT r0 = r26.BSl()     // Catch:{ all -> 0x02c9 }
            r13.A01 = r0     // Catch:{ all -> 0x02c9 }
            r13.A00 = r3     // Catch:{ all -> 0x02c9 }
            r13.A03 = r8     // Catch:{ all -> 0x02c9 }
            r13.A02 = r8     // Catch:{ all -> 0x02c9 }
            r13.A05 = r9     // Catch:{ all -> 0x02c9 }
            boolean r0 = r6.A02     // Catch:{ all -> 0x02c9 }
            if (r0 != 0) goto L_0x014d
            r6.A00()     // Catch:{ all -> 0x02c9 }
        L_0x014d:
            X.A6i r10 = r6.A01     // Catch:{ all -> 0x02c9 }
            X.2dT r0 = r13.A01     // Catch:{ all -> 0x02c9 }
            r15 = r0
            X.9cI r14 = r13.A04     // Catch:{ all -> 0x02c9 }
            X.2r0 r12 = r13.A00     // Catch:{ all -> 0x02c9 }
            X.AiX r9 = r13.A03     // Catch:{ all -> 0x02c9 }
            X.AiX r8 = r13.A02     // Catch:{ all -> 0x02c9 }
            X.3BW r0 = r13.A05     // Catch:{ all -> 0x02c9 }
            X.2gD r13 = new X.2gD     // Catch:{ all -> 0x02c9 }
            r19 = r13
            r20 = r12
            r21 = r15
            r22 = r9
            r23 = r8
            r24 = r14
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x02c9 }
            goto L_0x0179
        L_0x0170:
            X.3K4 r1 = X.AnonymousClass3K4.A00     // Catch:{ all -> 0x02c9 }
            goto L_0x0131
        L_0x0173:
            X.3K3 r9 = new X.3K3     // Catch:{ all -> 0x02c9 }
            r9.<init>(r10)     // Catch:{ all -> 0x02c9 }
            goto L_0x0122
        L_0x0179:
            r10.A06()     // Catch:{ IOException -> 0x02ac }
            X.2r0 r14 = r13.A00     // Catch:{ IOException -> 0x02ac }
            r10.A0A(r14)     // Catch:{ IOException -> 0x02ac }
            X.2dT r15 = r13.A01     // Catch:{ IOException -> 0x02ac }
            X.2r0 r0 = r15.A00     // Catch:{ IOException -> 0x02ac }
            r10.A09(r0)     // Catch:{ IOException -> 0x02ac }
            X.9cI r12 = X.C20065A5o.A02()     // Catch:{ IOException -> 0x02ac }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x02ac }
            r8.<init>()     // Catch:{ IOException -> 0x02ac }
            r0 = 32
            byte[] r9 = new byte[r0]     // Catch:{ IOException -> 0x02ac }
            r0 = -1
            java.util.Arrays.fill(r9, r0)     // Catch:{ IOException -> 0x02ac }
            r8.write(r9)     // Catch:{ IOException -> 0x02ac }
            X.AiX r9 = r13.A03     // Catch:{ IOException -> 0x02ac }
            X.9ZN r0 = r15.A01     // Catch:{ IOException -> 0x02ac }
            byte[] r0 = X.C20065A5o.A03(r0, r9)     // Catch:{ IOException -> 0x02ac }
            r8.write(r0)     // Catch:{ IOException -> 0x02ac }
            X.AiX r15 = r14.A00     // Catch:{ IOException -> 0x02ac }
            X.9cI r0 = r13.A04     // Catch:{ IOException -> 0x02ac }
            X.9ZN r14 = r0.A00     // Catch:{ IOException -> 0x02ac }
            byte[] r0 = X.C20065A5o.A03(r14, r15)     // Catch:{ IOException -> 0x02ac }
            r8.write(r0)     // Catch:{ IOException -> 0x02ac }
            byte[] r0 = X.C20065A5o.A03(r14, r9)     // Catch:{ IOException -> 0x02ac }
            r8.write(r0)     // Catch:{ IOException -> 0x02ac }
            X.3BW r9 = r13.A05     // Catch:{ IOException -> 0x02ac }
            boolean r0 = r9 instanceof X.AnonymousClass3K3     // Catch:{ IOException -> 0x02ac }
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r9.A00()     // Catch:{ IOException -> 0x02ac }
            X.AiX r0 = (X.C21344AiX) r0     // Catch:{ IOException -> 0x02ac }
            byte[] r0 = X.C20065A5o.A03(r14, r0)     // Catch:{ IOException -> 0x02ac }
            r8.write(r0)     // Catch:{ IOException -> 0x02ac }
        L_0x01ce:
            byte[] r9 = r8.toByteArray()     // Catch:{ IOException -> 0x02ac }
            X.B4D r14 = new X.B4D     // Catch:{ IOException -> 0x02ac }
            r14.<init>()     // Catch:{ IOException -> 0x02ac }
            java.lang.String r0 = "WhisperText"
            byte[] r8 = r0.getBytes()     // Catch:{ IOException -> 0x02ac }
            r0 = 64
            byte[] r8 = r14.A02(r9, r8, r0)     // Catch:{ IOException -> 0x02ac }
            r0 = 32
            byte[][] r9 = X.C20011A3b.A01(r8, r0, r0)     // Catch:{ IOException -> 0x02ac }
            r0 = r9[r4]     // Catch:{ IOException -> 0x02ac }
            X.9kq r8 = new X.9kq     // Catch:{ IOException -> 0x02ac }
            r8.<init>(r14, r0)     // Catch:{ IOException -> 0x02ac }
            r0 = 1
            r0 = r9[r0]     // Catch:{ IOException -> 0x02ac }
            X.A4X r9 = new X.A4X     // Catch:{ IOException -> 0x02ac }
            r9.<init>(r14, r0, r4)     // Catch:{ IOException -> 0x02ac }
            X.AiX r0 = r13.A02     // Catch:{ IOException -> 0x02ac }
            X.2kk r8 = r8.A00(r0, r12)     // Catch:{ IOException -> 0x02ac }
            r10.A0B(r0, r9)     // Catch:{ IOException -> 0x02ac }
            java.lang.Object r0 = r8.A01     // Catch:{ IOException -> 0x02ac }
            X.A4X r0 = (X.A4X) r0     // Catch:{ IOException -> 0x02ac }
            r10.A0C(r12, r0)     // Catch:{ IOException -> 0x02ac }
            java.lang.Object r0 = r8.A00     // Catch:{ IOException -> 0x02ac }
            X.9kq r0 = (X.C190379kq) r0     // Catch:{ IOException -> 0x02ac }
            r10.A0D(r0)     // Catch:{ IOException -> 0x02ac }
            X.A6i r10 = r6.A01     // Catch:{ all -> 0x02c9 }
            X.AiX r8 = r11.A01     // Catch:{ all -> 0x02c9 }
            X.8ad r0 = X.C165128ad.DEFAULT_INSTANCE     // Catch:{ all -> 0x02c9 }
            X.Bmt r11 = r0.A0N()     // Catch:{ all -> 0x02c9 }
            X.8Wb r11 = (X.C163718Wb) r11     // Catch:{ all -> 0x02c9 }
            r11.A0E()     // Catch:{ all -> 0x02c9 }
            X.Bm6 r9 = r11.A00     // Catch:{ all -> 0x02c9 }
            X.8ad r9 = (X.C165128ad) r9     // Catch:{ all -> 0x02c9 }
            int r0 = r9.bitField0_     // Catch:{ all -> 0x02c9 }
            r0 = r0 | 2
            r9.bitField0_ = r0     // Catch:{ all -> 0x02c9 }
            r0 = r17
            r9.signedPreKeyId_ = r0     // Catch:{ all -> 0x02c9 }
            byte[] r9 = r8.A00()     // Catch:{ all -> 0x02c9 }
            int r0 = r9.length     // Catch:{ all -> 0x02c9 }
            X.BmB r12 = X.DSQ.A01(r9, r4, r0)     // Catch:{ all -> 0x02c9 }
            r11.A0E()     // Catch:{ all -> 0x02c9 }
            X.Bm6 r9 = r11.A00     // Catch:{ all -> 0x02c9 }
            X.8ad r9 = (X.C165128ad) r9     // Catch:{ all -> 0x02c9 }
            int r0 = r9.bitField0_     // Catch:{ all -> 0x02c9 }
            r0 = r0 | 4
            r9.bitField0_ = r0     // Catch:{ all -> 0x02c9 }
            r9.baseKey_ = r12     // Catch:{ all -> 0x02c9 }
            boolean r0 = r1 instanceof X.AnonymousClass3K3     // Catch:{ all -> 0x02c9 }
            if (r0 == 0) goto L_0x0261
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x02c9 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x02c9 }
            int r9 = r0.intValue()     // Catch:{ all -> 0x02c9 }
            r11.A0E()     // Catch:{ all -> 0x02c9 }
            X.Bm6 r1 = r11.A00     // Catch:{ all -> 0x02c9 }
            X.8ad r1 = (X.C165128ad) r1     // Catch:{ all -> 0x02c9 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x02c9 }
            r0 = r0 | 1
            r1.bitField0_ = r0     // Catch:{ all -> 0x02c9 }
            r1.preKeyId_ = r9     // Catch:{ all -> 0x02c9 }
        L_0x0261:
            X.8cI r0 = r10.A00     // Catch:{ all -> 0x02c9 }
            X.Bmt r9 = r0.A0O()     // Catch:{ all -> 0x02c9 }
            X.8Wn r9 = (X.C163838Wn) r9     // Catch:{ all -> 0x02c9 }
            X.Bm6 r0 = r11.A0C()     // Catch:{ all -> 0x02c9 }
            X.8ad r0 = (X.C165128ad) r0     // Catch:{ all -> 0x02c9 }
            r9.A0E()     // Catch:{ all -> 0x02c9 }
            X.Bm6 r1 = r9.A00     // Catch:{ all -> 0x02c9 }
            X.8cI r1 = (X.C166068cI) r1     // Catch:{ all -> 0x02c9 }
            r0.getClass()     // Catch:{ all -> 0x02c9 }
            r1.pendingPreKey_ = r0     // Catch:{ all -> 0x02c9 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x02c9 }
            r0 = r0 | 64
            r1.bitField0_ = r0     // Catch:{ all -> 0x02c9 }
            X.Bm6 r0 = r9.A0C()     // Catch:{ all -> 0x02c9 }
            X.8cI r0 = (X.C166068cI) r0     // Catch:{ all -> 0x02c9 }
            r10.A00 = r0     // Catch:{ all -> 0x02c9 }
            X.A6i r1 = r6.A01     // Catch:{ all -> 0x02c9 }
            int r0 = r26.BU5()     // Catch:{ all -> 0x02c9 }
            r1.A07(r0)     // Catch:{ all -> 0x02c9 }
            X.A6i r1 = r6.A01     // Catch:{ all -> 0x02c9 }
            r0 = r18
            r1.A08(r0)     // Catch:{ all -> 0x02c9 }
            X.A6i r1 = r6.A01     // Catch:{ all -> 0x02c9 }
            byte[] r0 = r8.A00()     // Catch:{ all -> 0x02c9 }
            r1.A0E(r0)     // Catch:{ all -> 0x02c9 }
            r7.COh(r5, r6)     // Catch:{ all -> 0x02c9 }
            r0 = r26
            r0.CGj(r3, r5)     // Catch:{ all -> 0x02c9 }
            monitor-exit(r16)     // Catch:{ all -> 0x02c9 }
            goto L_0x02da
        L_0x02ac:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02c9 }
            goto L_0x02c8
        L_0x02b3:
            java.lang.String r0 = "Invalid signature on device key!"
            X.1P8 r1 = new X.1P8     // Catch:{ all -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02c9 }
            goto L_0x02c8
        L_0x02bb:
            java.lang.String r0 = "No signed prekey!"
            X.1P8 r1 = new X.1P8     // Catch:{ all -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ all -> 0x02c9 }
            goto L_0x02c8
        L_0x02c3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x02c9 }
            r1.<init>()     // Catch:{ all -> 0x02c9 }
        L_0x02c8:
            throw r1     // Catch:{ all -> 0x02c9 }
        L_0x02c9:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x02c9 }
            throw r0     // Catch:{ 1P8 -> 0x02d5, 1PB -> 0x02d8, Exception -> 0x02cc }
        L_0x02cc:
            r1 = move-exception
            java.lang.String r0 = "SignalCoordinatorDefault/process"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x02e0 }
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            goto L_0x02da
        L_0x02d5:
            r4 = -1002(0xfffffffffffffc16, float:NaN)
            goto L_0x02da
        L_0x02d8:
            r4 = -1010(0xfffffffffffffc0e, float:NaN)
        L_0x02da:
            if (r2 == 0) goto L_0x02df
            r2.close()
        L_0x02df:
            return r4
        L_0x02e0:
            r1 = move-exception
            if (r2 == 0) goto L_0x02eb
            r2.close()     // Catch:{ all -> 0x02e7 }
            throw r1
        L_0x02e7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x02eb:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A07(X.2nE, X.2eE, X.2eE, byte[], byte[], byte):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.3EL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.3EL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.3EL} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A4S A08(X.C72123Ks r12, X.C60002nE r13, byte[] r14) {
        /*
            r11 = this;
            X.1Os r0 = r11.A0H
            X.3Ez r2 = X.C25571Os.A00(r13, r0)
            X.C25571Os.A03(r2, r0)
            X.1PJ r0 = r11.A01     // Catch:{ all -> 0x0082 }
            X.1PH r6 = r0.A00     // Catch:{ all -> 0x0082 }
            X.1PI r7 = r6.A05     // Catch:{ all -> 0x0082 }
            X.2mN r8 = X.C62812s2.A01(r13)     // Catch:{ all -> 0x0082 }
            X.A7H r5 = new X.A7H     // Catch:{ all -> 0x0082 }
            r10 = r6
            r9 = r6
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0082 }
            r3 = 0
            if (r12 == 0) goto L_0x0023
            X.3EL r1 = new X.3EL     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            r1.<init>(r12)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            goto L_0x0028
        L_0x0023:
            X.3EK r1 = new X.3EK     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            r1.<init>()     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
        L_0x0028:
            X.1Ot r0 = r0.A03     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            boolean r0 = r0.A03()     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            if (r0 == 0) goto L_0x0041
            X.AmP r0 = new X.AmP     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            r0.<init>(r14)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            java.lang.Object r4 = X.A7H.A04     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            monitor-enter(r4)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            byte[] r1 = r5.A05(r1, r0)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            goto L_0x004a
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
        L_0x0041:
            X.AmP r0 = new X.AmP     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            r0.<init>(r14)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            byte[] r1 = r5.A05(r1, r0)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
        L_0x004a:
            r0 = 0
            X.A4S r0 = X.A4S.A00(r3, r1, r0)     // Catch:{ 1P5 -> 0x0075, 1P6 -> 0x006d, 1P4 -> 0x0065, 1P7 -> 0x005d, Exception -> 0x0050 }
            goto L_0x007c
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "SignalCoordinatorDefault/decryptForIndividual"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0082 }
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007c
        L_0x005d:
            r1 = move-exception
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007c
        L_0x0065:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007c
        L_0x006d:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r3, r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007c
        L_0x0075:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r3, r0)     // Catch:{ all -> 0x0082 }
        L_0x007c:
            if (r2 == 0) goto L_0x0081
            r2.close()
        L_0x0081:
            return r0
        L_0x0082:
            r1 = move-exception
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ all -> 0x0089 }
            throw r1
        L_0x0089:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x008d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A08(X.3Ks, X.2nE, byte[]):X.A4S");
    }

    public A4S A09(C72123Ks r6, C60002nE r7, byte[] bArr) {
        A4S a4s;
        C25571Os r0 = this.A0H;
        C71363Ez A002 = C25571Os.A00(r7, r0);
        C25571Os.A03(A002, r0);
        try {
            C21573AmN amN = new C21573AmN(bArr);
            byte[] A062 = A0F(r7).A01.A00.remoteIdentityPublic_.A06();
            if (A062.length != 0 && !Arrays.equals(A062, amN.A03.A00.A00())) {
                A0G(r7);
            }
            a4s = AnonymousClass1PJ.A00(r6, r7, this.A01, amN, false);
        } catch (AnonymousClass1P5 e) {
            Log.w("SignalCoordinator/decryptForIndividualPreKey", e);
            A4S a4s2 = new A4S(e.getMessage(), -1005);
            if (A002 != null) {
                A002.close();
            }
            return a4s2;
        } catch (AnonymousClass1PA e2) {
            Log.w("SignalCoordinator/decryptForIndividualPreKey", e2);
            a4s = new A4S((byte[]) null, -1006);
        } catch (Throwable th) {
            if (A002 != null) {
                try {
                    A002.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
        if (A002 != null) {
            A002.close();
        }
        return a4s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r1 = r3.senderSigningKey_;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r1 = X.C164628Zo.DEFAULT_INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r0.A00(X.C20065A5o.A01(r1.public_.A06()));
        r5 = r0.A00;
        r4 = new X.A7F((java.util.List) r6.A00.senderChainKeys_);
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r3 > r5) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r3 >= r5) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r4 = r4.A02(r5 - r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r6.A01(r4.A02(1));
        r5 = r4.A03();
        r3 = new X.C187059fC(r4.A00, X.A7F.A01(r5[r5.length - 1], (byte) 1));
        r1 = r3.A02;
        r6 = r3.A01;
        r5 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4 = new javax.crypto.spec.IvParameterSpec(r1);
        r3 = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        r3.init(2, new javax.crypto.spec.SecretKeySpec(r6, "AES"), r4);
        r1 = r3.doFinal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9.BcN(r1);
        r8.A03(r7, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Received message with old counter: ");
        r1.append(r3);
        r1.append(" , ");
        r1.append(r5);
        r1 = new X.AnonymousClass1P6(r1.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A4S A0A(X.C72123Ks r14, X.C59982nC r15, byte[] r16) {
        /*
            r13 = this;
            X.1Os r0 = r13.A0H
            X.3Ez r12 = X.C25571Os.A01(r0, r15)
            r12.lock()
            X.1PJ r0 = r13.A01     // Catch:{ all -> 0x014f }
            X.1PH r0 = r0.A00     // Catch:{ all -> 0x014f }
            X.1P2 r8 = r0.A01     // Catch:{ all -> 0x014f }
            X.2kj r7 = X.C62812s2.A02(r15)     // Catch:{ all -> 0x014f }
            r2 = 0
            X.3EL r9 = new X.3EL     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
            r9.<init>(r14)     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
            java.lang.Object r11 = X.C182219Tn.A00     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
            monitor-enter(r11)     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
            X.2qU r10 = r8.A01(r7)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.util.LinkedList r1 = r10.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            boolean r0 = r1.isEmpty()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            if (r0 != 0) goto L_0x00f7
            X.AmO r0 = new X.AmO     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r3 = r16
            r0.<init>(r3)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r5 = r0.A01     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
        L_0x0035:
            boolean r1 = r4.hasNext()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r6 = r4.next()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.9zI r6 = (X.C199019zI) r6     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.8ac r3 = r6.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r1 = r3.senderKeyId_     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            if (r1 != r5) goto L_0x0035
            X.8Zo r1 = r3.senderSigningKey_     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            if (r1 != 0) goto L_0x004d
            X.8Zo r1 = X.C164628Zo.DEFAULT_INSTANCE     // Catch:{ 1P8 | 1P9 -> 0x0115 }
        L_0x004d:
            X.DSQ r1 = r1.public_     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[] r1 = r1.A06()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.AiX r1 = X.C20065A5o.A01(r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r0.A00(r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r5 = r0.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.8ac r1 = r6.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.EE9 r1 = r1.senderChainKeys_     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.A7F r4 = new X.A7F     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r4.<init>((java.util.List) r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r3 = r4.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            if (r3 > r5) goto L_0x00c1
            if (r3 >= r5) goto L_0x0070
            int r5 = r5 - r3
            X.A7F r4 = r4.A02(r5)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
        L_0x0070:
            r1 = 1
            X.A7F r1 = r4.A02(r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r6.A01(r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[][] r5 = r4.A03()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r4 = r4.A00     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            int r1 = r5.length     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r3 = 1
            int r1 = r1 - r3
            r1 = r5[r1]     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[] r1 = X.A7F.A01(r1, r3)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.9fC r3 = new X.9fC     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r3.<init>(r4, r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[] r1 = r3.A02     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[] r6 = r3.A01     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            byte[] r5 = r0.A02     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            r4.<init>(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            r1.<init>(r6, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            r0 = 2
            r3.init(r0, r1, r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            byte[] r1 = r3.doFinal(r5)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010e, BadPaddingException | IllegalBlockSizeException -> 0x00ba, 1P8 | 1P9 -> 0x0115 }
            r9.BcN(r1)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r8.A03(r7, r10)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            monitor-exit(r11)     // Catch:{ all -> 0x011c }
            r0 = 0
            X.A4S r0 = X.A4S.A00(r2, r1, r0)     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
            goto L_0x014b
        L_0x00ba:
            r0 = move-exception
            X.1P5 r1 = new X.1P5     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            goto L_0x0114
        L_0x00c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = "Received message with old counter: "
            r1.append(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.append(r3)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = " , "
            r1.append(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.append(r5)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.1P6 r1 = new X.1P6     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            goto L_0x0114
        L_0x00e0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = "No keys for: "
            r1.append(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.append(r5)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.1P9 r1 = new X.1P9     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            goto L_0x0114
        L_0x00f7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = "No sender key for: "
            r1.append(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.append(r7)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            X.1P7 r1 = new X.1P7     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            goto L_0x0114
        L_0x010e:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ 1P8 | 1P9 -> 0x0115 }
            r1.<init>(r0)     // Catch:{ 1P8 | 1P9 -> 0x0115 }
        L_0x0114:
            throw r1     // Catch:{ 1P8 | 1P9 -> 0x0115 }
        L_0x0115:
            r1 = move-exception
            X.1P5 r0 = new X.1P5     // Catch:{ all -> 0x011c }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ 1P4 -> 0x0144, 1P5 -> 0x013c, 1P6 -> 0x0134, 1P7 -> 0x012c, Exception -> 0x011f }
        L_0x011f:
            r1 = move-exception
            java.lang.String r0 = "SignalCoordinatorDefault/decryptForGroupUsingFastRatchet"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x014f }
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014b
        L_0x012c:
            r1 = move-exception
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014b
        L_0x0134:
            r1 = move-exception
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014b
        L_0x013c:
            r1 = move-exception
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)     // Catch:{ all -> 0x014f }
            goto L_0x014b
        L_0x0144:
            r1 = move-exception
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            X.A4S r0 = X.A4S.A00(r1, r2, r0)     // Catch:{ all -> 0x014f }
        L_0x014b:
            r12.close()
            return r0
        L_0x014f:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0154 }
            throw r1
        L_0x0154:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0A(X.3Ks, X.2nC, byte[]):X.A4S");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C198079xk A0B(X.C60002nE r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            X.1Os r0 = r1.A0H
            r5 = r17
            X.3Ez r3 = X.C25571Os.A00(r5, r0)
            X.C25571Os.A03(r3, r0)
            X.0ve r0 = r1.A0K     // Catch:{ all -> 0x00f6 }
            X.C20069A5t.A01(r0)     // Catch:{ all -> 0x00f6 }
            X.1PJ r7 = r1.A01     // Catch:{ all -> 0x00f6 }
            X.1PH r11 = r7.A00     // Catch:{ all -> 0x00f6 }
            X.1PI r12 = r11.A05     // Catch:{ all -> 0x00f6 }
            X.2mN r13 = X.C62812s2.A01(r5)     // Catch:{ all -> 0x00f6 }
            X.A7H r10 = new X.A7H     // Catch:{ all -> 0x00f6 }
            r15 = r11
            r14 = r11
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00f6 }
            byte[] r2 = X.C60782ob.A00(r18)     // Catch:{ all -> 0x00f6 }
            r4 = 0
            X.1Ot r0 = r7.A03     // Catch:{ IllegalArgumentException -> 0x00c8 }
            boolean r0 = r0.A03()     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = X.A7H.A04     // Catch:{ IllegalArgumentException -> 0x00c8 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            X.3Ln r6 = r10.A03(r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0040
        L_0x0039:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x00b4
        L_0x003c:
            X.3Ln r6 = r10.A03(r2)     // Catch:{ IllegalArgumentException -> 0x00c8 }
        L_0x0040:
            X.0ve r2 = r7.A04     // Catch:{ IllegalArgumentException -> 0x00c8 }
            r1 = 3391(0xd3f, float:4.752E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IllegalArgumentException -> 0x00c8 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r0 == 0) goto L_0x00b5
            X.1Oz r10 = r7.A02     // Catch:{ IllegalArgumentException -> 0x00c8 }
            boolean r1 = r6 instanceof X.C21573AmN     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r1 == 0) goto L_0x005a
            r0 = r6
            X.AmN r0 = (X.C21573AmN) r0     // Catch:{ IllegalArgumentException -> 0x00c8 }
            X.AmP r0 = r0.A05     // Catch:{ IllegalArgumentException -> 0x00c8 }
        L_0x0057:
            int r8 = r0.A00     // Catch:{ IllegalArgumentException -> 0x00c8 }
            goto L_0x0062
        L_0x005a:
            boolean r0 = r6 instanceof X.C21575AmP     // Catch:{ IllegalArgumentException -> 0x00c8 }
            if (r0 == 0) goto L_0x0065
            r0 = r6
            X.AmP r0 = (X.C21575AmP) r0     // Catch:{ IllegalArgumentException -> 0x00c8 }
            goto L_0x0057
        L_0x0062:
            if (r1 == 0) goto L_0x0066
            goto L_0x0069
        L_0x0065:
            r8 = 0
        L_0x0066:
            java.lang.String r7 = "msg"
            goto L_0x006b
        L_0x0069:
            java.lang.String r7 = "pkmsg"
        L_0x006b:
            android.util.LruCache r2 = r10.A00     // Catch:{ IllegalArgumentException -> 0x00c8 }
            monitor-enter(r2)     // Catch:{ IllegalArgumentException -> 0x00c8 }
            java.lang.Object r9 = r2.get(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x00b2 }
            if (r9 == 0) goto L_0x00a9
            if (r8 <= 0) goto L_0x00a9
            int r0 = r9.intValue()     // Catch:{ all -> 0x00b2 }
            if (r8 > r0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "Invalid counter for "
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            r1.append(r5)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "; current = "
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            r1.append(r9)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = " new = "
            r1.append(r0)     // Catch:{ all -> 0x00b2 }
            r1.append(r8)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b2 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00b2 }
            X.190 r1 = r10.A01     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "invalid-signal-counter-used"
            r1.A0G(r0, r7, r4)     // Catch:{ all -> 0x00b2 }
        L_0x00a9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00b2 }
            r2.put(r5, r0)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b2 }
        L_0x00b4:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c8 }
        L_0x00b5:
            int r2 = r6.getType()     // Catch:{ all -> 0x00f6 }
            r0 = 2
            r1 = 1
            if (r2 == r0) goto L_0x00be
            r1 = 2
        L_0x00be:
            byte[] r0 = r6.CHg()     // Catch:{ all -> 0x00f6 }
            X.9xk r2 = new X.9xk     // Catch:{ all -> 0x00f6 }
            r2.<init>(r0, r1, r4)     // Catch:{ all -> 0x00f6 }
            goto L_0x00ef
        L_0x00c8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            r1.<init>()     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "SignalCoordinatorDefault/encryptForIndividual/error encrypting for "
            r1.append(r0)     // Catch:{ all -> 0x00f6 }
            r1.append(r5)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f6 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00f6 }
            X.2mN r0 = X.C62812s2.A01(r5)     // Catch:{ all -> 0x00f6 }
            boolean r0 = r11.BFm(r0)     // Catch:{ all -> 0x00f6 }
            if (r0 != 0) goto L_0x00f5
            r1 = 0
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            X.9xk r2 = new X.9xk     // Catch:{ all -> 0x00f6 }
            r2.<init>(r1, r4, r0)     // Catch:{ all -> 0x00f6 }
        L_0x00ef:
            if (r3 == 0) goto L_0x00f4
            r3.close()
        L_0x00f4:
            return r2
        L_0x00f5:
            throw r2     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r1 = move-exception
            if (r3 == 0) goto L_0x0101
            r3.close()     // Catch:{ all -> 0x00fd }
            throw r1
        L_0x00fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x0101:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0B(X.2nE, byte[]):X.9xk");
    }

    public C198079xk A0C(C59982nC r15, byte[] bArr) {
        C198079xk r2;
        byte[] bArr2;
        C71363Ez A012 = C25571Os.A01(this.A0H, r15);
        A012.lock();
        try {
            C20069A5t.A01(this.A0K);
            AnonymousClass1P2 r6 = this.A01.A00.A01;
            new C189809jt(r6).A00(C62812s2.A02(r15));
            C58462kj A022 = C62812s2.A02(r15);
            byte[] A002 = C60782ob.A00(bArr);
            try {
                synchronized (C182219Tn.A00) {
                    try {
                        C61912qU A013 = r6.A01(A022);
                        C199019zI A003 = A013.A00();
                        A7F a7f = new A7F((List) A003.A00.senderChainKeys_);
                        byte[][] A032 = a7f.A03();
                        C187059fC r11 = new C187059fC(a7f.A00, A7F.A01(A032[A032.length - 1], (byte) 1));
                        byte[] bArr3 = r11.A02;
                        byte[] bArr4 = r11.A01;
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        instance.init(1, new SecretKeySpec(bArr4, "AES"), ivParameterSpec);
                        byte[] doFinal = instance.doFinal(A002);
                        C165118ac r0 = A003.A00;
                        int i = r0.senderKeyId_;
                        int i2 = r11.A00;
                        C164628Zo r02 = r0.senderSigningKey_;
                        if (r02 == null) {
                            r02 = C164628Zo.DEFAULT_INSTANCE;
                        }
                        C21574AmO amO = new C21574AmO(new AnonymousClass9ZN(r02.private_.A06()), doFinal, i, i2);
                        A003.A01(new A7F((List) A003.A00.senderChainKeys_).A02(1));
                        r6.A03(A022, A013);
                        bArr2 = amO.A03;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                        throw new AssertionError(e);
                    } catch (AnonymousClass1P9 e2) {
                        throw new AnonymousClass1P7((Exception) e2);
                    }
                }
                r2 = new C198079xk(bArr2, 4, 0);
            } catch (AnonymousClass1P7 unused) {
                r2 = new C198079xk((byte[]) null, 0, -1008);
            }
            return r2;
        } finally {
            try {
                A012.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public C51942a6 A0E(C59982nC r5) {
        C21572AmM amM;
        C71363Ez A012 = C25571Os.A01(this.A0H, r5);
        A012.lock();
        try {
            AnonymousClass1PJ r2 = this.A01;
            boolean A032 = r2.A03.A03();
            C25631Oy r22 = r2.A00.A04;
            C58462kj A022 = C62812s2.A02(r5);
            if (A032) {
                synchronized (C20024A3q.A00) {
                    amM = C181959Sm.A00(r22, A022);
                }
            } else {
                amM = C181959Sm.A00(r22, A022);
            }
            C51942a6 r0 = new C51942a6(amM.A04);
            A012.close();
            return r0;
        } catch (Throwable th) {
            try {
                A012.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
        return A0G(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C199249zg A0F(X.C60002nE r7) {
        /*
            r6 = this;
            java.lang.String r0 = "loadSession"
            X.2nE r5 = r6.A00(r7, r0)
            X.00H r4 = r6.A0P
            java.lang.Object r3 = r4.get()
            monitor-enter(r3)
            java.lang.Object r2 = r4.get()     // Catch:{ all -> 0x0058 }
            X.2nN r2 = (X.C60092nN) r2     // Catch:{ all -> 0x0058 }
            monitor-enter(r2)     // Catch:{ all -> 0x0058 }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0055 }
            r0.remove(r5)     // Catch:{ all -> 0x0055 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0055 }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0055 }
            X.9zg r1 = (X.C199249zg) r1     // Catch:{ all -> 0x0055 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            if (r1 != 0) goto L_0x003a
            X.1Ov r0 = r6.A09     // Catch:{ all -> 0x0058 }
            byte[] r0 = r0.A08(r5)     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x003c
            X.9zg r1 = new X.9zg     // Catch:{ all -> 0x0058 }
            r1.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x0058 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x0058 }
            r0.A03(r1, r5)     // Catch:{ all -> 0x0058 }
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            goto L_0x004e
        L_0x003c:
            X.9zg r1 = new X.9zg     // Catch:{ IOException -> 0x004f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004f }
            A03(r1)     // Catch:{ IOException -> 0x004f }
            java.lang.Object r0 = r4.get()     // Catch:{ IOException -> 0x004f }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ IOException -> 0x004f }
            r0.A03(r1, r5)     // Catch:{ IOException -> 0x004f }
            goto L_0x003a
        L_0x004e:
            return r1
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            X.9zg r0 = r6.A0G(r5)
            return r0
        L_0x0055:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0058 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0F(X.2nE):X.9zg");
    }

    public C199249zg A0G(C60002nE r8) {
        C199249zg r4;
        C199249zg r42;
        C60002nE A002 = A00(r8, "loadSession");
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A0K, 4009);
        C28791au A062 = this.A0I.A06();
        if (A052) {
            C41851xA BD0 = A062.BD0();
            synchronized (this.A0P.get()) {
                try {
                    this.A09.A06(A002);
                    r42 = new C199249zg();
                    A062.BJ7(new C98714rb(this, A002, r42, 45));
                    BD0.A00();
                    BD0.close();
                    A062.close();
                } catch (Throwable th) {
                    BD0.close();
                    A062.close();
                    throw th;
                }
            }
            return r42;
        }
        try {
            C41851xA BD02 = A062.BD0();
            try {
                AnonymousClass00H r2 = this.A0P;
                synchronized (((C60092nN) r2.get())) {
                    this.A09.A06(A002);
                    r4 = new C199249zg();
                    ((C60092nN) r2.get()).A03(r4, A002);
                    BD02.A00();
                }
                BD02.close();
                A062.close();
                return r4;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A062.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public C60002nE A0H(C60002nE r6) {
        AnonymousClass11S r1 = this.A03;
        AnonymousClass1E2 A092 = r1.A09();
        r1.A0I();
        PhoneUserJid phoneUserJid = r1.A0E;
        if (A092 == null || phoneUserJid == null || !r6.A03.equals(A092.user)) {
            return r6;
        }
        return new C60002nE(AnonymousClass00R.A00, phoneUserJid.user, 0, r6.A00);
    }

    public C61892qS A0I() {
        Cursor A0A2;
        C71363Ez A072 = this.A0H.A07();
        try {
            C28781at A052 = this.A0A.A01.get();
            try {
                C23141Ev r8 = ((C28801av) A052).A02;
                A0A2 = r8.A0A("SELECT prekey_id, record FROM signed_prekeys ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKey", (String[]) null);
                if (!A0A2.moveToNext()) {
                    Log.e("SignalSignedPreKeyStore/getActiveSignedPreKey no signed prekey record found");
                    A0A2.close();
                    A052.close();
                } else {
                    int i = A0A2.getInt(A0A2.getColumnIndexOrThrow("prekey_id"));
                    byte[] blob = A0A2.getBlob(A0A2.getColumnIndexOrThrow("record"));
                    A0A2.close();
                    if (i == 16777215) {
                        A0A2 = r8.A0A("SELECT prekey_id, record FROM signed_prekeys WHERE prekey_id < ? ORDER BY prekey_id DESC LIMIT 1", "SignalSignedPreKeyStore/getActiveSignedPreKeyMax", new String[]{String.valueOf(8388607)});
                        if (A0A2.moveToNext()) {
                            i = A0A2.getInt(A0A2.getColumnIndexOrThrow("prekey_id"));
                            blob = A0A2.getBlob(A0A2.getColumnIndexOrThrow("record"));
                        }
                        A0A2.close();
                    }
                    A052.close();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SignalSignedPreKeyStore/getActiveSignedPreKey retrieved latest signed prekey record successfully; id=");
                    sb.append(i);
                    Log.i(sb.toString());
                    if (blob != null) {
                        C61892qS r0 = new C61892qS(blob);
                        if (A072 != null) {
                            A072.close();
                        }
                        return r0;
                    }
                }
                th = new AssertionError("no signed prekey record found");
            } catch (Throwable th) {
                th = th;
                try {
                    A052.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        } catch (IOException e) {
            Log.e("SignalCoordinator/failed to parse the latest signed prekey record", e);
            th = new AssertionError(e);
        } catch (Throwable th3) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th3;
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th3, th4);
                    throw th3;
                }
            }
            throw th3;
        }
        throw th;
        throw th;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [X.2S5, java.lang.Object] */
    public C54492eE A0K() {
        AnonymousClass1PC r9;
        Throwable th;
        Cursor A0A2;
        C52972bm r4;
        C54492eE r10;
        C54492eE r8;
        C71363Ez A072 = this.A0H.A07();
        try {
            AnonymousClass1PJ r2 = this.A01;
            AnonymousClass1PH r1 = r2.A00;
            if (!r1.A01()) {
                r2.A04();
            }
            r9 = r1.A03;
            AnonymousClass1MH r3 = r9.A01;
            C28781at A052 = r3.get();
            try {
                A0A2 = ((C28801av) A052).A02.A0A("SELECT prekey_id, record FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0 LIMIT ?", "SignalPreKeyStore/getSinglePreKey", new String[]{"1"});
                if (A0A2.moveToNext()) {
                    r4 = new C52972bm(A0A2.getInt(A0A2.getColumnIndexOrThrow("prekey_id")), A0A2.getBlob(A0A2.getColumnIndexOrThrow("record")));
                    A0A2.close();
                    A052.close();
                } else {
                    A0A2.close();
                    A052.close();
                    r4 = null;
                }
                r10 = null;
                if (r4 != null) {
                    int i = r4.A00;
                    byte[] bArr = r4.A01;
                    ? obj = new Object();
                    obj.A00 = (AnonymousClass2BH) C23577Bm6.A07(AnonymousClass2BH.DEFAULT_INSTANCE, bArr);
                    r8 = AnonymousClass1PH.A00(obj, i);
                    C28791au A062 = r3.A06();
                    try {
                        ContentValues contentValues = new ContentValues(2);
                        boolean z = true;
                        contentValues.put("direct_distribution", true);
                        contentValues.put("upload_timestamp", Long.valueOf(AnonymousClass11P.A01(r9.A00) / 1000));
                        if (((C28801av) A062).A02.A02(contentValues, "prekeys", "prekey_id=?", "SignalPreKeyStore/markPreKeyAsDirectDistribution", new String[]{String.valueOf(i)}) != 1) {
                            z = false;
                        }
                        A062.close();
                        if (!z) {
                            Log.e("SignalProtocolStore/prekey Failed to mark key as direct distribution, not sending pre-key with retry receipt");
                        }
                        r10 = r8;
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                A052.close();
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SignalProtocolStore/prekey error reading prekey ");
            int i2 = r4.A00;
            sb.append(i2);
            Log.e(sb.toString(), e);
            r9.A02(i2);
            r8 = null;
        } catch (Throwable th4) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th4;
                } catch (Throwable th5) {
                    AnonymousClass0DT.A00(th4, th5);
                    throw th4;
                }
            }
            throw th4;
        }
        if (A072 != null) {
            A072.close();
        }
        return r10;
        throw th;
    }

    public HashMap A0L(Set set) {
        ArrayList arrayList;
        C60002nE r4;
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C60002nE r1 = (C60002nE) it.next();
            hashMap.put(r1, A0H(r1));
        }
        HashSet hashSet = new HashSet(hashMap.values());
        HashMap hashMap2 = new HashMap();
        C25571Os r0 = this.A0H;
        HashSet A092 = r0.A09(hashSet);
        try {
            r0.A0A(A092);
            Map A052 = this.A06.A05(hashSet);
            arrayList = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                r4 = (C60002nE) entry.getKey();
                byte[] bArr = (byte[]) A052.get(entry.getValue());
                if (bArr != null) {
                    hashMap2.put(r4, new C58252kO(C63962tz.A01(bArr)));
                }
                hashMap2.put(r4, (Object) null);
            }
            if (!arrayList.isEmpty()) {
                A04(arrayList);
            }
            C25571Os.A05(A092);
            return hashMap2;
        } catch (C22511Ak e) {
            StringBuilder sb = new StringBuilder();
            sb.append("SignalCoordinator/getIdentityKeys for ");
            sb.append(r4);
            sb.append(" decoded as invalid");
            Log.e(sb.toString(), e);
            arrayList.add(r4);
        } catch (Throwable th) {
            C25571Os.A05(A092);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|41|38|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        r1 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (r1.hasNext() == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        A0G((X.C60002nE) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        return A02(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A0M(java.util.List r11) {
        /*
            r10 = this;
            java.lang.String r3 = "getMissingSessions"
            X.1P1 r0 = r10.A0E
            java.util.List r1 = r0.A02(r11)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            X.1Ov r2 = r10.A09
            java.util.LinkedHashMap r5 = r2.A04(r3, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x0017
            r5.put(r1, r1)
            goto L_0x0017
        L_0x002b:
            java.util.Collection r1 = r5.values()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            X.00H r8 = r10.A0P
            java.lang.Object r9 = r8.get()
            monitor-enter(r9)
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00c8 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00c8 }
            java.util.HashSet r4 = r0.A00(r1)     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00c8 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00c8 }
            java.util.HashSet r6 = r0.A01(r1)     // Catch:{ all -> 0x00c8 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x0065
            java.util.HashSet r0 = A02(r5, r4)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c8 }
            return r0
        L_0x0065:
            r4.addAll(r6)     // Catch:{ all -> 0x00c8 }
            java.util.LinkedHashMap r0 = r2.A05(r6)     // Catch:{ all -> 0x00c8 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00c8 }
        L_0x0074:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00c8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00c8 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x00c8 }
            X.2nE r2 = (X.C60002nE) r2     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00c8 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x00c8 }
            X.9zg r1 = new X.9zg     // Catch:{ IOException -> 0x00a1 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a1 }
            A03(r1)     // Catch:{ IOException -> 0x00a1 }
            java.lang.Object r0 = r8.get()     // Catch:{ IOException -> 0x00a1 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ IOException -> 0x00a1 }
            r0.A03(r1, r2)     // Catch:{ IOException -> 0x00a1 }
            r4.remove(r2)     // Catch:{ IOException -> 0x00a1 }
            goto L_0x0074
        L_0x00a1:
            r7.add(r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x0074
        L_0x00a5:
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x00c8 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00c8 }
            r0.A04(r6)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00c8 }
            java.util.Iterator r1 = r7.iterator()
        L_0x00b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r0 = r1.next()
            X.2nE r0 = (X.C60002nE) r0
            r10.A0G(r0)
            goto L_0x00b3
        L_0x00c3:
            java.util.HashSet r0 = A02(r5, r4)
            return r0
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0M(java.util.List):java.util.HashSet");
    }

    public void A0O() {
        NetworkSession networkSession;
        this.A0I.A08();
        if (this.A04.A09(AnonymousClass18O.A0f)) {
            JniBridge jniBridge = this.A0M;
            NativeHolder nativeHolder = (NativeHolder) jniBridge.wajContext.getAndSet(JniBridge.jvidispatchO(0));
            if (nativeHolder != null) {
                nativeHolder.release();
            }
            C18030ve r5 = this.A0K;
            if (C18020vd.A00(C18040vf.A02, r5, 5120) >= 1) {
                CountDownLatch countDownLatch = AnonymousClass18M.A0E;
                AnonymousClass00H r1 = this.A0O;
                Context context = this.A0C.A00;
                AnonymousClass18H r2 = (AnonymousClass18H) this.A0S.get();
                C18070vi.A0d(r1, 1);
                C18070vi.A0d(context, 2);
                C18070vi.A0d(r2, 4);
                AnonymousClass18M.A0E.await();
                C23121Eq r12 = (C23121Eq) r1.get();
                synchronized (r12) {
                    networkSession = r12.A00;
                    C17960vV.A07(networkSession);
                }
                C18070vi.A0X(networkSession);
                C23131Er.A00(context, networkSession, r2, r5, jniBridge);
            }
        }
        ((C60092nN) this.A0P.get()).A02();
    }

    public void A0P() {
        C71363Ez A072 = this.A0H.A07();
        try {
            this.A01.A04();
            if (A072 != null) {
                A072.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A0Q() {
        C28791au A062;
        C71363Ez A072 = this.A0H.A07();
        try {
            AnonymousClass1MH r3 = this.A01.A00.A03.A01;
            C28791au A063 = r3.A06();
            try {
                C41851xA BD0 = A063.BD0();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sent_to_server", false);
                    contentValues.put("upload_timestamp", 0L);
                    ((C28801av) A063).A02.A02(contentValues, "prekeys", "sent_to_server != 0", "SignalPreKeyStore/markAllPreKeysAsUnsentToServer", (String[]) null);
                    Log.i("SignalPreKeyStore/markAllPreKeysAsUnsentToServer recorded no prekeys as received by server");
                    A062 = r3.A06();
                    int A042 = ((C28801av) A062).A02.A04("prekey_uploads", (String) null, "SignalPreKeyStore/deleteAllPreKeyUploads", (String[]) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append("SignalPreKeyStore/deleteAllPreKeyUploads deleted prekey upload timestamps:");
                    sb.append(A042);
                    Log.i(sb.toString());
                    A062.close();
                    BD0.A00();
                    BD0.close();
                    A063.close();
                    if (A072 != null) {
                        A072.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    BD0.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A063.close();
                throw th2;
            }
        } catch (Throwable th3) {
            if (A072 != null) {
                try {
                    A072.close();
                    throw th3;
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th3, th4);
                    throw th3;
                }
            }
            throw th3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (r4 != null) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(int r18) {
        /*
            r17 = this;
            r1 = r17
            X.1Os r0 = r1.A0H
            X.3Ez r7 = r0.A07()
            X.1PD r4 = r1.A0A     // Catch:{ all -> 0x00df }
            r0 = 5
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x00df }
            r2 = 0
        L_0x000e:
            r3 = r18
            int r1 = r18 - r2
            if (r1 >= 0) goto L_0x0017
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            int r1 = r1 + r0
        L_0x0017:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00df }
            r12[r2] = r0     // Catch:{ all -> 0x00df }
            int r2 = r2 + 1
            r0 = 5
            if (r2 < r0) goto L_0x000e
            X.1MH r0 = r4.A01     // Catch:{ all -> 0x00df }
            X.1au r6 = r0.A06()     // Catch:{ all -> 0x00df }
            X.1xA r5 = r6.BD0()     // Catch:{ all -> 0x00d5 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00cb }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x00cb }
            java.lang.String r9 = "signed_prekeys"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = "COUNT(1) as count"
            r0 = 0
            r10[r0] = r1     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = "prekey_id IN (?,?,?,?,?)"
            java.lang.String r16 = "SignalSignedPreKeyStore/removeOldSignedPreKeysCountRemaining"
            r13 = 0
            r15 = r13
            r14 = r13
            android.database.Cursor r4 = r8.A0B(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00cb }
            if (r4 == 0) goto L_0x009a
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "count"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
            int r0 = r4.getInt(r0)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0070
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeOldSignedPreKeys there would be zero signed prekeys left if this delete old signed prekey records command were executed; aborting; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bf }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            goto L_0x00b0
        L_0x0070:
            java.lang.String r1 = "prekey_id NOT IN (?,?,?,?,?)"
            java.lang.String r0 = "SignalSignedPreKeyStore/removeOldSignedPreKeys"
            int r2 = r8.A04(r9, r1, r0, r12)     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeOldSignedPreKeys deleted "
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r2)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = " old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bf }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
        L_0x0096:
            r5.A00()     // Catch:{ all -> 0x00bf }
            goto L_0x00b0
        L_0x009a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            r1.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeOldSignedPreKeys failed to query a count while trying to delete old signed prekey records; newSignedPreKeyId="
            r1.append(r0)     // Catch:{ all -> 0x00bf }
            r1.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bf }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x00b3
        L_0x00b0:
            r4.close()     // Catch:{ all -> 0x00cb }
        L_0x00b3:
            r5.close()     // Catch:{ all -> 0x00d5 }
            r6.close()     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00be
            r7.close()
        L_0x00be:
            return
        L_0x00bf:
            r1 = move-exception
            if (r4 == 0) goto L_0x00ca
            r4.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d4:
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00df }
        L_0x00de:
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            if (r7 == 0) goto L_0x00ea
            r7.close()     // Catch:{ all -> 0x00e6 }
            throw r1
        L_0x00e6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00ea:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0R(int):void");
    }

    public void A0T(C60002nE r5, AnonymousClass1BI r6, byte[] bArr) {
        C25571Os r0 = this.A0H;
        C71363Ez A002 = C25571Os.A00(r5, r0);
        C25571Os.A03(A002, r0);
        try {
            A0V(r5, new AnonymousClass205(r6, "location_msg_id", true), bArr);
            if (A002 != null) {
                A002.close();
            }
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C60002nE r13, X.AnonymousClass205 r14) {
        /*
            r12 = this;
            java.lang.String r4 = "deleteMessageBaseKey"
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r3.add(r13)
            X.0ve r2 = r12.A0K
            r1 = 6557(0x199d, float:9.188E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0023
            X.1MK r1 = r12.A0L
            java.lang.String r0 = "message_base_key"
            X.2nE r0 = r1.A02(r13, r4, r0)
            if (r0 == 0) goto L_0x0023
            r3.add(r0)
        L_0x0023:
            X.1Os r0 = r12.A0H
            java.util.HashSet r4 = r0.A09(r3)
            r0.A0A(r4)
            X.1MH r0 = r12.A0I     // Catch:{ all -> 0x00f6 }
            X.1au r11 = r0.A06()     // Catch:{ all -> 0x00f6 }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r9 = r3.iterator()     // Catch:{ all -> 0x00e2 }
        L_0x003a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00e2 }
            X.2nE r8 = (X.C60002nE) r8     // Catch:{ all -> 0x00e2 }
            X.00H r0 = r12.A0Q     // Catch:{ all -> 0x00e2 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00e2 }
            X.2pj r2 = (X.C61462pj) r2     // Catch:{ all -> 0x00e2 }
            r0 = 0
            X.C18070vi.A0d(r8, r0)     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "msg_key_remote_jid  = ? AND recipient_id = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me "
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            boolean r0 = r14.A02     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = " != "
        L_0x0062:
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = " 0 AND msg_key_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00e2 }
            X.1BI r0 = r14.A00     // Catch:{ all -> 0x00e2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = r0.getRawString()     // Catch:{ all -> 0x00e2 }
            X.00H r0 = r2.A01     // Catch:{ all -> 0x00e2 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00e2 }
            X.1MK r1 = (X.AnonymousClass1MK) r1     // Catch:{ all -> 0x00e2 }
            java.lang.String r0 = "removeMessageBaseKey"
            java.lang.String r3 = "message_base_key"
            r1.A07(r8, r3, r0)     // Catch:{ all -> 0x00e2 }
            X.00H r0 = r2.A02     // Catch:{ all -> 0x00e2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e2 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x00e2 }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x00e2 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ce }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00ce }
            java.lang.String[] r1 = X.C61462pj.A00(r8, r14, r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "SignalMessageBaseKeyStore/removeMessageBaseKey"
            int r0 = r2.A04(r3, r6, r0, r1)     // Catch:{ all -> 0x00ce }
            long r2 = (long) r0     // Catch:{ all -> 0x00ce }
            r5 = 0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r5 = 5
            if (r0 <= 0) goto L_0x00aa
            r5 = 3
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r1.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "axolotl deleted "
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            r1.append(r2)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = " message base key rows for "
            r1.append(r0)     // Catch:{ all -> 0x00ce }
            r1.append(r14)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ce }
            com.whatsapp.util.Log.log((int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x00ce }
            r7.close()     // Catch:{ all -> 0x00e2 }
            goto L_0x003a
        L_0x00cb:
            java.lang.String r0 = " = "
            goto L_0x0062
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00d5:
            r10.A00()     // Catch:{ all -> 0x00e2 }
            r10.close()     // Catch:{ all -> 0x00ec }
            r11.close()     // Catch:{ all -> 0x00f6 }
            X.C25571Os.A05(r4)
            return
        L_0x00e2:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ec }
        L_0x00eb:
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00f5
        L_0x00f1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00f6 }
        L_0x00f5:
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            X.C25571Os.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0U(X.2nE, X.205):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(X.C60002nE r14, X.AnonymousClass205 r15, byte[] r16) {
        /*
            r13 = this;
            java.lang.String r6 = "saveMessageBaseKey"
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2.add(r14)
            X.0ve r3 = r13.A0K
            r1 = 6557(0x199d, float:9.188E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x0023
            X.1MK r1 = r13.A0L
            java.lang.String r0 = "message_base_key"
            X.2nE r0 = r1.A02(r14, r6, r0)
            if (r0 == 0) goto L_0x0023
            r2.add(r0)
        L_0x0023:
            X.1Os r0 = r13.A0H
            java.util.HashSet r4 = r0.A09(r2)
            r0.A0A(r4)
            X.1MH r0 = r13.A0I     // Catch:{ all -> 0x011f }
            X.1au r12 = r0.A06()     // Catch:{ all -> 0x011f }
            X.1xA r11 = r12.BD0()     // Catch:{ all -> 0x0115 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x010b }
        L_0x003a:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x010b }
            X.2nE r3 = (X.C60002nE) r3     // Catch:{ all -> 0x010b }
            X.00H r0 = r13.A0Q     // Catch:{ all -> 0x010b }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x010b }
            X.2pj r2 = (X.C61462pj) r2     // Catch:{ all -> 0x010b }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x010b }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ all -> 0x010b }
            X.00H r0 = r2.A01     // Catch:{ all -> 0x010b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x010b }
            X.1MK r0 = (X.AnonymousClass1MK) r0     // Catch:{ all -> 0x010b }
            java.lang.String r8 = "message_base_key"
            r0.A07(r3, r8, r6)     // Catch:{ all -> 0x010b }
            X.1BI r0 = r15.A00     // Catch:{ all -> 0x010b }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x010b }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x010b }
            X.00H r0 = r2.A02     // Catch:{ all -> 0x010b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x010b }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x010b }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x010b }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00f7 }
            r7.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "msg_key_remote_jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "recipient_id"
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x00f7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "recipient_type"
            int r0 = r3.A01     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "device_id"
            int r0 = r3.A00     // Catch:{ all -> 0x00f7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00f7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "msg_key_from_me"
            boolean r0 = r15.A02     // Catch:{ all -> 0x00f7 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00f7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = "msg_key_id"
            java.lang.String r0 = r15.A01     // Catch:{ all -> 0x00f7 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "last_alice_base_key"
            r1 = r16
            r7.put(r0, r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r9 = "timestamp"
            X.11P r0 = r2.A00     // Catch:{ all -> 0x00f7 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x00f7 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00f7 }
            r7.put(r9, r0)     // Catch:{ all -> 0x00f7 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f7 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "SignalMessageBaseKeyStore/saveMessageBaseKey"
            long r1 = r1.A08(r8, r0, r7)     // Catch:{ all -> 0x00f7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r3.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = "axolotl saved a message base key for "
            r3.append(r0)     // Catch:{ all -> 0x00f7 }
            r3.append(r15)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = " with row id "
            r3.append(r0)     // Catch:{ all -> 0x00f7 }
            r3.append(r1)     // Catch:{ all -> 0x00f7 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00f7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f7 }
            r5.close()     // Catch:{ all -> 0x010b }
            goto L_0x003a
        L_0x00f7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x00fe:
            r11.A00()     // Catch:{ all -> 0x010b }
            r11.close()     // Catch:{ all -> 0x0115 }
            r12.close()     // Catch:{ all -> 0x011f }
            X.C25571Os.A05(r4)
            return
        L_0x010b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0110 }
            goto L_0x0114
        L_0x0110:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0115 }
        L_0x0114:
            throw r1     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x011a }
            goto L_0x011e
        L_0x011a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x011f }
        L_0x011e:
            throw r1     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            X.C25571Os.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0V(X.2nE, X.205, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(X.C59982nC r8) {
        /*
            r7 = this;
            X.1Os r0 = r7.A0H
            X.3Ez r6 = X.C25571Os.A01(r0, r8)
            r6.lock()
            java.lang.String r2 = r8.A01     // Catch:{ all -> 0x006c }
            X.8v1 r0 = X.C173408v1.A00     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x006c }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r1.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "SignalCoordinator/removefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x006c }
            r1.append(r2)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x006c }
            goto L_0x0061
        L_0x002c:
            X.1P2 r0 = r7.A05     // Catch:{ all -> 0x006c }
            X.00H r0 = r0.A02     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006c }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x006c }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x006c }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0065 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "fast_ratchet_sender_keys"
            java.lang.String r2 = "group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r1 = r8.A00()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/removeFastRatchetSenderKey"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0065 }
            r5.close()     // Catch:{ all -> 0x006c }
            X.00H r0 = r7.A0N     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x006c }
            X.1Ow r1 = (X.C25611Ow) r1     // Catch:{ all -> 0x006c }
            X.2hD r0 = new X.2hD     // Catch:{ all -> 0x006c }
            r0.<init>()     // Catch:{ all -> 0x006c }
            X.1Ox r0 = r1.A00     // Catch:{ all -> 0x006c }
            r0.A00()     // Catch:{ all -> 0x006c }
        L_0x0061:
            r6.close()
            return
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0071 }
            throw r1
        L_0x0071:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0W(X.2nC):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(java.util.List r18, int r19) {
        /*
            r17 = this;
            r4 = r17
            X.1Os r0 = r4.A0H
            X.3Ez r10 = r0.A07()
            int r0 = r18.size()     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00e9
            X.1MH r0 = r4.A0I     // Catch:{ all -> 0x00ef }
            X.1au r9 = r0.A06()     // Catch:{ all -> 0x00ef }
            X.1xA r8 = r9.BD0()     // Catch:{ all -> 0x00df }
            X.1PC r0 = r4.A07     // Catch:{ all -> 0x00d5 }
            X.1MH r0 = r0.A01     // Catch:{ all -> 0x00d5 }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x00d5 }
            X.1xA r6 = r7.BD0()     // Catch:{ all -> 0x00cb }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x00c1 }
            r3.<init>()     // Catch:{ all -> 0x00c1 }
            java.util.Iterator r5 = r18.iterator()     // Catch:{ all -> 0x00c1 }
        L_0x002d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x00c1 }
            X.2bm r2 = (X.C52972bm) r2     // Catch:{ all -> 0x00c1 }
            r3.clear()     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "prekey_id"
            int r0 = r2.A00     // Catch:{ all -> 0x00c1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c1 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "record"
            byte[] r0 = r2.A01     // Catch:{ all -> 0x00c1 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "sent_to_server"
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00c1 }
            r3.put(r2, r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = "direct_distribution"
            r3.put(r0, r1)     // Catch:{ all -> 0x00c1 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c1 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "prekeys"
            java.lang.String r0 = "SignalPreKeyStore/savePreKeys"
            r2.A06(r1, r0, r3)     // Catch:{ all -> 0x00c1 }
            goto L_0x002d
        L_0x006b:
            r6.A00()     // Catch:{ all -> 0x00c1 }
            r6.close()     // Catch:{ all -> 0x00cb }
            r7.close()     // Catch:{ all -> 0x00d5 }
            X.1P0 r0 = r4.A06     // Catch:{ all -> 0x00d5 }
            java.lang.String r4 = "0"
            X.1MH r0 = r0.A03     // Catch:{ all -> 0x00d5 }
            X.1au r2 = r0.A06()     // Catch:{ all -> 0x00d5 }
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x00ba }
            r0 = -1
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00ba }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x00ba }
            r0 = 1
            r3[r0] = r4     // Catch:{ all -> 0x00ba }
            r0 = 2
            r3[r0] = r4     // Catch:{ all -> 0x00ba }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00ba }
            r12.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "next_prekey_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x00ba }
            r12.put(r1, r0)     // Catch:{ all -> 0x00ba }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ba }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x00ba }
            java.lang.String r13 = "identities"
            java.lang.String r14 = "recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String r15 = "SignalIdentityKeyStore/saveNextPreKeyId"
            r16 = r3
            r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ba }
            r2.close()     // Catch:{ all -> 0x00d5 }
            r8.A00()     // Catch:{ all -> 0x00d5 }
            r8.close()     // Catch:{ all -> 0x00df }
            r9.close()     // Catch:{ all -> 0x00ef }
            goto L_0x00e9
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00d5 }
            throw r0     // Catch:{ all -> 0x00d5 }
        L_0x00c1:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00d5 }
        L_0x00d4:
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00df }
        L_0x00de:
            throw r1     // Catch:{ all -> 0x00df }
        L_0x00df:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ef }
        L_0x00e8:
            throw r1     // Catch:{ all -> 0x00ef }
        L_0x00e9:
            if (r10 == 0) goto L_0x00ee
            r10.close()
        L_0x00ee:
            return
        L_0x00ef:
            r1 = move-exception
            if (r10 == 0) goto L_0x00fa
            r10.close()     // Catch:{ all -> 0x00f6 }
            throw r1
        L_0x00f6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00fa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0X(java.util.List, int):void");
    }

    public boolean A0Y() {
        return C18020vd.A05(C18040vf.A02, this.A0H.A04, 3165);
    }

    public boolean A0Z() {
        C71363Ez A072 = this.A0H.A07();
        try {
            boolean A012 = this.A01.A00.A01();
            if (A072 != null) {
                A072.close();
            }
            return A012;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public boolean A0b(C60002nE r8) {
        C199249zg r0;
        C60002nE A002 = A00(r8, "containsSession");
        AnonymousClass00H r5 = this.A0P;
        synchronized (r5.get()) {
            C60092nN r1 = (C60092nN) r5.get();
            synchronized (r1) {
                r1.A01.remove(A002);
                r0 = (C199249zg) r1.A00.get(A002);
            }
            if (r0 != null) {
                boolean z = !r0.A00;
                return z;
            }
            byte[] A082 = this.A09.A08(A002);
            if (A082 == null) {
                ((C60092nN) r5.get()).A03(new C199249zg(), A002);
                return false;
            }
            try {
                C199249zg r12 = new C199249zg(A082);
                A03(r12);
                ((C60092nN) r5.get()).A03(r12, A002);
                return true;
            } catch (IOException unused) {
                A0G(A002);
                return false;
            }
        }
    }

    public boolean A0c(C60002nE r5, AnonymousClass1BI r6) {
        C25571Os r0 = this.A0H;
        C71363Ez A002 = C25571Os.A00(r5, r0);
        C25571Os.A03(A002, r0);
        try {
            boolean A0d = A0d(r5, new AnonymousClass205(r6, "location_msg_id", true));
            if (A002 != null) {
                A002.close();
            }
            return A0d;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0126, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(X.C60002nE r23, X.AnonymousClass205 r24) {
        /*
            r22 = this;
            r8 = r22
            X.1Os r5 = r8.A0H
            r4 = r23
            X.3Ez r2 = X.C25571Os.A00(r4, r5)
            X.C25571Os.A03(r2, r5)
            r7 = r4
            X.0ve r3 = r8.A0K     // Catch:{ all -> 0x0133 }
            r1 = 6487(0x1957, float:9.09E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0133 }
            boolean r0 = X.C18020vd.A05(r0, r3, r1)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0027
            X.1MK r3 = r8.A0L     // Catch:{ all -> 0x0133 }
            java.lang.String r1 = "loadMessageBaseKey"
            java.lang.String r0 = "message_base_key"
            X.2nE r0 = r3.A02(r4, r1, r0)     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0027
            r7 = r0
        L_0x0027:
            X.3Ez r3 = X.C25571Os.A00(r7, r5)     // Catch:{ all -> 0x0133 }
            X.C25571Os.A03(r3, r5)     // Catch:{ all -> 0x0133 }
            X.00H r0 = r8.A0Q     // Catch:{ all -> 0x0127 }
            java.lang.Object r11 = r0.get()     // Catch:{ all -> 0x0127 }
            X.2pj r11 = (X.C61462pj) r11     // Catch:{ all -> 0x0127 }
            java.lang.String r9 = "last_alice_base_key"
            r12 = 0
            r10 = 1
            r5 = r24
            X.C18070vi.A0d(r5, r10)     // Catch:{ all -> 0x0127 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0127 }
            r1.<init>()     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = "msg_key_remote_jid  = ? AND recipient_id = ? AND recipient_type = ? AND device_id = ? AND msg_key_from_me "
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            boolean r0 = r5.A02     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = " != "
        L_0x004f:
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = " 0 AND msg_key_id = ?"
            r1.append(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r16 = r1.toString()     // Catch:{ all -> 0x0127 }
            X.1BI r0 = r5.A00     // Catch:{ all -> 0x0127 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0127 }
            X.00H r0 = r11.A01     // Catch:{ all -> 0x0127 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0127 }
            X.1MK r6 = (X.AnonymousClass1MK) r6     // Catch:{ all -> 0x0127 }
            java.lang.String r14 = "message_base_key"
            java.lang.String r0 = "getMessageBaseKey"
            r6.A07(r7, r14, r0)     // Catch:{ all -> 0x0127 }
            X.00H r0 = r11.A02     // Catch:{ all -> 0x0127 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0127 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x0127 }
            X.1at r6 = r0.get()     // Catch:{ all -> 0x0127 }
            goto L_0x0083
        L_0x0080:
            java.lang.String r0 = " = "
            goto L_0x004f
        L_0x0083:
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0120 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0120 }
            java.lang.String[] r15 = new java.lang.String[r10]     // Catch:{ all -> 0x0120 }
            r15[r12] = r9     // Catch:{ all -> 0x0120 }
            java.lang.String[] r17 = X.C61462pj.A00(r7, r5, r1)     // Catch:{ all -> 0x0120 }
            java.lang.String r21 = "SignalMessageBaseKeyStore/getMessageBaseKey"
            r1 = 0
            r20 = r1
            r18 = r1
            r19 = r1
            android.database.Cursor r7 = r13.A0B(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0120 }
            if (r7 == 0) goto L_0x00b8
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00ad
            int r0 = r7.getColumnIndexOrThrow(r9)     // Catch:{ all -> 0x00b1 }
            byte[] r1 = r7.getBlob(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00ad:
            r7.close()     // Catch:{ all -> 0x0120 }
            goto L_0x00b8
        L_0x00b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x00b8:
            r6.close()     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x00c0
            r3.close()     // Catch:{ all -> 0x0133 }
        L_0x00c0:
            if (r1 != 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r1.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "SignalCoordinator/axolotl has no saved base key for "
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            r1.append(r5)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0133 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            if (r2 == 0) goto L_0x00db
            r2.close()
        L_0x00db:
            return r12
        L_0x00dc:
            X.9zg r0 = r8.A0F(r4)     // Catch:{ all -> 0x0133 }
            X.9XJ r0 = r0.A01     // Catch:{ all -> 0x0133 }
            X.8cI r0 = r0.A00     // Catch:{ all -> 0x0133 }
            X.DSQ r0 = r0.aliceBaseKey_     // Catch:{ all -> 0x0133 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x0133 }
            boolean r3 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0133 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0133 }
            r1.<init>()     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "SignalCoordinator/hasSameBaseKey "
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            if (r3 == 0) goto L_0x00fb
            goto L_0x00fe
        L_0x00fb:
            java.lang.String r0 = "different"
            goto L_0x0100
        L_0x00fe:
            java.lang.String r0 = "matching"
        L_0x0100:
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = " saved base key and session for "
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            r1.append(r5)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x0133 }
            r1.append(r4)     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0133 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            if (r2 == 0) goto L_0x011f
            r2.close()
        L_0x011f:
            return r3
        L_0x0120:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0127 }
            throw r0     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r1 = move-exception
            if (r3 == 0) goto L_0x0132
            r3.close()     // Catch:{ all -> 0x012e }
            goto L_0x0132
        L_0x012e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0133 }
        L_0x0132:
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r1 = move-exception
            if (r2 == 0) goto L_0x013e
            r2.close()     // Catch:{ all -> 0x013a }
            throw r1
        L_0x013a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x013e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0d(X.2nE, X.205):boolean");
    }

    public byte[] A0f() {
        C71363Ez A072 = this.A0H.A07();
        try {
            byte[] bArr = this.A01.A03().A01.A00.A00;
            Log.i("SignalCoordinator/fetched identity key for sending");
            if (A072 != null) {
                A072.close();
            }
            return bArr;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static HashSet A02(Map map, Set set) {
        HashSet hashSet = new HashSet(set.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (set.contains(entry.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ed, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C58252kO A0D(X.C60002nE r12) {
        /*
            r11 = this;
            X.2nE r4 = r11.A0H(r12)
            X.1Os r0 = r11.A0H
            X.3Ez r3 = X.C25571Os.A00(r4, r0)
            X.C25571Os.A03(r3, r0)
            X.1P0 r8 = r11.A06     // Catch:{ all -> 0x00ee }
            r10 = r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x00ee }
            X.1MK r7 = r8.A05     // Catch:{ all -> 0x00ee }
            java.lang.String r6 = "identities"
            java.lang.String r5 = "getIdentityPublicKey"
            r7.A07(r4, r6, r5)     // Catch:{ all -> 0x00ee }
            X.0ve r2 = r8.A04     // Catch:{ all -> 0x00ee }
            r1 = 6484(0x1954, float:9.086E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00ee }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0030
            X.2nE r0 = r7.A02(r4, r5, r6)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0030
            r10 = r0
        L_0x0030:
            X.1MH r0 = r8.A03     // Catch:{ all -> 0x00ee }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x00ee }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e7 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = "SELECT public_key, timestamp FROM identities WHERE recipient_id =? AND recipient_type = ? AND device_id =?"
            java.lang.String[] r1 = r10.A00()     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "SignalIdentityKeyStore/getIdentityPublicKey"
            android.database.Cursor r8 = r6.A0A(r2, r0, r1)     // Catch:{ all -> 0x00e7 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0068
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "SignalIdentityKeyStore/found no identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r10)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            r8.close()     // Catch:{ all -> 0x00e7 }
            r5.close()     // Catch:{ all -> 0x00ee }
            goto L_0x00d9
        L_0x0068:
            java.lang.String r0 = "public_key"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e0 }
            byte[] r9 = r8.getBlob(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e0 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x00e0 }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r6
            java.util.Date r2 = new java.util.Date     // Catch:{ all -> 0x00e0 }
            r2.<init>(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "SignalIdentityKeyStore/found an identity entry for "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r10)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = " dated "
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            r8.close()     // Catch:{ all -> 0x00e7 }
            r5.close()     // Catch:{ all -> 0x00ee }
            if (r9 == 0) goto L_0x00d9
            X.1jP r1 = X.C63962tz.A01(r9)     // Catch:{ 1Ak -> 0x00b8 }
            X.2kO r0 = new X.2kO     // Catch:{ 1Ak -> 0x00b8 }
            r0.<init>(r1)     // Catch:{ 1Ak -> 0x00b8 }
            if (r3 == 0) goto L_0x00b7
            r3.close()
        L_0x00b7:
            return r0
        L_0x00b8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ee }
            r1.<init>()     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "SignalCoordinator/getIdentityKey for "
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            r1.append(r4)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = " is invalid"
            r1.append(r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ee }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00ee }
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ all -> 0x00ee }
            r11.A04(r0)     // Catch:{ all -> 0x00ee }
        L_0x00d9:
            if (r3 == 0) goto L_0x00de
            r3.close()
        L_0x00de:
            r0 = 0
            return r0
        L_0x00e0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00ee }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r1 = move-exception
            if (r3 == 0) goto L_0x00f9
            r3.close()     // Catch:{ all -> 0x00f5 }
            throw r1
        L_0x00f5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x00f9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P3.A0D(X.2nE):X.2kO");
    }

    public C54492eE A0J() {
        C61892qS A0I2 = A0I();
        Log.i("SignalCoordinator/loaded the latest signed pre key for sending");
        return C63962tz.A04(A0I2);
    }

    public List A0N(C60002nE r7) {
        DeviceJid A032 = C63962tz.A03(r7);
        if (A032 == null) {
            return Collections.singletonList(r7);
        }
        AnonymousClass1MJ r2 = this.A0J;
        UserJid userJid = A032.userJid;
        C18070vi.A0d(userJid, 0);
        Set<UserJid> A0M2 = r2.A00.A0M(userJid);
        ArrayList arrayList = new ArrayList();
        for (UserJid A042 : A0M2) {
            int device = A032.getDevice();
            DeviceJid A043 = DeviceJid.Companion.A04(A042, device);
            boolean z = false;
            if (A043 != null) {
                z = true;
            }
            C17960vV.A0F(z, "DeviceJid must not be null");
            if (A043 != null) {
                arrayList.add(A043);
            }
        }
        return C63962tz.A06(arrayList);
    }

    public void A0S(C60002nE r10) {
        DeviceJid A032;
        List<C60002nE> A0N2 = A0N(r10);
        HashSet hashSet = new HashSet(A0N2);
        C25571Os r0 = this.A0H;
        HashSet A092 = r0.A09(hashSet);
        try {
            r0.A0A(A092);
            AnonymousClass1P0 r02 = this.A06;
            Map A052 = r02.A05(hashSet);
            HashMap A042 = r02.A04(A0N2);
            for (C60002nE r4 : A0N2) {
                boolean z = true;
                boolean z2 = false;
                if (A052.get(r4) != null) {
                    z2 = true;
                }
                boolean equals = Boolean.TRUE.equals(A042.get(r4));
                if (z2 && !equals) {
                    z = false;
                }
                C17960vV.A0F(z, "identity key was available but was not deleted");
                if (z2 && equals && (A032 = C63962tz.A03(r4)) != null) {
                    this.A02.A01(A032);
                }
            }
        } finally {
            C25571Os.A05(A092);
        }
    }

    public boolean A0a(C58252kO r3, C60002nE r4) {
        DeviceJid A032 = C63962tz.A03(r4);
        AnonymousClass11S r1 = this.A03;
        if (r1.A0P(A032)) {
            if (r1.A0N()) {
                C17960vV.A0C(r1.A0P(C63962tz.A03(r4)));
            } else {
                Log.e("SignalCoordinator/saveIdentity - Not allowed to save my companion identity as primary");
                return false;
            }
        }
        return A05(r3, r4, this);
    }

    public boolean A0e(C60002nE r8, byte[] bArr) {
        C60002nE A002 = A00(r8, "storeSession");
        try {
            A03(new C199249zg(bArr));
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0K, 4009);
            C28791au A062 = this.A0I.A06();
            if (A052) {
                C41851xA BD0 = A062.BD0();
                synchronized (this.A0P.get()) {
                    try {
                        this.A09.A07(r8, bArr);
                        A062.BJ7(new C98714rb(this, A002, bArr, 46));
                        BD0.A00();
                        BD0.close();
                        A062.close();
                    } catch (Throwable th) {
                        BD0.close();
                        A062.close();
                        throw th;
                    }
                }
                return true;
            }
            try {
                C41851xA BD02 = A062.BD0();
                try {
                    AnonymousClass00H r1 = this.A0P;
                    synchronized (((C60092nN) r1.get())) {
                        try {
                            this.A09.A07(r8, bArr);
                            ((C60092nN) r1.get()).A03(new C199249zg(bArr), A002);
                            BD02.A00();
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("SignalCoordinator/storeSession for ");
                            sb.append(A002);
                            sb.append(" failed to update");
                            Log.e(sb.toString(), e);
                        }
                    }
                    BD02.close();
                    A062.close();
                    return true;
                } catch (Throwable th2) {
                    BD02.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    A062.close();
                    throw th3;
                } catch (Throwable th4) {
                    AnonymousClass0DT.A00(th3, th4);
                    throw th3;
                }
            }
        } catch (IOException e2) {
            Log.e("sessionStoreImpl/invalid-session-record", e2);
            return false;
        }
    }
}
