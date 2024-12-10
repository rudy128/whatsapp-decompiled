package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1HF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass6RP;
import X.AnonymousClass73V;
import X.AnonymousClass78P;
import X.AnonymousClass7AS;
import X.AnonymousClass7vR;
import X.AnonymousClass7vS;
import X.AnonymousClass81M;
import X.AnonymousClass81N;
import X.AnonymousClass81O;
import X.C108945cZ;
import X.C108955ca;
import X.C112345lK;
import X.C122606Ra;
import X.C136636u8;
import X.C1418377d;
import X.C154037qU;
import X.C154047qV;
import X.C154057qW;
import X.C154067qX;
import X.C1597685u;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C201811d;
import X.C23391Fw;
import X.C23401Fx;
import X.C24141Ja;
import X.C28931bI;
import X.C30391dr;
import X.C41561wd;
import X.C72453Mb;
import X.C88414Zp;
import X.C99274sY;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.util.NoSuchElementException;

public final class StickerInfoBottomSheet extends Hilt_StickerInfoBottomSheet {
    public ViewGroup A00;
    public CircularProgressBar A01;
    public C18000vb A02;
    public C18030ve A03;
    public AnonymousClass1BI A04;
    public C1418377d A05;
    public C136636u8 A06;
    public C122606Ra A07;
    public C28931bI A08;
    public C28931bI A09;
    public C28931bI A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public C1597685u A0V;
    public final int A0W;
    public final C18100vl A0X;
    public final C18100vl A0Y = AnonymousClass1DF.A01(new C154067qX(this));
    public final AnonymousClass00H A0Z = C201811d.A00(49491);

