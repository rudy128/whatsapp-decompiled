package X;

import android.app.Activity;
import android.view.View;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;

/* renamed from: X.6qD  reason: invalid class name and case insensitive filesystem */
public final class C134206qD {
    public Activity A00;
    public C134106q3 A01;
    public C130046in A02;
    public C144547Hs A03;
    public C134166q9 A04;
    public AnonymousClass1BI A05;
    public boolean A06;
    public View A07;
    public KeyboardPopupLayout A08;
    public WaEditText A09;
    public Integer A0A;
    public Integer A0B;
    public final AnonymousClass190 A0C;
    public final AnonymousClass1KB A0D;
    public final AnonymousClass11S A0E;
    public final AnonymousClass18O A0F;
    public final AnonymousClass11C A0G;
    public final C19830z4 A0H;
    public final C18000vb A0I;
    public final C18030ve A0J;
    public final C18010vc A0K;
    public final AnonymousClass1L4 A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;

    public final C117015z4 A00() {
        Activity activity = this.A00;
        if (activity != null) {
            C18030ve r22 = this.A0J;
            AnonymousClass1KB r44 = this.A0D;
            AnonymousClass1L4 r21 = this.A0L;
            AnonymousClass190 r43 = this.A0C;
            AnonymousClass11S r20 = this.A0E;
            AnonymousClass18O r19 = this.A0F;
            C136936ue A0L2 = C108975cc.A0L(this.A0O);
            AnonymousClass11C r18 = this.A0G;
            C18000vb r17 = this.A0I;
            C27021Uk r11 = (C27021Uk) C18070vi.A0E(this.A0M);
            C19830z4 r15 = this.A0H;
            C18010vc r14 = this.A0K;
            AnonymousClass2L4 r10 = (AnonymousClass2L4) C18070vi.A0E(this.A0N);
            KeyboardPopupLayout keyboardPopupLayout = this.A08;
            if (keyboardPopupLayout != null) {
                WaEditText waEditText = this.A09;
                if (waEditText != null) {
                    View view = this.A07;
                    C134166q9 r7 = this.A04;
                    C144547Hs r6 = this.A03;
                    C130046in r5 = this.A02;
                    if (r5 == null) {
                        C18070vi.A11("emojiKeyboardComponent");
                        throw null;
                    }
                    C134106q3 r4 = this.A01;
                    boolean z = this.A06;
                    AnonymousClass1BI r2 = this.A05;
                    Integer num = this.A0B;
                    if (num != null) {
                        int intValue = num.intValue();
                        AnonymousClass11S r222 = r20;
                        AnonymousClass18O r23 = r19;
                        AnonymousClass11C r25 = r18;
                        C18000vb r27 = r17;
                        return new C117015z4(activity, view, r43, r44, keyboardPopupLayout, r222, r23, waEditText, r25, r15, r27, r4, r5, r6, r7, (A59) C18070vi.A0E(this.A0P), r22, r2, r14, r11, r10, A0L2, r21, this.A0A, intValue, z);
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public C134206qD(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, AnonymousClass18O r5, AnonymousClass11C r6, C19830z4 r7, C18000vb r8, C18030ve r9, C18010vc r10, AnonymousClass1L4 r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0w(r9, r11, r3, r2, r4);
        C18070vi.A0x(r5, r12, r6, r8, r13);
        C18070vi.A0r(r7, r10, r14);
        C18070vi.A0d(r15, 14);
        this.A0J = r9;
        this.A0L = r11;
        this.A0D = r3;
        this.A0C = r2;
        this.A0E = r4;
        this.A0F = r5;
        this.A0O = r12;
        this.A0G = r6;
        this.A0I = r8;
        this.A0M = r13;
        this.A0H = r7;
        this.A0K = r10;
        this.A0N = r14;
        this.A0P = r15;
    }

    public final void A01(View view, KeyboardPopupLayout keyboardPopupLayout, WaEditText waEditText, Integer num, int i) {
        C18070vi.A0i(keyboardPopupLayout, waEditText);
        this.A08 = keyboardPopupLayout;
        this.A07 = view;
        this.A09 = waEditText;
        this.A0B = Integer.valueOf(i);
        this.A0A = num;
    }
}
