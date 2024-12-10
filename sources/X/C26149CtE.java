package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CtE  reason: case insensitive filesystem */
public final class C26149CtE {
    public CSY A00;
    public CRW A01;
    public C22821Di A02;
    public C22821Di A03;
    public C22821Di A04;
    public AnonymousClass1OS A05;
    public final C24922CPt A06;
    public final C25204Cax A07;
    public final CRX A08;
    public final Object A09;
    public final String A0A;
    public final ByteBuffer A0B;
    public final AtomicBoolean A0C;
    public final AtomicBoolean A0D;
    public final AtomicBoolean A0E;
    public final Runnable A0F;

    public final void A06(C24496C6o c6o) {
        C18070vi.A0d(c6o, 0);
        synchronized (this.A09) {
            if (this.A01 == null) {
                String str = this.A0A;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("attach output ");
                C24276ByZ A022 = c6o.A02();
                A10.append(A022);
                A10.append(" (transformer=");
                E57 A012 = c6o.A01();
                C26294Cx6.A06(str, C17900vP.A0F(A10, AnonymousClass000.A1W(A012)));
                OutputStream A042 = c6o.A04();
                WritableByteChannel newChannel = Channels.newChannel(A042);
                C18070vi.A0X(newChannel);
                this.A01 = new CRW(A012, A022, A042, newChannel);
            } else {
                throw AnonymousClass000.A0n("output already attached");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.1JD, X.1JC] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.1JD, X.1JC] */
    public final void A07(C24496C6o c6o, C25057CVn cVn) {
        AnonymousClass1JD r0;
        AnonymousClass1JD r02;
        C18070vi.A0d(c6o, 0);
        synchronized (this.A09) {
            if (this.A00 == null) {
                String str = this.A0A;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("attach input ");
                C24276ByZ A022 = c6o.A02();
                A10.append(A022);
                A10.append(" (transformer=");
                E57 A002 = c6o.A00();
                A10.append(AnonymousClass000.A1W(A002));
                A10.append(") rollover(queued=");
                C25057CVn cVn2 = null;
                if (cVn != null) {
                    r0 = cVn.A00;
                } else {
                    r0 = null;
                }
                A10.append(r0);
                A10.append(", received=");
                if (cVn != null) {
                    r02 = cVn.A01;
                } else {
                    r02 = null;
                }
                C26294Cx6.A06(str, AnonymousClass001.A1F(r02, A10));
                if (cVn != null) {
                    AnonymousClass1JD<ByteBuffer> r03 = cVn.A00;
                    ArrayList A0E2 = C29351c6.A0E(r03);
                    for (ByteBuffer duplicate : r03) {
                        A0E2.add(duplicate.duplicate());
                    }
                    ? r3 = new AnonymousClass1JC();
                    Object[] array = A0E2.toArray(BE6.A1Z());
                    r3.A02 = array;
                    int length = array.length;
                    r3.A01 = length;
                    if (length == 0) {
                        r3.A02 = AnonymousClass1JD.A03;
                    }
                    AnonymousClass1JD<ByteBuffer> r04 = cVn.A01;
                    ArrayList A0E3 = C29351c6.A0E(r04);
                    for (ByteBuffer duplicate2 : r04) {
                        A0E3.add(duplicate2.duplicate());
                    }
                    ? r2 = new AnonymousClass1JC();
                    Object[] array2 = A0E3.toArray(BE6.A1Z());
                    r2.A02 = array2;
                    int length2 = array2.length;
                    r2.A01 = length2;
                    if (length2 == 0) {
                        r2.A02 = AnonymousClass1JD.A03;
                    }
                    cVn2 = new C25057CVn(r3, r2);
                }
                InputStream A032 = c6o.A03();
                ReadableByteChannel newChannel = Channels.newChannel(A032);
                C18070vi.A0X(newChannel);
                this.A00 = new CSY(cVn2, A002, A022, A032, newChannel);
            } else {
                throw AnonymousClass000.A0n("input already attached");
            }
        }
        if (this.A0C.get()) {
            A01(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0038 A[EDGE_INSN: B:36:0x0038->B:22:0x0038 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ IOException -> 0x0042 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C25792Cm4 A00(X.C26149CtE r6, java.nio.ByteBuffer r7, boolean r8) {
        /*
            X.CRW r5 = r6.A01
            if (r5 == 0) goto L_0x000c
            java.util.concurrent.atomic.AtomicBoolean r4 = r6.A0D
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x000f
        L_0x000c:
            X.Cm4 r0 = X.C25792Cm4.A07
            return r0
        L_0x000f:
            boolean r0 = r7.hasRemaining()     // Catch:{ IOException -> 0x0042 }
            if (r0 == 0) goto L_0x0038
            X.E57 r0 = r5.A00     // Catch:{ IOException -> 0x0042 }
            if (r0 == 0) goto L_0x0020
            java.nio.ByteBuffer r2 = r0.CPh(r7)     // Catch:{ IOException -> 0x0042 }
            if (r2 != 0) goto L_0x0021
            goto L_0x0038
        L_0x0020:
            r2 = r7
        L_0x0021:
            X.1OS r1 = r6.A05     // Catch:{ IOException -> 0x0042 }
            if (r1 == 0) goto L_0x002c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ IOException -> 0x0042 }
            r1.invoke(r2, r0)     // Catch:{ IOException -> 0x0042 }
        L_0x002c:
            java.nio.channels.WritableByteChannel r1 = r5.A03     // Catch:{ IOException -> 0x0042 }
        L_0x002e:
            boolean r0 = r2.hasRemaining()     // Catch:{ IOException -> 0x0042 }
            if (r0 == 0) goto L_0x000f
            r1.write(r2)     // Catch:{ IOException -> 0x0042 }
            goto L_0x002e
        L_0x0038:
            if (r8 == 0) goto L_0x003f
            java.io.OutputStream r0 = r5.A02     // Catch:{ IOException -> 0x0042 }
            r0.flush()     // Catch:{ IOException -> 0x0042 }
        L_0x003f:
            X.Cm4 r0 = X.C25792Cm4.A08     // Catch:{ IOException -> 0x0042 }
            return r0
        L_0x0042:
            r3 = move-exception
            java.lang.String r2 = r6.A0A
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Write failed, type="
            r1.append(r0)
            X.ByZ r0 = r5.A01
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.C26294Cx6.A09(r2, r0, r3)
            java.nio.channels.WritableByteChannel r0 = r5.A03
            r0.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r1 = 1
            r0 = 0
            boolean r0 = r4.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x000c
            X.1Di r0 = r6.A03
            if (r0 == 0) goto L_0x000c
            r0.invoke(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26149CtE.A00(X.CtE, java.nio.ByteBuffer, boolean):X.Cm4");
    }

    public static final void A01(C26149CtE ctE) {
        CRX crx = ctE.A08;
        Runnable runnable = ctE.A0F;
        C18070vi.A0d(runnable, 0);
        crx.A00.execute(runnable);
    }

    public static final void A02(C26149CtE ctE, IOException iOException) {
        C22821Di r0;
        if (ctE.A0C.compareAndSet(true, false) && (r0 = ctE.A02) != null) {
            r0.invoke(iOException);
        }
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [X.1JD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.CL5 A03() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0C
            r8 = 0
            r0.set(r8)
            java.lang.Object r4 = r9.A09
            monitor-enter(r4)
            X.CSY r2 = r9.A00     // Catch:{ all -> 0x0092 }
            r7 = 0
            if (r2 == 0) goto L_0x0090
            r9.A00 = r7     // Catch:{ all -> 0x0092 }
            X.1JD r5 = new X.1JD     // Catch:{ all -> 0x0092 }
            r5.<init>()     // Catch:{ all -> 0x0092 }
            X.CVn r6 = r2.A01     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x001e
            X.1JD r0 = r6.A00     // Catch:{ all -> 0x0092 }
            r5.addAll(r0)     // Catch:{ all -> 0x0092 }
        L_0x001e:
            java.nio.ByteBuffer r1 = r9.A0B     // Catch:{ all -> 0x0092 }
            java.nio.ByteBuffer r0 = r1.duplicate()     // Catch:{ all -> 0x0092 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0092 }
            r5.add(r0)     // Catch:{ all -> 0x0092 }
            r1.limit(r8)     // Catch:{ all -> 0x0092 }
            java.io.InputStream r0 = r2.A03     // Catch:{ all -> 0x0043 }
            int r0 = r0.available()     // Catch:{ all -> 0x0043 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0043 }
            java.nio.channels.ReadableByteChannel r0 = r2.A04     // Catch:{ all -> 0x0043 }
            r0.read(r1)     // Catch:{ all -> 0x0043 }
            r1.flip()     // Catch:{ all -> 0x0043 }
            r5.add(r1)     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            X.C30691eM.A00(r0)     // Catch:{ all -> 0x0092 }
        L_0x0047:
            java.lang.String r3 = r9.A0A     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "detach input: queued="
            r2.append(r0)     // Catch:{ all -> 0x0092 }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0056:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0092 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0092 }
            int r0 = r0.remaining()     // Catch:{ all -> 0x0092 }
            int r8 = r8 + r0
            goto L_0x0056
        L_0x0068:
            r2.append(r8)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = ", received="
            r2.append(r0)     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x0074
            X.1JD r7 = r6.A01     // Catch:{ all -> 0x0092 }
        L_0x0074:
            java.lang.String r0 = X.C17890vO.A0V(r7, r2)     // Catch:{ all -> 0x0092 }
            X.C26294Cx6.A06(r3, r0)     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            X.1JD r1 = new X.1JD     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            goto L_0x0086
        L_0x0084:
            X.1JD r1 = r6.A01     // Catch:{ all -> 0x0092 }
        L_0x0086:
            X.CVn r0 = new X.CVn     // Catch:{ all -> 0x0092 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0092 }
            X.CL5 r7 = new X.CL5     // Catch:{ all -> 0x0092 }
            r7.<init>(r0)     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r4)
            return r7
        L_0x0092:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26149CtE.A03():X.CL5");
    }

    public final CL6 A04() {
        CL6 cl6;
        this.A0D.set(false);
        synchronized (this.A09) {
            CRW crw = this.A01;
            cl6 = null;
            if (crw != null) {
                this.A01 = null;
                C26294Cx6.A06(this.A0A, "detach output");
                cl6 = new CL6(crw.A02);
            }
        }
        return cl6;
    }

    public final void A05() {
        if (AnonymousClass8BV.A1Z(this.A0C)) {
            C26294Cx6.A06(this.A0A, "Activating Input");
            A01(this);
        }
    }

    public final void A08(C22821Di r7) {
        CRX crx = this.A08;
        if (crx.A03.get() == Thread.currentThread().getId()) {
            r7.invoke(this);
            return;
        }
        C27076DTa dTa = new C27076DTa(r7, this, 38);
        crx.A02.incrementAndGet();
        C27076DTa.A01(dTa, crx, crx.A01, 39);
    }

    public C26149CtE(CRX crx, String str) {
        String str2;
        this.A08 = crx;
        if (str != null) {
            str2 = AnonymousClass001.A1H("IOLinkPipeline-", str, AnonymousClass000.A10());
        } else {
            str2 = "IOLinkPipeline";
        }
        this.A0A = str2;
        this.A0C = BE6.A16(false);
        this.A0D = BE6.A16(false);
        this.A0E = BE6.A16(false);
        this.A06 = new C24922CPt(this);
        this.A09 = C17880vN.A0p();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(DefaultCrypto.BUFFER_SIZE);
        allocateDirect.limit(0);
        this.A0B = allocateDirect;
        this.A07 = new C25204Cax();
        this.A0F = new DTV(this);
    }
}
