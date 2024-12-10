package X;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragment;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.conversation.comments.CommentActionsBottomSheet;
import com.whatsapp.conversation.comments.ui.TextCommentLayout;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.4dp  reason: invalid class name and case insensitive filesystem */
public class C90284dp implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90284dp(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnLongClickListener(new C90284dp(obj, obj2, i));
    }

    public final boolean onLongClick(View view) {
        C106535Wf r0;
        C86764Sy r02;
        AnonymousClass206 r3;
        AnonymousClass1FU r2;
        switch (this.A00) {
            case 0:
                C106535Wf r4 = (C106535Wf) this.A02;
                List list = C42011xT.A0I;
                C84604Kd r1 = ((AnonymousClass3ZF) this.A01).A00;
                C18070vi.A0d(r4, 0);
                ArEffectsTrayFragment arEffectsTrayFragment = r1.A00;
                C18100vl r32 = arEffectsTrayFragment.A05;
                Map A12 = AnonymousClass3MW.A12(AnonymousClass3MX.A0Y(r32).A0J);
                C18100vl r12 = arEffectsTrayFragment.A04;
                AnonymousClass4S8 r03 = (AnonymousClass4S8) A12.get(r12.getValue());
                if (r03 == null || (r02 = (C86764Sy) r03.A01.getValue()) == null) {
                    r0 = null;
                } else {
                    r0 = r02.A00;
                }
                if (!C18070vi.A18(r0, r4)) {
                    return true;
                }
                BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(r32);
                AnonymousClass4DE r13 = (AnonymousClass4DE) r12.getValue();
                if (!(A0Y instanceof C75603ho)) {
                    return true;
                }
                C75603ho r22 = (C75603ho) A0Y;
                C18070vi.A0d(r13, 0);
                if (!C72463Mc.A1a(r22.A0G)) {
                    return true;
                }
                r22.A07.C5g();
                return true;
            case 1:
                AnonymousClass4RY r23 = (AnonymousClass4RY) this.A01;
                r23.A00(CallLogActivity.A0d(r23.A0B, (C178119Bw) this.A02), true, true);
                return true;
            case 2:
                C76023mL r42 = (C76023mL) this.A01;
                C93374is r33 = (C93374is) this.A02;
                List list2 = C42011xT.A0I;
                boolean A1Y = AnonymousClass000.A1Y(r42.A0A.invoke(r33.A06));
                if (!C76023mL.A01(r42, A1Y)) {
                    return true;
                }
                C76023mL.A00(r33, r42, A1Y, true);
                ((SelectionCheckView) C72463Mc.A0O(r42.A07)).A04(A1Y, true);
                return true;
            case 3:
                AnonymousClass28W r24 = (AnonymousClass28W) this.A02;
                List list3 = C42011xT.A0I;
                CallsHistoryFragment callsHistoryFragment = ((C35471mI) this.A01).A00;
                if (!callsHistoryFragment.A0u) {
                    Log.w("CallsHistoryFragmentV2/ScheduleCallItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search");
                    return false;
                }
                CallsHistoryFragment.A08(r24, callsHistoryFragment);
                return true;
            case 4:
                C77973ru r43 = (C77973ru) this.A01;
                AnonymousClass206 r34 = (AnonymousClass206) this.A02;
                View A022 = r43.A01.A02();
                C108885cS r5 = r43.A01;
                C03610Iy r8 = new C03610Iy(r5.CFa(), A022, 8388613, 0, 2132084381);
                C003301m r7 = r8.A03;
                C137526vb.A00(r7);
                int i = 1;
                if (r43.A02.A01(r34)) {
                    MenuItem add = r7.add(0, 0, 1, 2131894572);
                    add.setIcon(2131233180);
                    A3C.A01(ColorStateList.valueOf(C19740yt.A00(r5.CFa(), 2131101222)), add);
                    i = 2;
                }
                MenuItem add2 = r7.add(0, 1, i, 2131894570);
                add2.setIcon(2131233203);
                A3C.A01(ColorStateList.valueOf(C19740yt.A00(r5.CFa(), 2131101222)), add2);
                r8.A01 = new C91164fF((Object) r34, (Object) r43, 2);
                r8.A00();
                return true;
            case 5:
                r3 = (AnonymousClass206) this.A02;
                C18070vi.A0d(r3, 1);
                r2 = ((AnonymousClass3QB) this.A01).getActivity();
                break;
            case 6:
                r3 = (AnonymousClass206) this.A02;
                C18070vi.A0d(r3, 1);
                r2 = ((AnonymousClass3QC) this.A01).getActivity();
                break;
            case 7:
                AnonymousClass206 r14 = (AnonymousClass206) this.A02;
                C18070vi.A0d(r14, 1);
                AnonymousClass1FU activity = ((TextCommentLayout) this.A01).getActivity();
                Bundle A0D = C17880vN.A0D();
                AnonymousClass4aU.A0A(A0D, r14.A0v);
                CommentActionsBottomSheet commentActionsBottomSheet = new CommentActionsBottomSheet();
                commentActionsBottomSheet.A1R(A0D);
                activity.CMk(commentActionsBottomSheet, (String) null);
                return true;
            case 8:
                AnonymousClass4XZ r15 = (AnonymousClass4XZ) this.A01;
                AnonymousClass206 r52 = (AnonymousClass206) this.A02;
                C79073uJ r44 = r15.A0D;
                C108875cR r35 = r44.A0k;
                if (r35 == null) {
                    return true;
                }
                r35.COH(r15.A07);
                AnonymousClass4XZ.A00(r15);
                r15.A02.setSelected(r35.Bfa(r52));
                r44.A2T(r52, 1);
                return true;
            case 9:
                C79163ul r04 = (C79163ul) this.A01;
                C79163ul.A00(r04.A02, (AnonymousClass210) this.A02, r04.getSelectionView());
                return true;
            default:
                AnonymousClass4aY r16 = (AnonymousClass4aY) this.A01;
                if (((AnonymousClass4VJ) this.A02).A07) {
                    AnonymousClass4aY.A1K(r16, 1);
                    AnonymousClass4aY.A0u(r16);
                    r16.A42.A0A((AnonymousClass206) null, true);
                    return true;
                }
                AnonymousClass4aY.A16(r16);
                return true;
        }
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass4aU.A0A(A0D2, r3.A0v);
        CommentActionsBottomSheet commentActionsBottomSheet2 = new CommentActionsBottomSheet();
        commentActionsBottomSheet2.A1R(A0D2);
        r2.CMl(commentActionsBottomSheet2);
        return true;
    }
}
