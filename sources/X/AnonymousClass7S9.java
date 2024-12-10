package X;

import android.graphics.Bitmap;
import com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel$submitPinForUsername$1;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.7S9  reason: invalid class name */
public class AnonymousClass7S9 implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass7S9(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            UsernamePinEntryViewModel usernamePinEntryViewModel = (UsernamePinEntryViewModel) this.A01;
            String str = this.A03;
            String str2 = ((C26224CvE) ((C17330uU) this.A02).getValue()).A01.A00;
            C18070vi.A0d(str2, 1);
            AnonymousClass3MY.A1Y(usernamePinEntryViewModel.A06, true);
            AnonymousClass3MY.A1Y(usernamePinEntryViewModel.A07, false);
            AnonymousClass3MW.A1X(usernamePinEntryViewModel.A05, new UsernamePinEntryViewModel$submitPinForUsername$1(usernamePinEntryViewModel, str, str2, (C30391dr) null), C41561wd.A00(usernamePinEntryViewModel));
        } else {
            AnonymousClass6EX r5 = (AnonymousClass6EX) this.A01;
            String str3 = this.A03;
            Object obj3 = this.A02;
            Bitmap bitmap = (Bitmap) obj2;
            C18070vi.A0d(obj3, 2);
            if (bitmap != null) {
                File A0e = C17880vN.A0e(r5.A0A(), AnonymousClass000.A0y(".jpg", AnonymousClass000.A11(str3)));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, C108945cZ.A19(A0e));
                C62022qf r8 = new C62022qf(false, false, false);
                C26551So r9 = C26551So.A0P;
                C18020vd A0P = C17880vN.A0P(r5.A00);
                C18040vf r6 = C18040vf.A02;
                int A002 = C18020vd.A00(r6, A0P, 1577);
                int A003 = C18020vd.A00(r6, A0P, 1578);
                int A004 = C18020vd.A00(r6, A0P, 1576);
                C63722ta A032 = C63722ta.A03(new AnonymousClass6nF(A002, A003, A004, A004), r8, r9, A0e, (String) null, 34, 0, 0);
                AnonymousClass00H r3 = r5.A02;
                AnonymousClass34B A0C = ((AnonymousClass1T6) r3.get()).A0C(A032, true);
                A0C.A0Z = "mms";
                A0C.A07(new C145937Ne(obj3, A0C, 25), (Executor) r5.A04.getValue());
                ((AnonymousClass1T6) r3.get()).A0J(A0C, (String) null);
            }
        }
        return C27621Wu.A00;
    }
}
