package X;

import java.io.File;

public class DB7 implements C28575E8i {
    public boolean A00;
    public final /* synthetic */ DAO A01;

    public DB7(DAO dao) {
        this.A01 = dao;
    }

    public void CC5(File file) {
        DAO dao = this.A01;
        if (!dao.A01.equals(file) && !this.A00) {
            file.delete();
        }
        if (this.A00 && file.equals(dao.A02)) {
            this.A00 = false;
        }
    }

    public void CCC(File file) {
        if (!this.A00 && file.equals(this.A01.A02)) {
            this.A00 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r5.equals(r1) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CRt(java.io.File r10) {
        /*
            r9 = this;
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0067
            X.DAO r6 = r9.A01
            java.lang.String r8 = r10.getName()
            r7 = 46
            int r2 = r8.lastIndexOf(r7)
            if (r2 <= 0) goto L_0x0067
            java.lang.String r1 = r8.substring(r2)
            java.lang.String r5 = ".cnt"
            r4 = r5
            boolean r0 = r5.equals(r1)
            if (r0 != 0) goto L_0x0027
            java.lang.String r5 = ".tmp"
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0067
        L_0x0027:
            r3 = 0
            java.lang.String r1 = r8.substring(r3, r2)
            java.lang.String r2 = ".tmp"
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x003e
            int r0 = r1.lastIndexOf(r7)
            if (r0 <= 0) goto L_0x0067
            java.lang.String r1 = r1.substring(r3, r0)
        L_0x003e:
            java.io.File r1 = X.DAO.A00(r6, r1)
            java.io.File r0 = r10.getParentFile()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0067
            if (r5 != r2) goto L_0x0060
            long r4 = r10.lastModified()
            X.E4N r0 = r6.A00
            long r2 = r0.now()
            long r0 = X.DAO.A05
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            return
        L_0x0060:
            if (r5 != r4) goto L_0x0063
            r3 = 1
        L_0x0063:
            X.C26208Cuj.A05(r3)
            return
        L_0x0067:
            r10.delete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DB7.CRt(java.io.File):void");
    }
}
