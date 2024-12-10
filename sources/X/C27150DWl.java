package X;

import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel;
import com.whatsapp.profile.viewmodel.UsernameShareViewModel;

/* renamed from: X.DWl  reason: case insensitive filesystem */
public class C27150DWl implements C18080vj, AnonymousClass1OS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        switch (this.A00) {
            case 0:
                int i = this.A01;
                C17130tn r1 = (C17130tn) obj3;
                C25893Co4.A02(r1, (C17090tj) this.A03, (C18090vk) this.A04, (C18090vk) this.A05, AnonymousClass0L8.A00(i), this.A02);
                break;
            case 1:
                UsernameNavigationViewModel usernameNavigationViewModel = (UsernameNavigationViewModel) this.A05;
                int i2 = this.A01;
                C17130tn r12 = (C17130tn) obj3;
                C25893Co4.A00(r12, (C17090tj) this.A03, usernameNavigationViewModel, (UsernameSettingsViewModel) this.A04, AnonymousClass0L8.A00(i2), this.A02);
                break;
            case 2:
                UsernameNavigationViewModel usernameNavigationViewModel2 = (UsernameNavigationViewModel) this.A04;
                C17090tj r2 = (C17090tj) this.A05;
                int i3 = this.A01;
                C17130tn r13 = (C17130tn) obj3;
                C25894Co5.A00(r13, r2, usernameNavigationViewModel2, (UsernamePinSetViewModel) this.A03, AnonymousClass0L8.A00(i3), this.A02);
                break;
            case 3:
                int i4 = this.A01;
                C17130tn r14 = (C17130tn) obj3;
                C25894Co5.A02(r14, (C17090tj) this.A03, (C18090vk) this.A04, (C18090vk) this.A05, AnonymousClass0L8.A00(i4), this.A02);
                break;
            case 4:
                UsernameNavigationViewModel usernameNavigationViewModel3 = (UsernameNavigationViewModel) this.A05;
                int i5 = this.A01;
                C17130tn r15 = (C17130tn) obj3;
                C25422CfU.A00(r15, (C17090tj) this.A03, usernameNavigationViewModel3, (UsernamePinSetViewModel) this.A04, AnonymousClass0L8.A00(i5), this.A02);
                break;
            case 5:
                UsernameNavigationViewModel usernameNavigationViewModel4 = (UsernameNavigationViewModel) this.A05;
                int i6 = this.A01;
                C17130tn r16 = (C17130tn) obj3;
                CDK.A00(r16, (C17090tj) this.A03, usernameNavigationViewModel4, (UsernameSetViewModel) this.A04, AnonymousClass0L8.A00(i6), this.A02);
                break;
            default:
                UsernameNavigationViewModel usernameNavigationViewModel5 = (UsernameNavigationViewModel) this.A05;
                int i7 = this.A01;
                C17130tn r17 = (C17130tn) obj3;
                CDL.A00(r17, (C17090tj) this.A03, usernameNavigationViewModel5, (UsernameShareViewModel) this.A04, AnonymousClass0L8.A00(i7), this.A02);
                break;
        }
        return C27621Wu.A00;
    }

    public C27150DWl(C17090tj r1, UsernameNavigationViewModel usernameNavigationViewModel, UsernamePinSetViewModel usernamePinSetViewModel, int i, int i2, int i3) {
        this.A00 = i3;
        if (2 - i3 != 0) {
            this.A03 = r1;
            this.A04 = usernamePinSetViewModel;
            this.A05 = usernameNavigationViewModel;
        } else {
            this.A03 = usernamePinSetViewModel;
            this.A04 = usernameNavigationViewModel;
            this.A05 = r1;
        }
        this.A01 = i;
        this.A02 = i2;
    }

    public C27150DWl(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj3;
        this.A05 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }
}
