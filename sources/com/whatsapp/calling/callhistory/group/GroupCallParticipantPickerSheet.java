package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3ND;
import X.AnonymousClass48l;
import X.AnonymousClass4aX;
import X.C000200d;
import X.C18000vb;
import X.C24261Jm;
import X.C37891qK;
import X.C41501wV;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74483bk;
import X.C74803cp;
import X.C89874dA;
import X.C89994dM;
import X.C90334du;
import X.C90584eJ;
import X.C90994ey;
import X.C91184fH;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class GroupCallParticipantPickerSheet extends GroupCallParticipantPicker {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public BottomSheetBehavior A05;
    public boolean A06;
    public View A07;
    public SearchView A08;
    public boolean A09;
    public final ViewTreeObserver.OnGlobalLayoutListener A0A;

    public GroupCallParticipantPickerSheet() {
        this(0);
        this.A0A = new C90584eJ((Object) this, 7);
    }

    public static void A0z(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        groupCallParticipantPickerSheet.A08.A0N("");
        C37891qK r1 = (C37891qK) groupCallParticipantPickerSheet.A03.getLayoutParams();
        r1.A00(groupCallParticipantPickerSheet.A05);
        r1.height = (int) groupCallParticipantPickerSheet.A00;
        groupCallParticipantPickerSheet.A03.setLayoutParams(r1);
        groupCallParticipantPickerSheet.A07.setVisibility(0);
        groupCallParticipantPickerSheet.A04.setVisibility(8);
    }

    public static void A11(GroupCallParticipantPickerSheet groupCallParticipantPickerSheet) {
        C37891qK r1 = (C37891qK) groupCallParticipantPickerSheet.A03.getLayoutParams();
        r1.A00((C41501wV) null);
        r1.height = -1;
        groupCallParticipantPickerSheet.A03.setLayoutParams(r1);
        groupCallParticipantPickerSheet.A08.A0H();
        groupCallParticipantPickerSheet.A07.setVisibility(8);
        groupCallParticipantPickerSheet.A04.setVisibility(0);
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A02 = AnonymousClass3MZ.A0W(r2);
            this.A06 = C000200d.A00(r1.A00);
            this.A0I = C000200d.A00(r2.A7g);
            C74803cp.A0q(A0K, r2, r1, this, r1.A0d);
        }
    }

    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A0z(this);
        } else {
            this.A05.A0W(5);
        }
    }

    private void A0y() {
        int size;
        Point A0D = C72483Me.A0D(this);
        Rect A072 = AnonymousClass3MW.A07();
        AnonymousClass3MZ.A0F(this).getWindowVisibleDisplayFrame(A072);
        float f = (float) (A0D.y - A072.top);
        this.A01 = f;
        this.A00 = (float) ((int) (f * 0.75f));
        if (!AnonymousClass1Y5.A0D(this.A08.A0M())) {
            int i = (int) (this.A01 * 0.55f);
            int A002 = AnonymousClass3MX.A00(getResources(), 2131167073, AnonymousClass3MZ.A01(this, 2131166938));
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131166080);
            int i2 = i + ((dimensionPixelSize / 2) - ((i - A002) % dimensionPixelSize));
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
            if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
                i2 = Math.min(i2, A002 + this.A0A.getSelectedContactsLayoutHeight() + (dimensionPixelSize * size));
            }
            this.A05.A0Y(i2, false);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0y();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
            layoutParams.height = (int) this.A00;
            this.A03.setLayoutParams(layoutParams);
        }
        this.A06 = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A03.requestLayout();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(2131427472).setVisibility(8);
        getWindow().addFlags(Integer.MIN_VALUE);
        View findViewById = findViewById(2131428345);
        this.A03 = findViewById;
        this.A05 = BottomSheetBehavior.A02(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        this.A05.A0d(true);
        this.A05.A0W(5);
        A0y();
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = (int) this.A00;
        this.A03.setLayoutParams(layoutParams);
        getListView().setNestedScrollingEnabled(true);
        View findViewById2 = findViewById(2131428018);
        findViewById2.setImportantForAccessibility(2);
        PointF pointF = new PointF();
        C89994dM.A00(findViewById2, this, pointF, 24);
        C90334du.A00(findViewById2, pointF, 2);
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        findViewById2.setBackground(colorDrawable);
        AlphaAnimation A0Q = C72463Mc.A0Q();
        A0Q.setDuration((long) getResources().getInteger(17694720));
        findViewById2.startAnimation(A0Q);
        this.A05.A0a(new C74483bk(this, 0));
        this.A07 = findViewById(2131436230);
        View findViewById3 = findViewById(2131434899);
        this.A04 = findViewById3;
        findViewById3.setBackgroundResource(2131232920);
        this.A04.setVisibility(8);
        SearchView searchView = (SearchView) this.A04.findViewById(2131434976);
        this.A08 = searchView;
        searchView.setIconifiedByDefault(false);
        this.A08.setQueryHint(getString(2131890901));
        AnonymousClass3MW.A0H(this.A08, 2131434914).setImageDrawable(new AnonymousClass3ND(C24261Jm.A00(this, 2131231675), this));
        C91184fH.A00(this.A08, this, 1);
        ImageView A0H = AnonymousClass3MW.A0H(this.A04, 2131434851);
        C18000vb r4 = this.A0F;
        Drawable drawable = getResources().getDrawable(2131231675);
        A0H.setImageDrawable(AnonymousClass4aX.A0A(A0H.getContext(), getResources(), drawable, r4));
        AnonymousClass48l.A00(A0H, this, 12);
        C89874dA.A00(findViewById(2131434858), this, 21);
        ArrayList A0r = C72463Mc.A0r(getIntent(), UserJid.class);
        TextView A0L = AnonymousClass3MX.A0L(this, 2131435407);
        int i = 2131890899;
        if (A0r.size() == 1) {
            i = 2131890900;
        }
        A0L.setText(i);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A11(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", AnonymousClass000.A1P(this.A04.getVisibility()));
    }

    public GroupCallParticipantPickerSheet(int i) {
        this.A09 = false;
        C90994ey.A00(this, 28);
    }
}
