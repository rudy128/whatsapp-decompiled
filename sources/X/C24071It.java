package X;

import java.util.Map;

/* renamed from: X.1It  reason: invalid class name and case insensitive filesystem */
public class C24071It {
    public final C24051Ir A00;
    public final C24081Iu A01;
    public final C24091Iv A02;

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1Iy, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24071It(X.AnonymousClass1FD r4) {
        /*
            r3 = this;
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1Iu r2 = r4.Bba()
            boolean r0 = r4 instanceof X.AnonymousClass1FC
            if (r0 == 0) goto L_0x001a
            X.1FC r4 = (X.AnonymousClass1FC) r4
            X.1Ir r1 = r4.BQR()
            X.1Iv r0 = r4.BQQ()
        L_0x0016:
            r3.<init>(r1, r2, r0)
            return
        L_0x001a:
            X.1Iy r1 = X.C24121Iy.A00
            if (r1 != 0) goto L_0x0025
            X.1Iy r1 = new X.1Iy
            r1.<init>()
            X.C24121Iy.A00 = r1
        L_0x0025:
            X.1Ix r0 = X.C24111Ix.A00
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24071It.<init>(X.1FD):void");
    }

    public AnonymousClass1J2 A01(Class cls, String str) {
        AnonymousClass1J2 r1;
        C27631Wv r2;
        C18070vi.A0d(str, 0);
        Map map = this.A01.A00;
        AnonymousClass1J2 r3 = (AnonymousClass1J2) map.get(str);
        if (cls.isInstance(r3)) {
            C24051Ir r22 = this.A00;
            if ((r22 instanceof C27631Wv) && (r2 = (C27631Wv) r22) != null) {
                C18070vi.A0b(r3);
                if (r2 instanceof C37341pM) {
                    C37341pM r23 = (C37341pM) r2;
                    C18070vi.A0d(r3, 0);
                    C23381Fv r12 = r23.A00;
                    if (r12 != null) {
                        AnonymousClass1GB r0 = r23.A01;
                        C18070vi.A0b(r0);
                        C60272ng.A00(r12, r3, r0);
                    }
                } else {
                    AnonymousClass287 r24 = (AnonymousClass287) r2;
                    C18070vi.A0d(r3, 0);
                    AnonymousClass1GB r13 = r24.A01;
                    if (r13 != null) {
                        C23381Fv r02 = r24.A00;
                        C18070vi.A0b(r02);
                        C60272ng.A00(r02, r3, r13);
                    }
                }
            }
            C18070vi.A0z(r3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return r3;
        }
        C24101Iw r14 = new C24101Iw(this.A02);
        r14.A01(C24121Iy.A01, str);
        try {
            r1 = this.A00.BGl(r14, cls);
        } catch (AbstractMethodError unused) {
            r1 = this.A00.BG9(cls);
        }
        C18070vi.A0d(r1, 1);
        AnonymousClass1J2 r03 = (AnonymousClass1J2) map.put(str, r1);
        if (r03 != null) {
            r03.A0S();
        }
        return r1;
    }

    public AnonymousClass1J2 A00(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return A01(cls, sb.toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C24071It(C24051Ir r2, C24081Iu r3, C24091Iv r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24071It(X.C24051Ir r3, X.AnonymousClass1FD r4) {
        /*
            r2 = this;
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1Iu r1 = r4.Bba()
            boolean r0 = r4 instanceof X.AnonymousClass1FC
            if (r0 == 0) goto L_0x0016
            X.1FC r4 = (X.AnonymousClass1FC) r4
            X.1Iv r0 = r4.BQQ()
        L_0x0012:
            r2.<init>(r3, r1, r0)
            return
        L_0x0016:
            X.1Ix r0 = X.C24111Ix.A00
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24071It.<init>(X.1Ir, X.1FD):void");
    }
}
