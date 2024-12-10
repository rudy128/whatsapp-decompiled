package X;

import android.os.CountDownTimer;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.reachouttimelock.ReachoutTimelockInfoBottomSheet;

/* renamed from: X.3NO  reason: invalid class name */
public final class AnonymousClass3NO extends CountDownTimer {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CircularProgressBar A01;
    public final /* synthetic */ ReachoutTimelockInfoBottomSheet A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NO(CircularProgressBar circularProgressBar, ReachoutTimelockInfoBottomSheet reachoutTimelockInfoBottomSheet, long j, long j2) {
        super(j, 1000);
        this.A00 = j2;
        this.A02 = reachoutTimelockInfoBottomSheet;
        this.A01 = circularProgressBar;
    }

    public void onFinish() {
        String str;
        CircularProgressBar circularProgressBar = this.A01;
        circularProgressBar.setProgress(0);
        ReachoutTimelockInfoBottomSheet reachoutTimelockInfoBottomSheet = this.A02;
        C18000vb r3 = reachoutTimelockInfoBottomSheet.A04;
        if (r3 != null) {
            circularProgressBar.A0G = C64052u8.A0D(r3, r3.A08(221), 0);
            circularProgressBar.A07 = (float) AnonymousClass3Ma.A02(circularProgressBar, 2131165503);
            AnonymousClass4OE r32 = reachoutTimelockInfoBottomSheet.A07;
            if (r32 != null) {
                r32.A03.CGF(new C21449AkG((Object) r32, 0));
                return;
            }
            str = "reachoutTimelockQueryRunner";
        } else {
            str = "whatsAppLocale";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onTick(long j) {
        String str;
        long j2 = this.A00;
        ReachoutTimelockInfoBottomSheet reachoutTimelockInfoBottomSheet = this.A02;
        AnonymousClass11P r0 = reachoutTimelockInfoBottomSheet.A02;
        if (r0 != null) {
            long max = Math.max(0, j2 - AnonymousClass11P.A01(r0));
            CircularProgressBar circularProgressBar = this.A01;
            circularProgressBar.setProgress((int) max);
            C18000vb r3 = reachoutTimelockInfoBottomSheet.A04;
            if (r3 != null) {
                circularProgressBar.A0G = C64052u8.A0D(r3, r3.A08(221), C17880vN.A04(max));
                circularProgressBar.A07 = (float) AnonymousClass3Ma.A02(circularProgressBar, 2131165503);
                return;
            }
            str = "whatsAppLocale";
        } else {
            str = "time";
        }
        C18070vi.A11(str);
        throw null;
    }
}
