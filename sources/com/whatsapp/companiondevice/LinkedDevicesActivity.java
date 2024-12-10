package com.whatsapp.companiondevice;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass129;
import X.AnonymousClass176;
import X.AnonymousClass190;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HV;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1TH;
import X.AnonymousClass1TI;
import X.AnonymousClass1U4;
import X.AnonymousClass1U5;
import X.AnonymousClass1VD;
import X.AnonymousClass1YL;
import X.AnonymousClass28K;
import X.AnonymousClass2RG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XP;
import X.AnonymousClass4J7;
import X.AnonymousClass4L4;
import X.AnonymousClass4Qn;
import X.AnonymousClass4RW;
import X.AnonymousClass4bA;
import X.C000200d;
import X.C1411874q;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C221618v;
import X.C25851Pw;
import X.C28281Zt;
import X.C28931bI;
import X.C36421nr;
import X.C36431ns;
import X.C37911qO;
import X.C42221xp;
import X.C62142qr;
import X.C70633Bw;
import X.C72473Md;
import X.C72483Me;
import X.C86404Rm;
import X.C88344Zh;
import X.C89894dC;
import X.C91004ez;
import X.C91624fz;
import X.C98764rg;
import X.C98804rk;
import X.COR;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.Hilt_LegacyMessageDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.List;

public class LinkedDevicesActivity extends AnonymousClass1FY implements DialogInterface.OnDismissListener {
    public int A00;
    public RecyclerView A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public AnonymousClass4J7 A05;
    public AnonymousClass1U4 A06;
    public AnonymousClass3XP A07;
    public LinkedDevicesDetailDialogFragment A08;
    public LinkedDevicesSharedViewModel A09;
    public AnonymousClass4RW A0A;
    public LinkedDevicesViewModel A0B;
    public C36431ns A0C;
    public AnonymousClass1LU A0D;
    public AnonymousClass1VD A0E;
    public C28931bI A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public boolean A0K;
    public boolean A0L;
    public final C37911qO A0M;
    public final AnonymousClass00H A0N;

    public LinkedDevicesActivity() {
        this(0);
        this.A0N = C221618v.A00(AnonymousClass176.class);
        this.A0K = false;
        this.A0F = null;
        this.A0M = new AnonymousClass28K(this, 4);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A08 = null;
    }

