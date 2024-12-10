package X;

/* renamed from: X.9oa  reason: invalid class name and case insensitive filesystem */
public class C192549oa {
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public long A02 = 0;
    public final C27411Vz A03;

    public double A00() {
        AnonymousClass1W0 r0 = this.A03.A00;
        double A002 = r0.A00();
        String bool = Boolean.toString(r0.A01());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("voip/call/battery_monitor percent = ");
        A10.append(A002);
        C17900vP.A0f(", charging = ", bool, A10);
        return A002;
    }

    public C192549oa(C27411Vz r3) {
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (java.lang.Double.isNaN(r1) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(long r10) {
        /*
            r9 = this;
            double r5 = r9.A00()
            r9.A00 = r5
            long r1 = r9.A02
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0016
            double r1 = r9.A01
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L_0x0019
        L_0x0016:
            r9.A01 = r5
            r1 = r5
        L_0x0019:
            long r3 = java.lang.System.currentTimeMillis()
            r9.A02 = r3
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto L_0x0074
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L_0x0074
            r3 = 60000(0xea60, double:2.9644E-319)
            long r10 = r10 / r3
            double r1 = r1 - r5
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
            r10 = 1
        L_0x0036:
            double r3 = (double) r10
            double r1 = r1 / r3
            X.1Vz r0 = r9.A03
            X.1W0 r0 = r0.A00
            boolean r6 = r0.A01()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: "
            X.C17900vP.A0n(r0, r3, r6)
            int r0 = (int) r1
            float r5 = (float) r0
            double r3 = r9.A00
            int r0 = (int) r3
            float r0 = (float) r0
            int r4 = com.whatsapp.voipcalling.Voip.setBatteryState(r5, r0, r6)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r2 = " "
            r3.append(r2)
            double r0 = r9.A00
            r3.append(r0)
            r3.append(r2)
            r3.append(r6)
            java.lang.String r0 = " got result: "
            X.C17900vP.A0j(r0, r3, r4)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192549oa.A01(long):void");
    }
}
