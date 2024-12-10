package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1E7  reason: invalid class name */
public class AnonymousClass1E7 implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public C42741yf A0G;
    public C59042lf A0H;
    public AnonymousClass1E7 A0I;
    public AnonymousClass1BI A0J;
    public UserJid A0K;
    public C53792d6 A0L;
    public C42661yX A0M;
    public Integer A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public Locale A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public String A15;

    public static boolean A03(C133356oc r3, List list) {
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    } else if (r3.A01((AnonymousClass1E7) it.next()) || z) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public AnonymousClass1E7 A05() {
        try {
            Object clone = super.clone();
            if (clone instanceof AnonymousClass1E7) {
                return (AnonymousClass1E7) clone;
            }
        } catch (CloneNotSupportedException unused) {
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1E7) {
                AnonymousClass1E7 r7 = (AnonymousClass1E7) obj;
                if (C42171xk.A00(this.A0J, r7.A0J) && C42171xk.A00(this.A0H, r7.A0H)) {
                    C59042lf r0 = this.A0H;
                    if (r0 != null && r0.A00 == -5) {
                        String str = this.A0R;
                        String str2 = r7.A0R;
                        if (str != null) {
                            return str.equals(str2);
                        }
                        if (str2 != null) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass1BI A00(AnonymousClass1E7 r1) {
        return (AnonymousClass1BI) r1.A06(AnonymousClass1BI.class);
    }

    public static Jid A01(AnonymousClass1E7 r1) {
        return r1.A06(UserJid.class);
    }

    public static ArrayList A02(Collection collection) {
        Class<UserJid> cls = UserJid.class;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A062 = ((AnonymousClass1E7) it.next()).A06(cls);
                if (A062 != null) {
                    arrayList.add(A062);
                }
            }
        }
        return arrayList;
    }

    public Jid A06(Class cls) {
        if (cls.isInstance(this.A0J)) {
            return (Jid) cls.cast(this.A0J);
        }
        return null;
    }

    public String A07() {
        C59042lf r3 = this.A0H;
        if (r3 == null) {
            return C22971Dz.A06(this.A0J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A00);
        sb.append(":");
        sb.append(r3.A01);
        return sb.toString();
    }

    public String A08(float f, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(A07());
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(f);
        return sb.toString();
    }

    public void A09(C42661yX r3) {
        C42661yX r0 = this.A0M;
        if (r0 != null && !TextUtils.equals(r0.A04, r3.A04)) {
            this.A0M = r3;
        }
    }

    public boolean A0B() {
        C59042lf r0 = this.A0H;
        if (r0 == null || TextUtils.isEmpty(r0.A01)) {
            return false;
        }
        return true;
    }

    public boolean A0D() {
        if (this.A00 != 1 || !A0C()) {
            return false;
        }
        return true;
    }

    public boolean A0E() {
        if (this.A00 != 2 || !A0C()) {
            return false;
        }
        return true;
    }

    public boolean A0F() {
        if (this instanceof AnonymousClass25I) {
            return true;
        }
        AnonymousClass1BI r0 = this.A0J;
        if (r0 != null) {
            return C22971Dz.A0e(r0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("row_id=");
        sb.append(A0J());
        sb.append(" jid=");
        sb.append("(null)");
        sb.append(" key=");
        C59042lf r2 = this.A0H;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(r2.A01);
        }
        sb.append(" phone=");
        sb.append(this.A0N);
        sb.append(" iswa=");
        sb.append(this.A10);
        if (A0J() == -1) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("problematic contact:");
        sb2.append(sb);
        Log.e(sb2.toString());
        return false;
    }

    @Deprecated
    public boolean A0G() {
        String str = this.A0V;
        if (str == null || !str.startsWith("smb:")) {
            return false;
        }
        return true;
    }

    public boolean A0H() {
        if (this.A0J == null || !A0B()) {
            return false;
        }
        return true;
    }

    public boolean A0I(AnonymousClass190 r7, C53792d6 r8) {
        String str;
        int i = r8.A00;
        if ((i == 2 || i == 6) && r8.A01 == null) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            AnonymousClass1BI r2 = this.A0J;
            if (r2 != null) {
                str = r2.toString();
            } else {
                str = "unknown@unknown";
            }
            if (!(r2 instanceof AnonymousClass1EC) && !(r2 instanceof AnonymousClass1EB)) {
                str = String.format(locale, "[obfuscated]@%s", new Object[]{str.substring(str.indexOf("@") + 1)});
            }
            objArr[0] = str;
            String format = String.format(locale, "(manage_community_groups) contact/community_info Detected subgroup '%s' without parent info", objArr);
            Log.e(format);
            r7.A0G("missing_parent_info", format, true);
            return false;
        }
        this.A0L = r8;
        return true;
    }

    public int hashCode() {
        C59042lf r8 = this.A0H;
        return Arrays.hashCode((r8 == null || r8.A00 != -5) ? new Object[]{this.A0J, r8} : new Object[]{this.A0J, r8, this.A0R});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("row_id=");
        sb.append(A0J());
        sb.append(" jid=");
        AnonymousClass1BI r0 = this.A0J;
        if (r0 == null) {
            r0 = "(null)";
        }
        sb.append(r0);
        sb.append(" key=");
        C59042lf r2 = this.A0H;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(AnonymousClass1EG.A0B(r2.A01, 4));
        }
        sb.append(" phone=");
        sb.append(this.A0N);
        sb.append(" iswa=");
        sb.append(this.A10);
        if (A0F()) {
            sb.append(" status=");
            sb.append(this.A0Z);
        }
        return sb.toString();
    }

    public AnonymousClass1E7(AnonymousClass1BI r4) {
        this.A0C = -1;
        this.A0g = true;
        this.A0O = "pn";
        this.A0n = false;
        this.A0I = null;
        this.A00 = 0;
        this.A03 = 0;
        this.A0q = true;
        this.A0J = r4;
        this.A10 = true;
        this.A0H = null;
        if (C22971Dz.A0e(r4)) {
            this.A0M = C42661yX.A05;
        }
        if (C22971Dz.A0S(r4)) {
            this.A0g = false;
        }
    }

    public boolean A0A() {
        if (!A0C() || this.A0A != 3) {
            return false;
        }
        return true;
    }

    public boolean A0C() {
        int i;
        if (A0L() == null || (i = this.A0A) == 0 || i == -1) {
            return false;
        }
        return true;
    }

    public long A0J() {
        return this.A0C;
    }

    public String A0K() {
        return this.A0R;
    }

    public String A0L() {
        return this.A15;
    }

    public void A0M(long j) {
        this.A0C = j;
    }

    public void A0N(String str) {
        this.A15 = str;
    }

    public boolean A0O() {
        if (!A0C() || !A0A()) {
            return false;
        }
        return true;
    }

    public boolean A0P() {
        if (!A0F() || !this.A0j) {
            return false;
        }
        return true;
    }

    public AnonymousClass1E7(AnonymousClass1BI r6, String str, String str2, String str3, int i, long j, boolean z) {
        int length;
        this.A0C = -1;
        boolean z2 = true;
        this.A0g = true;
        this.A0O = "pn";
        this.A0n = false;
        this.A0I = null;
        this.A00 = 0;
        this.A03 = 0;
        this.A0q = true;
        this.A0J = r6;
        this.A10 = z;
        this.A0R = str2;
        if ((j >= 1 || j == -2 || j == -5) && str != null && 5 <= (length = str.length()) && length <= 20) {
            this.A0H = new C59042lf(j, str);
        }
        this.A0N = Integer.valueOf(i);
        this.A0X = str3;
        this.A0o = j != -4 ? false : z2;
        if (C22971Dz.A0S(r6)) {
            this.A0g = false;
        }
    }
}
