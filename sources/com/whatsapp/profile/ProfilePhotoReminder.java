package com.whatsapp.profile;

import X.A59;
import X.AnonymousClass00H;
import X.AnonymousClass039;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass194;
import X.AnonymousClass1E7;
import X.AnonymousClass1E8;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1VW;
import X.AnonymousClass1VX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48A;
import X.AnonymousClass4UI;
import X.AnonymousClass5YX;
import X.AnonymousClass73O;
import X.C000200d;
import X.C003401n;
import X.C107845ai;
import X.C1193267r;
import X.C146757Qm;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C20113A7w;
import X.C219017v;
import X.C23581Gv;
import X.C24671Lf;
import X.C27071Up;
import X.C27191Vc;
import X.C27641Ww;
import X.C32291gx;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74873d3;
import X.C88364Zk;
import X.C89964dJ;
import X.C91024f1;
import X.C92094gk;
import X.C94164k9;
import X.C95914n0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.util.Log;

public class ProfilePhotoReminder extends AnonymousClass1FY {
    public View A00;
    public ImageView A01;
    public AnonymousClass194 A02;
    public WaEditText A03;
    public AnonymousClass1VW A04;
    public C24671Lf A05;
    public C27191Vc A06;
    public AnonymousClass1E7 A07;
    public C1193267r A08;
    public AnonymousClass4UI A09;
    public AnonymousClass1LU A0A;
    public C219017v A0B;
    public C32291gx A0C;
    public C18010vc A0D;
    public C27071Up A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public Bitmap A0I;
    public Handler A0J;
    public Runnable A0K;
    public boolean A0L;
    public final C107845ai A0M;
    public final C23581Gv A0N;

    public ProfilePhotoReminder() {
        this(0);
        this.A0M = new C92094gk(this, 10);
        this.A0N = new C94164k9(this, 22);
    }

