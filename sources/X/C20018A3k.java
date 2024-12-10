package X;

import android.net.SSLSessionCache;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: X.A3k  reason: case insensitive filesystem */
public abstract class C20018A3k {
    public static boolean A00;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0101 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.net.SSLSessionCache r12, java.lang.String r13, javax.net.ssl.SSLContext r14, int r15) {
        /*
            java.lang.String r2 = "sslParameters"
            boolean r0 = A00
            if (r0 != 0) goto L_0x0156
            if (r12 == 0) goto L_0x0156
            r4 = 1
            java.lang.Class r1 = r12.getClass()     // Catch:{ Exception -> 0x007a }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x007a }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x007a }
            java.lang.Object r6 = r0.get(r12)     // Catch:{ Exception -> 0x007a }
            java.lang.Class r5 = r6.getClass()     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "getSessionData"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x007a }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10 = 0
            r1[r10] = r11     // Catch:{ Exception -> 0x007a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007a }
            r1[r4] = r0     // Catch:{ Exception -> 0x007a }
            java.lang.reflect.Method r1 = r5.getMethod(r3, r1)     // Catch:{ Exception -> 0x007a }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x007a }
            r0[r10] = r13     // Catch:{ Exception -> 0x007a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x007a }
            r0[r4] = r9     // Catch:{ Exception -> 0x007a }
            java.lang.Object r8 = r1.invoke(r6, r0)     // Catch:{ Exception -> 0x007a }
            byte[] r8 = (byte[]) r8     // Catch:{ Exception -> 0x007a }
            if (r8 == 0) goto L_0x008d
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x007a }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x007a }
            java.lang.Class r6 = r0.getSuperclass()     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "toSession"
            r5 = 3
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x007a }
            java.lang.Class<byte[]> r0 = byte[].class
            r1[r10] = r0     // Catch:{ Exception -> 0x007a }
            r1[r4] = r11     // Catch:{ Exception -> 0x007a }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007a }
            r1[r7] = r0     // Catch:{ Exception -> 0x007a }
            java.lang.reflect.Method r3 = r6.getDeclaredMethod(r3, r1)     // Catch:{ Exception -> 0x007a }
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x007a }
            javax.net.ssl.SSLSessionContext r1 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x007a }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r8, r13, r5, r4)     // Catch:{ Exception -> 0x007a }
            r0[r7] = r9     // Catch:{ Exception -> 0x007a }
            java.lang.Object r0 = r3.invoke(r1, r0)     // Catch:{ Exception -> 0x007a }
            javax.net.ssl.SSLSession r0 = (javax.net.ssl.SSLSession) r0     // Catch:{ Exception -> 0x007a }
            if (r0 == 0) goto L_0x008d
            A02(r0)     // Catch:{ Exception -> 0x007a }
            goto L_0x008d
        L_0x007a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SSLSessionCacheHack:"
            r1.append(r0)
            java.lang.String r0 = r3.toString()
            X.C17890vO.A1A(r1, r0)
            A00 = r4
        L_0x008d:
            java.lang.Class r1 = r12.getClass()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = "mSessionCache"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0143 }
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0143 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0143 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r3 = "getSession"
            r7 = 2
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0143 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9 = 0
            r1[r9] = r10     // Catch:{ Exception -> 0x0143 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0143 }
            r1[r4] = r0     // Catch:{ Exception -> 0x0143 }
            java.lang.reflect.Method r3 = r5.getMethod(r3, r1)     // Catch:{ Exception -> 0x0143 }
            javax.net.ssl.SSLSessionContext r1 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0143 }
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0143 }
            r0[r9] = r13     // Catch:{ Exception -> 0x0143 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0143 }
            r0[r4] = r8     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r1 = r3.invoke(r1, r0)     // Catch:{ Exception -> 0x0143 }
            javax.net.ssl.SSLSession r1 = (javax.net.ssl.SSLSession) r1     // Catch:{ Exception -> 0x0143 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0143 }
            r0.getSessionTimeout()     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x00d4
            A02(r1)     // Catch:{ Exception -> 0x0143 }
        L_0x00d4:
            java.lang.Class r1 = r14.getClass()     // Catch:{ NoSuchFieldException -> 0x00df }
            java.lang.String r0 = "contextSpi"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x00df }
            goto L_0x00e9
        L_0x00df:
            java.lang.Class r1 = r14.getClass()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = "spiImpl"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x0143 }
        L_0x00e9:
            if (r0 == 0) goto L_0x0140
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r1 = r0.get(r14)     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x0156
            java.lang.Class r0 = r1.getClass()     // Catch:{ NoSuchFieldException -> 0x0101 }
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x0101 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x0101 }
            goto L_0x0109
        L_0x0101:
            java.lang.Class r0 = r1.getClass()     // Catch:{ Exception -> 0x0143 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0143 }
        L_0x0109:
            r0.setAccessible(r4)     // Catch:{ Exception -> 0x0143 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ Exception -> 0x0143 }
            java.lang.Class r5 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0140 }
            java.lang.String r2 = "getCachedClientSession"
            r3 = 3
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0140 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ NoSuchMethodException -> 0x0140 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ NoSuchMethodException -> 0x0140 }
            r1[r9] = r0     // Catch:{ NoSuchMethodException -> 0x0140 }
            r1[r4] = r10     // Catch:{ NoSuchMethodException -> 0x0140 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0140 }
            r1[r7] = r0     // Catch:{ NoSuchMethodException -> 0x0140 }
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch:{ NoSuchMethodException -> 0x0140 }
            r2.setAccessible(r4)     // Catch:{ Exception -> 0x0143 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0143 }
            javax.net.ssl.SSLSessionContext r0 = r14.getClientSessionContext()     // Catch:{ Exception -> 0x0143 }
            r1[r9] = r0     // Catch:{ Exception -> 0x0143 }
            r1[r4] = r13     // Catch:{ Exception -> 0x0143 }
            r1[r7] = r8     // Catch:{ Exception -> 0x0143 }
            r2.invoke(r6, r1)     // Catch:{ Exception -> 0x0143 }
            return
        L_0x0140:
            A00 = r4     // Catch:{ Exception -> 0x0143 }
            return
        L_0x0143:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SSLSessionCacheHack:"
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            X.C17890vO.A1B(r1, r0)
            A00 = r4
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20018A3k.A00(android.net.SSLSessionCache, java.lang.String, javax.net.ssl.SSLContext, int):void");
    }

    public static void A01(SSLSessionCache sSLSessionCache, SSLContext sSLContext) {
        String obj;
        if (sSLContext.getClientSessionContext() == null) {
            obj = "SSLSessionCacheHack/session context is null";
        } else if (!C108955ca.A0x(sSLContext.getClientSessionContext()).equals("ClientSessionContext")) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SSLSessionCacheHack/session context does not match, class=");
            AnonymousClass8BW.A1M(sSLContext.getClientSessionContext(), A10);
            obj = A10.toString();
        } else {
            try {
                Field declaredField = sSLSessionCache.getClass().getDeclaredField("mSessionCache");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(sSLSessionCache);
                Class<?> cls = Class.forName("com.android.org.conscrypt.SSLClientSessionCache");
                sSLContext.getClientSessionContext().getClass().getMethod("setPersistentCache", new Class[]{cls}).invoke(sSLContext.getClientSessionContext(), new Object[]{obj2});
                return;
            } catch (ClassNotFoundException e) {
                e.toString();
                return;
            } catch (Exception e2) {
                C17890vO.A19(AnonymousClass000.A11("SSLSessionCacheHack:"), e2.toString());
                return;
            }
        }
        Log.w(obj);
    }

    public static void A02(SSLSession sSLSession) {
        long j;
        try {
            j = (long) sSLSession.getPeerCertificates().length;
        } catch (SSLPeerUnverifiedException e) {
            Log.e((Throwable) e);
            j = -1;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("age=");
        A10.append(C17880vN.A04(System.currentTimeMillis() - sSLSession.getCreationTime()));
        A10.append(", creation=");
        A10.append(sSLSession.getCreationTime());
        A10.append(", protocol=");
        A10.append(sSLSession.getProtocol());
        A10.append(", valid=");
        A10.append(sSLSession.isValid());
        A10.append(", peerCertificateCount=");
        A10.append(j);
        A10.toString();
    }
}
