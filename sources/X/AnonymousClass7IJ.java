package X;

import android.content.Intent;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7IJ  reason: invalid class name */
public class AnonymousClass7IJ implements AnonymousClass895 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7IJ(C136916uc r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public void BsZ() {
        if (this.A00 != 0) {
            ((C136916uc) this.A01).A00();
            return;
        }
        C136916uc r1 = (C136916uc) this.A01;
        if (r1.A00 != null) {
            r1.A02((String) null);
        }
    }

    public void C4m(C130676jp r15) {
        int i;
        int i2 = this.A00;
        C136916uc r3 = (C136916uc) this.A01;
        ContactUsActivity contactUsActivity = r3.A00;
        if (i2 != 0) {
            if (contactUsActivity != null) {
                i = 2;
            } else {
                return;
            }
        } else if (contactUsActivity != null) {
            i = 1;
        } else {
            return;
        }
        C17960vV.A07(contactUsActivity);
        int i3 = r15.A00;
        ArrayList A0z = C17880vN.A0z(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            A0z.add(new C89454cU((C89284cD) null, C108945cZ.A1H(r15.A04, i4), C108945cZ.A1H(r15.A06, i4), C108945cZ.A1H(r15.A03, i4), C108945cZ.A1H(r15.A07, i4), (List) null, false));
        }
        int i5 = 2;
        if (i == 2) {
            i5 = 1;
        }
        String stringExtra = r3.A00.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from");
        C18070vi.A0d(stringExtra, 0);
        if ("biz-directory-browsing".equals(stringExtra)) {
            r3.A02(r15.A01);
            return;
        }
        ContactUsActivity contactUsActivity2 = r3.A00;
        String str = r15.A01;
        contactUsActivity2.A0S.get();
        ArrayList A03 = ContactUsActivity.A03(contactUsActivity2, A0z);
        Boolean valueOf = Boolean.valueOf(contactUsActivity2.A0F.A03());
        Intent className = C17880vN.A0A().setClassName(contactUsActivity2.getPackageName(), "com.whatsapp.inappsupport.ui.SupportTopicsActivity");
        className.putParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics", A03);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 2);
        className.putExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", i5);
        className.putExtra("from_contact_us_ai_fallback_email_screen", valueOf);
        className.putExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", i);
        className.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info", str);
        contactUsActivity2.startActivityForResult(className, 11);
    }
}
