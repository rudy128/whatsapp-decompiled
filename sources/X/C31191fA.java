package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.chatlock.dialogs.ChatsAreLockedDialogFragment;
import com.whatsapp.chatlock.dialogs.ClearLockedChatsDialogFragment;
import com.whatsapp.chatlock.dialogs.helperflow.ChatLockHelperBottomSheet;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fA  reason: invalid class name and case insensitive filesystem */
public final class C31191fA {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1CJ A05;
    public final C18030ve A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final C18140vp A0M;
    public final AnonymousClass118 A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final C18140vp A0Q;
    public final boolean A0R = AnonymousClass112.A01();

    public static final void A00(Resources resources, View view, int i) {
        C18070vi.A0d(view, 0);
        C23520Bik A012 = C23520Bik.A01(view, i, 0);
        BIE bie = A012.A0J;
        ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = resources.getDimensionPixelSize(2131168774);
        marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, resources.getDimensionPixelSize(2131168777));
        bie.setLayoutParams(marginLayoutParams);
        A012.A0F(new C89884dB(A012, 44), 2131899286);
        A012.A08();
    }

    public static final void A02(Bundle bundle, AnonymousClass1FY r3, AnonymousClass4EF r4, C34241kA r5, C31191fA r6, int i) {
        C18070vi.A0d(bundle, 6);
        if (bundle.getBoolean("UnarchiveForQuickLockDialogFragment_result_key")) {
            r6.A07.CGF(new AnonymousClass7RL(r6, r4, 37));
            r6.A0A(r3, r4, r5, i);
            return;
        }
        r5.C3e(new AnonymousClass4YL(AnonymousClass00R.A0Y, (Integer) null, (Integer) null));
    }

    public static final void A03(Bundle bundle, AnonymousClass1FY r7, AnonymousClass4YL r8, C31191fA r9, C72213Lb r10, AnonymousClass1BI r11) {
        int i;
        int i2;
        C18070vi.A0d(bundle, 6);
        AnonymousClass1FY r4 = r7;
        C72213Lb r72 = r10;
        if (bundle.getBoolean("result")) {
            C31191fA r6 = r9;
            AnonymousClass4VV r3 = (AnonymousClass4VV) r9.A0A.get();
            AnonymousClass4YL r5 = r8;
            Integer num = r8.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            Integer num2 = r8.A01;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            r3.A04(r11, Integer.valueOf(i), Integer.valueOf(i2), 7);
            r4.A03.A00.A03.A0t(new C64962vc(r4, r5, r6, r72, r11, 0), r4, "ClearLockedChatsDialogFragment_request_key");
            r4.CMk(new ClearLockedChatsDialogFragment(), "ClearLockedChatsDialogFragment");
        } else if (r10 != null) {
            r10.Bnj();
        }
        r4.A03.A00.A03.A0u("request_key");
    }

    public static final void A04(Bundle bundle, AnonymousClass1FY r4, AnonymousClass4YL r5, C31191fA r6, C72213Lb r7, AnonymousClass1BI r8) {
        int i;
        int i2;
        C18070vi.A0d(bundle, 6);
        if (bundle.getBoolean("ClearLockedChatsDialogFragment_result_key")) {
            if (r8 == null) {
                r6.A07();
            } else {
                Log.i("ChatLockManager/clearLockedChat");
                r6.A07.CGF(new AnonymousClass7RL(r6, r8, 38));
            }
            if (r7 != null) {
                r7.Bog();
            }
            AnonymousClass4VV r3 = (AnonymousClass4VV) r6.A0A.get();
            Integer num = r5.A00;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 5;
            }
            Integer num2 = r5.A01;
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = 1;
            }
            r3.A04(r8, Integer.valueOf(i), Integer.valueOf(i2), 8);
        } else if (r7 != null) {
            r7.Bnj();
        }
        r4.A03.A00.A03.A0u("ClearLockedChatsDialogFragment_request_key");
    }

    public final void A08(Context context) {
        C18070vi.A0d(context, 0);
        this.A07.CGF(new AnonymousClass7RL(this, context, 35));
    }

    public final void A09(AnonymousClass02n r5, AnonymousClass1BI r6, int i) {
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r5, 2);
        this.A00 = true;
        this.A0L.get();
        Context context = this.A0N.A00;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
        intent.putExtra("extra_chat_jid", r6.getRawString());
        intent.putExtra("extra_open_chat_directly", true);
        intent.putExtra("extra_unlock_entry_point", i);
        r5.A02((C1406772n) null, intent);
    }

    public final void A0A(AnonymousClass1FY r15, AnonymousClass4EF r16, C34241kA r17, int i) {
        AnonymousClass1FY r3 = r15;
        C18070vi.A0d(r15, 0);
        C34241kA r1 = r17;
        C18070vi.A0d(r1, 3);
        if (!this.A0R) {
            Log.e("ChatLockManager/authenticate: Unsupported Version");
        } else if (((ChatLockPasscodeManager) this.A0I.get()).A02.A05() || !this.A04.A0N()) {
            AnonymousClass4Q2 r5 = new AnonymousClass4Q2(r15, r1);
            AnonymousClass4EF r4 = r16;
            int i2 = i;
            A05(r4).BCo(r15, r4, r5, new AnonymousClass4OS(r3, r4, r5, this, i2), i2);
        } else {
            C73193Ri r12 = new C73193Ri(r15, 2132084403);
            r12.A0V(2131888179);
            r12.A0U(2131888178);
            r12.A0f(true);
            r12.A0X((DialogInterface.OnClickListener) null, 2131899286);
            r12.create().show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A0l == true) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass1FY r10, X.AnonymousClass4EF r11, X.C34241kA r12, int r13) {
        /*
            r9 = this;
            r5 = r11
            boolean r0 = r11 instanceof X.C76853oX
            r3 = 1
            r7 = r9
            r4 = r10
            r6 = r12
            r8 = r13
            if (r0 == 0) goto L_0x0036
            X.1CJ r1 = r9.A05
            r0 = r5
            X.3oX r0 = (X.C76853oX) r0
            X.1BI r0 = r0.A00
            X.1ci r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A0l
            if (r0 != r3) goto L_0x005c
        L_0x001b:
            X.1Gb r0 = r10.A03
            X.1GO r0 = r0.A00
            X.1GP r1 = r0.A03
            X.2vb r3 = new X.2vb
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment_request_key"
            r1.A0t(r3, r10, r0)
            com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment r1 = new com.whatsapp.chatlock.dialogs.UnarchiveForQuickLockDialogFragment
            r1.<init>()
            java.lang.String r0 = "UnarchiveForQuickLockDialogFragment"
            r10.CMk(r1, r0)
            return
        L_0x0036:
            boolean r0 = r11 instanceof X.C76863oY
            if (r0 == 0) goto L_0x005c
            r0 = r5
            X.3oY r0 = (X.C76863oY) r0
            java.util.Collection r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1CJ r0 = r9.A05
            X.1ci r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0043
            boolean r0 = r0.A0l
            if (r0 != r3) goto L_0x0043
            goto L_0x001b
        L_0x005c:
            r9.A0A(r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31191fA.A0B(X.1FY, X.4EF, X.1kA, int):void");
    }

    public final void A0C(AnonymousClass1FY r3, AnonymousClass4EF r4, C34241kA r5, AnonymousClass1BI r6, int i) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0d(r5, 4);
        if (!this.A05.A01.isEmpty()) {
            A0B(r3, r4, r5, i);
            return;
        }
        ChatLockHelperBottomSheet chatLockHelperBottomSheet = new ChatLockHelperBottomSheet();
        chatLockHelperBottomSheet.A07 = r6;
        chatLockHelperBottomSheet.A02 = r5;
        chatLockHelperBottomSheet.A01 = r4;
        chatLockHelperBottomSheet.A00 = i;
        r3.CMk(chatLockHelperBottomSheet, "ChatLockQuickAddHelperBottomSheet");
    }

    public final void A0D(AnonymousClass1FY r10, AnonymousClass4YL r11, C72213Lb r12, AnonymousClass1BI r13) {
        r10.A03.A00.A03.A0t(new C64962vc(r10, r11, this, r12, r13, 1), r10, "request_key");
        r10.CMk(new ChatsAreLockedDialogFragment(), "ChatsAreLockedDialogFragment");
    }

    public final void A0E(AnonymousClass1FY r6, AnonymousClass1BI r7) {
        C18070vi.A0d(r6, 0);
        C73203Rj A002 = AnonymousClass4a6.A00(r6);
        A002.A0E(2131888174);
        A002.A0D(2131888173);
        A002.A0T(true);
        A002.A0g(r6, (C22851Dl) null, 2131899286);
        A002.create().show();
        ((AnonymousClass4VV) this.A0A.get()).A04(r7, 0, (Integer) null, 4);
    }

    public final void A0F(AnonymousClass1BI r2, boolean z) {
        C18070vi.A0d(r2, 1);
        List singletonList = Collections.singletonList(r2);
        C18070vi.A0X(singletonList);
        A0H(singletonList, z);
    }

    public final void A0G(AnonymousClass1BI r4, boolean z) {
        C18070vi.A0d(r4, 1);
        AnonymousClass1CJ r1 = this.A05;
        HashSet hashSet = r1.A01;
        if (!(!hashSet.isEmpty())) {
            A0I(false);
        }
        C29691ci A002 = AnonymousClass1CJ.A00(r1, r4);
        if (A002 != null) {
            A002.A0m = z;
            ((AnonymousClass1LW) this.A0C.get()).A06(A002);
            AnonymousClass1BI A082 = A002.A08();
            if (z) {
                hashSet.add(A082);
            } else {
                hashSet.remove(A082);
            }
        }
    }

    public final void A0H(Collection collection, boolean z) {
        C18070vi.A0d(collection, 1);
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r5 = (AnonymousClass1BI) it.next();
            C18070vi.A0b(r5);
            A0G(r5, z);
            AnonymousClass1Q1 r4 = (AnonymousClass1Q1) this.A0P.get();
            C18070vi.A0d(r5, 0);
            ((AnonymousClass11A) r4.A00.get()).A00(new AnonymousClass3Bx(r4, r5, 6));
        }
        ((C32531hL) this.A0Q.get()).A03();
        ((AnonymousClass1NN) this.A0E.get()).A00();
        this.A07.CGF(new AnonymousClass7RF(arrayList, this, 22, z));
    }

    public final boolean A0M(AnonymousClass1BI r3) {
        return r3 != null && this.A05.A0S(r3) && !this.A03;
    }

    public static final void A01(Resources resources, View view, boolean z) {
        Log.i("ChatLockManager/showUnlockAndClearToast");
        int i = 2131888189;
        if (!z) {
            i = 2131888188;
        }
        C23520Bik A012 = C23520Bik.A01(view, i, 0);
        BIE bie = A012.A0J;
        ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int dimensionPixelSize = resources.getDimensionPixelSize(2131168774);
        marginLayoutParams.setMargins(dimensionPixelSize, marginLayoutParams.topMargin, dimensionPixelSize, resources.getDimensionPixelSize(2131168777));
        bie.setLayoutParams(marginLayoutParams);
        A012.A0F(new C89884dB(A012, 45), 2131899286);
        A012.A08();
    }

    public final C107945as A05(AnonymousClass4EF r6) {
        AnonymousClass0PO r1;
        int i;
        Object obj;
        if (this.A04.A0N()) {
            obj = this.A0H.get();
        } else {
            AnonymousClass00H r2 = this.A0O;
            C93844jd r12 = (C93844jd) r2.get();
            boolean z = r6 instanceof C76883oa;
            boolean z2 = true;
            if (z || !((ChatLockPasscodeManager) r12.A03.get()).A02.A05()) {
                r1 = (AnonymousClass0PO) r12.A04.get();
                i = 33023;
            } else {
                r1 = (AnonymousClass0PO) r12.A04.get();
                i = 255;
            }
            if (r1.A03(i) != 0) {
                z2 = false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("ChatLockManager/canAuth: ");
            sb.append(z2);
            Log.i(sb.toString());
            if (!z2) {
                AnonymousClass00H r13 = this.A0H;
                C93834jc r0 = (C93834jc) r13.get();
                if (!z && ((ChatLockPasscodeManager) r0.A03.get()).A02.A05()) {
                    obj = r13.get();
                }
            }
            obj = r2.get();
        }
        C18070vi.A0X(obj);
        return (C107945as) obj;
    }

    public final void A06() {
        ((AnonymousClass11A) this.A0G.get()).A00(new C98754rf(this, 1));
    }

    public final void A07() {
        Log.i("ChatLockManager/clearAllLockedChats");
        A0J(false);
        ((ChatLockPasscodeManager) this.A0I.get()).A05(new C99234sU(4));
        this.A07.CGF(new C98754rf(this, 2));
    }

    public final void A0I(boolean z) {
        ((SharedPreferences) ((AnonymousClass1TK) this.A0B.get()).A02.getValue()).edit().putBoolean("has_suppressed_banner", z).apply();
    }

    public final void A0J(boolean z) {
        ((AnonymousClass1TK) this.A0B.get()).A02(z);
        this.A07.CGF(new C98754rf(this, 3));
    }

    public final boolean A0K() {
        if (!((ChatLockPasscodeManager) this.A0I.get()).A02.A05() || !((AnonymousClass1TK) this.A0B.get()).A04()) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        if (!this.A0R) {
            return false;
        }
        AnonymousClass11S r1 = this.A04;
        if (!r1.A0N() || r1.A0N()) {
            return true;
        }
        return false;
    }

    public C31191fA(AnonymousClass11S r25, AnonymousClass118 r26, AnonymousClass1CJ r27, C18030ve r28, AnonymousClass10I r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34, AnonymousClass00H r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, C18140vp r46, C18140vp r47) {
        C18030ve r0 = r28;
        C18070vi.A0d(r0, 1);
        AnonymousClass1CJ r21 = r27;
        C18070vi.A0d(r21, 2);
        AnonymousClass11S r23 = r25;
        C18070vi.A0d(r23, 3);
        AnonymousClass118 r22 = r26;
        C18070vi.A0d(r22, 4);
        AnonymousClass00H r19 = r30;
        C18070vi.A0d(r19, 5);
        AnonymousClass10I r20 = r29;
        C18070vi.A0d(r20, 6);
        AnonymousClass00H r18 = r31;
        C18070vi.A0d(r18, 7);
        AnonymousClass00H r17 = r32;
        C18070vi.A0d(r17, 8);
        AnonymousClass00H r16 = r33;
        C18070vi.A0d(r16, 9);
        AnonymousClass00H r15 = r34;
        C18070vi.A0d(r15, 10);
        AnonymousClass00H r14 = r35;
        C18070vi.A0d(r14, 11);
        AnonymousClass00H r13 = r36;
        C18070vi.A0d(r13, 12);
        AnonymousClass00H r12 = r37;
        C18070vi.A0d(r12, 13);
        AnonymousClass00H r11 = r38;
        C18070vi.A0d(r11, 14);
        AnonymousClass00H r10 = r39;
        C18070vi.A0d(r10, 15);
        AnonymousClass00H r9 = r40;
        C18070vi.A0d(r9, 16);
        AnonymousClass00H r8 = r41;
        C18070vi.A0d(r8, 17);
        AnonymousClass00H r7 = r42;
        C18070vi.A0d(r7, 18);
        AnonymousClass00H r6 = r43;
        C18070vi.A0d(r6, 19);
        AnonymousClass00H r5 = r44;
        C18070vi.A0d(r5, 20);
        AnonymousClass00H r4 = r45;
        C18070vi.A0d(r4, 21);
        C18140vp r3 = r46;
        C18070vi.A0d(r3, 22);
        C18140vp r2 = r47;
        C18070vi.A0d(r2, 23);
        this.A06 = r0;
        this.A05 = r21;
        this.A04 = r23;
        this.A0N = r22;
        this.A0L = r19;
        this.A07 = r20;
        this.A0J = r18;
        this.A0C = r17;
        this.A09 = r16;
        this.A0F = r15;
        this.A0A = r14;
        this.A0P = r13;
        this.A0G = r12;
        this.A0K = r11;
        this.A0D = r10;
        this.A0I = r9;
        this.A08 = r8;
        this.A0E = r7;
        this.A0B = r6;
        this.A0H = r5;
        this.A0O = r4;
        this.A0M = r3;
        this.A0Q = r2;
        Boolean bool = C17960vV.A01;
    }
}
