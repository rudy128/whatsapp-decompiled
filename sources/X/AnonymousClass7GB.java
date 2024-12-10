package X;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: X.7GB  reason: invalid class name */
public final class AnonymousClass7GB implements C72253Lf {
    public final Map A00 = C17880vN.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BMG(X.C58852lM r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A00
            monitor-enter(r4)
            X.6qw r0 = new X.6qw     // Catch:{ all -> 0x004a }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x004a }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r4)
            r3 = 0
            return r3
        L_0x0013:
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x004a }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0048
            java.util.Set r1 = r4.entrySet()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Collection<kotlin.collections.Map.Entry<com.whatsapp.emoji.loader.EmojiCacheKey, java.lang.ref.SoftReference<android.graphics.Bitmap?>>>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0046 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0028:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0048
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)     // Catch:{ all -> 0x0046 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0046 }
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0028
            r2.remove()     // Catch:{ all -> 0x0046 }
            goto L_0x0028
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return r3
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7GB.BMG(X.2lM, boolean):android.graphics.Bitmap");
    }

    public void CD0(Bitmap bitmap, C58852lM r5, boolean z) {
        Map map = this.A00;
        synchronized (map) {
            map.put(new C134656qw(r5, z), new SoftReference(bitmap));
        }
    }
}
