package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment;
import com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$cancelDownload$1;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel$usernameSettingsViewState$2$1;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel$usernameSettingsViewState$2$2;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;

/* renamed from: X.4sG  reason: invalid class name and case insensitive filesystem */
public class C99094sG implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C99094sG(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final Object invoke() {
        LinearLayoutManager linearLayoutManager;
        switch (this.A00) {
            case 0:
                AnonymousClass4XS r3 = (AnonymousClass4XS) this.A02;
                C18070vi.A0d(r3, 1);
                return ((AnonymousClass4PU) this.A01).A00(r3.A01, r3.A02, (AnonymousClass1EC) this.A03);
            case 1:
                Log.w("MessageDraftsManagerImpl/saveDraftMessage/unable to save draft message");
                ((C29691ci) this.A01).A0v = null;
                ((C42441yB) this.A02).A01.A03((AnonymousClass1BI) this.A03, false);
                break;
            case 2:
                TranslationLanguageSelectorFragment translationLanguageSelectorFragment = (TranslationLanguageSelectorFragment) this.A01;
                AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$cancelDownload$1((AnonymousClass436) this.A02, (C73053Ou) this.A03, translationLanguageSelectorFragment, (C30391dr) null), AnonymousClass2SS.A00(translationLanguageSelectorFragment));
                break;
            case 3:
                Reference reference = (Reference) this.A02;
                Object obj = this.A03;
                C38391rD r32 = (C38391rD) ((Reference) this.A01).get();
                if (r32 != null) {
                    Object obj2 = reference.get();
                    if ((obj2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) obj2) != null) {
                        int A1N = linearLayoutManager.A1N();
                        if (!(Integer.valueOf(A1N) == null || A1N == -1)) {
                            if (A1N < 1) {
                                A1N = 1;
                            }
                            Integer valueOf = Integer.valueOf(A1N);
                            if (valueOf != null && A1N < r32.A0Q()) {
                                C17890vO.A0D().postDelayed(new C21435Ak2(obj, valueOf, reference, 16), 250);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                UsernameSettingsViewModel usernameSettingsViewModel = (UsernameSettingsViewModel) this.A01;
                AnonymousClass4bI r1 = (AnonymousClass4bI) this.A02;
                C18070vi.A0d(usernameSettingsViewModel, 0);
                C27183DXs A0L = AnonymousClass3MZ.A0L(new UsernameSettingsViewModel$usernameSettingsViewState$2$2(usernameSettingsViewModel, (C30391dr) null), AnonymousClass4Z8.A01(new UsernameSettingsViewModel$usernameSettingsViewState$2$1((C30391dr) null), AnonymousClass3MX.A18(usernameSettingsViewModel.A02), AnonymousClass3MX.A18(r1.A06), AnonymousClass3MX.A18(r1.A05)));
                return AnonymousClass4Z7.A01(new C25789Cm0(C82804Cd.USERNAME, ((AnonymousClass11S) this.A03).A0C(), ""), C41561wd.A00(usernameSettingsViewModel), A0L, AnonymousClass4ZC.A00);
        }
        return C27621Wu.A00;
    }
}
