package com.whatsapp.avatar.editor;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1FL;
import X.AnonymousClass3MY;
import X.AnonymousClass6EA;
import X.AnonymousClass6ED;
import X.AnonymousClass6EH;
import X.AnonymousClass6Nb;
import X.AnonymousClass6XH;
import X.AnonymousClass70I;
import X.AnonymousClass7KX;
import X.AnonymousClass7LB;
import X.AnonymousClass8d6;
import X.BDM;
import X.C108945cZ;
import X.C110885hR;
import X.C114935sU;
import X.C125546bF;
import X.C132586n5;
import X.C133856pc;
import X.C136936ue;
import X.C146537Pm;
import X.C148127gw;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C18140vp;
import X.C18600wl;
import X.C187839gS;
import X.C20368AHy;
import X.C21433Ak0;
import X.C21463AkU;
import X.C22358B4m;
import X.C24089BvH;
import X.C24997CSx;
import X.C27021Uk;
import X.C28281Zt;
import X.C72463Mc;
import X.E6P;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.avatar.prefetch.AvatarPrefetchController;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.HashMap;

public final class AvatarEditorLauncherFSActivity extends AnonymousClass6Nb {
    public C24997CSx A00;
    public C125546bF A01;
    public AvatarPrefetchController A02;
    public C132586n5 A03;
    public BkCdsBottomSheetFragment A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public C18140vp A08;
    public C18140vp A09;
    public C18140vp A0A;
    public C18600wl A0B;

