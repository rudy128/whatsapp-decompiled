package X;

import com.whatsapp.util.Log;

/* renamed from: X.4Q2  reason: invalid class name */
public final class AnonymousClass4Q2 {
    public final C34241kA A00;
    public final AnonymousClass1FY A01;

    public void A00(CharSequence charSequence, int i, int i2, int i3) {
        Integer num;
        Log.i("ChatLockAuthCallbackBase/autherr");
        Integer[] numArr = new Integer[4];
        AnonymousClass000.A1L(numArr, 12);
        AnonymousClass3MX.A1R(numArr, 1);
        AnonymousClass3Ma.A1S(numArr, 11);
        numArr[3] = 14;
        Integer valueOf = Integer.valueOf(i);
        if (C200410p.A0U(valueOf, numArr)) {
            this.A00.C3e(new AnonymousClass4YL(AnonymousClass00R.A0C, Integer.valueOf(i2), Integer.valueOf(i3)));
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(' ');
        A10.append(charSequence);
        String A1I = AnonymousClass001.A1I(" code ", A10, i);
        if (i == 7) {
            A1I = AnonymousClass001.A1E(A1I, this.A01.getString(2131888141), AnonymousClass000.A10());
        }
        C17900vP.A0X(A1I, "Chatlock auth err ", AnonymousClass000.A10());
        Integer[] numArr2 = new Integer[3];
        AnonymousClass000.A1L(numArr2, 5);
        AnonymousClass000.A1M(numArr2, 10);
        AnonymousClass3Ma.A1S(numArr2, 13);
        boolean A0U = C200410p.A0U(valueOf, numArr2);
        C34241kA r3 = this.A00;
        if (A0U) {
            num = AnonymousClass00R.A0N;
        } else {
            num = AnonymousClass00R.A01;
        }
        r3.C3e(new AnonymousClass4YL(num, (Integer) null, (Integer) null));
    }

    public AnonymousClass4Q2(AnonymousClass1FY r1, C34241kA r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
