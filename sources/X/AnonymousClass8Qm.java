package X;

import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8Qm  reason: invalid class name */
public class AnonymousClass8Qm extends AnonymousClass8Bp {
    public static final C197729xA A02 = new C197729xA();
    public static final C20381AIu A03 = new Object();
    public final AnonymousClass00O A00 = new AnonymousClass00O(0);
    public final ArrayList A01 = AnonymousClass000.A13();

    public AnonymousClass8Qm(C22347B4a... b4aArr) {
        C22347B4a b4a = b4aArr[0];
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        Iterator it = AnonymousClass1ZU.A05(intentFilter).iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter2 = (IntentFilter) it.next();
            this.A01.add(intentFilter2);
            int countActions = intentFilter2.countActions();
            for (int i = 0; i < countActions; i++) {
                String action = intentFilter2.getAction(i);
                AnonymousClass00O r0 = this.A00;
                action.getClass();
                r0.put(action, b4a);
            }
        }
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
        intentFilter3.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter3.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter3.addDataScheme("package");
        Iterator it2 = AnonymousClass1ZU.A05(intentFilter3).iterator();
        while (it2.hasNext()) {
            IntentFilter intentFilter4 = (IntentFilter) it2.next();
            int countActions2 = intentFilter4.countActions();
            int i2 = 0;
            while (true) {
                if (i2 < countActions2) {
                    String action2 = intentFilter4.getAction(i2);
                    if (action2 != null) {
                        Iterator A15 = AnonymousClass000.A15(CII.A00);
                        while (true) {
                            if (!A15.hasNext()) {
                                break;
                            }
                            Map.Entry A16 = AnonymousClass000.A16(A15);
                            String A0x = C17880vN.A0x(A16);
                            if (action2.startsWith(A0x)) {
                                if (((Set) A16.getValue()).contains(action2.substring(A0x.length()))) {
                                    break;
                                }
                            }
                        }
                        i2++;
                    }
                    if (!CII.A07.contains(action2)) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Trying to register a broadcast action (");
                        A10.append(action2);
                        throw new SecurityException(AnonymousClass000.A0y(") for a ProtectedActionDynamicBroadcastReceiver that is not declared in ProtectedBroadcastActions", A10));
                    }
                    i2++;
                }
            }
        }
        this.A00 = new A8B(A02, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r2.equals("android.intent.action.PACKAGE_FULLY_REMOVED") != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ba, code lost:
        if (r2.equals("android.intent.action.PACKAGE_REMOVED") == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r1 = r7.getAction()
            r1.getClass()
            X.00O r0 = r5.A00
            java.lang.Object r4 = r0.get(r1)
            X.B4a r4 = (X.C22347B4a) r4
            r4.getClass()
            super.onReceive(r6, r7)     // Catch:{ SecurityException -> 0x0016 }
            goto L_0x0038
        L_0x0016:
            r3 = move-exception
            X.9ii r2 = X.AnonymousClass9TD.A00
            java.lang.String r0 = r6.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 47
            r1.append(r0)
            X.AnonymousClass8BW.A1M(r5, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "deny"
            r2.A00(r7, r1, r0)
            boolean r0 = r3 instanceof X.C21589Amd
            if (r0 == 0) goto L_0x009d
            throw r3
        L_0x0038:
            X.AIw r4 = (X.C20383AIw) r4
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            android.net.Uri r0 = r7.getData()
            if (r0 == 0) goto L_0x0081
            java.lang.String r3 = r0.getSchemeSpecificPart()
            X.C18070vi.A0X(r3)
            r7.getAction()
            java.lang.String r2 = r7.getAction()
            if (r2 == 0) goto L_0x0081
            int r1 = r2.hashCode()
            r0 = 525384130(0x1f50b9c2, float:4.419937E-20)
            if (r1 == r0) goto L_0x00b4
            r0 = 1544582882(0x5c1076e2, float:1.62652439E17)
            if (r1 == r0) goto L_0x009e
            r0 = 1580442797(0x5e33a4ad, float:3.23616536E18)
            if (r1 != r0) goto L_0x0081
            java.lang.String r0 = "android.intent.action.PACKAGE_FULLY_REMOVED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0081
        L_0x006f:
            X.00H r0 = r4.A01
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r0 = 25
            X.7Qs r1 = new X.7Qs
            r1.<init>(r0, r3, r4)
        L_0x007c:
            java.lang.String r0 = "LaunchIntentPreloadAsyncInit"
            r2.CGS(r1, r0)
        L_0x0081:
            X.9ii r2 = X.AnonymousClass9TD.A00
            java.lang.String r0 = r6.getPackageName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 47
            r1.append(r0)
            X.AnonymousClass8BW.A1M(r5, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "allow"
            r2.A00(r7, r1, r0)
        L_0x009d:
            return
        L_0x009e:
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0081
            X.00H r0 = r4.A01
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            r0 = 35
            X.AkY r1 = new X.AkY
            r1.<init>(r6, r4, r3, r0)
            goto L_0x007c
        L_0x00b4:
            java.lang.String r0 = "android.intent.action.PACKAGE_REMOVED"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x006f
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qm.onReceive(android.content.Context, android.content.Intent):void");
    }
}
