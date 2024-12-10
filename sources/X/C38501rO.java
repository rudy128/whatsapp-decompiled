package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.labelitem.view.bottomsheet.AddToListFragment;
import com.whatsapp.lists.ListsManagerBottomSheetFragment;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1rO  reason: invalid class name and case insensitive filesystem */
public final class C38501rO {
    public final AnonymousClass1L9 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1KW A02;
    public final C18030ve A03;
    public final AnonymousClass1LU A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final C18100vl A08 = new C18110vm(new C38511rP(this));
    public final AnonymousClass1OX A09;
    public final C19880zA A0A;
    public final C19880zA A0B;
    public final C19880zA A0C;
    public final C19880zA A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    public C38501rO(C19880zA r17, C19880zA r18, C19880zA r19, C19880zA r20, AnonymousClass1L9 r21, AnonymousClass11S r22, AnonymousClass1KW r23, C18030ve r24, AnonymousClass1LU r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass1OX r31) {
        AnonymousClass00H r6 = r26;
        C18070vi.A0d(r6, 1);
        C18030ve r8 = r24;
        C18070vi.A0d(r8, 2);
        AnonymousClass11S r10 = r22;
        C18070vi.A0d(r10, 3);
        AnonymousClass1LU r7 = r25;
        C18070vi.A0d(r7, 4);
        AnonymousClass1L9 r11 = r21;
        C18070vi.A0d(r11, 5);
        AnonymousClass00H r5 = r27;
        C18070vi.A0d(r5, 6);
        AnonymousClass00H r4 = r28;
        C18070vi.A0d(r4, 7);
        C19880zA r15 = r17;
        C18070vi.A0d(r15, 8);
        AnonymousClass00H r3 = r29;
        C18070vi.A0d(r3, 9);
        C19880zA r14 = r18;
        C18070vi.A0d(r14, 10);
        AnonymousClass00H r1 = r30;
        C18070vi.A0d(r1, 11);
        AnonymousClass1OX r0 = r31;
        C18070vi.A0d(r0, 12);
        C19880zA r13 = r19;
        C18070vi.A0d(r13, 13);
        C19880zA r12 = r20;
        C18070vi.A0d(r12, 14);
        AnonymousClass1KW r9 = r23;
        C18070vi.A0d(r9, 15);
        this.A0F = r6;
        this.A03 = r8;
        this.A01 = r10;
        this.A04 = r7;
        this.A00 = r11;
        this.A07 = r5;
        this.A06 = r4;
        this.A0D = r15;
        this.A05 = r3;
        this.A0B = r14;
        this.A0E = r1;
        this.A09 = r0;
        this.A0A = r13;
        this.A0C = r12;
        this.A02 = r9;
    }

    public C73193Ri A01(Context context, String str, C18090vk r8, boolean z) {
        C18070vi.A0d(str, 2);
        String string = context.getString(2131889319, new Object[]{str});
        C18070vi.A0X(string);
        CharSequence A052 = C43251zV.A05(context, this.A02, string);
        C73193Ri r3 = new C73193Ri(context, 2132084403);
        r3.A0e(A052);
        r3.A0X(new AnonymousClass4bB(r8, 24), 2131889316);
        r3.A0W(new C1411874q(28), 2131889315);
        int i = 2131889318;
        if (z) {
            i = 2131889317;
        }
        r3.A0U(i);
        r3.A0f(true);
        return r3;
    }

    public final void A03(Fragment fragment, C83274Em r4, C22821Di r5) {
        int i;
        C18070vi.A0d(fragment, 0);
        if (r4 instanceof AnonymousClass42Y) {
            r5.invoke(r4);
            return;
        }
        if (r4 instanceof AnonymousClass42Z) {
            i = 2131891710;
        } else {
            i = 2131891731;
            if (r4 instanceof C820742a) {
                i = 2131891717;
            }
        }
        A00(fragment, this, i);
    }

    public void A05(AnonymousClass1GP r2, AnonymousClass1BI r3, Integer num, AnonymousClass1OS r5) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 1);
        List singletonList = Collections.singletonList(r3);
        C18070vi.A0X(singletonList);
        A06(r2, num, singletonList, r5);
    }

    public void A06(AnonymousClass1GP r5, Integer num, Collection collection, AnonymousClass1OS r8) {
        C18070vi.A0d(r5, 0);
        AddToListFragment addToListFragment = new AddToListFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("key_chat_jids", C22971Dz.A0B(collection));
        bundle.putInt("arg_entry_point", num.intValue());
        addToListFragment.A1R(bundle);
        addToListFragment.A0E = r8;
        addToListFragment.A2C(r5, "add_to_list");
    }

    public static final void A00(Fragment fragment, C38501rO r6, int i) {
        View view = fragment.A0B;
        if (view != null) {
            C23520Bik A002 = C23520Bik.A00((Context) null, view, fragment.A1H(i), -1);
            List emptyList = Collections.emptyList();
            C18070vi.A0X(emptyList);
            Object obj = r6.A07.get();
            C18070vi.A0X(obj);
            new C90594eK(fragment.A1G(), A002, (AnonymousClass11C) obj, emptyList, false).A03();
        }
    }

    public void A02(Context context, C41761x1 r6, Integer num) {
        AnonymousClass1L9 r3 = this.A00;
        Intent intent = new Intent();
        intent.putExtra("LABELINFO", r6);
        intent.setClassName(context.getPackageName(), "com.whatsapp.lists.ListsConversationManagementActivity");
        if (num != null) {
            intent.putExtra("EXTRA_ENTRY_POINT", num.intValue());
        }
        r3.A08(context, intent);
    }

    public void A04(Fragment fragment, Integer num) {
        AnonymousClass1GP r1;
        ListsManagerBottomSheetFragment listsManagerBottomSheetFragment = new ListsManagerBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("labelInfo", (Parcelable) null);
        if (num != null) {
            bundle.putInt("arg_entry_point", num.intValue());
        }
        listsManagerBottomSheetFragment.A1R(bundle);
        AnonymousClass1FL A1B = fragment.A1B();
        if (!(A1B == null || (r1 = A1B.A03.A00.A03) == null)) {
            listsManagerBottomSheetFragment.A2C(r1, "ListsManagerBottomSheetFragment");
        }
        listsManagerBottomSheetFragment.A1F().A0t(new C91374fa(new AnonymousClass3J5(fragment, this), 0), listsManagerBottomSheetFragment, "create_new_list_result");
    }

    public boolean A07() {
        if (((C28391a8) this.A05.get()).A02()) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 10313) || !((Boolean) this.A08.getValue()).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A08() {
        if (A07()) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 11972)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
