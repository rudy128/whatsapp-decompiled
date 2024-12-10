package com.whatsapp.companionmode.registration;

import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass118;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K3;
import X.AnonymousClass1LA;
import X.AnonymousClass1LU;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass48m;
import X.AnonymousClass4W1;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C188129gv;
import X.C19740yt;
import X.C26721Tf;
import X.C28931bI;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C77513qF;
import X.C825248h;
import X.C91004ez;
import X.C91074f6;
import android.os.Bundle;
import android.text.method.DigitsKeyListener;
import com.whatsapp.components.PhoneNumberEntry;

public final class RegisterAsCompanionEnterNumberActivity extends AnonymousClass1FY {
    public AnonymousClass1LA A00;
    public C26721Tf A01;
    public AnonymousClass118 A02;
    public AnonymousClass1LU A03;
    public C188129gv A04;
    public AnonymousClass129 A05;
    public AnonymousClass1K3 A06;
    public AnonymousClass00H A07;
    public boolean A08;
    public final AnonymousClass02n A09;
    public final AnonymousClass02n A0A;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.02h] */
    public RegisterAsCompanionEnterNumberActivity() {
        this(0);
        this.A09 = C91074f6.A00(this, new Object(), 5);
        this.A0A = C91074f6.A00(this, new Object(), 6);
    }

    public void A2y() {
        if (!this.A08) {
            this.A08 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A07 = C000200d.A00(A0L.A08);
            this.A01 = (C26721Tf) A0L.A2V.get();
            this.A00 = C72453Mb.A0b(A0L);
            this.A06 = AnonymousClass3Ma.A0v(A0L);
            this.A05 = AnonymousClass3Ma.A0t(A0L);
            this.A02 = AnonymousClass3MZ.A0l(A0L);
            this.A03 = AnonymousClass3MY.A0Z(A0L);
        }
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            AnonymousClass00H r0 = this.A07;
            if (r0 != null) {
                if (C17880vN.A0I(r0).A0J(false)) {
                    AnonymousClass00H r02 = this.A07;
                    if (r02 != null) {
                        C17880vN.A0I(r02).A0C(this, true);
                        super.onBackPressed();
                    }
                }
            }
            C18070vi.A11("accountSwitcher");
            throw null;
        }
        isTaskRoot();
        super.onBackPressed();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9gv] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0E = false;
        setContentView(2131626701);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(2131433792);
        ? obj = new Object();
        this.A04 = obj;
        obj.A05 = phoneNumberEntry;
        obj.A02 = phoneNumberEntry.A01;
        phoneNumberEntry.A02.setKeyListener(DigitsKeyListener.getInstance("0123456789-() "));
        C188129gv r1 = this.A04;
        if (r1 != null) {
            r1.A03 = phoneNumberEntry.A02;
            r1.A04 = AnonymousClass3MX.A0L(this, 2131434455);
            C188129gv r0 = this.A04;
            if (r0 != null) {
                r0.A03.setTextDirection(3);
                C28931bI A0x = AnonymousClass3Ma.A0x(this, 2131433793);
                phoneNumberEntry.A03 = new C77513qF(this, A0x);
                C188129gv r12 = this.A04;
                if (r12 != null) {
                    r12.A01 = AnonymousClass4W1.A00(r12.A03);
                    C188129gv r13 = this.A04;
                    if (r13 != null) {
                        r13.A00 = AnonymousClass4W1.A00(r13.A02);
                        C188129gv r02 = this.A04;
                        if (r02 != null) {
                            AnonymousClass48m.A00(r02.A04, this, 14);
                            C188129gv r03 = this.A04;
                            if (r03 != null) {
                                AnonymousClass1HF.A0L(C19740yt.A03(this, AnonymousClass1YL.A00(this, 2130970828, 2131102239)), r03.A04);
                                phoneNumberEntry.A01.setGravity(3);
                                phoneNumberEntry.A02.setHint(2131888642);
                                C825248h.A00(findViewById(2131433119), A0x, this, 33);
                                AnonymousClass48m.A00(findViewById(2131431399), this, 15);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11("phoneNumberEntryViewHolder");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C26721Tf r0 = this.A01;
        if (r0 != null) {
            C26721Tf.A00(r0).A05();
        } else {
            C18070vi.A11("companionRegistrationManager");
            throw null;
        }
    }

    public RegisterAsCompanionEnterNumberActivity(int i) {
        this.A08 = false;
        C91004ez.A00(this, 18);
    }
}