    public static void A03(ProfilePhotoReminder profilePhotoReminder) {
        Bitmap A042;
        ProfilePhotoReminder profilePhotoReminder2 = profilePhotoReminder;
        profilePhotoReminder.A00.setVisibility(8);
        int dimensionPixelSize = profilePhotoReminder.getResources().getDimensionPixelSize(2131168470);
        float dimension = profilePhotoReminder.getResources().getDimension(2131168468);
        if (AnonymousClass73O.A02(AnonymousClass11S.A00(profilePhotoReminder.A02))) {
            profilePhotoReminder.A01.setEnabled(false);
            profilePhotoReminder.A00.setVisibility(0);
            A042 = profilePhotoReminder.A0I;
            if (A042 == null) {
                A042 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ALPHA_8);
                profilePhotoReminder.A0I = A042;
            }
        } else {
            profilePhotoReminder.A01.setEnabled(true);
            profilePhotoReminder.A00.setVisibility(4);
            A042 = profilePhotoReminder.A06.A04(profilePhotoReminder2, profilePhotoReminder.A07, "ProfilePhotoReminder.updatePhoto", dimension, dimensionPixelSize, false);
            if (A042 == null) {
                AnonymousClass1E7 r1 = profilePhotoReminder.A07;
                if (r1.A08 == 0 && r1.A07 == 0) {
                    profilePhotoReminder.A00.setVisibility(0);
                    Handler handler = profilePhotoReminder.A0J;
                    if (handler == null) {
                        handler = C17890vO.A0D();
                        profilePhotoReminder.A0J = handler;
                        profilePhotoReminder.A0K = new C146757Qm((Object) profilePhotoReminder, 36);
                    }
                    handler.removeCallbacks(profilePhotoReminder.A0K);
                    profilePhotoReminder.A0J.postDelayed(profilePhotoReminder.A0K, C20113A7w.A0L);
                } else {
                    profilePhotoReminder.A00.setVisibility(4);
                }
                AnonymousClass1VW r10 = profilePhotoReminder.A04;
                Context context = profilePhotoReminder.A00.getContext();
                C18070vi.A0d(context, 0);
                A042 = r10.A04(context, (AnonymousClass1VX) null, dimension, 2131231047, dimensionPixelSize);
            }
        }
        profilePhotoReminder2.A01.setImageBitmap(A042);
    }

    public void A2y() {
        if (!this.A0L) {
            this.A0L = true;
            AnonymousClass10E A0L2 = C72473Md.A0L(this);
            C72483Me.A0q(A0L2, this);
            AnonymousClass10G r1 = A0L2.A00;
            AnonymousClass1FB.A0K(A0L2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L2, r1, this, r1.A5A);
            this.A0A = AnonymousClass3MY.A0Z(A0L2);
            this.A02 = (AnonymousClass194) A0L2.A9Z.get();
            this.A08 = AnonymousClass3MZ.A0t(A0L2);
            this.A04 = AnonymousClass3MZ.A0e(A0L2);
            this.A0B = (C219017v) A0L2.A6S.get();
            this.A0H = C000200d.A00(r1.AFu);
            this.A05 = AnonymousClass3Ma.A0S(A0L2);
            this.A0F = C000200d.A00(r1.A1c);
            this.A0C = (C32291gx) A0L2.A6X.get();
            this.A0E = C72453Mb.A0p(A0L2);
            this.A0D = AnonymousClass3Ma.A0r(A0L2);
            this.A06 = AnonymousClass3MZ.A0j(A0L2);
            this.A0G = C000200d.A00(r1.A1h);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 12) {
            if (i != 13) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            this.A0E.A0A("ProfilePhotoReminder");
            if (i2 != -1) {
                if (i2 == 0 && intent != null) {
                    this.A0E.A03(intent, this);
                    return;
                }
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                if (intent.getBooleanExtra("is_reset", false)) {
                    this.A00.setVisibility(0);
                    this.A0E.A0D(this.A07);
                    return;
                } else if (intent.getBooleanExtra("skip_cropping", false)) {
                    this.A0E.A0A("ProfilePhotoReminder");
                }
            }
            this.A0E.A04(intent, this, 13);
            return;
        } else {
            return;
        }
        if (this.A0E.A0F(this.A07)) {
            this.A00.setVisibility(0);
        }
    }

    public void onBackPressed() {
        if (!this.A09.A02()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131899332);
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        A0J2.A0G();
        setContentView(2131626639);
        AnonymousClass1E8 A0P = AnonymousClass3MY.A0P(this);
        this.A07 = A0P;
        if (A0P == null) {
            Log.i("profilephotoreminder/create/no-me");
            startActivity(AnonymousClass1LU.A0A(this));
            finish();
            return;
        }
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131432906);
        View findViewById = findViewById(2131430310);
        this.A03 = (WaEditText) findViewById(2131434460);
        C18030ve r17 = this.A0E;
        AnonymousClass1L4 r15 = this.A09;
        AnonymousClass190 r14 = this.A03;
        AnonymousClass1KW r13 = this.A0D;
        C1193267r r10 = this.A08;
        AnonymousClass11C r9 = this.A08;
        C18000vb r8 = this.A00;
        C19830z4 r6 = this.A0A;
        C18010vc r5 = this.A0D;
        AnonymousClass1L4 r29 = r15;
        WaEditText waEditText = this.A03;
        AnonymousClass11C r20 = r9;
        AnonymousClass190 r172 = r14;
        AnonymousClass5YX r18 = (AnonymousClass5YX) findViewById(2131432239);
        C74873d3 r142 = new C74873d3(this, findViewById, r172, r18, waEditText, r20, r6, r8, (A59) this.A0G.get(), r10, r13, (EmojiSearchProvider) this.A0F.get(), r17, r5, r29, 23, (Integer) null);
        r142.A0J(this.A0M);
        AnonymousClass4UI r4 = new AnonymousClass4UI(this, r142, (EmojiSearchContainer) findViewById(2131430335));
        this.A09 = r4;
        r4.A00 = new C95914n0(this, 9);
        r142.A0E = new C146757Qm((Object) this, 35);
        ImageView A0I3 = AnonymousClass3MX.A0I(this, 2131428998);
        this.A01 = A0I3;
        C89964dJ.A00(A0I3, this, 40);
        C18000vb r62 = this.A00;
        String string = getString(2131899268);
        C89964dJ r42 = new C89964dJ(this, 41);
        View A092 = AnonymousClass3MX.A09(LayoutInflater.from(A0J2.A0A()), (ViewGroup) null, 2131624003);
        AnonymousClass039 r2 = new AnonymousClass039(-2, -2);
        int i = 3;
        if (AnonymousClass3MY.A1b(r62)) {
            i = 5;
        }
        r2.A00 = i;
        A0J2.A0Q(A092, r2);
        C17880vN.A0E(A092, 2131427494).setText(string.toUpperCase(r62.A0N()));
        A092.findViewById(2131427493).setOnClickListener(r42);
        this.A00 = findViewById(2131429002);
        A03(this);
        C27641Ww.A09(this.A03, this.A00);
        WaEditText waEditText2 = this.A03;
        C18030ve r82 = this.A0E;
        AnonymousClass1KW r7 = this.A0D;
        WaEditText waEditText3 = waEditText2;
        waEditText2.addTextChangedListener(new AnonymousClass48A(waEditText3, A0I2, this.A08, this.A00, this.A0C, r7, r82, this.A0D, 25, 0, false, false, false));
        C72453Mb.A1H(this.A03, new InputFilter[1], 25, 0);
        this.A03.setText(this.A02.A0D());
        WaEditText waEditText4 = this.A03;
        waEditText4.setSelection(waEditText4.length());
        if (this.A02.A02()) {
            Log.w("profilephotoreminder/clock-wrong");
            C88364Zk.A02(this, this.A0B, this.A0C);
        } else if (this.A02.A01()) {
            Log.w("profilephotoreminder/sw-expired");
            C88364Zk.A03(this, this.A0B, this.A0C);
        }
        this.A05.registerObserver(this.A0N);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A05.unregisterObserver(this.A0N);
        Handler handler = this.A0J;
        if (handler != null) {
            handler.removeCallbacks(this.A0K);
        }
    }

    public ProfilePhotoReminder(int i) {
        this.A0L = false;
        C91024f1.A00(this, 35);
    }
}
