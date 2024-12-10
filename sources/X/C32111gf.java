package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.community.CommunityExitDialogFragment;
import com.whatsapp.community.JoinGroupBottomSheetFragment;
import com.whatsapp.community.suspend.CommunityIntegrityDeactivatedDialogFragment;
import com.whatsapp.community.suspend.CommunityIntegritySuspendBottomSheet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: X.1gf  reason: invalid class name and case insensitive filesystem */
public final class C32111gf implements C203411t {
    public final C19880zA A00;
    public final AnonymousClass1L9 A01;
    public final AnonymousClass1KB A02;
    public final C32101gd A03;
    public final AnonymousClass11E A04;
    public final C24921Me A05;
    public final AnonymousClass11C A06;
    public final AnonymousClass1MZ A07;
    public final C18010vc A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass1M9 A0D;
    public final C18000vb A0E;
    public final AnonymousClass1CJ A0F;
    public final C18030ve A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I = C217517g.A00(16445);
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;

    public C32111gf(C19880zA r22, AnonymousClass1L9 r23, AnonymousClass1KB r24, C32101gd r25, AnonymousClass11E r26, AnonymousClass1M9 r27, C24921Me r28, AnonymousClass11C r29, C18000vb r30, AnonymousClass1CJ r31, AnonymousClass1MZ r32, C18030ve r33, C18010vc r34, AnonymousClass10I r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41) {
        C18030ve r9 = r33;
        C18070vi.A0d(r9, 1);
        AnonymousClass1KB r18 = r24;
        C18070vi.A0d(r18, 2);
        AnonymousClass00H r0 = r36;
        C18070vi.A0d(r0, 3);
        AnonymousClass10I r7 = r35;
        C18070vi.A0d(r7, 4);
        AnonymousClass1CJ r15 = r31;
        C18070vi.A0d(r15, 5);
        AnonymousClass1L9 r19 = r23;
        C18070vi.A0d(r19, 6);
        C19880zA r20 = r22;
        C18070vi.A0d(r20, 7);
        AnonymousClass11C r12 = r29;
        C18070vi.A0d(r12, 8);
        AnonymousClass1M9 r16 = r27;
        C18070vi.A0d(r16, 9);
        C24921Me r13 = r28;
        C18070vi.A0d(r13, 10);
        C18000vb r11 = r30;
        C18070vi.A0d(r11, 11);
        AnonymousClass00H r6 = r37;
        C18070vi.A0d(r6, 12);
        AnonymousClass00H r5 = r38;
        C18070vi.A0d(r5, 13);
        AnonymousClass00H r4 = r39;
        C18070vi.A0d(r4, 14);
        AnonymousClass00H r3 = r40;
        C18070vi.A0d(r3, 15);
        C32101gd r17 = r25;
        C18070vi.A0d(r17, 16);
        AnonymousClass00H r2 = r41;
        C18070vi.A0d(r2, 17);
        AnonymousClass1MZ r10 = r32;
        C18070vi.A0d(r10, 18);
        C18010vc r8 = r34;
        C18070vi.A0d(r8, 19);
        AnonymousClass11E r14 = r26;
        C18070vi.A0d(r14, 20);
        this.A0G = r9;
        this.A02 = r18;
        this.A0C = r0;
        this.A09 = r7;
        this.A0F = r15;
        this.A01 = r19;
        this.A00 = r20;
        this.A06 = r12;
        this.A0D = r16;
        this.A05 = r13;
        this.A0E = r11;
        this.A0H = r6;
        this.A0J = r5;
        this.A0K = r4;
        this.A0A = r3;
        this.A03 = r17;
        this.A0B = r2;
        this.A07 = r10;
        this.A08 = r8;
        this.A04 = r14;
    }

    public void A03(View view, AnonymousClass1F9 r10, String str) {
        C23520Bik A002 = C23520Bik.A00((Context) null, view, str, 0);
        A002.A0E(C19740yt.A00(view.getContext(), AnonymousClass1YL.A00(view.getContext(), 2130971311, 2131102579)));
        List emptyList = Collections.emptyList();
        C18070vi.A0X(emptyList);
        new C90594eK(r10, A002, this.A06, emptyList, false).A03();
    }

