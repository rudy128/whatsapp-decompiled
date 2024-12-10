package X;

/* renamed from: X.8jt  reason: invalid class name and case insensitive filesystem */
public class C168908jt extends C65802x8 {
    public final C22537BBu A00;

    public /* bridge */ /* synthetic */ Object BKe(C199029zJ r6, C25681CkC ckC, String str) {
        C23736Boh boh = (C23736Boh) ckC;
        short s = -1;
        switch (str.hashCode()) {
            case 763389172:
                s = AnonymousClass8BV.A0z("wa.action.GalaxyInit", str);
                break;
            case 1263410359:
                if (str.equals("bk.action.wa.extension.GetChatJid")) {
                    return this.A00.BOU(ALS.A05(boh));
                }
                break;
            case 2066585071:
                if (str.equals("bk.action.wa.extension.GetMsgKeyId")) {
                    return this.A00.BV6(ALS.A05(boh));
                }
                break;
        }
        if (s == 0) {
            this.A00.CHT(ALS.A05(boh), new C190469kz(boh, r6, this), AnonymousClass8BR.A16(r6.A00, 0));
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168908jt(X.C22537BBu r4) {
        /*
            r3 = this;
            java.lang.String[] r2 = X.AnonymousClass8BR.A1b()
            r1 = 0
            java.lang.String r0 = "wa.action.GalaxyInit"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "bk.action.wa.extension.GetChatJid"
            r2[r1] = r0
            r1 = 2
            java.lang.String r0 = "bk.action.wa.extension.GetMsgKeyId"
            r2[r1] = r0
            r3.<init>(r2)
            r3.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168908jt.<init>(X.BBu):void");
    }
}
