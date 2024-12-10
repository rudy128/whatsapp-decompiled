package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.6u4  reason: invalid class name and case insensitive filesystem */
public class C136596u4 {
    public int A00 = 1;
    public int A01 = 1;
    public C160878Ah A02;
    public AnonymousClass73D A03 = new AnonymousClass73D();
    public boolean A04;
    public boolean A05 = false;
    public final AnonymousClass11C A06;
    public final AnonymousClass00H A07;
    public final List A08 = AnonymousClass000.A13();
    public final Set A09 = C17880vN.A14();
    public final C18030ve A0A;
    public final AnonymousClass10I A0B;

    public void A00() {
        List<AnonymousClass8BB> list = this.A08;
        if (!list.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            for (AnonymousClass8BB BRc : list) {
                A13.add(BRc.BRc());
            }
            this.A0B.CGF(new AnonymousClass7RL(this, A13, 15));
            list.clear();
        }
    }

    public boolean A01() {
        int i = this.A00;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean A02(Uri uri) {
        for (AnonymousClass8B2 BLl : this.A08) {
            if (uri.equals(BLl.BLl())) {
                return true;
            }
        }
        return false;
    }

    public C136596u4(AnonymousClass11C r2, C18030ve r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A0A = r3;
        this.A0B = r4;
        this.A07 = r5;
        this.A06 = r2;
    }
}
