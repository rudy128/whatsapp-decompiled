package com.whatsapp.accountswitching.ui;

import X.A8T;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass10T;
import X.AnonymousClass11S;
import X.AnonymousClass190;
import X.AnonymousClass1DC;
import X.AnonymousClass1E8;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass739;
import X.AnonymousClass8BR;
import X.AnonymousClass8BW;
import X.C177929Bd;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C194189rK;
import X.C21486Akr;
import X.C217517g;
import X.C27191Vc;
import X.C29391cC;
import X.C29491cN;
import X.C29501cO;
import X.C60322np;
import X.C62562rb;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;

public final class AccountSwitchingBottomSheet extends Hilt_AccountSwitchingBottomSheet {
    public int A00;
    public View A01;
    public ViewStub A02;
    public BottomSheetListView A03;
    public AnonymousClass190 A04;
    public AnonymousClass1KB A05;
    public AnonymousClass11S A06;
    public C29501cO A07;
    public C27191Vc A08;
    public C18000vb A09;
    public AnonymousClass1DC A0A;
    public AnonymousClass10I A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public String A0F;
    public final AnonymousClass00H A0G = C217517g.A00(16502);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131623976, false);
    }

    public void A1s() {
        this.A03 = null;
        this.A02 = null;
        if (this.A07 != null) {
            AnonymousClass10T A0V = C17880vN.A0V(this.A0G);
            C29501cO r0 = this.A07;
            if (r0 != null) {
                A0V.unregisterObserver(r0);
            } else {
                throw C17880vN.A0g();
            }
        }
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Log.i("AccountSwitchingBottomSheet/onViewCreated");
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            bundle2 = C17880vN.A0D();
        }
        this.A00 = bundle2.getInt("source", 0);
        Bundle bundle3 = this.A06;
        if (bundle3 == null) {
            bundle3 = C17880vN.A0D();
        }
        this.A0F = bundle3.getString("landing_screen");
        this.A01 = view;
        AnonymousClass10I r2 = this.A0B;
        if (r2 != null) {
            AnonymousClass3MW.A1T(new C177929Bd((Object) this, 2), r2, 0);
            AnonymousClass00H r0 = this.A0D;
            if (r0 != null) {
                ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, this.A00, 1);
                return;
            }
            str = "accountSwitchingLogger";
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Log.i("AccountSwitchingBottomSheet/onDismiss");
        AnonymousClass00H r0 = this.A0D;
        if (r0 != null) {
            ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, this.A00, 2);
        } else {
            C18070vi.A11("accountSwitchingLogger");
            throw null;
        }
    }

    public static final ArrayList A00(AccountSwitchingBottomSheet accountSwitchingBottomSheet) {
        String str;
        Bitmap bitmap;
        Bitmap bitmap2;
        StringBuilder A10;
        String A002;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass00H r0 = accountSwitchingBottomSheet.A0C;
        if (r0 != null) {
            C62562rb A032 = C17880vN.A0I(r0).A03();
            if (A032 != null) {
                AnonymousClass11S r02 = accountSwitchingBottomSheet.A06;
                if (r02 != null) {
                    r02.A0I();
                    AnonymousClass1E8 r7 = r02.A0D;
                    if (r7 != null) {
                        int dimensionPixelSize = AnonymousClass3MZ.A09(accountSwitchingBottomSheet).getDimensionPixelSize(2131165268);
                        C27191Vc r5 = accountSwitchingBottomSheet.A08;
                        if (r5 != null) {
                            bitmap = r5.A04(accountSwitchingBottomSheet.A14(), r7, "AccountSwitchingBottomSheet.getCurrentAccountProfileImageBitmap", -1.0f, dimensionPixelSize, false);
                        } else {
                            str = "contactPhotosBitmapManager";
                        }
                    } else {
                        bitmap = null;
                    }
                    A13.add(new C194189rK(bitmap, A032, true));
                    AnonymousClass00H r03 = accountSwitchingBottomSheet.A0C;
                    if (r03 != null) {
                        for (C62562rb r4 : ((C29491cN) C18070vi.A0E(r03)).A09(false, true, true)) {
                            AnonymousClass00H r04 = accountSwitchingBottomSheet.A0C;
                            if (r04 != null) {
                                C29491cN A0I = C17880vN.A0I(r04);
                                C18070vi.A0d(r4, 0);
                                A8T a8t = (A8T) A0I.A0G.get();
                                if (a8t != null) {
                                    File A0B2 = a8t.A0B(r4);
                                    if (A0B2 == null || !A0B2.exists()) {
                                        StringBuilder A102 = AnonymousClass000.A10();
                                        AnonymousClass8BW.A18(r4, "AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ", A102);
                                        C17890vO.A1A(A102, " dir does not exist");
                                        A10 = AnonymousClass000.A10();
                                        A10.append("AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/stagingDirLogString/");
                                        A002 = C60322np.A00(a8t);
                                    } else {
                                        File A0u = AnonymousClass8BR.A0u(A0B2.getAbsolutePath(), "files/me.jpg");
                                        if (!A0u.exists()) {
                                            A10 = AnonymousClass000.A10();
                                            AnonymousClass8BW.A18(r4, "AccountSwitchingFileManager/getInactiveAccountProfilePhotoPath/account ", A10);
                                            A002 = " img file does not exist";
                                        } else {
                                            String absolutePath = A0u.getAbsolutePath();
                                            if (absolutePath != null) {
                                                bitmap2 = BitmapFactory.decodeFile(absolutePath);
                                                A13.add(new C194189rK(bitmap2, r4, false));
                                            }
                                        }
                                    }
                                    C17890vO.A1A(A10, A002);
                                }
                                bitmap2 = null;
                                A13.add(new C194189rK(bitmap2, r4, false));
                            }
                        }
                        if (A13.size() > 1) {
                            C29391cC.A0H(A13, new C21486Akr(1));
                            return A13;
                        }
                    }
                } else {
                    str = "meManager";
                }
                C18070vi.A11(str);
                throw null;
            }
            return A13;
        }
        str = "accountSwitcher";
        C18070vi.A11(str);
        throw null;
    }
}
