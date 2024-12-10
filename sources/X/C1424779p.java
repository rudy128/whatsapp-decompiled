package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.storage.StorageUsageActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.79p  reason: invalid class name and case insensitive filesystem */
public class C1424779p implements C16560sd {
    public final int A00;
    public final Object A01;

    public C1424779p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C2P(String str) {
        String str2;
        switch (this.A00) {
            case 0:
                C114635rQ r1 = (C114635rQ) this.A01;
                r1.A0G = str;
                ArrayList A03 = C20103A7h.A03(r1.A00, str);
                r1.A0H = A03;
                if (A03.isEmpty()) {
                    r1.A0H = null;
                }
                C114635rQ.A0y(r1);
                return;
            case 1:
                AudioPickerActivity audioPickerActivity = (AudioPickerActivity) this.A01;
                audioPickerActivity.A0I = str;
                audioPickerActivity.A0J = C20103A7h.A03(audioPickerActivity.A00, str);
                C26144Ct7.A00(audioPickerActivity).A02((Bundle) null, audioPickerActivity);
                return;
            case 2:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this.A01;
                phoneContactsSelector.A0W = str;
                ArrayList A032 = C20103A7h.A03(phoneContactsSelector.A0N, str);
                phoneContactsSelector.A0X = A032;
                if (A032.isEmpty()) {
                    phoneContactsSelector.A0X = null;
                }
                phoneContactsSelector.A4c();
                return;
            case 3:
                C18070vi.A0d(str, 0);
                AnonymousClass6BJ r5 = (AnonymousClass6BJ) this.A01;
                String A0I = AnonymousClass1YF.A0I(str);
                if (!C18070vi.A18(r5.A0M, A0I) && !(((str2 = r5.A0M) == null || str2.length() == 0) && (A0I == null || A0I.length() == 0))) {
                    r5.A0M = A0I;
                    Runnable runnable = r5.A0L;
                    if (runnable != null) {
                        r5.A0N.removeCallbacks(runnable);
                    }
                    C21356Ail ail = new C21356Ail(r5, 46);
                    r5.A0N.postDelayed(ail, 300);
                    r5.A0L = ail;
                }
                if (C72453Mb.A1a(r5.A0P)) {
                    AnonymousClass4VZ A4c = r5.A4c();
                    C18070vi.A0z(A4c, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
                    View view = ((AnonymousClass6FL) A4c).A00;
                    if (!(view.findViewById(2131428924) instanceof ViewStub) && view.findViewById(2131428923).isSelected()) {
                        C17880vN.A0E(r5.A4c().A00, 2131434969).setCursorVisible(true);
                        AnonymousClass4VZ A4c2 = r5.A4c();
                        C18070vi.A0z(A4c2, "null cannot be cast to non-null type com.whatsapp.newsletter.ui.directory.NewsletterDirectoryToolBarHelper");
                        ((AnonymousClass6FL) A4c2).A0E(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                C18070vi.A0d(str, 0);
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A01;
                storageUsageActivity.A0S = str;
                storageUsageActivity.A0V = C20103A7h.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0q(storageUsageActivity, storageUsageActivity.A0U, (List) null, false);
                return;
        }
    }

    public boolean C2Q(String str) {
        switch (this.A00) {
            case 3:
                SearchView searchView = ((AnonymousClass6BJ) this.A01).A4c().A00;
                if (searchView == null) {
                    return true;
                }
                searchView.clearFocus();
                return true;
            case 4:
                C18070vi.A0d(str, 0);
                StorageUsageActivity storageUsageActivity = (StorageUsageActivity) this.A01;
                storageUsageActivity.A0S = str;
                storageUsageActivity.A0V = C20103A7h.A03(storageUsageActivity.A00, str);
                StorageUsageActivity.A0q(storageUsageActivity, storageUsageActivity.A0U, (List) null, false);
                return false;
            default:
                return false;
        }
    }
}
