package X;

import android.database.ContentObserver;
import android.database.Cursor;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.util.Log;

/* renamed from: X.6M7  reason: invalid class name */
public class AnonymousClass6M7 extends A34 {
    public C109335dH A00;
    public C109335dH A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1ST A04;
    public final C18030ve A05;
    public final AnonymousClass1BI A06;
    public final AnonymousClass7JV A07;
    public final AnonymousClass21V A08;
    public final AnonymousClass1W6 A09;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C109335dH r0;
        Log.i("mediaview/task/getmsgs");
        AnonymousClass1W6 r6 = this.A09;
        AnonymousClass1BI r5 = this.A06;
        AnonymousClass1ST r7 = this.A04;
        AnonymousClass21V r8 = this.A08;
        Cursor A032 = r7.A03(r5, 512, r8.A0x);
        C18030ve r4 = this.A05;
        this.A00 = new C109335dH(A032, r4, r5, r6);
        AnonymousClass8CU r10 = this.A02;
        if (r10.isCancelled()) {
            r0 = this.A00;
        } else {
            this.A01 = new C109335dH(r7.A04(r5, 512, r8.A0x), r4, r5, r6);
            boolean isCancelled = r10.isCancelled();
            C109335dH r02 = this.A00;
            if (isCancelled) {
                r02.close();
                r0 = this.A01;
            } else {
                this.A02 = AnonymousClass000.A1U(r02.getCount(), 512);
                this.A00.moveToPosition(0);
                if (this.A00.getCount() == 0) {
                    this.A00.close();
                    C109335dH r03 = new C109335dH(r7.A03(r5, 0, r8.A0x), r4, r5, r6);
                    this.A00 = r03;
                    r03.moveToPosition(0);
                    this.A02 = true;
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("mediaview/navigator/getmsgs head-upgraded:");
                    C17900vP.A0o(A10, this.A00.getCount());
                }
                this.A03 = AnonymousClass000.A1U(this.A01.getCount(), 512);
                this.A01.moveToPosition(0);
                if (this.A01.getCount() == 0) {
                    this.A01.close();
                    C109335dH r04 = new C109335dH(r7.A04(r5, 0, r8.A0x), r4, r5, r6);
                    this.A01 = r04;
                    r04.moveToPosition(0);
                    this.A03 = true;
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("mediaview/navigator/getmsgs tail-upgraded:");
                    C17900vP.A0o(A102, this.A01.getCount());
                }
                return Integer.valueOf(this.A00.getCount() + this.A01.getCount());
            }
        }
        r0.close();
        Log.i("GetMediaMessagesTask cancelled");
        return -1;
    }

    public AnonymousClass6M7(AnonymousClass1ST r1, C18030ve r2, AnonymousClass1BI r3, AnonymousClass7JV r4, AnonymousClass21V r5, AnonymousClass1W6 r6) {
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = r5;
        this.A07 = r4;
        this.A09 = r6;
        this.A04 = r1;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        if (AnonymousClass000.A0M(obj) >= 0) {
            AnonymousClass7JV r6 = this.A07;
            C109335dH r5 = this.A00;
            boolean z = this.A02;
            C109335dH r4 = this.A01;
            boolean z2 = this.A03;
            MediaViewBaseFragment mediaViewBaseFragment = r6.A0F;
            if (mediaViewBaseFragment.A1B() != null && !C108945cZ.A0Y(mediaViewBaseFragment).Bed()) {
                r6.close();
                r6.A0B.put(0, r6.A0G);
                r6.A02 = r5;
                r6.A07 = z;
                r6.A03 = r4;
                r6.A08 = z2;
                r6.A00 = r5.getCount();
                int count = r4.getCount();
                r6.A01 = count;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("MediaMessagesNavigator/navigator/set-cursors/ head-count:");
                A10.append(r6.A00);
                A10.append(" head-full:");
                A10.append(z);
                A10.append(" tail-count:");
                A10.append(count);
                C17900vP.A0n(" tail-full:", A10, z2);
                ContentObserver contentObserver = r6.A0A;
                r5.registerContentObserver(contentObserver);
                r4.registerContentObserver(contentObserver);
                mediaViewBaseFragment.A2H(r6.A00, true);
            }
        }
    }
}
