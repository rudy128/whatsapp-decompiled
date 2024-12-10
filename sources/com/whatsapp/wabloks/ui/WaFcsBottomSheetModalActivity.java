package com.whatsapp.wabloks.ui;

import X.A2V;
import X.A2X;
import X.AnonymousClass00H;
import X.AnonymousClass1GP;
import X.AnonymousClass3MY;
import X.AnonymousClass6Nu;
import X.AnonymousClass7NI;
import X.AnonymousClass7RN;
import X.AnonymousClass86V;
import X.AnonymousClass86W;
import X.AnonymousClass89U;
import X.AnonymousClass8BI;
import X.B9Z;
import X.C108945cZ;
import X.C108975cc;
import X.C114905sB;
import X.C128046fM;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C197609wy;
import X.C21101AeV;
import X.C56382hN;
import X.CXN;
import X.CXY;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.wabloks.base.FdsContentFragmentManager;
import java.util.Map;
import java.util.Queue;

public class WaFcsBottomSheetModalActivity extends C114905sB implements AnonymousClass89U, B9Z, AnonymousClass8BI {
    public C56382hN A00;
    public CXN A01;
    public FcsBottomSheetBaseContainer A02;
    public AnonymousClass00H A03;
    public Map A04;
    public A2X A05;

    public CXY Bbg() {
        return C197609wy.A00(this, getSupportFragmentManager(), this.A00, this.A04);
    }

    public void CL9(boolean z) {
        this.A02.CL9(z);
    }

    public void CR1(AnonymousClass86W r5) {
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A02;
        C128046fM r2 = (C128046fM) fcsBottomSheetBaseContainer.A0Q.get();
        AnonymousClass7RN r1 = new AnonymousClass7RN(r5, fcsBottomSheetBaseContainer, 24);
        if (r2.A00) {
            r2.A01.add(r1);
        } else {
            r1.run();
        }
    }

    public void CR2(AnonymousClass86V r5, AnonymousClass86W r6, boolean z) {
        Toolbar toolbar;
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = this.A02;
        AnonymousClass6Nu r0 = fcsBottomSheetBaseContainer.A0C;
        if (r0 != null) {
            r0.A01(r5, r6);
        }
        if (z && (toolbar = fcsBottomSheetBaseContainer.A03) != null) {
            Menu menu = toolbar.getMenu();
            C18070vi.A0X(menu);
            MenuInflater menuInflater = fcsBottomSheetBaseContainer.A1D().getMenuInflater();
            C18070vi.A0X(menuInflater);
            fcsBottomSheetBaseContainer.A22(menu, menuInflater);
            Menu menu2 = toolbar.getMenu();
            C18070vi.A0X(menu2);
            if (menu2.size() == 0) {
                C108975cc.A0r(fcsBottomSheetBaseContainer.A02);
            }
        }
    }

    public void A2a() {
        super.A2a();
        FdsContentFragmentManager fdsContentFragmentManager = this.A02.A0B;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = true;
            while (true) {
                Queue queue = fdsContentFragmentManager.A03;
                if (!queue.isEmpty()) {
                    C108945cZ.A1P(queue.remove());
                } else {
                    return;
                }
            }
        }
    }

    public FcsBottomSheetBaseContainer A4b() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("fds_observer_id");
        String stringExtra2 = intent.getStringExtra("fds_on_back");
        String stringExtra3 = intent.getStringExtra("fds_on_back_params");
        String stringExtra4 = intent.getStringExtra("fds_button_style");
        String stringExtra5 = intent.getStringExtra("fds_state_name");
        int intExtra = intent.getIntExtra("fcs_bottom_sheet_max_height_percentage", 100);
        boolean A1a = AnonymousClass3MY.A1a(intent, "fcs_show_divider_under_nav_bar");
        FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = new FcsBottomSheetBaseContainer();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("fds_observer_id", stringExtra);
        A0D.putString("fds_on_back", stringExtra2);
        A0D.putString("fds_on_back_params", stringExtra3);
        A0D.putString("fds_button_style", stringExtra4);
        A0D.putString("fds_state_name", stringExtra5);
        A0D.putInt("fcs_bottom_sheet_max_height_percentage", intExtra);
        A0D.putBoolean("fcs_show_divider_under_nav_bar", A1a);
        fcsBottomSheetBaseContainer.A1R(A0D);
        return fcsBottomSheetBaseContainer;
    }

    public CXN BNV() {
        return this.A01;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setStatusBarColor(getResources().getColor(2131102739));
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        A2X A022 = ((A2V) this.A03.get()).A02(getIntent().getStringExtra("fds_observer_id"));
        this.A05 = A022;
        AnonymousClass7NI.A00(A022, C21101AeV.class, this, 17);
        FcsBottomSheetBaseContainer A4b = A4b();
        this.A02 = A4b;
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        C17960vV.A07(supportFragmentManager);
        A4b.A2C(supportFragmentManager, "fds_bottom_sheet_container");
    }

    public void onDestroy() {
        super.onDestroy();
        A2X a2x = this.A05;
        if (a2x != null) {
            a2x.A04(this);
        }
        this.A05 = null;
    }

    public void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        FdsContentFragmentManager fdsContentFragmentManager = this.A02.A0B;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        FdsContentFragmentManager fdsContentFragmentManager = this.A02.A0B;
        if (fdsContentFragmentManager != null) {
            fdsContentFragmentManager.A01 = false;
        }
    }
}
