package com.whatsapp.identity;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HS;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass2T2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass5O1;
import X.AnonymousClass7IF;
import X.AnonymousClass7IG;
import X.AnonymousClass7S3;
import X.AnonymousClass894;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C121946Mc;
import X.C128396fv;
import X.C133166oH;
import X.C136676uC;
import X.C1423279a;
import X.C145437Lg;
import X.C18070vi;
import X.C18100vl;
import X.C200710s;
import X.C24921Me;
import X.C25088CWz;
import X.C26571Sq;
import X.C27251Vi;
import X.C74743cP;
import X.C90044dR;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.WaQrScannerView;
import java.nio.charset.Charset;

public final class ScanQrCodeActivity extends AnonymousClass1FY {
    public ProgressBar A00;
    public C25088CWz A01;
    public WaTextView A02;
    public AnonymousClass1HS A03;
    public C27251Vi A04;
    public AnonymousClass1M9 A05;
    public C24921Me A06;
    public C128396fv A07;
    public C133166oH A08;
    public C136676uC A09;
    public QrScannerOverlay A0A;
    public WaQrScannerView A0B;
    public View A0C;
    public boolean A0D;
    public final Charset A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final AnonymousClass894 A0H;

    public void A2y() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A04 = (C27251Vi) r1.A0q.get();
            this.A05 = AnonymousClass10E.A4z(A0A2);
            this.A08 = (C133166oH) r1.ABH.get();
            this.A09 = AnonymousClass1K1.A1B(A0K);
            this.A03 = (AnonymousClass1HS) A0A2.A98.get();
            this.A06 = AnonymousClass3MZ.A0g(A0A2);
        }
    }

    public void finish() {
        String str;
        WaQrScannerView waQrScannerView = this.A0B;
        if (waQrScannerView == null) {
            str = "qrScannerView";
        } else {
            if (waQrScannerView.getVisibility() == 0) {
                View view = this.A0C;
                if (view == null) {
                    str = "mainLayout";
                } else if (view.getVisibility() == 8) {
                    C136676uC r1 = this.A09;
                    if (r1 != null) {
                        r1.A02((Runnable) null);
                        return;
                    }
                    str = "qrCodeValidationUtil";
                }
            }
            super.finish();
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public ScanQrCodeActivity(int i) {
        this.A0D = false;
        C1423279a.A00(this, 3);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A0b;
        super.onCreate(bundle);
        setContentView(2131626764);
        setTitle(2131899357);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        toolbar.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A04(this, getBaseContext(), 2130970061, 2131101199, 2131231675), this.A00));
        toolbar.setTitle(2131899357);
        AnonymousClass11S r1 = this.A02;
        C18100vl r4 = this.A0F;
        if (AnonymousClass3Ma.A1V(r1, (AnonymousClass1E7) AnonymousClass3MX.A14(r4))) {
            C24921Me r2 = this.A06;
            if (r2 != null) {
                A0b = AnonymousClass2T2.A00(this, r2, this.A00, (AnonymousClass1E7) AnonymousClass3MX.A14(r4));
            }
            str = "waContactNames";
            C18070vi.A11(str);
            throw null;
        }
        Object[] A1a = AnonymousClass3MW.A1a();
        C24921Me r12 = this.A06;
        if (r12 != null) {
            A0b = C108975cc.A0b(this, AnonymousClass3MY.A0q(r12, (AnonymousClass1E7) AnonymousClass3MX.A14(r4)), A1a, 2131897773);
        }
        str = "waContactNames";
        C18070vi.A11(str);
        throw null;
        toolbar.setSubtitle((CharSequence) A0b);
        toolbar.setBackgroundResource(C108955ca.A02(AnonymousClass3MY.A04(toolbar)));
        toolbar.A0Q(this, 2132083960);
        toolbar.setNavigationOnClickListener(new C90044dR((Object) this, 39));
        setSupportActionBar(toolbar);
        this.A00 = (ProgressBar) findViewById(2131434181);
        C133166oH r5 = this.A08;
        if (r5 != null) {
            UserJid A0x = AnonymousClass3MZ.A0x((AnonymousClass1E7) AnonymousClass3MX.A14(r4));
            AnonymousClass894 r0 = this.A0H;
            C18070vi.A0d(r0, 1);
            C200710s r3 = r5.A08;
            r3.A03();
            new C121946Mc(r0, r5, A0x).A02.executeOnExecutor(r3, new Void[0]);
            this.A0C = findViewById(2131432248);
            this.A0B = (WaQrScannerView) findViewById(2131434258);
            this.A0A = (QrScannerOverlay) findViewById(2131433364);
            this.A02 = (WaTextView) findViewById(2131430526);
            C136676uC r32 = this.A09;
            if (r32 != null) {
                View view = this.A00;
                C18070vi.A0X(view);
                r32.A01(view, new AnonymousClass7IG(this, 1), (UserJid) this.A0G.getValue());
                C136676uC r22 = this.A09;
                if (r22 != null) {
                    WaQrScannerView waQrScannerView = r22.A0G;
                    if (waQrScannerView != null) {
                        waQrScannerView.setQrDecodeHints(r22.A0I);
                        waQrScannerView.setQrScannerCallback(new C145437Lg(r22));
                    }
                    C90044dR.A00(AnonymousClass3MY.A0H(this, 2131434806), this, 40);
                    return;
                }
            }
            str = "qrCodeValidationUtil";
        } else {
            str = "fingerprintUtil";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        C136676uC r1 = this.A09;
        if (r1 != null) {
            r1.A02 = null;
            r1.A0G = null;
            r1.A0F = null;
            r1.A01 = null;
            r1.A06 = null;
            r1.A05 = null;
            return;
        }
        C18070vi.A11("qrCodeValidationUtil");
        throw null;
    }

    public static final void A03(ScanQrCodeActivity scanQrCodeActivity) {
        super.finish();
    }

    public ScanQrCodeActivity() {
        this(0);
        this.A0E = C26571Sq.A00;
        this.A0G = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5O1(this));
        this.A0F = AnonymousClass7S3.A00(this, 34);
        this.A0H = new AnonymousClass7IF(this);
    }
}
