package X;

import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Cw0  reason: case insensitive filesystem */
public final class C26256Cw0 {
    public CL5 A00;
    public LocalChannel A01;
    public C22821Di A02;
    public C22821Di A03;
    public final C26149CtE A04;
    public final C22867BTb A05;
    public final Connection A06;
    public final ConcurrentHashMap A07 = AnonymousClass8BR.A17();
    public final ConcurrentHashMap A08 = AnonymousClass8BR.A17();
    public final Service A09;

    public static final void A02(C24496C6o c6o, CL5 cl5, C25057CVn cVn, C26256Cw0 cw0) {
        C26149CtE ctE = cw0.A04;
        AnonymousClass1JD r2 = new AnonymousClass1JD();
        if (cVn != null) {
            r2.addAll(cVn.A00);
        }
        if (cl5 != null) {
            r2.addAll(cl5.A00.A00);
        }
        AnonymousClass1JD r1 = new AnonymousClass1JD();
        if (cVn != null) {
            r1.addAll(cVn.A01);
        }
        if (cl5 != null) {
            r1.addAll(cl5.A00.A01);
        }
        ctE.A07(c6o, new C25057CVn(r2, r1));
        ctE.A05();
        C22821Di r12 = cw0.A02;
        if (r12 != null) {
            r12.invoke(new BWG(c6o));
        }
    }

