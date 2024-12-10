package X;

import android.content.ActivityNotFoundException;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.transfer.ui.ChatTransferActivity;
import com.whatsapp.migration.transfer.ui.P2pTransferViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8vP  reason: invalid class name and case insensitive filesystem */
public abstract class C173628vP extends AnonymousClass8e1 {
    public C010105w A00;
    public C219217x A01;
    public P2pTransferViewModel A02;
    public C192109no A03;
    public C36401np A04;
    public WDSButton A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public final AnonymousClass02n A08 = CDw(new AGI((Object) this, 11), new Object());

    public final void A4e(View.OnClickListener onClickListener, int i) {
        C28931bI r0 = ((ChatTransferActivity) this).A09;
        if (r0 == null) {
            C18070vi.A11("qrCodeViewStub");
            throw null;
        }
        ImageView A0C = AnonymousClass3Ma.A0C(r0.A02(), 2131429066);
        A0C.setImageResource(i);
        A0C.setClickable(AnonymousClass000.A1W(onClickListener));
        A0C.setOnClickListener(onClickListener);
    }

    public void A4f(C25088CWz cWz) {
        ChatTransferActivity chatTransferActivity = (ChatTransferActivity) this;
        C18070vi.A0d(cWz, 0);
        Log.i("p2p/fpm/ChatTransferActivity/showQrCode");
        C28931bI r0 = chatTransferActivity.A09;
        if (r0 == null) {
            C18070vi.A11("qrCodeViewStub");
            throw null;
        }
        r0.A04(0);
        C28931bI r02 = chatTransferActivity.A09;
        if (r02 == null) {
            C18070vi.A11("qrCodeViewStub");
            throw null;
        }
        QrImageView qrImageView = (QrImageView) C18070vi.A05(r02.A02(), 2131429065);
        qrImageView.setAlpha(1.0f);
        qrImageView.setQrCode(cWz, (C22359B4n) null);
        chatTransferActivity.A4e((View.OnClickListener) null, 2131232233);
        C192109no r2 = chatTransferActivity.A03;
        if (r2 != null) {
            AnonymousClass11C r1 = chatTransferActivity.A08;
            C18070vi.A0W(r1);
            Window window = chatTransferActivity.getWindow();
            C18070vi.A0X(window);
            r2.A01(window, r1);
            qrImageView.invalidate();
            return;
        }
        C18070vi.A11("brightnessController");
        throw null;
    }

