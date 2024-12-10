package X;

import android.app.Activity;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListViewModel;

/* renamed from: X.4rX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C98674rX implements Runnable {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ BlockReasonListViewModel A01;
    public final /* synthetic */ AnonymousClass1E7 A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public final void run() {
        boolean z = this.A08;
        boolean z2 = this.A09;
        BlockReasonListViewModel blockReasonListViewModel = this.A01;
        AnonymousClass1FU r4 = this.A00;
        AnonymousClass1E7 r3 = this.A02;
        String str = this.A05;
        Integer num = this.A03;
        String str2 = this.A06;
        Integer num2 = this.A04;
        String str3 = this.A07;
        boolean z3 = this.A0A;
        if (z || z2) {
            AnonymousClass10I r15 = blockReasonListViewModel.A0C;
            C33251iW r13 = blockReasonListViewModel.A04;
            C136876uY r12 = blockReasonListViewModel.A06;
            String str4 = str2;
            String str5 = str3;
            Integer num3 = num2;
            String str6 = str;
            AnonymousClass1E7 r22 = r3;
            Integer num4 = num;
            C92914i7 r20 = new C92914i7(blockReasonListViewModel, 0);
            C136876uY r21 = r12;
            AnonymousClass1FU r18 = r4;
            C33251iW r19 = r13;
            AnonymousClass3MW.A1T(new C826649g(r4, r18, r19, r20, r21, r22, num4, num3, str6, str4, str5, false, z2, z, true), r15, 0);
            if (z2) {
                if (C18020vd.A05(C18040vf.A02, blockReasonListViewModel.A09, 6186)) {
                    blockReasonListViewModel.A03.A09(2131896827, 1);
                    return;
                }
            }
            if (z) {
                C37551pj A0V = AnonymousClass3MW.A0V(blockReasonListViewModel.A0E);
                A0V.A0G.CGF(new AnonymousClass7RT((Activity) r4, A0V, r3));
                return;
            }
            return;
        }
        C37551pj.A04(r4, new C92914i7(blockReasonListViewModel, 1), AnonymousClass3MW.A0V(blockReasonListViewModel.A0E), r3, num, num2, str, str2, str3, true, z3);
    }

    public /* synthetic */ C98674rX(AnonymousClass1FU r1, BlockReasonListViewModel blockReasonListViewModel, AnonymousClass1E7 r3, Integer num, Integer num2, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.A08 = z;
        this.A09 = z2;
        this.A01 = blockReasonListViewModel;
        this.A00 = r1;
        this.A02 = r3;
        this.A05 = str;
        this.A03 = num;
        this.A06 = str2;
        this.A04 = num2;
        this.A07 = str3;
        this.A0A = z3;
    }
}
