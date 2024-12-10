package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1XG  reason: invalid class name */
public abstract class AnonymousClass1XG {
    public static Map A00 = new HashMap();

    public abstract int A01(double d, int i, long j, long j2, long j3);

    static {
        A00(new C49022Ow(10), "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt lo ms my nqo osa root sah ses sg su th to vi wo yo yue zh");
        A00(new C49022Ow(21), "am as bn fa gu hi kn zu");
        A00(new C49022Ow(29), "ff fr hy kab");
        A00.put("pt", new C49022Ow(30));
        A00(new C49022Ow(31), "ast ca de en et fi fy gl ia io it ji nl pt_PT sc scn sv sw ur yi");
        A00.put("si", new C49022Ow(32));
        A00(new C49022Ow(33), "ak bho guw ln mg nso pa ti wa");
        A00.put("tzm", new C49022Ow(34));
        A00(new C49022Ow(35), "af an asa az bem bez bg brx ce cgg chr ckb dv ee el eo es eu fo fur gsw ha haw hu jgo jmc ka kaj kcg kk kkj kl ks ksb ku ky lb lg mas mgo ml mn mr nah nb nd ne nn nnh no nr ny nyn om or os pap ps rm rof rwk saq sd sdh seh sn so sq ss ssy st syr ta te teo tig tk tn tr ts ug uz ve vo vun wae xh xog");
        A00.put("da", new C49022Ow(0));
        A00.put("is", new C49022Ow(1));
        A00.put("mk", new C49022Ow(2));
        A00(new C49022Ow(3), "ceb fil tl");
        A00(new C49022Ow(4), "lv prg");
        A00.put("lag", new C49022Ow(5));
        A00.put("ksh", new C49022Ow(6));
        A00(new C49022Ow(7), "iu naq se sma smi smj smn sms");
        A00.put("shi", new C49022Ow(8));
        A00(new C49022Ow(9), "mo ro");
        A00(new C49022Ow(11), "bs hr sh sr");
        A00.put("gd", new C49022Ow(12));
        A00.put("sl", new C49022Ow(13));
        A00(new C49022Ow(14), "dsb hsb");
        A00(new C49022Ow(15), "he iw");
        A00(new C49022Ow(16), "cs sk");
        A00.put("pl", new C49022Ow(17));
        A00.put("be", new C49022Ow(18));
        A00.put("lt", new C49022Ow(19));
        A00.put("mt", new C49022Ow(20));
        A00(new C49022Ow(22), "ru uk");
        A00.put("br", new C49022Ow(23));
        A00.put("ga", new C49022Ow(24));
        A00.put("gv", new C49022Ow(25));
        A00.put("kw", new C49022Ow(26));
        A00(new C49022Ow(27), "ar ars");
        A00.put("cy", new C49022Ow(28));
    }

    public static void A00(AnonymousClass1XG r8, String str) {
        for (String str2 : str.split(" ")) {
            Map map = A00;
            map.put(str2, r8);
            if ("pt_PT".equals(str2)) {
                Iterator it = AnonymousClass1XF.A00.iterator();
                while (it.hasNext()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pt_");
                    sb.append((String) it.next());
                    map.put(sb.toString(), r8);
                }
            }
        }
    }
}
