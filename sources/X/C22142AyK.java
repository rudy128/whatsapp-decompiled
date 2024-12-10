package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.animation.TranslateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectorySERPMapViewActivity;

/* renamed from: X.AyK  reason: case insensitive filesystem */
public final class C22142AyK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BusinessDirectorySERPMapViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22142AyK(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        super(1);
        this.this$0 = businessDirectorySERPMapViewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity = this.this$0;
        int A03 = AnonymousClass3MY.A03((Number) obj);
        if (A03 == 0) {
            AnonymousClass00H r0 = businessDirectorySERPMapViewActivity.A09;
            if (r0 != null) {
                ((AAB) r0.get()).A00();
                Runnable runnable = businessDirectorySERPMapViewActivity.A0A;
                if (runnable != null) {
                    businessDirectorySERPMapViewActivity.A0C.removeCallbacks(runnable);
                }
                C21446AkD akD = new C21446AkD(businessDirectorySERPMapViewActivity, 20);
                businessDirectorySERPMapViewActivity.A0A = akD;
                businessDirectorySERPMapViewActivity.A0C.postDelayed(akD, 15000);
            }
            str = "locationUpdateListener";
            C18070vi.A11(str);
            throw null;
        } else if (A03 == 1) {
            businessDirectorySERPMapViewActivity.A4c(false);
        } else if (A03 == 2) {
            String[] strArr = C27091Ur.A09;
            C18070vi.A0Z(strArr);
            if (!AnonymousClass74O.A0N(businessDirectorySERPMapViewActivity, strArr)) {
                C189999kC r2 = businessDirectorySERPMapViewActivity.A03;
                if (r2 != null) {
                    r2.A00(businessDirectorySERPMapViewActivity, new APA(businessDirectorySERPMapViewActivity), 0);
                } else {
                    str = "locationInfoDialogHelper";
                    C18070vi.A11(str);
                    throw null;
                }
            } else {
                C169258kf.A0V(businessDirectorySERPMapViewActivity);
            }
        } else if (A03 == 3) {
            AnonymousClass00H r02 = businessDirectorySERPMapViewActivity.A09;
            if (r02 != null) {
                ((AAB) r02.get()).A00();
            }
            str = "locationUpdateListener";
            C18070vi.A11(str);
            throw null;
        } else if (A03 == 7) {
            businessDirectorySERPMapViewActivity.A4c(true);
        } else if (A03 == 8) {
            boolean A0C = C110885hR.A0C(businessDirectorySERPMapViewActivity, "android.permission.ACCESS_FINE_LOCATION");
            int i = 2131894351;
            int i2 = 2131887056;
            if (A0C) {
                i = 2131894350;
                i2 = 2131887162;
            }
            C73203Rj A00 = AnonymousClass4a6.A00(businessDirectorySERPMapViewActivity);
            A00.A0E(2131887158);
            A00.A0D(i);
            A00.A0Z(new A9T(0, businessDirectorySERPMapViewActivity, A0C), i2);
            A00.A0X((DialogInterface.OnClickListener) null, 2131892995);
            AnonymousClass3MY.A1G(A00);
        } else if (A03 == 9) {
            AnonymousClass8FG A4b = businessDirectorySERPMapViewActivity.A4b();
            boolean A0C2 = A4b.A0N.A0C(A4b.A01);
            if (businessDirectorySERPMapViewActivity.A0B || A0C2) {
                Intent A0A = C17880vN.A0A();
                if (A0C2) {
                    businessDirectorySERPMapViewActivity.setResult(-1, A0A.putExtra("arg_search_filters", businessDirectorySERPMapViewActivity.A4b().A0N.A01()));
                }
                businessDirectorySERPMapViewActivity.setResult(-1, A0A.putExtra("arg_location_access_changed", businessDirectorySERPMapViewActivity.A0B));
                businessDirectorySERPMapViewActivity.finish();
            } else {
                businessDirectorySERPMapViewActivity.finishAfterTransition();
            }
        } else if (A03 == 12) {
            RecyclerView recyclerView = businessDirectorySERPMapViewActivity.A02;
            if (recyclerView != null) {
                if (recyclerView.getVisibility() == 0) {
                    RecyclerView recyclerView2 = businessDirectorySERPMapViewActivity.A02;
                    if (recyclerView2 != null) {
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) recyclerView2.getHeight());
                        translateAnimation.setInterpolator(new D5O());
                        translateAnimation.setDuration(300);
                        translateAnimation.setAnimationListener(new C20306AFo(businessDirectorySERPMapViewActivity, 1));
                        RecyclerView recyclerView3 = businessDirectorySERPMapViewActivity.A02;
                        if (recyclerView3 != null) {
                            recyclerView3.startAnimation(translateAnimation);
                        }
                    }
                }
            }
            C18070vi.A11("horizontalBusinessListView");
            throw null;
        }
        return C27621Wu.A00;
    }
}
