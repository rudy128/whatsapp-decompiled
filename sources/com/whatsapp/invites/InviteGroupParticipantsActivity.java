package com.whatsapp.invites;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1L4;
import X.AnonymousClass1M9;
import X.AnonymousClass1PU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass48j;
import X.AnonymousClass493;
import X.AnonymousClass4O7;
import X.C108355bZ;
import X.C123626Ve;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C24921Me;
import X.C27191Vc;
import X.C27201Vd;
import X.C33251iW;
import X.C37451pZ;
import X.C43421zm;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73583Wn;
import X.C83804Gs;
import X.C90574eI;
import X.C91014f0;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaFrameLayout;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InviteGroupParticipantsActivity extends AnonymousClass1FY {
    public ImageView A00;
    public C33251iW A01;
    public C108355bZ A02;
    public AnonymousClass1M9 A03;
    public C24921Me A04;
    public C27201Vd A05;
    public C27191Vc A06;
    public C18000vb A07;
    public AnonymousClass1CJ A08;
    public AnonymousClass1E7 A09;
    public MentionableEntry A0A;
    public AnonymousClass1PU A0B;
    public List A0C;
    public byte[] A0D;
    public C37451pZ A0E;
    public boolean A0F;

    public InviteGroupParticipantsActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A08 = AnonymousClass3Ma.A0d(r2);
            this.A01 = AnonymousClass3MZ.A0U(r2);
            this.A05 = AnonymousClass3MZ.A0i(r2);
            this.A03 = AnonymousClass10E.A4z(r2);
            this.A04 = AnonymousClass3MZ.A0g(r2);
            this.A07 = AnonymousClass10E.A6Q(r2);
            this.A0B = AnonymousClass3MZ.A12(r2);
            this.A06 = AnonymousClass3MZ.A0j(r2);
            this.A02 = AnonymousClass3MZ.A0V(A0K);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131898700);
        setContentView(2131625737);
        LayoutInflater from = LayoutInflater.from(this);
        this.A0E = this.A05.A06(this, "invite-group-participants-activity");
        this.A0A = (MentionableEntry) findViewById(2131429201);
        getWindow().setSoftInputMode(3);
        this.A0A.requestFocus();
        TextView A0L = AnonymousClass3MX.A0L(this, 2131431270);
        this.A00 = AnonymousClass3MX.A0I(this, 2131431280);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = C72463Mc.A0r(getIntent(), UserJid.class).iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            A13.add(A0Q);
            AnonymousClass3MY.A1O(this.A03, A0Q, A132);
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0);
        AnonymousClass1EC A0Y = C72473Md.A0Y(getIntent(), "group_jid");
        boolean A032 = this.A0B.A03(A0Y);
        TextView A0I = AnonymousClass3MW.A0I(this, 2131431267);
        int i = 2131891016;
        if (A032) {
            i = 2131893510;
        }
        A0I.setText(i);
        MentionableEntry mentionableEntry = this.A0A;
        int i2 = 2131891017;
        if (A032) {
            i2 = 2131893511;
        }
        mentionableEntry.setText(i2);
        this.A0C = AnonymousClass000.A13();
        for (int i3 = 0; i3 < stringArrayListExtra.size(); i3++) {
            this.A0C.add(new AnonymousClass4O7(A0Y, (UserJid) A13.get(i3), stringArrayListExtra.get(i3), longExtra));
        }
        AnonymousClass1E7 A0H = this.A03.A0H(A0Y);
        this.A09 = A0H;
        if (C83804Gs.A00(A0H)) {
            A0L.setText(2131891016);
            A0I.setVisibility(8);
        } else {
            A0L.setText(this.A04.A0I(this.A09));
        }
        C17890vO.A0u(new AnonymousClass493(this.A06, this.A09, this), this.A05);
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("sms_invites_jids");
        ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131435142);
        C18070vi.A0d(this.A0E, 0);
        AnonymousClass3NL.A01(this, A0I2, this.A07, 2131232506);
        AnonymousClass48j.A00(A0I2, A0Y, stringArrayListExtra2, this, 29);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131431798);
        C72463Mc.A0z(this, recyclerView, 0);
        AnonymousClass1CJ r13 = this.A08;
        C73583Wn r7 = new C73583Wn(this, from, this.A04, this.A0E, this.A07, r13);
        r7.A00 = A132;
        r7.notifyDataSetChanged();
        recyclerView.setAdapter(r7);
        C43421zm.A04(AnonymousClass3MX.A0L(this, 2131435169));
        ((WaFrameLayout) findViewById(2131431265)).setForeground(this.A02.BS0(AnonymousClass00R.A01, 2, false));
        View findViewById = findViewById(2131429504);
        C90574eI.A00(findViewById.getViewTreeObserver(), this, findViewById, 4);
        Intent A002 = C123626Ve.A00(getIntent());
        A002.setComponent(getIntent().getComponent());
        setResult(0, A002);
        AnonymousClass3Ma.A1F(findViewById(2131430849), this, stringArrayListExtra2, A0Y, 11);
        C72483Me.A0b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C37451pZ r0 = this.A0E;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void onPause() {
        super.onPause();
        boolean A002 = AnonymousClass1L4.A00(this.A00);
        Window window = getWindow();
        int i = 3;
        if (A002) {
            i = 5;
        }
        window.setSoftInputMode(i);
    }

    public InviteGroupParticipantsActivity(int i) {
        this.A0F = false;
        C91014f0.A00(this, 35);
    }
}