    public void BBX(AnonymousClass01E r9, AnonymousClass1EC r10, Integer num) {
        Intent A0l;
        C18070vi.A0d(r9, 0);
        C18070vi.A0d(r10, 1);
        Resources resources = r9.getResources();
        C18070vi.A0X(resources);
        AnonymousClass00H r1 = this.A0A;
        int size = ((C34511kb) r1.get()).A08.A03(r10).size();
        int A002 = C18020vd.A00(C18040vf.A02, ((C34511kb) r1.get()).A07, 1238) + 1;
        if (size >= A002) {
            this.A02.A0L(resources.getQuantityString(2131755202, A002, new Object[]{Integer.valueOf(A002)}), 1);
            return;
        }
        AnonymousClass00H r0 = this.A0C;
        if (num != null) {
            r0.get();
            A0l = AnonymousClass1LU.A0l(r9, r10).putExtra("group_create_entry_point", num.intValue());
        } else {
            r0.get();
            A0l = AnonymousClass1LU.A0l(r9, r10);
        }
        C18070vi.A0b(A0l);
        r9.startActivity(A0l, (Bundle) null);
    }

    public WaDialogFragment BP0(AnonymousClass1EC r3) {
        return CommunityExitDialogFragment.A00(r3, ((C34511kb) this.A0A.get()).A08(r3), false);
    }

    public WDSBottomSheetDialogFragment BP2(AnonymousClass1EC r5) {
        C18070vi.A0d(r5, 0);
        CommunityIntegritySuspendBottomSheet communityIntegritySuspendBottomSheet = new CommunityIntegritySuspendBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putString("parent_group_jid", r5.getRawString());
        communityIntegritySuspendBottomSheet.A1R(bundle);
        return communityIntegritySuspendBottomSheet;
    }

