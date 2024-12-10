package X;

import android.os.Looper;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.datax.Connection;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Csp  reason: case insensitive filesystem */
public final class C26127Csp {
    public C24496C6o A00;
    public C26256Cw0 A01;
    public C26193CuL A02;
    public C25691CkM A03;
    public BTW A04;
    public final C26149CtE A05;
    public final C26149CtE A06;
    public final Connection A07;
    public final Connection A08;
    public final C24810CLd A09;
    public final ArrayDeque A0A = new ArrayDeque();
    public final UUID A0B;
    public final UUID A0C;
    public final AtomicBoolean A0D = new AtomicBoolean();
    public final AtomicBoolean A0E;
    public final C22821Di A0F;
    public final AnonymousClass1OS A0G;
    public final CCP A0H;
    public final AtomicBoolean A0I = new AtomicBoolean();
    public final C22821Di A0J;
    public final C22821Di A0K;

    public C26127Csp(CCP ccp, UUID uuid, C22821Di r8, C22821Di r9, C22821Di r10, AnonymousClass1OS r11) {
        C18070vi.A0d(ccp, 6);
        this.A0C = uuid;
        this.A0F = r8;
        this.A0J = r9;
        this.A0G = r11;
        this.A0K = r10;
        this.A0H = ccp;
        this.A0B = uuid;
        this.A0E = C108965cb.A0w();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("lam:LinkedDevice-");
        A10.append(uuid);
        C26149CtE ctE = new C26149CtE(A00(), AnonymousClass000.A0y("-Main", A10));
        ctE.A04 = new C27446DfX(this, 15);
        ctE.A02 = new C27446DfX(this, 16);
        ctE.A03 = new C27446DfX(this, 17);
        this.A05 = ctE;
        StringBuilder A11 = AnonymousClass000.A11("lam:LinkedDevice-");
        A11.append(uuid);
        C26149CtE ctE2 = new C26149CtE(A00(), AnonymousClass000.A0y("-Preamble", A11));
        this.A06 = ctE2;
        C24585CAg cAg = Connection.Companion;
        Connection connection = new Connection((AnonymousClass1OS) new C27447DfY(ctE2, 3));
        ctE2.A04 = new C27446DfX(this, 18);
        this.A08 = connection;
        this.A07 = new Connection((AnonymousClass1OS) new C27447DfY(ctE, 2));
        this.A09 = new C24810CLd(this);
    }

