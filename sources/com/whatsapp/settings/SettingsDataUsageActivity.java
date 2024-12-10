package com.whatsapp.settings;

import X.A34;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass195;
import X.AnonymousClass196;
import X.AnonymousClass1DT;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46t;
import X.AnonymousClass48o;
import X.AnonymousClass49X;
import X.AnonymousClass4IS;
import X.AnonymousClass4M2;
import X.AnonymousClass4a6;
import X.AnonymousClass5YL;
import X.AnonymousClass74O;
import X.C000200d;
import X.C110885hR;
import X.C1403671d;
import X.C1411874q;
import X.C177969Bh;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C219217x;
import X.C23321Fo;
import X.C26301Rp;
import X.C26491Si;
import X.C28281Zt;
import X.C28931bI;
import X.C33581j3;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C826849i;
import X.C83974Hj;
import X.C85334Mz;
import X.C87824Xf;
import X.C88214Yt;
import X.C90064dT;
import X.C90094dW;
import X.C91034f2;
import X.C91614fy;
import X.C92244gz;
import X.C98334qx;
import X.C98844ro;
import X.C99784tS;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsDataUsageActivity extends AnonymousClass46t implements C23321Fo, AnonymousClass5YL {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Handler A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public SwitchCompat A0C;
    public AnonymousClass195 A0D;
    public AnonymousClass181 A0E;
    public AnonymousClass118 A0F;
    public C219217x A0G;
    public AnonymousClass196 A0H;
    public AnonymousClass18K A0I;
    public AnonymousClass1LU A0J;
    public C33581j3 A0K;
    public C26491Si A0L;
    public SettingsDataUsageViewModel A0M;
    public C1403671d A0N;
    public C26301Rp A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public String A0S;
    public String[] A0T;
    public String[] A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public TextView A0Y;
    public WaTextView A0Z;
    public AnonymousClass49X A0a;
    public C28931bI A0b;
    public A34 A0c;
    public String A0d;
    public TimerTask A0e;
    public boolean A0f;
    public final Timer A0g;

    public SettingsDataUsageActivity() {
        this(0);
        this.A0g = new Timer("refresh-network-usage");
        this.A03 = -1;
        this.A0S = null;
    }

    public void C5k(int i, int i2) {
        if (i == 5) {
            C19830z4 r1 = AnonymousClass3MY.A0Q(this).A01;
            if (r1.A0L() != i2) {
                C17880vN.A1C(C19830z4.A00(r1), "video_quality", i2);
                TextView textView = this.A0A;
                C85334Mz A0Q2 = AnonymousClass3MY.A0Q(this);
                textView.setText(C18070vi.A0G(A0Q2.A00, AnonymousClass4IS.A02[A0Q2.A01.A0L()]));
            }
        } else if (i == 6) {
            C19830z4 r12 = AnonymousClass3MY.A0Q(this).A01;
            if (r12.A0G() != i2) {
                C17880vN.A1C(C19830z4.A00(r12), "photo_quality", i2);
                TextView textView2 = this.A09;
                C85334Mz A0Q3 = AnonymousClass3MY.A0Q(this);
                textView2.setText(C18070vi.A0G(A0Q3.A00, AnonymousClass4IS.A02[A0Q3.A01.A0G()]));
            }
        } else if (i == 7) {
            C85334Mz A0Q4 = AnonymousClass3MY.A0Q(this);
            int i3 = 0;
            if (i2 == 1) {
                i3 = 3;
            }
            C19830z4 r13 = A0Q4.A01;
            if (r13.A0F() != i3) {
                C17880vN.A1C(C19830z4.A00(r13), "original_media_quality", i3);
                A0c();
            }
        }
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(2131895801);
        A002.A0Z(new C1411874q(39), 2131899286);
        return A002.create();
    }

    private void A0V() {
        this.A0B.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        C826849i r1 = new C826849i((AnonymousClass1F9) this, this);
        this.A0c = r1;
        AnonymousClass3MW.A1T(r1, this.A05, 0);
        AnonymousClass49X r12 = new AnonymousClass49X(this);
        this.A0a = r12;
        AnonymousClass3MW.A1T(r12, this.A05, 0);
    }

    private void A0c() {
        TextView textView = this.A0Y;
        if (textView != null) {
            C85334Mz A0Q2 = AnonymousClass3MY.A0Q(this);
            textView.setText(C18070vi.A0G(A0Q2.A00, AnonymousClass4IS.A01[AnonymousClass000.A1T(A0Q2.A01.A0F(), 3)]));
        }
    }

    public static void A0d(SettingsDataUsageActivity settingsDataUsageActivity, int i) {
        WaTextView waTextView;
        int A002;
        WaTextView waTextView2 = settingsDataUsageActivity.A0Z;
        if (waTextView2 != null) {
            waTextView2.setTextColor(settingsDataUsageActivity.A0W);
            if (!AnonymousClass3MW.A0l(settingsDataUsageActivity.A0Q).A07()) {
                waTextView = settingsDataUsageActivity.A0Z;
                A002 = 2131895993;
            } else {
                if (!(i == 0 || i == 1)) {
                    if (i == 2) {
                        settingsDataUsageActivity.A0Z.setTextColor(settingsDataUsageActivity.A0V);
                    } else if (i == 3) {
                        settingsDataUsageActivity.A0Z.setText(2131894110);
                        settingsDataUsageActivity.A0Z.setTextColor(settingsDataUsageActivity.A0X);
                        return;
                    } else if (!(i == 4 || i == 5)) {
                        return;
                    }
                }
                waTextView = settingsDataUsageActivity.A0Z;
                A002 = SettingsUserProxyViewModel.A00(i);
            }
            waTextView.setText(A002);
        }
    }

    public static void A0q(SettingsDataUsageActivity settingsDataUsageActivity, Boolean bool) {
        int i;
        Boolean bool2 = Boolean.TRUE;
        C28931bI r1 = settingsDataUsageActivity.A0b;
        if (bool2 == bool) {
            View findViewById = r1.A02().findViewById(2131432262);
            if (settingsDataUsageActivity.A0b.A00 == null && Build.VERSION.SDK_INT >= 30) {
                AnonymousClass48o.A00(findViewById, settingsDataUsageActivity, 25);
            }
            r1 = settingsDataUsageActivity.A0b;
            i = 0;
        } else {
            i = 8;
        }
        r1.A04(i);
    }

    public void A2y() {
        if (!this.A0f) {
            this.A0f = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A0F = AnonymousClass3MZ.A0l(r2);
            this.A0J = AnonymousClass3MY.A0Z(r2);
            this.A0E = (AnonymousClass181) r2.AA9.get();
            this.A0I = AnonymousClass3Ma.A0g(r2);
            this.A0O = (C26301Rp) r2.AWy.get();
            this.A0L = (C26491Si) r2.AlQ.get();
            this.A0H = (AnonymousClass196) r2.AJ6.get();
            this.A0K = (C33581j3) r2.A64.get();
            this.A0G = AnonymousClass3Ma.A0b(r2);
            this.A0Q = C000200d.A00(r2.AfI);
            this.A0P = C000200d.A00(A0K2.A4f);
            this.A0D = (AnonymousClass195) r2.A0L.get();
            this.A0R = C000200d.A00(A0K2.A5o);
        }
    }

    public /* synthetic */ void A4b() {
        if (!this.A0G.A0G()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = 2131894486;
            if (i >= 30) {
                i2 = 2131894489;
                if (i < 33) {
                    i2 = 2131894488;
                }
            }
            AnonymousClass74O.A08(this, 2131894487, i2);
            return;
        }
        startActivityForResult(AnonymousClass1LU.A1U(this, this.A0d, this.A0S, 1), 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (i3 == 151) {
            if (i4 == -1) {
                A0V();
                startActivity(AnonymousClass1LU.A1U(this, this.A0d, (String) null, 1));
                return;
            }
        } else if (i3 == 1) {
            A0V();
            return;
        } else if (i3 == 2) {
            if (i4 == -1 && intent != null && Build.VERSION.SDK_INT >= 30) {
                Uri data = intent2.getData();
                AnonymousClass118 r13 = this.A0F;
                AnonymousClass11P r12 = this.A05;
                AnonymousClass1KB r9 = this.A05;
                AnonymousClass1LU r15 = this.A0J;
                AnonymousClass10I r0 = this.A05;
                C177969Bh r5 = new C177969Bh(this, this.A0D, this.A04, r9, this.A04, this.A08, r12, r13, this.A0H, r15, r0);
                this.A05.CGD(r5, data);
                return;
            }
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0N = new C1403671d(this.A05, this.A0O);
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        if (r0.A00 == null) {
            startActivity(AnonymousClass1LU.A0A(this));
            finish();
            return;
        }
        this.A0M = (SettingsDataUsageViewModel) AnonymousClass3MW.A0N(this).A00(SettingsDataUsageViewModel.class);
        setTitle(2131896018);
        setContentView(2131626552);
        int A1T = C72473Md.A1T(this);
        View A0A2 = C110885hR.A0A(this, 2131432364);
        if (A0A2 instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A0A2;
            int i = 2131626553;
            if (AnonymousClass3MX.A1U(this)) {
                i = 2131627597;
            }
            A0A2 = AnonymousClass3MY.A0G(viewStub, i);
        }
        if (A0A2 instanceof WDSSectionHeader) {
            WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) A0A2;
            wDSSectionHeader.setHeaderText(2131895796);
            wDSSectionHeader.setSubHeaderText(2131889184);
        }
        this.A04 = new Handler(Looper.myLooper());
        this.A0T = getResources().getStringArray(2130903042);
        this.A0U = getResources().getStringArray(2130903045);
        this.A00 = this.A0A.A04();
        this.A02 = C72453Mb.A0M(this).getInt("autodownload_wifi_mask", 15);
        this.A01 = C72453Mb.A0M(this).getInt("autodownload_roaming_mask", 0);
        View findViewById = findViewById(2131435243);
        this.A05 = AnonymousClass3MX.A0L(this, 2131435244);
        AnonymousClass1Y5.A07(findViewById, "Button");
        View findViewById2 = findViewById(2131435257);
        AnonymousClass1Y5.A07(findViewById2, "Button");
        this.A0B = AnonymousClass3MX.A0L(this, 2131435258);
        View findViewById3 = findViewById(2131435236);
        AnonymousClass1Y5.A07(findViewById3, "Button");
        this.A06 = AnonymousClass3MX.A0L(this, 2131435250);
        View findViewById4 = findViewById(2131435238);
        AnonymousClass1Y5.A07(findViewById4, "Button");
        this.A08 = AnonymousClass3MX.A0L(this, 2131435252);
        View findViewById5 = findViewById(2131435237);
        AnonymousClass1Y5.A07(findViewById5, "Button");
        this.A07 = AnonymousClass3MX.A0L(this, 2131435251);
        View findViewById6 = findViewById(2131435270);
        this.A0C = (SwitchCompat) findViewById(2131432233);
        C90094dW.A00(findViewById, this, A1T);
        AnonymousClass18K r02 = this.A0I;
        C18070vi.A0d(r02, A1T);
        this.A0d = C83974Hj.A00(r02, A1T);
        C90094dW.A00(findViewById2, this, 3);
        this.A0L.observeUntilDestroy(new AnonymousClass4M2(this), this);
        this.A06.setText(A0Q(this, this.A00));
        this.A08.setText(A0Q(this, this.A02));
        this.A07.setText(A0Q(this, this.A01));
        C90094dW.A00(findViewById3, this, 4);
        C90064dT.A00(findViewById4, this, 45);
        C90064dT.A00(findViewById5, this, 46);
        C28931bI A0x = AnonymousClass3Ma.A0x(this, 2131432416);
        C28931bI A0x2 = AnonymousClass3Ma.A0x(this, 2131435246);
        C18030ve r1 = this.A0E;
        C18040vf r2 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r2, r1, 4023);
        if (C18020vd.A05(r2, this.A0E, 662) && !C18020vd.A05(r2, this.A0E, 7589)) {
            C28931bI A0s = C72453Mb.A0s(A0x.A02(), 2131435261);
            C90064dT.A00(A0s.A02(), this, 47);
            TextView A0E2 = C17880vN.A0E(A0s.A02(), 2131435255);
            this.A0A = A0E2;
            C85334Mz A0Q2 = AnonymousClass3MY.A0Q(this);
            A0E2.setText(C18070vi.A0G(A0Q2.A00, AnonymousClass4IS.A02[A0Q2.A01.A0L()]));
            if (A052) {
                View[] viewArr = new View[A1T];
                viewArr[0] = A0s.A02();
                A0r(viewArr);
            }
        }
        if (C18020vd.A05(r2, this.A0E, 702) && !C18020vd.A05(r2, this.A0E, 2653) && !C18020vd.A05(r2, this.A0E, 7589)) {
            C28931bI A0s2 = C72453Mb.A0s(A0x.A02(), 2131435249);
            C90064dT.A00(A0s2.A02(), this, 48);
            TextView A0E3 = C17880vN.A0E(A0s2.A02(), 2131435254);
            this.A09 = A0E3;
            C85334Mz A0Q3 = AnonymousClass3MY.A0Q(this);
            A0E3.setText(C18070vi.A0G(A0Q3.A00, AnonymousClass4IS.A02[A0Q3.A01.A0G()]));
            if (A052) {
                View[] viewArr2 = new View[A1T];
                viewArr2[0] = A0s2.A02();
                A0r(viewArr2);
            }
        }
        if (C18020vd.A05(r2, this.A0E, 7589)) {
            A0x2.A04(0);
            AnonymousClass3Ma.A0x(this, 2131435247).A04(0);
            TextView A0E4 = C17880vN.A0E(A0x2.A02(), 2131435253);
            this.A0Y = A0E4;
            AnonymousClass1Y5.A07(A0E4, "Button");
        }
        A0x2.A05(new C90064dT((Object) this, 49));
        A0c();
        this.A0V = C28281Zt.A00(this, 2130971170, 2131102295);
        this.A0X = C28281Zt.A00(this, 2130971170, 2131102296);
        this.A0W = C28281Zt.A00(this, 2130971170, AnonymousClass1YL.A00(this, 2130971197, 2131102532));
        C18030ve r12 = this.A0M.A04;
        C18040vf r15 = C18040vf.A01;
        boolean A053 = C18020vd.A05(r15, r12, 3641);
        View view = this.A00;
        int i2 = 2131436644;
        if (A053) {
            i2 = 2131436646;
        }
        ViewStub A0E5 = AnonymousClass3MW.A0E(view, i2);
        View inflate = A0E5.inflate();
        AnonymousClass1Y5.A07(inflate, "Button");
        this.A0Z = AnonymousClass3MW.A0T(this.A00, 2131434216);
        C90094dW.A00(inflate, this, 0);
        if (C18020vd.A05(r2, this.A0E, 2784) || C18020vd.A05(r15, this.A0M.A04, 3641)) {
            A0E5.setVisibility(0);
        } else {
            A0E5.setVisibility(8);
        }
        if (AnonymousClass3MX.A1V(this)) {
            findViewById6.setVisibility(8);
        } else {
            this.A0C.setChecked(C72453Mb.A0M(this).getBoolean("voip_low_data_usage", false));
            C90094dW.A00(findViewById6, this, 2);
        }
        if (this.A0G.A0G()) {
            A0V();
        } else {
            this.A0B.setVisibility(8);
        }
        this.A0b = AnonymousClass3Ma.A0x(this, 2131430760);
        AnonymousClass1DT r22 = this.A0M.A00;
        C91614fy.A00(this, r22, 20);
        A0q(this, (Boolean) r22.A06());
        C91614fy.A00(this, this.A0M.A01, 21);
        this.A0S = C72453Mb.A0w(this);
        ((C87824Xf) this.A0R.get()).A02(this.A00, "storage_and_data", this.A0S);
        this.A0S = null;
        if (A052) {
            AnonymousClass3MX.A0I(this, 2131431489).setImageResource(2131231919);
            AnonymousClass3MX.A0I(this, 2131431488).setImageResource(2131231843);
            View[] viewArr3 = new View[7];
            viewArr3[0] = findViewById2;
            viewArr3[A1T] = findViewById6;
            AnonymousClass3MY.A1W(inflate, findViewById3, viewArr3);
            viewArr3[4] = findViewById4;
            viewArr3[5] = findViewById5;
            viewArr3[6] = findViewById(2131432263);
            A0r(viewArr3);
        }
    }

    public static String A0Q(SettingsDataUsageActivity settingsDataUsageActivity, int i) {
        int i2;
        String str;
        String str2;
        ArrayList A13 = AnonymousClass000.A13();
        int i3 = 0;
        int i4 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                A13.add(Integer.toString(i4));
            }
            i >>= 1;
            i4++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) A13.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        if (length == 0 || settingsDataUsageActivity.A0L.A00()) {
            i2 = 2131895799;
        } else {
            String[] strArr = settingsDataUsageActivity.A0U;
            if (length == strArr.length) {
                i2 = 2131895797;
            } else {
                CharSequence charSequence = charSequenceArr[0];
                while (true) {
                    if (i3 >= strArr.length) {
                        str = "";
                        break;
                    }
                    String charSequence2 = charSequence.toString();
                    strArr = settingsDataUsageActivity.A0U;
                    if (charSequence2.equals(strArr[i3])) {
                        str = settingsDataUsageActivity.A0T[i3];
                        break;
                    }
                    i3++;
                }
                StringBuilder sb = new StringBuilder(str);
                for (int i5 = 1; i5 < length; i5++) {
                    sb.append(", ");
                    CharSequence charSequence3 = charSequenceArr[i5];
                    int i6 = 0;
                    while (true) {
                        if (i6 >= strArr.length) {
                            str2 = "";
                            break;
                        }
                        String charSequence4 = charSequence3.toString();
                        strArr = settingsDataUsageActivity.A0U;
                        if (charSequence4.equals(strArr[i6])) {
                            str2 = settingsDataUsageActivity.A0T[i6];
                            break;
                        }
                        i6++;
                    }
                    sb.append(str2);
                }
                return sb.toString();
            }
        }
        return settingsDataUsageActivity.getString(i2);
    }

    private void A0r(View... viewArr) {
        int A012 = AnonymousClass3MW.A01(getResources(), 2131168663);
        for (View view : viewArr) {
            C72463Mc.A14(view, A012, view.getPaddingTop());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0g.cancel();
        C17890vO.A0t(this.A0c);
        AnonymousClass49X r2 = this.A0a;
        if (r2 != null) {
            r2.A00.set(true);
            r2.A0B(true);
        }
        this.A03 = -1;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.A0e.cancel();
    }

    public void onResume() {
        super.onResume();
        SettingsDataUsageViewModel settingsDataUsageViewModel = this.A0M;
        C18030ve r1 = settingsDataUsageViewModel.A04;
        C18040vf r3 = C18040vf.A01;
        if (C18020vd.A05(r3, r1, 3641)) {
            AnonymousClass1DT r12 = settingsDataUsageViewModel.A01;
            r12.getClass();
            ((C92244gz) settingsDataUsageViewModel.A06.get()).A03.A03(new C98334qx(r12, 15), settingsDataUsageViewModel.A02.A05);
        }
        C99784tS r5 = new C99784tS(this);
        this.A0e = r5;
        this.A0g.scheduleAtFixedRate(r5, 0, 1000);
        SettingsDataUsageViewModel settingsDataUsageViewModel2 = this.A0M;
        C98844ro.A02(settingsDataUsageViewModel2.A05, settingsDataUsageViewModel2, 5);
        if (this.A0Z == null) {
            return;
        }
        if (C18020vd.A05(r3, this.A0M.A04, 3641)) {
            A0d(this, C17890vO.A00(C88214Yt.A00(this.A0Q), "proxy_connection_status"));
            return;
        }
        if (C18020vd.A05(C18040vf.A02, this.A0E, 2784)) {
            WaTextView waTextView = this.A0Z;
            int i = 2131895993;
            if (AnonymousClass3MW.A0l(this.A0Q).A07()) {
                i = 2131895994;
            }
            waTextView.setText(i);
        }
    }

    public SettingsDataUsageActivity(int i) {
        this.A0f = false;
        C91034f2.A00(this, 15);
    }
}
