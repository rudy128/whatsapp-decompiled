package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.stream.CipherBuilder;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CuL  reason: case insensitive filesystem */
public final class C26193CuL {
    public int A00;
    public CipherBuilder A01;
    public LocalChannel A02;
    public final Handler A03;
    public final C25118CYr A04 = new C25118CYr();
    public final C26149CtE A05;
    public final BTU A06;
    public final BTY A07;
    public final BTF A08;
    public final Connection A09;
    public final Object A0A;
    public final Runnable A0B;
    public final Runnable A0C;
    public final AtomicBoolean A0D;
    public final C18090vk A0E;
    public final C22821Di A0F;
    public final C22821Di A0G;
    public final C22821Di A0H;
    public final Looper A0I;
    public final Service A0J;
    public final Object A0K;
    public final C18090vk A0L;

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.BTY] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.BTU, java.lang.Object] */
    public C26193CuL(Looper looper, C26149CtE ctE, BTF btf, Connection connection, C18090vk r10, C18090vk r11, C22821Di r12, C22821Di r13, C22821Di r14) {
        this.A08 = btf;
        this.A09 = connection;
        this.A05 = ctE;
        this.A0F = r12;
        this.A0H = r13;
        this.A0G = r14;
        this.A0E = r10;
        this.A0L = r11;
        this.A0I = looper;
        Service service = new Service(5);
        service.onReceived = new C27447DfY(this, 0);
        service.onConnected = C28138Drw.A00;
        service.onDisconnected = C28139Drx.A00;
        C26294Cx6.A06("LinkSetup", "Registering service.");
        connection.register(service);
        this.A0J = service;
        LocalChannel localChannel = new LocalChannel(this.A09, 5);
        localChannel.onReceived = new C27446DfX(this, 3);
        localChannel.onError = new C27943Dof(this);
        localChannel.onClosed = C27887DnO.A00;
        this.A02 = localChannel;
        ? obj = new Object();
        obj.A06 = null;
        obj.A02 = null;
        obj.A04 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A03 = null;
        obj.A00 = null;
        this.A07 = obj;
        Handler handler = null;
        ? obj2 = new Object();
        obj2.A01 = null;
        obj2.A00 = null;
        this.A06 = obj2;
        this.A0A = C17880vN.A0p();
        this.A0K = C17880vN.A0p();
        this.A0D = BE6.A16(false);
        this.A03 = looper != null ? new Handler(looper) : handler;
        this.A0B = new C27080DTf((Object) this, 2);
        this.A0C = new C27080DTf((Object) this, 3);
    }

    public static final CipherBuilder A00(C26193CuL cuL) {
        CipherBuilder cipherBuilder;
        synchronized (cuL.A0K) {
            cipherBuilder = cuL.A01;
            if (cipherBuilder == null) {
                cipherBuilder = new CipherBuilder();
                cuL.A01 = cipherBuilder;
            }
        }
        return cipherBuilder;
    }

    public static final void A02(C26193CuL cuL, C22821Di r8) {
        String str;
        Hash hash;
        byte[] byteArray;
        byte[] byteArray2;
        BTU btu = cuL.A06;
        synchronized (btu) {
            r8.invoke(btu);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("------------------------------------------");
            A10.append(10);
            A10.append("Checking encryption success");
            StringBuilder A0j = BE8.A0j(A10);
            A0j.append("TX challenge: ");
            Hash hash2 = btu.A01;
            String str2 = null;
            if (hash2 == null || (byteArray2 = hash2.toByteArray()) == null) {
                str = null;
            } else {
                str = C200410p.A0J(C28140Dry.A00, byteArray2);
            }
            C108985cd.A1L(str, A0j, A10);
            StringBuilder A0j2 = BE8.A0j(A10);
            A0j2.append("RX challenge: ");
            Hash hash3 = btu.A00;
            if (!(hash3 == null || (byteArray = hash3.toByteArray()) == null)) {
                str2 = C200410p.A0J(C28140Dry.A00, byteArray);
            }
            C108985cd.A1L(str2, A0j2, A10);
            A10.append(10);
            C26294Cx6.A06("LinkSetup", C18070vi.A0H(A10));
            Hash hash4 = btu.A01;
            if (!(hash4 == null || (hash = btu.A00) == null)) {
                Handler handler = cuL.A03;
                if (handler != null) {
                    handler.removeCallbacks(cuL.A0B);
                }
                cuL.A0F.invoke(new BTT(hash4, hash));
                cuL.A04.A01(new CVm("Encrypting links successful!"));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.E57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.E57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.E57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.E57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.E57} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.E57} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C26193CuL r13, X.C22821Di r14) {
        /*
            X.BTY r3 = r13.A07
            monitor-enter(r3)
            r14.invoke(r3)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Checking end link success: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = "LinkSetup"
            X.C26294Cx6.A06(r5, r0)     // Catch:{ all -> 0x00d3 }
            java.util.UUID r11 = r3.A06     // Catch:{ all -> 0x00d3 }
            if (r11 == 0) goto L_0x00d1
            java.util.UUID r12 = r3.A05     // Catch:{ all -> 0x00d3 }
            if (r12 == 0) goto L_0x00d1
            X.C0r r10 = r3.A03     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x00d1
            X.C0r r2 = r3.A04     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x00d1
            X.E57 r8 = r3.A02     // Catch:{ all -> 0x00d3 }
            if (r8 != 0) goto L_0x002e
            X.DHg r8 = new X.DHg     // Catch:{ all -> 0x00d3 }
            r8.<init>()     // Catch:{ all -> 0x00d3 }
        L_0x002e:
            X.E57 r9 = r3.A01     // Catch:{ all -> 0x00d3 }
            if (r9 != 0) goto L_0x0037
            X.DHg r9 = new X.DHg     // Catch:{ all -> 0x00d3 }
            r9.<init>()     // Catch:{ all -> 0x00d3 }
        L_0x0037:
            X.CVn r7 = r3.A00     // Catch:{ all -> 0x00d3 }
            if (r7 == 0) goto L_0x00d1
            android.os.Handler r1 = r13.A03     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x0044
            java.lang.Runnable r0 = r13.A0C     // Catch:{ all -> 0x00d3 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x00d3 }
        L_0x0044:
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "----------------------------"
            r6.append(r0)     // Catch:{ all -> 0x00d3 }
            r4 = 10
            r6.append(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Link setup finished..."
            r6.append(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.BE8.A0j(r6)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "RxId: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.BEA.A1L(r12, r1, r6)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "TxId: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.BEA.A1L(r11, r1, r6)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Rx target state: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.BEA.A1L(r10, r1, r6)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Tx target state: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.BEA.A1L(r2, r1, r6)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Contains RX transform: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.E57 r0 = r3.A01     // Catch:{ all -> 0x00d3 }
            r2 = 1
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.AnonymousClass8BS.A1D(r1, r6)     // Catch:{ all -> 0x00d3 }
            java.lang.StringBuilder r1 = X.BE8.A0j(r6)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Contains TX transform: "
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            X.E57 r0 = r3.A02     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x00ab
            r2 = 0
        L_0x00ab:
            r1.append(r2)     // Catch:{ all -> 0x00d3 }
            X.AnonymousClass8BS.A1D(r1, r6)     // Catch:{ all -> 0x00d3 }
            r6.append(r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = X.C18070vi.A0H(r6)     // Catch:{ all -> 0x00d3 }
            X.C26294Cx6.A06(r5, r0)     // Catch:{ all -> 0x00d3 }
            X.CYr r2 = r13.A04     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = "End link setup successful!"
            X.CVm r0 = new X.CVm     // Catch:{ all -> 0x00d3 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d3 }
            r2.A01(r0)     // Catch:{ all -> 0x00d3 }
            X.1Di r0 = r13.A0H     // Catch:{ all -> 0x00d3 }
            X.BTX r6 = new X.BTX     // Catch:{ all -> 0x00d3 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d3 }
            r0.invoke(r6)     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r3)
            return
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26193CuL.A03(X.CuL, X.1Di):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|(1:7)|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A0A
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0D     // Catch:{ all -> 0x0047 }
            boolean r0 = X.AnonymousClass8BV.A1Z(r0)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0045
            r1 = 0
            r3.A01 = r1     // Catch:{ all -> 0x0047 }
            X.BTU r0 = r3.A06     // Catch:{ all -> 0x0047 }
            r0.A01 = r1     // Catch:{ all -> 0x0047 }
            r0.A00 = r1     // Catch:{ all -> 0x0047 }
            X.BTY r0 = r3.A07     // Catch:{ all -> 0x0047 }
            r0.A05 = r1     // Catch:{ all -> 0x0047 }
            r0.A03 = r1     // Catch:{ all -> 0x0047 }
            r0.A06 = r1     // Catch:{ all -> 0x0047 }
            r0.A04 = r1     // Catch:{ all -> 0x0047 }
            r0.A02 = r1     // Catch:{ all -> 0x0047 }
            r0.A03 = r1     // Catch:{ all -> 0x0047 }
            r0.A00 = r1     // Catch:{ all -> 0x0047 }
            android.os.Handler r1 = r3.A03     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0032
            java.lang.Runnable r0 = r3.A0B     // Catch:{ all -> 0x0047 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0047 }
            java.lang.Runnable r0 = r3.A0C     // Catch:{ all -> 0x0047 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0047 }
        L_0x0032:
            com.facebook.wearable.datax.LocalChannel r1 = r3.A02     // Catch:{ all -> 0x0047 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0047 }
            r1.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            com.facebook.wearable.datax.Service r0 = r3.A0J     // Catch:{ all -> 0x0047 }
            r0.unregister()     // Catch:{ all -> 0x0047 }
            X.0vk r0 = r3.A0L     // Catch:{ all -> 0x0047 }
            r0.invoke()     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r2)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26193CuL.A04():void");
    }

    public static final void A01(C26193CuL cuL, C18090vk r3) {
        Object obj;
        try {
            obj = r3.invoke();
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            cuL.A0G.invoke(A002);
            cuL.A04();
        }
    }
}
