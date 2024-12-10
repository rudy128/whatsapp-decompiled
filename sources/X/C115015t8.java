package X;

import com.whatsapp.documentpicker.DocumentPickerActivity;

/* renamed from: X.5t8  reason: invalid class name and case insensitive filesystem */
public abstract class C115015t8 extends C74803cp {
    public boolean A00 = false;

    public static void A0y(AnonymousClass10E r1, AnonymousClass10G r2, C27201Vd r3, DocumentPickerActivity documentPickerActivity) {
        documentPickerActivity.A0A = r3;
        documentPickerActivity.A0B = (C88184Yq) r2.A15.get();
        documentPickerActivity.A0H = (C678731e) r2.A9H.get();
        documentPickerActivity.A0M = C000200d.A00(r2.AD5);
        documentPickerActivity.A0E = (AnonymousClass1NM) r1.A6D.get();
        documentPickerActivity.A0I = (C125946bw) r2.ADE.get();
        documentPickerActivity.A0C = (C134196qC) r2.A38.get();
        documentPickerActivity.A0D = (C31131f4) r1.A6M.get();
        documentPickerActivity.A0N = C000200d.A00(r2.A3f);
        documentPickerActivity.A0O = C000200d.A00(r2.A4T);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            DocumentPickerActivity documentPickerActivity = (DocumentPickerActivity) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, documentPickerActivity);
            AnonymousClass1FB.A0M(A0A, documentPickerActivity);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, documentPickerActivity);
            C109005cf.A0e(A0A, r1, documentPickerActivity, r1.A5A);
            C137106uv.A00(r4, documentPickerActivity);
            documentPickerActivity.A05 = (C34511kb) A0A.A2L.get();
            documentPickerActivity.A06 = AnonymousClass10E.A4z(A0A);
            A0y(A0A, r1, AnonymousClass3MZ.A0i(A0A), documentPickerActivity);
            documentPickerActivity.A07 = AnonymousClass3MZ.A0f(A0A);
            documentPickerActivity.A08 = AnonymousClass3MZ.A0g(A0A);
            documentPickerActivity.A0J = AnonymousClass3MY.A0Z(A0A);
            documentPickerActivity.A0F = AnonymousClass3Ma.A0b(A0A);
        }
    }

    public C115015t8() {
        AnonymousClass79Z.A00(this, 43);
    }
}
