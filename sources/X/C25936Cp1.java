package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.Cp1  reason: case insensitive filesystem */
public final class C25936Cp1 {
    public static final List A01 = C17880vN.A0z(50);
    public final Handler A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.Cjc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.Cjc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.Cjc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25646Cjc A00() {
        /*
            java.util.List r1 = A01
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0010
            X.Cjc r0 = new X.Cjc     // Catch:{ all -> 0x001c }
            r0.<init>()     // Catch:{ all -> 0x001c }
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            goto L_0x001b
        L_0x0010:
            int r0 = X.AnonymousClass3MX.A01(r1)     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r1.remove(r0)     // Catch:{ all -> 0x001c }
            X.Cjc r0 = (X.C25646Cjc) r0     // Catch:{ all -> 0x001c }
            goto L_0x000e
        L_0x001b:
            return r0
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25936Cp1.A00():X.Cjc");
    }

    public C25936Cp1(Handler handler) {
        this.A00 = handler;
    }
}
