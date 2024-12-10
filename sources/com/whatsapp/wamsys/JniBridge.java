package com.whatsapp.wamsys;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass1D2;
import X.AnonymousClass1D3;
import X.AnonymousClass1D4;
import X.AnonymousClass1D5;
import X.AnonymousClass1D8;
import X.AnonymousClass1E2;
import X.AnonymousClass1ED;
import X.AnonymousClass1HU;
import X.AnonymousClass1OZ;
import X.AnonymousClass1P0;
import X.AnonymousClass1P3;
import X.AnonymousClass1PC;
import X.AnonymousClass2BQ;
import X.AnonymousClass2SG;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C181659Ri;
import X.C18180vt;
import X.C199249zg;
import X.C200510q;
import X.C203811x;
import X.C22481Ad;
import X.C22511Ak;
import X.C22651Cr;
import X.C23577Bm6;
import X.C23651Hc;
import X.C42711yc;
import X.C52702bL;
import X.C52712bM;
import X.C52722bN;
import X.C52732bO;
import X.C52752bQ;
import X.C52762bR;
import X.C52782bT;
import X.C52792bU;
import X.C52822bX;
import X.C52862bb;
import X.C52952bk;
import X.C52962bl;
import X.C52972bm;
import X.C52982bn;
import X.C54622eR;
import X.C58252kO;
import X.C59982nC;
import X.C60002nE;
import X.C61252pN;
import X.C61262pO;
import X.C61272pP;
import X.C61282pQ;
import X.C61912qU;
import X.C63962tz;
import X.C72123Ks;
import android.text.TextUtils;
import com.facebook.msys.mcf.MsysError;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.ProtocolJniHelper;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class JniBridge {
    public static C22481Ad DEPENDENCIES;
    public static volatile JniBridge INSTANCE;
    public final AnonymousClass1D8 jniBridgeExceptionHandler;
    public AnonymousClass1D2 jniCallbacksIJniCallbacks;
    public AnonymousClass1D4 jniCallbacksIJniCallbacksAndroidGpia;
    public AnonymousClass1D5 jniCallbacksIJniCallbacksAndroidIntegrity;
    public AnonymousClass1D3 jniCallbacksIJniCallbacksAndroidRegistration;
    public final AtomicReference wajContext = new AtomicReference();

    public static long jnidispatchIIOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            AnonymousClass2SG r4 = (AnonymousClass2SG) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r4.A0D(str, map, map2, i2, i);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c8, code lost:
        INSTANCE.jniBridgeExceptionHandler.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cf, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object jnidispatchO(int r17) {
        /*
            r9 = 0
            r1 = r17
            if (r17 == 0) goto L_0x00dd
            r0 = 1
            if (r1 == r0) goto L_0x001e
            r0 = 2
            if (r1 == r0) goto L_0x000c
            return r9
        L_0x000c:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01c7 }
            X.1D5 r0 = r0.jniCallbacksIJniCallbacksAndroidIntegrity     // Catch:{ Exception -> 0x01c7 }
            X.0ve r2 = r0.A01     // Catch:{ Exception -> 0x01c7 }
            r1 = 10266(0x281a, float:1.4386E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C18020vd.A01(r0, r2, r1)     // Catch:{ Exception -> 0x01c7 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x01c7 }
            return r0
        L_0x001e:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01c7 }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01c7 }
            X.00H r0 = r0.A09     // Catch:{ Exception -> 0x01c7 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x01c7 }
            X.2jh r3 = (X.C57822jh) r3     // Catch:{ Exception -> 0x01c7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c7 }
            r5.<init>()     // Catch:{ Exception -> 0x01c7 }
            X.00H r1 = r3.A03     // Catch:{ Exception -> 0x01c7 }
            java.lang.Object r0 = r1.get()     // Catch:{ Exception -> 0x01c7 }
            X.1fM r0 = (X.C31311fM) r0     // Catch:{ Exception -> 0x01c7 }
            X.4Yf r2 = r0.A02()     // Catch:{ Exception -> 0x01c7 }
            java.lang.Object r0 = r1.get()     // Catch:{ Exception -> 0x01c7 }
            X.1fM r0 = (X.C31311fM) r0     // Catch:{ Exception -> 0x01c7 }
            boolean r0 = r0.A04()     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x006e
            if (r2 == 0) goto L_0x006e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c7 }
            r1.<init>()     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0S     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = r2.A03     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            int r0 = r2.A01     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0X     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01c7 }
            r5.add(r0)     // Catch:{ Exception -> 0x01c7 }
        L_0x006e:
            X.0ve r2 = r3.A01     // Catch:{ Exception -> 0x01c7 }
            r1 = 4020(0xfb4, float:5.633E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x01c7 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x00dc
            X.1Kg r0 = r3.A02     // Catch:{ Exception -> 0x01c7 }
            X.C24421Kg.A06(r0)     // Catch:{ Exception -> 0x01c7 }
            X.2n5 r0 = r0.A0B()     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x00dc
            java.util.List r0 = r0.A0C     // Catch:{ Exception -> 0x01c7 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x01c7 }
        L_0x008b:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r3 = r4.next()     // Catch:{ Exception -> 0x01c7 }
            X.2kD r3 = (X.C58142kD) r3     // Catch:{ Exception -> 0x01c7 }
            java.util.Set r0 = r3.A0B     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x01c7 }
            if (r0 != 0) goto L_0x008b
        L_0x00a1:
            java.lang.String r2 = r3.A05     // Catch:{ Exception -> 0x01c7 }
            if (r2 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c7 }
            r1.<init>()     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0S     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            r1.append(r2)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0X     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01c7 }
            r5.add(r0)     // Catch:{ Exception -> 0x01c7 }
        L_0x00be:
            java.lang.String r2 = r3.A01     // Catch:{ Exception -> 0x01c7 }
            if (r2 == 0) goto L_0x008b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c7 }
            r1.<init>()     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0S     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            r1.append(r2)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = X.C197569wu.A0X     // Catch:{ Exception -> 0x01c7 }
            r1.append(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01c7 }
            r5.add(r0)     // Catch:{ Exception -> 0x01c7 }
            goto L_0x008b
        L_0x00dc:
            return r5
        L_0x00dd:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x01c7 }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x01c7 }
            X.00H r0 = r0.A0G     // Catch:{ Exception -> 0x01c7 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01c7 }
            X.1HU r0 = (X.AnonymousClass1HU) r0     // Catch:{ Exception -> 0x01c7 }
            X.182 r4 = r0.A00     // Catch:{ Exception -> 0x01c7 }
            java.util.ArrayList r1 = X.C24311Jr.A00()     // Catch:{ Exception -> 0x01c7 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x01c7 }
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x01c4 }
            if (r0 != 0) goto L_0x00fa
            java.util.Map r0 = r4.A04()     // Catch:{ all -> 0x01c4 }
            r4.A01 = r0     // Catch:{ all -> 0x01c4 }
        L_0x00fa:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01c4 }
            r3.<init>()     // Catch:{ all -> 0x01c4 }
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x01c4 }
        L_0x0103:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0140
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x01c4 }
            X.2dy r5 = (X.C54332dy) r5     // Catch:{ all -> 0x01c4 }
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x01c4 }
            int r13 = r5.A00     // Catch:{ all -> 0x01c4 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x01c4 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x013a
            java.util.Map r0 = r4.A01     // Catch:{ all -> 0x01c4 }
            java.lang.Object r2 = r0.get(r1)     // Catch:{ all -> 0x01c4 }
            X.2fb r2 = (X.C55332fb) r2     // Catch:{ all -> 0x01c4 }
            int r14 = r5.A01     // Catch:{ all -> 0x01c4 }
            java.lang.String r11 = r5.A02     // Catch:{ all -> 0x01c4 }
            long r0 = r2.A02     // Catch:{ all -> 0x01c4 }
            int r15 = r2.A00     // Catch:{ all -> 0x01c4 }
            java.lang.String r12 = r2.A03     // Catch:{ all -> 0x01c4 }
            X.2g4 r10 = new X.2g4     // Catch:{ all -> 0x01c4 }
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x01c4 }
            r3.add(r10)     // Catch:{ all -> 0x01c4 }
            goto L_0x0103
        L_0x013a:
            java.lang.String r0 = "psidstore/getAllRecords ps-id key not exist in memory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01c4 }
            goto L_0x0103
        L_0x0140:
            monitor-exit(r4)     // Catch:{ Exception -> 0x01c7 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x01c7 }
            r4.<init>()     // Catch:{ Exception -> 0x01c7 }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ Exception -> 0x01c7 }
        L_0x014a:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r5 = r8.next()     // Catch:{ Exception -> 0x01c7 }
            X.2g4 r5 = (X.C55602g4) r5     // Catch:{ Exception -> 0x01c7 }
            r0 = 6
            X.1D6[] r3 = new X.AnonymousClass1D6[r0]     // Catch:{ Exception -> 0x01c7 }
            int r0 = r5.A01     // Catch:{ Exception -> 0x01c7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = "psIdKey"
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01c7 }
            r0 = 0
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            int r0 = r5.A02     // Catch:{ Exception -> 0x01c7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = "rotationPeriodDays"
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01c7 }
            r0 = 1
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r2 = "psIdKeyString"
            java.lang.String r0 = r5.A04     // Catch:{ Exception -> 0x01c7 }
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01c7 }
            r0 = 2
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            long r6 = r5.A03     // Catch:{ Exception -> 0x01c7 }
            r0 = 11323(0x2c3b, double:5.5943E-320)
            long r6 = r6 - r0
            r0 = 3600(0xe10, double:1.7786E-320)
            long r6 = r6 * r0
            r0 = 24
            long r6 = r6 * r0
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = "lastRotationTimeUtcDay"
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01c7 }
            r0 = 3
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            int r0 = r5.A00     // Catch:{ Exception -> 0x01c7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r0 = "beaconEvtNumber"
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x01c7 }
            r0 = 4
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            java.lang.String r2 = "uuid"
            java.lang.String r0 = r5.A05     // Catch:{ Exception -> 0x01c7 }
            X.1D6 r1 = new X.1D6     // Catch:{ Exception -> 0x01c7 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x01c7 }
            r0 = 5
            r3[r0] = r1     // Catch:{ Exception -> 0x01c7 }
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r3)     // Catch:{ Exception -> 0x01c7 }
            r4.add(r0)     // Catch:{ Exception -> 0x01c7 }
            goto L_0x014a
        L_0x01c3:
            return r4
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x01c7 }
            throw r0     // Catch:{ Exception -> 0x01c7 }
        L_0x01c7:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1D8 r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchO(int):java.lang.Object");
    }

    public static Object jnidispatchOI(long j) {
        try {
            byte[] bArr = new byte[((int) j)];
            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
            return bArr;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            INSTANCE.jniBridgeExceptionHandler.A00(e2);
            return null;
        }
    }

    public static Object jnidispatchOIO(int i, long j, Object obj) {
        HashMap hashMap;
        if (i != 0) {
            if (i == 1) {
                int i2 = (int) j;
                AnonymousClass1PC r3 = ((C52732bO) INSTANCE.jniCallbacksIJniCallbacks.A08.get()).A00.A07;
                byte[] A04 = r3.A04(i2);
                hashMap = null;
                if (A04 != null) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("axolotl found a pre key with id ");
                        sb.append(i2);
                        Log.i(sb.toString());
                        AnonymousClass1P3.A01(A04, i2);
                        return A04;
                    } catch (IOException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("error reading prekey ");
                        sb2.append(i2);
                        sb2.append("; deleting");
                        Log.e(sb2.toString(), e);
                        r3.A02(i2);
                        return null;
                    }
                }
            } else if (i != 2) {
                return null;
            } else {
                try {
                    int i3 = (int) j;
                    C52732bO r0 = (C52732bO) INSTANCE.jniCallbacksIJniCallbacks.A08.get();
                    if (i3 <= 0) {
                        return null;
                    }
                    ArrayList A01 = r0.A00.A07.A01();
                    hashMap = new HashMap();
                    Iterator it = A01.iterator();
                    while (it.hasNext()) {
                        C52972bm r2 = (C52972bm) it.next();
                        hashMap.put(Integer.valueOf(r2.A00), r2.A01);
                        if (hashMap.size() == i3) {
                            return hashMap;
                        }
                    }
                } catch (Exception e2) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e2);
                    return null;
                }
            }
            return hashMap;
        }
        int i4 = (int) j;
        byte[] A012 = ((C52762bR) INSTANCE.jniCallbacksIJniCallbacks.A0E.get()).A00.A0A.A01(i4);
        if (A012 == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("no signed prekey available with id ");
            sb3.append(i4);
            Log.e(sb3.toString());
            return null;
        }
        try {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("axolotl loaded a signed pre key with id ");
            sb4.append(i4);
            Log.i(sb4.toString());
            C23577Bm6.A07(AnonymousClass2BQ.DEFAULT_INSTANCE, A012);
            return A012;
        } catch (IOException e3) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("failed to parse signed pre key record during load for id ");
            sb5.append(i4);
            Log.e(sb5.toString(), e3);
            return null;
        }
    }

    public static Object jnidispatchOIOO(int i, long j, Object obj, Object obj2) {
        if (i == 0) {
            C58252kO A0D = ((C52722bN) INSTANCE.jniCallbacksIJniCallbacks.A07.get()).A00.A0D(A00((String) obj, (int) j));
            if (A0D != null) {
                return A0D.A00.A00();
            }
            return null;
        } else if (i != 1) {
            return null;
        } else {
            try {
                C199249zg A0F = ((C54622eR) INSTANCE.jniCallbacksIJniCallbacks.A0C.get()).A01.A0F(A00((String) obj, (int) j));
                if (!A0F.A00) {
                    return A0F.A00();
                }
                return null;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return null;
            }
        }
    }

    public static Object jnidispatchOIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i == 0) {
            C52982bn A01 = ((C52752bQ) INSTANCE.jniCallbacksIJniCallbacks.A0B.get()).A00.A08.A01(new C59982nC(A00((String) obj2, (int) j), (String) obj));
            C61282pQ r4 = null;
            if (A01 != null) {
                try {
                    byte[] bArr = A01.A01;
                    long j2 = A01.A00;
                    new C52822bX(bArr);
                    r4 = new C61282pQ(bArr, j2);
                } catch (IOException e) {
                    Log.e("SenderKeyStoreImpl/loadSenderKeyImpl", e);
                }
            }
            if (r4 != null) {
                return r4.A00;
            }
            return null;
        } else if (i == 1) {
            C52952bk A00 = ((C52712bM) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00.A05.A00(new C59982nC(A00((String) obj2, (int) j), (String) obj));
            C61262pO r3 = null;
            if (A00 != null) {
                try {
                    byte[] bArr2 = A00.A01;
                    new C61912qU(bArr2);
                    r3 = new C61262pO(bArr2, A00.A00);
                } catch (IOException e2) {
                    Log.e("FastRatchetSenderKeyStoreImpl/loadFastRatchetSenderKeyImpl", e2);
                }
            }
            if (r3 != null) {
                return r3.A00;
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            try {
                byte b = (byte) ((int) j);
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).createKeyValue((String) obj, (String) obj2, obj3, b);
            } catch (Exception e3) {
                INSTANCE.jniBridgeExceptionHandler.A00(e3);
                return null;
            }
        }
    }

    public static Object jnidispatchOO(int i, Object obj) {
        switch (i) {
            case 0:
                String str = (String) obj;
                C22651Cr r1 = INSTANCE.jniCallbacksIJniCallbacks.A03;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (InetAddress hostAddress : r1.A00.A03(str).A05) {
                            arrayList.add(hostAddress.getHostAddress());
                        }
                        return arrayList;
                    } catch (UnknownHostException unused) {
                    }
                }
                return null;
            case 1:
                try {
                    UserJid userJid = (UserJid) Jid.Companion.A02((String) obj);
                    if (userJid instanceof PhoneUserJid) {
                        return C181659Ri.A00(userJid.user);
                    }
                    if (userJid instanceof AnonymousClass1E2) {
                        return userJid.user;
                    }
                    return null;
                } catch (Exception e) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e);
                    return null;
                }
            case 2:
                byte[] bArr = INSTANCE.jniCallbacksIJniCallbacks.A02.A00.A0E().A01.A01;
                int length = bArr.length;
                if (length == 32) {
                    return bArr;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("AuthKeyStoreImpl/the key length is not expected/privateLength=");
                sb.append(length);
                Log.w(sb.toString());
                return null;
            case 3:
                byte[] bArr2 = (byte[]) obj;
                C52862bb r2 = (C52862bb) INSTANCE.jniCallbacksIJniCallbacks.A04.get();
                if (!AnonymousClass112.A01() || bArr2 == null) {
                    return null;
                }
                return r2.A01.A07(bArr2, r2.A00.A0J());
            case 4:
                C52962bl A03 = ((C52722bN) INSTANCE.jniCallbacksIJniCallbacks.A07.get()).A00.A06.A03();
                return new C61272pP(A03.A01, A03.A00).A00;
            case 5:
                return ((C52762bR) INSTANCE.jniCallbacksIJniCallbacks.A0E.get()).A00.A0I().A00.A0M();
            case 6:
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getTagFromProtocolTreeNode(obj);
            case 7:
                Object[] attributesFromProtocolTreeNode = ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getAttributesFromProtocolTreeNode(obj);
                if (attributesFromProtocolTreeNode != null) {
                    return Arrays.asList(attributesFromProtocolTreeNode);
                }
                return null;
            case 8:
                Object[] childrenFromProtocolTreeNode = ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getChildrenFromProtocolTreeNode(obj);
                if (childrenFromProtocolTreeNode != null) {
                    return Arrays.asList(childrenFromProtocolTreeNode);
                }
                return null;
            case 9:
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getDataFromProtocolTreeNode(obj);
            case 10:
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getKeyFromKeyValue(obj);
            case 11:
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).getValueStringFromKeyValue(obj);
            case 12:
                return ((ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get()).createNewJid((String) obj);
            default:
                return null;
        }
        INSTANCE.jniBridgeExceptionHandler.A00(e);
        return null;
    }

    public static native double jvidispatchDIO(int i, long j, Object obj);

    public static native long jvidispatchI();

    public static native long jvidispatchIIDO(int i, long j, double d, Object obj);

    public static native long jvidispatchIIDOOOO(long j, double d, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIIIDO(long j, long j2, double d, Object obj);

    public static native long jvidispatchIIIIIOO(long j, long j2, long j3, long j4, Object obj, Object obj2);

    public static native long jvidispatchIIIIO(int i, long j, long j2, long j3, Object obj);

    public static native long jvidispatchIIIIOOOOOOOOOOOO(long j, long j2, long j3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public static native long jvidispatchIIIO(int i, long j, long j2, Object obj);

    public static native long jvidispatchIIIOO(int i, long j, long j2, Object obj, Object obj2);

    public static native long jvidispatchIIO(int i, long j, Object obj);

    public static native long jvidispatchIIOO(int i, long j, Object obj, Object obj2);

    public static native long jvidispatchIIOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIIOOOOOOOOOO(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIO(int i, Object obj);

    public static native long jvidispatchIOO(int i, Object obj, Object obj2);

    public static native long jvidispatchIOOO(Object obj, Object obj2, Object obj3);

    public static native long jvidispatchIOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long jvidispatchIOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native long jvidispatchIOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long jvidispatchIOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native long jvidispatchIOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public static native long jvidispatchIOOOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public static native long jvidispatchIOOOOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public static native Object jvidispatchO(int i);

    public static native Object jvidispatchOII(long j, long j2);

    public static native Object jvidispatchOIII(long j, long j2, long j3);

    public static native Object jvidispatchOIIIIIIIOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public static native Object jvidispatchOIIIIOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIO(int i, long j, Object obj);

    public static native Object jvidispatchOIOO(int i, long j, Object obj, Object obj2);

    public static native Object jvidispatchOIOOO(long j, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOIOOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOO(int i, Object obj);

    public static native Object jvidispatchOOO(int i, Object obj, Object obj2);

    public static native Object jvidispatchOOOO(int i, Object obj, Object obj2, Object obj3);

    public static native Object jvidispatchOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object jvidispatchOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native Object jvidispatchOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native Object jvidispatchOOOOOOOO(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object jvidispatchOOOOOOOOOO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public C61252pN WCMMessageSecretAPICreateWithSerialized(byte[] bArr) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOO(3, this.wajContext.get(), bArr);
        if (nativeHolder != null) {
            return new C61252pN(nativeHolder);
        }
        return null;
    }

    public static C60002nE A00(String str, int i) {
        int i2;
        UserJid A04 = UserJid.Companion.A04(str);
        C17960vV.A07(A04);
        String str2 = A04.user;
        if (A04 instanceof AnonymousClass1E2) {
            i2 = 1;
        } else if (A04 instanceof AnonymousClass1ED) {
            i2 = 2;
        } else {
            i2 = 0;
            if (A04 instanceof C42711yc) {
                i2 = 3;
            }
        }
        return new C60002nE(AnonymousClass00R.A00, str2, i2, i);
    }

    public static JniBridge getInstance() {
        if (INSTANCE == null) {
            synchronized (JniBridge.class) {
                if (INSTANCE == null) {
                    C22481Ad r0 = DEPENDENCIES;
                    if (r0 != null) {
                        INSTANCE = new JniBridge((AnonymousClass1D2) r0.A01.get(), (AnonymousClass1D3) DEPENDENCIES.A04.get(), (AnonymousClass1D4) DEPENDENCIES.A02.get(), (AnonymousClass1D5) DEPENDENCIES.A03.get(), (AnonymousClass1D8) DEPENDENCIES.A00.get());
                    } else {
                        throw new IllegalStateException("Dependencies are not set. Call setDependencies() first.");
                    }
                }
            }
        }
        return INSTANCE;
    }

    public static long jnidispatchI(int i) {
        if (i == 0) {
            return AnonymousClass11P.A01(INSTANCE.jniCallbacksIJniCallbacks.A00) / 1000;
        }
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i == 3 ? 2 : 0;
        }
        try {
            AnonymousClass1HU r2 = (AnonymousClass1HU) INSTANCE.jniCallbacksIJniCallbacks.A0G.get();
            if (C18070vi.A18(C17960vV.A01, true)) {
                return 0;
            }
            AnonymousClass00H r1 = r2.A02;
            if (!((C23651Hc) ((C203811x) r1.get()).A05.get()).A02()) {
                return 0;
            }
            AnonymousClass1OZ r12 = (AnonymousClass1OZ) ((C203811x) r1.get()).A03.get();
            return (!r12.A02.A07 || r12.A0I == null) ? 0 : 1;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIII(long j, long j2) {
        boolean z;
        try {
            AnonymousClass1D5 r6 = INSTANCE.jniCallbacksIJniCallbacksAndroidIntegrity;
            int i = (int) j;
            int i2 = (int) j2;
            Map map = r6.A02;
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                return 0;
            }
            Map map2 = (Map) C200510q.A01(valueOf, map);
            Integer valueOf2 = Integer.valueOf(i);
            if (!map2.containsKey(valueOf2)) {
                return 0;
            }
            if (i2 == 0) {
                z = C18020vd.A05(C18040vf.A02, r6.A00, ((Number) C200510q.A01(valueOf2, map2)).intValue());
            } else {
                z = C18020vd.A05(C18040vf.A02, r6.A01, ((Number) C200510q.A01(valueOf2, map2)).intValue());
            }
            return z ? 1 : 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            MsysError msysError = (MsysError) obj7;
            if (msysError != null) {
                msysError.getCode();
            }
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        int i;
        Object obj17 = obj3;
        Object obj18 = obj;
        Object obj19 = obj14;
        Object obj20 = obj2;
        Object obj21 = obj15;
        Object obj22 = obj4;
        Object obj23 = obj6;
        Object obj24 = obj10;
        Object obj25 = obj11;
        Object obj26 = obj12;
        Object obj27 = obj13;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj16;
            int i3 = (int) j2;
            int i4 = (int) j3;
            int i5 = (0 > j12 ? 1 : (0 == j12 ? 0 : -1));
            boolean z = false;
            if (i5 != 0) {
                z = true;
            }
            String str = (String) obj18;
            int i6 = (int) j4;
            String str2 = (String) obj20;
            String str3 = (String) obj17;
            String str4 = (String) obj22;
            boolean z2 = false;
            if (0 != j13) {
                z2 = true;
            }
            String str5 = (String) obj23;
            Map map = (Map) obj19;
            Map map2 = (Map) obj21;
            String str6 = (String) obj24;
            String str7 = (String) obj25;
            String str8 = (String) obj26;
            AnonymousClass2SG r2 = (AnonymousClass2SG) obj27;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j15 = j10;
            long j16 = j9;
            String str9 = str8;
            Map map3 = map;
            Map map4 = map2;
            int i7 = i2;
            String str10 = str4;
            String str11 = str5;
            String str12 = str6;
            String str13 = str7;
            AnonymousClass2SG r18 = r2;
            String str14 = str;
            String str15 = str2;
            String str16 = str3;
            r18.A0B(str14, str15, str16, str10, str11, str12, str13, str9, map3, map4, i7, i, i3, i4, i6, j8, j16, j15, z, z2);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        Object obj8 = obj6;
        Object obj9 = obj5;
        Object obj10 = obj3;
        Object obj11 = obj2;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            String str = (String) obj;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j7) {
                z = true;
            }
            String str2 = (String) obj11;
            String str3 = (String) obj10;
            String str4 = (String) obj9;
            int i5 = (int) j4;
            int i6 = (int) j5;
            AnonymousClass2SG r5 = (AnonymousClass2SG) obj8;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A07(str, str2, str3, str4, i2, i, i3, i4, i5, i6, j6, z);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIO(long j, long j2, long j3, long j4, long j5, Object obj) {
        Object obj2 = obj;
        try {
            AnonymousClass1D2 r7 = INSTANCE.jniCallbacksIJniCallbacks;
            C18180vt r1 = new C18180vt((int) j3, (int) j4, (int) j5, false);
            AnonymousClass18K r0 = r7.A01;
            r0.CC3(r1, (byte[]) obj2, (int) j, (int) j2);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIOOO(int i, long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3) {
        int i2;
        int i3;
        Object obj4 = obj2;
        Object obj5 = obj;
        Object obj6 = obj3;
        long j6 = j2;
        long j7 = j4;
        if (i == 0) {
            int i4 = (int) j;
            MsysError msysError = (MsysError) obj6;
            String str = (String) obj5;
            int i5 = (int) j6;
            int i6 = (int) j3;
            AnonymousClass2SG r9 = (AnonymousClass2SG) obj4;
            if (msysError != null) {
                i2 = msysError.getCode();
            } else {
                i2 = 0;
            }
            r9.A03(str, i4, i2, i5, i6, j7);
            return 0;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                int i7 = (int) j;
                MsysError msysError2 = (MsysError) obj6;
                String str2 = (String) obj5;
                int i8 = (int) j6;
                boolean z = false;
                if (0 != j5) {
                    z = true;
                }
                AnonymousClass2SG r92 = (AnonymousClass2SG) obj4;
                if (msysError2 != null) {
                    i3 = msysError2.getCode();
                } else {
                    i3 = 0;
                }
                r92.A04(str2, i7, i3, i8, j7, z);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    public static long jnidispatchIIIIIIOOOOOO(long j, long j2, long j3, long j4, long j5, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj6;
            int i3 = (int) j3;
            Map map = (Map) obj4;
            Map map2 = (Map) obj5;
            AnonymousClass2SG r5 = (AnonymousClass2SG) obj3;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0F(map, map2, i2, i, i3, j4, j5);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIOOOOOOO(long j, long j2, long j3, long j4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        int i;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj7;
            int i3 = (int) j2;
            String str = (String) obj;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            int i4 = (int) j3;
            Map map = (Map) obj5;
            Map map2 = (Map) obj6;
            AnonymousClass2SG r5 = (AnonymousClass2SG) obj4;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r5.A0C(str, str2, str3, map, map2, i2, i, i3, i4, j4);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOO(long j, long j2, Object obj, Object obj2) {
        try {
            throw new NullPointerException("completionCallback");
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIOOOOO(int i, long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        int i3;
        Object obj6 = obj3;
        Object obj7 = obj4;
        Object obj8 = obj2;
        Object obj9 = obj;
        Object obj10 = obj5;
        long j3 = j;
        long j4 = j2;
        if (i == 0) {
            int i4 = (int) j3;
            MsysError msysError = (MsysError) obj10;
            String str = (String) obj8;
            String str2 = (String) obj6;
            AnonymousClass2SG r7 = (AnonymousClass2SG) obj7;
            if (msysError != null) {
                i2 = msysError.getCode();
            } else {
                i2 = 0;
            }
            r7.A06(str, str2, i4, i2, j4);
            return 0;
        } else if (i != 1) {
            return 0;
        } else {
            try {
                int i5 = (int) j3;
                MsysError msysError2 = (MsysError) obj10;
                String str3 = (String) obj9;
                int i6 = (int) j2;
                String str4 = (String) obj8;
                AnonymousClass2SG r72 = (AnonymousClass2SG) obj7;
                if (msysError2 != null) {
                    i3 = msysError2.getCode();
                } else {
                    i3 = 0;
                }
                r72.A05(str3, str4, i5, i3, i6);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013b, code lost:
        if (r2.moveToNext() != false) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIIO(int r17, long r18, java.lang.Object r20) {
        /*
            r10 = 1
            r8 = 0
            r3 = r17
            r1 = r18
            if (r17 == 0) goto L_0x00f3
            r0 = 1
            if (r3 == r0) goto L_0x009b
            r0 = 2
            if (r3 == r0) goto L_0x0029
            r0 = 3
            if (r3 == r0) goto L_0x0014
            return r8
        L_0x0014:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017c }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017c }
            int r3 = (int) r1     // Catch:{ Exception -> 0x017c }
            X.00H r0 = r0.A08     // Catch:{ Exception -> 0x017c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017c }
            X.2bO r0 = (X.C52732bO) r0     // Catch:{ Exception -> 0x017c }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x017c }
            X.1PC r0 = r0.A07     // Catch:{ Exception -> 0x017c }
            r0.A02(r3)     // Catch:{ Exception -> 0x017c }
            return r10
        L_0x0029:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017c }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017c }
            int r5 = (int) r1     // Catch:{ Exception -> 0x017c }
            X.00H r0 = r0.A08     // Catch:{ Exception -> 0x017c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017c }
            X.2bO r0 = (X.C52732bO) r0     // Catch:{ Exception -> 0x017c }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x017c }
            X.1PC r0 = r0.A07     // Catch:{ Exception -> 0x017c }
            X.1MH r0 = r0.A01     // Catch:{ Exception -> 0x017c }
            X.1at r7 = r0.get()     // Catch:{ Exception -> 0x017c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ed }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00ed }
            java.lang.String r2 = "SELECT COUNT(*) AS count FROM prekeys WHERE prekey_id = ?"
            r4 = 1
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ed }
            r3 = 0
            r1[r3] = r0     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "SignalPreKeyStore/containsPreKey"
            android.database.Cursor r2 = r6.A0A(r2, r0, r1)     // Catch:{ all -> 0x00ed }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = "count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008f }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x008f }
            if (r0 > 0) goto L_0x006a
            r4 = 0
        L_0x006a:
            r3 = r4
        L_0x006b:
            r2.close()     // Catch:{ all -> 0x00ed }
            r7.close()     // Catch:{ Exception -> 0x017c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017c }
            r1.<init>()     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = "SignalPreKeyStore/containsPreKey has a pre key with id "
            r1.append(r0)     // Catch:{ Exception -> 0x017c }
            r1.append(r5)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ Exception -> 0x017c }
            r1.append(r3)     // Catch:{ Exception -> 0x017c }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x017c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x017c }
            goto L_0x0161
        L_0x008f:
            r1 = move-exception
            if (r2 == 0) goto L_0x009a
            r2.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0096:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00ed }
        L_0x009a:
            throw r1     // Catch:{ all -> 0x00ed }
        L_0x009b:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017c }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017c }
            int r6 = (int) r1     // Catch:{ Exception -> 0x017c }
            X.00H r0 = r0.A0E     // Catch:{ Exception -> 0x017c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017c }
            X.2bR r0 = (X.C52762bR) r0     // Catch:{ Exception -> 0x017c }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x017c }
            X.1PD r0 = r0.A0A     // Catch:{ Exception -> 0x017c }
            X.1MH r0 = r0.A01     // Catch:{ Exception -> 0x017c }
            X.1au r7 = r0.A06()     // Catch:{ Exception -> 0x017c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ed }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "signed_prekeys"
            java.lang.String r3 = "prekey_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ed }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00ed }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeSignedPreKey"
            int r0 = r5.A04(r4, r3, r0, r2)     // Catch:{ all -> 0x00ed }
            long r2 = (long) r0     // Catch:{ all -> 0x00ed }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ed }
            r1.<init>()     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = "SignalSignedPreKeyStore/removeSignedPreKey deleted "
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r2)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = " signed pre keys with id "
            r1.append(r0)     // Catch:{ all -> 0x00ed }
            r1.append(r6)     // Catch:{ all -> 0x00ed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ed }
            r7.close()     // Catch:{ Exception -> 0x017c }
            return r10
        L_0x00ed:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0177 }
            goto L_0x017b
        L_0x00f3:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x017c }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x017c }
            int r4 = (int) r1     // Catch:{ Exception -> 0x017c }
            X.00H r0 = r0.A0E     // Catch:{ Exception -> 0x017c }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x017c }
            X.2bR r0 = (X.C52762bR) r0     // Catch:{ Exception -> 0x017c }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x017c }
            X.1PD r0 = r0.A0A     // Catch:{ Exception -> 0x017c }
            X.1MH r0 = r0.A01     // Catch:{ Exception -> 0x017c }
            X.1at r5 = r0.get()     // Catch:{ Exception -> 0x017c }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0172 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0172 }
            java.lang.String r13 = "signed_prekeys"
            r3 = 1
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = "record"
            r2 = 0
            r14[r2] = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r15 = "prekey_id = ?"
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x0172 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0172 }
            r1[r2] = r0     // Catch:{ all -> 0x0172 }
            java.lang.String r20 = "SignalSignedPreKeyStore/containsSignedPreKey"
            r17 = 0
            r19 = r17
            r16 = r1
            r18 = r17
            android.database.Cursor r2 = r12.A0B(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0172 }
            if (r2 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r3 = 0
            goto L_0x013d
        L_0x0137:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x0135
        L_0x013d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r1.<init>()     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "SignalSignedPreKeyStore/containsSignedPreKey has a signed pre key with id "
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            r1.append(r4)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            r1.append(r3)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0166 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x015e
            r2.close()     // Catch:{ all -> 0x0172 }
        L_0x015e:
            r5.close()     // Catch:{ Exception -> 0x017c }
        L_0x0161:
            if (r3 != 0) goto L_0x0165
            r10 = 0
        L_0x0165:
            return r10
        L_0x0166:
            r1 = move-exception
            if (r2 == 0) goto L_0x0171
            r2.close()     // Catch:{ all -> 0x016d }
            goto L_0x0171
        L_0x016d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0172 }
        L_0x0171:
            throw r1     // Catch:{ all -> 0x0172 }
        L_0x0172:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0177 }
            goto L_0x017b
        L_0x0177:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x017c }
        L_0x017b:
            throw r1     // Catch:{ Exception -> 0x017c }
        L_0x017c:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1D8 r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIIO(int, long, java.lang.Object):long");
    }

    public static long jnidispatchIIOO(int i, long j, Object obj, Object obj2) {
        int i2;
        int i3;
        switch (i) {
            case 0:
                int i4 = (int) j;
                byte[] bArr = (byte[]) obj2;
                C52762bR r1 = (C52762bR) INSTANCE.jniCallbacksIJniCallbacks.A0E.get();
                if (bArr == null || bArr.length <= 0) {
                    return 0;
                }
                r1.A00.A0A.A00(i4, bArr);
                return 1;
            case 1:
                AnonymousClass1P3 r6 = (AnonymousClass1P3) INSTANCE.jniCallbacksIJniCallbacks.A0D.get();
                int i5 = (((int) j) % 16777214) + 1;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    arrayList.add(new C52972bm(((Integer) entry.getKey()).intValue(), (byte[]) entry.getValue()));
                }
                r6.A0X(arrayList, i5);
                return 0;
            case 2:
                List list = (List) obj2;
                C52732bO r3 = (C52732bO) INSTANCE.jniCallbacksIJniCallbacks.A08.get();
                int[] iArr = new int[list.size()];
                for (int i6 = 0; i6 < list.size(); i6++) {
                    iArr[i6] = ((Integer) list.get(i6)).intValue();
                }
                r3.A00.A07.A03(iArr);
                return 1;
            case 3:
                return ((C54622eR) INSTANCE.jniCallbacksIJniCallbacks.A0C.get()).A01.A0b(A00((String) obj, (int) j)) ? 1 : 0;
            case 4:
                ((C54622eR) INSTANCE.jniCallbacksIJniCallbacks.A0C.get()).A01.A0G(A00((String) obj, (int) j));
                return 1;
            case 5:
                throw new NullPointerException("socketReceiveHandler");
            case 6:
                try {
                    int i7 = (int) j;
                    MsysError msysError = (MsysError) obj2;
                    AnonymousClass2SG r12 = (AnonymousClass2SG) obj;
                    if (msysError != null) {
                        i3 = msysError.getCode();
                    } else {
                        i3 = 0;
                    }
                    r12.A01(i7, i3);
                    return 0;
                } catch (Exception e) {
                    INSTANCE.jniBridgeExceptionHandler.A00(e);
                    return 0;
                }
            case 7:
                int i8 = (int) j;
                MsysError msysError2 = (MsysError) obj2;
                AnonymousClass2SG r122 = (AnonymousClass2SG) obj;
                if (msysError2 != null) {
                    i2 = msysError2.getCode();
                } else {
                    i2 = 0;
                }
                r122.A00(i8, i2);
                return 0;
            default:
                return 0;
        }
    }

    public static long jnidispatchIIOOO(int i, long j, Object obj, Object obj2, Object obj3) {
        if (i == 0) {
            INSTANCE.jniCallbacksIJniCallbacks.A07.get();
            return 0;
        } else if (i == 1) {
            byte[] bArr = (byte[]) obj3;
            C52722bN r3 = (C52722bN) INSTANCE.jniCallbacksIJniCallbacks.A07.get();
            C60002nE A00 = A00((String) obj, (int) j);
            if (bArr == null) {
                r3.A00.A0S(A00);
                return 1;
            }
            try {
                r3.A00.A0a(new C58252kO(C63962tz.A01(bArr)), A00);
                return 1;
            } catch (C22511Ak e) {
                Log.e("IdentityKeyStoreImpl/Could not save the identity key.", e);
                return 0;
            }
        } else if (i == 2) {
            INSTANCE.jniCallbacksIJniCallbacks.A07.get();
            AnonymousClass1P0.A00(A00((String) obj, (int) j), (byte[]) obj3);
            return 1;
        } else if (i != 3) {
            return 0;
        } else {
            try {
                C54622eR r2 = (C54622eR) INSTANCE.jniCallbacksIJniCallbacks.A0C.get();
                return r2.A01.A0e(r2.A00.A01(A00((String) obj, (int) j)), (byte[]) obj3) ? 1 : 0;
            } catch (Exception e2) {
                INSTANCE.jniBridgeExceptionHandler.A00(e2);
                return 0;
            }
        }
    }

    public static long jnidispatchIIOOOO(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i3;
        if (i == 0) {
            byte[] bArr = (byte[]) obj4;
            C59982nC r2 = new C59982nC(A00((String) obj2, (int) j), (String) obj);
            AnonymousClass1P3 r0 = ((C52752bQ) INSTANCE.jniCallbacksIJniCallbacks.A0B.get()).A00;
            if (bArr == null) {
                r0.A08.A05(r2, false);
                return 1;
            }
            r0.A08.A03(r2, bArr);
            return 1;
        } else if (i == 1) {
            byte[] bArr2 = (byte[]) obj4;
            C59982nC r1 = new C59982nC(A00((String) obj2, (int) j), (String) obj);
            AnonymousClass1P3 r02 = ((C52712bM) INSTANCE.jniCallbacksIJniCallbacks.A06.get()).A00;
            if (bArr2 == null) {
                r02.A0W(r1);
                return 1;
            }
            r02.A05.A02(r1, bArr2);
            return 1;
        } else if (i == 2) {
            int i4 = (int) j;
            MsysError msysError = (MsysError) obj4;
            Map map = (Map) obj2;
            Map map2 = (Map) obj3;
            AnonymousClass2SG r10 = (AnonymousClass2SG) obj;
            if (msysError != null) {
                i2 = msysError.getCode();
            } else {
                i2 = 0;
            }
            r10.A0E(map, map2, i4, i2);
            return 0;
        } else if (i != 3) {
            return 0;
        } else {
            try {
                int i5 = (int) j;
                MsysError msysError2 = (MsysError) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                AnonymousClass2SG r12 = (AnonymousClass2SG) obj3;
                if (msysError2 != null) {
                    i3 = msysError2.getCode();
                } else {
                    i3 = 0;
                }
                r12.A02(i5, i3, str, str2);
                return 0;
            } catch (Exception e) {
                INSTANCE.jniBridgeExceptionHandler.A00(e);
                return 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d4, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d6, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0143, code lost:
        return (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIO(int r15, java.lang.Object r16) {
        /*
            r9 = r16
            r7 = 1
            r4 = 0
            switch(r15) {
                case 1: goto L_0x0144;
                case 2: goto L_0x012e;
                case 3: goto L_0x0117;
                case 4: goto L_0x0102;
                case 5: goto L_0x00ed;
                case 6: goto L_0x00dc;
                case 7: goto L_0x0078;
                case 8: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r4
        L_0x000a:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            byte[] r9 = (byte[]) r9     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A0G     // Catch:{ Exception -> 0x016f }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.1HU r1 = (X.AnonymousClass1HU) r1     // Catch:{ Exception -> 0x016f }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r1.A02     // Catch:{ Exception -> 0x016f }
            java.lang.Object r6 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.11x r6 = (X.C203811x) r6     // Catch:{ Exception -> 0x016f }
            X.00H r3 = r6.A03     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x016f }
            X.1OZ r0 = (X.AnonymousClass1OZ) r0     // Catch:{ Exception -> 0x016f }
            java.lang.String r1 = r0.A0B()     // Catch:{ Exception -> 0x016f }
            r0 = 12
            X.9F7 r2 = new X.9F7     // Catch:{ Exception -> 0x016f }
            r2.<init>((java.lang.String) r1, (byte[]) r9, (int) r0)     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r6.A02     // Catch:{ Exception -> 0x016f }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x016f }
            com.whatsapp.wamsys.JniBridge r14 = (com.whatsapp.wamsys.JniBridge) r14     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r6.A04     // Catch:{ Exception -> 0x016f }
            java.lang.Object r13 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.18K r13 = (X.AnonymousClass18K) r13     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r6.A01     // Catch:{ Exception -> 0x016f }
            java.lang.Object r10 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.195 r10 = (X.AnonymousClass195) r10     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r6.A05     // Catch:{ Exception -> 0x016f }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.1Hc r11 = (X.C23651Hc) r11     // Catch:{ Exception -> 0x016f }
            X.11P r12 = r6.A00     // Catch:{ Exception -> 0x016f }
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x016f }
            X.37J r9 = new X.37J     // Catch:{ Exception -> 0x016f }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x016f }
            java.lang.Object r10 = r3.get()     // Catch:{ Exception -> 0x016f }
            X.1OZ r10 = (X.AnonymousClass1OZ) r10     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r2.A00     // Catch:{ Exception -> 0x016f }
            X.1ca r0 = (X.C29621ca) r0     // Catch:{ Exception -> 0x016f }
            r15 = 32000(0x7d00, double:1.581E-319)
            r14 = 239(0xef, float:3.35E-43)
            r11 = r9
            r12 = r0
            r13 = r1
            boolean r0 = r10.A0N(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x016f }
            goto L_0x00d4
        L_0x0078:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            byte[] r9 = (byte[]) r9     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A0G     // Catch:{ Exception -> 0x016f }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.1HU r2 = (X.AnonymousClass1HU) r2     // Catch:{ Exception -> 0x016f }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ Exception -> 0x016f }
            java.util.Set r0 = r2.A03     // Catch:{ Exception -> 0x016f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ Exception -> 0x016f }
        L_0x0090:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x016f }
            X.1HT r0 = (X.AnonymousClass1HT) r0     // Catch:{ Exception -> 0x016f }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x0090
            goto L_0x00d9
        L_0x00a3:
            X.00H r3 = r2.A02     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x016f }
            X.11x r0 = (X.C203811x) r0     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A05     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.1Hc r0 = (X.C23651Hc) r0     // Catch:{ Exception -> 0x016f }
            boolean r0 = r0.A01()     // Catch:{ Exception -> 0x016f }
            if (r0 == 0) goto L_0x00ca
            X.00H r0 = r2.A01     // Catch:{ Exception -> 0x016f }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.0vd r2 = (X.C18020vd) r2     // Catch:{ Exception -> 0x016f }
            r1 = 9654(0x25b6, float:1.3528E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x016f }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x016f }
            goto L_0x00d7
        L_0x00ca:
            java.lang.Object r0 = r3.get()     // Catch:{ Exception -> 0x016f }
            X.11x r0 = (X.C203811x) r0     // Catch:{ Exception -> 0x016f }
            boolean r0 = r0.A01(r9)     // Catch:{ Exception -> 0x016f }
        L_0x00d4:
            if (r0 == 0) goto L_0x00d9
            return r7
        L_0x00d7:
            if (r0 == 0) goto L_0x00ca
        L_0x00d9:
            r7 = 0
            return r7
        L_0x00dc:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A0A     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            com.whatsapp.protocol.ProtocolJniHelper r0 = (com.whatsapp.protocol.ProtocolJniHelper) r0     // Catch:{ Exception -> 0x016f }
            byte r0 = r0.getTypeFromKeyValue(r9)     // Catch:{ Exception -> 0x016f }
            goto L_0x0142
        L_0x00ed:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A08     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.2bO r0 = (X.C52732bO) r0     // Catch:{ Exception -> 0x016f }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x016f }
            X.1P0 r0 = r0.A06     // Catch:{ Exception -> 0x016f }
            int r0 = r0.A01()     // Catch:{ Exception -> 0x016f }
            goto L_0x0142
        L_0x0102:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A08     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.2bO r0 = (X.C52732bO) r0     // Catch:{ Exception -> 0x016f }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x016f }
            X.1PC r0 = r0.A07     // Catch:{ Exception -> 0x016f }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x016f }
            goto L_0x0142
        L_0x0117:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A0E     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.2bR r0 = (X.C52762bR) r0     // Catch:{ Exception -> 0x016f }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x016f }
            X.2qS r0 = r0.A0I()     // Catch:{ Exception -> 0x016f }
            X.2BQ r0 = r0.A00     // Catch:{ Exception -> 0x016f }
            int r0 = r0.id_     // Catch:{ Exception -> 0x016f }
            goto L_0x0142
        L_0x012e:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A07     // Catch:{ Exception -> 0x016f }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.2bN r0 = (X.C52722bN) r0     // Catch:{ Exception -> 0x016f }
            X.1P3 r0 = r0.A00     // Catch:{ Exception -> 0x016f }
            X.1P0 r0 = r0.A06     // Catch:{ Exception -> 0x016f }
            int r0 = r0.A02()     // Catch:{ Exception -> 0x016f }
        L_0x0142:
            long r0 = (long) r0     // Catch:{ Exception -> 0x016f }
            return r0
        L_0x0144:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x016f }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r0.A0F     // Catch:{ Exception -> 0x016f }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.2dN r1 = (X.C53962dN) r1     // Catch:{ Exception -> 0x016f }
            X.1ca r9 = (X.C29621ca) r9     // Catch:{ Exception -> 0x016f }
            r0 = 6
            X.36y r8 = new X.36y     // Catch:{ Exception -> 0x016f }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x016f }
            X.00H r0 = r1.A01     // Catch:{ Exception -> 0x016f }
            java.lang.Object r7 = r0.get()     // Catch:{ Exception -> 0x016f }
            X.1OZ r7 = (X.AnonymousClass1OZ) r7     // Catch:{ Exception -> 0x016f }
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r10 = r9.A0Q(r1, r0)     // Catch:{ Exception -> 0x016f }
            r12 = 32000(0x7d00, double:1.581E-319)
            r11 = 344(0x158, float:4.82E-43)
            r7.A0J(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x016f }
            return r4
        L_0x016f:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1D8 r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIO(int, java.lang.Object):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0168, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long jnidispatchIOO(int r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r7 = r16
            r12 = 0
            if (r14 == 0) goto L_0x0097
            r0 = 1
            if (r14 == r0) goto L_0x0087
            r0 = 2
            if (r14 == r0) goto L_0x0077
            r0 = 3
            if (r14 != r0) goto L_0x0165
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0170 }
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ Exception -> 0x0170 }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ Exception -> 0x0170 }
            X.2dC r7 = (X.C53852dC) r7     // Catch:{ Exception -> 0x0170 }
            X.1jc r6 = r7.A01     // Catch:{ Exception -> 0x0170 }
            X.1jb r4 = r6.A03     // Catch:{ Exception -> 0x0170 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            r1.<init>()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "sendmethods/sendAttestationResult attestation="
            r1.append(r0)     // Catch:{ Exception -> 0x0170 }
            r1.append(r15)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0170 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "integrity_payload"
            r3 = 0
            X.1ca r1 = new X.1ca     // Catch:{ Exception -> 0x0170 }
            r1.<init>((java.lang.String) r0, (java.lang.String) r15, (X.AnonymousClass1MD[]) r3)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "ib"
            X.1ca r2 = new X.1ca     // Catch:{ Exception -> 0x0170 }
            r2.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r3)     // Catch:{ Exception -> 0x0170 }
            X.00H r0 = r4.A00     // Catch:{ Exception -> 0x0170 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0170 }
            X.1OZ r1 = (X.AnonymousClass1OZ) r1     // Catch:{ Exception -> 0x0170 }
            r0 = 194(0xc2, float:2.72E-43)
            boolean r5 = r1.A0O(r2, r0)     // Catch:{ Exception -> 0x0170 }
            X.1Cu r4 = new X.1Cu     // Catch:{ Exception -> 0x0170 }
            r4.<init>()     // Catch:{ Exception -> 0x0170 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0170 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x0170 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0170 }
            r4.A00 = r0     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = "safety-net-attestation"
            r4.A02 = r0     // Catch:{ Exception -> 0x0170 }
            if (r5 == 0) goto L_0x006d
            java.lang.String r0 = "success"
            goto L_0x006f
        L_0x006d:
            java.lang.String r0 = "failed"
        L_0x006f:
            r4.A01 = r0     // Catch:{ Exception -> 0x0170 }
            X.18K r0 = r6.A02     // Catch:{ Exception -> 0x0170 }
            r0.CC7(r4)     // Catch:{ Exception -> 0x0170 }
            return r12
        L_0x0077:
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0170 }
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ Exception -> 0x0170 }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ Exception -> 0x0170 }
            X.3Kh r7 = (X.C72013Kh) r7     // Catch:{ Exception -> 0x0170 }
            r7.BL0(r15)     // Catch:{ Exception -> 0x0170 }
            return r12
        L_0x0087:
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0170 }
            r0 = 0
            X.C18070vi.A0d(r7, r0)     // Catch:{ Exception -> 0x0170 }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ Exception -> 0x0170 }
            X.3Kh r7 = (X.C72013Kh) r7     // Catch:{ Exception -> 0x0170 }
            r7.BL0(r15)     // Catch:{ Exception -> 0x0170 }
            return r12
        L_0x0097:
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE     // Catch:{ Exception -> 0x0170 }
            X.1D2 r0 = r0.jniCallbacksIJniCallbacks     // Catch:{ Exception -> 0x0170 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0170 }
            r10 = 0
            X.2nE r6 = A00(r15, r10)     // Catch:{ Exception -> 0x0170 }
            X.00H r0 = r0.A0C     // Catch:{ Exception -> 0x0170 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0170 }
            X.2eR r1 = (X.C54622eR) r1     // Catch:{ Exception -> 0x0170 }
            X.00H r0 = r1.A02     // Catch:{ Exception -> 0x0170 }
            java.lang.Object r11 = r0.get()     // Catch:{ Exception -> 0x0170 }
            monitor-enter(r11)     // Catch:{ Exception -> 0x0170 }
            X.1P3 r5 = r1.A01     // Catch:{ all -> 0x016d }
            X.1Ov r4 = r5.A09     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "removeAllSessions"
            X.2nE r3 = X.C25601Ov.A00(r4, r6, r0)     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x016d }
            r1.<init>()     // Catch:{ all -> 0x016d }
            java.lang.String r7 = "SignalSessionStore/removeAllSessions "
            r1.append(r7)     // Catch:{ all -> 0x016d }
            r1.append(r6)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = " & translated="
            r1.append(r0)     // Catch:{ all -> 0x016d }
            r1.append(r3)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x016d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            if (r3 == 0) goto L_0x011b
            X.1MH r0 = r4.A01     // Catch:{ all -> 0x016d }
            X.1au r4 = r0.A06()     // Catch:{ all -> 0x016d }
            java.lang.String r9 = "recipient_account_id = ? AND recipient_account_type = ?"
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x0166 }
            r8[r10] = r0     // Catch:{ all -> 0x0166 }
            int r0 = r3.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0166 }
            r0 = 1
            r8[r0] = r1     // Catch:{ all -> 0x0166 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0166 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "sessions"
            java.lang.String r0 = "SignalSessionStore/removeAllSessionsSingleSession"
            int r0 = r2.A04(r1, r9, r0, r8)     // Catch:{ all -> 0x0166 }
            long r0 = (long) r0     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r2.<init>()     // Catch:{ all -> 0x0166 }
            r2.append(r7)     // Catch:{ all -> 0x0166 }
            r2.append(r0)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = " sessions with "
            r2.append(r0)     // Catch:{ all -> 0x0166 }
            r2.append(r3)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0166 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
            goto L_0x015c
        L_0x011b:
            r2 = 2
            r1 = 1
            X.1MH r0 = r4.A01     // Catch:{ all -> 0x016d }
            X.1au r4 = r0.A06()     // Catch:{ all -> 0x016d }
            java.lang.String r8 = "recipient_id = ? AND recipient_type = ?"
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r6.A03     // Catch:{ all -> 0x0166 }
            r3[r10] = r0     // Catch:{ all -> 0x0166 }
            int r0 = r6.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0166 }
            r3[r1] = r0     // Catch:{ all -> 0x0166 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0166 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "sessions"
            java.lang.String r0 = "SignalSessionStore/removeAllSessionsLegacy"
            int r0 = r2.A04(r1, r8, r0, r3)     // Catch:{ all -> 0x0166 }
            long r2 = (long) r0     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r1.<init>()     // Catch:{ all -> 0x0166 }
            r1.append(r7)     // Catch:{ all -> 0x0166 }
            r1.append(r2)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = " sessions with "
            r1.append(r0)     // Catch:{ all -> 0x0166 }
            r1.append(r6)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0166 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0166 }
        L_0x015c:
            r4.close()     // Catch:{ all -> 0x016d }
            r5.A0G(r6)     // Catch:{ all -> 0x016d }
            monitor-exit(r11)     // Catch:{ all -> 0x016d }
            r12 = 1
        L_0x0165:
            return r12
        L_0x0166:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ Exception -> 0x0170 }
        L_0x0170:
            r1 = move-exception
            com.whatsapp.wamsys.JniBridge r0 = INSTANCE
            X.1D8 r0 = r0.jniBridgeExceptionHandler
            r0.A00(r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wamsys.JniBridge.jnidispatchIOO(int, java.lang.Object, java.lang.Object):long");
    }

    public static long jnidispatchIOOO(Object obj, Object obj2, Object obj3) {
        try {
            byte[] bArr = (byte[]) obj3;
            C72123Ks r4 = (C72123Ks) obj;
            C17960vV.A0F(((C52702bL) INSTANCE.jniCallbacksIJniCallbacks.A05.get()).A00.A0G.A03(), "Not running on SignalExecutor thread");
            if (r4 == null) {
                return 0;
            }
            r4.BcN(bArr);
            return 1;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static Object jnidispatchOOO(Object obj, Object obj2) {
        try {
            Map map = (Map) obj2;
            C54622eR r4 = (C54622eR) INSTANCE.jniCallbacksIJniCallbacks.A0C.get();
            if (map == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                Object obj3 = map.get(num);
                C17960vV.A07(obj3);
                arrayList.add(A00((String) obj3, intValue));
            }
            HashSet A0M = r4.A01.A0M(arrayList);
            HashMap hashMap = new HashMap();
            Iterator it = A0M.iterator();
            while (it.hasNext()) {
                C60002nE r2 = (C60002nE) it.next();
                hashMap.put(Integer.valueOf(r2.A00), r2.A03);
            }
            return hashMap;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static Object jnidispatchOOOOO(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr;
        try {
            String str = (String) obj;
            List list = (List) obj3;
            List list2 = (List) obj4;
            byte[] bArr = (byte[]) obj2;
            ProtocolJniHelper protocolJniHelper = (ProtocolJniHelper) INSTANCE.jniCallbacksIJniCallbacks.A0A.get();
            Object[] objArr2 = null;
            if (list != null) {
                objArr = list.toArray();
            } else {
                objArr = null;
            }
            if (list2 != null) {
                objArr2 = list2.toArray();
            }
            return protocolJniHelper.createProtocolTreeNode(str, objArr, objArr2, bArr);
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return null;
        }
    }

    public static void setDependencies(C22481Ad r3) {
        synchronized (JniBridge.class) {
            if (DEPENDENCIES == null) {
                DEPENDENCIES = r3;
            } else {
                throw new IllegalStateException("JniBridgeDependencies are already set. Can't override them.");
            }
        }
    }

    public byte[] WCIAPIGcmAesCreateEncryptedCiphertext(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i) {
        return (byte[]) jvidispatchOIOOOOO(5, 16, this.wajContext.get(), bArr, bArr2, bArr3, bArr4);
    }

    public C52782bT WcmBotMessageSecretAPICreateWithMessageSecret(C61252pN r4) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOO(8, this.wajContext.get(), r4.A00);
        if (nativeHolder != null) {
            return new C52782bT(nativeHolder);
        }
        return null;
    }

    public C52792bU WcmMsmsgSecretAPICreateFromBotMessageSecret(C52782bT r7, String str, UserJid userJid, UserJid userJid2) {
        NativeHolder nativeHolder = (NativeHolder) jvidispatchOOOOOO(0, str, this.wajContext.get(), r7.A00, userJid.getRawString(), userJid2.getRawString());
        if (nativeHolder != null) {
            return new C52792bU(nativeHolder);
        }
        return null;
    }

    public JniBridge(AnonymousClass1D2 r2, AnonymousClass1D3 r3, AnonymousClass1D4 r4, AnonymousClass1D5 r5, AnonymousClass1D8 r6) {
        this.jniCallbacksIJniCallbacks = r2;
        this.jniCallbacksIJniCallbacksAndroidRegistration = r3;
        this.jniCallbacksIJniCallbacksAndroidGpia = r4;
        this.jniCallbacksIJniCallbacksAndroidIntegrity = r5;
        this.jniBridgeExceptionHandler = r6;
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        int i;
        Object obj22 = obj10;
        Object obj23 = obj9;
        Object obj24 = obj7;
        Object obj25 = obj19;
        Object obj26 = obj5;
        Object obj27 = obj6;
        Object obj28 = obj4;
        Object obj29 = obj3;
        Object obj30 = obj2;
        Object obj31 = obj;
        Object obj32 = obj8;
        Object obj33 = obj11;
        Object obj34 = obj12;
        Object obj35 = obj13;
        Object obj36 = obj14;
        Object obj37 = obj15;
        Object obj38 = obj20;
        Object obj39 = obj17;
        Object obj40 = obj18;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj21;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j28) {
                z = true;
            }
            String str = (String) obj31;
            int i5 = (int) j4;
            int i6 = (int) j5;
            String str2 = (String) obj30;
            String str3 = (String) obj29;
            String str4 = (String) obj28;
            boolean z2 = false;
            if (0 != j29) {
                z2 = true;
            }
            int i7 = (int) j8;
            String str5 = (String) obj26;
            String str6 = (String) obj27;
            String str7 = (String) obj24;
            int i8 = (int) j9;
            String str8 = (String) obj32;
            boolean z3 = false;
            if (0 != j30) {
                z3 = true;
            }
            String str9 = (String) obj23;
            int i9 = (int) j10;
            int i10 = (int) j11;
            int i11 = (int) j12;
            String str10 = (String) obj22;
            int i12 = (int) j13;
            Map map = (Map) obj40;
            Map map2 = (Map) obj25;
            int i13 = (int) j14;
            String str11 = (String) obj33;
            int i14 = (int) j15;
            String str12 = (String) obj34;
            String str13 = (String) obj35;
            int i15 = (int) j16;
            String str14 = (String) obj36;
            String str15 = (String) obj37;
            List list = (List) obj38;
            int i16 = (int) j17;
            boolean z4 = false;
            if (0 != j31) {
                z4 = true;
            }
            int i17 = (int) j18;
            AnonymousClass2SG r9 = (AnonymousClass2SG) obj39;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j32 = j25;
            long j33 = j24;
            long j34 = j23;
            long j35 = j22;
            long j36 = j21;
            long j37 = j20;
            long j38 = j19;
            String str16 = str12;
            String str17 = str13;
            String str18 = str14;
            String str19 = str15;
            List list2 = list;
            Map map3 = map;
            Map map4 = map2;
            int i18 = i2;
            int i19 = i3;
            int i20 = i4;
            int i21 = i5;
            int i22 = i6;
            int i23 = i7;
            int i24 = i8;
            int i25 = i9;
            int i26 = i10;
            int i27 = i11;
            int i28 = i12;
            int i29 = i13;
            int i30 = i14;
            int i31 = i15;
            int i32 = i16;
            int i33 = i17;
            AnonymousClass2SG r28 = r9;
            String str20 = str;
            String str21 = str2;
            String str22 = str3;
            String str23 = str4;
            String str24 = str5;
            String str25 = str6;
            String str26 = str7;
            String str27 = str8;
            String str28 = str9;
            String str29 = str10;
            String str30 = str11;
            r28.A08(str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str16, str17, str18, str19, list2, map3, map4, i18, i, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, j38, j37, j36, j35, j34, j33, j32, j26, j27, z, z2, z3, z4);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22, Object obj23) {
        int i;
        Object obj24 = obj19;
        Object obj25 = obj22;
        Object obj26 = obj18;
        Object obj27 = obj17;
        Object obj28 = obj16;
        Object obj29 = obj21;
        Object obj30 = obj10;
        Object obj31 = obj20;
        Object obj32 = obj11;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj23;
            String str = (String) obj;
            int i3 = (int) j2;
            int i4 = (int) j3;
            String str2 = (String) obj2;
            String str3 = (String) obj3;
            String str4 = (String) obj4;
            String str5 = (String) obj5;
            String str6 = (String) obj6;
            int i5 = (int) j4;
            String str7 = (String) obj7;
            String str8 = (String) obj8;
            String str9 = (String) obj9;
            boolean z = false;
            if (0 != j18) {
                z = true;
            }
            String str10 = (String) obj30;
            int i6 = (int) j5;
            String str11 = (String) obj32;
            Map map = (Map) obj31;
            Map map2 = (Map) obj29;
            int i7 = (int) j6;
            String str12 = (String) obj28;
            String str13 = (String) obj27;
            String str14 = (String) obj26;
            List list = (List) obj25;
            AnonymousClass2SG r6 = (AnonymousClass2SG) obj24;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            r6.A09(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, list, map, map2, i2, i, i3, i4, i5, i6, i7, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, z);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }

    public static long jnidispatchIIIIIIIIIIIIIIIIOOOOOOOOOOOOOOOOO(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        int i;
        Object obj18 = obj14;
        Object obj19 = obj13;
        Object obj20 = obj4;
        Object obj21 = obj;
        Object obj22 = obj2;
        Object obj23 = obj15;
        Object obj24 = obj3;
        Object obj25 = obj16;
        Object obj26 = obj5;
        Object obj27 = obj7;
        Object obj28 = obj8;
        Object obj29 = obj9;
        Object obj30 = obj10;
        Object obj31 = obj12;
        try {
            int i2 = (int) j;
            MsysError msysError = (MsysError) obj17;
            int i3 = (int) j2;
            int i4 = (int) j3;
            boolean z = false;
            if (0 != j13) {
                z = true;
            }
            String str = (String) obj21;
            String str2 = (String) obj22;
            String str3 = (String) obj24;
            String str4 = (String) obj20;
            String str5 = (String) obj26;
            String str6 = (String) obj27;
            String str7 = (String) obj28;
            String str8 = (String) obj29;
            boolean z2 = false;
            if (0 != j14) {
                z2 = true;
            }
            String str9 = (String) obj30;
            int i5 = (int) j4;
            boolean z3 = false;
            if (0 != j15) {
                z3 = true;
            }
            Map map = (Map) obj23;
            Map map2 = (Map) obj25;
            String str10 = (String) obj31;
            String str11 = (String) obj19;
            AnonymousClass2SG r5 = (AnonymousClass2SG) obj18;
            if (msysError != null) {
                i = msysError.getCode();
            } else {
                i = 0;
            }
            long j16 = j10;
            long j17 = j9;
            Map map3 = map;
            Map map4 = map2;
            int i6 = i2;
            int i7 = i3;
            int i8 = i4;
            int i9 = i5;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            String str15 = str8;
            String str16 = str9;
            String str17 = str10;
            String str18 = str11;
            AnonymousClass2SG r20 = r5;
            String str19 = str;
            String str20 = str2;
            String str21 = str3;
            String str22 = str4;
            r20.A0A(str19, str20, str21, str22, str12, str13, str14, str15, str16, str17, str18, map3, map4, i6, i, i7, i8, i9, j17, j16, j11, j12, z, z2, z3);
            return 0;
        } catch (Exception e) {
            INSTANCE.jniBridgeExceptionHandler.A00(e);
            return 0;
        }
    }
}
