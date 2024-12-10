package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8lW  reason: invalid class name */
public abstract class AnonymousClass8lW extends AnonymousClass8e0 {
    public C22417B6z A00;
    public B7A A01;
    public A8Q A02;
    public UserJid A03;
    public AnonymousClass2UJ A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public String A07;
    public final C18100vl A08 = AnonymousClass1DF.A01(new C21875Au1(this));
    public final C18100vl A09 = AnonymousClass1DF.A01(new C21876Au2(this));

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        MenuItem findItem = menu.findItem(2131432496);
        findItem.setVisible(false);
        findItem.setActionView(2131626015);
        View actionView = findItem.getActionView();
        C18070vi.A0b(actionView);
        AnonymousClass1Y5.A07(actionView, "Button");
        View actionView2 = findItem.getActionView();
        C18070vi.A0b(actionView2);
        C89884dB.A00(actionView2, this, 6);
        View actionView3 = findItem.getActionView();
        C18070vi.A0b(actionView3);
        TextView A0E = C17880vN.A0E(actionView3, 2131428886);
        if (this.A07 != null) {
            C18070vi.A0b(A0E);
            A0E.setText(this.A07);
        }
        C18100vl r3 = this.A08;
        C20339AGv.A00(this, ((AnonymousClass8F7) r3.getValue()).A00, new C22247B0b(findItem, this), 26);
        ((AnonymousClass8F7) r3.getValue()).A0V();
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("business_owner_jid", A4b());
    }

    public static void A03(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, AnonymousClass8lW r4) {
        r4.A00 = (C22417B6z) r1.A2N.get();
        r4.A05 = C000200d.A00(r2.A1o);
        r4.A01 = (B7A) r1.A2T.get();
        r4.A06 = C000200d.A00(r2.AGs);
        r4.A02 = (A8Q) r2.A1p.get();
        r4.A04 = (AnonymousClass2UJ) r3.A3d.get();
    }

    public final UserJid A4b() {
        UserJid userJid = this.A03;
        if (userJid != null) {
            return userJid;
        }
        C18070vi.A11("bizJid");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        if (bundle == null) {
            parcelable = getIntent().getParcelableExtra("business_owner_jid");
        } else {
            parcelable = bundle.getParcelable("business_owner_jid");
        }
        C17960vV.A07(parcelable);
        C18070vi.A0b(parcelable);
        UserJid userJid = (UserJid) parcelable;
        C18070vi.A0d(userJid, 0);
        this.A03 = userJid;
        C18100vl r3 = this.A09;
        C20339AGv.A00(this, ((C161538Fq) r3.getValue()).A00, new C22156AyY(this), 26);
        C20339AGv.A00(this, ((C161538Fq) r3.getValue()).A01, new C22157AyZ(this), 26);
    }

    public void onResume() {
        super.onResume();
        ((C161538Fq) this.A09.getValue()).A02.A00();
    }
}
