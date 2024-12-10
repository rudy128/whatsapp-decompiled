package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.3hR  reason: invalid class name and case insensitive filesystem */
public final class C75403hR extends C75443hV {
    public C49082Pc A00;
    public Runnable A01;
    public final AnonymousClass01E A02;
    public final AnonymousClass1FR A03;
    public final AnonymousClass1KB A04;
    public final C33251iW A05;
    public final C37551pj A06;
    public final C136876uY A07;
    public final AnonymousClass11P A08;
    public final C25181Nf A09;
    public final C107335Zh A0A;
    public final C83624Ga A0B;
    public final AnonymousClass1BI A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final Integer A0F = C17880vN.A0k();
    public final C19880zA A0G;
    public final C19880zA A0H;
    public final AnonymousClass5YU A0I;
    public final C107835ah A0J;
    public final C1404271j A0K;
    public final C40751vD A0L;
    public final AnonymousClass1M9 A0M;
    public final AnonymousClass1PM A0N;
    public final C24921Me A0O;
    public final C25491Ok A0P;
    public final C36531o3 A0Q;
    public final C87884Xl A0R;
    public final C19830z4 A0S;
    public final C18000vb A0T;
    public final AnonymousClass1CJ A0U;
    public final AnonymousClass1MZ A0V;
    public final AnonymousClass1KW A0W;
    public final C18030ve A0X;
    public final AnonymousClass12L A0Y;
    public final AnonymousClass18K A0Z;
    public final C25241Nl A0a;
    public final C42211xo A0b;
    public final AnonymousClass1MB A0c;
    public final C87794Wz A0d;
    public final C36741oO A0e;
    public final AnonymousClass00H A0f;

