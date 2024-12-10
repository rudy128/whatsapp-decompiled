package com.whatsapp.payments.ui;

import X.AGD;
import X.AGK;
import X.AQ9;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4VZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.AnonymousClass8D9;
import X.AnonymousClass8FO;
import X.BD4;
import X.C000200d;
import X.C003401n;
import X.C137116uw;
import X.C177759Al;
import X.C177869Ax;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C184879bf;
import X.C20087A6p;
import X.C20112A7u;
import X.C20311AFt;
import X.C23581Gv;
import X.C24671Lf;
import X.C24751Ln;
import X.C24921Me;
import X.C27201Vd;
import X.C37451pZ;
import X.C37551pj;
import X.C63662tU;
import X.C63932tv;
import X.C72043Kk;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class PaymentGroupParticipantPickerActivity extends AnonymousClass1FY {
    public C72043Kk A00;
    public AnonymousClass1M9 A01;
    public C24671Lf A02;
    public C24921Me A03;
    public C37451pZ A04;
    public C27201Vd A05;
    public AnonymousClass118 A06;
    public AnonymousClass1MZ A07;
    public C24751Ln A08;
    public AnonymousClass1LU A09;
    public GroupJid A0A;
    public AnonymousClass1QO A0B;
    public AnonymousClass1QS A0C;
    public C177869Ax A0D;
    public AnonymousClass8D9 A0E;
    public AnonymousClass8FO A0F;
    public AnonymousClass00H A0G;
    public String A0H;
    public ArrayList A0I;
    public ListView A0J;
    public C177759Al A0K;
    public AnonymousClass4VZ A0L;
    public boolean A0M;
    public final ArrayList A0N;
    public final C23581Gv A0O;

    public void onCreate(Bundle bundle) {
        AnonymousClass8BW.A0y(this);
        super.onCreate(bundle);
        this.A0F = (AnonymousClass8FO) AnonymousClass3MW.A0N(this).A00(AnonymousClass8FO.class);
        this.A04 = this.A05.A06(this, "payment-group-participant-picker");
        this.A0A = GroupJid.Companion.A03(AnonymousClass8BS.A05(this, 2131626361).getStringExtra("extra_jid"));
        Intent intent = getIntent();
        if (intent != null) {
            this.A0H = intent.getStringExtra("referral_screen");
        }
        this.A0E = new AnonymousClass8D9(this, this, this.A0N);
        ListView listView = (ListView) findViewById(2131431273);
        this.A0J = listView;
        listView.setAdapter(this.A0E);
        this.A0J.setOnItemClickListener(new C20311AFt(intent, this, 2));
        registerForContextMenu(this.A0J);
        this.A02.registerObserver(this.A0O);
        Toolbar A0G2 = AnonymousClass3Ma.A0G(this);
        setSupportActionBar(A0G2);
        this.A0L = new AnonymousClass4VZ(this, findViewById(2131434898), new AGK(this, 4), A0G2, this.A00);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0M(2131893940);
            supportActionBar.A0W(true);
        }
        C177869Ax r1 = this.A0D;
        if (r1 != null) {
            r1.A0B(true);
            this.A0D = null;
        }
        C177759Al r12 = new C177759Al(this);
        this.A0K = r12;
        C17890vO.A0u(r12, this.A05);
        CNA(2131895077);
        BD4 A0U = AnonymousClass8BT.A0U(this.A0C);
        if (A0U != null) {
            C20087A6p.A03((C20112A7u) null, A0U, "payment_contact_picker", this.A0H);
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AnonymousClass1E7 r4 = ((C184879bf) ((AdapterView) view).getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position)).A00;
        if (AnonymousClass3MW.A0V(this.A0G).A0P(AnonymousClass3MZ.A0x(r4))) {
            contextMenu.add(0, 0, 0, C17880vN.A0q(this, this.A03.A0I(r4), AnonymousClass3MW.A1a(), 0, 2131887193));
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
    }

    public static void A03(Intent intent, UserJid userJid, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity) {
        Intent A072 = AnonymousClass8BR.A07(paymentGroupParticipantPickerActivity.A06.A00, paymentGroupParticipantPickerActivity.A0C.A06().BYz());
        if (intent != null) {
            A072.putExtras(intent);
        }
        A072.putExtra("extra_jid", paymentGroupParticipantPickerActivity.A0A.getRawString());
        AnonymousClass3MY.A13(A072, userJid, "extra_receiver_jid");
        A072.putExtra("extra_referral_screen", "payment_contact_picker");
        paymentGroupParticipantPickerActivity.finish();
        paymentGroupParticipantPickerActivity.startActivity(A072);
    }

    public void A2y() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A06 = AnonymousClass3MZ.A0l(r2);
            this.A09 = AnonymousClass3MY.A0Z(r2);
            this.A05 = AnonymousClass3MZ.A0i(r2);
            this.A01 = AnonymousClass10E.A4z(r2);
            this.A03 = AnonymousClass3MZ.A0g(r2);
            this.A0C = AnonymousClass3MZ.A0z(r2);
            this.A0G = C000200d.A00(r2.A0x);
            this.A02 = AnonymousClass3Ma.A0S(r2);
            this.A08 = AnonymousClass3MZ.A0q(r2);
            this.A0B = AnonymousClass3Ma.A0q(r2);
            this.A07 = AnonymousClass3MY.A0V(r2);
            this.A00 = AnonymousClass3MZ.A0T(r1);
        }
    }

    public void onBackPressed() {
        if (this.A0L.A0C()) {
            this.A0L.A05(true);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onSearchRequested() {
        this.A0L.A06(false);
        return false;
    }

    public PaymentGroupParticipantPickerActivity(int i) {
        this.A0M = false;
        AGD.A00(this, 46);
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C184879bf r0 = (C184879bf) this.A0J.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (r0 != null) {
            AnonymousClass1E7 r2 = r0.A00;
            if (menuItem.getItemId() == 0) {
                C37551pj A0V = AnonymousClass3MW.A0V(this.A0G);
                Jid A012 = AnonymousClass1E7.A01(r2);
                C17960vV.A07(A012);
                A0V.A0I(this, (UserJid) A012);
                return true;
            }
        }
        return super.onContextItemSelected(menuItem);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass8BY.A0C(this, menu, 2131432620).setShowAsAction(10);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A04.A02();
        this.A02.unregisterObserver(this.A0O);
        C177869Ax r0 = this.A0D;
        if (r0 != null) {
            r0.A0B(true);
            this.A0D = null;
        }
        C177759Al r02 = this.A0K;
        if (r02 != null) {
            r02.A0B(true);
            this.A0K = null;
        }
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

    public PaymentGroupParticipantPickerActivity() {
        this(0);
        this.A0N = AnonymousClass000.A13();
        this.A0O = new AQ9(this, 3);
    }
}
