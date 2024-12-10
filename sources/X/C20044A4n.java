package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.A4n  reason: case insensitive filesystem */
public final class C20044A4n {
    public int A00;
    public int A01;
    public C64572uz A02;
    public C20259ADr A03;
    public C20260ADs A04;
    public AEA A05;
    public C20248ADg A06;
    public C20261ADt A07;
    public AEH A08;
    public UserJid A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public List A0O;
    public List A0P;
    public List A0Q;
    public List A0R;
    public List A0S;
    public List A0T;
    public List A0U;
    public List A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;

    public static void A00(C20044A4n a4n) {
        a4n.A0P = new ArrayList();
        a4n.A0V = new ArrayList();
        a4n.A08 = AEH.A04;
        a4n.A0U = new ArrayList();
        a4n.A0R = new ArrayList();
        a4n.A0C = "UNBLOCKED";
        a4n.A0O = new ArrayList();
        a4n.A0Q = new ArrayList();
        a4n.A0T = new ArrayList();
    }

    public final AEW A01() {
        List list;
        List list2 = this.A0S;
        if (list2 != null) {
            list = AnonymousClass8BU.A0y(list2);
        } else {
            list = null;
        }
        UserJid userJid = this.A09;
        String str = this.A0M;
        List A0y = AnonymousClass8BU.A0y(this.A0P);
        C18070vi.A0X(A0y);
        List A0y2 = AnonymousClass8BU.A0y(this.A0V);
        C18070vi.A0X(A0y2);
        String str2 = this.A0I;
        String str3 = this.A0H;
        AEH aeh = this.A08;
        C20260ADs aDs = this.A04;
        boolean z = this.A0W;
        String str4 = this.A0E;
        boolean z2 = this.A0X;
        String str5 = this.A0K;
        String str6 = this.A0F;
        boolean z3 = this.A0Z;
        String str7 = this.A0N;
        boolean z4 = this.A0a;
        boolean z5 = this.A0e;
        C20248ADg aDg = this.A06;
        C20259ADr aDr = this.A03;
        boolean z6 = this.A0b;
        AEA aea = this.A05;
        List A0y3 = AnonymousClass8BU.A0y(this.A0U);
        C18070vi.A0X(A0y3);
        String str8 = this.A0G;
        String str9 = this.A0J;
        boolean z7 = this.A0Y;
        int i = this.A01;
        List A0y4 = AnonymousClass8BU.A0y(this.A0R);
        C18070vi.A0X(A0y4);
        boolean z8 = this.A0d;
        C20261ADt aDt = this.A07;
        String str10 = this.A0C;
        List A0y5 = AnonymousClass8BU.A0y(this.A0O);
        C18070vi.A0X(A0y5);
        Integer num = this.A0A;
        boolean z9 = this.A0c;
        int i2 = this.A00;
        String str11 = this.A0B;
        String str12 = this.A0L;
        String str13 = this.A0D;
        List unmodifiableList = Collections.unmodifiableList(this.A0Q);
        C18070vi.A0X(unmodifiableList);
        List unmodifiableList2 = Collections.unmodifiableList(this.A0T);
        C18070vi.A0X(unmodifiableList2);
        return new AEW(this.A02, aDr, aDs, aea, aDg, aDt, aeh, userJid, num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, A0y, A0y2, A0y3, A0y4, list, A0y5, unmodifiableList, unmodifiableList2, i, i2, z, z2, z3, z4, z5, z6, z7, z8, z9, this.A0f);
    }

    public C20044A4n(AEW aew) {
        ArrayList A10;
        A00(this);
        this.A09 = aew.A09;
        this.A0M = aew.A0M;
        this.A0P = C17880vN.A10(aew.A0P);
        this.A0V = C17880vN.A10(aew.A0V);
        this.A0I = aew.A0I;
        this.A0H = aew.A0H;
        this.A08 = aew.A08;
        this.A04 = aew.A04;
        this.A0W = aew.A0Z;
        this.A0E = aew.A0E;
        this.A0X = aew.A0a;
        this.A0K = aew.A0K;
        this.A0F = aew.A0F;
        this.A0Z = aew.A0X;
        this.A0N = aew.A0N;
        this.A0a = aew.A0Y;
        this.A0e = aew.A0f;
        this.A06 = aew.A06;
        this.A03 = aew.A03;
        this.A0b = aew.A0b;
        this.A05 = aew.A05;
        this.A0U = C17880vN.A10(aew.A0U);
        this.A0G = aew.A0G;
        this.A0J = aew.A0J;
        this.A0Y = aew.A0W;
        this.A01 = aew.A01;
        this.A0R = C17880vN.A10(aew.A0S);
        List list = aew.A0R;
        if (list == null) {
            A10 = null;
        } else {
            A10 = C17880vN.A10(list);
        }
        this.A0S = A10;
        this.A0d = aew.A0d;
        this.A07 = aew.A07;
        this.A0C = aew.A0C;
        this.A0O = aew.A0O;
        this.A0A = aew.A0A;
        this.A0c = aew.A0c;
        this.A00 = aew.A00;
        this.A0B = aew.A0B;
        this.A0L = aew.A0L;
        this.A0D = aew.A0D;
        this.A0Q = C17880vN.A10(aew.A0Q);
        this.A0T = C17880vN.A10(aew.A0T);
        this.A02 = aew.A02;
        this.A0f = aew.A0e;
    }

    public C20044A4n() {
        A00(this);
    }
}
