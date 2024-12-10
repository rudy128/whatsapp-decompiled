package X;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class A8X {
    public static final A8X A00 = new Object();

    public static final void A02(Context context, BDM bdm, C26235CvV cvV, C22358B4m b4m, C166548d4 r9, String str) {
        String str2;
        Context context2 = context;
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) C20101A7f.A01(context);
        if (bkCdsBottomSheetFragment != null) {
            D8B d8b = bkCdsBottomSheetFragment.A03;
            C18070vi.A0z(d8b, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
            EAQ A01 = A01(context2, d8b, bdm, cvV, b4m, str);
            D8A A002 = BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment);
            Context A14 = bkCdsBottomSheetFragment.A14();
            CSC csc = (CSC) A002.A0C.peek();
            if (csc == null) {
                str2 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
            } else if (A002.A0A) {
                str2 = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
            } else {
                csc.A04.stop();
                Integer num = r9.A02;
                int i = r9.A00;
                if (Integer.valueOf(i) != null) {
                    D8A.A01(A14, A002, A01, r9.A01, num, i);
                    return;
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            C25913CoX.A01("CDSBloksBottomSheetDelegate", str2);
            return;
        }
        throw AnonymousClass000.A0n("Cannot push a new Screen without an existing bottom sheet.");
    }

    public static final void A03(Context context, DOZ doz, DFL dfl, E8A e8a) {
        C18070vi.A0d(context, 0);
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) C20101A7f.A01(context);
        if (bkCdsBottomSheetFragment != null) {
            C27081DTg dTg = null;
            if (!(dfl == null || e8a == null || doz == null)) {
                dTg = new C27081DTg(e8a, doz, dfl, 11);
            }
            D8A A002 = BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment);
            A002.A09 = dTg;
            if (A002.A06 == C0B.FULL_SCREEN) {
                A002.A0A = true;
                A002.A00 = 1;
            } else {
                BEZ bez = A002.A05;
                if (bez != null) {
                    A002.A0A = true;
                    A002.A00 = 1;
                    bez.dismiss();
                }
            }
            AnonymousClass9WU r0 = bkCdsBottomSheetFragment.A00;
            if (r0 != null) {
                AvatarEditorLauncherFSActivity.A0V(r0.A00);
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Cannot dismiss without an existing bottom sheet.");
    }

    public static final void A04(Context context, C166558d5 r3, String str) {
        C18070vi.A0d(context, 0);
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) C20101A7f.A01(context);
        if (bkCdsBottomSheetFragment == null) {
            throw AnonymousClass000.A0n("Cannot pop without an existing bottom sheet.");
        } else if (str == null) {
            BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment).A06(bkCdsBottomSheetFragment.A14(), r3, (String) null);
        } else {
            BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment).A06(bkCdsBottomSheetFragment.A14(), new C166558d5((Integer) null), str);
        }
    }

    public static final void A06(DialogFragment dialogFragment, AnonymousClass1FL r14, BDM bdm, C26235CvV cvV, C22358B4m b4m, AnonymousClass8d6 r18, String str) {
        AnonymousClass1FL r6 = r14;
        C18070vi.A0d(r14, 0);
        AnonymousClass1GP A0O = AnonymousClass3MX.A0O(r14);
        C34001jj r1 = new C34001jj(A0O);
        r1.A0H((String) null);
        DialogFragment dialogFragment2 = dialogFragment;
        try {
            dialogFragment.A0B = false;
            dialogFragment.A0C = true;
            r1.A0B(dialogFragment, (String) null);
            dialogFragment.A0E = false;
            dialogFragment.A00 = r1.A00(false);
        } catch (IllegalStateException e) {
            if (r14.isFinishing() || r14.isDestroyed() || A0O.A0F) {
                C25913CoX.A00((DOZ) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e);
            } else {
                try {
                    A0O.A0c();
                    C34001jj r0 = new C34001jj(A0O);
                    r0.A0H((String) null);
                    AnonymousClass8BV.A18(r0, dialogFragment, (String) null);
                } catch (Exception e2) {
                    C25913CoX.A00((DOZ) null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2);
                }
            }
        }
        AnonymousClass7QN r4 = new AnonymousClass7QN(dialogFragment2, r6, bdm, b4m, cvV, r18, str, 0);
        Handler A0D = C17890vO.A0D();
        A0D.post(new C146537Pm(A0D, dialogFragment, r4));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.9if] */
    public static final EAQ A01(Context context, D8B d8b, BDM bdm, C26235CvV cvV, C22358B4m b4m, String str) {
        BDM bdm2 = bdm;
        D8B d8b2 = d8b;
        AnonymousClass3Ma.A1O(d8b, 1, bdm2);
        String BVJ = bdm2.BVJ();
        Context context2 = context;
        if (BVJ.equals("screen_query")) {
            CXY cxy = d8b.A00.A01;
            C18070vi.A0X(cxy);
            return new ALV(context, (AHz) bdm2, cxy);
        } else if (!BVJ.equals("legacy_screen")) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Trying to create a CDS screen of an unknown type: ");
            throw AnonymousClass000.A0o(BVJ, A10);
        } else {
            String str2 = str;
            C18070vi.A0d(str2, 1);
            ALU alu = new ALU(new BV3(context), str2);
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(2131428943, alu);
            CXY cxy2 = d8b.A00.A01;
            C18070vi.A0X(cxy2);
            C20368AHy aHy = (C20368AHy) bdm2;
            SparseArray clone = aHy.A03.clone();
            for (int i = 0; i < sparseArray.size(); i++) {
                clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
            clone.put(2131428150, aHy.A04);
            Map map = aHy.A09;
            int i2 = aHy.A00;
            HashMap A11 = C17880vN.A11();
            A11.putAll(map);
            String valueOf = String.valueOf(i2);
            A11.put("ttrc_instance_id", valueOf);
            Map map2 = aHy.A08;
            HashMap A112 = C17880vN.A11();
            A112.putAll(map2);
            A112.put("ttrc_instance_id", valueOf);
            A4J a4j = new A4J(new ALM(context2, clone, cvV, cxy2, A11, A112), aHy, b4m);
            C20132A8s a8s = a4j.A02;
            if (a8s == null) {
                C191469me r7 = a4j.A07;
                C20368AHy aHy2 = a4j.A04;
                a8s = r7.A00(aHy2.A04, aHy2.A01, aHy2.A00);
                Map map3 = aHy2.A07;
                if (map3 != null) {
                    Iterator A15 = AnonymousClass000.A15(map3);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        A7e.A01(a8s, A16.getValue(), C17880vN.A0x(A16));
                    }
                }
                Iterator it = aHy2.A06.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("onStart");
                }
                a4j.A02 = a8s;
            }
            C20368AHy aHy3 = a4j.A04;
            String str3 = aHy3.A04;
            if (str3 == null || aHy3.A0A) {
                a8s.A0C("initial_content_step");
            } else {
                a8s.A0K("bloks_query", TimeUnit.SECONDS, 86400);
            }
            if (a4j.A00 == null && !aHy3.A0A && str3 != null) {
                HashMap hashMap = aHy3.A05;
                C22358B4m b4m2 = a4j.A05;
                ? obj = new Object();
                obj.A00 = null;
                C184099aP r8 = ((AnonymousClass9UQ) C25995CqB.A00().A04.A00()).A00;
                AnonymousClass9UP r1 = new AnonymousClass9UP(obj);
                String A1G = C108945cZ.A1G("params", hashMap);
                C19995A2i a2i = (C19995A2i) r8.A00.get();
                String str4 = ((ALJ) b4m2).A02;
                if (str4 != null) {
                    str3 = str4;
                }
                a2i.A03((ADL) null, new C21154AfP(context2, r1, r8), (Boolean) null, str3, A1G, (String) null);
                a4j.A00 = obj;
            }
            ALM alm = a4j.A03;
            alm.A0A.set(new AI0(a4j, d8b2, a8s));
            C20132A8s a8s2 = a4j.A02;
            C28111Yx.A02(a8s2);
            a8s2.A0L("cds_bottomsheet", true);
            alu.A00 = a4j;
            return alu;
        }
    }

    public static final DialogFragment A00(A8X a8x, String str, List list) {
        int i;
        int A01 = AnonymousClass3MX.A01(list);
        if (A01 < 0) {
            return null;
        }
        do {
            i = A01 - 1;
            Fragment fragment = (Fragment) list.get(A01);
            if (!(fragment instanceof BkCdsBottomSheetFragment) || !(fragment instanceof DialogFragment)) {
                List A04 = fragment.A1E().A0U.A04();
                C18070vi.A0X(A04);
                DialogFragment A002 = A00(a8x, str, A04);
                if (A002 != null) {
                    return A002;
                }
            } else {
                DialogFragment dialogFragment = (DialogFragment) fragment;
                if (((BkCdsBottomSheetFragment) dialogFragment).A2F(str)) {
                    return dialogFragment;
                }
            }
            A01 = i;
        } while (i >= 0);
        return null;
    }

    public static final void A05(Context context, E6P e6p) {
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) C20101A7f.A01(context);
        if (bkCdsBottomSheetFragment != null) {
            CSC csc = (CSC) BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment).A0C.peek();
            if (csc != null) {
                csc.A02 = e6p;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Cannot update back button override without an existing bottom sheet.");
    }
}