    public C010105w A00(AnonymousClass1E7 r44, int i) {
        C73203Rj r5;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        int i3;
        C73203Rj A002;
        int i4;
        AnonymousClass4S9 selectedMessages;
        int i5;
        int i6;
        int i7 = i;
        if (i7 == 0) {
            AnonymousClass01E r4 = this.A02;
            AnonymousClass4Yv.A00(r4, 0);
            AnonymousClass4Yv.A00(r4, 20);
            C98084qY r52 = new C98084qY(this, 0);
            r4.getString(2131888317);
            C010105w create = this.A0e.A00(r4, r52, 1, 3, 0, true).create();
            create.show();
            return create;
        }
        AnonymousClass1E7 r2 = r44;
        if (i7 == 28 || i7 == 29) {
            AnonymousClass01E r10 = this.A02;
            AnonymousClass4Yv.A00(r10, i7);
            Object[] objArr = new Object[1];
            AnonymousClass3MX.A1N(this.A0O, r2, objArr, 0);
            r10.getString(2131889305, objArr);
            return this.A0e.A00(r10, new C98084qY(new C98074qX(r2, this, i7), 1), 1, 2, 0, false).create();
        } else if (i7 == 20) {
            AnonymousClass01E r102 = this.A02;
            AnonymousClass4Yv.A00(r102, 0);
            AnonymousClass4Yv.A00(r102, 20);
            C98044qU r22 = new C98044qU(this, 1);
            r102.getString(2131888317);
            return this.A0e.A00(r102, new C98084qY(r22, 1), 1, 3, 0, false).create();
        } else {
            if (i7 == 2) {
                AnonymousClass4bA r1 = new AnonymousClass4bA(this, 25);
                r5 = AnonymousClass4a6.A00(this.A02);
                r5.A0E(2131890839);
                r5.A0D(2131890838);
                r5.A0Z(r1, 2131899286);
            } else {
                if (i7 == 106 || i7 == 603 || i7 == 607 || i7 == 608) {
                    if (C42761yh.A01(this.A0Y, this.A0C)) {
                        i3 = 2131898330;
                    } else if (i7 == 106) {
                        i3 = 2131887927;
                    } else if (i7 == 607) {
                        i3 = 2131897288;
                    } else {
                        i3 = 2131893764;
                        if (i7 == 608) {
                            i3 = 2131897289;
                        }
                    }
                    AnonymousClass01E r6 = this.A02;
                    A002 = AnonymousClass4a6.A00(r6);
                    Object[] objArr2 = new Object[1];
                    AnonymousClass3MX.A1N(this.A0O, r2, objArr2, 0);
                    A002.A0S(r6.getString(i3, objArr2));
                    A002.A0Z(new C88864ax(r2, i7, 2, this), 2131897273);
                    i2 = 2131898766;
                    onClickListener = new AnonymousClass4at(this, i7, 4);
                } else {
                    if (i7 == 7) {
                        Log.w("conversation/dialog/oom");
                        r5 = AnonymousClass4a6.A00(this.A02);
                        r5.A0D(2131889999);
                        i5 = 2131899286;
                        i6 = 26;
                    } else if (i7 == 8) {
                        Log.e("conversation/dialog/not-an-image");
                        r5 = AnonymousClass4a6.A00(this.A02);
                        r5.A0D(2131889970);
                        i5 = 2131899286;
                        i6 = 27;
                    } else {
                        if (i7 == 9) {
                            Log.i("conversation/warned-about-call-charges");
                            A002 = AnonymousClass4a6.A00(this.A02);
                            A002.A0D(2131887622);
                            C73203Rj.A08(A002, this, 28, 2131887611);
                            i2 = 2131898766;
                            i4 = 29;
                        } else if (i7 == 10) {
                            return this.A0R.A01(this.A02, this.A03, r2.A0J);
                        } else {
                            if (i7 == 115) {
                                Log.i("conversation/dialog software-about-to-expire");
                                return this.A0K.A01(this.A02, this.A0L);
                            } else if (i7 == 12) {
                                Log.w("conversation/add existing contact: activity not found, probably tablet");
                                r5 = AnonymousClass4a6.A00(this.A02);
                                r5.A0D(2131886448);
                                i5 = 2131899286;
                                i6 = 30;
                            } else {
                                if (i7 == 13) {
                                    C95704mf r3 = (C95704mf) this.A0A;
                                    if (!(r3.A00 == 0 || (selectedMessages = ((AnonymousClass4aY) r3.A01).A2Q.getSelectedMessages()) == null)) {
                                        HashMap hashMap = selectedMessages.A03;
                                        if (!hashMap.isEmpty()) {
                                            StringBuilder A10 = AnonymousClass000.A10();
                                            A10.append("conversation/dialog/delete/");
                                            C17900vP.A0o(A10, hashMap.size());
                                            AnonymousClass01E r12 = this.A02;
                                            AnonymousClass11P r42 = this.A08;
                                            C18030ve r30 = this.A0X;
                                            AnonymousClass1KB r41 = this.A04;
                                            AnonymousClass10I r37 = this.A0D;
                                            AnonymousClass18K r24 = this.A0Z;
                                            AnonymousClass1KW r222 = this.A0W;
                                            C33251iW r20 = this.A05;
                                            AnonymousClass1M9 r11 = this.A0M;
                                            C24921Me r103 = this.A0O;
                                            C18000vb r19 = this.A0T;
                                            C25491Ok r23 = this.A0P;
                                            C42211xo r18 = this.A0b;
                                            AnonymousClass1MB r17 = this.A0c;
                                            C25241Nl r16 = this.A0a;
                                            AnonymousClass1PM r21 = this.A0N;
                                            C19830z4 r15 = this.A0S;
                                            C19880zA r9 = this.A0G;
                                            AnonymousClass1MZ r8 = this.A0V;
                                            C87794Wz r62 = this.A0d;
                                            HashSet hashSet = new HashSet(hashMap.values());
                                            AnonymousClass1BI A003 = AnonymousClass1E7.A00(r2);
                                            C107835ah r43 = this.A0J;
                                            AnonymousClass5YU r32 = this.A0I;
                                            AnonymousClass1CJ r25 = this.A0U;
                                            C19880zA r13 = this.A0H;
                                            C91994ga r0 = new C91994ga(r12, 0);
                                            C19830z4 r252 = r15;
                                            C18000vb r26 = r19;
                                            AnonymousClass1KW r29 = r222;
                                            AnonymousClass18K r31 = r24;
                                            C25241Nl r322 = r16;
                                            C42211xo r33 = r18;
                                            AnonymousClass1MB r34 = r17;
                                            return C88224Yu.A00(r12, r9, r13, r0, r32, r43, r41, r20, r11, r21, r103, r23, r42, r252, r26, r25, r8, r29, r30, r31, r322, r33, r34, (C62242r5) this.A0f.get(), r62, r37, C88224Yu.A01(r12, r11, r103, A003, hashSet), hashSet, true);
                                        }
                                    }
                                    Log.e("conversation/dialog/delete no messages");
                                } else if (i7 == 17) {
                                    AnonymousClass01E r45 = this.A02;
                                    A002 = AnonymousClass4a6.A00(r45);
                                    Object[] objArr3 = new Object[1];
                                    C17880vN.A1T(objArr3, 65536, 0);
                                    A002.A0S(r45.getString(2131887936, objArr3));
                                    C73203Rj.A08(A002, this, 31, 2131899381);
                                    i2 = 2131898766;
                                    i4 = 32;
                                } else if (i7 == 25) {
                                    AnonymousClass1FU r46 = (AnonymousClass1FU) this.A02;
                                    return C83414Fa.A00(r46, new C92164gr(r46, this.A0S, 25, 0), this.A0Q, this.A0C, true);
                                } else if (i7 == 19) {
                                    AnonymousClass1FU r47 = (AnonymousClass1FU) this.A02;
                                    return C83414Fa.A00(r47, new C92164gr(r47, this.A0S, 19, 0), this.A0Q, this.A0C, false);
                                } else if (i7 == 23) {
                                    AnonymousClass1FU r48 = (AnonymousClass1FU) this.A02;
                                    return C83414Fa.A00(r48, new C92164gr(r48, this.A0S, 23, 1), this.A0Q, this.A0C, true);
                                } else if (i7 == 24) {
                                    AnonymousClass1FU r49 = (AnonymousClass1FU) this.A02;
                                    return C83414Fa.A00(r49, new C92164gr(r49, this.A0S, 24, 1), this.A0Q, this.A0C, false);
                                }
                                return null;
                            }
                        }
                        onClickListener = new AnonymousClass4bA(this, i4);
                    }
                    C73203Rj.A08(r5, this, i6, i5);
                }
                r5.A0X(onClickListener, i2);
            }
            return r5.create();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        this.A01 = null;
        C49082Pc r1 = this.A00;
        if (r1 != null) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A0B(true);
            this.A00 = null;
        }
    }

