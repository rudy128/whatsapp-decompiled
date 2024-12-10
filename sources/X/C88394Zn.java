package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.4Zn  reason: invalid class name and case insensitive filesystem */
public abstract class C88394Zn {
    public static final View A00(Activity activity, ViewGroup viewGroup, C133326oZ r17, AnonymousClass1L9 r18, C18090vk r19) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup2, 1);
        C133326oZ r7 = r17;
        AnonymousClass1L9 r9 = r18;
        AnonymousClass3Ma.A1O(r7, 2, r9);
        View A01 = C88554a7.A01(activity.getLayoutInflater(), new AnonymousClass78E(r7, activity, r9, r19, 4), viewGroup2, 2131232338, AnonymousClass1YL.A00(viewGroup2.getContext(), 2130970097, AnonymousClass1YL.A00(viewGroup2.getContext(), 2130971957, 2131103410)), 2131889489);
        AnonymousClass4aX.A0D(AnonymousClass3Ma.A0C(A01, 2131429479), AnonymousClass3MZ.A02(viewGroup2.getContext(), viewGroup2.getContext(), 2130970097, AnonymousClass1YL.A00(viewGroup2.getContext(), 2130971957, 2131103410)));
        return A01;
    }

    public static final View A01(Activity activity, ViewGroup viewGroup, AnonymousClass1KB r12, AnonymousClass11E r13, AnonymousClass00H r14, int i) {
        C18070vi.A0d(viewGroup, 1);
        C18070vi.A0d(r12, 2);
        AnonymousClass11E r3 = r13;
        C18070vi.A0d(r13, 3);
        AnonymousClass00H r4 = r14;
        C18070vi.A0d(r14, 4);
        Activity activity2 = activity;
        return C88554a7.A01(activity.getLayoutInflater(), new C89784d1(r3, r4, activity2, r12, i, 0), viewGroup, 2131233226, AnonymousClass1YL.A00(viewGroup.getContext(), 2130970097, C72473Md.A06(viewGroup)), 2131892453);
    }

    public static final View A02(Activity activity, ViewGroup viewGroup, AnonymousClass1KB r15, C30191dX r16, C37311pJ r17, C219217x r18, C19830z4 r19, C18030ve r20, C37721q1 r21, C18090vk r22, int i, int i2, int i3, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        C18070vi.A0d(viewGroup, 1);
        C18030ve r10 = r20;
        C18070vi.A0d(r10, 4);
        AnonymousClass1KB r5 = r15;
        C18070vi.A0d(r15, 5);
        C37721q1 r11 = r21;
        C18070vi.A0d(r11, 6);
        C37311pJ r7 = r17;
        C18070vi.A0d(r7, 8);
        C219217x r8 = r18;
        C18070vi.A0d(r8, 10);
        C30191dX r6 = r16;
        C18070vi.A0d(r6, 11);
        C19830z4 r9 = r19;
        C18070vi.A0d(r9, 12);
        int i4 = 2131892002;
        if (z) {
            i4 = 2131888795;
        }
        return C88554a7.A01(activity.getLayoutInflater(), new C89864d9(activity, r5, r6, r7, r8, r9, r10, r11, r22, i, i2, i3), viewGroup2, 2131232179, AnonymousClass1YL.A00(viewGroup.getContext(), 2130970097, C72473Md.A06(viewGroup)), i4);
    }

    public static final void A03(Context context, View view, C19880zA r6, C18000vb r7, C18090vk r8) {
        C18070vi.A0k(r7, r6);
        C27641Ww.A05(view.findViewById(2131428625), r7, 0, context.getResources().getDimensionPixelOffset(2131166077));
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131429473);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131166094);
        C27641Ww.A05(A0H, r7, 0, dimensionPixelOffset);
        C27641Ww.A03(A0H, 0, dimensionPixelOffset);
        A0H.setVisibility(0);
        A0H.setImageResource(2131232231);
        C90084dV.A00(A0H, context, r6, r8, 41);
        AnonymousClass3MY.A0w(context, A0H, 2131894866);
        C28081Yu.A00(ColorStateList.valueOf(AnonymousClass3Ma.A00(context, 2130971976, 2131103149)), A0H);
    }
}
