package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.wabloks.ui.screenquery.Hilt_WaBloksScreenQueryBottomSheetHostFragment;
import com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryBottomSheetFragment;
import com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryBottomSheetHostFragment;
import com.whatsapp.wabloks.ui.screenquery.WaBloksScreenQueryFragment;
import com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity;
import java.util.List;

/* renamed from: X.9v1  reason: invalid class name and case insensitive filesystem */
public abstract class C196419v1 {
    public static C22403B6g A00(DFL dfl, int i) {
        if (i == 16542) {
            return C26211Cup.A03((DOZ) null, (C23736Boh) null, dfl);
        }
        if (i == 17043) {
            return new AI2(AnonymousClass6Y5.A00(dfl.A09(35), true));
        }
        if (i == 17044) {
            return new AI3(AnonymousClass6Y5.A00(dfl.A09(35), false));
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, i, 0);
        throw AnonymousClass000.A0k(String.format("No implementation bound to key: %s", A1a));
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.B4m, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.B4m, java.lang.Object] */
    public static void A01(Context context, AHz aHz, CLX clx, int i, boolean z) {
        AnonymousClass1FL r6;
        boolean z2;
        Integer num;
        String str;
        Context A00;
        WaBloksScreenQueryFragment waBloksScreenQueryFragment;
        Context context2 = context;
        AHz aHz2 = aHz;
        if (i == 16542) {
            Activity A002 = C20101A7f.A00(context);
            if (!(A002 instanceof AnonymousClass01E) || (r6 = (AnonymousClass1FL) A002) == null) {
                throw AnonymousClass000.A0n("Unable to launch CDS bottom sheet fragment without FragmentActivity");
            }
            CXY cxy = (CXY) clx.A00.get(2131428248);
            if (cxy == null) {
                Log.e("WaCdsScreenQueryNavigator", "Couldn't find bloks host");
                return;
            }
            C22403B6g b6g = aHz.A01;
            C18070vi.A0z(b6g, "null cannot be cast to non-null type com.meta.foa.cds.CdsOpenScreenConfig");
            D8F d8f = (D8F) b6g;
            BkCdsBottomSheetFragment A01 = BkCdsBottomSheetFragment.A01(d8f, aHz.A05);
            A01.A01 = cxy;
            int i2 = 32;
            if (z) {
                Boolean bool = aHz.A03;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = true;
                }
                boolean z3 = !z2;
                String str2 = aHz.A06;
                if (z3) {
                    num = AnonymousClass00R.A0C;
                } else {
                    num = d8f.A01;
                    if (num == null) {
                        num = AnonymousClass00R.A00;
                    }
                }
                Integer num2 = d8f.A0G;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                AHz aHz3 = aHz2;
                A8X.A02(context2, aHz3, aHz.A02, new Object(), new C166548d4((E6P) null, num, i2), str2);
                return;
            }
            String str3 = aHz.A06;
            C18070vi.A0z(b6g, "null cannot be cast to non-null type com.meta.foa.cds.CdsOpenScreenConfig");
            Integer num3 = d8f.A0G;
            if (num3 != null) {
                i2 = num3.intValue();
            }
            A8X.A06(A01, r6, aHz2, (C26235CvV) null, new Object(), new AnonymousClass8d6((E6P) null, i2), str3);
        } else if (i == 17043) {
            AnonymousClass1FL r3 = (AnonymousClass1FL) C24549C8u.A00(context, AnonymousClass1FL.class);
            if (r3 != null) {
                Bundle A0D = C17880vN.A0D();
                A0D.putString("__nav_data_type", "screen_query");
                A0D.putBundle("key_screen_container_props_bundle", AHz.A00(aHz, false));
                if (z) {
                    WaBloksScreenQueryBottomSheetHostFragment A003 = C181819Ry.A00(r3);
                    if (A003 == null) {
                        C25913CoX.A01("WaBloksBottomSheetContainerNavigator", "Attempting to push a bottomsheet in non bloks bottomsheet host fragment");
                        return;
                    }
                    C34001jj A0Y = C72453Mb.A0Y(A003);
                    Fragment fragment = new Fragment();
                    fragment.A1R(A0D);
                    WaBloksScreenQueryBottomSheetFragment A2K = A003.A2K();
                    String str4 = null;
                    if (A2K != null) {
                        AHz aHz4 = A2K.A01;
                        if (aHz4 == null) {
                            C18070vi.A11("screenProps");
                            throw null;
                        }
                        str = aHz4.A06;
                    } else {
                        str = null;
                    }
                    A0Y.A0D(fragment, str, 2131428238);
                    WaBloksScreenQueryBottomSheetFragment A2K2 = A003.A2K();
                    if (A2K2 != null) {
                        AHz aHz5 = A2K2.A01;
                        if (aHz5 == null) {
                            C18070vi.A11("screenProps");
                            throw null;
                        }
                        str4 = aHz5.A06;
                    }
                    AnonymousClass8BU.A19(A0Y, str4);
                    return;
                }
                Hilt_WaBloksScreenQueryBottomSheetHostFragment hilt_WaBloksScreenQueryBottomSheetHostFragment = new Hilt_WaBloksScreenQueryBottomSheetHostFragment();
                if (A0D.getBundle("BloksSurfaceProps") == null) {
                    C25913CoX.A02("WaBloksScreenQueryFragment", AnonymousClass000.A0n("BloksSurfaceProps is missing from newInstance."));
                }
                hilt_WaBloksScreenQueryBottomSheetHostFragment.A1R(A0D);
                hilt_WaBloksScreenQueryBottomSheetHostFragment.A2C(r3.getSupportFragmentManager(), "tag");
            }
        } else if (i == 17044) {
            Intent A0A = C17880vN.A0A();
            A0A.putExtra("__nav_data_type", "screen_query");
            A0A.putExtra("key_screen_container_props_bundle", AHz.A00(aHz, false));
            Class<WaSqBloksActivity> cls = WaSqBloksActivity.class;
            A0A.setClass(context, cls);
            if (!z || (A00 = C24549C8u.A00(context, Activity.class)) == null || !(A00 instanceof WaSqBloksActivity)) {
                A5E.A00().A02().A05(context, A0A);
                return;
            }
            Bundle extras = A0A.getExtras();
            if (extras != null) {
                AnonymousClass1FL r2 = (AnonymousClass1FL) C24549C8u.A00(context, cls);
                if (r2 != null) {
                    C34001jj A0H = AnonymousClass3Ma.A0H(r2);
                    A0H.A09(C181829Rz.A00(extras), 2131428247);
                    List A04 = r2.getSupportFragmentManager().A0U.A04();
                    C18070vi.A0X(A04);
                    Fragment fragment2 = (Fragment) C29431cG.A0e(A04);
                    String str5 = null;
                    if ((fragment2 instanceof WaBloksScreenQueryFragment) && (waBloksScreenQueryFragment = (WaBloksScreenQueryFragment) fragment2) != null) {
                        str5 = waBloksScreenQueryFragment.A02;
                    }
                    AnonymousClass8BU.A19(A0H, str5);
                    return;
                }
                throw AnonymousClass000.A0n("Context should be derived from a AmaBloksActivity");
            }
            throw AnonymousClass000.A0n("Intent must have extras");
        } else {
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, i, 0);
            throw AnonymousClass000.A0k(String.format("No implementation bound to key: %s", A1a));
        }
    }
}
