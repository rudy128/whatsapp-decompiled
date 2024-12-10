package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.5jW  reason: invalid class name and case insensitive filesystem */
public class C111315jW extends C22702BLf {
    public AnonymousClass247 A00;
    public final long A01;
    public final C25931Qe A02;
    public final AnonymousClass1W6 A03;
    public final long[] A04;

    public /* bridge */ /* synthetic */ Object A06() {
        long j = this.A01;
        if (j > 0) {
            AnonymousClass206 A032 = this.A03.A01.A03(j);
            if (A032 instanceof AnonymousClass247) {
                AnonymousClass247 r3 = (AnonymousClass247) A032;
                this.A00 = r3;
                this.A02.A0A(r3.A04);
                return C108945cZ.A0N(C17880vN.A10(this.A00.A17()), this.A00);
            }
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (long j2 : this.A04) {
            synchronized (this) {
                if (AnonymousClass000.A1W(this.A01)) {
                    throw new AnonymousClass1QC();
                }
            }
            AnonymousClass206 A033 = this.A03.A01.A03(j2);
            if ((A033 instanceof AnonymousClass21V) || (A033 instanceof AnonymousClass23N)) {
                A13.add(A033);
            }
        }
        return C108945cZ.A0N(A13, (Object) null);
    }

    public void A02() {
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        A09();
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        if (!this.A05 && this.A06) {
            super.A04(obj);
        }
    }

    public C111315jW(Context context, C25931Qe r2, AnonymousClass1W6 r3, long[] jArr, long j) {
        super(context);
        this.A04 = jArr;
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = j;
    }

    public void A01() {
        A00();
    }

    public void A03() {
        A00();
    }
}
