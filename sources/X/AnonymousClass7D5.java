package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsActivity;
import com.whatsapp.bot.metaai.imagineme.settings.ImagineMeSettingsViewModel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.imagine.InputPrompt;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.util.Log;

/* renamed from: X.7D5  reason: invalid class name */
public class AnonymousClass7D5 implements C1598586d {
    public final int A00;
    public final Object A01;

    public AnonymousClass7D5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C7d(AnonymousClass1E7 r10, Object obj, boolean z) {
        C41731wy r1;
        switch (this.A00) {
            case 0:
                AiImagineBottomSheet aiImagineBottomSheet = (AiImagineBottomSheet) this.A01;
                C111225jD r4 = aiImagineBottomSheet.A0J;
                Editable editable = null;
                if (r4 == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                InputPrompt inputPrompt = aiImagineBottomSheet.A0Q;
                if (inputPrompt != null) {
                    editable = inputPrompt.getEditable();
                }
                if (z) {
                    C25781Pp r2 = r4.A0Z;
                    C1185463w r12 = new C1185463w();
                    r12.A02 = C108955ca.A0h();
                    r12.A03 = Integer.valueOf(r2.A00);
                    r12.A04 = C17880vN.A0i();
                    r12.A05 = r2.A03;
                    r2.A05.CC7(r12);
                    if (!((C38731rn) r4.A0t.get()).A01()) {
                        r4.A05 = AnonymousClass00R.A00;
                        r1 = r4.A0k;
                        break;
                    } else {
                        r4.A0V(AnonymousClass6RH.LOADING_SCREEN_GENERATING_IMAGINE_ME);
                        String valueOf = String.valueOf(editable);
                        int i = 1;
                        if (C111225jD.A0D(r4)) {
                            i = 3;
                        }
                        C111225jD.A06(AnonymousClass6RH.IMAGINE_ME, r4, valueOf, i, false);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ImagineMeSettingsViewModel imagineMeSettingsViewModel = (ImagineMeSettingsViewModel) ((ImagineMeSettingsActivity) this.A01).A07.getValue();
                if (z) {
                    r1 = imagineMeSettingsViewModel.A0F;
                    break;
                } else {
                    return;
                }
            case 2:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A01;
                C1416576l r11 = (C1416576l) obj;
                AnonymousClass1FL A1B = contactPickerFragment.A1B();
                if (!(A1B instanceof AnonymousClass1FU)) {
                    return;
                }
                if (r11 instanceof C115915w3) {
                    ContactPickerFragment.A0J(contactPickerFragment);
                    return;
                } else if (r11 instanceof C115925w4) {
                    contactPickerFragment.A0i.A01(A1B, ((C115925w4) r11).A00, AnonymousClass00R.A03, (String) null, contactPickerFragment.A2y, C17890vO.A0Q());
                    return;
                } else {
                    return;
                }
            default:
                SearchFragment searchFragment = (SearchFragment) this.A01;
                C1416576l r112 = (C1416576l) obj;
                if (r10 == null) {
                    return;
                }
                if (r112 instanceof C115945w6) {
                    SearchFragment.A02((C115945w6) r112, r10, searchFragment);
                    return;
                } else if (r112 instanceof C75813ln) {
                    SearchFragment.A06(searchFragment);
                    return;
                } else if (C108945cZ.A0c(searchFragment.A0n).A08() && (r112 instanceof C115935w5)) {
                    C115945w6 r22 = ((C115935w5) r112).A01;
                    if (r22 == null) {
                        Log.e("SearchFragment/setOnboardingActionCallback attempting to show imagine me onboarding or send Meta AI a prompt, but there is no search data passed through!");
                        return;
                    } else if (((C38731rn) searchFragment.A11.get()).A01()) {
                        SearchFragment.A02(r22, r10, searchFragment);
                        return;
                    } else {
                        AnonymousClass1FL A1B2 = searchFragment.A1B();
                        if (A1B2 != null) {
                            searchFragment.A1A.get();
                            Intent A0f = AnonymousClass1LU.A0f(A1B2, (AnonymousClass1BI) null, C17880vN.A0j());
                            C134526qj r0 = new C134526qj(r22, 300);
                            Bundle A0D = C17880vN.A0D();
                            A0D.putParcelable("onboarding_request_data", r0.A01);
                            A0f.putExtra("passthrough_bundle", A0D);
                            A1B2.startActivityForResult(A0f, 300);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
        }
        r1.A0F((Object) null);
    }
}
