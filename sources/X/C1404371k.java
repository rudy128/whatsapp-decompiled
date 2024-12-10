package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;

/* renamed from: X.71k  reason: invalid class name and case insensitive filesystem */
public final class C1404371k {
    public final AnonymousClass1KB A00;
    public final C26911Ty A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05 = C217517g.A00(16462);
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public static final void A00(A45 a45, int i) {
        C23736Boh boh;
        WaBloksBottomSheetActivity waBloksBottomSheetActivity;
        DialogFragment dialogFragment;
        if ((i == 4 || i == 5) && (boh = a45.A00) != null) {
            Activity A052 = ALS.A05(boh);
            if ((A052 instanceof WaBloksBottomSheetActivity) && (waBloksBottomSheetActivity = (WaBloksBottomSheetActivity) A052) != null) {
                AnonymousClass83S r2 = AnonymousClass83S.A00;
                C18070vi.A0d(r2, 1);
                Intent intent = waBloksBottomSheetActivity.A03;
                r2.invoke(intent);
                waBloksBottomSheetActivity.setResult(-1, intent);
                Fragment A0Q = waBloksBottomSheetActivity.getSupportFragmentManager().A0Q("bloks_bottomsheet_container");
                if ((A0Q instanceof BkBottomSheetContainerFragment) && (dialogFragment = (DialogFragment) A0Q) != null) {
                    dialogFragment.A29();
                }
            }
        }
    }

    public void A02(String str, String str2, String str3, int i) {
        String str4 = str2;
        C18070vi.A0i(str, str2);
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(str);
        if (A0l != null) {
            AnonymousClass00H r2 = this.A05;
            Object obj = ((C125586bK) r2.get()).A00.get("origination_flag");
            if (obj == null) {
                obj = null;
            }
            long A012 = C17900vP.A01((Number) obj);
            C179819Ka A002 = C179819Ka.A00(i);
            if (A002 != null) {
                Object obj2 = ((C125586bK) r2.get()).A00.get("session_id");
                if (obj2 == null) {
                    obj2 = null;
                }
                this.A02.CGF(new C21382AjB(this, A0l, A002, str4, str3, (String) obj2, A012));
            }
        }
    }

    public static final void A01(A45 a45, C1404371k r7, int i) {
        AnonymousClass72A r3 = (AnonymousClass72A) r7.A08.get();
        AnonymousClass7OL r5 = new AnonymousClass7OL(a45, r7, i);
        C18030ve r2 = r3.A01;
        C18040vf r1 = C18040vf.A02;
        if (C18020vd.A05(r1, r2, 10379) && !C18020vd.A05(r1, r2, 10388)) {
            AnonymousClass00H r12 = r3.A02;
            if (AnonymousClass3MX.A1T(C138616xO.A00(r12.get()), "key_chat_info_new_icon_shown")) {
                SharedPreferences.Editor edit = C138616xO.A00(r12.get()).edit();
                edit.putBoolean("key_chat_info_new_icon_shown", false);
                edit.apply();
            }
        }
        C138616xO r4 = (C138616xO) r3.A02.get();
        ((C131496lC) r4.A01.get()).A00(new AnonymousClass7DA(r5, r4, "biz_bot"), 20231027);
    }

    public C1404371k(AnonymousClass1KB r2, C26911Ty r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0w(r5, r2, r4, r6, r7);
        C18070vi.A0q(r8, r9, r3);
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A01 = r3;
    }
}
