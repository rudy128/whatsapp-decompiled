package com.whatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1LA;
import X.AnonymousClass1M4;
import X.AnonymousClass1M9;
import X.AnonymousClass1VW;
import X.AnonymousClass25N;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass48m;
import X.AnonymousClass4VZ;
import X.AnonymousClass4aV;
import X.AnonymousClass74O;
import X.AnonymousClass783;
import X.AnonymousClass79E;
import X.AnonymousClass79I;
import X.AnonymousClass79J;
import X.C003401n;
import X.C108975cc;
import X.C110185f4;
import X.C110885hR;
import X.C111915kd;
import X.C112585li;
import X.C113675nX;
import X.C115005t7;
import X.C121766Lk;
import X.C134196qC;
import X.C136736uJ;
import X.C1419977t;
import X.C1424779p;
import X.C146497Pi;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C181769Rt;
import X.C19880zA;
import X.C219217x;
import X.C24921Me;
import X.C26911Ty;
import X.C27191Vc;
import X.C27201Vd;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C36271nc;
import X.C37311pJ;
import X.C37451pZ;
import X.C49232Pr;
import X.C70773Cl;
import X.C72453Mb;
import X.C72463Mc;
import X.C87544Vz;
import X.C88184Yq;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.components.SelectionCheckView;
import java.util.ArrayList;
import java.util.List;

public class PhoneContactsSelector extends C115005t7 {
    public MenuItem A00;
    public View A01;
    public ImageView A02;
    public ListView A03;
    public C19880zA A04;
    public AnonymousClass1LA A05;
    public C36271nc A06;
    public C26911Ty A07;
    public AnonymousClass1VW A08;
    public AnonymousClass1M9 A09;
    public C24921Me A0A;
    public C37451pZ A0B;
    public C37451pZ A0C;
    public C27201Vd A0D;
    public C27191Vc A0E;
    public C110185f4 A0F;
    public C121766Lk A0G;
    public C49232Pr A0H;
    public C88184Yq A0I;
    public C134196qC A0J;
    public C31131f4 A0K;
    public AnonymousClass118 A0L;
    public C219217x A0M;
    public C18000vb A0N;
    public AnonymousClass1M4 A0O;
    public AnonymousClass1BI A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public String A0W;
    public ArrayList A0X;
    public boolean A0Y;
    public View A0Z;
    public RecyclerView A0a;
    public BottomSheetBehavior A0b;
    public AnonymousClass4VZ A0c;
    public boolean A0d;
    public final C111915kd A0e = new C111915kd(this);
    public final ArrayList A0f = AnonymousClass000.A13();
    public final ArrayList A0g = AnonymousClass000.A13();
    public final List A0h = AnonymousClass000.A13();

