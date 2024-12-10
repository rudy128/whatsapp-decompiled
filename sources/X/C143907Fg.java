package X;

import com.whatsapp.dobverification.common.CommonRemediationApi;
import com.whatsapp.util.Log;

/* renamed from: X.7Fg  reason: invalid class name and case insensitive filesystem */
public final class C143907Fg implements AnonymousClass1PZ {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass00H A02;
    public final CommonRemediationApi A03;

    public Object Bk1(String str, String str2, C30391dr r4) {
        return this.A03.Bk1(str, str2, r4);
    }

    public final C1595584z A00(String str) {
        C1595584z r4;
        C18070vi.A0d(str, 0);
        C19830z4 r0 = this.A01;
        String A0t = C108955ca.A0t(r0);
        String A0u = C108955ca.A0u(r0);
        Log.i("WaPancakeApi/sendAgeVerification");
        if (AnonymousClass1YF.A0T(A0t) || AnonymousClass1YF.A0T(A0u) || AnonymousClass1YF.A0T(str)) {
            return new C143917Fh(AnonymousClass00R.A0C);
        }
        C130846k6 A0K = ((A98) this.A02.get()).A0K(A0t, A0u, str, "dob");
        if (A0K != null) {
            switch (A0K.A02.intValue()) {
                case 0:
                    r4 = new C143967Fm(A0K.A04, A0K.A09, A0K.A08, A0K.A07);
                    break;
                case 3:
                    r4 = new C143917Fh(AnonymousClass00R.A00);
                    break;
                case 4:
                    r4 = new C143917Fh(AnonymousClass00R.A0C);
                    break;
                case 5:
                    r4 = C144037Ft.A00;
                    break;
                case 6:
                    r4 = C143997Fp.A00;
                    break;
                case 7:
                    r4 = C144047Fu.A00;
                    break;
                case 8:
                    r4 = C144027Fs.A00;
                    break;
                case 9:
                    r4 = C144017Fr.A00;
                    break;
                case 10:
                    r4 = new C143917Fh(AnonymousClass00R.A01);
                    break;
                case 11:
                    r4 = C144067Fw.A00;
                    break;
                case 12:
                    if (!"youth_consent".equalsIgnoreCase(A0K.A06)) {
                        r4 = new C143947Fk(A0K.A05);
                        break;
                    } else {
                        r4 = new C143957Fl(A0K.A00, A0K.A01);
                        break;
                    }
                case 14:
                    r4 = new C143937Fj(A0K.A03);
                    break;
                case 15:
                    r4 = new C143927Fi(A0K.A03);
                    break;
                case 16:
                    r4 = C144007Fq.A00;
                    break;
            }
        }
        r4 = new C143917Fh(AnonymousClass00R.A0N);
        return r4;
    }

    public C143907Fg(AnonymousClass11P r2, C19830z4 r3, CommonRemediationApi commonRemediationApi, AnonymousClass00H r5) {
        C18070vi.A0j(r2, r3);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = commonRemediationApi;
        this.A02 = r5;
    }
}
