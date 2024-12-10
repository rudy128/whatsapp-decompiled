package X;

import com.whatsapp.profile.viewmodel.UsernameSetViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel$usernameSetViewState$2$3;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.AlX  reason: case insensitive filesystem */
public class C21524AlX implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C21524AlX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke() {
        boolean z;
        switch (this.A00) {
            case 0:
                C20571AQh aQh = (C20571AQh) this.A01;
                C18070vi.A0d(aQh, 0);
                return aQh.A00.get();
            case 1:
                C185119c3 r1 = (C185119c3) this.A01;
                C18070vi.A0d(r1, 0);
                return r1.A00.A05("pref_consumer_disclosure");
            case 2:
                UsernameSetViewModel usernameSetViewModel = (UsernameSetViewModel) this.A01;
                C18070vi.A0d(usernameSetViewModel, 0);
                C72453Mb.A1Q(usernameSetViewModel.A06, usernameSetViewModel);
                return C27621Wu.A00;
            case 3:
                UsernameSetViewModel usernameSetViewModel2 = (UsernameSetViewModel) this.A01;
                C18070vi.A0d(usernameSetViewModel2, 0);
                return C34071js.A00(usernameSetViewModel2.A02.A0C());
            case 4:
                UsernameSetViewModel usernameSetViewModel3 = (UsernameSetViewModel) this.A01;
                C18070vi.A0d(usernameSetViewModel3, 0);
                C27183DXs dXs = new C27183DXs((AnonymousClass1OS) new UsernameSetViewModel$usernameSetViewState$2$3(usernameSetViewModel3, (C30391dr) null), (C23421Fz) AnonymousClass4Z8.A02(C21726Arc.A00, (C23421Fz) usernameSetViewModel3.A08.getValue(), (C23421Fz) usernameSetViewModel3.A0B.getValue(), (C23421Fz) usernameSetViewModel3.A09.getValue(), (C23421Fz) usernameSetViewModel3.A0A.getValue()), 7);
                return AnonymousClass4Z7.A01(new C25796Cm8(AnonymousClass9IB.NONE, AnonymousClass9I3.DISABLED, usernameSetViewModel3.A02.A0C(), (String) null), C41561wd.A00(usernameSetViewModel3), dXs, AnonymousClass4ZC.A00);
            case 5:
                A29 a29 = (A29) this.A01;
                C18070vi.A0d(a29, 0);
                if (!a29.A00.A0N()) {
                    Boolean bool = C17970vW.A01;
                    synchronized (a29.A02.get()) {
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                RegisterPhone registerPhone = (RegisterPhone) this.A01;
                if (registerPhone.A02 != 0) {
                    AnonymousClass4Yv.A00(registerPhone, 610);
                    return null;
                }
                RegisterPhone.A1F(registerPhone);
                return null;
            case 7:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A01;
                if (!verifyPhoneNumber.A1V) {
                    return null;
                }
                VerifyPhoneNumber.A1m(verifyPhoneNumber, verifyPhoneNumber.A03);
                return null;
            case 8:
                return new C21429Ajw(this.A01, 3);
            default:
                C21322Ai7 ai7 = (C21322Ai7) this.A01;
                C18070vi.A0d(ai7, 0);
                return C17880vN.A0n(Math.max(0, C18020vd.A00(C18040vf.A02, ai7.A01, 7446)));
        }
    }
}
