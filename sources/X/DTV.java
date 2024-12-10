package X;

import java.nio.ByteBuffer;

public final class DTV implements Runnable {
    public final /* synthetic */ C26149CtE A00;

    public DTV(C26149CtE ctE) {
        this.A00 = ctE;
    }

    public static final void A00(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (byteBuffer.position() == byteBuffer.limit()) {
            byteBuffer.limit(0);
        }
        if (byteBuffer.limit() == byteBuffer.capacity()) {
            if (byteBuffer.remaining() > byteBuffer.capacity() / 2) {
                byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.remaining());
                try {
                    byteBuffer2.put(byteBuffer);
                    byteBuffer2.flip();
                } catch (IllegalArgumentException e) {
                    throw new C1T(e);
                }
            } else {
                byteBuffer2 = byteBuffer.duplicate();
            }
            byteBuffer.clear();
            try {
                byteBuffer.put(byteBuffer2);
                byteBuffer.flip();
            } catch (IllegalArgumentException e2) {
                throw new C1T(e2);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:34|35|36|37|38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:134|135|136|137|138|139|140) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0246 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094 A[SYNTHETIC, Splitter:B:34:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A[Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1, all -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x012b A[Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1, all -> 0x0250 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0148 A[SYNTHETIC, Splitter:B:88:0x0148] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:74:0x0111=Splitter:B:74:0x0111, B:38:0x00ad=Splitter:B:38:0x00ad} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.CtE r6 = r13.A00
            X.CSY r8 = r6.A00
            if (r8 == 0) goto L_0x0258
            java.util.concurrent.atomic.AtomicBoolean r11 = r6.A0C
            boolean r0 = r11.get()
            if (r0 == 0) goto L_0x0258
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A0E
            r4 = 0
            r10 = 1
            boolean r0 = r5.compareAndSet(r4, r10)
            if (r0 == 0) goto L_0x0258
            java.nio.ByteBuffer r3 = r6.A0B     // Catch:{ InterruptedIOException -> 0x0249 }
            r3.mark()     // Catch:{ all -> 0x01a5 }
            X.BE7.A1P(r3)     // Catch:{ all -> 0x01a5 }
            int r0 = r3.capacity()     // Catch:{ all -> 0x01a5 }
            r3.limit(r0)     // Catch:{ all -> 0x01a5 }
            X.CVn r2 = r8.A01     // Catch:{ all -> 0x01a5 }
            r9 = 0
            if (r2 == 0) goto L_0x0081
            X.1JD r7 = r2.A00     // Catch:{ all -> 0x01a5 }
        L_0x002e:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x003c
        L_0x0036:
            java.lang.Object[] r1 = r7.A02     // Catch:{ all -> 0x01a5 }
            int r0 = r7.A00     // Catch:{ all -> 0x01a5 }
            r0 = r1[r0]     // Catch:{ all -> 0x01a5 }
        L_0x003c:
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x004a
            boolean r0 = r0.hasRemaining()     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x004a
            r7.removeFirst()     // Catch:{ all -> 0x01a5 }
            goto L_0x002e
        L_0x004a:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0052
            r12 = 0
            goto L_0x0058
        L_0x0052:
            java.lang.Object[] r1 = r7.A02     // Catch:{ all -> 0x01a5 }
            int r0 = r7.A00     // Catch:{ all -> 0x01a5 }
            r12 = r1[r0]     // Catch:{ all -> 0x01a5 }
        L_0x0058:
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12     // Catch:{ all -> 0x01a5 }
            if (r12 == 0) goto L_0x0081
            boolean r0 = r12.hasRemaining()     // Catch:{ all -> 0x01a5 }
            if (r0 != r10) goto L_0x0081
            int r1 = r12.remaining()     // Catch:{ all -> 0x01a5 }
            int r0 = r3.remaining()     // Catch:{ all -> 0x01a5 }
            int r7 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x01a5 }
            int r1 = r12.limit()     // Catch:{ all -> 0x01a5 }
            int r0 = r12.position()     // Catch:{ all -> 0x01a5 }
            int r0 = r0 + r7
            r12.limit(r0)     // Catch:{ all -> 0x01a5 }
            r3.put(r12)     // Catch:{ all -> 0x01a5 }
            r12.limit(r1)     // Catch:{ all -> 0x01a5 }
            goto L_0x0087
        L_0x0081:
            java.nio.channels.ReadableByteChannel r0 = r8.A04     // Catch:{ all -> 0x01a5 }
            int r7 = r0.read(r3)     // Catch:{ all -> 0x01a5 }
        L_0x0087:
            int r0 = r3.position()     // Catch:{ InterruptedIOException -> 0x0249 }
            r3.limit(r0)     // Catch:{ InterruptedIOException -> 0x0249 }
            r3.reset()     // Catch:{ InterruptedIOException -> 0x0249 }
            r0 = -1
            if (r7 != r0) goto L_0x00b7
            java.lang.String r3 = r6.A0A     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            java.lang.String r0 = "closed remotely. type="
            r2.append(r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.ByZ r1 = r8.A02     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            java.lang.String r0 = X.C17890vO.A0V(r1, r2)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.C26294Cx6.A07(r3, r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            java.nio.channels.ReadableByteChannel r0 = r8.A04     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r0.close()     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            X.BxJ r0 = new X.BxJ     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.C26149CtE.A02(r6, r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            goto L_0x0249
        L_0x00b7:
            X.1Di r0 = r6.A04     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 != 0) goto L_0x00c2
            java.lang.String r1 = r6.A0A     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            java.lang.String r0 = "received buffer is discarded! Missing receive handler"
            X.C26294Cx6.A05(r1, r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x00c2:
            if (r2 == 0) goto L_0x00f2
            X.1JD r2 = r2.A01     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x00c6:
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x00ce
            r0 = 0
            goto L_0x00d4
        L_0x00ce:
            java.lang.Object[] r1 = r2.A02     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r0 = r1[r0]     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x00d4:
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.hasRemaining()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 != 0) goto L_0x00e2
            r2.removeFirst()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            goto L_0x00c6
        L_0x00e2:
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x00ea
            r9 = 0
            goto L_0x00f0
        L_0x00ea:
            java.lang.Object[] r1 = r2.A02     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            int r0 = r2.A00     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r9 = r1[r0]     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x00f0:
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x00f2:
            boolean r0 = r11.get()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x019b
            boolean r0 = r3.hasRemaining()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 != 0) goto L_0x0101
            if (r9 == 0) goto L_0x019b
            goto L_0x011f
        L_0x0101:
            if (r9 == 0) goto L_0x0104
            goto L_0x0125
        L_0x0104:
            X.E57 r0 = r8.A00     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x0110
            java.nio.ByteBuffer r1 = r0.CPh(r3)     // Catch:{ IllegalArgumentException -> 0x017f }
            if (r1 != 0) goto L_0x0111
            goto L_0x019b
        L_0x0110:
            r1 = r3
        L_0x0111:
            X.1Di r7 = r6.A04     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r7 == 0) goto L_0x013b
            X.CPt r2 = r6.A06     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.1JD r0 = r2.A01     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r0.clear()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r2.A00 = r1     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            goto L_0x0138
        L_0x011f:
            boolean r0 = r9.hasRemaining()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 != r10) goto L_0x019b
        L_0x0125:
            boolean r0 = r9.hasRemaining()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 != r10) goto L_0x0104
            X.1Di r7 = r6.A04     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r7 == 0) goto L_0x013b
            X.CPt r2 = r6.A06     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.1JD r0 = r2.A01     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r0.clear()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r2.A00 = r9     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x0138:
            r7.invoke(r2)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x013b:
            A00(r3)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.CPt r0 = r6.A06     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            X.1JD r1 = r0.A01     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            boolean r0 = X.C17880vN.A1X(r1)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            if (r0 == 0) goto L_0x00f2
            r3.mark()     // Catch:{ all -> 0x018f }
            X.BE7.A1P(r3)     // Catch:{ all -> 0x018f }
            int r0 = r3.capacity()     // Catch:{ all -> 0x018f }
            r3.limit(r0)     // Catch:{ all -> 0x018f }
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x018f }
        L_0x0159:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x0173
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x018f }
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x018f }
            int r1 = r3.remaining()     // Catch:{ all -> 0x018f }
            int r0 = r2.remaining()     // Catch:{ all -> 0x018f }
            if (r1 < r0) goto L_0x0188
            r3.put(r2)     // Catch:{ all -> 0x018f }
            goto L_0x0159
        L_0x0173:
            int r0 = r3.position()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r3.limit(r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r3.reset()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            goto L_0x00f2
        L_0x017f:
            r2 = move-exception
            java.lang.String r0 = "input disconnected during read"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            goto L_0x019a
        L_0x0188:
            java.lang.String r0 = "enqueued data is too large"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x018f }
            throw r0     // Catch:{ all -> 0x018f }
        L_0x018f:
            r1 = move-exception
            int r0 = r3.position()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r3.limit(r0)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r3.reset()     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x019a:
            throw r1     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
        L_0x019b:
            A00(r3)     // Catch:{ IOException -> 0x022c, BufferOverflowException -> 0x01c4, InvalidMarkException -> 0x01b3, C1T -> 0x01b1 }
            r5.set(r4)
            X.C26149CtE.A01(r6)
            return
        L_0x01a5:
            r1 = move-exception
            int r0 = r3.position()     // Catch:{ InterruptedIOException -> 0x0249 }
            r3.limit(r0)     // Catch:{ InterruptedIOException -> 0x0249 }
            r3.reset()     // Catch:{ InterruptedIOException -> 0x0249 }
            throw r1     // Catch:{ InterruptedIOException -> 0x0249 }
        L_0x01b1:
            r2 = move-exception
            goto L_0x0219
        L_0x01b3:
            r2 = move-exception
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "Mark invalidated! Likely caused by detaching during read"
            X.C26294Cx6.A07(r1, r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0250 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0250 }
            goto L_0x0228
        L_0x01c4:
            r7 = move-exception
            java.lang.String r3 = r6.A0A     // Catch:{ all -> 0x0250 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "buffer overflow"
            r9.append(r0)     // Catch:{ all -> 0x0250 }
            java.lang.StringBuilder r1 = X.BE8.A0j(r9)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "input buffer: "
            r1.append(r0)     // Catch:{ all -> 0x0250 }
            java.nio.ByteBuffer r0 = r6.A0B     // Catch:{ all -> 0x0250 }
            X.BEA.A1L(r0, r1, r9)     // Catch:{ all -> 0x0250 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "rollover queued: "
            r1.append(r0)     // Catch:{ all -> 0x0250 }
            X.CVn r2 = r8.A01     // Catch:{ all -> 0x0250 }
            if (r2 == 0) goto L_0x01fa
            X.1JD r0 = r2.A00     // Catch:{ all -> 0x0250 }
        L_0x01ed:
            X.BEA.A1L(r0, r1, r9)     // Catch:{ all -> 0x0250 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "rollover received: "
            r1.append(r0)     // Catch:{ all -> 0x0250 }
            goto L_0x01ff
        L_0x01fa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0250 }
            goto L_0x01ed
        L_0x01ff:
            if (r2 == 0) goto L_0x0202
            goto L_0x0207
        L_0x0202:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0250 }
            goto L_0x0209
        L_0x0207:
            X.1JD r0 = r2.A01     // Catch:{ all -> 0x0250 }
        L_0x0209:
            X.BEA.A1L(r0, r1, r9)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = X.C18070vi.A0H(r9)     // Catch:{ all -> 0x0250 }
            X.C26294Cx6.A08(r3, r0)     // Catch:{ all -> 0x0250 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0250 }
            r0.<init>(r7)     // Catch:{ all -> 0x0250 }
            goto L_0x0228
        L_0x0219:
            java.lang.String r1 = r6.A0A     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "Error during repartition! Likely caused by detaching input during repartition"
            X.C26294Cx6.A07(r1, r0)     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0250 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0250 }
        L_0x0228:
            X.C26149CtE.A02(r6, r0)     // Catch:{ all -> 0x0250 }
            goto L_0x0249
        L_0x022c:
            r3 = move-exception
            java.lang.String r2 = r6.A0A     // Catch:{ all -> 0x0250 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = "Received error, type="
            r1.append(r0)     // Catch:{ all -> 0x0250 }
            X.ByZ r0 = r8.A02     // Catch:{ all -> 0x0250 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ all -> 0x0250 }
            X.C26294Cx6.A09(r2, r0, r3)     // Catch:{ all -> 0x0250 }
            java.nio.channels.ReadableByteChannel r0 = r8.A04     // Catch:{ all -> 0x0250 }
            r0.close()     // Catch:{ IOException -> 0x0246 }
        L_0x0246:
            X.C26149CtE.A02(r6, r3)     // Catch:{ all -> 0x0250 }
        L_0x0249:
            r5.set(r4)
            X.C26149CtE.A01(r6)
            return
        L_0x0250:
            r0 = move-exception
            r5.set(r4)
            X.C26149CtE.A01(r6)
            throw r0
        L_0x0258:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTV.run():void");
    }
}
