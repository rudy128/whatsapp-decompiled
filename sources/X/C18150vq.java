package X;

import android.os.SystemClock;
import java.util.Collections;

/* renamed from: X.0vq  reason: invalid class name and case insensitive filesystem */
public class C18150vq implements C18140vp, AnonymousClass00H {
    public long A00 = -1;
    public C18140vp A01;
    public volatile Object A02;

    public static C18150vq A01(C18140vp r2) {
        return new C18150vq((Object) null, r2);
    }

    public static C18150vq A02(C18140vp r2) {
        return new C18150vq((Object) null, r2);
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A02 != null) {
                z = true;
            }
        }
        return z;
    }

    public Object get() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    C18140vp r1 = this.A01;
                    boolean z = false;
                    if (r1 != null) {
                        z = true;
                    }
                    C17960vV.A0D(z);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Object obj = r1.get();
                        C17960vV.A07(obj);
                        this.A02 = obj;
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        this.A01 = null;
                    } catch (Throwable th) {
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        throw th;
                    }
                }
            }
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18150vq(java.lang.Object r3, X.C18140vp r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A00 = r0
            if (r4 != 0) goto L_0x000c
            r1 = 0
            if (r3 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.C17960vV.A0G(r1, r0)
            r2.A01 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18150vq.<init>(java.lang.Object, X.0vp):void");
    }

    public static C18150vq A00() {
        return new C18150vq(Collections.emptySet(), (C18140vp) null);
    }
}