    public String BO6() {
        return "ConversationDialogController";
    }

    public C75403hR(AnonymousClass01E r4, C19880zA r5, C19880zA r6, AnonymousClass5YU r7, C107835ah r8, AnonymousClass1FR r9, AnonymousClass1KB r10, C1404271j r11, C40751vD r12, C33251iW r13, C37551pj r14, AnonymousClass1M9 r15, AnonymousClass1PM r16, C24921Me r17, C25491Ok r18, C36531o3 r19, C87884Xl r20, C136876uY r21, AnonymousClass11P r22, C19830z4 r23, C18000vb r24, AnonymousClass1CJ r25, C25181Nf r26, AnonymousClass1MZ r27, C107335Zh r28, C83624Ga r29, AnonymousClass1KW r30, C18030ve r31, AnonymousClass12L r32, AnonymousClass18K r33, C25241Nl r34, C42211xo r35, AnonymousClass1MB r36, AnonymousClass1BI r37, C87794Wz r38, C36741oO r39, AnonymousClass10I r40, AnonymousClass00H r41, AnonymousClass00H r42) {
        this.A02 = r4;
        this.A08 = r22;
        this.A0X = r31;
        this.A0L = r12;
        this.A04 = r10;
        this.A0D = r40;
        this.A0Z = r33;
        this.A0U = r25;
        this.A0W = r30;
        this.A05 = r13;
        this.A0Y = r32;
        this.A0E = r41;
        this.A0M = r15;
        this.A0O = r17;
        this.A0T = r24;
        this.A06 = r14;
        this.A0P = r18;
        this.A0b = r35;
        this.A07 = r21;
        this.A0c = r36;
        this.A0K = r11;
        this.A0a = r34;
        this.A0G = r5;
        this.A0N = r16;
        this.A0S = r23;
        this.A0Q = r19;
        this.A0R = r20;
        this.A0f = r42;
        this.A0e = r39;
        this.A0V = r27;
        this.A09 = r26;
        this.A0d = r38;
        this.A0H = r6;
        this.A03 = r9;
        this.A0J = r8;
        this.A0I = r7;
        C107335Zh r2 = r28;
        this.A0A = r2;
        this.A0C = r37;
        this.A0B = r29;
        this.A01 = new AnonymousClass3C4(this, r9, r2, 29);
    }
}