    public void BhK(Context context, String str) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(str, 1);
        if (this.A00.A07()) {
            this.A0A.get();
        }
        AnonymousClass1L9 r2 = this.A01;
        this.A0C.get();
        Intent A022 = AnonymousClass1LU.A02(context);
        A022.putExtra("snackbar_message", str);
        A022.setFlags(67108864);
        r2.A08(context, A022);
    }

    public void CAm(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(groupJid, 1);
        C18070vi.A0d(view, 2);
        AnonymousClass1FL r3 = (AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        A02(view, r3.A03.A00.A03, r3, this, groupJid, new C21434Ak1(this, view, groupJid, 47));
    }

    public void CAn(View view, Fragment fragment, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        AnonymousClass1GP A1E = fragment.A1E();
        View view2 = view;
        A02(view2, A1E, fragment, this, groupJid, new C21434Ak1(this, view, groupJid, 49));
    }

    public void CAo(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(groupJid, 1);
        C18070vi.A0d(view, 2);
        AnonymousClass1FL r3 = (AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        A02(view, r3.A03.A00.A03, r3, this, groupJid, new C21434Ak1(this, view, groupJid, 45));
    }

    public void CAp(Context context, View view, AnonymousClass1EC r10) {
        C18070vi.A0d(context, 0);
        View view2 = view;
        C18070vi.A0d(view, 2);
        if (r10 != null) {
            AnonymousClass1FL r3 = (AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
            AnonymousClass1EC A052 = ((C34511kb) this.A0A.get()).A05(r10);
            if (A052 != null) {
                A02(view2, r3.A03.A00.A03, r3, this, A052, new C21434Ak1(this, view, A052, 44));
            }
        }
    }

    public boolean CAq(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(view, 2);
        int A002 = A00(groupJid);
        if (A002 == 0 || A002 == 1 || A002 == 2) {
            return false;
        }
        Context context2 = view.getContext();
        C18070vi.A0X(context2);
        this.A0C.get();
        this.A01.A08(context2, AnonymousClass1LU.A0n(context2, groupJid, 1));
        return true;
    }

    public void CAr(Context context, View view, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        C18070vi.A0d(view, 2);
        AnonymousClass1FL r3 = (AnonymousClass1FL) AnonymousClass1L9.A01(context, AnonymousClass01E.class);
        A02(view, r3.A03.A00.A03, r3, this, groupJid, new C21434Ak1(this, view, groupJid, 46));
    }

    public void CAs(View view, Fragment fragment, GroupJid groupJid) {
        C18070vi.A0d(groupJid, 1);
        AnonymousClass1GP A1E = fragment.A1E();
        View view2 = view;
        A02(view2, A1E, fragment, this, groupJid, new C21434Ak1(this, view, groupJid, 48));
    }

    public void CAt(Context context, AnonymousClass1BI r6, int i) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(r6, 1);
        this.A0C.get();
        Intent putExtra = AnonymousClass1LU.A0C(context, 0).putExtra("jid", r6.getRawString()).putExtra("start_t", SystemClock.uptimeMillis());
        C18070vi.A0X(putExtra);
        if (i == 5) {
            putExtra.setFlags(67108864);
        }
        ((AnonymousClass4RV) this.A0H.get()).A00(putExtra, "CommunityHomeActivity:onClickConversation", ((C25431Oe) this.A0J.get()).A03());
        if (context instanceof C23181Fa) {
            ((C23181Fa) context).BhJ(putExtra);
        } else {
            context.startActivity(putExtra);
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r6);
        if (A002 != null) {
            this.A09.CGF(new C21470Akb((Object) this, i, 28, (Object) A002));
        }
    }

    public void CAv(AnonymousClass1BI r7, AnonymousClass3KU r8, int i) {
        int i2;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r7);
        if (A002 != null) {
            AnonymousClass00H r5 = this.A0A;
            AnonymousClass1EC A052 = ((C34511kb) r5.get()).A05(A002);
            if (A052 == null) {
                this.A02.A06(2131896579, 0);
                return;
            }
            this.A09.CGF(new C21470Akb((Object) this, i, 29, (Object) A002));
            if (((C34511kb) r5.get()).A0S(A002, A052)) {
                i2 = 3;
            } else {
                i2 = 2;
                if (((C34511kb) r5.get()).A0T(A002, A052)) {
                    i2 = 6;
                }
            }
            this.A0B.get();
            Integer A003 = C40371ub.A00(i);
            if (A003 != null) {
                JoinGroupBottomSheetFragment A004 = JoinGroupBottomSheetFragment.A00(A052, A002, A003.intValue(), i2);
                AnonymousClass3AT r82 = (AnonymousClass3AT) r8;
                int i3 = r82.A00;
                AnonymousClass1FU r1 = (AnonymousClass1FU) r82.A01;
                if (i3 != 0) {
                    r1.CMm(A004, (String) null);
                } else {
                    r1.CMk(A004, (String) null);
                }
            }
        }
    }

    public void CLY(Context context, AnonymousClass1EC r4) {
        C18070vi.A0d(r4, 1);
        this.A0C.get();
        this.A01.A08(context, AnonymousClass1LU.A19(context, r4));
    }

    public void CMf(Context context, DialogInterface.OnClickListener onClickListener, AnonymousClass1EC r13, int i) {
        String string;
        C18070vi.A0d(r13, 2);
        String A0F2 = this.A0F.A0F(r13);
        if (A0F2 == null || A0F2.length() <= 0) {
            string = context.getResources().getString(2131886733);
        } else {
            string = context.getResources().getString(2131886725, new Object[]{A0F2});
        }
        C18070vi.A0b(string);
        C73193Ri r5 = new C73193Ri(context, 2132084403);
        r5.A0e(context.getResources().getQuantityString(2131755021, i, new Object[]{this.A0E.A0L().format(Integer.valueOf(i))}));
        r5.A0d(string);
        r5.A0W((DialogInterface.OnClickListener) null, 2131898766);
        r5.A0X(onClickListener, 2131887447);
        r5.create().show();
    }

    public void CNK(AnonymousClass1GP r5, AnonymousClass1EC r6, Callable callable) {
        C18070vi.A0d(r5, 1);
        AnonymousClass2FS r1 = new AnonymousClass2FS();
        r1.A02 = r6.user;
        r1.A01 = 1;
        r1.A00 = 1;
        ((C40371ub) this.A0B.get()).A03.CC7(r1);
        try {
            C34001jj r2 = new C34001jj(r5);
            r2.A0B((Fragment) callable.call(), "SUBGROUP_PICKER_TAG");
            r2.A00(true);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommunityNavigator/showSwitchSubGroupBottomSheet ");
            sb.append(e);
            Log.e(sb.toString());
        }
    }

    public void CNu(Context context, int i, int i2) {
        C18070vi.A0d(context, 0);
        CNv(context, (AnonymousClass1EC) null, i, i2);
    }

    public void COG(Context context, AnonymousClass1EC r6) {
        C18070vi.A0d(r6, 1);
        this.A0C.get();
        String A0F2 = this.A0F.A0F(r6);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.SelectCommunityForGroupActivity");
        intent.putExtra("group_jid", r6.getRawString());
        if (A0F2 != null) {
            intent.putExtra("group_name", A0F2);
        }
        AnonymousClass1L9.A00(context).startActivity(intent);
    }

    private final int A00(GroupJid groupJid) {
        if (this.A0F.A0T(groupJid)) {
            return 1;
        }
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(groupJid);
        if (A002 == null) {
            return 0;
        }
        if (((C42211xo) this.A0K.get()).A00(this.A0D.A0H(A002))) {
            return 4;
        }
        if (((C34511kb) this.A0A.get()).A08(A002).size() > 0) {
            return 3;
        }
        return 2;
    }

    public static final void A01(Context context, C32111gf r3, GroupJid groupJid, String str) {
        r3.A0C.get();
        Intent A0k = AnonymousClass1LU.A0k(context, groupJid);
        if (!(str == null || str.length() == 0)) {
            A0k.putExtra("snackbar_message", str);
        }
        r3.A01.A08(context, A0k);
    }

    public CommunityIntegrityDeactivatedDialogFragment BP1() {
        return new CommunityIntegrityDeactivatedDialogFragment();
    }

    public void CNv(Context context, AnonymousClass1EC r10, int i, int i2) {
        AnonymousClass17C r1 = (AnonymousClass17C) this.A0I.get();
        Integer valueOf = Integer.valueOf(i2);
        r1.A01 = null;
        r1.A00 = null;
        r1.A00 = valueOf;
        String obj = UUID.randomUUID().toString();
        r1.A01 = obj;
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = this.A0B.get();
        C18070vi.A0X(obj2);
        ((C40371ub) obj2).A0D(valueOf, (Long) null, obj, (String) null, 1, i);
        this.A0C.get();
        Integer valueOf2 = Integer.valueOf(i);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.community.NewCommunityActivity");
        if (r10 != null) {
            intent.putExtra("NewCommunityActivity_group_to_be_added", r10.getRawString());
        }
        if (valueOf2 != null) {
            intent.putExtra("NewCommunityActivity_current_screen", valueOf2);
        }
        AnonymousClass1L9.A00(context).startActivity(intent);
    }

    public static final void A02(View view, AnonymousClass1GP r6, AnonymousClass1F9 r7, C32111gf r8, GroupJid groupJid, Runnable runnable) {
        String string;
        int A002 = r8.A00(groupJid);
        if (A002 == 0) {
            return;
        }
        if (A002 == 1) {
            String string2 = view.getContext().getString(2131888541);
            C18070vi.A0X(string2);
            r8.A03(view, r7, string2);
        } else if (A002 == 2) {
            Context context = view.getContext();
            if (r6 != null) {
                C18070vi.A0b(context);
                String A0Y = r8.A05.A0Y(groupJid);
                if (A0Y != null) {
                    string = context.getString(2131897873, new Object[]{A0Y});
                } else {
                    string = context.getString(2131897874);
                }
                C18070vi.A0b(string);
                CharSequence A0C2 = C26302CxJ.A0C(r8.A06, r8.A08, string);
                if (A0C2 != null) {
                    LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("message", A0C2);
                    legacyMessageDialogFragment.A1R(bundle);
                    legacyMessageDialogFragment.A2C(r6, (String) null);
                }
            } else {
                String string3 = context.getString(2131897874);
                C18070vi.A0X(string3);
                r8.A03(view, r7, string3);
            }
            if (C18020vd.A05(C18040vf.A02, r8.A0G, 6774)) {
                Log.e("CommunityNavigator/checkIfStillParticipatingInCommunity/Not participating");
                r8.A09.CGF(new C98804rk(r8, groupJid, 9));
            }
        } else if (A002 != 3) {
            Context context2 = view.getContext();
            C18070vi.A0X(context2);
            A01(context2, r8, groupJid, (String) null);
        } else {
            runnable.run();
        }
    }
}
