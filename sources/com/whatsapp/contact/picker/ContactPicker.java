package com.whatsapp.contact.picker;

import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass194;
import X.AnonymousClass1LU;
import X.AnonymousClass206;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass62H;
import X.AnonymousClass8B4;
import X.C010105w;
import X.C107405Zo;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C114775ry;
import X.C142977Bn;
import X.C143887Fe;
import X.C1599686o;
import X.C1599886q;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18140vp;
import X.C18150vq;
import X.C18180vt;
import X.C192039nf;
import X.C19620yd;
import X.C20016A3i;
import X.C219217x;
import X.C222219b;
import X.C23351Fr;
import X.C25168CaK;
import X.C25982Cpv;
import X.C28281Zt;
import X.C28361a1;
import X.C32011gU;
import X.C33251iW;
import X.C33841jT;
import X.C34001jj;
import X.C43421zm;
import X.C60442o2;
import X.C692236j;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C87894Xm;
import X.D6J;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import com.whatsapp.DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.payments.ui.PaymentContactPicker;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ContactPicker extends C114775ry implements C1599686o, C1599886q, C23351Fr, C107405Zo, AnonymousClass8B4 {
    public View A00;
    public FragmentContainerView A01;
    public AnonymousClass194 A02;
    public C33251iW A03;
    public BaseSharedPreviewDialogFragment A04;
    public ContactPickerFragment A05;
    public C25982Cpv A06;
    public C219217x A07;
    public C18030ve A08;
    public AnonymousClass18K A09;
    public C87894Xm A0A;
    public C32011gU A0B;
    public WhatsAppLibLoader A0C;
    public C33841jT A0D;
    public AnonymousClass00H A0E;
    public C142977Bn A0F;

    public int A31() {
        return 78318969;
    }

    public void By8(ArrayList arrayList) {
    }

    public void A3h(int i) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2P(i);
        }
    }

    public C18150vq A4b() {
        return new C18150vq(this.A0D, (C18140vp) null);
    }

    public void A4c() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2I();
        }
    }

    public void A4d(C192039nf r2) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            contactPickerFragment.A2J();
            ContactPickerFragment.A4K = false;
        }
    }

    public ContactPickerFragment A4f() {
        if (this instanceof PaymentContactPicker) {
            return new PaymentContactPickerFragment();
        }
        if (this instanceof StatusMentionsContactPicker) {
            return new StatusMentionsContactPickerFragment();
        }
        if (this instanceof AudienceSelectionContactPicker) {
            return new AudienceSelectionContactPickerFragment();
        }
        return new ContactPickerFragment();
    }

    public C142977Bn BSZ() {
        C142977Bn r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        C142977Bn r02 = new C142977Bn(this);
        this.A0F = r02;
        return r02;
    }

    public void Bsk(int i) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment != null) {
            C17880vN.A1C(C108995ce.A0E(contactPickerFragment.A1S.A01), "disappearing_mode_duration_for_chat_picker_int", i);
            contactPickerFragment.A2J();
        }
    }

    public void BzM(String str) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return;
        }
        if (contactPickerFragment.A3V || contactPickerFragment.A3S || contactPickerFragment.A3c) {
            ContactPickerFragment.A0i(contactPickerFragment, str);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.1LU, java.lang.Object] */
    public void CHd(Bundle bundle, String str, List list) {
        C143887Fe r5;
        Intent A0B2;
        boolean z = bundle.getBoolean("load_preview");
        C17960vV.A07(Boolean.valueOf(z));
        C692236j r7 = null;
        String str2 = str;
        if (z) {
            r5 = C20016A3i.A00(this.A0B.A02(str));
        } else {
            r5 = null;
        }
        boolean z2 = bundle.getBoolean("has_text_from_url");
        C17960vV.A07(Boolean.valueOf(z2));
        boolean z3 = bundle.getBoolean("fb_share_wa_redirect");
        ContactPickerFragment contactPickerFragment = this.A05;
        boolean z4 = false;
        if (contactPickerFragment != null) {
            z4 = contactPickerFragment.A31(false);
            r7 = new C692236j();
            r7.A00(this.A05.A1M);
        }
        List list2 = list;
        this.A03.A0O(r5, (AnonymousClass206) null, r7, str2, list2, (List) null, false, z2);
        C108985cd.A18(this.A0A, 1);
        if (!z3) {
            if (!z4) {
                BSZ().A00.CPW(list2, 1);
            }
            if (!bundle.getBoolean("disable_post_send_intent")) {
                if (list2.size() == 1) {
                    A0B2 = new Object().A1w(this, C108945cZ.A0i(list2, 0), 0);
                    C60442o2.A00(A0B2, this.A05, "ContactPicker:getPostSendIntent");
                } else {
                    A0B2 = C108985cd.A0B(this);
                }
                if (A0B2 != null) {
                    startActivity(A0B2);
                }
            }
            finish();
        }
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null || !contactPickerFragment.A2o()) {
            C108985cd.A18(this.A0A, 0);
            super.onBackPressed();
        }
    }

    public Dialog onCreateDialog(int i) {
        C010105w A29;
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null || (A29 = contactPickerFragment.A29(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A29;
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A2K();
        return true;
    }

    private ContactPickerFragment A0V() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) getSupportFragmentManager().A0Q("ContactPickerFragment");
        if (contactPickerFragment == null) {
            contactPickerFragment = A4f();
            Intent intent = getIntent();
            Bundle A0D2 = C17880vN.A0D();
            if (intent.getExtras() != null) {
                A0D2.putAll(intent.getExtras());
                A0D2.remove("perf_origin");
                A0D2.remove("perf_start_time_ns");
                A0D2.remove("key_perf_tracked");
            }
            if (intent.hasExtra("android.intent.extra.shortcut.ID")) {
                A0D2.putString("jid", intent.getStringExtra("android.intent.extra.shortcut.ID"));
            }
            Bundle A0D3 = C17880vN.A0D();
            A0D3.putString("action", intent.getAction());
            A0D3.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, intent.getType());
            A0D3.putBundle("extras", A0D2);
            contactPickerFragment.A1R(A0D3);
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0C(contactPickerFragment, "ContactPickerFragment", 2131430995);
            A0H.A01();
        }
        if (C18020vd.A05(C18040vf.A02, this.A08, 4023)) {
            C108975cc.A0q(this.A01);
            C72453Mb.A1B(this.A00);
        }
        return contactPickerFragment;
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void C81(AnonymousClass02B r2) {
        super.C81(r2);
        C28281Zt.A05(this, C108955ca.A02(this));
    }

    public void C82(AnonymousClass02B r1) {
        super.C82(r1);
        C72473Md.A0o(this);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment A0O = getSupportFragmentManager().A0O(2131430995);
        if (A0O != null) {
            A0O.A1w(i, i2, intent);
        }
        if (i == 150 && this.A07.A02("android.permission.GET_ACCOUNTS") == 0 && C72463Mc.A1W(this.A0E)) {
            this.A05 = A0V();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        C25168CaK A022;
        super.onCreate(bundle);
        if (isFinishing()) {
            Log.i("contactpicker/aborting due to activity finishing");
            return;
        }
        if (!this.A0C.A04()) {
            Log.i("contactpicker/aborting due to native libraries missing");
        } else {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            if (r0.A00 == null || !this.A07.A04()) {
                this.A05.A08(2131890425, 1);
                startActivity(AnonymousClass1LU.A0A(this));
            } else {
                if (C28361a1.A00()) {
                    Log.w("contactpicker/device-not-supported");
                    CMl(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                }
                if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                    setTitle(2131898835);
                }
                if (this instanceof ContactPickerBottomSheetActivity) {
                    i = 2131624672;
                } else {
                    i = 2131624671;
                }
                setContentView(i);
                getWindow().addFlags(Integer.MIN_VALUE);
                if (!C18020vd.A05(C18040vf.A02, this.A08, 4023) || AnonymousClass3MX.A1W(this.A08) || this.A02.A0N() || (this.A07.A02("android.permission.GET_ACCOUNTS") == 0 && C72463Mc.A1W(this.A0E))) {
                    this.A05 = A0V();
                    if (bundle == null && (A022 = this.A06.A02(getIntent())) != null) {
                        this.A0A.A01(new D6J(A022, this, 4), 107);
                        return;
                    }
                    return;
                }
                if (this.A00 == null) {
                    this.A00 = ((ViewStub) findViewById(2131429492)).inflate();
                    setTitle(2131888741);
                    Toolbar A0F2 = AnonymousClass3Ma.A0F(this);
                    A0F2.setSubtitle(2131891925);
                    setSupportActionBar(A0F2);
                    C72473Md.A17(this);
                    C43421zm.A04(AnonymousClass3MX.A0L(this, 2131428078));
                    AnonymousClass3Ma.A1B(findViewById(2131429493), this, 28);
                    this.A01 = (FragmentContainerView) findViewById(2131430995);
                    Integer A0h = C17880vN.A0h();
                    AnonymousClass62H r1 = new AnonymousClass62H();
                    r1.A00 = A0h;
                    r1.A01 = A0h;
                    this.A09.CC7(r1);
                }
                View view = this.A00;
                C17960vV.A05(view);
                view.setVisibility(0);
                C72453Mb.A1B(this.A01);
                return;
            }
        }
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            BaseSharedPreviewDialogFragment baseSharedPreviewDialogFragment = this.A04;
            if (baseSharedPreviewDialogFragment != null) {
                baseSharedPreviewDialogFragment.A28();
                return true;
            }
            ContactPickerFragment contactPickerFragment = this.A05;
            if (contactPickerFragment != null && contactPickerFragment.A2o()) {
                return true;
            }
            C108985cd.A18(this.A0A, 0);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A05;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A2K();
        return true;
    }
}
