package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.ArrayList;

/* renamed from: X.6p9  reason: invalid class name */
public final class AnonymousClass6p9 {
    public final AnonymousClass206 A00;
    public final /* synthetic */ StatusPlaybackBaseFragment A01;
    public final /* synthetic */ StatusPlaybackContactFragment A02;

    public void A00(AnonymousClass206 r10) {
        String str;
        long j;
        String A0P;
        C18070vi.A0d(r10, 0);
        StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
        AnonymousClass00H r0 = statusPlaybackContactFragment.A0c;
        if (r0 != null) {
            if (!((C32911hx) r0.get()).A01(r10)) {
                AnonymousClass1KB r1 = statusPlaybackContactFragment.A00;
                if (r1 != null) {
                    r1.A06(2131892059, 1);
                } else {
                    str = "globalUI";
                }
            }
            statusPlaybackContactFragment.A0P = r10;
            int i = r10.A0u;
            if (i == 3) {
                j = C17890vO.A03(((AnonymousClass21V) r10).A0D);
            } else {
                j = 0;
            }
            int i2 = 0;
            if (i == 0 && (A0P = r10.A0P()) != null) {
                i2 = A0P.length();
            }
            AnonymousClass00H r02 = statusPlaybackContactFragment.A0m;
            if (r02 != null) {
                Context A0A = C108955ca.A0A(statusPlaybackContactFragment, r02);
                AnonymousClass1BI r7 = r10.A0v.A00;
                ArrayList A10 = C17880vN.A10(C18070vi.A0P(Integer.valueOf(i)));
                Long valueOf = Long.valueOf(j);
                Integer valueOf2 = Integer.valueOf(i2);
                Intent A0B = C72473Md.A0B(A0A, "com.whatsapp.contact.picker.ContactPicker");
                A0B.putExtra("source_surface", 19);
                C72483Me.A0h(A0B, r7, A10, true);
                if (valueOf != null) {
                    A0B.putExtra("forward_video_duration", valueOf);
                }
                if (valueOf2 != null) {
                    A0B.putExtra("forward_text_length", valueOf2);
                }
                AnonymousClass00H r03 = statusPlaybackContactFragment.A0X;
                if (r03 != null) {
                    C108995ce.A17((AnonymousClass1L9) r03.get(), AnonymousClass1L9.A07(A0B, statusPlaybackContactFragment, 2) ? 1 : 0);
                    return;
                }
                str = "activityUtils";
            } else {
                str = "waIntents";
            }
        } else {
            str = "fMessageForwardingSubsystem";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A01(AnonymousClass206 r7, AnonymousClass6R1 r8, int i, boolean z, boolean z2) {
        String str;
        C18070vi.A0f(r7, 0, r8);
        int i2 = i;
        if (z) {
            int ordinal = r8.ordinal();
            if (ordinal == 3) {
                StatusPlaybackContactFragment statusPlaybackContactFragment = this.A02;
                AnonymousClass00H r0 = statusPlaybackContactFragment.A0a;
                if (r0 != null) {
                    ((C41801x5) r0.get()).A03(statusPlaybackContactFragment.A14(), C122646Re.FACEBOOK, "status_playback_fragment", C18070vi.A0M(r7), i2);
                }
                str = "crosspostManager";
                C18070vi.A11(str);
                throw null;
            } else if (ordinal == 2 || ordinal == 1) {
                StatusPlaybackContactFragment statusPlaybackContactFragment2 = this.A02;
                AnonymousClass00H r02 = statusPlaybackContactFragment2.A0r;
                if (r02 != null) {
                    C108945cZ.A12(r02).A02(statusPlaybackContactFragment2.A14(), AnonymousClass3MY.A0g(), "status_playback_fragment", C18070vi.A0M(r7));
                } else {
                    str = "xFamilyCrosspostManager";
                    C18070vi.A11(str);
                    throw null;
                }
            }
        }
        if (z2 && (r8 == AnonymousClass6R1.V2_TO_V3_TRANSITION || r8 == AnonymousClass6R1.WAFFLE_V3)) {
            StatusPlaybackContactFragment statusPlaybackContactFragment3 = this.A02;
            AnonymousClass00H r03 = statusPlaybackContactFragment3.A0a;
            if (r03 != null) {
                ((C41801x5) r03.get()).A03(statusPlaybackContactFragment3.A14(), C122646Re.INSTAGRAM, "status_playback_fragment", C18070vi.A0M(r7), i2);
            }
            str = "crosspostManager";
            C18070vi.A11(str);
            throw null;
        }
        StatusPlaybackContactFragment statusPlaybackContactFragment4 = this.A02;
        statusPlaybackContactFragment4.A10 = true;
        statusPlaybackContactFragment4.A27();
    }

    public AnonymousClass6p9(AnonymousClass206 r1, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        this.A02 = statusPlaybackContactFragment;
        this.A01 = statusPlaybackContactFragment;
        this.A00 = r1;
    }
}
