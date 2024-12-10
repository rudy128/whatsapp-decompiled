package X;

import com.whatsapp.jobqueue.job.SendE2EMessageJob;

/* renamed from: X.2l1  reason: invalid class name and case insensitive filesystem */
public class C58642l1 {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0047
            r2 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x001a
            X.2l1 r5 = (X.C58642l1) r5
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0022
        L_0x001a:
            return r2
        L_0x001b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0022
            return r2
        L_0x0022:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0032
            return r2
        L_0x002b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0032
            return r2
        L_0x0032:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x001a
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 != 0) goto L_0x0042
            if (r0 == 0) goto L_0x0047
            r3 = 0
            return r3
        L_0x0042:
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0047:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58642l1.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2l1] */
    public static C58642l1 A00(SendE2EMessageJob sendE2EMessageJob) {
        String str = sendE2EMessageJob.jid;
        String str2 = sendE2EMessageJob.id;
        int i = sendE2EMessageJob.editVersion;
        String str3 = sendE2EMessageJob.participant;
        ? obj = new Object();
        obj.A01 = str;
        obj.A02 = str2;
        obj.A00 = i;
        obj.A03 = str3;
        return obj;
    }

    public int hashCode() {
        int i = 0;
        int A002 = (((((31 + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A02)) * 31) + this.A00) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A002 + i;
    }
}
