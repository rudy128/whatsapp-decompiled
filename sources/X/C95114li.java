package X;

import android.os.Bundle;
import com.whatsapp.inappsupport.SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1;
import com.whatsapp.inappsupport.ui.Hilt_SupportNegativeFeedbackBottomSheet;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.4li  reason: invalid class name and case insensitive filesystem */
public final class C95114li implements AnonymousClass5ZZ {
    public final AnonymousClass1FU A00;
    public final C79613vk A01;

    public boolean BKp(int i, Collection collection) {
        C18070vi.A0d(collection, 1);
        if (i == 32) {
            C75763lX r5 = (C75763lX) this.A01.A00.get();
            AnonymousClass206 A0s = AnonymousClass3MX.A0s(collection);
            AnonymousClass1FU r4 = this.A00;
            C18070vi.A0d(A0s, 0);
            AnonymousClass1MB r1 = r5.A01;
            AnonymousClass205 r2 = A0s.A0v;
            if (r1.A03(r2.A00)) {
                ((C35541mP) r5.A00.A02.get()).A01(11);
                String str = r2.A01;
                C18070vi.A0X(str);
                Hilt_SupportNegativeFeedbackBottomSheet hilt_SupportNegativeFeedbackBottomSheet = new Hilt_SupportNegativeFeedbackBottomSheet();
                Bundle A0D = C17880vN.A0D();
                A0D.putString("message_id", str);
                hilt_SupportNegativeFeedbackBottomSheet.A1R(A0D);
                r4.CMl(hilt_SupportNegativeFeedbackBottomSheet);
                return true;
            }
            ((C139566z3) r5.A02.get()).A02(r4, A0s, C104715Pf.A00);
            return true;
        } else if (i != 33) {
            return false;
        } else {
            C75773lY r42 = (C75773lY) this.A01.A01.get();
            AnonymousClass206 A0s2 = AnonymousClass3MX.A0s(collection);
            AnonymousClass1FU r52 = this.A00;
            C18070vi.A0d(A0s2, 0);
            AnonymousClass1MB r12 = r42.A01;
            AnonymousClass205 r22 = A0s2.A0v;
            if (r12.A03(r22.A00)) {
                AnonymousClass4ZI r43 = r42.A00;
                ((C35541mP) r43.A02.get()).A01(10);
                String str2 = r22.A01;
                C18070vi.A0X(str2);
                if (!r43.A00.A09()) {
                    Log.i("SupportMessageFeedbackUtils/sendPositiveFeedback/no-connectivity");
                    AnonymousClass4ZI.A00(r52);
                    return true;
                }
                AnonymousClass3MX.A1Q(new SupportMessageFeedbackUtilsImpl$sendPositiveFeedback$1(r52, r43, str2, (C30391dr) null), r43.A05);
                return true;
            }
            ((C139566z3) r42.A02.get()).A01(r52, A0s2);
            return true;
        }
    }

    public C95114li(AnonymousClass1FU r1, C79613vk r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
