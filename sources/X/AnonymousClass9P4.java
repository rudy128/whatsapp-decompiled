package X;

/* renamed from: X.9P4  reason: invalid class name */
public abstract class AnonymousClass9P4 {
    public static final boolean A00(C166408cq r2) {
        String str;
        String str2;
        if (r2 != null) {
            int i = r2.bitField0_;
            if ((i & 4) == 0 || (str = r2.id_) == null || str.length() == 0 || (i & 1) == 0 || (str2 = r2.remoteJid_) == null || str2.length() == 0 || AnonymousClass3MX.A0l(str2) == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}