    public static final void A03(C24496C6o c6o, C26256Cw0 cw0) {
        C26149CtE ctE = cw0.A04;
        CL6 A042 = ctE.A04();
        if (A042 != null) {
            try {
                A042.A00.flush();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
        }
        ctE.A06(c6o);
        if (AnonymousClass8BV.A1Z(ctE.A0D)) {
            C26294Cx6.A06(ctE.A0A, "Output activated");
        }
        C22821Di r1 = cw0.A02;
        if (r1 != null) {
            r1.invoke(new BWH(c6o));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C24276ByZ r5, X.C26256Cw0 r6) {
        /*
            X.ByZ r0 = X.C24276ByZ.BleL2Cap
            if (r5 == r0) goto L_0x0008
            X.ByZ r0 = X.C24276ByZ.BtcRfcomm
            if (r5 != r0) goto L_0x0070
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap r4 = r6.A08
            java.util.Set r0 = r4.entrySet()
            X.C18070vi.A0X(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0015:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0071
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.C6o r0 = (X.C24496C6o) r0
            X.ByZ r1 = r0.A02()
            X.ByZ r0 = X.C24276ByZ.WifiTcpIp
            if (r1 != r0) goto L_0x0015
        L_0x0031:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r2 == 0) goto L_0x003c
            java.lang.Object r0 = r2.getKey()
            r4.remove(r0)
        L_0x003c:
            java.util.concurrent.ConcurrentHashMap r4 = r6.A07
            java.util.Set r0 = r4.entrySet()
            X.C18070vi.A0X(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0049:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r2 = r3.next()
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.C6o r0 = (X.C24496C6o) r0
            X.ByZ r1 = r0.A02()
            X.ByZ r0 = X.C24276ByZ.WifiTcpIp
            if (r1 != r0) goto L_0x0049
            r5 = r2
        L_0x0065:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0070
            java.lang.Object r0 = r5.getKey()
            r4.remove(r0)
        L_0x0070:
            return
        L_0x0071:
            r2 = r5
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26256Cw0.A04(X.ByZ, X.Cw0):void");
    }

    public static final void A05(C26256Cw0 cw0, UUID uuid, C22821Di r16, int i, int i2, boolean z) {
        int i3;
        C26256Cw0 cw02 = cw0;
        UUID uuid2 = uuid;
        C22821Di r7 = r16;
        int i4 = i2;
        C28088Dr2 dr2 = new C28088Dr2(cw0, uuid2, r7, i4, z);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Attempting Switching Tx: ");
        A10.append(uuid2);
        int i5 = i;
        C25330Cdb.A01(AnonymousClass001.A1I(", attempt: ", A10, i5), new Object[0]);
        C18070vi.A0d(uuid2, 0);
        C23624Bmt A0N = C23627Bmw.DEFAULT_INSTANCE.A0N();
        ((C23627Bmw) C17880vN.A0G(A0N)).target_ = DSQ.A01(C24591CAm.A00(uuid2), 0, 16);
        C23577Bm6 A0C = A0N.A0C();
        if (z) {
            i3 = 4128;
        } else {
            i3 = 4117;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(A0C.A0J((EAO) null));
        C18070vi.A0b(allocateDirect);
        A0C.writeTo(new C24226Bxe(allocateDirect));
        allocateDirect.flip();
        C25527ChP chP = new C25527ChP(i3, allocateDirect);
        LocalChannel localChannel = cw02.A01;
        if (localChannel == null) {
            localChannel = new LocalChannel(cw02.A06, 10);
            localChannel.onError = C28135Drt.A00;
            localChannel.onClosed = C27886DnN.A00;
            cw02.A01 = localChannel;
        }
        cw02.A04.A08(new C28094Dr8(cw02, localChannel, chP, r7, dr2, i5, i4));
    }

    public static final void A06(C26256Cw0 cw0, C22821Di r8) {
        C22867BTb bTb = cw0.A05;
        synchronized (bTb) {
            r8.invoke(bTb);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("----------------------------------------------");
            A10.append(10);
            A10.append("LinkSwitch Values:");
            StringBuilder A0j = BE8.A0j(A10);
            A0j.append("Current TX link type -> ");
            BEA.A1L(bTb.A04, A0j, A10);
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Current TX link id -> ");
            BEA.A1L(bTb.A06, A102, A10);
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("Current RX link type -> ");
            BEA.A1L(bTb.A03, A103, A10);
            StringBuilder A104 = AnonymousClass000.A10();
            A104.append("Current RX link id -> ");
            BEA.A1L(bTb.A05, A104, A10);
            A10.append("----------------------------------------------");
            A10.append(10);
            A10.append("Validation Values:");
            StringBuilder A0j2 = BE8.A0j(A10);
            A0j2.append("TX id -> ");
            BEA.A1L(bTb.A08, A0j2, A10);
            StringBuilder A105 = AnonymousClass000.A10();
            A105.append("RX id -> ");
            BEA.A1L(bTb.A07, A105, A10);
            StringBuilder A106 = AnonymousClass000.A10();
            A106.append("Rollover data -> ");
            BEA.A1L(bTb.A02, A106, A10);
            C26294Cx6.A04("LinkManagerImpl", C18070vi.A0H(A10));
            if (C18070vi.A18(bTb.A08, bTb.A06) && C18070vi.A18(bTb.A07, bTb.A05)) {
                C26294Cx6.A06("LinkManagerImpl", "Link switch complete!");
                bTb.A08 = null;
                bTb.A07 = null;
                ConcurrentHashMap concurrentHashMap = cw0.A08;
                C24496C6o c6o = (C24496C6o) concurrentHashMap.get(bTb.A06);
                if (c6o != null) {
                    C24496C6o c6o2 = bTb.A01;
                    bTb.A01 = c6o;
                    concurrentHashMap.put(A01(c6o2), c6o2);
                    C41681wt.A03(concurrentHashMap).remove(c6o.A07());
                    ConcurrentHashMap concurrentHashMap2 = cw0.A07;
                    concurrentHashMap2.put(A00(c6o2), c6o2);
                    C41681wt.A03(concurrentHashMap2).remove(c6o.A06());
                    C25647Cjd cjd = bTb.A00;
                    if (cjd != null) {
                        C25647Cjd.A00(cjd, bTb.A01.A02());
                    }
                    A04(bTb.A01.A02(), cw0);
                } else {
                    throw C17880vN.A0f("Link to switch to not available");
                }
            }
        }
    }

    public C26256Cw0(C24496C6o c6o, C26149CtE ctE, Connection connection) {
        C18070vi.A0k(connection, ctE);
        this.A06 = connection;
        this.A04 = ctE;
        UUID A002 = A00(c6o);
        UUID A012 = A01(c6o);
        C24276ByZ A022 = c6o.A02();
        this.A05 = new C22867BTb(c6o, A022, A022, A012, A002, new AtomicBoolean());
        Service service = new Service(10);
        service.onReceived = new DsW(this);
        service.onConnected = C28136Dru.A00;
        service.onDisconnected = C28137Drv.A00;
        connection.register(service);
        this.A09 = service;
    }

    public static final UUID A00(C24496C6o c6o) {
        UUID A062 = c6o.A06();
        if (A062 != null) {
            return A062;
        }
        throw AnonymousClass000.A0k("Link must have ids");
    }

    public static final UUID A01(C24496C6o c6o) {
        UUID A072 = c6o.A07();
        if (A072 != null) {
            return A072;
        }
        throw AnonymousClass000.A0k("Link must have ids");
    }
}
