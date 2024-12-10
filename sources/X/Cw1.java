package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.util.Base64;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityRequest;
import com.facebook.wearable.applinks.AppLinkLinkInfoRequest;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class Cw1 {
    public C26385Cyl A00;
    public C18090vk A01;
    public C22821Di A02;
    public C22821Di A03;
    public C22821Di A04;
    public C22821Di A05;
    public C22821Di A06;
    public C22821Di A07;
    public final BluetoothManager A08;
    public final Context A09;
    public final CCP A0A;
    public final C22869BTd A0B;
    public final ArrayDeque A0C = new ArrayDeque();
    public final ConcurrentHashMap A0D;
    public final ConcurrentHashMap A0E;
    public final ConcurrentHashMap A0F;
    public final Executor A0G;
    public final boolean A0H;
    public final CL9 A0I;

    public static final boolean A06(List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        if (AnonymousClass001.A0n(list, 0) > 126) {
            return true;
        }
        return AnonymousClass001.A0n(list, 0) == 126 && list.size() >= 5 && AnonymousClass001.A0n(list, 4) >= 20;
    }

    public static final PrivateKey A00(Cw1 cw1) {
        C26187CuB cuB = cw1.A0I.A00;
        String str = null;
        C26187CuB.A01(cuB);
        synchronized (cuB.A02) {
            try {
                String A0s = C17880vN.A0s("app-private-key", cuB.A05);
                if (A0s != null) {
                    str = A0s;
                }
            } catch (ClassCastException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("LightSharedPreferences threw an exception for Key: ");
                A10.append("app-private-key");
                A10.append("; Raw file: ");
                throw BE6.A0o(AnonymousClass000.A0y(cuB.A01.A00(), A10), e);
            }
        }
        if (str != null) {
            C24579CAa cAa = PrivateKey.Companion;
            byte[] decode = Base64.decode(str, 2);
            C18070vi.A0X(decode);
            PrivateKey privateKey = new PrivateKey();
            privateKey.setRaw(decode);
            return privateKey;
        }
        C26294Cx6.A06("lam:LinkedAppManager", "getAppPrivateKey: Generating new one");
        PrivateKey privateKey2 = new PrivateKey();
        privateKey2.generate();
        C26187CuB.A01(cuB);
        CPR cpr = new CPR(cuB);
        String encodeToString = Base64.encodeToString(privateKey2.serialize(), 2);
        if (!cpr.A01) {
            Map map = cpr.A00;
            if (encodeToString == null) {
                map.put("app-private-key", C26187CuB.A0B);
            } else {
                map.put("app-private-key", encodeToString);
            }
            synchronized (cpr) {
                if (!cpr.A01) {
                    cpr.A01 = true;
                } else {
                    throw AnonymousClass8BR.A0w("Trying to freeze an editor that is already frozen!");
                }
            }
            try {
                C27309Dbg dbg = new C27309Dbg();
                C26187CuB cuB2 = cpr.A02;
                synchronized (cuB2.A02) {
                    try {
                        Iterator A15 = AnonymousClass000.A15(map);
                        while (A15.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A15);
                            String A0x = C17880vN.A0x(A16);
                            Object value = A16.getValue();
                            if (value == C26187CuB.A0B) {
                                cuB2.A05.remove(A0x);
                            } else if (value != null) {
                                Map map2 = cuB2.A05;
                                if (!value.equals(map2.get(A0x))) {
                                    map2.put(A0x, value);
                                }
                            } else {
                                throw BE6.A0m();
                            }
                            dbg.add(A0x);
                        }
                        cuB2.A09.compareAndSet(false, !dbg.isEmpty());
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                map.clear();
                if (!dbg.isEmpty()) {
                    synchronized (cuB2) {
                        try {
                            Throwable th2 = new Throwable("commit stack");
                            Iterator it = dbg.iterator();
                            while (it.hasNext()) {
                                String A0v = C17880vN.A0v(it);
                                Iterator A152 = AnonymousClass000.A15(cuB2.A04);
                                while (A152.hasNext()) {
                                    Map.Entry A162 = AnonymousClass000.A16(A152);
                                    A162.getKey();
                                    ((Handler) A162.getValue()).post(new C21459AkQ(cuB2, A0v, th2));
                                }
                                Map map3 = (Map) cuB2.A06.get(A0v);
                                if (map3 != null) {
                                    Iterator A153 = AnonymousClass000.A15(map3);
                                    while (A153.hasNext()) {
                                        Map.Entry A163 = AnonymousClass000.A16(A153);
                                        A163.getKey();
                                        ((Handler) A163.getValue()).post(new C21459AkQ(cuB2, A0v, th2));
                                    }
                                }
                            }
                            cuB2.A00 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            throw th;
                        }
                    }
                    cuB2.A08.execute(C27082DTh.A00(cpr, 8));
                }
                synchronized (cpr) {
                    cpr.A01 = false;
                }
                return privateKey2;
            } catch (Throwable th4) {
                synchronized (cpr) {
                    cpr.A01 = false;
                    throw th4;
                }
            }
        } else {
            throw new ConcurrentModificationException("Editors shouldn't be modified during commit!");
        }
    }

    public static final void A01(BTW btw, Cw1 cw1, C24337BzY bzY, UUID uuid, C22821Di r14) {
        String str;
        C24376C0v c0v;
        if (!cw1.A0H) {
            C26294Cx6.A09("lam:LinkedAppManager", "getDeviceLinkInfo: Security not enabled.", (Throwable) null);
            r14.invoke(new C22868BTc((BTW) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, uuid));
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getDeviceLinkInfo: transportType=");
        if (bzY != null) {
            str = bzY.name();
        } else {
            str = null;
        }
        C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass000.A0y(str, A10));
        if (bzY == C24337BzY.WIFI_DIRECT) {
            c0v = C24376C0v.IPV4;
        } else {
            c0v = C24376C0v.BTC;
        }
        C23624Bmt A0N = C23651BnK.DEFAULT_INSTANCE.A0N();
        ((C23651BnK) C17880vN.A0G(A0N)).serviceUUID_ = DSQ.A01(C24591CAm.A00(uuid), 0, 16);
        ((C23651BnK) C17880vN.A0G(A0N)).linkType_ = c0v.BVW();
        ((C23651BnK) C17880vN.A0G(A0N)).requestType_ = C24373C0q.ACQUIRE.BVW();
        AppLinkLinkInfoRequest appLinkLinkInfoRequest = new AppLinkLinkInfoRequest((C23651BnK) A0N.A0C());
        C26385Cyl cyl = cw1.A00;
        if (cyl != null) {
            cyl.A00(appLinkLinkInfoRequest, new BWD(btw, cw1, uuid, r14));
        }
    }

    public static final void A02(Cw1 cw1) {
        cw1.A0E.clear();
        ArrayDeque arrayDeque = cw1.A0C;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            try {
                ((C18090vk) it.next()).invoke();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
        }
        arrayDeque.clear();
    }

    public static final void A03(Cw1 cw1, C24337BzY bzY, UUID uuid, C22821Di r5, AnonymousClass1OS r6) {
        BTW btw = (BTW) cw1.A0E.get(uuid);
        if (btw != null) {
            A01(btw, cw1, bzY, uuid, new C28053DqT(btw, r6));
            return;
        }
        A04(cw1, uuid, new C27980DpH(r5), new Dt0(cw1, bzY, r6));
    }

    public static final void A04(Cw1 cw1, UUID uuid, C22821Di r6, AnonymousClass1OS r7) {
        if (!cw1.A0H) {
            C26294Cx6.A09("lam:LinkedAppManager", "getDeviceIdentity: Security not enabled.", (Throwable) null);
            r6.invoke(C24361Bzw.NO_DEVICE_IDENTITY_KEYS);
            return;
        }
        C26294Cx6.A06("lam:LinkedAppManager", "getDeviceIdentity: Security enabled.");
        C23624Bmt A0N = C23638Bn7.DEFAULT_INSTANCE.A0N();
        ((C23638Bn7) C17880vN.A0G(A0N)).serviceUUID_ = DSQ.A01(C24591CAm.A00(uuid), 0, 16);
        A05(new C27846Dmh(new AppLinkDeviceIdentityRequest((C23638Bn7) A0N.A0C()), cw1, r6, r7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0046, code lost:
        if (A06(X.CCQ.A00(r4, "com.facebook.stella_debug")) != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Cw1(android.bluetooth.BluetoothManager r3, android.content.Context r4, X.CL9 r5, X.CCP r6, X.C22869BTd r7, java.util.concurrent.Executor r8) {
        /*
            r2 = this;
            boolean r1 = X.AnonymousClass8BU.A1X(r3)
            r2.<init>()
            r2.A09 = r4
            r2.A08 = r3
            r2.A0G = r8
            r2.A0I = r5
            r2.A0B = r7
            r2.A0A = r6
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.A0C = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            r2.A0D = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            r2.A0F = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r1)
            r2.A0E = r0
            java.lang.String r0 = "com.facebook.stella"
            java.util.List r0 = X.CCQ.A00(r4, r0)
            boolean r0 = A06(r0)
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = "com.facebook.stella_debug"
            java.util.List r0 = X.CCQ.A00(r4, r0)
            boolean r1 = A06(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            r2.A0H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cw1.<init>(android.bluetooth.BluetoothManager, android.content.Context, X.CL9, X.CCP, X.BTd, java.util.concurrent.Executor):void");
    }

    public static final void A05(C18090vk r2) {
        Object obj;
        try {
            obj = r2.invoke();
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            C26294Cx6.A09("lam:LinkedAppManager", "runSafely: error", A002);
        }
    }
}
