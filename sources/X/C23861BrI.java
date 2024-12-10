package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.util.List;

/* renamed from: X.BrI  reason: case insensitive filesystem */
public class C23861BrI extends DP9 {
    public static final AnonymousClass00H A06 = C18150vq.A02(new DWI(1));
    public static final AnonymousClass00H A07 = C18150vq.A02(new DWI(0));
    public final Application.ActivityLifecycleCallbacks A00 = new C1411274j(this);
    public final Context A01;
    public final Handler A02;
    public final C25034CUl A03;
    public final C4J A04 = new C23862BrJ(this, 0);
    public final boolean A05;

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.CsH] */
    public void Bd6() {
        C25034CUl cUl;
        Application application;
        if (this.A05 && (cUl = this.A03) != null) {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                C17900vP.A0f("_disabled_", "Hidden apis are not accessible", DP9.A01(this));
                return;
            }
            C4J c4j = this.A04;
            List list = C24725CHm.A00;
            if (!list.contains(c4j)) {
                list.add(c4j);
            }
            AnonymousClass00H r1 = C26097CsH.A04;
            if (BE9.A1U(r1)) {
                C17960vV.A0H(BE9.A1U(r1), "Check isSupported() before call get() or use getOrNull() instead");
                if (C26097CsH.A00 == null) {
                    C26097CsH.A00 = new Object();
                }
                Activity A002 = C26097CsH.A00();
                if (A002 != null) {
                    cUl.A00(A002);
                }
            }
            Context context = this.A01;
            if (((context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) && (application = (Application) context) != null) {
                application.registerActivityLifecycleCallbacks(this.A00);
            }
            C17890vO.A1A(DP9.A01(this), "_enabled");
        }
    }

    public String getName() {
        return "MediaSessionANRFixer";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.CUl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.CUl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.CUl} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A02, 10933) == false) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23861BrI(X.C28472E2n r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            X.74j r0 = new X.74j
            r0.<init>(r5)
            r5.A00 = r0
            r1 = 0
            X.BrJ r0 = new X.BrJ
            r0.<init>(r5, r1)
            r5.A04 = r0
            X.31t r6 = (X.C680231t) r6
            android.content.Context r0 = r6.A01
            r5.A01 = r0
            java.lang.Class<X.31t> r0 = X.C680231t.class
            X.E2n r4 = r5.A00
            boolean r0 = r0.isInstance(r4)
            if (r0 != 0) goto L_0x0023
            r4 = 0
        L_0x0023:
            X.31t r4 = (X.C680231t) r4
            X.00H r0 = A07
            boolean r0 = X.BE9.A1U(r0)
            if (r0 == 0) goto L_0x0044
            X.00H r0 = A06
            boolean r0 = X.BE9.A1U(r0)
            if (r0 == 0) goto L_0x0044
            if (r4 == 0) goto L_0x0044
            X.0ve r2 = r4.A02
            r1 = 10933(0x2ab5, float:1.532E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            r5.A05 = r3
            r2 = 0
            if (r4 != 0) goto L_0x0057
            r1 = r2
        L_0x004b:
            r5.A02 = r1
            if (r3 == 0) goto L_0x0054
            X.CUl r2 = new X.CUl
            r2.<init>()
        L_0x0054:
            r5.A03 = r2
            return
        L_0x0057:
            android.os.Handler r1 = r4.A00
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "Fixie"
            r0 = 10
            android.os.Looper r0 = X.BEA.A0L(r1, r0)
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            r4.A00 = r1
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23861BrI.<init>(X.E2n):void");
    }
}
