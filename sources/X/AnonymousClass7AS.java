package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.FAQTextView;
import com.whatsapp.WaTextView;
import com.whatsapp.usercontrol.view.UserControlBaseFragment;
import com.whatsapp.usercontrol.view.UserControlMessageLevelFragment;
import com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment;
import com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.7AS  reason: invalid class name */
public class AnonymousClass7AS implements C22851Dl, C22841Dk {
    public final int A00;
    public final Object A01;

    public AnonymousClass7AS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass1F9 r1, AnonymousClass1DS r2, Object obj, int i) {
        r2.A0A(r1, new AnonymousClass7AS(obj, i));
    }

    public static void A01(AnonymousClass1DS r1, C22801Dg r2, Object obj, int i) {
        r2.A0H(r1, new AnonymousClass7AS(obj, i));
    }

    public final C18080vj BS6() {
        int i;
        String str;
        String str2;
        Class cls;
        Object obj;
        int i2;
        switch (this.A00) {
            case 32:
                obj = this.A01;
                cls = UserControlBaseFragment.class;
                break;
            case 34:
                obj = this.A01;
                cls = UserControlMessageLevelFragment.class;
                break;
            case 35:
                obj = this.A01;
                cls = UCOffersAndAnnouncementsFragment.class;
                str = "updateOffersAndAnnouncementContent(Lcom/whatsapp/usercontrol/viewmodel/UserControlStopResumeViewModel$UCOffersAndAnnouncementsConfig;)V";
                i = 0;
                i2 = 1;
                str2 = "updateOffersAndAnnouncementContent";
                break;
            case 36:
                obj = this.A01;
                cls = UCOffersAndAnnouncementsFragment.class;
                break;
            default:
                return (C18080vj) this.A01;
        }
        str = "navigationHandler(Lcom/whatsapp/usercontrol/data/FeedbackState;)V";
        i = 0;
        i2 = 1;
        str2 = "navigationHandler";
        return new AnonymousClass1JJ(i2, obj, cls, str2, str, i);
    }

    public final /* synthetic */ void Bo9(Object obj) {
        String str;
        switch (this.A00) {
            case 32:
            case 34:
                AnonymousClass6U3 r7 = (AnonymousClass6U3) obj;
                C18070vi.A0d(r7, 0);
                ((UserControlBaseFragment) this.A01).A2K(r7);
                return;
            case 35:
                C135546sN r72 = (C135546sN) obj;
                C18070vi.A0d(r72, 0);
                UCOffersAndAnnouncementsFragment uCOffersAndAnnouncementsFragment = (UCOffersAndAnnouncementsFragment) this.A01;
                WaTextView waTextView = uCOffersAndAnnouncementsFragment.A01;
                if (waTextView != null) {
                    waTextView.setText(r72.A02);
                }
                WDSButton wDSButton = uCOffersAndAnnouncementsFragment.A03;
                if (wDSButton != null) {
                    wDSButton.setText(r72.A01);
                }
                FAQTextView fAQTextView = uCOffersAndAnnouncementsFragment.A00;
                if (fAQTextView != null) {
                    SpannableStringBuilder A09 = AnonymousClass3MW.A09(r72.A00);
                    if (((UserControlStopResumeViewModel) uCOffersAndAnnouncementsFragment.A05.getValue()).A02) {
                        str = "471097579286138";
                    } else {
                        str = "1072622197196723";
                    }
                    fAQTextView.setEducationTextFromArticleID((Spannable) A09, str, (AnonymousClass5YY) new C143007Bq(uCOffersAndAnnouncementsFragment, 1));
                    return;
                }
                return;
            case 36:
                C18070vi.A0d(obj, 0);
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                if (obj instanceof C121596Kp) {
                    dialogFragment.A28();
                    return;
                }
                return;
            default:
                ((C22821Di) this.A01).invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        Object BS6;
        boolean z = obj instanceof C22851Dl;
        switch (this.A00) {
            case 32:
            case 34:
            case 35:
            case 36:
                if (z && (obj instanceof C22841Dk)) {
                    BS6 = BS6();
                    break;
                } else {
                    return false;
                }
                break;
            default:
                if (z && (obj instanceof C22841Dk)) {
                    BS6 = this.A01;
                    break;
                } else {
                    return false;
                }
                break;
        }
        return C108975cc.A1L(obj, BS6);
    }

    public final int hashCode() {
        Object BS6;
        switch (this.A00) {
            case 32:
            case 34:
            case 35:
            case 36:
                BS6 = BS6();
                break;
            default:
                BS6 = this.A01;
                break;
        }
        return BS6.hashCode();
    }
}
