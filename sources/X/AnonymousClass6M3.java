package X;

import android.database.Cursor;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.6M3  reason: invalid class name */
public class AnonymousClass6M3 extends A34 {
    public final int A00;
    public final long A01;
    public final AnonymousClass1ST A02;
    public final C18030ve A03;
    public final AnonymousClass1BI A04;
    public final AnonymousClass7JV A05;
    public final AnonymousClass1W6 A06;
    public final boolean A07;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A042;
        AnonymousClass1W6 r6 = this.A06;
        AnonymousClass1BI r5 = this.A04;
        boolean z = this.A07;
        AnonymousClass1ST r2 = this.A02;
        long j = this.A01;
        if (z) {
            A042 = r2.A03(r5, 0, j);
        } else {
            A042 = r2.A04(r5, 0, j);
        }
        C109335dH r1 = new C109335dH(A042, this.A03, r5, r6);
        if (C108945cZ.A1T(this)) {
            r1.close();
            return null;
        }
        r1.getCount();
        r1.moveToPosition(this.A00);
        return r1;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C109335dH r3;
        C109335dH r1;
        C109335dH r6 = (C109335dH) obj;
        if (r6 != null) {
            boolean z = this.A07;
            r6.getCount();
            r6.getPosition();
            AnonymousClass7JV r4 = this.A05;
            MediaViewBaseFragment mediaViewBaseFragment = r4.A0F;
            if (mediaViewBaseFragment.A1B() != null && !C108945cZ.A0Y(mediaViewBaseFragment).Bed()) {
                if (z) {
                    r3 = r4.A02;
                    r4.A07 = true;
                    r4.A02 = r6;
                    int count = r6.getCount();
                    r4.A00 = count;
                    C17900vP.A0j("MediaMessagesNavigator/navigator/upgrade-head-cursor/ count:", AnonymousClass000.A10(), count);
                    r1 = r4.A02;
                } else {
                    r3 = r4.A03;
                    r4.A08 = true;
                    r4.A03 = r6;
                    int count2 = r6.getCount();
                    r4.A01 = count2;
                    C17900vP.A0j("MediaMessagesNavigator/navigator/upgrade-tail-cursor/ count:", AnonymousClass000.A10(), count2);
                    r1 = r4.A03;
                }
                r1.registerContentObserver(r4.A0A);
                Runnable runnable = r4.A06;
                if (runnable != null) {
                    runnable.run();
                }
                if (r3 != null) {
                    r3.close();
                }
            }
        }
    }

    public AnonymousClass6M3(AnonymousClass1ST r1, C18030ve r2, AnonymousClass1BI r3, AnonymousClass7JV r4, AnonymousClass1W6 r5, int i, long j, boolean z) {
        this.A03 = r2;
        this.A05 = r4;
        this.A06 = r5;
        this.A02 = r1;
        this.A04 = r3;
        this.A01 = j;
        this.A07 = z;
        this.A00 = i;
    }
}
