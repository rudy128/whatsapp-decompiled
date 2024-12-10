package X;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class D7Q implements E7E {
    public final C24745CIh A00;
    public final WindowLayoutComponent A01;
    public final Map A02 = C17880vN.A13();
    public final Map A03 = C17880vN.A13();
    public final Map A04 = C17880vN.A13();
    public final ReentrantLock A05 = new ReentrantLock();

    public void CDy(Context context, AnonymousClass1GV r16, Executor executor) {
        C18070vi.A0d(context, 0);
        ReentrantLock reentrantLock = this.A05;
        reentrantLock.lock();
        try {
            Map map = this.A03;
            D6K d6k = (D6K) map.get(context);
            AnonymousClass1GV r2 = r16;
            if (d6k != null) {
                d6k.A00(r2);
                this.A04.put(r2, context);
            } else {
                D6K d6k2 = new D6K(context);
                map.put(context, d6k2);
                this.A04.put(r2, context);
                d6k2.A00(r2);
                if (context instanceof Activity) {
                    C24745CIh cIh = this.A00;
                    WindowLayoutComponent windowLayoutComponent = this.A01;
                    AnonymousClass20F A15 = AnonymousClass3MW.A15(WindowLayoutInfo.class);
                    Activity activity = (Activity) context;
                    C27445DfW dfW = new C27445DfW(d6k2);
                    C18070vi.A0d(activity, 4);
                    C27093DTs dTs = new C27093DTs(dfW, A15);
                    ClassLoader classLoader = cIh.A00;
                    Object A0e = BEA.A0e(classLoader, "java.util.function.Consumer", dTs, new Class[1]);
                    Class<?> cls = windowLayoutComponent.getClass();
                    Class[] clsArr = new Class[2];
                    clsArr[0] = Activity.class;
                    BE6.A0x(cls, BE7.A0V(classLoader, "java.util.function.Consumer"), "addWindowLayoutInfoListener", clsArr, 1).invoke(windowLayoutComponent, C108945cZ.A1a(activity, A0e, 2, 1));
                    this.A02.put(d6k2, new D7D(windowLayoutComponent, A0e, BE6.A0x(cls, BE7.A0V(classLoader, "java.util.function.Consumer"), "removeWindowLayoutInfoListener", new Class[1], 0)));
                } else {
                    d6k2.accept(new WindowLayoutInfo(C18460wS.A00));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQC(X.AnonymousClass1GV r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.util.concurrent.locks.ReentrantLock r5 = r7.A05
            r5.lock()
            java.util.Map r6 = r7.A04     // Catch:{ all -> 0x005c }
            java.lang.Object r4 = r6.get(r8)     // Catch:{ all -> 0x005c }
            android.content.Context r4 = (android.content.Context) r4     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0058
            java.util.Map r3 = r7.A03     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r3.get(r4)     // Catch:{ all -> 0x005c }
            X.D6K r2 = (X.D6K) r2     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0058
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ all -> 0x005c }
            r1.lock()     // Catch:{ all -> 0x005c }
            java.util.Set r0 = r2.A01     // Catch:{ all -> 0x0053 }
            r0.remove(r8)     // Catch:{ all -> 0x0053 }
            r1.unlock()     // Catch:{ all -> 0x005c }
            r6.remove(r8)     // Catch:{ all -> 0x005c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            r3.remove(r4)     // Catch:{ all -> 0x005c }
            java.util.Map r0 = r7.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x005c }
            X.E0P r0 = (X.E0P) r0     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0058
            X.D7D r0 = (X.D7D) r0     // Catch:{ all -> 0x005c }
            java.lang.reflect.Method r4 = r0.A02     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r0.A01     // Catch:{ all -> 0x005c }
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1a()     // Catch:{ all -> 0x005c }
            r1 = 0
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x005c }
            r2[r1] = r0     // Catch:{ all -> 0x005c }
            r4.invoke(r3, r2)     // Catch:{ all -> 0x005c }
            goto L_0x0058
        L_0x0053:
            r0 = move-exception
            r1.unlock()     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x0058:
            r5.unlock()
            return
        L_0x005c:
            r0 = move-exception
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D7Q.CQC(X.1GV):void");
    }

    public D7Q(C24745CIh cIh, WindowLayoutComponent windowLayoutComponent) {
        this.A01 = windowLayoutComponent;
        this.A00 = cIh;
    }
}