    public void A1x(Context context) {
        C1597685u r2;
        C112345lK r1;
        C18070vi.A0d(context, 0);
        super.A1x(context);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            if (A1B instanceof C1597685u) {
                r2 = (C1597685u) A1B;
            } else {
                r2 = null;
            }
            this.A0V = r2;
            if (r2 != null) {
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r2;
                if (((C23391Fw) stickerStorePackPreviewActivity.getLifecycle()).A02.A00(C23401Fx.RESUMED) && (r1 = stickerStorePackPreviewActivity.A0A) != null) {
                    r1.A04 = true;
                    C112345lK.A02(r1);
                }
            }
        }
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle A15 = A15();
        this.A0R = C72453Mb.A1a(C88414Zp.A00(this, "arg_from_me"));
        int i = A15.getInt("arg_launcher_origin");
        for (C122606Ra r1 : C122606Ra.A00) {
            if (r1.value == i) {
                this.A07 = r1;
                C1418377d r0 = (C1418377d) C24141Ja.A00(A15, C1418377d.class, "arg_sticker");
                if (r0 != null) {
                    this.A05 = r0;
                    this.A04 = AnonymousClass1BI.A00.A02(A15.getString("arc_raw_chat_jid"));
                    this.A0S = C72453Mb.A1a(C88414Zp.A00(this, "arg_search_flow"));
                    this.A01 = (CircularProgressBar) AnonymousClass1HF.A06(view, 2131434181);
                    this.A00 = AnonymousClass3MW.A0C(view, 2131428590);
                    this.A0A = C28931bI.A00(view, 2131435783);
                    this.A09 = C28931bI.A00(view, 2131435745);
                    View A062 = AnonymousClass1HF.A06(view, 2131429138);
                    AnonymousClass78P.A00(A062, this, 25);
                    C108955ca.A1J(A062, this, 2131898783);
                    AnonymousClass00H r02 = this.A0E;
                    if (r02 != null) {
                        if (((AvatarSquidConfiguration) r02.get()).A00() != AnonymousClass6RP.DISABLED) {
                            this.A08 = new C28931bI(C18070vi.A05(view, 2131435560));
                        }
                        C18100vl r4 = this.A0X;
                        AnonymousClass7AS.A00(A1G(), ((StickerInfoViewModel) r4.getValue()).A0A, new AnonymousClass81M(this), 21);
                        AnonymousClass7AS.A00(A1G(), ((StickerInfoViewModel) r4.getValue()).A09, new AnonymousClass81N(this), 21);
                        AnonymousClass7AS.A00(A1G(), ((StickerInfoViewModel) r4.getValue()).A08, new AnonymousClass81O(this), 21);
                        StickerInfoViewModel stickerInfoViewModel = (StickerInfoViewModel) r4.getValue();
                        AnonymousClass1BI r3 = this.A04;
                        C1418377d r42 = this.A05;
                        if (r42 == null) {
                            str = "sticker";
                        } else {
                            C122606Ra r12 = this.A07;
                            if (r12 == null) {
                                str = "origin";
                            } else {
                                boolean A1Z = AnonymousClass000.A1Z(r12, C122606Ra.STICKER_STORE_PREVIEW);
                                boolean z = this.A0S;
                                AnonymousClass3MW.A1X(stickerInfoViewModel.A0N, new StickerInfoViewModel$processSticker$1(r3, r42, stickerInfoViewModel, (C30391dr) null, z, A1Z), C41561wd.A00(stickerInfoViewModel));
                                return;
                            }
                        }
                    } else {
                        str = "avatarSquidConfiguration";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                throw AnonymousClass000.A0k("Sticker must not be null");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A00(this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C1597685u r1 = this.A0V;
        if (r1 != null) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r1;
            if (this.A0T) {
                StickerStorePackPreviewActivity.A0c(stickerStorePackPreviewActivity, C18070vi.A0F(stickerStorePackPreviewActivity, 2131895752));
            }
            C112345lK r0 = stickerStorePackPreviewActivity.A0A;
            if (r0 != null) {
                r0.A04 = false;
                C112345lK.A02(r0);
            }
        }
    }

    public static final void A00(StickerInfoBottomSheet stickerInfoBottomSheet) {
        int i;
        String str;
        C122606Ra r0 = stickerInfoBottomSheet.A07;
        if (r0 == null) {
            str = "origin";
        } else {
            switch (r0.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 6:
                case 7:
                    i = 10;
                    break;
                case 5:
                    i = 9;
                    break;
                default:
                    return;
            }
            int intValue = Integer.valueOf(i).intValue();
            AnonymousClass00H r02 = stickerInfoBottomSheet.A0H;
            if (r02 != null) {
                C108945cZ.A0e(r02).A03(C17880vN.A0m(), 1, intValue);
                return;
            }
            str = "expressionUserJourneyLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A01(StickerInfoBottomSheet stickerInfoBottomSheet) {
        if (stickerInfoBottomSheet.A0S) {
            AnonymousClass00H r0 = stickerInfoBottomSheet.A0N;
            if (r0 != null) {
                C17890vO.A0q(C17880vN.A0V(r0), 28);
            } else {
                C18070vi.A11("stickerPickerOpenObservers");
                throw null;
            }
        }
    }

    public static final void A02(StickerInfoBottomSheet stickerInfoBottomSheet, String str) {
        AnonymousClass00H r0 = stickerInfoBottomSheet.A0C;
        if (r0 != null) {
            ((AnonymousClass73V) C18070vi.A0E(r0)).A04((AnonymousClass1FU) C72453Mb.A0Z(stickerInfoBottomSheet), "avatar_sticker_info_dialog", str);
            stickerInfoBottomSheet.A28();
            return;
        }
        C18070vi.A11("avatarEditorLauncher");
        throw null;
    }

    public StickerInfoBottomSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C154047qV(new C154037qU(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(StickerInfoViewModel.class);
        this.A0X = C99274sY.A00(new C154057qW(A002), new AnonymousClass7vS(this, A002), new AnonymousClass7vR(A002), A15);
        this.A0W = 2131626164;
    }
}
