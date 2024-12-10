package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.biz.education.fragment.Hilt_MetaVerifiedBusinessAccountEducationBottomSheet;
import com.whatsapp.biz.viewmodel.BusinessDetailsViewModel;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.48Y  reason: invalid class name */
public class AnonymousClass48Y extends C38471rL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C92874i3 A01;
    public final /* synthetic */ String A02;

    public AnonymousClass48Y(C92874i3 r1, String str, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = str;
    }

    public void A04(View view) {
        C92874i3 r2 = this.A01;
        if (C92874i3.A09(r2) || C92874i3.A0A(r2)) {
            AnonymousClass3MW.A0W(r2.A1A).A09(r2.A0l, true);
            return;
        }
        if (C18020vd.A05(C18040vf.A02, r2.A0t, 8438)) {
            BusinessDetailsViewModel businessDetailsViewModel = r2.A0h;
            if ((businessDetailsViewModel.A00.A0O() || businessDetailsViewModel.A00.A0P()) && !AnonymousClass1EG.A0H(businessDetailsViewModel.A00.A0L())) {
                ContactInfoActivity contactInfoActivity = r2.A0l;
                String A0L = businessDetailsViewModel.A00.A0L();
                C18070vi.A0d(A0L, 0);
                Hilt_MetaVerifiedBusinessAccountEducationBottomSheet hilt_MetaVerifiedBusinessAccountEducationBottomSheet = new Hilt_MetaVerifiedBusinessAccountEducationBottomSheet();
                Bundle A0D = C17880vN.A0D();
                A0D.putString("verified_name", A0L);
                hilt_MetaVerifiedBusinessAccountEducationBottomSheet.A1R(A0D);
                contactInfoActivity.CMk(hilt_MetaVerifiedBusinessAccountEducationBottomSheet, (String) null);
                return;
            }
        }
        ContactInfoActivity contactInfoActivity2 = r2.A0l;
        int i = this.A00;
        String str = this.A02;
        UserJid A0T = r2.A0h.A0T();
        Intent A07 = AnonymousClass3MZ.A07(A0T, 3);
        A07.setClassName(contactInfoActivity2.getPackageName(), "com.whatsapp.businessupsell.BusinessProfileEducation");
        A07.putExtra("key_extra_verified_level", i);
        A07.putExtra("key_extra_business_name", str);
        AnonymousClass3MY.A12(A07, A0T, "key_extra_business_jid");
        contactInfoActivity2.startActivity(A07);
    }
}