    public static void A03(LinkedDevicesActivity linkedDevicesActivity, List list) {
        boolean z;
        LinkedDevicesActivity linkedDevicesActivity2 = linkedDevicesActivity;
        if (!linkedDevicesActivity2.isFinishing()) {
            List<C88344Zh> list2 = list;
            if (list != null) {
                C18030ve r1 = linkedDevicesActivity2.A0E;
                C18040vf r6 = C18040vf.A02;
                if (C18020vd.A05(r6, r1, 7851)) {
                    C98804rk.A01(linkedDevicesActivity2.A05, linkedDevicesActivity2, list2, 43);
                }
                if (C18020vd.A05(r6, linkedDevicesActivity2.A0E, 8966) && C18020vd.A05(r6, linkedDevicesActivity2.A0E, 8966)) {
                    int i = 2130972000;
                    int i2 = 2131103204;
                    if (list2.isEmpty()) {
                        i = 2130969123;
                        i2 = 2131100142;
                    }
                    int A002 = AnonymousClass1YL.A00(linkedDevicesActivity2, i, i2);
                    AnonymousClass3MZ.A0F(linkedDevicesActivity2).setBackgroundColor(linkedDevicesActivity2.getResources().getColor(A002));
                    C28281Zt.A07(linkedDevicesActivity2, A002, 1);
                    if (C18020vd.A05(r6, linkedDevicesActivity2.A0E, 8966) && linkedDevicesActivity2.A0F != null) {
                        boolean isEmpty = list2.isEmpty();
                        C28931bI r12 = linkedDevicesActivity2.A0F;
                        if (isEmpty) {
                            r12.A04(0);
                            linkedDevicesActivity2.A4b(AnonymousClass3MX.A0W(linkedDevicesActivity2.A0F.A02(), 2131430235));
                            C89894dC.A00(linkedDevicesActivity2.A0F.A02().findViewById(2131432012), linkedDevicesActivity2, 49);
                        } else {
                            r12.A04(8);
                        }
                    }
                }
                AnonymousClass3XP r10 = linkedDevicesActivity2.A07;
                List list3 = r10.A07;
                list3.clear();
                if (r10.A00 != null && !list2.isEmpty()) {
                    r10.A00.A0H.setVisibility(8);
                    r10.A00 = null;
                }
                for (C88344Zh r122 : list2) {
                    DeviceJid deviceJid = r122.A08;
                    AnonymousClass2RG r20 = r122.A09;
                    String str = r122.A0A;
                    long j = r122.A00;
                    long j2 = r122.A06;
                    long j3 = r122.A01;
                    int i3 = r122.A05;
                    boolean z2 = r122.A0B;
                    String str2 = r122.A04;
                    String str3 = r122.A03;
                    C62142qr r18 = r122.A07;
                    DeviceJid deviceJid2 = deviceJid;
                    C88344Zh r17 = new C88344Zh(r18, deviceJid2, r20, str, str2, str3, r122.A02, i3, j, j2, j3, z2);
                    Boolean bool = (Boolean) r10.A03.get(deviceJid);
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        z = true;
                        if (booleanValue) {
                            r17.A00 = z;
                            list3.add(r17);
                        }
                    }
                    z = false;
                    r17.A00 = z;
                    list3.add(r17);
                }
                AnonymousClass3XP.A00(r10);
                r10.notifyDataSetChanged();
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity2.A08;
                if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A07 != null) {
                    for (C88344Zh r2 : list2) {
                        if (r2.A08.equals(linkedDevicesActivity2.A08.A07.A08)) {
                            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity2.A08;
                            linkedDevicesDetailDialogFragment2.A07 = r2;
                            linkedDevicesDetailDialogFragment2.A0A = null;
                            if (linkedDevicesDetailDialogFragment2.A01 != null) {
                                LinkedDevicesDetailDialogFragment.A00(linkedDevicesDetailDialogFragment2);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public void A2y() {
        if (!this.A0L) {
            this.A0L = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r3 = A0K2.AAQ;
            C72483Me.A0q(r3, this);
            AnonymousClass10G r2 = r3.A00;
            AnonymousClass1FB.A0K(r3, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r3, r2, this, r2.A5A);
            this.A0D = AnonymousClass3MY.A0Z(r3);
            C19890zB r1 = C19890zB.A00;
            this.A02 = r1;
            this.A0C = AnonymousClass10G.A4A(r2);
            this.A0H = C000200d.A00(r3.A6x);
            this.A0J = C000200d.A00(r3.AA1);
            this.A04 = (C19880zA) r3.A7k.get();
            this.A0E = (AnonymousClass1VD) r3.A9J.get();
            this.A05 = (AnonymousClass4J7) A0K2.A23.get();
            this.A0I = C000200d.A00(r2.A3t);
            this.A06 = (AnonymousClass1U4) r3.AKH.get();
            this.A03 = r1;
            this.A0G = C000200d.A00(r2.A1E);
        }
    }

    public void A4b(TextEmojiLabel textEmojiLabel) {
        C36431ns r4 = this.A0C;
        AnonymousClass11C r3 = this.A08;
        String string = getString(2131894508);
        textEmojiLabel.setText(r4.A04.A06(textEmojiLabel.getContext(), new C70633Bw(r4, this, 21), string, "%s", AnonymousClass1YL.A00(textEmojiLabel.getContext(), 2130968627, 2131099690)));
        AnonymousClass3Ma.A1K(textEmojiLabel, r3);
        AnonymousClass3Ma.A1I(textEmojiLabel, r4.A02);
        ((C36421nr) this.A0I.get()).A00(9, 0);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [com.whatsapp.LegacyMessageDialogFragment, com.whatsapp.Hilt_LegacyMessageDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131891690);
        C72473Md.A17(this);
        setContentView(2131625827);
        this.A09 = (LinkedDevicesSharedViewModel) AnonymousClass3MW.A0N(this).A00(LinkedDevicesSharedViewModel.class);
        this.A0B = (LinkedDevicesViewModel) AnonymousClass3MW.A0N(this).A00(LinkedDevicesViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(2131432047);
        this.A01 = recyclerView;
        AnonymousClass3Ma.A15(this, recyclerView);
        AnonymousClass4J7 r0 = this.A05;
        AnonymousClass4L4 r12 = new AnonymousClass4L4(this);
        AnonymousClass10E r2 = r0.A00.A01;
        AnonymousClass11P A6O = AnonymousClass10E.A6O(r2);
        C18030ve A8r = AnonymousClass10E.A8r(r2);
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r2);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r2);
        AnonymousClass1L9 A0N2 = AnonymousClass3MZ.A0N(r2);
        AnonymousClass129 A0t = AnonymousClass3Ma.A0t(r2);
        AnonymousClass11C A0a = AnonymousClass3Ma.A0a(r2);
        C18000vb A6Q = AnonymousClass10E.A6Q(r2);
        AnonymousClass10G r02 = r2.A00;
        AnonymousClass3XP r8 = new AnonymousClass3XP(this, A0N2, A12, r12, (C86404Rm) r02.A5J.get(), (C25851Pw) r2.AAk.get(), AnonymousClass3Ma.A0T(r2), A0a, A6O, A6Q, (COR) r02.A1E.get(), AnonymousClass3MZ.A0r(r2), (AnonymousClass1U5) r2.A3L.get(), A8r, (AnonymousClass1HV) r2.A6x.get(), A0t, AL1);
        this.A07 = r8;
        this.A01.setAdapter(r8);
        this.A07.CDq(this.A0M);
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        C18030ve r13 = this.A0E;
        AnonymousClass1KB r82 = this.A05;
        AnonymousClass190 r7 = this.A03;
        AnonymousClass10I r15 = this.A05;
        C19880zA r5 = this.A04;
        AnonymousClass1VD r14 = this.A0E;
        AnonymousClass4RW r3 = new AnonymousClass4RW(this.A02, r5, this.A03, r7, r82, this, this.A07, this.A08, (C42221xp) this.A0J.get(), r13, r14, r15);
        this.A0A = r3;
        r3.A00();
        C91624fz.A00(this, this.A09.A0R, 3);
        C91624fz.A00(this, this.A09.A0Q, 4);
        C91624fz.A00(this, this.A09.A0P, 5);
        C91624fz.A00(this, this.A0B.A07, 6);
        C91624fz.A00(this, this.A0B.A06, 7);
        C91624fz.A00(this, this.A0B.A04, 1);
        C91624fz.A00(this, this.A0B.A05, 2);
        this.A09.A0T();
        this.A0B.A0U();
        C19830z4 r1 = ((AnonymousClass1HV) this.A0H.get()).A01;
        if ((!r1.A2S()) && !C17880vN.A1W(C17890vO.A0B(r1), "md_opt_in_first_time_experience_shown")) {
            C17880vN.A1F(C19830z4.A00(this.A0A), "md_opt_in_first_time_experience_shown", true);
            AnonymousClass4bA r83 = new AnonymousClass4bA(this, 7);
            C1411874q r72 = new C1411874q(15);
            ? hilt_LegacyMessageDialogFragment = new Hilt_LegacyMessageDialogFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putInt("primary_action_text_id_res", 2131891595);
            A0D2.putInt("secondary_action_text_res", 2131897387);
            A0D2.putInt("message_view_id", 2131625944);
            hilt_LegacyMessageDialogFragment.A00 = r72;
            hilt_LegacyMessageDialogFragment.A01 = r83;
            hilt_LegacyMessageDialogFragment.A1R(A0D2);
            hilt_LegacyMessageDialogFragment.A2C(getSupportFragmentManager(), "first_time_experience_dialog");
        }
        C98764rg.A00(this.A05, this, 26);
        C18030ve r16 = this.A0E;
        C18040vf r22 = C18040vf.A02;
        if (C18020vd.A05(r22, r16, 7851)) {
            C98764rg.A00(this.A05, this, 25);
        }
        if (C18020vd.A05(r22, this.A0E, 8966)) {
            this.A0F = AnonymousClass3Ma.A0x(this, 2131430949);
        }
        C17890vO.A0q(C17880vN.A0V(this.A0N), 5);
    }

    public void onDestroy() {
        AnonymousClass3XP r0 = this.A07;
        r0.A01.unregisterObserver(this.A0M);
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A09;
        linkedDevicesSharedViewModel.A0C.unregisterObserver(linkedDevicesSharedViewModel.A0B);
        AnonymousClass1TH r2 = linkedDevicesSharedViewModel.A0G;
        AnonymousClass1TI r1 = linkedDevicesSharedViewModel.A0U;
        C18070vi.A0d(r1, 0);
        r2.A00.A02(r1);
        linkedDevicesSharedViewModel.A0F.unregisterObserver(linkedDevicesSharedViewModel.A0E);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        DialogFragment dialogFragment;
        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A08;
        if (linkedDevicesDetailDialogFragment != null) {
            linkedDevicesDetailDialogFragment.A29();
        }
        DialogFragment dialogFragment2 = (DialogFragment) getSupportFragmentManager().A0Q("first_time_experience_dialog");
        if (dialogFragment2 != null) {
            dialogFragment2.A29();
        }
        Fragment A0Q = this.A0A.A02.getSupportFragmentManager().A0Q("wifi_speed_bump_dialog");
        if ((A0Q instanceof WifiSpeedBumpDialogFragment) && (dialogFragment = (DialogFragment) A0Q) != null) {
            dialogFragment.A29();
        }
        super.onSaveInstanceState(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            this.A0B.A0U();
        } else if (i != 101) {
            if (i == 12345) {
                LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A0A.A03;
                if (i2 == -1 || i2 == 4) {
                    LinkedDevicesSharedViewModel.A00(linkedDevicesSharedViewModel);
                } else {
                    ((AnonymousClass4Qn) linkedDevicesSharedViewModel.A0V.get()).A00(3);
                }
            }
        } else if (i2 == -1 && intent != null && intent.getBooleanExtra("has_removed_all_devices", false)) {
            Log.i("LinkedDevicesActivity/onActivityResult removedAllDevices");
            AnonymousClass1KB r2 = this.A05;
            r2.A02.post(new C98764rg((Object) this, 24));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A05.A0J(new C98764rg((Object) this, 27));
    }

    public void onStart() {
        super.onStart();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A09;
        C98764rg.A00(linkedDevicesSharedViewModel.A0T, linkedDevicesSharedViewModel, 33);
    }

    public void onStop() {
        super.onStop();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A09;
        Runnable runnable = linkedDevicesSharedViewModel.A01;
        if (runnable != null) {
            linkedDevicesSharedViewModel.A0T.CEz(runnable);
        }
    }

    public LinkedDevicesActivity(int i) {
        this.A0L = false;
        C91004ez.A00(this, 15);
    }
}
