package com.whatsapp.businessdirectory.view.activity;

import X.A36;
import X.AEQ;
import X.AFN;
import X.AnonymousClass00H;
import X.AnonymousClass1GP;
import X.AnonymousClass1KE;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass1XN;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BU;
import X.AnonymousClass8BY;
import X.AnonymousClass8FD;
import X.AnonymousClass8IA;
import X.AnonymousClass8eA;
import X.C108955ca;
import X.C132216mP;
import X.C1776299t;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C192609og;
import X.C196559vG;
import X.C198459yN;
import X.C21603Ams;
import X.C22881Do;
import X.C27301Vn;
import X.C30851ec;
import X.C34001jj;
import X.C59242lz;
import X.C88364Zk;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Menu;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.businessdirectory.view.fragment.Hilt_BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel;
import com.whatsapp.util.Log;
import java.util.Timer;
import java.util.TimerTask;

public class BusinessDirectoryActivity extends AnonymousClass8eA {
    public C132216mP A00;
    public C192609og A01;
    public C1776299t A02;
    public BusinessDirectoryContextualSearchFragment A03;
    public BusinessDirectoryActivityViewModel A04;
    public C27301Vn A05;
    public AnonymousClass1MB A06;
    public AnonymousClass1LU A07;
    public AnonymousClass1XN A08;
    public AnonymousClass1KE A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public TimerTask A0E;
    public boolean A0F;
    public boolean A0G;
    public Menu A0H;
    public boolean A0I;
    public final Timer A0J = new Timer();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r9 = r14
            super.onCreate(r15)
            r0 = 2131624024(0x7f0e0058, float:1.8875216E38)
            r14.setContentView((int) r0)
            if (r15 == 0) goto L_0x0025
            java.lang.String r0 = "arg_show_search_menu"
            r1 = 0
            boolean r0 = r15.getBoolean(r0, r1)
            r14.A0I = r0
            java.lang.String r0 = "arg_show_search_view"
            boolean r0 = r15.getBoolean(r0, r1)
            r14.A0G = r0
            java.lang.String r0 = "arg_go_back_to_utilities"
            boolean r0 = r15.getBoolean(r0, r1)
            r14.A0F = r0
        L_0x0025:
            androidx.appcompat.widget.Toolbar r12 = X.AnonymousClass3Ma.A0G(r14)
            X.01n r1 = X.C72463Mc.A0S(r14, r12)
            r0 = 1
            r1.A0G()
            r1.A0W(r0)
            r0 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.View r10 = r14.findViewById(r0)
            X.0vb r13 = r14.A00
            r4 = 1
            X.AGK r11 = new X.AGK
            r11.<init>(r14, r4)
            X.99t r8 = new X.99t
            r8.<init>(r9, r10, r11, r12, r13)
            r14.A02 = r8
            boolean r0 = r14.A0G
            if (r0 == 0) goto L_0x0051
            r14.A4c()
        L_0x0051:
            r0 = 2131887091(0x7f1203f3, float:1.940878E38)
            r14.setTitle(r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r14)
            java.lang.Class<com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel> r0 = com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel) r0
            r14.A04 = r0
            X.1wy r1 = r0.A01
            r3 = 2
            X.AGr r0 = new X.AGr
            r0.<init>(r14, r3)
            r1.A0A(r14, r0)
            if (r15 != 0) goto L_0x00cf
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r5 = "INITIAL_CATEGORY"
            android.os.Parcelable r2 = r0.getParcelableExtra(r5)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "ARG_DIRECTORY_SHOULD_GO_BACK_TO_UTILITIES"
            r6 = 0
            boolean r0 = r1.getBooleanExtra(r0, r6)
            r14.A0F = r0
            if (r2 != 0) goto L_0x0119
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r8 = "directory_biz_chaining_jid"
            android.os.Parcelable r7 = r0.getParcelableExtra(r8)
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r5 = "directory_biz_chaining_name"
            java.lang.String r2 = r0.getStringExtra(r5)
            if (r7 == 0) goto L_0x0115
            if (r2 == 0) goto L_0x0115
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putParcelable(r8, r7)
            r0.putString(r5, r2)
        L_0x00b2:
            r1.A1R(r0)
            r14.A4h(r1, r6)
        L_0x00b8:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r2 = r14.A04
            X.8ve r0 = r2.A00
            X.9kR r0 = r0.A03
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "is_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x00cf
            X.1wy r0 = r2.A01
            X.AnonymousClass3MX.A1K(r0, r6)
        L_0x00cf:
            X.1XN r0 = r14.A08
            X.0ve r2 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r2)
            if (r0 == 0) goto L_0x0114
            r1 = 1883(0x75b, float:2.639E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0114
            X.00H r0 = r14.A0C
            java.lang.Object r0 = r0.get()
            X.9yN r0 = (X.C198459yN) r0
            boolean r2 = r0.A02
            X.0ve r1 = r0.A03
            r0 = 2010(0x7da, float:2.817E-42)
            if (r2 == 0) goto L_0x00f5
            r0 = 2011(0x7db, float:2.818E-42)
        L_0x00f5:
            java.lang.String r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0114
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0114
            r0 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.View r0 = r14.findViewById(r0)
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.AFi r0 = new X.AFi
            r0.<init>(r14, r3)
            r1.addOnPreDrawListener(r0)
        L_0x0114:
            return
        L_0x0115:
            r14.A4e()
            goto L_0x00b8
        L_0x0119:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r1 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            r1.<init>()
            android.os.Bundle r0 = X.C17880vN.A0D()
            r0.putParcelable(r5, r2)
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 4, 1, getString(2131887029));
        this.A0H = menu;
        if (this.A0I) {
            A4d();
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void A0Q() {
        C18030ve r2 = this.A08.A03;
        if (AnonymousClass8BS.A1L(r2) && C18020vd.A05(C18040vf.A02, r2, 1883)) {
            C198459yN r0 = (C198459yN) this.A0C.get();
            boolean z = r0.A02;
            C18030ve r1 = r0.A03;
            int i = 2010;
            if (z) {
                i = 2011;
            }
            String A0I2 = r1.A0I(i);
            if (!(A0I2 == null || A0I2.length() == 0)) {
                TimerTask timerTask = this.A0E;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                C21603Ams ams = new C21603Ams(this);
                this.A0E = ams;
                this.A0J.schedule(ams, 0, 7000);
                return;
            }
        }
        C1776299t r22 = this.A02;
        if (r22 != null) {
            String string = getString(2131887066);
            SearchView searchView = r22.A00;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
        }
    }

    public static void A0V(BusinessDirectoryActivity businessDirectoryActivity) {
        C1776299t r1 = businessDirectoryActivity.A02;
        if (r1 != null) {
            r1.A05(true);
        }
        if (!businessDirectoryActivity.isDestroyed() && !businessDirectoryActivity.isFinishing()) {
            businessDirectoryActivity.getSupportFragmentManager().A0c();
        }
    }

    public static void A0c(BusinessDirectoryActivity businessDirectoryActivity, String str) {
        BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment = businessDirectoryActivity.A03;
        if (businessDirectoryContextualSearchFragment != null) {
            AnonymousClass8IA r1 = businessDirectoryContextualSearchFragment.A0A;
            r1.A00 = 0;
            r1.A01.clear();
            businessDirectoryContextualSearchFragment.A07.A0W(str);
        }
        if (TextUtils.isEmpty(str)) {
            businessDirectoryActivity.A0Q();
        } else if (businessDirectoryActivity.A0E != null) {
            C1776299t r12 = businessDirectoryActivity.A02;
            if (r12 != null) {
                ObjectAnimator objectAnimator = r12.A02;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ObjectAnimator objectAnimator2 = r12.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
                ObjectAnimator objectAnimator3 = r12.A01;
                if (objectAnimator3 != null) {
                    objectAnimator3.cancel();
                }
                ObjectAnimator objectAnimator4 = r12.A00;
                if (objectAnimator4 != null) {
                    objectAnimator4.cancel();
                }
                r12.A04.clearAnimation();
                r12.A05.clearAnimation();
            }
            businessDirectoryActivity.A0E.cancel();
        }
    }

    public void A4b() {
        Menu menu = this.A0H;
        if (!(menu == null || menu.findItem(1) == null)) {
            this.A0H.removeItem(1);
        }
        this.A0I = false;
    }

    public void A4c() {
        C1776299t r0 = this.A02;
        if (r0 != null && !r0.A0C()) {
            this.A02.A06(false);
            A0Q();
            this.A02.A00.requestFocus();
            AFN.A00(this.A02.A03.findViewById(2131434851), this, 9);
        }
    }

    public void A4d() {
        Menu menu = this.A0H;
        if (menu != null && menu.findItem(1) == null) {
            AnonymousClass8BY.A0C(this, this.A0H, 1).setShowAsAction(2);
        }
        this.A0I = true;
    }

    public void A4e() {
        if (this instanceof DirectoryBusinessChainingActivity) {
            Intent A072 = AnonymousClass8BR.A07(this, BusinessDirectoryActivity.class);
            A072.putExtra("arg_launch_consumer_home", true);
            A072.setFlags(67108864);
            startActivity(A072);
            return;
        }
        A4h(new BusinessDirectoryConsumerHomeFragment(), false);
    }

    public void A4j(String str) {
        C1776299t r0 = this.A02;
        if (r0 != null) {
            Editable text = r0.A00.A0b.getText();
            if (text == null || !str.equals(text.toString())) {
                this.A02.A00.A0N(str);
            } else {
                A0c(this, str);
            }
        }
    }

    public void onBackPressed() {
        C1776299t r0 = this.A02;
        if (r0 != null && r0.A0C()) {
            this.A02.A05(true);
        }
        BVe().A07();
    }

    public void onResume() {
        if (((C22881Do) this.A0D.get()).A01) {
            Log.i("BusinessDirectoryActivity/onResume WhatsApp login failed");
            this.A05.BEJ(20, "DirectoryLoginFailed");
            C88364Zk.A01(this, C17880vN.A0I(this.A0B), this.A0E, (C22881Do) this.A0D.get());
        } else if (((C30851ec) this.A0A.get()).A00() != null) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 2466)) {
                Log.i("home/show-account-logout-request");
                C59242lz A002 = ((C30851ec) this.A0A.get()).A00();
                ((C30851ec) this.A0A.get()).A01((C59242lz) null);
                this.A05.BEJ(52, "HomeActivityShowingDialog");
                C88364Zk.A00(this, A002);
            }
        }
        super.onResume();
    }

    public static BusinessDirectorySearchFragment A03(BusinessDirectoryActivity businessDirectoryActivity) {
        Fragment A0Q = businessDirectoryActivity.getSupportFragmentManager().A0Q("BusinessDirectorySearchFragment");
        if (A0Q instanceof BusinessDirectorySearchFragment) {
            return (BusinessDirectorySearchFragment) A0Q;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == 2) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4f() {
        /*
            r5 = this;
            X.1GP r0 = r5.getSupportFragmentManager()
            X.1GR r2 = r0.A0U
            java.util.List r0 = r2.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x008b
            r2 = 0
        L_0x0011:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x0053
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r2
            X.8FD r2 = r2.A0A
            int r1 = r2.A02
            if (r1 == 0) goto L_0x0021
            r0 = 2
            r4 = 2
            if (r1 != r0) goto L_0x0022
        L_0x0021:
            r4 = 3
        L_0x0022:
            r0 = 2
            if (r1 != r0) goto L_0x004b
            X.1wy r0 = r2.A0S
        L_0x0027:
            java.lang.Object r3 = r0.A06()
            X.AEQ r3 = (X.AEQ) r3
        L_0x002d:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "SEARCH_CONTEXT_CATEGORY"
            r1.putParcelable(r0, r3)
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r4)
            r2.A1R(r1)
            r0 = 1
            r5.A4h(r2, r0)
        L_0x0047:
            r5.A4c()
            return
        L_0x004b:
            r0 = 1
            if (r1 != r0) goto L_0x0051
            X.1wy r0 = r2.A0T
            goto L_0x0027
        L_0x0051:
            r3 = 0
            goto L_0x002d
        L_0x0053:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment
            if (r0 == 0) goto L_0x006d
            r3 = 0
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "ARG_PREVIOUS_SCREEN"
            r1.putInt(r0, r3)
            r2.A1R(r1)
        L_0x0069:
            r5.A4g(r2)
            goto L_0x0047
        L_0x006d:
            boolean r0 = r2 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x0077
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r2 = new com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment
            r2.<init>()
            goto L_0x0069
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BusinessDirectoryActivity/startSearchInConsumerSearchHome foreground fragment is "
            r1.append(r0)
            if (r2 != 0) goto L_0x0088
            java.lang.String r0 = "null"
        L_0x0084:
            X.C17890vO.A19(r1, r0)
            goto L_0x0047
        L_0x0088:
            java.lang.String r0 = r2.A0T
            goto L_0x0084
        L_0x008b:
            java.util.List r1 = r2.A04()
            java.util.List r0 = r2.A04()
            int r0 = X.AnonymousClass3MX.A01(r0)
            java.lang.Object r2 = r1.get(r0)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.A4f():void");
    }

    public void A4g(Fragment fragment) {
        String A0x = C108955ca.A0x(fragment);
        if (!isDestroyed() && !isFinishing()) {
            getSupportFragmentManager().A0c();
        }
        C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
        A0H2.A0D(fragment, A0x, 2131428566);
        AnonymousClass8BU.A19(A0H2, A0x);
    }

    public void A4h(Fragment fragment, boolean z) {
        String A0x = C108955ca.A0x(fragment);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.A0Q(A0x) == null) {
            C34001jj r1 = new C34001jj(supportFragmentManager);
            r1.A0D(fragment, A0x, 2131428566);
            if (z) {
                r1.A0H(A0x);
            }
            r1.A00(false);
        }
    }

    public void A4i(AEQ aeq, int i) {
        BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment;
        Fragment A0Q = getSupportFragmentManager().A0Q("BusinessDirectoryConsumerHomeFragment");
        if (A0Q instanceof BusinessDirectoryConsumerHomeFragment) {
            businessDirectoryConsumerHomeFragment = (BusinessDirectoryConsumerHomeFragment) A0Q;
        } else {
            businessDirectoryConsumerHomeFragment = null;
        }
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0G = false;
        }
        A0V(this);
        if (businessDirectoryConsumerHomeFragment != null) {
            businessDirectoryConsumerHomeFragment.A0G = true;
        }
        BusinessDirectorySearchFragment A032 = A03(this);
        if (A032 != null) {
            AnonymousClass8FD r2 = A032.A0A;
            r2.A00 = i;
            A36 a36 = r2.A0K;
            a36.A07();
            a36.A00 = null;
            r2.A0S.A0F(aeq);
            if (C196559vG.A01(aeq.A00)) {
                AnonymousClass8FD.A0A(r2);
                return;
            }
            r2.A0T.A0F(aeq);
            AnonymousClass8FD.A0G(r2, false);
            if (AnonymousClass8FD.A0O(r2)) {
                r2.A05.pop();
                return;
            }
            return;
        }
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelable("INITIAL_CATEGORY", aeq);
        businessDirectorySearchFragment.A1R(A0D2);
        A4h(businessDirectorySearchFragment, false);
    }

    public void onDestroy() {
        super.onDestroy();
        TimerTask timerTask = this.A0E;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if (intent.getBooleanExtra("from_api_biz_search", false)) {
            A4g(new Hilt_BusinessDirectoryContextualSearchFragment());
        } else if (intent.getBooleanExtra("arg_launch_consumer_home", false)) {
            A4f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        if (r1 == 2) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r12) {
        /*
            r11 = this;
            int r1 = r12.getItemId()
            r10 = 1
            if (r1 == r10) goto L_0x00a3
            r0 = 2
            if (r1 == r0) goto L_0x0088
            r0 = 4
            if (r1 == r0) goto L_0x006e
            r0 = 16908332(0x102002c, float:2.3877352E-38)
            if (r1 == r0) goto L_0x0017
            boolean r0 = super.onOptionsItemSelected(r12)
            return r0
        L_0x0017:
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r2 = A03(r11)
            X.1GP r1 = r11.getSupportFragmentManager()
            java.lang.String r0 = "BusinessDirectoryPopularApiBusinessesFragment"
            androidx.fragment.app.Fragment r1 = r1.A0Q(r0)
            boolean r0 = r1 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x0039
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r1
        L_0x002b:
            if (r2 == 0) goto L_0x003b
            boolean r0 = r2.A1e()
            if (r0 == 0) goto L_0x003b
            X.8FD r0 = r2.A0A
            r0.A0U()
            return r10
        L_0x0039:
            r1 = 0
            goto L_0x002b
        L_0x003b:
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1.A1e()
            if (r0 == 0) goto L_0x0066
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r1.A00
            if (r0 == 0) goto L_0x010c
            X.00H r0 = r0.A02
            java.lang.Object r4 = r0.get()
            X.AM7 r4 = (X.AM7) r4
            java.lang.Integer r6 = X.AnonymousClass3MY.A0f()
            r5 = 0
            r8 = 13
            r9 = 91
            r7 = r5
            r4.A08(r5, r6, r7, r8, r9, r10)
            r11.A4e()
            r0 = 2131887091(0x7f1203f3, float:1.940878E38)
            r11.setTitle(r0)
            return r10
        L_0x0066:
            X.02V r0 = r11.BVe()
            r0.A07()
            return r10
        L_0x006e:
            X.6mP r1 = r11.A00
            X.1MB r0 = r11.A06
            boolean r9 = r0.A00()
            r2 = 0
            java.lang.String r5 = "biz-directory-browsing"
            X.6np r1 = r1.A00
            r4 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r3 = r2
            android.content.Intent r0 = r1.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            r11.startActivity(r0)
            return r10
        L_0x0088:
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryActivityViewModel r0 = r11.A04
            X.8ve r0 = r0.A00
            X.9kR r0 = r0.A03
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A05(r0)
            java.lang.String r0 = "is_nux"
            X.C17880vN.A1F(r1, r0, r10)
            r1 = 2131898730(0x7f12316a, float:1.9432386E38)
            r0 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r11, r1, r0)
            r0.show()
            return r10
        L_0x00a3:
            X.1GP r0 = r11.getSupportFragmentManager()
            X.1GR r2 = r0.A0U
            java.util.List r0 = r2.A04()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00f9
            r3 = 0
        L_0x00b4:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment
            if (r0 == 0) goto L_0x00d6
            r0 = r3
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment) r0
            X.8FD r2 = r0.A0A
            X.AM7 r4 = r2.A0E
            int r1 = r2.A02
            if (r1 == 0) goto L_0x00c7
            r0 = 2
            r8 = 2
            if (r1 != r0) goto L_0x00c8
        L_0x00c7:
            r8 = 3
        L_0x00c8:
            java.lang.Integer r5 = X.A5L.A01(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r7 = 0
            r9 = 62
            r4.A08(r5, r6, r7, r8, r9, r10)
        L_0x00d6:
            boolean r0 = r3 instanceof com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment
            if (r0 == 0) goto L_0x00f5
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment) r3
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel r0 = r3.A00
            if (r0 == 0) goto L_0x010c
            X.00H r0 = r0.A02
            java.lang.Object r4 = r0.get()
            X.AM7 r4 = (X.AM7) r4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r5 = 0
            r8 = 13
            r9 = 62
            r7 = r5
            r4.A08(r5, r6, r7, r8, r9, r10)
        L_0x00f5:
            r11.A4f()
            return r10
        L_0x00f9:
            java.util.List r1 = r2.A04()
            java.util.List r0 = r2.A04()
            int r0 = X.AnonymousClass3MX.A01(r0)
            java.lang.Object r3 = r1.get(r0)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            goto L_0x00b4
        L_0x010c:
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C1776299t r0 = this.A02;
        if (r0 != null) {
            r0.A03(bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            X.99t r0 = r3.A02
            if (r0 == 0) goto L_0x000a
            r0.A04(r4)
        L_0x000a:
            android.view.Menu r1 = r3.A0H
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0017
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.99t r0 = r3.A02
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            java.lang.String r1 = "arg_go_back_to_utilities"
            boolean r0 = r3.A0F
            r4.putBoolean(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
