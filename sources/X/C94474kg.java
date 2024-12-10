package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.4kg  reason: invalid class name and case insensitive filesystem */
public final class C94474kg implements AnonymousClass5ZD {
    public final Context A00;
    public final AnonymousClass5ZN A01;
    public final AnonymousClass5ZT A02;
    public final AnonymousClass1EC A03;
    public final C436420i A04;

    public List getCTAViews() {
        View[] viewArr = new View[2];
        AnonymousClass5ZT r0 = this.A02;
        Context context = this.A00;
        AnonymousClass1EC r5 = this.A03;
        viewArr[0] = r0.BGS(context, r5);
        return C18070vi.A0O(this.A01.BGo(context, r5, (AnonymousClass1EC) null, this.A04, 5, false), viewArr, 1);
    }

    public C94474kg(Context context, AnonymousClass5ZN r2, AnonymousClass5ZT r3, AnonymousClass1EC r4, C436420i r5) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = context;
        this.A04 = r5;
        this.A03 = r4;
    }
}
