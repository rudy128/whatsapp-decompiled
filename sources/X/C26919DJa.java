package X;

/* renamed from: X.DJa  reason: case insensitive filesystem */
public abstract class C26919DJa implements EDY {
    public static boolean zzey;
    public int zzex = 0;

    public static int A04(EAC eac, Object obj) {
        C26919DJa dJa = (C26919DJa) obj;
        C23293Beh beh = (C23293Beh) dJa;
        int i = beh.zzjq;
        if (i != -1) {
            return i;
        }
        int CTi = eac.CTi(dJa);
        beh.zzjq = CTi;
        return CTi;
    }

    public static C25839Cmt A05(Object obj) {
        C23293Beh beh = (C23293Beh) obj;
        C25839Cmt cmt = beh.zzjp;
        if (cmt != C25839Cmt.A05) {
            return cmt;
        }
        C25839Cmt cmt2 = new C25839Cmt();
        beh.zzjp = cmt2;
        return cmt2;
    }
}
