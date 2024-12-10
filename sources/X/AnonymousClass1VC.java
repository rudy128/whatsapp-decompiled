package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1VC  reason: invalid class name */
public final class AnonymousClass1VC {
    public final C25111Mx A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C18100vl A03 = new C18110vm(new AnonymousClass3Di(2));
    public final C18030ve A04;

    public AnonymousClass1VC(C25111Mx r3, AnonymousClass11P r4, C19830z4 r5, C18030ve r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        this.A01 = r4;
        this.A04 = r6;
        this.A00 = r3;
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A04, 8008) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r4 = this;
            X.0vl r0 = r4.A03
            java.lang.Object r3 = r0.getValue()
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            X.0z4 r0 = r4.A02
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "TOwmL_is_active"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0028
            X.0ve r2 = r4.A04
            r1 = 8008(0x1f48, float:1.1222E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.set(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VC.A01():void");
    }

    public final boolean A02() {
        C18100vl r1 = this.A03;
        if (((AtomicReference) r1.getValue()).get() == null) {
            A01();
        }
        Object obj = ((AtomicReference) r1.getValue()).get();
        C17960vV.A07(obj);
        C18070vi.A0X(obj);
        return ((Boolean) obj).booleanValue();
    }

    public final void A00() {
        if (A02()) {
            C25111Mx r4 = this.A00;
            for (Map.Entry entry : r4.A01.A0I().entrySet()) {
                AnonymousClass1BI r2 = (AnonymousClass1BI) entry.getKey();
                C58962lX r1 = (C58962lX) entry.getValue();
                if (C22971Dz.A0d(r2)) {
                    C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    C25111Mx.A02(r4, (UserJid) r2, r1.A00);
                }
            }
        }
    }

    public final boolean A03() {
        if (!A02() || !((SharedPreferences) this.A02.A00.get()).getBoolean("TOwmL_is_visible", false)) {
            return false;
        }
        return true;
    }
}
