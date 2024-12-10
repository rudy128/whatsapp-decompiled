package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.whatsapp.Main;

/* renamed from: X.1FB  reason: invalid class name */
public abstract class AnonymousClass1FB extends Activity implements AnonymousClass1F9, AnonymousClass1FA {
    public final AnonymousClass00O A00 = new AnonymousClass00O(0);
    public final C23391Fw A01 = new C23391Fw(this);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0P(java.lang.String[] r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x000f
            int r0 = r3.length
            if (r0 == 0) goto L_0x000f
            r1 = r3[r2]
            int r0 = r1.hashCode()
            switch(r0) {
                case -645125871: goto L_0x0010;
                case 100470631: goto L_0x001d;
                case 472614934: goto L_0x0020;
                case 1159329357: goto L_0x002d;
                case 1455016274: goto L_0x003a;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r2
        L_0x0010:
            java.lang.String r0 = "--translation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            goto L_0x0046
        L_0x001d:
            java.lang.String r0 = "--dump-dumpable"
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "--list-dumpables"
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            goto L_0x0046
        L_0x002d:
            java.lang.String r0 = "--contentcapture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            goto L_0x0046
        L_0x003a:
            java.lang.String r0 = "--autofill"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
        L_0x0046:
            if (r1 < r0) goto L_0x000f
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FB.A0P(java.lang.String[]):boolean");
    }

    public void A2D(AnonymousClass2RX r3) {
        C18070vi.A0d(r3, 0);
        this.A00.put(r3.getClass(), r3);
    }

    public void A2E(Class cls) {
        C18070vi.A0d(cls, 0);
        this.A00.get(cls);
    }

    public boolean COl(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        if (AnonymousClass1HF.A0v(decorView, keyEvent)) {
            return true;
        }
        return AnonymousClass1HJ.A00(keyEvent, decorView, this, this);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        View decorView = getWindow().getDecorView();
        C18070vi.A0X(decorView);
        if (AnonymousClass1HF.A0v(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        this.A01.A08(C23401Fx.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public static void A0M(AnonymousClass10E r1, AnonymousClass1FU r2) {
        r2.A0E = (C18030ve) r1.A04.get();
        r2.A05 = (AnonymousClass1KB) r1.A4b.get();
        r2.A03 = (AnonymousClass190) r1.A31.get();
        r2.A04 = (C218617r) r1.A8v.get();
        r2.A0D = (AnonymousClass1KW) r1.A3d.get();
        r2.A06 = (AnonymousClass18O) r1.A9p.get();
        r2.A08 = (AnonymousClass11C) r1.AAp.get();
        r2.A0A = (C19830z4) r1.ABl.get();
    }

    public static void A0N(Main main) {
        ((A8V) main.A0E.get()).A0I("verification_successful", "continue");
    }

    public static boolean A0O(Main main) {
        return ((C31361fR) main.A0D.get()).A02();
    }

    public static AnonymousClass10E A0J(AnonymousClass1K1 r1, AnonymousClass1FU r2) {
        r2.A01 = AnonymousClass1K1.A1X(r1);
        AnonymousClass10E r12 = r1.AAQ;
        r2.A05 = (AnonymousClass10I) r12.AC1.get();
        r2.A09 = (AnonymousClass11P) r12.AAv.get();
        return r12;
    }

    public static void A0K(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1FU r3, C18140vp r4) {
        r3.A0F = (AnonymousClass1L1) r4.get();
        r3.A07 = (AnonymousClass11E) r1.A2X.get();
        r3.A0B = (AnonymousClass11O) r1.ABn.get();
        r3.A0C = (AnonymousClass1L2) r2.A40.get();
    }

    public static void A0L(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1FY r3, AnonymousClass00S r4) {
        r3.A0G = C000200d.A00(r4);
        r3.A05 = (AnonymousClass11P) r1.AAv.get();
        r3.A09 = (AnonymousClass1L4) r2.A2e.get();
        r3.A02 = (AnonymousClass11S) r1.A63.get();
        r3.A04 = (AnonymousClass1L7) r1.A3t.get();
        r3.A0C = C000200d.A00(r1.AAV);
        r3.A01 = (AnonymousClass1L9) r1.A0E.get();
        r3.A03 = (AnonymousClass1LC) r2.A5B.get();
        r3.A0A = C000200d.A00(r1.A0J);
        r3.A0B = C000200d.A00(r2.A3J);
        r3.A08 = (AnonymousClass1LD) r1.A9j.get();
        r3.A07 = (AnonymousClass1CM) r1.A9V.get();
        r3.A06 = AnonymousClass10E.A7j(r1);
    }

    public final void A2C() {
    }

    public C23381Fv getLifecycle() {
        return this.A01;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27541Wm.A00(this);
    }
}
