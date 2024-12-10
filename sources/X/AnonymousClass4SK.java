package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.4SK  reason: invalid class name */
public class AnonymousClass4SK {
    public final C61852qO A00;
    public final C56402hP A01;
    public final C31131f4 A02;
    public final C62332rE A03;
    public final C130236j6 A04;
    public final AnonymousClass88X A05;
    public final AnonymousClass1DC A06;

    public AnonymousClass4SK(C61852qO r1, C56402hP r2, C31131f4 r3, C62332rE r4, AnonymousClass1DC r5, C130236j6 r6, AnonymousClass88X r7) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r7;
        this.A01 = r2;
        this.A04 = r6;
        this.A06 = r5;
    }

    public AnonymousClass74M A00(View view, AnonymousClass1FY r17, AnonymousClass3V4 r18, AnonymousClass8AX r19, boolean z) {
        View view2 = view;
        AnonymousClass3MW.A0E(view2, 2131436885).inflate();
        AnonymousClass1FY r4 = r17;
        return this.A01.A00(view2, r4, r4, r18, this.A00.A01(r4, view2), this.A04, this.A05.BGi(r4), r19, (C126726dC) null, true, AnonymousClass000.A1S(Build.VERSION.SDK_INT, 26), z);
    }

    public AnonymousClass74M A01(AnonymousClass1FU r16, KeyboardPopupLayout keyboardPopupLayout, AnonymousClass3V4 r18, AnonymousClass8AX r19) {
        KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
        AnonymousClass3MW.A0E(keyboardPopupLayout2, 2131436885).inflate();
        C56402hP r2 = this.A01;
        AnonymousClass1FU r4 = r16;
        AnonymousClass7OH A012 = this.A00.A01(r4, keyboardPopupLayout2);
        C132536my BGi = this.A05.BGi(r4);
        boolean A1S = AnonymousClass000.A1S(Build.VERSION.SDK_INT, 26);
        return r2.A00(keyboardPopupLayout2, r4, r4, r18, A012, this.A04, BGi, r19, new C126726dC(this), false, A1S, false);
    }
}
