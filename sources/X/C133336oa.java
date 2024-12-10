package X;

import java.util.Map;

/* renamed from: X.6oa  reason: invalid class name and case insensitive filesystem */
public class C133336oa {
    public final DFL A00;

    public Map A01() {
        return null;
    }

    public C26235CvV A00() {
        return (C26235CvV) DFL.A00(this.A00, 35);
    }

    public C133336oa(DFL dfl) {
        DFL dfl2 = new DFL(13535);
        this.A00 = dfl2;
        DFL dfl3 = (DFL) DFL.A00(dfl, 35);
        if (dfl3 != null) {
            dfl2.A0H(35, C26235CvV.A01(dfl3));
            dfl2.A0H(38, dfl.A0A(38));
            String str = "";
            String str2 = str;
            String A0D = dfl.A0D(36);
            dfl2.A0H(36, A0D != null ? A0D : str2);
            String str3 = str;
            String A0D2 = dfl.A0D(46);
            dfl2.A0H(46, A0D2 != null ? A0D2 : str3);
            String A0D3 = dfl.A0D(48);
            dfl2.A0H(48, A0D3 != null ? A0D3 : str);
            dfl2.A0H(45, dfl.A0A(45));
            return;
        }
        throw AnonymousClass000.A0n("Null content for BottomSheet");
    }
}