    public void Bjo(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("launcher_error_dialog_tag")) {
            A0V(this);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        getIntent().putExtra("screen_name", "com.bloks.www.avatar.editor.cds.launcher");
        super.onCreate(bundle);
        C110885hR.A0A(this, 2131436960).setVisibility(8);
        C114935sU.A0Q(this);
        Bundle A092 = AnonymousClass3MY.A09(this);
        String str3 = null;
        if (A092 != null) {
            str = A092.getString("origin");
        } else {
            str = null;
        }
        Bundle A093 = AnonymousClass3MY.A09(this);
        if (A093 != null) {
            str3 = A093.getString("deeplink");
        }
        if (str == null) {
            A0V(this);
            return;
        }
        C125546bF r1 = this.A01;
        if (r1 != null) {
            r1.A00 = new C148127gw(this);
            C132586n5 r0 = this.A03;
            if (r0 != null) {
                r0.A00(this);
                C18140vp r02 = this.A09;
                if (r02 != null) {
                    C136936ue r10 = (C136936ue) r02.get();
                    C18140vp r03 = this.A0A;
                    if (r03 != null) {
                        C133856pc r3 = (C133856pc) r03.get();
                        C18140vp r04 = this.A08;
                        if (r04 != null) {
                            C27021Uk r5 = (C27021Uk) r04.get();
                            CNB(0, 2131886842);
                            AnonymousClass00H r05 = this.A07;
                            if (r05 != null) {
                                AnonymousClass70I A0q = C108945cZ.A0q(r05);
                                int A012 = A0q.A01();
                                A0q.A03(A012, "launch_editor");
                                A0q.A06(AnonymousClass6EH.A00, str, A012);
                                A0q.A05(AnonymousClass6ED.A00, A012, true);
                                HashMap A11 = C17880vN.A11();
                                String str4 = r10.A01;
                                if (str4 == null) {
                                    str4 = C17890vO.A0Q();
                                    r10.A01 = str4;
                                }
                                C18070vi.A0b(str4);
                                C18070vi.A0d(str4, 1);
                                A11.put("logging_session_id", str4);
                                A11.put("logging_surface", "wa_settings");
                                A11.put("logging_mechanism", "wa_settings_item");
                                if (str3 != null) {
                                    A11.put("deeplink", str3);
                                }
                                String A002 = AnonymousClass6XH.A00(A11);
                                A0q.A03(A012, "editor_params_ready");
                                boolean A013 = r5.A01();
                                r10.A05((Integer) null, (String) null, 1, A013);
                                if (r3.A00() == null) {
                                    A0q.A03(A012, "create_user");
                                    A0q.A00 = Integer.valueOf(A012);
                                    r3.A01.CGN(new C21433Ak0(r3, new AnonymousClass7LB(this, r10, A0q, A002, A012, A013), 40));
                                    return;
                                }
                                A0c(this, A002, A012, A013);
                                return;
                            }
                            str2 = "avatarPerformanceLoggerLazy";
                        } else {
                            str2 = "avatarConfigRepositoryProvider";
                        }
                    } else {
                        str2 = "avatarRepositoryProvider";
                    }
                } else {
                    str2 = "avatarLoggerProvider";
                }
            } else {
                str2 = "avatarPrefetchInvoker";
            }
        } else {
            str2 = "avatarEditorDismissCallback";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public static final void A0V(AvatarEditorLauncherFSActivity avatarEditorLauncherFSActivity) {
        avatarEditorLauncherFSActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            avatarEditorLauncherFSActivity.overrideActivityTransition(1, 0, 0);
        } else {
            avatarEditorLauncherFSActivity.overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.ALJ, X.B4m, java.lang.Object] */
    public static final void A0c(AvatarEditorLauncherFSActivity avatarEditorLauncherFSActivity, String str, int i, boolean z) {
        String str2;
        if (C28281Zt.A0B(avatarEditorLauncherFSActivity.getBaseContext())) {
            C28281Zt.A05(avatarEditorLauncherFSActivity, 2131102739);
        } else {
            C28281Zt.A06(avatarEditorLauncherFSActivity, 2131102739);
        }
        AnonymousClass00H r0 = avatarEditorLauncherFSActivity.A07;
        if (r0 != null) {
            AnonymousClass70I A0q = C108945cZ.A0q(r0);
            C18140vp r02 = avatarEditorLauncherFSActivity.A09;
            if (r02 != null) {
                C136936ue r3 = (C136936ue) r02.get();
                A0q.A06(AnonymousClass6EA.A00, "success", i);
                A0q.A03(i, "editor_callback");
                avatarEditorLauncherFSActivity.CEx();
                C18070vi.A0b(r3);
                r3.A05((Integer) null, (String) null, 2, z);
                r3.A04((Integer) null, (String) null, 4, z);
                A0q.A02(i, AnonymousClass00R.A00);
                ? obj = new Object();
                obj.A02 = "com.bloks.www.avatar.editor.cds.launcher";
                AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
                C72463Mc.A1H("params", str, r1);
                HashMap A072 = AnonymousClass1D7.A07(r1);
                C187839gS r03 = new C187839gS();
                r03.A01 = "com.bloks.www.avatar.editor.cds.launcher";
                r03.A02 = A072;
                C20368AHy aHy = new C20368AHy(r03);
                BkCdsBottomSheetFragment bkCdsBottomSheetFragment = avatarEditorLauncherFSActivity.A04;
                if (bkCdsBottomSheetFragment == null) {
                    C18070vi.A11("contentFrag");
                    throw null;
                }
                C21463AkU akU = new C21463AkU((DialogFragment) bkCdsBottomSheetFragment, (AnonymousClass1FL) avatarEditorLauncherFSActivity, (BDM) aHy, (C22358B4m) obj, new AnonymousClass8d6((E6P) null, 32));
                Handler A0D = C17890vO.A0D();
                A0D.post(new C146537Pm(A0D, bkCdsBottomSheetFragment, akU));
                return;
            }
            str2 = "avatarLoggerProvider";
        } else {
            str2 = "avatarPerformanceLoggerLazy";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A4b(Intent intent, Bundle bundle) {
        super.A4b(intent, bundle);
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment = this.A04;
        if (bkCdsBottomSheetFragment == null) {
            C18070vi.A11("contentFrag");
            throw null;
        } else {
            bkCdsBottomSheetFragment.A01 = this.A01;
        }
    }

    public void onPause() {
        String str;
        super.onPause();
        if (isFinishing()) {
            C24997CSx cSx = this.A00;
            if (cSx != null) {
                cSx.A00 = C24089BvH.A00;
                C125546bF r0 = this.A01;
                if (r0 != null) {
                    r0.A00 = null;
                    AnonymousClass00H r02 = this.A06;
                    if (r02 != null) {
                        AnonymousClass7KX.A00(C17880vN.A0V(r02), 27);
                        AvatarPrefetchController avatarPrefetchController = this.A02;
                        if (avatarPrefetchController != null) {
                            avatarPrefetchController.A02();
                            return;
                        } else {
                            C18070vi.A11("avatarPrefetchController");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("avatarEventObservers");
                        throw null;
                    }
                } else {
                    str = "avatarEditorDismissCallback";
                }
            } else {
                str = "avatarUserFlowStateReducer";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C114935sU.A0Q(this);
    }

    public void CBt(String str) {
        A0V(this);
    }
}