    public void onCreate(Bundle bundle) {
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i;
        super.onCreate(bundle);
        boolean A002 = C87544Vz.A00(this.A0E);
        this.A0Y = A002;
        int i2 = 2131626108;
        if (A002) {
            i2 = 2131626109;
        }
        setContentView(i2);
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        C003401n A0S2 = C72463Mc.A0S(this, A0G2);
        A0S2.A0W(true);
        A0S2.A0G();
        this.A0B = this.A0D.A06(this, "phone-contacts-selector");
        this.A0c = new AnonymousClass4VZ(this, findViewById(2131434898), new C1424779p(this, 2), A0G2, this.A0N);
        setTitle(2131888889);
        this.A0P = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
        ListView listView2 = getListView();
        this.A03 = listView2;
        listView2.setFastScrollAlwaysVisible(true);
        this.A03.setScrollBarStyle(33554432);
        List list = this.A0h;
        list.clear();
        ViewStub viewStub = (ViewStub) C110885hR.A0A(this, 2131435116);
        viewStub.setLayoutResource(2131626874);
        viewStub.inflate();
        this.A0a = (RecyclerView) findViewById(2131435110);
        this.A0a.A0r(new C112585li(this, getResources().getDimensionPixelSize(2131168605), 0));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.A1Z(0);
        this.A0a.setLayoutManager(linearLayoutManager);
        this.A0a.setAdapter(this.A0e);
        this.A0a.setItemAnimator(new C113675nX());
        this.A03.setOnScrollListener(new AnonymousClass79I(this));
        this.A03.setFastScrollEnabled(true);
        this.A03.setScrollbarFadingEnabled(true);
        boolean A1Z = AnonymousClass3MW.A1Z(this.A0N);
        ListView listView3 = this.A03;
        if (A1Z) {
            listView3.setVerticalScrollbarPosition(1);
            listView = this.A03;
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166071);
            resources = getResources();
            i = 2131166070;
        } else {
            listView3.setVerticalScrollbarPosition(2);
            listView = this.A03;
            dimensionPixelSize = getResources().getDimensionPixelSize(2131166070);
            resources = getResources();
            i = 2131166071;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        this.A03.setOnItemClickListener(new AnonymousClass79J(this, 3));
        A12(this, list.size());
        this.A0Z = C110885hR.A0A(this, 2131435112);
        if (list.isEmpty()) {
            this.A0Z.setVisibility(4);
        }
        C110885hR.A0A(this, 2131437007).setVisibility(8);
        C110185f4 r0 = new C110185f4(this, this, this.A0f);
        this.A0F = r0;
        A4b(r0);
        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131433119);
        this.A02 = imageView;
        AnonymousClass3NL.A01(this, imageView, this.A0N, 2131231900);
        AnonymousClass3MY.A0w(this, this.A02, 2131899268);
        this.A02.setVisibility(0);
        AnonymousClass48m.A00(this.A02, this, 25);
        ((EmptyTellAFriendView) findViewById(2131429489)).setInviteButtonClickListener(new AnonymousClass783(this, 39));
        AnonymousClass48m.A00(findViewById(2131428611), this, 26);
        registerForContextMenu(this.A03);
        if (bundle == null && !C72463Mc.A1W(this.A0Q) && !((C37311pJ) this.A0T.get()).A02()) {
            AnonymousClass74O.A0A(this, 2131894317, 2131894316, 150, false);
        }
        if (C72463Mc.A1W(this.A0Q) || ((C37311pJ) this.A0T.get()).A02()) {
            AnonymousClass3MX.A1H(this, 2131431631, 0);
        }
        if (this.A0Y) {
            View A062 = AnonymousClass1HF.A06(this.A00, 2131429440);
            this.A0b = new BottomSheetBehavior();
            ((C136736uJ) this.A0S.get()).A01(A062, this.A0b, this, this.A09);
            C181769Rt.A00(this, A0S2);
            ((C136736uJ) this.A0S.get()).A03(this.A0b, false);
        }
    }

    public static void A10(AnonymousClass25N r9, PhoneContactsSelector phoneContactsSelector) {
        boolean z;
        AnonymousClass10I r2;
        Runnable r1;
        SelectionCheckView selectionCheckView = (SelectionCheckView) phoneContactsSelector.A03.findViewWithTag(r9);
        if (r9.A03) {
            r9.A03 = false;
            z = false;
        } else if (phoneContactsSelector.A0h.size() == 257) {
            AnonymousClass1KB r5 = phoneContactsSelector.A05;
            C18000vb r4 = phoneContactsSelector.A0N;
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, 257, 0);
            r5.A0G(r4.A0K(objArr, 2131755072, 257), 1);
            if (selectionCheckView != null) {
                selectionCheckView.A04(false, false);
                return;
            }
            return;
        } else {
            TextView A0E2 = C17880vN.A0E(phoneContactsSelector.findViewById(2131434898), 2131434969);
            if (A0E2 != null) {
                AnonymousClass3MW.A1S(A0E2);
            }
            r9.A03 = true;
            z = true;
        }
        List list = phoneContactsSelector.A0h;
        if (!z) {
            int indexOf = list.indexOf(r9);
            if (list.remove(r9)) {
                phoneContactsSelector.A0e.A0I(indexOf);
            }
        } else if (list.add(r9)) {
            phoneContactsSelector.A0e.A0H(AnonymousClass3MX.A02(list, 1));
        }
        if (selectionCheckView != null) {
            selectionCheckView.A04(r9.A03, false);
        }
        if (list.isEmpty()) {
            A11(phoneContactsSelector);
        } else if (phoneContactsSelector.A0Z.getVisibility() != 0) {
            int dimensionPixelSize = phoneContactsSelector.getResources().getDimensionPixelSize(2131168600);
            phoneContactsSelector.A0Z.setVisibility(0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) dimensionPixelSize);
            translateAnimation.setDuration(240);
            translateAnimation.setAnimationListener(new AnonymousClass79E(phoneContactsSelector, dimensionPixelSize));
            phoneContactsSelector.A03.startAnimation(translateAnimation);
        } else if (r9.A03) {
            phoneContactsSelector.A0a.A0f(AnonymousClass3MX.A02(list, 1));
        }
        A12(phoneContactsSelector, list.size());
        if (r9.A02 == null) {
            if (r9.A01 != null && AnonymousClass3MX.A1W(phoneContactsSelector.A0E)) {
                AnonymousClass1E7 r12 = r9.A01;
                if (r12.A09 == 1) {
                    AnonymousClass1BI r3 = r12.A0J;
                    if (r3 != null) {
                        r2 = phoneContactsSelector.A05;
                        r1 = new C70773Cl(phoneContactsSelector, r9, r3, 11);
                        r2.CGF(r1);
                    }
                    return;
                }
            }
            r2 = phoneContactsSelector.A05;
            r1 = new C146497Pi(phoneContactsSelector, r9, 7);
            r2.CGF(r1);
        }
    }

    public static void A11(PhoneContactsSelector phoneContactsSelector) {
        phoneContactsSelector.A0Z.setVisibility(4);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-phoneContactsSelector.getResources().getDimensionPixelSize(2131168600)));
        translateAnimation.setDuration(240);
        translateAnimation.setAnimationListener(new AnonymousClass79E(phoneContactsSelector, 0));
        phoneContactsSelector.A03.startAnimation(translateAnimation);
    }

    public void A4c() {
        C121766Lk r1 = this.A0G;
        if (r1 != null) {
            r1.A0B(true);
            this.A0G = null;
        }
        C121766Lk r12 = new C121766Lk(this, this.A0N, this.A0X, this.A0g);
        this.A0G = r12;
        C17890vO.A0u(r12, this.A05);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A0d) {
            this.A0d = false;
            C17960vV.A02();
            ArrayList arrayList = this.A0f;
            arrayList.clear();
            arrayList.addAll(this.A0g);
            this.A0F.notifyDataSetChanged();
            this.A0c.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public void onResume() {
        super.onResume();
        boolean A1G = C108975cc.A1G(this.A0H);
        C121766Lk r0 = this.A0G;
        if (r0 != null) {
            r0.A0B(A1G);
            this.A0G = null;
        }
        AnonymousClass11C r2 = this.A08;
        AnonymousClass11C r7 = r2;
        C49232Pr r3 = new C49232Pr(this.A09, this, this, r7, this.A0M, this.A0E);
        this.A0H = r3;
        C17890vO.A0u(r3, this.A05);
        if (C72463Mc.A1W(this.A0Q) || ((C37311pJ) this.A0T.get()).A02()) {
            this.A02.setVisibility(0);
        }
        boolean z = ((C31161f7) this.A0U.get()).A03;
        View view = this.A00;
        if (z) {
            C18030ve r15 = this.A0E;
            AnonymousClass1KB r14 = this.A05;
            AnonymousClass11S r13 = this.A02;
            AnonymousClass10I r11 = this.A05;
            C27201Vd r10 = this.A0D;
            AnonymousClass1M9 r9 = this.A09;
            C24921Me r8 = this.A0A;
            C18000vb r72 = this.A0N;
            C134196qC r6 = this.A0J;
            C31131f4 r5 = this.A0K;
            AnonymousClass00H r4 = this.A0U;
            AnonymousClass00H r32 = this.A0V;
            View view2 = this.A01;
            C18030ve r24 = r15;
            C31131f4 r22 = r5;
            C134196qC r21 = r6;
            C27201Vd r20 = r10;
            C37451pZ r19 = this.A0C;
            C24921Me r18 = r8;
            AnonymousClass1M9 r17 = r9;
            AnonymousClass11S r16 = r13;
            AnonymousClass1KB r152 = r14;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r152, r16, r17, r18, r19, r20, r21, r22, r72, r24, this.A0F, r11, r4, r32, "phone-contacts-selector-activity");
            this.A01 = (View) A002.first;
            this.A0C = (C37451pZ) A002.second;
        } else if (C31181f9.A00(view)) {
            AnonymousClass4aV.A03(this.A00, this.A0K, this.A0U);
        }
        ((C31161f7) this.A0U.get()).A00();
    }

    public boolean onSearchRequested() {
        this.A0c.A06(this.A0Y);
        this.A0d = true;
        return false;
    }

    public static void A12(PhoneContactsSelector phoneContactsSelector, int i) {
        C003401n supportActionBar = phoneContactsSelector.getSupportActionBar();
        Object[] A1a = AnonymousClass3MW.A1a();
        C17880vN.A1T(A1a, i, 0);
        supportActionBar.A0R(phoneContactsSelector.A0N.A0K(A1a, 2131755253, (long) i));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271);
        this.A00 = icon;
        if (this.A0Y) {
            icon.setIcon(2131232269);
            Drawable icon2 = this.A00.getIcon();
            if (icon2 != null) {
                icon2.setTint(AnonymousClass3Ma.A00(this, 2130969145, 2131100155));
            }
        }
        this.A00.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new C1419977t(this, 2));
        this.A00.setVisible(C17880vN.A1X(this.A0g));
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C121766Lk r0 = this.A0G;
        if (r0 != null) {
            r0.A0B(true);
            this.A0G = null;
        }
        C49232Pr r02 = this.A0H;
        if (r02 != null) {
            r02.A0B(true);
            this.A0H = null;
        }
        this.A0g.clear();
        this.A0f.clear();
        this.A0B.A02();
        AnonymousClass4aV.A01(this.A01, this.A0K);
        C37451pZ r03 = this.A0C;
        if (r03 != null) {
            r03.A02();
            this.A0C = null;
        }
        this.A0I.A02(9);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        AnonymousClass4aV.A06(this.A0K);
        ((C31161f7) this.A0U.get()).A01(this.A00);
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Object, X.6jA] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.6fc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v11, types: [java.lang.Object, X.6jA] */
    /* JADX WARNING: type inference failed for: r3v15, types: [X.6z2, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0474, code lost:
        if (r2 == null) goto L_0x0480;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A0z(X.AnonymousClass1LA r35, X.C26911Ty r36, X.AnonymousClass1M9 r37, X.AnonymousClass25N r38, X.AnonymousClass11C r39, X.AnonymousClass118 r40, X.C18000vb r41) {
        /*
            X.C17960vV.A00()
            X.73Y r8 = new X.73Y
            r3 = r37
            r2 = r39
            r1 = r40
            r34 = r41
            r0 = r34
            r8.<init>(r3, r2, r1, r0)
            r2 = r38
            java.lang.String r0 = r2.A06
            X.73C r1 = r8.A04
            X.6oE r5 = r1.A0A
            r5.A01 = r0
            long r2 = r2.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.String r20 = r0.toString()
            r0 = 7
            java.lang.String[] r7 = new java.lang.String[r0]
            r11 = 0
            java.lang.String r4 = "data2"
            r7[r11] = r4
            r9 = 1
            java.lang.String r6 = "data3"
            r7[r9] = r6
            r2 = 2
            java.lang.String r19 = "data5"
            r7[r2] = r19
            r0 = 3
            java.lang.String r15 = "data4"
            r7[r0] = r15
            r0 = 4
            java.lang.String r3 = "data6"
            r7[r0] = r3
            r0 = 5
            java.lang.String r18 = "data7"
            r7[r0] = r18
            r0 = 6
            java.lang.String r17 = "data9"
            r7[r0] = r17
            X.11C r0 = r8.A01
            r33 = r0
            X.11B r21 = X.C108955ca.A0d(r33)
            android.net.Uri r22 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r11] = r20
            java.lang.String r0 = "vnd.android.cursor.item/name"
            r2[r9] = r0
            r26 = 0
            java.lang.String r24 = "contact_id = ? AND mimetype=?"
            r23 = r7
            r25 = r2
            android.database.Cursor r2 = r21.A03(r22, r23, r24, r25, r26)
            if (r2 != 0) goto L_0x009a
        L_0x006c:
            r0 = 5
            java.lang.String[] r2 = new java.lang.String[r0]
            r16 = 0
            r2[r11] = r4
            r3 = 1
            java.lang.String r5 = "data1"
            r2[r9] = r5
            r0 = 2
            r2[r0] = r6
            r0 = 3
            java.lang.String r7 = "is_primary"
            r2[r0] = r7
            r0 = 4
            java.lang.String r14 = "raw_contact_id"
            r2[r0] = r14
            X.11B r21 = X.C108955ca.A0d(r33)
            android.net.Uri r22 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String[] r0 = new java.lang.String[r9]
            r0[r11] = r20
            java.lang.String r24 = "contact_id =?"
            r23 = r2
            r25 = r0
            android.database.Cursor r2 = r21.A03(r22, r23, r24, r25, r26)
            goto L_0x00d5
        L_0x009a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = X.C17890vO.A0S(r2, r4)     // Catch:{ all -> 0x0477 }
            r5.A02 = r0     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = X.C17890vO.A0S(r2, r6)     // Catch:{ all -> 0x0477 }
            r5.A00 = r0     // Catch:{ all -> 0x0477 }
            r0 = r19
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0477 }
            r5.A03 = r0     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = X.C17890vO.A0S(r2, r15)     // Catch:{ all -> 0x0477 }
            r5.A06 = r0     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            r5.A07 = r0     // Catch:{ all -> 0x0477 }
            r0 = r18
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0477 }
            r5.A04 = r0     // Catch:{ all -> 0x0477 }
            r0 = r17
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0477 }
            r5.A05 = r0     // Catch:{ all -> 0x0477 }
            goto L_0x009a
        L_0x00d1:
            r2.close()
            goto L_0x006c
        L_0x00d5:
            java.lang.String[] r23 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0473 }
            java.lang.String r10 = "sync1"
            r23[r11] = r10     // Catch:{ all -> 0x0473 }
            java.lang.String r9 = "_id"
            r23[r3] = r9     // Catch:{ all -> 0x0473 }
            java.util.HashMap r0 = X.C17880vN.A11()     // Catch:{ all -> 0x0473 }
            android.net.Uri r11 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x0473 }
            android.net.Uri$Builder r13 = r11.buildUpon()     // Catch:{ all -> 0x0473 }
            X.118 r11 = r8.A02     // Catch:{ all -> 0x0473 }
            android.content.Context r12 = r11.A00     // Catch:{ all -> 0x0473 }
            r11 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r12 = r12.getString(r11)     // Catch:{ all -> 0x0473 }
            java.lang.String r11 = "account_name"
            android.net.Uri$Builder r13 = r13.appendQueryParameter(r11, r12)     // Catch:{ all -> 0x0473 }
            java.lang.String r12 = "account_type"
            java.lang.String r11 = "com.whatsapp"
            android.net.Uri r22 = X.C17890vO.A0C(r13, r12, r11)     // Catch:{ all -> 0x0473 }
            X.11B r21 = X.C108955ca.A0d(r33)     // Catch:{ all -> 0x0473 }
            java.lang.String[] r11 = new java.lang.String[r3]     // Catch:{ all -> 0x0473 }
            r11[r16] = r20     // Catch:{ all -> 0x0473 }
            java.lang.String r24 = "contact_id=?"
            r25 = r11
            android.database.Cursor r13 = r21.A03(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0473 }
            if (r13 == 0) goto L_0x013c
        L_0x0116:
            boolean r11 = r13.moveToNext()     // Catch:{ all -> 0x0132 }
            if (r11 == 0) goto L_0x012e
            java.lang.String r12 = X.C17890vO.A0S(r13, r9)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = X.C17890vO.A0S(r13, r10)     // Catch:{ all -> 0x0132 }
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A02(r11)     // Catch:{ all -> 0x0132 }
            if (r11 == 0) goto L_0x0116
            r0.put(r12, r11)     // Catch:{ all -> 0x0132 }
            goto L_0x0116
        L_0x012e:
            r13.close()     // Catch:{ all -> 0x0473 }
            goto L_0x013c
        L_0x0132:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0473 }
        L_0x013b:
            throw r1     // Catch:{ all -> 0x0473 }
        L_0x013c:
            if (r2 != 0) goto L_0x029b
        L_0x013e:
            X.11B r24 = X.C108955ca.A0d(r33)
            android.net.Uri r25 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r3]
            r2[r16] = r20
            java.lang.String r27 = "contact_id = ?"
            r28 = r2
            r29 = r26
            android.database.Cursor r13 = r24.A03(r25, r26, r27, r28, r29)
            if (r13 != 0) goto L_0x025d
        L_0x0155:
            r3 = 2
            java.lang.String[] r23 = X.C17880vN.A1b(r4, r5, r3, r0)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r2 = "contact_id"
            r9[r16] = r2
            java.lang.String r2 = "mimetype"
            r9[r0] = r2
            java.lang.String r2 = "%s =? AND %s =?"
            java.lang.String r24 = java.lang.String.format(r2, r9)
            X.11B r21 = X.C108955ca.A0d(r33)
            android.net.Uri r22 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r16] = r20
            java.lang.String r2 = "vnd.android.cursor.item/website"
            r3[r0] = r2
            r25 = r3
            android.database.Cursor r2 = r21.A03(r22, r23, r24, r25, r26)
            if (r2 != 0) goto L_0x0230
        L_0x0180:
            X.11B r24 = X.C108955ca.A0d(r33)
            android.net.Uri r25 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI
            java.lang.String[] r2 = new java.lang.String[r0]
            r2[r16] = r20
            r28 = r2
            android.database.Cursor r2 = r24.A03(r25, r26, r27, r28, r29)
            if (r2 != 0) goto L_0x01af
        L_0x0192:
            java.lang.String[] r13 = X.C17880vN.A1Z()
            r13[r16] = r20
            java.lang.String r2 = "vnd.android.cursor.item/organization"
            r13[r0] = r2
            X.11B r9 = X.C108955ca.A0d(r33)
            java.lang.String r12 = "contact_id = ? AND mimetype = ?"
            r14 = r26
            r10 = r22
            r11 = r14
            android.database.Cursor r2 = r9.A03(r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x030e
            goto L_0x02cf
        L_0x01af:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x022b
            java.util.List r3 = r1.A03     // Catch:{ all -> 0x0477 }
            if (r3 != 0) goto L_0x01bf
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0477 }
            r1.A03 = r3     // Catch:{ all -> 0x0477 }
        L_0x01bf:
            X.6jA r9 = new X.6jA     // Catch:{ all -> 0x0477 }
            r9.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$StructuredPostal> r3 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class
            r9.A01 = r3     // Catch:{ all -> 0x0477 }
            int r3 = X.C17890vO.A01(r2, r4)     // Catch:{ all -> 0x0477 }
            r9.A00 = r3     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0477 }
            r9.A02 = r3     // Catch:{ all -> 0x0477 }
            X.6z2 r3 = new X.6z2     // Catch:{ all -> 0x0477 }
            r3.<init>()     // Catch:{ all -> 0x0477 }
            r9.A04 = r3     // Catch:{ all -> 0x0477 }
            java.lang.String r12 = X.C17890vO.A0S(r2, r15)     // Catch:{ all -> 0x0477 }
            if (r12 == 0) goto L_0x01ed
            X.6z2 r11 = r9.A04     // Catch:{ all -> 0x0477 }
            java.lang.String r10 = "(\r\n|\r|\n|\n\r)"
            java.lang.String r3 = " "
            java.lang.String r3 = r12.replaceAll(r10, r3)     // Catch:{ all -> 0x0477 }
            r11.A03 = r3     // Catch:{ all -> 0x0477 }
        L_0x01ed:
            X.6z2 r10 = r9.A04     // Catch:{ all -> 0x0477 }
            r3 = r18
            java.lang.String r3 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            r10.A00 = r3     // Catch:{ all -> 0x0477 }
            X.6z2 r10 = r9.A04     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = "data8"
            java.lang.String r3 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            r10.A02 = r3     // Catch:{ all -> 0x0477 }
            X.6z2 r10 = r9.A04     // Catch:{ all -> 0x0477 }
            r3 = r17
            java.lang.String r3 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            r10.A04 = r3     // Catch:{ all -> 0x0477 }
            X.6z2 r10 = r9.A04     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = "data10"
            java.lang.String r3 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            r10.A01 = r3     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = X.C17890vO.A0S(r2, r6)     // Catch:{ all -> 0x0477 }
            r9.A03 = r3     // Catch:{ all -> 0x0477 }
            int r10 = X.C17890vO.A01(r2, r7)     // Catch:{ all -> 0x0477 }
            r3 = 1
            if (r10 == r0) goto L_0x0223
            r3 = 0
        L_0x0223:
            r9.A05 = r3     // Catch:{ all -> 0x0477 }
            java.util.List r3 = r1.A03     // Catch:{ all -> 0x0477 }
            r3.add(r9)     // Catch:{ all -> 0x0477 }
            goto L_0x01af
        L_0x022b:
            r2.close()
            goto L_0x0192
        L_0x0230:
            boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x0258
            int r11 = X.C17890vO.A01(r2, r4)     // Catch:{ all -> 0x0477 }
            java.lang.String r10 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0477 }
            java.util.List r9 = r1.A07     // Catch:{ all -> 0x0477 }
            if (r9 != 0) goto L_0x0248
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0477 }
            r1.A07 = r9     // Catch:{ all -> 0x0477 }
        L_0x0248:
            X.6fc r3 = new X.6fc     // Catch:{ all -> 0x0477 }
            r3.<init>()     // Catch:{ all -> 0x0477 }
            r3.A00 = r11     // Catch:{ all -> 0x0477 }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0477 }
            r3.A01 = r10     // Catch:{ all -> 0x0477 }
            r9.add(r3)     // Catch:{ all -> 0x0477 }
            goto L_0x0230
        L_0x0258:
            r2.close()
            goto L_0x0180
        L_0x025d:
            boolean r2 = r13.moveToNext()     // Catch:{ all -> 0x046e }
            if (r2 == 0) goto L_0x0296
            java.lang.Class<android.provider.ContactsContract$CommonDataKinds$Email> r14 = android.provider.ContactsContract.CommonDataKinds.Email.class
            int r12 = X.C17890vO.A01(r13, r4)     // Catch:{ all -> 0x046e }
            java.lang.String r11 = X.C17890vO.A0S(r13, r5)     // Catch:{ all -> 0x046e }
            java.lang.String r10 = X.C17890vO.A0S(r13, r6)     // Catch:{ all -> 0x046e }
            int r2 = X.C17890vO.A01(r13, r7)     // Catch:{ all -> 0x046e }
            boolean r9 = X.AnonymousClass000.A1T(r2, r0)
            java.util.List r3 = r1.A03     // Catch:{ all -> 0x046e }
            if (r3 != 0) goto L_0x0283
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x046e }
            r1.A03 = r3     // Catch:{ all -> 0x046e }
        L_0x0283:
            X.6jA r2 = new X.6jA     // Catch:{ all -> 0x046e }
            r2.<init>()     // Catch:{ all -> 0x046e }
            r2.A01 = r14     // Catch:{ all -> 0x046e }
            r2.A00 = r12     // Catch:{ all -> 0x046e }
            r2.A02 = r11     // Catch:{ all -> 0x046e }
            r2.A03 = r10     // Catch:{ all -> 0x046e }
            r2.A05 = r9     // Catch:{ all -> 0x046e }
            r3.add(r2)     // Catch:{ all -> 0x046e }
            goto L_0x025d
        L_0x0296:
            r13.close()
            goto L_0x0155
        L_0x029b:
            boolean r9 = r2.moveToNext()     // Catch:{ all -> 0x0473 }
            if (r9 == 0) goto L_0x02c7
            java.lang.String r9 = X.C17890vO.A0S(r2, r14)     // Catch:{ all -> 0x0473 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0473 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x0473 }
            int r31 = X.C17890vO.A01(r2, r4)     // Catch:{ all -> 0x0473 }
            java.lang.String r29 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0473 }
            java.lang.String r30 = X.C17890vO.A0S(r2, r6)     // Catch:{ all -> 0x0473 }
            int r10 = X.C17890vO.A01(r2, r7)     // Catch:{ all -> 0x0473 }
            boolean r32 = X.AnonymousClass000.A1T(r10, r3)
            r27 = r1
            r28 = r9
            r27.A03(r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0473 }
            goto L_0x029b
        L_0x02c7:
            r8.A07(r1)     // Catch:{ all -> 0x0473 }
            r2.close()
            goto L_0x013e
        L_0x02cf:
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x030b
            java.lang.String r4 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0477 }
            r3 = r19
            java.lang.String r9 = X.C17890vO.A0S(r2, r3)     // Catch:{ all -> 0x0477 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0477 }
            if (r9 == 0) goto L_0x0308
            int r3 = r9.length()     // Catch:{ all -> 0x0477 }
            if (r3 == 0) goto L_0x0308
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0477 }
            java.lang.String r3 = ";"
            java.lang.String r3 = X.AnonymousClass001.A1H(r3, r9, r4)     // Catch:{ all -> 0x0477 }
        L_0x02f5:
            java.lang.String r6 = X.AnonymousClass000.A0y(r3, r6)     // Catch:{ all -> 0x0477 }
            java.lang.String r4 = X.C17890vO.A0S(r2, r15)     // Catch:{ all -> 0x0477 }
            int r3 = r2.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0477 }
            r2.getInt(r3)     // Catch:{ all -> 0x0477 }
            r1.A04(r6, r4)     // Catch:{ all -> 0x0477 }
            goto L_0x030b
        L_0x0308:
            java.lang.String r3 = ""
            goto L_0x02f5
        L_0x030b:
            r2.close()
        L_0x030e:
            java.lang.String[] r25 = X.C17880vN.A1Z()
            r25[r16] = r20
            java.lang.String r2 = "vnd.android.cursor.item/photo"
            r25[r0] = r2
            X.11B r21 = X.C108955ca.A0d(r33)
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = "data15"
            r0[r16] = r3
            java.lang.String r24 = "contact_id = ? AND mimetype = ? "
            r23 = r0
            android.database.Cursor r2 = r21.A03(r22, r23, r24, r25, r26)
            if (r2 == 0) goto L_0x033f
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x033c
            int r0 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0477 }
            byte[] r0 = r2.getBlob(r0)     // Catch:{ all -> 0x0477 }
            r1.A0B = r0     // Catch:{ all -> 0x0477 }
        L_0x033c:
            r2.close()
        L_0x033f:
            java.lang.String[] r13 = X.C17880vN.A1Z()
            r13[r16] = r20
            r2 = 1
            java.lang.String r0 = "vnd.android.cursor.item/nickname"
            r13[r2] = r0
            X.11B r9 = X.C108955ca.A0d(r33)
            android.database.Cursor r2 = r9.A03(r10, r11, r12, r13, r14)
            if (r2 == 0) goto L_0x036f
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x036c
            X.6tl r3 = new X.6tl     // Catch:{ all -> 0x0477 }
            r3.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = "NICKNAME"
            r3.A01 = r0     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0477 }
            r3.A02 = r0     // Catch:{ all -> 0x0477 }
            r1.A05(r3)     // Catch:{ all -> 0x0477 }
        L_0x036c:
            r2.close()
        L_0x036f:
            r4 = 3
            java.lang.String[] r3 = new java.lang.String[r4]
            r3[r16] = r20
            r2 = 1
            java.lang.String r0 = "vnd.android.cursor.item/contact_event"
            r3[r2] = r0
            r0 = 2
            X.C17880vN.A1S(r3, r4, r0)
            X.11B r9 = X.C108955ca.A0d(r33)
            java.lang.String r12 = "contact_id = ? AND mimetype = ? AND data2 =? "
            r13 = r3
            android.database.Cursor r6 = r9.A03(r10, r11, r12, r13, r14)
            if (r6 == 0) goto L_0x03da
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x03d7
            X.6tl r7 = new X.6tl     // Catch:{ all -> 0x03d2 }
            r7.<init>()     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = "BDAY"
            r7.A01 = r0     // Catch:{ all -> 0x03d2 }
            java.lang.String r4 = X.C17890vO.A0S(r6, r5)     // Catch:{ all -> 0x03d2 }
            if (r4 != 0) goto L_0x03a1
            r4 = 0
            goto L_0x03cc
        L_0x03a1:
            X.9nr r0 = X.A87.A01     // Catch:{ ParseException -> 0x03ba }
            java.lang.Object r2 = r0.A01()     // Catch:{ ParseException -> 0x03ba }
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch:{ ParseException -> 0x03ba }
            X.9nr r0 = X.A87.A00     // Catch:{ ParseException -> 0x03ba }
            java.lang.Object r0 = r0.A01()     // Catch:{ ParseException -> 0x03ba }
            java.text.DateFormat r0 = (java.text.DateFormat) r0     // Catch:{ ParseException -> 0x03ba }
            java.util.Date r0 = r0.parse(r4)     // Catch:{ ParseException -> 0x03ba }
            java.lang.String r4 = r2.format(r0)     // Catch:{ ParseException -> 0x03ba }
            goto L_0x03cc
        L_0x03ba:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = "Date string '"
            r2.append(r0)     // Catch:{ all -> 0x03d2 }
            r2.append(r4)     // Catch:{ all -> 0x03d2 }
            java.lang.String r0 = "' not in format of <MMM dd, yyyy>"
            X.C108985cd.A1M(r0, r2, r3)     // Catch:{ all -> 0x03d2 }
        L_0x03cc:
            r7.A02 = r4     // Catch:{ all -> 0x03d2 }
            r1.A05(r7)     // Catch:{ all -> 0x03d2 }
            goto L_0x03d7
        L_0x03d2:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x047c }
            throw r1
        L_0x03d7:
            r6.close()
        L_0x03da:
            java.lang.String[] r13 = X.C17880vN.A1Z()
            r13[r16] = r20
            r2 = 1
            java.lang.String r0 = "vnd.android.cursor.item/im"
            r13[r2] = r0
            X.11B r9 = X.C108955ca.A0d(r33)
            r12 = r24
            android.database.Cursor r2 = r9.A03(r10, r11, r12, r13, r14)
            if (r2 != 0) goto L_0x0400
        L_0x03f1:
            r0 = r36
            r8.A04(r0)
            X.6yH r2 = new X.6yH
            r3 = r35
            r0 = r34
            r2.<init>(r3, r0)
            goto L_0x045d
        L_0x0400:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0459
            r0 = r19
            int r10 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0477 }
            X.6tl r6 = new X.6tl     // Catch:{ all -> 0x0477 }
            r6.<init>()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = X.C17890vO.A0S(r2, r5)     // Catch:{ all -> 0x0477 }
            r6.A02 = r0     // Catch:{ all -> 0x0477 }
            X.0vb r9 = r8.A03     // Catch:{ all -> 0x0477 }
            int r0 = android.provider.ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(r10)     // Catch:{ all -> 0x0477 }
            java.lang.String r7 = r9.A0A(r0)     // Catch:{ all -> 0x0477 }
            java.util.HashMap r0 = X.AnonymousClass73C.A0D     // Catch:{ all -> 0x0477 }
            java.util.Iterator r4 = X.C17890vO.A0i(r0)     // Catch:{ all -> 0x0477 }
        L_0x0427:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0444
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r4)     // Catch:{ all -> 0x0477 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0477 }
            boolean r0 = r0.equalsIgnoreCase(r7)     // Catch:{ all -> 0x0477 }
            if (r0 == 0) goto L_0x0427
            java.lang.String r0 = X.C17880vN.A0x(r3)     // Catch:{ all -> 0x0477 }
            r6.A01 = r0     // Catch:{ all -> 0x0477 }
            goto L_0x0427
        L_0x0444:
            int r0 = android.provider.ContactsContract.CommonDataKinds.Im.getTypeLabelResource(r10)     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = r9.A0A(r0)     // Catch:{ all -> 0x0477 }
            java.util.Set r3 = r6.A04     // Catch:{ all -> 0x0477 }
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ all -> 0x0477 }
            r3.add(r0)     // Catch:{ all -> 0x0477 }
            r1.A05(r6)     // Catch:{ all -> 0x0477 }
            goto L_0x0400
        L_0x0459:
            r2.close()
            goto L_0x03f1
        L_0x045d:
            java.lang.String r0 = r2.A01(r1)     // Catch:{ 1iZ -> 0x0462 }
            return r0
        L_0x0462:
            r2 = move-exception
            java.lang.String r1 = "Could not create VCard"
            X.2RP r0 = new X.2RP
            r0.<init>(r2)
            com.whatsapp.util.Log.e(r1, r0)
            return r26
        L_0x046e:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x047c }
            throw r1
        L_0x0473:
            r1 = move-exception
            if (r2 == 0) goto L_0x0480
            goto L_0x0478
        L_0x0477:
            r1 = move-exception
        L_0x0478:
            r2.close()     // Catch:{ all -> 0x047c }
            throw r1
        L_0x047c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x0480:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.PhoneContactsSelector.A0z(X.1LA, X.1Ty, X.1M9, X.25N, X.11C, X.118, X.0vb):java.lang.String");
    }
}