    public static final CRX A00() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 120, timeUnit, new LinkedBlockingDeque(), DW8.A00);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 120, timeUnit, new LinkedBlockingDeque(), DW9.A00);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        return new CRX(threadPoolExecutor, threadPoolExecutor2);
    }

    public static final void A02(C26127Csp csp, C18090vk r6) {
        if (csp.A0I.compareAndSet(false, true)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Device disposed ");
            UUID uuid = csp.A0B;
            C26294Cx6.A06("lam:LinkedDevice", C17890vO.A0V(uuid, A10));
            C25691CkM ckM = csp.A03;
            if (ckM != null) {
                ckM.A01();
            }
            C26193CuL cuL = csp.A02;
            if (cuL != null) {
                cuL.A04();
            }
            csp.A0E.set(false);
            ArrayDeque arrayDeque = csp.A0A;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                try {
                    ((C18090vk) it.next()).invoke();
                } catch (Throwable th) {
                    C30691eM.A00(th);
                }
            }
            arrayDeque.clear();
            r6.invoke();
            if (!csp.A0D.get()) {
                C26294Cx6.A06("lam:LinkedDevice", AnonymousClass001.A1E(uuid, "Device link disconnected ", AnonymousClass000.A10()));
            }
            csp.A0J.invoke(csp);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.meta.common.monad.railway.Result A01(X.C24496C6o r11, X.C25057CVn r12, X.C26256Cw0 r13, X.C26127Csp r14, X.C24374C0r r15) {
        /*
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "switchLink: Switching to linkType="
            r2.append(r0)
            X.ByZ r1 = r11.A02()
            java.lang.String r0 = X.C17890vO.A0V(r1, r2)
            java.lang.String r3 = "lam:LinkedDevice"
            X.C26294Cx6.A06(r3, r0)
            X.Cjd r5 = new X.Cjd     // Catch:{ all -> 0x0143 }
            r5.<init>()     // Catch:{ all -> 0x0143 }
            r8 = r13
            X.1Di r2 = r13.A02     // Catch:{ all -> 0x0143 }
            if (r2 == 0) goto L_0x0028
            X.BWI r0 = new X.BWI     // Catch:{ all -> 0x0143 }
            r0.<init>(r1)     // Catch:{ all -> 0x0143 }
            r2.invoke(r0)     // Catch:{ all -> 0x0143 }
        L_0x0028:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "----------------------------------------"
            r7.append(r0)     // Catch:{ all -> 0x0143 }
            r2 = 10
            java.lang.StringBuilder r4 = X.BE8.A0j(r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Checking if link is desired type: "
            r4.append(r0)     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r1, r4, r7)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Current TX link type -> "
            r4.append(r0)     // Catch:{ all -> 0x0143 }
            X.BTb r6 = r13.A05     // Catch:{ all -> 0x0143 }
            X.ByZ r0 = r6.A04     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r0, r4, r7)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Current RX link type -> "
            r4.append(r0)     // Catch:{ all -> 0x0143 }
            X.ByZ r0 = r6.A03     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r0, r4, r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = X.C18070vi.A0H(r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "LinkManagerImpl"
            X.C26294Cx6.A06(r4, r0)     // Catch:{ all -> 0x0143 }
            X.ByZ r0 = r6.A04     // Catch:{ all -> 0x0143 }
            if (r0 != r1) goto L_0x007e
            X.ByZ r0 = r6.A03     // Catch:{ all -> 0x0143 }
            if (r0 != r1) goto L_0x007e
            java.lang.String r0 = "Link is already in desired state, skipping switch"
            X.C26294Cx6.A06(r4, r0)     // Catch:{ all -> 0x0143 }
        L_0x0073:
            X.C25647Cjd.A00(r5, r1)     // Catch:{ all -> 0x0143 }
        L_0x0076:
            java.lang.Object r4 = r5.A01()     // Catch:{ all -> 0x0143 }
            X.ByZ r4 = (X.C24276ByZ) r4     // Catch:{ all -> 0x0143 }
            goto L_0x0148
        L_0x007e:
            X.C0r r0 = X.C24374C0r.MAIN     // Catch:{ all -> 0x0143 }
            if (r15 != r0) goto L_0x0101
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "-----------------------------------"
            r7.append(r0)     // Catch:{ all -> 0x0143 }
            r7.append(r2)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Switching link directly to main"
            r7.append(r0)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r2 = X.BE8.A0j(r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Type: "
            r2.append(r0)     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r1, r2, r7)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "TxId: "
            r2.append(r0)     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = r11.A07()     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r0, r2, r7)     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "RxId: "
            r2.append(r0)     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = r11.A06()     // Catch:{ all -> 0x0143 }
            X.BEA.A1L(r0, r2, r7)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = X.C18070vi.A0H(r7)     // Catch:{ all -> 0x0143 }
            X.C26294Cx6.A06(r4, r0)     // Catch:{ all -> 0x0143 }
            X.C6o r4 = r6.A01     // Catch:{ all -> 0x0143 }
            r6.A01 = r11     // Catch:{ all -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap r2 = r13.A08     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A01(r4)     // Catch:{ all -> 0x0143 }
            r2.put(r0, r4)     // Catch:{ all -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap r2 = r13.A07     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A00(r4)     // Catch:{ all -> 0x0143 }
            r2.put(r0, r4)     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A01(r11)     // Catch:{ all -> 0x0143 }
            r6.A06 = r0     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A00(r11)     // Catch:{ all -> 0x0143 }
            r6.A05 = r0     // Catch:{ all -> 0x0143 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0143 }
            r6.A04 = r1     // Catch:{ all -> 0x0143 }
            r6.A03 = r1     // Catch:{ all -> 0x0143 }
            X.C26256Cw0.A03(r11, r13)     // Catch:{ all -> 0x0143 }
            X.CtE r0 = r13.A04     // Catch:{ all -> 0x0143 }
            X.CL5 r0 = r0.A03()     // Catch:{ all -> 0x0143 }
            X.C26256Cw0.A02(r11, r0, r12, r13)     // Catch:{ all -> 0x0143 }
            X.C26256Cw0.A04(r1, r13)     // Catch:{ all -> 0x0143 }
            goto L_0x0073
        L_0x0101:
            java.util.concurrent.ConcurrentHashMap r4 = r13.A08     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A01(r11)     // Catch:{ all -> 0x0143 }
            r4.put(r0, r11)     // Catch:{ all -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap r2 = r13.A07     // Catch:{ all -> 0x0143 }
            java.util.UUID r0 = X.C26256Cw0.A00(r11)     // Catch:{ all -> 0x0143 }
            r2.put(r0, r11)     // Catch:{ all -> 0x0143 }
            X.Dqr r0 = new X.Dqr     // Catch:{ all -> 0x0143 }
            r0.<init>(r5, r11, r12)     // Catch:{ all -> 0x0143 }
            X.C26256Cw0.A06(r13, r0)     // Catch:{ all -> 0x0143 }
            java.util.UUID r9 = X.C26256Cw0.A01(r11)     // Catch:{ all -> 0x0143 }
            r11 = 0
            java.lang.Object r0 = r4.get(r9)     // Catch:{ all -> 0x0143 }
            X.C6o r0 = (X.C24496C6o) r0     // Catch:{ all -> 0x0143 }
            if (r0 == 0) goto L_0x0134
            X.Dqp r10 = new X.Dqp     // Catch:{ all -> 0x0143 }
            r10.<init>(r0, r13, r9)     // Catch:{ all -> 0x0143 }
            r13 = r11
            r12 = r11
            X.C26256Cw0.A05(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0143 }
            goto L_0x0076
        L_0x0134:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = "Attempting to switch to link not in ready state: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r9, r0, r2)     // Catch:{ all -> 0x0143 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0143 }
            throw r0     // Catch:{ all -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            X.1IU r4 = X.C108945cZ.A1J(r0)
        L_0x0148:
            java.lang.Throwable r2 = X.C30671eK.A00(r4)
            if (r2 != 0) goto L_0x0162
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link switched to "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            X.C26294Cx6.A06(r3, r0)
            r0 = 1
            com.meta.common.monad.railway.Result r1 = new com.meta.common.monad.railway.Result
            r1.<init>(r0, r4)
            return r1
        L_0x0162:
            X.ByZ r0 = X.C24276ByZ.BtcRfcomm
            if (r1 != r0) goto L_0x0174
            X.1Di r1 = r14.A0K
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_SWITCH_TO_BTC
        L_0x016a:
            r1.invoke(r0)
        L_0x016d:
            r0 = 0
            com.meta.common.monad.railway.Result r1 = new com.meta.common.monad.railway.Result
            r1.<init>(r0, r2)
            return r1
        L_0x0174:
            X.ByZ r0 = X.C24276ByZ.WifiTcpIp
            if (r1 != r0) goto L_0x016d
            X.1Di r1 = r14.A0K
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_SWITCH_TO_WIFI
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26127Csp.A01(X.C6o, X.CVn, X.Cw0, X.Csp, X.C0r):com.meta.common.monad.railway.Result");
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.BTF, java.lang.Object] */
    public final void A03(C24496C6o c6o, BTW btw) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Opening device ");
        UUID uuid = this.A0B;
        A10.append(uuid);
        A10.append(" of type ");
        C24496C6o c6o2 = c6o;
        C26294Cx6.A06("lam:LinkedDevice", C17890vO.A0V(c6o2.A02(), A10));
        BTW btw2 = btw;
        this.A04 = btw2;
        this.A00 = c6o2;
        C26149CtE ctE = this.A06;
        ctE.A03();
        ctE.A04();
        Connection connection = this.A08;
        connection.reset();
        PrivateKey privateKey = btw2.A00;
        PublicKey publicKey = btw2.A01;
        PrivateKey privateKey2 = privateKey;
        this.A03 = new C25691CkM(privateKey2, publicKey, connection, new C27557DhO(this), new C27446DfX(this, 12));
        ? obj = new Object();
        C27446DfX dfX = new C27446DfX(this, 13);
        C27446DfX dfX2 = new C27446DfX(this, 14);
        Looper mainLooper = Looper.getMainLooper();
        C28055DqV dqV = new C28055DqV(c6o2, this);
        C27897DnY dnY = C27897DnY.A00;
        C27898DnZ dnZ = C27898DnZ.A00;
        C18070vi.A0l(dnY, dnZ);
        this.A02 = new C26193CuL(mainLooper, ctE, obj, connection, dnY, dnZ, dfX, dqV, dfX2);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(AnonymousClass001.A1E(uuid, "Settings up secure link ", AnonymousClass000.A10()));
        StringBuilder A0j = BE8.A0j(A102);
        A0j.append("  - app key: ");
        byte[] serialize = privateKey.recoverPublicKey().serialize();
        C28147Ds7 ds7 = C28147Ds7.A00;
        C108985cd.A1L(C200410p.A0J(ds7, serialize), A0j, A102);
        StringBuilder A0j2 = BE8.A0j(A102);
        A0j2.append("  - device key: ");
        C108985cd.A1L(C200410p.A0J(ds7, publicKey.serialize()), A0j2, A102);
        A102.append(10);
        C26294Cx6.A06("lam:LinkedDevice", C18070vi.A0H(A102));
        ctE.A07(c6o2, (C25057CVn) null);
        ctE.A06(c6o2);
        if (AnonymousClass8BV.A1Z(ctE.A0D)) {
            C26294Cx6.A06(ctE.A0A, "Output activated");
        }
        C26193CuL cuL = this.A02;
        if (cuL != null) {
            C26193CuL.A01(cuL, new C27519Dgm(cuL));
        }
        ctE.A05();
    }

    public final boolean A04() {
        C24276ByZ byZ;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("getTransportType: type=");
        C24496C6o c6o = this.A00;
        C24276ByZ byZ2 = null;
        if (c6o != null) {
            byZ = c6o.A02();
        } else {
            byZ = null;
        }
        C26294Cx6.A06("lam:LinkedDevice", C17890vO.A0V(byZ, A10));
        C24496C6o c6o2 = this.A00;
        if (c6o2 != null) {
            byZ2 = c6o2.A02();
        }
        return AnonymousClass000.A1Z(byZ2, C24276ByZ.BtcRfcomm);
    }
}