    public void A4i(boolean z) {
        String str;
        ChatTransferActivity chatTransferActivity = (ChatTransferActivity) this;
        WDSButton wDSButton = chatTransferActivity.A05;
        if (wDSButton != null) {
            int i = 0;
            wDSButton.setVisibility(C72453Mb.A01(z ? 1 : 0));
            CircularProgressBar circularProgressBar = chatTransferActivity.A01;
            if (circularProgressBar == null) {
                str = "progressSpinner";
            } else {
                if (!z) {
                    i = 8;
                }
                circularProgressBar.setVisibility(i);
                if (!z) {
                    WaTextView waTextView = chatTransferActivity.A03;
                    if (waTextView == null) {
                        str = "progressDescription";
                    } else {
                        waTextView.setVisibility(8);
                        RoundCornerProgressBar roundCornerProgressBar = chatTransferActivity.A04;
                        if (roundCornerProgressBar == null) {
                            str = "progressBar";
                        } else {
                            roundCornerProgressBar.setVisibility(8);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            str = "primaryBtn";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final P2pTransferViewModel A4b() {
        P2pTransferViewModel p2pTransferViewModel = this.A02;
        if (p2pTransferViewModel != null) {
            return p2pTransferViewModel;
        }
        C18070vi.A11("p2pTransferViewModel");
        throw null;
    }

    public final void A4d(int i) {
        C134126q5 r3;
        AnonymousClass1L7 r2 = this.A04;
        C18070vi.A0W(r2);
        C219217x r32 = this.A01;
        if (r32 != null) {
            String A032 = A03(2131888231);
            String A033 = A03(2131888229);
            String A034 = A03(2131888227);
            if (AnonymousClass112.A09()) {
                if (!r32.A07()) {
                    r3 = AnonymousClass74O.A05(this, A032);
                }
                AnonymousClass3MX.A1J(A4b().A0D, 3);
                return;
            } else if (r2.A0C() || r32.A0G()) {
                if (r32.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                    r3 = new C134126q5(this);
                    r3.A01 = 2131232061;
                    String[] A1Z = C17880vN.A1Z();
                    A1Z[0] = "android.permission.ACCESS_COARSE_LOCATION";
                    A1Z[1] = "android.permission.ACCESS_FINE_LOCATION";
                    r3.A0C = A1Z;
                    r3.A04 = 2131888230;
                    r3.A05 = A033;
                }
                AnonymousClass3MX.A1J(A4b().A0D, 3);
                return;
            } else {
                r3 = new C134126q5(this);
                r3.A09 = new int[]{2131232061, 2131231658, 2131231920};
                r3.A01(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
                r3.A04 = 2131888228;
                r3.A05 = A034;
            }
            startActivityForResult(r3.A00(), i);
            return;
        }
        C18070vi.A11("waPermissionsHelper");
        throw null;
    }

    public void A4g(C188799i0 r4) {
        if (r4 == null) {
            Log.e("p2p/P2pTransferActivity/onCurrentScreenChanged/viewData is null");
            return;
        }
        BVe().A09(new AnonymousClass8Du(this, r4), this);
        boolean z = r4.A0J;
        Window window = getWindow();
        if (z) {
            window.addFlags(128);
        } else {
            window.clearFlags(128);
        }
        C010105w r0 = this.A00;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A00 = null;
    }

    public final void A4h(C188349hH r7) {
        C20336AGs aGs;
        String str;
        if (r7 != null) {
            if (r7.A08) {
                ChatTransferActivity chatTransferActivity = (ChatTransferActivity) this;
                LottieAnimationView lottieAnimationView = chatTransferActivity.A00;
                if (lottieAnimationView == null) {
                    str = "lottieAnimationView";
                } else {
                    lottieAnimationView.A03();
                    CircularProgressBar circularProgressBar = chatTransferActivity.A01;
                    if (circularProgressBar == null) {
                        str = "progressSpinner";
                    } else {
                        circularProgressBar.setVisibility(8);
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0D(r7.A00);
            int i = r7.A02;
            B8L b8l = r7.A05;
            C20336AGs aGs2 = null;
            if (b8l != null) {
                aGs = new C20336AGs(b8l, 13);
            } else {
                aGs = null;
            }
            A002.A0g(this, aGs, i);
            int i2 = r7.A03;
            if (i2 != 0) {
                A002.A0E(i2);
            } else {
                String str2 = r7.A06;
                if (str2 != null) {
                    A002.A0k(str2);
                }
            }
            int i3 = r7.A01;
            if (i3 != 0) {
                if (r7.A04 != null) {
                    aGs2 = new C20336AGs(r7, 14);
                }
                A002.A0e(this, aGs2, i3);
            }
            A002.A0T(r7.A07);
            C010105w r0 = this.A00;
            if (r0 != null) {
                r0.dismiss();
            }
            this.A00 = null;
            C010105w create = A002.create();
            create.show();
            this.A00 = create;
        }
    }

    private final String A03(int i) {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = "https://faq.whatsapp.com/209942271778103/?cms_platform=android";
        return AnonymousClass3Ma.A10(this, AnonymousClass1EG.A03(this, C72463Mc.A02(this)), A1b, 1, i);
    }

    private final void A0Q() {
        int i;
        WifiManager wifiManager = (WifiManager) C19740yt.A06(getApplicationContext(), WifiManager.class);
        if (wifiManager != null) {
            boolean A002 = new C189479jJ(wifiManager).A00();
            AnonymousClass1DT r1 = A4b().A0D;
            if (A002) {
                i = 12;
            } else {
                i = 7;
            }
            AnonymousClass3MX.A1J(r1, i);
        }
    }

    private final void A0V() {
        AnonymousClass1DT r1;
        int i;
        LocationManager locationManager = (LocationManager) C19740yt.A06(getApplicationContext(), LocationManager.class);
        if (locationManager == null || !locationManager.isProviderEnabled("gps")) {
            r1 = A4b().A0D;
            i = 4;
        } else {
            r1 = A4b().A0D;
            i = 5;
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    private final void A0c() {
        AnonymousClass1DT r1;
        int i;
        WifiManager wifiManager = (WifiManager) C19740yt.A06(getApplicationContext(), WifiManager.class);
        if (wifiManager == null || !wifiManager.isWifiEnabled()) {
            r1 = A4b().A0D;
            i = 6;
        } else {
            r1 = A4b().A0D;
            i = 11;
        }
        AnonymousClass3MX.A1J(r1, i);
    }

    public static final boolean A0d(C173628vP r2, String str) {
        try {
            r2.startActivity(C108945cZ.A0G(str));
            return true;
        } catch (ActivityNotFoundException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("p2p/P2pTransferActivity/No activity found for action ");
            C17890vO.A13(str, A10, e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4c(int r10) {
        /*
            r9 = this;
            switch(r10) {
                case 1: goto L_0x00ab;
                case 2: goto L_0x0003;
                case 3: goto L_0x00a7;
                case 4: goto L_0x0089;
                case 5: goto L_0x0085;
                case 6: goto L_0x0077;
                case 7: goto L_0x0030;
                case 8: goto L_0x0017;
                case 9: goto L_0x0003;
                case 10: goto L_0x0003;
                case 11: goto L_0x0013;
                case 12: goto L_0x0004;
                default: goto L_0x0003;
            }
        L_0x0003:
            return
        L_0x0004:
            r3 = 2131888246(0x7f120876, float:1.9411122E38)
            r4 = 2131888245(0x7f120875, float:1.941112E38)
            r5 = 2131887451(0x7f12055b, float:1.940951E38)
            r6 = 2131892995(0x7f121b03, float:1.9420754E38)
            r0 = 6
            goto L_0x0096
        L_0x0013:
            r9.A0Q()
            return
        L_0x0017:
            r3 = 2131888218(0x7f12085a, float:1.9411065E38)
            r4 = 2131888217(0x7f120859, float:1.9411063E38)
            r5 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 7
            X.AWF r1 = new X.AWF
            r1.<init>(r9, r0)
            r6 = 0
            r8 = 1
            r2 = 0
            X.9hH r0 = new X.9hH
            r7 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00a3
        L_0x0030:
            r4 = r9
            com.whatsapp.migration.transfer.ui.ChatTransferActivity r4 = (com.whatsapp.migration.transfer.ui.ChatTransferActivity) r4
            X.11C r1 = r4.A08
            X.C18070vi.A0W(r1)
            X.A7P r3 = r4.A4j()
            byte[] r0 = X.C182319Tx.A01
            java.lang.String r0 = "android.hardware.wifi.direct"
            boolean r0 = r1.A0P(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "p2p/fpm/TransferUtils/Feature not available"
        L_0x0049:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.A04 = r0
        L_0x004e:
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r4.A4b()
            if (r2 == 0) goto L_0x006f
            r0.A0b()
            return
        L_0x0058:
            android.net.wifi.WifiManager r1 = r1.A0F()
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "p2p/fpm/TransferUtils/WifiManager not available"
            goto L_0x0049
        L_0x0061:
            boolean r0 = X.AnonymousClass112.A01()
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.isP2pSupported()
            if (r0 == 0) goto L_0x004e
            r2 = 1
            goto L_0x004e
        L_0x006f:
            X.1DT r1 = r0.A0D
            r0 = 8
            X.AnonymousClass3MX.A1J(r1, r0)
            return
        L_0x0077:
            r3 = 2131888250(0x7f12087a, float:1.941113E38)
            r4 = 2131888249(0x7f120879, float:1.9411128E38)
            r5 = 2131887451(0x7f12055b, float:1.940951E38)
            r6 = 2131892995(0x7f121b03, float:1.9420754E38)
            r0 = 5
            goto L_0x0096
        L_0x0085:
            r9.A0c()
            return
        L_0x0089:
            r3 = 2131888248(0x7f120878, float:1.9411126E38)
            r4 = 2131888247(0x7f120877, float:1.9411124E38)
            r5 = 2131887451(0x7f12055b, float:1.940951E38)
            r6 = 2131892995(0x7f121b03, float:1.9420754E38)
            r0 = 4
        L_0x0096:
            X.AWF r1 = new X.AWF
            r1.<init>(r9, r0)
            r7 = 0
            r8 = 1
            r2 = 0
            X.9hH r0 = new X.9hH
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00a3:
            r9.A4h(r0)
            return
        L_0x00a7:
            r9.A0V()
            return
        L_0x00ab:
            r0 = 1
            r9.A4d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173628vP.A4c(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r1.A02("android.permission.ACCESS_FINE_LOCATION") == 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.A07() != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            super.onActivityResult(r4, r5, r6)
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r3.A4b()
            X.1DT r0 = r0.A0D
            java.lang.Number r0 = X.C108945cZ.A1C(r0)
            if (r0 == 0) goto L_0x0030
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L_0x0030
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x0031
            X.17x r0 = r3.A01
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0050
        L_0x0026:
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r3.A4b()
            X.1DT r1 = r0.A0D
            r0 = 3
        L_0x002d:
            X.AnonymousClass3MX.A1J(r1, r0)
        L_0x0030:
            return
        L_0x0031:
            X.1L7 r0 = r3.A04
            boolean r0 = r0.A0C()
            X.17x r1 = r3.A01
            if (r1 == 0) goto L_0x0074
            if (r0 != 0) goto L_0x0047
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0050
            X.17x r1 = r3.A01
            if (r1 == 0) goto L_0x0074
        L_0x0047:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            if (r4 != r2) goto L_0x006c
            X.17x r0 = r3.A01
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x006c
            X.0z4 r0 = r3.A0A
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            X.C17880vN.A1B(r0, r1)
            r0 = 2
            r3.A4d(r0)
            return
        L_0x006c:
            com.whatsapp.migration.transfer.ui.P2pTransferViewModel r0 = r3.A4b()
            X.1DT r1 = r0.A0D
            r0 = 2
            goto L_0x002d
        L_0x0074:
            java.lang.String r0 = "waPermissionsHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173628vP.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624530);
        this.A03 = new C192109no();
    }

    public void onResume() {
        super.onResume();
        Number A1C = C108945cZ.A1C(A4b().A0D);
        if (A1C != null) {
            int intValue = A1C.intValue();
            if (intValue == 4) {
                A0V();
            } else if (intValue == 6) {
                A0c();
            } else if (intValue == 12) {
                A0Q();
            }
        }
    }
}
