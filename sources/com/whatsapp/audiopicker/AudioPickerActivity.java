package com.whatsapp.audiopicker;

import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass4a6;
import X.AnonymousClass4aV;
import X.AnonymousClass71W;
import X.AnonymousClass757;
import X.C003401n;
import X.C110295fF;
import X.C111345jZ;
import X.C114995t6;
import X.C130656jn;
import X.C134196qC;
import X.C136166tN;
import X.C136736uJ;
import X.C1424779p;
import X.C145777Mo;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C181769Rt;
import X.C24494C6m;
import X.C24771Lp;
import X.C24921Me;
import X.C26144Ct7;
import X.C27201Vd;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C37451pZ;
import X.C72453Mb;
import X.C73203Rj;
import X.C87544Vz;
import X.C88184Yq;
import X.E8R;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class AudioPickerActivity extends C114995t6 implements E8R {
    public View A00;
    public ImageButton A01;
    public RelativeLayout A02;
    public C110295fF A03;
    public C24771Lp A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C37451pZ A07;
    public C27201Vd A08;
    public C88184Yq A09;
    public C134196qC A0A;
    public C31131f4 A0B;
    public C136166tN A0C;
    public AnonymousClass4VZ A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public String A0I;
    public ArrayList A0J;
    public LinkedHashMap A0K;
    public AudioManager A0L;
    public Menu A0M;
    public ListView A0N;
    public RelativeLayout A0O;
    public TextView A0P;
    public BottomSheetBehavior A0Q;
    public AnonymousClass1E7 A0R;
    public boolean A0S;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A002 = C87544Vz.A00(this.A0E);
        this.A0S = A002;
        int i = 2131624014;
        if (A002) {
            i = 2131624015;
        }
        setContentView(i);
        this.A0K = C17880vN.A13();
        this.A0C = new C136166tN(new Handler(), this.A04, this.A08, "image-loader-audio-picker");
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        setSupportActionBar(A0G2);
        this.A0D = new AnonymousClass4VZ(this, findViewById(2131434898), new C1424779p(this, 1), A0G2, this.A00);
        AnonymousClass1M9 r1 = this.A05;
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(C72453Mb.A0u(this));
        C17960vV.A07(A0l);
        this.A0R = r1.A0H(A0l);
        C003401n supportActionBar = getSupportActionBar();
        C17960vV.A08(supportActionBar, "supportActionBar is null");
        supportActionBar.A0W(true);
        supportActionBar.A0S(C17880vN.A0q(this, this.A06.A0P(this.A0R), new Object[1], 0, 2131899383));
        this.A0O = (RelativeLayout) findViewById(2131433135);
        this.A02 = (RelativeLayout) findViewById(2131432154);
        this.A0P = AnonymousClass3MX.A0L(this, 2131430354);
        ListView listView = getListView();
        this.A0N = listView;
        listView.setBackground((Drawable) null);
        ImageButton imageButton = (ImageButton) findViewById(2131430767);
        this.A01 = imageButton;
        AnonymousClass71W.A00(imageButton, false, false);
        AnonymousClass3MZ.A1N(this.A01, this, 48);
        AnonymousClass3MY.A0w(this, this.A01, 2131899381);
        C110295fF r0 = new C110295fF(this, this);
        this.A03 = r0;
        A4b(r0);
        this.A0L = this.A08.A0D();
        if (this.A0S) {
            View A062 = AnonymousClass1HF.A06(this.A00, 2131427901);
            this.A0Q = new BottomSheetBehavior();
            ((C136736uJ) this.A0E.get()).A01(A062, this.A0Q, this, this.A09);
            C181769Rt.A00(this, supportActionBar);
            ((C136736uJ) this.A0E.get()).A03(this.A0Q, false);
        }
    }

    public /* synthetic */ void A4c() {
        String A0K2;
        String A0I2 = this.A06.A0I(this.A0R);
        LinkedHashMap linkedHashMap = this.A0K;
        int size = linkedHashMap.size();
        if (size == 1) {
            String str = ((C130656jn) C17890vO.A0j(linkedHashMap).next()).A07;
            int i = 2131888726;
            if (this.A0R.A0F()) {
                i = 2131890913;
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            A0K2 = C17880vN.A0q(this, A0I2, objArr, 1, i);
        } else {
            C18000vb r4 = this.A00;
            int i2 = 2131755068;
            if (this.A0R.A0F()) {
                i2 = 2131755168;
            }
            Object[] objArr2 = new Object[2];
            C17880vN.A1T(objArr2, size, 0);
            objArr2[1] = A0I2;
            A0K2 = r4.A0K(objArr2, i2, (long) size);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0S(A0K2);
        AnonymousClass757.A01(A002, this, 3, 2131899381);
        A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
        AnonymousClass3MY.A1G(A002);
    }

    public C24494C6m BqU(Bundle bundle) {
        return new C111345jZ(this, this.A08.A0O(), this.A0J);
    }

    public /* bridge */ /* synthetic */ void Bx0(Object obj) {
        this.A03.swapCursor((Cursor) obj);
        A0z();
    }

    public void Bx8() {
        this.A03.swapCursor((Cursor) null);
        A0z();
    }

    public void onBackPressed() {
        if (this.A0D.A0C()) {
            if (!this.A0K.isEmpty()) {
                AnonymousClass71W.A00(this.A01, true, true);
            }
            this.A0D.A05(true);
            return;
        }
        super.onBackPressed();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AudioManager audioManager = this.A0L;
        if (audioManager != null) {
            if (i == 24) {
                audioManager.adjustStreamVolume(3, 1, 1);
                return true;
            } else if (i == 25) {
                audioManager.adjustStreamVolume(3, -1, 1);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
        boolean z = ((C31161f7) this.A0G.get()).A03;
        View view = this.A00;
        if (z) {
            C18030ve r15 = this.A0E;
            AnonymousClass1KB r13 = this.A05;
            AnonymousClass11S r12 = this.A02;
            AnonymousClass10I r11 = this.A05;
            C27201Vd r10 = this.A08;
            AnonymousClass1M9 r9 = this.A05;
            C24921Me r8 = this.A06;
            C18000vb r7 = this.A00;
            C134196qC r6 = this.A0A;
            C31131f4 r5 = this.A0B;
            AnonymousClass00H r4 = this.A0G;
            AnonymousClass00H r3 = this.A0H;
            View view2 = this.A00;
            C18030ve r26 = r15;
            C31131f4 r24 = r5;
            C134196qC r23 = r6;
            C27201Vd r22 = r10;
            C37451pZ r21 = this.A07;
            C24921Me r20 = r8;
            AnonymousClass1M9 r19 = r9;
            AnonymousClass11S r18 = r12;
            AnonymousClass1KB r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r7, r26, this.A0F, r11, r4, r3, "audio-picker-activity");
            this.A00 = (View) A002.first;
            this.A07 = (C37451pZ) A002.second;
        } else if (C31181f9.A00(view)) {
            AnonymousClass4aV.A03(this.A00, this.A0B, this.A0G);
        }
        ((C31161f7) this.A0G.get()).A00();
    }

    public boolean onSearchRequested() {
        AnonymousClass71W.A00(this.A01, false, true);
        this.A0D.A06(this.A0S);
        AnonymousClass3MZ.A1N(findViewById(2131434851), this, 49);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0z() {
        /*
            r10 = this;
            X.01n r9 = r10.getSupportActionBar()
            java.lang.String r0 = "supportActionBar is null"
            X.C17960vV.A08(r9, r0)
            java.util.LinkedHashMap r0 = r10.A0K
            java.util.Iterator r1 = X.C17890vO.A0j(r0)
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            X.6jn r0 = (X.C130656jn) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0025
            boolean r0 = X.C108975cc.A1M(r0)
            if (r0 != 0) goto L_0x000f
        L_0x0025:
            r1.remove()
            goto L_0x000f
        L_0x0029:
            X.5fF r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            java.lang.String r4 = ""
            r7 = 1
            r2 = 8
            r6 = 0
            if (r0 != 0) goto L_0x0082
            android.widget.ListView r0 = r10.A0N
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A0O
            r0.setVisibility(r2)
            android.widget.RelativeLayout r0 = r10.A02
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A0P
            r0.setVisibility(r2)
            X.1f4 r0 = r10.A0B
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L_0x0058
            X.1f4 r0 = r10.A0B
            r0.A06()
        L_0x0058:
            r9.A0R(r4)
        L_0x005b:
            android.view.Menu r1 = r10.A0M
            if (r1 == 0) goto L_0x007f
            r0 = 2131432620(0x7f0b14ac, float:1.8487003E38)
            android.view.MenuItem r1 = r1.findItem(r0)
            if (r1 == 0) goto L_0x007f
            X.5fF r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x0080
            X.5fF r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0080
        L_0x007c:
            r1.setVisible(r7)
        L_0x007f:
            return
        L_0x0080:
            r7 = 0
            goto L_0x007c
        L_0x0082:
            android.widget.RelativeLayout r0 = r10.A02
            r0.setVisibility(r2)
            X.5fF r0 = r10.A03
            android.database.Cursor r0 = r0.getCursor()
            int r1 = r0.getCount()
            android.widget.ListView r0 = r10.A0N
            if (r1 != 0) goto L_0x00cc
            r0.setVisibility(r2)
            android.widget.ImageButton r0 = r10.A01
            X.AnonymousClass71W.A00(r0, r6, r6)
            X.4VZ r0 = r10.A0D
            boolean r1 = r0.A0C()
            android.widget.RelativeLayout r0 = r10.A0O
            if (r1 == 0) goto L_0x00be
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A0P
            r0.setVisibility(r6)
            android.widget.TextView r3 = r10.A0P
            r2 = 2131886786(0x7f1202c2, float:1.940816E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r10.A0I
            r1[r6] = r0
            X.AnonymousClass3MY.A0y(r10, r3, r1, r2)
            goto L_0x0058
        L_0x00be:
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A0P
            r0.setVisibility(r2)
            java.util.LinkedHashMap r0 = r10.A0K
            r0.clear()
            goto L_0x0058
        L_0x00cc:
            r0.setVisibility(r6)
            android.widget.RelativeLayout r0 = r10.A0O
            r0.setVisibility(r2)
            android.widget.TextView r0 = r10.A0P
            r0.setVisibility(r2)
            java.util.LinkedHashMap r8 = r10.A0K
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00f6
            r0 = 2131896777(0x7f1229c9, float:1.9428425E38)
            r9.A0L(r0)
        L_0x00e7:
            java.util.LinkedHashMap r0 = r10.A0K
            boolean r0 = r0.isEmpty()
            r1 = r0 ^ 1
            android.widget.ImageButton r0 = r10.A01
            X.AnonymousClass71W.A00(r0, r1, r6)
            goto L_0x005b
        L_0x00f6:
            X.0vb r5 = r10.A00
            r4 = 2131755264(0x7f100100, float:1.9141402E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r0 = r8.size()
            X.C17880vN.A1T(r1, r0, r6)
            java.lang.String r0 = r5.A0K(r1, r4, r2)
            r9.A0R(r0)
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.audiopicker.AudioPickerActivity.A0z():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        boolean z = false;
        MenuItem icon = menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271);
        if (this.A0S) {
            icon.setIcon(2131232269);
        }
        icon.setShowAsAction(10);
        this.A0M = menu;
        MenuItem findItem = menu.findItem(2131432620);
        if (findItem != null) {
            if (this.A0N.getCount() > 0) {
                z = true;
            }
            findItem.setVisible(z);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0C.A00();
        this.A0C = null;
        AnonymousClass4aV.A01(this.A00, this.A0B);
        C37451pZ r0 = this.A07;
        if (r0 != null) {
            r0.A02();
            this.A07 = null;
        }
        this.A09.A02(7);
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
        AnonymousClass4aV.A06(this.A0B);
        ((C31161f7) this.A0G.get()).A01(this.A00);
    }

    public void onStart() {
        super.onStart();
        A0z();
        C26144Ct7.A00(this).A02((Bundle) null, this);
    }

    public void onStop() {
        C145777Mo A002;
        super.onStop();
        if (!this.A0B.A0C() && (A002 = this.A0B.A00()) != null) {
            A002.A0A();
            this.A0B.A08((C145777Mo) null);
        }
    }
}
