package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.whatsapp.contact.picker.viewmodels.InviteNonWhatsAppContactPickerViewModel;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;
import com.whatsapp.settings.SettingsTabActivity;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.4rB  reason: invalid class name and case insensitive filesystem */
public class C98454rB implements C107795ab {
    public final int A00;
    public final Object A01;

    public C98454rB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C2O(String str) {
        String str2;
        List list;
        Drawable drawable;
        WDSSearchBar wDSSearchBar;
        String str3 = str;
        switch (this.A00) {
            case 0:
                ((AnonymousClass3gf) this.A01).A54(str3);
                return;
            case 1:
                InviteNonWhatsAppContactPickerViewModel inviteNonWhatsAppContactPickerViewModel = ((InviteNonWhatsAppContactPickerActivity) this.A01).A0D;
                if (inviteNonWhatsAppContactPickerViewModel == null) {
                    str2 = "viewModel";
                    break;
                } else {
                    inviteNonWhatsAppContactPickerViewModel.A0T(str3);
                    return;
                }
            case 2:
                AnonymousClass3XN r0 = ((BugReportingCategoriesActivity) this.A01).A01;
                if (r0 == null) {
                    str2 = "bugCategoryListAdapter";
                    break;
                } else {
                    r0.getFilter().filter(str3);
                    return;
                }
            default:
                SettingsTabActivity settingsTabActivity = (SettingsTabActivity) this.A01;
                if (settingsTabActivity.A05 != null || (wDSSearchBar = settingsTabActivity.A0i) == null) {
                    settingsTabActivity.A1B = str3;
                    if (!str3.isEmpty()) {
                        ArrayList A13 = AnonymousClass000.A13();
                        C88624aF.A02((C88624aF) settingsTabActivity.A15.get(), str3, "", A13);
                        List A0t = C29431cG.A0t(A13);
                        C88624aF r5 = (C88624aF) settingsTabActivity.A15.get();
                        ArrayList A132 = AnonymousClass000.A13();
                        LinkedHashMap A133 = C17880vN.A13();
                        for (Object next : A0t) {
                            ((List) C72473Md.A0h(C88624aF.A00((C108635c2) next, r5).BTj(), A133)).add(next);
                        }
                        Iterator A0l = C17890vO.A0l(A133);
                        while (A0l.hasNext()) {
                            int i = 0;
                            for (C108635c2 r1 : C98924rw.A00((Iterable) A0l.next(), 17)) {
                                int i2 = i + 1;
                                String BXZ = r1.BXZ();
                                String BTj = r1.BTj();
                                String str4 = null;
                                if (i == 0) {
                                    drawable = C88624aF.A00(r1, r5).getIcon();
                                } else {
                                    drawable = null;
                                }
                                String BWI = r1.BWI();
                                if (BWI.length() != 0) {
                                    str4 = BWI;
                                }
                                A132.add(new C135996t6(drawable, BXZ, BTj, str4, 1));
                                i = i2;
                            }
                        }
                        if (A132.isEmpty()) {
                            A132.add(new C135996t6((Drawable) null, C18070vi.A0G(r5.A03, 2131896001), (String) null, (String) null, 2));
                        }
                        list = C29431cG.A0t(A132);
                    } else {
                        list = AnonymousClass000.A13();
                    }
                    settingsTabActivity.A1D = list;
                    SettingsTabActivity.A0r(settingsTabActivity);
                    return;
                } else if (!str3.isEmpty()) {
                    wDSSearchBar.A02(false);
                    return;
                } else {
                    return;
                }
        }
        C18070vi.A11(str2);
        throw null;
    }
}
