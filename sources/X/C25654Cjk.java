package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Cjk  reason: case insensitive filesystem */
public class C25654Cjk {
    public final C25670Ck0 A00;
    public final Object A01;

    public static C25489Cgk A00(String str, E6J[] e6jArr) {
        ReentrantLock reentrantLock;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C25513ChB.A01;
        DOU dou = (DOU) CG0.A00;
        Map map = dou.A01;
        C25489Cgk cgk = (C25489Cgk) map.get(str);
        if (cgk != null) {
            DOU.A00(dou, str);
        } else if (str.length() != 0) {
            cgk = new C25489Cgk(str, e6jArr);
            if (map.put(str, cgk) != null) {
                DOU.A00(dou, str);
            } else {
                reentrantLock = dou.A02;
                reentrantLock.lock();
                try {
                    dou.A00.addFirst(str);
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (map.size() > 400) {
                reentrantLock = dou.A02;
                reentrantLock.lock();
                String str2 = (String) dou.A00.removeLast();
                reentrantLock.unlock();
                map.remove(str2);
                return cgk;
            }
        } else {
            throw AnonymousClass000.A0k("json can not be null or empty");
        }
        return cgk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r6.A06() != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        if (r7 != false) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(java.lang.String r12, X.E6J... r13) {
        /*
            r11 = this;
            java.lang.String r1 = "path can not be null or empty"
            if (r12 == 0) goto L_0x00de
            int r0 = r12.length()
            if (r0 == 0) goto L_0x00de
            X.Cgk r4 = A00(r12, r13)
            java.lang.Object r10 = r11.A01
            X.Ck0 r5 = r11.A00
            X.Byk r9 = X.C24287Byk.AS_PATH_LIST
            java.util.Set r1 = r5.A03
            boolean r8 = r1.contains(r9)
            X.Byk r3 = X.C24287Byk.ALWAYS_RETURN_LIST
            boolean r7 = r1.contains(r3)
            X.Byk r0 = X.C24287Byk.SUPPRESS_EXCEPTIONS
            boolean r2 = r1.contains(r0)
            X.CYQ r1 = r4.A00
            X.BpG r6 = r1.A00
            X.Cca r0 = r6.A01
            boolean r0 = r0 instanceof X.C23770BpF
            r4 = 0
            if (r0 == 0) goto L_0x006e
            if (r8 != 0) goto L_0x004c
            if (r7 != 0) goto L_0x004c
            X.CmP r1 = r1.A00(r5, r10, r10)
            if (r2 == 0) goto L_0x00d6
            java.util.ArrayList r0 = r1.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00d6
        L_0x0045:
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0080
        L_0x004b:
            return r4
        L_0x004c:
            if (r2 != 0) goto L_0x0045
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Options "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " are not allowed when using path functions!"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.DaC r1 = new X.DaC
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x006e:
            X.CmP r3 = r1.A00(r5, r10, r10)
            if (r8 == 0) goto L_0x008b
            if (r2 == 0) goto L_0x009a
            java.util.ArrayList r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009a
        L_0x0080:
            X.EBZ r0 = r5.A00
            X.DOV r0 = (X.DOV) r0
            X.Clg r0 = r0.A00
            java.lang.Object r4 = r0.A01()
            return r4
        L_0x008b:
            if (r2 == 0) goto L_0x00ba
            java.util.ArrayList r0 = r3.A01()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00ba
            if (r7 == 0) goto L_0x0045
            goto L_0x0080
        L_0x009a:
            int r0 = r3.A00
            if (r0 != 0) goto L_0x00db
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No results for path: "
            r1.append(r0)
            X.CYQ r0 = r3.A02
            X.AnonymousClass8BS.A1D(r0, r1)
            java.lang.String r0 = r1.toString()
            X.Boi r1 = new X.Boi
            r1.<init>(r0)
            throw r1
        L_0x00ba:
            r2 = 0
            java.lang.Object r4 = r3.A00()
            if (r7 == 0) goto L_0x004b
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x004b
            X.EBZ r1 = r5.A00
            r0 = r1
            X.DOV r0 = (X.DOV) r0
            X.Clg r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            r1.CHv(r0, r2, r4)
            return r0
        L_0x00d6:
            java.lang.Object r4 = r1.A00()
            return r4
        L_0x00db:
            java.lang.Object r4 = r3.A03
            return r4
        L_0x00de:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25654Cjk.A01(java.lang.String, X.E6J[]):java.lang.Object");
    }

    public C25654Cjk(C25670Ck0 ck0, Object obj) {
        if (obj != null) {
            this.A00 = ck0;
            this.A01 = obj;
            return;
        }
        throw AnonymousClass000.A0k("json can not be null");
    }
}
