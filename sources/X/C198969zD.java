package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.9zD  reason: invalid class name and case insensitive filesystem */
public class C198969zD {
    public final A79 A00;

    public static void A00(C166028cE r2, AnonymousClass21B r3, boolean z) {
        r3.A00 = r2.degreesLatitude_;
        r3.A01 = r2.degreesLongitude_;
        int i = r2.bitField0_;
        if ((i & 16) != 0) {
            r3.A02 = r2.url_;
        }
        if ((i & 4) != 0) {
            r3.A01 = r2.name_;
        }
        if ((i & 8) != 0) {
            r3.A00 = r2.address_;
        }
        if ((i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r3.A15(r2.jpegThumbnail_.A06(), z);
            r3.A02 = 2;
        }
    }

    public void A01(C19998A2m a2m, AnonymousClass8TF r10, AnonymousClass21B r11) {
        boolean z = a2m.A05;
        C29721cl r4 = a2m.A02;
        byte[] bArr = a2m.A0G;
        C693336u A0O = r11.A0O();
        double d = r11.A00;
        C166028cE r6 = (C166028cE) C17880vN.A0G(r10);
        int i = C166028cE.ACCURACY_IN_METERS_FIELD_NUMBER;
        r6.bitField0_ |= 1;
        r6.degreesLatitude_ = d;
        double d2 = r11.A01;
        C166028cE r62 = (C166028cE) C17880vN.A0G(r10);
        r62.bitField0_ |= 2;
        r62.degreesLongitude_ = d2;
        if (!TextUtils.isEmpty(r11.A02)) {
            String str = r11.A02;
            C166028cE r1 = (C166028cE) C17880vN.A0G(r10);
            str.getClass();
            r1.bitField0_ |= 16;
            r1.url_ = str;
        }
        if (!TextUtils.isEmpty(r11.A01)) {
            String str2 = r11.A01;
            C166028cE r12 = (C166028cE) C17880vN.A0G(r10);
            str2.getClass();
            r12.bitField0_ |= 4;
            r12.name_ = str2;
        }
        if (!TextUtils.isEmpty(r11.A00)) {
            String str3 = r11.A00;
            C166028cE r13 = (C166028cE) C17880vN.A0G(r10);
            str3.getClass();
            r13.bitField0_ |= 8;
            r13.address_ = str3;
        }
        if (!z && A0O.A01() != null) {
            C23581BmB A03 = C17900vP.A03(r10, A0O.A01());
            C166028cE r14 = (C166028cE) r10.A00;
            r14.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r14.jpegThumbnail_ = A03;
        }
        if (A79.A03(r4, r11, bArr)) {
            C166278cd A01 = A79.A01(r10, this.A00, a2m, r11);
            C166028cE r15 = (C166028cE) r10.A00;
            A01.getClass();
            r15.contextInfo_ = A01;
            r15.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        }
    }

    public C198969zD(A79 a79) {
        this.A00 = a79;
    }
}
