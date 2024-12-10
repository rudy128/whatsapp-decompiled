package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: X.9Bf  reason: invalid class name and case insensitive filesystem */
public class C177949Bf extends A34 {
    public final int A00;
    public final C33301ib A01;
    public final C33311ic A02;
    public final AnonymousClass1QS A03;
    public final C188079gq A04;
    public final AnonymousClass10I A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A = true;
    public final boolean A0B;

    public C177949Bf(AnonymousClass1FY r4, C33301ib r5, C33311ic r6, AnonymousClass1QS r7, C188079gq r8, AnonymousClass10I r9, WeakReference weakReference, WeakReference weakReference2, boolean z, boolean z2) {
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = AnonymousClass3MW.A0z(r4);
        this.A0B = z;
        this.A09 = z2;
        this.A00 = 3;
        this.A07 = weakReference;
        this.A08 = weakReference2;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C186179dm r8 = (C186179dm) obj;
        synchronized (this) {
            AnonymousClass1FY r3 = (AnonymousClass1FY) this.A06.get();
            B9A b9a = (B9A) this.A07.get();
            BBY bby = (BBY) this.A08.get();
            if (r3 != null) {
                r3.CEx();
                if (b9a != null) {
                    List list = r8.A00;
                    b9a.CR0(list);
                    if (this.A09) {
                        ArrayList A13 = AnonymousClass000.A13();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C20284AEs A0P = AnonymousClass8BR.A0P(it);
                            if (!TextUtils.isEmpty(A0P.A0A)) {
                                A13.add(A0P.A0A);
                            }
                        }
                        AnonymousClass10I r2 = this.A05;
                        C33311ic r1 = this.A02;
                        r1.getClass();
                        C21427Aju.A00(r2, r1, 30);
                    }
                }
                if (this.A0B && bby != null) {
                    List list2 = r8.A02;
                    bby.CRV(list2);
                    List list3 = r8.A01;
                    bby.CRI(list3);
                    if (this.A09) {
                        A00(list2);
                        A00(list3);
                    }
                }
                r3.invalidateOptionsMenu();
            }
        }
    }

    private void A00(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AW0 aw0 = (AW0) it.next();
            if (!TextUtils.isEmpty(aw0.A0K)) {
                A13.add(aw0.A0K);
            }
        }
        C21432Ajz.A00(this.A05, this, A13, 42);
    }
}
