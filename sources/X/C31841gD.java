package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* renamed from: X.1gD  reason: invalid class name and case insensitive filesystem */
public final class C31841gD extends HandlerThread {
    public C62642rj A00;
    public boolean A01 = true;
    public final C31831gC A02;
    public final C31811gA A03;
    public final ArrayDeque A04 = new ArrayDeque();
    public final C31861gF A05 = new C31861gF(this);

    public C31841gD(C31831gC r3, C31811gA r4) {
        super("WriterThread", 1);
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v125, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v126, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v188, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v293, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v294, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v295, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v296, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v297, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r1v133, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v193, types: [java.lang.Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x085b, code lost:
        r1.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0d3f, code lost:
        r1.append(r0);
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x10b0, code lost:
        r1.append(r0);
        r1.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x10eb, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x11d6, code lost:
        r1 = r9.equals(r1);
        r13 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x11dc, code lost:
        if (r1 != false) goto L_0x11df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x11de, code lost:
        r13 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x1367, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x136a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0157, code lost:
        r3 = r5.obj;
        X.C17960vV.A07(r3);
        r3 = (java.util.List) r3;
        r6 = X.AnonymousClass2U7.A00(r5);
        r2 = new java.lang.StringBuilder();
        r2.append("XmppSendMessage/preacks/count ");
        r2.append(r3.size());
        com.whatsapp.util.Log.i(r2.toString());
        r4 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0182, code lost:
        if (r4.hasNext() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0184, code lost:
        r1 = (X.C59412mG) r4.next();
        r0.A01(r1.A01, r6, r1.A00);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0fb8 A[Catch:{ 1gE -> 0x1281, 1gE -> 0x1392, IOException -> 0x136b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.Message r20) {
        /*
            r19 = this;
            r5 = r20
            android.os.Bundle r2 = r5.getData()
            java.lang.String r0 = "messageClient:iqId"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "messageClient:checkCallback"
            boolean r0 = r2.getBoolean(r0)
            r18 = r19
            if (r0 == 0) goto L_0x0034
            r0 = r18
            X.1gA r0 = r0.A03
            X.C17960vV.A07(r7)
            X.1gB r0 = (X.C31821gB) r0
            X.1fz r0 = r0.A00
            X.1O4 r0 = r0.A0o
            java.util.Map r1 = r0.A0E
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x002e }
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002e }
            throw r0
        L_0x0031:
            r1 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            int r4 = X.AnonymousClass2U7.A00(r5)
            r0 = 43
            if (r4 != r0) goto L_0x01da
            java.lang.Object r6 = r5.obj
            X.2mG r6 = (X.C59412mG) r6
        L_0x0041:
            r0 = r18
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0060
            switch(r4) {
                case 0: goto L_0x01c7;
                case 4: goto L_0x01c7;
                case 5: goto L_0x01c7;
                case 8: goto L_0x01c7;
                case 13: goto L_0x01c7;
                case 14: goto L_0x01c7;
                case 18: goto L_0x01c7;
                case 21: goto L_0x01c7;
                case 22: goto L_0x01c7;
                case 23: goto L_0x01c7;
                case 24: goto L_0x01c7;
                case 29: goto L_0x01c7;
                case 38: goto L_0x01c7;
                case 43: goto L_0x01c7;
                case 69: goto L_0x01c7;
                case 70: goto L_0x01c7;
                case 74: goto L_0x01c7;
                case 77: goto L_0x01c7;
                case 85: goto L_0x01c7;
                case 86: goto L_0x01c7;
                case 87: goto L_0x01c7;
                case 89: goto L_0x01c7;
                case 105: goto L_0x01c7;
                case 106: goto L_0x01c7;
                case 118: goto L_0x01c7;
                case 119: goto L_0x01c7;
                case 124: goto L_0x01c7;
                case 132: goto L_0x01c7;
                case 133: goto L_0x01c7;
                case 162: goto L_0x01c7;
                case 164: goto L_0x01c7;
                case 183: goto L_0x01c7;
                case 184: goto L_0x01c7;
                case 189: goto L_0x01c7;
                case 192: goto L_0x01c7;
                case 193: goto L_0x01c7;
                case 196: goto L_0x01c7;
                case 214: goto L_0x01c7;
                case 215: goto L_0x01c7;
                case 216: goto L_0x01c7;
                case 222: goto L_0x01c7;
                case 223: goto L_0x01c7;
                case 226: goto L_0x01c7;
                case 229: goto L_0x01c7;
                case 230: goto L_0x01c7;
                case 231: goto L_0x01c7;
                case 232: goto L_0x01c7;
                case 241: goto L_0x01c7;
                case 248: goto L_0x01c7;
                case 251: goto L_0x01c7;
                case 261: goto L_0x01c7;
                case 263: goto L_0x01c7;
                case 270: goto L_0x01c7;
                case 271: goto L_0x01c7;
                case 274: goto L_0x01c7;
                case 275: goto L_0x01c7;
                case 277: goto L_0x01c7;
                case 279: goto L_0x01c7;
                case 296: goto L_0x01c7;
                case 327: goto L_0x01c7;
                case 332: goto L_0x01c7;
                case 342: goto L_0x01c7;
                case 363: goto L_0x01c7;
                case 368: goto L_0x01c7;
                case 369: goto L_0x01c7;
                case 370: goto L_0x01c7;
                case 377: goto L_0x01c7;
                case 378: goto L_0x01c7;
                case 404: goto L_0x01c7;
                case 405: goto L_0x01c7;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r0 = "messageClient:dropIfOffline"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L_0x01c7
            if (r1 != 0) goto L_0x01c7
            r0 = r18
            java.util.ArrayDeque r1 = r0.A04
            android.os.Message r0 = android.os.Message.obtain(r5)
            r1.add(r0)
        L_0x005f:
            return
        L_0x0060:
            if (r1 != 0) goto L_0x01c7
            if (r7 == 0) goto L_0x00d1
            r0 = r18
            X.1gA r0 = r0.A03
            X.1gB r0 = (X.C31821gB) r0
            X.1fz r0 = r0.A00
            X.1O4 r10 = r0.A0o
            java.lang.Object r3 = r10.A0B
            monitor-enter(r3)
            java.util.Map r9 = r10.A0E     // Catch:{ all -> 0x01dd }
            boolean r0 = r9.containsKey(r7)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x00d0
            java.util.Map r8 = r10.A0D     // Catch:{ all -> 0x01dd }
            boolean r0 = r8.containsKey(r7)     // Catch:{ all -> 0x01dd }
            r2 = r0 ^ 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            r1.<init>()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "Unhandled iq-response for id:"
            r1.append(r0)     // Catch:{ all -> 0x01dd }
            r1.append(r7)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01dd }
            X.C17960vV.A0H(r2, r0)     // Catch:{ all -> 0x01dd }
            java.lang.Object r0 = r9.remove(r7)     // Catch:{ all -> 0x01dd }
            X.1O5 r0 = (X.AnonymousClass1O5) r0     // Catch:{ all -> 0x01dd }
            r8.put(r7, r0)     // Catch:{ all -> 0x01dd }
            X.1Nx r10 = r10.A05     // Catch:{ all -> 0x01dd }
            java.util.concurrent.ConcurrentHashMap r0 = r10.A03     // Catch:{ all -> 0x01dd }
            java.lang.Object r11 = r0.get(r7)     // Catch:{ all -> 0x01dd }
            X.2gq r11 = (X.C56062gq) r11     // Catch:{ all -> 0x01dd }
            if (r11 == 0) goto L_0x00d0
            long r1 = r11.A09     // Catch:{ all -> 0x01dd }
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x01dd }
            r11.A09 = r0     // Catch:{ all -> 0x01dd }
            X.19a r1 = X.C25361Nx.A00(r10)     // Catch:{ all -> 0x01dd }
            int r2 = r7.hashCode()     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "iq_queue"
            r1.A01(r2, r0)     // Catch:{ all -> 0x01dd }
            X.19a r1 = X.C25361Nx.A00(r10)     // Catch:{ all -> 0x01dd }
            java.lang.String r0 = "iq_send"
            r1.A02(r2, r0)     // Catch:{ all -> 0x01dd }
        L_0x00d0:
            monitor-exit(r3)     // Catch:{ all -> 0x01dd }
        L_0x00d1:
            if (r6 == 0) goto L_0x00d5
            goto L_0x01e0
        L_0x00d5:
            r0 = r18
            X.1gF r0 = r0.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r6 = X.C63902ts.A00(r5)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r10 = r5.arg1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "remoteResource"
            java.lang.String r3 = "messageKeyId"
            java.lang.String r4 = "loggableStanzaId"
            java.lang.String r9 = "callId"
            java.lang.String r11 = "callCreatorJid"
            java.lang.String r8 = "jid"
            r1 = 0
            java.lang.String r2 = "id"
            switch(r10) {
                case 0: goto L_0x03d6;
                case 3: goto L_0x1317;
                case 6: goto L_0x12e0;
                case 8: goto L_0x10fb;
                case 9: goto L_0x10f1;
                case 11: goto L_0x10b7;
                case 12: goto L_0x0ffc;
                case 13: goto L_0x036e;
                case 18: goto L_0x0f1b;
                case 21: goto L_0x0f0a;
                case 23: goto L_0x0338;
                case 24: goto L_0x032d;
                case 27: goto L_0x0e40;
                case 29: goto L_0x0dd1;
                case 35: goto L_0x0d47;
                case 36: goto L_0x0cae;
                case 37: goto L_0x0c2a;
                case 38: goto L_0x0bb0;
                case 43: goto L_0x0ba4;
                case 61: goto L_0x0ad0;
                case 71: goto L_0x0a9c;
                case 72: goto L_0x0a68;
                case 73: goto L_0x0a34;
                case 76: goto L_0x0a2c;
                case 77: goto L_0x0994;
                case 85: goto L_0x0860;
                case 87: goto L_0x0789;
                case 88: goto L_0x02ca;
                case 89: goto L_0x043e;
                case 90: goto L_0x0192;
                case 117: goto L_0x0721;
                case 129: goto L_0x070a;
                case 157: goto L_0x06bf;
                case 163: goto L_0x0686;
                case 206: goto L_0x0628;
                case 233: goto L_0x12e0;
                case 240: goto L_0x05f0;
                case 263: goto L_0x01ed;
                case 276: goto L_0x011b;
                case 295: goto L_0x05c2;
                case 327: goto L_0x04fc;
                case 343: goto L_0x04db;
                case 356: goto L_0x04db;
                case 406: goto L_0x0157;
                case 419: goto L_0x043e;
                case 431: goto L_0x040a;
                default: goto L_0x00f1;
            }     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x00f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "XmppSendMessage/unknown what="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r5.what     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "argv1="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "object="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r0 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x01ec
        L_0x011b:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r3 == 0) goto L_0x0157
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "XmppSendMessage/dangling-notifications/count "
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r1 = r3.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r2.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x013d:
            boolean r1 = r4.hasNext()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r1 == 0) goto L_0x005f
            java.lang.Object r3 = r4.next()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2nR r3 = (X.C60132nR) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "notification"
            java.lang.String r1 = r3.A06     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r1 = r2.equals(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r1 == 0) goto L_0x013d
            r0.A02(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x013d
        L_0x0157:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17960vV.A07(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r6 = X.AnonymousClass2U7.A00(r5)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "XmppSendMessage/preacks/count "
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r1 = r3.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r2.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x017e:
            boolean r1 = r4.hasNext()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r4.next()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2mG r1 = (X.C59412mG) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r2 = r1.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r1 = r1.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A01(r1, r6, r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x017e
        L_0x0192:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r3 = (java.util.List) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "XmppSendMessage/dangling-msgs/count "
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r1 = r3.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r2.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x01b2:
            boolean r1 = r3.hasNext()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r1 == 0) goto L_0x005f
            java.lang.Object r2 = r3.next()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r1 = r2.A0p     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r1 != 0) goto L_0x01b2
            r1 = 1
            r0.A00(r2, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x01b2
        L_0x01c7:
            r0 = r18
            X.1gA r0 = r0.A03
            X.1gB r0 = (X.C31821gB) r0
            X.1fz r0 = r0.A00
            X.1O4 r0 = r0.A0o
            if (r7 == 0) goto L_0x005f
            java.lang.Object r3 = r0.A0B
            monitor-enter(r3)
            goto L_0x1399
        L_0x01da:
            r6 = 0
            goto L_0x0041
        L_0x01dd:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01dd }
            throw r0
        L_0x01e0:
            r0 = r18
            X.1gF r3 = r0.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r6.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r6.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A01(r0, r4, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x01ec:
            return
        L_0x01ed:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r8 = "fbns"
            r0 = 11
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 0
            java.lang.String r0 = "apple"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 1
            java.lang.String r0 = "apple_dev"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 2
            java.lang.String r0 = "ent"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 3
            java.lang.String r0 = "fb"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            r3[r0] = r8     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 5
            java.lang.String r0 = "gcm"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 6
            java.lang.String r0 = "kaios"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 7
            java.lang.String r0 = "smbi"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 8
            java.lang.String r0 = "smbi_dev"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 9
            java.lang.String r0 = "web"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 10
            java.lang.String r0 = "wns"
            r3[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r6 = java.util.Arrays.asList(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C18070vi.A0X(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "iq"
            X.1cX r3 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "clear"
            X.1cX r1 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "platform"
            r1.A08(r8, r0, r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r1.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A05(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r6 = r3.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            X.C18070vi.A0d(r9, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1cX r3 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.8v4 r7 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "to"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:push"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "type"
            java.lang.String r1 = "set"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r7, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10 = 0
            r12 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r14 = 0
            boolean r0 = X.C29601cY.A04(r9, r10, r12, r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x02aa
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x02aa:
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A06(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r3 = r3.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r2 = r4.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 4
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r4, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.put(r9, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r4.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/clear_fbns_token;"
            goto L_0x1367
        L_0x02ca:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r7 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r7.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6 = 1
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r3 = r7.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 3
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r7, r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.put(r9, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r3 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r2, (java.lang.String) r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r4[r0] = r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "encrypt"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4[r6] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "type"
            java.lang.String r0 = "get"
            X.1MD r2 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            r4[r0] = r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "to"
            X.8v4 r2 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "digest"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r2, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r7.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/get-pre-key-digest"
            goto L_0x1367
        L_0x032d:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A00()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/sendAvailableForChat"
            goto L_0x1367
        L_0x0338:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "unavailable"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 0
            java.lang.String r0 = "available"
            r2[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2[r0] = r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C18070vi.A0X(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "presence"
            X.1cX r1 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "type"
            r1.A08(r3, r0, r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r2 = r1.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r4.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/sendUnavailableForChat"
            goto L_0x1367
        L_0x036e:
            X.1gD r3 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r6 = r3.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "unavailable"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 0
            java.lang.String r0 = "available"
            r2[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2[r0] = r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C18070vi.A0X(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "presence"
            X.1cX r1 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "type"
            r1.A08(r4, r0, r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r1 = r1.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r4 = r6.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r4 = (X.AnonymousClass37M) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r4.CSL(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 0
            r2.write(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.AnonymousClass37M.A02(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            r2.write(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r8 = r2.toByteArray()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2dS r2 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r9 = r8.length     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2fv r0 = r2.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.Ckk r6 = r0.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r10 = r0.getAndIncrement()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r7 = new byte[r1]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r1 = r6.A01(r7, r8, r9, r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.io.OutputStream r0 = r2.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.write(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.flush()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r3.A01 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/logout"
            goto L_0x1367
        L_0x03d6:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r0 = "result"
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>(r0, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r4.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/onSendServerPong"
            goto L_0x1367
        L_0x040a:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2fh r3 = (X.C55392fh) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r6 = r0.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r4 = r3.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = r3.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r0 = r3.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r3.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11 = r1
            r13 = r1
            r7 = r4
            r8 = r0
            r9 = r1
            r10 = r2
            r12 = r3
            X.1ca r1 = X.C63952ty.A00(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r6 = (X.AnonymousClass37M) r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r6.CSL(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/send-error-receipt; message.key.id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " errorType="
            goto L_0x0d3f
        L_0x043e:
            java.lang.Object r2 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2gc r2 = (X.C55942gc) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.205 r11 = r2.A06     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r12 = r2.A07     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String[] r13 = r2.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r8 = r2.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.UserJid r10 = r2.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r9 = r2.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r14 = r2.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r7 = X.C63952ty.A01(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r3 = r11.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r0 = X.C22971Dz.A0e(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x04b4
            boolean r0 = X.C22971Dz.A0N(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x04b4
            boolean r0 = X.C22971Dz.A0N(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x04b4
            java.lang.String r0 = "participant"
            java.lang.String r0 = r7.A0Q(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x04b4
            java.lang.String r1 = "type"
            java.lang.String r0 = "delivery?"
            java.lang.String r3 = r7.A0Q(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "ConnectionWriter/sendReadReceipts sending 1:1 read receipt with participant attr key="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0B     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            boolean r0 = r1.getAndSet(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x04b4
            X.190 r6 = r4.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "read/type="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 0
            java.lang.String r0 = "sending_individual_receipt_with_participant"
            r6.A0G(r0, r3, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x04b4:
            long r0 = r2.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A03(r7, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/messages-read; message.key="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " participant="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " extraIds="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String[] r0 = r2.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x085b
        L_0x04db:
            int r3 = X.AnonymousClass2U7.A00(r5)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r2 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r2 = (X.C29621ca) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r0.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write-compressed/type="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x04fc:
            java.lang.Object r9 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2gO r9 = (X.C55802gO) r9     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r7 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r11 = r9.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r4 = r9.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r3 = r9.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r6 = r9.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r15 = r9.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r14 = r9.A06     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r0 = r9.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r16 = r0
            java.lang.String r10 = "server-error"
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "to"
            X.C17890vO.A0n(r11, r0, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17890vO.A11(r2, r6, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "type"
            X.C17890vO.A11(r0, r10, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r12 = X.C62642rj.A0E     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r9 = r9.toArray(r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r9 = (X.AnonymousClass1MD[]) r9     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10.<init>(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11 = 0
            if (r15 == 0) goto L_0x055a
            X.1ca[] r13 = new X.C29621ca[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "enc_p"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (byte[]) r15, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13[r11] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "enc_iv"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0, (byte[]) r14, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r13[r0] = r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "encrypt"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x055a:
            r0 = 3
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13.<init>(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "from_me"
            java.lang.String r1 = java.lang.String.valueOf(r16)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r3 == 0) goto L_0x0582
            java.lang.String r1 = "participant"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0582:
            java.lang.Object[] r2 = r13.toArray(r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r2 = (X.AnonymousClass1MD[]) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "rmr"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r1, r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r0 = new X.C29621ca[r11]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r1 = r10.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r1 = (X.C29621ca[]) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "receipt"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r9, (X.C29621ca[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r7.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-md-media-error; id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " chatJid="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " participant="
            goto L_0x10b0
        L_0x05c2:
            java.lang.Object r4 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r4 = (X.AnonymousClass1BI) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r2 = r0.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r11 = "order-status-update-failed"
            java.lang.String r12 = "invalid-transition"
            r8 = r1
            r10 = r1
            r6 = r4
            r7 = r1
            r9 = r3
            X.1ca r1 = X.C63952ty.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r2 = (X.AnonymousClass37M) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2.CSL(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/order-status-update-failure; message.key.id="
            goto L_0x0d3f
        L_0x05f0:
            java.lang.Object r7 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r6 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "to"
            r0 = 1
            X.C18070vi.A0d(r7, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "presence"
            X.1cX r3 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r1 = "probe"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r2 = r3.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r6.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x0628:
            java.lang.Object r6 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.9f5 r6 = (X.C186989f5) r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.protocol.VoipStanzaChildNode r10 = r6.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = r10.tag     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r6.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r9 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "to"
            com.whatsapp.jid.Jid r1 = r6.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r6 = r6.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r0 = X.C62642rj.A0E     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r4 = r8.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r4 = (X.AnonymousClass1MD[]) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r1 = r10.toProtocolTreeNode()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "call"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r9.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/call-stanza-"
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; callId="
            goto L_0x0d3f
        L_0x0686:
            java.lang.Object r6 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r6 = (X.AnonymousClass1BI) r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = r2.getString(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1Dv r2 = X.AnonymousClass1BI.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r7 = r2.A02(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r2 = r0.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r11 = "hsm-envelope-mismatch"
            r10 = r1
            r12 = r1
            r8 = r1
            r9 = r3
            X.1ca r1 = X.C63952ty.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r2 = (X.AnonymousClass37M) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2.CSL(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-received-permanent-failure; message.key.id="
            goto L_0x0d3f
        L_0x06bf:
            java.lang.String r12 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r10 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r11 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r13 = r6.getString(r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "type"
            java.lang.String r14 = r6.getString(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "registrationId"
            byte[] r15 = r6.getByteArray(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "retry"
            byte r16 = r6.getByte(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r6.getLong(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r3 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = X.C63952ty.A03(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A03(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/call-rekey; callId="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x070a:
            java.lang.Object r1 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2nR r1 = (X.C60132nR) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r3 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r1.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r2 = X.C63952ty.A06(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r0 = r1.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A03(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/send-message-ack"
            goto L_0x1367
        L_0x0721:
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "subType"
            boolean r2 = r2.containsKey(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r2 == 0) goto L_0x0787
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = r2.getString(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0736:
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "errorCode"
            boolean r2 = r2.containsKey(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r2 == 0) goto L_0x074e
            android.os.Bundle r1 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r1 = r1.getInt(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x074e:
            java.lang.Object r6 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r6 = (X.AnonymousClass1BI) r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r2 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = r2.getString(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1Dv r2 = X.AnonymousClass1BI.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r7 = r2.A02(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r2 = r0.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r11 = "structure-unavailable"
            r12 = 0
            r8 = r1
            r9 = r3
            X.1ca r1 = X.C63952ty.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r2 = (X.AnonymousClass37M) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2.CSL(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-received-structure-unavailable; message.key.id="
            goto L_0x0d3f
        L_0x0787:
            r10 = r1
            goto L_0x0736
        L_0x0789:
            X.C17960vV.A07(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "jids"
            android.os.Parcelable[] r3 = r6.getParcelableArray(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid[] r3 = (com.whatsapp.jid.DeviceJid[]) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "identityJids"
            android.os.Parcelable[] r10 = r6.getParcelableArray(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r9 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r1 = r9.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7 = 1
            X.2M7 r0 = new X.2M7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r9, r3, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.put(r4, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r14 = r3.length     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.<init>(r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r0 = java.util.Arrays.asList(r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13.<init>(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10 = 0
            r12 = 0
        L_0x07be:
            r11 = 2
            if (r12 >= r14) goto L_0x07f8
            r1 = r3[r12]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r0 = r13.contains(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r16 = "user"
            if (r0 == 0) goto L_0x07eb
            X.1MD[] r11 = new X.AnonymousClass1MD[r11]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r10] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r15 = "reason"
            java.lang.String r1 = "identity"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r15, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x07e0:
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r16
            r1.<init>(r0, r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x07f5
        L_0x07eb:
            X.1MD[] r11 = new X.AnonymousClass1MD[r7]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r10] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x07e0
        L_0x07f5:
            int r12 = r12 + 1
            goto L_0x07be
        L_0x07f8:
            r0 = 4
            X.1MD[] r8 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r10] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "encrypt"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r11] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r8[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r0 = new X.C29621ca[r10]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r6 = r6.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r6 = (X.C29621ca[]) r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "key"
            r0 = 0
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r0, (X.C29621ca[]) r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r2, (java.lang.String) r0, (X.AnonymousClass1MD[]) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r9.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/get-pre-key-batch; id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; jids="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = java.util.Arrays.toString(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x085b:
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x0860:
            java.lang.Object r4 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17960vV.A07(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2f2 r4 = (X.C54992f2) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r3 = r4.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r17 = r3
            byte[] r9 = r4.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2eE[] r6 = r4.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2eE r14 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r16 = 5
            int r0 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r3 = r4.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7 = 0
            X.2M7 r0 = new X.2M7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r4, r9, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.put(r10, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r11 = r6.length     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r13 = new X.C29621ca[r11]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r15 = 0
        L_0x0890:
            java.lang.String r12 = "value"
            r8 = 2
            if (r15 >= r11) goto L_0x08bb
            X.1ca[] r8 = new X.C29621ca[r8]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r6[r15]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r3 = r0.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (byte[]) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r6[r15]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r3 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r12, (byte[]) r0, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r8[r0] = r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "key"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13[r15] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r15 = r15 + 1
            goto L_0x0890
        L_0x08bb:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r15 = "identity"
            X.1ca r3 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r17
            r3.<init>((java.lang.String) r15, (byte[]) r0, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "registration"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (byte[]) r9, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            byte[] r3 = new byte[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3[r7] = r16     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = "type"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r9, (byte[]) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "list"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            X.1ca[] r13 = new X.C29621ca[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r3 = r14.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (byte[]) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r0 = r14.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r3 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r12, (byte[]) r0, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r13[r0] = r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r12 = "signature"
            byte[] r3 = r14.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r12, (byte[]) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "skey"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r11 <= 0) goto L_0x094b
            X.0ve r12 = r4.A07     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 8312(0x2078, float:1.1648E-41)
            X.0vf r3 = X.C18040vf.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r0 = X.C18020vd.A05(r3, r12, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x0933
            r0 = 9208(0x23f8, float:1.2903E-41)
            boolean r0 = X.C18020vd.A05(r3, r12, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x094b
        L_0x0933:
            int r0 = r11 + 1
            int r0 = r0 * 1635
            byte[] r11 = new byte[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Random r0 = new java.util.Random     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.nextBytes(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "padding"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (byte[]) r11, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.add(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x094b:
            r0 = 4
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "set"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r9, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r0 = new X.C29621ca[r7]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r1 = r6.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r1 = (X.C29621ca[]) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r3, (X.C29621ca[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r4.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/set-pre-key"
            goto L_0x1367
        L_0x0994:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2g8 r3 = (X.C55642g8) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r10 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r6 = r3.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r4 = r3.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = r3.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r12 = r3.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r8 = r3.A04     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            byte[] r3 = r3.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r11 = "server-error"
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "to"
            X.C17890vO.A0n(r6, r0, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17890vO.A11(r2, r7, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "type"
            X.C17890vO.A11(r0, r11, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r4 == 0) goto L_0x09c5
            java.lang.String r0 = "participant"
            X.C17890vO.A0n(r4, r0, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x09c5:
            if (r12 == 0) goto L_0x09cc
            java.lang.String r0 = "category"
            X.C17890vO.A11(r0, r12, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x09cc:
            X.1MD[] r0 = X.C62642rj.A0E     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r11 = r9.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r11 = (X.AnonymousClass1MD[]) r11     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = "receipt"
            if (r8 == 0) goto L_0x0a26
            r0 = 2
            X.1ca[] r12 = new X.C29621ca[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "enc_p"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (byte[]) r8, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 0
            r12[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "enc_iv"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (byte[]) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3 = 1
            r12[r3] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "encrypt"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r0 = new X.C29621ca[r3]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0[r8] = r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r9, (X.AnonymousClass1MD[]) r11, (X.C29621ca[]) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x09ff:
            X.3MD r1 = r10.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-media-error; id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " to="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " participant="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x0a26:
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>(r9, r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x09ff
        L_0x0a2c:
            java.lang.Object r1 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2nR r1 = (X.C60132nR) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A02(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x0a34:
            java.lang.String r10 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r8 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r7 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r6.getString(r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r6.getLong(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "reject"
            X.1ca r0 = X.C63952ty.A02(r8, r7, r10, r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A03(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/call-reject-receipt; callId="
            goto L_0x0d3f
        L_0x0a68:
            java.lang.String r10 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r8 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r7 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r6.getString(r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r6.getLong(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "accept"
            X.1ca r0 = X.C63952ty.A02(r8, r7, r10, r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A03(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/call-accept-receipt; callId="
            goto L_0x0d3f
        L_0x0a9c:
            java.lang.String r10 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1E0 r2 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r8 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = r6.getString(r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.DeviceJid r7 = r2.A06(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r6.getString(r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r6.getLong(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "offer"
            X.1ca r0 = X.C63952ty.A02(r8, r7, r10, r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A03(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/call-offer-receipt; callId="
            goto L_0x0d3f
        L_0x0ad0:
            java.lang.String r3 = "XmppSendMessage/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r4 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2cl r4 = (X.C53582cl) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r6 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r0 = r4.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r17 = r0
            int r0 = r6.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4 = 1
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r9 = r6.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7 = 6
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r6, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9.put(r10, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "username"
            X.1ca r12 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r12.<init>((java.lang.String) r0, (java.lang.String) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9 = 2
            java.lang.String r11 = "modify"
            r16 = 0
            if (r17 == 0) goto L_0x0b39
            int r0 = r17.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 <= 0) goto L_0x0b39
            int r0 = r17.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r14 = new X.C29621ca[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13 = 0
        L_0x0b15:
            int r0 = r17.size()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r13 >= r0) goto L_0x0b3f
            X.1MD[] r7 = new X.AnonymousClass1MD[r4]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r17
            java.lang.Object r15 = r0.get(r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.Jid r15 = (com.whatsapp.jid.Jid) r15     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r15, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7[r16] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r15 = "user"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r15, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r14[r13] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r13 = r13 + 1
            goto L_0x0b15
        L_0x0b39:
            X.1ca r7 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7.<init>((X.C29621ca) r12, (java.lang.String) r11, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x0b5d
        L_0x0b3f:
            java.lang.String r13 = "notify"
            X.1ca r7 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7.<init>((java.lang.String) r13, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r8 = new X.AnonymousClass1MD[r4]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "true"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r13, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r16] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r0 = new X.C29621ca[r9]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0[r16] = r12     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0[r4] = r7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r7 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7.<init>((java.lang.String) r11, (X.AnonymousClass1MD[]) r8, (X.C29621ca[]) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0b5d:
            r0 = 4
            X.1MD[] r8 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r16] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r4] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8[r9] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r8[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r7, (java.lang.String) r0, (X.AnonymousClass1MD[]) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r6.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/change-number; oldChatUserId="
            goto L_0x0d3f
        L_0x0ba4:
            java.lang.Object r1 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2mG r1 = (X.C59412mG) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r2 = r1.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r1 = r1.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A01(r1, r10, r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x0bb0:
            java.lang.Object r1 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2f1 r1 = (X.C54982f1) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r8 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r4 = r1.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = r1.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1BI r3 = r1.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String[] r7 = r1.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17960vV.A0J(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r6 = r7[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9 = 0
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "to"
            X.C17890vO.A0n(r4, r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17890vO.A11(r2, r6, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "type"
            X.C17890vO.A11(r0, r10, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r3 == 0) goto L_0x0be1
            java.lang.String r0 = "participant"
            X.C17890vO.A0n(r3, r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0be1:
            X.1MD[] r0 = X.C62642rj.A0E     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r6 = r7.length     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            if (r6 <= r0) goto L_0x0bf7
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r7, r0, r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r9 = X.C63952ty.A07(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0bf7:
            java.lang.String r0 = "receipt"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r8.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-played; id="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r0 = r7[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " count="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " to="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " participant="
            goto L_0x10b0
        L_0x0c2a:
            if (r6 == 0) goto L_0x0c30
            java.lang.String r1 = r6.getString(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0c30:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            boolean r3 = r3.booleanValue()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r8 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7 = 1
            if (r1 != 0) goto L_0x0c49
            int r0 = r8.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0c49:
            java.util.Map r4 = r8.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2M4 r0 = new X.2M4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r8, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.put(r1, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = "passive"
            if (r3 == 0) goto L_0x0cac
            java.lang.String r4 = "active"
        L_0x0c59:
            r0 = 0
            X.1ca r6 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6.<init>(r4, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r9 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r4[r0] = r9     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "xmlns"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            r4[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r4[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r6, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r8.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/set-connection-active; active="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x0cac:
            r4 = r10
            goto L_0x0c59
        L_0x0cae:
            java.lang.String r3 = "XmppSendMessage/get-normalized-jid"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2cm r3 = (X.C53592cm) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r9 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r6 = r3.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = r3.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r9.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 1
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r11 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r7 = r9.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4 = 5
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r9, r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7.put(r11, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r12 = 2
            X.1ca[] r10 = new X.C29621ca[r12]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "cc"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r4, (java.lang.String) r6, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13 = 0
            r10[r13] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "in"
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r4, (java.lang.String) r3, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "normalize"
            X.1ca r7 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r1, (X.C29621ca[]) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r10 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "to"
            X.8v4 r1 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10[r13] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10[r8] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "type"
            java.lang.String r1 = "get"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r10[r12] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r10[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r7, (java.lang.String) r0, (X.AnonymousClass1MD[]) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r9.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/get-normalized-jid; countryCode="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; phoneNumber="
        L_0x0d3f:
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x0d47:
            java.lang.String r1 = "XmppSendMessage/set-recovery-token"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r3 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "rc"
            byte[] r9 = r3.getByteArray(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r3 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "rcJid"
            java.lang.String r4 = r3.getString(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r3 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "saveRecoveryToken"
            boolean r3 = r3.getBoolean(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r7 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r7.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6 = 1
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r8 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r1 = r7.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2M5 r0 = new X.2M5     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r7, r4, r9, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.put(r8, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "token"
            r0 = 0
            X.1ca r4 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r1, (byte[]) r9, (X.AnonymousClass1MD[]) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:auth:token"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3[r6] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r3[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r4, (java.lang.String) r0, (X.AnonymousClass1MD[]) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r7.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/set-recovery-token"
            goto L_0x1367
        L_0x0dd1:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2Rw r3 = (X.C49772Rw) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r13 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r14 = r3.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2b5 r10 = r3.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.B9K r12 = r3.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2b6 r11 = r3.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r13.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3 = 1
            int r0 = r0 + 1
            r13.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r8 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r0 = r13.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2M6 r9 = new X.2M6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.put(r8, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "status"
            X.1ca r4 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r7, (java.lang.String) r14, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r6[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "xmlns"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6[r3] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            r6[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r1 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 3
            r6[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((X.C29621ca) r4, (java.lang.String) r0, (X.AnonymousClass1MD[]) r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r13.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/status-update"
            goto L_0x1367
        L_0x0e40:
            java.lang.String r14 = "lg"
            java.lang.String r13 = r6.getString(r14)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r12 = "lc"
            java.lang.String r3 = r6.getString(r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "userFeedback"
            java.lang.String r11 = r6.getString(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r1 = "deleteReason"
            int r17 = r6.getInt(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r10 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r10.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r9 = 1
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r8 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r1 = r10.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r7 = 0
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r10, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.put(r8, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r6 = 3
            r16 = 0
            r4 = 2
            if (r11 == 0) goto L_0x0e82
            java.lang.String r15 = ""
            if (r13 != 0) goto L_0x0e7e
            r13 = r15
        L_0x0e7e:
            if (r3 == 0) goto L_0x0e85
            r15 = r3
            goto L_0x0e85
        L_0x0e82:
            r11 = r16
            goto L_0x0eaf
        L_0x0e85:
            java.lang.String r3 = "body"
            if (r17 < 0) goto L_0x0ef9
            X.1MD[] r1 = new X.AnonymousClass1MD[r6]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r14, (java.lang.String) r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r12, (java.lang.String) r15)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1[r9] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r13 = "reason"
            java.lang.String r12 = java.lang.Integer.toString(r17)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r13, (java.lang.String) r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1[r4] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0ea6:
            X.1ca r0 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r3, (java.lang.String) r11, (X.AnonymousClass1MD[]) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca[] r11 = new X.C29621ca[r9]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0eaf:
            java.lang.String r3 = "remove"
            X.1ca r1 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = r16
            r1.<init>((java.lang.String) r3, (X.AnonymousClass1MD[]) r0, (X.C29621ca[]) r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 4
            X.1MD[] r11 = new X.AnonymousClass1MD[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r12 = "to"
            X.8v4 r3 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "xmlns"
            java.lang.String r3 = "urn:xmpp:whatsapp:account"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r9] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = "type"
            java.lang.String r3 = "get"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r4] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r2, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11[r6] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "iq"
            X.1ca r2 = new X.1ca     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((X.C29621ca) r1, (java.lang.String) r0, (X.AnonymousClass1MD[]) r11)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r10.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r2, r9)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/remove-account"
            goto L_0x1367
        L_0x0ef9:
            X.1MD[] r1 = new X.AnonymousClass1MD[r4]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r14, (java.lang.String) r13)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1[r7] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r12, (java.lang.String) r15)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1[r9] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x0ea6
        L_0x0f0a:
            java.lang.String r1 = "forceRefresh"
            boolean r1 = r6.getBoolean(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A04(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/get-server-props"
            goto L_0x1367
        L_0x0f1b:
            java.lang.String r3 = "XmppSendMessage/clear-dirty "
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r4 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "category"
            java.lang.String r6 = r4.getString(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r4 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r3 = "timestamp"
            long r7 = r4.getLong(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11 = 0
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0f3f
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0f3f:
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r7 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17960vV.A07(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r7.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = java.lang.Integer.toHexString(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r3 = r7.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 1
            X.2M3 r0 = new X.2M3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r7, r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.put(r10, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r6.equals(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x0f74
            if (r1 == 0) goto L_0x0f74
            long r3 = r1.longValue()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0f74
            X.9Ei r0 = new X.9Ei     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((long) r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x0f79
        L_0x0f74:
            X.4A4 r0 = new X.4A4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r6, (java.lang.Long) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0f79:
            X.C18070vi.A0d(r10, r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r4 = "iq"
            X.1cX r3 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>((java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.8v4 r9 = X.C173438v4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r8 = "to"
            X.1MD r4 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = "xmlns"
            java.lang.String r8 = "urn:xmpp:whatsapp:dirty"
            X.1MD r4 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = "type"
            java.lang.String r8 = "set"
            X.1MD r4 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r13 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r15 = 0
            boolean r4 = X.C29601cY.A04(r10, r11, r13, r15)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r4 == 0) goto L_0x0fc0
            X.1MD r4 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r2, (java.lang.String) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A04(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x0fc0:
            java.lang.String r4 = "clean"
            X.1cX r2 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r0.BVP()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.A06(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r2.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A05(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r3 = r3.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r2 = r7.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r2 = (X.AnonymousClass37M) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r2.CSL(r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/clear-dirty; category="
            r2.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; timestamp="
            r2.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.append(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r2.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x1367
        L_0x0ffc:
            java.lang.Object r3 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r1 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r6 = "tctoken"
            byte[] r11 = r1.getByteArray(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Bundle r1 = r5.getData()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r10 = "context"
            java.lang.String r2 = r1.getString(r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1yz r1 = X.AnonymousClass1EC.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1EC r2 = r1.A02(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r7 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 0
            if (r11 == 0) goto L_0x106d
            java.lang.String r12 = "smax:any"
            X.1cX r4 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r8 = 1
            r0 = 120(0x78, double:5.93E-322)
            X.C29601cY.A02(r11, r8, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A01 = r11     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r4 = r4.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r11 = 1
            X.1cX r1 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>((java.lang.String) r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1cX r0 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A06(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = r0.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.A05(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r8 = r1.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x1050:
            java.lang.String r6 = "to"
            r0 = 3
            X.C18070vi.A0d(r3, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "presence"
            X.1cX r4 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r9 = "type"
            java.lang.String r1 = "subscribe"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r9, (java.lang.String) r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x106f
        L_0x106d:
            r11 = 0
            goto L_0x1050
        L_0x106f:
            if (r2 == 0) goto L_0x1079
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r10)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x1079:
            r0 = 2
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Class<X.1EC> r1 = X.AnonymousClass1EC.class
            r0 = 0
            r2[r0] = r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1 = 1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r2[r1] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r0 = java.util.Arrays.asList(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C18070vi.A0X(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C29601cY.A01(r3, r6, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r4.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r11 == 0) goto L_0x109d
            r4.A06(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x109d:
            X.1ca r2 = r4.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r1 = r7.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 1
            r1.CSL(r2, r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/subscription-request; jid="
        L_0x10b0:
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x10eb
        L_0x10b7:
            java.lang.Object r4 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2h7 r4 = (X.C56222h7) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r3 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            long r1 = r4.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r0 = X.C63952ty.A04(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.A03(r0, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/message-retry; message.key="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r4.A0B     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; jid="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.jid.Jid r0 = r4.A05     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "; retryCount="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r0 = r4.A01     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x10eb:
            java.lang.String r0 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x1367
        L_0x10f1:
            java.lang.Object r2 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.206 r2 = (X.AnonymousClass206) r2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r1 = r5.arg2     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A00(r2, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x10fb:
            java.lang.Object r7 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C17960vV.A07(r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2n2 r7 = (X.C59882n2) r7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r6 = r0.A00     // Catch:{ 1gE -> 0x1281 }
            X.1gC r1 = r6.A02     // Catch:{ 1gE -> 0x1281 }
            X.2rj r9 = r6.A00     // Catch:{ 1gE -> 0x1281 }
            X.1fx r8 = r1.A00     // Catch:{ 1gE -> 0x1281 }
            r1 = 0
            X.C18070vi.A0d(r7, r1)     // Catch:{ 1gE -> 0x1281 }
            r1 = 1
            X.C18070vi.A0d(r9, r1)     // Catch:{ 1gE -> 0x1281 }
            r3 = 0
            java.util.Map r1 = r7.A06     // Catch:{ 1gE -> 0x1281 }
            java.util.Collection r2 = r1.values()     // Catch:{ 1gE -> 0x1281 }
            X.1MD[] r1 = new X.AnonymousClass1MD[r3]     // Catch:{ 1gE -> 0x1281 }
            java.lang.Object[] r4 = r2.toArray(r1)     // Catch:{ 1gE -> 0x1281 }
            X.1MD[] r4 = (X.AnonymousClass1MD[]) r4     // Catch:{ 1gE -> 0x1281 }
            java.util.List r2 = r7.A05     // Catch:{ 1gE -> 0x1281 }
            X.1ca[] r1 = new X.C29621ca[r3]     // Catch:{ 1gE -> 0x1281 }
            java.lang.Object[] r2 = r2.toArray(r1)     // Catch:{ 1gE -> 0x1281 }
            X.1ca[] r2 = (X.C29621ca[]) r2     // Catch:{ 1gE -> 0x1281 }
            java.lang.String r1 = "message"
            X.1ca r3 = new X.1ca     // Catch:{ 1gE -> 0x1281 }
            r3.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r4, (X.C29621ca[]) r2)     // Catch:{ 1gE -> 0x1281 }
            X.3MD r2 = r9.A0A     // Catch:{ 1gE -> 0x1281 }
            X.37M r2 = (X.AnonymousClass37M) r2     // Catch:{ 1gE -> 0x1281 }
            r1 = 1
            r2.CSL(r3, r1)     // Catch:{ 1gE -> 0x1281 }
            java.lang.String r9 = r7.A04     // Catch:{ 1gE -> 0x1281 }
            X.205 r3 = r7.A02     // Catch:{ 1gE -> 0x1281 }
            if (r9 != 0) goto L_0x1143
            r13 = 0
            goto L_0x11df
        L_0x1143:
            int r1 = r9.hashCode()     // Catch:{ 1gE -> 0x1281 }
            switch(r1) {
                case -2031136805: goto L_0x114c;
                case -1890252483: goto L_0x1157;
                case -1498475918: goto L_0x115b;
                case -1183699191: goto L_0x115f;
                case -1142692003: goto L_0x1168;
                case -622287711: goto L_0x116b;
                case -309474065: goto L_0x1174;
                case 102340: goto L_0x117d;
                case 93166550: goto L_0x1186;
                case 100313435: goto L_0x118e;
                case 106006350: goto L_0x1196;
                case 112021638: goto L_0x119f;
                case 112202875: goto L_0x11a8;
                case 555704345: goto L_0x11b1;
                case 861720859: goto L_0x11ba;
                case 943481210: goto L_0x11c3;
                case 1901043637: goto L_0x11cc;
                case 1977401206: goto L_0x11d4;
                default: goto L_0x114a;
            }     // Catch:{ 1gE -> 0x1281 }
        L_0x114a:
            goto L_0x11de
        L_0x114c:
            java.lang.String r1 = "sticker_pack"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 105(0x69, float:1.47E-43)
            goto L_0x11dc
        L_0x1157:
            java.lang.String r1 = "sticker"
            goto L_0x11d6
        L_0x115b:
            java.lang.String r1 = "user_created_sticker"
            goto L_0x11d6
        L_0x115f:
            java.lang.String r1 = "invite"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 24
            goto L_0x11dc
        L_0x1168:
            java.lang.String r1 = "1p_sticker"
            goto L_0x11d6
        L_0x116b:
            java.lang.String r1 = "livelocation"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 16
            goto L_0x11dc
        L_0x1174:
            java.lang.String r1 = "product"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 23
            goto L_0x11dc
        L_0x117d:
            java.lang.String r1 = "gif"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 13
            goto L_0x11dc
        L_0x1186:
            java.lang.String r1 = "audio"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 2
            goto L_0x11dc
        L_0x118e:
            java.lang.String r1 = "image"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 1
            goto L_0x11dc
        L_0x1196:
            java.lang.String r1 = "order"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 44
            goto L_0x11dc
        L_0x119f:
            java.lang.String r1 = "vcard"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 4
            goto L_0x11dc
        L_0x11a8:
            java.lang.String r1 = "video"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 3
            goto L_0x11dc
        L_0x11b1:
            java.lang.String r1 = "catalog"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 37
            goto L_0x11dc
        L_0x11ba:
            java.lang.String r1 = "document"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 9
            goto L_0x11dc
        L_0x11c3:
            java.lang.String r1 = "contact_array"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 14
            goto L_0x11dc
        L_0x11cc:
            java.lang.String r1 = "location"
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 5
            goto L_0x11dc
        L_0x11d4:
            java.lang.String r1 = "genai_sticker"
        L_0x11d6:
            boolean r1 = r9.equals(r1)     // Catch:{ 1gE -> 0x1281 }
            r13 = 20
        L_0x11dc:
            if (r1 != 0) goto L_0x11df
        L_0x11de:
            r13 = -1
        L_0x11df:
            int r4 = r7.A01     // Catch:{ 1gE -> 0x1281 }
            if (r4 != 0) goto L_0x1258
            int r2 = r7.A00     // Catch:{ 1gE -> 0x1281 }
            r1 = 7
            if (r2 == r1) goto L_0x123b
            r1 = 8
            if (r2 == r1) goto L_0x123b
            X.181 r12 = r8.A00     // Catch:{ 1gE -> 0x1281 }
            X.1BI r10 = r3.A00     // Catch:{ 1gE -> 0x1281 }
            java.lang.String r1 = "pay"
            boolean r11 = r1.equals(r9)     // Catch:{ 1gE -> 0x1281 }
            boolean r1 = X.C22971Dz.A0a(r10)     // Catch:{ 1gE -> 0x1281 }
            if (r1 == 0) goto L_0x11fe
            r9 = 3
            goto L_0x1202
        L_0x11fe:
            r9 = 2
            if (r13 != 0) goto L_0x1202
            r9 = 1
        L_0x1202:
            r12.A02()     // Catch:{ 1gE -> 0x1281 }
            X.1EQ r2 = r12.A00     // Catch:{ 1gE -> 0x1281 }
            r1 = 6
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r9, r11)     // Catch:{ 1gE -> 0x1281 }
            r1.sendToTarget()     // Catch:{ 1gE -> 0x1281 }
            X.AnonymousClass181.A00(r12)     // Catch:{ 1gE -> 0x1281 }
            boolean r1 = X.C22971Dz.A0a(r10)     // Catch:{ 1gE -> 0x1281 }
            if (r1 != 0) goto L_0x1258
            boolean r1 = X.C22971Dz.A0N(r10)     // Catch:{ 1gE -> 0x1281 }
            if (r1 == 0) goto L_0x122e
            X.1fw r9 = r8.A01     // Catch:{ 1gE -> 0x1281 }
            java.util.Set r1 = r7.A07     // Catch:{ 1gE -> 0x1281 }
            java.util.List r2 = X.C29431cG.A0t(r1)     // Catch:{ 1gE -> 0x1281 }
            r1 = 18
            X.35N r8 = new X.35N     // Catch:{ 1gE -> 0x1281 }
            r8.<init>(r2, r3, r1)     // Catch:{ 1gE -> 0x1281 }
            goto L_0x1255
        L_0x122e:
            X.1fw r9 = r8.A01     // Catch:{ 1gE -> 0x1281 }
            X.C17960vV.A07(r10)     // Catch:{ 1gE -> 0x1281 }
            r1 = 16
            X.35N r8 = new X.35N     // Catch:{ 1gE -> 0x1281 }
            r8.<init>(r10, r3, r1)     // Catch:{ 1gE -> 0x1281 }
            goto L_0x1255
        L_0x123b:
            X.1BI r2 = r3.A00     // Catch:{ 1gE -> 0x1281 }
            boolean r1 = X.C22971Dz.A0a(r2)     // Catch:{ 1gE -> 0x1281 }
            if (r1 != 0) goto L_0x1258
            boolean r1 = X.C22971Dz.A0N(r2)     // Catch:{ 1gE -> 0x1281 }
            if (r1 != 0) goto L_0x1258
            X.1fw r9 = r8.A01     // Catch:{ 1gE -> 0x1281 }
            X.C17960vV.A07(r2)     // Catch:{ 1gE -> 0x1281 }
            r1 = 17
            X.35N r8 = new X.35N     // Catch:{ 1gE -> 0x1281 }
            r8.<init>(r2, r3, r1)     // Catch:{ 1gE -> 0x1281 }
        L_0x1255:
            r9.notifyAllObservers(r8)     // Catch:{ 1gE -> 0x1281 }
        L_0x1258:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/send-encrypted "
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " retry="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gA r1 = r6.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.sendToTarget()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x1281:
            r4 = move-exception
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gA r0 = r0.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2nR r8 = r7.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            int r7 = r4.excessPayloadByteSize     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gB r0 = (X.C31821gB) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1fz r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1O4 r0 = r0.A0o     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1O3 r6 = r0.A06     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "MessageCallbacksManager/received_message too large error; stanzaKey="
            r1.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r1.append(r8)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r1.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.Map r1 = r6.A03     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            monitor-enter(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r3 = r1.remove(r8)     // Catch:{ all -> 0x12dd }
            X.1Uf r3 = (X.C26971Uf) r3     // Catch:{ all -> 0x12dd }
            monitor-exit(r1)     // Catch:{ all -> 0x12dd }
            r2 = 0
            if (r3 == 0) goto L_0x12bf
            java.lang.String r1 = "Message payload too big"
            X.1gE r0 = new X.1gE     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>(r1, r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.BrC(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x12bf:
            java.lang.String r1 = r8.A06     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 != 0) goto L_0x12d1
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x12dc
        L_0x12d1:
            X.00H r0 = r6.A02     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r0 = r0.get()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1dB r0 = (X.C29971dB) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A09(r2)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x12dc:
            throw r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x12dd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x12dd }
            throw r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x12e0:
            int r6 = X.AnonymousClass2U7.A00(r5)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.Object r4 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r4 = (X.C29621ca) r4     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.A02(r4)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.<init>()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/type="
            r3.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.append(r6)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = " tag="
            r3.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r4.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = ", id="
            r3.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r4.A0Q(r2, r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r3.append(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = r3.toString()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            goto L_0x1367
        L_0x1317:
            java.lang.Object r7 = r5.obj     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1gD r0 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.2rj r4 = r0.A00     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r6 = "available"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0 = 0
            r1[r0] = r6     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r12 = 1
            java.lang.String r0 = "unavailable"
            r1[r12] = r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.util.List r3 = java.util.Arrays.asList(r1)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.C18070vi.A0X(r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "presence"
            X.1cX r2 = new X.1cX     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.<init>((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r7 == 0) goto L_0x1354
            r8 = 0
            r10 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r0 = X.C29601cY.A04(r7, r8, r10, r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            if (r0 == 0) goto L_0x1354
            java.lang.String r1 = "name"
            X.1MD r0 = new X.1MD     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r2.A04(r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
        L_0x1354:
            java.lang.String r0 = "type"
            r2.A08(r6, r0, r3)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.1ca r1 = r2.A03()     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.3MD r0 = r4.A0A     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            X.37M r0 = (X.AnonymousClass37M) r0     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            r0.CSL(r1, r12)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            java.lang.String r0 = "WriterThread/write/push-name"
        L_0x1367:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1gE -> 0x1392, IOException -> 0x136b }
            return
        L_0x136b:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend unknown I/O error writing to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 1
            r0 = r18
            r0.A01 = r2
            android.os.Handler r1 = r5.getTarget()
            android.os.Message r0 = android.os.Message.obtain(r5)
            r1.sendMessageAtFrontOfQueue(r0)
            r0 = r18
            X.1gA r1 = r0.A03
            r0 = r0
            X.2rj r0 = r0.A00
            android.os.Handler r1 = (android.os.Handler) r1
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
            return
        L_0x1392:
            r1 = move-exception
            java.lang.String r0 = "WriterThread/handleXmppSend tried to write too large of a buffer to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x1399:
            X.1O7 r2 = r0.A08     // Catch:{ all -> 0x13b1 }
            java.util.concurrent.ConcurrentMap r0 = r2.A00     // Catch:{ all -> 0x13b1 }
            java.lang.Object r1 = r0.remove(r7)     // Catch:{ all -> 0x13b1 }
            if (r1 == 0) goto L_0x13a7
            r0 = 4
            r2.removeMessages(r0, r1)     // Catch:{ all -> 0x13b1 }
        L_0x13a7:
            r0 = 5
            android.os.Message r0 = r2.obtainMessage(r0, r7)     // Catch:{ all -> 0x13b1 }
            r0.sendToTarget()     // Catch:{ all -> 0x13b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x13b1 }
            return
        L_0x13b1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x13b1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31841gD.A00(android.os.Message):void");
    }

    public void onLooperPrepared() {
        ((Handler) this.A03).obtainMessage(0, new C31881gH(getLooper(), this)).sendToTarget();
    }
}
