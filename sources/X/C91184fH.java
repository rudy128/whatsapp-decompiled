package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.HomeActivity;
import com.whatsapp.community.CommunityHomeActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChangedParticipantsBottomSheet;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorActivity;
import com.whatsapp.interopui.compose.InteropComposeSelectIntegratorViewModel;
import com.whatsapp.newsletter.NewsletterInfoMembersSearchFragment;
import com.whatsapp.profile.WebImagePicker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4fH  reason: invalid class name and case insensitive filesystem */
public class C91184fH implements C16560sd {
    public final int A00;
    public final Object A01;

    public C91184fH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(SearchView searchView, Object obj, int i) {
        searchView.A06 = new C91184fH(obj, i);
    }

    public void C2P(String str) {
        Filter filter;
        switch (this.A00) {
            case 0:
                HomeActivity.A1G((HomeActivity) this.A01, str);
                return;
            case 1:
                ((AnonymousClass3gf) this.A01).A54(str);
                return;
            case 2:
                C93924jl r2 = ((CommunityHomeActivity) this.A01).A0R.A00;
                List list = r2.A05;
                list.clear();
                ArrayList A03 = C20103A7h.A03(r2.A02, str);
                C18070vi.A0X(A03);
                list.addAll(A03);
                r2.A04.run();
                return;
            case 3:
                C79333vF r22 = (C79333vF) this.A01;
                r22.A0K = str;
                r22.A0L = C20103A7h.A03(r22.A00, str);
                Bundle A0D = C17880vN.A0D();
                A0D.putString("query", str);
                C26144Ct7.A00(r22).A02(A0D, r22);
                return;
            case 4:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A01;
                if (!TextUtils.equals(mediaGalleryActivity.A0j, str)) {
                    mediaGalleryActivity.A0j = str;
                    mediaGalleryActivity.A0k = C20103A7h.A03(mediaGalleryActivity.A00, str);
                    C108055b3 A032 = MediaGalleryActivity.A03(mediaGalleryActivity);
                    if (A032 != null) {
                        C34141jz r1 = mediaGalleryActivity.A0T;
                        r1.A06(mediaGalleryActivity.A0k);
                        r1.A05(str);
                        A032.C4h(r1);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                GroupAdminPickerActivity.A0c((GroupAdminPickerActivity) this.A01, str);
                return;
            case 6:
                GroupChangedParticipantsBottomSheet.A01((GroupChangedParticipantsBottomSheet) this.A01, str);
                return;
            case 7:
                C73083Ox r12 = ((GroupParticipantsSearchFragment) this.A01).A05;
                r12.A00 = str;
                if (!TextUtils.isEmpty(str)) {
                    filter = r12.getFilter();
                    break;
                } else {
                    C73083Ox.A00(r12, r12.A01);
                    return;
                }
            case 8:
                AnonymousClass1DT r0 = ((InteropComposeSelectIntegratorViewModel) ((InteropComposeSelectIntegratorActivity) this.A01).A06.getValue()).A02;
                if (str == null) {
                    str = "";
                }
                r0.A0F(str);
                return;
            case 9:
                C18070vi.A0d(str, 0);
                NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = (NewsletterInfoMembersSearchFragment) this.A01;
                NewsletterInfoMembersSearchFragment.A00(newsletterInfoMembersSearchFragment, str);
                C73073Ow r13 = newsletterInfoMembersSearchFragment.A07;
                if (r13 != null) {
                    r13.A01 = str;
                    if (str.length() != 0) {
                        filter = r13.getFilter();
                        break;
                    } else {
                        C73073Ow.A00(r13, r13.A0C);
                        return;
                    }
                } else {
                    AnonymousClass3MW.A1B();
                    throw null;
                }
            default:
                return;
        }
        filter.filter(str);
    }

    public boolean C2Q(String str) {
        if (10 - this.A00 != 0) {
            return false;
        }
        WebImagePicker.A0z((WebImagePicker) this.A01);
        return true;
    }
}
