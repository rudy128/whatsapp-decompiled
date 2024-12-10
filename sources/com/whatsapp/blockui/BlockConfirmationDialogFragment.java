package com.whatsapp.blockui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1ED;
import X.AnonymousClass1FU;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass755;
import X.AnonymousClass757;
import X.AnonymousClass86U;
import X.C010105w;
import X.C103875Lz;
import X.C108985cd;
import X.C138636xR;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C21445AkC;
import X.C22971Dz;
import X.C24921Me;
import X.C33971jg;
import X.C36401np;
import X.C39401t1;
import X.C61552ps;
import X.C72453Mb;
import X.C73203Rj;
import X.C88414Zp;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

public final class BlockConfirmationDialogFragment extends Hilt_BlockConfirmationDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass86U A01;
    public C138636xR A02;
    public AnonymousClass1M9 A03;
    public C24921Me A04;
    public AnonymousClass11C A05;
    public AnonymousClass1LU A06;
    public AnonymousClass129 A07;
    public C36401np A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public final C18100vl A0B = C88414Zp.A02(this, "entryPoint");
    public final C18100vl A0C = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103875Lz(this));

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof AnonymousClass86U) {
            this.A01 = (AnonymousClass86U) context;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass00H r0 = this.A09;
        if (r0 != null) {
            String A0y = AnonymousClass3MW.A0y(this.A0B);
            UserJid userJid = (UserJid) this.A0C.getValue();
            C18070vi.A0h(A0y, userJid);
            C61552ps.A00((C61552ps) r0.get(), userJid, A0y, 2);
            return;
        }
        C18070vi.A11("blockFunnelLogger");
        throw null;
    }

    public Dialog A27(Bundle bundle) {
        String str;
        int i;
        Object[] objArr;
        String A0I;
        Bundle A15 = A15();
        AnonymousClass1FU A0M = C108985cd.A0M(this);
        boolean z = A15.getBoolean("deleteChatOnBlock", false);
        boolean z2 = A15.getBoolean("showSuccessToast", false);
        boolean z3 = A15.getBoolean("showReportAndBlock", false);
        boolean z4 = A15.getBoolean("enableReportCheckboxByDefault", false);
        int i2 = A15.getInt("postBlockNavigation", 0);
        int i3 = A15.getInt("postBlockAndReportNavigation", 0);
        AnonymousClass1M9 r2 = this.A03;
        if (r2 != null) {
            C18100vl r1 = this.A0C;
            AnonymousClass1E7 A0H = r2.A0H(AnonymousClass3MX.A0m(r1));
            AnonymousClass00H r0 = this.A09;
            if (r0 != null) {
                String A0y = AnonymousClass3MW.A0y(this.A0B);
                UserJid userJid = (UserJid) r1.getValue();
                C61552ps.A00((C61552ps) r0.get(), userJid, A0y, C18070vi.A15(A0y, userJid) ? 1 : 0);
                C73203Rj A002 = AnonymousClass4a6.A00(A0M);
                if (C22971Dz.A0S((Jid) r1.getValue())) {
                    i = 2131887199;
                    objArr = new Object[1];
                    AnonymousClass00H r02 = this.A0A;
                    if (r02 != null) {
                        UserJid userJid2 = (UserJid) r1.getValue();
                        C18070vi.A0z(userJid2, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                        A0I = ((C33971jg) r02.get()).A01((AnonymousClass1ED) userJid2);
                    } else {
                        str = "interopUiCache";
                    }
                } else {
                    i = 2131887198;
                    objArr = new Object[1];
                    C24921Me r03 = this.A04;
                    if (r03 != null) {
                        A0I = r03.A0I(A0H);
                    } else {
                        str = "waContactNames";
                    }
                }
                String A16 = AnonymousClass3MX.A16(this, A0I, objArr, 0, i);
                C18070vi.A0b(A16);
                CheckBox checkBox = null;
                if (z3) {
                    boolean A052 = C18020vd.A05(C18040vf.A02, this.A02, 6186);
                    int i4 = 2131624285;
                    if (A052) {
                        i4 = 2131624286;
                    }
                    View A0B2 = AnonymousClass3MX.A0B(LayoutInflater.from(A1n()), (ViewGroup) null, i4, false);
                    if (A052) {
                        C72453Mb.A0W(A0B2, 2131429986).setText(A16);
                    } else {
                        A002.A0k(A16);
                    }
                    checkBox = (CheckBox) A0B2.findViewById(2131429078);
                    if (z4) {
                        checkBox.setChecked(true);
                    }
                    TextView A0W = C72453Mb.A0W(A0B2, 2131429980);
                    int i5 = 2131887200;
                    if (A052) {
                        i5 = 2131887181;
                    }
                    A0W.setText(i5);
                    TextView A0W2 = C72453Mb.A0W(A0B2, 2131429082);
                    int i6 = 2131895181;
                    if (A052) {
                        i6 = 2131887182;
                    }
                    A0W2.setText(i6);
                    TextView A0W3 = C72453Mb.A0W(A0B2, 2131429083);
                    if (A052) {
                        C36401np r3 = this.A08;
                        if (r3 != null) {
                            SpannableStringBuilder A053 = r3.A05(A1n(), new C21445AkC(this, 30), AnonymousClass3MX.A16(this, "learn-more", new Object[1], 0, 2131887183), "learn-more");
                            C18070vi.A0X(A053);
                            AnonymousClass3Ma.A1I(A0W3, this.A02);
                            Rect rect = C39401t1.A0A;
                            AnonymousClass11C r04 = this.A05;
                            if (r04 != null) {
                                AnonymousClass3MZ.A1Q(A0W3, r04);
                                A0W3.setText(A053);
                            } else {
                                str = "systemServices";
                            }
                        } else {
                            str = "linkifier";
                        }
                    } else {
                        A0W3.setText(2131895253);
                    }
                    AnonymousClass3MZ.A1I(A0B2.findViewById(2131429079), checkBox, 30);
                    A002.A0c(A0B2);
                } else {
                    A002.A0k(A16);
                }
                AnonymousClass755 r9 = new AnonymousClass755(checkBox, A0M, this, A0H, i3, i2, z, z2);
                AnonymousClass757 A003 = AnonymousClass757.A00(this, 5);
                A002.A0Z(r9, 2131887175);
                A002.A0X(A003, 2131887905);
                C010105w create = A002.create();
                create.setCanceledOnTouchOutside(true);
                return create;
            }
            str = "blockFunnelLogger";
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }
}
