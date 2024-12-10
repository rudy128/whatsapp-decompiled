package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DT;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3NL;
import X.AnonymousClass5QX;
import X.AnonymousClass5QY;
import X.AnonymousClass5QZ;
import X.AnonymousClass78J;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C22891Dp;
import X.C28281Zt;
import X.C34001jj;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73183Rh;
import X.C90994ey;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaImageButton;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;

public final class EncBackupMainActivity extends AnonymousClass1FY {
    public AnonymousClass1GP A00;
    public WaImageButton A01;
    public EncBackupViewModel A02;
    public boolean A03;

    public EncBackupMainActivity() {
        this(0);
    }

    public void onContextMenuClosed(Menu menu) {
        RelativeLayout relativeLayout;
        String str;
        C18070vi.A0d(menu, 0);
        super.onContextMenuClosed(menu);
        EncBackupViewModel encBackupViewModel = this.A02;
        if (encBackupViewModel == null) {
            str = "viewModel";
        } else {
            Number number = (Number) encBackupViewModel.A03.A06();
            if (number != null) {
                int intValue = number.intValue();
                AnonymousClass1GP r1 = this.A00;
                if (r1 == null) {
                    str = "fragmentManager";
                } else {
                    Fragment A0Q = r1.A0Q(String.valueOf(intValue));
                    if ((A0Q instanceof EncryptionKeyDisplayFragment) && (relativeLayout = ((EncryptionKeyDisplayFragment) A0Q).A00) != null) {
                        relativeLayout.setBackgroundResource(2131231379);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A03(EncBackupMainActivity encBackupMainActivity) {
        AnonymousClass1GP r2 = encBackupMainActivity.A00;
        String str = "fragmentManager";
        if (r2 == null) {
            C18070vi.A11(str);
            throw null;
        } else if (r2.A0K() <= 1) {
            encBackupMainActivity.setResult(0, C17880vN.A0A());
            encBackupMainActivity.finish();
        } else {
            String str2 = ((C34001jj) r2.A0S(r2.A0K() - 2)).A0A;
            if (str2 != null) {
                try {
                    int parseInt = Integer.parseInt(str2);
                    EncBackupViewModel encBackupViewModel = encBackupMainActivity.A02;
                    if (encBackupViewModel == null) {
                        str = "viewModel";
                    } else {
                        if (encBackupViewModel.A0c()) {
                            AnonymousClass1GP r0 = encBackupMainActivity.A00;
                            if (r0 != null) {
                                if (r0.A0K() > 2 || parseInt == 202 || parseInt == 203) {
                                    AnonymousClass1GP r1 = encBackupMainActivity.A00;
                                    if (r1 != null) {
                                        String str3 = ((C34001jj) r1.A0S(r1.A0K() - 3)).A0A;
                                        if (str3 != null) {
                                            parseInt = Integer.parseInt(str3);
                                        }
                                    }
                                }
                            }
                        }
                        EncBackupViewModel encBackupViewModel2 = encBackupMainActivity.A02;
                        if (encBackupViewModel2 == null) {
                            str = "viewModel";
                        } else {
                            encBackupViewModel2.A0a(parseInt);
                            return;
                        }
                    }
                    C18070vi.A11(str);
                    throw null;
                } catch (NumberFormatException unused) {
                    Log.e("encb/EncBackupMainActivity/Unable to set fragment request code to proper value after back navigation");
                }
            }
        }
    }

    public static final void A0Q(EncBackupMainActivity encBackupMainActivity, WaFragment waFragment, int i) {
        AnonymousClass1GP r0 = encBackupMainActivity.A00;
        if (r0 != null) {
            int A0K = r0.A0K();
            int i2 = 0;
            while (i2 < A0K) {
                AnonymousClass1GP r02 = encBackupMainActivity.A00;
                if (r02 != null) {
                    r02.A0b();
                    i2++;
                }
            }
            A0V(encBackupMainActivity, waFragment, i, false);
            return;
        }
        C18070vi.A11("fragmentManager");
        throw null;
    }

    public static final void A0V(EncBackupMainActivity encBackupMainActivity, WaFragment waFragment, int i, boolean z) {
        WaImageButton waImageButton = encBackupMainActivity.A01;
        AnonymousClass78J r2 = null;
        if (waImageButton != null) {
            waImageButton.setVisibility(C72453Mb.A07(z ? 1 : 0));
            WaImageButton waImageButton2 = encBackupMainActivity.A01;
            if (waImageButton2 != null) {
                if (z) {
                    r2 = new AnonymousClass78J(encBackupMainActivity, 30);
                }
                waImageButton2.setOnClickListener(r2);
                encBackupMainActivity.BVe().A09(new C73183Rh(encBackupMainActivity, z), encBackupMainActivity);
                String valueOf = String.valueOf(i);
                AnonymousClass1GP r0 = encBackupMainActivity.A00;
                if (r0 != null) {
                    Fragment A0Q = r0.A0Q(valueOf);
                    if (A0Q == null || A0Q.A1e()) {
                        AnonymousClass1GP r02 = encBackupMainActivity.A00;
                        if (r02 != null) {
                            C34001jj r1 = new C34001jj(r02);
                            r1.A0D(waFragment, valueOf, 2131430999);
                            r1.A0H(valueOf);
                            r1.A02();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C18070vi.A11("fragmentManager");
                throw null;
            }
        }
        C18070vi.A11("toolbarButton");
        throw null;
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
        }
    }

    public void onDestroy() {
        EncBackupViewModel encBackupViewModel = this.A02;
        if (encBackupViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        encBackupViewModel.A0K.CEz(encBackupViewModel.A0M);
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131625226);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass3MY.A0C(this, 2131430435);
        this.A01 = waImageButton;
        if (waImageButton == null) {
            str = "toolbarButton";
        } else {
            AnonymousClass3NL.A01(this, waImageButton, this.A00, 2131231675);
            this.A00 = AnonymousClass3MX.A0O(this);
            EncBackupViewModel encBackupViewModel = (EncBackupViewModel) AnonymousClass3MW.A0N(this).A00(EncBackupViewModel.class);
            this.A02 = encBackupViewModel;
            str = "viewModel";
            if (encBackupViewModel != null) {
                AnonymousClass3MY.A1K(this, encBackupViewModel.A03, new AnonymousClass5QX(this), 4);
                EncBackupViewModel encBackupViewModel2 = this.A02;
                if (encBackupViewModel2 != null) {
                    AnonymousClass3MY.A1K(this, encBackupViewModel2.A04, new AnonymousClass5QY(this), 4);
                    EncBackupViewModel encBackupViewModel3 = this.A02;
                    if (encBackupViewModel3 != null) {
                        AnonymousClass3MY.A1K(this, encBackupViewModel3.A07, new AnonymousClass5QZ(this), 4);
                        Bundle A09 = AnonymousClass3MY.A09(this);
                        if (A09 != null) {
                            EncBackupViewModel encBackupViewModel4 = this.A02;
                            if (encBackupViewModel4 != null) {
                                C17960vV.A0G(A09.containsKey("user_action"), "getIntent().getExtras()[USER_ACTION_ARG] is required but is not present");
                                int i = A09.getInt("user_action");
                                AnonymousClass1DT r1 = encBackupViewModel4.A09;
                                if (r1.A06() == null) {
                                    AnonymousClass3MX.A1J(r1, i);
                                }
                                AnonymousClass1DT r2 = encBackupViewModel4.A03;
                                if (r2.A06() == null) {
                                    int i2 = 100;
                                    if (i != 1) {
                                        i2 = 103;
                                        if (i != 2) {
                                            i2 = 102;
                                            if (i != 3) {
                                                if (i == 7 || i == 9) {
                                                    i2 = 104;
                                                }
                                            }
                                        }
                                    }
                                    AnonymousClass3MX.A1J(r2, i2);
                                }
                                if (C22891Dp.A06) {
                                    C28281Zt.A06(this, AnonymousClass1YL.A00(this, 2130971617, 2131102224));
                                    return;
                                }
                                return;
                            }
                        } else {
                            throw C17890vO.A0K();
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public EncBackupMainActivity(int i) {
        this.A03 = false;
        C90994ey.A00(this, 12);
    }
}
