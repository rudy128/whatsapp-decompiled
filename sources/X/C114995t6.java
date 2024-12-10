package X;

import com.whatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.5t6  reason: invalid class name and case insensitive filesystem */
public abstract class C114995t6 extends C74803cp {
    public boolean A00 = false;

    public static void A0y(AnonymousClass10E r1, AnonymousClass10G r2, AudioPickerActivity audioPickerActivity, C24921Me r4) {
        audioPickerActivity.A06 = r4;
        audioPickerActivity.A0E = C000200d.A00(r2.AD5);
        audioPickerActivity.A0A = (C134196qC) r2.A38.get();
        audioPickerActivity.A0B = (C31131f4) r1.A6M.get();
        audioPickerActivity.A0G = C000200d.A00(r2.A3f);
        audioPickerActivity.A0H = C000200d.A00(r2.A4T);
        audioPickerActivity.A09 = (C88184Yq) r2.A15.get();
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AudioPickerActivity audioPickerActivity = (AudioPickerActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, audioPickerActivity);
            AnonymousClass1FB.A0M(A0A, audioPickerActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, audioPickerActivity);
            C109005cf.A0e(A0A, r1, audioPickerActivity, r1.A5A);
            C137106uv.A00(r4, audioPickerActivity);
            audioPickerActivity.A04 = C108965cb.A0K(A0A);
            audioPickerActivity.A0F = C000200d.A00(A0A.AYQ);
            audioPickerActivity.A08 = AnonymousClass3MZ.A0i(A0A);
            audioPickerActivity.A05 = AnonymousClass10E.A4z(A0A);
            A0y(A0A, r1, audioPickerActivity, AnonymousClass3MZ.A0g(A0A));
        }
    }

    public C114995t6() {
        AnonymousClass79Z.A00(this, 11);
    }
}
