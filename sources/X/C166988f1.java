package X;

import android.app.Activity;
import android.view.Menu;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.8f1  reason: invalid class name and case insensitive filesystem */
public abstract class C166988f1 extends C166688dS {
    public AnonymousClass4SH A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C21980Avi(this));

    public static void A0c(Activity activity, C33841jT r17, RegisterPhone registerPhone, int i) {
        C33841jT.A03(r17, i, true);
        RegisterPhone registerPhone2 = registerPhone;
        int A0T = registerPhone2.A0M.A0T();
        long j = registerPhone2.A06;
        long j2 = registerPhone2.A07;
        long j3 = registerPhone2.A08;
        long j4 = registerPhone2.A03;
        boolean z = registerPhone2.A13;
        Boolean bool = C17970vW.A01;
        int A0V = registerPhone2.A0M.A0V();
        int A0U = registerPhone2.A0M.A0U();
        boolean z2 = registerPhone2.A0y;
        Activity activity2 = activity;
        activity2.startActivity(AnonymousClass1LU.A1R(activity2, (String) registerPhone2.A0M.A0M.A06(), A0T, A0V, A0U, j, j2, j3, j4, z, false, z2));
        activity2.finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        AnonymousClass4SH r2 = this.A00;
        if (r2 != null) {
            r2.A00(menu, this, (RegistrationAudioGuidanceViewModel) this.A01.getValue(), A4c());
            return super.onCreateOptionsMenu(menu);
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        AnonymousClass4SH r2 = this.A00;
        if (r2 != null) {
            r2.A00(menu, this, (RegistrationAudioGuidanceViewModel) this.A01.getValue(), A4c());
            return super.onPrepareOptionsMenu(menu);
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public static String A03(VerifyPhoneNumber verifyPhoneNumber) {
        C219217x r1 = verifyPhoneNumber.A0Y;
        if (verifyPhoneNumber.A1Z) {
            return "2";
        }
        if (r1.A02("android.permission.RECEIVE_SMS") == 0) {
            return "1";
        }
        return "0";
    }

    public static StringBuilder A0Q(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verify");
        sb.append(str);
        sb.append("/request/");
        sb.append(str);
        return sb;
    }

    public static StringBuilder A0V(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyPhoneNumber/verifyvoice/request/");
        sb.append(str);
        return sb;
    }

    public static void A0d(AnonymousClass1F9 r1, C86374Rj r2, int i) {
        r2.A03(r1, new C20338AGu(r1, i));
    }

    public static void A0q(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, C18010vc r4, RegisterPhone registerPhone) {
        registerPhone.A0V = r4;
        registerPhone.A0Z = (C27361Vu) r2.A5Q.get();
        registerPhone.A0t = C000200d.A00(r3.A5E);
        registerPhone.A0s = C000200d.A00(r2.ABu);
        registerPhone.A0h = C000200d.A00(r2.A09);
        registerPhone.A0l = C000200d.A00(r2.Aer);
        registerPhone.A0r = C000200d.A00(r1.A5z);
        registerPhone.A0i = C000200d.A00(r3.A5a);
        registerPhone.A0q = C000200d.A00(r3.A4I);
        registerPhone.A0o = C000200d.A00(r3.AJ5);
        registerPhone.A0j = C000200d.A00(r2.A0h);
        registerPhone.A0m = C000200d.A00(r3.AEq);
        registerPhone.A0d = (A5R) r3.AIb.get();
    }

    public static void A0s(AnonymousClass1K1 r1, AnonymousClass10E r2, RegisterPhone registerPhone, Object obj) {
        registerPhone.A0e = (AnonymousClass1Nb) obj;
        registerPhone.A0N = (AnonymousClass1Cd) r2.A6i.get();
        registerPhone.A0p = C000200d.A00(r1.A5g);
        registerPhone.A0T = (C32291gx) r2.A6X.get();
        registerPhone.A0J = (AnonymousClass1VJ) r2.A2W.get();
        registerPhone.A0k = C000200d.A00(r2.AUf);
        registerPhone.A0K = (C25161Nd) r2.A2v.get();
        registerPhone.A0X = (C33641j9) r2.Am6.get();
        registerPhone.A0M = (C27301Vn) r2.A9A.get();
        registerPhone.A0Y = (C27371Vv) r2.A3Q.get();
        registerPhone.A0c = AnonymousClass1K1.A1j(r1);
        registerPhone.A0n = C000200d.A00(r2.Afu);
        registerPhone.A0F = (C19880zA) r2.A7j.get();
    }

    public static void A0t(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass118 r3, AnonymousClass99S r4) {
        r4.A08 = r3;
        r4.A0G = (AnonymousClass1LU) r1.ABd.get();
        r4.A0P = (C36401np) r2.A30.get();
        r4.A0D = (AnonymousClass18K) r1.A9B.get();
        r4.A05 = (AnonymousClass194) r1.A9Z.get();
        r4.A02 = C19890zB.A00;
        r4.A0U = C000200d.A00(r1.A4U);
        r4.A0V = C000200d.A00(r1.A5t);
        r4.A06 = (C132216mP) r2.A4S.get();
        r4.A0J = (C26145Ct9) r2.A6G.get();
        r4.A04 = (AnonymousClass1LA) r1.AeS.get();
        r4.A0O = (AnonymousClass1K3) r1.A30.get();
        r4.A0F = (AnonymousClass1MB) r1.AAb.get();
    }

    public static void A0u(AnonymousClass10E r1, AnonymousClass10G r2, RegisterPhone registerPhone) {
        registerPhone.A01 = (C19880zA) r1.A7j.get();
        registerPhone.A09 = (C27301Vn) r1.A9A.get();
        registerPhone.A0Q = (AnonymousClass1D9) r1.A0n.get();
        registerPhone.A0W = (C192779oy) r2.AEo.get();
        registerPhone.A0L = (AnonymousClass1L7) r1.A3t.get();
    }

    public static void A0v(AnonymousClass10E r1, AnonymousClass1LU r2, RegisterPhone registerPhone) {
        registerPhone.A0R = r2;
        registerPhone.A0g = (C136576u2) r1.AEP.get();
        registerPhone.A0H = (C47942Ko) r1.A3H.get();
        registerPhone.A0P = (AnonymousClass1KH) r1.A94.get();
    }

    public static void A0w(VerifyPhoneNumber verifyPhoneNumber) {
        verifyPhoneNumber.A0k.A03("failTooMany");
        verifyPhoneNumber.A0k.A02("verify-tmg");
    }

    public String A4c() {
        if (this instanceof VerifyPhoneNumber) {
            return ((VerifyPhoneNumber) this).A1K;
        }
        if (this instanceof RegisterPhone) {
            return "enter_pn";
        }
        if (this instanceof ChangeNumber) {
            return null;
        }
        return "flash_call_education";
    }

    public final void A4d() {
        String str;
        AnonymousClass4SH r4 = this.A00;
        if (r4 != null) {
            RegistrationAudioGuidanceViewModel registrationAudioGuidanceViewModel = (RegistrationAudioGuidanceViewModel) this.A01.getValue();
            String A4c = A4c();
            if (this instanceof VerifyPhoneNumber) {
                str = VerifyPhoneNumber.A16((VerifyPhoneNumber) this);
            } else if (this instanceof RegisterPhone) {
                str = "enter_number";
            } else if (this instanceof ChangeNumber) {
                str = "unknown";
            } else {
                str = "flash_call_education";
            }
            r4.A01(this, registrationAudioGuidanceViewModel, A4c, str);
            return;
        }
        C18070vi.A11("registrationAudioGuidanceSetupManager");
        throw null;
    }

    public static void A0r(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass99S r4, C18140vp r5) {
        r4.A0C = (AnonymousClass19F) r5.get();
        r4.A0E = (C139576z4) r2.A01.get();
        r4.A0B = (C134036pu) r3.AB8.get();
        r4.A0W = C000200d.A00(r3.AEr);
        r4.A0T = C000200d.A00(r2.A2n);
        r4.A0K = (C57352iw) r3.ACl.get();
        r4.A03 = (C31361fR) r2.A1z.get();
        r4.A0I = (C33841jT) r2.A9T.get();
        r4.A0A = (C219217x) r2.ABj.get();
        r4.A0Q = C000200d.A00(r2.A08);
        r4.A0X = C000200d.A00(r2.Ag7);
        r4.A0R = C000200d.A00(r3.A6B);
        r4.A0S = C000200d.A00(r1.A07);
    }

    public static void A0x(A5R a5r, String str, long j) {
        a5r.A07(str, System.currentTimeMillis() + j);
    }

    public static void A0y(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append("/retryAfter=");
    }

    public static boolean A0z(C19830z4 r1, ADN adn, VerifyPhoneNumber verifyPhoneNumber, String str) {
        A9B.A0U(r1, str);
        verifyPhoneNumber.A0k.A03("failTooMany");
        verifyPhoneNumber.A0k.A02("verify-tma");
        return VerifyPhoneNumber.A20(adn.A0L);
    }

    public void onStart() {
        super.onStart();
        A4d();
    }

    public void onStop() {
        super.onStop();
        ((RegistrationAudioGuidanceViewModel) this.A01.getValue()).A0U(false);
    }
}
